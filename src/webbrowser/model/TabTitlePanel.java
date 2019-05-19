/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package webbrowser.model;
import webbrowser.model.tab;
import javax.swing.*;
import com.jgoodies.looks.common.*;
import java.awt.event.ActionListener;


/**
 *
 * @author Da Rolt
 */
public class TabTitlePanel extends JPanel {
    
    public TabTitlePanel(final tab _c, java.awt.FlowLayout f) {
        super(f);
        
        setOpaque(false);
        // Add a JLabel with title and the left-side tab icon
        //String processID = (_c.getID() == null) ? "Tab" : _c.getID();
        //lblTitle = new JLabel(processID);
 
        // Create a JButton for the close tab button
        btnClose = new JButton();
        btnClose.setOpaque(false);
 
        // Configure icon and rollover icon for button
        btnClose.setRolloverIcon(CLOSE_TAB_ICON);
        btnClose.setRolloverEnabled(true);
        // btnClose.setIcon(RGBGrayFilter.getDisabledIcon(btnClose, CLOSE_TAB_ICON));;
 
        // Set border null so the button doesn't make the tab too big
        btnClose.setBorder(null);
        // Make sure the button can't get focus, otherwise it looks funny
        btnClose.setFocusable(false);
 
        // Put the panel together
        add(lblTitle);
        add(btnClose);
 
        // Add a thin border to keep the image below the top edge of the tab
        // when the tab is selected
        setBorder(BorderFactory.createEmptyBorder(2, 0, 0, 0));
    }
    public void addListener(ActionListener listener) {
        btnClose.addActionListener(listener);
    }
    
    JButton btnClose;
    JLabel lblTitle;
    private static final Icon CLOSE_TAB_ICON = new ImageIcon("closeTabButton.png");
}