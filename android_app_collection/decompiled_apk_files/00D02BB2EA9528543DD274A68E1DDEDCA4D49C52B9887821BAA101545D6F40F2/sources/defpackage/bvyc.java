package defpackage;

import android.webkit.CookieManager;
/* compiled from: PG */
/* renamed from: bvyc  reason: default package */
/* loaded from: classes4.dex */
public final class bvyc {
    private final CookieManager a;

    public bvyc(CookieManager cookieManager) {
        this.a = cookieManager;
    }

    public final void a() {
        this.a.removeAllCookies(null);
        this.a.flush();
    }
}
