package defpackage;

import android.os.Parcelable;
import android.webkit.WebView;
/* compiled from: PG */
/* renamed from: ftb  reason: default package */
/* loaded from: classes6.dex */
public final class ftb extends bvza {
    final /* synthetic */ ftt a;
    private WebView b;
    private dszg c;
    private dbsg<Parcelable> d;
    private dcdc<bvwz> e;

    public ftb(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.bvza
    public final bvzb a() {
        dxjg.a(this.b, WebView.class);
        dxjg.a(this.c, dszg.class);
        dxjg.a(this.d, dbsg.class);
        dxjg.a(this.e, dcdc.class);
        return new ftd(this.a, this.b, this.c, this.d, this.e);
    }

    @Override // defpackage.bvza, defpackage.bvwt
    /* renamed from: b */
    public final void f(WebView webView) {
        dxjg.b(webView);
        this.b = webView;
    }

    @Override // defpackage.bvza, defpackage.bvwt
    public final /* bridge */ /* synthetic */ void c(dbsg dbsgVar) {
        dxjg.b(dbsgVar);
        this.d = dbsgVar;
    }

    @Override // defpackage.bvza, defpackage.bvwt
    public final /* bridge */ /* synthetic */ void d(dszg dszgVar) {
        dxjg.b(dszgVar);
        this.c = dszgVar;
    }

    @Override // defpackage.bvza, defpackage.bvwt
    public final /* bridge */ /* synthetic */ void e(dcdc dcdcVar) {
        dxjg.b(dcdcVar);
        this.e = dcdcVar;
    }
}
