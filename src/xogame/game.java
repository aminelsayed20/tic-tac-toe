/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package xogame;

import java.awt.Color;
import static xogame.chose1OR2.chose;

/**
 *
 * @author amine
 */
public class game extends javax.swing.JFrame {
    

   public static char [][]game  = { {'.','.','.'},{'.','.','.'},{'.','.','.'} }  ; 
   boolean mal3op[] = new boolean [10];
   public static char winplayer;
   public static boolean drow;
   int countPlay =0;
   public static boolean easy = false  , hard = false ;
  
   public game() {
        initComponents();
        if (chose == 1)
        {
            dorT.setVisible(false);
            dor.setVisible(false);
        }
       
        
        if (chose == 1 && !easy  && hard)
        {
            Play();
    
        }
        
        
                 this.setLayout(null);
       // this.add(g);
      //  g.setSize(500, 500);
      // g.setBackground(Color.BLACK);
      
        
    }

   public static void restart ()
   {
       for (int i=0 ; i<3 ; ++i)
       {
           for (int j =0 ; j<3 ; ++j)
           {
               game [i][j] = '.';
           }
       }
   }
   
   
    
    boolean win ()
{  
     
   boolean win=false;
// check rows
    for (int i=0 ; i<3 ;++i)
   {
     if (game[i][0] == game[i][1] && game[i][1] == game[i][2] && game[i][1]!='.')
        {
        winplayer = game[i][0];
        win =true;
         
        }

   }
    // check colns
    for (int i=0 ; i<3 ;++i)
    {
  
        if (game[0][i] == game[1][i] && game[1][i] == game[2][i] && game[1][i]!='.')
        {
        winplayer = game[0][i];
         win = true;
         
         }
    }
    // check r1
    if (game[0][0] == game[1][1] && game[1][1] == game[2][2] && game[1][1]!='.')
         {winplayer = game[0][0];
         win = true;
         }

    //check r2
else if (game[0][2] == game[1][1] && game[1][1] == game[2][0] && game[1][1]!='.')
         {winplayer = game[1][1];
         win = true;
         }

    if (win)
    {
             this.setVisible(false);
               new result().setVisible(true);
           
            
    }
    
    
   return win;



}
  boolean drow()
  {
      if (countPlay >=9)
      {
        
          if (!win())
          {
             
          drow = true;
          this.setVisible(false);
          new result().setVisible(true);
            
          return true ;
          }
      }
      
      
      
      return false;
  }
 
  private int easyPlay ()
  {
      int random = (int)(Math.random() * 10);
       while(mal3op[random] || random == 0)
       {
      random = (int)(Math.random() * 10);
      
       }
       return random;
  }      

