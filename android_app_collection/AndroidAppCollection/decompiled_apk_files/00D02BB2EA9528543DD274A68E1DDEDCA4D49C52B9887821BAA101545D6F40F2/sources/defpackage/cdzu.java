package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdzu  reason: default package */
/* loaded from: classes4.dex */
public final class cdzu implements View.OnClickListener {
    final /* synthetic */ ceae a;

    public cdzu(ceae ceaeVar) {
        this.a = ceaeVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ceae ceaeVar = this.a;
        ceaw ceawVar = ceaeVar.ag;
        if (ceawVar == null) {
            dzvx.a("photoPostSubmitter");
        }
        ceawVar.c(ceaeVar.aR());
        ceam h = ceawVar.c.h();
        if (h == null || !h.d) {
            return;
        }
        ceawVar.g.a(akeu.j(new ceat(ceawVar)).b());
    }
}
