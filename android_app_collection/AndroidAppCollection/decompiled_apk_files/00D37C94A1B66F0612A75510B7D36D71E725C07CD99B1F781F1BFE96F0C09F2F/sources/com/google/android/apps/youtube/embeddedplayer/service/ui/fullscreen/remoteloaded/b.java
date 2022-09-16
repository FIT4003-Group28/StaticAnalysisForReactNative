package com.google.android.apps.youtube.embeddedplayer.service.ui.fullscreen.remoteloaded;

import android.app.ActionBar;
import android.content.Context;
import android.view.Window;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.l;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b implements yze, yzx {
    public final Context a;
    public final com.google.android.apps.youtube.embeddedplayer.service.jar.a b;
    public yzf c;
    public boolean d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public final yzt o;
    public boolean p;
    public final l q;
    private final ActionBar r;
    private final Window s;
    private int t;
    private boolean u;

    public b(Context context, com.google.android.apps.youtube.embeddedplayer.service.jar.a aVar, l lVar, yzt yztVar) {
        this.a = context;
        this.b = aVar;
        this.q = lVar;
        this.o = yztVar;
        this.r = aVar.c();
        this.s = aVar.d();
        this.i = aVar.b();
        this.t = aVar.b();
    }

    public final int a() {
        int i = 0;
        int i2 = (this.j ? 1 : 0) | (true != this.n ? 0 : 2) | (true != this.k ? 0 : 4);
        if (true == this.l) {
            i = 8;
        }
        return i2 | i;
    }

    public final void d() {
        this.o.o(1);
        e();
    }

    public final void e() {
        if (this.n) {
            yzt yztVar = this.o;
            int i = 1;
            if (!this.p && !this.u) {
                i = 0;
            }
            yztVar.k(i);
        }
    }

    public final void g(boolean z) {
        this.u = z;
        e();
    }

    public final void h(int i) {
        int i2 = this.i;
        if (this.b.b() != this.t) {
            this.i = this.b.b();
        }
        if (i == i2) {
            i = this.i;
        }
        this.t = i;
        ((com.google.android.apps.youtube.embeddedplayer.service.jar.b) this.b).a.setRequestedOrientation(i);
    }

    public final boolean i() {
        return this.t != this.i;
    }

    @Override // defpackage.yze
    public final void lF(boolean z, int i) {
        if (!z || !this.k || this.g || this.h) {
            return;
        }
        this.q.b(true);
    }

    @Override // defpackage.yzx
    public final void w() {
        if (!this.f || !this.g || !this.n) {
            return;
        }
        this.q.a.aq();
    }

    public final void f(int i) {
        int i2 = i & 4;
        boolean z = false;
        boolean z2 = i2 == 0;
        if (i2 == 0 || (i & 1) != 0) {
            boolean z3 = this.k;
            this.j = 1 == (i & 1);
            this.n = (i & 2) != 0;
            boolean z4 = !z2;
            this.k = z4;
            this.l = (i & 8) != 0;
            if (z4) {
                this.c.enable();
            } else if (z3 && this.e == 1) {
                this.c.disable();
            }
            yzt yztVar = this.o;
            if (this.l && this.r != null && !this.s.hasFeature(9)) {
                z = true;
            }
            yztVar.p(!z);
            return;
        }
        throw new IllegalArgumentException("Can not set FULLSCREEN_FLAG_FULLSCREEN_WHEN_DEVICE_LANDSCAPE without setting FULLSCREEN_FLAG_CONTROL_ORIENTATION");
    }

    @Override // defpackage.yze
    public final void lE(boolean z, int i) {
        this.h = false;
        if (!this.f || !this.j) {
            return;
        }
        if (z) {
            if (!this.k || this.g) {
                return;
            }
            this.q.b(true);
        } else if (!i()) {
        } else {
            if (this.d) {
                this.q.b(false);
            }
            h(this.i);
        }
    }
}
