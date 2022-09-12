package defpackage;
/* compiled from: PG */
/* renamed from: amyh  reason: default package */
/* loaded from: classes2.dex */
public final class amyh extends amxg implements amxn {
    private final boolean a;
    @dzsi
    private amyg b;
    private final akra c;
    private boolean e;

    public amyh(bnrz bnrzVar, boolean z) {
        super(bnrzVar);
        this.c = new akra();
        this.e = false;
        this.a = z;
    }

    @Override // defpackage.amxn
    public final synchronized boolean d(amxr amxrVar) {
        amyg amygVar = this.b;
        boolean z = false;
        if (amygVar == null) {
            this.e = false;
            return false;
        }
        int m = amygVar.m(amxrVar, this.a, this.c);
        if (m == 3) {
            z = true;
        }
        this.e = z;
        return amyf.a(m);
    }

    public final synchronized void j(amyg amygVar) {
        this.b = amygVar;
    }

    public final synchronized void k() {
        this.b = null;
    }

    public final synchronized boolean l() {
        return this.e;
    }

    public final synchronized akra m() {
        return new akra(this.c);
    }
}
