package c.d.j.b.a;

import android.os.Looper;
import android.os.SystemClock;
import c.d.j.k.d;
import c.d.j.n.e;
import c.d.j.n.f0;
import c.d.j.n.k;
import c.d.j.n.k0;
import c.d.j.n.s;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
/* loaded from: classes.dex */
public class b extends c.d.j.n.c<c> {

    /* renamed from: a  reason: collision with root package name */
    private final Call.Factory f3160a;

    /* renamed from: b  reason: collision with root package name */
    private final CacheControl f3161b;

    /* renamed from: c  reason: collision with root package name */
    private Executor f3162c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Call f3163a;

        /* renamed from: c.d.j.b.a.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0081a implements Runnable {
            RunnableC0081a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f3163a.cancel();
            }
        }

        a(Call call) {
            this.f3163a = call;
        }

        @Override // c.d.j.n.l0
        public void a() {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                this.f3163a.cancel();
            } else {
                b.this.f3162c.execute(new RunnableC0081a());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c.d.j.b.a.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0082b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f3166a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f0.a f3167b;

        C0082b(c cVar, f0.a aVar) {
            this.f3166a = cVar;
            this.f3167b = aVar;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            b.this.a(call, iOException, this.f3167b);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            this.f3166a.f3170g = SystemClock.elapsedRealtime();
            ResponseBody body = response.body();
            try {
                try {
                } catch (Exception e2) {
                    b.this.a(call, e2, this.f3167b);
                }
                if (!response.isSuccessful()) {
                    b.this.a(call, new IOException("Unexpected HTTP code " + response), this.f3167b);
                    return;
                }
                c.d.j.e.a a2 = c.d.j.e.a.a(response.header("Content-Range"));
                if (a2 != null && (a2.f3244a != 0 || a2.f3245b != Integer.MAX_VALUE)) {
                    this.f3166a.a(a2);
                    this.f3166a.a(8);
                }
                long contentLength = body.contentLength();
                if (contentLength < 0) {
                    contentLength = 0;
                }
                this.f3167b.a(body.byteStream(), (int) contentLength);
            } finally {
                body.close();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends s {

        /* renamed from: f  reason: collision with root package name */
        public long f3169f;

        /* renamed from: g  reason: collision with root package name */
        public long f3170g;

        /* renamed from: h  reason: collision with root package name */
        public long f3171h;

        public c(k<d> kVar, k0 k0Var) {
            super(kVar, k0Var);
        }
    }

    public b(Call.Factory factory, Executor executor) {
        this(factory, executor, true);
    }

    public b(Call.Factory factory, Executor executor, boolean z) {
        this.f3160a = factory;
        this.f3162c = executor;
        this.f3161b = z ? new CacheControl.Builder().noStore().build() : null;
    }

    public b(OkHttpClient okHttpClient) {
        this(okHttpClient, okHttpClient.dispatcher().executorService());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Call call, Exception exc, f0.a aVar) {
        if (call.isCanceled()) {
            aVar.a();
        } else {
            aVar.a(exc);
        }
    }

    @Override // c.d.j.n.f0
    /* renamed from: a */
    public c mo144a(k<d> kVar, k0 k0Var) {
        return new c(kVar, k0Var);
    }

    @Override // c.d.j.n.f0
    /* renamed from: a  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ s mo144a(k kVar, k0 k0Var) {
        return mo144a((k<d>) kVar, k0Var);
    }

    @Override // c.d.j.n.f0
    /* renamed from: a */
    public Map<String, String> b(c cVar, int i) {
        HashMap hashMap = new HashMap(4);
        hashMap.put("queue_time", Long.toString(cVar.f3170g - cVar.f3169f));
        hashMap.put("fetch_time", Long.toString(cVar.f3171h - cVar.f3170g));
        hashMap.put("total_time", Long.toString(cVar.f3171h - cVar.f3169f));
        hashMap.put("image_size", Integer.toString(i));
        return hashMap;
    }

    @Override // c.d.j.n.f0
    public void a(c cVar, f0.a aVar) {
        cVar.f3169f = SystemClock.elapsedRealtime();
        try {
            Request.Builder builder = new Request.Builder().url(cVar.h().toString()).get();
            if (this.f3161b != null) {
                builder.cacheControl(this.f3161b);
            }
            c.d.j.e.a a2 = cVar.b().f().a();
            if (a2 != null) {
                builder.addHeader("Range", a2.a());
            }
            a(cVar, aVar, builder.build());
        } catch (Exception e2) {
            aVar.a(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(c cVar, f0.a aVar, Request request) {
        Call newCall = this.f3160a.newCall(request);
        cVar.b().a(new a(newCall));
        newCall.enqueue(new C0082b(cVar, aVar));
    }

    @Override // c.d.j.n.f0
    /* renamed from: b */
    public void a(c cVar, int i) {
        cVar.f3171h = SystemClock.elapsedRealtime();
    }
}
