package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zxh  reason: default package */
/* loaded from: classes7.dex */
public final class zxh implements jkf, jkj {
    final View a;

    public zxh(View view) {
        this.a = view;
    }

    private final int a() {
        return this.a.getBottom() - this.a.getTop();
    }

    @Override // defpackage.jkj
    public final boolean A(jjn jjnVar) {
        return jjnVar == jjn.COLLAPSED;
    }

    @Override // defpackage.jkf
    public final void B(jjn jjnVar) {
    }

    @Override // defpackage.jkj
    public final int C(jjn jjnVar) {
        return a();
    }

    @Override // defpackage.jkj
    public final jjn D(jjn jjnVar) {
        return jjn.COLLAPSED;
    }

    @Override // defpackage.jkj
    public final jjn E(jjn jjnVar) {
        return jjn.COLLAPSED;
    }

    @Override // defpackage.jkj
    public final jjn L() {
        return jjn.COLLAPSED;
    }

    @Override // defpackage.jkj
    public final int M() {
        return a();
    }

    @Override // defpackage.jkj
    public final int U() {
        return a();
    }

    @Override // defpackage.jkj
    public final int getTop() {
        return this.a.getTop();
    }

    @Override // defpackage.jkj
    @dzsi
    public final View j() {
        return null;
    }

    @Override // defpackage.jkf
    public final jkj l() {
        return this;
    }

    @Override // defpackage.jkf
    public final void setExpandingState(jjn jjnVar, boolean z) {
    }

    @Override // defpackage.jkf
    public final void setExpandingStateTransition(jkc jkcVar, jkc jkcVar2, boolean z) {
    }

    @Override // defpackage.jkf
    public final void setHidden(boolean z) {
    }

    @Override // defpackage.jkf
    public final void v() {
    }

    @Override // defpackage.jkf
    public final boolean w() {
        return false;
    }

    @Override // defpackage.jkj
    public final jjn z(jjn jjnVar) {
        return jjn.COLLAPSED;
    }
}
