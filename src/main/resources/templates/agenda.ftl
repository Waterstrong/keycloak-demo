<#import "/spring.ftl" as spring>
<html>
<h1>Tech Radar Session Agenda of Today (Friday, 12th Dec, 2017)</h1>
<ul>
<#list agenda as item>
    <li>
        <h4>${item}</h4>
    </li>
</#list>
</ul>
<a href="/logout">Logout</a>
</html>