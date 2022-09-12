package defpackage;
/* compiled from: PG */
/* renamed from: bwdd  reason: default package */
/* loaded from: classes4.dex */
public enum bwdd {
    START_PRELOADING("WebViewStartPreloading", 1),
    START_RECYCLE_PRELOADING("WebViewStartRecyclePreloading", 1),
    OPEN_PRELOADED_IN_DIALOG("WebViewOpenPreloadedInDialog", 3),
    OPEN_PRELOADED_IN_FRAGMENT_FOR_RESULT("WebViewOpenPreloadedInFragmentForResult", 3),
    OPEN_PRELOADED_IN_FRAGMENT("WebViewOpenPreloadedInFragment", 3),
    OPEN_RECYCLE_PRELOADED_IN_DIALOG("WebViewOpenRecyclePreloadedInDialog", 3),
    OPEN_RECYCLE_PRELOADED_IN_FRAGMENT("WebViewOpenRecyclePreloadedInFragment", 3),
    OPEN_FRAGMENT("WebViewOpenFragment", 2),
    OPEN_FRAGMENT_FOR_RESULT("WebViewOpenFragmentForResult", 2),
    OPEN_DIALOG("WebViewOpenDialog", 2),
    CHROMEPLATE_PRELOAD("ChromeplatePreload", 1),
    CHROMEPLATE_OPEN("ChromeplateOpen", 3),
    LOADED_AND_VISIBLE("WebViewLoadedAndVisible", 4),
    LOADED_AND_DESTROYED("WebViewDestroyed", 5),
    UNREGISTER("WebViewError", 6);
    
    public final String p;
    public final int q;

    bwdd(String str, int i) {
        this.p = str;
        this.q = i;
    }
}
