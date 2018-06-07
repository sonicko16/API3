package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.*;

@Controller
@SpringBootApplication
public class DemoApplication {

  @RequestMapping("/")
  @ResponseBody
  String home() {
    return "Tu no deberias estar aqui.";
  }

  @RequestMapping("/peliculas")
  @ResponseBody
  String peliculas() {
    return {
  "15:17 Tren a París" : {
    "año" : "2018/02",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "https://i1.wp.com/www.peliculastoday.com/wp-content/uploads/2018/05/15-17-Tren-a-Paris.jpg?fit=716%2C1024&ssl=1",
    "link" : "https://www.rapidvideo.com/v/FQY0L8VTNT&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "The 15:17 to Paris En la tarde del día 21 de agosto de 2015, el mundo observaba en silencio mientras los medios informaban sobre un ataque terrorista frustrado en el tren Thalys #9364 con destino a París—un atentado evitado por tres valientes jóvenes americanos que viajaban por Europa. La película narra el curso de las vidas de estos amigos, desde los avatares de su niñez para encontrar su destino, hasta la serie de eventos que precedieron al ataque. A lo largo de esta desgarradora experiencia, su amistad nunca flaqueó, convirtiéndola en su mejor arma, lo que les permitió salvar la vida de los más de 500 pasajeros a bordo.",
    "titulo" : "15:17 Tren a París"
  },
  "27: El club de los malditos" : {
    "año" : "2018/01",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://i2.wp.com/www.peliculastoday.com/wp-content/uploads/2018/05/27-El-club-de-los-malditos.jpg?fit=717%2C1024&ssl=1",
    "link" : "https://www.rapidvideo.com/e/FQYXJPTO0H&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Tras la muerte de un músico en circunstancias sospechosas, un investigador y una aficionada a la música analizan por qué las estrellas del rock a menudo mueren a los 27.",
    "titulo" : "27: El club de los malditos"
  },
  "3 Metros Sobre el Cielo" : {
    "año" : "2010/01/20",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "http://www.pelisplanet.com/wp-content/uploads/2016/07/3-metros-sobre-el-cielo-231x300.jpg",
    "link" : "https://www.rapidvideo.com/e/FJUFET0RFN&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Drama romántico adolescente que narra la historia de dos jóvenes que pertenecen a mundos opuestos. Es la crónica de un amor improbable, casi imposible, pero inevitable, que terminará arrastrándolos en un frenético viaje iniciático en donde juntos descubrirán el primer gran amor.",
    "titulo" : "3 Metros Sobre el Cielo"
  },
  "6 Globos" : {
    "año" : "2018/03",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "https://i0.wp.com/www.peliculastoday.com/wp-content/uploads/2018/04/6-globos.jpg?fit=691%2C1024&ssl=1",
    "link" : "https://www.rapidvideo.com/v/FQ43LWLNRE&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : " Katie no está al tanto de ninguna sorpresa desapacible aguardándola cuando se prepara para la celebración de la noche. Katie, molesta por el hecho de que su hermano Seth no vino por un tiempo antes que comenzase la celebración, decide ir a su casa. Cuando ve que hay un montón de correspondencia en frente de su piso cuando llega al piso, se percata de que algo no está en orden.Seth es un viejo adepto a la heroína y ha empezado a reusarlo. Katie está resuelta a salvar a su hermano caso de que caiga. Katie, que está en el camino con Seth y su hija de dos años, luchará duro en la busca de un centro de rehabilitación donde pueda llevar a su hermano a lo largo de toda la noche.",
    "titulo" : "6 Globos"
  },
  "Actos de Venganza" : {
    "año" : "2017/10",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://allcalidad.com/wp-content/uploads/2018/02/actos-de-venganza.jpg",
    "link" : "https://www.rapidvideo.com/e/FO80M8UGUD&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Actos de venganza Antonio Banderas se meterá en la piel de un abogado que sufre un tremendo trauma al perder a su mujer y su hija. Desde ese momento su vida sufrirá un giro de 360 grados que le hará refugiarse en el alcohol y guardar voto de silencio para poder hacer justicia y encontrar al asesino de su familia. No descansará hasta conocer la verdad de este suceso que le hará transformarse en otra persona.",
    "titulo" : "Actos de Venganza"
  },
  "Aguas Revueltas" : {
    "año" : "2017/09",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "http://allcalidad.com/wp-content/uploads/2018/02/rip-tide.jpg",
    "link" : "https://www.rapidvideo.com/e/FOCRAJJ5KS&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Aguas revueltas Cora, una modelo americana de 18 años, se muda a un pueblo costero de Australia. Al principio se siente sola, pero pronto es aceptada, se enamora y hace nuevos amigos. Tendrá que decidir si volver para retomar su carrera de modelo o quedarse.",
    "titulo" : "Aguas Revueltas"
  },
  "Alerta en lo Profundo" : {
    "año" : "1999/07",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "https://2.bp.blogspot.com/-GpdGeBjxisA/Wte1o9zo_3I/AAAAAAAAAj4/qWmeL-RI6NAPDfjshvhYQ-TyxtUA8zeawCLcBGAs/s1600/1B.jpg",
    "link" : "https://www.rapidvideo.com/e/FQHHU1NRLW&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Deep Blue Sea: Utilizando tiburones Mako, una de las máquinas de matar más rápidas y perfectas de la naturaleza, la doctora McAlester (Saffron Burrows) espera encontrar la clave de la regeneración de los tejidos del cerebro humano. Pero para alcanzar su meta ha violado los códigos éticos, modificando el ADN de los tiburones, haciendo que sean más inteligentes y más rápidos, convirtiéndolos de depredadores peligrosos en monstruos depredadores que pondrán en peligro a todo el equipo de trabajo…",
    "titulo" : "Alerta en lo Profundo"
  },
  "Alerta en lo profundo 2" : {
    "año" : "2018/04",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://i0.wp.com/www.peliculastoday.com/wp-content/uploads/2018/04/Deep-Blue-Sea-2.jpg?fit=683%2C1024&ssl=1",
    "link" : "https://www.rapidvideo.com/v/FQKAKYLX86&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Profundo mar azul 2 | Deep Blue Sea 2 La Doctora Misty Calhoun, conservacionista de tiburones, es invitada para asesorar un proyecto secreto organizado por el farmacéutico millonario Carl Durant. Calhoun se sorprende al descubrir que la compañía utiliza a los agresivos e impredecibles tiburones toro para los tests.",
    "titulo" : "Alerta en lo profundo 2"
  },
  "Alien: Covenant" : {
    "año" : "2017/05",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/cbc6bf4318f22ee9c784ebc0d345d491.jpg",
    "link" : "https://www.rapidvideo.com/e/FI81R0W3CN&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Ridley Scott vuelve al universo que creó en Alien con Alien: Covenant, el segundo capítulo de la trilogía-precuela que comenzó con Prometheus y que conecta directamente con el trabajo de 1979 de Scott en la ciencia ficción. Anclado en un planeta remoto en el punto más alejado de la galaxia, el equipo de la nave Covenant descubre lo que creen que es un inexplorado paraíso, pero en realidad es un oscuro y peligroso mundo cuyo único habitante es el sintético David (Michael Fassbender), superviviente de la desafortunada expedición Prometheus. Alien: Covenant se estrena en Estados Unidos el 6 de octubre de 2017 y, por el momento, está confirmada la vuelta de Michael Fassbender en el papel del David y Noomi Rapace, quien interpretó a la protagonista de Prometheus Elizabeth Shaw.",
    "titulo" : "Alien: Covenant"
  },
  "Amityville: El Despertar" : {
    "año" : "2017/03",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/d29925addab4d9332f8e9501bed04383.jpg",
    "link" : "https://www.rapidvideo.com/e/FPJZ4PB0TZ&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Belle y su familia se mudan a una nueva casa, con el fin de ahorrar dinero para ayudar a pagar el costoso tratamiento de su hermano gemelo que se encuentra en coma. Pero cuando fenómenos extraños empiezan a ocurrir en la casa, incluyendo la recuperación milagrosa de su hermano y pesadillas cada vez más espeluznantes, Belle comienza a sospechar que su madre no le está contando toda la verdad y pronto se da cuenta de que acaban de mudarse a la terrorífica casa de Amityville.",
    "titulo" : "Amityville: El Despertar"
  },
  "Amor a medianoche" : {
    "año" : "2018/05/21",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "https://hdfilmologia.com/uploads/posts/2018-05/1525989084_96.jpg",
    "link" : "https://www.rapidvideo.com/e/FRR5ZJSGI8&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Por las noches de 17 años Katie compone las canciones hermosas bajo la guitarra, y por el día es obligada a esconderse en la oscuridad: su piel tierna no madurará la luz solar. Pero una vez en la medianoche conoce con Charlie, el muchacho alegre con la garbera rojo, como el sol, el cabello y la sonrisa encantadora. Súbito y el amor apasionado por la llamarada brillante ilumina la vida de la muchacha enferma. Y ahora para querido es lista a arder en los rayos de luz del sentimiento loco …",
    "titulo" : "Amor a medianoche"
  },
  "Animales Fantásticos y Dónde Encontrarlos" : {
    "año" : "2016/11",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://es.web.img3.acsta.net/r_1920_1080/pictures/16/06/23/11/34/392948.jpg",
    "link" : "https://www.rapidvideo.com/e/FJ5G08JUYN&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Año 1926. Newt Scamander acaba de completar un viaje por todo el mundo para encontrar y documentar una extraordinaria selección de criaturas mágicas. Llegando a Nueva York para hacer una breve parada en su camino, donde podría haber llegado y salido sin incidentes…pero no para un Muggle llamado Jacob, un caso perdido de magia, y la fuga de algunas criaturas fantásticas de Newt, que podrían causar problemas el mundo mágico y en el mundo Muggle.",
    "titulo" : "Animales Fantásticos y Dónde Encontrarlos"
  },
  "Aniquilación" : {
    "año" : "2018/02",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://i1.wp.com/www.peliculastoday.com/wp-content/uploads/2018/03/Aniquilacion.jpg?fit=691%2C1024&ssl=1",
    "link" : "https://www.rapidvideo.com/v/FPB4HL0M72&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Cuando su marido desaparece durante una misión secreta, la bióloga Lena se une a una expedición a una misteriosa región acordonada por el gobierno de Estados Unidos. El grupo, compuesto por varias mujeres científicas, investiga la Zona X, un intrigante lugar controlado por una poderosa fuerza alienígena del planeta Tierra. La Zona X es un lugar al que han ido otras expediciones, pero del que ninguna ha vuelto.",
    "titulo" : "Aniquilación"
  },
  "Annabelle" : {
    "año" : "2014/09",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/4829cc8bca589aa2e8d250308b28e607.jpg",
    "link" : "https://www.rapidvideo.com/e/FI2C0WE2VY&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "John Form encuentra el regalo perfecto para su mujer embarazada, Mia: una preciosa e inusual muñeca vintage que lleva un vestido de novia blanco inmaculado. Sin embargo, la alegría de Mia al recibir a Annabelle no dura mucho. Durante una espantosa noche la pareja ve como miembros de una secta satánica invaden su hogar y los atacan brutalmente. No sólo dejan sangre derramada y terror tras su visita…los miembros de la secta conjuran a un ente de tal maldad que nada de lo que han hecho se compara al siniestro camino a la maldición que ahora es… Annabelle.",
    "titulo" : "Annabelle"
  },
  "Annabelle 2: La Creación" : {
    "año" : "2017/08",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/5cc17dca925045520cf3380c81ba8c65.jpg",
    "link" : "https://www.rapidvideo.com/e/FJ4RKIPL8U&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Annabelle Creation Varios años después del trágico fallecimiento de su hija, un juguetero que crea muñecas y su mujer, acogen en su casa a una enfermera y un grupo de chicas tratando de convertir su casa en un cálido orfanato. Sin embargo, los nuevos inquilinos se convertirán en el objetivo de Annabelle, una muñeca poseída por un ser demoníaco.",
    "titulo" : "Annabelle 2: La Creación"
  },
  "Anon" : {
    "año" : "2018/05",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://i2.wp.com/www.peliculastoday.com/wp-content/uploads/2018/05/Anon.jpg?fit=691%2C1024&ssl=1",
    "link" : "https://www.rapidvideo.com/e/FR0T1P7FUH&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Anon nos lleva hasta un futuro no muy lejano al estilo soviético, donde el gobierno trata de combatir el crimen eliminando la privacidad, creando así una vigilancia total y de autocensura. Un oficial de policía llamado Sal Frieland hace todo lo posible para combatir el crimen en su ciudad. Sin embargo, las cosas toman un inesperado giro cuando se topa con una hacker conocida como The Girl, que le llevará a cuestionar su propio gobierno.",
    "titulo" : "Anon"
  },
  "Ant-Man: El hombre hormiga" : {
    "año" : "2015/07",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/7d507f6d0583e70c5b6d531319fcbfdd.jpg",
    "link" : "https://www.rapidvideo.com/e/FLLYYSW3TD&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "La próxima evolución en el Universo Cinematográfico Marvel traerá por primera vez a la pantalla grande a uno de los miembros fundadores de los Avengers con Ant-Man. Equipado con la sorprendente habilidad de encogerse en escala pero aumentar en fuerza, el ladrón experto Scott Lang deberá aceptar su héroe interno y ayudar a su mentor, el Dr. Hank Pym, a proteger el secreto de su espectacular traje de una nueva generación de peligros y amenazas. Enfrentando lo que parecen ser infranqueables obstáculos, Pym y Lang deberán planear la ejecución de un gran robó a fin se salvar al mundo.",
    "titulo" : "Ant-Man: El hombre hormiga"
  },
  "Apocalypto" : {
    "año" : "2006/12",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://es.web.img3.acsta.net/r_1920_1080/medias/nmedia/18/89/65/21/20060271.jpg",
    "link" : "https://www.rapidvideo.com/e/FKJJTGT3OA&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Historia ambientada en la época del imperio maya. Cuando la idílica existencia de los mayas es brutalmente interrumpida por el ataque de una fuerza invasora, un hombre emprende un arriesgado viaje a un mundo regido por el miedo y la opresión en el que le espera un incierto final. Debido a un giro del destino y espoleado por el amor a su esposa y a su familia, emprenderá el regreso a su hogar en un desesperado esfuerzo por preservar su forma de vida...",
    "titulo" : "Apocalypto"
  },
  "Apuesta Maestra" : {
    "año" : "2017/12",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "https://vignette.wikia.nocookie.net/doblaje/images/d/d1/5a0b12012d2290acb99111ae0.jpg/revision/latest?cb=20180109073953&path-prefix=es",
    "link" : "https://www.rapidvideo.com/e/FR16U4PEEQ&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Basada en la historia real de Molly Bloom, una prometedora esquiadora de nivel olímpico que, al ver truncada su carrera deportiva, acabó organizando las partidas de póker clandestinas más exclusivas de Estados Unidos. A sus partidas acudían las más grandes estrellas de Hollywood, deportistas de élite, titanes del mundo de los negocios y, finalmente, miembros de la mafia rusa, hasta que Molly fue arrestada por 17 agentes armados del FBI en mitad de la noche. Inmersa en una batalla judicial, su único aliado en su lucha ante los tribunales fue el abogado criminalista Charlie Jaffey, quien supo ver en ella una verdad mucho más sincera de la que la prensa sensacionalista publicó en sus páginas.",
    "titulo" : "Apuesta Maestra"
  },
  "Asesinato en el Expreso de Oriente" : {
    "año" : "2017/11",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "http://allcalidad.com/wp-content/uploads/2018/02/asesinato-en-el-expreso-de-oriente.jpg",
    "link" : "https://www.rapidvideo.com/e/FPE57LLA9B&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Asesinato en el Expreso de Oriente Año 1935. El Orient Express, un legendario tren que atraviesa Europa, se ve obligado a parar su recorrido a causa de una tormenta de nieve. En él viajan Edward Ratchett (Johnny Depp) un letal hombre de negocios al que le acompañan su ayudante Hector MacQueen (Josh Gad) y su mayordomo (Derek Jacobi), la misteriosa Condesa Andrenyi (Lucy Boynton) que consume ‘ciertas sustancias’, la Princesa rusa Dragomiroff (Judi Dench) que viaja con su perspicaz criada Hildegarde Schmidt (Olivia Colman), el profesor austriaco furtivo Gerhard Hardman (Willem Dafoe), la misionera Pilar Estravados (Penélope Cruz), Biniamino Marquez (Manuel Garcia-Rulfo), un inmigrante cubano que dirige varias franquicias automovilísticas, el Doctor Arbuthnot (Leslie Odom Jr.), el Conde Andrenyi (Sergei Polunin), la parlanchina y entrometida Caroline Hubbard (Michelle Pfeiffer), Mary Debenham (Daisy Ridley), una joven independiente y de mente abierta, y Pierre Michel (Marwan Kenzari), uno de los trabajadores del tren.",
    "titulo" : "Asesinato en el Expreso de Oriente"
  },
  "Asesino: Misión venganza" : {
    "año" : "2017/11/03",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://vignette.wikia.nocookie.net/doblaje/images/5/5b/Asesino_Mision_Venganza_Poster_Latino_JPosters.jpg/revision/latest?cb=20170627204405&path-prefix=es",
    "link" : "https://www.rapidvideo.com/e/FR0HQBKB5F&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Tras la muerte de su prometida en un ataque terrorista, Mitch Rapp es reclutado por los Black Ops y entrena bajo la dirección de Stan Hurley, un agente de la CIA. Rapp y Hurley tendrán que llevar a cabo una misión para detener una operación que podría desatar el caos a nivel internacional.  Ver online http://www.pelisplanet.com/asesino-mision-venganza-american-assassin/#ixzz5Gv6AmdnL  Under Creative Commons License: Attribution",
    "titulo" : "Asesino: Misión venganza"
  },
  "Atómica" : {
    "año" : "2017/07",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/40169ec88838b36c651289140cda45f1.jpg",
    "link" : "https://www.rapidvideo.com/e/FRBA3BP16W&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Año 1989, el muro de Berlín está a punto de caer. Un agente del MI6 encubierto aparece muerto y la espía Lorraine Broughton (Charlize Theron) debe encontrar por todos los medios una lista que el agente estaba intentando hacer llegar a Occidente, y en la que figuran los nombres de todos los agentes encubiertos que trabajan en Berlín oriental. Lorraine no se detendrá ante nada para conseguir dar con esa lista, enfrentándose a varios asesinos y sumergiéndose en un mundo en el que nadie parece ser quien dice ser.",
    "titulo" : "Atómica"
  },
  "Avatar" : {
    "año" : "2009/12",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://moviecultists.com/wp-content/uploads/2009/11/avatar-poster.jpg",
    "link" : "https://www.rapidvideo.com/e/FJ5H55ZF5Y&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Jake Sully, un ex-marine confinado a una silla de ruedas, es reclutado para viajar al planeta Pandora, donde un consorcio corporativo está extrayendo un mineral que será clave en la solución de la crisis energética de la Tierra. Debido a que la atmósfera de Pandora es tóxica, han creado el Programa Avatar, en el que 'conductores' humanos tienen sus conciencias unidas a un avatar,... un cuerpo biológico controlado de manera remota que puede sobrevivir en ese entorno. Estos avatares han sido creados genéticamente como híbridos combinando ADN humano con el de los nativos de Pandora… los Na’vi. Convertido en un avatar, Jake puede volver a caminar. Se le asigna la misión de infiltrarse entre los Na’vi, que se han convertido en un obstáculo importante para la extracción del preciado mineral. Pero Neytiri, una hermosa mujer Na’vi, le salvará la vida, y esto lo cambiará todo...",
    "titulo" : "Avatar"
  },
  "Baby Driver" : {
    "año" : "2017/06",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://img.moviepostershop.com/baby-driver-movie-poster-2017-1010777521.jpg",
    "link" : "https://www.rapidvideo.com/e/FJZBZYW9UO&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Baby, un joven y talentoso conductor especializado en fugas (Ansel Elgort), depende del ritmo de su banda sonora personal para ser el mejor en lo suyo. Cuando conoce a la chica de sus sueños (Lily James), Baby ve una oportunidad de abandonar su vida criminal y realizar una huida limpia. Pero después de haber sido forzado a trabajar para un jefe del crimen (Kevin Spacey), deberá dar la cara cuando un malogrado golpe amenaza su vida, su amor y su libertad.",
    "titulo" : "Baby Driver"
  },
  "Barry Seal: Sólo en América" : {
    "año" : "2017/09",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://allcalidad.com/wp-content/uploads/2017/12/barry-seal-el-traficante.jpg",
    "link" : "https://www.rapidvideo.com/e/FR1W7YDEHO&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Barry Seal: Sólo en América En la década de los años 80, después de haber trabajado como piloto de TWA, la mayor aerolínea estadounidense, Barry Seal (Tom Cruise) se ha convertido en un narcotraficante del cartel de Medellín. Posteriormente es reclutado por la CIA como mercenario para realizar labores de inteligencia para ellos. Además, se convierte en un informante de la DEA, la Administración para el Control de Drogas, debido a sus conocimientos en la materia.  ",
    "titulo" : "Barry Seal: Sólo en América"
  },
  "Batman Ninja" : {
    "año" : "2018/04",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://i2.wp.com/www.peliculastoday.com/wp-content/uploads/2018/04/Batman-Ninja.jpg?fit=700%2C1024&ssl=1",
    "link" : "https://www.rapidvideo.com/v/FQQSWT51U7&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Batman, junto a sus aliados y enemigos, se ve transportado desde la moderna Gotham hasta el Japón feudal. Film animado coproducido entre Japón y EEUU que cuenta con guión de Kazuki Nakashima (Kill La Kill) and diseño de personajes Takashi Okazaki (Afro Samurai)",
    "titulo" : "Batman Ninja"
  },
  "Batman: Gotham a Luz de Gas" : {
    "año" : "2018/01",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://i1.wp.com/www.peliculastoday.com/wp-content/uploads/2018/01/Batman-Gotham-by-Gaslight.jpg?fit=683%2C1024&ssl=1",
    "link" : "https://www.rapidvideo.com/v/FNR58UCLK8&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Ambientado en la temporada victoriana, este remake animado de la novela gráfica Batman: Gotham de Gaslight encara al detective Dark Knight contra el resbaladizo asesino en serie Jack el Destripador. Dirigido por Sam Liu y presentando las voces de Bruce Greenwood y Jennifer Carpenter como Bruce Wayne y Selina Kyle respectivamente.En una era de misterio y superchería, ¿de qué forma reaccionaría la gente de Gotham frente a una extraña criatura de la noche, un vigilante vestido de murceguillo temido tanto por los culpables como por los inocentes? El primer cuento de Elseworld reimagina al detective de Dark Knight en la temporada victoriana y lo pone frente al vil asesino en serie Jack the Ripper.",
    "titulo" : "Batman: Gotham a Luz de Gas"
  },
  "Baywatch: Guardianes de la bahía" : {
    "año" : "2017/05",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/3ff1005e99a8ab863178c65155ec1133.jpg",
    "link" : "https://www.rapidvideo.com/e/FJ4RPJ1AY8&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "El estricto y esforzado socorrista de la antigua escuela Mitch Buchannon deberá trabajar codo con codo con el rebelde Matt Brody, un joven ex nadador olímpico caído en desgracia al que le gusta saltarse las normas. A pesar de sus diferencias, los dos socorristas deberán formar equipo. Juntos descubrirán una trama delictiva local que amenaza el futuro de la Bahía. Su objetivo será salvar la playa de su destrucción a manos de un magnate del petróleo.",
    "titulo" : "Baywatch: Guardianes de la bahía"
  },
  "Benji" : {
    "año" : "2018/03",
    "calidad" : "HD",
    "categoria" : "Infantil",
    "img" : "https://i1.wp.com/www.peliculastoday.com/wp-content/uploads/2018/03/Benji.jpg?fit=674%2C1000&ssl=1",
    "link" : "https://www.rapidvideo.com/v/FPFUI1KCFA&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Un día, cuando el joven Carter (Gabriel Bateman) se halla con un can callejero por accidente, es amor a primer aspecto. El amigo de 4 patas es velozmente contrabando a casa, donde asimismo toma por ataque el corazón de la hermana de Carter, Frankie (Darby Camp), para gran desazón de su madre Whitney (Kiele Sanchez). Y desde el instante en que los pequeños bautizaron a su nuevo amigo Benji, ahora asimismo es una parte de la familia. Su amigo piloso puede hacer más que solo ser dulce.",
    "titulo" : "Benji"
  },
  "Black Panther" : {
    "año" : "2018/01",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://cdn.collider.com/wp-content/uploads/2017/11/black-panther-poster.jpg",
    "link" : "https://www.rapidvideo.com/e/FQY0BCETD6&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "'Black Panther' cuenta la historia de T'Challa quien, después de los acontecimientos de 'Capitán América: Civil War', vuelve a casa, a la nación de Wakanda, aislada y muy avanzada tecnológicamente, para ser proclamado Rey. Pero la reaparición de un viejo enemigo pone a prueba el temple de T'Challa como Rey y Black Panther ya que se ve arrastrado a un conflicto que pone en peligro todo el destino de Wakanda y del mundo.",
    "titulo" : "Black Panter"
  },
  "Boyka: Invicto IV" : {
    "año" : "2016/08/01",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://pics.filmaffinity.com/boyka_undisputed_iv-168167647-large.jpg",
    "link" : "https://www.rapidvideo.com/e/FI6TSF5NQQ&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Boyka es un luchador de boxeo que se encuentra en mitad de una importante liga. Durante la competición se produce una muerte lo que hace que empiece a replantearse verdaderamente lo que merece la pena este deporte. Cuando descubre que la mujer del fallecido se encuentra en serios problemas, decide luchar una serie de batallas para poder liberarla de la servidumbre.",
    "titulo" : "Boyka: Invicto IV"
  },
  "Braven" : {
    "año" : "2018/02",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://i0.wp.com/www.peliculastoday.com/wp-content/uploads/2018/05/Braven.jpg?fit=709%2C1012&ssl=1",
    "link" : "https://www.rapidvideo.com/v/FQWD37UWDZ&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Jason Momoa no toma presos en este intenso thriller de acción. Cuando Joe (Momoa) y su padre (Stephen Lang) llegan a su cabaña de caza recóndita, aguardan un fin de semana apacible. Lo que hallan es un alijo de heroína, oculto en la cabina por narcotraficantes. Cuando los criminales de pronto descienden sobre la cabaña, Joe y su padre deben hacer una suerte de matar o bien fallecer para subsistir.",
    "titulo" : "Braven"
  },
  "Bright" : {
    "año" : "2017/12",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://es.web.img2.acsta.net/r_1920_1080/pictures/17/12/11/16/55/1011025.jpg",
    "link" : "https://www.rapidvideo.com/e/FNLQ5BXRG1&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Ambientada en un mundo en el que las criaturas fantásticas conviven con los humanos, y en el que la policía tiene un departamento especial dedicado a crímenes que involucran magia. Un policía humano (Will Smith) se ve obligado a trabajar con un orco (Joel Edgerton), el primero en entrar en el cuerpo de policía. En una de sus investigaciones, esta peculiar pareja de policías descubrirá un peligroso objeto por el que muchos matarían: una varita mágica que es capaz de conceder deseos, pero también es considerada un arma asesina. Los dos protagonistas se verán entonces envueltos en una guerra territorial.",
    "titulo" : "Bright"
  },
  "Buscando a Dory" : {
    "año" : "2016/06",
    "calidad" : "HD",
    "categoria" : "Infantil",
    "img" : "https://i2.wp.com/www.peliculastoday.com/wp-content/uploads/2016/07/portada-Buscando-a-Dory.jpg?fit=600%2C857&ssl=1",
    "link" : "https://www.rapidvideo.com/e/FNBMU4DDBT&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Seis meses después de los acontecimientos ocurridos en la anterior entrega, Dory recupera repentinamente todos los recuerdos acerca de su infancia. Así al recordar algo sobre “la joya de Monterey, California”, Dory se decide a ir en busca de su familia, viaje que hará en compañía de Nemo y Martin. Siguiendo sus recién recuperados recuerdos llegará al Instituto de Vida Marina de Monterrey, donde se encontrará con Bailey, una ballena beluga blanca; Destino, un tiburón ballena; y Hank el pulpo, que se convertirán en sus guías. Sus nuevos compañeros le ayudarán a dar con su familia perdida y a recuperarse de lo que ella pensaba que era una verdadera pérdida. A lo largo de la película, Dory aprenderá a apreciar las pequeñas cosas de la vida, mientras descubre que sus amigos y la familia son lo único que importa. La película, dirigida por Andrew Stanton y Angus MacLane sobre un guion del propio Stanton, contará de nuevo con Ellen DeGeneres en su versión original, humorista que prestará su voz a la protagonista por segunda vez.",
    "titulo" : "Buscando a Dory"
  },
  "Buscando a Nemo" : {
    "año" : "2003/05",
    "calidad" : "HD",
    "categoria" : "Infantil",
    "img" : "http://www.cineycine.com/archivos/2014/01/buscando-a-nemo-poster.jpg",
    "link" : "https://www.rapidvideo.com/e/FKG377VSAW&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Nemo, un pececillo, hijo único muy querido y protegido por su padre, ha sido capturado en un arrecife australiano y ahora vive en una pecera en la oficina de un dentista de Sidney. El tímido padre de Nemo se embarcará en una peligrosa aventura para rescatar a su hijo. Pero Nemo y sus nuevos amigos tienen también un astuto plan para escapar de la pecera y volver al mar.",
    "titulo" : "Buscando a Nemo"
  },
  "Bushwick" : {
    "año" : "2017/08",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://i2.wp.com/teaser-trailer.com/wp-content/uploads/Bushwick-new-poster.jpg?resize=405%2C600&ssl=1",
    "link" : "https://www.rapidvideo.com/e/FR38A58KJB&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "En un barrio de Brooklyn, Lucy, de 20 años de edad, y el veterano de guerra Stupe deben cruzar la frontera para escapar de una fuerza militar invasora.",
    "titulo" : "Bushwick"
  },
  "Cada día" : {
    "año" : "2018/05/20",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "https://3.bp.blogspot.com/-BIjPOMft3TA/WpmZr0rHhnI/AAAAAAAAodE/gvmJDhl9wDQGYKOi7NEOA8LlFkjwXjoNwCLcBGAs/s00/Cada_Dia_Poster_Latino_1_JPosters.jpg",
    "link" : "https://www.rapidvideo.com/embed/FRKQKNIW2U",
    "servidor" : "rapidvideo",
    "sinopsis" : "Rhiannon es una adolescente de 16 años que se enamora de un misterioso espíritu llamado “A”, que se despierta en un cuerpo diferente cada día. Sintiendo una enorme conexión, Rhiannon y A intentan verse, sin saber qué o quién les traerá el nuevo día. Cuanto más se enamoran el uno del otro, la idea de amar a alguien que es una persona diferente cada 24 horas empieza a pasarles factura, llevándoles a tomar una decisión que cambiará sus vidas para siempre.  Ver online http://www.pelisplanet.com/dia-every-day/#ixzz5GuqPzbj7  Under Creative Commons License: Attribution",
    "titulo" : "Cada día"
  },
  "Candy Jar" : {
    "año" : "2018/04",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/a367710361a71d2d9fb166ffcd6755df.jpg",
    "link" : "https://www.rapidvideo.com/e/FQYSBQXGJ5&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Son las estrellas del equipo de debate de su instituto, pero lo único que tienen en común es su ambición de llegar a la universidad de sus sueños.",
    "titulo" : "Candy Jar"
  },
  "Capitán América 2: El Soldado Del Invierno" : {
    "año" : "2014/03",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/27a2638dbc211f91dacaafb925bee4a0.jpg",
    "link" : "https://www.rapidvideo.com/e/FLYUGTPS76&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Tenemos el agrado de presentarles una entrega muy esperada del superhéroe americano que pasara por muchas aventuras sin precedentes y a la vez con una gran dosis de acción nos asegura escenas fantásticas. Tras los devastadores acontecimientos acaecidos en Nueva York con Los Vengadores, Steve Rogers, alias el Capitán América, vive tranquilamente en Washington D.C. intentando adaptarse al mundo moderno. Pero cuando atacan a un colega de S.H.I.E.L.D., Steve se ve envuelto en una trama de intrigas que representa una amenaza para el mundo. Se unirá entonces a la Viuda Negra para desenmascarar a los conspiradores. Cuando por fin descubren la magnitud de la trama, se unirá a ellos el Halcón. Los tres tendrán que enfrentarse a un enemigo inesperado y extraordinario: el Soldado de Invierno. De esta manera podemos estar mas que seguros dela calidad de la cinta. Disfrútenla de principio a fin....",
    "titulo" : "Capitán América 2: El Soldado Del Invierno"
  },
  "Capitán América: Civil War" : {
    "año" : "2016/04",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/8f4b2825a14c6ab4157a0e376c25d356.jpg",
    "link" : "https://www.rapidvideo.com/e/FLVK09SQU4&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Les traemos nuevamente una película de la franquicia Marvel, esto ya nos da un precedente de los niveles de las emociones y escenas que veremos. Veremos a muchos de nuestros superhéroes favoritos en esta en escenas alucinantes y que serán únicas. Después de que otro incidente internacional involucre a Los Vengadores, causando varios daños colaterales, aumentan las presiones políticas para instaurar un sistema que exija más responsabilidades y que determine cuándo deben contratar los servicios del grupo de superhéroes. Esta nueva situación dividirá a Los Vengadores, mientras intentan proteger al mundo de un nuevo y terrible villano. No perdamos ningún detalle del film, les aseguro que los atrapara de principio a fin y nos dará una gran dosis de acción.",
    "titulo" : "Capitán América: Civil War"
  },
  "Capitán América: El Primer Vengador" : {
    "año" : "2011/07",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/4dabc73e5a5c659630ce945fd80b3799.jpg",
    "link" : "https://www.rapidvideo.com/e/FLYUF1O10V&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Nacido durante la Gran Depresión (años 30), Steve Rogers creció como un chico enclenque en una familia pobre. Horrorizado por las noticias que llegaban de Europa sobre los nazis, decidió enrolarse en el ejército; sin embargo, debido a su precaria salud, fue rechazado una y otra vez. Enternecido por sus súplicas, el General Chester Phillips le ofreció la oportunidad de participar en un experimento especial: la \"Operación Renacimiento\". Tras administrarle el “Suero Super-Soldado” y bombardearlo con “vitarrayos”, el cuerpo de Steve se hace perfecto. A continuación, se sometió a un intensivo programa de entrenamiento físico y táctico. Tres meses después, le encomendaron su primera misión como Capitán América. Armado con un escudo indestructible, emprenderá la guerra contra el Mal como centinela de la libertad y líder de los Vengadores. Conocido también con el nombre de \"Capitán América 1: El Primer Vengador\".",
    "titulo" : "Capitán América: El Primer Vengador"
  },
  "Capitán Calzoncillos: Su primer peliculón" : {
    "año" : "2017/06/01",
    "calidad" : "HD",
    "categoria" : "Infantil",
    "img" : "http://allcalidad.com/wp-content/uploads/2017/09/las-aventuras-del-capitan-calzoncillos-la-pelicula.jpg",
    "link" : "https://www.rapidvideo.com/e/FQV9IUM1XQ&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "George y Harold son dos niños de primaria a los que les encantan los cómics y se dedican a pintar y dibujar historietas cuyo personaje central es el 'Capitán Calzoncillos'. Un día, de manera accidental, hipnotizan al director de su escuela, provocando su transformación en el mismo Capitán Calzoncillos de sus alocados tebeos. Cada vez que alguien chasquea los dedos, el Sr. Krupp se convierte en este superhéroe, que debe sus poderes a sus turbocalzones. Para volver a ser el Sr. Krupp, basta con que se le eche agua por encima.",
    "titulo" : "Capitán Calzoncillos: Su primer peliculón"
  },
  "Cargo" : {
    "año" : "2018/05",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "http://allcalidad.com/wp-content/uploads/2018/05/cargo.jpg",
    "link" : "https://www.rapidvideo.com/e/FRH90BJPVT&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Thriller post-apocalíptico que narra la historia de Andy, un padre que tras ser infectado por un \"virus zombi\" cuando es mordido por su mujer, deberá poner a salvo a su hija, no sólo del resto de muertos vivientes, sino de sí mismo. En 48 horas, y si no pone ningún remedio, la vida de Andy llegará a su fin, por lo que antes intentará llegar a una tribu aborigen que podría ser su única salvación. El problema es que este grupo de personas viven aisladas y no se fían de cualquiera, por lo que ganarse su confianza no será tarea fácil.",
    "titulo" : "Cargo"
  },
  "Cars" : {
    "año" : "2006/06",
    "calidad" : "HD",
    "categoria" : "Infantil",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/5ad4e3e017b7a010d8f5cdbcf7b72d43.jpg",
    "link" : "https://www.rapidvideo.com/e/FL5G7F2IK1&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "El aspirante a campeón de carreras Rayo McQueen al parecer está muy cerca de llegar al éxito, la fama y todo lo que alguna vez habia soñado, sin embargo, toma por error un desvío inesperado en la polvorienta y solitaria Ruta 66. Su actitud arrogante se esfuma cuando aparece en una comunidad pequeña olvidada que le enseña lecciones de las cosas importantes de la vida que había olvidado.",
    "titulo" : "Cars"
  },
  "Cars 2: Una Nueva Aventura Sobre Ruedas" : {
    "año" : "2011/06",
    "calidad" : "HD",
    "categoria" : "Infantil",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/e571c15f8cfd4f56686456fb60876798.jpg",
    "link" : "https://www.rapidvideo.com/e/FQLMB94UQ9&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Rayo McQueen y su amigo, la grúa Mate, viajan al extranjero para participar en el primer Campeonato Mundial en el que se decidirá cuál es el coche más rápido del planeta. La primera escala es Tokio (Japón), donde Mate tendrá que convertirse en un espía secreto al verse envuelto inesperadamente en un caso de espionaje internacional, que lo llevará a París y a Londres. También vivirán una aventura de proporciones épicas al viajar a Porto Corsa (Italia), para disputar el Campeonato. Sin embargo, los dos tendrán que renunciar a los placeres de la Riviera italiana -yates, playas y pasta al pesto- ya que Mate está muy ocupado con su labor de espía, mientras que McQueen compite contra los mejores coches del mundo.",
    "titulo" : "Cars 2: Una Nueva Aventura Sobre Ruedas"
  },
  "Cars 3" : {
    "año" : "2017/06",
    "calidad" : "HD",
    "categoria" : "Infantil",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/a927d4bc2b544e0b4cd3aac616df194f.jpg",
    "link" : "https://www.rapidvideo.com/e/FON4HCRD0I&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Después de que Jackson Storm (Armie Hammer) un nuevo corredor diseñado con alta tecnología, llega a la pista, el público se pregunta cuando se retirará el ahora veterano y campeón experimentado de siete Copas Pistón, el Rayo McQueen (Owen Wilson). Este quiere demostrar que aún no le hace falta retirarse, pero luego de su última carrera de la temporada, un fuerte accidente en la pista (que casi le cuesta la vida) pone al Rayo McQueen al borde de su inminete retiro de las carreras para siempre, sin embargo Cruz Ramírez (Cristela Alonzo), una entrenadora de corredores hispana, quiere demostrarle a McQueen que aún puede seguir compitiendo y le enseñara a no rendirse ante Jackson Storm y lo ayudara en su reto para seguir en las carreras.",
    "titulo" : "Cars 3"
  },
  "Chucky 7" : {
    "año" : "2017/10",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/997212de060fa940093a0ec624003274.jpg",
    "link" : "https://www.rapidvideo.com/e/FJZEWB6SOA&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Encerrada en un psiquiátrico para peligrosos criminales, Nica Pierce (Fiona Dourif) está convencida erróneamente de que fue ella, y no Chucky, quien asesinó a toda su familia. Pero cuando su psiquiatra introduce una nueva herramienta terapéutica para facilitar las sesiones grupales, una cadena de muertes comienzan a sucederse en el lugar, lo que le hará preguntarse a Nica que ella igual no está loca después de todo. Andy Barclay (Alex Vincent), el niño de la película original, corre a la ayuda de Nica. Pero para salvarla tendrá que librarse de Tiffany (Jennifer Tilly), la novia de Chucky que hará cualquier cosa por su amado.",
    "titulo" : "Chucky 7"
  },
  "Cincuenta Sombras De Grey" : {
    "año" : "2015/02",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/520180fdc2d0edef3c7e65ef463b36b8.jpg",
    "link" : "https://www.rapidvideo.com/e/FRSCF8LMZG&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Anastasia Steele es una joven e inocente estudiante de Literatura cuyo curso termina ese mismo año. Como favor hacia su mejor amiga, se verá inmersa en una tarea de periodista que no le agrada demasiado. El encargo consiste en entrevistar a uno de los más prometedores y ricos empresarios del momento: Christian Grey. Apabullada por su carisma, Anastasia caerá rendida a los pies del galán sin ninguna opción de resistirse. Sin embargo, cuando empiecen a intimar, se dará cuenta de que las costumbres sexuales de su pareja de cama no resultan nada convencionales. Ante ella se abre un mundo completamente nuevo de posibilidades, y desde el momento en que ponga un pie dentro del estilo de vida del arrollador Grey, la joven no tendrá escapatoria ante el juego de seducción, poder, sumisión y deseo irrefrenable, que aparece frente a ella. Una historia sobre los límites, la confianza, y el erotismo, bañada por la inocencia femenina de Anastasia y el arrojo masculino de Grey, una de las parejas literarias más famosas del momento.",
    "titulo" : "Cincuenta Sombras De Grey"
  },
  "Cincuenta Sombras Liberadas" : {
    "año" : "2018/02",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "https://2.bp.blogspot.com/-rLaEQoBhoIg/WgCTtZ3MZwI/AAAAAAAAncQ/bXy8soqV43Upu4PSG0M7g8d0xN0iKW25wCLcBGAs/s640/Cincuenta_Sombras_Liberadas_Poster_3_JPosters.jpg",
    "link" : "https://www.rapidvideo.com/e/FRSCGECVPP&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Creyendo que han dejado atrás las sombras del pasado, los recién casados Christian y Anastasia disfrutan de su relación y de su vida llena de lujos. Pero justo cuando Ana empieza a relajarse, aparecen nuevas amenazas que ponen en riesgo su felicidad. Adaptación de la última novela de la saga “50 sombras de Grey”.",
    "titulo" : "Cincuenta Sombras Liberadas"
  },
  "Cincuenta Sombras Más Oscuras" : {
    "año" : "2017/02",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/608dce0181499af4c27a26a1e408ae4b.jpg",
    "link" : "https://www.rapidvideo.com/e/FR1VYHERXM&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Tenemos con nosotros la segunda entrega que promete ser mucho mejor que su precedente, con una dosis de drama y romance al limite nos asegura atraparnos en cada segundo del film. Podemos comenzar con la historia de la siguiente manera, cuando un herido Christian Grey intenta atraer a una cautelosa Ana Steele de regreso a su vida, ella exige un nuevo acuerdo antes de darle otra oportunidad. Conforme los dos comienzan a ganar confianza y estabilidad, las sombras del pasado de Christian empiezan a rodear a la pareja, determinadas a destruir las esperanzas de un futuro juntos. Descubran el lado mas interesante del romance, disfruten todas las experiencias al limite que nso brinda el film y ¿Cómo creen que sea el final?",
    "titulo" : "Cincuenta Sombras Más Oscuras"
  },
  "Coco" : {
    "año" : "2017/10",
    "calidad" : "HD",
    "categoria" : "Infantil",
    "img" : "https://i0.wp.com/www.peliculastoday.com/wp-content/uploads/2017/11/Coco.jpg?fit=682%2C1024&ssl=1",
    "link" : "https://www.rapidvideo.com/e/FOJJ9TR2PV&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "¿Qué pasaría si pudiéramos reencontrarnos con nuestros familiares fallecidos hace tiempo? A partir de la colorida celebración mexicana del Día de los Muertos, Coco nos descubre el misterio de compartir la reunión familiar más extraordinaria y sorprendente, incluso con aquellos antepasados que murieron muchos años atrás. La historia sigue a un niño de doce años de edad llamado Miguel, que vive con su familia en una zona rural de México, y cuyo sueño es la música y tocar la guitarra. Miguel desencadenará una serie de acontecimientos extraordinarios relacionados con un misterio centenario. La festividad del Día de los Muertos servirá como telón de fondo para que nuestro protagonista se pregunte de dónde viene, cuál es su lugar dentro de su familia, y cómo se han entretejido las relaciones familiares a través del tiempo. Una celebración de la vida, de la familia, los recuerdos y la conexión a través de diversas generaciones.",
    "titulo" : "Coco"
  },
  "Como ser un latin lover" : {
    "año" : "2017/04/28",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "https://videocine.com.mx/wp-content/uploads/2017/02/latin_lover_pelicula_teaser_eugenio.jpg",
    "link" : "https://www.rapidvideo.com/e/FM6MN9EJJJ&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Máximo, un gigoló especializado en la seducción de mujeres ancianas ricas, se casa con una mujer que le dobla en edad. Veinticinco años después, harto y aburrido de despertar junto a su esposa de 80 años, recibe la sorpresa de su vida cuando ella termina abandonándolo. Forzado a salir de su mansión y buscando desesperadamente dónde quedarse, deberá mudarse con su distante hermana Sara y su adorable hijo nerd Hugo, en su pequeño departamento.",
    "titulo" : "Como ser un latin lover"
  },
  "Condorito: La Película" : {
    "año" : "2018/02",
    "calidad" : "HD",
    "categoria" : "Infantil",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/64961471679f7947e6833a6e476e5df0.jpg",
    "link" : "https://www.rapidvideo.com/e/FQ62THDBAX&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "En esta entrega, el pajarraco más querido de Pelotillehue emprenderá, junto a su tenaz sobrino Coné, una peligrosa aventura para rescatar a su desaparecida suegra Doña Tremebunda, abducida misteriosamente por una banda alienígena. Lo que no ha tomado en cuenta es que, mientras intenta salvar a la madre de Yayita, esta será tentada románticamente por el insistente Pepe Cortisona.",
    "titulo" : "Condorito: La Película"
  },
  "Conspiración Terrorista" : {
    "año" : "2017/05",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://www.masdvd.com/uploads/foto3067-1",
    "link" : "https://www.rapidvideo.com/e/FQAH93UZOR&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : " cuenta la historia de un investigador de la CIA que, sin saberlo, les revela información a los terroristas. A raíz de ello debe ir contrarreloj para detener un ataque de guerra biológica en Londres.",
    "titulo" : "Conspiración Terrorista"
  },
  "Crepúsculo" : {
    "año" : "2008/11",
    "calidad" : "HD",
    "categoria" : "Drama/Accion",
    "img" : "https://www.elmulticine.com/imagenes/carteles/Crepusculo-b.jpg",
    "link" : "https://www.rapidvideo.com/e/FO4L64ZUHK&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Historia de amor entre un vampiro y una humana. Bella Swan (Kristen Stewart) siempre fue una chica algo diferente, sin seguir las tendencias del resto de las chicas de su instituto de Phoenix. Cuando su madre se vuelve a casar, manda a Bella a vivir con su padre, a la pequeña y lluviosa ciudad de Forks, Washington, donde ella no espera nada. Pero entonces conoce al misterioso y atractivo Edward Cullen (Robert Pattinson), un joven que pronto demuestra no ser como los demás...",
    "titulo" : "Crepúsculo"
  },
  "Crepúsculo: Amanecer - Parte 1" : {
    "año" : "2011/03",
    "calidad" : "HD",
    "categoria" : "Drama/Accion",
    "img" : "https://imagessl9.casadellibro.com/m/ig/9/5327879.jpg",
    "link" : "https://www.rapidvideo.com/e/FO4L64ZUHK&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "El amor que Edward y Bella sienten el uno por el otro se sella con la celebración de una gran ceremonia organizada por Alice. Durante la luna de miel, los recién casados tienen relaciones sexuales y Bella queda embarazada. El rápido crecimiento del feto, mitad humano mitad vampiro, afecta gravemente a su salud, llevándola al borde de la muerte...",
    "titulo" : "Crepúsculo: Amanecer - Parte 1"
  },
  "Crepúsculo: Amanecer - Parte 2" : {
    "año" : "2012/11",
    "calidad" : "HD",
    "categoria" : "Drama/Accion",
    "img" : "https://2.bp.blogspot.com/-Y3srfqKKvAY/V4BIbWGeJkI/AAAAAAAAAPo/-QKwhHbXolk353KFwPpuqWQFDHDhV-q9ACLcB/s1600/Crepusculo%2BAmanecer%2BParte%2B2.jpg",
    "link" : "https://www.rapidvideo.com/e/FNS7CGM1DZ&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Bella concluye su transformación en vampiro y ahora debe familiarizarse con su nueva condición. Con el nacimiento de Renesmee, la familia Cullen deberá protegerse ante la amenaza de los Volturi ya que existe una ley para los vampiros que prohíbe a todos los clanes convertir a niños, pues son difíciles de controlar y pueden generar auténticas masacres que pongan en peligro la secreta existencia de los vampiros... Segunda parte de la adaptación de \"Amanecer\" que supone la quinta entrega de la franquicia cinematográfica Crepúsculo, basada en las novelas de Stephenie Meyer.",
    "titulo" : "Crepúsculo: Amanecer - Parte 2"
  },
  "Cuando Cae la Nieve" : {
    "año" : "2016/01",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "https://i2.wp.com/www.peliculastoday.com/wp-content/uploads/2017/01/portada-Cuando-cae-la-nieve.jpg?fit=694%2C1000&ssl=1",
    "link" : "https://www.rapidvideo.com/e/FQWPZTKACL&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Despite the Falling Snow 1950, Moscú. Katya es una espía estadounidense en plena carrera armamentística de la Guerra Fría. Cuando le asignan su misión más importante, conseguir información secreta de la joven promesa del gobierno ruso, Alexander, lo último que espera es que va a enamorarse de él. Intentar conciliar su pasión hacia a él con su rechazo al comunismo la llevará a hacer el mayor de los sacrificios, un gesto que Alexander descubrirá treinta años más tarde.",
    "titulo" : "Cuando Cae la Nieve"
  },
  "Dale duro" : {
    "año" : "2015/03/26",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "https://i.pinimg.com/originals/a6/bc/39/a6bc3919bf10f9d1b58336a164b980da.jpg",
    "link" : "https://www.rapidvideo.com/e/FM7QLP9SEC&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Cuando al millonario James King (Ferrell) le condenan a ir a la cárcel por un delito que en realidad no ha cometido, contratará los servicios de quien le limpia el coche, a la vez un delincuente habitual (Hart), para que le enseñe cómo ha de comportarse para sobrevivir en prisión. ",
    "titulo" : "Dale duro"
  },
  "Dando La Nota 2: Aún Más Alto" : {
    "año" : "2015/08",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/e6805106e43b29a03e2ab2fdc1934279.jpg",
    "link" : "https://www.rapidvideo.com/e/FIGUEGJLVK&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Secuela de &quot;Dando la nota&quot; (2012). Beca y Fat Amy se enfrentan a su último año en la universidad. Las Barden Bellas se han convertido en el coro a capella más importante y envidiado del campus y competirá en el Campeonato mundial de Coros, donde el equipo estadounidense nunca ha ganado.",
    "titulo" : "Dando La Nota 2: Aún Más Alto"
  },
  "Dando la Nota" : {
    "año" : "2012/09",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "http://es.web.img3.acsta.net/r_1920_1080/medias/nmedia/18/93/85/49/20287611.jpg",
    "link" : "https://www.rapidvideo.com/e/FIFNDRMNVY&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Beca (Anna Kendrick) es de esas chicas que prefiere escuchar lo que sale de sus cascos a lo que puede decirle alguien. Al llegar a la Universidad, no tiene cabida en ningún grupo, pero la obligan a unirse a uno que jamás habría escogido, formado por chicas malas, chicas buenas y chicas raras que solo comparten una cosa: lo bien que suenan cuando están juntas. Beca quiere que el grupo de canto acústico salga del tradicional mundo musical y llegue a alcanzar armonías nuevas y sorprendentes. Las chicas deciden escalar puestos en el despiadado mundo del canto a cappella universitario. Su intento puede acabar siendo lo mejor que han hecho, o quizá su mayor locura. Probablemente sea una mezcla de las dos cosas.",
    "titulo" : "Dando la Nota"
  },
  "Dando la Nota 3" : {
    "año" : "2017/12",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "http://verpeliculas-online.org/uploads/posts/2017-12/1514387784_dando-la-nota-3-ver-pelicula-completa.jpg",
    "link" : "https://www.rapidvideo.com/e/FQJM9XHZNQ&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Tercera parte de la exitosa franquicia musical sobre las aventuras de las componentes femeninas del grupo de música a capella llamado The Barden Bellas. Anna Kendrick y Rebel Wilson vuelven a encabezar el reparto de la nueva entrega que fue un superéxito de taquilla de 2015 y ue se convirtió en el estreno más grande de todos los tiempos para una película musical de acción real.",
    "titulo" : "Dando la Nota 3"
  },
  "Darc" : {
    "año" : "2018/05",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://i0.wp.com/www.peliculastoday.com/wp-content/uploads/2018/05/Darc.jpg?fit=674%2C1000&ssl=1",
    "link" : "https://www.rapidvideo.com/e/FQYNFI224O&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Con el objetivo de descentralizar una posible organización global encargada asimismo del horrible caso de trafico de personas, un agente intentara frenarlo. También la interpol manda a uno de sus mejores hombres con el largometraje de terminar con estas malas acciones. No obstante para lograrlo va a deber contactar con un despiadado delincuente que conoce bien a los yakuza.",
    "titulo" : "Darc"
  },
  "Darkland" : {
    "año" : "2017/01",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://www.gstatic.com/tv/thumb/movieposters/13296280/p13296280_p_v8_aa.jpg",
    "link" : "https://www.rapidvideo.com/e/FR6N5RMR43&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "En Darkland, un exitoso doctor perderá a su hermano pequeño en un asalto relacionado con pandillas y abandonará su privilegiada vida para convertirse en un guerrero enmascarado con ansias de venganza.",
    "titulo" : "Darkland"
  },
  "Deadpool" : {
    "año" : "2016/02",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/ceb89ce5db9b3de3c1c3906821f165fd.jpg",
    "link" : "https://www.rapidvideo.com/e/FRL6WPO636&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Tenemos el agrado de traerles un film cargado de acción con un personaje muy característico de la gran franquicia marvel el cual con su personalidad disparatada promete divertirnos pro montones. El anti-héroe y divertido personal Deadpool narra el origen de un ex-operativo de la fuerzas especiales llamado Wade Wilson, convertido a mercenario, y quien es expuesto a un cruel experimento adquiere poderes de curación rápida, adquiriendo Wade entonces el alter ego de Deadpool. Ya con habilidades nuevas y un oscuro y sarcástico sentido del humor, Deadpool intentará cazar al hombre que casi termina con su vida. Los invito a disfruta una historia muy particular donde tenemos un anti-héroe que nos divertirá mucho con sus locuras....",
    "titulo" : "Deadpool"
  },
  "Deadpool 2" : {
    "año" : "2018/05",
    "calidad" : "CAM",
    "categoria" : "Accion",
    "img" : "https://2.bp.blogspot.com/-gk4iSaZjV1Q/Wr5a6ZU-5AI/AAAAAAAAohw/1aRme_9XVpU43Owy2TUc2dLJlcT3SAa-gCLcBGAs/s640/Deadpool_2_Poster_Latino_4_JPosters.jpg",
    "link" : "https://www.rapidvideo.com/e/FRFHND7XPR&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Después de sobrevivir a un ataque bovino casi mortal, el desfigurado chef de una cafetería (Wade Wilson) lucha por cumplir su sueño de convertirse en el barman más caliente de Mayberry mientras aprende a lidiar con su perdido sentido del gusto. Buscando algo de picante para su vida, así como un condensador de fluzo, Wade deberá luchar contra ninjas, la yakuza y un grupo sexualmente agresivos de canes, mientras recorre el mundo para descubrir la importancia de la familia, la amistad y el sabor, encontrando un nuevo gusto por la aventura y logrando el codiciado título de taza de café de “Mejor amante del mundo”.",
    "titulo" : "Deadpool 2"
  },
  "Death Note" : {
    "año" : "2017/08/25",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "https://pics.filmaffinity.com/death_note-858726028-large.jpg",
    "link" : "https://www.rapidvideo.com/e/FPU25NACWH&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Un día, cuando Light termina las clases, encuentra un cuaderno negro tendido en el suelo, llamado «Death Note», un cuaderno sobrenatural que es capaz de matar personas si se escriben los nombres en él y si el portador visualiza mentalmente la cara de quien quiere asesinar. Nueva adaptación de la famosa serie (y manga) \"Death Note\" esta vez con actores reales.",
    "titulo" : "Death Note"
  },
  "Deep: El Pulpo" : {
    "año" : "2018/01",
    "calidad" : "HD",
    "categoria" : "Infantil",
    "img" : "http://allcalidad.com/wp-content/uploads/2018/03/deep-el-pulpo.jpg",
    "link" : "https://www.rapidvideo.com/e/FPE433XP7L&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Deep: El pulpo Deep, un pulpo aventurero y el último de su especie, vive en una colonia de extravagantes criaturas. Cuando un accidente destroza su hogar, el guardián del abismo, el Kraken, envía a Deep y sus amigos en un peligroso viaje para encontrar un nuevo hogar",
    "titulo" : "Deep: El Pulpo"
  },
  "Dementia 13" : {
    "año" : "2017/10",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "https://1.bp.blogspot.com/-n6pi_89_7zY/WbOjFfbLWlI/AAAAAAAAB9M/BDoxZoF0ukk0FHmbCkGJjjQBh8cYmH2GACLcBGAs/s320/Dementia-13-poster-remake.jpg",
    "link" : "https://www.rapidvideo.com/e/FQV8472RWY&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Sigue a una familia que trata de superar la muerte de su hija más joven varios años más tarde. Mientras honran la muerte de su hija, un largo engaño, un asesino en serie con un hacha y un fantasma vengativo se unen en la misma noche para atacar a la familia. Todos en la familia tienen un secreto, nadie quiere enfrentarse a lo que hicieron, y para que alguien pueda sobrevivir, la verdad tiene que salir… más pronto que tarde.",
    "titulo" : "Dementia 13"
  },
  "Deseo de Matar" : {
    "año" : "2018/03",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://i1.wp.com/www.peliculastoday.com/wp-content/uploads/2018/04/Deseo-de-matar.jpg?fit=693%2C1024&ssl=1",
    "link" : "https://www.rapidvideo.com/e/FRNZORDJP8&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Deseo de matar | Death Wish Paul Kersey (Bruce Willis) es un famoso cirujano que vive con su familia en Nueva York. Un día, su esposa (Elisabeth Shue) y su hija (Camila Morrone) son brutalmente atacadas en su casa. Paul, que siempre había sido un tipo tranquilo, siente cómo la sed de venganza va apoderándose de él. Con la policía sobrecargada de crímenes, decide tomar la justicia por su mano e ir en busca de los agresores de su familia y de paso enfrentarse a todo tipo de criminales de la Gran Manzana. A medida que las víctimas acaparan la atención de los medios, la ciudad se pregunta si este vengador es un ángel guardián… o un simple justiciero.",
    "titulo" : "Deseo de Matar"
  },
  "Doctor Strange: Hechicero Supremo" : {
    "año" : "2016/10",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/7f5686b80641de9d6a143caafaca5464.jpg",
    "link" : "https://www.rapidvideo.com/e/FLVJUR9U0G&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Doctor Strange: Hechicero Supremo, la historia del famoso neurocirujano Dr. Stephen Strange cuya vida cambia para siempre luego de un accidente automovilistico que lo deja sin poder mover sus manos. Cuando la medicina tradicional falla, se ve obligado a buscar una cura y esperanzas en un lugar impensado: una comunidad aislada llamada Kamar-Taj. Rapidamente descubre que este no es solo un centro de recuperacion...",
    "titulo" : "Doctor Strange: Hechicero Supremo"
  },
  "Donde esta el dinero" : {
    "año" : "2017/09/20",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "http://allcalidad.com/wp-content/uploads/2017/11/%C2%BFD%C3%B3nde-est%C3%A1-el-dinero.jpg",
    "link" : "https://www.rapidvideo.com/e/FLZ5HIUNE7&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Un joven ingenioso de South Central deberá colarse en una fraternidad de la Universidad del Sur de California afín al movimiento “Lily-white” para recuperar un alijo de dinero robado.",
    "titulo" : "Donde esta el dinero"
  },
  "Dragon Ball Z: La Resurrección de Freezer" : {
    "año" : "2015/04",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://img00.deviantart.net/f692/i/2015/184/2/5/segundo_poster_final_de_dragon_ball_z__2015___by_dwowforce-d8zrny1.png",
    "link" : "https://www.rapidvideo.com/e/FHLW2I9RJ5&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Después de que Bills, el Dios de la destrucción, decidiera no destruir la Tierra, se vive una gran época de paz. Hasta que Sorbet y Tagoma, antiguos miembros élite de la armada de Freezer, llegan a la Tierra con el objetivo de revivir a su líder por medio de las Bolas de Dragón. Su deseo es concedido y ahora Freezer planea su venganza en contra de los Saiyajin. La historia hace que una gran oleada de hombres bajo el mando de Freezer lo acompañe.",
    "titulo" : "Dragon Ball Z: La Resurrección de Freezer"
  },
  "Dude" : {
    "año" : "2018/04",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "https://i1.wp.com/www.peliculastoday.com/wp-content/uploads/2018/04/Dude.jpg?fit=500%2C750&ssl=1",
    "link" : "https://www.rapidvideo.com/v/FQKDR4LITP&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Cuatro mejores amigas se tienen que enfrentar a su nueva vida. Las dos últimas semanas de instituto están a punto de empezar y ellas tendrán que enfrentarse a su futuro. Alejarse de sus amigas, decidir que van a hacer y otras experiencias como el primer enfrentamiento con la muerte y las primeras pérdidas. Una historia sobre los sentimientos adolescentes en una época de cambios.",
    "titulo" : "Dude"
  },
  "Duro de cuidar" : {
    "año" : "2017/08/25",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "http://allcalidad.com/wp-content/uploads/2017/10/duro-de-cuidar.jpg",
    "link" : "https://www.rapidvideo.com/e/FRES80X82Z&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Duro de cuidar El mejor agente de protección del mundo tiene un nuevo cliente: un asesino a sueldo con quien se ha enfrentado en otras ocasiones de su pasado. Por eso se odian mutuamente. Sin embargo, ahora el guardaespaldas tendrá que colaborar con este criminal para lograr, en tan solo 24h, testificar en contra de un peligroso dictador de Europa del este, quien intentará acabar con sus vidas por todos los medios.",
    "titulo" : "Duro de cuidar"
  },
  "Déjame salir" : {
    "año" : "2017/02",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "https://img.ecartelera.com/noticias/fotos/38000/38080/1.jpg",
    "link" : "https://www.rapidvideo.com/e/FMMDC2LDW2&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Un joven afroamericano visita a la familia de su novia blanca, un matrimonio adinerado. Para Chris y su novia Rose ha llegado el momento de conocer a los futuros suegros, por lo que ella le invita a pasar un fin de semana en el campo con sus padres, Missy y Dean. Al principio, Chris piensa que el comportamiento \"demasiado\" complaciente de los padres se debe a su nerviosismo por la relación interracial de su hija, pero a medida que pasan las horas, una serie de descubrimientos cada vez más inquietantes le llevan a descubrir una verdad inimaginable.",
    "titulo" : "Déjame salir"
  },
  "El Abuelo Sin Verguenza" : {
    "año" : "2013/10",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "http://allcalidad.com/wp-content/uploads/2016/04/el-abuelo-sinverguenza.jpg",
    "link" : "https://www.rapidvideo.com/e/FIEE88HMDH&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "El abuelo sinvergüenza Historia sobre un malhumorado anciano de 86 años, Irving Zisman (Johnny Knoxville), al que inesperadamente le encasquetan a su nieto de 8 años Billy (Jackson Nicoll). Las dos generaciones de folloneros pronto se sienten muy unidos al comenzar un increíble viaje por el corazón de Norteamérica, haciendo un montón de jugarretas y gamberradas a gente desprevenida de la vida real, que no tenían ni la más remota idea de que estaban interviniendo en una comedia de cámara oculta “verdaderamente escandalosa”. Spin off de ‘Jackass’.",
    "titulo" : "El Abuelo Sin Verguenza"
  },
  "El Aro" : {
    "año" : "2002/12",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/6283bd53cb58fe792ff3826b672cfca0.jpg",
    "link" : "https://www.rapidvideo.com/e/FKJ85V8N6A&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Tenemos el agrado de traerles una gran entrega la cual es el inicio de una gran historia de terror que cautivara y pondrá la dosis escalofriante en los amantes del cine de terror con cada una de sus escenas. Rachel Keller (Naomi Watts) es una periodista de investigación que no da mucho crédito a lo que considera una especie de leyenda urbana: al parecer, circula por ahí una cinta de vídeo con imágenes aterradoras, que va acompañada de una llamada telefónica en la que se predice, con una semana de antelación, la muerte de quien las ha visto. Sin embargo, cuando 4 adolescentes encuentran la muerte exactamente una semana después de ver el vídeo, la curiosidad se apodera de ella y no parará hasta encontrar la cinta y verla. Los invito a ser parte de esta historia que nos traerá una trama muy peculiar, descubran que sucede en cada escena y disfrútenla....",
    "titulo" : "El Aro"
  },
  "El Aro 2" : {
    "año" : "2005/03",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/d9c413e38e6ac6820faedd05d49f9378.jpg",
    "link" : "https://www.rapidvideo.com/e/FKJJYHZSMR&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Les traemos la segunda entrega de un film taquillero que nos transporta a un mundo lleno de terror y con cada escena nos atrapa mas y mas, despierta sensaciones y emociones fuertes pero a la vez la historia es muy interesante. Para escapar de una vida que era una auténtica pesadilla, Rachel Keller y su hijo Aidan se mudan a un pequeño pueblo costero de Astoria, en Oregón. Su objetivo es olvidar el pasado y empezar de nuevo. Los invito a disfrutar de todas las escenas que vienen cargadas de grandes e impactantes emociones, descubran el desenlace....",
    "titulo" : "El Aro 2"
  },
  "El Aro 3" : {
    "año" : "2017/02",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/ef7156a356aadb2dbfde53431c053e6d.jpg",
    "link" : "https://www.rapidvideo.com/e/FP77T0UCXD&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Continuando con esta historia de terror. Una mujer joven preocupada por su novio encuentra una subcultura oscura donde alrededor de esta se encuentra una cinta de vídeo que advierte sobre su contenido, donde dice que muere el observador en siete días. Ella toma una gran decisión y se sacrifica por su novio y descubre una impactante noticia que hay una \"película dentro de la película\" que nadie ha visto nunca antes.",
    "titulo" : "El Aro 3"
  },
  "El Ascenso" : {
    "año" : "2017/01",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "https://i2.wp.com/www.peliculastoday.com/wp-content/uploads/2018/01/El-ascenso.jpg?fit=683%2C1024&ssl=1",
    "link" : "https://www.rapidvideo.com/v/FN0RUXLHYS&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Samy, por amor a Nadia le dice un día, que por ella sería capaz de escalar el Everest. Nadia, sin embargo, no le cree hasta que un día él abandona su casa, y se va a escalar los míticos 8848 metros del Everest. Un viaje que hace emocionar a sus amigos, a todo el barrio y después a casi todo el territorio francés que sigue con emoción las hazañas de este joven normal pero enamorado.",
    "titulo" : "El Ascenso"
  },
  "El Cavernicola" : {
    "año" : "2018/02",
    "calidad" : "HD",
    "categoria" : "Infantil",
    "img" : "http://allcalidad.com/wp-content/uploads/2018/05/MV5BYWMxYWVjNzAtMTY0YS00YWQyLWExMGItMjUxODkwYzQyNzMwXkEyXkFqcGdeQXVyMjMxOTE0ODA@._V1_SY1000_CR006571000_AL_.jpg",
    "link" : "https://www.rapidvideo.com/e/FRG92HX91Y&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Dos amigos cavernícolas unen a su tribu para enfrentarse a Lord Nooth, un tirano que quiere convertir su tierra en una mina y esclavizarlos. ¡Su lucha no es solo contra Lord Nooth, es contra toda la Edad de Bronce!",
    "titulo" : "El Cavernicola"
  },
  "El Círculo" : {
    "año" : "2017/04/27",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "http://allcalidad.com/wp-content/uploads/2017/10/el-circulo.jpg",
    "link" : "https://www.rapidvideo.com/e/FL39JUCFV8&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "El día que Mae Holland es contratada para trabajar en el Círculo, la empresa de internet más influyente del mundo, sabe que se le ha concedido la oportunidad de su vida. A través de un innovador sistema operativo, el Círculo unifica direcciones de email, perfiles de redes sociales, operaciones bancarias y contraseñas de usuarios dando lugar a una única identidad virtual y veraz, en pos de una nueva era marcada por la transparencia.",
    "titulo" : "El Círculo"
  },
  "El Despertar de los Muertos Vivientes" : {
    "año" : "2018/01",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "https://i1.wp.com/www.peliculastoday.com/wp-content/uploads/2018/04/El-despertar-de-los-muertos-vivientes.jpg?fit=683%2C1024&ssl=1",
    "link" : "https://www.rapidvideo.com/v/FPW0POML4K&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Remake del clásico de 1985 dirigido por George A.Romero (‘Amanecer de los muertos’, ‘La tierra de los muertos vivientes’) en el que los zombies vuelven a un estilo convencional. El mundo se encuentra diezmado por los muertos vivientes, que han arrasado prácticamente todo resto de vida en el planeta. No obstante, unos pocos humanos han luchado y sobrevivido a la amenaza y han logrado refugiarse en una base militar con el fin de protegerse a la vez que encuentran la cura a la infección. Ante la frustración de no obtener resultados rápidamente, el grupo de personas decide realizar experimentos que logren controlar y modificar el comportamiento de los zombies, para poder controlarlos y tener una oportunidad de salir de allí. Un helicóptero y miles de muertos son los que les separan de la ansiada libertad.",
    "titulo" : "El Despertar de los Muertos Vivientes"
  },
  "El Especialista" : {
    "año" : "2011/01",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://imagenes.gatotv.com/categorias/peliculas/posters/el_especialista_the_mechanic.jpg",
    "link" : "https://www.rapidvideo.com/e/FK4I2H610E&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Arthur Bishop (Jason Statham) es un asesino profesional de élite, con un estricto código y un talento único para eliminar limpiamente a sus víctimas. La muerte de su amigo y mentor Harry (Donald Sutherland) le obligará a replantearse sus métodos, sobre todo cuando Steve (Ben Foster), el hijo de Harry, le pida ayuda para saciar su sed de venganza. Bishop empieza a entrenar a Steve y a enseñarle sus letales técnicas, pero las mentiras y los engaños amenazan con convertir esta alianza en el mayor de sus errores. Remake del film protagonizado por Charles Bronson en 1972.",
    "titulo" : "El Especialista"
  },
  "El Especialista: Resurreccion" : {
    "año" : "2016/08",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://4.bp.blogspot.com/-H14oDDKE6Ls/V535oxpZDeI/AAAAAAAAjok/DlYUgPYpDbc65ejbC_bxM1BcaGXFDx5YwCLcB/s640/El_Especialista_Resureccion_Poster_Latino_JPosters.jpg",
    "link" : "https://www.rapidvideo.com/e/FJA620I73L&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Cuando Arthur Bishop (Jason Statham) creía que ya había dejado atrás su pasado criminal, se encuentra de nuevo con él al ser secuestrada la mujer de su vida por uno de sus mayores enemigos. Se ve así obligado a viajar por el mundo para ejecutar tres asesinatos imposibles que deben parecer accidentes.",
    "titulo" : "El Especialista: Resurreccion"
  },
  "El Gran Showman" : {
    "año" : "2017/12",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "https://ih0.redbubble.net/image.499091843.9895/flat,800x800,070,f.jpg",
    "link" : "https://www.rapidvideo.com/e/FQ3R45QUA5&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Estados Unidos, siglo XIX. P.T. Barnum (Hugh Jackman) acaba de perder su trabajo de oficinista porque la empresa para la que trabajaba se ha ido a la bancarrota. Deseoso de ofrecer a su esposa Charity (Michelle Williams) y a sus dos hijas la vida que siempre les había prometido, Barnum se embarca en un proyecto colosal: crear un gran y asombroso espectáculo circense. Para ello, este inventor del show bussines buscará artistas únicos, desde enanos, a mujeres barbudas, equilibristas y toda clase de shows imaginativos. Su lema: para hacer algo nuevo hay que hacer algo poco convencional.",
    "titulo" : "El Gran Show Man"
  },
  "El Hilo Fantasma" : {
    "año" : "2017/02",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "http://allcalidad.com/wp-content/uploads/2018/03/El-hilo-fantasma.jpg",
    "link" : "https://www.rapidvideo.com/e/FPVF5HYEJ0&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "El hilo fantasma Londres, años 50. El famoso modisto Reynolds Woodcock (Daniel Day-Lewis) y su hermana Cyril (Lesley Manville) son el centro de la moda británica con más glamour. Woodcock viste  con su estilo distintivo a la realeza, estrellas de cine y demás damas de la alta sociedad. Las mujeres pasan por su vida sin dejar huella, hasta que aparece una bella y temperamental joven llamada Alma (Vicky Krieps), una camarera que se convertirá en su musa y amante. Sin embargo, la perfectamente estructurada vida de Reynolds se verá alterada por la llegada de la joven, y eso es algo que el modisto no había contemplado.",
    "titulo" : "El Hilo Fantasma"
  },
  "El Hobbit: La batalla de los cinco ejércitos" : {
    "año" : "2014/12/10",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://ugc.kn3.net/i/origin/http://2.bp.blogspot.com/-PVeMUuXPOG4/VKKTABe9xfI/AAAAAAAAM6o/USSU3c_uk1o/s1600/Hobbit_BOTFA_Intl_poster.jpg",
    "link" : "https://www.rapidvideo.com/e/FQV9HD7EQ2&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Después de haber recuperado el reino del Dragón Smaug, la Compañía ha desencadenado, sin querer, una potencia maligna. Un Smaug enfurecido vuela hacia la Ciudad del Lago para acabar con cualquier resto de vida. Obsesionado sobre todo con el reino recuperado, Thorin sacrifica la amistad y el honor para mantenerlo mientras que Bilbo intenta frenéticamente hacerle ver la razón por la que el hobbit toma una decisión desesperada y peligrosa. Pero hay aún mayores peligros por delante. Sin la ayuda aparente del mago Gandalf, su gran enemigo Sauron ha enviado legiones de orcos hacia la Montaña Solitaria en un ataque furtivo. Cuando la oscuridad se cierna sobre ellos, las razas de los Enanos, Elfos y Hombres deben decidir si unirse o ser destruidos. Bilbo se encontrará así en la batalla épica de los Cinco Ejércitos, donde el futuro de la Tierra Media está en juego.",
    "titulo" : "El Hobbit: La batalla de los cinco ejércitos"
  },
  "El Hobbit: La desolación de Smaug" : {
    "año" : "2013/12/11",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://decine21.com/img/upload/obras/el-hobbit-la-desolacion-de-smaug-25163/el-hobbit-la-desolacion-de-smaug-25163-g7.jpg",
    "link" : "https://www.rapidvideo.com/e/FIP1DSON3R&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Tras sobrevivir al inicio de su inesperado viaje, la Compañía sigue hacia el este y se encuentra por el camino con Beorn, el cambiador de piel, y con un enjambre de Arañas gigantes en el peligroso monte Mirkwood. Tras evitar que los Elfos del Bosque los capturen, los Enanos prosiguen su viaje hacia Ciudad del Lago, y finalmente llegan a la Montaña Solitaria, donde tienen que enfrentarse al mayor de los peligros, una criatura más terrorífica que cualquier otra que pondrá a prueba no solo lo profundo de su valentía sino también los límites de su amistad y la sabiduría del viaje: el dragón Smaug.",
    "titulo" : "El Hobbit: La desolación de Smaug"
  },
  "El Hobbit: Un viaje inesperado" : {
    "año" : "2012/11",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://vignette.wikia.nocookie.net/eldragonverde/images/6/63/EL_HOB2.jpg/revision/latest/scale-to-width-down/300?cb=20121231151641&path-prefix=es",
    "link" : "https://www.rapidvideo.com/e/FMTIEEQ3IQ&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Precuela de la trilogía \"El Señor de los Anillos\", obra de J.R.R. Tolkien. En compañía del mago Gandalf y de trece enanos, el hobbit Bilbo Bolsón emprende un viaje a través del país de los elfos y los bosques de los trolls, desde las mazmorras de los orcos hasta la Montaña Solitaria, donde el dragón Smaug esconde el tesoro de los Enanos. Finalmente, en las profundidades de la Tierra, encuentra el Anillo Único, hipnótico objeto que será posteriormente causa de tantas sangrientas batallas en la Tierra Media.",
    "titulo" : "El Hobbit: Un viaje inesperado"
  },
  "El Muñeco de Nieve" : {
    "año" : "2017/10",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "http://allcalidad.com/wp-content/uploads/2018/01/el-muneco-de-nieve.jpg",
    "link" : "https://www.rapidvideo.com/e/FQYIZ0HNBX&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "El muñeco de nieve Harry Hole (Michael Fassbender) es un brillante detective de una brigada de investigación de élite, caracterizado por usar métodos poco ortodoxos. Al investigar la extraña desaparición de una mujer durante la primera nevada del invierno, empieza a sospechar que un asesino en serie vuelve a estar activo. Se trata de un auténtico demente que se hace llamar el asesino del muñeco de nieve, y su objetivo son mujeres cuya conducta desaprueba. Con la ayuda de Katrine Bratt (Rebecca Ferguson), una brillante y perspicaz agente, el policía encajará las piezas del rompecabezas a partir de antiguos casos sin resolver para conectarlos con el último y brutal acontecimiento. Hole tendrá que adelantarse al cruel asesino que volverá a actuar, antes de la próxima nevada.",
    "titulo" : "El Muñeco de Nieve"
  },
  "El Pasajero" : {
    "año" : "2018/01",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://i1.wp.com/www.peliculastoday.com/wp-content/uploads/2018/04/El-pasajero.jpg?fit=710%2C1024&ssl=1",
    "link" : "https://www.rapidvideo.com/v/FPW0N9KQGD&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Durante su trayecto habitual de vuelta a casa en tren, un hombre de negocios felizmente casado comienza a hablar con una misteriosa pasajera. Pronto el hombre se verá envuelto en una conspiración criminal que amenaza con poner en peligro tanto su vida como la de sus seres más cercanos.",
    "titulo" : "El Pasajero"
  },
  "El Planeta de los Simios (R)Evolución" : {
    "año" : "2011/09",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/ae640480437ecf113cb279057fc27060.jpg",
    "link" : "https://www.rapidvideo.com/e/FII4IQEDPA&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Precuela del ya mítico largometraje \"El planeta de los simios\". Will Rodman es un joven científico que está investigando con monos para obtener un tratamiento contra el alzheimer, una enfermedad que afecta a su padre. Uno de esos primates, César, un chimpancé recién nacido al que Will se llevó a casa para protegerlo, experimenta una evolución en su inteligencia verdaderamente sorprendente. En el estudio del simio le ayudará una bella primatóloga llamada Caroline.",
    "titulo" : "El Planeta de los Simios (R)Evolución"
  },
  "El Planeta de los Simios: Confrontación" : {
    "año" : "2014/07",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/442ae59640577126b2e27a70af05d459.jpg",
    "link" : "https://www.rapidvideo.com/e/FI1HOV1CC6&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Una nación en crecimiento de simios evolucionados genéticamente dirigidos por César se ve amenazada por una banda de supervivientes humanos del virus devastador desencadenado una década antes. Consiguen una paz frágil, pero a prueba de corta duración, ya que ambas partes se ponen al borde de una guerra que determinará quién va a surgir como especie dominante de la tierra.",
    "titulo" : "El Planeta de los Simios: Confrontación"
  },
  "El Planeta de los Simios: La Guerra" : {
    "año" : "2017/07",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/ca8a5da780b297fb0bde60e8a17b7d47.jpg",
    "link" : "https://www.rapidvideo.com/e/FKEUGDMHM5&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Es el tercer capítulo de la aclamada y exitosa franquicia, Cesar y sus simios se ven obligados a encararse en un conflicto mortal con un ejército de humanos liderados por un coronel despiadado. Después de que los monos sufren pérdidas inimaginables, Cesar lucha contra sus instintos más siniestros y comienza su propia misión mítica para vengar a los de su especie. Una vez que el viaje los pone en el mismo camino, Cesar y el Coronel se enfrentan en una batalla épica que determinará el destino de ambas especies y el futuro del planeta. También titulado \"La guerra del planeta de los simios\"",
    "titulo" : "El Planeta de los Simios: La Guerra"
  },
  "El Prisionero de la Celda 99" : {
    "año" : "2017/09",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://s4.thcdn.com/productimg/600/600/11578479-9964525302764934.jpg",
    "link" : "https://www.rapidvideo.com/e/FNQ49R5E7J&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Bradley es un exboxeador desesperado que acepta trabajar transportando droga para un antiguo colega. Tras un tiroteo entre la policía y los narcotraficantes, Bradley acaba malherido y en prisión. Allí, sus enemigos le obligarán a cometer acciones violentas que convertirán el lugar en un campo de batalla. Tras probarse en el western, S. Craig Zahler aporta su salvaje visión de la existencia al drama carcelario.",
    "titulo" : "El Prisionero de la Celda 99"
  },
  "El Stand de los Besos" : {
    "año" : "2018/05",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "http://allcalidad.com/wp-content/uploads/2018/05/the-kissing-booth.jpg",
    "link" : "https://www.rapidvideo.com/e/FRF6J77U78&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Elle nunca imaginó que el primer beso daría para tanto. Pero, a pesar de que ha conseguido salir con el chico más guapo del instituto, está a punto de perder a su mejor amigo de toda la vida.",
    "titulo" : "El Stand de los Besos"
  },
  "El Titán" : {
    "año" : "2018/02",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://i1.wp.com/www.peliculastoday.com/wp-content/uploads/2018/04/The-Titan.jpg?fit=663%2C1000&ssl=1",
    "link" : "https://www.rapidvideo.com/v/FPW150NYHF&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "En un futuro cercano, una familia de militares decide tomar parte en un revolucionario experimento de evolución genética y exploración espacial que trata de acelerar el desarrollo genético del ser humano con un objetivo: poder relocalizar a la humanidad en otro planeta y así evitar su extinción.",
    "titulo" : "El Titán"
  },
  "El Transportador" : {
    "año" : "2002/10/02",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://www.pelisplanet.com/wp-content/uploads/2016/08/el-transportador-200x300.jpg",
    "link" : "https://www.rapidvideo.com/embed/FP6H8ETHW2&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "\"El ex operador de Fuerzas Especiales Frank Martin vive lo que parece ser una vida tranquila a orillas del Mediterráneo francés, donde presta sus servicios como un “transportador”, un mercenario que traslada bienes —humanos o de cualquier tipo— de un lugar a otro. Siempre sin preguntas de por medio. Frank, que en su Mercedes equipado lleva a cabo misiones secretas y a veces peligrosas, se apega a un estricto juego de 3 reglas que nunca rompe. Regla numero uno: Nunca modifiques el trato. Dos: Omitir nombres, Frank no quiere saber para quién trabaja o qué es lo que transporta. Tres: Nunca ver qué hay dentro del paquete. La carga más reciente de Frank aparenta ser igual a los incontables paquetes que ha entregado en el pasado. Ha sido contratado por un norteamericano conocido solamente como “Wall Street” para que lleve a cabo una entrega. Pero cuando Frank se detiene en el trayecto, se percata que su “paquete” se mueve…",
    "titulo" : "El Transportador"
  },
  "El Transportador 2" : {
    "año" : "2005/08/03",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://www.pelisplanet.com/wp-content/uploads/2016/08/el-transportador-2-208x300.jpg",
    "link" : "https://www.rapidvideo.com/embed/FP6HZ6O4LD&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "\"Frank Martin es un ex integrante de las Fuerzas Especiales que se emplea como un transportador mercenario, cuya especialidad es trasladar tanto objetos como seres humanos. Es de lo mejor que hay en el negocio, hace las entregas sin hacer preguntas. Reubicado en Miami, ahora es el chofer de la acaudalada familia Billings. Hay muy pocas cosas que lo pueden sorprender, pero de manera inesperada Frank ha creado lazos afectivos con Jack, de seis años de edad, a quien conduce a la escuela y a su hogar todos los días. Pero cuando Jack es raptado, Frank debe utilizar sus habilidades de combate para liberar al muchacho y frustrar el plan maestro de los secuestradores: soltar un virus que matará a cualquier persona que entre en contacto con él.",
    "titulo" : "El Transportador 2"
  },
  "El Transportador 3 " : {
    "año" : "2009/02/20",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://www.pelisplanet.com/wp-content/uploads/2016/08/el-transportador-3-212x300.jpg",
    "link" : "https://www.rapidvideo.com/e/FPGSFJ3VTF&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Frank Martin – Jason Statham es un indiscutible especialista en entregas de alto riesgo. En esta ocasion se vera obligado bajo amenazas a trasladar dos voluminosas bolsas y a una joven ucraniana Valentina – Natalya Rudakova desde Marsella hasta Odessa. Que hay en las bolsas quien es la chica que hay detras de esta entrega Frank no conoce las respuestas pero lo que realmente no sabe es la trampa que le ha tendido el adversario mas despiadado y peligroso que nunca se ha encontrado.",
    "titulo" : "El Transportador 3"
  },
  "El Transportador 4: Recargado" : {
    "año" : "2015/10/09",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://www.pelisplanet.com/wp-content/uploads/2015/12/transportador-4-203x300.jpg",
    "link" : "https://www.rapidvideo.com/embed/FNKMN0IJOD&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Frank Martin (Ed Skrein) es conocido como «Transporter», el mejor conductor y mercenario que se puede comprar con dinero. Frank se rige por tres simples reglas: sin nombres, sin preguntas y sin renegociaciones, y transporta cualquier cosa por el precio adecuado. Hasta que conoce a la misteriosa mujer fatal llamada Anna (Loan Chabanol), que lidera un grupo de mortíferos asaltantes y que no se detendrá ante nada con tal de acabar con una despiadada banda rusa de traficantes humanos. Anna sabe que Frank es el mejor en su trabajo y, para asegurarse su colaboración, mantiene rehén a su padre (Ray Stevenson). Ahora, padre e hijo se verán obligados a trabajar con Anna para llevar a esta peligrosa banda ante la justicia.",
    "titulo" : "El Transportador 4: Recargado"
  },
  "El gran huracan categoria 5" : {
    "año" : "2018/02",
    "calidad" : "CAM",
    "categoria" : "Accion",
    "img" : "https://static.cinepolis.com/resources/mx/movies/posters/414x603/26797-287733-20180222045601.jpg",
    "link" : "https://www.rapidvideo.com/e/FQ5HHGXFXE&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Un grupo de hackers se infiltran en una instalación de una pequeña ciudad costera para robar 102 millones de dólares justo cuando un tornado de categoría 5, la tormenta del siglo, está a punto de estallar. Las únicas dos personas que quedan en el pueblo son un meteorólogo y una agente del tesoro, que deberán sobrevivir a la tormenta y evitar que los ladrones salgan impones del robo del siglo.",
    "titulo" : "El Gran Huracan Categoria 5"
  },
  "El señor de los anillos: El retorno del Rey" : {
    "año" : "2003/12/01",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://vignette.wikia.nocookie.net/eldragonverde/images/8/87/El_retorno_del_rey.jpg/revision/latest?cb=20131205160914&path-prefix=es",
    "link" : "https://www.rapidvideo.com/e/FJ5IETKES8&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Las fuerzas de Saruman han sido destruidas, y su fortaleza sitiada. Ha llegado el momento de que se decida el destino de la Tierra Media, y por primera vez en mucho tiempo, parece que hay una pequeña esperanza. La atención del señor oscuro Sauron se centra ahora en Gondor, el último reducto de los hombres, y del cual Aragorn tendrá que reclamar el trono para ocupar su puesto de Rey. Pero las fuerzas de Sauron ya se preparan para lanzar el último y definitivo ataque contra el reino de Gondor, la batalla que decidirá el destino de todos. Mientras tanto, Frodo y Sam continuan su camino hacia Mordor, a la espera de que Sauron no repare en que dos pequeños Hobbits se acercan cada día más al final de su camino, el Monte del Destino.",
    "titulo" : "El señor de los anillos: El retorno del Rey"
  },
  "El señor de los anillos: La comunidad del anillo" : {
    "año" : "2001/12/18",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://vignette.wikia.nocookie.net/eldragonverde/images/8/8b/Comunidadanillocine-600a.jpg/revision/latest?cb=20130105233349&path-prefix=es",
    "link" : "https://www.rapidvideo.com/e/FJ6ARI2GSJ&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "En la Tierra Media, el Señor Oscuro Saurón creó los Grandes Anillos de Poder, forjados por los herreros Elfos. Tres para los reyes Elfos, siete para los Señores Enanos, y nueve para los Hombres Mortales. Secretamente, Saurón también forjó un anillo maestro, el Anillo Único, que contiene en sí el poder para esclavizar a toda la Tierra Media. Con la ayuda de un grupo de amigos y de valientes aliados, Frodo emprende un peligroso viaje con la misión de destruir el Anillo Único. Pero el Señor Oscuro Sauron, quien creara el Anillo, envía a sus servidores para perseguir al grupo. Si Sauron lograra recuperar el Anillo, sería el final de la Tierra Media.",
    "titulo" : "El señor de los anillos: La comunidad del anillo"
  },
  "El señor de los anillos: Las dos torres" : {
    "año" : "2002/12/18",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://vignette.wikia.nocookie.net/eldragonverde/images/2/2f/Las_dos_torres.jpg/revision/latest?cb=20131205160743&path-prefix=es",
    "link" : "https://www.rapidvideo.com/e/FJ5HGXZO1T&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "La Compañía del Anillo se ha disuelto. El portador del anillo Frodo y su fiel amigo Sam se dirigen hacia Mordor para destruir el Anillo Único y acabar con el poder de Sauron. Mientras, y tras la dura batalla contra los orcos donde cayó Boromir, el hombre Aragorn, el elfo Legolas y el enano Gimli intentan rescatar a los medianos Merry y Pipin, secuestrados por los ogros de Mordor. Por su parte, Saurón y el traidor Sarumán continúan con sus planes en Mordor, en espera de la guerra contra las razas libres de la Tierra Media.",
    "titulo" : "El señor de los anillos: Las dos torres"
  },
  "Election: La noche de las bestias" : {
    "año" : "2016/06/29",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "http://www.fotogramas.es/var/ezflow_site/storage/images/peliculas/election-la-noche-de-las-bestias/102983788-2-esl-ES/Election-la-noche-de-las-bestias.jpg",
    "link" : "https://www.rapidvideo.com/e/FQ04AJQQ45&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Han pasado dos años desde que el ex-sargento de policía Leo Barnes (Frank Grillo) decidió no vengarse del hombre que mató a su hijo. Ahora Barnes dirige al equipo de seguridad que se encarga de proteger a la senadora Charlie Roan (Elizabeth Mitchell), una candidata a la Presidencia que reivindica la supresión de La Purga anual, que consiste en permitir, una noche al año, cualquier actividad criminal, incluído el asesinato. Roan considera que esta práctica perjudica sobre todo a los necesitados y a los pobres.",
    "titulo" : "Election: La noche de las bestias"
  },
  "En Defensa Propia" : {
    "año" : "2017/07",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://allcalidad.com/wp-content/uploads/2018/02/En-defensa-propia.jpg",
    "link" : "https://www.rapidvideo.com/e/FOVC3PA35T",
    "servidor" : "rapidvideo",
    "sinopsis" : "En defensa propia Un agente de policía (Bruce Willis) intenta resolver en tiempo límite un secuestro en el que un ladrón de bancos tiene a un joven como rehén. El atracador pretende recuperar la llave de un armario que contiene un importante botín y no soltará al chico hasta que consiga lo que quiere. Su padre Will (Hayden Christensen) hará todo lo necesario para recuperar al pequeño, incluso actuar en contra de la ley.",
    "titulo" : "En defensa propia"
  },
  "En Lugar del" : {
    "año" : "2017/06",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "https://i1.wp.com/www.peliculastoday.com/wp-content/uploads/2018/01/Amor-en-Linea.jpg?fit=683%2C1024&ssl=1",
    "link" : "https://www.rapidvideo.com/e/FNKJACGU5G&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Pierre, viudo y jubilado, no sale de su casa desde hace dos años. Poco a poco descubre las alegrías de Internet gracias a Alex, un joven contratado por su hija para enseñarle los conceptos básicos de los ordenadores. En un sitio de citas, una hermosa joven, Flora63, le ofrece una primera cita.",
    "titulo" : "En Lugar del Sr. Stein"
  },
  "En el Corazón del Mar" : {
    "año" : "2015/11",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://1.bp.blogspot.com/-qvbWiiPqYPM/VKcDQUDNhRI/AAAAAAAACHo/ycLC-g1pRV0/s1600/En_El_Corazón_Del_Mar_Teaser_Poster_Oficial_Latino_JPosters.jpg",
    "link" : "https://www.rapidvideo.com/e/FN85LQPS0C&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "En el invierno de 1820, el ballenero de Nueva Inglaterra Essex fue agredido por algo a lo que nadie podía dar crédito: una ballena de tamaño y voluntad descomunal, con un sentido de la venganza casi humano. Este hecho real que supuso un desastre marítimo fue la inspiración para Moby-Dick de Melville. Pero la novela solo contó la mitad de la historia. “En el corazón del mar” revela las horribles consecuencias del encuentro, cuando los supervivientes de la tripulación fueron forzados hasta el límite y se vieron obligados a hacer lo impensable para mantenerse vivos. Enfrentándose a las tormentas, el hambre, el pánico, y la desesperación, los hombres llegan a dudar hasta de sus creencias más profundas, desde el valor de sus vidas a la moralidad de su oficio, mientras el capitán intenta orientarse en el mar abierto y su primer oficial sigue empeñado en conquistar a la gran ballena.",
    "titulo" : "En el Corazón del Mar"
  },
  "Escuadrón Suicida: Deuda Infernal" : {
    "año" : "2018/03",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://i2.wp.com/www.peliculastoday.com/wp-content/uploads/2018/04/Escuadron-Suicida-Deuda-Infernal.jpg?fit=719%2C1024&ssl=1",
    "link" : "https://www.rapidvideo.com/v/FPW0PRZMIC&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Task Force X ocupará el lugar central para el próximo lanzamiento en la primavera de 2018 con Suicide Squad: Hell to Pay. Los detalles sobre esto son escasos, pero será una historia original en lugar de una adaptación de cualquier historia de cómic existente.",
    "titulo" : "Escuadrón Suicida: Deuda Infernal"
  },
  "Esto Recién Comienza" : {
    "año" : "2017/12",
    "calidad" : "HD",
    "categoria" : "Accion/Comedia",
    "img" : "http://allcalidad.com/wp-content/uploads/2018/04/just-getting-started.jpg",
    "link" : "https://www.rapidvideo.com/e/FQ2CI5UJ9Z&q=720p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Esto recién comienza Un ex agente del FBI y un ex abogado de la mafia que se encuentra en el programa de protección de testigos se ven obligados a colaborar. Los dos tendrán que esforzarse para dejar de lado sus problemas y rivalidades, y así lograr juntos desarticular un importante golpe mafioso.",
    "titulo" : "Esto Recién Comienza"
  },
  "Feliz Aniversario" : {
    "año" : "2018/03",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "http://allcalidad.com/wp-content/uploads/2018/04/happy-anniversary.jpg",
    "link" : "https://www.rapidvideo.com/e/FQ5TO4P1A2&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Feliz aniversario Tras tres años juntos, el día de su aniversario, una pareja se plantea si deben seguir juntos o no. Un solo día en el que cambiará el destino de sus vidas para siempre. Un solo día en el que recordaran todo aquello que han vivido y les ha conducido a esta situación. Una comedia escrita y dirigida por Jared Stern (Rompe Ralph). Podremos ver a sus protagonistas Noel Wells (Mr. Roosevelt) y Ben Schwartz (Star Wars: Episodio VII-El despertar de la fuerza) interpretando a la pareja.",
    "titulo" : "Feliz Aniversario"
  },
  "Feliz Día de tu Muerte" : {
    "año" : "2017/10",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/a44a7c8fd4e2aeb785326bafc98631b7.jpg",
    "link" : "https://www.rapidvideo.com/e/FQ03VWEBJX&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "La película cuenta la historia de la joven Tree en el peor día de su vida. Una mañana de resaca despierta en la residencia de un compañero de Universidad, corriendo se viste y se dirige a su dormitorio para hablar con sus compañeras y comenzar a celebrar su cumpleaños. En la fiesta de esa misma noche es atacada y aparentemente asesinada, pero ese momento es interrumpido por el comienzo de un nuevo día.",
    "titulo" : "Feliz Día de tu Muerte"
  },
  "Ferdinand" : {
    "año" : "2017/12",
    "calidad" : "HD",
    "categoria" : "Infantil",
    "img" : "https://www.ecartelera.com/carteles/12600/12683/013_p.jpg",
    "link" : "https://www.rapidvideo.com/e/FPC2KYYX9X&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Cuenta la historia de un toro con un corazón aún más grande que él. Después de que le confundan con una peligrosa bestia, es capturado y apartado de su hogar. Decidido a volver con su familia, se une a un equipo de inadaptados con los que vivirá una gran aventura. Ferdinand nos enseña que no puedes juzgar a un toro por sus cuernos.",
    "titulo" : "Ferdinand"
  },
  "Focus: Maestros de la estafa" : {
    "año" : "2015/02/25",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "http://es.web.img3.acsta.net/r_1280_720/pictures/15/01/21/10/16/138096.jpg",
    "link" : "https://www.rapidvideo.com/e/FMX1I43V8Z&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Will Smith interpreta a Nicky, un estafador profesional que decide ayudar a una joven novata del mundo de la criminalidad llamada Jess. Ella busca acercarse más en la relación con Nicky y tras pasar un tiempo juntos comienzan a enamorarse y empiezan una relación amorosa. Él se dedica a enseñarle tretas para que aprenda mejor a estafar y robar. Pero cuando menos se lo espera, Nicky rompe la relación de repente. El motivo es que una mujer perteneciente a su pasado ha vuelto a su vida, reaparece en Buenos Aires en un circuito de carreras en el que hay apuestas muy elevadas pero ella intentará echar los planes de Nicky por tierra y aprovechar su lado de estafador.",
    "titulo" : "Focus: Maestros de la estafa"
  },
  "Fragmentado" : {
    "año" : "2017/01",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/1112cefa0a83ba4a6ba92df15916f36a.jpg",
    "link" : "https://www.rapidvideo.com/e/FRQGP1D62Y&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Tenemos con nosotros un gran film el cual nos entrega una historia muy peculiar e interesante para todos nosotros en la que podemos encontrar a Kevin (James McAvoy) un joven el cual presenta una situación muy peculiar y poco vista pero existente, lleva en el veinticuatro personalidades las cuales lo llevan por muchas situaciones inesperadas. Ademas nos muestra un lado de la psicología humana que es de interés mundial y que despierta en nosotros una intriga y curiosidad las cuales absolveremos con \"Fragmentado\". Debemos destacar ademas el gran trabajo de nuestro actor principal James McAvoy el cual ah sido reconocido últimamente con la película X-Men Apocalipsis, brindándonos una actuación y un trabajo de primer nivel, con este precedente podemos dar por echo que tanto la realización como el meollo de la película nos atraparan en todo momento con los altibajos que nos presente. Por otra parte podemos disfrutar de la gran cantidad de emisiones que nos brinda el personaje principal Kevin (James MvAvoy) debido a sus veinticuatro personalidades nos muestra en cada momento un escape a otra realidad que nos cautiva y llena de intriga, esto acompañado de la gran trama hacen un paquete completo en el cual todos disfrutaremos sin lugar a duda este hermoso film cinematográfico. No obstante tenemos una gran cantidad de situaciones que nos crean mas encrucijadas, como: A pesar de que Kevin le ha demostrado a su psiquiatra de confianza, la Dra. Fletcher (Betty Buckley), que posee 23 personalidades diferentes, aún queda una por emerger, decidida a dominar a todas las demás. Obligado a raptar a tres chicas adolescentes encabezadas por la decidida y observadora Casey (Anya Taylor-Joy), Kevin lucha por sobrevivir contra todas sus personalidades y la gente que le rodea. Les recomiendo ver de principio a fin \"Fragmentado\", nos brindara una gran dosis de drama, suspenso y ademas promete ser una de los films con mas desarrollo de la psicología humana de los últimos tiempos, sin duda imperdible.",
    "titulo" : "Fragmentado"
  },
  "Fullmetal Alchemist" : {
    "año" : "2017/12",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://cdn.hobbyconsolas.com/sites/navi.axelspringer.es/public/media/image/2018/02/fullmetal-alchemist.jpg",
    "link" : "https://www.rapidvideo.com/e/FOMMQHLH6I&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Dos hermanos alquimistas se embarcan en un viaje para encontrar la Piedra Filosofal después de que su intento por revivir a su madre fallecida salga mal. Adaptación del manga de Hiromu Arakawa, ya trasladado al anime en dos ocasiones.",
    "titulo" : "Fullmetal Alchemist"
  },
  "Geo-Tormenta" : {
    "año" : "2017/10",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://allcalidad.com/wp-content/uploads/2018/01/geo-tormenta.jpg",
    "link" : "https://www.rapidvideo.com/e/FO2K1IPDUN&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Geo-Tormenta Cuando la red de satélites diseñada para controlar el clima global empieza a fallar, un obstinado ingeniero de comunicaciones se verá obligado a trabajar junto a su hermano, con el que lleva años sin tener contacto, para tratar de salvar el mundo de una tormenta de proporciones épicas. Mientras tratan de lidiar con el problema espacial, en la Tierra, se está tramando una conspiración para acabar con la vida del presidente de los Estados Unidos.",
    "titulo" : "Geo-Tormenta"
  },
  "Ghost in the Shell: El alma de la máquina" : {
    "año" : "2017/03",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://es.web.img2.acsta.net/r_1920_1080/pictures/17/03/02/11/16/359175.jpg",
    "link" : "https://www.rapidvideo.com/e/FLI7W221K6&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "En un japón futurista la joven Motoko Kusanagi (Scarlett Johansson), también conocida como 'the Major' Mira Killian, es la líder de grupo operativo de élite, Sección 9, cuyo objetivo es luchar contra el ciberterrorismo y los crímenes tecnológicos. Al mando de esta unidad de operaciones encubiertas está Aramaki (Takeshi Kitano), y destaca Batou (Pilou Asbæk), un exmilitar considerado como uno de los agentes más salvajes del grupo. Pero, después de un peligrosa misión, el cuerpo de Kusanagi queda dañado, siendo sometida a una operación quirúrgica para trasplantar su cerebro en un cuerpo robótico. Este nuevo cuerpo artificial le permitirá ser capaz de realizar hazañas sobrehumanas especialmente requeridas para su trabajo... Basada en la aclamada saga homónima de ciencia ficción.",
    "titulo" : "Ghost in the Shell: El alma de la máquina"
  },
  "Gorrión Rojo" : {
    "año" : "2018/02",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://fanart.tv/fanart/movies/401981/movieposter/red-sparrow-5a8a76a670e28.jpg",
    "link" : "https://www.rapidvideo.com/e/FQH397UKKA&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Dominika Egorova es reclutada contra su voluntad para ser un “gorrión”, una seductora adiestrada del servicio de seguridad ruso. Dominika aprende a utilizar su cuerpo como arma, pero lucha por conservar su sentido de la identidad durante el deshumanizador proceso de entrenamiento. Hallando su fuerza en un sistema injusto, se revela como uno de los activos más sólidos del programa. Su primer objetivo es Nate Nash, un funcionario de la CIA que dirige la infiltración más confidencial de la agencia en la inteligencia rusa. Los dos jóvenes agentes caen en una espiral de atracción y engaño que amenaza sus carreras, sus lealtades y la seguridad de sus respectivos países.",
    "titulo" : "Gorrión Rojo"
  },
  "Gringo: Se busca vivo o muerto" : {
    "año" : "2018/05/20",
    "calidad" : "HD",
    "categoria" : "Comedia/Accion",
    "img" : "http://es.web.img2.acsta.net/pictures/18/01/12/12/50/1338586.jpg",
    "link" : "https://www.rapidvideo.com/e/FRMZ9VZ52P&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Un empresario estadounidense con una participación en una compañía farmacéutica que está a punto de salir a la luz pública descubre que su vida se ve afectada por un incidente en México.",
    "titulo" : "Gringo: Se busca vivo o muerto"
  },
  "Guardianes" : {
    "año" : "2017/02",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://allcalidad.com/wp-content/uploads/2017/12/guardianes.jpg",
    "link" : "https://www.rapidvideo.com/e/FMEQJNLAOI&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Guardianes Una organización de nombre Patriot crea un escuadrón de seres superpoderosos durante la guerra fría. Estos héroes, procedentes de diversas partes de la república soviética, se ven obligados a esconderse durante años, hasta que un buen día se ven obligados a volver a la acción.",
    "titulo" : "Guardianes"
  },
  "Guardianes de la Galaxia" : {
    "año" : "2014/07",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://www.fotogramas.es/var/ezflow_site/storage/images/peliculas/guardianes-de-la-galaxia/7317312-9-esl-ES/Guardianes-de-la-Galaxia_cartel.jpg",
    "link" : "https://www.rapidvideo.com/e/FOJKBXAU3M&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "El temerario aventurero Peter Quill es objeto de un implacable cazarrecompensas después de robar una misteriosa esfera codiciada por Ronan, un poderoso villano cuya ambición amenaza todo el universo. Para poder escapar del incansable Ronan, Quill se ve obligado a pactar una complicada tregua con un cuarteto de disparatados inadaptados: Rocket, un mapache armado con un rifle, Groot, un humanoide con forma de árbol, la letal y enigmática Gamora y el vengativo Drax the Destroyer. Pero cuando Quill descubre el verdadero poder de la esfera, deberá hacer todo lo posible para derrotar a sus extravagantes rivales en un intento desesperado de salvar el destino de la galaxia.",
    "titulo" : "Guardianes de la Galaxia"
  },
  "Guardianes de la Galaxia Vol2" : {
    "año" : "2017/04",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/a72c6febcd898814f6266169a68784e6.jpg",
    "link" : "https://www.rapidvideo.com/e/FNM78BBQ5U&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Volumen 2. Siguen las aventuras del equipo en su recorrido por los limites del cosmos. Los Guardianes tendran que pelear para conservar junta a su familia nueva, entre tanto procuran dar solucion al misterio de los autenticos orígenes de Peter Quill. Antiguos enemigos se transformaran en nuevos aliados, y amados personajes de los cómics clásicos iran en ayuda de nuestros héroes conforme el universo cinematográfico de Marvel continúa prolongandose.",
    "titulo" : "Guardianes de la Galaxia Vol. 2"
  },
  "Guerra de Papás" : {
    "año" : "2015/12",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "http://allcalidad.com/wp-content/uploads/2016/05/MV5BMTQ0OTE1MTk4N15BMl5BanBnXkFtZTgwMDM5OTk5NjE@._V1_SY1000_CR006401000_AL_.jpg",
    "link" : "https://www.rapidvideo.com/e/FLO3DV0CUY",
    "servidor" : "rapidvideo",
    "sinopsis" : "Brad Taggart (Will Ferrell) es un tranquilo ejecutivo de una emisora de radio. Su plácida vida transcurre en su chalet adosado y gira en torno a su familia, formada por su mujer Sarah (Linda Cardellini) y los dos hijos de esta. Brad se esfuerza constantemente por convertirse en el mejor padrastro de los dos hijos de su esposa. Pero todo se complica cuando reaparece en sus vidas un nuevo integrante en la familia: Dusty (Mark Wahlberg), el ex-marido de Sarah y el verdadero padre biológico de los niños. Despreocupado y gorrón, además de muy cachas y aficionado a quitarse la camiseta en cuanto puede, Dusty quiere reconquistar a su ex esposa y sus hijos. Es entonces cuando Brad se ve obligado a competir por el afecto de los pequeños y de su mujer, mientras trata de encontrar su sitio en su nueva familia. Ante la más pequeña circunstancia ocurrirá que se desencadena una verdadera y tronchante lucha de poder entre ambos progenitores, en busca de demostrar quién de los dos consigue el mayor afecto de los hijos y de la esposa.",
    "titulo" : "Guerra de Papás"
  },
  "Guerra de Papás 2" : {
    "año" : "2017/11",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/ed89567fe41a2ad0a0c8bddf1a7a4102.jpg",
    "link" : "https://www.rapidvideo.com/e/FO9T4P70QZ&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Brad y Dusty se las han apañado para lograr lo que nadie ha logrado: compartir amistad y paternidad (uno como padre natural, el otro como padre adoptivo). Todo va a pedir de boca hasta que entran en escena el autoritario y machista padre de Dusty, Kurt, y el sensiblero y emotivo padre de Brad, Don… ¡justo a tiempo para las Navidades! Horrorizado ante el estilo progresista de educación empleado por Brad y Dusty, Kurt se propone romper la relación entre los dos. A medida que aparecen las primeras grietas en su amistad… ¿podrán los chicos demostrar a Kurt que su estilo moderno de educación funciona y pasar la mejor Navidad en familia de la historia?",
    "titulo" : "Guerra de Papás 2"
  },
  "Han Solo: Una historia de Star Wars" : {
    "año" : "2018/05/25",
    "calidad" : "CAM",
    "categoria" : "Accion",
    "img" : "https://www.agendaburgos.com/media/27180/han-solo-una-historia-de-star-wars_ux9x.jpg",
    "link" : "https://www.rapidvideo.com/e/FRO7K8Y3JM&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Una nueva aventura del sinvergüenza más conocido de la galaxia, a bordo del Halcón Milenario y en un viaje a una galaxia muy lejana. A través de una serie de aventuras en un submundo criminal oscuro y peligroso, Han Solo se hace amigo de su futuro copiloto Chewbacca y conoce al conocido jugador Lando Calrissian, en un viaje que marcará el camino de uno de los héroes más improbables de la saga de Star Wars.",
    "titulo" : "Han Solo: Una historia de Star Wars "
  },
  "Harry Potter y el Cáliz de Fuego" : {
    "año" : "2005/11",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://imgc.allpostersimages.com/img/print/posters/harry-potter-y-el-caliz-de-fuego_a-G-8032039-0.jpg",
    "link" : "https://www.rapidvideo.com/e/FP5LN6IQVQ&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "En el cuarto año en Hogwarts, Harry se enfrenta al mayor de los desafíos y peligros de la saga. Cuando es elegido bajo misteriosas circunstancias como el competidor que representará a Hogwarts en el Torneo Triwizard, Harry deberá competir contra los mejores jóvenes magos de toda Europa. Pero mientras se prepara, aparecen pruebas que manifiestan que Lord Voldemort ha regresado. Antes de darse cuenta, Harry no solo estará luchando por el campeonato sino también por su vida",
    "titulo" : "Harry Potter y el cáliz de fuego"
  },
  "Harry Potter y el Misterio del Príncipe" : {
    "año" : "2009/07",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://images.justwatch.com/poster/8730340/s592/harry-potter-y-el-misterio-del-principe",
    "link" : "https://www.rapidvideo.com/e/FP7MFOAJTK&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "En medio de los desastres que azotan a Inglaterra, Harry y sus compañeros vuelven a Hogwarts para cursar su sexto año de estudios; y aunque las medidas de seguridad han convertido al colegio en una fortaleza, algunos estudiantes son víctimas de ataques inexplicables. Harry sospecha que Draco Malfoy es el responsable de los mismos y decide averiguar la razón. Mientras tanto, Albus Dumbledore y el protagonista exploran el pasado de Lord Voldemort mediante recuerdos que el director ha recolectado. Con esto, Dumbledore planea preparar al muchacho para el día de la batalla final.",
    "titulo" : "Harry Potter y el Misterio del Príncipe"
  },
  "Harry Potter y el Prisionero de Azkaban" : {
    "año" : "2004/06",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://allcalidad.com/wp-content/uploads/2016/05/1-279.jpg",
    "link" : "https://www.rapidvideo.com/e/FP2G9RQ1MP&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Harry Potter y el prisionero de Azkaban La tercera entrega de la saga Harry Potter nos cuenta el transcurso del tercer año del protagonista en el colegio Hogwarts. Al inicio de este, Potter descubre algunas novedades; por ejemplo, que Sirius Black, uno de los asesinos de Lord Voldemort, se ha escapado de Azkaban y que todos se hallan preocupados por si este llegara a acabar con el joven Harry. A pesar de que en el colegio se toman fuertes medidas de seguridad para evitar la tragedia y se colocan dementores (criaturas que ejercen de carceleros en la prisión de Azkaban) alrededor de todo el edificio, el mago terminará entablando una relación con el prófugo.",
    "titulo" : "Harry Potter y el Prisionero de Azkaban"
  },
  "Harry Potter y la Cámara Secreta" : {
    "año" : "2002/11",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://www.elmulticine.com/imagenes/carteles/Camara-secreta-b.jpg",
    "link" : "https://www.rapidvideo.com/e/FP5OHXDCYJ&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Harry regresa a su segundo año a Hogwarts, pero descubre que cosas malas ocurren debido a que un sitio llamado la Cámara de los Secretos ha sido abierto por el heredero de Slytherin y hará que los hijos de muggles, los impuros, aparezcan petrificados misteriosamente por un animal monstruoso.",
    "titulo" : "Harry Potter y la Cámara Secreta"
  },
  "Harry Potter y la Orden del Fénix" : {
    "año" : "2007/06",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://es.web.img3.acsta.net/r_1920_1080/medias/nmedia/18/71/59/76/20051490.jpg",
    "link" : "https://www.rapidvideo.com/e/FP2HNWT0BA&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Harry Potter regresa por quinto año a Hogwarts aún sacudido por la tragedia ocurrida en el Torneo de los Tres Magos. Debido a que el Ministro de la Magia niega el regreso de Lord Voldemort, Harry se convierte en el centro de atención de la comunidad mágica. Mientras lucha con sus problemas en el colegio, incluyendo a la nueva profesora Dolores Umbridge, intentará aprender más sobre la misteriosa Orden del Fénix.",
    "titulo" : "Harry Potter y la Orden del Fénix"
  },
  "Harry Potter y la Piedra Filosofal" : {
    "año" : "2001/11",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://es.web.img2.acsta.net/r_1920_1080/pictures/14/04/30/11/55/592219.jpg",
    "link" : "https://www.rapidvideo.com/e/FPDWDE100Q&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Harry Potter es un huérfano que vive con sus desagradables tíos, los Dursley, y su repelente primo Dudley. Se acerca su undécimo cumpleaños y tiene pocas esperanzas de recibir algún regalo, ya que nunca nadie se acuerda de él. Sin embargo, pocos días antes de su cumpleaños, una serie de misteriosas cartas dirigidas a él y escritas con una estridente tinta verde rompen la monotonía de su vida: Harry es un mago y sus padres también lo eran.",
    "titulo" : "Harry Potter y la Piedra Filosofal"
  },
  "Harry Potter y las Reliquias de la Muerte - Parte I" : {
    "año" : "2010/10",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://vignette.wikia.nocookie.net/es.harrypotter/images/7/7e/Harry-Potter-y-las-Reliquias-de-la-Muerte-Parte-1-poster.jpg/revision/latest?cb=20110705183556",
    "link" : "https://www.rapidvideo.com/e/FPF0U7JHIC&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Primera parte de la adaptación al cine del último libro de la saga Harry Potter, \"Harry Potter y las Reliquias de la Muerte\". La historia continúa desde el punto en el que terminó \"El príncipe mestizo\": Una tarea casi imposible cae sobre los hombros de Harry: deberá encontrar y destruir los horrocruxes restantes para dar fin al reinado de Lord Voldemort. En el episodio final de la saga, el hechicero de 17 años parte junto con sus amigos Hermione Granger y Ron Weasley en un peligroso viaje por Inglaterra para encontrar los objetos que contienen los fragmentos del alma del Señor Tenebroso, los cuales garantizan su longevidad. Pero el camino no será fácil pues el lado oscuro adquiere más poder con cada minuto que pasa y las lealtades serán puestas a prueba. Harry deberá usar todos los conocimientos que gracias a Dumbledore ha adquirido sobre su enemigo para poder encontrar la forma de sobrevivir a esta última aventura",
    "titulo" : "Harry Potter y las Reliquias de la Muerte - Parte I"
  },
  "Harry Potter y las Reliquias de la Muerte - Parte II" : {
    "año" : "2011/07",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://image.tmdb.org/t/p/original/qy3HnyXPSlHf1ra00uE5niABGb8.jpg",
    "link" : "https://www.rapidvideo.com/e/FRBA3Q5VQB&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "La segunda parte de la batalla final entre las fuerzas del bien y el mal. El juego nunca ha sido tan peligroso y nadie está a salvo. Se acerca el momento de la confrontación final entre Harry Potter y Lord Voldemort. Todo termina aquí…",
    "titulo" : "Harry Potter y las Reliquias de la Muerte - Parte II"
  },
  "Hasta que el Cuerpo Aguante" : {
    "año" : "2017/06",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/e959bf14dd10f51cdb5b247ef34a3be0.jpg",
    "link" : "https://www.rapidvideo.com/e/FJ23AZ2DVO&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Cinco amigas de secundaria se reencuentran 10 años después para vivir una salvaje despedida de soltera en Miami. Entre trago y trago, la noche tiene un giro inesperado cuando accidentalmente matan al stripper. En medio de la locura, y mientras tratan de decidir qué hacer, la historia toma unos giros que termina por acercar a las protagonistas cuando más lo necesitan.",
    "titulo" : "Hasta que el Cuerpo Aguante"
  },
  "Hermanastras" : {
    "año" : "2018/01",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "https://i2.wp.com/www.peliculastoday.com/wp-content/uploads/2018/01/Step-Sisters.jpg?fit=683%2C1024&ssl=1",
    "link" : "https://www.rapidvideo.com/v/FNMWYSBCXB&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Jamilah tiene toda su vida resuelta. Ella es la presidenta de su hermandad de mujeres, capitán de su equipo de step dance, es enlace estudiantil con el decano de la universidad, y su próximo paso es la Escuela de Derecho de Harvard. Ella lo tiene todo, ¿verdad? Pero cuando las chicas blancas de fiesta dura de Sigma Beta Beta avergüenzan a la escuela, se ordena a Jamilah que vaya al rescate. Su misión es no solo enseñar a las niñas rítmicamente desafiadas cómo bailar, sino también ganar el Steptacular, el más competitivo de los concursos de baile. Con las reputaciones y los estatutos de SBB en juego, y el sueño de Jamilah de asistir a Harvard en peligro, estos marginados y su profesor improbable tropiezan con un hilarante traspié tras otro. Las culturas chocan, el romance florece y la hermandad prevalece cuando todos salen de sus zonas de confort.",
    "titulo" : "Hermanastras"
  },
  "Hombre al Agua" : {
    "año" : "2018/05",
    "calidad" : "CAM",
    "categoria" : "Comedia",
    "img" : "https://hdfilmologia.com/uploads/posts/2018-05/1525643036_63.jpg",
    "link" : "https://www.rapidvideo.com/e/FR4OGC0UP8&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Leonardo, el playboy-millonario caprichoso, una vez se revuelca por el bordo del yate. Después de la caída él pierde la memoria, cae en el hospital, y la propagadora de la pizza Keith, deseando es apasionado vengar al muchacho el descaro, lo asegura que — su marido y el padre de tres niños. ¿Que se volverá esta aventura? ¿Y es cuántos pasos por el odio hasta el amor?",
    "titulo" : "Hombre al Agua"
  },
  "Honey Levántate y Baila" : {
    "año" : "2018/04",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "http://allcalidad.com/wp-content/uploads/2018/04/honey-rise-up-and-dance.jpg",
    "link" : "https://www.rapidvideo.com/e/FQDR1DYIPN&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Honey Levántate y baila La bailarina callejera Skyler está decidida a probarse para el mismo equipo de baile que su hermana formalmente entrenada Tosha para competir por una beca universitaria, pero es desanimada por su familia y su novio quienes dudan que su talento crudo sea suficiente para que gane.",
    "titulo" : "Honey Levántate y Baila"
  },
  "Hotel Transilvania" : {
    "año" : "2012/09",
    "calidad" : "HD",
    "categoria" : "Infantil",
    "img" : "https://imgc.allpostersimages.com/img/print/posters/hotel-transylvania-movie-poster_a-G-9200286-0.jpg",
    "link" : "https://www.rapidvideo.com/e/FK39BAOJB3&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Drácula regenta un hotel en el se alojan personajes como Frankenstein, la Momia, el Hombre Invisible, hombres-lobo... El problema del conde es que tiene una hija de espíritu aventurero a la que le resulta difícil controlar. El conflicto surge cuando se aloja en el hotel un ser humano que se siente atraído por la hija del dueño.",
    "titulo" : "Hotel Transylvania"
  },
  "Hotel Transylvania 2" : {
    "año" : "2015/09",
    "calidad" : "HD",
    "categoria" : "Infantil",
    "img" : "https://www.elmulticine.com/imagenes/carteles/5/hotel-transylvania-2-cartel-b.jpg",
    "link" : "https://www.rapidvideo.com/e/FI2KX48PGD&q=480p",
    "servidor" : "rapidvideo",
    "sinpopsis" : "Todo parece mejorar en el Hotel Transilvania. La rígida norma establecida por Drácula de “sólo para monstruos” se ha suprimido y se aceptan también huéspedes humanos. Lo que preocupa al conde es que que su adorable nieto Dennis, medio humano y medio vampiro, no dé señal alguna de vampirismo. Aprovechando que Mavis ha ido a visitar a sus suegros humanos, Drácula recluta a sus amigos Frank, Murray, Wayne y Griffin para hacer que Dennis pase por un campamento de “entrenamiento de monstruos”. Lo que ignoran es que Vlad, el gruñón padre de Drácula, está a punto de llegar al hotel. Y cuando descubra que su bisnieto no es de sangre pura y que los humanos pueden frecuentar el establecimiento las cosas se complicarán. Secuela de Hotel Transilvania (2012).",
    "titulo" : "Hotel Transylvania 2"
  },
  "Hulk: El Hombre Increíble" : {
    "año" : "2008/06",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/ff0a8a884e9c33fabc9464c1a9c5b0e9.jpg",
    "link" : "https://www.rapidvideo.com/e/FJ7O54QDX0&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "El científico Bruce Banner (Edward Norton) recorre el mundo en busca de un antídoto que le permita librarse de su Alter Ego. Perseguido por el ejército y dominado por su propia rabia, es incapaz de sacarse de la cabeza a Betty Ross (Liv Tyler), por lo que decide volver a la civilización. Mientras se enfrenta a una extraña criatura, el agente de la KGB Emil Blonsky (Tim Roth) se expone a una dosis de radiación más intensa que la que convirtió a Bruce en Hulk. Emil hace responsable a Hulk de su terrible situación, y la ciudad de Nueva York se convierte en el escenario de la última batalla entre las dos criaturas más poderosas que jamás pisaron la Tierra",
    "titulo" : "Hulk: El Hombre Increíble"
  },
  "In the Cloud" : {
    "año" : "2018/05/21",
    "calidad" : "HD",
    "categoria" : "Drama/Accion",
    "img" : "https://hdfilmologia.com/uploads/posts/2018-05/1527697597_82.jpg",
    "link" : "https://www.rapidvideo.com/e/FRTU2W8OHV&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "La película trata sobre una compañía de tecnología, que está desarrollando un software capaz de cargar la conciencia y los recuerdos de una persona a un espacio virtual.",
    "titulo" : "In the Cloud"
  },
  "Ingrid Cambia de Rumbo" : {
    "año" : "2017/08",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "http://allcalidad.com/wp-content/uploads/2018/05/ingrid-goes-west.jpg",
    "link" : "https://www.rapidvideo.com/e/FRF6J3A175&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "La joven Ingrid se obsesiona con una 'influencer', una estrella de los medios sociales llamada Taylor Sloane que aparentemente tiene una vida perfecta. Así que cuando Ingrid decide abandonarlo todo y mudarse al oeste para tratar de ser amiga de Taylor, su comportamiento se vuelve cada vez más inestable, inquietante y peligroso.",
    "titulo" : "Ingrid Cambia de Rumbo"
  },
  "Interstelar" : {
    "año" : "2014/11",
    "calidad" : "HD",
    "categoria" : "Drama/Accion",
    "img" : "http://1.bp.blogspot.com/-kXpB7hiHsQw/VCmJR6PalzI/AAAAAAAAaTc/EXcN6_s8hW8/s1600/Interestelar_Nuevo_Poster_Latino_a_JPosters.jpg",
    "link" : "https://www.rapidvideo.com/e/FM8X9YF9ZE&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Narra las aventuras de un grupo de exploradores que hacen uso de un agujero de gusano recientemente descubierto para superar las limitaciones de los viajes espaciales tripulados y vencer las inmensas distancias que tiene un viaje interestelar.",
    "titulo" : "Interestelar"
  },
  "Invicto" : {
    "año" : "2002/08/23",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://pics.filmaffinity.com/undisputed-662930614-large.jpg",
    "link" : "https://www.rapidvideo.com/e/FHZIUXKCSJ&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "El campeón mundial de boxeo en la categoría de pesos pesados George “Iceman” Chambers (Ving Rhames) es enviado a prisión acusado de violación, cargo del que él se declara totalmente inocente. Lo que más le indigna es que en la cima de su carrera de boxeador profesional no va a poder disfrutar y defender su título de campeón invicto. Cumpliendo cadena perpetua por un crimen pasional en la misma penitenciaría a la que será enviado Iceman se encuentra Monroe Hutchen (Wesley Snipes). Los reclusos consideran a Hutchen como a un héroe, como a su indiscutible campeón de boxeo. Resignado a pasar el resto de su vida en la cárcel, a Hutchen todavía le obsesiona, sin embargo, la duda de si hubiera podido llegar a ser alguien como boxeador.",
    "titulo" : "Invicto"
  },
  "Invicto 2" : {
    "año" : "2006/04/11",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://allcalidad.com/wp-content/uploads/2017/05/Invicto-2.jpg",
    "link" : "https://www.rapidvideo.com/e/FHZI7NHFBZ&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Un boxeador ex campeón del mundo, pero venido a menos y lleno de deudas viaja a Rusia con su agente para ganarse unos pesos grabando comerciales de Vodka, pero una vez allá caerá en manos de la mafia, que desea meterlo preso y enfrentarlo al campeón reinante de un torneo para reclusos que mueve muchísimo dinero. Es así como “Ice man” deberá vérselas con todos los reclusos y el corrupto mundo que ahí se vive.",
    "titulo" : "Invicto 2"
  },
  "Invicto 3: Redención" : {
    "año" : "2010/05/22",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://pics.filmaffinity.com/undisputed_iii_redemption-473070348-large.jpg",
    "link" : "https://www.rapidvideo.com/e/FHZIRCIVX4&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "En esta película Scott Adkins vuelve a encarnar a Boyka (el malo de Undisputed 2), que busca la libertad. Cuando se le ofrece la oportunidad de participar en un campeonato clandestino entre los 8 mejores luchadores reclusos del mundo, ni lo dudará.",
    "titulo" : "Invicto 3: Redención"
  },
  "Iron Man" : {
    "año" : "2008/04",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/7532df5593ce0a3041ce109064ef9bb6.jpg",
    "link" : "https://www.rapidvideo.com/e/FP05UW7XZV&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "El multimillonario fabricante de armas Tony Stark (Robert Downey Jr.) debe enfrentarse a su turbio pasado después de sufrir un accidente con una de sus armas. Equipado con una armadura de última generación tecnológica, se convierte en \"El hombre de hierro\", un héroe que se dedica a combatir el mal en todo el mundo.",
    "titulo" : "Iron Man"
  },
  "Iron Man 2" : {
    "año" : "2010/04",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/ee433f4a6f8bfebd36b472fd3d9c9dcf.jpg",
    "link" : "https://www.rapidvideo.com/e/FLWAEXO3IP&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "El mundo ya sabe que el multimillonario Tony Stark (Robert Downey Jr.) es Iron Man, el superhéroe enmascarado. A pesar de las presiones del gobierno, la prensa y la opinión pública para que comparta su tecnología con el ejército, Tony es reacio a desvelar los secretos de la armadura de Iron Man, porque teme que esa información caiga en en manos de irresponsables. Con Pepper Potts (Gwyneth Paltrow) y James “Rhodey” Rhodes (Don Cheadle) a su lado, Tony forja alianzas nuevas y se enfrenta a nuevas y poderosas fuerzas.",
    "titulo" : "Iron Man 2"
  },
  "Iron Man 3" : {
    "año" : "2013/04",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/5d887202f5c7c155dd012196d6af6876.jpg",
    "link" : "https://www.rapidvideo.com/e/FQZUIZM2FI&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Continuando con la gran gama de superhéroes de Marvel tenemos el agrado de presentarles este estreno taquillero con el que podrán experimentar emociones a mil por hora con las grandes dosis de acción que presenta. La tercera entrega de la Saga de Iron Man el empresario Tony Stark/Iron Man se enfrentará a un enemigo quien tiene un poder que no tiene l[imites. Cuando Tony comprende que su enemigo ha destruido su universo personal, se envuelve en una angustiosa búsqueda para encontrar a los que causaron eso. Esto pondrá a prueba su entereza una y otra vez. Ya acorralado, Tony tendrá que sobrevivir por el solo, teniendo que confiar en su ingenio y su instinto para cuidar a las personas que quiere. Les recomendamos no perderse ningún detalle para poder disfrutar a mil por hora cada emoción del film tan esperado....",
    "titulo" : "Iron Man 3"
  },
  "It (Eso)" : {
    "año" : "2017/09",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/278d1fa688957569276ce967e4dcaddb.jpg",
    "link" : "https://www.rapidvideo.com/e/FQYIWHNQOM&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Cuando los niños comienzan a desaparecer en la ciudad de Derry, Maine, un grupo de niños pequeños confrontan sus mayores temores al enfrentarse a un malvado payaso llamado Pennywise, cuya historia de asesinato y violencia data de siglos. \"IT (Eso)\" es protagonizada por Bill Skarsgård como el villano central de la historia, Pennywise. Un conjunto de actores jóvenes también protagonizan la película, incluyendo a Jaeden Lieberher, Jeremy Ray Taylor, Sophia Lillis, Finn Wolfhard , Wyatt Oleff, Chosen Jacobs, Jack Dylan Grazer y Nicholas Hamilton.",
    "titulo" : "It (Eso)"
  },
  "Jeepers Creepers" : {
    "año" : "2002/01",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/f3cc0884e5a5d0b08e9bd6c7d1dc802e.jpg",
    "link" : "https://www.rapidvideo.com/e/FKJ6P5JJR2&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Dos hermanos, Trish y Darry, vuelven a casa desde la universidad y tienen que cruzar en coche el Medio-Oeste americano. Durante su viaje a través de un paisaje inhóspito tienen un encuentro terrorífico con un loco que intenta sacarles de la carretera con su camioneta. Poco tiempo después los chicos ven al conductor junto a una iglesia abandonada y observan cómo tira por una gran tubería abierta lo que parece ser dos cuerpos envueltos en sábanas. Tras otro violento encuentro en la carretera deciden regresar a la iglesia y lo que descubren allí es sólo el principio de la pesadilla. Su rutinario viaje a casa se convierte en una carrera desesperada para escapar de una criatura terrorífica que les ha elegido como presa y les persigue implacablemente; una criatura que aparece cada cierto tiempo para alimentarse y que se ha encaprichado con los ojos azules de Darry. Esta película también es conocida como : \"El Demonio\" o \"El Mensajero de Satanás\".",
    "titulo" : "Jeepers Creepers"
  },
  "Jeepers Creepers 2" : {
    "año" : "2003/08",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/e7b6623b28e9e7339201edd113d45d96.jpg",
    "link" : "https://www.rapidvideo.com/e/FM9IEI7LIB&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Hoy es el 22º día en el ritual alimenticio de la abominable criatura conocida como The Creeper, la cual se alimenta de los órganos arrancados vivos de sus víctimas. A este monstruo caníbal procedente de tiempos remotos le queda todavía un día más para hartarse de carne humana y desaparecer de nuevo, y aguardar en hibernación hasta su próxima temporada de caza dentro de 23 años. Taggart y sus hijos se hallan trabajando en los maizales de su propiedad cuando la bestia de enormes alas agarra al benjamín de la familia, transportándolo por los aires hacia un destino que se adivina horripilante...",
    "titulo" : "Jeepers Creepers 2"
  },
  "Jeepers Creepers 3" : {
    "año" : "2017/11",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/71939f77e04b29cf8ca6c015c8b0b7e5.jpg",
    "link" : "https://www.rapidvideo.com/e/FO0JKICPL2&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "La acción de JEEPERS CREEPERS 3 transcurrirá entre la primera y segunda entrega y en ella el escéptico Sargento Tubbs unirá sus fuerzas con un grupo de fuerzas especiales que quiere destruir al Creepers de una vez por todas. A medida que se produce un sangriento enfrentamiento entre ellos, podrán descubrir los orígenes de la criatura. También conocido como \"El Regreso del Demonio\" , \"El Mensajero de Satanás 3\" o \"El Demonio 3\"",
    "titulo" : "Jeepers Creepers 3"
  },
  "Jigsaw" : {
    "año" : "2017/10",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "http://www.fotogramas.es/var/ezflow_site/storage/images/media/imagenes/recursos/js/137663962-1-esl-ES/js.jpg",
    "link" : "https://www.rapidvideo.com/e/FPKYV3FQAG&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Cuando empiezan a aparecer cuerpos esparcidos a lo largo de la ciudad, a cada cual más espeluznante, todas las sospechas comienzan a señalar como culpable al homicida John Kramer, alias Jigsaw, Sin embargo, el asesino lleva más de una década muerto, ¿cómo es posible que haya vuelto a las andadas? Cinco nuevas víctimas tendrán que hacer frente al terror que supone el tétrico juego de Jigsaw. ¿Estaremos más cerca de conocer el desenlace de los macabros planes ideados por este amante de los juegos letales?",
    "titulo" : "Jigsaw"
  },
  "John Wick 2: Un Nuevo Día Para Matar" : {
    "año" : "2017/02",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/da250ff83217842c5c3d68e9eb0de84d.jpg",
    "link" : "https://www.rapidvideo.com/e/FQYIWM3MRS&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "La segunda entrega de John Wick profundizará en el pasado del protagonista y en sus dos facetas: John, el hombre, y John Wick, el legendario asesino. En la primera película conocíamos a John Wick, un antiguo asesino a sueldo que deja su profesión tras la muerte de su mujer, pero que será perseguido por un sicario – que es un gran amigo y ex compañero suyo- porque un mafioso puso precio a su cabeza.",
    "titulo" : "John Wick 2: Un Nuevo Día Para Matar"
  },
  "Juego de Ladrones: El Atraco Perfecto" : {
    "año" : "2018/05/20",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://estaticos2.nochedecine.com/wp-content/uploads/2018/04/nt_18_Juego-de-Ladrones-interior.jpg",
    "link" : "https://www.rapidvideo.com/e/FRT5BODPDE&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Un grupo de ladrones expertos planea su gran asalto final. Robar los 120 millones de dólares en efectivo que todos los días se sacan de la circulación y son destruidos por la Reserva Federal. Adelantarse a la policía de Los Ángeles y llegar primero al dinero será su reto. Un thriller sobre la vida criminal y el grupo de la policía a los que se enfrentan.",
    "titulo" : "Juego de Ladrones: El Atraco Perfecto"
  },
  "Juerga de Mamis" : {
    "año" : "2017/09/15",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "https://noescinetodoloquereluce.com/wp-content/uploads/2017/09/Poster-de-juerga-de-mamis.jpg ",
    "link" : "https://www.rapidvideo.com/e/FMR2PAQYU0&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Cuatro madres se juntan para cenar y pasarlo bien. Cuando la noche da un giro inesperado, estas cuatro mujeres descubrirán que tienen más cosas en común de lo que pensaban.",
    "titulo" : "Juerga de Mamis"
  },
  "Jumanji: welcome" : {
    "año" : "2017/12",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://encrypted-tbn2.gstatic.com/images?q=tbn:ANd9GcQtRFQA1DSgRS1xrIY_J8mCBKK08josMpwy7jbE-pJVlyzVCVbEdwMvmrRd",
    "link" : "https://www.rapidvideo.com/e/FPAJ6W4SAA&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "El misterioso y letal juego Jumanji reaparece más de veinte años después. Es la época actual, y cuatro adolescentes se introducen en esta nueva aventura, ahora a partir de un videojuego que sirve como un portal a través del espacio-tiempo. Absorbidos por el mundo de Jumanji, un juego que no se puede abandonar hasta que acaba la partida, los jóvenes se enfrentarán a rinocerontes, mambas negras y una infinita variedad de trampas de la selva. En este juego, el tímido Spencer será un conquistador musculoso, el deportista Fridge será un diminuto Einstein, la chica de moda Bethany será un profesor sabelotodo, y la torpe Martha, una guerrera amazona. Juntos tendrán que ‘jugar’ para volver al planeta Tierra y seguir con sus vidas. ¿Cómo? Pensando distinto.",
    "titulo" : "Jumanji: Bienvenidos a la Jungla"
  },
  "Jurassic Park: El Mundo Perdido" : {
    "año" : "1997/07",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://allcalidad.com/wp-content/uploads/2016/05/1-154.jpg",
    "link" : "https://www.rapidvideo.com/e/FR6NB4BTPT&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "El mundo perdido: Jurassic Park Cuatro años después del fiasco de su Parque Jurásico, el multimillonario John Hammond se pone en contacto con el Dr. Ian Malcolm para informarle sobre su nuevo proyecto. En una isla desierta, aledaña al parque, viven en libertad cientos de dinosaurios de todos los tamaños y especies. Son los descendientes de los animales clonados en el laboratorio. Al principio, reticente, Ian decide unirse al doctor cuando se entera de que su prometida forma parte de la expedición científica. También ignora que hay otra expedición con otros objetivos en marcha.",
    "titulo" : "Jurassic Park: El Mundo Perdido"
  },
  "Jurassic Park: Parque Jurásico" : {
    "año" : "1993/07",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://allcalidad.com/wp-content/uploads/2016/05/1-153.jpg",
    "link" : "https://www.rapidvideo.com/e/FR6NB4BTPT&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Jurassic Park: Parque Jurásico John Hammond, magnate propietario de la empresa multinacional en bioingeniería InGen, ha soñado toda su vida con construir el mayor parque de atracciones del mundo. Una isla en Costa Rica donde habiten las criaturas más espectaculares que han pisado la Tierra: los dinosaurios. Pese a la extinción de estos reptiles, InGen ha logrado clonar diversas especies mediante la manipulación de segmentos de ADN de la propia sangre de dinosaurio, encontrada en mosquitos fosilizados en ámbar. Para la apertura del Parque Jurásico, Hammond tiene que convencer a los inversores de que las atracciones son totalmente seguras, por lo que invitará a la isla al paleontólogo de renombre Alan Grant, a la paleobotánica Ellie Sattler, al teórico Ian Malcolm y al representante de los inversores, además de sus nietos Alexis y Tim. Al llegar a la isla sufren el boicot interno del informático Dennis Nedry, sin embargo, no será el único problema con el que se toparán en su peligrosa visita; la naturaleza mostrará toda su fuerza mediante un ciclón que asolará la isla, confirmando una verdad temida por todos: la naturaleza no obedece a un dueño, y los dinosaurios tampoco.",
    "titulo" : "Jurassic Park: Parque Jurásico"
  },
  "Jurassic World" : {
    "año" : "2015/06",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://image.tmdb.org/t/p/original/cXaq4ZcQqWLBRQfzxwALZG1qHhL.jpg",
    "link" : "https://www.rapidvideo.com/e/FPJC8C44E8&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Veintidós años después de lo ocurrido en Jurassic Park, la isla Nublar ha sido transformada en un parque temático, Jurassic Wold, con versiones «domesticadas» de algunos de los dinosaurios más conocidos. Cuando todo parece ir a la perfección y ser el negocio del siglo, un nuevo dinosaurio de especie todavía desconocida y que es mucho más inteligente de lo que se pensaba, comienza a causar estragos entre los visitantes del Parque.",
    "titulo" : "Jurassic World"
  },
  "Justice League" : {
    "año" : "2017/11",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://www.fotogramas.es/var/ezflow_site/storage/images/peliculas/liga-de-la-justicia/119543716-2-esl-ES/Liga-de-la-Justicia.jpg",
    "link" : "https://www.rapidvideo.com/v/FOEQDL3H8M",
    "servidor" : "rapidvideo",
    "sinopsis" : "Alimentado por su restaurada fe en la humanidad e inspirado por el acto desinteresado de Superman, Bruce Wayne recluta la ayuda de su recién encontrada aliada, Diana Prince, para enfrentarse a un enemigo aún mayor. Juntos, Batman y Wonder Woman trabajan deprisa para encontrar y reclutar un equipo de metahumanos para plantar cara a esta nueva amenaza creciente. Pero pese a la formación de esta liga de héroes sin precedentes – Batman, Wonder Woman, Aquaman, Cyborg y Flash, quizás sea demasiado tarde para salvar el planeta de un asalto de proporciones catastróficas.",
    "titulo" : "La Liga de la Justicia"
  },
  "Kick Ass 2: Con un par" : {
    "año" : "2013/07",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/07d08875c2e3524b32af0115945a916f.jpg",
    "link" : "https://www.rapidvideo.com/e/FHXLPMX2QR&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Kick-Ass se ha retirado de la lucha contra la delincuencia, pero inspiró a otros ciudadanos a convertirse en superhéroes. Le pide a Mindy Macready entrenarlo para convertirse en un héroe apropiado. Su novia Katie Deauxma (Lyndsy Fonseca) se da cuenta de su extraño comportamiento y la frecuente absencia y piensa que la engaña con Mindy, (a pesar de que Katie está engañándolo) y rompe con él. Mindy continuaba en la lucha contra el crimen por su padre, sin embargo Marcus (Morris Chestnut) le hace comprometerse a tratar de vivir una vida normal.Kick-Ass se une a un equipo de héroes llamado \"Justice Forever\". También conocida con el nombre \"Kick-Ass 2: Con un par\".",
    "titulo" : "Kick Ass 2: Con un par"
  },
  "Kick-Ass: Listo para machacar" : {
    "año" : "2010/03",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://es.web.img2.acsta.net/r_1920_1080/medias/nmedia/18/77/67/64/19419764.jpg",
    "link" : "https://www.rapidvideo.com/e/FHZJ66JPN2&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "‘Kick-Ass’ gira en torno a Dave Lizewski (Aaron Johnson), un estudiante de instituto que pasa desapercibido por todos, aficionado a los cómics, de donde saca un día la idea de convertirse en un superhéroe, aunque no tenga superpoderes, no haya seguido un duro entrenamiento y ni siquiera tenga una razón significativa para ello. Pero la vida de Dave cambiará para siempre cuando se encuentre con un par de locos vigilantes -la terremoto de 11 años Hit Girl (Chloë Moretz) y su padre, Big Daddy (Nicolas Cage)- y forje amistad con otro joven luchador contra el crimen, Red Mist (Christopher Mintz-Plasse). Y cuando todos se tengan que enfrentar al jefe de la mafia local, Frank D'Amico (Mark Strong), sus alianzas y sus verdaderas habilidades serán puestas a prueba.",
    "titulo" : "Kick-Ass: Listo para machacar"
  },
  "Kickboxer: Represalias" : {
    "año" : "2018/01",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://i0.wp.com/www.peliculastoday.com/wp-content/uploads/2018/03/Kickboxer-Retaliation.jpg?fit=690%2C1024&ssl=1",
    "link" : "https://www.rapidvideo.com/v/FP7EUOYNX8&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Kurt Sloan se ha prometido a sí mismo que no volvería a Tailandia, pero alguien le seda y le obliga a volver al país asiático. Cuando despierta, descubre que está en prisión porque quieren que se enfrente a Mongkut. Si vence a este monstruo, Kurt recibirá a cambio su libertad y dos millones de dólares como recompensa.",
    "titulo" : "Kickboxer: Represalias"
  },
  "Kingsman 2: El Círculo Dorado" : {
    "año" : "2017/09",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/9f4cb62cb11baf381f17137e26ad2d65.jpg",
    "link" : "https://www.rapidvideo.com/e/FPDWC9DIZV&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Cuando un ataque contra la sede de Kingsman se lleva a cabo y se levanta un nuevo villano, la maquiavélica Poppy y un ex aspirante, los Kingsman, Eggsy y Merlín se ven obligados a trabajar en conjunto con la agencia estadounidense Statesman, para salvar el mundo. Por lo que deben viajar a Kentucky a conocer a sus integrantes, bajo la dirección de Champán (Champ), tendremos a Ginger, el femenino de Merlín, el agente Tequila, y a Whisky, quien será el encargado de darles una mano a los londinenses. Reaparece un Kingsman que completará al equipo necesario para enfrentar a la amenaza global.",
    "titulo" : "Kingsman 2: El Círculo Dorado"
  },
  "Kingsman: El Servicio Secreto" : {
    "año" : "2015/01",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://allcalidad.com/wp-content/uploads/2016/04/Kingsman-El-servicio-secreto.jpg",
    "link" : "https://www.rapidvideo.com/e/FI84CH5EUC&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Kingsman: El servicio secreto Un veterano agente secreto inglés (Colin Firth) debe entrenar a un joven sin refinar (Taron Egerton), pero que promete convertirse en un competitivo agente gracias a un ultra-programa de entrenamiento, al mismo tiempo que una amenaza global emerge procedente de un genio retorcido. Adaptación del cómic de Mark Millar y Dave Gibbons.",
    "titulo" : "Kingsman: El Servicio Secreto"
  },
  "Kong: La Isla Calavera" : {
    "año" : "2017/03",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/c7ce159c4222d442a4f3494444c60a5d.jpg",
    "link" : "https://www.rapidvideo.com/e/FMKSAXBIPA&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "En esta nueva entrega sobre King Kong y la historia de la Isla Calavera encontramos un flim cargado de una dosis inmensa de aventura que nos llevara desde un inicio explorador, pasando por todas las asañas necesarias para poder llegar al lugar deseado, Isla Calavera, llenos de unos magníficos efectos especiales King Kong nos brindara escenas cargadas de mucha acción y nos capturara de inicio a fin. Ademas podemos analizar la trama del film de esta manera, en busca de una Isla desconocida un grupo de exploradores se aventuran sin saber que es lo que encontraran, monstruos ancestrales de otra era viven en este lugar y solo entras en la casa de otro si quieres problemas, de esta manera se encuentran con King Kong, quien es el que domina la Isla, nuestros amigos exploradores no solo tienen que lidiar con King KOng sino también con los distintos monstruos existentes en estos territorios. Algo sorprendente sucede King Kong siente afecto por la joven que acompañaba a los exploradores y la defiende arduamente de los monstruos, pero no son los únicos peligros que experimentaran nuestros amigos exploradores, muchos morirán y otros tendrán éxito; pero les puedo garantizar que sin lugar a duda que cumplirá con todas sus expectativas.... Podemos decir entonces que: un diverso equipo de exploradores es reunido para aventurarse en el interior de una isla del Pacífico tan bella como traicionera que no aparece en los mapas, sin saber que están invadiendo los dominios del mítico King Kong. Personalmente les puedo decir que ver este flim los llenara de acción y aventura, es la mejor entrega que se tiene de King Kong y ademas tenemos como precedente que fue realizada por los mismos realizadores de Gotzila.",
    "titulo" : "Kong: La Isla Calavera"
  },
  "La Bella y la Bestia" : {
    "año" : "2017/03",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/cc404ca442f736bbe454defd725ea172.jpg",
    "link" : "https://www.rapidvideo.com/e/FKJJWLO122&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "La Bella y la Bestia, es la historia de una joven que para salvar a su padre, decide ir al castillo y quedar atrapada junto a una bestia. Pero a pesar del miedo, se lleva bien con los habitantes encantados del castillo y descubre que la bestia tiene un gran corazón.",
    "titulo" : "La Bella y la Bestia"
  },
  "La Boda de Valentina" : {
    "año" : "2018/02",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "http://www.cailegdl.com/wp-content/uploads/2018/02/la_boda_de_valentina-901045458-large.jpg",
    "link" : "https://www.rapidvideo.com/e/FR4CTBB2SD&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Valentina aparentemente tiene la vida perfecta en Estados Unidos. Su universo tiembla cuando Jason, su novio, le propone matrimonio y debe enfrentar a su familia “los perfectos Tate” con la suya “los Hidalgo”, la dinastía política más caótica y surrealista de la historia de México. Ambos, tendrán que sobrevivir al choque cultural y a su carismático exnovio Ángel (Omar Chaparro) descubriendo en el camino que al final, las cosas que de verdad importan no tienen apellido, ni fronteras.",
    "titulo" : "La Boda de Valentina"
  },
  "La Leyenda del Charro Negro" : {
    "año" : "2018/01",
    "calidad" : "HD",
    "categoria" : "Infantil",
    "img" : "https://i2.wp.com/www.peliculastoday.com/wp-content/uploads/2018/05/La-Leyenda-del-Charro-Negro.jpg?fit=550%2C793&ssl=1",
    "link" : "https://www.rapidvideo.com/e/FQWJ1FOJM0&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Poco tras los acontecimientos sucedidos en La historia de leyenda del Chupacabras, Leo San Juan ha decidido que es el instante de volver con Nando, su hermano, a casa de su abuela. Mas en su camino, Leo se halla con la entidad fantasmagórica famosa como el Charro Negro, un ser capaz de conceder cualquier favor, a cambio de unas monedas. Si bien Leo quiere proseguir su camino, el ocurrente Charro ha podido engañarle y, en consecuencia, una pequeña inocente ha sido llevada al inframundo. Ahora Leo va a deber reunir a sus amigos para asistirle a corregir el mal hecho. Mas el Charro tiene otras pretensiones para Leo, que ni tan siquiera ha sospechadoo.",
    "titulo" : "La Leyenda del Charro Negro"
  },
  "La Masacre de Texas" : {
    "año" : "2017/09",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "http://allcalidad.com/wp-content/uploads/2018/04/leatherface.jpg",
    "link" : "https://www.rapidvideo.com/e/FQLMJ15FU9&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "La masacre de Texas La historia de los orígenes de Leatherface cuenta cómo de joven logra escapar de un psiquiátrico junto a cuatro compañeros. El grupo decide secuestrar en su huida a una joven enfermera, a la que llevarán en un infernal viaje en el que verán todo tipo de horrores mientras intentan escapar de Hal Hartman, un Ranger de Texas perturbado que busca venganza.",
    "titulo" : "La Masacre de Texas"
  },
  "La Momia" : {
    "año" : "2017/06",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/7fff7efaa376b1facb8a44b9e1f3f54c.jpg",
    "link" : "https://www.rapidvideo.com/e/FJ3M5N0E7P&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "A pesar de estar enterrada en una tumba en lo más profundo del desierto, una antigua princesa cuyo destino le fue arrebatado injustamente, se despierta en la época actual y demuestra una maldad que ha crecido hasta límites insospechados con el paso de miles de años. Desde las inmensas arenas de Oriente Medio hasta unos desconocidos laberintos bajo el Londres actual, La Momia ofrece una nueva y sorprendente versión de un mundo de dioses y monstruos.",
    "titulo" : "La Momia"
  },
  "La Mujer Más Odiada De Estados Unidos" : {
    "año" : "2017/03",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/42cd6a996a77e876c6e3491d2980c41b.jpg",
    "link" : "https://www.rapidvideo.com/e/FK3PX3U4LJ&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Madalyn Murray O’Hair era líder del Movimiento ateo EE.UU. en el país en el que se creó la Organización Panamericana de ateos y se llevó a cabo como presidente más de veintitrés años. Administrar esta joven madre fue la oración diaria eliminado las escuelas públicas, pero estas y otras ideas en la defensa de la libertad religiosa les llevó hasta el punto de ser “la mujer más odiada de Estados Unidos”, el secuestrado junto con su hijo y la nieta.",
    "titulo" : "La Mujer Más Odiada De Estados Unidos"
  },
  "La Noche Del Demonio 2" : {
    "año" : "2013/10",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/d32a2df0457fa0cc798ec71fa3197926.jpg",
    "link" : "https://www.rapidvideo.com/e/FIRAE9B61Z&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Josh y Renai Lambert se han mudado con sus hijos a la casa de Lorraine, la madre de Josh, esperando olvidar el pasado y comenzar una nueva vida. Pero pronto la familia empieza a percibir extrañas visiones y fenómenos amenazantes que los obligarán a desentrañar un oscuro secreto.",
    "titulo" : "La Noche Del Demonio 2"
  },
  "La Noche del Demonio" : {
    "año" : "2011/06",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/c3199f273cd0d8640902c9a1cdefd00c.jpg",
    "link" : "https://www.rapidvideo.com/e/FIR9M1418Z&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Josh (Patrick Wilson), su esposa Renai (Rose Byrne) y sus tres hijos acaban de mudarse a una vieja casa. Pero, tras un desgraciado accidente, uno de los niños entra en coma y, al mismo tiempo, empiezan a producirse en la casa extraños fenómenos que aterrorizan a toda la familia.",
    "titulo" : "La Noche del Demonio"
  },
  "La Noche del Demonio 3" : {
    "año" : "2015/05",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/6d5331768b104a75c40cdf59d5547872.jpg",
    "link" : "https://www.rapidvideo.com/e/FIPB732FOD&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "El capítulo más reciente de esta serie de terror está escrita y dirigida por el co-creador de la franquicia Leigh Whannell. Esta precuela escalofriante nos muestra a la protagonista (Stefanie Scott) como una adolescente que ha sido blanco de una peligrosa entidad sobrenatural, por lo que ella contacta a la talentosa psíquica Elise Rainier (Lin Shaye) quien finalmente por solicitud del padre de la poseída, acepta a regañadientes utilizar su habilidad para ponerse en contacto con los muertos, y así poder ayudar a la joven.",
    "titulo" : "La Noche del Demonio 3"
  },
  "La Novicia" : {
    "año" : "2017/01",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "http://allcalidad.com/wp-content/uploads/2018/03/La-novicia.jpg",
    "link" : "https://www.rapidvideo.com/e/FP98NNKRP0&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "La novicia Esta película cuenta la historia de una joven que vive en la época del Concilio Vaticano II, en la década de 1960. La chica se está preparando para convertirse en una mujer, pero en su camino se irán interponiendo una serie de problemas o dudas, ya bien sean aquellas relacionadas con la fe, con revolucionar la institución eclesiástica, o incluso aquellas sobre su sexualidad.",
    "titulo" : "La Novicia"
  },
  "La Peor Semana" : {
    "año" : "2018/04",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "https://i2.wp.com/www.peliculastoday.com/wp-content/uploads/2018/04/La-peor-semana.jpg?fit=683%2C1024&ssl=1",
    "link" : "https://www.rapidvideo.com/v/FQSCOI9Q7N&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "The Week Of Un devoto padre de clase media (Adam Sandler) está decidido a pagar la boda de su hija a pesar de las insistencias del padre del novio, que es mucho más rico (Chris Rock). Una serie de calamidades obliga a los padres (y sus familias) a unirse y soportar la semana más larga de sus vidas.",
    "titulo" : "La Peor Semana"
  },
  "La Primera Vez que nos Vimos" : {
    "año" : "2018/02",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "https://i1.wp.com/www.peliculastoday.com/wp-content/uploads/2018/02/Cuando-nos-conocimos.jpg?fit=691%2C1024&ssl=1",
    "link" : "https://www.rapidvideo.com/v/FOC3JC23J8&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Con la ayuda de un fotomatón mágico que lo envía al pasado, Noah vuelve a revivir una y otra vez la noche que conoció a Avery hasta que consiga enamorarla.",
    "titulo" : "La Primera Vez que nos Vimos"
  },
  "La Princesa Cisne" : {
    "año" : "2018/03",
    "calidad" : "HD",
    "categoria" : "Infantil",
    "img" : "https://i2.wp.com/www.peliculastoday.com/wp-content/uploads/2018/04/La-princesa-cisne-Un-misterio-Real.jpg?fit=465%2C675&ssl=1",
    "link" : "https://www.rapidvideo.com/v/FQSENR3ZS1&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "¡Vuelven tus personajes favoritos en una nueva aventura real! Parece que una Z misteriosa aparece como una marca en los residentes de palacio. ¿Quién está detrás de la marca y qué significa? La princesa Odette, Derek, Scully y todos los amigos de la Princesa Cisne trabajarán en equipo para resolver el misterio.",
    "titulo" : "La Princesa Cisne: Un Misterio Real"
  },
  "La Razón de Estar Contigo" : {
    "año" : "2017/01",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/369759daec43e59f1991c5e9927b021a.jpg",
    "link" : "https://www.rapidvideo.com/e/FOQVD9M4DT&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "La razón de estar contigo es una historia muy conmovedora y sorprendete de un perro fiel que a lo largo de su vida canina encuentra el significado de su existencia a través de la vida de los humanos, quienes enseña a reír y amar. Toda la película se ve desde la perspectiva del perro.",
    "titulo" : "La Razón de Estar Contigo"
  },
  "La Vida de Mary" : {
    "año" : "2018/01",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://i1.wp.com/www.peliculastoday.com/wp-content/uploads/2018/04/Proud-Mary.jpg?fit=690%2C1024&ssl=1",
    "link" : "https://www.rapidvideo.com/v/FPW0JHCN1T&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "La vida de Mary (Taraji P. Henson) , una asesina a suelto de la mafia de Boston, da un vuelco inesperado cuando conoce a un niño que despierta el instinto maternal que creía perdido.",
    "titulo" : "La Vida de Mary"
  },
  "La Villana" : {
    "año" : "2017/06",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://allcalidad.com/wp-content/uploads/2018/02/la-villana.jpg",
    "link" : "https://www.rapidvideo.com/e/FRBA2X7W3I&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "La villana Sook-hee es criada para ser una asesina. Pero esto no la gusta, por ello, cuando la Agencia de Inteligencia de Corea del Sur la recluta como agente con la promesa de su libertad tras 10 años de servicio, la joven acepta. Cuando por fin consigue su ansiada libertad, cambia de identidad y se convierte en una actriz de teatro pero tampoco esta vida normal es fácil para ella después de todo lo que ha hecho en su vida. Todo vuelve a cambiar cuando dos hombres de su pasado reaparecen para sacar a la luz secretos que siempre debieron quedar ocultos.",
    "titulo" : "La Villana"
  },
  "La forma del agua" : {
    "año" : "2017/12",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "https://i0.wp.com/www.peliculastoday.com/wp-content/uploads/2018/02/La-forma-del-agua.jpg?fit=768%2C1024&ssl=1",
    "link" : "https://www.rapidvideo.com/v/FOW70V4X59&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "En un inquietante laboratorio de alta seguridad, durante la Guerra Fría, se produce una conexión insólita entre dos mundos, aparentemente alejados. La vida de la solitaria Elisa (Sally Hawkins), trabajadora del laboratorio, cambia por completo cuando descubre un experimento clasificado como secreto: un hombre anfibio (Doug Jones) que se encuentra ahí recluido.",
    "titulo" : "La Forma del Agua"
  },
  "La muñeca vudú" : {
    "año" : "2017/02/24",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "http://allcalidad.com/wp-content/uploads/2017/09/la-muneca-vudu.jpg",
    "link" : "https://www.rapidvideo.com/e/FJJE59B4NK&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "La muñeca vudú Tras la muerte de Henry Leonard Bale, un asesino en serie, en manos de la policía, una antigua maldición consume a un pueblo tranquilo causando una cadena de asesinatos brutales. El detective Matt Williams descubrirá el punto de partida de las muertes: un juego de talismanes que el asesino recibió de niño. De esta manera, deberá resolver el misterio a contra reloj para salvar la vida de su hija.",
    "titulo" : "La muñeca vudú"
  },
  "La noche del demonio 4" : {
    "año" : "2018/01",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "https://i0.wp.com/www.peliculastoday.com/wp-content/uploads/2018/03/La-noche-del-demonio-4.jpg?fit=693%2C1024&ssl=1",
    "link" : "https://www.rapidvideo.com/v/FPK77EDUJ3&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "En esta nueva película de terror original, en la que veremos de nuevo a Lin Shaye como la Doctora Elise Rainier, la brillante parapsicóloga se enfrenta a su más personal y aterradora caza hasta la fecha, que sucede en su antigua casa familiar. Notas de producción – Cuarta entrega de la saga “Insidious”.",
    "titulo" : "La noche del demonio 4"
  },
  "La paradoja de Cloverfield" : {
    "año" : "2018/02",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "https://i0.wp.com/www.peliculastoday.com/wp-content/uploads/2018/02/The-Cloverfield-Paradox.jpg?fit=683%2C1024&ssl=1",
    "link" : "https://www.rapidvideo.com/e/FOF7TJA0NZ&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Un sorprendente y espantoso descubrimiento que reta todo cuanto se sabía hasta el instante sobre el tejido del universo y la textura de la realidad. Este hecho fuerza a una tripulación de astronautas, a bordo de una estación espacial, a pelear desesperadamente por la supervivencia. Al tiempo que su realidad ha sido absolutamente perturbada, este conjunto de astronautas se hallarán encallados en el espacio cuando la Tierra desaparezca súbitamente.",
    "titulo" : "La paradoja de Cloverfield"
  },
  "La saga Crepúsculo: Eclipse" : {
    "año" : "2010/06",
    "calidad" : "HD",
    "categoria" : "Drama/Accion",
    "img" : "https://lh3.googleusercontent.com/Ovuzhqfn8lBQXTArL6WBwWeK_YGvhfOs_96yyrnaRGVmVm_swteCINIlCodDKjAK3qaVCLXxPU-oHUSDsH4uxJlBtAjFJk5XjhpdSHPPx5t80exmrJb6_XHttyAToxWpciNnNFFJ3LYAxW493eZHqZLoSG4FrxnP9oTV74HnRgdc2dSB8xu6MmQwV-jNhrca51vZUPJodcGfo1gJGmk7M0l1fo4aGoOwE9wjnvozGGuktBVTe7L9dm25pM9gv-_XpR02Nt2j4KeRL8bSC-_2a9RRJE0nXOF37M1t0YKMWK99Rj2SCoHMhO93FDRX2XFwgRW1ndxzRDHYUYRj99jo9gQ2tichVJ-12ZCcLnfpRVmXNIZqw4-intx9IccdZaKams_diMTT0-eUy7kDPVS-upwndqUda3kV8vebi5tHHG2nYA9sNpL11mmziBIeRupyoMzFbsSjK12IvKec-vtJTOYQV0010ra4ZSz_nQZBgq9Oge8YZe9UZeVMeeXRV3ftRKLVJpgU28nL4Rta2cD6Dxj0TxTp_U2lNR8bcsGNvcxnIy_VerLaBcy30_LxGYKQXsf-VYTxsT-TAjD9oYm3zZm5nDBq2I40qGeub7JBNxYisNPlpq_Nlho9CWtL24OXjjv-5BsAE8rYxvH1V-zMW_Ew0pTtakrnpw=w446-h637-no",
    "link" : "https://www.rapidvideo.com/e/FNUJ17MN9L&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "En esta tercera entrega de la exitosa saga de vampiros de las novelas de Stephenie Meyer, Bella tendrá que elegir entre Edward y Jacob. La ciudad de Seattle es devastada por una serie de misteriosos asesinatos que va en aumento, mientras una vampiresa busca venganza. Bella debe escoger entre su amor por Edward y su amistad con Jacob, consciente de que su decisión puede iniciar una batalla entre vampiros y licántropos. Rodeada de peligro y con su graduación acercándose, ahora se enfrenta a la decisión más importante de su vida.",
    "titulo" : "La saga Crepúsculo: Eclipse"
  },
  "La saga Crepúsculo: Luna nueva" : {
    "año" : "2009/03",
    "calidad" : "HD",
    "categoria" : "Drama/Accion",
    "img" : "http://es.web.img3.acsta.net/r_1920_1080/medias/nmedia/18/70/52/93/19197021.jpg",
    "link" : "https://www.rapidvideo.com/e/FKLPLF5CQN&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Edward Cullen decide abandonar a Bella Swan para mantenerla alejada de los peligros del mundo vampírico. Con la ayuda de Jacob Black, su amigo de la infancia y miembro de la misteriosa tribu quileute, Bella intentará superar el abandono de Edward, que la ha dejado sumida en el mayor de los desconsuelos. Pero los peligros siguen acechando a la joven; nuevas y asombrosas criaturas sobrenaturales se cruzarán en su camino, y Bella sólo contará con el apoyo del cada vez más cercano e irresistible Jacob. Repentinamente, Bella se encuentra inmersa en el mundo de los hombres lobo, ancestrales enemigos de los vampiros, y su lealtad es puesta a prueba...",
    "titulo" : "La saga Crepúsculo: Luna nueva"
  },
  "La torre oscura" : {
    "año" : "2017/08/03",
    "calidad" : "HD",
    "categoria" : "Terror/Accion",
    "img" : "http://allcalidad.com/wp-content/uploads/2017/10/la-torre-oscura.jpg",
    "link" : "https://www.rapidvideo.com/e/FKWZ8UD7B7&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "La historia gira en torno a Roland Deschain, último miembro de una orden de caballería denominada Pistoleros. El protagonista ha iniciado la búsqueda de un edificio mitológico conocido como La Torre Oscura que, según cuenta la leyenda, es la unión de todos los universos. La trama se desarrolla en un universo semejante al Viejo Oeste donde elementos de la fantasía están presentes. La torre oscura es la adaptación cinematográfica de la saga de novelas homónimas de Stephen King. El encargado de dirigir el proyecto es Nikolaj Arcel ('Un asunto real'), y el guion corre a cargo de Akiva Goldsman (Una mente maravillosa, Soy leyenda).",
    "titulo" : "La torre oscura"
  },
  "Las Travesuras de Peter Rabbit" : {
    "año" : "2018/02",
    "calidad" : "HD",
    "categoria" : "Infantil",
    "img" : "https://i2.wp.com/www.peliculastoday.com/wp-content/uploads/2018/04/Las-travesuras-de-Peter-Rabbit.jpg?fit=683%2C1024&ssl=1",
    "link" : "https://www.rapidvideo.com/e/FQKB98N39X&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Peter Rabbit no es un conejo cualquiera. Es un rebelde travieso y aventurero que viste camisa azul y no lleva pantalones. Peter vive junto a su familia y amigos, un grupo variopinto de animales que incluye incluso a un zorro. Todos ellos harán de las suyas en la granja de los McGregor, lugar en cuyo jardín disponen de deliciosos vegetales. Pero la disputa de Peter con el Sr. McGregor se intensificará más que nunca ya que ambos compiten por el afecto de Bea, una amante de los animales de buen corazón. La fiesta animal ha empezado, y esto es solo el principio.",
    "titulo" : "Las travesuras de Peter Rabbit"
  },
  "Life: Vida Inteligente" : {
    "año" : "2017/03",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/6931443205c626ee9bf89206b1eb7e3c.jpg",
    "link" : "https://www.rapidvideo.com/e/FJ5HPXTGTP&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Una nueva entrega sobre viajes espaciales que despiertan siempre la curiosidad de los humanos y aveces no miden los peligros que podemos encontrar fuera de nuestro planeta. La historia se narra de la siguiente manera: seis miembros de la tripulación de la Estación Espacial Internacional que están a punto de lograr uno de los descubrimientos más importantes en la historia humana: la primera evidencia de vida extraterrestre en Marte. A medida que el equipo comienza a investigar y sus métodos tienen consecuencias inesperadas, la forma viviente demostrará ser más inteligente de lo que cualquiera esperaba. ¿Creen que alguien sobreviva?",
    "titulo" : "Life: Vida Inteligente"
  },
  "Logan" : {
    "año" : "2017/03",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/168d4d5025470a21a31427b3041729fe.jpg",
    "link" : "https://www.rapidvideo.com/e/FQ5BW1O40P&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Tenemos una nueva entrega de la gran franquicia de X-Men, en esta oportunidad nos centramos en el grandioso y sorprendente Logan, el cual se encuentra en nuevos dilemas que lo llevan a tomar decisiones que no pensaba volver a optar. De esta manera la película \"Logan\" nos brinda una gran dosis de acción para deleitarnos nuevamente. Mezclando acción, suspenso y los mas despampanantes efectos especiales esta entrega de nuestros amigos mutantes promete cumplir con todas las expectativas que podamos tener ya previstas, ademas nos mostrara una faceta no explorada de Logan (Hugh Jackman). Acompañando a nuestro personaje principal Logan (Hugh Jackman) podemos encontrar a otros mutantes los cuales hacen el equipo completo para poder tener un paquete lleno de emociones espontaneas que brotaran a lo largo de toda la visualización de este film, adicional mente podremos observar que no solo nos muestra el lado agresivo y fuerte de Logan (Hugh Jackman) sino también un aspecto que debemos conocer de su vida. Por otro lado podemos también ver la gran influencia que tiene en el valor de la amistada debido a que es el motor que desencadena en él la llama para luchar nueva mente sin importar las consecuencias futuras que se puedan presentar. Conozcamos un poco mas de el trama de Logan: ha pasado un año tras los eventos de \"X-Men: Days of Future Past\". Logan ha decidido no volver a usar sus poderes ni sus garras, pero cuando una malvada organización liderada por Nathaniel Essex intenta utilizar al resto de mutantes que quedan en el mundo, convirtiéndolos en armas para usar en su beneficio, Logan se verá obligado a volver a ser 'Wolverine' una vez más. Personalmente les recomiendo ver el film de principio a fin y no perder en ningún momento de vista detalles alucinantes en ninguna escena porque estos le darán el gran complemento. Les garantizo toda una mezcla de emociones gratificantes.",
    "titulo" : "Logan"
  },
  "Los Cuatro Fantásticos" : {
    "año" : "2015/08",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/9cf7d0af9e3c26ffb0b2e2763bd8796e.jpg",
    "link" : "https://www.rapidvideo.com/e/FHWR9KSPI2&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Tenemos el agrado de traerles esta tan esperada entrega que por cu gran dosis de ciencia ficción acompañada paralelamente por su dosis de comedia prometen ser la combinación perfecta para capturarnos de inicio a fin. Sue, Reed, Ben y Johnny son cuatro astronautas que en una misión en el espacio son expuestos a una radiación cósmica imprevista y como resultado consiguen superpoderes. Sue puede hacerse invisible, Reed adquiere super-elasticidad, Ben se convierte en roca y Johnny puede prenderse en fuego y volar. Así, se convierten en Los Cuatro Fantásticos: La Mujer Inivisible, Mr. Fantástico, La Cosa y La Antorcha Humana. Los invito a disfrutar del film, que promete mas que ser una entrega mas de superhéroes, sino ser ademas una entrega muy importante para el cine.",
    "titulo" : "Los Cuatro Fantásticos"
  },
  "Los Extraños: Cacería Nocturna" : {
    "año" : "2018/03",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "https://hdfilmologia.com/uploads/posts/2018-04/1524401030_55.jpg",
    "link" : "https://www.rapidvideo.com/e/FRMBDR8MKP&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "En esta ocasión, la historia nos acerca a una familia a la que la crisis económica le ha afectado seriamente y el padre ha perdido su trabajo y su casa. Tras hacer la mudanza se dirigen a casa de la abuela para quedarse allí ya que no tienen dinero suficiente para permanecer en un hotel. No obstante, como tienen que emprender un largo viaje deberán pasar la noche en un aparcamiento de camiones. Esa noche, la familia será atacada por tres extraños encapuchados en un macabro juego del gato y el ratón.",
    "titulo" : "Los Extraños: Cacería Nocturna"
  },
  "Los Indestructibles 3" : {
    "año" : "2014/08/13",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://www.fotogramas.es/var/ezflow_site/storage/images/peliculas/los-mercenarios-3/7054514-9-esl-ES/Los-mercenarios-3.jpg",
    "link" : "https://www.rapidvideo.com/e/FJR7NYW5OE&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "El grupo de los mercenarios, dirigidos por Barney, durante una misión en África, se encuentran frente a frente con Stonebanks, el otro miembro fundador del grupo, al que Barney creía muerto. Stonebanks es ahora un rico y despiadado traficante de armas que el gobierno de los EEUU quiere capturar con vida para llevarlo al tribunal internacional de la Haya.",
    "titulo" : "Los Indestructibles 3"
  },
  "Los Juegos del Hambre: En Llamas" : {
    "año" : "2013/11",
    "calidad" : "HD",
    "categoria" : "Accion/Drama",
    "img" : "http://www.fotogramas.es/var/ezflow_site/storage/images/peliculas/los-juegos-del-hambre-en-llamas/6152135-5-esl-ES/Los-juegos-del-hambre-En-llamas.jpg",
    "link" : "https://www.rapidvideo.com/e/FI5EC5DSLN&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Katniss Everdeen vuelve a casa sana y salva después de ganar los 74º Juegos del Hambre anuales junto a su compañero Peeta Mellark. Participar significa dejar atrás familia y amigos y hacer ambos el Tour de la Victoria por los diferentes distritos. A lo largo del camino, Katniss se da cuenta de que se está gestando una rebelión, pero en el Capitolio todo sigue bajo control: el Presidente Snow organiza los 75º Juegos del Hambre, El Vasallaje, una competición especial con una inesperada novedad que cambiará Panem para siempre.",
    "titulo" : "Los Juegos del Hambre: En Llamas"
  },
  "Los Juegos del Hambre: Sinsajo Parte 1" : {
    "año" : "2014/11",
    "calidad" : "HD",
    "categoria" : "Accion/Drama",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/c330ae7c24fc67e0f100901e32ec5cd0.jpg",
    "link" : "https://www.rapidvideo.com/e/FPU1S5B4KT&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Katniss Everdeen se encuentra en el Distrito 13 después de destrozar los Juegos para siempre. Bajo el liderazgo de la comandante Coin y el consejo de sus amigos más leales, Katniss extiende sus alas mientras lucha por salvar a Peeta Mellark y a una nación alentada por su valentía... Tercera y última entrega de la saga literaria \"Los juegos del hambre\" de Suzanne Collins, que se divide en dos películas.",
    "titulo" : "Los Juegos del Hambre: Sinsajo. Parte 1"
  },
  "Los Juegos del Hambre: Sinsajo Parte 2" : {
    "año" : "2015/11",
    "calidad" : "HD",
    "categoria" : "Accion/Drama",
    "img" : "http://es.web.img3.acsta.net/c_215_290/pictures/15/10/05/09/45/058912.jpg",
    "link" : "https://www.rapidvideo.com/e/FI5EE2G1HV&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "\"Los juegos del hambre: Sinsajo. Parte 2\" nos trae la impactante conclusión de la franquicia, en la que Katniss Everdeen (Jennifer Lawrence) se da cuenta de que ya no sólo está en juego su supervivencia, sino también el futuro. Con Panem sumida en una guerra a gran escala, Katniss tendrá que plantar cara al presidente Snow (Donald Sutherland) en el enfrentamiento final. Katniss, acompañada por un grupo de sus mejores amigos, que incluye a Gale (Liam Hemsworth), Finnick (Sam Claflin) y Peeta (Josh Hutcherson), emprende una misión con la unidad del Distrito 13, en la que arriesgan sus vidas para liberar a los ciudadanos de Panem y orquestan un intento de asesinato del presidente Snow, cada vez más obsesionado con destruirla. Las trampas mortales, los enemigos y las decisiones morales que aguardan a Katniss la pondrán en mayores aprietos que ninguna arena de Los Juegos del Hambre.",
    "titulo" : "Los Juegos del Hambre: Sinsajo. Parte 2"
  },
  "Los Minions" : {
    "año" : "2015/06",
    "calidad" : "HD",
    "categoria" : "Infantil",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/464a21710fe46b529c0bc932c9a55386.jpg",
    "link" : "https://www.rapidvideo.com/e/FRI8KREU6L&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Tenemos el agrado de presentarles este tan esperado estreno de que complementa la historia de los Minions, ademas de ser una historia llena de diversión y poder disfrutarla en familia nos asegura escenas mas cargadas de humor. La historia de Los Minions se remonta al principio de los tiempos. Los Minions empezaron siendo organismos amarillos unicelulares que evolucionaron a través del tiempo, poniéndose siempre al servicio de los amos más despreciables. Ante su incapacidad para mantener a esos amos con vida  desde el T. Rex a Napoleón , los Minions acaban sintiéndose solos y caen en una profunda depresión. No obstante, uno de ellos, llamado Kevin, tiene un plan. Acompañado por el rebelde Stuart y el adorable Bob, decide lanzarse al mundo en busca de un nuevo amo malévolo a quien sus colegas puedan seguir. El trío emprende un emocionante viaje para conseguir un jefe a quien servir, en realidad una jefa, la primera supervillana que jamás ha conocido el mundo, la terrible Scarlet Overkill (con la voz en V.O. de la oscarizada Sandra Bullock). Pasarán de la helada Antártida, a la ciudad de Nueva York en los años sesenta, para acabar en el Londres de la misma época, donde deberán enfrentarse al mayor reto hasta la fecha: salvar a la raza Minion de la aniquilación. Los invito a descubrir cada detalle del film y que juntos podamos saber cual es el desenlace de tan esperado estreno....",
    "titulo" : "Los Minions"
  },
  "Los Vengadores" : {
    "año" : "2012/04",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/8c4f9ce932f2ee56236f1043b2790e83.jpg",
    "link" : "https://www.rapidvideo.com/e/FRL6ZJEDTM&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "La seguridad del mundo esta en peligro debido a que un enemigo inesperado surge como una gran amenaza, es ahí cuando Nick Fury, el cual es el director de la Agencia SHIELD, tendrá que elegir los mejores exponentes para reclutarlos y conformar un equipo el cual tendrá como misión principal el salvar al mundo de un desastre casi seguro. Este film es una adaptación del cómic de Marvel “Los Vengadores” en donde veremos a héroes como Ironman, Hulk, Thor y el Capitán América entre otros.",
    "titulo" : "Los Vengadores"
  },
  "Los Vengadores 2: La Era de Ultrón" : {
    "año" : "2015/04",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/f21f34505b27fc35e6e8fc1c8a611fbc.jpg",
    "link" : "https://www.rapidvideo.com/e/FN984ITIW4&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Una entrega mas de la franquicia Marvel que nos lleva nuevamente al mundo de los Avengers y nos promete darnos una dosis incalculable de acción. Marvel Studios presenta 'Vengadores. La era de Ultrón', la épica continuación de la mayor película de superhéroes de todos los tiempos. Cuando Tony Stark intenta reactivar un programa durmiente de mantenimiento de la paz, las cosas se ponen feas y los Héroes Más Poderosos de la Tierra, que incluyen a Iron Man, Capitán América, Thor, El Increíble Hulk, la Viuda Negra y Ojo de Halcón, deberán ponerse a prueba ya que está en juego el destino del planeta. Con la aparición del villano Ultrón, corresponderá a Los Vengadores la tarea de impedir sus terroríficos planes. No tardarán en surgir extrañas alianzas y giros inesperados que poblarán de acción esta epopeya absolutamente única. ¿Quién luchara contra quien?, ¿Quién triunfara al final? y ¿Quien morirá?. Descubrelo....",
    "titulo" : "Los Vengadores 2: La Era de Ultrón"
  },
  "Los Vengadores: La Guerra del Infinito" : {
    "año" : "2018/04",
    "calidad" : "CAM",
    "categoria" : "Accion",
    "img" : "https://static.vix.com/es/sites/default/files/styles/large/public/a/avengers-infinity-war-poster-pelicula.jpg?itok=BSV45bYn",
    "link" : "https://www.rapidvideo.com/e/FRY9PS214K&q=360p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Thanos, el infame tirano intergaláctico, tiene como objetivo reunir las seis Gemas del Infinito, artefactos de poder inimaginable, y usarlas para imponer su perversa voluntad a toda la existencia. Los Vengadores y sus aliados tendrán que luchar contra el mayor villano al que se han enfrentado nunca, y evitar que se haga con el control de la galaxia. En su nueva e impactante aventura, el destino de la Tierra nunca había sido más incierto, las Gemas del Infinito estarán en juego, unos querrán protegerlas y otros controlarlas.",
    "titulo" : "Los Vengadores: La Guerra del Infinito"
  },
  "Los indestructibles" : {
    "año" : "2010/08/03",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://www.pelisplanet.com/wp-content/uploads/2017/04/los-indestructibles-210x300.jpg",
    "link" : "https://www.rapidvideo.com/e/FKB4TFTYNL&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Barney Ross es el líder de un grupo de hombres estrechamente unidos que viven al margen de la sociedad. Cuando el misterioso Sr. Church les ofrece un encargo que nadie más aceptaría, Barney y su equipo se embarcan en lo que parece ser una misión rutinaria: derrocar al general Gaza, el dictador asesino de la pequeña isla de Vilena, y poner fin a años de muerte y destrucción inflingidas a su gente. Pero las cosas no son lo que parecen y se verán atrapados en una peligrosa red de engaños y traiciones.",
    "titulo" : "Los indestructibles"
  },
  "Los indestructibles 2" : {
    "año" : "2012/08/17",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://allcalidad.com/wp-content/uploads/2016/05/1-551.jpg",
    "link" : "https://www.rapidvideo.com/e/FRSCMZX4B2&p=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Después de años de corrupción y asesinatos de rehenes, además de traiciones y mentiras en su política exterior, Estados Unidos, con la ayuda de otras naciones, arma en secreto un equipo con su personal militar más capacitado para derrocar a un dictador que ha causado estragos en un país de América latina durante más de 20 años. La misión principal del equipo es terminar con la vida del dictador, pero recibiendo poca ayuda de las naciones, que tratan de mantener en secreto la misión.",
    "titulo" : "Los indestructibles 2"
  },
  "Los juegos del hambre" : {
    "año" : "2012/03",
    "calidad" : "HD",
    "categoria" : "Accion/Drama",
    "img" : "http://www.labutaca.net/peliculas/wp-content/uploads/2011/04/los-juegos-del-hambre-cartel.jpg",
    "link" : "https://www.rapidvideo.com/e/FI5FPPLE42&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Lo que en el pasado fueron los Estados Unidos, ahora es una nación llamada Panem: un fastuoso Capitolio ejerce un control riguroso sobre los doce distritos que lo rodean y que están aislados entre sí. Cada distrito se ve obligado a enviar anualmente un chico y una chica entre los doce y los dieciocho años para que participen en los Hunger Games, que son transmitidos en directo por la televisión. Se trata de una lucha a muerte, en la que sólo puede haber un superviviente. Katniss Everdeen, una joven de dieciséis años, decide sustituir a su hermana en los juegos; pero para ella, que ya ha visto la muerte de cerca, la lucha por la supervivencia es su segunda naturaleza.",
    "titulo" : "Los Juegos del Hambre"
  },
  "Mad Max: Furia en la carretera" : {
    "año" : "2015/05",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://es.web.img3.acsta.net/r_1920_1080/pictures/15/04/06/12/54/095278.jpg",
    "link" : "https://www.rapidvideo.com/e/FO3S8BE5GQ&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Perseguido por su turbulento pasado, Mad Max cree que la mejor forma de sobrevivir es ir solo por el mundo. Sin embargo, se ve arrastrado a formar parte de un grupo que huye a través del desierto en un War Rig conducido por una Emperatriz de élite: Furiosa. Escapan de una Ciudadela tiranizada por Immortan Joe, a quien han arrebatado algo irreemplazable. Enfurecido, el Señor de la Guerra moviliza a todas sus bandas y persigue implacablemente a los rebeldes en una \"guerra de la carretera\" de altas revoluciones... Cuarta entrega de la saga post-apocalíptica que resucita la trilogía que a principios de los ochenta protagonizó Mel Gibson.",
    "titulo" : "Mad Max: Furia en la carretera"
  },
  "Marjorie Prime" : {
    "año" : "2017/08/18",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "https://pics.filmaffinity.com/marjorie_prime-943518512-large.jpg",
    "link" : "https://www.rapidvideo.com/e/FLH6EJFAQS&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Basada en una obra de Jordan Harrison. Ambientada en un futuro, en el que Marjorie, una anciana que había sido una reconocida violinista, lucha contra el paso del tiempo a medida que la memoria le empieza a fallar. Su alivio son unas proyecciones holográficas de las personas que ella quería y que han fallecido, y que tienen la forma en la que ella quiere recordarles. Marjorie pasa el tiempo con la proyección holográfica defectuosa de su marido fallecido cuando él estaba en los 30 y 40 años, y junto a su hija y su hijastro.",
    "titulo" : "Marjorie Prime"
  },
  "Maze Runner: Correr o Morir" : {
    "año" : "2014/09",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/cd14be382d1864f88b605a64ddc1181c.jpg",
    "link" : "https://www.rapidvideo.com/e/FIFNWUDZG0&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Año 2024. Cuando el joven Thomas despierta, se encuentra en un ascensor y no recuerda quién es. De pronto, el ascensor se detiene, las puertas se abren y una multitud de chicos lo recibe. Ha llegado al Claro, un lugar rodeado de altísimos muros con dos portones que todas las mañanas se abren y dan paso a un inmenso laberinto. De noche, las puertas se cierran y por el laberinto circulan unas aterradoras criaturas llamadas laceradores. Todo lo que ocurre en el Claro sigue unas pautas: al abrirse las puertas, algunos chicos salen a correr al laberinto para buscar una salida. Una vez al mes, el ascensor sube con un nuevo chico, nunca una chica... hasta ahora. Tras la llegada de Thomas, suena una alarma y el ascensor trae a otra persona. Es una chica, y en la nota que la acompaña pone: \"Ella es la última. No llegarán más\". Las cosas en el Claro empiezan a cambiar, y lo único en lo que Thomas puede pensar es en lo mucho que desea ser un corredor.",
    "titulo" : "Maze Runner: Correr o Morir"
  },
  "Maze Runner: La Cura Mortal" : {
    "año" : "2018/01",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://i2.wp.com/www.peliculastoday.com/wp-content/uploads/2018/04/El-corredor-del-laberinto-La-cura-mortal.jpg?fit=675%2C1000&ssl=1",
    "link" : "https://www.rapidvideo.com/e/FQA7M7NZ9I&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "En este final de saga, Thomas lidera a su grupo en una última misión. Deberán entrar en la legendaria Last City, un laberinto controlado por WCKD que puede llegar a ser el laberinto más mortífero de todos. Cualquier persona que lo supere obtendrá las respuestas a las preguntas y los protagonistas quieren saber lo que realmente sucede.",
    "titulo" : "Maze Runner: La Cura Mortal"
  },
  "Maze Runner: Prueba de Fuego" : {
    "año" : "2015/09",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/1be9aa27a62635c02901d3073b454929.jpg",
    "link" : "https://www.rapidvideo.com/e/FII6F8FH3R&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Thomas (Dylan O'Brien) y los demás clarianos tendrán que enfrentarse al mayor desafío de sus vidas: buscar pistas sobre la misteriosa y poderosa organización &quot;CRUEL&quot;. Esta aventura los llevará a &quot;La Quemadura&quot;, un apocalíptico lugar lleno de inimaginables obstáculos. Aliados con miembros de la Resistencia, tendrán que descubrir quiénes son los dirigentes de la secta y cuáles son sus planes.",
    "titulo" : "Maze Runner: Prueba de Fuego"
  },
  "Melanie: Apocalipsis Zombie" : {
    "año" : "2016/09/23",
    "calidad" : "HD",
    "categoria" : "Terror/Drama",
    "img" : "http://allcalidad.com/wp-content/uploads/2017/11/melanie-apocalipsis-zombi.jpg",
    "link" : "https://www.rapidvideo.com/e/FLR4YZ6C27&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "En un futuro distópico, la sociedad está asediada por una enfermedad contagiosa que convierte a las víctimas en insaciables zombis. La única oportunidad de la humanidad reside en un grupo de niños que son inmunes a los efectos de la pandemia. Los niños están refugiados en una base militar situada en un pueblo perdido de Inglaterra. Allí, los pequeños son estudiados, ya que son capaces de pensar y sentir a pesar de haber sido infectados, mientras los científicos buscan una cura. Una de esas niñas, Melanie, destacará por encima del resto, provocando que el futuro de la raza humana dependa de ella.",
    "titulo" : "Melanie: Apocalipsis Zombie"
  },
  "Mi Primer Combate" : {
    "año" : "2018/03",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "https://i2.wp.com/www.peliculastoday.com/wp-content/uploads/2018/04/Mi-primer-combate.jpg?zoom=2.625&fit=683%2C1024&ssl=1 ",
    "link" : "https://www.rapidvideo.com/e/FPWGQYISGM&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Una adolescente de Brooklyn curtida tras pasar por varias casas de acogida decide que si quiere encontrar a su padre biológico, tendrá que remover cielo y tierra, pero antes tendrá que enfrentarse a ellos, a los chicos.",
    "titulo" : "Mi Primer Combate"
  },
  "Mi Villano Favorito" : {
    "año" : "2010/07",
    "calidad" : "HD",
    "categoria" : "Infantil",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/51b8c0e3beaeea91f7adfe0325ec3802.jpg",
    "link" : "https://www.rapidvideo.com/e/FICSKJELAS&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Gru (voz de Steve Carell) es un deplorable hombre que esta planeando el crimen más asombroso de la Historia: robar la Luna. Persuadido por una malvada madre (voz de Julie Andrews), nada mas hallara un inconveniente en su camino: tres pequeñas huérfanas a las que tendrá que cuidar por un tiempo.",
    "titulo" : "Mi Villano Favorito"
  },
  "Mi Villano Favorito 2" : {
    "año" : "2013/07",
    "calidad" : "HD",
    "categoria" : "Infantil",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/929ed7d6a12155cce9c7df7a0312f257.jpg",
    "link" : "https://www.rapidvideo.com/e/FIE7G2UUW4&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Ahora que el emprendedor e incansable Gru ha decidido dejar atrás una vida dedicada a los crimenes para criar a Margo, Edith y Agnes, tiene muchisimo tiempo libre para disfrutarlo con ellas, los minions y el Dr. Nefario. Sin embargo, justo cuando comienza a adaptarse a su papel de padre de familia, una mundial organización ultrasecreta dedicada a la lucha contra el mal llama a su puerta. Ahora, con su compañera nueva de aventuras, Lucy Wilde, Gru deberá hallar quién es el responsable de un malévolo y espectacular plan y llevarlo hacia la justicia. Y es que se necesita la ayuda del mayor ex-villano del mundo para capturar a quien pretende ocupar ese lugar.",
    "titulo" : "Mi Villano Favorito 2"
  },
  "Mi Villano Favorito 3" : {
    "año" : "2017/06",
    "calidad" : "HD",
    "categoria" : "Infantil",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/5e0035e7b64184c7e73ca44a85099c7c.jpg",
    "link" : "https://www.rapidvideo.com/e/FRH38VVOD1&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Nuevas aventuras de Gru, Lucy, sus adorables hijas Margo, Edith y Agnes y por supuesto los Minions. En esta ocasión veremos como el gemelo de Gru, desparecido hace muchísimos años, emerge, lo que ocasionará una enorme rivalidad entre hermanos.",
    "titulo" : "Mi Villano Favorito 3"
  },
  "Milagros del Cielo" : {
    "año" : "2016/03/17",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "http://allcalidad.com/wp-content/uploads/2016/07/milagros-del-cielo.jpg",
    "link" : "https://www.rapidvideo.com/e/FHF61XFYAM&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "La joven Annabel Beam es una niña de diez años que padece un extraño e incurable trastorno digestivo. Su madre Christy hace todo lo que está en su mano para intentar ayudar a la pequeña, pero sin resultados. Tras un terrible accidente que casi ocasiona su muerte, Annabel supera su enfermedad gracias a un milagro que deja sin habla a su familia, los médicos y toda la comunidad.",
    "titulo" : "Los milagros del cielo Christy (Jennifer Garner) y Kevin (Martin Henderson) Beam son padres de tres niñas en un rancho de Texas. De repente, Annabel (Kylie Rogers), una de ellas, sufre un dolor insoportable que cada día se hace más frecuente. La niña de diez años padece un extraño e incurable trastorno gastrointestinal, que los doctores minimizan sin llegar a dar con la solución al problema. Su madre Christy hace todo lo que está en su mano para intentar ayudar a la pequeña, pero sin resultados. Tras un terrible accidente que casi ocasiona su muerte, Annabel supera su enfermedad gracias a un milagro que deja sin habla a su familia, los médicos y toda la comunidad."
  },
  "Misión Rescate (The Martian)" : {
    "año" : "2015/09/30",
    "calidad" : "HD",
    "categoria" : "Drama/Accion",
    "img" : "http://allpeliculas.com/source/movies/poster/tt3659388/thumbs/poster-5.jpg",
    "link" : "https://www.rapidvideo.com/e/FIED19ICNX&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "El astronauta Mark Watney, un botánico e ingeniero mecánico de la NASA, se ve atrapado en el planeta Marte cuando la tripulación del Ares 3 debe evacuar su lugar de aterrizaje ante una tormenta de arena. Sin su tripulación, se ve obligado a encontrar la forma de regresar a la Tierra y sobrevivir confiando en sus habilidades científicas y técnicas, antes de que se le agoten los suministros. Mientras que sus compañeros astronautas piensan que podría estar muerto, Watney comienza a escribir un diario divagando sobre el futuro, después de su muerte. Cuando la NASA descubre a través del satélite que Mark podría estar vivo, comienzan a trabajar sobre su rescate, ocultándoselo al resto del grupo.",
    "titulo" : "Misión Rescate (The Martian)"
  },
  "Monsters Inc" : {
    "año" : "2013/06",
    "calidad" : "HD",
    "categoria" : "Infantil",
    "img" : "https://hellhorror.com/images/inTheaters/origs/06a93-monsters-inc-poster_960_640_80.jpg",
    "link" : "https://www.rapidvideo.com/e/FKLPSV053S&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Desde que era pequeño, Mike Wazowski ha soñado con ser asustador y sabe que los mejores asustadores estudian en Monstruos University (MU). Pero durante su primer semestre en MU, los planes de Mike se desmoronan cuando se cruza con el listillo de James P. Sullivan, un asustador nato. El descontrolado espíritu competitivo de la pareja hace que los dos sean expulsados del programa de asustadores de la Universidad. Entonces se dan cuenta de que si quieren cumplir sus sueños, tienen que trabajar en equipo junto con un grupo de monstruos marginados.",
    "titulo" : "Monsters, Inc."
  },
  "Monsters University" : {
    "año" : "2013/06",
    "calidad" : "HD",
    "categoria" : "Infantil",
    "img" : "https://www.elmulticine.com/imagenes/carteles/3/monsters-university-post3-b.jpg",
    "link" : "https://www.rapidvideo.com/e/FO80MHY4EO&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Desde que era pequeño, Mike Wazowski ha soñado con ser asustador y sabe que los mejores asustadores estudian en Monstruos University (MU). Pero durante su primer semestre en MU, los planes de Mike se desmoronan cuando se cruza con el listillo de James P. Sullivan, un asustador nato. El descontrolado espíritu competitivo de la pareja hace que los dos sean expulsados del programa de asustadores de la Universidad. Entonces se dan cuenta de que si quieren cumplir sus sueños, tienen que trabajar en equipo junto con un grupo de monstruos marginados.",
    "titulo" : "Monsters University"
  },
  "Most Likely to Murder" : {
    "año" : "2018/03",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "https://i2.wp.com/www.peliculastoday.com/wp-content/uploads/2018/05/Most-Likely-to-Murder.jpg?fit=683%2C1024&ssl=1",
    "link" : "https://www.rapidvideo.com/v/FQY3RLH27F&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Billy, el que fuera el chico más popular del instituto, regresa a su ciudad natal 10 años después para descubrir que ya no es guay y la chica por la que aún tiene sentimientos ahora está saliendo con el ex-marginado del instituto. Cuando la madre del marginado muere bajo misteriosas circunstancias, Billy se obsesiona con probar que realmente fue asesinada por su hijo.",
    "titulo" : "Most Likely to Murder"
  },
  "Mudo" : {
    "año" : "2018/02",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://i2.wp.com/www.peliculastoday.com/wp-content/uploads/2018/02/Mudo.jpg?fit=691%2C1024&ssl=1",
    "link" : "https://www.rapidvideo.com/e/FOVBXYJI2X&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Cuando su novia desaparece, un hombre mudo (Alexander Skarsgård) se adentra en el sórdido submundo del Berlín de un futuro cercano (2056), donde sus acciones hablan sin necesidad de palabras.",
    "titulo" : "Mudo"
  },
  "Mujer Maravilla" : {
    "año" : "2017/05",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/95c1d1a174585129a9673a82f508e6a8.jpg",
    "link" : "https://www.rapidvideo.com/e/FJ6BFB0XBJ&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Antes de ser Wonder Woman era Diana, princesa de las Amazonas entrenada para ser una guerrera invencible. Diana ha sido criada en una isla paradisíaca protegida. Hasta que un día un piloto americano que tiene un accidente y acaba en sus costas le habla de un gran conflicto existente en el mundo. Diana decide salir de la isla convencida de que puede detener la terrible amenaza.",
    "titulo" : "Mujer Maravilla"
  },
  "Mujer en Llamas" : {
    "año" : "2017/08",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://assets.cinepolisklic.com/cmsklicia/movieimages/mujer-en-llamas/poster_resize_192X288.jpg",
    "link" : "https://www.rapidvideo.com/e/FMVMCZNMF6&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Cuenta la historia de una madre (Berry) que hace lo imposible por rescatar a su hija, que ha sido secuestrada en un centro comercial.",
    "titulo" : "Mujer en Llamas"
  },
  "Máquina de Guerra" : {
    "año" : "2017/05",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/4bc6009e25f48ef66db2a6cf69cb97fe.jpg",
    "link" : "https://www.rapidvideo.com/e/FQ5BURX13G&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "El general Stanley A. McChrystal estuvo al mando de la ISAF -Fuerza Internacional de Asistencia para la Seguridad- durante el conflicto armado en Afganistán. Cuando llegó al país asiático, su opinión sobre el presidente de Estados Unidos y algunas de sus acciones crearon gran controversia. Y así lo dio a conocer el periodista Michael Hastings, que estuvo junto al general y sus tropas durante el mes de abril de 2010, en un artículo escrito para la revista Rolling Stone. ¿Qué campañas llevó a cabo McChrystal? ¿Cuáles eran sus ideales?",
    "titulo" : "Máquina de Guerra"
  },
  "Más Rápido y más Furioso" : {
    "año" : "2003/06",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/1f1b9a10e8fd1e7a994e920fd471b119.jpg",
    "link" : "https://www.rapidvideo.com/e/FI4S3H0FL0&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Secuela de Rápido y furioso . Brian O'Conner (Paul Walker) es un agente del FBI caído en desgracia al ver su lealtad puesta a prueba en su anterior trabajo encubierto el mundo de las carreras ilegales de Los Angeles, la decisión de O’Connor le permitió conservar su honor, pero le hizo perder su insignia y toda posibilidad de rehabilitarse. Ahora ha pasado el tiempo, O’Connor está en otra ciudad y tiene una última oportunidad. A los federales de Miami les está costando mucho detener a Carter Verone (Cole Hauser), un empresario que utiliza su negocio como tapadera para un cartel internacional de blanqueo de dinero. Aduanas lleva un año sometiendo a Verone a una estricta vigilancia, y lo único que han podido establecer es su relación con las carreras callejeras ilegales. El tiempo se acaba, y los agentes deciden llamar a O'Conner para que haga lo que sabe hacer mejor que nadie: volver a infiltrarse entre los conductores. Pero este hombre individualista poco amigo de los reglamentos pone algunas condiciones para aceptar la misión que puede permitirle recuperar su insignia. El primero: trabajar con su amigo de infancia y antiguo delincuente Roman Pearce (Tyrese Gibson), otro enfermo de la velocidad.",
    "titulo" : "Más Rápido y más Furioso"
  },
  "Más allá de la Montaña" : {
    "año" : "2017/10",
    "calidad" : "HD",
    "categoria" : "Accion/Drama",
    "img" : "http://allcalidad.com/wp-content/uploads/2017/12/mas-alla-de-la-montana.jpg",
    "link" : "https://www.rapidvideo.com/e/FPDW91TY5C&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Más allá de la montaña Abandonados a su suerte después de un trágico accidente aéreo, Ben Bass (Idris Elba) y Alex Martin (Kate Winslet) son dos desconocidos que se enfrentarán al mayor reto de sus vidas: la supervivencia. Incomunicados y con Alex herida en una pierna, la pareja se verá obligada a confiar el uno en el otro, para sobrevivir a las inclemencias en una remota montaña cubierta de nieve. Cuando se den cuenta de que la ayuda no les va a llegar, emprenderán un complicado viaje a través de cientos de millas de tierras inhabitadas, alentándose mutuamente para soportar las dificultades, y dando origen a una inesperada atracción.",
    "titulo" : "Más allá de la Montaña"
  },
  "Más allá del Horizonte" : {
    "año" : "2017/12",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://allcalidad.com/wp-content/uploads/2018/03/beyond-skyline.jpg",
    "link" : "https://www.rapidvideo.com/e/FP0AO9XHAG&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Más allá del horizonte Esta película cuenta la historia de un detective que es duro de roer y que decide embarcarse en una peligrosa misión como es la de liberar a su hijo de las garras de unos peligrosos alienígenas.",
    "titulo" : "Más allá del Horizonte"
  },
  "No manches Frida" : {
    "año" : "2016/05/31",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "http://es.web.img3.acsta.net/r_1280_720/pictures/16/08/10/11/08/043634.jpg",
    "link" : "https://www.rapidvideo.com/e/FOJA0YOD0R&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "El asaltante de bancos Zeki Alcántara (Omar Chaparro) sale de prisión decidido a recuperar un dinero enterrado en un terreno baldío. Pero descubre que en el sitio han levantado el gimnasio de una escuela llamada Frida Khalo, y Zeki acepta un trabajo de profesor sustituto…",
    "titulo" : "No manches Frida"
  },
  "No se aceptan devoluciones" : {
    "año" : "2013/07/20",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "http://es.web.img3.acsta.net/r_1280_720/pictures/210/324/21032467_20130827203829388.jpg",
    "link" : "https://www.rapidvideo.com/e/FR6NBVMT5U&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Narra la historia de Valentín, mujeriego, soltero y egoísta que sorpresivamente tiene que hacerse cargo de su pequeña hija a la que no conocía, producto de una aventura ocasional. Decidido a devolver a la niña con su madre, emprende un viaje con ella a Los Angeles, pero la experiencia de convivir con su hija lo transforma en lo más íntimo.",
    "titulo" : "No se aceptan devoluciones"
  },
  "No soy un Hombre Facil" : {
    "año" : "2018/04",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "https://i0.wp.com/www.peliculastoday.com/wp-content/uploads/2018/04/No-soy-un-hombre-facil.jpg?fit=720%2C1024&ssl=1",
    "link" : "https://www.rapidvideo.com/v/FQKAQ9SDAG&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Un machista irredento prueba su propia medicina cuando despierta en un mundo dominado por mujeres y se enfrenta a una poderosa autora.",
    "titulo" : "No soy un Hombre Fácil"
  },
  "Noche de Juegos" : {
    "año" : "2018/02",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "https://cdn.flickeringmyth.com/wp-content/uploads/2018/01/Game-Night-poster-2-600x889.jpg",
    "link" : "https://www.rapidvideo.com/e/FR6NQN7T8H&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Un grupo de amigos queda todas las semanas para una noche de juegos organizada principalmente por uno de ellos, Brooks. En una de esas quedadas, el juego se convierte en realidad y estos amigos se ven envuelto en un asesinato real. Sarah, novia de uno de ellos crea un plan paralelo para esa noche que afectará principalmente a Brooks.",
    "titulo" : "Noche de Juegos"
  },
  "Nunca te vayas" : {
    "año" : "2017/04",
    "calidad" : "HD",
    "categoria" : "Drama/Terror",
    "img" : "http://allcalidad.com/wp-content/uploads/2018/01/berlin-syndrome.jpg",
    "link" : "https://www.rapidvideo.com/e/FNC9CKFSI5&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Nunca te vayas Clare (Teresa Palmer) es una fotógrafa australiana que se encuentra de vacaciones en Berlín. Allí conoce a Andi (Max Riemelt), un joven carismático que pronto se gana la atención de la chica. La atracción entre ambos es instantánea y terminan pasando la noche juntos. Sin embargo, Clare se despierta a la mañana siguiente sola y atrapada en el apartamento de Andi.",
    "titulo" : "Nunca te vayas"
  },
  "Pacific Rim 2" : {
    "año" : "2018/03",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://www.mubis.es/media/users/9192/198802/e5Gt2V-original.jpg",
    "link" : "https://www.rapidvideo.com/e/FRTMR937KG&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Un futuro cercano. Después de la primera invasión que sufrió la humanidad, la lucha aun no ha terminado. El planeta vuelve a ser asediado por los Kaiju, una raza de alienígenas colosales que emergen desde un portal interdimensional, con el objetivo de destruir a la raza humana. Ante esta nueva amenaza para la cual los humanos no están preparados, los Jaegers, robots gigantes de guerra pilotados por dos personas para sobrellevar la inmensa carga neural que conlleva manipularlos, ya no están a la altura de lo que se les viene encima. Será entonces cuando los supervivientes de la primera invasión, además de nuevos personajes como el hijo de Pentecost (John Boyega), tendrán que idear la manera de sorprender al enorme enemigo, apostando por nuevas estrategias defensivas y de ataque. Con la Tierra en ruinas e intentando reconstruirse, esta nueva batalla puede ser decisiva para el futuro.",
    "titulo" : "Titanes del Pacifico: La Insurrección"
  },
  "Paddington" : {
    "año" : "2014/11",
    "calidad" : "HD",
    "categoria" : "Infantil",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/ec895934ca093f876f92470cc4097f89.jpg",
    "link" : "https://www.rapidvideo.com/e/FOXJXOZE9X&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Paddington es un oso que ha crecido en lo más profundo de la selva peruana con su tía Lucy, que le ha inculcado el deseo de vivir en Londres. Cuando un terremoto destruye su hogar, Lucy esconde a su sobrino en un barco con destino a Inglaterra para que encuentre una vida mejor. Cuando el osito llega a la estación londinense de Paddington, se da cuenta de que nada tiene que ver con lo que se había imaginado, hasta que conoce a los Brown, una bondadosa familia británica que lo acoge en su casa. Sin embargo, después de un instante, una siniestra y atractiva taxidermista se fija en él, lo que supone una seria amenaza para su vida.",
    "titulo" : "Paddington"
  },
  "Paddington 2" : {
    "año" : "2017/11",
    "calidad" : "HD",
    "categoria" : "Infantil",
    "img" : "https://1.bp.blogspot.com/-TNHjWAeccsM/WfoNrCS8VVI/AAAAAAAAnaI/OHHvkF72fVIzDHtki1H_uAw0pthwMUsfACLcBGAs/s640/Paddington_2_Poster_2_Latino_JPosters.jpg",
    "link" : "https://www.rapidvideo.com/e/FQ9S2H1PDL&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "El oso Paddington ya está felizmente integrado en casa de la familia Brown. Se ha convertido además en un miembro muy popular de la comunidad de Windsor Gardens. Su tía Lucy cumple 100 años y él tiene el regalo perfecto para ella: un maravilloso libro pop-up de la tienda de antigüedades de Mr. Gruber. Para poder comprar el libro, Paddington decidirá realizar una serie de extraños trabajos. Pero todo se complica cuando el libro es robado.",
    "titulo" : "Paddington 2"
  },
  "Parque Jurásico 3 (Jurassic Park III)" : {
    "año" : "2001/08",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://i2.wp.com/www.peliculastoday.com/wp-content/uploads/2016/07/Jurassic-Park-3.jpg?fit=725%2C1024&ssl=1",
    "link" : "https://www.rapidvideo.com/e/FI8JGRF56B&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "El doctor Alan Grant, ansioso por conseguir fondos que financien su estudio sobre la inteligencia del velociraptor, acepta la oferta de pareja de millonarios, Paul y Amanda Kirby, para sobrevolar la Isla Sorna, en Puerto Rico, poblada por dinosaurios creados genéticamente para un parque recreativo. Tras producirse un aterrizaje forzoso en la isla, Alan descubre que los Kirby estaban buscando a su hijo adolescente, perdido en la isla tras un accidente de parapente.",
    "titulo" : "Parque Jurásico 3 (Jurassic Park III)"
  },
  "Pelea De Maestros" : {
    "año" : "2017/02",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/0607f5dcceeb99dc938a0471cfe57193.jpg",
    "link" : "https://www.rapidvideo.com/e/FO80OD0OXI&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Ice Cube y Charlie Day interpretan a dos profesores de colegio secundario preparados para resolver sus diferencias por las malas en la comedia “Fist Fight”, dirigida por Richie Keen (“It’s Always Sunny in Philadelphia”). En el último día del año, el amable profesor de inglés de colegio secundario Andy Campbell (Day) está haciendo lo posible para que no lo afecten las bromas por parte de los alumnos del último año, una administración disfuncional y cortes presupuestarios que ponen a los empleos en riesgo. Pero las cosas van de mal en peor cuando se cruza de forma accidental con un colega mucho más duro y temido, Ron Strickland (Ice Cube), quien desafía a Campbell a una pelea a la antigua al término de las clases. La noticia sobre aquella pelea se esparce rápidamente, y termina convirtiéndose en aquello que el colegio y el mismo Campbell necesitaban.",
    "titulo" : "Pelea De Maestros"
  },
  "Pequeña Gran Vida" : {
    "año" : "2018/01",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "https://3.bp.blogspot.com/-PiHQtjZPdNo/WgxSrPtekAI/AAAAAAAAnmk/2atPPq7Dr98MmbKFZZU8CDpereK42-ICgCLcBGAs/s640/Peque%25C3%25B1a_Gran_Vida_Poster_Latino_JPosters.jpg",
    "link" : "https://www.rapidvideo.com/e/FP5Y4M3NZA&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Naul Safranek es un tipo corriente de Omaha, que, junto a su mujer Audrey, sueña con una vida mejor. En un momento en el que el mundo se enfrenta a una crisis de superpoblación, los científicos descubren una solución radical que permitirá reducir a las personas a una altura de cinco pulgadas. La población no tarda en descubrir que el dinero da mucho más de sí en un mundo a escala reducida, y ante la promesa de un estilo de vida más lujoso del que nunca habían podido soñar, Paul y Audrey deciden correr el riesgo de someterse al controvertido tratamiento y embarcarse en una aventura que cambiará sus vidas para siempre.",
    "titulo" : "Pequeña Gran Vida"
  },
  "Perdido en la Fama" : {
    "año" : "2017/09",
    "calidad" : "HD",
    "categoria" : "Accion/Comedia",
    "img" : "http://allcalidad.com/wp-content/uploads/2018/04/gun-shy.jpg",
    "link" : "https://www.rapidvideo.com/e/FQO8LTQ4YR&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Perdido en la fama Basada en la novela homónima de Mark Haskell Smith. Turk Henry es una antigua estrella de rock con sobrepeso que viaja a Chile para disfrutar de unas vacaciones junto a su esposa, que será secuestrada por una banda de bucaneros que quiere financiar con el dinero del rescate su nuevo barco.",
    "titulo" : "Perdido en la Fama"
  },
  "Piratas del Caribe 1: La Maldición del Perla Negra" : {
    "año" : "2003/08",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/ee9a7105e37be7f224b20d9ea7d6ada0.jpg",
    "link" : "https://www.rapidvideo.com/e/FHV77FHCHU&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "En el mar Caribe, en el S. XVII, Jack Sparrow, de profesión pirata, ve tambalearse su vida idílica el día que su antiguo subordinado, el pérfido Barbossa, se amotina junto al resto de la tripulación y le roba su barco, la Perla Negra. Tiempo después, Sparrow llega a Port Royal, donde se topa con la hermosa hija del gobernador, Elizabeth Swann. Los acontecimientos se precipitan y, cuando Barbossa ataca por sorpresa la ciudad, Elizabeth es secuestrada. Will Turner, el herrero de la zona, y profundamente enamorado de ella, decide partir en su busca, y en su aventura cuenta con la ayuda del propio Sparrow, que ve una oportunidad para recuperar su preciada nave. Pero lo que tanto Sparrow como Will ignoran es que Barbossa y el resto de los piratas están malditos: cuando la Luna brilla se transforman en muertos vivientes. La clave para ponerle fin a su situación parece radicar en Elizabeth, y en su sangre...",
    "titulo" : "Piratas del Caribe 1: La Maldición del Perla Negra"
  },
  "Piratas del Caribe 2: El Cofre de la Muerte" : {
    "año" : "2006/07",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/1b4067bd67bb4bc8be1c4931434c214e.jpg",
    "link" : "https://www.rapidvideo.com/e/FJ6BOJQ6OD&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "El siempre excéntrico pirata Jack Sparrow se enfrentará de manera súbita a su pasado. Hace trece años, Jack firmó un pacto con Davy Jones, el señor de los siete mares, cuyos tentáculos y espíritu maléfico no tienen rival. A cambio de su alma, Jones prometió a Sparrow la capitanía de la Perla Negra, pero Sparrow no tiene ninguna intención de darle su alma ya que esto significa que se convertiría en uno de los miembros de su tripulación maldita, un fantasma con un físico tan repulsivo como aterrador. Para evitar este futuro funesto, solo existe una solución: encontrar el cofre maldito de Jones donde guarda prisioneras las almas...",
    "titulo" : "Piratas del Caribe 2: El Cofre de la Muerte"
  },
  "Piratas del Caribe 3: En el Fin del Mundo" : {
    "año" : "2007/05",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/008717b7e44bcba001a821c3624738d8.jpg",
    "link" : "https://www.rapidvideo.com/e/FQF1YP3V5Z&q=720p",
    "servidor" : "rapidvideo",
    "sinopsis" : "La edad de oro de los piratas llega a su fin. Incluso el terrorífico barco fantasma y su capitán maldito Davy Jones están al servicio de Lord Cutler Beckett y la Compañía inglesa de las Indias orientales. El invencible Holandés Errante navega ahora los siete mares, masacrando sin piedad piratas de todo el mundo y destrozando sus naves. Will Turner, Elizabeth Swann y el Capitán Barbossa solo tienen una oportunidad de resistir a Beckett y a su ejército destructor: deben reunir a los Nueve Señores de la Hermandad Pirata, pero uno de sus miembros más importantes, el Capitán Jack Sparrow, no aparece. Will, Elizabeth y Barbossa, secundados por Tia Dalma, Pintel y Ragetti, deben izar velas hacia mares orientales desconocidos para enfrentarse a un pirata chino, el Capitán Sao Feng, y hacerse con los mapas que les conducirán más allá de los límites del mundo conocido, donde Jack está retenido...",
    "titulo" : "Piratas del Caribe 3: En el Fin del Mundo"
  },
  "Piratas del Caribe 4: Navegando Aguas Misteriosas" : {
    "año" : "2011/05",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/d81d4619ee980955306c075283e4c247.jpg",
    "link" : "https://www.rapidvideo.com/e/FN60FT2SQG&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Johnny Depp vuelve a ponerse una vez más en la piel del pirata Jack Sparrow en esta divertida aventura que le llevará en busca de la legendaria Fuente de la Juventud. Sparrow se dará de bruces con una mujer que conoció en el pasado (Penélope Cruz), lo que le hará preguntarse si realmente le busca a él o a la fortuna que el alocado y excéntrico capitán está persiguiendo. Será entonces cuando capturados por el temible capitán Barbanegra (Ian McShane) se ven obligados a unirse a la tripulación del legendario Queen Anne’s Revenge e ir en busca de uno de los tesoros más preciados de la historia de la piratería.",
    "titulo" : "Piratas del Caribe 4: Navegando Aguas Misteriosas"
  },
  "Piratas del Caribe 5: La venganza de Salazar" : {
    "año" : "2017/05",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/48ed7ac91e804c901358499e47fa8ef7.jpg",
    "link" : "https://www.rapidvideo.com/e/FMY6YF05XA&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Johnny Depp regresa a la pantalla grande como el icónico e intrépido antihéroe Jack Sparrow en la nueva película PIRATAS DEL CARIBE: LA VENGANZA DE SALAZAR. Esta animadísima aventura encuentra al Capitán Jack pasando por una mala racha, con la sensación de que los vientos de la mala fortuna soplan fuertemente en su dirección cuando los letales marineros fantasmas, liderados por el aterrador Capitán Salazar (Javier Bardem), se escapan del Devil's Triangle empeñados en matar a todos los piratas del mar, en particular, a Jack.",
    "titulo" : "Piratas del Caribe 5: La venganza de Salazar"
  },
  "Power Rangers" : {
    "año" : "2017/03",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/dcc12856d6f0523410e254d16f5e9098.jpg",
    "link" : "https://www.rapidvideo.com/e/FMNHSA48BF&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "En esta entrega de la franquicia Power Ranger nos encontramos con una nueva generación de jóvenes que tomaran la posta para lucha por la justicia y vencer a las fuerzas malignas alienigenas. Para poder realizar tal azaña regresaron al lugar donde empezó todo a prepararse y poder llevar con responsabilidad todos los poderes de los que ahora son dueños. Día a día estarán presentes ante ellos muchísimas pruebas, pero juntos las podran superar satisfactoriamente dependiendo mucho de su trabajo en equipo. Tienen sobre sus hombros la responsabilidad de llevar en una pendiente creciente la franquicia Power Ranger pero lo harán de la mejor manera se los aseguro. No obstante debemos considerar que se mantendrán grandes aspectos ya establecidos excitosamente como los colores característicos y ademas también el uso de maquinas metálicas llamadas \"Surf\" los cuales le darán al film el característico toque especial que siempre tuvo. Con nuevos accesorios y otros accesorios remodelados tenemos todos claro que esta entrega es una de las mejores que se dieron, ademas recordemos que Power Ranger es un fenómeno mundial el cual nos cautivo y les puedo asegurara que también los cautivara a todos de la misma manera. Mesclando la mas alta tecnología y uniéndolo con el mas experimentado equipo humano tenemos este film que viene de la siguiente manera.... Billy, Zack, Kimberly, Trini y Jason son un grupo de adolescentes con las típicas preocupaciones de su edad. Pero todo cambia cuando, después de entrar en contacto con un extraño objeto, descubren que tienen superpoderes. De la noche a la mañana, se conviertenen en superhéroes, así que deciden aprovechar sus increíbles cualidades para salvar el mundo. Y es que, Angel Grove, la pequeña ciudad en la que viven, y el resto del planeta están en peligro por culpa de una amenaza alienígena. Los cinco jóvenes se convertirán entonces en los Power Rangers: Billy (RJ Cyler) será el ranger azul, Zack (Ludi Lin) se convertirá en el Ranger Negro, Kimberly (Naomi Scott) se transformará en la Ranger Rosa, Trini (Becky G.) será la Ranger Amarillo y Jason (Dacre Montgomery) el Ranger Rojo. Juntos tendrán que luchar contra la malvada villana alienígena Rita Repulsa (Elizabeth Banks), para evitar que la Tierra caiga en sus garras. Personalmente les garantizo que ver este film los regresara a los mejores años de su infancia para el publico que pudo ver las primeras temporadas y para los jóvenes los transportara a un mundo fantástico, en todo momento respiraremos un a dosis inmensa de acción que le dará el toque perfecto.",
    "titulo" : "Power Rangers"
  },
  "Psychokinesis" : {
    "año" : "2018/04",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://i0.wp.com/www.peliculastoday.com/wp-content/uploads/2018/04/Psychokinesis.jpg?fit=716%2C1024&ssl=1",
    "link" : "https://www.rapidvideo.com/v/FQQTC4XWL7&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Con sus recién adquiridos poderes sobrehumanos, un padre se dispone a ayudar a su hija, que está a punto de perder todo lo que da sentido a su vida.",
    "titulo" : "Psychokinesis"
  },
  "Puertas Abiertas" : {
    "año" : "2018/01",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "https://i1.wp.com/www.peliculastoday.com/wp-content/uploads/2018/01/Puertas-Abiertas.jpg?fit=680%2C1020&ssl=1",
    "link" : "https://www.rapidvideo.com/v/FNMX22JXHK&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Tras la muerte de su padre, el estudiante Logan Wallace (Dylan Minnette) y su madre Naomi (Piercey Dalton) desean retirarse por un tiempo. Una casa de vacaciones vacante en un pueblo neviscado semeja ser el sitio ideal para esto. La única pega: todos los domingos siempre y en todo momento se hacen citas de visualización, para lo que deben salir de la casa.",
    "titulo" : "Puertas Abiertas"
  },
  "Qué le Pasó a Lunes" : {
    "año" : "2017/08",
    "calidad" : "HD",
    "categoria" : "Drama/Accion",
    "img" : "https://3.bp.blogspot.com/-FzK_yHJrQs4/WrfcuEECzDI/AAAAAAAAF2o/A31GGB2wcBwHVAoe5VWBpm2ivQe-k_WmwCLcBGAs/s1600/f3b2d0d1c78dd40805cd2c315d124d38_thumb.jpg",
    "link" : "https://www.rapidvideo.com/e/FMTJ1YG7V6&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "La película nos llevará hasta un futuro donde las familias son obligadas a tener tan solo un único hijo debido a la superpoblación. Un grupo de siete hermanas gemelas idénticas deberá luchar contra el gobierno y contra ellas mismas cuando una de ellas desaparezca.",
    "titulo" : "¿Qué le Pasó a Lunes?"
  },
  "Rampage" : {
    "año" : "2018/04",
    "calidad" : "CAM",
    "categoria" : "Accion",
    "img" : "http://www.joblo.com/timthumb.php?src=/posters/images/full/rampage_ver2_xxlg.jpg&h=600&q=100",
    "link" : "https://www.rapidvideo.com/e/FQCOOY4GF1&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "El primatólogo Davis Okoye, un hombre que mantiene las distancias con otras personas, tiene un sólido vínculo con George, el extraordinariamente inteligente gorila de espalda plateada al que ha estado cuidando desde que nació. Pero cuando un experimento genético sale mal, este apacible simio se convierte en una enorme y embravecida criatura. Para empeorar más las cosas, pronto se descubre que existen otros animales con la misma alteración. Cuando estos depredadores alfa recién creados arrasan Norteamérica destruyendo todo lo que interpone en su camino, Okoye se une a un ingeniero genético sin prestigio para conseguir un antídoto y se abre paso en un cambiante campo de batalla, no solo para frenar una catástrofe mundial sino para salvar a la aterradora criatura que una vez fue su amigo.",
    "titulo" : "Rampage"
  },
  "Ready Player One" : {
    "año" : "2018/03",
    "calidad" : "CAM",
    "categoria" : "Accion",
    "img" : "https://cineactual.net/fotos/poster-ready-player-one.jpeg",
    "link" : "https://www.rapidvideo.com/e/FR5KKPOZN9&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Año 2045, el mundo está al borde del caos y del colapso. Sin embargo, la gente ha encontrado la salvación en OASIS, un enorme universo de realidad virtual creado por el brillante y excéntrico James Halliday. Cuando Halliday fallece, deja su inmensa fortuna a la primera persona que encuentre un huevo de Pascua digital que ha escondido en algún lugar de OASIS, desatando una competición que tiene enganchado al mundo entero. Cuando el joven e insólito héroe Wade Watts decide unirse a la competición, se ve inmerso en una vertiginosa caza del tesoro, controlada por el mundo real, en un universo fantástico de misterios, descubrimientos y peligros.",
    "titulo" : "Ready Player One"
  },
  "Resident Evil" : {
    "año" : "2002/06",
    "calidad" : "HD",
    "categoria" : "Accion/Terror",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/48b3748dfeaf84ac6ec6edfb4077ee08.jpg",
    "link" : "https://www.rapidvideo.com/e/FIGV8W9JYM&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "En un inmenso laboratorio subterráneo se realizan investigaciones ultrasecretas supervisadas por cientos de científicos atentos de que nada salga mal. Cuando suena la alarma, creen que se trata de un simple simulacro de evacuación. Pronto, llega el horror. Un virus altamente mortal se propaga a un ritmo imparable por los pasillos: en pocos minutos, acaba con toda vida humana.",
    "titulo" : "Resident Evil"
  },
  "Resident Evil 2: Apocalipsis" : {
    "año" : "2004/09",
    "calidad" : "HD",
    "categoria" : "Accion/Terror",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/87ba43818c3ace5bba5670443f6ee521.jpg",
    "link" : "https://www.rapidvideo.com/e/FL8J218QZ7&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Alice ha sobrevivido a la espantosa pesadilla que ha devastado el complejo científico ultrasecreto de la Corporación Umbrella, pero no es la única que lo ha conseguido... Un virus mortal ha azotado la ciudad de Raccoon y al parecer nada le puede escapar. Con un grupo de supervivientes, Alice, cuyo metabolismo se ha modificado misteriosamente, debe enfrentarse a lo peor. Si bien ganó nuevos poderes que la hacen más poderosa, sus sentidos se han multiplicados y su destreza es alucinante, puede que no sea suficiente... En su lucha, se une a ella Jill Valentine, un antiguo miembro de las fuerzas especiales de Umbrella. Juntas intentarán resolver los enigmas y enfrentarse a una fuerza maléfica, un enemigo absoluto que sigue todos sus pasos. ¿Su nombre? Némesis. ¿Su objetivo? Eliminar toda vida existente. Esta vez, huir no es suficiente. Hay que enfrentarse.",
    "titulo" : "Resident Evil 2: Apocalipsis"
  },
  "Resident Evil 3: Extinción" : {
    "año" : "2007/09",
    "calidad" : "HD",
    "categoria" : "Accion/Terror",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/3fac0f32e2d2bdcbf9b7dedb95fb85b2.jpg",
    "link" : "https://www.rapidvideo.com/e/FKJJMYWDPB&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "El virus experimental creado por la todopoderosa Corporación Umbrella destruyó a la raza humana, convirtiéndola en muertos vivientes ávidos de carne humana. Huyendo de las ciudades, Carlos, L.J., Claire, K-Mart, Betty y otros supervivientes se han echado a la carretera en un convoy armado con la esperanza de poder encontrar a otros seres humanos no infectados y llegar a Alaska, su última esperanza de tierra segura y sin infección. Alice, una joven sometida por Umbrella en el pasado a terribles experimentos biogenéticos que han modificado su ADN y la han dotado de capacidades sobrehumanas, los acompañara desde la sombra. En el laboratorio de Umbrella, el Dr. Isaacs los vigila. Está dispuesto a todo por encontrar a la que representa la realización definitiva de las investigaciones de la compañía, la única persona que hace posible la elaboración de un remedio: Alice. Si quieren tener una oportunidad, los supervivientes tienen que escapar a la vez de los muertos vivientes y de la Corporación Umbrella. Para Alice y sus compañeros de infortunio, el combate acaba de empezar.",
    "titulo" : "Resident Evil 3: Extinción"
  },
  "Resident Evil 4: La Resurrección" : {
    "año" : "2010/09",
    "calidad" : "HD",
    "categoria" : "Accion/Terror",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/d1e1ae8c3685aa7b9a911ce9868fdee0.jpg",
    "link" : "https://www.rapidvideo.com/e/FKBD8T2TXX&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Un mundo apocalíptico, el cual es-* atacado por una infección de virus que convierte a las víctimas en muertos vivientes. Alice (Milla Jovovich, El rostro del asesino, Resident Evil 5: La venganza) sigue luchando, día a día, contra la muerte. En este lugar inhóspito, Alice no se rinde y emprende en busca de más supervivientes. En el camino, se las verá con la Corporación Umbrella, contra la que tendrá que luchar. Junto con un viejo amigo, viajan a Los Ángeles porque un nuevo líder de la comunidad les asegura refugio. Al llegar, todo ha sido invadido por los muertos vivientes. ¿Conseguirán esta vez evitar el contagio viral para salvar a la humanidad?",
    "titulo" : "Resident Evil 4: La Resurrección"
  },
  "Resident Evil 5: La Venganza" : {
    "año" : "2012/09",
    "calidad" : "HD",
    "categoria" : "Accion/Terror",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/757991e1e61773dd8719e813cf23d901.jpg",
    "link" : "https://www.rapidvideo.com/e/FIJL85MKQE&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "El terrible virus desarrollado por la empresa de biogenética Umbrella Corporation continúa causando estragos en toda la Tierra, convirtiendo a la gente en legiones de muertos vivientes, hambrientos de carne humana. Alice (Milla Jovovich,'Los tres mosqueteros'), la última esperanza de nuestra especie, es secuestrada por esta organización. Cuando despierta en el corazón de los complejos industriales de Umbrella, comienza una investigación para desvelar sus más terribles secretos. Ahora más que nunca, guiada por su alto instinto de exploración, Alice continúa su lucha para cazar a los responsables de esta infección atroz. La cuenta atrás ha comenzado y la heroína perseguirá a estos villanos desde Tokio a Nueva York y desde Washington a Moscú, intentando no dejar títere con cabeza. En esta quinta entrega de 'Resident Evil', Alice contará con la ayuda de nuevos aliados y viejos amigos como Rain Ocampo (Michelle Rodriguez, 'Machete'), Barry Burton (Kevin Durand, 'Acero puro'), Jill Valentine (Sienna Guillory, CSI: Las Vegas) y Leon S. Kennedy (Johan Urb, '2012').",
    "titulo" : "Resident Evil 5: La Venganza"
  },
  "Resident Evil 6: Capitulo Final" : {
    "año" : "2016/12",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/555f1e8da38026ec6ce86e05bb15e955.jpg",
    "link" : "https://www.rapidvideo.com/e/FH97UQNCY6&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Tenemos con nosotros la ultima secuela de la gran saga Resident Evil la cual nos mostrara el desenlace de toda la historia, acompañemos a Alice en en los nuevos retos que experimentara. Alice (Milla Jovovich) es una de las últimas supervivientes del gran apocalipsis que vive la humanidad desde la primera expansión del Virus T, que ha supuesto enfrentarse a hordas de muertos vivientes. Nos encontramos inmediatamente luego de los acontecimientos ocurridos en Resident Evil: Venganza (2012). Tras la traición sufrida a su llegada a Washington DC a manos de Albert Wesker (Shawn Roberts), Alice tendrá que volver a Racoon City, es decir, al punto en el que se inició la expansión de este mortífero virus. Allí, la Corporación Umbrella está reuniendo fuerzas antes del ataque final a los últimos supervivientes del apocalipsis. En una carrera a contrarreloj, Alice tendrá que echar mano de viejos compañeros, además de un nuevo e inesperado aliado. Será una batalla repleta de acción contra hordas de zombis y nuevos monstruos mutantes. Entre haber perdido sus habilidades sobrehumanas y el inminente ataque de Umbrella, esta será la aventura más difícil de Alice para salvar a la humanidad, que está al borde de caer en el olvido. Nueva película de la saga Resident Evil, dirigida por Paul W.S. Anderson (Pompeya, Los Tres Mosqueteros, Death Race (La carrera de la muerte)) y protagonizada de nuevo por Milla Jovovich (Survivor, Guerra total (Cymbeline), Stone). Completan el reparto los actores Shawn Roberts (Receta para el amor, Una mujer peligrosa), Ali Larter (Legends, Héroes), Iain Glen (Juego de tronos, Espías desde el cielo) y Ruby Rose (xXx: The Return of Xander Cage, Orange Is the New Black). De principio a fin capturara su atención por la gran dosis de acción y ustedes piensan que es el fin....",
    "titulo" : "Resident Evil 6: Capitulo Final"
  },
  "Retiro Voluntario" : {
    "año" : "2017/06",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "http://allcalidad.com/wp-content/uploads/2018/02/retiro-voluntario.jpg",
    "link" : "https://www.rapidvideo.com/e/FO6312SE2B",
    "servidor" : "rapidvideo",
    "sinopsis" : "Retiro Voluntario Javier (Imanol Arias) está a punto de enfrentarse a la semana más importante de su vida. Este ejecutivo de una multinacional, un español expatriado en Buenos Aires, está convencido de que la eficiencia no está reñida con la cuestión humana. En lo profesional, deberá competir con su compañero de trabajo Sam (Hugo Silva), y en lo personal, todo cambiará con la repentina aparición de un misterioso hombre (Darío Grandinetti), que le acosará trastocando por completo sus planes, y hará de esos días su peor pesadilla.",
    "titulo" : "Retiro Voluntario"
  },
  "Rey Arturo: La leyenda de Excalibur" : {
    "año" : "2017/04",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://www.ecartelera.com/carteles/11300/11344/004_ekeak0.jpg",
    "link" : "https://www.rapidvideo.com/e/FHXFVABQWR&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Arturo es un joven intrépido que dirige a su pandilla por los callejones de Londonium. Tras sacar la espada de Excalibur, se verá obligado a tomar algunas duras decisiones. Junto a una misteriosa mujer llamada Guinevere, deberá aprender a manejar la espada, vencer a sus demonios y unir al pueblo para derrotar al tirano Vortigern, quien robó su corona y asesinó a sus padres antes de convertirse en rey.",
    "titulo" : "El Rey Arturo: La leyenda de Excalibur"
  },
  "Roxanne Roxanne" : {
    "año" : "2018/03",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "http://allcalidad.com/wp-content/uploads/2018/03/roxanne-roxanne.jpg",
    "link" : "https://www.rapidvideo.com/e/FPQMAP3FYW&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Roxanne Roxanne Esta película está ambientada a principios de la década de 1980 en el barrio de Queens de Nueva York, lugar en el que reside una adolescente de 14 años llamada Lolita Gooden, la que está a punto de convertirse en una de las estrellas del hip-hop, pese a que su familia quiere que se aleje de los peligros que supone sumergirse en esa parte de la industria musical. Roxane, Roxane está dirigida y escrita por Michael Larnell (Cronies), e interpetada por Mahershala Ali (Moonlight), Nia Long (Empire) y Meryl Jones Williams (Biophilia).",
    "titulo" : "Roxanne Roxanne"
  },
  "Rápidos y Furiosos" : {
    "año" : "2001/06",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/1381a3a6029ea2bb713b186cd795a5df.jpg",
    "link" : "https://www.rapidvideo.com/e/FI4RQQAAYI&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Una misteriosa banda de delincuentes se dedica a robar camiones en plena marcha desde vehículos deportivos. La policía decide infiltrar un hombre en el mundo de las carreras ilegales para descubrir posibles sospechosos. El joven y apuesto Brian entra en el mundo de las carreras donde conoce a Dominic, rey indiscutible de este mundo y sospechoso número uno, pero todo se complicará cuando se enamora de la hermana de Dominic.",
    "titulo" : "Rápidos y Furiosos"
  },
  "Rápidos y Furiosos 4" : {
    "año" : "2009/04",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/c91e695deb5509d4104367e304879d2b.jpg",
    "link" : "https://www.rapidvideo.com/e/FL0ME5Z3BZ&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "El fugitivo y ex preso Dom Toretto (Vin Diesel) y el detective Brian O’Conner (Paul Walker) vuelven a encontrarse en Los Ángeles y siguen llevándose igual de mal. Sin embargo, obligados a enfrentarse a un enemigo común, no les queda más remedio que unir sus fuerzas si quieren vencerle. Después del atraco a un convoy, los dos protagonistas descubrirán que si quieren vengarse, deberán llegar al límite de sus posibilidades al volante... Nueva entrega de la serie que volvió a contar con su -ahora ya famosos- 4 protagonistas originales, circustancia que resaltan en su original leyenda: \"Nuevo modelo. Piezas originales\".",
    "titulo" : "Rápidos y Furiosos 4"
  },
  "Rápidos y Furiosos 5: Sin Control" : {
    "año" : "2011/04",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/4b7695530c4b956798c7b3b5fc9e14dc.jpg",
    "link" : "https://www.rapidvideo.com/e/FQ04BJ0I5P&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Desde que Brian O'Conner (Paul Walker) y Mia Toretto (Jordana Brewster) sacaron a Dom Toretto (Vin Diesel) de la cárcel, se han visto obligados a huir y cruzar muchas fronteras para evitar a la policía. Atrapados en Río de Janeiro, una vez más tienen que darse a la fuga si quieren conservar la libertad. Pero los tres saben muy bien que la única posibilidad que tienen de poner fin a esta situación es enfrentarse de una vez por todas al empresario corrupto que quiere verlos muertos. Pero éste no es el único que les sigue la pista.",
    "titulo" : "Rápidos y Furiosos 5: Sin Control"
  },
  "Rápidos y Furiosos 6" : {
    "año" : "2013/05",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/47e43ea815d5c4f341794ee49d898915.jpg",
    "link" : "https://www.rapidvideo.com/e/FI5FO9FOXQ&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "La historia se centrará en que Dom, Brian y el resto de la grupo no terminan de sentirse completos tras salirse con la suya en ‘Fast Five’ y poder vivir a cuerpo de rey, pero lejos de su hogar. Esto Hobbs aprovechará para convencerlos a que le ayuden a detener a unos mercenarios del volante que están sembrando el caos en una docena de países. Hobbs les garantizá el perdón total por los delitos que hayan cometido con anteriodiad si logran acabar con ellos, pero la disputa se convertirá en algo personal cuando descubran que Letty, un antiguo amor de Dom, es la mano derecha del líder de esa otra organización.",
    "titulo" : "Rápidos y Furiosos 6"
  },
  "Rápidos y Furiosos 7" : {
    "año" : "2015/04",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/92f6adc28e2071e907670a6d1fd03f25.jpg",
    "link" : "https://www.rapidvideo.com/e/FR1VZ1NKS7&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Continuando con la gran historia en esta oportunidad les traemos un gran film esperado con muchas ansias por todos los fans, con una gran dosis de acción y aventura a la que ya nos tienen acostumbrados promete atraparnos de principio a fin. Después de haber vencido a Owen Shaw; Dominic Toretto, Brian O’Conner y el resto del equipo vuelven a Estados Unidos para llevar una vida normal, como siempre habían deseado. Pero Ian Shaw, hermano mayor de Owen, está en búsqueda de Dominic Toretto para cobrar venganza por la muerte de su hermano, lo que pone en peligro a todo el equipo. Al enterarse de la muerte de Han, la familia Rápidos y Furiosos se propone encontrar al hombre que mató a uno de los suyos, antes de que él los encuentre primero. Descubran el desenlace tan esperado, no se pierdan ningún detalle, cada segundo que pase provocara en ustedes emociones espectaculares, disfrútenla....",
    "titulo" : "Rápidos y Furiosos 7"
  },
  "Rápidos y Furiosos 8" : {
    "año" : "2017/04",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/220c752e8a9d2d262d3c5f6f57e408e6.jpg",
    "link" : "https://www.rapidvideo.com/e/FR1W0J95T0&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Después de tantas aventuras y acción. Brian y Mia se retiran del juego y los demás del equipo buscan una vida tranquila y común. Pero algo inesperado sucede ya que se entera todo el grupo de que Dom esta trabajando para una misteriosa mujer. Todo el equipo deberá detener a Dom para evitar un desastre mundial, y asimismo saber el motivo de su traición. Te animamos a ver esta película llena de acción y suspenso.",
    "titulo" : "Rápidos y Furiosos 8"
  },
  "Rápidos y Furiosos: Reto Tokio" : {
    "año" : "2006/06",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/d45ff2ee9165a6488c5dffba1292c5cd.jpg",
    "link" : "https://www.rapidvideo.com/e/FMMEHARHCQ&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Cuando amenazan con encarcelarle, le mandan fuera del país a pasar una temporada con su tío, un militar destinado en Japón, que vive en un diminuto piso en un barrio barato de Tokio. En el país donde nacieron la mayoría de los coches modificados, las simples carreras en la calle principal han sido sustituidas por el último reto automovilístico que desafía la gravedad, las carreras de \"drift\" (arrastre), una peligrosa mezcla de velocidad en pistas con curvas muy cerradas y en zigzag. En su primera incursión en el salvaje mundo de las carreras de \"drift\", Shaun acepta ingenuamente conducir un D.K, el Rey del Drift, que pertenece a los Yakuza, la mafia japonesa. Para pagar su deuda, no tiene más remedio que codearse con el hampa de Tokio y jugarse la vida.",
    "titulo" : "Rápidos y Furiosos: Reto Tokio"
  },
  "Samsón" : {
    "año" : "2018/02",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://i0.wp.com/www.peliculastoday.com/wp-content/uploads/2018/05/Sanson.jpg?fit=683%2C1024&ssl=1",
    "link" : "https://www.rapidvideo.com/e/FR38BPGXAG&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Después de perder el amor de su vida, un joven hebreo con una fuerza sobrenatural defiende a su pueblo, sacrificando todo para vengar su amor, su pueblo y su Dios.",
    "titulo" : "Samsón"
  },
  "Sandy Wexler" : {
    "año" : "2017/04",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/b7df6afa83f34dcd84f2e7aea6d270b4.jpg",
    "link" : "https://www.rapidvideo.com/e/FHHF5QNCRH&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Tenemos una entrega muy curiosa y peculiar con el gran Adam Sandler que nos muestra una historia cargada de una dosis de comedia extraordinaria a la que ya el protagonista nos tiene acostumbrados. Regresando a los años 90, Sandy Wexler es un manager de talentos que trabaja en Los Ángeles, y es representante con diligencia a un grupo de extrovertidos clientes. Su trabajo tendrá que pasar una prueba muy difícil cuando se enamora de una cliente nueva quien es Courtney Clarke, una cantante con un talento extraordinario. Los invito a disfrutar de esta tan agradable historia y podre divertirse con cada escena segundo a segundo....",
    "titulo" : "Sandy Wexler"
  },
  "Saw" : {
    "año" : "2004/10",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "https://vignette.wikia.nocookie.net/sawjuegodelmiedo/images/9/92/Saw-poster.jpg/revision/latest/scale-to-width-down/336?cb=20100923182350&path-prefix=es",
    "link" : "https://www.rapidvideo.com/e/FKJK3XDYNN&q=720p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Un hombre llamado Adam se despierta encadenado a un tubo oxidado dentro de una decrépita cámara subterránea. A su lado, se encuentra otra persona encadenada, el Dr. Lawrence Gordon. Entre ellos hay un hombre muerto con un revolver calibre 38 en su mano. Ninguno de los dos sabe por qué están allí, sólo poseen un casette con instrucciones que dice que el Dr. Gordon debe matar a Adam en ocho horas. Si falla, ambos morirán, junto a la esposa del Dr. y su hija. Recordando una investigación de asesinato llevada a cabo por un detective llamado Tapp, el Dr. Gordon descubre que él y Adam están siendo victimas de un psicópata conocido como Jigsaw. Sólo les quedan unas horas para desenredar el complicado rompecabezas en el que están inmersos. El asesino les ha dejado únicamente unas pistas y dos sierras de mano, demasiados débiles para cortar la cadena que los ata, pero suficientemente fuertes para cortar carne y huesos...",
    "titulo" : "Saw"
  },
  "Scary Movie" : {
    "año" : "2000/07/04",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "https://image.tmdb.org/t/p/w342/bvVmVFBVQLytK1H4TJTFdnhvf4T.jpg",
    "link" : "https://www.rapidvideo.com/e/FI7O5GRU0H&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Tras el asesinato de una bella estudiante, un grupo de adolescentes descubren que hay un asesino entre ellas. La heroína, Cindy, y su grupo de desconcertantes amigos, serán aterrorizados por un singular psicópata enmascarado que pretende vengarse de ellos por haberlo atropellado el pasado Halloween.",
    "titulo" : "Scary Movie"
  },
  "Scary Movie 2" : {
    "año" : "2001/07/04",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "https://imgc.allpostersimages.com/img/print/posters/scary-movie-2_a-G-6130220-0.jpg",
    "link" : "https://www.rapidvideo.com/e/FKJ7OVXIJJ&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "En esta ocasión los hermanos Wayans empiezan la historia con una satírica parodia de El Exorcista, mostrando a James Woods en el papel de un cura poco convencional, el padre McFelly, ocupado en salvar a una Natasha Lyonne de un espíritu de otro mundo. Entonces, retomando la historia donde la dejaron, los hermanos Wayans se vuelven a reunir de forma cómica con la heroína Cindy Campbell, convertida ahora en una buena estudiante universitaria. Un profesor loco la recluta a ella y a su grupo de compañeros deseosos de vivir aventuras y nuevas experiencias, para una salida de fin de semana bajo el pretexto de realizar un experimento científico. Mientras se desarollan las actividades del fin de semana, las continuas sorpresas mantienen la diversión siempre en marcha.",
    "titulo" : "Scary Movie 2"
  },
  "Scary Movie 3" : {
    "año" : "2003/10/24",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "https://image.tmdb.org/t/p/w300_and_h450_bestv2/jlzEF7sTseYDB9H5dN29YFZt5Na.jpg",
    "link" : "https://www.rapidvideo.com/e/FKJ7PB5UUP&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Después de haberlo pasado fatal -eso siempre según se mire- en las dos anteriores entregas, Cindy Campbell (Anna Faris) está dispuesta a salir adelante. Ahora es una guapa periodista que se propone encontrar una historia con la que poder destacar en un mundo tan duro como el del periodismo televisivo, en el que predomina la basura. Pero en su búsqueda se encuentra con que la Tierra está siendo amenazada por varios casos teroríficos que ponen los pelos de punta a cualquiera.",
    "titulo" : "Scary Movie 3"
  },
  "Scary Movie 4" : {
    "año" : "2006/04/13",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "https://i.pinimg.com/originals/f2/ce/41/f2ce41a3fa55e8aa5305f6fe39b2977b.jpg",
    "link" : "https://www.rapidvideo.com/e/FJVJNXGTFS&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Una nueva entrega de la franquicia que parodia los últimos títulos del cine americano. Esta vez, la ingenua Cindy Campbell (Anna Faris) intenta hacer carrera en la atención sanitaria a domicilio, y encuentra trabajo con una horripilante anciana que vive en una horripilante casa embrujada por una presencia fantasmal. Si a esto le añades un vecino guapetón y la amenaza de unos alienígenas que quieren dominar la tierra... el pelo rubísimo de Cindy se erizará presa del miedo más electrizante. Nuestra valiente heroína vuelve a sumergirse en la acción más enloquecida en su intento de descifrar los extraños mensajes que le llegan del más allá. Pero eso no le impide seguir buscando el amor en los sitios más inusitados y de salvar el mundo de la destrucción masiva.",
    "titulo" : "Scary Movie 4"
  },
  "Scary Movie 5" : {
    "año" : "2013/04/11",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "https://pics.filmaffinity.com/scary_movie_scary_movie_5-944165271-large.jpg",
    "link" : "https://www.rapidvideo.com/e/FJXKL3IGUM&q=720p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Después de que Charlie Sheen —que se interpreta a sí mismo— muera en mitad de una orgía con Lindsay Lohan —que también se interpreta a sí misma—, sus tres hijos pequeños desaparecen... Finalmente, los críos son encontrados en el bosque y entregados al hermano de Charlie (Simon Rex), un científico que trabaja con monos más listos que él, y a su mujer Jody (Ashley Tisdale), que no le gustan un pelo los niños. Y menos, unos niños que le destrozan constantemente la casa y le echan la culpa a un fantasma al que llaman Mamá... ¿Pero es esto de verdad una peli de terror?",
    "titulo" : "Scary Movie 5"
  },
  "Scream 1" : {
    "año" : "1996/10",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "https://static1.squarespace.com/static/581d373837c581a0038d7d8f/59db2e7e197aea8dd957223c/59db2e7e49fc2bc1e5539964/1507536511405/1d1ecc3a518d114a460e65a65dd55e4c--halloween-movies-scary-movies.jpg?format=300w",
    "link" : "https://www.rapidvideo.com/e/FO9JTDMR9J&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "En California, un peligroso asesino, disfrazado con una máscara, tiene aterrorizado a todo un barrio. Casey Becker (Drew Barrymore), una hermosa adolescente, está sola en la casa de sus padres. Se está preparando para ver una película de terror cuando suena el teléfono. Al otro lado, un asesino en serie la acosa y la obliga a jugar a un juego terrible: si responde mal a sus preguntas sobre películas de terror, matará a su novio… Sidney Prescott (Neve Campbell) sabe que es una de las víctimas en potencia del asesino de Woodsboro. Está muy asustada y ya no sabe en quién confiar. Entre Billy, su novio, su mejor amiga Tatum (Rose McGowan), su hermano Dewey, sus compañeros de clase Stuart y Randy, la periodista arribista Gale Weathers (Courteney Cox) y su cámara Kenny, siempre merodeando, y su padre aún ausente, ¿quién se esconde tras la máscara del asesino?",
    "titulo" : "Scream 1"
  },
  "Scream 2" : {
    "año" : "1997/12",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "https://ringostrack.com/bundles/soundtrackindex/img/cover/40905_scream-2.jpg",
    "link" : "https://www.rapidvideo.com/e/FO9JY1S6IR&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Phil Stevens y su novia Maureen Evans van a ver juntos la avant-première de la película “Puñalada”, inspirada en la matanza de la ciudad de Woodsboro el año anterior. La mayoría del público lleva el disfraz del asesino. Pero entre los fans entusiasmados se esconde un nuevo asesino que apuñala delante de todo el público a la pobre Maureen… Sidney Prescott, unas de las verdaderas supervivientes de la primera masacre, se ha matriculado en la universidad de Windsor para estudiar arte dramático con su amigo Randy. Pero con esta noticia, la joven se asusta y deja de confiar en la gente. Sobre todo porque el asesino actúa incluso en el campus: tiran a la joven Casey Cooper por una ventana tras haber recibido dos puñaladas. Para Sidney no hay duda: la pesadilla vuelve a empezar. ¿Pero quién se empeña en matarla? ¿Y por qué?",
    "titulo" : "Scream 2"
  },
  "Scream 3" : {
    "año" : "2000/02",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "http://es.web.img2.acsta.net/r_1920_1080/medias/nmedia/18/91/34/02/20449331.jpg",
    "link" : "https://www.rapidvideo.com/e/FO9M9QGY8T&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Cotton Weary, uno de los supervivientes de la matanza de la universidad de Windsor, vuelve tranquilamente a su casa tras finalizar el rodaje de la emisión diaria en la que trabaja. Suena el teléfono. Al otro lado, un fan…que resulta ser un peligroso asesino dispuesto a todo por encontrar a Sidney Prescott. La joven está escondida en una casa muy protegida para borrar los recuerdos traumatizantes de los que fue anteriormente la desgraciada heroína de las masacres perpetradas en Woodsboroo y Windsor. El tema sigue de moda y John Milton decide producir una tercera película, “Puñalada 3”, relatando las artimañas del misterioso asesino enmascarado. Pero, una vez más, la realidad supera a la ficción cuando una de las actrices principales es salvajemente asesinada en plató. El inspector Kincaid decide ponerse en contacto con los supervivientes de los primeros sucesos, el expolicía Dewey Riley, ahora asesor de “Puñalada 3”, la periodista Gale Weathers y Sidney. Pero pronto la oleada de asesinatos continúa. ¿Quién se empeña en destruir a Sidney? ¿La clave de este misterio no se remonta a los orígenes de toda esta historia?",
    "titulo" : "Scream 3"
  },
  "Scream 4" : {
    "año" : "2011/04",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "http://cdn.collider.com/wp-content/uploads/scream-4-movie-poster-03-large-405x600.jpg",
    "link" : "https://www.rapidvideo.com/e/FR39FO94PB&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Con terapia y ayuda, la joven Sidney Prescott (Neve Campbell) ha conseguido dejar atrás todas las muertes que contempló años atrás en su pueblo natal, Woodsboro. Es en este momento, convertida en una novelista de éxito, se ve obligada a volver a la población que tan malos recuerdos le trae para promocionar su último libro. El retorno de la chica traerá consecuencias imprevistas, ya que Ghostface empieza a sembrar el terror de nuevo entre los habitantes del lugar.",
    "titulo" : "Scream 4"
  },
  "Secuestro en Venice" : {
    "año" : "2017/06",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://imagenes.gatotv.com/categorias/peliculas/posters/secuestro_en_venice.jpg",
    "link" : "https://www.rapidvideo.com/e/FN8DD6BO1H&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Secuestro en Venice Steve Ford es un investigador privado de Los Ángeles. El mundo personal y profesional de Steve se entrelazan cuando Boddy, su querido perro, es secuestrado por una banda de gángsters. El investigador se enfrentará contra los hermanos Samoan en una lucha que mostrará lo lejos que puede llegar un hombre para volver a reunirse con su mascota.",
    "titulo" : "Secuestro en Venice"
  },
  "Sobrevivir a la Naturaleza" : {
    "año" : "2018/01",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://i2.wp.com/www.peliculastoday.com/wp-content/uploads/2018/04/Surviving-The-Wild.jpg?fit=667%2C1000&ssl=1",
    "link" : "https://www.rapidvideo.com/v/FQJBP01ZW2&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "En contra de los deseos de sus padres (que están en medio de un complicado divorcio), un niño roba las cenizas de su abuelo muerto y huye al desierto con su perro. El niño está decidido a cumplir los deseos moribundos de su amado abuelo y extender sus cenizas sobre una montaña remota. A lo largo del viaje, el niño y el perro están acompañados por el fantasma de su abuelo, quien los ayuda en su viaje.",
    "titulo" : "Sobrevivir a la Naturaleza"
  },
  "Solo el Fin del Mundo" : {
    "año" : "2016/09",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "http://allcalidad.com/wp-content/uploads/2018/02/solo-el-fin-del-mundo.jpg",
    "link" : "https://www.rapidvideo.com/e/FOHUPD22PZ&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Está basada en la obra de teatro del mismo nombre de Jean-Luc Lagarce. Narra el regreso a casa de Louis (Gaspard Ulliel), un escritor enfermo terminal que tras una larga ausencia vuelve a su ciudad natal para decirle a su familia que se está muriendo. La noticia despierta viejos resentimientos y crea discordia, impidiendo la empatía en un grupo de personas incapaces de escuchar y de amar.",
    "titulo" : "Solo el Fin del Mundo"
  },
  "Solo los Valientes" : {
    "año" : "2018/01",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "http://allcalidad.com/wp-content/uploads/2018/02/only-the-brave.jpg",
    "link" : "https://www.rapidvideo.com/e/FOCZLGG4QK&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Solo los valientes Los Granite Mountain Hotshots son un grupo de bomberos que tuvieron que enfrentarse a uno de los incendios más catastróficos de la historia, producido en un pueblo de Arizona, que acabó suponiendo la muerte de 19 miembros del cuerpo.",
    "titulo" : "Solo los Valientes"
  },
  "Spider-Man: De Regreso a Casa" : {
    "año" : "2017/06",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/c0d99a4e7fb65c2322946d922468678d.jpg",
    "link" : "https://www.rapidvideo.com/e/FJXPK8ZODG&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Spider-Man deberá hacer frente a un nuevo villano, El Buitre, contando con la ayuda de Tony Stark para gestionar sus capacidades ofensivas",
    "titulo" : "Spider-Man: De Regreso a Casa"
  },
  "Star Wars: El Ultimo Jedi" : {
    "año" : "2017/12",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://oyster.ignimgs.com/wordpress/stg.ign.com/2017/10/DLvAUShUIAASVox1.jpg",
    "link" : "https://www.rapidvideo.com/e/FQ4RJYCPVV&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "La historia se ambientará inmediatamente después de lo sucedido en Star Wars VII: El Despertar de la Fuerza, por lo que veremos como prosigue la épica aventura de Rey, Finn, Poe y el propio Luke Skywalker con decenas de interrogantes abiertos. ¿Se convertirá Rey en la nueva esperanza de la Fuerza como Jedi? ¿Será Luke el maestro de la joven del planeta Jakku a semejanza de lo que hizo Yoda en el Episodio V: El Imperio contraataca? ¿Cómo reaccionará Leia Organa a la muerte de Han Solo a manos de Kylo Ren? ¿Cómo ayudarán Poe y Finn a la Resistencia? Todo parece indicar que el fin de la paz está cerca, así que los escaso aliados que quedan deberán aunar sus fuerzas y vencer a la desconfianza y el temor de los que no han olvidado ni perdonado. La nueva aventura rescatará a viejos conocidos ya que los Maestros Jedi serán conscientes de que es el momento de pasar a la acción tras sentir un cambio en la Fuerza.",
    "titulo" : "Star Wars: El Ultimo Jedi"
  },
  "Suburbicon: Bienvenidos al Paraíso" : {
    "año" : "2017/12",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "http://allcalidad.com/wp-content/uploads/2018/01/suburbicon-bienvenidos-al-paraiso.jpg",
    "link" : "https://www.rapidvideo.com/e/FPP97Z645M&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Suburbicon: Bienvenidos al paraíso Finales de los años 50. En un acomodado barrio de las afueras de casas similares y espaciosas la vida es aparentemente perfecta y reina un ambiente apacible. Pero la armonía del lugar se viene abajo cuando una familia afroamericana se instala en una parcela. Es entonces cuando los vecinos comienza a organizar asambleas y luego pasan a la acción directa. Y es que este barrio no es tan idílico como parece y bajo sus tranquilas calles se esconde una realidad plagada de violencia, venganza y traición.",
    "titulo" : "Suburbicon: Bienvenidos al Paraíso"
  },
  "Tadeo Jones 2: El Secreto del Rey Midas" : {
    "año" : "2017/08",
    "calidad" : "HD",
    "categoria" : "Infantil",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/57b1c9ae9a0f5f81d09bc37e64b21185.jpg",
    "link" : "https://www.rapidvideo.com/e/FQDY2HB6CJ&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Tadeo Jones vuelve a la carga! Después de haber descubierto la ciudad perdida de Paititi y haber protegido el legendario tesoro de los incas de una malvada empresa criminal, Tadeo, Sara, Jeff y Belzoni están listos para protagonizar una nueva aventura. En esta ocasión, Tadeo y su equipo de inseparables compañeros se embarcarán en la búsqueda del collar de oro del Rey Midas, participando en una aventura a contracorriente para evitar que el malvado Jack Rackham y sus secuaces se hagan con la legendaria piez",
    "titulo" : "Tadeo Jones 2: El Secreto del Rey Midas"
  },
  "Temblores 6: Un día en el infierno" : {
    "año" : "2018/05",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://i2.wp.com/www.peliculastoday.com/wp-content/uploads/2018/04/Temblores-6-Un-dia-en-el-infierno.jpg?fit=724%2C1024&ssl=1",
    "link" : "https://www.rapidvideo.com/e/FQWFBBM8GJ&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "La secuela nos muestra a Burt Gummer y a su hijo Travis en una estación de investiagción remota, donde deberán enfrentarse a los Graboides, que han sido convertidos en armas vivientes.",
    "titulo" : "Temblores 6: Un día en el infierno"
  },
  "Tengo ganas de ti" : {
    "año" : "2012/09/21",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "http://www.pelisplanet.com/wp-content/uploads/2017/01/tengo-ganas-de-ti-209x300.jpg",
    "link" : "https://www.rapidvideo.com/e/FLX034OIS0&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Secuela de “Tres metros sobre el cielo”. La sexy Gin (Clara Lago) es el nuevo amor de Hache (Mario Casas), pero éste no puede olvidar a su antigua novia, Babi (María Valverde). Hache ha vuelto a casa tras pasar una temporada en Londres, alejado del recuerdo imborrable de aquel primer amor. Para poder reconstruir su vida y olvidar el pasado, Gin parece perfecta, pues es una chica de espíritu descarado, efervescente y vital que le hace creer que es posible revivir aquella magia. Pero tarde o temprano tendrá que encontrarse de nuevo con Babi…",
    "titulo" : "Tengo ganas de ti"
  },
  "Terminator Génesis" : {
    "año" : "2015/06",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://2.bp.blogspot.com/-1xPAjWrBOi0/VWuVxZu1KvI/AAAAAAAAE2o/81Wzh0oy9MI/s00/Terminator_G%25C3%25A9nesis_Nuevo_Poster_Latino_b_JPosters.jpg",
    "link" : "https://www.rapidvideo.com/e/FL1SVUC2VS&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Año 2032. La guerra del futuro se está librando y un grupo de rebeldes humanos tiene el sistema de inteligencia artificial Skynet contra las cuerdas. John Connor es el líder de la resistencia, y Kyle Reese es su fiel soldado, criado en las ruinas de una postapocalíptica California. Para salvaguardar el futuro, Connor envía a Reese a 1984 para salvar a su madre, Sarah de un Terminator programado para matarla con el fin de que no llegue a dar a luz a John. Pero lo que Reese encuentra en el otro lado no es como él esperaba.",
    "titulo" : "Terminator Génesis"
  },
  "The Amazing Spider-Man" : {
    "año" : "2012/06",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://vignette.wikia.nocookie.net/spiderman/images/f/f9/The_Amazing_Spider_Man_Poster.png/revision/latest/scale-to-width-down/323?cb=20131213215215&path-prefix=es",
    "link" : "https://www.rapidvideo.com/e/FII4WV0XP6&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Un estudiante de secundaria que fue abandonado por sus padres cuando era niño, dejándolo a cargo de su tío Ben (Martin Sheen) y su tía May (Sally Field). Como la mayoría de los adolescentes de su edad, Peter trata de averiguar quién es y qué quiere llegar a ser. Peter también está encontrando su camino con su primer amor de secundaria, Gwen Stacy (Emma Stone), y juntos luchan por su amor con compromiso. Cuando Peter descubre un misterioso maletín que perteneció a su padre, comienza la búsqueda para entender la desaparición de sus padres, una búsqueda que le lleva directamente a Oscorp, el laboratorio del Dr Curt Connors (Rhys Ifans), ex-compañero de trabajo de su padre. Mientras Spider-Man se encuentra en plena colisión con el alter-ego de Connors, el Lagarto, Peter hará elecciones que alterarán sus opciones para usar sus poderes y darán forma a un destino héroico.",
    "titulo" : "The Amazing Spider-Man"
  },
  "The Amazing Spider-Man 2: El Poder de Electro" : {
    "año" : "2014/04",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://allcalidad.com/wp-content/uploads/2016/04/1-61.jpg",
    "link" : "https://www.rapidvideo.com/e/FII7SE4T1G&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "La aparición de un nuevo y poderoso villano y el regreso de un viejo amigo provoca que Peter Parker crea que todos sus enemigos tienen una sola cosa en común: Oscorp.",
    "titulo" : "The Amazing Spider-Man 2: El Poder de Electro"
  },
  "The Discovery" : {
    "año" : "2017/03",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/2721dbc97fa1fe4da4715cd65036ab10.jpg",
    "link" : "https://www.rapidvideo.com/e/FJAHZH4VM6&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Este film nos carga de una gran dosis de romance, drama y ciencia ficción los cuales unidos a gran reparto que lo conforman nos aseguran una grandiosa experiencia. En esta película podemos ver hechos casi reales que aparece en la vida de muchas personas, ya que durante el transcurro el largometraje, mucha gente se suicida solo para descubrir que si hay un mundo después de la muerte, ademas aquí ya no piensan en un cielo o un infierno, solo en encontrar respuestas a sus dudas que los tiene cada vez mas confundidos. El Descubrimiento, En un futuro, tras demostrarse científicamente que hay vida después de la muerte, millones de personas de todo el mundo se suicidan para pasar a la otra vida. Un hombre y una mujer se enamoran mientras tratan de asimilar sus trágicos pasados y la verdadera naturaleza del más allá. Les aseguro que mas que una película muy impactante se llevaran con ustedes una sensación gratificante y placentera.",
    "titulo" : "The Discovery"
  },
  "The Post: Los Oscuros Secretos del Pentagono" : {
    "año" : "2018/01",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "https://1.bp.blogspot.com/-qS2sqPBGWVU/WjQqMLtQDPI/AAAAAAAAn64/k66GAjTLbfAusi2HFsh0el-TFGI443TkACLcBGAs/s640/The_Post_Poster_3_JPosters.jpg",
    "link" : "https://www.rapidvideo.com/e/FPZZYWZSPF&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "En junio de 1971, los principales periódicos de EE.UU., entre los que se encontraban The New York Times y The Washington Post, tomaron una valiente posición en favor de la libertad de expresión, informando sobre los documentos del Pentágono y el encubrimiento masivo de secretos por parte del gobierno, que había durado cuatro décadas y cuatro presidencias estadounidenses. En ese momento, Katherine Graham (Meryl Streep), primera mujer editora del Post, y el director Ben Bradlee (Tom Hanks) intentaba relanzar un periódico en decadencia. Juntos decidieron tomar la audaz decisión de apoyar al The New York Times y luchar contra el intento de la Administración Nixon de restringir la primera enmienda… Historia basada en los documentos del Post que recogían información clasificada sobre la Guerra de Vietnam. Su publicación generó un enorme debate sobre la libertad de expresión y acabó en una dura batalla legal ante el Tribunal Supremo.",
    "titulo" : "The Post: Los Oscuros Secretos del Pentagono"
  },
  "The Purge: Anarquía" : {
    "año" : "2014/07/14",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "http://104.236.196.111/imdb//media/poster_movies/72EUh4QSMkjmr3mP80BfMGjuOxw.jpg ",
    "link" : "https://www.rapidvideo.com/e/FJR7NIAR15&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Secuela de la película The Purge. La noche de las bestias (2013). En la película original, el gobierno de Estados Unidos permite que, durante una noche, cualquier acto vandálico sea legal. De esta forma intentan reducir el número de criminales, ya que las cárceles del país se encuentran saturadas. La idea surge de la teoría de que todo ser humano tiene maldad en su interior, maldad que en algún momento saldrá a la luz. En esta situación, las personas que tienen dinero tienen más posibilidades que las pobres, ya que estas últimas no tienen los medios necesarios para defenderse de los que les quieran hacer daño. Así, una pregunta sale a la luz: ¿Cómo poder sobrevivir a los criminales sin convertirse en uno?",
    "titulo" : "Anarchy: La Noche de las Bestias"
  },
  "The purge: La noche de las bestias" : {
    "año" : "2013/05/31",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "https://imagessl7.casadellibro.com/m/ig/7/2226077.jpg",
    "link" : "https://www.rapidvideo.com/e/FII7XU4TAB&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Año 2022. En una futura sociedad distópica, el régimen político vigente, llamado Nueva Fundación de los padres de América, ha decidido como medida catárquica implantar la \"purga anual\", una regla por la que una noche de cada año se puede cometer cualquier crimen, incluyendo asesinatos y violaciones, sin tener que hacer frente a las consecuencias ni responder ante la justicia. Así, cuando las viciadas nuevas reglas del mundo exterior amenacen su casa, los miembros de una familia verán su vida en peligro, en el transcurso de una terrorífica noche durante la cual todos se verán puestos a prueba para ver hasta dónde son capaces de llegar para protegerse.",
    "titulo" : "The purge: La noche de las bestias"
  },
  "Thor" : {
    "año" : "2011/04",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/feba0168189d0d2960c3631169b83994.jpg",
    "link" : "https://www.rapidvideo.com/e/FIFPC6D37I&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Thor es un poderoso pero arrogante guerrero cuyos imprudentes actos reavivan una antigua guerra. Como consecuencia, Thor es castigado a ser enviado a la Tierra, donde se ve obligado a vivir entre humanos. Cuando el villano más peligroso de su mundo envía a las fuerzas más oscuras de Asgard, Thor aprende lo que hace falta para ser un verdadero héroe, sobre todo cuando un temible enemigo aparece en nuestro mundo con la intención de conquistarlo.",
    "titulo" : "Thor"
  },
  "Thor 2: Un Mundo Oscuro" : {
    "año" : "2013/10",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/c1a5637dfdbbe109265bfad7e27007fc.jpg",
    "link" : "https://www.rapidvideo.com/e/FI1ISWSERX&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Thor es un poderoso pero arrogante guerrero cuyas temerarias acciones reinician una antigua guerra. Cómo castigo, Thor es arrojado a la tierra y obligado a vivir como un humano más. Una vez allí, THOR (Chris Hemsworth) aprende que es lo que conlleva ser un verdadero héroe cuando el villano más peligroso del mundo envía, para invadir a la tierra, a las fuerzas más oscuras.",
    "titulo" : "Thor 2: Un Mundo Oscuro"
  },
  "Thor: Ragnarok" : {
    "año" : "2017/10",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://i2.wp.com/www.peliculastoday.com/wp-content/uploads/2017/10/Thor-Ragnarok.jpg?fit=691%2C1024&ssl=1",
    "link" : "https://www.rapidvideo.com/e/FOK5BD9DKY&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Thor está preso al otro lado del universo sin su poderoso martillo y se enfrenta a una carrera contra el tiempo. Su objetivo es volver a Asgard y parar el Ragnarok porque significaría la destrucción de su planeta natal y el fin de la civilización Asgardiana a manos de una todopoderosa y nueva amenaza, la implacable Hela. Pero, primero deberá sobrevivir a una competición letal de gladiadores que lo enfrentará a su aliado y compañero en los Vengadores, ¡el Increíble Hulk!.",
    "titulo" : "Thor: Ragnarok"
  },
  "Titanes del Pacífico" : {
    "año" : "2013/07",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/6a49e7884d5c0917377d5ae60550be71.jpg",
    "link" : "https://www.rapidvideo.com/e/FICU86H4JU&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Cuando las legiones de criaturas monstruosas, conocidas como Kaiju, comienzan a subir desde el mar, empieza una guerra que acabará con millones de vidas, consumiendo todos recursos de la humanidad durante años y años. Para luchar contra el Kaiju, un tipo especial de arma fue creada: robots masivos, llamados Jaegers, que son controlados simultáneamente por dos pilotos cuyas mentes están conectadas en un puente neural. Pero incluso los Jaegers están resultando casi indefensos ante el Kaiju. Al borde de la derrota, las fuerzas de defensa de la humanidad no tienen más remedio que recurrir a dos improbables héroes-un ex piloto (Charlie Hunnam) y un aprendiz (Rinko Kikuchi)-que se unieron para conducir un Jaeger legendario pero aparentemente obsoleto del pasado. En conjunto, se erigen como la última esperanza de la humanidad contra esta apocalipsis.",
    "titulo" : "Titanes del Pacífico"
  },
  "Titanic" : {
    "año" : "1997/11",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "https://img.etsystatic.com/il/b3f323/1468271874/il_570xN.1468271874_bnvq.jpg?version=1",
    "link" : "https://www.rapidvideo.com/e/FJ6BR00SWV&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Durante las labores de recuperación de los restos del famoso trasatlántico Titanic, una anciana norteamericana se pone en contacto con la expedición para acudir a una plataforma flotante instalada en el Mar del Norte y asistir in situ a la recuperación de sus recuerdos. A través de su memoria reviviremos los acontecimientos que marcaron el siniestro más famoso del siglo XX: el hundimiento del trasatlántico más lujoso del mundo, la máquina más sofisticada de su tiempo, considerada «insumergible», que sucumbió a las heladas aguas del Atlántico en abril de 1912, llevándose consigo la vida de 1.500 personas, más de la mitad del pasaje. En los recueros de la anciana hay cabida para algo más que la tragedia, la historia de amor que vivió con un joven pasajero de tercera clase, un pintor aficionado que había ganado su pasaje al ganar a las cartas en una taberna de Southampton.",
    "titulo" : "Titanic"
  },
  "Todo el Dinero del Mundo" : {
    "año" : "2017/12",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "https://3.bp.blogspot.com/-ijP29KDwLYY/Wibr62BnnbI/AAAAAAAAn04/lasfn9y2g8sa5tyO5Ora9xoaN03Xq2GCQCLcBGAs/s640/Todo_el_Dinero_Del_Mundo_Poster_Latino_JPosters.jpg",
    "link" : "https://www.rapidvideo.com/e/FQ3QB65KC8&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Roma, 1973. Unos hombres enmascarados secuestran a un adolescente llamado Paul. Su abuelo, J. Paul Getty , es el hombre más rico del mundo, un magnate petrolero tan multimillonario como avaro. El secuestro de su nieto favorito no es razón suficiente para renunciar a parte de su fortuna. Gail es la persistente y tenaz madre de Paul para quien, al contrario que Getty, sus hijos son más importantes que su fortuna. La vida de su hijo depende de un tiempo que se acaba, y los secuestradores se muestran cada vez más determinados, inestables y violentos. Cuando Getty envía a su enigmático hombre de seguridad, Fletcher Chace, a velar por sus intereses, él y Gail se alían en una carrera contrarreloj que revelará el valor del amor frente al dinero.",
    "titulo" : "Todo el Dinero del Mundo"
  },
  "Tomb Raider" : {
    "año" : "2018/05/20",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://2.bp.blogspot.com/-2pjDwjWfftY/Wc1F2KamNgI/AAAAAAAAg28/CRSFGefseCwYco2nSmo5QYUU3ybTbFMOACLcBGAs/s640/Tomb_Raider_Movie_2017_Official_Teaser_Poster_JPosters.jpg",
    "link" : "https://www.rapidvideo.com/e/FRSKC0PQS5",
    "servidor" : "rapidvideo",
    "sinopsis" : "Siete años después de la desaparición de su padre, Lara Croft es una joven de 21 años que ha rechazado tomar las riendas del imperio empresarial de su progenitor. En lugar de eso, trabaja como mensajera en bicicleta mientras acude a clases en la universidad. Con el tiempo, la protagonista decide investigar la desaparición de su padre y viaja hasta la última localización en la que estuvo: una tumba en una isla de algún lugar de la costa de Japón. En su nueva aventura, en contra de todas las posibilidades y armada solo con su afilada mente, su fe ciega y su espíritu tenaz, Lara deberá aprender a llegar hasta límites insospechados a la vez que se aventura en lo desconocido. Si sobrevive, se ganará el nombre de Tomb Raider (saqueadora de tumbas).",
    "titulo" : "Tomb Raider"
  },
  "Transformers" : {
    "año" : "2007/07",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://allcalidad.com/wp-content/uploads/2016/05/1-146.jpg",
    "link" : "https://www.rapidvideo.com/e/FHYKCBBBWE&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Una guerra sin compasión opone desde tiempos inmemoriales a dos razas de robots extraterrestres: los Autobots y los crueles Decepticons. En juego: el dominio del universo. Durante los primeros años del S. XXI, el conflicto alcanza la Tierra y el joven Sam Witwicky (Shia LaBeouf, ‘Wall Street: El dinero nunca duerme’) quien compra un coche sin saber que el vehículo tiene vida propia. Pronto descubre a los Transformers, quienes le advierten del plan de los Decepticons y avisan de que ellos han venido a ayudar a los humanos. Sin embargo,  será Sam, sin saberlo, la última esperanza de la humanidad. Como cualquier adolescente, Sam solo ha conocido los problemas de su edad: el instituto.",
    "titulo" : "Transformers"
  },
  "Transformers 2: La Venganza de los Caídos" : {
    "año" : "2009/06",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://allcalidad.com/wp-content/uploads/2016/05/1-234.jpg",
    "link" : "https://www.rapidvideo.com/e/FKZPCWL0TX&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Transformers 2: La venganza de los caídos Han transcurrido dos años desde que Sam Witwicky salvara al universo de una batalla decisiva entre dos clanes rivales de robots extraterrestres. A pesar de sus proezas, Sam sigue siendo un adolescente preocupado por los problemas de la gente de su edad, robots gigantes aparte: pronto entrará en la universidad y debe separarse por primera vez en su vida de su novia Mikaela y de sus padres",
    "titulo" : "Transformers 2: La Venganza de los Caídos"
  },
  "Transformers 3: El Lado Oscuro de la Luna" : {
    "año" : "2011/07",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://allcalidad.com/wp-content/uploads/2016/04/transformers-3-el-lado-oscuro-de-la-luna.jpg",
    "link" : "https://www.rapidvideo.com/e/FHYO8T708D&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Tercera entrega de Transformers. En la Tierra, los Autobots y los Decepticons se ven envueltos en una peligrosa carrera espacial, entre los EE.UU. y la Unión Soviética, que podría desencadenar una guerra de tal magnitud que destruiría el planeta sin que ni siquiera los \"transformers\" pudieran impedirlo. Una vez más, Sam Witwicky se encuentra involuntariamente en medio del conflicto.",
    "titulo" : "Transformers 3: El Lado Oscuro de la Luna"
  },
  "Transformers 4: La Era de la Extinción" : {
    "año" : "2014/07",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://allcalidad.com/wp-content/uploads/2016/04/1-75.jpg",
    "link" : "https://www.rapidvideo.com/e/FKZPDQQOZ3&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Luego de una batalla en una gran ciudad, los Autobots terminan en la mira de un cazafortunas de otro mundo. Esta nueva amenaza, antigua y poderosa, pone a la Tierra en peligro. Optimus Prime y los Autobots combatirán junto a un nuevo grupo de humanos: un mecánico y su familia.",
    "titulo" : "Transformers 4: La Era de la Extinción"
  },
  "Transformers 5: El Último Caballero" : {
    "año" : "2017/07",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/233df9ce56a61917f1630c955c144a9b.jpg",
    "link" : "https://www.rapidvideo.com/e/FJM4BPXBMP&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "El último caballero rompe los mitos básicos de la franquicia de Transformers, y redefine lo que significa ser un héroe. Los seres humanos y los Transformers están en guerra, Optimus Prime se ha ido. La clave para salvar nuestro futuro está enterrada en los secretos del pasado, en la historia oculta de los Transformers en la Tierra. Salvar a nuestro mundo cae sobre los hombros de una improbable alianza: Cade Yeager (Mark Wahlberg); Bumblebee; Un lord inglés (Sir Anthony Hopkins); Y una profesora de Oxford (Laura Haddock). Llega un momento en la vida de todos cuando somos llamados a marcar la diferencia. En Transformers: El Último Caballero, los cazados se convertirán en héroes. Los héroes se convertirán en villanos. Sólo un mundo sobrevivirá: el suyo o el nuestro.",
    "titulo" : "Transformers 5: El Último Caballero"
  },
  "Tropa de Héroes" : {
    "año" : "2018/01",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/9ca0537d2971cfb409f1939bf067f1f3.jpg",
    "link" : "https://www.rapidvideo.com/e/FR13RMEU0B&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Unos agentes de la CIA y fuerzas especiales entran en Afganistán tras el 11 de septiembre para desmantelar a unas fuerzas talibanes. A finales del año 2001, poco después de los atentados del 11-S. Un equipo de soldados de élite de las Fuerzas Especiales, en colaboración con la C.I.A. y operativos de la Fuerza Aérea, unen sus fuerzas con la Alianza del Norte de Afganistán para derrotar a los talibanes gobernantes del país. Se trata de un cuerpo de élite entrenado para ser tanto guerrilleros como diplomáticos en tiempos de guerra. Tras conseguir introducirse en secreto en el país, este grupo de hombres encabezado por Mitch Nelson (Chris Hemsworth), es el encargado de poner en práctica una peligrosa misión. En las escarpadas montañas, deberán convencer al general Dostum (Navid Negahban) de la Alianza del Norte para unir fuerzas y combatir juntos a los talibanes y Al Qaeda. En esta arriesgada tarea no necesitarán tanques, ya que será una batalla a caballo. Película basada en el libro de no ficción Horse Soldiers (2009) de Doug Stanton. Este drama épico basado en hechos reales lo dirige Nicolai Fuglsig (Exfil) y cuenta con guión de Ted Tally (El silencio de los corderos) y Peter Craig (Los juegos del hambre: Sinsajo). Su reparto está formado por Chris Hemsworth (Thor: Ragnarok, Cazafantasmas), Michael Shannon (La forma del agua, Animales nocturnos), Michael Peña (Belleza oculta, Ant-Man), Navid Negahban (American Assassin, El francotirador), William Fichtner (Independence Day: Contraataque, El llanero solitario), Trevante Rhodes (Moonlight, Open Windows), Ben O'Toole (Detroit, Piratas del Caribe: La venganza de Salazar), Taylor Sheridan (Comanchería, Hijos de la anarquía) y la española Elsa Pataky (Fast & Furious 8, Londres: Distrito Criminal). También conocido con el nombre de \"12 Valientes\".",
    "titulo" : "Tropa de Héroes"
  },
  "Un Gesto Estúpido e Inútil" : {
    "año" : "2018/01",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "https://i0.wp.com/www.peliculastoday.com/wp-content/uploads/2018/01/Un-gesto-estupido-e-inutil.jpg?fit=683%2C1024&ssl=1",
    "link" : "https://www.rapidvideo.com/v/FNVRF4YCEH&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "El apogeo y la caída de la gaceta de humor National Lampoon y su cofundador Doug Kenney (interpretado por Will Forte) se relata en esta película biográfica dirigida por David Wain. Domhnall Gleeson, Joel McHale, Seth Green y Thomas Lennon coprotagonizan este conjunto de homenajes a los humoristas subversivos que cambiaron el panorama de la comedia estadounidense.",
    "titulo" : "Un Gesto Estúpido e Inútil"
  },
  "Un Jefe En Pañales" : {
    "año" : "2017/03",
    "calidad" : "HD",
    "categoria" : "Infantil",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/ffbd99827682ffe3b90f4a6d0407e5d3.jpg",
    "link" : "https://www.rapidvideo.com/e/FQV9D62JKV&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Tenemos con nosotros un gran flim de animación familiar el cual nos cuneta la historia de la familia de Tim, la cual tiene una vida ejemplar y feliz en todo momento, disfrutan tiempo juntos, tanto el con sus papas y sus papas con él. Pero un día algo inesperado sucede y llega un bebe muy curioso el cual lleva siempre un traje, esta bien peinado, lleva un reloj de oro y un portafolios, pero lo mas curioso es que presenta una actitud extraña. Tiempo después de haberle quitado la atención de sus padre a Tim el bebe Templeton reúne a los bebes del barrio y los trata de educar sobre el porque ya los bebes no reciben tanta atención como antes, siendo el problema las mascotas, es decir ellas roban toda la atención que antes se les daba a los bebes, pero como era de esperara los bebes no lo entienden y hacen cosas como es de esperar de bebes; pero tiempo después se unen y tratan de cumplir el cometido pero para esto Tim sigue molesto con el Bebe Templeton y lo descubre hablando por teléfono, luego el Bebe Templeton le explica que no es un bebe común y que esta en una misión la cual era recuperar la atención que los adultos dan a las mascotas y se la den a los bebes; Tim acepta ayudarlo solo con la condición de que el se valla al acabar con esto empiezan una gran mezcla de experiencias muy divertidas que nos mantendrán pegados de principio a fin. Podríamos decir de esta manera entonces que se trata de un peculiar bebé, que viste traje y corbata y lleva maletín, y su hermano Tim, de 7 años, tratarán de detener los malvados planes del director de la empresa Puppy Corporation. Personalmente es un film muy divertido para visualizarlo en familia, con una gran dosis de humor que les aseguro los divertirá a lo largo de toda la película y sobre todo que les sacara muchas sonrisas y carcajadas que los hará sentir de maravilla.",
    "titulo" : "Un Jefe En Pañales"
  },
  "Un Lugar en Silencio" : {
    "año" : "2018/04",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "https://4.bp.blogspot.com/-wJLCUJQ2upA/WsvgkVJtOkI/AAAAAAAAonc/viDV38fkAS0wqWUOa-0OwL0Xr583VbaqQCLcBGAs/s640/Un_Lugar_En_Silencio_Poster_Latino_2_JPosters.jpg",
    "link" : "https://www.rapidvideo.com/e/FRMKROQ1R5&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "ATENCION: La calidad del video es HD pero el audio es grabado.\n\n\nSigue la historia de una familia que vive en una casa en el bosque cuidándose de no emitir ningún sonido. Si no te escuchan, no pueden cazarte…",
    "titulo" : "Un Lugar en Silencio"
  },
  "Un viaje en el tiempo" : {
    "año" : "2018/05/20",
    "calidad" : "HD",
    "categoria" : "Infantil/Drama",
    "img" : "https://3.bp.blogspot.com/-WxWJccrlt7c/Wg8KqZsz0zI/AAAAAAAAnqE/1GLgdXgLU6IvWPk3XVtQjwT78rZYXAdFQCLcBGAs/s1600/Un_Viaje_en_el_Tiempo_Poster_2_Latino_JPosters.jpg",
    "link" : "https://www.rapidvideo.com/e/FROAVXZSAC&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Meg y su hermano Charles Wallace viajan junto a su amigo Calvin a través del tiempo y el espacio con el fin de llevar a cabo una importante misión: encontrar a su padre, un científico que ha desaparecido mientras trabajaba en un misterioso experimento del Gobierno llamado Teseracto. Los tres jóvenes emprenden una aventura a través del universo y en el trayecto encuentran nuevos planetas habitados por un sinfín de criaturas fantásticas.",
    "titulo" : "Un viaje en el tiempo"
  },
  "Una Cigueña en Apuros" : {
    "año" : "2017/05/11",
    "calidad" : "HD",
    "categoria" : "Infantil",
    "img" : "https://vignette.wikia.nocookie.net/doblaje/images/c/c3/17759816_10156072192798289_3116294346310704296_n.jpg/revision/latest?cb=20170408185623&path-prefix=es",
    "link" : "https://www.rapidvideo.com/e/FO0A6QHGA0&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Richard –un gorrión– ha sido adoptado y criado por una familia de cigüeñas, y está convencido de ser una de ellas. Pero surgen problemas cuando las cigüeñas, aves migratorias, parten hacia África para pasar el invierno. Richard quiere partir también, y empieza a hacer autostop por toda Europa, en autobús, tren, y barco, junto con un búho excéntrico y un periquito divertidísimo que canta disco, para demostrar a su familia de cigüeñas que él también es una de ellas.",
    "titulo" : "Una Cigueña en Apuros"
  },
  "Valerian y La Ciudad de los Mil Planetas" : {
    "año" : "2017/07",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/6b1b47a0b4bd8d598d27efff4fee1aed.jpg",
    "link" : "https://www.rapidvideo.com/e/FMQ57VGIH0&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "En el siglo veintiocho, Valerian (Dane DeHaan) y Laureline (Cara Delevingne) son un equipo de operativos singulares encargados de sostener el orden en todos y cada uno de los territorios humanos. Bajo la asignación del Ministro de Defensa, los 2 se embarcan en una misión a la pasmosa urbe de Alpha, una metrópolis en incesante expansión donde especies de todo el cosmos han convergido a lo largo de siglos para compartir conocimiento, inteligencia y etnias. Hay un misterio en el centro de Alpha…",
    "titulo" : "Valerian y La Ciudad de los Mil Planetas"
  },
  "Verdad o Reto" : {
    "año" : "2018/04",
    "calidad" : "CAM",
    "categoria" : "Terror",
    "img" : "https://2.bp.blogspot.com/-GKL0ZsGJRRA/WrKbRTu_zHI/AAAAAAAAogM/NXrUZycHByAhy5ql38yhO9cCiI12cHeSACLcBGAs/s640/Verdad_o_Reto_Poster_1_Latino_JPosters.jpg",
    "link" : "https://www.rapidvideo.com/e/FQORRXJYH7&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Un grupo de amigos comienza a jugar a “Verdad o atrevimiento”, pero rápidamente descubren que algo que empezó de forma inocente se ha vuelto peligroso. Si no siguen las normas o se niegan a jugar, serán poseídos por un demonio que les obligará a matar, a sí mismos o a los demás. El grupo tratará de hacerlo lo más seguro posible eligiendo siempre la verdad, pero el juego tomará el control y les forzará a realizar las pruebas más horribles que se puedan imaginar. Una vez que el juego empieza, los jugadores no podrán parar de jugar, por lo que la única forma de sobrevivir es pasarle el juego a otra persona.",
    "titulo" : "Verdad o Reto"
  },
  "Walk of Fame" : {
    "año" : "2017/03",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "https://ia.media-imdb.com/images/M/MV5BNTdkM2JkMzMtNmQ0NS00MTY4LTk3ZjgtYWM5ZDk1ZTFiNTEzXkEyXkFqcGdeQXVyNDg3MTQxOTg@._V1_SY1000_CR0,0,679,1000_AL_.jpg",
    "link" : "https://www.rapidvideo.com/e/FR382IGI9R&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Un grupo de aspirantes a actores y actrices se pone a las órdenes de un excéntrico e impredecible 'coach' de la interpretación.",
    "titulo" : "Paseo de la Fama"
  },
  "Whiplash" : {
    "año" : "2014/10",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "https://posterspy.com/wp-content/uploads/2015/01/WHIPLASHv4.png",
    "link" : "https://www.rapidvideo.com/e/FIJLZYLFDA&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "El objetivo de Andrew Neiman, un joven y ambicioso baterista de jazz, es triunfar en el elitista Conservatorio de Música de la Costa Este en el que estudia. Marcado por el fracaso de la carrera literaria de su padre, Andrew alberga sueños de grandeza. Terence Fletcher, un profesor conocido tanto por su talento como por sus rigurosos métodos de enseñanza, dirige el mejor conjunto de jazz del Conservatorio. Cuando Fletcher elige a Andrew y para formar parte del conjunto musical que dirige, cambia para siempre la vida del joven. La pasión de Andrew por alcanzar la perfección se convierte en obsesión, al tiempo que su despiadado profesor lo lleva al límite de su capacidad y de su salud mental.",
    "titulo" : "Whiplash"
  },
  "Wilson" : {
    "año" : "2017/03",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/af88d48530575fa180bcfdc6af27fa2f.jpg",
    "link" : "https://www.rapidvideo.com/e/FJ8Z4OED7U&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Wilson (Woody Harrelson) es un cuarentón patético, algo neurótico y solitario, bastante desastroso, y también un misántropo. Eso sí, resulta un tipo entrañable al que le coges cariño. Un buen día descubre que su ex mujer Pippi (Laura Dern) tuvo una hija suya y la dio en adopción. Hoy la chica es una adolescente. Así que, a pesar del tiempo transcurrido, Wilson decide ponerse en contacto con su antigua pareja para juntos conocer a esa chica.",
    "titulo" : "Wilson"
  },
  "Winchester" : {
    "año" : "2018/02",
    "calidad" : "HD",
    "categoria" : "Terror",
    "img" : "https://noescinetodoloquereluce.com/wp-content/uploads/2017/12/CARTEL-WINCHESTER.jpg",
    "link" : "https://www.rapidvideo.com/e/FQIJBPISIC&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "A finales del siglo XIX, después de la trágica muerte de su marido y su hijo, Sarah construye una casa-fortaleza (la Mansión Winchester, conocida como la mansión más misteriosa del mundo) con un objetivo: mantener a raya a los espíritus de las personas fallecidas por un rifle Winchester, que, según dice, la visitan con demasiada frecuencia. Eric Price llega allí con el objetivo de psicoanalizar a la señora Winchester, descubriendo que los fantasmas que la atormentan pueden no ser producto de su locura...",
    "titulo" : "Winchester"
  },
  "Wolverine Inmortal" : {
    "año" : "2013/07",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/91b3450b82589949eddd1002f038b6eb.jpg",
    "link" : "https://www.rapidvideo.com/e/FIKFY17FDT&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Un Logan amnésico investiga su pasado en el mundo del crimen organizado japonés. Vulnerable por primera vez y desafiando sus límites físicos y emocionales, no sólo se enfrentará al letal acero samurái, sino que además mantendrá una lucha interna contra su inmortalidad, que lo hará más fuerte. Esta película es conocida también con el nombre de X-Men: Wolverine 2.",
    "titulo" : "Wolverine Inmortal"
  },
  "X-Men" : {
    "año" : "2000/07",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://i.pinimg.com/564x/5e/8d/9e/5e8d9e4fe18182bd790a272111661733.jpg",
    "link" : "https://www.rapidvideo.com/e/FKES8MCHT1&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "En un futuro cercano, la humanidad comienza a ver aparecer una nueva raza; los mutantes. Dotados de extraños y variados poderes, están agrupados en dos bandos: los que abogan por la integración y el entendimiento con la humanidad, encabezados por el doctor Charles Xavier, y los que buscan el enfrentamiento con una raza que consideran inferior y que les odia, dirigidos por Magnus, alias Magneto, un peligroso mutante con extraordinarios poderes.",
    "titulo" : "X-Men"
  },
  "X-Men 2" : {
    "año" : "2003/04",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://www.cineycine.com/archivos/2014/05/x-men-2-poster.jpg",
    "link" : "https://www.rapidvideo.com/e/FLUW1TNCCW&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Los mutantes son seres humanos con alguna variación genética que les dota de características especiales. También son la más moderna minoría perseguida del mundo. En medio de un clima de rabia y persecución, el profesor Xavier ha creado un instituto, un refugio, para estos seres poderosos. En este lugar los iniciados son preparados para aceptar y dominar sus habilidades, y ponerlas al servicio de la tolerancia y el combate contra la creciente histeria colectiva que está amenazando con su existencia. Pero la reputación de los mutantes será todavía peor cuando uno de ellos lanza un devastador ataque, lo que conlleva causas una pública recriminación hacia todos ellos y nuevos poderes para la Mutant Registration Act y William Stryker, un líder militar que pretende acabar con todos ellos centrándose en la escuela de X-Men.",
    "titulo" : "X-Men 2"
  },
  "X-Men Origins: Wolverine" : {
    "año" : "2009/04",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://i.pinimg.com/564x/9a/fe/c3/9afec340b8662d609c40f71049389c4e.jpg",
    "link" : "https://www.rapidvideo.com/e/FKER5LMT1W&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Precuela de la película X-Men. Situada 17 años antes, narra los inicios del arma X y la forma en la que Lobezno se convirtió en mutante. Logan (Hugh Jackman), convertido en un mutante que se hace llamar Lobezno, y que es capaz de sacar unas afiladas garras y de una fuerza y agilidad sobrehumana, ultima su venganza contra Victor Creed (Liev Schreiber), culpable de la muerte de su novia. Mientras tanto, otros mutantes se acogen al programa X para unir sus fuerzas.",
    "titulo" : "X-Men Origins: Wolverine"
  },
  "X-Men: Apocalipsis" : {
    "año" : "2016/05",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://vignette.wikia.nocookie.net/doblaje/images/9/99/X-Men_Apocalipsis_Poster_Final_Latino_JPosters.jpg/revision/latest?cb=20160414180200&path-prefix=es",
    "link" : "https://www.rapidvideo.com/e/FHZW3IDD77",
    "servidor" : "rapidvideo",
    "sinopsis" : "Desde los albores de la civilización, fue adorado como un dios. Apocalypse, el primer y más poderoso mutante del universo X-Men de Marvel, acumuló los poderes de muchos otros mutantes, convirtiéndose en inmortal e invencible. Pero al despertar tras miles de años, se encuentra desilusionado con el mundo en que se encuentra y decide reclutar un equipo de mutantes poderosos, entre ellos a un descorazonado Magneto (Michael Fassbender), con el fin de limpiar la humanidad y crear una nueva orden mundial, sobre la cual él reinará. A medida que el destino de la tierra está en juego, Raven (Jennifer Lawrence) con la ayuda del Profesor X (James McAvoy) se unirán junto a un equipo de jóvenes X-Men para detener a su mayor enemigo y salvar así a la humanidad de la destrucción total.",
    "titulo" : "X-Men: Apocalipsis"
  },
  "X-Men: Días del futuro pasado" : {
    "año" : "2014/05",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://www.lahiguera.net/cinemania/pelicula/4767/x_men_dias_del_futuro_pasado-cartel-5526.jpg",
    "link" : "https://www.rapidvideo.com/e/FIKGXIYQ80&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Ambientada en la década de los 70, los miembros de la famosa Patrulla X tendrán que evitar un futuro apocalíptico en el que los mutantes luchan por sobrevivir en campos de concentración controlados por los temibles Centinelas. Para ello, los héroes del universo Marvel deberán unificar sus fuerzas dejando a un lado la creciente enemistad de los bandos liderados por Charles Xavier y Magneto. Trask Industries, la empresa encargada de crear a estos gigantescos cazamutantes, será el origen de todos sus problemas. Tan sólo viajando en el tiempo podrán impedir la masacre que se avecina. ¿Serán capaces nuestros héroes de derrocar a la multinacional y evitar así el exterminio de su especie?",
    "titulo" : "X-Men: Días del futuro pasado"
  },
  "X-Men: La Decisión Final" : {
    "año" : "2006/05",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://vignette.wikia.nocookie.net/marvel-movies/images/8/82/X_Men_La_Decisi%C3%B3n_Final_P%C3%B3ster.jpg/revision/latest?cb=20130811160723&path-prefix=es",
    "link" : "https://www.rapidvideo.com/e/FKERCP9KYH&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "En X-Men: La decisión final, el último capítulo de la trilogía cinematográfica de los \"X-Men\", hay una \"cura\" para los mutantes que amenaza con alterar el curso de la historia. Por primera vez, los mutantes pueden elegir: seguir con su singularidad, aunque eso les aísle y les separe, o renunciar a sus poderes y convertirse en seres humanos normales. Los opuestos puntos de vista de los líderes mutantes, Charles Xavier, que aboga por la tolerancia, y Magneto, que cree en la supervivencia de los más aptos, se ven sometidos a la prueba definitiva: desencadenar la guerra que pondrá fin a todas las guerras...",
    "titulo" : "X-Men: La Decisión Final"
  },
  "X-Men: Primera Generación" : {
    "año" : "2011/05",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "http://es.web.img2.acsta.net/r_1920_1080/pictures/16/02/12/13/16/029261.jpg",
    "link" : "https://www.rapidvideo.com/e/FK4IO57Q37&q=360p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Comienzo de la saga de los X-Men, esta es una historia secreta que alude a conocidos acontecimientos mundiales. Antes de que los mutantes se mostraran al mundo, y antes de que cambiaran sus nombres por los de Profesor X y Magneto, Charles Xavier (James McAvoy) y Erik Lehnsherr (Michael Fassbender) eran dos jóvenes que descubrían sus poderes. No había animadversión alguna entre ellos, sino que les unía una sincera amistad y la decisión de acabar con el trabajar juntos y entrenar a un grupo de jóvenes mutantes para evitar el Armagedón nuclear. Su enemigo común: el malvado Sebastian Shaw (Kevin Bacon), un humano con poderes con el que Erik tiene una cuenta pendiente.",
    "titulo" : "X-Men: Primera Generación"
  },
  "Y Nadie más que Tú" : {
    "año" : "2018/02",
    "calidad" : "HD",
    "categoria" : "Drama",
    "img" : "https://i1.wp.com/www.peliculastoday.com/wp-content/uploads/2018/02/Y-nadie-mas-que-tu.jpg?fit=683%2C1024&ssl=1",
    "link" : "https://www.rapidvideo.com/v/FOK1CASRL1&q=360p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Los recién prometidos Abbie y Sam han sido los respectivos amores de sus vidas desde el colegio. Cuando el futuro que imaginaban se trunca trágicamente, su relación se enfrenta a una prueba definitiva.",
    "titulo" : "Y Nadie más que Tú"
  },
  "Yo soy Simón" : {
    "año" : "2018/05/20",
    "calidad" : "HD",
    "categoria" : "Drama/Comedia",
    "img" : "https://4.bp.blogspot.com/-qj82R32soAQ/Wivr0abOZYI/AAAAAAAAn3U/ORNABFhIyR06B6TJldsn8Qe2MAQM5w1pwCLcBGAs/s00/Yo_Soy_Simon_Poster_Teaser_Latino_Argentina_JPosters.jpg",
    "link" : "https://www.rapidvideo.com/e/FRSK5H8IOK&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Todos merecen una gran historia de amor. Pero para Simon Spier, de diecisiete años, es un poco más complicado: todavía no le ha dicho a su familia y amigos que es homosexual y que en realidad no conoce la identidad del compañero de clase anónimo del que se ha enamorado online. Resolver ambos problemas puede resultar hilarante, aterrador y por supuesto te puede cambiar la vida.",
    "titulo" : "Yo soy Simón"
  },
  "Zootopia" : {
    "año" : "2016/02/11",
    "calidad" : "HD",
    "categoria" : "Infantil",
    "img" : "https://vignette.wikia.nocookie.net/disney/images/4/48/Zootopia-Poster.jpg/revision/latest?cb=20160921210422&path-prefix=es",
    "link" : "https://www.rapidvideo.com/e/FM8UVGDNPO&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "La moderna metrópoli mamífera de Zootrópolis es una ciudad absolutamente única. Está compuesta de barrios con diferentes hábitats como la lujosa Sahara Square y la gélida Tundratown. Es un crisol donde los animales de cada entorno conviven, un lugar donde no importa lo que seas. De hecho puedes ser cualquier cosa, desde un elefante enorme hasta la musaraña más diminuta. Pero cuando llega la optimista agente Judy Hopps, descubre que ser la primera conejita de un cuerpo policial compuesto de animales duros y enormes no es nada fácil. Pero está decidida a demostrar su valía y se mete de cabeza en un caso, a pesar de que eso significa trabajar con Nick Wilde, un zorro parlanchín y estafador, para resolver el misterio.",
    "titulo" : "Zootopia"
  },
  "version" : {
    "actual" : "1.1.3",
    "enlace" : "http://www.mediafire.com/file/rqcz8mjmzdc4ejv/Film_v1.1.3.apk"
  },
  "xXx" : {
    "año" : "2002/08",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://imgc.allpostersimages.com/img/print/posters/xxx-movie-vin-diesel-poster-print_a-G-8758934-0.jpg",
    "link" : "https://www.rapidvideo.com/e/FK6HUG8QRF&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Xander Cage es XXX, un antiguo ganador de X-Games y atleta profesional de deportes de extremo, que sobrevive vendiendo videos de sus increíbles hazañas, las cuales hacen emitir adrenalina por todo el cupero. Pero después de incontables encuentros con la ley, su mundo está a punto de tomar un rumbo aún más extremo... Porque Xander no sabe que ha sido \"espiado\" por Augustus Gibbons, un agente veterano de la Agencia Nacional de Seguridad que se encuentra en una desesperada situación en la distante ciudad de Praga, en donde su operativo secreto ha sido asesinado por una pandilla de mafiosos con un estilo muy propio, que se llaman así mismos Anarchy 99, encabezados por el brutal ex-Comandante del Ejército Ruso Yorgi.",
    "titulo" : "xXx"
  },
  "xXx 2: Estado de emergencia" : {
    "año" : "2005/04",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://i.pinimg.com/564x/04/54/25/045425e80e5679d86749ef10b50eae1d.jpg",
    "link" : "https://www.rapidvideo.com/e/FK6HJ6IHNX&q=720p",
    "servidor" : "rapidvideo",
    "sinopsis" : "El viento del cambio político corre por los pasillos del Capitolio cuando el popular presidente se convierte en el objetivo de asesinato de un grupo radical de disidentes integrado en el gobierno de los Estados Unidos. Sólo dos personas se mantienen entre la anarquía y la libertad: Una de ellas, Augustus Gibbons, ha conseguido sobrevivir a un golpe en el cuartel general secreto de la Agencia de Seguridad Nacional y se ha dado a la fuga. El otro, un soldado condecorado de las fuerzas de Operaciones Especiales, Darius Stone, se encuentra bajo estrecha vigilancia en una prisión militar. Gibbons necesita una vez más a alguien de fuera y Stone es su hombre.",
    "titulo" : "xXx 2: Estado de emergencia"
  },
  "xXx: Reactivado" : {
    "año" : "2017/01",
    "calidad" : "HD",
    "categoria" : "Accion",
    "img" : "https://static.pelisfox.tv/static/movie/cover/original/7f6272316b0ed79183f957c840f6c0e4.jpg",
    "link" : "https://www.rapidvideo.com/e/FOBSI9IKLD&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Tenemos con nosotros una gran cantidad de acción que nos remontara a la primera película que comenzó el fenómeno y ahora disfrutaran y sentirán emociones indescriptibles. En esta tercera entrega de esta gran saga, nos trae de regreso al extremo atleta Xander Cage quien seguirá la pista de Xiang, un guerrero enredado en una conspiración que parece dirigirse a las más grandes esferas del gobierno mundial, tendrá una aventura contra el tiempo para intentar salvar a de lugar una siniestra arma y al parecer imparable. Es por eso que con un renovado equipo de aventureros adictos a la adrenalina, serán reclutados por el. Tendrán una gran dosis de acción que los transportara a la sorprendente realidad del film y la disfrutaran de inicio a final.",
    "titulo" : "xXx: Reactivado"
  },
  "¡Game Over, tío!" : {
    "año" : "2018/03",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "https://i1.wp.com/www.peliculastoday.com/wp-content/uploads/2018/03/Game-Over-Man.jpg?fit=692%2C1024&ssl=1",
    "link" : "https://www.rapidvideo.com/v/FPONI3XDVJ&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "3 amigos, un juego creado por ellos y alguien presto a invertir dinero en ellos. Todo semeja perfecto hasta el momento en que el benefactor es secuestrado por unos terroristas ¿Qué va a pasar ahora? ¿Qué va a hacer este conjunto de amigos? 3 amigos están a puntito de conseguir financiación para su juego en el momento en que unos terroristas raptan a su benefactor.A lo largo de una celebración de la ciudad de Los Ángeles llena de estrellas, 3 ceros se transforman en héroes (algo de esta manera) cuando el hotel en el que trabajan es tomado como rehén por los malos. De los autores de Workaholics, esta comedia de acción viene bloqueada y súper cargada el veintitres de marzo.",
    "titulo" : "¡Game Over, tío!"
  },
  "¿Y donde está el fantasma? 2" : {
    "año" : "2014/06/26",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "http://1.bp.blogspot.com/-3UlUMffd__U/UswbSuEYbsI/AAAAAAAATI0/gqj6-gWNPDM/s1600/Y_D%C3%B3nde_Est%C3%A1_El_Fantasma_2_Nuevo_Poster_Latino_JPosters.jpg",
    "link" : "https://www.rapidvideo.com/e/FIRRIAVTR3&q=480p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Malcolm (Marlon Wayans) decide recomponer su vida tras haber perdido a su amada Kisha en un accidente de tráfico, y se casa con Megan, madre de dos niños. Sin embargo, las cosas dejan de ser tan tranquilas como eran últimamente, y los sucesos paranormales vuelven a la vida de Malcolm.Fuerzas misteriosas atacan tanto a los niños de Megan como a la casa donde habitan, y el horror vuelve a aparecer en el día a día del protagonista. No obstante, las cosas aún pueden hacerse más complicadas: resulta que Kisha ha vuelto a la vida de entre los muertos, y se acomoda en el mismo vecindario en el que vive su marido con su nueva familia.",
    "titulo" : "¿Y donde está el fantasma? 2"
  },
  "¿Y dónde está el fantasma?" : {
    "año" : "2013/04/18",
    "calidad" : "HD",
    "categoria" : "Comedia",
    "img" : "http://www.demasiadocine.com/wp-content/uploads/2013/02/y-donde-esta-el-fantasma-posterlat.jpg",
    "link" : "https://www.rapidvideo.com/e/FLYOVA3LGQ&q=360p",
    "servidor" : "rapidvideo",
    "sinopsis" : "Una joven pareja, Malcolm (Marlon Wayans) y Kisha (Essence Atkins), se acaban de mudar a la casa de sus sueño. Al instalarse, descubren que no están solos en ella. Pero no es la casa la que está embrujada, sino la novia de Malcolm, que parece estar poseída por un demonio. Malcolm contrata a un sacerdote para librarla de este intruso, decidido a no dejar que el espíritu maligno arruine su relación... o, más importante aún, su vida sexual...",
    "titulo" : "¿Y dónde está el fantasma?"
  }
}

  }

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }
}
