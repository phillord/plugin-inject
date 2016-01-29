# plugin-inject

A Leiningen plugin to do many wonderful things.

## Usage

The idea here is to have a simple plugin injector which will allow adding
cider dependencies automatically. That way, we can have Emacs tell leiningen
which nrepl/cider stuff to add.

Add the following to your profile

    {:user {:plugins [[plugin-inject "0.1.0-SNAPSHOT"]]}}

You should not need to reference cider-nrepl anywhere.

Now launch cider-jack-in with the following command.

    $ lein plugin-inject repl :headless

And, AFAICT, it should all work.

Things to fix:
 - At the moment, it's hard coded for cider 0.10.1 which rather
   defeats the point.
 - It doesn't put the tools.nrepl dependency in. I think this can be achieved
   with `eval-in-project`.
 - This plugin is in `:user` rather than in `:repl`. If this is only an issue
   for load time, it's probably worth ignoring.
 - The name is ugly. I'm a disaster with names.

## License

Copyright © 2016 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
