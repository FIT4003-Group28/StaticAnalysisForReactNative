package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: zyx  reason: default package */
/* loaded from: classes4.dex */
final class zyx implements View.OnClickListener {
    final /* synthetic */ aaar a;
    final /* synthetic */ arip b;

    public zyx(aaar aaarVar, arip aripVar) {
        this.a = aaarVar;
        this.b = aripVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aaar aaarVar = this.a;
        if (aaarVar.r) {
            aafo aafoVar = aaarVar.A;
            apzg apzgVar = this.b.g;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, null);
        }
    }
}
