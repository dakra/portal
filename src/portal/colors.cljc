(ns portal.colors)

(def themes
  {::nord
   {::text        "#d8dee9"
    ::background  "#2e3440"
    ::background2 "#272c36"
    ::boolean     "#5e81ac"
    ::string      "#a3be8c"
    ::keyword     "#5e81ac"
    ::namespace   "#8fbcbb"
    ::tag         "#ebcb8b"
    ::symbol      "#d8dee9"
    ::number      "#b48ead"
    ::uri         "#d08770"
    ::border      "#4c566a"
    ::package     "#88c0d0"
    ::exception   "#bf616a"
    ::diff-add    "#a3be8c"
    ::diff-remove "#bf616a"}
   ::nord-light
   {::text        "#4c566a"
    ::background  "#ffffff"
    ::background2 "#eceff4"
    ::boolean     "#5e81ac"
    ::string      "#a3be8c"
    ::keyword     "#5e81ac"
    ::namespace   "#8fbcbb"
    ::tag         "#ebcb8b"
    ::symbol      "#4c566a"
    ::number      "#b48ead"
    ::uri         "#d08770"
    ::border      "#d8dee9"
    ::package     "#88c0d0"
    ::exception   "#bf616a"
    ::diff-add    "#a3be8c"
    ::diff-remove "#bf616a"}
   ::solarized-dark
   {::text        "#93a1a1"
    ::background  "#073642"
    ::background2 "#002b36"
    ::boolean     "#268bd2"
    ::string      "#859900"
    ::keyword     "#268bd2"
    ::namespace   "#2aa198"
    ::tag         "#b58900"
    ::symbol      "#93a1a1"
    ::number      "#d33682"
    ::uri         "#cb4b16"
    ::border      "#586e75"
    ::package     "#2aa198"
    ::exception   "#dc322f"
    ::diff-add    "#859900"
    ::diff-remove "#dc322f"}
   ::solarized-light
   {::text        "#93a1a1"
    ::background  "#fdf6e3"
    ::background2 "#eee8d5"
    ::boolean     "#268bd2"
    ::string      "#859900"
    ::keyword     "#268bd2"
    ::namespace   "#2aa198"
    ::tag         "#b58900"
    ::symbol      "#93a1a1"
    ::number      "#d33682"
    ::uri         "#cb4b16"
    ::border      "#d2cdbb"
    ::package     "#2aa198"
    ::exception   "#dc322f"
    ::diff-add    "#859900"
    ::diff-remove "#dc322f"}
   ::material-ui
   {::text        "#d8dee9"
    ::background  "#2c2d3b"
    ::background2 "#21232f"
    ::boolean     "#5e81ac"
    ::string      "#c3e887"
    ::keyword     "#c792ea"
    ::namespace   "#ffb563"
    ::tag         "#ebcb8b"
    ::symbol      "#92bdec"
    ::number      "#f77669"
    ::uri         "#d08770"
    ::border      "#797979"
    ::package     "#ffb563"
    ::exception   "#bf616a"
    ::diff-add    "#a3be8c"
    ::diff-remove "#bf616a"}
   ::vs-code-embedded
   {:font-size   "var(--vscode-editor-font-size)"
    :font-family "var(--vscode-editor-font-family)"
    :border-radius 0

    ::text        "var(--vscode-editor-foreground)"
    ::border      "var(--vscode-notebook-cellBorderColor)"
    ::background  "var(--vscode-notebook-editorBackground)"
    ::background2 "var(--vscode-notebook-cellEditorBackground)"

    ::uri         "var(--vscode-textLink-foreground)"
    ::tag         "var(--vscode-textPreformat-foreground)"
    ::string      "var(--vscode-debugTokenExpression-string)"
    ::number      "var(--vscode-debugTokenExpression-number)"
    ::boolean     "var(--vscode-debugTokenExpression-boolean)"
    ::keyword     "var(--vscode-textLink-foreground)"
    ::symbol      "var(--vscode-editor-foreground)"
    ::namespace   "var(--vscode-descriptionForeground)"
    ::package     "var(--vscode-descriptionForeground)"
    ::exception   "var(--vscode-editorError-foreground)"
    ::diff-add    "var(--vscode-terminal-ansiGreen)"
    ::diff-remove "var(--vscode-debugTokenExpression-name)"}
   ::zerodark
   {::text        "#abb2bf"
    ::background  "#282c34"
    ::background2 "#22252c"
    ::boolean     "#da8548"
    ::string      "#98be65"
    ::keyword     "#61afef"
    ::namespace   "#61afef"
    ::tag         "#ccd4e3"
    ::symbol      "#abb2bf"
    ::number      "#da8548"
    ::uri         "#da8548"
    ::border      "#4c566a"
    ::package     "#88c0d0"
    ::exception   "#ff6c6b"
    ::diff-add    "#a3be8c"
    ::diff-remove "#ff6c6b"}
   ::gruvbox
   {::text        "#ebdbb2"
    ::background  "#282828"
    ::background2 "#1e1e1e"
    ::boolean     "#d3869b"
    ::string      "#b8bb26"
    ::keyword     "#d3869b"
    ::namespace   "#fabd2f"
    ::tag         "#ebdbb2"
    ::symbol      "#ebdbb2"
    ::number      "#d3869b"
    ::uri         "#da8548"
    ::border      "#504945"
    ::package     "#ffffff"
    ::exception   "#a3be8c"
    ::diff-add    "#b8bb26"
    ::diff-remove "#fb4934"}
   ::zenburn
   {::text        "#dcdccc"
    ::background  "#383838"
    ::background2 "#303030"
    ::boolean     "#bfebbf"
    ::string      "#cc9393"
    ::keyword     "#afd8af"
    ::namespace   "#5c888b"
    ::tag         "#f0dfaf"
    ::symbol      "#dcdccc"
    ::number      "#8cd0d3"
    ::uri         "#dfaf8f"
    ::border      "#4f4f4f"
    ::package     "#8cd0d3"
    ::exception   "#cc9393"
    ::diff-add    "#9fc59f"
    ::diff-remove "#cc9393"}})
