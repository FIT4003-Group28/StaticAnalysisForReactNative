package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cevh  reason: default package */
/* loaded from: classes4.dex */
public final class cevh {
    public static final dcdn<drds, Integer> a;
    public final Activity b;
    public final ceyk c;
    public final ceyg d;
    public final cewo e;
    public final cevo f;
    public final cexf g;
    public final ceum h;
    public final ceuk i;
    public final cese j;

    static {
        dcdg p = dcdn.p();
        drds drdsVar = drds.REVIEW;
        Integer valueOf = Integer.valueOf((int) R.string.PRFOLILE_REVIEWS_LEAF_PAGE_TITLE);
        p.f(drdsVar, valueOf);
        p.f(drds.POST, valueOf);
        p.f(drds.MEDIA, Integer.valueOf((int) R.string.PRFOLILE_PHOTOS_LEAF_PAGE_TITLE));
        p.f(drds.PUBLIC_LIST, Integer.valueOf((int) R.string.PRFOLILE_LISTS_LEAF_PAGE_TITLE));
        p.f(drds.FACTUAL_EDIT, Integer.valueOf((int) R.string.PRFOLILE_EDITS_LEAF_PAGE_TITLE));
        p.f(drds.PLACE_QA, Integer.valueOf((int) R.string.PRFOLILE_QA_LEAF_PAGE_TITLE));
        p.f(drds.EVENT, Integer.valueOf((int) R.string.PRFOLILE_EVENTS_LEAF_PAGE_TITLE));
        a = p.b();
    }

    public cevh(Activity activity, ceyk ceykVar, ceyg ceygVar, cewo cewoVar, cevo cevoVar, cexf cexfVar, ceum ceumVar, ceuk ceukVar, cese ceseVar) {
        this.b = activity;
        this.c = ceykVar;
        this.d = ceygVar;
        this.e = cewoVar;
        this.f = cevoVar;
        this.g = cexfVar;
        this.h = ceumVar;
        this.i = ceukVar;
        this.j = ceseVar;
    }

    public static boolean a(drds drdsVar) {
        drds drdsVar2 = drds.UNKNOWN_CREATOR_CONTRIBUTION_TYPE;
        switch (drdsVar.ordinal()) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            default:
                return false;
        }
    }
}
