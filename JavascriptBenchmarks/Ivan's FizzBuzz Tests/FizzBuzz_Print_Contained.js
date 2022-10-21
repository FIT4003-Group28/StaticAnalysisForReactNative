function FizzBuzz (maxNum){
    this.maxNum = maxNum;

    function print_fizz(){
        console.log("Fizz")
    }
    
    function print_buzz(){
        console.log("Buzz")
    }
    
    function print_fizzbuzz(){
        console.log("FizzBuzz")
    }
    
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

    function executeFizzBuzz()
    {
        for (var i = 1; i <= this.maxNum; i++)
        {
            loopFizzBuzz(i);
        }
    }

    executeFizzBuzz()
}

FizzBuzz(100)