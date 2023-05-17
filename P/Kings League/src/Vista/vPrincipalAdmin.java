package Vista;

import Controlador.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

public class vPrincipalAdmin {
    private JPanel pPrincipal;
    private JPanel pDegradado;
    private JPanel pHeader;
    private JMenuBar jmheader;
    private JMenu mEquipos;
    private JMenuItem jmiConsultarEquipos;
    private JMenu mJugadores;
    private JMenuItem jmiConsultarJugadores;
    private JMenu mPartidos;
    private JMenuItem jmiConsultarPartidos;
    private JMenu mClasificacion;
    private JMenu mUsuario;
    private JMenuItem jmiVerPerfil;
    private JMenuItem jmiCerrarSesion;
    private JLabel fLogoKingsLeague;
    private JPanel pContenido;
    private JPanel pFooter;
    private JLabel fTwitch;
    private JLabel fInstagram;
    private JLabel fTwitter;
    private JMenuItem jmiInsertarEquipos;
    private JMenuItem jmiActualizarEquipos;
    private JMenuItem jmiBorrarEquipos;
    private JMenuItem jmiInsertarJugadores;
    private JMenuItem jmiActualizarJugadores;
    private JMenuItem jmiBorrararJugadores;
    private JPanel pLogoKingsLeague;
    private ImageIcon LogoKingsLeague;
    private ImageIcon imagenTwitch;
    private ImageIcon imagenInstagram;
    private ImageIcon imagenTwitter;
    private ImageIcon imagenUsuario;


    public vPrincipalAdmin() throws MalformedURLException {


        pPrincipal = new JPanel(new BorderLayout());

        pPrincipal = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                Graphics2D g2d = (Graphics2D) g;

                Color colorInicio = new Color(233, 86, 31);
                Color colorFin = new Color(247, 169, 33);

                GradientPaint gradient = new GradientPaint(
                        0, 0, colorInicio,
                        0, getHeight(), colorFin);

                g2d.setPaint(gradient);

                g2d.fillRect(0, 0, getWidth(), getHeight());
            }
        };

        // Agrega pHeader al norte
        pPrincipal.add(pDegradado, BorderLayout.CENTER);


        // Poner la imagen del logo oficial de la Kings League
        LogoKingsLeague = new ImageIcon(new URL("https://seeklogo.com/images/K/kings-league-logo-CEDD6AED72-seeklogo.com.png"));
        Image LogoNuevo = LogoKingsLeague.getImage().getScaledInstance(300, 122, Image.SCALE_SMOOTH);
        ImageIcon newIcon = new ImageIcon(LogoNuevo);
        fLogoKingsLeague.setIcon(newIcon);

        // Poner las imágenes del footer
        imagenTwitch = new ImageIcon(new URL("https://icones.pro/wp-content/uploads/2021/05/symbole-twitch-logo-icone-noir.png"));
        Image imgTwitch = imagenTwitch.getImage().getScaledInstance(35, 35, Image.SCALE_SMOOTH);
        ImageIcon twitchIcono = new ImageIcon(imgTwitch);
        fTwitch.setIcon(twitchIcono);

        imagenInstagram = new ImageIcon(new URL("https://icones.pro/wp-content/uploads/2021/02/instagram-icone-noir.png"));
        Image imgIg = imagenInstagram.getImage().getScaledInstance(38, 39, Image.SCALE_SMOOTH);
        ImageIcon igIcono = new ImageIcon(imgIg);
        fInstagram.setIcon(igIcono);

        imagenTwitter = new ImageIcon(new URL("https://icones.pro/wp-content/uploads/2021/02/icones-twitter-noires.png"));
        Image imgTw = imagenTwitter.getImage().getScaledInstance(38, 39, Image.SCALE_SMOOTH);
        ImageIcon twIcono = new ImageIcon(imgTw);
        fTwitter.setIcon(twIcono);

        // Poner la imagen del usuario
        imagenUsuario = new ImageIcon(new URL("https://assets.stickpng.com/images/585e4beacb11b227491c3399.png"));
        Image imgUsuario = imagenUsuario.getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        ImageIcon UsuIcono = new ImageIcon(imgUsuario);
        mUsuario.setIcon(UsuIcono);



        // Poner los ":hover" en los elementos de la barra de navegación (al pasar el ratón por encima el fondo cambia)
        mEquipos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                mEquipos.setBackground(Color.orange);
                mEquipos.setOpaque(true);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                mEquipos.setBackground(UIManager.getColor("Menu.background"));
                mEquipos.setOpaque(false);
            }
        });
        mJugadores.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                mJugadores.setBackground(Color.orange);
                mJugadores.setOpaque(true);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                mJugadores.setBackground(UIManager.getColor("Menu.background"));
                mJugadores.setOpaque(false);
            }
        });
        mClasificacion.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                mClasificacion.setBackground(Color.orange);
                mClasificacion.setOpaque(true);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                mClasificacion.setBackground(UIManager.getColor("Menu.background"));
                mClasificacion.setOpaque(false);
            }
        });
        mPartidos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                mPartidos.setBackground(Color.orange);
                mPartidos.setOpaque(true);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                mPartidos.setBackground(UIManager.getColor("Menu.background"));
                mPartidos.setOpaque(false);
            }
        });
        mUsuario.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                mUsuario.setBackground(Color.orange);
                mUsuario.setOpaque(true);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                mUsuario.setBackground(UIManager.getColor("Menu.background"));
                mUsuario.setOpaque(false);
            }
        });


        // Poner los métodos
        jmiVerPerfil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO : poner que aparezca la ventana "vPerfilUsuario"
            }
        });

        jmiCerrarSesion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.cerrarSesion();
            }
        });

        jmiConsultarEquipos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO : poner código necesario
            }
        });

        jmiInsertarEquipos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        jmiActualizarEquipos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Main.generarActualzarEquipos();
                } catch (MalformedURLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        jmiBorrarEquipos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        jmiConsultarJugadores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        jmiInsertarJugadores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Main.generarInsertarJugadores();
                } catch (MalformedURLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        jmiActualizarJugadores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        jmiBorrararJugadores.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Main.generarBorrarJugadores();
                } catch (MalformedURLException ex) {
                    throw new RuntimeException(ex);
                }
            }
        });

        jmiConsultarPartidos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        mClasificacion.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


    }


    public JPanel getpPrincipal() {
        return pPrincipal;
    }

    public static void main(String[] args) throws MalformedURLException {
        JFrame frame = new JFrame("vPrincipalAdmin");
        frame.setContentPane(new vPrincipalAdmin().pPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setExtendedState(Frame.MAXIMIZED_BOTH);
    }

}
