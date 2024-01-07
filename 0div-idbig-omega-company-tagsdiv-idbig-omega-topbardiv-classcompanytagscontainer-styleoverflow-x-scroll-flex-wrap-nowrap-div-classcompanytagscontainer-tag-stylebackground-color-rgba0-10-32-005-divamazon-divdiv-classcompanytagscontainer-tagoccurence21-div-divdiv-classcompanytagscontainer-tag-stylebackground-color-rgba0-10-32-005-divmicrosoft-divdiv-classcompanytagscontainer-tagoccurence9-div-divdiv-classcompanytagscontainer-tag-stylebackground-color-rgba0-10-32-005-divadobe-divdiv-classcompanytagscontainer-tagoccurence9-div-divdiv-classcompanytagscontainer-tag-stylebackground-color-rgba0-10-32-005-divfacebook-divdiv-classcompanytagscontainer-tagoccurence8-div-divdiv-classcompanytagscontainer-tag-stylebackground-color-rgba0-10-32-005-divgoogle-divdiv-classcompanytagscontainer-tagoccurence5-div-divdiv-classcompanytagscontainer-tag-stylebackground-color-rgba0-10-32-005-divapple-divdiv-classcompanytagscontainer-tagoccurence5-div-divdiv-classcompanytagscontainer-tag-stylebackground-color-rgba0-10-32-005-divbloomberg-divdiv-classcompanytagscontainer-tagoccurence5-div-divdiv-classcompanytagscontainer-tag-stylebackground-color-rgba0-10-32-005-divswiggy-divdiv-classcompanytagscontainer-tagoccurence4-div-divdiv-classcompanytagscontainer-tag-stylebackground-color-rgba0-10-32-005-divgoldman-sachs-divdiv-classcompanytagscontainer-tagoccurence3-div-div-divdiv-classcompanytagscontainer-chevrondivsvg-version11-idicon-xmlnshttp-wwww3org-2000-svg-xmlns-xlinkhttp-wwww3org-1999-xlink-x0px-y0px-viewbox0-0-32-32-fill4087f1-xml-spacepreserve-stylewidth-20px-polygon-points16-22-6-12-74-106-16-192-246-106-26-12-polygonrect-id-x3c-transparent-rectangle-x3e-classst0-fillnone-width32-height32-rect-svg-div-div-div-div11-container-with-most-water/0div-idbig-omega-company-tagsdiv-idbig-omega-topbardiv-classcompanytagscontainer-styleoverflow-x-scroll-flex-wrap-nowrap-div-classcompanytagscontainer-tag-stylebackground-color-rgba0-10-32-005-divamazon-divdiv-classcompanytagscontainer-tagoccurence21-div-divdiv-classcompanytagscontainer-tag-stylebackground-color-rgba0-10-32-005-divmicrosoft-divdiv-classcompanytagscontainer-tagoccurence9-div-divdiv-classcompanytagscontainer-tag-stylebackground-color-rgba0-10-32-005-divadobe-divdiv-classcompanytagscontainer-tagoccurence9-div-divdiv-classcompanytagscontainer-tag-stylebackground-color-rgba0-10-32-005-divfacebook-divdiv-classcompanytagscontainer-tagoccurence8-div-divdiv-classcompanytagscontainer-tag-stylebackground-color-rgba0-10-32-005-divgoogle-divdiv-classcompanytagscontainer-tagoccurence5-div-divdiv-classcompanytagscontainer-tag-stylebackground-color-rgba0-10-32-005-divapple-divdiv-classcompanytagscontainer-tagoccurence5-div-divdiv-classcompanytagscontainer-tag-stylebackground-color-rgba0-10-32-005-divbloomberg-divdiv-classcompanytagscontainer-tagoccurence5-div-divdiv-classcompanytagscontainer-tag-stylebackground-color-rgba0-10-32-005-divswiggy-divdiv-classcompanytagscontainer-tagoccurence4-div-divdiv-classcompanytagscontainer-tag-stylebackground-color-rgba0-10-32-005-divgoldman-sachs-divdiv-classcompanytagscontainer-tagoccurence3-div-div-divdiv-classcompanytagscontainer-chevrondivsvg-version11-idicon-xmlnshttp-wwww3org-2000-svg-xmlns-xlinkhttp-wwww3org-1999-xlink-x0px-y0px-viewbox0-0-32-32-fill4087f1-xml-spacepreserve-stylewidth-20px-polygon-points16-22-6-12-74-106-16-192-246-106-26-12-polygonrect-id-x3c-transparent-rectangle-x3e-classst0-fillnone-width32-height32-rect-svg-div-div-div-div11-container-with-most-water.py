class Solution:
    def maxArea(self, height: List[int]) -> int:
        max_ar=0
        l,r=0,len(height)-1
        while(l<r):
            ar=(r-l)*min(height[r],height[l])
            max_ar=max(max_ar,ar)

            if(height[l]<height[r]):
                l+=1
            else:
                r-=1
            
        

        return max_ar


       
        