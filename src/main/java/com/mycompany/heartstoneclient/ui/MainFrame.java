package com.mycompany.heartstoneclient.ui;

import com.mycompany.heartstoneclient.entitys.Handler;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class MainFrame extends JFrame {

    Handler handler;

    JPanel south;
    JPanel north;
    JPanel panelOne;
    JScrollPane pane;
    JButton allCardsButton;
    JButton basicCardButton;
    JButton classicCardButton;
    JButton naxxramasCardButton;
    JButton goblinVsGnomesCardButton;
    JButton blackRockMountainCardButton;
    JButton theGrandTournamentCardButton;
    JButton theLeagueOfExplorersCardButton;
    JButton backButton;
    Container c;
    JList list;
    GridBagConstraints gbc;

    public MainFrame(String title) {
        super(title);
        mainMenu();

    }

    public void mainMenu() {

        setLayout(new GridBagLayout());
        c = getContentPane();
        gbc = new GridBagConstraints();

        handler = new Handler();
        south = new JPanel();
        north = new JPanel();
        allCardsButton = new JButton("All Cards");
        gbc.gridx = 0;
        gbc.gridy = 0;
        c.add(allCardsButton, gbc);
        basicCardButton = new JButton("Basic");
        gbc.gridx = 0;
        gbc.gridy = 1;
        c.add(basicCardButton, gbc);
        classicCardButton = new JButton("Classic");
        gbc.gridx = 0;
        gbc.gridy = 2;
        c.add(classicCardButton, gbc);
        naxxramasCardButton = new JButton("Naxxramas");
        gbc.gridx = 0;
        gbc.gridy = 3;
        c.add(naxxramasCardButton, gbc);
        goblinVsGnomesCardButton = new JButton("Goblin vs Gnomes");
        gbc.gridx = 1;
        gbc.gridy = 4;
        c.add(goblinVsGnomesCardButton, gbc);
        blackRockMountainCardButton = new JButton("Black Rock Mountain");
        gbc.gridx = 1;
        gbc.gridy = 5;
        c.add(blackRockMountainCardButton, gbc);
        theGrandTournamentCardButton = new JButton("The Grand Tournament");
        gbc.gridx = 1;
        gbc.gridy = 6;
        c.add(theGrandTournamentCardButton, gbc);
        theLeagueOfExplorersCardButton = new JButton("The league of Explorers");
        gbc.gridx = 7;
        gbc.gridy = 7;
        c.add(theLeagueOfExplorersCardButton, gbc);

        allCardsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLayout(new BorderLayout());
                c.removeAll();
                list = new JList(handler.getHttpGetter().javaObject().getAllCards().toArray());
                pane = new JScrollPane(list);
                backButton = new JButton("Back");
                backButton.addActionListener(new BackButtonAction());
                c.add(backButton, BorderLayout.SOUTH);
                c.add(pane);
                repaint();
                printAll(getGraphics());
            }
        });

        classicCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLayout(new BorderLayout());
                c.removeAll();
                list = new JList(handler.getHttpGetter().javaObject().getClassic().toArray());
                pane = new JScrollPane(list);
                backButton = new JButton("Back");
                backButton.addActionListener(new BackButtonAction());
                c.add(backButton, BorderLayout.SOUTH);
                c.add(pane);
                repaint();
                printAll(getGraphics());
            }
        });

        basicCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLayout(new BorderLayout());
                c.removeAll();
                list = new JList(handler.getHttpGetter().javaObject().getBasic().toArray());
                pane = new JScrollPane(list);
                backButton = new JButton("Back");
                backButton.addActionListener(new BackButtonAction());
                c.add(backButton, BorderLayout.SOUTH);
                c.add(pane);
                repaint();
                printAll(getGraphics());
            }
        });

        naxxramasCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLayout(new BorderLayout());
                c.removeAll();
                list = new JList(handler.getHttpGetter().javaObject().getNaxxramas().toArray());
                pane = new JScrollPane(list);
                backButton = new JButton("Back");
                backButton.addActionListener(new BackButtonAction());
                c.add(backButton, BorderLayout.SOUTH);
                c.add(pane);
                repaint();
                printAll(getGraphics());
            }
        });
        theGrandTournamentCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLayout(new BorderLayout());
                c.removeAll();
                list = new JList(handler.getHttpGetter().javaObject().getTheGrandTournament().toArray());
                pane = new JScrollPane(list);
                backButton = new JButton("Back");
                backButton.addActionListener(new BackButtonAction());
                c.add(backButton, BorderLayout.SOUTH);
                c.add(pane);
                repaint();
                printAll(getGraphics());
            }
        });
        goblinVsGnomesCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLayout(new BorderLayout());
                c.removeAll();
                list = new JList(handler.getHttpGetter().javaObject().getGoblinVsGnomes().toArray());
                pane = new JScrollPane(list);
                backButton = new JButton("Back");
                backButton.addActionListener(new BackButtonAction());
                c.add(backButton, BorderLayout.SOUTH);
                c.add(pane);
                repaint();
                printAll(getGraphics());
            }
        });
        theLeagueOfExplorersCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLayout(new BorderLayout());
                c.removeAll();
                list = new JList(handler.getHttpGetter().javaObject().getTheLeagueOfExplorers().toArray());
                pane = new JScrollPane(list);
                backButton = new JButton("Back");
                backButton.addActionListener(new BackButtonAction());
                c.add(backButton, BorderLayout.SOUTH);
                c.add(pane);
                repaint();
                printAll(getGraphics());
            }
        });
        blackRockMountainCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setLayout(new BorderLayout());
                c.removeAll();
                list = new JList(handler.getHttpGetter().javaObject().getBlackRockMountain().toArray());
                pane = new JScrollPane(list);
                backButton = new JButton("Back");
                backButton.addActionListener(new BackButtonAction());
                c.add(backButton, BorderLayout.SOUTH);
                c.add(pane);
                repaint();
                printAll(getGraphics());
            }
        });

    }

    class BackButtonAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            c.removeAll();
           mainMenu();
           repaint();
           printAll(getGraphics());
        }

    }
}
