class FizzBuzz {

    constructor(maxNum)
    {
        this.maxNum = maxNum;
    }

    loopFizzBuzz(number){
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

    executeFizzBuzz()
    {
        for (var i = 1; i <= this.maxNum; i++)
        {
            this.loopFizzBuzz(i);
        }
    }
}

const fizzBuzz = new FizzBuzz(100)
fizzBuzz.executeFizzBuzz()