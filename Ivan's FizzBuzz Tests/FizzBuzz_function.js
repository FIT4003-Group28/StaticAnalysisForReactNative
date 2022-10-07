function loopFizzBuzz(number){
    if (number % 15 == 0)
    {
        print_fizzbuzz();
    }
    else if (number % 5 == 0)
    {
        print_buzz();
    }
    else if (number % 3 == 0)
    {
        print_fizz();
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

function print_fizz(){
    console.log("Fizz")
}

function print_buzz(){
    console.log("Buzz")
}

function print_fizzbuzz(){
    console.log("FizzBuzz")
}

executeFizzBuzz(100)