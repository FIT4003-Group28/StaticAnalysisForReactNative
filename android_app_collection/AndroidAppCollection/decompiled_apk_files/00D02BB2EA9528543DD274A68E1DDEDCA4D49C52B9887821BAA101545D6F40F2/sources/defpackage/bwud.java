package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bwud  reason: default package */
/* loaded from: classes4.dex */
public final class bwud {
    private static final int j = bntn.CLIENT_INJECTED_AREAS_ABOVE_LABELS_AND_CALLOUTS.c();
    @dzsi
    public akti a;
    public volatile double b;
    public volatile double c;
    public volatile double d;
    public final bwsx e;
    public final bwsx f;
    public final bwsx g;
    public long h;
    public final akth i = new bwuc(this);
    private final akto k;
    @dzsi
    private akuh l;

    public bwud(akto aktoVar) {
        this.k = aktoVar;
        akvz e = aktoVar.e();
        if (e != null) {
            this.l = e.a(dmqc.LEGEND_STYLE_STREET_VIEW_POINT_OF_VIEW);
        }
        this.e = new bwsx(0.3d);
        this.f = new bwsx(0.3d);
        this.g = new bwsx(0.1d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(akqq akqqVar, dhkb dhkbVar, bwue bwueVar, boolean z) {
        if (this.l == null) {
            return;
        }
        synchronized (this) {
            this.b = akqqVar.a;
            this.c = akqqVar.b;
            this.d = dhkbVar.b;
        }
        akti aktiVar = this.a;
        if (aktiVar != null) {
            aktiVar.c(this.i);
            if (!z) {
                return;
            }
            synchronized (this) {
                this.e.b(akqqVar.a);
                this.f.b(akqqVar.b);
                this.g.b(dhkbVar.b);
            }
            return;
        }
        this.e.b(akqqVar.a);
        this.f.b(akqqVar.b);
        this.g.b(dhkbVar.b);
        akto aktoVar = this.k;
        dmpk dmpkVar = (dmpk) dmpn.r.bZ();
        int i = j;
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar = (dmpn) dmpkVar.b;
        dmpnVar.a |= 32768;
        dmpnVar.q = i;
        dmpe dmpeVar = (dmpe) dmph.f.bZ();
        akuh akuhVar = this.l;
        dbsk.s(akuhVar);
        dmpeVar.b(akuhVar.e());
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar2 = (dmpn) dmpkVar.b;
        dmph dmphVar = (dmph) dmpeVar.bK();
        dmphVar.getClass();
        dmpnVar2.b = dmphVar;
        dmpnVar2.a |= 1;
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar3 = (dmpn) dmpkVar.b;
        dmpnVar3.a |= 32;
        dmpnVar3.g = 11;
        dmlp bZ = dmlq.e.bZ();
        dmls a = akxh.a(akra.f(akqqVar));
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmlq dmlqVar = (dmlq) bZ.b;
        a.getClass();
        dmlqVar.b = a;
        dmlqVar.a |= 1;
        dmlo dmloVar = dmlo.CENTER;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmlq dmlqVar2 = (dmlq) bZ.b;
        dmlqVar2.c = dmloVar.j;
        int i2 = dmlqVar2.a | 2;
        dmlqVar2.a = i2;
        float f = dhkbVar.b;
        dmlqVar2.a = i2 | 4;
        dmlqVar2.d = (int) f;
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar4 = (dmpn) dmpkVar.b;
        dmlq bK = bZ.bK();
        bK.getClass();
        dmpnVar4.d = bK;
        dmpnVar4.a |= 4;
        dsqv<dmpn, akus> dsqvVar = akvj.a;
        akuq bZ2 = akus.o.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        akus akusVar = (akus) bZ2.b;
        akusVar.a |= 4194304;
        akusVar.m = true;
        dmpkVar.k(dsqvVar, bZ2.bK());
        akuh akuhVar2 = this.l;
        dbsk.s(akuhVar2);
        int a2 = akuhVar2.a();
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar5 = (dmpn) dmpkVar.b;
        dmpnVar5.a |= 2048;
        dmpnVar5.k = a2;
        akti a3 = aktoVar.a((dmpn) dmpkVar.bK(), dmti.WORLD_ENCODING_LAT_LNG_E7);
        this.a = a3;
        a3.Pt(bwueVar);
    }
}
