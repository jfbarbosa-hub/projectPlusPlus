package ProjectPlus.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cells.EditorCell_Constant;
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.editor.runtime.style.CellAlign;
import jetbrains.mps.nodeEditor.cells.EditorCell_Component;
import javax.swing.JComponent;
import jetbrains.mps.nodeEditor.EditorSettings;
import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.RenderingHints;
import jetbrains.mps.lang.editor.cellProviders.SingleRoleCellProvider;
import org.jetbrains.mps.openapi.language.SContainmentLink;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.impl.cellActions.CellAction_DeleteSmart;
import jetbrains.mps.openapi.editor.cells.DefaultSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SEmptyContainmentSubstituteInfo;
import jetbrains.mps.nodeEditor.cellMenu.SChildSubstituteInfo;
import jetbrains.mps.openapi.editor.menus.transformation.SNodeLocation;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

/*package*/ class F4R0Modeling_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public F4R0Modeling_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
    super(context);
    myNode = node;
  }

  @NotNull
  @Override
  public SNode getNode() {
    return myNode;
  }

  /*package*/ EditorCell createCell() {
    return createCollection_0();
  }

  private EditorCell createCollection_0() {
    EditorCell_Collection editorCell = new EditorCell_Collection(getEditorContext(), myNode, new CellLayout_Vertical());
    editorCell.setCellId("Collection_36d60z_a");
    editorCell.setBig(true);
    setCellContext(editorCell);
    editorCell.addEditorCell(createConstant_0());
    editorCell.addEditorCell(createJComponent_0());
    editorCell.addEditorCell(createRefNode_0());
    editorCell.addEditorCell(createConstant_1());
    editorCell.addEditorCell(createRefNode_1());
    editorCell.addEditorCell(createConstant_2());
    editorCell.addEditorCell(createRefNode_2());
    editorCell.addEditorCell(createConstant_3());
    editorCell.addEditorCell(createRefNode_3());
    return editorCell;
  }
  private EditorCell createConstant_0() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "Phase 4: Modeling");
    editorCell.setCellId("Constant_36d60z_a0");
    Style style = new StyleImpl();
    style.set(StyleAttributes.FONT_SIZE, 20);
    style.set(StyleAttributes.HORIZONTAL_ALIGN, CellAlign.CENTER);
    editorCell.getStyle().putAll(style);
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createJComponent_0() {
    EditorCell editorCell = EditorCell_Component.createComponentCell(getEditorContext(), myNode, _QueryFunction_JComponent_36d60z_a1a(), "JComponent_36d60z_b0");
    editorCell.setCellId("JComponent_36d60z_b0_0");
    return editorCell;
  }
  private JComponent _QueryFunction_JComponent_36d60z_a1a() {
    final int fontSize = EditorSettings.getInstance().getFontSize();
    final int desiredWidth = fontSize * 80;
    JPanel panel = new JPanel() {

      public Dimension getPreferredSize() {
        return new Dimension(desiredWidth, fontSize);
      }

      protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int height = getHeight();
        g.setColor(Color.black);
        ((Graphics2D) g).setStroke(new BasicStroke(3));
        ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.drawLine(0, height / 2, desiredWidth, height / 2);
      }
    };
    panel.setBackground(new Color(1, 0, 0, 0));
    return panel;
  }
  private EditorCell createRefNode_0() {
    SingleRoleCellProvider provider = new selectModelingTechniqueSingleRoleHandler_36d60z_c0(myNode, LINKS.selectModelingTechnique$Epnu, getEditorContext());
    return provider.createCell();
  }
  private static class selectModelingTechniqueSingleRoleHandler_36d60z_c0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public selectModelingTechniqueSingleRoleHandler_36d60z_c0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(containmentLink, context);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = getUpdateSession().updateChildNodeCell(child);
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), LINKS.selectModelingTechnique$Epnu, child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), LINKS.selectModelingTechnique$Epnu, child));
      installCellInfo(child, editorCell, false);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell, boolean isEmpty) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo((isEmpty ? new SEmptyContainmentSubstituteInfo(editorCell) : new SChildSubstituteInfo(editorCell)));
      }
      if (editorCell.getSRole() == null) {
        editorCell.setSRole(LINKS.selectModelingTechnique$Epnu);
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), LINKS.selectModelingTechnique$Epnu));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_selectModelingTechnique");
        installCellInfo(null, editorCell, true);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no selectModelingTechnique>";
    }
  }
  private EditorCell createConstant_1() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_36d60z_d0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_1() {
    SingleRoleCellProvider provider = new generateTestPlanSingleRoleHandler_36d60z_e0(myNode, LINKS.generateTestPlan$EpPw, getEditorContext());
    return provider.createCell();
  }
  private static class generateTestPlanSingleRoleHandler_36d60z_e0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public generateTestPlanSingleRoleHandler_36d60z_e0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(containmentLink, context);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = getUpdateSession().updateChildNodeCell(child);
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), LINKS.generateTestPlan$EpPw, child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), LINKS.generateTestPlan$EpPw, child));
      installCellInfo(child, editorCell, false);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell, boolean isEmpty) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo((isEmpty ? new SEmptyContainmentSubstituteInfo(editorCell) : new SChildSubstituteInfo(editorCell)));
      }
      if (editorCell.getSRole() == null) {
        editorCell.setSRole(LINKS.generateTestPlan$EpPw);
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), LINKS.generateTestPlan$EpPw));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_generateTestPlan");
        installCellInfo(null, editorCell, true);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no generateTestPlan>";
    }
  }
  private EditorCell createConstant_2() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_36d60z_f0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_2() {
    SingleRoleCellProvider provider = new buildingModelSingleRoleHandler_36d60z_g0(myNode, LINKS.buildingModel$Eqyz, getEditorContext());
    return provider.createCell();
  }
  private static class buildingModelSingleRoleHandler_36d60z_g0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public buildingModelSingleRoleHandler_36d60z_g0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(containmentLink, context);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = getUpdateSession().updateChildNodeCell(child);
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), LINKS.buildingModel$Eqyz, child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), LINKS.buildingModel$Eqyz, child));
      installCellInfo(child, editorCell, false);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell, boolean isEmpty) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo((isEmpty ? new SEmptyContainmentSubstituteInfo(editorCell) : new SChildSubstituteInfo(editorCell)));
      }
      if (editorCell.getSRole() == null) {
        editorCell.setSRole(LINKS.buildingModel$Eqyz);
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), LINKS.buildingModel$Eqyz));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_buildingModel");
        installCellInfo(null, editorCell, true);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no buildingModel>";
    }
  }
  private EditorCell createConstant_3() {
    EditorCell_Constant editorCell = new EditorCell_Constant(getEditorContext(), myNode, "");
    editorCell.setCellId("Constant_36d60z_h0");
    editorCell.setDefaultText("");
    return editorCell;
  }
  private EditorCell createRefNode_3() {
    SingleRoleCellProvider provider = new evaluateModelSingleRoleHandler_36d60z_i0(myNode, LINKS.evaluateModel$EruB, getEditorContext());
    return provider.createCell();
  }
  private static class evaluateModelSingleRoleHandler_36d60z_i0 extends SingleRoleCellProvider {
    @NotNull
    private SNode myNode;

    public evaluateModelSingleRoleHandler_36d60z_i0(SNode ownerNode, SContainmentLink containmentLink, EditorContext context) {
      super(containmentLink, context);
      myNode = ownerNode;
    }

    @Override
    @NotNull
    public SNode getNode() {
      return myNode;
    }

    protected EditorCell createChildCell(SNode child) {
      EditorCell editorCell = getUpdateSession().updateChildNodeCell(child);
      editorCell.setAction(CellActionType.DELETE, new CellAction_DeleteSmart(getNode(), LINKS.evaluateModel$EruB, child));
      editorCell.setAction(CellActionType.BACKSPACE, new CellAction_DeleteSmart(getNode(), LINKS.evaluateModel$EruB, child));
      installCellInfo(child, editorCell, false);
      return editorCell;
    }



    private void installCellInfo(SNode child, EditorCell editorCell, boolean isEmpty) {
      if (editorCell.getSubstituteInfo() == null || editorCell.getSubstituteInfo() instanceof DefaultSubstituteInfo) {
        editorCell.setSubstituteInfo((isEmpty ? new SEmptyContainmentSubstituteInfo(editorCell) : new SChildSubstituteInfo(editorCell)));
      }
      if (editorCell.getSRole() == null) {
        editorCell.setSRole(LINKS.evaluateModel$EruB);
      }
    }
    @Override
    protected EditorCell createEmptyCell() {
      getCellFactory().pushCellContext();
      getCellFactory().setNodeLocation(new SNodeLocation.FromParentAndLink(getNode(), LINKS.evaluateModel$EruB));
      try {
        EditorCell editorCell = super.createEmptyCell();
        editorCell.setCellId("empty_evaluateModel");
        installCellInfo(null, editorCell, true);
        setCellContext(editorCell);
        return editorCell;
      } finally {
        getCellFactory().popCellContext();
      }
    }
    protected String getNoTargetText() {
      return "<no evaluateModel>";
    }
  }

  private static final class LINKS {
    /*package*/ static final SContainmentLink selectModelingTechnique$Epnu = MetaAdapterFactory.getContainmentLink(0x8dfc7aaafac2458eL, 0x9c794064d1cad134L, 0x7d54ef0b645593f2L, 0x5e6034c2f38f455eL, "selectModelingTechnique");
    /*package*/ static final SContainmentLink generateTestPlan$EpPw = MetaAdapterFactory.getContainmentLink(0x8dfc7aaafac2458eL, 0x9c794064d1cad134L, 0x7d54ef0b645593f2L, 0x5e6034c2f38f4560L, "generateTestPlan");
    /*package*/ static final SContainmentLink buildingModel$Eqyz = MetaAdapterFactory.getContainmentLink(0x8dfc7aaafac2458eL, 0x9c794064d1cad134L, 0x7d54ef0b645593f2L, 0x5e6034c2f38f4563L, "buildingModel");
    /*package*/ static final SContainmentLink evaluateModel$EruB = MetaAdapterFactory.getContainmentLink(0x8dfc7aaafac2458eL, 0x9c794064d1cad134L, 0x7d54ef0b645593f2L, 0x5e6034c2f38f4567L, "evaluateModel");
  }
}
