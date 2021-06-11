--2021.06.10
--function



-- 숫자 함수
select abs (10), abs(-10) --abs 절대값
from dual
;
select floor(15.7)-- floor 소숫점 자리 없앰
from dual
;

select ROUND(15.183,2), ROUND(15.193,-1)--Round(n.123,0)특정 자릿수에서 반올림함
from dual
;
select TRUNC(15.79453,1) , TRUNC(15.79) --Trunc ex. 1이면 1번째만 남김
from dual
;

select MOD(11,5)--Mod 나머지를 반환함
from dual;

--사원 들의 급여
select sal, mod(sal,2)
from emp
where mod(sal,2) = 1
;

-- 문자 함수
-- concat(문자, 문자) -> '' || '', 문자를 이음
select concat('abc', 'efg'), 'abc'||'efg'
from dual
;

--substr : 문자열을 잘라 추출한다.
--substr(문자열 , 시작 위치 , 길이)
--시작위치는 1번째가 1이다.
--시작위치 -1은 끝에서 부터이다.
select substr('apple', 2 , 3)
from dual
;

select substr('apple',-1,5) 
from dual
;

--replace : 특정 문자열(패턴) 다른 문자열(패턴)으로 변경
select REPLACE('JAUK and JUE','U','K')
from dual
;

select sysdate
from dual
;

