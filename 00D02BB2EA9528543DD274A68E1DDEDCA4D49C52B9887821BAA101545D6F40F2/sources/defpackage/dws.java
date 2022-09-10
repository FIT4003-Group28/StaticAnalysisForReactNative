package defpackage;
/* compiled from: PG */
/* renamed from: dws  reason: default package */
/* loaded from: classes6.dex */
public final class dws implements czv {
    public final Object a = new Object();
    @dzsi
    public dwo b;
    private final Runnable c;

    public dws(dwo dwoVar, Runnable runnable) {
        this.b = dwoVar;
        this.c = runnable;
    }

    @Override // defpackage.czv
    public final v<dad> a() {
        z<dad> zVar;
        synchronized (this.a) {
            dbsk.s(this.b);
            zVar = this.b.c.c;
        }
        return zVar;
    }

    @Override // defpackage.czv
    public final dfeo b() {
        dfeo dfeoVar;
        synchronized (this.a) {
            dbsk.s(this.b);
            dfeoVar = this.b.b;
        }
        return dfeoVar;
    }

    @Override // defpackage.czv
    public final void c() {
        synchronized (this.a) {
            dbsk.s(this.b);
            this.c.run();
            this.b = null;
        }
    }

    @Override // defpackage.czv
    public final void d(czu czuVar) {
    }

    @Override // defpackage.czv
    public final void e(czu czuVar) {
    }

    @Override // defpackage.czv
    public final void f(@dzsi arlb arlbVar) {
        synchronized (this.a) {
            dbsk.s(this.b);
            this.b.h = arlbVar;
        }
    }

    protected final void finalize() {
        synchronized (this.a) {
            if (this.b != null) {
                c();
            }
        }
    }
}
