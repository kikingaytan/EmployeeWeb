import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';

import { EmployeeWebEmployeeModule } from './employee/employee.module';

@NgModule({
    // prettier-ignore
    imports: [
        EmployeeWebEmployeeModule
    ],
    declarations: [],
    entryComponents: [],
    providers: [],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class EmployeeWebEntityModule {}
