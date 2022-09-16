package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bdxu  reason: default package */
/* loaded from: classes3.dex */
public final class bdxu implements View.OnClickListener {
    final /* synthetic */ bdyb a;

    public bdxu(bdyb bdybVar) {
        this.a = bdybVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        bdyb bdybVar = this.a;
        if (!bdybVar.aD) {
            return;
        }
        jjn L = bdybVar.br.l().L();
        if (!this.a.bT() || this.a.aU()) {
            if (!this.a.bS() || L != jjn.HIDDEN) {
                this.a.br.v();
                this.a.bH(!L.b());
            } else {
                this.a.br.B(this.a.br.l().C(jjn.HIDDEN) == this.a.br.l().C(jjn.COLLAPSED) ? jjn.EXPANDED : jjn.COLLAPSED);
            }
        } else {
            this.a.aR(jjn.COLLAPSED);
        }
        this.a.bc.a(L, this.a.br.l().L());
    }
}
