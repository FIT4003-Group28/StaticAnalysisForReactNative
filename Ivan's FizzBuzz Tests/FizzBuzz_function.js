function loopFizzBuzz(number){
    if (number % 15 == 0)
    {
        console.log("FizzBuzz");
    }
    else if (number % 5 == 0)
    {
        console.log("Buzz");
    }
    else if (number % 3 == 0)
    {
        console.log("Fizz");
    }
    else
    {
        console.log(number);
    }
}
    
function executeFizzBuzz(maxNum)
{
    for (var i = 1; i <= maxNum; i++)
    {
        loopFizzBuzz(i);
    }
}

executeFizzBuzz(100)