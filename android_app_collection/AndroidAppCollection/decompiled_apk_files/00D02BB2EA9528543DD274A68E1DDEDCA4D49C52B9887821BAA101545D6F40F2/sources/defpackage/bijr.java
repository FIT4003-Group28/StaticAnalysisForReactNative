package defpackage;

import android.widget.Toast;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bijr  reason: default package */
/* loaded from: classes3.dex */
class bijr implements jad {
    final /* synthetic */ bijs a;

    public bijr(bijs bijsVar) {
        this.a = bijsVar;
    }

    @Override // defpackage.jad
    public Boolean a() {
        return Boolean.valueOf(this.a.j() != null);
    }

    @Override // defpackage.jad
    public cqkl c() {
        dqba j = this.a.j();
        if (j == null) {
            return cqkl.a;
        }
        dqdk dqdkVar = j.b;
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
        if ((dnpqVar.a & 2) == 0) {
            Toast.makeText(this.a.e, (int) R.string.UNKNOWN_ERROR, 0).show();
            return cqkl.a;
        }
        bvxn bZ = bvxu.A.bZ();
        String str = dnpqVar.c;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar = (bvxu) bZ.b;
        str.getClass();
        int i = bvxuVar.a | 1;
        bvxuVar.a = i;
        bvxuVar.b = str;
        bvxuVar.a = i | 32;
        bvxuVar.g = true;
        bvxu.b(bvxuVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar2 = (bvxu) bZ.b;
        bvxuVar2.a |= 8;
        bvxuVar2.e = true;
        bvxp f = bvoa.f(ibm.b(), this.a.e);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar3 = (bvxu) bZ.b;
        f.getClass();
        bvxuVar3.x = f;
        bvxuVar3.a |= 4194304;
        bvxp f2 = bvoa.f(ibm.b(), this.a.e);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar4 = (bvxu) bZ.b;
        f2.getClass();
        bvxuVar4.y = f2;
        bvxuVar4.a |= 8388608;
        bvxu.e(bvxuVar4);
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
        bvxu bvxuVar5 = (bvxu) bZ.b;
        dkyx bK = bZ2.bK();
        bK.getClass();
        bvxuVar5.j = bK;
        bvxuVar5.a |= 256;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar6 = (bvxu) bZ.b;
        bvxuVar6.a |= 512;
        bvxuVar6.k = true;
        bvxu.c(bvxuVar6);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bvxu bvxuVar7 = (bvxu) bZ.b;
        bvxuVar7.a |= 2048;
        bvxuVar7.m = true;
        this.a.a.a().k(bZ.bK(), null, this.a.c ? dtxy.dB : dtxy.kM);
        return cqkl.a;
    }

    @Override // defpackage.jad
    public cjtd d() {
        return this.a.b;
    }

    @Override // defpackage.jad
    public CharSequence e() {
        dqba j = this.a.j();
        return j != null ? j.c : "";
    }

    @Override // defpackage.jad
    public CharSequence f() {
        return "";
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
    public cqtd i() {
        return null;
    }
}
