package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.text.TextUtils;
import c.b.b.a.a;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class e extends com.android.billingclient.api.d {

    /* renamed from: a  reason: collision with root package name */
    private int f5004a;

    /* renamed from: b  reason: collision with root package name */
    private final String f5005b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f5006c;

    /* renamed from: d  reason: collision with root package name */
    private final com.android.billingclient.api.c f5007d;

    /* renamed from: e  reason: collision with root package name */
    private final Context f5008e;

    /* renamed from: f  reason: collision with root package name */
    private final int f5009f;

    /* renamed from: g  reason: collision with root package name */
    private final int f5010g;

    /* renamed from: h  reason: collision with root package name */
    private c.b.b.a.a f5011h;
    private r i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private final boolean p;
    private ExecutorService q;
    private final ResultReceiver r;

    /* loaded from: classes.dex */
    class a implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5012a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ List f5013b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.android.billingclient.api.p f5014c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.android.billingclient.api.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0109a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ SkuDetails.a f5016b;

            RunnableC0109a(SkuDetails.a aVar) {
                this.f5016b = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.android.billingclient.api.p pVar = a.this.f5014c;
                h.b c2 = com.android.billingclient.api.h.c();
                c2.a(this.f5016b.b());
                c2.a(this.f5016b.a());
                pVar.a(c2.a(), this.f5016b.c());
            }
        }

        a(String str, List list, com.android.billingclient.api.p pVar) {
            this.f5012a = str;
            this.f5013b = list;
            this.f5014c = pVar;
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            e.this.a(new RunnableC0109a(e.this.a(this.f5012a, this.f5013b)));
            return null;
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.android.billingclient.api.p f5018b;

        b(e eVar, com.android.billingclient.api.p pVar) {
            this.f5018b = pVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5018b.a(com.android.billingclient.api.i.o, null);
        }
    }

    /* loaded from: classes.dex */
    class c implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.android.billingclient.api.j f5019a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.android.billingclient.api.k f5020b;

        c(com.android.billingclient.api.j jVar, com.android.billingclient.api.k kVar) {
            this.f5019a = jVar;
            this.f5020b = kVar;
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            e.this.b(this.f5019a, this.f5020b);
            return null;
        }
    }

    /* loaded from: classes.dex */
    class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.android.billingclient.api.k f5022b;

        d(e eVar, com.android.billingclient.api.k kVar) {
            this.f5022b = kVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5022b.a(com.android.billingclient.api.i.o, null);
        }
    }

    /* renamed from: com.android.billingclient.api.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class CallableC0110e implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5023a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.android.billingclient.api.m f5024b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.android.billingclient.api.e$e$a */
        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ s f5026b;

            a(s sVar) {
                this.f5026b = sVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                CallableC0110e.this.f5024b.a(this.f5026b.a(), this.f5026b.b());
            }
        }

        CallableC0110e(String str, com.android.billingclient.api.m mVar) {
            this.f5023a = str;
            this.f5024b = mVar;
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            e.this.a(new a(e.this.b(this.f5023a)));
            return null;
        }
    }

    /* loaded from: classes.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.android.billingclient.api.m f5028b;

        f(e eVar, com.android.billingclient.api.m mVar) {
            this.f5028b = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5028b.a(com.android.billingclient.api.i.o, null);
        }
    }

    /* loaded from: classes.dex */
    class g implements Callable<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.android.billingclient.api.a f5029a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.android.billingclient.api.b f5030b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Exception f5032b;

            a(Exception exc) {
                this.f5032b = exc;
            }

            @Override // java.lang.Runnable
            public void run() {
                c.b.a.a.a.c("BillingClient", "Error acknowledge purchase; ex: " + this.f5032b);
                g.this.f5030b.a(com.android.billingclient.api.i.n);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class b implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f5034b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ String f5035c;

            b(int i, String str) {
                this.f5034b = i;
                this.f5035c = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                com.android.billingclient.api.b bVar = g.this.f5030b;
                h.b c2 = com.android.billingclient.api.h.c();
                c2.a(this.f5034b);
                c2.a(this.f5035c);
                bVar.a(c2.a());
            }
        }

        g(com.android.billingclient.api.a aVar, com.android.billingclient.api.b bVar) {
            this.f5029a = aVar;
            this.f5030b = bVar;
        }

        @Override // java.util.concurrent.Callable
        public Void call() {
            try {
                Bundle a2 = e.this.f5011h.a(9, e.this.f5008e.getPackageName(), this.f5029a.b(), c.b.a.a.a.a(this.f5029a, e.this.f5005b));
                e.this.a(new b(c.b.a.a.a.b(a2, "BillingClient"), c.b.a.a.a.a(a2, "BillingClient")));
                return null;
            } catch (Exception e2) {
                e.this.a(new a(e2));
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.android.billingclient.api.b f5037b;

        h(e eVar, com.android.billingclient.api.b bVar) {
            this.f5037b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5037b.a(com.android.billingclient.api.i.o);
        }
    }

    /* loaded from: classes.dex */
    class i extends ResultReceiver {
        i(Handler handler) {
            super(handler);
        }

        @Override // android.os.ResultReceiver
        public void onReceiveResult(int i, Bundle bundle) {
            com.android.billingclient.api.n b2 = e.this.f5007d.b();
            if (b2 == null) {
                c.b.a.a.a.c("BillingClient", "PurchasesUpdatedListener is null - no way to return the response.");
                return;
            }
            List<Purchase> a2 = c.b.a.a.a.a(bundle);
            h.b c2 = com.android.billingclient.api.h.c();
            c2.a(i);
            c2.a(c.b.a.a.a.a(bundle, "BillingClient"));
            b2.onPurchasesUpdated(c2.a(), a2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Future f5039b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Runnable f5040c;

        j(e eVar, Future future, Runnable runnable) {
            this.f5039b = future;
            this.f5040c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f5039b.isDone() || this.f5039b.isCancelled()) {
                return;
            }
            this.f5039b.cancel(true);
            c.b.a.a.a.c("BillingClient", "Async task is taking too long, cancel it!");
            Runnable runnable = this.f5040c;
            if (runnable == null) {
                return;
            }
            runnable.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class k implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.android.billingclient.api.k f5041b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.android.billingclient.api.h f5042c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f5043d;

        k(e eVar, com.android.billingclient.api.k kVar, com.android.billingclient.api.h hVar, String str) {
            this.f5041b = kVar;
            this.f5042c = hVar;
            this.f5043d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.b.a.a.a.b("BillingClient", "Successfully consumed purchase.");
            this.f5041b.a(this.f5042c, this.f5043d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class l implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f5044b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.android.billingclient.api.k f5045c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.android.billingclient.api.h f5046d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f5047e;

        l(e eVar, int i, com.android.billingclient.api.k kVar, com.android.billingclient.api.h hVar, String str) {
            this.f5044b = i;
            this.f5045c = kVar;
            this.f5046d = hVar;
            this.f5047e = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.b.a.a.a.c("BillingClient", "Error consuming purchase with token. Response code: " + this.f5044b);
            this.f5045c.a(this.f5046d, this.f5047e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class m implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Exception f5048b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.android.billingclient.api.k f5049c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f5050d;

        m(e eVar, Exception exc, com.android.billingclient.api.k kVar, String str) {
            this.f5048b = exc;
            this.f5049c = kVar;
            this.f5050d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.b.a.a.a.c("BillingClient", "Error consuming purchase; ex: " + this.f5048b);
            this.f5049c.a(com.android.billingclient.api.i.n, this.f5050d);
        }
    }

    /* loaded from: classes.dex */
    class n implements Callable<Bundle> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f5051a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f5052b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f5053c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Bundle f5054d;

        n(int i, String str, String str2, Bundle bundle) {
            this.f5051a = i;
            this.f5052b = str;
            this.f5053c = str2;
            this.f5054d = bundle;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        /* renamed from: call */
        public Bundle mo174call() {
            return e.this.f5011h.a(this.f5051a, e.this.f5008e.getPackageName(), this.f5052b, this.f5053c, (String) null, this.f5054d);
        }
    }

    /* loaded from: classes.dex */
    class o implements Callable<Bundle> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.android.billingclient.api.g f5056a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f5057b;

        o(com.android.billingclient.api.g gVar, String str) {
            this.f5056a = gVar;
            this.f5057b = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        /* renamed from: call */
        public Bundle mo175call() {
            return e.this.f5011h.a(5, e.this.f5008e.getPackageName(), Arrays.asList(this.f5056a.c()), this.f5057b, "subs", (String) null);
        }
    }

    /* loaded from: classes.dex */
    class p implements Callable<Bundle> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5059a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f5060b;

        p(String str, String str2) {
            this.f5059a = str;
            this.f5060b = str2;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        /* renamed from: call */
        public Bundle mo176call() {
            return e.this.f5011h.a(3, e.this.f5008e.getPackageName(), this.f5059a, this.f5060b, (String) null);
        }
    }

    /* loaded from: classes.dex */
    class q implements Callable<Purchase.a> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f5062a;

        q(String str) {
            this.f5062a = str;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        /* renamed from: call */
        public Purchase.a mo177call() {
            return e.this.c(this.f5062a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class r implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        private final Object f5064a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f5065b;

        /* renamed from: c  reason: collision with root package name */
        private com.android.billingclient.api.f f5066c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ com.android.billingclient.api.h f5068b;

            a(com.android.billingclient.api.h hVar) {
                this.f5068b = hVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (r.this.f5064a) {
                    if (r.this.f5066c != null) {
                        r.this.f5066c.a(this.f5068b);
                    }
                }
            }
        }

        /* loaded from: classes.dex */
        class b implements Callable<Void> {
            b() {
            }

            /* JADX WARN: Removed duplicated region for block: B:63:0x00ea  */
            /* JADX WARN: Removed duplicated region for block: B:64:0x00ed  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public java.lang.Void call() {
                /*
                    Method dump skipped, instructions count: 246
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.e.r.b.call():java.lang.Void");
            }
        }

        /* loaded from: classes.dex */
        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.f5004a = 0;
                e.this.f5011h = null;
                r.this.a(com.android.billingclient.api.i.o);
            }
        }

        private r(com.android.billingclient.api.f fVar) {
            this.f5064a = new Object();
            this.f5065b = false;
            this.f5066c = fVar;
        }

        /* synthetic */ r(e eVar, com.android.billingclient.api.f fVar, i iVar) {
            this(fVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(com.android.billingclient.api.h hVar) {
            e.this.a(new a(hVar));
        }

        void a() {
            synchronized (this.f5064a) {
                this.f5066c = null;
                this.f5065b = true;
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            c.b.a.a.a.b("BillingClient", "Billing service connected.");
            e.this.f5011h = a.AbstractBinderC0066a.a(iBinder);
            if (e.this.a(new b(), 30000L, new c()) == null) {
                a(e.this.c());
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            c.b.a.a.a.c("BillingClient", "Billing service disconnected.");
            e.this.f5011h = null;
            e.this.f5004a = 0;
            synchronized (this.f5064a) {
                if (this.f5066c != null) {
                    this.f5066c.a();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class s {

        /* renamed from: a  reason: collision with root package name */
        private List<PurchaseHistoryRecord> f5072a;

        /* renamed from: b  reason: collision with root package name */
        private com.android.billingclient.api.h f5073b;

        s(com.android.billingclient.api.h hVar, List<PurchaseHistoryRecord> list) {
            this.f5072a = list;
            this.f5073b = hVar;
        }

        com.android.billingclient.api.h a() {
            return this.f5073b;
        }

        List<PurchaseHistoryRecord> b() {
            return this.f5072a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(Context context, int i2, int i3, boolean z, com.android.billingclient.api.n nVar) {
        this(context, i2, i3, z, nVar, "2.0.3");
    }

    private e(Context context, int i2, int i3, boolean z, com.android.billingclient.api.n nVar, String str) {
        this.f5004a = 0;
        this.f5006c = new Handler(Looper.getMainLooper());
        this.r = new i(this.f5006c);
        this.f5008e = context.getApplicationContext();
        this.f5009f = i2;
        this.f5010g = i3;
        this.p = z;
        this.f5007d = new com.android.billingclient.api.c(this.f5008e, nVar);
        this.f5005b = str;
    }

    private com.android.billingclient.api.h a(com.android.billingclient.api.h hVar) {
        this.f5007d.b().onPurchasesUpdated(hVar, null);
        return hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> Future<T> a(Callable<T> callable, long j2, Runnable runnable) {
        long j3 = (long) (j2 * 0.95d);
        if (this.q == null) {
            this.q = Executors.newFixedThreadPool(c.b.a.a.a.f2714a);
        }
        try {
            Future<T> submit = this.q.submit(callable);
            this.f5006c.postDelayed(new j(this, submit, runnable), j3);
            return submit;
        } catch (Exception e2) {
            c.b.a.a.a.c("BillingClient", "Async task throws exception " + e2);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Runnable runnable) {
        if (Thread.interrupted()) {
            return;
        }
        this.f5006c.post(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public s b(String str) {
        c.b.a.a.a.b("BillingClient", "Querying purchase history, item type: " + str);
        ArrayList arrayList = new ArrayList();
        Bundle b2 = c.b.a.a.a.b(this.n, this.p, this.f5005b);
        String str2 = null;
        do {
            try {
                if (!this.l) {
                    c.b.a.a.a.c("BillingClient", "getPurchaseHistory is not supported on current device");
                    return new s(com.android.billingclient.api.i.f5097h, null);
                }
                Bundle b3 = this.f5011h.b(6, this.f5008e.getPackageName(), str, str2, b2);
                com.android.billingclient.api.h a2 = com.android.billingclient.api.l.a(b3, "BillingClient", "getPurchaseHistory()");
                if (a2 != com.android.billingclient.api.i.m) {
                    return new s(a2, null);
                }
                ArrayList<String> stringArrayList = b3.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = b3.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = b3.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                for (int i2 = 0; i2 < stringArrayList2.size(); i2++) {
                    String str3 = stringArrayList2.get(i2);
                    String str4 = stringArrayList3.get(i2);
                    c.b.a.a.a.b("BillingClient", "Purchase record found for sku : " + stringArrayList.get(i2));
                    try {
                        PurchaseHistoryRecord purchaseHistoryRecord = new PurchaseHistoryRecord(str3, str4);
                        if (TextUtils.isEmpty(purchaseHistoryRecord.d())) {
                            c.b.a.a.a.c("BillingClient", "BUG: empty/null token!");
                        }
                        arrayList.add(purchaseHistoryRecord);
                    } catch (JSONException e2) {
                        c.b.a.a.a.c("BillingClient", "Got an exception trying to decode the purchase: " + e2);
                        return new s(com.android.billingclient.api.i.j, null);
                    }
                }
                str2 = b3.getString("INAPP_CONTINUATION_TOKEN");
                c.b.a.a.a.b("BillingClient", "Continuation token: " + str2);
            } catch (RemoteException e3) {
                c.b.a.a.a.c("BillingClient", "Got exception trying to get purchase history: " + e3 + "; try to reconnect");
                return new s(com.android.billingclient.api.i.n, null);
            }
        } while (!TextUtils.isEmpty(str2));
        return new s(com.android.billingclient.api.i.m, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.android.billingclient.api.j jVar, com.android.billingclient.api.k kVar) {
        int b2;
        String str;
        String b3 = jVar.b();
        try {
            c.b.a.a.a.b("BillingClient", "Consuming purchase with token: " + b3);
            if (this.n) {
                Bundle c2 = this.f5011h.c(9, this.f5008e.getPackageName(), b3, c.b.a.a.a.a(jVar, this.n, this.f5005b));
                int i2 = c2.getInt("RESPONSE_CODE");
                str = c.b.a.a.a.a(c2, "BillingClient");
                b2 = i2;
            } else {
                b2 = this.f5011h.b(3, this.f5008e.getPackageName(), b3);
                str = "";
            }
            h.b c3 = com.android.billingclient.api.h.c();
            c3.a(b2);
            c3.a(str);
            com.android.billingclient.api.h a2 = c3.a();
            a(b2 == 0 ? new k(this, kVar, a2, b3) : new l(this, b2, kVar, a2, b3));
        } catch (Exception e2) {
            a(new m(this, e2, kVar, b3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Purchase.a c(String str) {
        c.b.a.a.a.b("BillingClient", "Querying owned items, item type: " + str);
        ArrayList arrayList = new ArrayList();
        Bundle b2 = c.b.a.a.a.b(this.n, this.p, this.f5005b);
        String str2 = null;
        do {
            try {
                Bundle a2 = this.n ? this.f5011h.a(9, this.f5008e.getPackageName(), str, str2, b2) : this.f5011h.a(3, this.f5008e.getPackageName(), str, str2);
                com.android.billingclient.api.h a3 = com.android.billingclient.api.l.a(a2, "BillingClient", "getPurchase()");
                if (a3 != com.android.billingclient.api.i.m) {
                    return new Purchase.a(a3, null);
                }
                ArrayList<String> stringArrayList = a2.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
                ArrayList<String> stringArrayList2 = a2.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList3 = a2.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                for (int i2 = 0; i2 < stringArrayList2.size(); i2++) {
                    String str3 = stringArrayList2.get(i2);
                    String str4 = stringArrayList3.get(i2);
                    c.b.a.a.a.b("BillingClient", "Sku is owned: " + stringArrayList.get(i2));
                    try {
                        Purchase purchase = new Purchase(str3, str4);
                        if (TextUtils.isEmpty(purchase.f())) {
                            c.b.a.a.a.c("BillingClient", "BUG: empty/null token!");
                        }
                        arrayList.add(purchase);
                    } catch (JSONException e2) {
                        c.b.a.a.a.c("BillingClient", "Got an exception trying to decode the purchase: " + e2);
                        return new Purchase.a(com.android.billingclient.api.i.j, null);
                    }
                }
                str2 = a2.getString("INAPP_CONTINUATION_TOKEN");
                c.b.a.a.a.b("BillingClient", "Continuation token: " + str2);
            } catch (Exception e3) {
                c.b.a.a.a.c("BillingClient", "Got exception trying to get purchases: " + e3 + "; try to reconnect");
                return new Purchase.a(com.android.billingclient.api.i.n, null);
            }
        } while (!TextUtils.isEmpty(str2));
        return new Purchase.a(com.android.billingclient.api.i.m, arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.android.billingclient.api.h c() {
        int i2 = this.f5004a;
        return (i2 == 0 || i2 == 3) ? com.android.billingclient.api.i.n : com.android.billingclient.api.i.j;
    }

    @Override // com.android.billingclient.api.d
    public Purchase.a a(String str) {
        if (!b()) {
            return new Purchase.a(com.android.billingclient.api.i.n, null);
        }
        if (TextUtils.isEmpty(str)) {
            c.b.a.a.a.c("BillingClient", "Please provide a valid SKU type.");
            return new Purchase.a(com.android.billingclient.api.i.f5095f, null);
        }
        try {
            return (Purchase.a) a(new q(str), 5000L, (Runnable) null).get(5000L, TimeUnit.MILLISECONDS);
        } catch (CancellationException | TimeoutException unused) {
            return new Purchase.a(com.android.billingclient.api.i.o, null);
        } catch (Exception unused2) {
            return new Purchase.a(com.android.billingclient.api.i.j, null);
        }
    }

    SkuDetails.a a(String str, List<String> list) {
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 20;
            ArrayList<String> arrayList2 = new ArrayList<>(list.subList(i2, i3 > size ? size : i3));
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList2);
            bundle.putString("playBillingLibraryVersion", this.f5005b);
            try {
                Bundle a2 = this.o ? this.f5011h.a(10, this.f5008e.getPackageName(), str, bundle, c.b.a.a.a.a(this.n, this.p, this.f5005b)) : this.f5011h.b(3, this.f5008e.getPackageName(), str, bundle);
                if (a2 == null) {
                    c.b.a.a.a.c("BillingClient", "querySkuDetailsAsync got null sku details list");
                    return new SkuDetails.a(4, "Null sku details list", null);
                } else if (!a2.containsKey("DETAILS_LIST")) {
                    int b2 = c.b.a.a.a.b(a2, "BillingClient");
                    String a3 = c.b.a.a.a.a(a2, "BillingClient");
                    if (b2 == 0) {
                        c.b.a.a.a.c("BillingClient", "getSkuDetails() returned a bundle with neither an error nor a detail list.");
                        return new SkuDetails.a(6, a3, arrayList);
                    }
                    c.b.a.a.a.c("BillingClient", "getSkuDetails() failed. Response code: " + b2);
                    return new SkuDetails.a(b2, a3, arrayList);
                } else {
                    ArrayList<String> stringArrayList = a2.getStringArrayList("DETAILS_LIST");
                    if (stringArrayList == null) {
                        c.b.a.a.a.c("BillingClient", "querySkuDetailsAsync got null response list");
                        return new SkuDetails.a(4, "querySkuDetailsAsync got null response list", null);
                    }
                    for (int i4 = 0; i4 < stringArrayList.size(); i4++) {
                        try {
                            SkuDetails skuDetails = new SkuDetails(stringArrayList.get(i4));
                            c.b.a.a.a.b("BillingClient", "Got sku details: " + skuDetails);
                            arrayList.add(skuDetails);
                        } catch (JSONException unused) {
                            c.b.a.a.a.c("BillingClient", "Got a JSON exception trying to decode SkuDetails.");
                            return new SkuDetails.a(6, "Error trying to decode SkuDetails.", null);
                        }
                    }
                    i2 = i3;
                }
            } catch (Exception e2) {
                c.b.a.a.a.c("BillingClient", "querySkuDetailsAsync got a remote exception (try to reconnect)." + e2);
                return new SkuDetails.a(-1, "Service connection is disconnected.", null);
            }
        }
        return new SkuDetails.a(0, "", arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0123 A[Catch: Exception -> 0x0166, CancellationException | TimeoutException -> 0x017f, TryCatch #2 {CancellationException | TimeoutException -> 0x017f, Exception -> 0x0166, blocks: (B:64:0x0111, B:66:0x0123, B:68:0x0149), top: B:73:0x0111 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0149 A[Catch: Exception -> 0x0166, CancellationException | TimeoutException -> 0x017f, TRY_LEAVE, TryCatch #2 {CancellationException | TimeoutException -> 0x017f, Exception -> 0x0166, blocks: (B:64:0x0111, B:66:0x0123, B:68:0x0149), top: B:73:0x0111 }] */
    @Override // com.android.billingclient.api.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.android.billingclient.api.h a(android.app.Activity r14, com.android.billingclient.api.g r15) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.e.a(android.app.Activity, com.android.billingclient.api.g):com.android.billingclient.api.h");
    }

    @Override // com.android.billingclient.api.d
    public void a() {
        try {
            try {
                this.f5007d.a();
                if (this.i != null) {
                    this.i.a();
                }
                if (this.i != null && this.f5011h != null) {
                    c.b.a.a.a.b("BillingClient", "Unbinding from service.");
                    this.f5008e.unbindService(this.i);
                    this.i = null;
                }
                this.f5011h = null;
                if (this.q != null) {
                    this.q.shutdownNow();
                    this.q = null;
                }
            } catch (Exception e2) {
                c.b.a.a.a.c("BillingClient", "There was an exception while ending connection: " + e2);
            }
        } finally {
            this.f5004a = 3;
        }
    }

    @Override // com.android.billingclient.api.d
    public void a(com.android.billingclient.api.a aVar, com.android.billingclient.api.b bVar) {
        com.android.billingclient.api.h hVar;
        if (!b()) {
            hVar = com.android.billingclient.api.i.n;
        } else if (TextUtils.isEmpty(aVar.b())) {
            c.b.a.a.a.c("BillingClient", "Please provide a valid purchase token.");
            hVar = com.android.billingclient.api.i.i;
        } else if (this.n) {
            if (a(new g(aVar, bVar), 30000L, new h(this, bVar)) != null) {
                return;
            }
            bVar.a(c());
            return;
        } else {
            hVar = com.android.billingclient.api.i.f5091b;
        }
        bVar.a(hVar);
    }

    @Override // com.android.billingclient.api.d
    public void a(com.android.billingclient.api.f fVar) {
        ResolveInfo resolveInfo;
        ServiceInfo serviceInfo;
        String str;
        if (b()) {
            c.b.a.a.a.b("BillingClient", "Service connection is valid. No need to re-initialize.");
            fVar.a(com.android.billingclient.api.i.m);
            return;
        }
        int i2 = this.f5004a;
        if (i2 == 1) {
            c.b.a.a.a.c("BillingClient", "Client is already in the process of connecting to billing service.");
            fVar.a(com.android.billingclient.api.i.f5093d);
        } else if (i2 == 3) {
            c.b.a.a.a.c("BillingClient", "Client was already closed and can't be reused. Please create another instance.");
            fVar.a(com.android.billingclient.api.i.n);
        } else {
            this.f5004a = 1;
            this.f5007d.c();
            c.b.a.a.a.b("BillingClient", "Starting in-app billing setup.");
            this.i = new r(this, fVar, null);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            List<ResolveInfo> queryIntentServices = this.f5008e.getPackageManager().queryIntentServices(intent, 0);
            if (queryIntentServices != null && !queryIntentServices.isEmpty() && (serviceInfo = (resolveInfo = queryIntentServices.get(0)).serviceInfo) != null) {
                String str2 = serviceInfo.packageName;
                String str3 = resolveInfo.serviceInfo.name;
                if (!"com.android.vending".equals(str2) || str3 == null) {
                    str = "The device doesn't have valid Play Store.";
                } else {
                    ComponentName componentName = new ComponentName(str2, str3);
                    Intent intent2 = new Intent(intent);
                    intent2.setComponent(componentName);
                    intent2.putExtra("playBillingLibraryVersion", this.f5005b);
                    if (this.f5008e.bindService(intent2, this.i, 1)) {
                        c.b.a.a.a.b("BillingClient", "Service was bonded successfully.");
                        return;
                    }
                    str = "Connection to Billing service is blocked.";
                }
                c.b.a.a.a.c("BillingClient", str);
            }
            this.f5004a = 0;
            c.b.a.a.a.b("BillingClient", "Billing service unavailable on device.");
            fVar.a(com.android.billingclient.api.i.f5092c);
        }
    }

    @Override // com.android.billingclient.api.d
    public void a(com.android.billingclient.api.j jVar, com.android.billingclient.api.k kVar) {
        if (!b()) {
            kVar.a(com.android.billingclient.api.i.n, null);
        } else if (a(new c(jVar, kVar), 30000L, new d(this, kVar)) != null) {
        } else {
            kVar.a(c(), null);
        }
    }

    @Override // com.android.billingclient.api.d
    public void a(com.android.billingclient.api.o oVar, com.android.billingclient.api.p pVar) {
        com.android.billingclient.api.h hVar;
        if (!b()) {
            hVar = com.android.billingclient.api.i.n;
        } else {
            String a2 = oVar.a();
            List<String> b2 = oVar.b();
            if (TextUtils.isEmpty(a2)) {
                c.b.a.a.a.c("BillingClient", "Please fix the input params. SKU type can't be empty.");
                hVar = com.android.billingclient.api.i.f5095f;
            } else if (b2 != null) {
                if (a(new a(a2, b2, pVar), 30000L, new b(this, pVar)) != null) {
                    return;
                }
                pVar.a(c(), null);
                return;
            } else {
                c.b.a.a.a.c("BillingClient", "Please fix the input params. The list of SKUs can't be empty.");
                hVar = com.android.billingclient.api.i.f5094e;
            }
        }
        pVar.a(hVar, null);
    }

    @Override // com.android.billingclient.api.d
    public void a(String str, com.android.billingclient.api.m mVar) {
        if (!b()) {
            mVar.a(com.android.billingclient.api.i.n, null);
        } else if (a(new CallableC0110e(str, mVar), 30000L, new f(this, mVar)) != null) {
        } else {
            mVar.a(c(), null);
        }
    }

    @Override // com.android.billingclient.api.d
    public boolean b() {
        return (this.f5004a != 2 || this.f5011h == null || this.i == null) ? false : true;
    }
}
