# Express

A Leiningen template for a minimal ClojureScript ExpressJS project.

[![Clojars Project](http://clojars.org/express/lein-template/latest-version.svg)](http://clojars.org/express/lein-template)

## Usage

To create a new project:
```
lein new express sample
cd sample
npm init
npm install express --save-dev
```

To compile ClojureScript:
```
lein cljsbuild auto
```

To run server:
```
node sample.js
```

## License

Copyright © 2014 Alexei Nunez

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
