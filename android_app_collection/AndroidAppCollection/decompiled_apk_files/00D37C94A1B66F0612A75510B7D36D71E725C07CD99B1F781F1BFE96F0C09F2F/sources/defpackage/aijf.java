package defpackage;

import com.google.android.libraries.youtube.player.modality.PlaybackModalityState;
import java.util.Observable;
import java.util.Observer;
/* compiled from: PG */
/* renamed from: aijf  reason: default package */
/* loaded from: classes.dex */
public final class aijf implements Observer, aiji {
    public final aijh a;
    public final aijg b;
    public boolean e;
    public afmu f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    private aijc v;
    public orw r = orw.AUDIO_ROUTE_UNSPECIFIED;
    public aijq s = aijq.a();
    public aijz t = aijz.DEFAULT_VALUE;
    public final afmw c = new aije(this);
    public float d = 1.0f;
    public int u = 1;

    public aijf(aijh aijhVar, aijg aijgVar) {
        this.j = true;
        this.a = aijhVar;
        this.b = aijgVar;
        this.j = true;
    }

    private final aijs v() {
        if (this.h) {
            return aijs.FULLSCREEN;
        }
        if (this.g) {
            return aijs.MINIMIZED;
        }
        if (this.n) {
            return aijs.INLINE_IN_FEED;
        }
        return aijs.DEFAULT;
    }

    public final float a() {
        if (this.s.b()) {
            return 0.0f;
        }
        if (!this.e) {
            return this.d;
        }
        return 0.1f;
    }

    public final afmv b() {
        aijc aijcVar = this.v;
        if (aijcVar != null) {
            aijs aijsVar = aijs.DEFAULT;
            int ordinal = v().ordinal();
            if (ordinal == 0) {
                return (afmv) aijcVar.a.get();
            }
            if (ordinal == 1) {
                return (afmv) aijcVar.d.get();
            }
            if (ordinal == 2) {
                return (afmv) aijcVar.b.get();
            }
            if (ordinal == 4) {
                return (afmv) aijcVar.c.get();
            }
        }
        return afmv.a;
    }

    public final ahgn c() {
        afmv b = b();
        aijs g = g();
        aijs v = v();
        int i = b.c;
        int i2 = b.d;
        afmu afmuVar = this.f;
        return new ahgn(g, v, i, i2, afmuVar != null && afmuVar.x(), this.q);
    }

    @Override // defpackage.aiji
    public final ahgn d() {
        return c();
    }

    public final PlaybackModalityState e() {
        return new PlaybackModalityState(this.g, this.h, this.k, this.l, this.m, this.n, this.o, this.q, this.i, this.s, this.t);
    }

    @Override // defpackage.aiji
    public final aijq f() {
        return this.s;
    }

    @Override // defpackage.aiji
    public final aijs g() {
        if (this.m) {
            return aijs.REMOTE;
        }
        if (this.k) {
            return aijs.BACKGROUND;
        }
        if (this.o) {
            return aijs.VIRTUAL_REALITY;
        }
        if (this.i) {
            return aijs.PICTURE_IN_PICTURE;
        }
        return v();
    }

    @Override // defpackage.aiji
    public final aijz h() {
        return this.t;
    }

    public final void i() {
        this.a.f.c(c());
        this.c.notifyObservers();
    }

    public final void j() {
        this.a.e.c(new ahhu(this.t, this.l));
    }

    public final void k() {
        n(null);
        this.f = null;
        this.b.b.c(aiij.a);
    }

    public final void l() {
        m(false);
    }

    public final void m(boolean z) {
        if (z != this.k) {
            this.k = z;
            i();
        }
    }

    public final void n(aijc aijcVar) {
        aijc aijcVar2 = this.v;
        if (aijcVar2 != null) {
            aijcVar2.deleteObserver(this);
        }
        this.v = aijcVar;
        if (aijcVar != null) {
            aijcVar.addObserver(this);
        }
    }

    public final void o(aijq aijqVar) {
        if (!aijqVar.equals(this.s)) {
            this.s = aijqVar;
        }
    }

    public final void p(boolean z) {
        if (z != this.o) {
            this.o = z;
            i();
        }
    }

    public final void q(boolean z) {
        if (z) {
            if (this.l) {
                return;
            }
            this.b.b.c(aiij.a);
            u(true);
        } else if (!this.l) {
        } else {
            u(false);
            afmu afmuVar = this.f;
            if (afmuVar != null) {
                this.b.b.c(new aiij(afmuVar));
            } else {
                zep.b("Error: no UI elements available to display video");
            }
        }
    }

    @Override // defpackage.aiji
    public final boolean r() {
        return this.l;
    }

    public final boolean s() {
        return v() == aijs.DEFAULT;
    }

    public final void t(int i) {
        this.u = i;
        boolean z = true;
        if (i != 1) {
            if (i != 2) {
                z = false;
            }
            this.a.i.c(new ahhf(z));
        }
    }

    final void u(boolean z) {
        if (z != this.l) {
            this.l = z;
            i();
            j();
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (observable != this.v || !(obj instanceof Integer)) {
            return;
        }
        aijs v = v();
        int intValue = ((Integer) obj).intValue();
        if (intValue == 0) {
            if (v != aijs.DEFAULT) {
                return;
            }
            i();
        } else if (intValue == 1) {
            if (v != aijs.FULLSCREEN) {
                return;
            }
            i();
        } else if (intValue != 2) {
            if (intValue != 3 || v != aijs.MINIMIZED) {
                return;
            }
            i();
        } else if (v != aijs.INLINE_IN_FEED) {
        } else {
            i();
        }
    }
}
