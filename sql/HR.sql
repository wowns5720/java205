TRUNCATE table emp;


INSERT INTO EMP VALUES

(7369, 'SMITH', 'CLERK', 7902,

TO_DATE('17-12-1980', 'DD-MM-YYYY'), 800, NULL, 20);

INSERT INTO EMP VALUES

(7499, 'ALLEN', 'SALESMAN', 7698,

TO_DATE('20-02-1981', 'DD-MM-YYYY'), 1600, 300, 30);

INSERT INTO EMP VALUES

(7521, 'WARD', 'SALESMAN', 7698,

TO_DATE('22-02-1981', 'DD-MM-YYYY'), 1250, 500, 30);

INSERT INTO EMP VALUES

(7566, 'JONES', 'MANAGER', 7839,

TO_DATE('02-04-1981', 'DD-MM-YYYY'), 2975, NULL, 20);

INSERT INTO EMP VALUES

(7654, 'MARTIN', 'SALESMAN', 7698,

TO_DATE('28-09-1981', 'DD-MM-YYYY'), 1250, 1400, 30);

INSERT INTO EMP VALUES

(7698, 'BLAKE', 'MANAGER', 7839,

TO_DATE('01-05-1981', 'DD-MM-YYYY'), 2850, NULL, 30);

INSERT INTO EMP VALUES

(7782, 'CLARK', 'MANAGER', 7839,

TO_DATE('09-06-1981', 'DD-MM-YYYY'), 2450, NULL, 10);

INSERT INTO EMP VALUES

(7788, 'SCOTT', 'ANALYST', 7566,

TO_DATE('09-12-1982', 'DD-MM-YYYY'), 3000, NULL, 20);

INSERT INTO EMP VALUES

(7839, 'KING', 'PRESIDENT', NULL,

TO_DATE('17-11-1981', 'DD-MM-YYYY'), 5000, NULL, 10);

INSERT INTO EMP VALUES

(7844, 'TURNER', 'SALESMAN', 7698,

TO_DATE('08-09-1981', 'DD-MM-YYYY'), 1500, NULL, 30);

INSERT INTO EMP VALUES

(7876, 'ADAMS', 'CLERK', 7788,

TO_DATE('12-01-1983', 'DD-MM-YYYY'), 1100, NULL, 20);

INSERT INTO EMP VALUES

(7900, 'JAMES', 'CLERK', 7698,

TO_DATE('03-12-1981', 'DD-MM-YYYY'), 950, NULL, 30);

INSERT INTO EMP VALUES

(7902, 'FORD', 'ANALYST', 7566,

TO_DATE('03-12-1981', 'DD-MM-YYYY'), 3000, NULL, 20);

INSERT INTO EMP VALUES

(7934, 'MILLER', 'CLERK', 7782,

TO_DATE('23-01-1982', 'DD-MM-YYYY'), 1300, NULL, 10);


commit;