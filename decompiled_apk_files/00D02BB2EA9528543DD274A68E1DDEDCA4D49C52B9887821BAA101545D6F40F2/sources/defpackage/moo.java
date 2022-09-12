package defpackage;
/* compiled from: PG */
/* renamed from: moo  reason: default package */
/* loaded from: classes7.dex */
public abstract class moo {
    final /* synthetic */ mor c;

    public moo(mor morVar) {
        this.c = morVar;
    }

    @dzsi
    public cqtd a() {
        return this.c.i;
    }

    public int b() {
        return 0;
    }

    @dzsi
    public abstract ddho c();

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public moo f() {
        return this;
    }

    public moo g() {
        return this;
    }

    public void h() {
        throw null;
    }

    public int i() {
        return this.c.j;
    }

    public boolean j() {
        return false;
    }

    public boolean k() {
        return false;
    }

    public moo l() {
        return this;
    }

    public CharSequence m() {
        return "";
    }

    public boolean n() {
        return false;
    }

    public knz o() {
        return kob.a;
    }

    public iuv p() {
        return this.c.a;
    }

    public CharSequence q() {
        return "";
    }

    public CharSequence r() {
        return "";
    }

    public boolean s() {
        return false;
    }

    public int t() {
        return 0;
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.h("show spinner", j());
        b.f("status msg id", b());
        b.b("travel time", m());
        b.b("distance text", q());
        b.h("waiting for ready", k());
        b.h("has action", e());
        return b.toString();
    }

    public final moo u(boolean z) {
        if (z) {
            return new mop(this.c);
        }
        return new mok(this.c);
    }
}
