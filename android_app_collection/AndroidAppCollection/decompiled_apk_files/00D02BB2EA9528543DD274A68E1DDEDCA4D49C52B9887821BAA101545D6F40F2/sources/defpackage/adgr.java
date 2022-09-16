package defpackage;
/* compiled from: PG */
/* renamed from: adgr  reason: default package */
/* loaded from: classes.dex */
public class adgr extends aczs implements adgq {
    private static final aeit a;
    private static final aeit b;
    private final aeij c;
    private cjtd d;

    static {
        aeis d = aeit.d();
        aeik aeikVar = (aeik) d;
        aeikVar.a = dtxj.cs;
        aeikVar.b = dtxj.cv;
        aeikVar.c = dtxj.ct;
        a = d.a();
        aeis d2 = aeit.d();
        aeik aeikVar2 = (aeik) d2;
        aeikVar2.a = dtxr.aj;
        aeikVar2.b = dtxr.am;
        aeikVar2.c = dtxr.ak;
        b = d2.a();
    }

    public adgr(aejb aejbVar, acwt acwtVar, absg absgVar) {
        aeit aeitVar = absgVar == absg.AREA_EXPLORE ? a : b;
        cjtd a2 = cjtd.a(absgVar == absg.AREA_EXPLORE ? dtxj.cu : dtxr.al);
        gga a3 = aejbVar.a.a();
        aejb.a(a3, 1);
        btvo a4 = aejbVar.b.a();
        aejb.a(a4, 2);
        cqat a5 = aejbVar.c.a();
        aejb.a(a5, 3);
        aejb.a(aejbVar.d.a(), 4);
        aeiv a6 = aejbVar.e.a();
        aejb.a(a6, 5);
        aeic a7 = aejbVar.f.a();
        aejb.a(a7, 6);
        dxio a8 = ((dxjh) aejbVar.g).a();
        aejb.a(a8, 7);
        aejb.a(aeitVar, 10);
        aejb.a(a2, 11);
        this.c = new aeja(a3, a4, a5, a6, a7, a8, acwtVar, aeitVar, a2);
        if (absgVar == absg.AREA_EXPLORE) {
            this.d = cjtd.a(dtxj.cr);
        } else {
            this.d = cjtd.a(dtxr.ai);
        }
    }

    @Override // defpackage.adgq
    public aeij a() {
        return this.c;
    }

    public void b(@dzsi dvhw dvhwVar) {
        djrm djrmVar;
        String str = null;
        if (dvhwVar == null || (dvhwVar.a & 4) == 0) {
            djrmVar = null;
        } else {
            djrmVar = dvhwVar.d;
            if (djrmVar == null) {
                djrmVar = djrm.v;
            }
        }
        this.c.a(djrmVar);
        cjta c = cjtd.c(this.d);
        if (dvhwVar != null && (dvhwVar.a & 1) != 0) {
            str = dvhwVar.b;
        }
        c.g(str);
        this.d = c.a();
    }

    public boolean c() {
        return this.c.b();
    }

    @Override // defpackage.aczr
    public cjtd e() {
        return this.d;
    }
}
