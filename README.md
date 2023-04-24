# jeyzer-annotations
Jeyzer Annotations is a standard Java annotations library, to be referenced from your code.

Jeyzer annotations contribute to enrich the incident/performance analysis performed by the Jeyzer Analyzer.

Jeyzer annotations permit to create automatically the Jeyzer analysis patterns in the Jeyzer master and shared profiles, thanks to the Jeyzer build plugins for Maven and Gradle.

For more details see the [Jeyzer documentation](https://jeyzer.org/docs/shared-profile/annotations/).


Build instructions
------------------

Jeyzer Annotations project can be built with Maven.

Under the current directory, execute :

> mvn clean package

The jeyzer-all project is responsible for calling the current project build.


License
-------

Copyright 2020-2023 Jeyzer.

Licensed under the [Mozilla Public License, Version 2.0](https://www.mozilla.org/media/MPL/2.0/index.815ca599c9df.txt)
