import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PUM extends JFrame implements ActionListener {

    JButton btnReglamento, btnLineamientos, btnFechas, btnPorcentajes;

    public PUM() {
        setTitle("Inicio PAM");
        setSize(500, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 1, 10, 10));

        // Crear botones
        btnReglamento = new JButton("Reglamento PAM");
        btnLineamientos = new JButton("Lineamientos Classroom");
        btnFechas = new JButton("Fechas de Parciales");
        btnPorcentajes = new JButton("Porcentajes por Parcial");

        // Agregar ActionListener
        btnReglamento.addActionListener(this);
        btnLineamientos.addActionListener(this);
        btnFechas.addActionListener(this);
        btnPorcentajes.addActionListener(this);

        // Agregar botones a la ventana
        add(btnReglamento);
        add(btnLineamientos);
        add(btnFechas);
        add(btnPorcentajes);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnReglamento) {
            mostrarMensaje(ReglamentoPAM());
        } else if (e.getSource() == btnLineamientos) {
            mostrarMensaje(LineamientosClassroom());
        } else if (e.getSource() == btnFechas) {
            mostrarMensaje(FechasdeParciales());
        } else if (e.getSource() == btnPorcentajes) {
            mostrarMensaje(PorcentajesporParcial());
        }
    }

    private void mostrarMensaje(String mensaje) {
        JTextArea textArea = new JTextArea(mensaje);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new Dimension(450, 300));
        JOptionPane.showMessageDialog(this, scrollPane, "Información", JOptionPane.INFORMATION_MESSAGE);
    }

    // Métodos adaptados de Python a Java
    public String ReglamentoPAM() 
    {
return "\n Reglamento de PAM: "
+ " \n 1.Se requiere 80% de asistencia para tener derecho a evaluacion parcial y 80% de trabajos en clase."
+ "\n 2.Se permiten 10 minutos de tolerancia y si el alumno llega despues de este tiempo puede permanecer en la clase, pero no se tomara la asistencia (Solamente en los horarios de"
+ " inicio:7:00a.m y 14:00 p.m)."
+ "\n 3. Las faltas deberán estar justificadas mediante el correo institucional con un plazo máximo de 24 horas posteriores a la hora de falta en clase mediante correo del tutor (a),"
+ " justificantes entregados fuera de la fecha límite permitido no se aceptan, únicamente se aceptarán recetas médicas y citatorios jurídicos.(De forma física deben ser presentados al"
+ " tutor para ser validados y de forma posterior emitidos)."
+ "\n 4. Las tareas y trabajos deberán subirlas al Classroom de forma individual y no se recibirán de manera extemporánea.(Salvo previo justificante validado por el tutor)"
+ "\n 5. Las tareas y trabajos presentarlos en tiempo y forma. La demora de un trabajo o tarea sin justificante y/o con justificante fuera del límite no se aceptan."
+ "\n 6. Utilizar el correo institucional para trabajar bajo la plataforma Google Classroom."
+ "\n 7. El plagio o copia de trabajos y/o exámenes, será condicionado a reprobar a la asignatura y se reportará al área correspondiente."
+ "\n 8. Cualquier deshonestidad académica será sancionada reprobando el parcial sin derecho a examen final"
+ "\n 9. En circunstancia de indisciplina o falta de respeto por parte del alumno hacia docentes,administrativos, compañeros o cualquier persona perteneciente a la universidad, se realizará"
+ " una primera llama de atención, si el alumno hace caso omiso tendrá que abandonar el aula, tres incidencias de este tipo el alumno no tendrá derecho a examen final o parcial."
+ "\n 10. Uso de laptops y/o dispositivos móviles quedará limitados a uso exclusivo de las actividades que así lo requieran."
+ "\n 11. Prohibido el uso de audífonos durante la clase."
+ "\n 12. Prohibido comer y/o tomar líquidos en el salón."
+ "\n 13. Prohibido sentarse encima de las mesas , así como columpiarse en las sillas."
+ "\n 14.Todo tema académido debe ser revisado primeramente por parte del alumno con el docente, de no resolverse, pasar con su respectivo tutor, y de ser necesario con la coordinación"
+ " de tutores. En caso de no solucionarse pasar a la dirección del programa educativo (debe mantenerse este seguimiento de forma obligatoria)"
+ "\n 15.Cualquier situación no prevista en el presente reglamento pasar directamente con la dirección del programa educativo."
+ "\n 16. El día destinado a entrega de calificaciones todos los estudiantes deben estar presentes, ese día se entregarán exámenes y se brindará retroalimentación"
+ "\n 17.Este reglamento entra en vigor después de que se firme o se acepte por la mayoría de los estudiantes asistentes a la primera sesión de la materia, una vez firmado o aceptado por el"
+ " 50% más el jefe de grupo, es vigente para todo alumno inscrito en el curso aunque no esté presente en la primera sesión.";
    }

    public String LineamientosClassroom() 
    {
        return "\n Lineamientos para el uso de Google Classroom: "
                + "\n 1. Entregar los trabajos para su revisión. "
                + "\n 2. Entregas en PDF."
                + "\n 3. Avisos de clase."
                + "\n 4. Entregas autorizadas con retraso, 5 Calif Max.";
    }

    public String FechasdeParciales() 
    {
        return "Fechas de parciales:\n"
                + "\n Primer parcial: 01 de octubre "
                + "\n Segundo parcial: 10 de noviembre "
                + "\n Tercer parcial: 03 de diciembre"
                + "\n Examen final: 08 de diciembre";
    }

    public String PorcentajesporParcial() 
    {
        return "Porcentajes por parcial:\n"
                + "Parcial 1: \n Evidencia de Conocimiento 40 %"
                + "         \n Evidencia de Desempeño 20 %\n"
                + "         \n Evidencia de Producto 30 %"
                + "         \n  Proyecto integrador 10 %\n"
                + "Parcial 2: \n Evidencia de Conocimiento 40 %"
                + "         \n Evidencia de Desempeño 20 %"
                + "         \n Evidencia de Producto 20 %"
                + "         \n Proyecto integrador 20 %\n"
                + "Parcial 3: \n Evidencia de Conocimiento 20 %"
                + "         \n Evidencia de Desempeño 10 %"
                + "         \n Evidencia de Producto 40 %"
                + "         \n Proyecto integrador 30 %";
    }

    public static void main(String[] args) 
    {
        new PUM();
    }
}


|