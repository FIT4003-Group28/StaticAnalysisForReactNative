package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bfmi  reason: default package */
/* loaded from: classes3.dex */
public final class bfmi {
    private final bfmr c;
    private final int d;
    private final dcep<dwci> e;
    private final Boolean f;
    public dcdc<String> a = dcdc.e();
    public dcdc<bfmh> b = dcdc.e();
    private cjta g = cjtd.b();

    public bfmi(bfmr bfmrVar, int i, dcep<dwci> dcepVar, boolean z) {
        this.c = bfmrVar;
        this.d = i;
        this.e = dcepVar;
        this.f = Boolean.valueOf(z);
    }

    public final void a(bwrs<ilo> bwrsVar) {
        boolean z;
        ilo iloVar = (ilo) bwrs.b(bwrsVar);
        if (iloVar == null) {
            return;
        }
        dccx F = dcdc.F();
        dccx F2 = dcdc.F();
        int i = 0;
        int i2 = 0;
        for (dwca dwcaVar : iloVar.h().aD) {
            dcep<dwci> dcepVar = this.e;
            dwci b = dwci.b(dwcaVar.c);
            if (b == null) {
                b = dwci.UNKNOWN_RELATION_CATEGORY;
            }
            if (dcepVar.contains(b)) {
                for (dwcg dwcgVar : dwcaVar.a) {
                    F.g(dwcgVar.e);
                    if (i2 < this.d) {
                        F2.g(dwcgVar);
                        i2++;
                    }
                }
            }
        }
        this.g = cjtd.c(iloVar.bZ());
        dcdc f = F2.f();
        int i3 = 1;
        if (this.f.booleanValue()) {
            if (f.size() > 1) {
                z = true;
                this.g.d = dtxo.bh;
            } else {
                z = false;
                this.g.d = dtxo.bg;
            }
        } else {
            z = false;
            this.g.d = dtxl.af;
        }
        dccx F3 = dcdc.F();
        int size = f.size();
        while (i < size) {
            dwcg dwcgVar2 = (dwcg) f.get(i);
            bfmr bfmrVar = this.c;
            String aT = iloVar.aT();
            cjta cjtaVar = this.g;
            dxio a = ((dxjh) bfmrVar.a).a();
            bfmr.a(a, i3);
            cqat a2 = bfmrVar.b.a();
            bfmr.a(a2, 2);
            Activity activity = (Activity) ((dxjd) bfmrVar.c).a;
            bfmr.a(activity, 3);
            bfmr.a(dwcgVar2, 4);
            bfmr.a(aT, 5);
            bfmr.a(cjtaVar, 6);
            bfmr.a(z, 7);
            F3.g(new bfmq(a, a2, activity, dwcgVar2, aT, cjtaVar, z));
            i++;
            iloVar = iloVar;
            i3 = 1;
        }
        this.b = F3.f();
        this.a = F.f();
    }

    public final void b() {
        this.a = dcdc.e();
        this.b = dcdc.e();
        this.g = cjtd.b();
    }
}
