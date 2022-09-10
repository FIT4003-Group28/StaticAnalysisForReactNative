package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: bkjb  reason: default package */
/* loaded from: classes3.dex */
public class bkjb implements jaz {
    private final String a;
    private final String b;
    private final cjtd c;
    private final boolean d;

    private bkjb(String str, String str2, cjtd cjtdVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = cjtdVar;
        this.d = z;
    }

    @dzsi
    public static bkjb m(ilo iloVar, boolean z, boolean z2) {
        dvwp dvwpVar;
        if (!z || !z2) {
            dvwr dvwrVar = iloVar.h().bj;
            if (dvwrVar == null) {
                dvwrVar = dvwr.b;
            }
            Iterator<dvwp> it = dvwrVar.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    dvwpVar = null;
                    break;
                }
                dvwpVar = it.next();
                int a = dvwn.a(dvwpVar.b);
                int i = a - 1;
                if (a == 0) {
                    throw null;
                }
                if (i == 5) {
                    break;
                }
            }
            if (dvwpVar == null) {
                return null;
            }
            if ((dvwpVar.b == 8 ? (dghq) dvwpVar.c : dghq.b).a.size() <= 0) {
                return null;
            }
            dgih dgihVar = (dvwpVar.b == 8 ? (dghq) dvwpVar.c : dghq.b).a.get(0).d;
            if (dgihVar == null) {
                dgihVar = dgih.b;
            }
            dgig dgigVar = dgihVar.a;
            if (dgigVar == null) {
                dgigVar = dgig.c;
            }
            String str = dgigVar.a;
            dgly dglyVar = ((dgii) dcft.c((dvwpVar.b == 8 ? (dghq) dvwpVar.c : dghq.b).a)).b;
            if (dglyVar == null) {
                dglyVar = dgly.c;
            }
            String str2 = dglyVar.a;
            if (str.isEmpty() || str2.isEmpty()) {
                return null;
            }
            cjta c = cjtd.c(iloVar.bZ());
            if (dvwpVar.e) {
                c.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
            }
            if ((dvwpVar.a & 64) != 0) {
                c.d = new dtxi(dvwpVar.d);
            } else {
                c.d = dtxy.dD;
            }
            return new bkjb(str, str2, c.a(), dvwpVar.e);
        }
        return null;
    }

    @Override // defpackage.jaz
    @dzsi
    public cqtd a() {
        return null;
    }

    @Override // defpackage.jaz
    public String b() {
        return this.a;
    }

    @Override // defpackage.jaz
    @dzsi
    public cqtd c() {
        return null;
    }

    @Override // defpackage.jaz
    public Boolean d() {
        return false;
    }

    @Override // defpackage.jaz
    public CharSequence e() {
        return this.b;
    }

    @Override // defpackage.jaz
    public CharSequence f() {
        return "";
    }

    @Override // defpackage.jaz
    public dcdc<cqix<?>> g() {
        return dcdc.e();
    }

    @Override // defpackage.jaz
    public cjtd h() {
        return this.c;
    }

    @Override // defpackage.jaz
    public Boolean i() {
        boolean z = false;
        if (!this.d && !this.b.isEmpty() && !this.a.isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.jaz
    public Integer j() {
        return 2;
    }

    @Override // defpackage.jaz
    public cqkl k() {
        return cqkl.a;
    }

    @Override // defpackage.jaz
    public Integer l() {
        return 3;
    }
}
