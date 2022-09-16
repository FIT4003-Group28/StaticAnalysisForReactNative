package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: nmd  reason: default package */
/* loaded from: classes3.dex */
public final class nmd implements zar {
    private final /* synthetic */ int a;

    public nmd() {
    }

    public nmd(int i) {
        this.a = i;
    }

    private static int d(View view) {
        return ((View) view.getParent()).getWidth();
    }

    private static float e(View view, float f) {
        return lj.e(view) == 1 ? -f : f;
    }

    private static int f(View view) {
        return ((View) view.getParent()).getWidth();
    }

    @Override // defpackage.zar
    public final void c(View view) {
        int i = this.a;
        if (i == 0) {
            view.setX(0.0f);
            lj.q(view).a();
        } else if (i == 1) {
            view.setX(0.0f);
            lj.q(view).a();
        } else {
            lj.q(view).a();
            lj.N(view, 1.0f);
        }
    }

    @Override // defpackage.zar
    public final void a(View view, long j, zaq zaqVar) {
        int i = this.a;
        if (i == 0) {
            ln q = lj.q(view);
            q.l();
            q.i(nmh.b(view, d(view)));
            q.d(j);
            q.f(zav.b(zaqVar));
            q.b();
        } else if (i == 1) {
            ln q2 = lj.q(view);
            q2.l();
            q2.i(-e(view, f(view)));
            q2.d(j);
            q2.f(zav.b(zaqVar));
            q2.b();
        } else {
            lj.N(view, 1.0f);
            ln q3 = lj.q(view);
            q3.c(0.0f);
            q3.d(j);
            q3.f(zav.b(zaqVar));
        }
    }

    @Override // defpackage.zar
    public final void b(View view, long j, zaq zaqVar) {
        int i = this.a;
        if (i == 0) {
            view.setX(nmh.b(view, d(view)));
            ln q = lj.q(view);
            q.l();
            q.i(0.0f);
            q.d(j);
            q.f(zav.b(zaqVar));
            q.b();
        } else if (i == 1) {
            view.setX(e(view, f(view)));
            ln q2 = lj.q(view);
            q2.l();
            q2.i(0.0f);
            q2.d(j);
            q2.f(zav.b(zaqVar));
            q2.b();
        } else {
            lj.N(view, 0.0f);
            ln q3 = lj.q(view);
            q3.c(1.0f);
            q3.d(j);
            q3.f(zav.b(zaqVar));
        }
    }
}
