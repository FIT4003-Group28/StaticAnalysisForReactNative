function executeFizzBuzz(maxNum)
{
    const array = [];
    for (var i = 1; i <= maxNum; i++)
    {
        array.push(i);
        // fizzBuzz(i)
    }

    array.map(fizzBuzz_object);
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

//if the function is assigned with an anonymous function, it won't report properly
//as it was definitely called from executeFizzBuzz, but due to the function is doesn;t report
fizzBuzz_object = function (number){
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

// const fizzbuzz_object = fizzBuzz

executeFizzBuzz(100)