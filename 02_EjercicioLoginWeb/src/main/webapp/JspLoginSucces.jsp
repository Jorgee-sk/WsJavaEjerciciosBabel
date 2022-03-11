<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/bienvenida.css" rel="stylesheet" type="text/css">
<title>Bienvenido ${user.username}!</title>
</head>
<body>
	<header>
        <div class="container">
            <a class="logoPag" href="#START">PÁGINA DE BIENVENIDA</a>
            <a href="#" class="toggle-button">
                <span class="bar"></span>
                <span class="bar"></span>
                <span class="bar"></span>
            </a>
            <nav>
                <div class="navLink">
                    <ul>
                        <li><a href="#curriculum">CURRÍCULUM</a></li>
                        <li><a href="#GymClub">THE GYM CLUB</a></li>
                        <li><a href="#LastNews">ULTIMAS NOTICIAS THE GYM CLUB</a></li>
                    </ul>   
                </div>
            </nav>
        </div>
    </header>
    <!--SECTION DE FOTO DE PERFIL E INICIO-->
    <section id="START" class="sectionPFP">
            <div style="padding-top: 6em; padding-bottom: 1em;" class="containerSection1 d-block align-items-center flex-column">
                <img width="200" height="200" src="img/userIcon.png" alt="...">
            </div>
            <div style="padding-bottom: 2em; padding-left: 0%;" class="containerSection1 d-flex align-items-center flex-column">
                <h1 class="text-uppercase marginBottom0">${user.username}</h1>
                <p class="textP marginBottom0 subHeader">${mSucces}</p>
            </div>
    </section>
     <!--SECTION DE SOBRE MÍ-->
    <section id="curriculum" class="sectionAboutMe">
        <div style="padding-top: 1em; padding-bottom: 2em;" class="containerSection1 d-flex align-items-center flex-column">
            <h1 class="text-uppercase marginBottomAdapt textColorAqua">Currículum</h1>
           	<a href="curriculum.html"><img class="rounded-circle" src="img/profilePic2.png" alt="..."></a>
                <div><p style="text-align:center;"class="textP">Aquí podrás encontrar mas información sobre lo que
                me gusta, a lo que me dedico y como puedes contactarme en caso de estar
                interesado.
                </p></div>
        </div>
    </section>
  	<!--SECTION MIS PROYECTOS-->
    <section id="GymClub" class="sectionProjects">
        <h1 class="projectHeader text-center text-uppercase " style="padding-top: 1em;">The gym club</h1>
        <div class="containerSection1 d-flex align-items-center flex-column">
               
                  <a href="mainPage.html"><img class="img1" src="img/gym.jpeg" alt="..."></a>
                   
             
                    <p style="text-align:center;  font-size: 20px" class="textP">
                    	¿Quieres conocer nuestro gimnasio?¿Quieres las mejores 
                    	dietas por nutricionistas expertos?¿Estás preparado
                    	para la mayor variedad de clases en un gimnasio?
        
                    </p>
                    <p style="text-align:center; font-size: 20px" class="textP">
                    	Bienvenido a THE GYM CLUB , tu gimnasio de confianza,
                    	en la siguiente página podrás inscribirte y disfrutar
                    	de todas nuestras ventajas. 
                        <a href="mainPage.html"> THE GYM CLUB</a>
                    </p>
                    <br>

        </div>
    </section>

      <!--SECTION DE SOBRE MÍ-->
    <section id="LastNews" class="sectionAboutMe">
        <div style="padding-top: 1em; padding-bottom: 2em;" class="containerSection1 d-flex align-items-center flex-column">
            <h1 class="text-uppercase marginBottomAdapt"> últimas noticias</h1>
            
             <a href="mainPage.html"><img class="img1" src="img/gym.jpeg" alt="..."></a>
             
            <p style=" text-align:center; font-size: 20px" class="textP">
            Aqui encontrarás las últimas noticias
            de nuestro gimnasio y podrás estar
            al tanto de todas las novedades.
            </p>
            <p style=" text-align:center; font-size: 20px" class="textP">
            Accede a través del siguiente <a href="linkedPage.html">link</a>
            para estar a la última. No te pierdas ninguna de nuestras
            nuevas clases!
            </p>
        </div>
    </section>
      






    <footer class="footer text-center">
        <div class="footerContainer">
                <div>
                    <h4 style="font-size: large;" class="text-uppercase">Jorge Galiano García &copy;</h4>
                </div>
        </div>
    </footer>
	
</body>
</html>