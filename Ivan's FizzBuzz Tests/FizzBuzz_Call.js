function FizzBuzz(maxNum){
    this.maxNum = maxNum;

    this.loopFizzBuzz = function(number){
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
    
    for (var i = 1; i <= this.maxNum; i++)
    {
        this.loopFizzBuzz(i);
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

function executeFizzBuzz(maxNum)
{
    FizzBuzz.call(this, maxNum)
}

const fizzBuzz = new executeFizzBuzz(100)