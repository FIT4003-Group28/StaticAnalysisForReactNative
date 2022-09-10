package defpackage;
/* compiled from: PG */
/* renamed from: jjm  reason: default package */
/* loaded from: classes.dex */
public final class jjm implements jkf {
    private static final jkj b = new jjl();
    @dzsi
    public jkf a;

    @Override // defpackage.jkf
    public final void B(jjn jjnVar) {
        jkf jkfVar = this.a;
        if (jkfVar != null) {
            jkfVar.B(jjnVar);
        }
    }

    @Override // defpackage.jkf
    public final jkj l() {
        jkf jkfVar = this.a;
        return jkfVar == null ? b : jkfVar.l();
    }

    @Override // defpackage.jkf
    public final void setExpandingState(jjn jjnVar, boolean z) {
        jkf jkfVar = this.a;
        if (jkfVar != null) {
            jkfVar.setExpandingState(jjnVar, z);
        }
    }

    @Override // defpackage.jkf
    public final void setExpandingStateTransition(jkc jkcVar, jkc jkcVar2, boolean z) {
        jkf jkfVar = this.a;
        if (jkfVar != null) {
            jkfVar.setExpandingStateTransition(jkcVar, jkcVar2, z);
        }
    }

    @Override // defpackage.jkf
    public final void setHidden(boolean z) {
        jkf jkfVar = this.a;
        if (jkfVar != null) {
            jkfVar.setHidden(true);
        }
    }

    @Override // defpackage.jkf
    public final void v() {
        jkf jkfVar = this.a;
        if (jkfVar != null) {
            jkfVar.v();
        }
    }

    @Override // defpackage.jkf
    public final boolean w() {
        jkf jkfVar = this.a;
        if (jkfVar != null) {
            return jkfVar.w();
        }
        return false;
    }
}
