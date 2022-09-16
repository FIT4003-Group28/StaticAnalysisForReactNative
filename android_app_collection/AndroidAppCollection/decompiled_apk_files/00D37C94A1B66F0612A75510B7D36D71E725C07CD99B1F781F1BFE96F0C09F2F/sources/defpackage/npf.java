package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: npf  reason: default package */
/* loaded from: classes3.dex */
public final class npf implements zar {
    public static final npf a = new npf(1);
    public static final npf b = new npf(2);
    private final int c;

    public npf(int i) {
        this.c = i;
    }

    private final int d(View view) {
        int height = ((View) view.getParent()).getHeight();
        return this.c == 1 ? -height : height;
    }

    @Override // defpackage.zar
    public final void a(View view, long j, zaq zaqVar) {
        view.setTranslationY(0.0f);
        ln q = lj.q(view);
        q.j(d(view));
        q.d(j);
        q.f(zav.b(zaqVar));
        q.b();
    }

    @Override // defpackage.zar
    public final void b(View view, long j, zaq zaqVar) {
        view.setTranslationY(d(view));
        ln q = lj.q(view);
        q.j(0.0f);
        q.d(j);
        q.f(zav.b(zaqVar));
        q.b();
    }

    @Override // defpackage.zar
    public final void c(View view) {
        view.setTranslationY(0.0f);
        lj.q(view).a();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof npf) && ((npf) obj).c == this.c;
    }

    public final int hashCode() {
        return this.c;
    }
}
