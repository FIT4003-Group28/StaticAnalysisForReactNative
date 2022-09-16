package defpackage;
/* compiled from: PG */
/* renamed from: bbqa  reason: default package */
/* loaded from: classes3.dex */
final class bbqa {
    public static final dcqe a = dcqe.c("bbqa");
    public final ckcw b;
    public final cjqy c;
    public final dwyd d;
    public final cjst e;
    public final cjst f;
    public int g = 0;
    public boolean h = false;
    private final boolean i;

    public bbqa(ckcw ckcwVar, cjqy cjqyVar, bbuj bbujVar, boolean z) {
        this.b = ckcwVar;
        this.c = cjqyVar;
        this.d = bbujVar.b();
        this.i = z;
        cjst d = cjsu.d();
        d.d(ddda.cK);
        this.e = d;
        cjst d2 = cjsu.d();
        d2.d(ddda.fL);
        this.f = d2;
        if (bbujVar.c().a().a()) {
            ((cjrr) d).a = bbujVar.c().a().b();
            ((cjrr) d2).a = bbujVar.c().a().b();
        }
    }

    public final cjrz a(ddcu ddcuVar, String str, cruf crufVar, boolean z, dbsg<dddn> dbsgVar) {
        dddl bZ = dddo.i.bZ();
        dwyd dwydVar = this.d;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dddo dddoVar = (dddo) bZ.b;
        dddoVar.d = dwydVar.Z;
        int i = dddoVar.a | 16;
        dddoVar.a = i;
        str.getClass();
        int i2 = i | 4;
        dddoVar.a = i2;
        dddoVar.b = str;
        dddoVar.c = crufVar.l;
        int i3 = i2 | 8;
        dddoVar.a = i3;
        int i4 = i3 | 64;
        dddoVar.a = i4;
        dddoVar.f = z;
        boolean z2 = this.i;
        dddoVar.a = i4 | 128;
        dddoVar.g = z2;
        if (dbsgVar.a()) {
            dddn b = dbsgVar.b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dddo dddoVar2 = (dddo) bZ.b;
            dddoVar2.e = b.f;
            dddoVar2.a |= 32;
        }
        cjry e = cjrz.e();
        e.b(ddcuVar);
        dddf bZ2 = dddg.g.bZ();
        dddo bK = bZ.bK();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dddg dddgVar = (dddg) bZ2.b;
        bK.getClass();
        dddgVar.b = bK;
        dddgVar.a |= 1;
        ((cjrn) e).b = bZ2.bK();
        return e.a();
    }
}
