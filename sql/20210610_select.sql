-- 2021.06.10
-- 특정 데이터 검색 : 행 검색 -> 컬럼 선택
-- 10번 부서의 사원 리스트를 출력
-- 10번 부서 - > where dept = 10

select *
from emp
where deptno = 30;

-- 이름이 'SCOTT'인 사원을 출력
SELECT *
from emp
where ENAME = 'SCOTT';

SELECT *
from emp
where ENAME = 'scott';

-- 날짜타입의 데이터 비교시에도 작은 따옴표를 이용해야 한다 !
select *
from emp
where hiredate = '96/11/17'
;

-- 논리연산자 : and, or, not
-- 10번 부서의 관리자(manager)를 찾아 출력
select * 
from emp 
where deptno = 10 and job = 'MANAGER'
;

-- 10번 부서의 직원들과 관리자들의 리스트를 출력
select *
from emp
where deptno = 10 or job = 'MANAGER'
;

--10번 부서의 직원을 제외한 나머지 직원들을 출력
--20번 30번 40번
--where deptno20 or deptno30 or deptno 40
select *
from emp
where not deptno = 10
;
--2000이상 3000이하 급여를 받는 직원들 찾기
-- 범위 연산을 할 때 -> 논리연산자 이용, between a and b
-- between a and b : a 이상 b 이하 출력
select *
from emp
where sal between 2000 and 3000;

select ename,  job ,sal, sal*1.2 as upsal
from emp
--where sal >= 2000 and sal <= 3000;
where sal between 2000 and 3000;

--between 연산자는 날짜의 연산도 가능
--1987년에 입사한 사원들의 리스트를 출력
select *
from emp
--where hiredate >= '81/01/01' and hiredate <= '81/12/31'
where hiredate between '81/01/01' and '81/12/31'
order by hiredate 
;

-- 연산자 in -> 여러개의 or 연산자 사용시 대체 할 수 있다
-- 커미션이 300 또는 500 또는 1400
select *
from emp
--where comm = 300 or comm =500 or comm =1400
where comm in(300, 500, 1400)
;

-- 패턴 검색 : 키워드 검색 많이 사용 (게시판)
-- 컬럼 like '%' 이용
-- ename like 'F%' - F로 시작하는 문자열
-- ename like '%F' - F로 끝나는 문자열
-- ename like '%F%' - F를 포함하는 문자열
-- 'java' 단어를 포함하는지 -> title like '%java%'
-- F로 시작하는 이름을 가진 사원 검색
select ename
from emp
--where ename like  '%S%';
where ename like '%C%'
;

-- 자리수 패턴 : 컬럼의 값이 자리수가 정해져 있고 값에 패턴이 있는 경우
-- 이름에 두번째 문자에 A를 포함하는 사원의 리스트
select *
from emp
--where ename like'_A%'
--where ename like '__A%' --세번째 문자가 A인 이름 
where ename not like'__A%'
;

--null 값을 확인하는 연산자 -> is null, is not null
--커미션이 등록되어 있지 않은 사원의 리스트
--커미션이 0으로 등록되어있으면 등록이 된거다. null이 아니다
select *
from emp
where COMM IS  null
order by deptno
;

-- 결과 행의 정렬 : order by 컬럼 [asc(오름차순) | desc(내림차순)]
-- 급여가 작은 사람들 부터 출력 /: 오름차순 -> asc
select ename,sal
from emp 
--order by sal asc;
order by sal; -- 정렬의 기본은 오름차순이다 !

--급여가 큰 사람들부터 출력
select ename , sal
from emp
order by sal desc
;

-- 급여가 큰 사원부터 출력하고 급여가 같은 사원은 이름을 기준으로 오름차순
select ename ,sal
from emp
order by sal desc, ename asc
;

select * from Book;
select * from Customer;
select * from Orders;