   private int Play()
   {
       

       
       int numPlay=0;
       
      countPlay++;
      
       if (easy  && !hard) // ro easy play
       {
         numPlay = easyPlay(); 
             
       }

      
       else if (!easy  && hard) // to hard play
       {
           
           numPlay = hardplay();

       }

       mal3op [numPlay] = true;
       
  
       
       if (numPlay == 1) { _1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/o.jpeg"))); game[0][0] = 'o'; }
       else if (numPlay == 2) { _2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/o.jpeg"))); game[0][1] = 'o'; }
       else if (numPlay == 3) { _3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/o.jpeg"))); game[0][2] = 'o'; }
       else if (numPlay == 4) { _4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/o.jpeg"))); game[1][0] = 'o'; }
       else if (numPlay == 5) { _5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/o.jpeg"))); game[1][1] = 'o'; }
       else if (numPlay == 6){ _6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/o.jpeg"))); game[1][2] = 'o'; }
       else if (numPlay == 7) { _7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/o.jpeg"))); game[2][0] = 'o'; }
       else if (numPlay == 8) { _8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/o.jpeg"))); game[2][1] = 'o'; }
       else if (numPlay == 9) { _9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/o.jpeg"))); game[2][2] = 'o'; }
       
       
       return numPlay;
   }
   int counter =0;
   int hardplay()
{
    counter ++;
    int c =counter;
    if (c==1)
        return 1;
    else if (c==2)
    {
        if (game[2][2]=='.')
            return 9;
        else
            return 7;
    }
    else if (c==3 && game[2][2]=='o')
    {
        if (game [2][2] =='o')
        {
            if (game[1][1]=='.')
                return 5;
            else
            {
                if (game[0][2]=='x')
                    return 7;
                else if (game[2][0]=='x')
                    return 3;
                else
                    return 7;
            }
        }
    }
    else if (c==4&& game[0][2]=='o')
    {
       if (game[0][1]=='x') return 6;
       else return 2;
    }
    else if (c==4 && game[2][0]=='o')
    {
        if (game[1][0]=='x') return 8;
        else return 4;
    }

    else if (c == 3 && game[2][0]=='o')
    {
        if (game[1][0]=='.')
            return 4;

        else return 3;

    }
    
 return easyPlay();
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gameP = new javax.swing.JPanel();
        _7 = new javax.swing.JLabel();
        _3 = new javax.swing.JLabel();
        _1 = new javax.swing.JLabel();
        _5 = new javax.swing.JLabel();
        _2 = new javax.swing.JLabel();
        _4 = new javax.swing.JLabel();
        _6 = new javax.swing.JLabel();
        _8 = new javax.swing.JLabel();
        _9 = new javax.swing.JLabel();
        BGgame = new javax.swing.JLabel();
        dorT = new javax.swing.JLabel();
        dor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1550, 878));
        setSize(new java.awt.Dimension(1550, 878));
        getContentPane().setLayout(null);

        gameP.setBackground(new java.awt.Color(255, 199, 31));
        gameP.setLayout(null);

        _7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _7MouseClicked(evt);
            }
        });
        gameP.add(_7);
        _7.setBounds(570, 480, 120, 120);

        _3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _3MouseClicked(evt);
            }
        });
        gameP.add(_3);
        _3.setBounds(910, 150, 130, 130);

        _1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _1MouseClicked(evt);
            }
        });
        gameP.add(_1);
        _1.setBounds(580, 150, 120, 130);

        _5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _5MouseClicked(evt);
            }
        });
        gameP.add(_5);
        _5.setBounds(740, 320, 130, 130);

        _2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _2MouseClicked(evt);
            }
        });
        gameP.add(_2);
        _2.setBounds(740, 140, 130, 130);

        _4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _4MouseClicked(evt);
            }
        });
        gameP.add(_4);
        _4.setBounds(580, 310, 120, 130);

        _6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _6MouseClicked(evt);
            }
        });
        gameP.add(_6);
        _6.setBounds(900, 310, 130, 130);

        _8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _8MouseClicked(evt);
            }
        });
        gameP.add(_8);
        _8.setBounds(750, 480, 120, 130);

        _9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _9MouseClicked(evt);
            }
        });
        gameP.add(_9);
        _9.setBounds(900, 470, 130, 130);

        BGgame.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/BG.jpeg"))); // NOI18N
        gameP.add(BGgame);
        BGgame.setBounds(430, 30, 890, 700);

        dorT.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        dorT.setText("دور");
        gameP.add(dorT);
        dorT.setBounds(300, 90, 80, 120);

        dor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x2.jpeg"))); // NOI18N
        gameP.add(dor);
        dor.setBounds(170, 90, 110, 150);

        getContentPane().add(gameP);
        gameP.setBounds(0, 0, 1950, 840);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void _7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__7MouseClicked
       
        if (!mal3op[7])
        {
            countPlay++;
        if (chose == 1)
        {

        _7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.jpeg"))); // NOI18N
  
        game[2][0] = 'x';
        mal3op[7] = true;
        if (win()) return;
            
        if (drow()) return;
        Play();

        if (win()) 
              return;
        if (drow()) return;
        }
        else if (chose == 2)
        {
           
            if (countPlay%2 ==1)
            {
                _7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.jpeg")));
          dor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/o2.jpeg")));
        game[2][0] = 'x';
        mal3op[7] = true;
        
        if (win()) return;
        
        if (drow()) return;
            }
            else if (countPlay %2 == 0)
            {
                _7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/o.jpeg"))); // NOI18N
                 dor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x2.jpeg")));
        game[2][0] = 'o';
        mal3op[7] = true;
        if (win()) return;
        
        if (drow()) return;
            }

            
        }
        }
    }//GEN-LAST:event__7MouseClicked

    private void _1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__1MouseClicked
       
         if (!mal3op[1])
         { 
              countPlay++;
              
             if (chose == 1 )
             {
                 System.out.println(" btttttn 111111111 ");
                
             
        _1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.jpeg")));
        game[0][0] = 'x';
        mal3op[1] = true;
        if (win()) return;
        if (drow()) return;
            Play();
  
                
        if (win()) return;
        if (drow()) return;
         }
         
         
           else if (chose == 2)
        {
            
            if (countPlay%2 ==1)
            {
                _1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.jpeg"))); // NOI18N
                 dor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/o2.jpeg")));
        game[0][0] = 'x';
        mal3op[1] = true;
        if (win()) return;
         if (drow()) return;
            }
            else if (countPlay %2 == 0)
            {
                _1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/o.jpeg"))); // NOI18N
                dor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x2.jpeg")));
        game[0][0] = 'o';
        mal3op[1] = true;
        if (win()) return;
         if (drow()) return;
            }

        }
         }
         
    }//GEN-LAST:event__1MouseClicked

    private void _2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__2MouseClicked
    
         if (!mal3op[2])
         {
              countPlay++;
              
             if (chose == 1 )
             {

             _2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.jpeg")));
         
      game[0][1] = 'x';
      mal3op[2] = true;
        if (win()) return;
        if (drow()) return;
      Play();
 
        if (win())  return;
        if (drow()) return;
         }
         
           else if (chose == 2)
        {
           
            if (countPlay%2 ==1)
            {
                _2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.jpeg"))); // NOI18N
                 dor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/o2.jpeg")));
        game[0][1] = 'x';
        mal3op[2] = true;
        if (win())  return;
              if (drow()) return;
            }
            else if (countPlay %2 == 0)
            {
                _2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/o.jpeg"))); // NOI18N
                dor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x2.jpeg")));
        game[0][1] = 'o';
        mal3op[2] = true;
        if (win())  return;
         if (drow()) return;
            }

            
        }
         }
    }//GEN-LAST:event__2MouseClicked

    private void _3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__3MouseClicked
     
         if (!mal3op[3])
         { 
              countPlay++;
              
             if(chose == 1 )
             {
               
        _3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.jpeg")));
      game[0][2] = 'x';
      mal3op[3] = true;
        if (win())  return;
         if (drow()) return;
         Play();
     
             if (win())  return;
              if (drow()) return;
             }
               else if (chose == 2)
        {
            
            if (countPlay%2 ==1)
            {
                _3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.jpeg"))); // NOI18N
                 dor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/o2.jpeg")));
        game[0][2] = 'x';
        mal3op[3] = true;
        if (win())  return;
         if (drow()) return;
            }
            else if (countPlay %2 == 0)
            {
                _3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/o.jpeg"))); // NOI18N
                dor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x2.jpeg")));
        game[0][2] = 'o';
        mal3op[3] = true;
        if (win())  return;
         if (drow()) return;
            }
                      
        }
         }
    }//GEN-LAST:event__3MouseClicked

    private void _4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__4MouseClicked
      
         if (!mal3op[4])
         { 
              countPlay++;
             if (chose == 1)
             {
                  
        _4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.jpeg")));
        game[1][0] = 'x';
        mal3op[4] = true;
        if (win())  return;
         if (drow()) return;
        Play();
 
        if (win())  return;
         if (drow()) return;
             }
               else if (chose == 2)
        {
           
            if (countPlay%2 ==1)
            {
                _4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.jpeg"))); // NOI18N
                 dor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/o2.jpeg")));
        game[1][0] = 'x';
        mal3op[4] = true;
        if (win())  return;
         if (drow()) return;
            }
            else if (countPlay %2 == 0)
            {
                _4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/o.jpeg"))); // NOI18N
                dor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x2.jpeg")));
        game[1][0] = 'o';
        mal3op[4] = true;
        if (win())  return;
         if (drow()) return;
            }
          
        }
         }
    }//GEN-LAST:event__4MouseClicked

    private void _5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__5MouseClicked
       
         if (!mal3op[5])
         { 
              countPlay++;
             if (chose == 1)
             {
              
        _5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.jpeg")));
         game[1][1] = 'x';
         mal3op[5] = true;
        if (win())  return;
        if (drow()) return;
         Play();
   
        if (win())  return;
        if (drow()) return;
             }
               else if (chose == 2)
        {
          
            if (countPlay%2 ==1)
            {
                _5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.jpeg"))); // NOI18N
                 dor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/o2.jpeg")));
        game[1][1] = 'x';
        mal3op[5] = true;
        if (win())  return;
         if (drow()) return;
            }
            else if (countPlay %2 == 0)
            {
                _5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/o.jpeg"))); // NOI18N
                dor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x2.jpeg")));
        game[1][1] = 'o';
        mal3op[5] = true;
        if (win())  return;
         if (drow()) return;
            }

        }
         }
    }//GEN-LAST:event__5MouseClicked

    private void _6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__6MouseClicked
        
         if (!mal3op[6])
         {
              countPlay++;
             if (chose == 1)
             {
           
        _6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.jpeg")));
         game[1][2] = 'x';
         mal3op[6] = true;
         if (win()) 
        if (win())  return;
          if (drow()) return;
         Play();

        if (win())  return;
         if (drow()) return;
             }
             
               else if (chose == 2)
        {
        
            if (countPlay%2 ==1)
            {
                _6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.jpeg"))); // NOI18N
                 dor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/o2.jpeg")));
        game[1][2] = 'x';
        mal3op[6] = true;
        if (win())  return;
         if (drow()) return;
            }
            else if (countPlay %2 == 0)
            {
                _6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/o.jpeg"))); // NOI18N
                dor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x2.jpeg")));
        game[1][2] = 'o';
        mal3op[6] = true;
        if (win())  return;
         if (drow()) return;
            }

        }
         }
         
    }//GEN-LAST:event__6MouseClicked

    private void _8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__8MouseClicked
      
         if (!mal3op[8])
         {
              countPlay++;
             if (chose == 1)
             {
            
        _8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.jpeg")));
        game[2][1] = 'x';
        mal3op[8] = true;
        if (win())  return;
         if (drow()) return;
        Play();
        if (win())  return;
         if (drow()) return;
             }
               else if (chose == 2)
        {
        
            if (countPlay%2 ==1)
            {
                
                _8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.jpeg"))); // NOI18N
                 dor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/o2.jpeg")));
        game[2][1] = 'x';
        mal3op[8] = true;
        if (win())  return;
         if (drow()) return;
            }
            else if (countPlay %2 == 0)
            {
                _8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/o.jpeg"))); // NOI18N
                dor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x2.jpeg")));
        game[2][1] = 'o';
        mal3op[8] = true;
        if (win())  return;
         if (drow()) return;
            }

        }
         }
    }//GEN-LAST:event__8MouseClicked

    private void _9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__9MouseClicked
       
         if (!mal3op[9])
         {
              countPlay++;
             if (chose == 1)
             {
            
        _9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.jpeg")));
        game[2][2] = 'x';
        mal3op[9] = true;
        if (win())  return;
         if (drow()) return;
        Play();
 
        if (win())  return;
         if (drow()) return;
             }
               else if (chose == 2)
        {
           
            if (countPlay%2 ==1)
            {
                _9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x.jpeg"))); // NOI18N
                 dor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/o2.jpeg")));
        game[2][2] = 'x';
        mal3op[9] = true;
        if (win())  return;
         if (drow()) return;
            }
            else if (countPlay %2 == 0)
            {
                _9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/o.jpeg"))); // NOI18N
                dor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/x2.jpeg")));
        game[2][2] = 'o';
        mal3op[9] = true;
        if (win())  return;
         if (drow()) return;
            }

        }
         }
    }//GEN-LAST:event__9MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BGgame;
    private javax.swing.JLabel _1;
    private javax.swing.JLabel _2;
    private javax.swing.JLabel _3;
    private javax.swing.JLabel _4;
    private javax.swing.JLabel _5;
    private javax.swing.JLabel _6;
    private javax.swing.JLabel _7;
    private javax.swing.JLabel _8;
    private javax.swing.JLabel _9;
    private javax.swing.JLabel dor;
    private javax.swing.JLabel dorT;
    private javax.swing.JPanel gameP;
    // End of variables declaration//GEN-END:variables
}
