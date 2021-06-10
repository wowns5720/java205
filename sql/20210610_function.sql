--2021.06.10
--function



-- 숫자 함수
select abs (10), abs(-10)
from dual
;
select floor(15.7)
from dual
;

select ROUND(15.133,2), ROUND(15.193,-1)
from dual
;
select TRUNC(15.79,1) , TRUNC(15.79)
from dual
;

select MOD(11,5)
from dual;

--사원 들의 급여
select sal, mod(sal,2)
from emp
where mod(sal,2) = 1
;

-- 문자 함수
-- concat(문자, 문자) -> '' || ''
select concat('abc', 'efg'), 'abc'||'efg'
from dual
;

--substr : 문자열을 잘라 추출한다.
--substr(문자열 , 시작 위치 , 길이)
select substr('apple',1 , 3)
from dual
;

select substr('apple',-3) 
from dual
;

--replace : 특정 문자열(패턴) 다른 문자열(패턴)으로 변경
select REPLACE('JACK and JUE','J','**')
from dual
;

select sysdate
from dual
;

