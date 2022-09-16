package defpackage;
/* compiled from: PG */
/* renamed from: jig  reason: default package */
/* loaded from: classes3.dex */
public final class jig implements jic {
    private final aahf a;
    private final afvn b;
    private final jin c;
    private final jij d;
    private final jil e;
    private final yve f;
    private final jhz g;
    private final fbw h;

    public jig(aahf aahfVar, afvn afvnVar, jin jinVar, jij jijVar, jil jilVar, yve yveVar, jhz jhzVar, fbw fbwVar) {
        this.a = aahfVar;
        this.b = afvnVar;
        this.c = jinVar;
        this.d = jijVar;
        this.e = jilVar;
        this.f = yveVar;
        this.g = jhzVar;
        this.h = fbwVar;
    }

    @Override // defpackage.jic
    public final int a() {
        return 261;
    }

    @Override // defpackage.jic
    public final int b() {
        return 141;
    }

    @Override // defpackage.jic
    public final /* bridge */ /* synthetic */ jia c(aajj aajjVar, String str, jib jibVar) {
        asze aszeVar = (asze) aajjVar;
        aqog f = aqoh.f(str);
        jiu jiuVar = (jiu) jibVar;
        float f2 = 0.0f;
        boolean z = false;
        jiu jiuVar2 = new jiu(0.0f, false, 1);
        if (aszeVar != null) {
            avyq f3 = jhz.f(this.g.b(aszeVar));
            asza b = aszeVar.b();
            atss atssVar = null;
            atyp b2 = b != null ? b.b() : null;
            if (jiuVar != null) {
                f2 = jiuVar.a;
            }
            float max = Math.max(f2, jhz.o(b2));
            jhz jhzVar = this.g;
            asza b3 = aszeVar.b();
            atyp b4 = b3 != null ? b3.b() : null;
            f.l(Boolean.valueOf(jhzVar.n(b4, b4 != null ? b4.f() : null)));
            f.d(f3);
            jhz jhzVar2 = this.g;
            asza b5 = aszeVar.b();
            atyp b6 = b5 != null ? b5.b() : null;
            if (b6 != null) {
                atssVar = b6.f();
            }
            f.j(jhzVar2.g(jhzVar2.b(aszeVar), b6, atssVar));
            f.c(Float.valueOf(max));
            f.m(Float.valueOf(f2));
            f.k(false);
            if (f3 == avyq.DOWNLOAD_STATE_COMPLETE || f3 == avyq.DOWNLOAD_STATE_FAILED) {
                z = true;
            }
            jiuVar2 = new jiu(max, z, 1);
        } else {
            f.d(avyq.DOWNLOAD_STATE_NOT_DOWNLOADED);
        }
        return jia.b(f.a(this.a.a(this.b.c())), jiuVar2);
    }

    @Override // defpackage.jic
    public final ampq d(String str) {
        awbp k = hhw.k(str, this.h);
        return k == null ? amon.a : ampq.j(emn.o(k.c));
    }

    @Override // defpackage.jic
    public final amvn e(String str) {
        awbp k = hhw.k(str, this.h);
        if (k == null) {
            return amyg.a;
        }
        String str2 = k.c;
        String o = emn.o(str2);
        amvl i = amvn.i();
        i.c(this.c.a(o));
        i.c(this.c.a(emn.q(str2)));
        i.c(this.c.a(emn.s(str2)));
        i.c(this.c.a(emn.x(str2)));
        i.c(this.c.a(emn.z(str2)));
        i.c(this.d.a());
        i.c(this.c.a(emn.l(str2)));
        i.c(this.e.a());
        i.c(jjd.b(this.f, iyw.m));
        return i.g();
    }

    @Override // defpackage.jic
    public final Class f() {
        return asze.class;
    }

    @Override // defpackage.jic
    public final Class g() {
        return aqoi.class;
    }

    @Override // defpackage.jic
    public final mhk h(String str) {
        return new mhk(1, str);
    }
}
