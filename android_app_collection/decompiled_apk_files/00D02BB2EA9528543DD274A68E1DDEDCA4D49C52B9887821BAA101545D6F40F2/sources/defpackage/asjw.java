package defpackage;
/* compiled from: PG */
/* renamed from: asjw  reason: default package */
/* loaded from: classes.dex */
public final class asjw implements axrw {
    public final bvjj a;
    public final brlz b;
    public final asik c;
    public final akfa d;
    @dzsi
    public asjv e;
    public boolean f;
    public boolean g;
    private final dxio<axrx> h;
    private final dxio<bzmm> i;
    private final askn j;

    public asjw(ff ffVar, bvjj bvjjVar, dxio<axrx> dxioVar, dxio<bzmm> dxioVar2, asko askoVar, brlz brlzVar, asik asikVar, akfa akfaVar) {
        this.a = bvjjVar;
        dbsk.s(dxioVar);
        this.h = dxioVar;
        dbsk.s(dxioVar2);
        this.i = dxioVar2;
        asko.a(ffVar, 1);
        asko.a(askoVar.a.a(), 2);
        btrm a = askoVar.b.a();
        asko.a(a, 3);
        bvjj a2 = askoVar.c.a();
        asko.a(a2, 4);
        brlz a3 = askoVar.d.a();
        asko.a(a3, 5);
        asik a4 = askoVar.e.a();
        asko.a(a4, 6);
        akfa a5 = askoVar.f.a();
        asko.a(a5, 7);
        this.j = new askn(ffVar, a, a2, a3, a4, a5);
        dbsk.s(brlzVar);
        this.b = brlzVar;
        dbsk.s(asikVar);
        this.c = asikVar;
        this.d = akfaVar;
    }

    @Override // defpackage.axrw
    public final void a(int i) {
        asjv asjvVar = this.e;
        dbsk.s(asjvVar);
        asjvVar.n(i == 0);
    }

    public final void b(asjv asjvVar) {
        this.j.a = new asju(this);
        this.e = asjvVar;
    }

    public final void c() {
        askn asknVar = this.j;
        askm askmVar = asknVar.b;
        if (askmVar != null) {
            askmVar.f();
            asknVar.b = null;
        }
        this.f = false;
    }

    public final void d(boolean z) {
        if (this.f) {
            return;
        }
        if (z) {
            e();
            return;
        }
        boolean a = this.i.a().a(this.j);
        this.f = a;
        if (a) {
            return;
        }
        this.g = false;
        e();
    }

    public final void e() {
        this.h.a().f(this);
    }
}
