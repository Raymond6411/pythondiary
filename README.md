# pythondiary

##專案介紹

第一個網站

##成品展示

![]https://github.com/Raymond6411/pythondiary/blob/master/index.png

##使用技術| 用途
---------|---------
Python 3 | 不需要解釋
Flask(Python) | 幫助建立伺服器
HTML/CSS | 網頁表示和排版
Heroku | 託管網頁
Github | 存放原始碼

##程式碼片段

```python
@app.route("/")
def home():
    temp = glob.glob("articles/*")
    fill = []
    for t in temp:
        length = len(glob.glob(t + "/*.txt"))
        category = t.replace("articles/", "")
        f = (category, length)
        fill.append(f)
    return render_template("index.html", cat=fill)

```

