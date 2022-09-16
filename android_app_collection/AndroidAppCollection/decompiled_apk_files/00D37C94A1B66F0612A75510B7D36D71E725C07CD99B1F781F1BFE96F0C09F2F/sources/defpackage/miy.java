package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: miy  reason: default package */
/* loaded from: classes3.dex */
final class miy implements View.OnClickListener {
    final /* synthetic */ ajrs a;
    final /* synthetic */ aupu b;
    final /* synthetic */ mja c;

    public miy(mja mjaVar, ajrs ajrsVar, aupu aupuVar) {
        this.c = mjaVar;
        this.a = ajrsVar;
        this.b = aupuVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aupv aupvVar;
        lsu lsuVar = (lsu) this.a.c("avatar_selection_listener");
        aupu aupuVar = this.b;
        if (aupuVar.e == 11) {
            aupvVar = (aupv) aupuVar.f;
        } else {
            aupvVar = aupv.a;
        }
        if (aupvVar.b != 60487319 || lsuVar == null) {
            aupu aupuVar2 = this.b;
            if (aupuVar2.e != 6) {
                return;
            }
            this.c.a.c((apzg) aupuVar2.f, null);
            return;
        }
        aopa mo52toBuilder = this.b.mo52toBuilder();
        lsuVar.a.s(mo52toBuilder);
        this.c.b = (aupu) mo52toBuilder.mo39build();
    }
}
