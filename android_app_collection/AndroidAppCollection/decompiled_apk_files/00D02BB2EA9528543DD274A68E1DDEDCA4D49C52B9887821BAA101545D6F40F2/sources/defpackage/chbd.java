package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: chbd  reason: default package */
/* loaded from: classes4.dex */
final class chbd implements View.OnClickListener {
    final /* synthetic */ chbj a;
    final /* synthetic */ chbl b;

    public chbd(chbl chblVar, chbj chbjVar) {
        this.b = chblVar;
        this.a = chbjVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.b.c.i(this.a.d());
        this.a.c();
        chbl chblVar = this.b;
        chblVar.d = true;
        chblVar.a.K(this.a.a(), this.b);
    }
}
