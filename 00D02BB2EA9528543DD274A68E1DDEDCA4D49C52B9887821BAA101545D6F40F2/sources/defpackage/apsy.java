package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: apsy  reason: default package */
/* loaded from: classes2.dex */
public final class apsy extends itb implements apun {
    static final dkyx a;
    private final bvvw b;
    private final Activity c;
    private final btvo d;

    static {
        dkyw bZ = dkyx.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dkyx.b((dkyx) bZ.b);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dkyx.d((dkyx) bZ.b);
        a = bZ.bK();
    }

    public apsy(bvvw bvvwVar, Activity activity, btvo btvoVar) {
        this.b = bvvwVar;
        this.c = activity;
        this.d = btvoVar;
    }

    @Override // defpackage.apun
    public final void e(ilo iloVar, apum apumVar) {
        dgda dgdaVar;
        dkyx dkyxVar;
        dvwi dvwiVar = iloVar.bf().v;
        if (dvwiVar == null) {
            dvwiVar = dvwi.m;
        }
        dgde dgdeVar = dvwiVar.l;
        if (dgdeVar == null) {
            dgdeVar = dgde.f;
        }
        dgcu dgcuVar = dgdeVar.e;
        if (dgcuVar == null) {
            dgcuVar = dgcu.k;
        }
        apum apumVar2 = apum.MAIN;
        switch (apumVar.ordinal()) {
            case 1:
                dgdaVar = dgcuVar.b;
                if (dgdaVar == null) {
                    dgdaVar = dgda.c;
                    break;
                }
                break;
            case 2:
                dgdaVar = dgcuVar.c;
                if (dgdaVar == null) {
                    dgdaVar = dgda.c;
                    break;
                }
                break;
            case 3:
                dgdaVar = dgcuVar.d;
                if (dgdaVar == null) {
                    dgdaVar = dgda.c;
                    break;
                }
                break;
            case 4:
                dgdaVar = dgcuVar.e;
                if (dgdaVar == null) {
                    dgdaVar = dgda.c;
                    break;
                }
                break;
            case 5:
                dgdaVar = dgcuVar.f;
                if (dgdaVar == null) {
                    dgdaVar = dgda.c;
                    break;
                }
                break;
            case 6:
                dgdaVar = dgcuVar.g;
                if (dgdaVar == null) {
                    dgdaVar = dgda.c;
                    break;
                }
                break;
            case 7:
                dgdaVar = dgcuVar.h;
                if (dgdaVar == null) {
                    dgdaVar = dgda.c;
                    break;
                }
                break;
            case 8:
                dgdaVar = dgcuVar.i;
                if (dgdaVar == null) {
                    dgdaVar = dgda.c;
                    break;
                }
                break;
            case 9:
                dgdaVar = dgcuVar.j;
                if (dgdaVar == null) {
                    dgdaVar = dgda.c;
                    break;
                }
                break;
            default:
                dgdaVar = dgcuVar.a;
                if (dgdaVar == null) {
                    dgdaVar = dgda.c;
                    break;
                }
                break;
        }
        if ((this.d.getMerchantExperienceParameters().a & 4096) != 0) {
            dkyxVar = this.d.getMerchantExperienceParameters().h;
            if (dkyxVar == null) {
                dkyxVar = dkyx.f;
            }
        } else {
            dkyxVar = a;
        }
        bvxn bZ = bvxu.A.bZ();
        dgbo dgboVar = dgdaVar.a;
        if (dgboVar == null) {
            dgboVar = dgbo.e;
        }
        String str = dgboVar.c;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar = (bvxu) bZ.b;
        str.getClass();
        int i = bvxuVar.a | 1;
        bvxuVar.a = i;
        bvxuVar.b = str;
        dkyxVar.getClass();
        bvxuVar.j = dkyxVar;
        bvxuVar.a = i | 256;
        bvxu.b(bvxuVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar2 = (bvxu) bZ.b;
        bvxuVar2.a |= 512;
        bvxuVar2.k = true;
        bvxp f = bvoa.f(ibm.b(), this.c);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar3 = (bvxu) bZ.b;
        f.getClass();
        bvxuVar3.x = f;
        bvxuVar3.a |= 4194304;
        bvxq bZ2 = bvxt.c.bZ();
        bvxr bZ3 = bvxs.d.bZ();
        dgcz dgczVar = dgdaVar.b;
        if (dgczVar == null) {
            dgczVar = dgcz.c;
        }
        String str2 = dgczVar.a;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        bvxs bvxsVar = (bvxs) bZ3.b;
        str2.getClass();
        bvxsVar.a |= 1;
        bvxsVar.b = str2;
        dgcz dgczVar2 = dgdaVar.b;
        if (dgczVar2 == null) {
            dgczVar2 = dgcz.c;
        }
        String str3 = dgczVar2.b;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        bvxs bvxsVar2 = (bvxs) bZ3.b;
        str3.getClass();
        bvxsVar2.a |= 2;
        bvxsVar2.c = str3;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        bvxt bvxtVar = (bvxt) bZ2.b;
        bvxs bK = bZ3.bK();
        bK.getClass();
        bvxtVar.b = bK;
        bvxtVar.a = 2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar4 = (bvxu) bZ.b;
        bvxt bK2 = bZ2.bK();
        bK2.getClass();
        bvxuVar4.w = bK2;
        bvxuVar4.a |= 2097152;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar5 = (bvxu) bZ.b;
        int i2 = bvxuVar5.a | 32;
        bvxuVar5.a = i2;
        bvxuVar5.g = true;
        int i3 = i2 | 4;
        bvxuVar5.a = i3;
        bvxuVar5.d = true;
        bvxuVar5.a = i3 | 2048;
        bvxuVar5.m = true;
        bvxu.d(bvxuVar5);
        bvvr e = bvvs.e();
        e.b(bZ.bK());
        this.b.r(e.a(), dtxv.aW);
    }
}
