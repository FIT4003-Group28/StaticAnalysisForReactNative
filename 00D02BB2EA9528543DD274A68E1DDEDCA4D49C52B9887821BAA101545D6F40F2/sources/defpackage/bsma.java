package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bsma  reason: default package */
/* loaded from: classes4.dex */
public final class bsma {
    public static final dcqe a = dcqe.c("bsma");
    public static final dcdn<djnu, Double> b;
    public final Activity c;

    static {
        dcdg dcdgVar = new dcdg();
        dcdgVar.f(djnu.RATING_0_5, Double.valueOf(0.5d));
        dcdgVar.f(djnu.RATING_1_0, Double.valueOf(1.0d));
        dcdgVar.f(djnu.RATING_1_5, Double.valueOf(1.5d));
        dcdgVar.f(djnu.RATING_2_0, Double.valueOf(2.0d));
        dcdgVar.f(djnu.RATING_2_5, Double.valueOf(2.5d));
        dcdgVar.f(djnu.RATING_3_0, Double.valueOf(3.0d));
        dcdgVar.f(djnu.RATING_3_5, Double.valueOf(3.5d));
        dcdgVar.f(djnu.RATING_4_0, Double.valueOf(4.0d));
        dcdgVar.f(djnu.RATING_4_5, Double.valueOf(4.5d));
        dcdgVar.f(djnu.RATING_5_0, Double.valueOf(5.0d));
        b = dcdgVar.b();
    }

    public bsma(Activity activity) {
        this.c = activity;
    }
}
