package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcd  reason: default package */
/* loaded from: classes5.dex */
public final class dcd implements czv {
    @dzsi
    public dbp b;
    private final Runnable c;
    public final Object a = new Object();
    private final Map<czu, dcc> d = new HashMap();

    public dcd(dbp dbpVar, Runnable runnable) {
        this.b = dbpVar;
        this.c = runnable;
    }

    @Override // defpackage.czv
    public final v<dad> a() {
        z<dad> zVar;
        synchronized (this.a) {
            dbsk.s(this.b);
            zVar = this.b.e.c;
        }
        return zVar;
    }

    @Override // defpackage.czv
    public final dfeo b() {
        dfeo b;
        synchronized (this.a) {
            dbsk.s(this.b);
            b = this.b.b.b();
        }
        return b;
    }

    @Override // defpackage.czv
    public final void c() {
        synchronized (this.a) {
            dbsk.s(this.b);
            try {
                this.c.run();
                this.b = null;
            } catch (Exception e) {
                bvoo.f(new RuntimeException(e));
                this.b = null;
            }
        }
    }

    @Override // defpackage.czv
    public final void d(czu czuVar) {
        synchronized (this.a) {
            dbp dbpVar = this.b;
            if (dbpVar != null && !this.d.containsKey(czuVar)) {
                czuVar.getClass();
                dcc dccVar = new dcc(czuVar);
                this.d.put(czuVar, dccVar);
                dbpVar.b.e(dccVar);
            }
        }
    }

    @Override // defpackage.czv
    public final void e(czu czuVar) {
        dbp dbpVar;
        synchronized (this.a) {
            dcc remove = this.d.remove(czuVar);
            if (remove != null && (dbpVar = this.b) != null) {
                dbpVar.b.f(remove);
            }
        }
    }

    @Override // defpackage.czv
    public final void f(@dzsi arlb arlbVar) {
        synchronized (this.a) {
            dbsk.s(this.b);
        }
    }

    protected final void finalize() {
        synchronized (this.a) {
            if (this.b != null) {
                c();
            }
        }
    }

    public final dan g() {
        dbf dbfVar;
        synchronized (this.a) {
            dbsk.s(this.b);
            dbfVar = this.b.d;
        }
        return dbfVar;
    }

    public final void h(@dzsi dfkp dfkpVar) {
        synchronized (this.a) {
            dbsk.s(this.b);
            this.b.b.g(dfkpVar);
        }
    }
}
