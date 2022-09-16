package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: nmg  reason: default package */
/* loaded from: classes3.dex */
final class nmg implements zar {
    private final View a;
    private final boolean b;

    public nmg(View view, boolean z) {
        this.a = view;
        this.b = z;
    }

    private final float d() {
        return this.b ? -this.a.getHeight() : this.a.getHeight();
    }

    @Override // defpackage.zar
    public final void a(View view, long j, zaq zaqVar) {
        ln q = lj.q(view);
        q.l();
        q.j(d());
        q.d(j);
        q.f(zav.b(zaqVar));
        q.b();
    }

    @Override // defpackage.zar
    public final void b(View view, long j, zaq zaqVar) {
        view.setY(d());
        ln q = lj.q(view);
        q.l();
        q.j(0.0f);
        q.d(j);
        q.f(zav.b(zaqVar));
        q.b();
    }

    @Override // defpackage.zar
    public final void c(View view) {
        view.setY(0.0f);
        lj.q(view).a();
    }
}
