package com.facebook.react.modules.network;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.ValueCallback;
import com.facebook.react.bridge.aj;
import java.net.CookieHandler;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: ForwardingCookieHandler.java */
/* loaded from: classes.dex */
public class b extends CookieHandler {

    /* renamed from: a  reason: collision with root package name */
    private static final boolean f3613a;

    /* renamed from: b  reason: collision with root package name */
    private final a f3614b = new a();

    /* renamed from: c  reason: collision with root package name */
    private final aj f3615c;

    /* renamed from: d  reason: collision with root package name */
    private CookieManager f3616d;

    static {
        f3613a = Build.VERSION.SDK_INT < 21;
    }

    public b(aj ajVar) {
        this.f3615c = ajVar;
    }

    @Override // java.net.CookieHandler
    public Map<String, List<String>> get(URI uri, Map<String, List<String>> map) {
        String cookie = c().getCookie(uri.toString());
        if (TextUtils.isEmpty(cookie)) {
            return Collections.emptyMap();
        }
        return Collections.singletonMap("Cookie", Collections.singletonList(cookie));
    }

    @Override // java.net.CookieHandler
    public void put(URI uri, Map<String, List<String>> map) {
        String uri2 = uri.toString();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null && a(key)) {
                a(uri2, entry.getValue());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.facebook.react.modules.network.b$1] */
    public void a(final com.facebook.react.bridge.d dVar) {
        if (f3613a) {
            new com.facebook.react.bridge.k<Boolean>(this.f3615c) { // from class: com.facebook.react.modules.network.b.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.facebook.react.bridge.k
                /* renamed from: b */
                public Boolean a() {
                    b.this.c().removeAllCookie();
                    b.this.f3614b.a();
                    return true;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.facebook.react.bridge.k
                public void a(Boolean bool) {
                    dVar.a(bool);
                }
            }.execute(new Void[0]);
        } else {
            b(dVar);
        }
    }

    private void b(final com.facebook.react.bridge.d dVar) {
        c().removeAllCookies(new ValueCallback<Boolean>() { // from class: com.facebook.react.modules.network.b.2
            @Override // android.webkit.ValueCallback
            /* renamed from: a */
            public void onReceiveValue(Boolean bool) {
                b.this.f3614b.a();
                dVar.a(bool);
            }
        });
    }

    public void a() {
        if (f3613a) {
            c().removeExpiredCookie();
            this.f3614b.b();
        }
    }

    private void a(final String str, final List<String> list) {
        if (f3613a) {
            a(new Runnable() { // from class: com.facebook.react.modules.network.b.3
                @Override // java.lang.Runnable
                public void run() {
                    for (String str2 : list) {
                        b.this.c().setCookie(str, str2);
                    }
                    b.this.f3614b.a();
                }
            });
            return;
        }
        for (String str2 : list) {
            a(str, str2);
        }
        this.f3614b.a();
    }

    @TargetApi(21)
    private void a(String str, String str2) {
        c().setCookie(str, str2, null);
    }

    private static boolean a(String str) {
        return str.equalsIgnoreCase("Set-cookie") || str.equalsIgnoreCase("Set-cookie2");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.react.modules.network.b$4] */
    public void a(final Runnable runnable) {
        new com.facebook.react.bridge.j<Void, Void>(this.f3615c) { // from class: com.facebook.react.modules.network.b.4
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.react.bridge.j
            /* renamed from: a */
            public void b(Void... voidArr) {
                runnable.run();
            }
        }.execute(new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CookieManager c() {
        if (this.f3616d == null) {
            a(this.f3615c);
            this.f3616d = CookieManager.getInstance();
            if (f3613a) {
                this.f3616d.removeExpiredCookie();
            }
        }
        return this.f3616d;
    }

    private static void a(Context context) {
        if (f3613a) {
            CookieSyncManager.createInstance(context).sync();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ForwardingCookieHandler.java */
    /* loaded from: classes.dex */
    public class a {

        /* renamed from: b  reason: collision with root package name */
        private final Handler f3627b;

        public a() {
            this.f3627b = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.facebook.react.modules.network.b.a.1
                @Override // android.os.Handler.Callback
                public boolean handleMessage(Message message) {
                    if (message.what == 1) {
                        a.this.b();
                        return true;
                    }
                    return false;
                }
            });
        }

        public void a() {
            if (b.f3613a) {
                this.f3627b.sendEmptyMessageDelayed(1, 30000L);
            }
        }

        public void b() {
            this.f3627b.removeMessages(1);
            b.this.a(new Runnable() { // from class: com.facebook.react.modules.network.b.a.2
                @Override // java.lang.Runnable
                public void run() {
                    if (!b.f3613a) {
                        a.this.c();
                    } else {
                        CookieSyncManager.getInstance().sync();
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        @TargetApi(21)
        public void c() {
            b.this.c().flush();
        }
    }
}
