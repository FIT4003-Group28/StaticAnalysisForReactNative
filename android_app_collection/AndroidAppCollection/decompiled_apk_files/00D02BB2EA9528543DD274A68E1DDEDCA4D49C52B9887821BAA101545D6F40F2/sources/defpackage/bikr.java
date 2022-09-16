package defpackage;

import android.app.Activity;
import android.app.Application;
import java.util.List;
/* compiled from: PG */
/* renamed from: bikr  reason: default package */
/* loaded from: classes3.dex */
public class bikr implements jav, bega {
    private final dxio<Activity> a;
    private final Application b;
    private final eeu c;
    private final dxio<aesb> d;
    private final dxio<bbut> e;
    private final dxio<bwsh> f;
    private bwrs<ilo> g;
    private final List<biks> h = dchl.a();
    private final cqtd i = cqrt.f(2131231803);
    private final cqtd j = cqrt.f(17170445);

    public bikr(Application application, eeu eeuVar, btvo btvoVar, dxio<Activity> dxioVar, dxio<aesb> dxioVar2, dxio<bbut> dxioVar3, dxio<bwsh> dxioVar4) {
        this.a = dxioVar;
        this.b = application;
        this.c = eeuVar;
        this.d = dxioVar2;
        this.e = dxioVar3;
        this.f = dxioVar4;
    }

    private static boolean E(@dzsi dvxn dvxnVar) {
        if ((dvxnVar.a & 1) != 0) {
            dwfl dwflVar = dvxnVar.b;
            if (dwflVar == null) {
                dwflVar = dwfl.w;
            }
            return (dwflVar.a & 128) != 0;
        }
        return false;
    }

    private static jic F(biks biksVar) {
        dwfl dwflVar = biksVar.a;
        return new jic(dwflVar.h, jfv.b(dwflVar), 0);
    }

    @Override // defpackage.jav
    @dzsi
    public String A() {
        if (!this.h.isEmpty()) {
            return this.h.get(0).a();
        }
        return null;
    }

    @Override // defpackage.jav
    @dzsi
    public String B() {
        if (this.h.size() > 1) {
            return this.h.get(1).a();
        }
        return null;
    }

    @Override // defpackage.jav
    @dzsi
    public String C() {
        if (this.h.size() > 2) {
            return this.h.get(2).a();
        }
        return null;
    }

    public Integer D() {
        return Integer.valueOf(this.h.size());
    }

    @Override // defpackage.jav
    public cjtd a() {
        bwrs<ilo> bwrsVar = this.g;
        if (bwrsVar == null) {
            return cjtd.b;
        }
        ilo c = bwrsVar.c();
        dbsk.s(c);
        String str = c.a().e;
        cjta b = cjtd.b();
        b.b = str;
        b.d = dtxy.lg;
        return b.a();
    }

    @Override // defpackage.jav
    @dzsi
    public jic b() {
        if (this.h.size() > 0) {
            return F(this.h.get(0));
        }
        return null;
    }

    @Override // defpackage.jav
    @dzsi
    public String c() {
        if (this.h.size() > 0) {
            return this.h.get(0).b;
        }
        return null;
    }

    @Override // defpackage.jav
    @dzsi
    public cjtd d() {
        if (this.h.size() > 0) {
            return this.h.get(0).c();
        }
        return null;
    }

    @Override // defpackage.jav
    @dzsi
    public jic e() {
        if (this.h.size() > 1) {
            return F(this.h.get(1));
        }
        return null;
    }

    @Override // defpackage.jav
    @dzsi
    public String f() {
        if (this.h.size() > 1) {
            return this.h.get(1).b;
        }
        return null;
    }

    @Override // defpackage.jav
    @dzsi
    public cjtd g() {
        if (this.h.size() > 1) {
            return this.h.get(1).c();
        }
        return null;
    }

    @Override // defpackage.jav
    @dzsi
    public jic h() {
        if (this.h.size() > 2) {
            return F(this.h.get(2));
        }
        return null;
    }

    @Override // defpackage.jav
    @dzsi
    public String i() {
        if (this.h.size() > 2) {
            return this.h.get(2).b;
        }
        return null;
    }

    @Override // defpackage.jav
    @dzsi
    public cjtd j() {
        if (this.h.size() > 2) {
            return this.h.get(2).c();
        }
        return null;
    }

