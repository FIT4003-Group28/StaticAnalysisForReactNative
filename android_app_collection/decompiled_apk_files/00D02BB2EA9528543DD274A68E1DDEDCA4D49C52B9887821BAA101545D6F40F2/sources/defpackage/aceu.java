package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aceu  reason: default package */
/* loaded from: classes2.dex */
public class aceu extends ivw {
    private final dxio<ache> c;
    private final jkf d;

    public aceu(dxio<ache> dxioVar, gga ggaVar, jkf jkfVar) {
        super(ggaVar, ivu.FIXED, jaq.NO_TINT_DAY_NIGHT_ON_WHITE, cqrt.g(2131232674, ibm.c()), ggaVar.getString(R.string.FEEDBACK), null, true, 0, ivv.MOD_MINI);
        this.c = dxioVar;
        this.d = jkfVar;
    }

    @Override // defpackage.ivw, defpackage.jar
    public Integer I() {
        return 8388661;
    }

    @Override // defpackage.jar
    public cqkl a(cjqm cjqmVar) {
        this.c.a().k(false, true, achc.VISUAL_EXPLORE_IMMERSIVE, null);
        return cqkl.a;
    }

    @Override // defpackage.ivw, defpackage.jar
    public cqtd w() {
        return this.d.l().L() == jjn.FULLY_EXPANDED ? cqui.c(cquh.f(cqta.f())) : super.w();
    }
}
