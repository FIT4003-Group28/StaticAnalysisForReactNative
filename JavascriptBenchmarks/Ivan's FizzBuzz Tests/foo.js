class foobar {

    constructor()
    {}

    foo()
    {
        console.log(3)
    }

    bar()
    {
        console.log("Foo coming up:")
        this.foo()
    }
}

const fubar = new foobar()
fubar.bar()