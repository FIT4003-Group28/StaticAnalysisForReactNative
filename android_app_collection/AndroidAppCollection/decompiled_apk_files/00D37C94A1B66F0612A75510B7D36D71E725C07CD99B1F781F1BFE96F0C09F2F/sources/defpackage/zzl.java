package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: zzl  reason: default package */
/* loaded from: classes4.dex */
final class zzl implements View.OnClickListener {
    final /* synthetic */ aaar a;
    final /* synthetic */ arjj b;

    public zzl(aaar aaarVar, arjj arjjVar) {
        this.a = aaarVar;
        this.b = arjjVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aaar aaarVar = this.a;
        if (aaarVar.r) {
            aafo aafoVar = aaarVar.A;
            apzg apzgVar = this.b.j;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, null);
        }
    }
}
