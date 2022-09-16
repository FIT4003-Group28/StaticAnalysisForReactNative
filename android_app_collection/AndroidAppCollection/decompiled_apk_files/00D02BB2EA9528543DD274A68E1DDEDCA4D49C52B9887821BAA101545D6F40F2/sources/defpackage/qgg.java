package defpackage;
/* compiled from: PG */
/* renamed from: qgg  reason: default package */
/* loaded from: classes7.dex */
public final class qgg {
    private static final dcdc<dmlo> a = dcdc.i(dmlo.BOTTOM, dmlo.TOP, dmlo.RIGHT, dmlo.LEFT);
    private static final akuj b;
    private final amrg c;
    private final akty d;
    private final String e;
    private final akqq f;
    private final akuh g;
    private final akuh h;
    private final akuh i;
    @dzsi
    private aktc j;
    private boolean k;

    static {
        akui bZ = akuj.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        akuj akujVar = (akuj) bZ.b;
        akujVar.a |= 4;
        akujVar.d = true;
        b = bZ.bK();
    }

    public qgg(amrg amrgVar, akty aktyVar, String str, akqq akqqVar, akuh akuhVar, akuh akuhVar2, akuh akuhVar3) {
        this.c = amrgVar;
        this.d = aktyVar;
        this.e = str;
        this.f = akqqVar;
        this.g = akuhVar;
        this.h = akuhVar2;
        this.i = akuhVar3;
    }

    public final void a() {
        if (this.k) {
            bvoo.f(new RuntimeException("Attempted to add callout to map multiple times."));
            return;
        }
        this.k = true;
        dmpk dmpkVar = (dmpk) dmpn.r.bZ();
        dmpe f = this.g.f();
        f.b(this.i.e());
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar = (dmpn) dmpkVar.b;
        dmph dmphVar = (dmph) f.bK();
        dmphVar.getClass();
        dmpnVar.b = dmphVar;
        dmpnVar.a |= 1;
        dmpe f2 = this.g.f();
        dmpc e = this.h.e();
        String valueOf = String.valueOf(this.e);
        String concat = valueOf.length() != 0 ? " ".concat(valueOf) : new String(" ");
        if (e.c) {
            e.bF();
            e.c = false;
        }
        dmpd dmpdVar = (dmpd) e.b;
        dmpd dmpdVar2 = dmpd.h;
        concat.getClass();
        dmpdVar.a |= 1;
        dmpdVar.b = concat;
        f2.b(e);
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar2 = (dmpn) dmpkVar.b;
        dmph dmphVar2 = (dmph) f2.bK();
        dmphVar2.getClass();
        dmpnVar2.c = dmphVar2;
        dmpnVar2.a |= 2;
        dmlp bZ = dmlq.e.bZ();
        dmls a2 = akxh.a(akra.f(this.f));
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmlq dmlqVar = (dmlq) bZ.b;
        a2.getClass();
        dmlqVar.b = a2;
        dmlqVar.a |= 1;
        dcdc<dmlo> dcdcVar = a;
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
        dmpn dmpnVar3 = (dmpn) dmpkVar.b;
        dmlq bK = bZ.bK();
        bK.getClass();
        dmpnVar3.d = bK;
        dmpnVar3.a |= 4;
        dmpkVar.k(akvj.b, b);
        this.j = this.d.d((dmpn) dmpkVar.bK(), dmti.WORLD_ENCODING_LAT_LNG_E7);
        amrg amrgVar = this.c;
        amrb g = amrc.g();
        aktc aktcVar = this.j;
        dbsk.s(aktcVar);
        g.b(aktcVar);
        amsd amsdVar = new amsd();
        amsdVar.d(10, new amrq());
        amsdVar.d(10, new amrm());
        amsdVar.e(2, new qgh());
        amsdVar.e(1, new amrp());
        g.c(new qgi(amsdVar.a()));
        g.d(0);
        g.f(amsb.BIKESHARING);
        g.e(dcdcVar);
        amrgVar.c(g.g());
    }

    public final void b() {
        if (!this.k) {
            bvoo.f(new RuntimeException("Attempted to remove callout to map before it was added."));
            return;
        }
        this.k = false;
        amrg amrgVar = this.c;
        aktc aktcVar = this.j;
        dbsk.s(aktcVar);
        amrgVar.a(aktcVar);
        akty aktyVar = this.d;
        aktc aktcVar2 = this.j;
        dbsk.s(aktcVar2);
        aktyVar.e(aktcVar2);
    }
}
