package com.mock.employee;

import com.mock.employee.domain.Employee;
import com.mock.employee.repository.EmployeeRepository;
import com.mock.employee.service.dto.EmployeeDTO;
import com.mock.employee.service.mapper.EmployeeMapper;
import org.hibernate.mapping.Collection;
import java.time.LocalDate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Component
public class Bootstrap implements CommandLineRunner {
    private static final Logger logger = LoggerFactory.getLogger("Bootstrap.class");
    private final EmployeeRepository employeeRepository;
    private final EmployeeMapper employeeMapper;

    public Bootstrap(EmployeeRepository employeeRepository, EmployeeMapper employeeMapper) {
        this.employeeRepository = employeeRepository;
        this.employeeMapper = employeeMapper;
    }

    @Override
    @Transactional
    public void run(java.lang.String... args) throws Exception {
        List<EmployeeDTO> employeeCollection = new ArrayList<EmployeeDTO>();
        employeeCollection.add(new EmployeeDTO(1l, "Gaurav", "Cannon", LocalDate.now(), "Adress1", "Address2", "Arkansas", "Bentonville", "28402", true));
        employeeCollection.add(new EmployeeDTO(2l, "Cameron", "Vickers", LocalDate.now(), "Adress1", "Address2", "New York", "New York", "28402", true));
        employeeCollection.add(new EmployeeDTO(3l, "Marky ", "Delgado", LocalDate.now(), "Adress1", "Address2", "North Carolina", "Raleigh", "28402", true));
        employeeCollection.add(new EmployeeDTO(4l, "Romain", "Gall", LocalDate.now(), "Adress1", "Address2", "North Carolina", "Fayettevile", "28402", true));
        employeeCollection.add(new EmployeeDTO(5l, "Julian", "Green", LocalDate.now(), "Adress1", "Address2", "New York", "New York", "28402", true));
        employeeCollection.add(new EmployeeDTO(6l, "Brad", "Guzan", LocalDate.now(), "Adress1", "Address2", "Georgia", "Alpharetta", "28402", true));
        employeeCollection.add(new EmployeeDTO(7l, "Ethan", "Horvath", LocalDate.now(), "Adress1", "Address2", "New York", "New York", "28402", true));
        employeeCollection.add(new EmployeeDTO(8l, "Johathan", "Klinsmann", LocalDate.now(), "Adress1", "Address2", "Utta", "Salt Lake", "28402", true));
        employeeCollection.add(new EmployeeDTO(9l, "Sebastian", "Lletget", LocalDate.now(), "Adress1", "Address2", "Texas", "Dallas", "28402", true));
        employeeCollection.add(new EmployeeDTO(11l, "Matt", "Miazga", LocalDate.now(), "Adress1", "Address2", "Kansas", "Kansas City", "28402", true));
        employeeCollection.add(new EmployeeDTO(12l, "Shan", "Moore", LocalDate.now(), "Adress1", "Address2", "Arkansas", "Rogers", "28402", true));
        employeeCollection.add(new EmployeeDTO(13l, "Aaron", "Long", LocalDate.now(), "Adress1", "Address2", "South Carolina", "Myrtle Beach", "28402", true));
        employeeCollection.add(new EmployeeDTO(14l, "Christian", "Pulisic", LocalDate.now(), "Adress1", "Address2", "New York", "New York", "28402", true));
        employeeCollection.add(new EmployeeDTO(15l, "Antonee", "Robinson", LocalDate.now(), "Adress1", "Address2", "Arkansas", "Rogers", "28402", true));
         employeeRepository.saveAll(
             employeeCollection.stream()
                 .map(e-> employeeMapper.toEntity(e))
                 .collect(Collectors.toList())
         );
    }

}
