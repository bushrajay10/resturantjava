package OopProject;




import java.awt.Component;
import java.awt.TextField;
import java.awt.print.PrinterException;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

/
 *
 * @author NAMEERA
 */
public class OO_Resturant extends javax.swing.JFrame {

    /**
     * Creates new form OO_Resturant
     */
    public OO_Resturant() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Meal_Panel = new javax.swing.JPanel();
        BurgerQty = new javax.swing.JTextField();
        jlbdChicLegend = new javax.swing.JLabel();
        jlbdBurMeal = new javax.swing.JLabel();
        BurgMealQty = new javax.swing.JTextField();
        FishQty = new javax.swing.JTextField();
        jlbdFish = new javax.swing.JLabel();
        jlbdTax6 = new javax.swing.JLabel();
        jlbdChBurg = new javax.swing.JLabel();
        ChLegQty = new javax.swing.JTextField();
        jlbdCheese = new javax.swing.JLabel();
        BacCheQty = new javax.swing.JTextField();
        Cost_panel = new javax.swing.JPanel();
        jlbdCostMealText = new javax.swing.JLabel();
        jlbdCostDrinkText = new javax.swing.JLabel();
        jlbdCostMadeText = new javax.swing.JLabel();
        TotalCostShow = new javax.swing.JTextField();
        CostDrinkShow = new javax.swing.JTextField();
        CostMealShow = new javax.swing.JTextField();
        Payment_panel = new javax.swing.JPanel();
        TaxShow = new javax.swing.JTextField();
        SubTotalShow = new javax.swing.JTextField();
        TotalShow = new javax.swing.JTextField();
        jlbdSubTotal = new javax.swing.JLabel();
        jlbdTotal = new javax.swing.JLabel();
        jlbdTax2 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jBut_Save = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jBut_Total = new javax.swing.JButton();
        jBut_Receipt = new javax.swing.JButton();
        jBut_Reset = new javax.swing.JButton();
        jBut_Exit = new javax.swing.JButton();
        Drink_Panel = new javax.swing.JPanel();
        jlbdTax3 = new javax.swing.JLabel();
        jlbdMilkShake = new javax.swing.JLabel();
        VanQty = new javax.swing.JTextField();
        jlbdVanCone = new javax.swing.JLabel();
        jlbdClassicVAn = new javax.swing.JLabel();
        ClasVan = new javax.swing.JTextField();
        VanMilkQty = new javax.swing.JTextField();
        ChocMilkQty = new javax.swing.JTextField();
        jlbdChShake = new javax.swing.JLabel();
        jlbdVanShake = new javax.swing.JLabel();
        MilkQty = new javax.swing.JTextField();
        MilkQty1 = new javax.swing.JTextField();
        MilkQty2 = new javax.swing.JTextField();
        MilkQty3 = new javax.swing.JTextField();
        MilkQty4 = new javax.swing.JTextField();
        MilkQty5 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 12));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 66)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("H&H FOOD STUDIO");

        jLabel2.setText("jfakjkajfkaljfkajfkl");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1053, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addComponent(jLabel2))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 120));

        Meal_Panel.setBackground(new java.awt.Color(0, 0, 0));
        Meal_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 12));

        BurgerQty.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BurgerQty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BurgerQty.setText("0");
        BurgerQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BurgerQtyActionPerformed(evt);
            }
        });

        jlbdChicLegend.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbdChicLegend.setForeground(new java.awt.Color(255, 255, 255));
        jlbdChicLegend.setText("Chicken Legend Burger 300/=");

        jlbdBurMeal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbdBurMeal.setForeground(new java.awt.Color(255, 255, 255));
        jlbdBurMeal.setText("Chicken Cheese Burger 350/=");

        BurgMealQty.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BurgMealQty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BurgMealQty.setText("0");
        BurgMealQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BurgMealQtyActionPerformed(evt);
            }
        });

        FishQty.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        FishQty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FishQty.setText("0");
        FishQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FishQtyActionPerformed(evt);
            }
        });

        jlbdFish.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbdFish.setForeground(new java.awt.Color(255, 255, 255));
        jlbdFish.setText("Zinger Burger     350/= ");

        jlbdTax6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbdTax6.setForeground(new java.awt.Color(255, 255, 255));
        jlbdTax6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbdTax6.setText("BURGERS");

        jlbdChBurg.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbdChBurg.setForeground(new java.awt.Color(255, 255, 255));
        jlbdChBurg.setText("Zinger Cheese Burger  450/=");

        ChLegQty.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ChLegQty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ChLegQty.setText("0");
        ChLegQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChLegQtyActionPerformed(evt);
            }
        });

        jlbdCheese.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbdCheese.setForeground(new java.awt.Color(255, 255, 255));
        jlbdCheese.setText("Bacon & Cheese Burger 400/=");

        BacCheQty.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BacCheQty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        BacCheQty.setText("0");
        BacCheQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BacCheQtyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Meal_PanelLayout = new javax.swing.GroupLayout(Meal_Panel);
        Meal_Panel.setLayout(Meal_PanelLayout);
        Meal_PanelLayout.setHorizontalGroup(
            Meal_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Meal_PanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(Meal_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlbdChicLegend, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                    .addComponent(jlbdChBurg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(Meal_PanelLayout.createSequentialGroup()
                        .addComponent(jlbdFish, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(68, 68, 68))
                    .addGroup(Meal_PanelLayout.createSequentialGroup()
                        .addGroup(Meal_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlbdBurMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbdCheese))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Meal_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(BacCheQty, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(BurgMealQty)
                    .addComponent(ChLegQty)
                    .addComponent(BurgerQty)
                    .addComponent(FishQty))
                .addGap(38, 38, 38))
            .addGroup(Meal_PanelLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jlbdTax6, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Meal_PanelLayout.setVerticalGroup(
            Meal_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Meal_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbdTax6, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Meal_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(FishQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbdFish, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Meal_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(BurgerQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbdChBurg, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Meal_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ChLegQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbdChicLegend, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Meal_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BurgMealQty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbdBurMeal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Meal_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbdCheese, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BacCheQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        getContentPane().add(Meal_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 118, 490, 260));

        Cost_panel.setBackground(new java.awt.Color(0, 0, 0));
        Cost_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 12));

        jlbdCostMealText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbdCostMealText.setForeground(new java.awt.Color(255, 255, 255));
        jlbdCostMealText.setText("Cost of Meal");

        jlbdCostDrinkText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbdCostDrinkText.setForeground(new java.awt.Color(255, 255, 255));
        jlbdCostDrinkText.setText("Cost of Drink");

        jlbdCostMadeText.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbdCostMadeText.setForeground(new java.awt.Color(255, 255, 255));
        jlbdCostMadeText.setText("Total Cost of Item");

        TotalCostShow.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TotalCostShow.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TotalCostShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalCostShowActionPerformed(evt);
            }
        });

        CostDrinkShow.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CostDrinkShow.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CostDrinkShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CostDrinkShowActionPerformed(evt);
            }
        });

        CostMealShow.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        CostMealShow.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CostMealShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CostMealShowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Cost_panelLayout = new javax.swing.GroupLayout(Cost_panel);
        Cost_panel.setLayout(Cost_panelLayout);
        Cost_panelLayout.setHorizontalGroup(
            Cost_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Cost_panelLayout.createSequentialGroup()
                .addGroup(Cost_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Cost_panelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(Cost_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jlbdCostMealText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jlbdCostDrinkText, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Cost_panelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlbdCostMadeText, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)))
                .addGroup(Cost_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CostMealShow, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                    .addComponent(CostDrinkShow)
                    .addComponent(TotalCostShow))
                .addGap(47, 47, 47))
        );
        Cost_panelLayout.setVerticalGroup(
            Cost_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Cost_panelLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(Cost_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlbdCostMealText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CostMealShow, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Cost_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlbdCostDrinkText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CostDrinkShow, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Cost_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TotalCostShow, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbdCostMadeText, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        getContentPane().add(Cost_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 396, 481, 230));

        Payment_panel.setBackground(new java.awt.Color(0, 0, 0));
        Payment_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 12));

        TaxShow.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TaxShow.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TaxShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaxShowActionPerformed(evt);
            }
        });

        SubTotalShow.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SubTotalShow.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SubTotalShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubTotalShowActionPerformed(evt);
            }
        });

        TotalShow.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TotalShow.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TotalShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalShowActionPerformed(evt);
            }
        });

        jlbdSubTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbdSubTotal.setForeground(new java.awt.Color(255, 255, 255));
        jlbdSubTotal.setText("Sub Total");

        jlbdTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbdTotal.setForeground(new java.awt.Color(255, 255, 255));
        jlbdTotal.setText("Total");

        jlbdTax2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbdTax2.setForeground(new java.awt.Color(255, 255, 255));
        jlbdTax2.setText("Tax");

        javax.swing.GroupLayout Payment_panelLayout = new javax.swing.GroupLayout(Payment_panel);
        Payment_panel.setLayout(Payment_panelLayout);
        Payment_panelLayout.setHorizontalGroup(
            Payment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Payment_panelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(Payment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jlbdTax2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbdSubTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlbdTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(480, 480, 480)
                .addGroup(Payment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TaxShow)
                    .addComponent(SubTotalShow)
                    .addComponent(TotalShow))
                .addGap(47, 47, 47))
        );
        Payment_panelLayout.setVerticalGroup(
            Payment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Payment_panelLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(Payment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlbdTax2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TaxShow, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Payment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlbdSubTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SubTotalShow, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Payment_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(TotalShow, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbdTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        getContentPane().add(Payment_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 600, 250));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 12));

        jBut_Save.setBackground(new java.awt.Color(0, 0, 0));
        jBut_Save.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBut_Save.setForeground(new java.awt.Color(255, 255, 255));
        jBut_Save.setText("Print Slip");
        jBut_Save.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBut_Save.setBorderPainted(false);
        jBut_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_SaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jBut_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(513, 513, 513)
                .addComponent(jBut_Save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 130, 370, 590));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 12));

        jBut_Total.setBackground(new java.awt.Color(0, 0, 0));
        jBut_Total.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBut_Total.setForeground(new java.awt.Color(255, 255, 255));
        jBut_Total.setText("Total");
        jBut_Total.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBut_Total.setBorderPainted(false);
        jBut_Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_TotalActionPerformed(evt);
            }
        });

        jBut_Receipt.setBackground(new java.awt.Color(0, 0, 0));
        jBut_Receipt.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBut_Receipt.setForeground(new java.awt.Color(255, 255, 255));
        jBut_Receipt.setText("Receipt");
        jBut_Receipt.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBut_Receipt.setBorderPainted(false);
        jBut_Receipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_ReceiptActionPerformed(evt);
            }
        });

        jBut_Reset.setBackground(new java.awt.Color(0, 0, 0));
        jBut_Reset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBut_Reset.setForeground(new java.awt.Color(255, 255, 255));
        jBut_Reset.setText("Reset");
        jBut_Reset.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBut_Reset.setBorderPainted(false);
        jBut_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_ResetActionPerformed(evt);
            }
        });

        jBut_Exit.setBackground(new java.awt.Color(0, 0, 0));
        jBut_Exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBut_Exit.setForeground(new java.awt.Color(255, 255, 255));
        jBut_Exit.setText("Exit");
        jBut_Exit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jBut_Exit.setBorderPainted(false);
        jBut_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBut_ExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jBut_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jBut_Receipt, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jBut_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jBut_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBut_Total)
                    .addComponent(jBut_Receipt)
                    .addComponent(jBut_Reset)
                    .addComponent(jBut_Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 644, -1, 70));

        Drink_Panel.setBackground(new java.awt.Color(0, 0, 0));
        Drink_Panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 12));

        jlbdTax3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbdTax3.setForeground(new java.awt.Color(255, 255, 255));
        jlbdTax3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlbdTax3.setText("DRINKS & SHAKES");

        jlbdMilkShake.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbdMilkShake.setForeground(new java.awt.Color(255, 255, 255));
        jlbdMilkShake.setText("Milk Shake   150/=");

        VanQty.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        VanQty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        VanQty.setText("0");
        VanQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VanQtyActionPerformed(evt);
            }
        });

        jlbdVanCone.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbdVanCone.setForeground(new java.awt.Color(255, 255, 255));
        jlbdVanCone.setText("Choclate Shake 200/=");

        jlbdClassicVAn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbdClassicVAn.setForeground(new java.awt.Color(255, 255, 255));
        jlbdClassicVAn.setText("Special Oreo Shake   300/=");

        ClasVan.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ClasVan.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ClasVan.setText("0");
        ClasVan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClasVanActionPerformed(evt);
            }
        });

        VanMilkQty.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        VanMilkQty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        VanMilkQty.setText("0");
        VanMilkQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VanMilkQtyActionPerformed(evt);
            }
        });

        ChocMilkQty.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        ChocMilkQty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ChocMilkQty.setText("0");
        ChocMilkQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChocMilkQtyActionPerformed(evt);
            }
        });

        jlbdChShake.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbdChShake.setForeground(new java.awt.Color(255, 255, 255));
        jlbdChShake.setText("Special Shake  500/=");

        jlbdVanShake.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlbdVanShake.setForeground(new java.awt.Color(255, 255, 255));
        jlbdVanShake.setText("Vanilla Milk Shake   250/=");

        MilkQty.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MilkQty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MilkQty.setText("0");
        MilkQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MilkQtyActionPerformed(evt);
            }
        });

        MilkQty1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MilkQty1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MilkQty1.setText("0");
        MilkQty1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MilkQty1ActionPerformed(evt);
            }
        });

        MilkQty2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MilkQty2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MilkQty2.setText("0");
        MilkQty2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MilkQty2ActionPerformed(evt);
            }
        });

        MilkQty3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MilkQty3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MilkQty3.setText("0");
        MilkQty3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MilkQty3ActionPerformed(evt);
            }
        });

        MilkQty4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MilkQty4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MilkQty4.setText("0");
        MilkQty4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MilkQty4ActionPerformed(evt);
            }
        });

        MilkQty5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        MilkQty5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MilkQty5.setText("0");
        MilkQty5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MilkQty5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Drink_PanelLayout = new javax.swing.GroupLayout(Drink_Panel);
        Drink_Panel.setLayout(Drink_PanelLayout);
        Drink_PanelLayout.setHorizontalGroup(
            Drink_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Drink_PanelLayout.createSequentialGroup()
                .addGroup(Drink_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Drink_PanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(Drink_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Drink_PanelLayout.createSequentialGroup()
                                .addGroup(Drink_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(Drink_PanelLayout.createSequentialGroup()
                                        .addGroup(Drink_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jlbdChShake, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlbdVanShake, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(448, 448, 448))
                                    .addGroup(Drink_PanelLayout.createSequentialGroup()
                                        .addComponent(jlbdVanCone, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(MilkQty1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(Drink_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ChocMilkQty, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ClasVan, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(VanMilkQty, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(VanQty, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(Drink_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(Drink_PanelLayout.createSequentialGroup()
                                    .addComponent(jlbdClassicVAn, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(MilkQty2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(Drink_PanelLayout.createSequentialGroup()
                                    .addComponent(jlbdMilkShake, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(148, 148, 148)
                                    .addComponent(MilkQty, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(MilkQty3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(MilkQty4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(MilkQty5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(Drink_PanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jlbdTax3, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Drink_PanelLayout.setVerticalGroup(
            Drink_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Drink_PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbdTax3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Drink_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbdMilkShake, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MilkQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(Drink_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(Drink_PanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(Drink_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(VanQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlbdVanCone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MilkQty1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(Drink_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(Drink_PanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ClasVan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Drink_PanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jlbdClassicVAn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(Drink_PanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(MilkQty3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MilkQty2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Drink_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VanMilkQty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Drink_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlbdVanShake, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(MilkQty4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(Drink_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ChocMilkQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbdChShake, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MilkQty5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
        );

        getContentPane().add(Drink_Panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 120, 470, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BurgerQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BurgerQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BurgerQtyActionPerformed

    private void BurgMealQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BurgMealQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BurgMealQtyActionPerformed

    private void FishQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FishQtyActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_FishQtyActionPerformed

    private void ChLegQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChLegQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChLegQtyActionPerformed

    private void BacCheQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BacCheQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BacCheQtyActionPerformed

    private void MilkQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MilkQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MilkQtyActionPerformed

    private void VanQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VanQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VanQtyActionPerformed

    private void ClasVanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClasVanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClasVanActionPerformed

    private void VanMilkQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VanMilkQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VanMilkQtyActionPerformed

    private void ChocMilkQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChocMilkQtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChocMilkQtyActionPerformed

    private void TaxShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaxShowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TaxShowActionPerformed

    private void SubTotalShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubTotalShowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SubTotalShowActionPerformed

    private void TotalShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalShowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalShowActionPerformed

    private void TotalCostShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalCostShowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TotalCostShowActionPerformed

    private void CostDrinkShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CostDrinkShowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CostDrinkShowActionPerformed

    private void CostMealShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CostMealShowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CostMealShowActionPerformed

    private void jBut_ReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_ReceiptActionPerformed
       //======================================================================
        int refs = 1325 + (int)(Math.random()*4328);

        //======================================================================
        Calendar timer = Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
        
        tTime.format(timer.getTime());
        
        SimpleDateFormat Tdate = new SimpleDateFormat("dd-MMM-yyyy");
        
        Tdate.format(timer.getTime());
        
        Receipt_Panel.append("\n"+"\t       H&H FOOD STUDIO:\n" + 
                "\n"+
                " References:\t\t\t" + refs +
                "\n====================================================\n" + 
                    " Meals:\t\t" + CostMealShow.getText()+ "\n\n"+
                    " Drinks:\t\t" + CostDrinkShow.getText()+ "\n\n"+
                    " Total Cost:\t\t" + TotalCostShow.getText()+ "\n\n"
                +
                "\n====================================================\n" + "\n\n" +
                
                " Tax:\t\t" + TaxShow.getText() + "\n\n" +
                " SubTotal:\t\t" + SubTotalShow.getText() + "\n\n" +
                " TotalShow:\t\t" + TotalShow.getText() + "\n\n" +
                
                "====================================================="+
                "\n\n" +
        
                "Order Date : " + Tdate.format(timer.getTime())+"\n\n" +
                "Order Time : " + tTime.format(timer.getTime())+
                
                "\n\n\n\t             THANK YOU ");

        
        
    }//GEN-LAST:event_jBut_ReceiptActionPerformed

    private void jBut_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_ResetActionPerformed

        
        
        //For Payment Receipt Reset Function//
        Receipt_Panel.setText(null);
       


        //For Payment Panel Reset
        JTextField clearText = (null);
        for (Component c: Payment_panel.getComponents()) {
            if (c.getClass().toString().contains("javax.swing.JTextField")) {
                clearText = (JTextField)c;
                clearText.setText("");                
            }
            
        }
        
        //For Cost Panel Reset Function//
        for (Component c: Cost_panel.getComponents()) {
            if (c.getClass().toString().contains("javax.swing.JTextField")) {
                clearText = (JTextField)c;
                clearText.setText("");                
            }
            
        }
        //For Meal Panel Reset Function//
        for (Component c: Meal_Panel.getComponents()) {
            if (c.getClass().toString().contains("javax.swing.JTextField")) {
                clearText = (JTextField)c;
                clearText.setText("0");                
            }
            
        }
        //For Drink Panel Reset Function//
        for (Component c: Drink_Panel.getComponents()) {
            if (c.getClass().toString().contains("javax.swing.JTextField")) {
                clearText = (JTextField)c;
                clearText.setText("0");                
            }
            
        }
        
        
    }//GEN-LAST:event_jBut_ResetActionPerformed

    private void jBut_TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_TotalActionPerformed
         
        double iTax, iSubTotal , iTotal;
        
        SubClass_Child ItemCost = new SubClass_Child();
        ItemCost.ZingerBurger = ItemCost.pZingerBurger * Double .parseDouble(FishQty.getText());
        ItemCost.ZingerCheeseBurger = ItemCost.pZingerCheeseBurger * Double .parseDouble(BurgerQty.getText());
        ItemCost.ChickenCheeseBurger= ItemCost.pChickenCheeseBurger * Double .parseDouble(BurgMealQty.getText());
        ItemCost.ChickenLegend = ItemCost.pChickenLegend * Double .parseDouble(ChLegQty.getText());
        ItemCost.BaconAndCheeseBurger = ItemCost.pBaconAndCheeseBurger * Double .parseDouble(BacCheQty.getText());
        ItemCost.MilkShake = ItemCost.pMilkShake * Double .parseDouble(MilkQty.getText());
        ItemCost.SpecialOreoShake = ItemCost.pSpecialOreoShake * Double .parseDouble(VanQty.getText());
        ItemCost.VanMilkShake = ItemCost.pVanMilkShake * Double .parseDouble(VanMilkQty.getText());
        ItemCost.SpeciakShake = ItemCost.pSpeciakShake * Double .parseDouble(ClasVan.getText());
        
        iSubTotal = ItemCost.getAmount();
        iTax = ItemCost.cFindTax(iSubTotal);
        iTotal = iSubTotal + iTax;
        
        String SubTotal = String.format("%.2f Rs", iSubTotal);
        SubTotalShow.setText(SubTotal);
        
        String Tax = String.format("%.2f Rs", iTax);
        TaxShow.setText(Tax);
       
        String Total = String.format("%.2f Rs", iTotal);
        TotalShow.setText(Total);
        
        String Meal = String.format("%.2f Rs", ItemCost.Meals);
        CostMealShow.setText(Meal);
        
        String Drink = String.format("%.2f Rs", ItemCost.Drinks);
        CostDrinkShow.setText(Drink);

        String TotalS = String.format("%.2f Rs", ItemCost.TotalofMD);
        TotalCostShow.setText(TotalS);
        
        
    }//GEN-LAST:event_jBut_TotalActionPerformed

    private void jBut_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_ExitActionPerformed
        this.dispose();
//        SubClass_Child iExit = new SubClass_Child();
//        iExit.iExitSystem();
//        SubClass_Child iExit = new SubClass_Child();
//        
//        iExit.iExitSystem();
//       
//         TODO add your handling code here:
    }//GEN-LAST:event_jBut_ExitActionPerformed

    private void MilkQty1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MilkQty1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MilkQty1ActionPerformed

    private void MilkQty2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MilkQty2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MilkQty2ActionPerformed

    private void MilkQty3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MilkQty3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MilkQty3ActionPerformed

    private void MilkQty4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MilkQty4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MilkQty4ActionPerformed

    private void MilkQty5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MilkQty5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MilkQty5ActionPerformed

    private void jBut_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBut_SaveActionPerformed
        try {
            // TODO add your handling code here:

            Receipt_Panel.print();
        } catch (PrinterException ex) {

        }
    }//GEN-LAST:event_jBut_SaveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
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
            java.util.logging.Logger.getLogger(OO_Resturant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OO_Resturant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OO_Resturant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OO_Resturant.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        java.awt.EventQueue.invokeLater(() -> {
            new OO_Resturant().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BacCheQty;
    private javax.swing.JTextField BurgMealQty;
    private javax.swing.JTextField BurgerQty;
    private javax.swing.JTextField ChLegQty;
    private javax.swing.JTextField ChocMilkQty;
    private javax.swing.JTextField ClasVan;
    private javax.swing.JTextField CostDrinkShow;
    private javax.swing.JTextField CostMealShow;
    private javax.swing.JPanel Cost_panel;
    private javax.swing.JPanel Drink_Panel;
    private javax.swing.JTextField FishQty;
    private javax.swing.JPanel Meal_Panel;
    private javax.swing.JTextField MilkQty;
    private javax.swing.JTextField MilkQty1;
    private javax.swing.JTextField MilkQty2;
    private javax.swing.JTextField MilkQty3;
    private javax.swing.JTextField MilkQty4;
    private javax.swing.JTextField MilkQty5;
    private javax.swing.JPanel Payment_panel;
    private javax.swing.JTextField SubTotalShow;
    private javax.swing.JTextField TaxShow;
    private javax.swing.JTextField TotalCostShow;
    private javax.swing.JTextField TotalShow;
    private javax.swing.JTextField VanMilkQty;
    private javax.swing.JTextField VanQty;
    private javax.swing.JButton jBut_Exit;
    private javax.swing.JButton jBut_Receipt;
    private javax.swing.JButton jBut_Reset;
    private javax.swing.JButton jBut_Save;
    private javax.swing.JButton jBut_Total;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel jlbdBurMeal;
    private javax.swing.JLabel jlbdChBurg;
    private javax.swing.JLabel jlbdChShake;
    private javax.swing.JLabel jlbdCheese;
    private javax.swing.JLabel jlbdChicLegend;
    private javax.swing.JLabel jlbdClassicVAn;
    private javax.swing.JLabel jlbdCostDrinkText;
    private javax.swing.JLabel jlbdCostMadeText;
    private javax.swing.JLabel jlbdCostMealText;
    private javax.swing.JLabel jlbdFish;
    private javax.swing.JLabel jlbdMilkShake;
    private javax.swing.JLabel jlbdSubTotal;
    private javax.swing.JLabel jlbdTax2;
    private javax.swing.JLabel jlbdTax3;
    private javax.swing.JLabel jlbdTax6;
    private javax.swing.JLabel jlbdTotal;
    private javax.swing.JLabel jlbdVanCone;
    private javax.swing.JLabel jlbdVanShake;
    // End of variables declaration//GEN-END:variables

    private static class Receipt_Panel {

        private static void append(String string) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public Receipt_Panel() {
        }
    }
}
