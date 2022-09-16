package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: mkf  reason: default package */
/* loaded from: classes3.dex */
final class mkf implements View.OnClickListener {
    final /* synthetic */ aafo a;
    final /* synthetic */ mkg b;

    public mkf(mkg mkgVar, aafo aafoVar) {
        this.b = mkgVar;
        this.a = aafoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apzg apzgVar = this.b.b;
        if (apzgVar != null) {
            this.a.c(apzgVar, null);
        }
    }
}
