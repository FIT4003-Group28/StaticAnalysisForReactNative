package defpackage;
/* compiled from: PG */
/* renamed from: cgxh  reason: default package */
/* loaded from: classes4.dex */
public class cgxh implements cgvi {
    boolean a = false;
    private final cgxm b;
    private final String c;
    private final cgsk d;
    private final dnmi e;

    public cgxh(cgxm cgxmVar, String str, cgsk cgskVar, dnmi dnmiVar) {
        this.b = cgxmVar;
        this.c = str;
        this.d = cgskVar;
        this.e = dnmiVar;
    }

    @Override // defpackage.cgvb
    public void a(cqiv cqivVar) {
        cqivVar.a(new cggo(), this);
    }

    @Override // defpackage.cgvi
    public String b() {
        return this.a ? this.e.b : this.e.a;
    }

    @Override // defpackage.cgvi
    public cqkl c() {
        e(!this.a);
        this.b.bs(this.a, this);
        return cqkl.a;
    }

    @Override // defpackage.cgvi
    public Boolean d() {
        dpxb dpxbVar = f().c;
        if (dpxbVar == null) {
            dpxbVar = dpxb.c;
        }
        boolean z = true;
        if (1 != (dpxbVar.a & 1)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.cgvi
    public void e(boolean z) {
        this.a = z;
        cqkx.p(this);
    }

    @Override // defpackage.cgvi
    public dqgw f() {
        dnms dnmsVar;
        dwqf dwqfVar = this.d.a().c;
        if (dwqfVar == null) {
            dwqfVar = dwqf.g;
        }
        doqw doqwVar = dwqfVar.b;
        if (doqwVar == null) {
            doqwVar = doqw.c;
        }
        if (doqwVar.a == 10) {
            dnmsVar = (dnms) doqwVar.b;
        } else {
            dnmsVar = dnms.e;
        }
        dqgw dqgwVar = dnmsVar.c;
        return dqgwVar == null ? dqgw.d : dqgwVar;
    }

    @Override // defpackage.cgvi
    public cjtd g() {
        cjta b = cjtd.b();
        b.d = dtyd.aJ;
        b.g(this.c);
        ddzy bZ = deab.c.bZ();
        deaa deaaVar = this.a ? deaa.TOGGLE_ON : deaa.TOGGLE_OFF;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        b.a = bZ.bK();
        return b.a();
    }
}
