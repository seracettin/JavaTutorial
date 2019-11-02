\# Java 8 method reference example By Lokesh Gupta | Filed Under: \[Java 8\](https://howtodoinjava.com/java8/)

In \[Java 8\](//howtodoinjava.com/java-8-tutorial/), we can refer a method from class or object using \`\*\*class::methodName\*\*\` type syntax. Let’s learn about different types of available \*\*method references in java 8\*\*.

Table of Contents

1\\. \[Types of Method References\](#method-references)
2\\. \[Reference to static method - Class::staticMethodName\](#static-methods)
3\\. \[Reference to instance method from instance - ClassInstance::instanceMethodName\](#instance-method)
4\\. \[Reference to instance method from class type - Class::instanceMethodName\](#class-method)
5\\. \[Reference to constructor - Class::new\](#constructor)

.beloposttitle300250 { text-align: center; margin-top: 20px; margin-bottom: 20px;} @media (min-width:960px) { .beloposttitle300250 { display: none !important; } } ## 1\\. Types of method references Java 8 allows four types of method references.

Method Reference

Description

Method reference example

Reference to \*\*static method\*\*

Used to refer static methods from a class

\`Math::max\` equivalent to \`Math.max(x,y)\`

Reference to \*\*instance method from instance\*\*

Refer to an instance method using a reference to the supplied object

\`System.out::println\` equivalent to \`System.out.println(x)\`

Reference to \*\*instance method from class type\*\*

Invoke the instance method on a reference to an object supplied by the context

\`String::length\` equivalent to \`str.length()\`

Reference to \*\*constructor\*\*

Reference to a constructor

\`ArrayList::new\` equivalent to \`new ArrayList()\`

\## 2\\. Method reference to static method – Class::staticMethodName An example to use \`Math.max()\` which is static method.

\`List integers = Arrays.asList(\`\`1\`\`,\`\`12\`\`,\`\`433\`\`,\`\`5\`\`);\`

\`Optional max = integers.stream().reduce( Math::max );\`

\`max.ifPresent(value -> System.out.println(value));\`

Output:

433

\## 3\\. Method reference to instance method from instance – ClassInstance::instanceMethodName In above example, we use \`System.out.println(value)\` to print the max value found. We can use \`System.out::println\` to print the value.

\`List integers = Arrays.asList(\`\`1\`\`,\`\`12\`\`,\`\`433\`\`,\`\`5\`\`);\`

\`Optional max = integers.stream().reduce( Math::max );\`

\`max.ifPresent( System.out::println );\`

Output:

433

\## 4\\. Method reference to instance method from class type – Class::instanceMethodName In this example, s1.compareTo(s2) is referred as \`String::compareTo\`.

\`List strings = Arrays\`

\`.asList(\`\`"how"\`\`,\` \`"to"\`\`,\` \`"do"\`\`,\` \`"in"\`\`,\` \`"java"\`\`,\` \`"dot"\`\`,\` \`"com"\`\`);\`

\`List sorted = strings\`

\`.stream()\`

\`.sorted((s1, s2) -> s1.compareTo(s2))\`

\`.collect(Collectors.toList());\`

\`System.out.println(sorted);\`

\`List sortedAlt = strings\`

\`.stream()\`

\`.sorted(String::compareTo)\`

\`.collect(Collectors.toList());\`

\`System.out.println(sortedAlt);\`

Output:

\[com, do, dot, how, in, java, to\]
\[com, do, dot, how, in, java, to\]

\## 5\\. Reference to constructor – Class::new The first method can be updated to create a list of integers from 1 to 100\\. Using \[lambda expression\](//howtodoinjava.com/java8/complete-lambda-expressions-tutorial-in-java/) is rather easy. To create a new instance of \`ArrayList\`, we have use \`ArrayList::new\`.

\`List integers = IntStream\`

\`.range(\`\`1\`\`,\` \`100\`\`)\`

\`.boxed()\`

\`.collect(Collectors.toCollection( ArrayList::\`\`new\` \`));\`

\`Optional max = integers.stream().reduce(Math::max);\`

\`max.ifPresent(System.out::println);\`

Output:

99

That’s 4 type of \*\*method references in java 8\*\* lambda enhancements. Happy Learning !!

\[Twitter\](https://twitter.com/intent/tweet?text=Java%208%20method%20reference%20example&url=https%3A%2F%2Fhowtodoinjava.com%2Fjava8%2Flambda-method-references-example%2F&via=howtodoinjava&related=howtodoinjava)\[Facebook\](https://www.facebook.com/sharer/sharer.php?u=https%3A%2F%2Fhowtodoinjava.com%2Fjava8%2Flambda-method-references-example%2F)\[Linkedin\](https://www.linkedin.com/shareArticle?mini=1&url=https%3A%2F%2Fhowtodoinjava.com%2Fjava8%2Flambda-method-references-example%2F&title=Java%208%20method%20reference%20example&source=https%3A%2F%2Fhowtodoinjava.com&summary=Java%208%20allows%20to%20refer%20method%20from%20class%20or%20object%20using%20class%3A%3AmethodName%20syntax.%20Learn%20about%20different%20types%20of%20available%20method%20references%20in%20java%208.)\[Reddit\](https://www.reddit.com/submit?url=https%3A%2F%2Fhowtodoinjava.com%2Fjava8%2Flambda-method-references-example%2F)\[Pocket\](https://getpocket.com/save?url=https%3A%2F%2Fhowtodoinjava.com%2Fjava8%2Flambda-method-references-example%2F&title=Java%208%20method%20reference%20example)

\#### About Lokesh Gupta

A family guy with fun loving nature. Love computers, programming and solving everyday problems. Find me on \[Facebook\](https://facebook.com/howtodoinjava) and \[Twitter\](https://twitter.com/howtodoinjava).

\### Feedback, Discussion and Comments 1.

Debraj March 7, 2019

ArrayList::new equivalent to new ArrayList() this is not correct this applicable only if “The target type of this expression must be a functional interface”

\[Reply\](#comment-35409)

\*

Debraj March 7, 2019

I meant not always correct there is a condition.

\[Reply\](#comment-35410)

2.

Chetan Patel April 12, 2018

Consumer con = System.out::println; con.accept(“Hello”);

\[Reply\](#comment-27538)

3.

thangamma February 14, 2018

How do you come to know about the parameters that are taken by these static methods. For Example: If I want to write System.out.println(“Hello”); How do i write it using method reference ?

\[Reply\](#comment-27203)

\*

Chetan Patel April 12, 2018

Consumer con = System.out::println; con.accept(“Hello”);

\[Reply\](#comment-27539)

\### Ask Questions & Share Feedback \[Cancel reply\](/java8/lambda-method-references-example/#respond)

Please do not submit a comment only to say "Thank you". Comment

\*Want to Post Code Snippets or XML content? Please use \[java\] ... \[/java\] tags otherwise code may not appear partially or even fully. e.g.

\[java\]
public static void main (String\[\] args) {
...
}
\[/java\]

Name \*  Email \*  Website

.hideOnMobile { display: block; } @media (max-width:960px) { .hideOnMobile { display: none; } }

\#### Meta Links

\* \[Advertise\](https://howtodoinjava.com/advertise/) \* \[Contact Us\](https://howtodoinjava.com/contact/) \* \[Privacy policy\](https://howtodoinjava.com/privacy-policy/) \* \[About Me\](https://howtodoinjava.com/about/)

\#### Recommended Reading

\* \[10 Life Lessons\](https://howtodoinjava.com/resources/10-life-lessons-i-have-learned-in-last-few-years/ "10 Life Lessions") \* \[Secure Hash Algorithms\](https://howtodoinjava.com/security/how-to-generate-secure-password-hash-md5-sha-pbkdf2-bcrypt-examples/) \* \[How Web Servers work?\](https://howtodoinjava.com/tomcat/a-birds-eye-view-on-how-web-servers-work/) \* \[How Java I/O Works Internally?\](https://howtodoinjava.com/java/io/how-java-io-works-internally-at-lower-level/) \* \[Best Way to Learn Java\](https://howtodoinjava.com/resources/best-way-to-learn-java/) \* \[Java Best Practices Guide\](https://howtodoinjava.com/java-best-practices/) \* \[Microservices Tutorial\](https://howtodoinjava.com/microservices/microservices-definition-principles-benefits/) \* \[REST API Tutorial\](http://restfulapi.net "REST API Tutorial") \* \[How to Start New Blog\](https://howtodoinjava.com/start-new-blog/)

Copyright © 2016 · HowToDoInjava.com · All Rights Reserved. | \[Sitemap\](https://howtodoinjava.com/sitemap.xml)

(function(i,s,o,g,r,a,m){i\['GoogleAnalyticsObject'\]=r;i\[r\]=i\[r\]||function(){ (i\[r\].q=i\[r\].q||\[\]).push(arguments)},i\[r\].l=1\*new Date();a=s.createElement(o), m=s.getElementsByTagName(o)\[0\];a.async=1;a.src=g;m.parentNode.insertBefore(a,m) })(window,document,'script','https://www.google-analytics.com/analytics.js','ga'); ga('create', 'UA-40697607-1', 'auto'); ga('set', 'dimension1', 'Test'); ga('send', 'pageview'); (function() { var cx = '000292789241211868774:cvclu5feha4'; var gcse = document.createElement('script'); gcse.type = 'text/javascript'; gcse.async = true; gcse.src = (document.location.protocol == 'https:' ? 'https:' : 'http:') + '//cse.google.com/cse.js?cx=' + cx; var s = document.getElementsByTagName('script')\[0\]; s.parentNode.insertBefore(gcse, s); })(); function \_dmBootstrap(file) { var \_dma = document.createElement('script'); \_dma.type = 'text/javascript'; \_dma.async = true; \_dma.src = ('https:' == document.location.protocol ? 'https://' : 'http://') + file; (document.getElementsByTagName('head')\[0\] || document.getElementsByTagName('body')\[0\]).appendChild(\_dma); } function \_dmFollowup(file) { if (typeof DMAds === 'undefined') \_dmBootstrap('cdn2.DeveloperMedia.com/a.min.js'); } (function () { \_dmBootstrap('cdn1.DeveloperMedia.com/a.min.js'); setTimeout(\_dmFollowup, 2000); })(); (function(){ var corecss = document.createElement('link'); var themecss = document.createElement('link'); var corecssurl = "https://howtodoinjava.com/wp-content/plugins/syntaxhighlighter/syntaxhighlighter3/styles/shCore.css?ver=3.0.9b"; if ( corecss.setAttribute ) { corecss.setAttribute( "rel", "stylesheet" ); corecss.setAttribute( "type", "text/css" ); corecss.setAttribute( "href", corecssurl ); } else { corecss.rel = "stylesheet"; corecss.href = corecssurl; } document.getElementsByTagName("head")\[0\].insertBefore( corecss, document.getElementById("syntaxhighlighteranchor") ); var themecssurl = "https://howtodoinjava.com/wp-content/plugins/syntaxhighlighter/syntaxhighlighter3/styles/shThemeDefault.css?ver=3.0.9b"; if ( themecss.setAttribute ) { themecss.setAttribute( "rel", "stylesheet" ); themecss.setAttribute( "type", "text/css" ); themecss.setAttribute( "href", themecssurl ); } else { themecss.rel = "stylesheet"; themecss.href = themecssurl; } //document.getElementById("syntaxhighlighteranchor").appendChild(themecss); document.getElementsByTagName("head")\[0\].insertBefore( themecss, document.getElementById("syntaxhighlighteranchor") ); })(); SyntaxHighlighter.config.strings.expandSource = '+ expand source'; SyntaxHighlighter.config.strings.help = '?'; SyntaxHighlighter.config.strings.alert = 'SyntaxHighlighter\\n\\n'; SyntaxHighlighter.config.strings.noBrush = 'Can\\'t find brush for: '; SyntaxHighlighter.config.strings.brushNotHtmlScript = 'Brush wasn\\'t configured for html-script option: '; SyntaxHighlighter.defaults\['gutter'\] = false; SyntaxHighlighter.defaults\['pad-line-numbers'\] = false; SyntaxHighlighter.defaults\['toolbar'\] = false; SyntaxHighlighter.all(); // Infinite scroll support if ( typeof( jQuery ) !== 'undefined' ) { jQuery( function( $ ) { $( document.body ).on( 'post-load', function() { SyntaxHighlighter.highlight(); } ); } ); }