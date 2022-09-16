package defpackage;

import android.app.Activity;
import com.google.android.apps.gmm.place.deals.webview.DealsWebviewCallbacks;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: beqg  reason: default package */
/* loaded from: classes3.dex */
public final class beqg implements beqf {
    private final gga a;
    private final dxio<bvvw> b;
    private final dxio<afha> c;
    private final dxio<bbut> d;
    private final bvjj e;
    private final gce f;

    public beqg(gga ggaVar, dxio<bvvw> dxioVar, dxio<afha> dxioVar2, dxio<bbut> dxioVar3, bvjj bvjjVar, gce gceVar) {
        this.a = ggaVar;
        this.b = dxioVar;
        this.c = dxioVar2;
        this.d = dxioVar3;
        this.e = bvjjVar;
        this.f = gceVar;
    }

    private static void e(String str) {
        bvoo.j(new bvon("(local-deals) %s", str));
    }

    @Override // defpackage.beqf
    public final void b(dgep dgepVar) {
        dgeo dgeoVar;
        int a = dgeh.a(dgepVar.d);
        if (a != 0 && a == 3) {
            if (dgepVar.b == 4) {
                dgeoVar = (dgeo) dgepVar.c;
            } else {
                dgeoVar = dgeo.c;
            }
            String str = dgeoVar.b;
            if (str.isEmpty()) {
                e("Webview action missing url");
            } else {
                this.b.a().i(str);
            }
        }
    }

    @Override // defpackage.beqf
    public final int d(dgep dgepVar) {
        return c(dgepVar, 0, null, dcdc.e());
    }

    @Override // defpackage.beqf
    @dzsi
    public final CharSequence a(Activity activity, dgep dgepVar) {
        dgek dgekVar;
        int i;
        dgeo dgeoVar;
        int a = dgeh.a(dgepVar.d);
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 != 1) {
            if (i2 == 2) {
                if (dgepVar.b == 4) {
                    dgeoVar = (dgeo) dgepVar.c;
                } else {
                    dgeoVar = dgeo.c;
                }
                i = dgeoVar.a;
            }
            return null;
        }
        if (dgepVar.b == 3) {
            dgekVar = (dgek) dgepVar.c;
        } else {
            dgekVar = dgek.c;
        }
        i = dgekVar.a;
        if ((i & 1) != 0) {
            if ((dgepVar.a & 2) != 0) {
                return dgepVar.e;
            }
            int a2 = dgeh.a(dgepVar.d);
            if (a2 == 0) {
                a2 = 1;
            }
            int i3 = a2 - 1;
            if (i3 != 1 && i3 != 2) {
                return null;
            }
            return activity.getString(R.string.CTA_VIEW_OFFER);
        }
        return null;
    }

    /* JADX WARN: Incorrect return type in method signature: (Ldgep;ILbwrs<Lilo;>;Ldcdc<Ldwfl;>;)Ljava/lang/Object; */
    @Override // defpackage.beqf
    public final int c(dgep dgepVar, @dzsi int i, @dzsi bwrs bwrsVar, dcdc dcdcVar) {
        dgek dgekVar;
        dgek dgekVar2;
        int a = dgeh.a(dgepVar.d);
        if (a == 0) {
            a = 1;
        }
        int i2 = a - 1;
        if (i2 == 1) {
            if (dgepVar.b == 3) {
                dgekVar = (dgek) dgepVar.c;
            } else {
                dgekVar = dgek.c;
            }
            if ((dgekVar.a & 1) == 0) {
                e("External action missing external action data");
                return 3;
            }
            if (dgepVar.b == 3) {
                dgekVar2 = (dgek) dgepVar.c;
            } else {
                dgekVar2 = dgek.c;
            }
            String str = dgekVar2.b;
            afha a2 = this.c.a();
            if (this.f.h()) {
                str = String.format("%s&cs=1", str);
            }
            a2.r(str, 1);
            return 2;
        } else if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    e("Unknown action type");
                    return 3;
                }
                e("Unimplemented CTA type");
                return 3;
            }
            if (dcdcVar.isEmpty()) {
                e("Photo action missing photos");
            } else if (bwrsVar == null) {
                e("Photo action missing placemark");
            } else {
                ckne ckneVar = new ckne(dcdcVar);
                bbtv v = bbty.v();
                v.k(true);
                v.t(true);
                v.b(false);
                this.d.a().H(ckneVar, v.a(), bwrsVar);
                return 2;
            }
            return 3;
        } else if (dgepVar.b == 4) {
            String str2 = ((dgeo) dgepVar.c).b;
            bvvw a3 = this.b.a();
            boolean z = !this.e.m(bvjk.jT, false);
            bvxn bZ = bvxu.A.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bvxu bvxuVar = (bvxu) bZ.b;
            str2.getClass();
            int i3 = bvxuVar.a | 1;
            bvxuVar.a = i3;
            bvxuVar.b = str2;
            int i4 = i3 | 64;
            bvxuVar.a = i4;
            bvxuVar.h = "aGMM.LocalOffers";
            bvxuVar.a = i4 | 512;
            bvxuVar.k = true;
            bvxp f = bvoa.f(ibm.b(), this.a);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bvxu bvxuVar2 = (bvxu) bZ.b;
            f.getClass();
            bvxuVar2.x = f;
            bvxuVar2.a |= 4194304;
            bvxu.d(bvxuVar2);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bvxu.b((bvxu) bZ.b);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bvxu bvxuVar3 = (bvxu) bZ.b;
            int i5 = bvxuVar3.a | 8;
            bvxuVar3.a = i5;
            bvxuVar3.e = true;
            int i6 = i5 | 2048;
            bvxuVar3.a = i6;
            bvxuVar3.m = z;
            bvxuVar3.a = i6 | 32;
            bvxuVar3.g = true;
            dkyw bZ2 = dkyx.f.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dkyx.b((dkyx) bZ2.b);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bvxu bvxuVar4 = (bvxu) bZ.b;
            dkyx bK = bZ2.bK();
            bK.getClass();
            bvxuVar4.j = bK;
            bvxuVar4.a |= 256;
            bvxq bZ3 = bvxt.c.bZ();
            bvxr bZ4 = bvxs.d.bZ();
            if (bZ4.c) {
                bZ4.bF();
                bZ4.c = false;
            }
            bvxs bvxsVar = (bvxs) bZ4.b;
            int i7 = 1 | bvxsVar.a;
            bvxsVar.a = i7;
            bvxsVar.b = "cs";
            bvxsVar.a = i7 | 2;
            bvxsVar.c = "1";
            bvxs bK2 = bZ4.bK();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            bvxt bvxtVar = (bvxt) bZ3.b;
            bK2.getClass();
            bvxtVar.b = bK2;
            bvxtVar.a = 2;
            bvxt bK3 = bZ3.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            bvxu bvxuVar5 = (bvxu) bZ.b;
            bK3.getClass();
            bvxuVar5.w = bK3;
            bvxuVar5.a |= 2097152;
            a3.p(bZ.bK(), new DealsWebviewCallbacks(), dtxu.Q, i);
            return 2;
        } else {
            e("Webview action missing webview action data");
            return 3;
        }
    }
}
