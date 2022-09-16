package defpackage;
/* compiled from: PG */
/* renamed from: axoc  reason: default package */
/* loaded from: classes2.dex */
public final class axoc implements axon {
    private volatile Object a;
    private final Object b = new Object();
    private final dyp c;

    public axoc(dyp dypVar) {
        this.c = dypVar;
    }

    @Override // defpackage.axon
    public final Object lI() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    dyp dypVar = this.c;
                    dws m = dyo.m();
                    m.a = new axol(dypVar.a);
                    axzl.n(m.a, axol.class);
                    if (m.j == null) {
                        m.j = new ahfe();
                    }
                    if (m.k == null) {
                        m.k = new hhw();
                    }
                    if (m.f == null) {
                        m.f = new aear();
                    }
                    if (m.g == null) {
                        m.g = new aaly();
                    }
                    if (m.h == null) {
                        m.h = new abir();
                    }
                    if (m.b == null) {
                        m.b = new xeu();
                    }
                    if (m.d == null) {
                        m.d = new aguc();
                    }
                    if (m.e == null) {
                        m.e = new zag();
                    }
                    if (m.i == null) {
                        m.i = new ahfa();
                    }
                    if (m.c == null) {
                        m.c = new xrz();
                    }
                    this.a = new dyo(m.a);
                }
            }
        }
        return this.a;
    }
}
