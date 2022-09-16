package defpackage;
/* compiled from: PG */
/* renamed from: ammv  reason: default package */
/* loaded from: classes.dex */
public final class ammv extends akzm {
    public boolean a;
    public float n;
    public float o;
    public float p;
    @dzsi
    public alad q;
    @dzsi
    private alad r;
    private final akzh s;
    private long t;

    public ammv(bvnx bvnxVar, akzh akzhVar) {
        super(bvnxVar);
        this.t = 0L;
        this.s = akzhVar;
    }

    @Override // defpackage.akzm
    public final boolean a(@dzsi alad aladVar, @dzsi alad aladVar2) {
        this.r = aladVar;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.t = 330L;
    }

    @Override // defpackage.akzm, defpackage.akzv
    public final int d() {
        if (this.a) {
            return alad.c | alad.d;
        }
        return alad.d;
    }

    @Override // defpackage.akzm, defpackage.akzv
    public final int e(long j) {
        if (this.q == null) {
            alad aladVar = this.r;
            dbsk.s(aladVar);
            if (this.a) {
                this.q = akyx.j(this.s, aladVar, this.n, this.o, this.p);
            } else {
                alaa b = alad.b(aladVar);
                b.c = this.n;
                this.q = b.a();
            }
            super.a(aladVar, this.q);
            super.p(this.t);
        }
        return super.e(j);
    }

    @Override // defpackage.akzm, defpackage.akzv
    public final void j(int i) {
        this.d = this.c.a();
    }

    @Override // defpackage.akzm, defpackage.akzv
    public final boolean m(@dzsi akzv akzvVar, int i) {
        return !(akzvVar instanceof ammw) || !((ammw) akzvVar).y();
    }
}
