package defpackage;
/* compiled from: PG */
/* renamed from: jiv  reason: default package */
/* loaded from: classes3.dex */
public final class jiv implements jic {
    private final aagi a;
    private final jie b;
    private final jij c;
    private final jil d;
    private final jhw e;
    private final yve f;
    private final jhz g;
    private final fbx h;
    private final fbw i;

    public jiv(aagi aagiVar, jie jieVar, jij jijVar, jil jilVar, jhw jhwVar, yve yveVar, jhz jhzVar, fbx fbxVar, fbw fbwVar) {
        this.a = aagiVar;
        this.b = jieVar;
        this.c = jijVar;
        this.d = jilVar;
        this.e = jhwVar;
        this.f = yveVar;
        this.g = jhzVar;
        this.h = fbxVar;
        this.i = fbwVar;
    }

    @Override // defpackage.jic
    public final int a() {
        return 155;
    }

    @Override // defpackage.jic
    public final int b() {
        return 141;
    }

    @Override // defpackage.jic
    public final /* bridge */ /* synthetic */ jia c(aajj aajjVar, String str, jib jibVar) {
        awjr awjrVar = (awjr) aajjVar;
        aqog f = aqoh.f(str);
        jiu jiuVar = (jiu) jibVar;
        float f2 = 0.0f;
        boolean z = false;
        jiu jiuVar2 = new jiu(0.0f, false);
        if (awjrVar != null) {
            avyq f3 = jhz.f(this.g.c(awjrVar));
            if (jiuVar != null) {
                f2 = jiuVar.a;
            }
            float max = Math.max(f2, jhz.o(awjrVar.f()));
            f.l(Boolean.valueOf(this.g.m(awjrVar)));
            f.d(f3);
            jhz jhzVar = this.g;
            f.j(jhzVar.g(jhzVar.c(awjrVar), awjrVar.f(), awjrVar.b()));
            f.c(Float.valueOf(max));
            f.m(Float.valueOf(f2));
            f.k(Boolean.valueOf(jhz.p(awjrVar.b())));
            if (this.g.d(awjrVar).h()) {
                aopa aopaVar = f.a;
                aopaVar.copyOnWrite();
                aqoj aqojVar = (aqoj) aopaVar.instance;
                aqoj aqojVar2 = aqoj.a;
                aqojVar.n = (atqt) this.g.d(awjrVar).c();
                aqojVar.c |= 1024;
            }
            if (f3 == avyq.DOWNLOAD_STATE_COMPLETE || f3 == avyq.DOWNLOAD_STATE_FAILED) {
                z = true;
            }
            jiuVar2 = new jiu(max, z);
        } else {
            f.d(avyq.DOWNLOAD_STATE_NOT_DOWNLOADED);
        }
        return jia.b(f.a(this.a.c()), jiuVar2);
    }

    @Override // defpackage.jic
    public final ampq d(String str) {
        awbp k = hhw.k(str, this.i);
        return k == null ? amon.a : ampq.j(emn.h(k.c));
    }

    @Override // defpackage.jic
    public final amvn e(String str) {
        awbp k = hhw.k(str, this.i);
        if (k == null) {
            return amyg.a;
        }
        String str2 = k.c;
        String h = emn.h(str2);
        amvl i = amvn.i();
        i.c(this.b.a(h));
        i.c(this.b.a(emn.q(str2)));
        i.c(this.b.a(emn.s(str2)));
        i.c(this.b.a(emn.x(str2)));
        i.c(this.c.a());
        i.c(this.b.a(emn.l(str2)));
        i.c(this.d.a());
        i.c(jjd.b(this.f, iyw.r));
        if (this.h.a()) {
            if (jhz.p((atss) this.a.c().f(emn.q(str2)).g(atss.class).W())) {
                i.c(this.e.a());
            }
        }
        return i.g();
    }

    @Override // defpackage.jic
    public final Class f() {
        return awjr.class;
    }

    @Override // defpackage.jic
    public final Class g() {
        return aqoi.class;
    }

    @Override // defpackage.jic
    public final mhk h(String str) {
        return new mhk(2, str);
    }
}
