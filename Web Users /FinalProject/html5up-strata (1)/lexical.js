var scope = "global scope"; // A global variable
function checkscope() {
 var scope = "local scope"; // A local variable
 function f() { return scope; } // Return the value in scope here
 return f();
}
checkscope() // => "local scope"
