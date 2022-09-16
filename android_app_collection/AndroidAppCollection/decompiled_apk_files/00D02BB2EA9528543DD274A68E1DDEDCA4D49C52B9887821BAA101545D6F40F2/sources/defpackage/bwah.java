package defpackage;

import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* renamed from: bwah  reason: default package */
/* loaded from: classes4.dex */
public final class bwah extends bvwn<dmgg> {
    private final bbut b;
    private final gga c;

    public bwah(bbut bbutVar, gga ggaVar) {
        super(dmgg.e);
        this.b = bbutVar;
        this.c = ggaVar;
    }

    @Override // defpackage.bvwn
    protected final /* bridge */ /* synthetic */ void a(dmgg dmggVar) {
        dmgg dmggVar2 = dmggVar;
        dccx F = dcdc.F();
        for (dmgd dmgdVar : dmggVar2.a) {
            dwfi bZ = dwfl.w.bZ();
            String str = dmgdVar.a;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwfl dwflVar = (dwfl) bZ.b;
            str.getClass();
            int i = dwflVar.a | 128;
            dwflVar.a = i;
            dwflVar.h = str;
            String str2 = dmgdVar.c;
            str2.getClass();
            int i2 = i | ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
            dwflVar.a = i2;
            dwflVar.q = str2;
            long j = dmgdVar.b;
            dwflVar.a = i2 | 16384;
            dwflVar.o = j;
            if (dmgdVar.d) {
                dizg bZ2 = dizh.j.bZ();
                diir bZ3 = diis.h.bZ();
                diiu diiuVar = diiu.MAYBE_RECEIPT;
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                diis diisVar = (diis) bZ3.b;
                diiuVar.getClass();
                dsrf dsrfVar = diisVar.c;
                if (!dsrfVar.a()) {
                    diisVar.c = dsqw.cg(dsrfVar);
                }
                diisVar.c.h(diiuVar.m);
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dizh dizhVar = (dizh) bZ2.b;
                diis bK = bZ3.bK();
                bK.getClass();
                dizhVar.g = bK;
                dizhVar.a |= 16;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dwfl dwflVar2 = (dwfl) bZ.b;
                dizh bK2 = bZ2.bK();
                bK2.getClass();
                dwflVar2.p = bK2;
                dwflVar2.a |= 32768;
            }
            F.g(bZ.bK());
        }
        bbut bbutVar = this.b;
        ckne ckneVar = new ckne(F.f());
        int i3 = dmggVar2.c;
        bbtv v = bbty.v();
        dmgf dmgfVar = dmggVar2.b;
        if (dmgfVar == null) {
            dmgfVar = dmgf.b;
        }
        v.e(dmgfVar.a);
        v.g(true);
        bbutVar.o(ckneVar, i3, v.a(), (gfw) this.c.K());
    }
}
