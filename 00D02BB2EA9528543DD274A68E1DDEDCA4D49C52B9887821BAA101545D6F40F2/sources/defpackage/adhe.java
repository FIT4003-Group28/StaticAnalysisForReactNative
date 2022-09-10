package defpackage;
/* compiled from: PG */
/* renamed from: adhe  reason: default package */
/* loaded from: classes.dex */
public class adhe extends aczs implements adhd {
    private static final dcqe a = dcqe.c("adhe");
    @dzsi
    private awwb b;
    @dzsi
    private String c;
    private final abfc d;
    private final abse e;
    private final abkn f;

    public adhe(abud abudVar, acwt acwtVar, abfc abfcVar, abse abseVar) {
        ddho ddhoVar;
        ddho ddhoVar2;
        this.d = abfcVar;
        this.e = abseVar;
        absg absgVar = absg.UNKNOWN_EXPLORE_SURFACE;
        absg b = absg.b(abseVar.b);
        int ordinal = (b == null ? absg.UNKNOWN_EXPLORE_SURFACE : b).ordinal();
        if (ordinal == 1) {
            ddhoVar = dtxr.ao;
            ddhoVar2 = dtxr.an;
        } else if (ordinal != 2) {
            Object[] objArr = new Object[1];
            absg b2 = absg.b(abseVar.b);
            objArr[0] = (b2 == null ? absg.UNKNOWN_EXPLORE_SURFACE : b2).name();
            bvoo.h("No VE types configured specifically for %s.", objArr);
            ddhoVar = dtxr.ao;
            ddhoVar2 = dtxr.an;
        } else {
            ddhoVar = dtxj.cx;
            ddhoVar2 = dtxj.cw;
        }
        ddho ddhoVar3 = ddhoVar;
        ddho ddhoVar4 = ddhoVar2;
        huc a2 = abudVar.a.a();
        abud.a(a2, 1);
        abvz a3 = abudVar.b.a();
        abud.a(a3, 2);
        bvpe a4 = abudVar.c.a();
        abud.a(a4, 3);
        abud.a(ddhoVar3, 5);
        abud.a(ddhoVar4, 6);
        abud.a(abseVar, 8);
        this.f = new abuc(a2, a3, a4, null, ddhoVar3, ddhoVar4, acwtVar, abseVar);
    }

    @Override // defpackage.adhd
    public abkn a() {
        return this.f;
    }

    @Override // defpackage.adhd
    public Boolean b() {
        awwb awwbVar;
        boolean z = false;
        if (c().booleanValue() || ((awwbVar = this.b) != null && awwbVar.c(awvv.d).b())) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.adhd
    public Boolean c() {
        return Boolean.valueOf(!this.f.a().isEmpty());
    }

    @Override // defpackage.aczr
    public cjtd e() {
        ddho ddhoVar;
        absg absgVar = absg.UNKNOWN_EXPLORE_SURFACE;
        absg b = absg.b(this.e.b);
        if (b == null) {
            b = absg.UNKNOWN_EXPLORE_SURFACE;
        }
        int ordinal = b.ordinal();
        if (ordinal == 1) {
            ddhoVar = dtxr.ap;
        } else if (ordinal != 2) {
            Object[] objArr = new Object[1];
            absg b2 = absg.b(this.e.b);
            if (b2 == null) {
                b2 = absg.UNKNOWN_EXPLORE_SURFACE;
            }
            objArr[0] = b2.name();
            bvoo.h("No VE types configured specifically for %s.", objArr);
            ddhoVar = dtxr.ap;
        } else {
            ddhoVar = dtxj.cy;
        }
        cjta b3 = cjtd.b();
        b3.g(this.c);
        b3.d = ddhoVar;
        return b3.a();
    }

    public boolean f() {
        return !this.d.b() || this.b != null;
    }

    public void g(awwb awwbVar) {
        this.b = awwbVar;
    }

    public void h(@dzsi dviz dvizVar) {
        djrs djrsVar = null;
        this.c = (dvizVar == null || (dvizVar.a & 1) == 0) ? null : dvizVar.b;
        abkn abknVar = this.f;
        if (dvizVar != null && (dvizVar.a & 4) != 0 && (djrsVar = dvizVar.d) == null) {
            djrsVar = djrs.g;
        }
        abknVar.j(djrsVar, this.c);
        cqkx.p(this);
    }
}
