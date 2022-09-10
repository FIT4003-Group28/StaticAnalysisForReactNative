package defpackage;

import android.os.Bundle;
import android.widget.RadioGroup;
/* compiled from: PG */
/* renamed from: cczd  reason: default package */
/* loaded from: classes4.dex */
public class cczd implements RadioGroup.OnCheckedChangeListener, ccxf {
    private final ccln a;
    private final cczc b;
    private final ccma c;
    private int d = -1;

    public cczd(cqhn cqhnVar, ccln cclnVar, cczc cczcVar, ccma ccmaVar) {
        this.a = cclnVar;
        this.b = cczcVar;
        this.c = ccmaVar;
    }

    private final cqkl k() {
        cczc cczcVar = this.b;
        if (((ges) cczcVar).aD) {
            ((gen) cczcVar).aT();
        }
        return cqkl.a;
    }

    @Override // defpackage.ccxf
    public String a() {
        return this.a.f;
    }

    @Override // defpackage.ccxf
    public cqkl b() {
        return k();
    }

    @Override // defpackage.ccxf
    public cqkl c() {
        if (this.d == ccow.a) {
            cclg cclgVar = (cclg) this.b;
            gga ggaVar = cclgVar.a;
            ccln cclnVar = cclgVar.e;
            ccxa ccxaVar = cclgVar.g;
            ccwr bZ = ccws.f.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ccws ccwsVar = (ccws) bZ.b;
            cclnVar.getClass();
            ccwsVar.b = cclnVar;
            int i = ccwsVar.a | 1;
            ccwsVar.a = i;
            ccxaVar.getClass();
            ccwsVar.d = ccxaVar;
            ccwsVar.a = i | 4;
            Bundle bundle = new Bundle();
            bvrs.l(bundle, bZ.bK());
            cclh cclhVar = new cclh();
            cclhVar.B(bundle);
            ggaVar.D(cclhVar);
        } else if (this.d == ccow.d) {
            cclg cclgVar2 = (cclg) this.b;
            final ccsq ccsqVar = cclgVar2.d;
            final ccln cclnVar2 = cclgVar2.e;
            final String str = cclgVar2.g.b;
            ccrh ccrhVar = ccsqVar.b;
            dgfb b = dgfb.b(cclnVar2.e);
            if (b == null) {
                b = dgfb.UNKNOWN_OFFERING_TYPE;
            }
            ccrhVar.a(b);
            ccsqVar.b(new dbty(ccsqVar, cclnVar2, str) { // from class: ccso
                private final ccsq a;
                private final ccln b;
                private final String c;

                {
                    this.a = ccsqVar;
                    this.b = cclnVar2;
                    this.c = str;
                }

                @Override // defpackage.dbty
                public final Object a() {
                    ccsq ccsqVar2 = this.a;
                    ccln cclnVar3 = this.b;
                    String str2 = this.c;
                    return ((cctn) ccsqVar2.a).e(cctn.f(cclnVar3, str2, 3, null));
                }
            });
        } else if (this.d == ccow.c) {
            cclg cclgVar3 = (cclg) this.b;
            final ccsq ccsqVar2 = cclgVar3.d;
            final ccln cclnVar3 = cclgVar3.e;
            final String str2 = cclgVar3.g.b;
            ccrh ccrhVar2 = ccsqVar2.b;
            dgfb b2 = dgfb.b(cclnVar3.e);
            if (b2 == null) {
                b2 = dgfb.UNKNOWN_OFFERING_TYPE;
            }
            ccrhVar2.a(b2);
            ccsqVar2.b(new dbty(ccsqVar2, cclnVar3, str2) { // from class: ccsn
                private final ccsq a;
                private final ccln b;
                private final String c;

                {
                    this.a = ccsqVar2;
                    this.b = cclnVar3;
                    this.c = str2;
                }

                @Override // defpackage.dbty
                public final Object a() {
                    ccsq ccsqVar3 = this.a;
                    ccln cclnVar4 = this.b;
                    String str3 = this.c;
                    ccst ccstVar = ccsqVar3.a;
                    draq bZ2 = drar.f.bZ();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    drar drarVar = (drar) bZ2.b;
                    drarVar.b = 1;
                    drarVar.a = 1 | drarVar.a;
                    return ((cctn) ccstVar).e(cctn.f(cclnVar4, str3, 6, bZ2.bK()));
                }
            });
        } else if (this.d == ccow.b) {
            cclg cclgVar4 = (cclg) this.b;
            cclgVar4.d.a(cclgVar4.e, cclgVar4.g.b, null, null);
        }
        return k();
    }

    @Override // defpackage.ccxf
    public RadioGroup.OnCheckedChangeListener d() {
        return this;
    }

    @Override // defpackage.ccxf
    public Boolean e() {
        return Boolean.valueOf(this.d != -1);
    }

    @Override // defpackage.ccxf
    public cqkl f() {
        return cqkl.a;
    }

    @Override // defpackage.ccxf
    public Boolean g() {
        return Boolean.valueOf(new dsrh(this.c.a, ccma.b).contains(cclz.EDIT_NAME));
    }

    @Override // defpackage.ccxf
    public Boolean h() {
        return Boolean.valueOf(new dsrh(this.c.a, ccma.b).contains(cclz.WRONG_NAME));
    }

    @Override // defpackage.ccxf
    public Boolean i() {
        boolean z = false;
        if (!a().isEmpty() && new dsrh(this.c.a, ccma.b).contains(cclz.INAPPROPRIATE_NAME)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ccxf
    public Boolean j() {
        return Boolean.valueOf(new dsrh(this.c.a, ccma.b).contains(cclz.NOT_SERVED));
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        this.d = i;
        cqkx.p(this);
    }
}
