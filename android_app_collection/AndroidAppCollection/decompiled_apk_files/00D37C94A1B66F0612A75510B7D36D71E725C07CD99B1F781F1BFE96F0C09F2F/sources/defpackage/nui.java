package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: nui  reason: default package */
/* loaded from: classes3.dex */
public final class nui implements View.OnLayoutChangeListener, oar {
    static final nva a = new nue(3, 2.4f, 2.4f);
    private final View b;
    private final nun c;
    private final ezh d;
    private final gck e;
    private final int f;
    private boolean g;

    public nui(ezh ezhVar, gck gckVar, View view, int i, nun nunVar) {
        this.b = view;
        this.f = i;
        this.c = nunVar;
        this.d = ezhVar;
        this.e = gckVar;
    }

    private final void a(int i, int i2) {
        if (this.d.g() != ezx.WATCH_WHILE_MAXIMIZED || !this.e.h()) {
            return;
        }
        boolean z = i2 < Math.round(((float) i) / 1.777f) + this.f;
        if (this.g == z) {
            return;
        }
        if (z) {
            this.c.h(a);
        } else if (this.c.f(3) != null) {
            this.c.g(0, false);
        }
        this.g = z;
    }

    @Override // defpackage.oar
    public final void e(int i, int i2) {
        boolean h = oas.h(i2);
        if (oas.h(i) == h) {
            return;
        }
        if (h) {
            this.b.addOnLayoutChangeListener(this);
            a(this.b.getWidth(), this.b.getHeight());
            return;
        }
        this.b.removeOnLayoutChangeListener(this);
        this.c.f(3);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        a(i3 - i, i4 - i2);
    }
}
