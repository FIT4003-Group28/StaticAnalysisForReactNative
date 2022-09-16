package defpackage;
/* compiled from: PG */
/* renamed from: adch  reason: default package */
/* loaded from: classes2.dex */
public class adch extends aczs implements adcg {
    private final abit a;
    @dzsi
    private String b;
    private final absg c;

    public adch(absx absxVar, acwt acwtVar, absg absgVar) {
        this.c = absgVar;
        cqhn a = absxVar.a.a();
        absx.a(a, 1);
        dxio a2 = ((dxjh) absxVar.b).a();
        absx.a(a2, 2);
        abuo a3 = absxVar.c.a();
        absx.a(a3, 3);
        cjqy a4 = absxVar.d.a();
        absx.a(a4, 4);
        dxio a5 = ((dxjh) absxVar.e).a();
        absx.a(a5, 5);
        absx.a(absgVar, 8);
        this.a = new absw(a, a2, a3, a4, a5, null, acwtVar, absgVar);
    }

    @Override // defpackage.adcg
    public abit a() {
        return this.a;
    }

    public void b(@dzsi dviz dvizVar) {
        djrs djrsVar;
        abit abitVar = this.a;
        String str = null;
        if (dvizVar == null || (dvizVar.a & 4) == 0) {
            djrsVar = null;
        } else {
            djrsVar = dvizVar.d;
            if (djrsVar == null) {
                djrsVar = djrs.g;
            }
        }
        if (abitVar.d(djrsVar)) {
            if (dvizVar != null && (dvizVar.a & 1) != 0) {
                str = dvizVar.b;
            }
            this.b = str;
        }
    }

    public boolean c() {
        return !this.a.f().isEmpty();
    }

    @Override // defpackage.aczr
    public cjtd e() {
        cjta b = cjtd.b();
        b.g(this.b);
        b.d = this.c == absg.AREA_EXPLORE ? dtxj.ce : dtxr.F;
        return b.a();
    }
}
