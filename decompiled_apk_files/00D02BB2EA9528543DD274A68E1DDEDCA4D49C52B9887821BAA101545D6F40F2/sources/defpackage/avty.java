package defpackage;
/* compiled from: PG */
/* renamed from: avty  reason: default package */
/* loaded from: classes3.dex */
public final class avty {
    public final akfa a;
    public final avtx b = new avtx(this);
    private deig<btlu> c = deig.d();
    @dzsi
    private btlu d = null;

    public avty(akfa akfaVar) {
        this.a = akfaVar;
    }

    private final synchronized void c() {
        if (this.c.isDone()) {
            this.c = deig.d();
        }
    }

    public final synchronized dehn<btlu> a() {
        return deha.o(this.c);
    }

    public final synchronized void b(@dzsi btlu btluVar) {
        if (btluVar == btlu.a) {
            btluVar = btlu.b;
        }
        if (dbsd.a(btluVar, this.d)) {
            return;
        }
        if (btlu.p(btluVar) || !btlu.p(this.d)) {
            if (!btlu.p(btluVar) || btlu.p(this.d)) {
                if (!btlu.p(btluVar) && !btlu.p(this.d)) {
                    c();
                    this.c.j(btluVar);
                }
            } else {
                c();
            }
        } else {
            c();
            this.c.j(btluVar);
        }
        this.d = btluVar;
    }
}
