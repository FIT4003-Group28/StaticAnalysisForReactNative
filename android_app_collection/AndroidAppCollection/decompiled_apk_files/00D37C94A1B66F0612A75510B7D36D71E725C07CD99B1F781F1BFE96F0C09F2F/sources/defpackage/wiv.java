package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: wiv  reason: default package */
/* loaded from: classes4.dex */
final class wiv implements View.OnClickListener {
    final /* synthetic */ wiw a;
    private final /* synthetic */ int b;

    public wiv(wiw wiwVar) {
        this.a = wiwVar;
    }

    public wiv(wiw wiwVar, int i) {
        this.b = i;
        this.a = wiwVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            wix wixVar = this.a.a;
            wixVar.i.a.m.H(3, new acte(acuo.b(31778)), null);
            wixVar.b(ajjh.f(wixVar.b));
            return;
        }
        wix wixVar2 = this.a.a;
        wixVar2.g.setEnabled(false);
        wixVar2.h.setEnabled(false);
        wixVar2.e.b();
        wixVar2.i.a.m.H(3, new acte(acuo.b(31777)), null);
        wixVar2.b(ajjh.g(wixVar2.b));
    }
}
