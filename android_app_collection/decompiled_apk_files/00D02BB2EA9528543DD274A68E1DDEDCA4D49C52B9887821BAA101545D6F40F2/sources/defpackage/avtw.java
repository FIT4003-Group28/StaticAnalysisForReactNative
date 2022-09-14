package defpackage;
/* compiled from: PG */
/* renamed from: avtw  reason: default package */
/* loaded from: classes3.dex */
public final class avtw extends cjtt {
    private final dwir a;
    private final dwiv b;

    public avtw(cqat cqatVar, dcdc<dtaq> dcdcVar, dwir dwirVar, dwiv dwivVar) {
        super(cqatVar, dcdcVar);
        this.a = dwirVar;
        this.b = dwivVar;
    }

    @Override // defpackage.cjtt
    protected final dvfy a() {
        dvfx bZ = dvfy.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvfy dvfyVar = (dvfy) bZ.b;
        dvfyVar.a |= 1;
        dvfyVar.d = 150;
        dvgj bZ2 = dvgk.d.bZ();
        dwir dwirVar = this.a;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dvgk dvgkVar = (dvgk) bZ2.b;
        dwirVar.getClass();
        dvgkVar.b = dwirVar;
        int i = dvgkVar.a | 1;
        dvgkVar.a = i;
        dwiv dwivVar = this.b;
        dwivVar.getClass();
        dvgkVar.c = dwivVar;
        dvgkVar.a = i | 2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvfy dvfyVar2 = (dvfy) bZ.b;
        dvgk bK = bZ2.bK();
        bK.getClass();
        dvfyVar2.c = bK;
        dvfyVar2.b = 2;
        return bZ.bK();
    }
}
