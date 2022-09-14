package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: amdf  reason: default package */
/* loaded from: classes.dex */
public final class amdf implements amcg {
    static final long a = TimeUnit.DAYS.toMillis(45);
    private final amda b;
    private final cqat c;

    public amdf(amda amdaVar, cqat cqatVar) {
        this.b = amdaVar;
        this.c = cqatVar;
    }

    @Override // defpackage.amcg
    @dzsi
    public final amfu a(String str) {
        amyu bZ = amyv.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        amyv amyvVar = (amyv) bZ.b;
        amyvVar.b = 1;
        int i = amyvVar.a | 1;
        amyvVar.a = i;
        str.getClass();
        amyvVar.a = i | 2;
        amyvVar.c = str;
        amyv bK = bZ.bK();
        try {
            amyt d = this.b.d(bK);
            if (d != null) {
                try {
                    dxal dxalVar = (dxal) ((dssr) dxal.g.cu(7)).l(d.b);
                    amfu amfuVar = new amfu(str);
                    amfuVar.c = true;
                    amfuVar.p(dxalVar);
                    return amfuVar;
                } catch (dsrm unused) {
                    this.b.e(bK);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    @Override // defpackage.amcg
    public final void b(@dzsi dxal dxalVar) {
        if (dxalVar != null) {
            amyw bZ = amyx.f.bZ();
            amyu bZ2 = amyv.d.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            amyv amyvVar = (amyv) bZ2.b;
            amyvVar.b = 1;
            int i = amyvVar.a | 1;
            amyvVar.a = i;
            String str = dxalVar.b;
            str.getClass();
            amyvVar.a = i | 2;
            amyvVar.c = str;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            amyx amyxVar = (amyx) bZ.b;
            amyv bK = bZ2.bK();
            bK.getClass();
            amyxVar.b = bK;
            amyxVar.a |= 1;
            long b = this.c.b() + a;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            amyx amyxVar2 = (amyx) bZ.b;
            int i2 = amyxVar2.a | 8;
            amyxVar2.a = i2;
            amyxVar2.d = b;
            amyxVar2.a = i2 | 2;
            amyxVar2.c = "";
            try {
                this.b.f(bZ.bK(), dxalVar.bS());
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.amcg
    public final void c() {
    }
}
