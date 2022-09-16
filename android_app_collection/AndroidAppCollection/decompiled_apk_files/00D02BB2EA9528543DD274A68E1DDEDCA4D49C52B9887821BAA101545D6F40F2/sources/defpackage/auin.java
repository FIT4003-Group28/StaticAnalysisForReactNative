package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: auin  reason: default package */
/* loaded from: classes.dex */
public enum auin {
    GETTING_AROUND("TRAFFIC", R.string.GETTING_AROUND_CATEGORY_TITLE, 2131232225, dtxw.dY, aufo.GETTING_AROUND),
    YOUR_REVIEWS("YOUR_CONTRIBUTIONS", R.string.YOUR_REVIEWS_CATEGORY_TITLE, 2131232397, dtxw.ed, aufo.YOUR_CONTRIBUTIONS),
    GOOGLE("PEOPLE_AND_PLACES", R.string.LOCATION_AND_PROFILE_CATEGORY_TITLE, 2131232384, dtxw.eb, aufo.PEOPLE_AND_PLACES),
    RECOMMENDATIONS_FOR_YOU("LOCAL_DISCOVERY", R.string.RECOMMENDATIONS_FOR_YOU_CATEGORY_TITLE, 2131232268, dtxw.ea, aufo.LOCAL_DISCOVERY),
    QA_AND_MESSAGES("GROUP_PLANNING", R.string.QA_AND_MESSAGES_CATEGORY_TITLE, 2131232347, dtxw.dZ, aufo.GROUP_PLANNING),
    YOUR_BUSINESS("YOUR_BUSINESS", R.string.YOUR_BUSINESS_CATEGORY_TITLE, 2131232433, dtxw.ec, aufo.YOUR_BUSINESS),
    MAPS_FEATURES("NAVIGATION", R.string.MAPS_FEATURES_CATEGORY_TITLE, 2131232780, null, aufo.MAPS_FEATURES);
    
    public final String h;
    public final int i;
    public final int j;
    public final ddho k;
    public final aufo l;

    auin(String str, int i, int i2, ddho ddhoVar, aufo aufoVar) {
        this.h = str;
        this.i = i;
        this.j = i2;
        this.k = ddhoVar;
        this.l = aufoVar;
    }
}
