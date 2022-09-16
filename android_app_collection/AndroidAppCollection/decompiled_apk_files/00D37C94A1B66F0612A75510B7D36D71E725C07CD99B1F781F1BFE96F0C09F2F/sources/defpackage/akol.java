package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: akol  reason: default package */
/* loaded from: classes.dex */
final class akol implements View.OnClickListener {
    final /* synthetic */ aafo a;
    final /* synthetic */ akop b;

    public akol(akop akopVar, aafo aafoVar) {
        this.b = akopVar;
        this.a = aafoVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apzg apzgVar = this.b.a;
        if (apzgVar != null) {
            this.a.c(apzgVar, null);
        }
        apzg apzgVar2 = this.b.b;
        if (apzgVar2 != null) {
            this.a.c(apzgVar2, null);
        }
    }
}
