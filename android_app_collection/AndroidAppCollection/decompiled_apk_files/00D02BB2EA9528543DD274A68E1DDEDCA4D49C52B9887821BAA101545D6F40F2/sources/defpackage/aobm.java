package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aobm  reason: default package */
/* loaded from: classes2.dex */
public final class aobm implements View.OnClickListener {
    final /* synthetic */ aobn a;

    public aobm(aobn aobnVar) {
        this.a = aobnVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        cjqy cjqyVar = this.a.a;
        cjte cjteVar = new cjte(deaf.TAP);
        cjta b = cjtd.b();
        b.d = dtyi.bS;
        ddzy bZ = deab.c.bZ();
        deaa deaaVar = this.a.k().booleanValue() ? deaa.TOGGLE_ON : deaa.TOGGLE_OFF;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        b.a = bZ.bK();
        cjqyVar.m(cjteVar, b.a());
        this.a.p();
    }
}
