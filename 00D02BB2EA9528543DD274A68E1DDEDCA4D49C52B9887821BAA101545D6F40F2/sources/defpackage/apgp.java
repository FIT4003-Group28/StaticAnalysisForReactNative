package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: apgp  reason: default package */
/* loaded from: classes2.dex */
public final class apgp implements View.OnClickListener {
    final /* synthetic */ apgq a;

    public apgp(apgq apgqVar) {
        this.a = apgqVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        deaa deaaVar;
        cjqy cjqyVar = this.a.e;
        cjte cjteVar = new cjte(deaf.TAP);
        cjta b = cjtd.b();
        b.d = dtyi.bS;
        ddzy bZ = deab.c.bZ();
        if (this.a.d().booleanValue()) {
            deaaVar = deaa.TOGGLE_ON;
        } else {
            deaaVar = deaa.TOGGLE_OFF;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        b.a = bZ.bK();
        cjqyVar.m(cjteVar, b.a());
        this.a.k();
    }
}
