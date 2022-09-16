package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: mmn  reason: default package */
/* loaded from: classes3.dex */
final class mmn implements View.OnClickListener {
    final /* synthetic */ aafo a;
    final /* synthetic */ mmp b;

    public mmn(mmp mmpVar, aafo aafoVar) {
        this.b = mmpVar;
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
