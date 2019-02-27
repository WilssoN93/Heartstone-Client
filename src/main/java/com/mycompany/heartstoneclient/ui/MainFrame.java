package com.mycompany.heartstoneclient.ui;

import com.mycompany.heartstoneclient.entitys.Card;
import com.mycompany.heartstoneclient.entitys.Handler;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class MainFrame extends JFrame {

    Handler handler;

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
    JButton whispersOfTheOldGodCardButton;
    JButton oneNightInKarazhanCardButton;
    JButton meanStreetsOfGadgetzanCardButton;
    JButton journeyToUngoroCardButton;
    JButton knightsOfTheFrozenThroneCardButton;
    JButton koboldsandCatacombsCardButton;
    JButton theWitchwoodCardButton;
    JButton theBoomsdayProjectCardButton;
    JButton rastakhansRumbleCardButton;
    JButton tavernBrawlCardButton;
    JButton backButton;
    Container c;
    JList list;
    GridBagConstraints gbc;
    Image image;
    JLabel label;

    public MainFrame(String title, Image image) {
        super(title);
        this.image = image;
        mainMenu();

    }

    public final void mainMenu() {
        handler = new Handler();

        c = getContentPane();
        label = new JLabel(new ImageIcon(image)) {
            @Override
            public Dimension getPreferredSize() {
                Dimension size = super.getPreferredSize();
                Dimension lmPrefSize = getLayout().preferredLayoutSize(this);
                size.width = Math.max(size.width, lmPrefSize.width);
                size.height = Math.max(size.height, lmPrefSize.height);
                return size;
            }
        };

        allCardsButton = new JButton("All Cards");
        basicCardButton = new JButton("Basic Cards");
        classicCardButton = new JButton("Classic Cards");
        naxxramasCardButton = new JButton("Naxxramas Cards");
        goblinVsGnomesCardButton = new JButton("Goblin vs Gnomes Cards");
        blackRockMountainCardButton = new JButton("Black Rock Mountain Cards");
        theGrandTournamentCardButton = new JButton("The Grand Tournament Cards");
        theLeagueOfExplorersCardButton = new JButton("The League of Explorers Cards");
        whispersOfTheOldGodCardButton = new JButton("Whispers of the Old God Cards");
        oneNightInKarazhanCardButton = new JButton("One Night in Karazhan Cards");
        meanStreetsOfGadgetzanCardButton = new JButton("Mean Streets of Gadgetzan Cards");
        journeyToUngoroCardButton = new JButton("Journey to Un'Goro Cards");
        knightsOfTheFrozenThroneCardButton = new JButton("Knights of the Frozen Throne Cards");
        koboldsandCatacombsCardButton = new JButton("Kobolds and Catacomvs Cards");
        theWitchwoodCardButton = new JButton("The Witchwood Cards");
        theBoomsdayProjectCardButton = new JButton("The Boomsday Project Cards");
        rastakhansRumbleCardButton = new JButton("Rastakhans Rumble Cards");
        tavernBrawlCardButton = new JButton("Tavern Brawl Cards");

        label.setLayout(new GridBagLayout());

        gbc = new GridBagConstraints();
        gbc.insets = new Insets(4, 4, 4, 4);
        gbc.weightx = 1;

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.CENTER;
        label.add(allCardsButton, gbc);
        label.add(basicCardButton, gbc);
        label.add(classicCardButton, gbc);
        label.add(naxxramasCardButton, gbc);
        label.add(blackRockMountainCardButton, gbc);
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(4, 4, 4, 4);
        gbc.weightx = 1;
        gbc.gridx = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        label.add(theGrandTournamentCardButton, gbc);
        label.add(whispersOfTheOldGodCardButton, gbc);
        label.add(meanStreetsOfGadgetzanCardButton, gbc);
        label.add(oneNightInKarazhanCardButton, gbc);
        label.add(journeyToUngoroCardButton, gbc);
        label.add(theLeagueOfExplorersCardButton, gbc);
        gbc = new GridBagConstraints();
        gbc.insets = new Insets(4, 4, 4, 4);
        gbc.weightx = 1;
        gbc.gridx = 3;
        gbc.anchor = GridBagConstraints.CENTER;

        label.add(knightsOfTheFrozenThroneCardButton, gbc);
        label.add(koboldsandCatacombsCardButton, gbc);
        label.add(theWitchwoodCardButton, gbc);
        label.add(theBoomsdayProjectCardButton, gbc);
        label.add(rastakhansRumbleCardButton, gbc);
        label.add(tavernBrawlCardButton, gbc);

        c.add(label);

        allCardsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                c.removeAll();
                list = new JList(handler.getHttpGetter().javaObject().getAllCards().toArray());
                pane = new JScrollPane(list);
                backButton = new JButton("Back");
                backButton.addActionListener(new BackButtonAction());
                c.add(backButton, BorderLayout.SOUTH);
                c.add(pane);
                validate();
            }
        });
        basicCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                c.removeAll();
                list = new JList(handler.getHttpGetter().javaObject().getBasic().toArray());
                pane = new JScrollPane(list);
                backButton = new JButton("Back");
                backButton.addActionListener(new BackButtonAction());
                c.add(backButton, BorderLayout.SOUTH);
                c.add(pane);
                validate();
            }
        });
        classicCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                c.removeAll();
                list = new JList(handler.getHttpGetter().javaObject().getClassic().toArray());
                pane = new JScrollPane(list);
                backButton = new JButton("Back");
                backButton.addActionListener(new BackButtonAction());
                c.add(backButton, BorderLayout.SOUTH);
                c.add(pane);
                validate();
            }
        });
        naxxramasCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                c.removeAll();
                list = new JList(handler.getHttpGetter().javaObject().getNaxxramas().toArray());
                pane = new JScrollPane(list);
                backButton = new JButton("Back");
                backButton.addActionListener(new BackButtonAction());
                c.add(backButton, BorderLayout.SOUTH);
                c.add(pane);
                validate();
            }
        });
        goblinVsGnomesCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                c.removeAll();
                list = new JList(handler.getHttpGetter().javaObject().getGoblinVsGnomes().toArray());
                pane = new JScrollPane(list);
                backButton = new JButton("Back");
                backButton.addActionListener(new BackButtonAction());
                c.add(backButton, BorderLayout.SOUTH);
                c.add(pane);
                validate();
            }
        });
        blackRockMountainCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                c.removeAll();
                list = new JList(handler.getHttpGetter().javaObject().getBlackRockMountain().toArray());
                pane = new JScrollPane(list);
                backButton = new JButton("Back");
                backButton.addActionListener(new BackButtonAction());
                c.add(backButton, BorderLayout.SOUTH);
                c.add(pane);
                validate();
            }
        });
        theGrandTournamentCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                c.removeAll();
                list = new JList(handler.getHttpGetter().javaObject().getTheGrandTournament().toArray());
                pane = new JScrollPane(list);
                backButton = new JButton("Back");
                backButton.addActionListener(new BackButtonAction());
                c.add(backButton, BorderLayout.SOUTH);
                c.add(pane);
                validate();
            }
        });
        theLeagueOfExplorersCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                c.removeAll();
                list = new JList(handler.getHttpGetter().javaObject().getTheLeagueOfExplorers().toArray());
                pane = new JScrollPane(list);
                backButton = new JButton("Back");
                backButton.addActionListener(new BackButtonAction());
                c.add(backButton, BorderLayout.SOUTH);
                c.add(pane);
                validate();
            }
        });
        whispersOfTheOldGodCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                c.removeAll();
                list = new JList(handler.getHttpGetter().javaObject().getWhispersOfTheOldGod().toArray());
                pane = new JScrollPane(list);
                backButton = new JButton("Back");
                backButton.addActionListener(new BackButtonAction());
                c.add(backButton, BorderLayout.SOUTH);
                c.add(pane);
                validate();
            }
        });
        oneNightInKarazhanCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                c.removeAll();
                list = new JList(handler.getHttpGetter().javaObject().getOneNightInKarazhan().toArray());
                pane = new JScrollPane(list);
                backButton = new JButton("Back");
                backButton.addActionListener(new BackButtonAction());
                c.add(backButton, BorderLayout.SOUTH);
                c.add(pane);
                validate();
            }
        });
        meanStreetsOfGadgetzanCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                c.removeAll();
                list = new JList(handler.getHttpGetter().javaObject().getMeanStreetsOfGadgetzan().toArray());
                pane = new JScrollPane(list);
                backButton = new JButton("Back");
                backButton.addActionListener(new BackButtonAction());
                c.add(backButton, BorderLayout.SOUTH);
                c.add(pane);
                validate();
            }
        });
        journeyToUngoroCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                c.removeAll();
                list = new JList(handler.getHttpGetter().javaObject().getJourneyToUngoro().toArray());
                pane = new JScrollPane(list);
                backButton = new JButton("Back");
                backButton.addActionListener(new BackButtonAction());
                c.add(backButton, BorderLayout.SOUTH);
                c.add(pane);
                validate();
            }
        });
        knightsOfTheFrozenThroneCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                c.removeAll();
                list = new JList(handler.getHttpGetter().javaObject().getKnightsOfTheFrozenThrone().toArray());
                pane = new JScrollPane(list);
                backButton = new JButton("Back");
                backButton.addActionListener(new BackButtonAction());
                c.add(backButton, BorderLayout.SOUTH);
                c.add(pane);
                validate();
            }
        });
        koboldsandCatacombsCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                c.removeAll();
                list = new JList(handler.getHttpGetter().javaObject().getKoboldsandCatacombs().toArray());
                pane = new JScrollPane(list);
                backButton = new JButton("Back");
                backButton.addActionListener(new BackButtonAction());
                c.add(backButton, BorderLayout.SOUTH);
                c.add(pane);
                validate();
            }
        });
        theWitchwoodCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                c.removeAll();
                list = new JList(handler.getHttpGetter().javaObject().getTheWitchwood().toArray());
                pane = new JScrollPane(list);
                backButton = new JButton("Back");
                backButton.addActionListener(new BackButtonAction());
                c.add(backButton, BorderLayout.SOUTH);
                c.add(pane);
                validate();
            }
        });
        theBoomsdayProjectCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                c.removeAll();
                list = new JList(handler.getHttpGetter().javaObject().getTheBoomsdayProject().toArray());
                pane = new JScrollPane(list);
                backButton = new JButton("Back");
                backButton.addActionListener(new BackButtonAction());
                c.add(backButton, BorderLayout.SOUTH);
                c.add(pane);
                validate();
            }
        });
        rastakhansRumbleCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                c.removeAll();
                list = new JList(handler.getHttpGetter().javaObject().getRastakhansRumble().toArray());
                pane = new JScrollPane(list);
                backButton = new JButton("Back");
                backButton.addActionListener(new BackButtonAction());
                c.add(backButton, BorderLayout.SOUTH);
                c.add(pane);
                validate();
            }
        });
        tavernBrawlCardButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                c.removeAll();
                list = new JList(handler.getHttpGetter().javaObject().getTavernBrawl().toArray());
                pane = new JScrollPane(list);
                backButton = new JButton("Back");
                backButton.addActionListener(new BackButtonAction());
                c.add(backButton, BorderLayout.SOUTH);
                c.add(pane);
                validate();
            }
        });


    }

    class BackButtonAction implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            c.removeAll();
            mainMenu();
            c.validate();
        }

    }

}
