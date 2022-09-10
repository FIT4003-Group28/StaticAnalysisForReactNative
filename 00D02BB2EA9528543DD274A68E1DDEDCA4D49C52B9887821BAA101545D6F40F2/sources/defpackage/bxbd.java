package defpackage;

import android.graphics.Matrix;
/* compiled from: PG */
/* renamed from: bxbd  reason: default package */
/* loaded from: classes4.dex */
public class bxbd implements bxaz {
    @dzsi
    ilo a;
    @dzsi
    dwfl b;
    @dzsi
    jic c;
    private final bwsh d;
    private final dxio<bwuy> f;
    private final ddho i;
    private final boolean j;
    @dzsi
    private cjtd k;
    private final Matrix e = new Matrix();
    private final bxbc g = new bxbc(this);
    private float l = 1.0f;
    private float m = 0.0f;
    private final bxbb h = new bxbb();

    public bxbd(bwsh bwshVar, btvo btvoVar, dxio<bwuy> dxioVar, ddho ddhoVar) {
        this.f = dxioVar;
        this.j = btvoVar.getPlaceSheetParameters().a();
        this.d = bwshVar;
        this.i = ddhoVar;
    }

    @dzsi
    private final dwfl o(@dzsi ilo iloVar, boolean z) {
        if (iloVar != null && (!z || iloVar.f)) {
            dvxn aC = iloVar.aC();
            if (aC != null) {
                dwfl dwflVar = aC.b;
                if (dwflVar == null) {
                    dwflVar = dwfl.w;
                }
                if (!dwflVar.h.isEmpty()) {
                    dwfl dwflVar2 = aC.b;
                    return dwflVar2 == null ? dwfl.w : dwflVar2;
                }
            }
            dvxn aD = iloVar.aD();
            if (aD != null) {
                dwfl dwflVar3 = aD.b;
                if (dwflVar3 == null) {
                    dwflVar3 = dwfl.w;
                }
                if (!dwflVar3.h.isEmpty()) {
                    dwfl dwflVar4 = aD.b;
                    return dwflVar4 == null ? dwfl.w : dwflVar4;
                }
            }
            dwgn bF = iloVar.bF();
            if (bF == null || bF.a.size() <= 0 || bF.a.get(0).h.isEmpty() || !cknv.f(bF.a.get(0))) {
                for (dwfl dwflVar5 : iloVar.aE()) {
                    if (cknv.f(dwflVar5) && !dwflVar5.h.isEmpty()) {
                        return dwflVar5;
                    }
                }
                akqq aj = iloVar.aj();
                if (this.j && aj != null) {
                    this.f.a().c(aj, false, new bxba(this, iloVar));
                }
            } else {
                return bF.a.get(0);
            }
        }
        return null;
    }

    @Override // defpackage.bxaz
    @dzsi
    public jic a() {
        return this.c;
    }

    @Override // defpackage.bxaz
    @dzsi
    public cjtd b() {
        return this.k;
    }

    @Override // defpackage.bxaz
    public cqkl c() {
        dwfl dwflVar = this.b;
        if (dwflVar != null && this.l > 0.5f) {
            this.d.e(dwflVar, null, this.a);
        }
        return cqkl.a;
    }

    @Override // defpackage.bxaz
    public Boolean d() {
        boolean z = false;
        if (this.b != null && this.h.a().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bxaz
    public Boolean e() {
        return false;
    }

    @Override // defpackage.bxaz
    public Matrix f() {
        return this.e;
    }

    @Override // defpackage.bxaz
    public float g() {
        return this.l;
    }

    @Override // defpackage.bxaz
    public float h() {
        float f;
        float f2;
        float f3 = this.m;
        if (f3 > 0.5f) {
            f = this.l * 5.0f;
            f2 = 0.2f - (1.0f - f3);
        } else {
            f = this.l * 5.0f;
            f2 = 0.2f - f3;
        }
        return f * Math.max(f2, 0.0f);
    }

    @Override // defpackage.bxaz
    public cqrp i() {
        return cqrp.d(14.0d);
    }

    @Override // defpackage.bxaz
    public cqrp j() {
        return cqrp.d(14.0d);
    }

    @Override // defpackage.bxaz
    public bxay k() {
        return this.h;
    }

    public void l(@dzsi ilo iloVar) {
        this.a = iloVar;
        m(iloVar, o(iloVar, true));
    }

    public final void m(@dzsi ilo iloVar, @dzsi dwfl dwflVar) {
        this.b = dwflVar;
        jic jicVar = this.c;
        if (jicVar != null) {
            jicVar.b();
        }
        if (dwflVar == null) {
            n(false);
            this.c = null;
            this.k = null;
            return;
        }
        this.c = new bxbf(dwflVar.h, jfv.b(dwflVar), this.g);
        ddes bZ = ddet.D.bZ();
        ddcx bZ2 = ddcy.d.bZ();
        String str = dwflVar.d;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        ddcy ddcyVar = (ddcy) bZ2.b;
        str.getClass();
        ddcyVar.a |= 2;
        ddcyVar.c = str;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        ddet ddetVar = (ddet) bZ.b;
        ddcy bK = bZ2.bK();
        bK.getClass();
        ddetVar.k = bK;
        ddetVar.a |= 256;
        if (iloVar != null) {
            ddeo bZ3 = ddep.f.bZ();
            dtbk g = iloVar.ai().g();
            if (bZ3.c) {
                bZ3.bF();
                bZ3.c = false;
            }
            ddep ddepVar = (ddep) bZ3.b;
            g.getClass();
            ddepVar.b = g;
            ddepVar.a |= 1;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddet ddetVar2 = (ddet) bZ.b;
            ddep bK2 = bZ3.bK();
            bK2.getClass();
            ddetVar2.c = bK2;
            ddetVar2.a |= 1;
        }
        cjta b = cjtd.b();
        b.g(dwflVar.c);
        b.d = this.i;
        b.s(bZ.bK());
        this.k = b.a();
        n(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void n(boolean z) {
        this.h.a = Boolean.valueOf(z);
        if (z) {
            cqkx.p(this.h);
            return;
        }
        cqkx.p(this);
        cqkx.p(this.h);
    }
}
