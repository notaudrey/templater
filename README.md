# Templater

A simple, single-file HTML templating utility class.

Example usage:
```
String template = readTemplateFromFile("template.html");
Templater templater = new Templater(template);
templater.setVariable("TEST", "test").setVariable("TEST2", "test 2");
// Return templater.render() as the HTML to a client
```

template.html
```
<html>
<head>
<title>templater test</title>
</head>
<body>
test: ${TEST}
test 2: ${TEST2}
</body>
</html>
```
