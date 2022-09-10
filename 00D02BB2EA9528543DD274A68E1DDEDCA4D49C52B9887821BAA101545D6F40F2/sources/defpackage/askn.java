package defpackage;
/* compiled from: PG */
/* renamed from: askn  reason: default package */
/* loaded from: classes.dex */
public final class askn implements bzml {
    private static final String c = "askn";
    @dzsi
    public askl a;
    @dzsi
    askm b;
    private final ff d;
    private final btrm e;
    private final bvjj f;
    private final brlz g;
    private final asik h;
    private final akfa i;

    public askn(ff ffVar, btrm btrmVar, bvjj bvjjVar, brlz brlzVar, asik asikVar, akfa akfaVar) {
        this.d = ffVar;
        this.e = btrmVar;
        this.f = bvjjVar;
        this.g = brlzVar;
        this.h = asikVar;
        this.i = akfaVar;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.NAVIGATION_WELCOME;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.LEGALLY_REQUIRED;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return true;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        return true;
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        boolean a = ashb.a(this.g.g, this.h, this.i);
        if (this.f.m(bvjk.bR, false) && (!a || this.f.m(bvjk.bS, false))) {
            return bzmk.NONE;
        }
        return bzmk.VISIBLE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        askl asklVar = this.a;
        dbsk.s(asklVar);
        askm a = askj.a(asklVar, this);
        this.b = a;
        a.Pl(this.d.g().b(), c);
        this.e.b(new aswe());
        return true;
    }
}
