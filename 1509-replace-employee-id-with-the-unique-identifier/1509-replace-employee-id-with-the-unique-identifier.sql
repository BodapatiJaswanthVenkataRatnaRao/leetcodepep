# Write your MySQL query statement below
SELECT unique_id,name from Employees e LEFT JOIN EmployeeUNI ee ON e.id=ee.id;