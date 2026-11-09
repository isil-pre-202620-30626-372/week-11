# Caso propuesto: Gestión de inscripciones a talleres de capacitación

Una institución educativa organiza talleres de capacitación para estudiantes que desean fortalecer sus competencias tecnológicas. Debido a que cada taller cuenta con una cantidad limitada de vacantes, la institución necesita gestionar las inscripciones y determinar qué participantes obtendrán un cupo.

Al iniciar el proceso, cada participante registra sus datos personales y selecciona el taller al que desea postular. Posteriormente, rinde una evaluación diagnóstica que permite medir sus conocimientos previos. La institución establece un puntaje mínimo para considerar que un participante cumple con los conocimientos requeridos para el taller.

Una vez registradas las evaluaciones, los participantes que alcanzaron el puntaje mínimo se consideran aptos. Sin embargo, obtener dicha condición no garantiza una vacante, ya que los cupos disponibles pueden ser menores que la cantidad de participantes aptos.

## Desarrollo del caso

El sistema debe permitir registrar participantes en un taller y almacenar su información en una colección dinámica. Después del registro, se consignará el puntaje obtenido por cada participante en la evaluación diagnóstica.

Concluida la evaluación, se identificará a los participantes aptos y no aptos de acuerdo con el puntaje mínimo establecido para el taller. Los participantes aptos deberán ordenarse de mayor a menor según su puntaje para asignar las vacantes disponibles, respetando ese orden.

Cuando dos o más participantes obtengan el mismo puntaje, tendrá prioridad quien se haya inscrito primero. Los participantes aptos que no alcancen una vacante permanecerán en lista de espera, manteniendo el orden de prioridad establecido.

Finalmente, el sistema deberá mostrar la relación de participantes admitidos, la lista de espera y la situación de todos los inscritos.

## Reglas del negocio

1. Cada participante debe identificarse mediante un código único y registrar su nombre completo.
2. Cada inscripción corresponde a un único taller y debe conservar el orden en que fue registrada.
3. Un participante no puede inscribirse más de una vez en el mismo taller.
4. Cada taller tiene una cantidad de vacantes mayor que cero y un puntaje mínimo de aprobación establecido antes de la evaluación.
5. El puntaje de la evaluación diagnóstica debe encontrarse entre 0 y 20.
6. Solo los participantes que alcancen o superen el puntaje mínimo serán considerados aptos.
7. Los participantes aptos deben ordenarse de mayor a menor según el puntaje obtenido. En caso de empate, se respetará el orden de inscripción.
8. Las vacantes se asignarán siguiendo el orden de prioridad hasta completar la capacidad del taller o agotar los participantes aptos.
9. Los participantes aptos que no obtengan una vacante pasarán a lista de espera.
10. Cada participante debe tener un estado que refleje su situación: registrado, no apto, admitido o en espera.
11. La cantidad de participantes admitidos no puede superar el número de vacantes del taller.

## Resultado esperado

El sistema debe permitir registrar participantes, almacenar y actualizar sus puntajes, identificar quiénes cumplen el requisito mínimo, ordenar a los participantes aptos y asignar las vacantes disponibles.

Al finalizar el proceso, debe ser posible consultar la relación de participantes admitidos en orden de mérito, la lista de espera y el estado final de cada inscrito. También se debe mostrar la cantidad de participantes registrados, admitidos, no aptos y en espera.