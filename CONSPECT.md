### SPRING

1. **@RequestParam** - принимает данные с GET запроса из url и отправляет их в контроллер
   Пример:
   localhost8080:/name=John&surname=Bell
   Принимаем:
   public String someMethod(@RequestParam = ("name" required = false) String name,
   @RequestParam  ("surname" required = false) String surname)
   *required обозначает на сколько нам необходимо это принимаемое значение,
   если true - то выдаст ошибку при неполученных данных, false - пропустит без ошибки со значением null
_____
2.**@RequestMapping
_____
3.**@PostMapping** - @PostMapping(value = "/user/login") эквивалентно 
@RequestMapping(value = "/user/login",method = RequestMethod.POST)


_____
2. **@GetMapping** - @GetMapping («/hello») указывает Spring, что надо использовать наш метод hello()
   для ответа на запросы, отправленные на адрес http://localhost:8080/hello

###SPRING SECURITY
1.@EnableWebSecurity
____
2.PasswordEncoder

###JPA
1. **findAll()** - для получения всех обхектов из БД
###JAVA SYNTAX


###HIBERNATE


###LOMBOK
1.@Slf4j
____
2.@RequiredArgsConstructor
____
