package com.facebook.react.modules.network;

import java.util.Collections;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;
/* compiled from: ReactCookieJarContainer.java */
/* loaded from: classes.dex */
public class i implements a {

    /* renamed from: a  reason: collision with root package name */
    private CookieJar f3642a = null;

    @Override // com.facebook.react.modules.network.a
    public void a(CookieJar cookieJar) {
        this.f3642a = cookieJar;
    }

    @Override // com.facebook.react.modules.network.a
    public void a() {
        this.f3642a = null;
    }

    @Override // okhttp3.CookieJar
    public void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        if (this.f3642a != null) {
            this.f3642a.saveFromResponse(httpUrl, list);
        }
    }

    @Override // okhttp3.CookieJar
    public List<Cookie> loadForRequest(HttpUrl httpUrl) {
        if (this.f3642a != null) {
            return this.f3642a.loadForRequest(httpUrl);
        }
        return Collections.emptyList();
    }
}
