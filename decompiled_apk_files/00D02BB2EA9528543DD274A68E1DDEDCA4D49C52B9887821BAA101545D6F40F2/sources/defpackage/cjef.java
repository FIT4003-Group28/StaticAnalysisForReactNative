package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: cjef  reason: default package */
/* loaded from: classes4.dex */
public class cjef implements jkh, cjev {
    private final cjec a;
    private boolean b;
    private final Activity c;
    private dcdc<cjet> d;

    public cjef(cjec cjecVar, Activity activity) {
        this.a = cjecVar;
        this.c = activity;
    }

    @Override // defpackage.jkh
    public void L(jkj jkjVar, jjn jjnVar, jjn jjnVar2, jkg jkgVar) {
        if (jjnVar2 == jjn.FULLY_EXPANDED) {
            this.b = true;
        } else {
            this.b = false;
        }
        cqkx.p(this);
    }

    @Override // defpackage.jkh
    public void M(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jkh
    public void N(jkj jkjVar, jjn jjnVar) {
    }

    @Override // defpackage.jbk
    public jib NC() {
        return jib.g(this.c, "Edits");
    }

    @Override // defpackage.jkh
    public void O() {
    }

    @Override // defpackage.jkh
    public void P(jkj jkjVar, jjn jjnVar, float f) {
    }

    @Override // defpackage.cjev
    public Boolean b() {
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.cjev
    public dcdc<cjet> c() {
        dcdc<cjet> dcdcVar = this.d;
        if (dcdcVar != null) {
            return dcdcVar;
        }
        dccx F = dcdc.F();
        for (int i = 0; i < 20; i++) {
            cjee a = this.a.a.a();
            cjec.a(a);
            F.g(new cjeb(a));
        }
        dcdc<cjet> f = F.f();
        this.d = f;
        return f;
    }
}
