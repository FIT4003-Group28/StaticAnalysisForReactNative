package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import com.google.ar.core.Frame;
import com.google.ar.core.Session;
import com.google.ar.core.exceptions.UnavailableException;
/* compiled from: PG */
/* renamed from: dbp  reason: default package */
/* loaded from: classes5.dex */
public final class dbp implements dnh {
    public final dflf a;
    public final dfei b;
    public final dol c;
    public final dbf d;
    public final djo e;
    private final Object f = new Object();
    private final HandlerThread g;
    private final dnj h;
    private final btrm i;
    private final dbn j;
    private boolean k;

    static {
        dfjx.m();
    }

    public dbp(dbo dboVar, dol dolVar, djo djoVar, dbm dbmVar, dnj dnjVar, btrm btrmVar, czh czhVar) {
        dbn dbnVar = new dbn(this);
        this.j = dbnVar;
        this.k = false;
        this.c = dolVar;
        this.e = djoVar;
        this.h = dnjVar;
        this.i = btrmVar;
        dflf a = dboVar.a(czhVar);
        this.a = a;
        try {
            a.a();
            dceq a2 = dcet.a();
            a2.b(gds.class, new dbr(gds.class, dbnVar));
            btrmVar.g(dbnVar, a2.a());
            djoVar.b(a, false);
            HandlerThread handlerThread = new HandlerThread("arloThread");
            this.g = handlerThread;
            handlerThread.start();
            dfkm dfkmVar = new dfkm(new Handler(handlerThread.getLooper()));
            Session e = a.e();
            a.getClass();
            dfei a3 = dbmVar.a(czhVar, dfkmVar, e, new dbi(a));
            this.b = a3;
            a3.a(new dfeq(this) { // from class: dbj
                private final dbp a;

                {
                    this.a = this;
                }

                @Override // defpackage.dfeq
                public final void n(Object obj) {
                    dbp dbpVar = this.a;
                    dffq dffqVar = (dffq) obj;
                    if (dffqVar.a != 1) {
                        dbpVar.c.a(4, "No earth pose");
                        return;
                    }
                    djo djoVar2 = dbpVar.e;
                    dffo dffoVar = (dffo) dffqVar.b;
                    dszd bZ = dsze.d.bZ();
                    dsyz bZ2 = dsza.e.bZ();
                    dfgq dfgqVar = dffoVar.a;
                    if (dfgqVar == null) {
                        dfgqVar = dfgq.d;
                    }
                    double d = dfgqVar.a;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dsza dszaVar = (dsza) bZ2.b;
                    dszaVar.a |= 1;
                    dszaVar.b = d;
                    dfgq dfgqVar2 = dffoVar.a;
                    if (dfgqVar2 == null) {
                        dfgqVar2 = dfgq.d;
                    }
                    double d2 = dfgqVar2.b;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dsza dszaVar2 = (dsza) bZ2.b;
                    dszaVar2.a |= 2;
                    dszaVar2.c = d2;
                    dfgq dfgqVar3 = dffoVar.a;
                    if (dfgqVar3 == null) {
                        dfgqVar3 = dfgq.d;
                    }
                    double d3 = dfgqVar3.c;
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    dsza dszaVar3 = (dsza) bZ2.b;
                    dszaVar3.a |= 4;
                    dszaVar3.d = d3;
                    dsza bK = bZ2.bK();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dsze dszeVar = (dsze) bZ.b;
                    bK.getClass();
                    dszeVar.b = bK;
                    dszeVar.a |= 1;
                    dszb bZ3 = dszc.e.bZ();
                    dfhz dfhzVar = dffoVar.b;
                    if (dfhzVar == null) {
                        dfhzVar = dfhz.b;
                    }
                    double d4 = dfhzVar.a;
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dszc dszcVar = (dszc) bZ3.b;
                    dszcVar.a |= 1;
                    dszcVar.b = d4;
                    dfhz dfhzVar2 = dffoVar.b;
                    if (dfhzVar2 == null) {
                        dfhzVar2 = dfhz.b;
                    }
                    double d5 = dfhzVar2.a;
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dszc dszcVar2 = (dszc) bZ3.b;
                    dszcVar2.a |= 2;
                    dszcVar2.c = d5;
                    dfhz dfhzVar3 = dffoVar.b;
                    if (dfhzVar3 == null) {
                        dfhzVar3 = dfhz.b;
                    }
                    double d6 = dfhzVar3.a;
                    if (bZ3.c) {
                        bZ3.bF();
                        bZ3.c = false;
                    }
                    dszc dszcVar3 = (dszc) bZ3.b;
                    dszcVar3.a |= 4;
                    dszcVar3.d = d6;
                    dszc bK2 = bZ3.bK();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dsze dszeVar2 = (dsze) bZ.b;
                    bK2.getClass();
                    dszeVar2.c = bK2;
                    dszeVar2.a |= 2;
                    dsze bK3 = bZ.bK();
                    czs czsVar = czs.NONE;
                    int a4 = dffn.a(dffoVar.d);
                    if (a4 == 0) {
                        a4 = 1;
                    }
                    int i = a4 - 1;
                    int i2 = 5;
                    if (i == 1) {
                        i2 = 2;
                    } else if (i == 2) {
                        i2 = 3;
                    } else if (i == 3) {
                        i2 = 4;
                    } else if (i != 4) {
                        i2 = i != 5 ? 1 : 6;
                    }
                    dfkx bZ4 = dfla.e.bZ();
                    if (bZ4.c) {
                        bZ4.bF();
                        bZ4.c = false;
                    }
                    dfla dflaVar = (dfla) bZ4.b;
                    dflaVar.b = i2 - 1;
                    int i3 = 1 | dflaVar.a;
                    dflaVar.a = i3;
                    double d7 = dffoVar.f;
                    int i4 = 4 | i3;
                    dflaVar.a = i4;
                    dflaVar.d = d7;
                    double d8 = dffoVar.e;
                    dflaVar.a = i4 | 2;
                    dflaVar.c = d8;
                    djoVar2.a(dad.h(bK3, bZ4.bK(), dffoVar.c));
                }
            });
            a3.b().e(new dfeq(this) { // from class: dbk
                private final dbp a;

                {
                    this.a = this;
                }

                @Override // defpackage.dfeq
                public final void n(Object obj) {
                    dbp dbpVar = this.a;
                    int i = ((dfgv) obj).b;
                    dfgu dfguVar = dfgu.NONE;
                    dbpVar.c.b(11, new dok() { // from class: dbl
                    });
                }
            });
            a3.j();
            this.d = new dbf(a3.i());
        } catch (UnavailableException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // defpackage.dnh
    public final void a(czs czsVar) {
        this.e.a = czsVar.a(czs.CAMERA);
        this.e.b = czsVar.a(czs.INERTIAL_FOREGROUND);
        synchronized (this.f) {
            boolean z = this.k;
            boolean a = czsVar.a(czs.INERTIAL_BACKGROUND);
            this.k = a;
            if (!z && a) {
                this.h.a();
            }
            int ordinal = czsVar.ordinal();
            if (ordinal == 0) {
                this.b.h(1);
            } else if (ordinal == 1) {
                this.b.h(3);
            } else if (ordinal == 2) {
                this.b.h(4);
            } else if (ordinal == 3) {
                this.b.h(5);
            }
            if (z && !this.k) {
                this.h.b();
            }
        }
    }

    @Override // defpackage.dnh
    public final void b() {
        synchronized (this.f) {
            if (this.k) {
                this.h.b();
            }
            this.k = false;
        }
        this.i.a(this.j);
        try {
            this.b.d();
        } finally {
            this.g.quitSafely();
            this.e.c();
        }
    }

    @Override // defpackage.dnh
    @dzsi
    public final String c() {
        dflf dflfVar = this.a;
        if (dflfVar == null) {
            return null;
        }
        return dflfVar.g();
    }

    @Override // defpackage.dnh
    public final dad d(Frame frame) {
        return null;
    }
}
