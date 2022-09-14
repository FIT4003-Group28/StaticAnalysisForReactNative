package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: afvw  reason: default package */
/* loaded from: classes2.dex */
class afvw extends afwf {
    final /* synthetic */ afwg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afvw(afwg afwgVar, cqtd cqtdVar, CharSequence charSequence, cjtd cjtdVar) {
        super(afwgVar, cqtdVar, charSequence, cjtdVar, true);
        this.a = afwgVar;
    }

    @Override // defpackage.afwf, defpackage.jbf
    public cjtd h() {
        if (u().booleanValue()) {
            cjta b = cjtd.b();
            b.d = dtxv.w;
            b.g(cjrx.a(ddcu.y.a));
            return b.a();
        }
        return cjtd.a(dtxv.w);
    }

    @Override // defpackage.afuz
    public cqkl n(cjqm cjqmVar) {
        this.a.i.a().q();
        this.a.m.a().m();
        return cqkl.a;
    }

    @Override // defpackage.afwf, defpackage.afuz
    public View.AccessibilityDelegate q() {
        if (u().booleanValue()) {
            return new afvr(this);
        }
        return super.q();
    }

    @Override // defpackage.afwf, defpackage.afuz
    public Boolean u() {
        boolean z = true;
        if (!((axxh) this.a.h).j() && !this.a.g.f()) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
