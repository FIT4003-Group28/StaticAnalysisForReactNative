package defpackage;
/* compiled from: PG */
/* renamed from: aacz  reason: default package */
/* loaded from: classes.dex */
public final class aacz {
    public final aadb a;
    private final ayos c;
    private final ayos e;
    private final Object f;
    private final Object g;
    private volatile apyy b = null;
    private volatile apej d = null;

    public aacz(ayos ayosVar, ayos ayosVar2, aadb aadbVar) {
        this.c = ayosVar;
        this.e = ayosVar2;
        this.a = aadbVar;
        if (d()) {
            this.f = new Object();
            this.g = new Object();
            return;
        }
        this.g = this;
        this.f = this;
    }

    public final apej a() {
        if (this.d == null) {
            synchronized (this.f) {
                if (this.d == null) {
                    if (d()) {
                        this.d = (apej) this.e.U();
                    } else {
                        atfw atfwVar = b().k;
                        if (atfwVar == null) {
                            atfwVar = atfw.a;
                        }
                        apej apejVar = atfwVar.q;
                        if (apejVar == null) {
                            apejVar = apej.a;
                        }
                        this.d = apejVar;
                    }
                }
            }
            return this.d;
        }
        return this.d;
    }

    public final apyy b() {
        return this.b == null ? c() : this.b;
    }

    public final apyy c() {
        synchronized (this.g) {
            if (this.b == null) {
                this.b = (apyy) this.c.U();
            }
        }
        return this.b;
    }

    public final boolean d() {
        return this.e != null;
    }
}
