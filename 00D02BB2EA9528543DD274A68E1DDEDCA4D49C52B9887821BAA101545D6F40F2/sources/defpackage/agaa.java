package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: agaa  reason: default package */
/* loaded from: classes2.dex */
final class agaa implements View.OnLayoutChangeListener {
    final /* synthetic */ agad a;

    public agaa(agad agadVar) {
        this.a = agadVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        agad agadVar = this.a;
        View c = agadVar.c();
        agadVar.i.clear();
        View a = cqhu.a(c, agkn.d);
        dbsk.s(a);
        agadVar.g = a;
        View a2 = cqhu.a(c, agkn.c);
        dbsk.s(a2);
        agadVar.h = a2;
        agadVar.g(agkn.f);
        agadVar.g(agkn.e);
        agadVar.f(agkn.g);
        agadVar.f(agkn.h);
        agadVar.h(agkn.g);
        agadVar.h(agkn.h);
        agadVar.d();
        agadVar.e(false);
    }
}
