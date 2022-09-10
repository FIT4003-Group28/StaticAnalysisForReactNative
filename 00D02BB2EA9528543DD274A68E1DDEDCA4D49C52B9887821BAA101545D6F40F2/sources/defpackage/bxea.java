package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.ar.core.ImageMetadata;
import java.util.List;
/* compiled from: PG */
/* renamed from: bxea  reason: default package */
/* loaded from: classes4.dex */
final class bxea extends bxep<dwjn, dwjp> {
    private static final dcqe k = dcqe.c("bxea");
    public final dwjn a;

    public bxea(bxla bxlaVar, bxkz bxkzVar, dhjx dhjxVar, @dzsi dovx dovxVar, boolean z, bxkx bxkxVar, cqat cqatVar, @dzsi GmmLocation gmmLocation, int i, dwjm dwjmVar, boolean z2, boolean z3, boolean z4, boolean z5, btvo btvoVar) {
        super(dunt.TACTILE_SUGGEST_REQUEST, bxlaVar, bxkzVar, bxkxVar, cqatVar);
        dwjk bZ = dwjn.p.bZ();
        String a = bxkzVar.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwjn dwjnVar = (dwjn) bZ.b;
        a.getClass();
        dwjnVar.a |= 1;
        dwjnVar.b = a;
        int b = bxkzVar.b();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwjn dwjnVar2 = (dwjn) bZ.b;
        int i2 = dwjnVar2.a | 4;
        dwjnVar2.a = i2;
        dwjnVar2.d = b;
        dhjxVar.getClass();
        dwjnVar2.e = dhjxVar;
        int i3 = i2 | 8;
        dwjnVar2.a = i3;
        int i4 = i3 | 2;
        dwjnVar2.a = i4;
        dwjnVar2.c = z4;
        dwjnVar2.a = i4 | 32768;
        dwjnVar2.l = z3;
        if (btvoVar.getSuggestParameters().a && z2) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwjn dwjnVar3 = (dwjn) bZ.b;
            dwjnVar3.a |= 4096;
            dwjnVar3.j = true;
        }
        if (dovxVar != null) {
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwjn dwjnVar4 = (dwjn) bZ.b;
            dovxVar.getClass();
            dwjnVar4.f = dovxVar;
            dwjnVar4.a |= 16;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwjn dwjnVar5 = (dwjn) bZ.b;
        dwjnVar5.a |= 2048;
        dwjnVar5.i = z;
        if (gmmLocation != null && gmmLocation.a() != null) {
            dtaq a2 = gmmLocation.a();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwjn dwjnVar6 = (dwjn) bZ.b;
            a2.getClass();
            dwjnVar6.h = a2;
            dwjnVar6.a |= 256;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwjn dwjnVar7 = (dwjn) bZ.b;
        int i5 = i - 1;
        if (i != 0) {
            dwjnVar7.g = i5;
            int i6 = dwjnVar7.a | 128;
            dwjnVar7.a = i6;
            dwjnVar7.k = dwjmVar.d;
            int i7 = i6 | 16384;
            dwjnVar7.a = i7;
            dwjnVar7.a = i7 | 262144;
            dwjnVar7.m = true;
            int a3 = dvtz.a(btvoVar.getSuggestParameters().d);
            if (a3 != 0 && a3 != 1) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dwjn dwjnVar8 = (dwjn) bZ.b;
                dwjnVar8.a |= ImageMetadata.LENS_APERTURE;
                dwjnVar8.n = true;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwjn dwjnVar9 = (dwjn) bZ.b;
            dwjnVar9.a |= 16777216;
            dwjnVar9.o = z5;
            this.a = bZ.bK();
            return;
        }
        throw null;
    }

    @dzsi
    public final synchronized void b(dwjp dwjpVar, boolean z, @dzsi List<bxmg> list) {
        boolean z2;
        drgr drgrVar = dwjpVar.f;
        if (drgrVar == null) {
            drgrVar = drgr.d;
        }
        this.f = dcdc.r(drgrVar.c);
        drgv drgvVar = dwjpVar.g;
        if (drgvVar == null) {
            drgvVar = drgv.c;
        }
        this.g = drgvVar;
        dccx F = dcdc.F();
        if ((dwjpVar.a & 1) != 0) {
            dwjh dwjhVar = dwjpVar.b;
            if (dwjhVar == null) {
                dwjhVar = dwjh.c;
            }
            int size = dwjhVar.a.size();
            if (size != list.size()) {
                bvoo.h("Different number of suggestions (%d) and metrics (%d)!", Integer.valueOf(size), Integer.valueOf(list.size()));
                z2 = false;
            } else {
                z2 = true;
            }
            for (int i = 0; i < size; i++) {
                dwjj dwjjVar = dwjhVar.a.get(i);
                if ((dwjjVar.a & 1) != 0) {
                    dsqp dsqpVar = (dsqp) dwjjVar.cu(5);
                    dsqpVar.bC(dwjjVar);
                    dwji dwjiVar = (dwji) dsqpVar;
                    dxbp dxbpVar = dwjjVar.b;
                    if (dxbpVar == null) {
                        dxbpVar = dxbp.x;
                    }
                    dsqp dsqpVar2 = (dsqp) dxbpVar.cu(5);
                    dsqpVar2.bC(dxbpVar);
                    dxbe dxbeVar = (dxbe) dsqpVar2;
                    String str = dwjhVar.b;
                    if (dxbeVar.c) {
                        dxbeVar.bF();
                        dxbeVar.c = false;
                    }
                    dxbp dxbpVar2 = (dxbp) dxbeVar.b;
                    str.getClass();
                    dxbpVar2.a |= 2097152;
                    dxbpVar2.o = str;
                    if (dwjiVar.c) {
                        dwjiVar.bF();
                        dwjiVar.c = false;
                    }
                    dwjj dwjjVar2 = (dwjj) dwjiVar.b;
                    dxbp bK = dxbeVar.bK();
                    bK.getClass();
                    dwjjVar2.b = bK;
                    dwjjVar2.a |= 1;
                    dwjj bK2 = dwjiVar.bK();
                    bxme bZ = bxmh.f.bZ();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    bxmh bxmhVar = (bxmh) bZ.b;
                    bK2.getClass();
                    bxmhVar.b = bK2;
                    int i2 = bxmhVar.a | 1;
                    bxmhVar.a = i2;
                    drgrVar.getClass();
                    bxmhVar.d = drgrVar;
                    bxmhVar.a = i2 | 16;
                    if (z2) {
                        bxmg bxmgVar = list.get(i);
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        bxmh bxmhVar2 = (bxmh) bZ.b;
                        bxmhVar2.e = bxmgVar.r;
                        bxmhVar2.a |= 32;
                    }
                    F.g(bZ.bK());
                }
            }
        }
        this.e = F.f();
        this.j = (dwjpVar.a & 2) != 0 ? dwjpVar.c : -1;
        if (!z) {
            this.c.f();
            return;
        }
        dspd dspdVar = dwjpVar.d;
        ddfz ddfzVar = dwjpVar.e;
        if (ddfzVar == null) {
            ddfzVar = ddfz.e;
        }
        this.c.c(this.d, this.e, dspdVar, ddfzVar, this.g);
    }
}
