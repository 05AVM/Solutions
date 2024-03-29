/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
  //for each loop
    
    let res=init;
    
    for(var n of nums){
        res=fn(res,n);
    }
    return res;
    return nums.reduce(fn,init);  
};