package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: bxdt  reason: default package */
/* loaded from: classes4.dex */
final class bxdt extends bxep<dvvu, dvvw> {
    public final dvvu a;

    public bxdt(bxla bxlaVar, bxkz bxkzVar, bxkx bxkxVar, cqat cqatVar, @dzsi akqs akqsVar, int i) {
        super(dunt.TACTILE_CATEGORIES_REQUEST, bxlaVar, bxkzVar, bxkxVar, cqatVar);
        dvvt bZ = dvvu.f.bZ();
        String str = ((bxky) bxkzVar).a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvvu dvvuVar = (dvvu) bZ.b;
        str.getClass();
        dvvuVar.a |= 2;
        dvvuVar.c = str;
        boolean z = true;
        if (akqsVar != null) {
            dpum h = akqsVar.c().h();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dvvu dvvuVar2 = (dvvu) bZ.b;
            h.getClass();
            dvvuVar2.b = h;
            dvvuVar2.a |= 1;
        }
        dvvu dvvuVar3 = (dvvu) bZ.b;
        dvvuVar3.a |= 4;
        dvvuVar3.d = i;
        z = bxlaVar != bxla.CATEGORY_WITH_PRIVATE_LABELS_SELECTOR ? false : z;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvvu dvvuVar4 = (dvvu) bZ.b;
        dvvuVar4.a |= 8;
        dvvuVar4.e = z;
        this.a = bZ.bK();
    }

    @dzsi
    public final synchronized void b(dvvw dvvwVar) {
        String c = c();
        dccx F = dcdc.F();
        for (dnfw dnfwVar : dvvwVar.a) {
            bxme bZ = bxmh.f.bZ();
            dwji bZ2 = dwjj.k.bZ();
            dxbe bZ3 = dxbp.x.bZ();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dxbp dxbpVar = (dxbp) bZ3.b;
            c.getClass();
            int i = dxbpVar.a | 1;
            dxbpVar.a = i;
            dxbpVar.b = c;
            String str = dnfwVar.c;
            str.getClass();
            int i2 = i | 2;
            dxbpVar.a = i2;
            dxbpVar.c = str;
            dxbpVar.a = i2 | 128;
            dxbpVar.h = 1;
            dxbb bZ4 = dxbc.b.bZ();
            String str2 = dnfwVar.c;
            dccx F2 = dcdc.F();
            dxbq bZ5 = dxbr.h.bZ();
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dxbr dxbrVar = (dxbr) bZ5.b;
            dxbrVar.a |= 1;
            dxbrVar.b = 0;
            int length = str2.length();
            if (bZ5.c) {
                bZ5.bF();
                bZ5.c = false;
            }
            dxbr dxbrVar2 = (dxbr) bZ5.b;
            dxbrVar2.a |= 2;
            dxbrVar2.c = length;
            int indexOf = str2.toLowerCase(Locale.getDefault()).indexOf(c.toLowerCase(Locale.getDefault()));
            int length2 = c.length() + indexOf;
            if (indexOf >= 0) {
                if (bZ5.c) {
                    bZ5.bF();
                    bZ5.c = false;
                }
                dxbr dxbrVar3 = (dxbr) bZ5.b;
                int i3 = dxbrVar3.a | 32;
                dxbrVar3.a = i3;
                dxbrVar3.d = indexOf;
                dxbrVar3.a = i3 | 64;
                dxbrVar3.e = length2;
            }
            F2.g(bZ5.bK());
            dcdc f = F2.f();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            dxbc dxbcVar = (dxbc) bZ4.b;
            dsrj<dxbr> dsrjVar = dxbcVar.a;
            if (!dsrjVar.a()) {
                dxbcVar.a = dsqw.cl(dsrjVar);
            }
            dsod.bv(f, dxbcVar.a);
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            dxbp dxbpVar2 = (dxbp) bZ3.b;
            dxbc bK = bZ4.bK();
            bK.getClass();
            dxbpVar2.e = bK;
            dxbpVar2.a |= 8;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dwjj dwjjVar = (dwjj) bZ2.b;
            dxbp bK2 = bZ3.bK();
            bK2.getClass();
            dwjjVar.b = bK2;
            dwjjVar.a |= 1;
            dwjj bK3 = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bxmh bxmhVar = (bxmh) bZ.b;
            bK3.getClass();
            bxmhVar.b = bK3;
            int i4 = bxmhVar.a | 1;
            bxmhVar.a = i4;
            String str3 = dnfwVar.b;
            str3.getClass();
            bxmhVar.a = i4 | 2;
            bxmhVar.c = str3;
            F.g(bZ.bK());
        }
        this.e = F.f();
        this.c.c(this.d, this.e, null, null, null);
    }
}
