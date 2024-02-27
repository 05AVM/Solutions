SELECT a.id AS ID
FROM Weather a
JOIN Weather b ON a.recordDate = b.recordDate + INTERVAL '1' DAY
WHERE a.temperature > b.temperature;
