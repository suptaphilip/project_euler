 #Sums the natural numbers that are factors of 3 or 5
 # 
 # @param max
 #   number of numbers
 # @return sum sum of numbers less than max

max = gets.to_i
i = 1
sum = 0
while i < max do 
	if (i % 5 == 0 || i % 3 ==0)then
		sum = sum + i;
	end
	i = i + 1
end
puts sum