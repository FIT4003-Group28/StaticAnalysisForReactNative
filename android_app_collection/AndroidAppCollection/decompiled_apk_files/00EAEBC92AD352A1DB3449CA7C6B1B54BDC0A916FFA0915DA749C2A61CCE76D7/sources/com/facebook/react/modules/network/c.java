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
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.GuardedResultAsyncTask;
import com.facebook.react.bridge.ReactContext;
import java.net.CookieHandler;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class c extends CookieHandler {

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f5703d;

    /* renamed from: a  reason: collision with root package name */
    private final e f5704a = new e();

    /* renamed from: b  reason: collision with root package name */
    private final ReactContext f5705b;

    /* renamed from: c  reason: collision with root package name */
    private CookieManager f5706c;

    /* loaded from: classes.dex */
    class a extends GuardedResultAsyncTask<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f5707a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.f5707a = callback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedResultAsyncTask
        /* renamed from: a */
        public void onPostExecuteGuarded(Boolean bool) {
            this.f5707a.invoke(bool);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.facebook.react.bridge.GuardedResultAsyncTask
        /* renamed from: doInBackgroundGuarded */
        public Boolean mo212doInBackgroundGuarded() {
            CookieManager c2 = c.this.c();
            if (c2 != null) {
                c2.removeAllCookie();
            }
            c.this.f5704a.a();
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements ValueCallback<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f5709a;

        b(Callback callback) {
            this.f5709a = callback;
        }

        @Override // android.webkit.ValueCallback
        /* renamed from: a */
        public void onReceiveValue(Boolean bool) {
            c.this.f5704a.a();
            this.f5709a.invoke(bool);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.react.modules.network.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0130c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f5711b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CookieManager f5712c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f5713d;

        RunnableC0130c(List list, CookieManager cookieManager, String str) {
            this.f5711b = list;
            this.f5712c = cookieManager;
            this.f5713d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (String str : this.f5711b) {
                this.f5712c.setCookie(this.f5713d, str);
            }
            c.this.f5704a.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f5715a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(c cVar, ReactContext reactContext, Runnable runnable) {
            super(reactContext);
            this.f5715a = runnable;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            this.f5715a.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f5716a;

        /* loaded from: classes.dex */
        class a implements Handler.Callback {
            a(c cVar) {
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message.what == 1) {
                    e.this.b();
                    return true;
                }
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (c.f5703d) {
                    CookieSyncManager.getInstance().sync();
                } else {
                    e.this.c();
                }
            }
        }

        public e() {
            this.f5716a = new Handler(Looper.getMainLooper(), new a(c.this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        @TargetApi(21)
        public void c() {
            CookieManager c2 = c.this.c();
            if (c2 != null) {
                c2.flush();
            }
        }

        public void a() {
            if (c.f5703d) {
                this.f5716a.sendEmptyMessageDelayed(1, 30000L);
            }
        }

        public void b() {
            this.f5716a.removeMessages(1);
            c.this.a(new b());
        }
    }

    static {
        f5703d = Build.VERSION.SDK_INT < 21;
    }

    public c(ReactContext reactContext) {
        this.f5705b = reactContext;
    }

    private static void a(Context context) {
        if (f5703d) {
            CookieSyncManager.createInstance(context).sync();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Runnable runnable) {
        new d(this, this.f5705b, runnable).execute(new Void[0]);
    }

    @TargetApi(21)
    private void a(String str, String str2) {
        CookieManager c2 = c();
        if (c2 != null) {
            c2.setCookie(str, str2, null);
        }
    }

    private static boolean a(String str) {
        return str.equalsIgnoreCase("Set-cookie") || str.equalsIgnoreCase("Set-cookie2");
    }

    private void b(Callback callback) {
        CookieManager c2 = c();
        if (c2 != null) {
            c2.removeAllCookies(new b(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CookieManager c() {
        if (this.f5706c == null) {
            a(this.f5705b);
            try {
                this.f5706c = CookieManager.getInstance();
                if (f5703d) {
                    this.f5706c.removeExpiredCookie();
                }
            } catch (IllegalArgumentException unused) {
                return null;
            } catch (Exception e2) {
                if (e2.getMessage() != null && e2.getClass().getCanonicalName().equals("android.webkit.WebViewFactory.MissingWebViewPackageException")) {
                    return null;
                }
                throw e2;
            }
        }
        return this.f5706c;
    }

    public void a() {
        if (f5703d) {
            CookieManager c2 = c();
            if (c2 != null) {
                c2.removeExpiredCookie();
            }
            this.f5704a.b();
        }
    }

    public void a(Callback callback) {
        if (f5703d) {
            new a(this.f5705b, callback).execute(new Void[0]);
        } else {
            b(callback);
        }
    }

    public void a(String str, List<String> list) {
        CookieManager c2 = c();
        if (c2 == null) {
            return;
        }
        if (f5703d) {
            a(new RunnableC0130c(list, c2, str));
            return;
        }
        for (String str2 : list) {
            a(str, str2);
        }
        c2.flush();
        this.f5704a.a();
    }

    @Override // java.net.CookieHandler
    public Map<String, List<String>> get(URI uri, Map<String, List<String>> map) {
        CookieManager c2 = c();
        if (c2 == null) {
            return Collections.emptyMap();
        }
        String cookie = c2.getCookie(uri.toString());
        return TextUtils.isEmpty(cookie) ? Collections.emptyMap() : Collections.singletonMap("Cookie", Collections.singletonList(cookie));
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
}
