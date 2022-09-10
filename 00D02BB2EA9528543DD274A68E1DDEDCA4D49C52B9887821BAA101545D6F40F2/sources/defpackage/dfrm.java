package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: dfrm  reason: default package */
/* loaded from: classes6.dex */
public final class dfrm extends dfrr {
    @dzsi
    dfrt a;
    @dzsi
    private dfrz h;
    private boolean i;

    public dfrm(Context context, dfuh dfuhVar, Iterable<dfro> iterable) {
        super(context, dfuhVar, iterable);
    }

    private final synchronized void l() {
        dfrz dfrzVar = this.h;
        if (dfrzVar != null) {
            dfrt m = m(dfrzVar);
            if (!m.equals(this.a)) {
                this.a = m;
                dhkb dhkbVar = this.e.c;
                if (dhkbVar == null) {
                    dhkbVar = dhkb.e;
                }
                e(dhkbVar.b, dhkbVar.c, dhkbVar.d);
            }
        }
    }

    private final synchronized dfrt m(dfrz dfrzVar) {
        dfri dfriVar;
        float o = o();
        float f = this.e.e;
        dfriVar = new dfri();
        dfriVar.a = Float.valueOf(dfrzVar.a());
        dfriVar.b = Float.valueOf(Math.abs((o - dfrzVar.c()) / 2.0f));
        dfriVar.c = Float.valueOf(dfrzVar.b());
        dfriVar.d = Float.valueOf(Math.abs((f - dfrzVar.d()) / 2.0f));
        return dfriVar.a();
    }

    private final synchronized void n() {
        dfrz dfrzVar = this.h;
        if (dfrzVar == null) {
            return;
        }
        dfrz a = dfrzVar.e().a();
        dhjx dhjxVar = this.e;
        dhkd dhkdVar = dhjxVar.d;
        if (dhkdVar == null) {
            dhkdVar = dhkd.d;
        }
        float f = dhkdVar.b;
        dhkd dhkdVar2 = dhjxVar.d;
        if (dhkdVar2 == null) {
            dhkdVar2 = dhkd.d;
        }
        float f2 = f / dhkdVar2.c;
        float c = a.c() / a.d();
        if (f2 <= 1.0f && c >= 1.0f) {
            f(a.c());
        } else if (f2 < 1.0f || c > 1.0f) {
            f(a.d());
        } else {
            f(dfug.a(a.c(), 1.0f / f2));
        }
        this.i = false;
    }

    private final synchronized float o() {
        dhjx dhjxVar;
        float f;
        dhkd dhkdVar;
        dhjxVar = this.e;
        dhkd dhkdVar2 = dhjxVar.d;
        if (dhkdVar2 == null) {
            dhkdVar2 = dhkd.d;
        }
        f = dhkdVar2.b;
        dhkdVar = dhjxVar.d;
        if (dhkdVar == null) {
            dhkdVar = dhkd.d;
        }
        return dfug.a(dhjxVar.e, f / dhkdVar.c);
    }

    final synchronized void b() {
        this.h = null;
        this.a = null;
        this.i = false;
    }

    public final synchronized boolean c() {
        return this.h != null;
    }

    @Override // defpackage.dfrr
    public final void d(int i, int i2) {
        synchronized (this) {
            super.d(i, i2);
            n();
        }
    }

    @Override // defpackage.dfrr
    public final void e(float f, float f2, float f3) {
        synchronized (this) {
            dfrt dfrtVar = this.a;
            if (dfrtVar != null) {
                dfrt a = dfrtVar.e().a();
                float f4 = dfug.f(a.a(), f);
                if (Math.abs(f4) > a.b()) {
                    if (f4 < 0.0f) {
                        f = dfug.e(a.a() - a.b());
                    } else {
                        f = dfug.e(a.a() + a.b());
                    }
                }
                f2 = dfug.d(f2, a.c() - a.d(), a.c() + a.d());
            }
            super.e(f, f2, f3);
        }
    }

    @Override // defpackage.dfrr
    public final void f(float f) {
        synchronized (this) {
            super.f(f);
            this.i = true;
            l();
        }
    }

    @Override // defpackage.dfrr
    public final void setCamera(@dzsi dhjx dhjxVar) {
        synchronized (this) {
            super.setCamera(dhjxVar);
            l();
        }
    }

    public final synchronized void a(dftb dftbVar) {
        int a;
        boolean c = c();
        if (dftbVar != null && (a = dftl.a(dftbVar.m)) != 0 && a == 3) {
            dhkd dhkdVar = dftbVar.e;
            if (dhkdVar == null) {
                dhkdVar = dhkd.d;
            }
            float f = dhkdVar.b;
            dhkd dhkdVar2 = dftbVar.e;
            if (dhkdVar2 == null) {
                dhkdVar2 = dhkd.d;
            }
            float a2 = dfug.a(40.0f, f / dhkdVar2.c);
            dfrk dfrkVar = new dfrk();
            dfrkVar.c = Float.valueOf(a2);
            dfrkVar.d = Float.valueOf(40.0f);
            dhkb dhkbVar = dftbVar.d;
            if (dhkbVar == null) {
                dhkbVar = dhkb.e;
            }
            dfrkVar.a = Float.valueOf(dhkbVar.b);
            dhkb dhkbVar2 = dftbVar.d;
            if (dhkbVar2 == null) {
                dhkbVar2 = dhkb.e;
            }
            dfrkVar.b = Float.valueOf(dhkbVar2.c);
            this.h = dfrkVar.a();
            if (!c || !this.i) {
                n();
                return;
            } else {
                l();
                return;
            }
        }
        b();
        if (c) {
            f(90.0f);
        }
    }
}
