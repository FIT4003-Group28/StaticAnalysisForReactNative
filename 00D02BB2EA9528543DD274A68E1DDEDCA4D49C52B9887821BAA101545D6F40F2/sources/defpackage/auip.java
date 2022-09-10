package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: auip  reason: default package */
/* loaded from: classes.dex */
public final class auip {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final auiu i;
    public static final auiu j;

    static {
        String num = Integer.toString(dpyv.NAVIGATION_STATUS.dm);
        a = num;
        String format = String.format("%s_foreground", Integer.valueOf(dpyv.NAVIGATION_STATUS.dm));
        b = format;
        String concat = String.valueOf(num).concat("_2");
        c = concat;
        String concat2 = String.valueOf(format).concat("_1");
        d = concat2;
        e = Integer.toString(dpyv.REVIEW_AT_A_PLACE.dm);
        f = Integer.toString(dpyv.PHOTO_TAKEN.dm);
        g = Integer.toString(dpyv.POST_CONTRIBUTION_IMPACT.dm);
        h = String.format("%s:%s", Integer.valueOf(dpyv.OFF_ROUTE.dm), 4);
        auis h2 = auiu.h(3);
        h2.b(concat2);
        h2.d(R.string.NAVIGATION_CATEGORY_TITLE);
        h2.g(false);
        h2.f(false);
        i = h2.a();
        auis h3 = auiu.h(4);
        h3.b(concat);
        h3.d(R.string.NAVIGATION_URGENT_SETTINGS_TITLE);
        h3.g(false);
        h3.f(false);
        j = h3.a();
    }

    public static dbsg<auio> a(final String str) {
        return dcbg.c(auio.values()).r(new dbsl(str) { // from class: auim
            private final String a;

            {
                this.a = str;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                String str2 = this.a;
                String str3 = auip.a;
                return str2.equals(((auio) obj).G);
            }
        });
    }
}
