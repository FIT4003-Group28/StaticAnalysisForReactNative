package defpackage;

import android.content.Context;
import android.os.Build;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: ahld  reason: default package */
/* loaded from: classes.dex */
public final class ahld extends afmx {
    public boolean i;
    private final ahkv j;
    private final View k;

    public ahld(Context context, final ahkv ahkvVar, boolean z, boolean z2) {
        super(context);
        ahkl ahkjVar;
        int i;
        this.j = ahkvVar;
        ahlc ahlcVar = new ahlc(this);
        if ("com.google.android.apps.youtube.mango".equals(ahkvVar.a.getPackageName())) {
            ahkjVar = new ahkj(context);
        } else if (z2) {
            ahkjVar = new ahke(context);
        } else {
            ahkjVar = new ahkk(context);
        }
        ahkvVar.k = ahkjVar;
        ahkvVar.k.j(false);
        ahkvVar.k.h(ahkvVar.r);
        ahkvVar.i.b(z);
        int i2 = 8;
        if (!z || ahkvVar.i.c() != 1) {
            i = 8;
        } else {
            i2 = 10;
            i = 2;
        }
        ahkvVar.k.l(i2, i2, i2, i);
        ahkvVar.k.f(ahkvVar.i);
        ahjr ahjrVar = ahkvVar.l;
        if (ahjrVar != null) {
            ahjrVar.onRendererShutdown();
        }
        ahkvVar.l = (ahjr) ahkvVar.e.get();
        ahjr ahjrVar2 = ahkvVar.l;
        azqb azqbVar = new azqb() { // from class: ahkn
            @Override // defpackage.azqb
            public final Object get() {
                return ahkv.this.k.c();
            }
        };
        if (!ahjrVar2.k) {
            ahjrVar2.f = ahkvVar;
            ahjrVar2.e = ahkvVar;
            ahjrVar2.d = azqbVar;
        }
        ahkvVar.t = ahlcVar;
        ahkvVar.k.i(ahkvVar.l);
        if (ahkvVar.v) {
            ahkvVar.p();
        }
        ViewGroup a = ahkvVar.k.a();
        this.k = a;
        addView(a);
        setSystemUiVisibility(4096);
    }

    @Override // defpackage.afmx, defpackage.afnh
    public final Surface A() {
        return this.a;
    }

    @Override // defpackage.afmx, defpackage.afna, defpackage.afnh
    public final SurfaceHolder B() {
        return null;
    }

    @Override // defpackage.afnh
    public final afnk C() {
        return afnk.GL_GVR;
    }

    @Override // defpackage.afmu
    public final void D() {
        ahkv ahkvVar = this.j;
        ahkl ahklVar = ahkvVar.k;
        if (ahklVar != null) {
            ahklVar.j(false);
        }
        ahob ahobVar = ahkvVar.p;
        ahof ahofVar = ahkvVar.n;
        if (ahofVar != null) {
            ahofVar.b.c();
            ahkvVar.n = null;
            ahkvVar.p = null;
            ahkvVar.q = null;
        }
        ahmq ahmqVar = ahkvVar.j;
        if (ahmqVar != null) {
            ahmqVar.a();
            ahkvVar.j = null;
        }
        ahjr ahjrVar = ahkvVar.l;
        if (ahjrVar != null) {
            ahjrVar.a();
        }
        ahkl ahklVar2 = ahkvVar.k;
        if (ahklVar2 != null) {
            ahklVar2.d();
            ahkvVar.k.k();
            ahkvVar.k = null;
        }
        ahkvVar.l = null;
        if (ahkvVar.w) {
            ahkvVar.b.p(false);
        }
        if (ahobVar != null) {
            for (ahku ahkuVar : ahkvVar.g) {
                ahkuVar.qU();
            }
        }
    }

    @Override // defpackage.afmx
    public final void F(int i) {
        ahkv ahkvVar = this.j;
        ahof ahofVar = ahkvVar.n;
        if (ahofVar != null) {
            ahofVar.t(i);
        }
        ahkvVar.D = i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afna
    public final void H() {
        ahof ahofVar;
        if (this.b == null && this.c == null && (ahofVar = this.j.n) != null) {
            ahofVar.b.i = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afna
    public final void I() {
        ahof ahofVar = this.j.n;
        if (ahofVar != null) {
            ahofVar.b.i = true;
        }
    }

    @Override // defpackage.afna
    protected final boolean K() {
        return this.i;
    }

    @Override // defpackage.afna
    protected final boolean L() {
        return this.j.s();
    }

    @Override // defpackage.afmx, defpackage.afnh
    public final void o() {
    }

    @Override // defpackage.afna, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        J(i, i2, i3, i4);
        if (this.j.s()) {
            G(this.k, i3 - i, i4 - i2);
        } else {
            this.k.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.afna, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        measureChild(this.k, View.MeasureSpec.makeMeasureSpec(this.e, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f, 1073741824));
    }

    @Override // defpackage.afna, defpackage.afnh
    public final void r(boolean z, byte[] bArr, long j, long j2) {
        ahmt ahmtVar = this.j.o;
        if (ahmtVar != null) {
            ahmtVar.p.a(z, bArr, j, j2);
        }
    }

    @Override // defpackage.afna, defpackage.afnh
    public final void u(afnn afnnVar) {
        ahkv ahkvVar = this.j;
        ahmt ahmtVar = ahkvVar.o;
        if (ahmtVar != null) {
            ahmtVar.k(afnnVar);
        }
        ahkvVar.s = afnnVar;
    }

    @Override // defpackage.afna, defpackage.afmu
    public final void v(int i, int i2) {
        float f = i / i2;
        if (this.j.z == aanv.RECTANGULAR_3D && ahom.j(f, 3.5555556f, 0.01f)) {
            double d = i;
            Double.isNaN(d);
            i2 = (int) Math.floor((d * 9.0d) / 16.0d);
        } else if (this.j.z == aanv.RECTANGULAR_3D && ahom.j(f, 0.8888889f, 0.01f)) {
            double d2 = i2;
            Double.isNaN(d2);
            i = (int) Math.floor((d2 * 16.0d) / 9.0d);
        }
        super.v(i, i2);
        final ahkv ahkvVar = this.j;
        ahkvVar.x = i;
        ahkvVar.y = i2;
        final float f2 = i / i2;
        ahkvVar.n(new Runnable() { // from class: ahkr
            @Override // java.lang.Runnable
            public final void run() {
                ahkv ahkvVar2 = ahkv.this;
                float f3 = f2;
                ahof ahofVar = ahkvVar2.n;
                if (ahofVar != null) {
                    try {
                        ahofVar.d(f3);
                    } catch (ahok e) {
                        ahkvVar2.i(e);
                    }
                }
            }
        });
        ahkvVar.r(ahkvVar.a());
    }

    @Override // defpackage.afna, defpackage.afnh
    public final void y(boolean z, float f, float f2, int i) {
        super.y(z, f, f2, i);
        if (Build.VERSION.SDK_INT >= 26) {
            ahkv ahkvVar = this.j;
            ahla ahlaVar = ahkvVar.i;
            boolean z2 = ahlaVar.b;
            ahlaVar.b(z);
            ahkvVar.C = i;
            ahmt ahmtVar = ahkvVar.o;
            if (ahmtVar != null) {
                ahmtVar.p(ahkvVar.i.c(), ahkvVar.i.d(), ahkvVar.i.a, i);
            }
            if (z2 == z) {
                return;
            }
            ahkvVar.k();
            ahkvVar.l();
        }
    }
}
