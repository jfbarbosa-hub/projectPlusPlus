package ProjectPlus.behavior;

/*Generated by MPS */

import jetbrains.mps.core.aspects.behaviour.BaseBHDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.core.aspects.behaviour.api.SMethod;
import jetbrains.mps.core.aspects.behaviour.SMethodBuilder;
import jetbrains.mps.core.aspects.behaviour.SJavaCompoundTypeImpl;
import jetbrains.mps.core.aspects.behaviour.AccessPrivileges;
import java.util.List;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;
import org.jetbrains.mps.openapi.language.SProperty;

public final class M1Person__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getConcept(0x8dfc7aaafac2458eL, 0x9c794064d1cad134L, 0x1af72e38b3939d14L, "ProjectPlus.structure.M1Person");

  public static final SMethod<Integer> getId_id1hTmsN$3Awu = new SMethodBuilder<Integer>(new SJavaCompoundTypeImpl(Integer.class)).name("getId").modifiers(0, AccessPrivileges.PUBLIC).concept(CONCEPT).id("1hTmsN$3Awu").build();
  public static final SMethod<String> getName_id1hTmsN$3Ax9 = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getName").modifiers(0, AccessPrivileges.PUBLIC).concept(CONCEPT).id("1hTmsN$3Ax9").build();
  public static final SMethod<String> getWorkstation_id1hTmsN$3PJI = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getWorkstation").modifiers(0, AccessPrivileges.PUBLIC).concept(CONCEPT).id("1hTmsN$3PJI").build();
  public static final SMethod<String> getDepartment_id1hTmsN$3Q9A = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getDepartment").modifiers(0, AccessPrivileges.PUBLIC).concept(CONCEPT).id("1hTmsN$3Q9A").build();
  public static final SMethod<String> getRol_id1hTmsN$3UUn = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getRol").modifiers(0, AccessPrivileges.PUBLIC).concept(CONCEPT).id("1hTmsN$3UUn").build();
  public static final SMethod<String> getPhoneNumber_id1hTmsN$3VTA = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("getPhoneNumber").modifiers(0, AccessPrivileges.PUBLIC).concept(CONCEPT).id("1hTmsN$3VTA").build();
  public static final SMethod<Boolean> getImportant_id1hTmsN$3WWs = new SMethodBuilder<Boolean>(new SJavaCompoundTypeImpl(Boolean.class)).name("getImportant").modifiers(0, AccessPrivileges.PUBLIC).concept(CONCEPT).id("1hTmsN$3WWs").build();

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(getId_id1hTmsN$3Awu, getName_id1hTmsN$3Ax9, getWorkstation_id1hTmsN$3PJI, getDepartment_id1hTmsN$3Q9A, getRol_id1hTmsN$3UUn, getPhoneNumber_id1hTmsN$3VTA, getImportant_id1hTmsN$3WWs);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static Integer getId_id1hTmsN$3Awu(@NotNull SNode __thisNode__) {
    return SPropertyOperations.getInteger(__thisNode__, PROPS.id$BVSr);
  }
  /*package*/ static String getName_id1hTmsN$3Ax9(@NotNull SNode __thisNode__) {
    return SPropertyOperations.getString(__thisNode__, PROPS.name$BVqp);
  }
  /*package*/ static String getWorkstation_id1hTmsN$3PJI(@NotNull SNode __thisNode__) {
    return SPropertyOperations.getString(__thisNode__, PROPS.workstation$C1wN);
  }
  /*package*/ static String getDepartment_id1hTmsN$3Q9A(@NotNull SNode __thisNode__) {
    return SPropertyOperations.getEnum(__thisNode__, PROPS.department$yUtb).getName();
  }
  /*package*/ static String getRol_id1hTmsN$3UUn(@NotNull SNode __thisNode__) {
    return SPropertyOperations.getEnum(__thisNode__, PROPS.rol$z0z_).getName();
  }
  /*package*/ static String getPhoneNumber_id1hTmsN$3VTA(@NotNull SNode __thisNode__) {
    return SPropertyOperations.getString(__thisNode__, PROPS.phoneNumber$z6T0);
  }
  /*package*/ static Boolean getImportant_id1hTmsN$3WWs(@NotNull SNode __thisNode__) {
    return SPropertyOperations.getBoolean(__thisNode__, PROPS.important$z8y7);
  }

  /*package*/ M1Person__BehaviorDescriptor() {
  }

  @Override
  protected void initNode(@NotNull SNode node, @NotNull SConstructor constructor, @Nullable Object[] parameters) {
    ___init___(node);
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SNode node, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      case 0:
        return (T) ((Integer) getId_id1hTmsN$3Awu(node));
      case 1:
        return (T) ((String) getName_id1hTmsN$3Ax9(node));
      case 2:
        return (T) ((String) getWorkstation_id1hTmsN$3PJI(node));
      case 3:
        return (T) ((String) getDepartment_id1hTmsN$3Q9A(node));
      case 4:
        return (T) ((String) getRol_id1hTmsN$3UUn(node));
      case 5:
        return (T) ((String) getPhoneNumber_id1hTmsN$3VTA(node));
      case 6:
        return (T) ((Boolean) getImportant_id1hTmsN$3WWs(node));
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SAbstractConcept concept, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @NotNull
  @Override
  public List<SMethod<?>> getDeclaredMethods() {
    return BH_METHODS;
  }

  @NotNull
  @Override
  public SAbstractConcept getConcept() {
    return CONCEPT;
  }

  private static final class PROPS {
    /*package*/ static final SProperty id$BVSr = MetaAdapterFactory.getProperty(0x8dfc7aaafac2458eL, 0x9c794064d1cad134L, 0x1af72e38b3939d14L, 0x1af72e38b3939e67L, "id");
    /*package*/ static final SProperty name$BVqp = MetaAdapterFactory.getProperty(0x8dfc7aaafac2458eL, 0x9c794064d1cad134L, 0x1af72e38b3939d14L, 0x1af72e38b3939e65L, "name");
    /*package*/ static final SProperty workstation$C1wN = MetaAdapterFactory.getProperty(0x8dfc7aaafac2458eL, 0x9c794064d1cad134L, 0x1af72e38b3939d14L, 0x1af72e38b3939e6aL, "workstation");
    /*package*/ static final SProperty department$yUtb = MetaAdapterFactory.getProperty(0x8dfc7aaafac2458eL, 0x9c794064d1cad134L, 0x1af72e38b3939d14L, 0x280d697b090a49ddL, "department");
    /*package*/ static final SProperty rol$z0z_ = MetaAdapterFactory.getProperty(0x8dfc7aaafac2458eL, 0x9c794064d1cad134L, 0x1af72e38b3939d14L, 0x280d697b090a49e2L, "rol");
    /*package*/ static final SProperty phoneNumber$z6T0 = MetaAdapterFactory.getProperty(0x8dfc7aaafac2458eL, 0x9c794064d1cad134L, 0x1af72e38b3939d14L, 0x280d697b090a49e8L, "phoneNumber");
    /*package*/ static final SProperty important$z8y7 = MetaAdapterFactory.getProperty(0x8dfc7aaafac2458eL, 0x9c794064d1cad134L, 0x1af72e38b3939d14L, 0x280d697b090a49efL, "important");
  }
}
