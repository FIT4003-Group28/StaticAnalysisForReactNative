package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cgyg  reason: default package */
/* loaded from: classes4.dex */
public class cgyg implements cgvu {
    private static final dgkw c;
    private static final dgkw d;
    final dnfc a;
    cgvt b;
    private final dglo e;
    private dnfd f;
    private final bmcm g;
    private final Resources h;
    private final String i;
    private final boolean j;
    private cgwf k;

    static {
        dgkv bZ = dgkw.f.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dgkw dgkwVar = (dgkw) bZ.b;
        dgkwVar.a |= 1;
        dgkwVar.b = true;
        c = bZ.bK();
        dgkv bZ2 = dgkw.f.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dgkw dgkwVar2 = (dgkw) bZ2.b;
        dgkwVar2.a |= 1;
        dgkwVar2.b = false;
        d = bZ2.bK();
    }

    public cgyg(dglo dgloVar, dnfd dnfdVar, bmcm bmcmVar, Resources resources, boolean z, String str) {
        dgkw dgkwVar;
        dgkw dgkwVar2;
        dgkw dgkwVar3;
        dnfc bZ = dnfd.d.bZ();
        this.a = bZ;
        this.e = dgloVar;
        this.g = bmcmVar;
        this.j = z;
        this.h = resources;
        this.i = str;
        this.k = cgwf.EDITABLE;
        String str2 = dgloVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnfd dnfdVar2 = (dnfd) bZ.b;
        str2.getClass();
        dnfdVar2.a |= 1;
        dnfdVar2.b = str2;
        if (dnfdVar != null) {
            this.f = dnfdVar;
            dglu dgluVar = dnfdVar.c;
            dgluVar = dgluVar == null ? dglu.e : dgluVar;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnfd dnfdVar3 = (dnfd) bZ.b;
            dgluVar.getClass();
            dnfdVar3.c = dgluVar;
            dnfdVar3.a |= 2;
            dglu dgluVar2 = dnfdVar.c;
            dgluVar2 = dgluVar2 == null ? dglu.e : dgluVar2;
            if (dgluVar2.b == 3) {
                dgkwVar2 = (dgkw) dgluVar2.c;
            } else {
                dgkwVar2 = dgkw.f;
            }
            if ((dgkwVar2.a & 1) == 0) {
                this.b = cgvt.NOT_SURE;
                return;
            }
            dglu dgluVar3 = dnfdVar.c;
            dgluVar3 = dgluVar3 == null ? dglu.e : dgluVar3;
            if (dgluVar3.b == 3) {
                dgkwVar3 = (dgkw) dgluVar3.c;
            } else {
                dgkwVar3 = dgkw.f;
            }
            this.b = dgkwVar3.b ? cgvt.ON : cgvt.OFF;
            return;
        }
        this.f = null;
        dglu dgluVar4 = dgloVar.d;
        dgluVar4 = dgluVar4 == null ? dglu.e : dgluVar4;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dnfd dnfdVar4 = (dnfd) bZ.b;
        dgluVar4.getClass();
        dnfdVar4.c = dgluVar4;
        dnfdVar4.a |= 2;
        dglu dgluVar5 = dgloVar.d;
        if ((dgluVar5 == null ? dglu.e : dgluVar5).b != 3) {
            this.b = cgvt.BLANK;
            return;
        }
        dglu dgluVar6 = dgloVar.d;
        dgluVar6 = dgluVar6 == null ? dglu.e : dgluVar6;
        if (dgluVar6.b == 3) {
            dgkwVar = (dgkw) dgluVar6.c;
        } else {
            dgkwVar = dgkw.f;
        }
        this.b = dgkwVar.b ? cgvt.ON : cgvt.OFF;
    }

    private final String q(String str) {
        return c() + ' ' + str;
    }

    private final cjtd r(ddho ddhoVar) {
        cjta b = cjtd.b();
        b.d = ddhoVar;
        b.g(this.i);
        return b.a();
    }

    private final void s() {
        this.b = cgvt.BLANK;
        dnfc dnfcVar = this.a;
        if (dnfcVar.c) {
            dnfcVar.bF();
            dnfcVar.c = false;
        }
        dnfd dnfdVar = (dnfd) dnfcVar.b;
        dnfd dnfdVar2 = dnfd.d;
        dnfdVar.c = null;
        dnfdVar.a &= -3;
    }

    private final void t() {
        dnfd bK = this.a.bK();
        this.f = bK;
        this.g.RD(bK);
        cqkx.p(this);
    }

