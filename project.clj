(defproject dvlopt/i2c.mcp342x
            "0.0.0"

  :description  "Talk to the MCP342x family of ADC via I2C"
  :url          "https://github.com/dvlopt/i2c.mcp342x"
  :license      {:name "Eclipse Public License"
                 :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[dvlopt/i2c  "0.0.0"]
                 [dvlopt/void "0.0.0"]]
  :profiles     {:dev {:source-paths ["dev"]
                       :main         user
                       :dependencies [[criterium              "0.4.4"]
                                      [dvlopt/i2c           "0.0.0"]
                                      [org.clojure/clojure    "1.9.0"]
                                      [org.clojure/test.check "0.10.0-alpha2"]]
                       :plugins      [[lein-codox      "0.10.3"]
                                      [venantius/ultra "0.5.2"]]
                       :codox        {:output-path  "doc/auto"
                                      :source-paths ["src"]}
                       :repl-options {:timeout 180000}
                       :global-vars  {*warn-on-reflection* true}}})
