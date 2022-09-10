package defpackage;
/* compiled from: PG */
/* renamed from: bwde  reason: default package */
/* loaded from: classes4.dex */
public class bwde {
    private final ckmm a;
    private final ckov b;
    private final ckox c;

    public bwde(ckmm ckmmVar, ckov ckovVar, ckox ckoxVar) {
        this.a = ckmmVar;
        this.b = ckovVar;
        this.c = ckoxVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @dzsi
    private final ckoy c(String str, boolean z) {
        char c;
        ckpa ckpaVar;
        dszg dszgVar;
        switch (str.hashCode()) {
            case -1941608309:
                if (str.equals("aGMM.Timeline.Events.Onboarding")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1865042158:
                if (str.equals("aGMM.ProductCatalog")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -773822761:
                if (str.equals("aGMM.EventWebContent")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -408818784:
                if (str.equals("aGMM.Placesheet")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -368257338:
                if (str.equals("aGMM.EventComments")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 328165636:
                if (str.equals("aGMM.PlaceWebContent")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 574437790:
                if (str.equals("aGMM.Timeline.Events")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 594346746:
                if (str.equals("aGMM.LocalOffers")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1192042624:
                if (str.equals("aGMM.Timeline.Receipts")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                if (z) {
                    ckpaVar = ckpa.RECEIPT_WEBVIEW_OPEN_PRELOADED_TO_VISIBLE;
                } else {
                    ckpaVar = ckpa.RECEIPT_WEBVIEW_OPEN_TO_VISIBLE;
                }
                dszgVar = dszg.TIMELINE_RECEIPTS;
                break;
            case 1:
                if (!z) {
                    ckpaVar = ckpa.TIMELINE_EVENTS_WEBVIEW_OPEN_TO_VISIBLE;
                    dszgVar = dszg.TIMELINE_EVENTS;
                    break;
                } else {
                    return null;
                }
            case 2:
                if (z) {
                    ckpaVar = ckpa.TIMELINE_EVENTS_ONBOARDING_WEBVIEW_OPEN_PRELOADED_TO_VISIBLE;
                } else {
                    ckpaVar = ckpa.TIMELINE_EVENTS_ONBOARDING_WEBVIEW_OPEN_TO_VISIBLE;
                }
                dszgVar = dszg.TIMELINE_EVENTS;
                break;
            case 3:
                if (z) {
                    ckpaVar = ckpa.PLACESHEET_WEBVIEW_OPEN_PRELOADED_TO_VISIBLE;
                } else {
                    ckpaVar = ckpa.PLACESHEET_WEBVIEW_OPEN_TO_VISIBLE;
                }
                dszgVar = dszg.PLACE;
                break;
            case 4:
                if (z) {
                    ckpaVar = ckpa.EVENT_COMMENTS_WEBVIEW_OPEN_PRELOADED_TO_VISIBLE;
                } else {
                    ckpaVar = ckpa.EVENT_COMMENTS_WEBVIEW_OPEN_TO_VISIBLE;
                }
                dszgVar = dszg.EXPERIENCE_DETAILS;
                break;
            case 5:
                if (z) {
                    ckpaVar = ckpa.LOCAL_OFFERS_WEBVIEW_OPEN_PRELOADED_TO_VISIBLE;
                } else {
                    ckpaVar = ckpa.LOCAL_OFFERS_WEBVIEW_OPEN_TO_VISIBLE;
                }
                dszgVar = dszg.LOCAL_DEALS;
                break;
            case 6:
                if (z) {
                    ckpaVar = ckpa.PRODUCT_CATALOG_WEBVIEW_OPEN_PRELOADED_TO_VISIBLE;
                } else {
                    ckpaVar = ckpa.PRODUCT_CATALOG_WEBVIEW_OPEN_TO_VISIBLE;
                }
                dszgVar = dszg.LOCAL_PRODUCTS;
                break;
            case 7:
                if (z) {
                    ckpaVar = ckpa.EVENT_WEB_CONTENT_WEBVIEW_OPEN_PRELOADED_TO_VISIBLE;
                } else {
                    ckpaVar = ckpa.EVENT_WEB_CONTENT_WEBVIEW_OPEN_TO_VISIBLE;
                }
                dszgVar = dszg.EXPERIENCE_DETAILS;
                break;
            case '\b':
                if (z) {
                    ckpaVar = ckpa.PLACE_WEB_CONTENT_WEBVIEW_OPEN_PRELOADED_TO_VISIBLE;
                } else {
                    ckpaVar = ckpa.PLACE_WEB_CONTENT_WEBVIEW_OPEN_TO_VISIBLE;
                }
                dszgVar = dszg.PLACE;
                break;
            default:
                return null;
        }
        ckpa ckpaVar2 = ckpaVar;
        dszg dszgVar2 = dszgVar;
        ckoy b = this.b.b(ckpaVar2);
        return b != null ? b : this.c.b(ckpaVar2, dszgVar2, ckow.SELF_MANAGED, false, false, true, true);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @dzsi
    private final ckoy d(String str) {
        char c;
        ckpa ckpaVar;
        dszg dszgVar;
        switch (str.hashCode()) {
            case -1941608309:
                if (str.equals("aGMM.Timeline.Events.Onboarding")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1865042158:
                if (str.equals("aGMM.ProductCatalog")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case -773822761:
                if (str.equals("aGMM.EventWebContent")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -408818784:
                if (str.equals("aGMM.Placesheet")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -368257338:
                if (str.equals("aGMM.EventComments")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 328165636:
                if (str.equals("aGMM.PlaceWebContent")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 574437790:
                if (str.equals("aGMM.Timeline.Events")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 594346746:
                if (str.equals("aGMM.LocalOffers")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1192042624:
                if (str.equals("aGMM.Timeline.Receipts")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                ckpaVar = ckpa.RECEIPT_WEBVIEW_LOAD_TO_DESTROY;
                dszgVar = dszg.TIMELINE_RECEIPTS;
                break;
            case 1:
                ckpaVar = ckpa.TIMELINE_EVENTS_WEBVIEW_LOAD_TO_DESTROY;
                dszgVar = dszg.TIMELINE_EVENTS;
                break;
            case 2:
                ckpaVar = ckpa.TIMELINE_EVENTS_ONBOARDING_WEBVIEW_LOAD_TO_DESTROY;
                dszgVar = dszg.TIMELINE_EVENTS;
                break;
            case 3:
                ckpaVar = ckpa.PLACESHEET_WEBVIEW_LOAD_TO_DESTROY;
                dszgVar = dszg.PLACE;
                break;
            case 4:
                ckpaVar = ckpa.EVENT_COMMENTS_WEBVIEW_LOAD_TO_DESTROY;
                dszgVar = dszg.EXPERIENCE_DETAILS;
                break;
            case 5:
                ckpaVar = ckpa.LOCAL_OFFERS_WEBVIEW_LOAD_TO_DESTROY;
                dszgVar = dszg.LOCAL_DEALS;
                break;
            case 6:
                ckpaVar = ckpa.PRODUCT_CATALOG_WEBVIEW_LOAD_TO_DESTROY;
                dszgVar = dszg.LOCAL_PRODUCTS;
                break;
            case 7:
                ckpaVar = ckpa.EVENT_WEB_CONTENT_WEBVIEW_LOAD_TO_DESTROY;
                dszgVar = dszg.EXPERIENCE_DETAILS;
                break;
            case '\b':
                ckpaVar = ckpa.PLACE_WEB_CONTENT_WEBVIEW_LOAD_TO_DESTROY;
                dszgVar = dszg.PLACE;
                break;
            default:
                return null;
        }
        ckpa ckpaVar2 = ckpaVar;
        dszg dszgVar2 = dszgVar;
        ckoy b = this.b.b(ckpaVar2);
        return b != null ? b : this.c.b(ckpaVar2, dszgVar2, ckow.SELF_MANAGED, true, true, false, false);
    }

    private final void e(String str, bwdd bwddVar, @dzsi int i) {
        bwdd bwddVar2 = bwdd.START_PRELOADING;
        ckoy c = c(str, bwddVar.q == 3);
        if (c != null) {
            c.b(i);
        }
    }

    public final void a(@dzsi String str, bwdd bwddVar) {
        b(str, bwddVar, 0);
    }

    public final void b(@dzsi String str, bwdd bwddVar, @dzsi int i) {
        if (!dbsj.d(str)) {
            this.a.d(String.format("%s.%sEvent", str, bwddVar.p));
            int i2 = bwddVar.q;
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            if (i3 == 1) {
                e(str, bwddVar, i);
                ckoy d = d(str);
                if (d == null) {
                    return;
                }
                d.b(i);
            } else if (i3 == 2) {
                e(str, bwddVar, i);
            } else if (i3 == 3) {
                ckoy c = c(str, true);
                if (c != null) {
                    c.c(0);
                }
                ckoy c2 = c(str, false);
                if (c2 == null) {
                    return;
                }
                c2.c(0);
            } else if (i3 == 4) {
                ckoy d2 = d(str);
                if (d2 == null) {
                    return;
                }
                d2.c(0);
            } else if (i3 != 5 || str.isEmpty()) {
            } else {
                ckoy c3 = c(str, true);
                if (c3 != null) {
                    c3.a();
                }
                ckoy c4 = c(str, false);
                if (c4 != null) {
                    c4.a();
                }
                ckoy d3 = d(str);
                if (d3 == null) {
                    return;
                }
                d3.a();
            }
        }
    }
}
