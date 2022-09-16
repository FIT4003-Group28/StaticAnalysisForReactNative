package defpackage;
/* compiled from: PG */
/* renamed from: bycg  reason: default package */
/* loaded from: classes4.dex */
public final class bycg {
    private static final dcdc<dmlo> c = dcdc.i(dmlo.BOTTOM, dmlo.TOP, dmlo.RIGHT, dmlo.LEFT);
    private static final akuj d;
    public final String a;
    public final akqq b;
    private final amrg e;
    private final akvz f;
    private final akty g;
    @dzsi
    private aktc h;
    private boolean i;

    static {
        akui bZ = akuj.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        akuj akujVar = (akuj) bZ.b;
        akujVar.a |= 4;
        akujVar.d = true;
        d = bZ.bK();
    }

    public bycg(amrg amrgVar, akvz akvzVar, akty aktyVar, String str, akqq akqqVar) {
        this.e = amrgVar;
        this.f = akvzVar;
        this.g = aktyVar;
        this.a = str;
        this.b = akqqVar;
    }

    public final void a() {
        if (this.i) {
            bvoo.f(new RuntimeException("Attempted to add callout to map multiple times."));
            return;
        }
        this.i = true;
        akuh a = this.f.a(dmqc.LEGEND_STYLE_RIDESHARING_WAITING_TIME_TEXT);
        akuh a2 = this.f.a(dmqc.LEGEND_STYLE_RIDESHARING_WAITING_TIME_CALLOUT);
        dmpk dmpkVar = (dmpk) dmpn.r.bZ();
        dmpe f = a2.f();
        dmpc e = a.e();
        String str = this.a;
        if (e.c) {
            e.bF();
            e.c = false;
        }
        dmpd dmpdVar = (dmpd) e.b;
        dmpd dmpdVar2 = dmpd.h;
        str.getClass();
        dmpdVar.a |= 1;
        dmpdVar.b = str;
        f.b(e);
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar = (dmpn) dmpkVar.b;
        dmph dmphVar = (dmph) f.bK();
        dmphVar.getClass();
        dmpnVar.b = dmphVar;
        dmpnVar.a |= 1;
        dmlp bZ = dmlq.e.bZ();
        dmls a3 = akxh.a(akra.f(this.b));
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmlq dmlqVar = (dmlq) bZ.b;
        a3.getClass();
        dmlqVar.b = a3;
        dmlqVar.a |= 1;
        dcdc<dmlo> dcdcVar = c;
        dmlo dmloVar = dcdcVar.get(1);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmlq dmlqVar2 = (dmlq) bZ.b;
        dmlqVar2.c = dmloVar.j;
        dmlqVar2.a |= 2;
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar2 = (dmpn) dmpkVar.b;
        dmlq bK = bZ.bK();
        bK.getClass();
        dmpnVar2.d = bK;
        dmpnVar2.a |= 4;
        dmpkVar.k(akvj.b, d);
        this.h = this.g.d((dmpn) dmpkVar.bK(), dmti.WORLD_ENCODING_LAT_LNG_E7);
        amrg amrgVar = this.e;
        amrb g = amrc.g();
        aktc aktcVar = this.h;
        dbsk.s(aktcVar);
        g.b(aktcVar);
        amsd amsdVar = new amsd();
        amsdVar.c(new amrq());
        amsdVar.d(10, new amrm());
        amsdVar.e(2, new bych());
        amsdVar.e(1, new amrp());
        g.c(new byci(amsdVar.a()));
        g.d(0);
        g.f(amsb.TAXI);
        g.e(dcdcVar);
        amrgVar.c(g.g());
    }

    public final void b() {
        if (!this.i) {
            bvoo.f(new RuntimeException("Attempted to remove callout to map before it was added."));
            return;
        }
        this.i = false;
        amrg amrgVar = this.e;
        aktc aktcVar = this.h;
        dbsk.s(aktcVar);
        amrgVar.a(aktcVar);
        akty aktyVar = this.g;
        aktc aktcVar2 = this.h;
        dbsk.s(aktcVar2);
        aktyVar.e(aktcVar2);
    }
}
