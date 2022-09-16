package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adip  reason: default package */
/* loaded from: classes2.dex */
public class adip implements jad {
    final /* synthetic */ dqba a;
    final /* synthetic */ adiq b;

    public adip(adiq adiqVar, dqba dqbaVar) {
        this.b = adiqVar;
        this.a = dqbaVar;
    }

    @Override // defpackage.jad
    public Boolean a() {
        return true;
    }

    @Override // defpackage.jad
    public cqkl c() {
        ddho ddhoVar;
        dqaz b = dqaz.b(this.a.e);
        if (b == null) {
            b = dqaz.UNKNOWN_LINK_TYPE;
        }
        if (b == dqaz.DIRECTIONS) {
            adiq adiqVar = this.b;
            dqbe dqbeVar = adiqVar.f;
            if (dqbeVar == null) {
                Toast.makeText(adiqVar.a, (int) R.string.UNKNOWN_ERROR, 0).show();
                return cqkl.a;
            }
            int i = dqbeVar.a;
            if ((i & 256) == 0 || (i & 512) == 0) {
                Toast.makeText(adiqVar.a, (int) R.string.UNKNOWN_ERROR, 0).show();
                return cqkl.a;
            }
            qbt a = adiqVar.c.a();
            qcw x = qcx.x();
            x.r(amvh.i(this.b.a));
            amvg P = amvh.P();
            P.a = dpjs.ENTITY_TYPE_DEFAULT;
            P.b = dqbeVar.j;
            dpsn dpsnVar = dqbeVar.i;
            if (dpsnVar == null) {
                dpsnVar = dpsn.d;
            }
            P.c = akqi.j(dpsnVar);
            x.u(P.a());
            dwal bZ = dwao.R.bZ();
            dphm bZ2 = dphq.m.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dphq dphqVar = (dphq) bZ2.b;
            dphqVar.c = 2;
            dphqVar.a = 2 | dphqVar.a;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dwao dwaoVar = (dwao) bZ.b;
            dphq bK = bZ2.bK();
            bK.getClass();
            dwaoVar.e = bK;
            dwaoVar.a = 1 | dwaoVar.a;
            x.w(bZ.bK());
            a.m(x.a());
            return cqkl.a;
        }
        dqdk dqdkVar = this.a.b;
        if (dqdkVar == null) {
            dqdkVar = dqdk.e;
        }
        dqmk dqmkVar = dqdkVar.c;
        if (dqmkVar == null) {
            dqmkVar = dqmk.c;
        }
        dnpq dnpqVar = dqmkVar.b;
        if (dnpqVar == null) {
            dnpqVar = dnpq.g;
        }
        dqaz b2 = dqaz.b(this.a.e);
        if (b2 == null) {
            b2 = dqaz.UNKNOWN_LINK_TYPE;
        }
        int ordinal = b2.ordinal();
        if (ordinal == 1) {
            ddhoVar = dtxo.cw;
        } else if (ordinal == 3) {
            ddhoVar = dtxo.cz;
        } else if (ordinal != 5) {
            ddhoVar = new dtxi(0);
        } else {
            ddhoVar = dtxo.cu;
        }
        if ((2 & dnpqVar.a) == 0) {
            Toast.makeText(this.b.a, (int) R.string.UNKNOWN_ERROR, 0).show();
            return cqkl.a;
        }
        bvxn bZ3 = bvxu.A.bZ();
        String str = dnpqVar.c;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        bvxu bvxuVar = (bvxu) bZ3.b;
        str.getClass();
        int i2 = bvxuVar.a | 1;
        bvxuVar.a = i2;
        bvxuVar.b = str;
        bvxuVar.a = i2 | 32;
        bvxuVar.g = true;
        bvxu.b(bvxuVar);
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        bvxu bvxuVar2 = (bvxu) bZ3.b;
        bvxuVar2.a |= 8;
        bvxuVar2.e = true;
        bvxp f = bvoa.f(ibm.b(), this.b.a);
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        bvxu bvxuVar3 = (bvxu) bZ3.b;
        f.getClass();
        bvxuVar3.x = f;
        bvxuVar3.a |= 4194304;
        bvxp f2 = bvoa.f(ibm.b(), this.b.a);
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        bvxu bvxuVar4 = (bvxu) bZ3.b;
        f2.getClass();
        bvxuVar4.y = f2;
        bvxuVar4.a |= 8388608;
        bvxu.e(bvxuVar4);
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        bvxu.d((bvxu) bZ3.b);
        dkyw bZ4 = dkyx.f.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dkyx.b((dkyx) bZ4.b);
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dkyx.c((dkyx) bZ4.b);
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        bvxu bvxuVar5 = (bvxu) bZ3.b;
        dkyx bK2 = bZ4.bK();
        bK2.getClass();
        bvxuVar5.j = bK2;
        bvxuVar5.a |= 256;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        bvxu bvxuVar6 = (bvxu) bZ3.b;
        bvxuVar6.a |= 512;
        bvxuVar6.k = true;
        bvxu.c(bvxuVar6);
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        bvxu bvxuVar7 = (bvxu) bZ3.b;
        bvxuVar7.a |= 2048;
        bvxuVar7.m = true;
        this.b.d.a().k(bZ3.bK(), null, ddhoVar);
        return cqkl.a;
    }

    @Override // defpackage.jad
    public cjtd d() {
        dqaz dqazVar = dqaz.UNKNOWN_LINK_TYPE;
        dqaz b = dqaz.b(this.a.e);
        if (b == null) {
            b = dqaz.UNKNOWN_LINK_TYPE;
        }
        int ordinal = b.ordinal();
        if (ordinal == 1) {
            cjta b2 = cjtd.b();
            b2.d = dtxo.cv;
            return b2.a();
        } else if (ordinal == 2) {
            cjta b3 = cjtd.b();
            b3.d = dtxo.cx;
            return b3.a();
        } else if (ordinal == 3) {
            cjta b4 = cjtd.b();
            b4.d = dtxo.cy;
            return b4.a();
        } else if (ordinal == 5) {
            cjta b5 = cjtd.b();
            b5.d = dtxo.ct;
            return b5.a();
        } else {
            return cjtd.b;
        }
    }

    @Override // defpackage.jad
    public CharSequence e() {
        return this.a.c;
    }

    @Override // defpackage.jad
    public CharSequence f() {
        dqba dqbaVar = this.a;
        return (dqbaVar.a & 4) != 0 ? dqbaVar.d : dqbaVar.c;
    }

    @Override // defpackage.jad
    public cqkl g(cjqm cjqmVar) {
        return jac.b(this);
    }

    @Override // defpackage.jad
    public Boolean h() {
        return jac.a();
    }

    @Override // defpackage.jad
    @dzsi
    public cqtd i() {
        dqaz dqazVar = dqaz.UNKNOWN_LINK_TYPE;
        dqaz b = dqaz.b(this.a.e);
        if (b == null) {
            b = dqaz.UNKNOWN_LINK_TYPE;
        }
        int ordinal = b.ordinal();
        if (ordinal != 2) {
            if (ordinal == 3) {
                return cqrt.g(2131231604, ibm.x());
            }
            if (ordinal == 5) {
                return cqrt.g(2131232707, ibm.x());
            }
            return cqrt.g(2131232723, ibm.x());
        }
        return cqrt.g(2131231604, ibm.x());
    }
}
