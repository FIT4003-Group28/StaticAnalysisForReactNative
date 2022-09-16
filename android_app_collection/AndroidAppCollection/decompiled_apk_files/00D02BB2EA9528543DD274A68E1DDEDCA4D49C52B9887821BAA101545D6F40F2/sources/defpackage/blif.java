package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: blif  reason: default package */
/* loaded from: classes3.dex */
public abstract class blif {
    public static blif a;
    public static blif[] b;

    static {
        blgt blgtVar = new blgt(R.string.CONTRIBUTIONS_SORT_BY_MOST_RELEVANT, R.string.REVIEWS_SORT_BY_MOST_RELEVANT_CHIP_LABEL, R.string.REVIEWS_SORT_BY_MOST_RELEVANT_DESCRIPTION_SELECTION_STATE, dbpy.a, djuu.QUALITY_SCORE, 2, true, dtya.dV);
        a = blgtVar;
        b = new blif[]{blgtVar, j(R.string.CONTRIBUTIONS_SORT_BY_NEWEST, R.string.REVIEWS_SORT_BY_NEWEST_CHIP_LABEL, R.string.REVIEWS_SORT_BY_NEWEST_DESCRIPTION_SELECTION_STATE, dbpy.a, djuu.NEWEST_FIRST, 3, dtya.dW), j(R.string.CONTRIBUTIONS_SORT_BY_HIGHEST_RATING, R.string.REVIEWS_SORT_BY_HIGHEST_RATING_CHIP_LABEL, R.string.REVIEWS_SORT_BY_HIGHEST_DESCRIPTION_SELECTION_STATE, dbpy.a, djuu.STAR_RATING_HIGH_THEN_QUALITY, 4, dtya.dT), j(R.string.CONTRIBUTIONS_SORT_BY_LOWEST_RATING, R.string.REVIEWS_SORT_BY_LOWEST_RATING_CHIP_LABEL, R.string.REVIEWS_SORT_BY_LOWEST_DESCRIPTION_SELECTION_STATE, dbpy.a, djuu.STAR_RATING_LOW_THEN_QUALITY, 5, dtya.dU)};
    }

    public static dbsg<djuu> i() {
        return dbpy.a;
    }

    private static blif j(int i, int i2, int i3, dbsg<Integer> dbsgVar, djuu djuuVar, int i4, ddho ddhoVar) {
        return new blgt(i, i2, i3, dbsgVar, djuuVar, i4, false, ddhoVar);
    }

    public abstract int a();

    public abstract int b();

    public abstract int c();

    public abstract dbsg<Integer> d();

    public abstract djuu e();

    public abstract boolean f();

    public abstract ddho g();

    public abstract int h();
}
