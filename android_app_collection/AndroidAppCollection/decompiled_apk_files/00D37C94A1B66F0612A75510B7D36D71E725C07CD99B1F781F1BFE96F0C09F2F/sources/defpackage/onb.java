package defpackage;

import android.webkit.WebView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
/* compiled from: PG */
/* renamed from: onb  reason: default package */
/* loaded from: classes3.dex */
public final class onb {
    public static final Object a = new Object();
    public final WebView b;
    public final SwipeRefreshLayout c;
    public final omn d;
    public final aynx e;

    public onb(WebView webView, final SwipeRefreshLayout swipeRefreshLayout, omn omnVar) {
        this.b = webView;
        swipeRefreshLayout.g = zew.i(swipeRefreshLayout.getResources().getDisplayMetrics(), 120);
        swipeRefreshLayout.d.invalidate();
        this.c = swipeRefreshLayout;
        this.d = omnVar;
        this.e = aynx.k(new aynz() { // from class: omw
            @Override // defpackage.aynz
            public final void a(final ayny aynyVar) {
                final SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                swipeRefreshLayout2.a = new bmp() { // from class: omv
                    @Override // defpackage.bmp
                    public final void a() {
                        ayny.this.a(onb.a);
                    }
                };
                aynyVar.d(banl.n(new aypv() { // from class: omx
                    @Override // defpackage.aypv
                    public final void a() {
                        SwipeRefreshLayout.this.a = null;
                    }
                }));
            }
        }, aynq.LATEST).L();
    }
}
