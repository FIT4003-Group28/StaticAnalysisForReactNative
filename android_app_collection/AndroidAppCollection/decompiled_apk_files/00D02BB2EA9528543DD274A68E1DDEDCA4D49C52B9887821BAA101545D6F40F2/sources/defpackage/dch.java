package defpackage;

import android.view.View;
import com.google.android.apps.gmm.ar.FilamentJNI;
/* compiled from: PG */
/* renamed from: dch  reason: default package */
/* loaded from: classes5.dex */
public final class dch extends dnz {
    private final Object g;
    private final czh h;
    private final dbu i;
    private final dfeo j;
    private final boolean k;
    @dzsi
    private dfkp l;
    @dzsi
    private dcd m;
    @dzsi
    private dcd n;
    @dzsi
    private final dbg o;

    static {
        FilamentJNI.a();
    }

    public dch(dbu dbuVar, cjqy cjqyVar, dkh dkhVar, dkn dknVar, dol dolVar, der derVar, djs djsVar, dbh dbhVar, gga ggaVar, boolean z, boolean z2, czj czjVar, boolean z3, czh czhVar) {
        super(cjqyVar, dkhVar, dknVar, dolVar, derVar, djsVar, ggaVar, z, z2, czjVar, z3, czhVar, czhVar == czh.WALKING_NAVIGATION || czhVar == czh.CALIBRATOR);
        dfeh c;
        this.g = new Object();
        this.h = czhVar;
        this.i = dbuVar;
        this.k = z;
        dfkp dfkpVar = new dfkp(ggaVar);
        this.l = dfkpVar;
        dcd a = dbuVar.a(czhVar, czs.NONE);
        this.m = a;
        synchronized (a.a) {
            dbsk.s(a.b);
            c = a.b.b.c();
        }
        dan g = a.g();
        day a2 = dbhVar.a.a();
        dbh.a(a2, 1);
        dbh.a(ggaVar, 2);
        dbh.a(c, 3);
        dbh.a(dolVar, 4);
        dbh.a(g, 5);
        dbh.a(this, 6);
        dbg dbgVar = new dbg(a2, ggaVar, c, dolVar, g, this);
        this.o = dbgVar;
        dfkpVar.setScene(dbgVar.a);
        this.j = a.b();
    }

    @Override // defpackage.dnz
    @dzsi
    public final String A() {
        return this.i.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dnz
    public final boolean B() {
        return true;
    }

    @Override // defpackage.dnz, defpackage.czz
    public final void d() {
        dcd a;
        dfkp dfkpVar;
        super.d();
        synchronized (this.g) {
            a = this.i.a(this.h, czs.CAMERA);
            this.n = a;
            dfkpVar = this.l;
            dbsk.s(dfkpVar);
        }
        a.b().a();
        if (this.k) {
            a.g().d();
        }
        a.h(dfkpVar);
    }

    @Override // defpackage.dnz, defpackage.czz
    public final void e() {
        dcd dcdVar;
        super.e();
        synchronized (this.g) {
            dcdVar = this.n;
            dbsk.s(dcdVar);
            this.n = null;
        }
        dcdVar.b().b();
        if (this.k) {
            dcdVar.g().e();
        }
        dcdVar.h(null);
        dcdVar.c();
    }

    @Override // defpackage.dnz, defpackage.czz
    public final void g() {
        dfkp dfkpVar;
        dcd dcdVar;
        dbg dbgVar;
        super.g();
        synchronized (this.g) {
            dfkpVar = this.l;
            dbsk.s(dfkpVar);
            this.l = null;
            dcdVar = this.m;
            dbsk.s(dcdVar);
            this.m = null;
            dbgVar = this.o;
            dbsk.s(dbgVar);
        }
        dcdVar.c();
        dfkpVar.a.d(null);
        dbgVar.a.d();
    }

    @Override // defpackage.czz
    public final daj m() {
        dbg dbgVar;
        synchronized (this.g) {
            dbgVar = this.o;
            dbsk.s(dbgVar);
        }
        return dbgVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dnz
    @dzsi
    public final View y() {
        dfkp dfkpVar;
        synchronized (this.g) {
            dfkpVar = this.l;
        }
        return dfkpVar;
    }

    @Override // defpackage.dnz
    protected final dfeo z() {
        return this.j;
    }
}
