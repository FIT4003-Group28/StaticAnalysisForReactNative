package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: zzi  reason: default package */
/* loaded from: classes4.dex */
final class zzi implements View.OnClickListener {
    final /* synthetic */ aaar a;
    final /* synthetic */ apzg b;

    public zzi(aaar aaarVar, apzg apzgVar) {
        this.a = aaarVar;
        this.b = apzgVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        aaar aaarVar = this.a;
        if (aaarVar.r) {
            aaarVar.A.c(this.b, null);
        }
    }
}
