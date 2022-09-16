package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: czxr  reason: default package */
/* loaded from: classes5.dex */
final class czxr implements View.OnClickListener {
    final /* synthetic */ czyg a;
    final /* synthetic */ czxs b;

    public czxr(czxs czxsVar, czyg czygVar) {
        this.b = czxsVar;
        this.a = czygVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int ae = this.b.f().ae() - 1;
        if (ae >= 0) {
            this.b.d(this.a.a(ae));
        }
    }
}
