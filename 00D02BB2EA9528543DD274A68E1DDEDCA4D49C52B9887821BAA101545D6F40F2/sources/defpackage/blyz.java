package defpackage;
/* compiled from: PG */
/* renamed from: blyz  reason: default package */
/* loaded from: classes3.dex */
public class blyz implements blws {
    public final fd a;
    @dzsi
    public blyy b;
    private final dxio<bsvm> c;
    private final dxio<afha> d;
    private final dxio<ausy> e;
    private final btvo f;

    public blyz(fd fdVar, btvo btvoVar, dxio<bsvm> dxioVar, dxio<afha> dxioVar2, dxio<ausy> dxioVar3) {
        this.c = dxioVar;
        this.d = dxioVar2;
        this.a = fdVar;
        this.f = btvoVar;
        this.e = dxioVar3;
    }

    private final void e() {
        blyy blyyVar = this.b;
        if (blyyVar != null) {
            blyyVar.J();
        }
    }

    @Override // defpackage.blws
    public cqkl a() {
        blyy blyyVar = this.b;
        if (blyyVar != null) {
            blyyVar.K();
        }
        aujb e = this.e.a().e(dpyv.RIDDLER.dm);
        if (e != null) {
            this.c.a().m(e.w());
        }
        blyx blyxVar = new blyx(this);
        gn gnVar = this.a.A;
        if (gnVar != null) {
            gnVar.l(blyxVar);
        }
        return cqkl.a;
    }

    @Override // defpackage.blws
    public cqkl b() {
        e();
        this.c.a().i();
        return cqkl.a;
    }

    @Override // defpackage.blws
    public cqkl c() {
        e();
        this.d.a().k(this.a.J(), cjxr.u(this.f), 1);
        return cqkl.a;
    }

    public void d(blyy blyyVar) {
        this.b = blyyVar;
    }
}
