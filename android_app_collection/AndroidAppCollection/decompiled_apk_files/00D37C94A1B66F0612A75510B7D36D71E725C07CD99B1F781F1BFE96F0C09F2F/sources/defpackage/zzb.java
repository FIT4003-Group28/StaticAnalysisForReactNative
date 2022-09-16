package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: zzb  reason: default package */
/* loaded from: classes4.dex */
final class zzb implements View.OnClickListener {
    final /* synthetic */ aaar a;
    final /* synthetic */ arjd b;

    public zzb(aaar aaarVar, arjd arjdVar) {
        this.a = aaarVar;
        this.b = arjdVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aaar aaarVar = this.a;
        if (aaarVar.r) {
            aafo aafoVar = aaarVar.A;
            apzg apzgVar = this.b.h;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, null);
        }
    }
}
