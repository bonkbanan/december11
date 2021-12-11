package com.company;

import java.util.List;

public interface ICompanyService {
    Company getTopChief(Company company, List<Company> companies);
    int getEmployees(List<Company> companies, Company company);
}
