package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cfkr  reason: default package */
/* loaded from: classes4.dex */
public class cfkr extends ivw {
    private final Runnable c;

    public cfkr(gga ggaVar, boolean z, Runnable runnable) {
        super(ggaVar, ivu.FIXED, jaq.NO_TINT_DAY_NIGHT_ON_WHITE, cqrt.g(2131232960, ibm.m()), ggaVar.getString(R.string.UGC_POST_TRIP_UNDO_FAB_CONTENT_DESCRIPTION), cjtd.a(dtxy.oh), z, 0, ivv.FULL);
        this.c = runnable;
    }

    @Override // defpackage.ivw, defpackage.jar
    public Integer I() {
        return 8388693;
    }

    @Override // defpackage.jar
    public cqkl a(cjqm cjqmVar) {
        this.c.run();
        return cqkl.a;
    }
}
