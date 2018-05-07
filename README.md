# BilLib
##  Introduction 
Bilkent  students  have  some  difficulty  to  find  book’s location with  current system  in  the  library.  There  are  lots  of  letters  and  numbers  that  symbolize  locations  so  it  makes  student lose time.  Thus,  I  decided  to  develop  a  mobile  application  that  helps  student  to  find  book’s  location easily.  It is aimed that  the  program should  be  basic  that  can  be  used  by  all  students  and  staff  easily.  It is also aimed that  the  application  gives  people  ability  to  find  book’s  location  by  using  visual  description.  Finally, it is  decided  that  the  program  should  be  written  in  Android  environment,  so  that  students  can  use  the  app  in  their  mobile  phones  at  the  library  and  can  get  notifications.
## Details
<h3> Using  Bilkent  Library  Web  Site </h3>

   Many  applications  provide  a  personalized  usage  for  its  users.  Also,  Bilkent  library  website  shows  users’  previous  checkouts,  holds,  and  fines  after  they  log  in  to  system.  We  decided  to  add  log-in  option  to  provide  reminder  for  users  besides  showing  book  locations.  Basically  the  application  will  search  and  find  books  using  Bilkent  library  website  (sending  query  requests  using  html  to  Bilkent  library),  then  shows  location  of  selected  book  graphically.  Moreover,  there  will  be  a  log-in  option  on  top  of  the  application  window  and  if  users  log-in  they  can  access  their  checkouts,  holds,  fines  and  get  notification  about  due  dates  of  borrowed  books. 

<h3 >Creating  Bookshelf  Database </h3> 

   Every  book  in  the  Bilkent  library  has  a  call  number  and  books  are  placed  into  the  shelves  according  to  their  call  number.  Also  each  bookshelf  has  a  unique  range  of  call  numbers.  We  will  use  this  ranges  and  call  numbers  in  databases  to  findbooks  location. 
   
<h3 >Ceating  Personalized  Features </h3> 

   User  will  have  option  to  login  and  get  notification.  If  the  user  wants,  after  finding  the  book’s  location  he  can  add  the  book  on  a  borrowed  list  with  due  date.  Our  app  will  send  notification  before  close  due  dates  using  Android’s  notification  option. 
   
<h3 >Setching  Floor  Plan </h3> 

   When  the  user  searches  for  a  book  and  click  the  find  location  button,  our  program  will  highlight  which  building  and  floor  that  is  in  on  Bilkent  library  building  plan.  After  user  click  on  highlighted  location,  application  will  show  the  top  view  of  that  floor  and  highlight  exact  shelf  of  that  book.  To  do  that,  we  will  store  image  of  the  Bilkent  library’s  floor  plan  of  A  and  B  building.  Then,  for  each  building  we  will  store  top  view  of  each  floor  in  our  app.  According  to  shelfs’  location,  our  app  will  choice  the  appropriate  image  and  highlight  (draw  a  circle)  on  exact  location  of  shelf.   
   
## User  Interface   
<h3 >First  Page </h3> 

   When  the  user  opens  the  application,  they  will  see the main page.  On  the  top  there  is  a  login  option  for  getting  notifications.  There  is  a  text  field  for  typing  the  book’s  name  and  searching  button.  At  the  bottom,  there  are  two  buttons  library  rules  and  notifications.
   
![alt text](https://github.com/kazimsanlav/BilLib/blob/master/Images/1.png)
![alt text](https://github.com/kazimsanlav/BilLib/blob/master/Images/6.png)
 
<h3 >Book  Info </h3> 

   When  user  choose  a  book  on  the  list  and  click  on  it,  information  about  that  book  (name,  author,  call  number,  availability,  location...)    will  be  shown.  Right  next  to  book  information,  there  is  a  find  button  which  will  actually  show  the  location  of  the  book  to  user.  
   
![alt text](https://github.com/kazimsanlav/BilLib/blob/master/Images/3.png)

