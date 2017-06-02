if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'KotlinJS'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'KotlinJS'.");
}
var KotlinJS = function (_, Kotlin) {
  'use strict';
  var Pair = Kotlin.kotlin.Pair;
  var json = Kotlin.kotlin.js.json_pyyo18$;
  var w;
  function main$lambda() {
    change();
  }
  function main(args) {
    Vue.config.delimiters = ['{!', '!}'];
    console.log(Vue.config);
    vue = new Vue(json([new Pair('el', '#app'), new Pair('data', json([new Pair('message', 'ABCDEF123456789')])), new Pair('methods', json([new Pair('reverseMessage', main$lambda)]))]));
    console.log(vue);
  }
  var vue;
  function haha() {
    alert('hahah54564aha....');
  }
  function change() {
    if (vue != null) {
      var it = vue;
      var tmp$, tmp$_0, tmp$_1;
      tmp$_0 = (tmp$ = it.$data) != null ? tmp$.message : null;
      console.log(tmp$_0);
      (tmp$_1 = it.$data) != null ? (tmp$_1.message = it.$data.message.split('').reverse().join('')) : null;
    }
  }
  function ValueCallback() {
  }
  ValueCallback.$metadata$ = {
    kind: Kotlin.Kind.INTERFACE,
    simpleName: 'ValueCallback',
    interfaces: []
  };
  function VueCallback() {
  }
  VueCallback.$metadata$ = {
    kind: Kotlin.Kind.INTERFACE,
    simpleName: 'VueCallback',
    interfaces: []
  };
  function FilterCallback() {
  }
  FilterCallback.$metadata$ = {
    kind: Kotlin.Kind.INTERFACE,
    simpleName: 'FilterCallback',
    interfaces: []
  };
  Object.defineProperty(_, 'window', {
    get: function () {
      return w;
    }
  });
  _.main_kand9s$ = main;
  Object.defineProperty(_, 'vue', {
    get: function () {
      return vue;
    },
    set: function (value) {
      vue = value;
    }
  });
  _.haha = haha;
  _.change = change;
  _.ValueCallback = ValueCallback;
  _.VueCallback = VueCallback;
  _.FilterCallback = FilterCallback;
  w = window;
  vue = null;
  Kotlin.defineModule('KotlinJS', _);
  main([]);
  return _;
}(typeof KotlinJS === 'undefined' ? {} : KotlinJS, kotlin);
