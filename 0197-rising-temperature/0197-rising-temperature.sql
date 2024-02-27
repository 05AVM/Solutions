select a.id as ID from Weather a, Weather b
where a.recordDate-b.recordDate = 1 and
a.temperature>b.temperature
;