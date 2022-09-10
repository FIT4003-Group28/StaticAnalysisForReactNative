package defpackage;

import android.widget.Toast;
import com.google.android.apps.gmm.base.webcontent.WebContentWebViewCallbacks;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: biwv  reason: default package */
/* loaded from: classes3.dex */
public class biwv implements biwg, bega {
    private static final Integer b = 5;
    private final ff c;
    private final btvo d;
    private final dxio<bvvw> e;
    @dzsi
    private ilo f;
    private cjtd a = cjtd.b;
    private dbsg<bvxh> g = dbpy.a;

    public biwv(ff ffVar, btvo btvoVar, dxio<bvvw> dxioVar) {
        this.c = ffVar;
        this.d = btvoVar;
        this.e = dxioVar;
    }

    private final boolean n() {
        return this.d.getPlaceSheetParameters().b().b;
    }

    @Override // defpackage.biwg
    public Boolean a() {
        boolean z = true;
        if (w().booleanValue() && !n()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.biwg
    public Boolean b() {
        return false;
    }

    @Override // defpackage.biwg
    public cqkl c() {
        return cqkl.a;
    }

    @Override // defpackage.biwg
    public cqtd d() {
        return cqrt.g(2131232326, ibm.w());
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return true;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        ilo iloVar = this.f;
        if (iloVar != null) {
            dvxe dvxeVar = iloVar.bf().z;
            if (dvxeVar == null) {
                dvxeVar = dvxe.d;
            }
            if (dvxeVar.b.isEmpty() || !this.g.a()) {
                Toast.makeText(this.c, (int) R.string.UNKNOWN_ERROR, 0).show();
            } else {
                this.e.a().q(this.g.b(), dtxr.e);
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.biwg
    @dzsi
    public jic g() {
        return null;
    }

    @Override // defpackage.biwg
    public CharSequence h() {
        return this.c.getString(R.string.HEALTH_INSURANCE_CHECK_INFO);
    }

    @Override // defpackage.biwg
    public Integer i() {
        return b;
    }

    @Override // defpackage.biwg
    public dcdc<biwf> j() {
        return dcdc.e();
    }

    @Override // defpackage.biwg
    public CharSequence k() {
        return this.c.getString(R.string.HEALTH_INSURANCE_CHECK_INFO_DESCRIPTION);
    }

    @Override // defpackage.biwg
    public Boolean l() {
        return false;
    }

    @Override // defpackage.biwg
    public cjtd m() {
        return this.a;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        ddhj ddhjVar;
        ilo c = bwrsVar.c();
        dbsk.s(c);
        this.f = c;
        dbsk.s(c);
        if ((c.bf().a & 268435456) != 0) {
            ilo iloVar = this.f;
            dbsk.s(iloVar);
            dvxe dvxeVar = iloVar.bf().z;
            if (dvxeVar == null) {
                dvxeVar = dvxe.d;
            }
            ilo iloVar2 = this.f;
            dbsk.s(iloVar2);
            cjta c2 = cjtd.c(iloVar2.bZ());
            c2.d = dtxr.d;
            if ((dvxeVar.a & 2) != 0) {
                c2.g(dvxeVar.c);
            }
            if (n()) {
                ddhjVar = ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL;
            } else {
                ddhjVar = ddhj.VISIBILITY_VISIBLE;
            }
            c2.w(ddhjVar);
            this.a = c2.a();
            String str = dvxeVar.b;
            ilo iloVar3 = this.f;
            dbsk.s(iloVar3);
            String n = iloVar3.n();
            if (str.isEmpty()) {
                return;
            }
            try {
                bvvw a = this.e.a();
                bvxn bZ = bvxu.A.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                bvxu bvxuVar = (bvxu) bZ.b;
                str.getClass();
                int i = bvxuVar.a | 1;
                bvxuVar.a = i;
                bvxuVar.b = str;
                int i2 = i | 2;
                bvxuVar.a = i2;
                bvxuVar.c = false;
                int i3 = i2 | 4;
                bvxuVar.a = i3;
                bvxuVar.d = true;
                bvxuVar.a = i3 | 32;
                bvxuVar.g = true;
                bvxu.b(bvxuVar);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                bvxu bvxuVar2 = (bvxu) bZ.b;
                int i4 = bvxuVar2.a | 8;
                bvxuVar2.a = i4;
                bvxuVar2.e = true;
                int i5 = i4 | 16;
                bvxuVar2.a = i5;
                bvxuVar2.f = 1;
                bvxuVar2.a = i5 | 512;
                bvxuVar2.k = true;
                bvxu.c(bvxuVar2);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                bvxu.d((bvxu) bZ.b);
                dkyw bZ2 = dkyx.f.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dkyx.b((dkyx) bZ2.b);
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dkyx.c((dkyx) bZ2.b);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                bvxu bvxuVar3 = (bvxu) bZ.b;
                dkyx bK = bZ2.bK();
                bK.getClass();
                bvxuVar3.j = bK;
                bvxuVar3.a |= 256;
                bvxp f = bvoa.f(ibm.b(), this.c);
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                bvxu bvxuVar4 = (bvxu) bZ.b;
                f.getClass();
                bvxuVar4.x = f;
                bvxuVar4.a |= 4194304;
                bvxj bZ3 = bvxm.e.bZ();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                bvxm bvxmVar = (bvxm) bZ3.b;
                n.getClass();
                bvxmVar.a |= 1;
                bvxmVar.b = n;
                bvxm bvxmVar2 = (bvxm) bZ3.b;
                bvxmVar2.c = 2;
                bvxmVar2.a = 2 | bvxmVar2.a;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                bvxu bvxuVar5 = (bvxu) bZ.b;
                bvxm bK2 = bZ3.bK();
                bK2.getClass();
                bvxuVar5.t = bK2;
                bvxuVar5.a |= 262144;
                this.g = dbsg.j(a.l(bZ.bK(), new WebContentWebViewCallbacks(), true));
            } catch (NullPointerException unused) {
            }
        }
    }

    @Override // defpackage.bega
    public void u() {
        this.f = null;
        this.a = cjtd.b;
    }

    @Override // defpackage.bega
    public Boolean w() {
        ilo iloVar = this.f;
        boolean z = false;
        if (iloVar != null) {
            dvxh dvxhVar = iloVar.h().z;
            if (dvxhVar == null) {
                dvxhVar = dvxh.B;
            }
            if ((dvxhVar.a & 268435456) != 0) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
