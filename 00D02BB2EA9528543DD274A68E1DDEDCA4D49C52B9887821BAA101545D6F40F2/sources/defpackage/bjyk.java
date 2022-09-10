package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bjyk  reason: default package */
/* loaded from: classes3.dex */
public class bjyk implements bjwl {
    private final bjgt a;
    private final Runnable b;
    private final String c;
    private final cjtd d;
    private final String e;
    private boolean f;

    public bjyk(gga ggaVar, bjgt bjgtVar, bwrs<ilo> bwrsVar, Runnable runnable, djam djamVar, boolean z) {
        this.a = bjgtVar;
        this.b = runnable;
        String str = djamVar.b;
        this.e = str;
        ilo c = bwrsVar.c();
        dbsk.s(c);
        int i = z ? R.string.PLACE_QA_ACCESSIBILITY_QUESTION_REPORT_BUTTON_DESCRIPTION : R.string.PLACE_QA_ACCESSIBILITY_ANSWER_REPORT_BUTTON_DESCRIPTION;
        Object[] objArr = new Object[1];
        djag djagVar = djamVar.c;
        objArr[0] = bjgr.a(ggaVar, c, djagVar == null ? djag.d : djagVar);
        this.c = ggaVar.getString(i, objArr);
        cjta c2 = cjtd.c(c.bZ());
        c2.d = z ? dtxy.gl : dtxy.fP;
        this.d = c2.a();
        this.f = bjgtVar.a(str);
    }

    @Override // defpackage.bjgv
    public void QW() {
        this.f = this.a.a(this.e);
        cqkx.p(this);
    }

    @Override // defpackage.bjwl
    public cqkl a() {
        this.b.run();
        return cqkl.a;
    }

    @Override // defpackage.bjwl
    public CharSequence b() {
        return this.c;
    }

    @Override // defpackage.bjwl
    public Boolean c() {
        return Boolean.valueOf(this.f);
    }

    @Override // defpackage.bjwl
    public cjtd d() {
        return this.d;
    }
}
