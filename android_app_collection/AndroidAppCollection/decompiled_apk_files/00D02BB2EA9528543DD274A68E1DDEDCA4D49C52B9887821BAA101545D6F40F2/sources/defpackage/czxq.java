package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: czxq  reason: default package */
/* loaded from: classes5.dex */
final class czxq implements View.OnClickListener {
    final /* synthetic */ czyg a;
    final /* synthetic */ czxs b;

    public czxq(czxs czxsVar, czyg czygVar) {
        this.b = czxsVar;
        this.a = czygVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int ac = this.b.f().ac() + 1;
        if (ac < this.b.f.k.c()) {
            this.b.d(this.a.a(ac));
        }
    }
}
