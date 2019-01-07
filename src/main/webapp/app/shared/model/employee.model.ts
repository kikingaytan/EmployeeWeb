import { Moment } from 'moment';

export interface IEmployee {
    id?: number;
    name?: string;
    lastName?: string;
    dob?: Moment;
    address?: string;
    address2?: string;
    city?: string;
    state?: string;
    zipCode?: string;
    active?: boolean;
}

export class Employee implements IEmployee {
    constructor(
        public id?: number,
        public name?: string,
        public lastName?: string,
        public dob?: Moment,
        public address?: string,
        public address2?: string,
        public city?: string,
        public state?: string,
        public zipCode?: string,
        public active?: boolean
    ) {
        this.active = this.active || false;
    }
}
