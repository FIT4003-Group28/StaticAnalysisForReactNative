package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: acet  reason: default package */
/* loaded from: classes2.dex */
public class acet extends ivw {
    private final gga c;
    private final jkf d;

    public acet(gga ggaVar, jkf jkfVar) {
        super(ggaVar, ivu.FIXED, jaq.NO_TINT_DAY_NIGHT_ON_WHITE, cqrt.g(2131231588, ibm.c()), ggaVar.getString(R.string.BACK_BUTTON), cjtd.a(dtye.q), true, R.id.visual_explore_back, ivv.MOD_MINI);
        this.c = ggaVar;
        this.d = jkfVar;
    }

    @Override // defpackage.ivw, defpackage.jar
    public Integer I() {
        return 8388659;
    }

    @Override // defpackage.jar
    public cqkl a(cjqm cjqmVar) {
        this.c.s();
        return cqkl.a;
    }

    @Override // defpackage.ivw, defpackage.jar
    public cqtd w() {
        return this.d.l().L() == jjn.FULLY_EXPANDED ? cqui.c(cquh.f(cqta.f())) : super.w();
    }
}
