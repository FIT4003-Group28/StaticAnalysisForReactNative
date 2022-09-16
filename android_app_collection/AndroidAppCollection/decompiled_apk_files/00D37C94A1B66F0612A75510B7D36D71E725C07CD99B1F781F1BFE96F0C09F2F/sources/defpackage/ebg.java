package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ebg  reason: default package */
/* loaded from: classes3.dex */
final class ebg implements View.OnClickListener {
    final /* synthetic */ aafo a;
    final /* synthetic */ ebh b;

    public ebg(ebh ebhVar, aafo aafoVar) {
        this.b = ebhVar;
        this.a = aafoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apzg apzgVar = this.b.a;
        if (apzgVar != null) {
            this.a.c(apzgVar, null);
        }
    }
}
