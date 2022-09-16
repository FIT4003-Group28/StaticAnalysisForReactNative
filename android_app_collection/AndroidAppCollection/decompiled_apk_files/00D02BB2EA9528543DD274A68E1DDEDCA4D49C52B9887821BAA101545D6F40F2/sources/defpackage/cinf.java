package defpackage;

import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cinf  reason: default package */
/* loaded from: classes4.dex */
class cinf implements cinc {
    public final String a;
    private final chrx b;
    private final cilu c;
    private final dwfl d;
    private final jic e;
    private final boolean f;
    private final String g;
    private final int h;
    private final boolean i;
    @dzsi
    private final Integer j;

    public cinf(chrx chrxVar, cilu ciluVar, dwmz dwmzVar, boolean z, String str, int i, @dzsi Integer num, boolean z2) {
        this.b = chrxVar;
        this.c = ciluVar;
        dwfl dwflVar = dwmzVar.b;
        this.a = (dwflVar == null ? dwfl.w : dwflVar).q;
        dwfl dwflVar2 = dwmzVar.b;
        this.d = dwflVar2 == null ? dwfl.w : dwflVar2;
        this.g = str;
        this.h = i + 1;
        dwfl dwflVar3 = dwmzVar.b;
        this.e = new jic((dwflVar3 == null ? dwfl.w : dwflVar3).h, ckqc.FIFE, R.drawable.generic_image_placeholder);
        this.f = z;
        this.j = num;
        this.i = z2;
    }

    @Override // defpackage.cinc
    public cjtd a() {
        return cjtd.a(c().booleanValue() ? dtxl.fY : dtxl.ge);
    }

    @Override // defpackage.cinc
    public jic b() {
        return this.e;
    }

    @Override // defpackage.cinc
    public Boolean c() {
        return Boolean.valueOf(this.j != null);
    }

    @Override // defpackage.cinc
    public cqkl d() {
        if (c().booleanValue()) {
            this.c.p(cind.a);
        } else {
            final boolean z = !this.f;
            this.c.p(new dbrn(this, z) { // from class: cine
                private final cinf a;
                private final boolean b;

                {
                    this.a = this;
                    this.b = z;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    cinf cinfVar = this.a;
                    boolean z2 = this.b;
                    chxp chxpVar = (chxp) obj;
                    ArrayList arrayList = new ArrayList(chxpVar.c);
                    if (z2) {
                        if (!arrayList.contains(cinfVar.a)) {
                            arrayList.add(cinfVar.a);
                        }
                    } else {
                        arrayList.remove(cinfVar.a);
                    }
                    dsqp dsqpVar = (dsqp) chxpVar.cu(5);
                    dsqpVar.bC(chxpVar);
                    chxm chxmVar = (chxm) dsqpVar;
                    if (chxmVar.c) {
                        chxmVar.bF();
                        chxmVar.c = false;
                    }
                    ((chxp) chxmVar.b).c = dsqw.ck();
                    chxmVar.a(arrayList);
                    return chxmVar.bK();
                }
            });
        }
        return cqkl.a;
    }

    @Override // defpackage.cinc
    public Integer e() {
        Integer num = this.j;
        return Integer.valueOf(num == null ? 0 : num.intValue());
    }

    public boolean equals(@dzsi Object obj) {
        if (obj instanceof cinf) {
            cinf cinfVar = (cinf) obj;
            return this.a.equals(cinfVar.a) && this.f == cinfVar.f;
        }
        return false;
    }

    @Override // defpackage.cinc
    public Boolean f() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.cinc
    public String g() {
        return this.g;
    }

    @Override // defpackage.cinc
    public Integer h() {
        return Integer.valueOf(this.h);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{cinf.class, this.a});
    }

    @Override // defpackage.cinc
    public cjtd i() {
        return cjtd.a(dtxl.fX);
    }

    @Override // defpackage.cinc
    public cqkl j() {
        if (this.i) {
            cilu ciluVar = this.c;
            int i = this.h - 1;
            dcdc<dwfl> z = dcbg.b(ciluVar.b.p).s(cilm.a).z();
            chrx chrxVar = ciluVar.a;
            chxr chxrVar = ciluVar.b.b;
            if (chxrVar == null) {
                chxrVar = chxr.e;
            }
            chrxVar.J(z, i, chxrVar);
        } else {
            this.b.am(dcdc.f(this.d));
        }
        return cqkl.a;
    }
}
