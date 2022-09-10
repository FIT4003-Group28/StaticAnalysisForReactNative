package defpackage;

import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahgy  reason: default package */
/* loaded from: classes2.dex */
public abstract class ahgy {
    static final ahgy e = new ahap(baab.FAVORITES, R.string.DEFAULT_LIST_FAVORITES, null, R.raw.localstream_bookmark_favorites_overlay_svg, 2131231722, ibm.T(), iva.b(cqrt.c(R.color.mod_google_pink50), cqrt.c(R.color.mod_night_pink50)), iva.b(cqrt.c(R.color.mod_google_pink100), cqrt.c(R.color.mod_night_pink100)));
    static final ahgy f = new ahap(baab.WANT_TO_GO, R.string.DEFAULT_LIST_WANT_TO_GO, null, R.raw.localstream_bookmark_want_to_go_overlay_svg, 2131231720, ibm.L(), ibm.J(), cqrt.c(R.color.mod_green200));
    static final ahgy g = new ahap(baab.STARRED_PLACES, R.string.DEFAULT_LIST_STARRED_PLACES, null, R.raw.localstream_bookmark_star_overlay_svg, 2131231723, ibm.G(), ibm.F(), cqrt.c(R.color.mod_yellow200));

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ahgy i(String str) {
        return new ahap(baab.CUSTOM, 0, str, R.raw.localstream_bookmark_custom_overlay_svg, 2131231721, ibm.U(), iva.b(cqrt.c(R.color.mod_google_cyan50), cqrt.c(R.color.mod_night_cyan50)), cqrt.c(R.color.mod_cyan200));
    }

    public abstract baab a();

    public abstract int b();

    @dzsi
    public abstract String c();

    public abstract int d();

    public abstract int e();

    public abstract cqss f();

    public abstract cqss g();

    public abstract cqss h();
}
