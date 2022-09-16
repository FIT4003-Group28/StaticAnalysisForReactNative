package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
/* compiled from: PG */
/* renamed from: omh  reason: default package */
/* loaded from: classes3.dex */
public final class omh extends WebChromeClient {
    public static final /* synthetic */ int b = 0;
    public final ViewGroup a;
    private final azpx c = azpm.aI(amon.a);

    public omh(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    public final aynx a() {
        return this.c.i(aynq.BUFFER);
    }

    public final aynx b() {
        return a().C(olg.q).C(olg.i).C(olg.j);
    }

    public final aynx c() {
        return b().C(olg.k);
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        this.c.c(amon.a);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        this.c.c(ampq.j(new omf(view, customViewCallback)));
    }
}