    @Override // defpackage.cgvu
    public Boolean a() {
        boolean z = true;
        if (this.j) {
            if (this.k != cgwf.EDITABLE) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        return true;
    }

    @Override // defpackage.cgvu
    public void b(cgwf cgwfVar) {
        this.k = cgwfVar;
        cqkx.p(this);
    }

    @Override // defpackage.cgvu
    public String c() {
        return this.e.c;
    }

    @Override // defpackage.cgvu
    public void d() {
        s();
        b(cgwf.EDITABLE);
        t();
        cqkx.p(this);
    }

    @Override // defpackage.cgvu
    public cqkl e() {
        if (h().booleanValue()) {
            s();
        } else {
            dglt bZ = dglu.e.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dglu dgluVar = (dglu) bZ.b;
            dgluVar.d = 1;
            dgluVar.a = 1 | dgluVar.a;
            dgkw dgkwVar = c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dglu dgluVar2 = (dglu) bZ.b;
            dgkwVar.getClass();
            dgluVar2.c = dgkwVar;
            dgluVar2.b = 3;
            this.b = cgvt.ON;
            dnfc dnfcVar = this.a;
            if (dnfcVar.c) {
                dnfcVar.bF();
                dnfcVar.c = false;
            }
            dnfd dnfdVar = (dnfd) dnfcVar.b;
            dglu bK = bZ.bK();
            dnfd dnfdVar2 = dnfd.d;
            bK.getClass();
            dnfdVar.c = bK;
            dnfdVar.a |= 2;
        }
        t();
        return cqkl.a;
    }

    @Override // defpackage.cgvu
    public cqkl f() {
        if (i().booleanValue()) {
            s();
        } else {
            dglt bZ = dglu.e.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dglu dgluVar = (dglu) bZ.b;
            dgluVar.d = 1;
            dgluVar.a = 1 | dgluVar.a;
            dgkw dgkwVar = d;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dglu dgluVar2 = (dglu) bZ.b;
            dgkwVar.getClass();
            dgluVar2.c = dgkwVar;
            dgluVar2.b = 3;
            this.b = cgvt.OFF;
            dnfc dnfcVar = this.a;
            if (dnfcVar.c) {
                dnfcVar.bF();
                dnfcVar.c = false;
            }
            dnfd dnfdVar = (dnfd) dnfcVar.b;
            dglu bK = bZ.bK();
            dnfd dnfdVar2 = dnfd.d;
            bK.getClass();
            dnfdVar.c = bK;
            dnfdVar.a |= 2;
        }
        t();
        return cqkl.a;
    }

    @Override // defpackage.cgvu
    public cqkl g() {
        if (j().booleanValue()) {
            s();
        } else {
            dglt bZ = dglu.e.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dglu dgluVar = (dglu) bZ.b;
            dgluVar.d = 1;
            dgluVar.a = 1 | dgluVar.a;
            if (dgluVar.b == 3) {
                dgluVar.b = 0;
                dgluVar.c = null;
            }
            this.b = cgvt.NOT_SURE;
            dnfc dnfcVar = this.a;
            if (dnfcVar.c) {
                dnfcVar.bF();
                dnfcVar.c = false;
            }
            dnfd dnfdVar = (dnfd) dnfcVar.b;
            dglu bK = bZ.bK();
            dnfd dnfdVar2 = dnfd.d;
            bK.getClass();
            dnfdVar.c = bK;
            dnfdVar.a |= 2;
        }
        t();
        return cqkl.a;
    }

    @Override // defpackage.cgvu
    public Boolean h() {
        return Boolean.valueOf(this.b == cgvt.ON);
    }

    @Override // defpackage.cgvu
    public Boolean i() {
        return Boolean.valueOf(this.b == cgvt.OFF);
    }

    @Override // defpackage.cgvu
    public Boolean j() {
        return Boolean.valueOf(this.b == cgvt.NOT_SURE);
    }

    @Override // defpackage.cgvu
    public CharSequence k() {
        String q = q(this.h.getString(R.string.FACTUAL_MODERATION_VOTE_YES));
        return h().booleanValue() ? this.h.getString(R.string.UGC_TASKS_SCALABLE_ATTRIBUTES_BUTTON_SELECTED, q) : q;
    }

    @Override // defpackage.cgvu
    public CharSequence l() {
        String q = q(this.h.getString(R.string.FACTUAL_MODERATION_VOTE_NO));
        return i().booleanValue() ? this.h.getString(R.string.UGC_TASKS_SCALABLE_ATTRIBUTES_BUTTON_SELECTED, q) : q;
    }

    @Override // defpackage.cgvu
    public CharSequence m() {
        String q = q(this.h.getString(R.string.FACTUAL_MODERATION_VOTE_NOT_SURE));
        return j().booleanValue() ? this.h.getString(R.string.UGC_TASKS_SCALABLE_ATTRIBUTES_BUTTON_SELECTED, q) : q;
    }

    @Override // defpackage.cgvu
    public cjtd n() {
        return r(dtyd.aA);
    }

    @Override // defpackage.cgvu
    public cjtd o() {
        return r(dtyd.ay);
    }

    @Override // defpackage.cgvu
    public cjtd p() {
        return r(dtyd.az);
    }
}
