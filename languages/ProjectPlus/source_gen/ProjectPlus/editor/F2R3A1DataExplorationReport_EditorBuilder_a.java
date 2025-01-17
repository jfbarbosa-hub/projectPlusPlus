package ProjectPlus.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.descriptor.AbstractEditorBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;
import jetbrains.mps.nodeEditor.cellLayout.CellLayout_Vertical;
import jetbrains.mps.nodeEditor.cells.EditorCell_Component;
import javax.swing.JComponent;
import javax.swing.JTextArea;
import javax.swing.BorderFactory;
import java.awt.Color;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import org.jetbrains.mps.openapi.language.SProperty;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

/*package*/ class F2R3A1DataExplorationReport_EditorBuilder_a extends AbstractEditorBuilder {
  @NotNull
  private SNode myNode;

  public F2R3A1DataExplorationReport_EditorBuilder_a(@NotNull EditorContext context, @NotNull SNode node) {
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
    editorCell.setCellId("Collection_wxomku_a");
    editorCell.setBig(true);
    setCellContext(editorCell);
    editorCell.addEditorCell(createJComponent_0());
    return editorCell;
  }
  private EditorCell createJComponent_0() {
    EditorCell editorCell = EditorCell_Component.createComponentCell(getEditorContext(), myNode, _QueryFunction_JComponent_wxomku_a0a(), "JComponent_wxomku_a0");
    editorCell.setCellId("JComponent_wxomku_a0_0");
    return editorCell;
  }
  private JComponent _QueryFunction_JComponent_wxomku_a0a() {
    String text = " Next, it proceeds to its exploration, whose purpose is to find a general structure for \n the data. This involves applying basic statistical tests, revealing properties in the newly acquired data, \n creating frequency tables, and constructing distribution plots. The result of this task write it in \n report here. \n Based on the thesis: Metodología para la Definición de Requisitos en Proyectos de Data Mining (ER-DM) \n by Jose Alberto Gallardo Arancibia.  \n Write your description here. If you want to go to the next line, press Enter.";
    JTextArea ta = new JTextArea(text);
    ta.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    SPropertyOperations.assign(myNode, PROPS.description$yDxg, ta.getText());
    return ta;
  }

  private static final class PROPS {
    /*package*/ static final SProperty description$yDxg = MetaAdapterFactory.getProperty(0x8dfc7aaafac2458eL, 0x9c794064d1cad134L, 0x34315b05266b528dL, 0x26631198a20f71eaL, "description");
  }
}