    @Override // defpackage.jav
    public Boolean k() {
        boolean z = true;
        if (this.h.size() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.jav
    public Boolean l() {
        return Boolean.valueOf(this.h.size() == 2);
    }

    @Override // defpackage.jav
    public Boolean m() {
        btpf c = btpf.c(this.b);
        boolean z = true;
        if (this.h.size() <= 2 || (c.e && !c.f)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.jav
    public Boolean n() {
        btpf c = btpf.c(this.b);
        boolean z = false;
        if (this.h.size() > 2 && c.e && !c.f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.jav
    public Boolean o() {
        return true;
    }

    @Override // defpackage.jav
    public cqkl p() {
        this.h.get(0).b();
        return cqkl.a;
    }

    @Override // defpackage.jav
    public Boolean q() {
        return true;
    }

    @Override // defpackage.jav
    public cqkl r() {
        this.h.get(1).b();
        return cqkl.a;
    }

    @Override // defpackage.jav
    public Boolean s() {
        return true;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        ilo iloVar;
        this.g = bwrsVar;
        this.h.clear();
        bwrs<ilo> bwrsVar2 = this.g;
        if (bwrsVar2 == null) {
            return;
        }
        ilo c = bwrsVar2.c();
        dbsk.s(c);
        dvxn aC = c.aC();
        c.aB();
        dvxn dvxnVar = c.x;
        dvxn aD = c.aD();
        if (aD == null || !E(aD) || c.an()) {
            iloVar = c;
        } else {
            String str = aD.c;
            List<biks> list = this.h;
            Activity a = this.a.a();
            eeu eeuVar = this.c;
            aesb a2 = this.d.a();
            bbut a3 = this.e.a();
            bwsh a4 = this.f.a();
            bwrs<ilo> bwrsVar3 = this.g;
            dwfl dwflVar = aD.b;
            if (dwflVar == null) {
                dwflVar = dwfl.w;
            }
            iloVar = c;
            list.add(new biks(a, eeuVar, a2, a3, a4, bwrsVar3, dwflVar, str, 2));
        }
        if (aC != null && E(aC)) {
            String str2 = aC.c;
            List<biks> list2 = this.h;
            Activity a5 = this.a.a();
            eeu eeuVar2 = this.c;
            aesb a6 = this.d.a();
            bbut a7 = this.e.a();
            bwsh a8 = this.f.a();
            bwrs<ilo> bwrsVar4 = this.g;
            dwfl dwflVar2 = aC.b;
            if (dwflVar2 == null) {
                dwflVar2 = dwfl.w;
            }
            list2.add(new biks(a5, eeuVar2, a6, a7, a8, bwrsVar4, dwflVar2, str2, 1));
        }
        if (dvxnVar == null || !E(dvxnVar) || iloVar.an()) {
            return;
        }
        String str3 = dvxnVar.c;
        List<biks> list3 = this.h;
        Activity a9 = this.a.a();
        eeu eeuVar3 = this.c;
        aesb a10 = this.d.a();
        bbut a11 = this.e.a();
        bwsh a12 = this.f.a();
        bwrs<ilo> bwrsVar5 = this.g;
        dwfl dwflVar3 = dvxnVar.b;
        if (dwflVar3 == null) {
            dwflVar3 = dwfl.w;
        }
        list3.add(new biks(a9, eeuVar3, a10, a11, a12, bwrsVar5, dwflVar3, str3, 3));
    }

    @Override // defpackage.bega
    public void u() {
    }

    @Override // defpackage.jav
    public cqkl v() {
        this.h.get(2).b();
        return cqkl.a;
    }

    @Override // defpackage.bega
    public Boolean w() {
        return Boolean.valueOf(D().intValue() > 0);
    }

    @Override // defpackage.jav
    public cqtd x() {
        return (this.h.isEmpty() || !(this.h.get(0).c == 1 || this.h.get(0).c == 2)) ? this.j : this.i;
    }

    @Override // defpackage.jav
    public cqtd y() {
        return (this.h.size() <= 1 || !(this.h.get(1).c == 1 || this.h.get(1).c == 2)) ? this.j : this.i;
    }

    @Override // defpackage.jav
    public cqtd z() {
        return (this.h.size() <= 2 || !(this.h.get(2).c == 1 || this.h.get(2).c == 2)) ? this.j : this.i;
    }
}
