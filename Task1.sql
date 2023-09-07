SELECT surname, MAX(experience) AS experience
FROM employees
WHERE experience != (SELECT MAX(experience)FROM employees);
