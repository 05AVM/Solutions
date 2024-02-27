/* Write your PL/SQL query statement below */
select customer_id ,COUNT(visit_id) as count_no_trans 
from Visits

where visit_id NOT IN (
  select visit_id from transactions
)
group by customer_id