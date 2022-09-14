package com.dooboolab.RNIap;

import android.app.Activity;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.android.billingclient.api.SkuDetails;
import com.android.billingclient.api.a;
import com.android.billingclient.api.d;
import com.android.billingclient.api.g;
import com.android.billingclient.api.j;
import com.android.billingclient.api.m;
import com.android.billingclient.api.n;
import com.android.billingclient.api.o;
import com.android.billingclient.api.p;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ObjectAlreadyConsumedException;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeArray;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class RNIapModule extends ReactContextBaseJavaModule implements n {
    private static final String PROMISE_BUY_ITEM = "PROMISE_BUY_ITEM";
    final String TAG;
    private com.android.billingclient.api.d billingClient;
    private LifecycleEventListener lifecycleEventListener;
    private HashMap<String, ArrayList<Promise>> promises;
    private ReactContext reactContext;
    private List<SkuDetails> skus;

    /* loaded from: classes.dex */
    class a implements com.android.billingclient.api.k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f5144a;

        a(RNIapModule rNIapModule, Promise promise) {
            this.f5144a = promise;
        }

        @Override // com.android.billingclient.api.k
        public void a(com.android.billingclient.api.h hVar, String str) {
            if (hVar.b() != 0) {
                com.dooboolab.RNIap.a.a().a(this.f5144a, hVar.b());
            }
            try {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("responseCode", hVar.b());
                createMap.putString("debugMessage", hVar.a());
                String[] a2 = com.dooboolab.RNIap.a.a().a(hVar.b());
                createMap.putString("code", a2[0]);
                createMap.putString("message", a2[1]);
                this.f5144a.resolve(createMap);
            } catch (ObjectAlreadyConsumedException e2) {
                this.f5144a.reject(e2.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Promise f5145b;

        b(Promise promise) {
            this.f5145b = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (String str : new String[]{"inapp", "subs"}) {
                Purchase.a a2 = RNIapModule.this.billingClient.a(str);
                ArrayList arrayList = new ArrayList();
                if (a2 != null && a2.b() != null && a2.b().size() != 0) {
                    for (Purchase purchase : a2.b()) {
                        if (!purchase.i()) {
                            arrayList.add(purchase);
                        }
                    }
                    RNIapModule.this.onPurchasesUpdated(a2.a(), arrayList);
                }
            }
            this.f5145b.resolve(true);
        }
    }

    /* loaded from: classes.dex */
    class c implements LifecycleEventListener {
        c() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
            if (RNIapModule.this.billingClient != null) {
                RNIapModule.this.billingClient.a();
                RNIapModule.this.billingClient = null;
            }
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements com.android.billingclient.api.f {

        /* renamed from: a  reason: collision with root package name */
        private boolean f5148a = false;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f5149b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Promise f5150c;

        d(Runnable runnable, Promise promise) {
            this.f5149b = runnable;
            this.f5150c = promise;
        }

        @Override // com.android.billingclient.api.f
        public void a() {
            Log.d("RNIapModule", "billing client disconnected");
        }

        @Override // com.android.billingclient.api.f
        public void a(com.android.billingclient.api.h hVar) {
            if (!this.f5148a) {
                this.f5148a = true;
                if (hVar.b() == 0) {
                    if (RNIapModule.this.billingClient == null || !RNIapModule.this.billingClient.b()) {
                        return;
                    }
                    this.f5149b.run();
                    return;
                }
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("responseCode", hVar.b());
                createMap.putString("debugMessage", hVar.a());
                String[] a2 = com.dooboolab.RNIap.a.a().a(hVar.b());
                createMap.putString("code", a2[0]);
                createMap.putString("message", a2[1]);
                RNIapModule rNIapModule = RNIapModule.this;
                rNIapModule.sendEvent(rNIapModule.reactContext, "purchase-error", createMap);
                com.dooboolab.RNIap.a.a().a(this.f5150c, hVar.b());
            }
        }
    }

    /* loaded from: classes.dex */
    class e implements com.android.billingclient.api.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f5152a;

        e(RNIapModule rNIapModule, Promise promise) {
            this.f5152a = promise;
        }

        @Override // com.android.billingclient.api.f
        public void a() {
            try {
                this.f5152a.reject("initConnection", "Billing service disconnected");
            } catch (ObjectAlreadyConsumedException e2) {
                Log.e("RNIapModule", e2.getMessage());
            }
        }

        @Override // com.android.billingclient.api.f
        public void a(com.android.billingclient.api.h hVar) {
            int b2 = hVar.b();
            try {
                if (b2 == 0) {
                    this.f5152a.resolve(true);
                } else {
                    com.dooboolab.RNIap.a.a().a(this.f5152a, b2);
                }
            } catch (ObjectAlreadyConsumedException e2) {
                Log.e("RNIapModule", e2.getMessage());
            }
        }
    }

    /* loaded from: classes.dex */
    class f implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Promise f5153b;

        /* loaded from: classes.dex */
        class a implements com.android.billingclient.api.k {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ WritableNativeArray f5155a;

            a(WritableNativeArray writableNativeArray) {
                this.f5155a = writableNativeArray;
            }

            @Override // com.android.billingclient.api.k
            public void a(com.android.billingclient.api.h hVar, String str) {
                if (hVar.b() != 0) {
                    com.dooboolab.RNIap.a.a().a(f.this.f5153b, hVar.b());
                    return;
                }
                this.f5155a.pushString(str);
                try {
                    f.this.f5153b.resolve(true);
                } catch (ObjectAlreadyConsumedException e2) {
                    f.this.f5153b.reject(e2.getMessage());
                }
            }
        }

        f(Promise promise) {
            this.f5153b = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            Promise promise;
            String str;
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            Purchase.a a2 = RNIapModule.this.billingClient.a("inapp");
            if (a2 == null) {
                promise = this.f5153b;
                str = "No results for query";
            } else {
                List<Purchase> b2 = a2.b();
                if (b2 != null && b2.size() != 0) {
                    for (Purchase purchase : b2) {
                        j.b c2 = com.android.billingclient.api.j.c();
                        c2.b(purchase.f());
                        c2.a(purchase.a());
                        RNIapModule.this.billingClient.a(c2.a(), new a(writableNativeArray));
                    }
                    return;
                }
                promise = this.f5153b;
                str = "No purchases found";
            }
            promise.reject("refreshItem", str);
        }
    }

    /* loaded from: classes.dex */
    class g implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableArray f5157b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f5158c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Promise f5159d;

        /* loaded from: classes.dex */
        class a implements p {
            a() {
            }

            @Override // com.android.billingclient.api.p
            public void a(com.android.billingclient.api.h hVar, List<SkuDetails> list) {
                Log.d("RNIapModule", "responseCode: " + hVar.b());
                if (hVar.b() != 0) {
                    com.dooboolab.RNIap.a.a().a(g.this.f5159d, hVar.b());
                    return;
                }
                for (SkuDetails skuDetails : list) {
                    if (!RNIapModule.this.skus.contains(skuDetails)) {
                        RNIapModule.this.skus.add(skuDetails);
                    }
                }
                WritableNativeArray writableNativeArray = new WritableNativeArray();
                for (SkuDetails skuDetails2 : list) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putString("productId", skuDetails2.l());
                    BigDecimal valueOf = BigDecimal.valueOf(skuDetails2.j());
                    BigDecimal valueOf2 = BigDecimal.valueOf(1000000L);
                    createMap.putString("price", valueOf.divide(valueOf2).toString());
                    createMap.putString("currency", skuDetails2.k());
                    createMap.putString("type", skuDetails2.p());
                    createMap.putString("localizedPrice", skuDetails2.i());
                    createMap.putString("title", skuDetails2.o());
                    createMap.putString("description", skuDetails2.a());
                    createMap.putString("introductoryPrice", skuDetails2.d());
                    createMap.putString("subscriptionPeriodAndroid", skuDetails2.n());
                    createMap.putString("freeTrialPeriodAndroid", skuDetails2.b());
                    createMap.putString("introductoryPriceCyclesAndroid", skuDetails2.e());
                    createMap.putString("introductoryPricePeriodAndroid", skuDetails2.f());
                    createMap.putString("iconUrl", skuDetails2.c());
                    createMap.putString("originalJson", skuDetails2.g());
                    createMap.putString("originalPrice", BigDecimal.valueOf(skuDetails2.h()).divide(valueOf2).toString());
                    writableNativeArray.pushMap(createMap);
                }
                try {
                    g.this.f5159d.resolve(writableNativeArray);
                } catch (ObjectAlreadyConsumedException e2) {
                    Log.e("RNIapModule", e2.getMessage());
                }
            }
        }

        g(ReadableArray readableArray, String str, Promise promise) {
            this.f5157b = readableArray;
            this.f5158c = str;
            this.f5159d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f5157b.size(); i++) {
                arrayList.add(this.f5157b.getString(i));
            }
            o.b c2 = o.c();
            c2.a(arrayList);
            c2.a(this.f5158c);
            RNIapModule.this.billingClient.a(c2.a(), new a());
        }
    }

    /* loaded from: classes.dex */
    class h implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f5162b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Promise f5163c;

        h(String str, Promise promise) {
            this.f5162b = str;
            this.f5163c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            WritableNativeArray writableNativeArray = new WritableNativeArray();
            List<Purchase> b2 = RNIapModule.this.billingClient.a(this.f5162b.equals("subs") ? "subs" : "inapp").b();
            if (b2 != null) {
                for (Purchase purchase : b2) {
                    WritableNativeMap writableNativeMap = new WritableNativeMap();
                    writableNativeMap.putString("productId", purchase.h());
                    writableNativeMap.putString("transactionId", purchase.b());
                    writableNativeMap.putDouble("transactionDate", purchase.e());
                    writableNativeMap.putString("transactionReceipt", purchase.c());
                    writableNativeMap.putString("orderId", purchase.b());
                    writableNativeMap.putString("purchaseToken", purchase.f());
                    writableNativeMap.putString("developerPayloadAndroid", purchase.a());
                    writableNativeMap.putString("signatureAndroid", purchase.g());
                    writableNativeMap.putInt("purchaseStateAndroid", purchase.d());
                    writableNativeMap.putBoolean("isAcknowledgedAndroid", purchase.i());
                    if (this.f5162b.equals("subs")) {
                        writableNativeMap.putBoolean("autoRenewingAndroid", purchase.j());
                    }
                    writableNativeArray.pushMap(writableNativeMap);
                }
            }
            try {
                this.f5163c.resolve(writableNativeArray);
            } catch (ObjectAlreadyConsumedException e2) {
                Log.e("RNIapModule", e2.getMessage());
            }
        }
    }

    /* loaded from: classes.dex */
    class i implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f5165b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Promise f5166c;

        /* loaded from: classes.dex */
        class a implements m {
            a() {
            }

            @Override // com.android.billingclient.api.m
            public void a(com.android.billingclient.api.h hVar, List<PurchaseHistoryRecord> list) {
                if (hVar.b() != 0) {
                    com.dooboolab.RNIap.a.a().a(i.this.f5166c, hVar.b());
                    return;
                }
                Log.d("RNIapModule", list.toString());
                WritableArray createArray = Arguments.createArray();
                for (PurchaseHistoryRecord purchaseHistoryRecord : list) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putString("productId", purchaseHistoryRecord.f());
                    createMap.putDouble("transactionDate", purchaseHistoryRecord.c());
                    createMap.putString("transactionReceipt", purchaseHistoryRecord.b());
                    createMap.putString("purchaseToken", purchaseHistoryRecord.d());
                    createMap.putString("dataAndroid", purchaseHistoryRecord.b());
                    createMap.putString("signatureAndroid", purchaseHistoryRecord.e());
                    createMap.putString("developerPayload", purchaseHistoryRecord.a());
                    createArray.pushMap(createMap);
                }
                try {
                    i.this.f5166c.resolve(createArray);
                } catch (ObjectAlreadyConsumedException e2) {
                    Log.e("RNIapModule", e2.getMessage());
                }
            }
        }

        i(String str, Promise promise) {
            this.f5165b = str;
            this.f5166c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.android.billingclient.api.d dVar = RNIapModule.this.billingClient;
            String str = "subs";
            if (!this.f5165b.equals(str)) {
                str = "inapp";
            }
            dVar.a(str, new a());
        }
    }

    /* loaded from: classes.dex */
    class j implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Promise f5169b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f5170c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f5171d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Integer f5172e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f5173f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ String f5174g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ String f5175h;
        final /* synthetic */ Activity i;

        j(Promise promise, String str, String str2, Integer num, String str3, String str4, String str5, Activity activity) {
            this.f5169b = promise;
            this.f5170c = str;
            this.f5171d = str2;
            this.f5172e = num;
            this.f5173f = str3;
            this.f5174g = str4;
            this.f5175h = str5;
            this.i = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            SkuDetails skuDetails;
            com.dooboolab.RNIap.a.a().a(RNIapModule.PROMISE_BUY_ITEM, this.f5169b);
            g.b j = com.android.billingclient.api.g.j();
            Iterator it = RNIapModule.this.skus.iterator();
            while (true) {
                if (!it.hasNext()) {
                    skuDetails = null;
                    break;
                }
                skuDetails = (SkuDetails) it.next();
                if (skuDetails.l().equals(this.f5170c)) {
                    break;
                }
            }
            if (skuDetails == null) {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("debugMessage", "The sku was not found. Please fetch products first by calling getItems");
                createMap.putString("code", RNIapModule.PROMISE_BUY_ITEM);
                createMap.putString("message", "The sku was not found. Please fetch products first by calling getItems");
                RNIapModule rNIapModule = RNIapModule.this;
                rNIapModule.sendEvent(rNIapModule.reactContext, "purchase-error", createMap);
                this.f5169b.reject(RNIapModule.PROMISE_BUY_ITEM, "The sku was not found. Please fetch products first by calling getItems");
                return;
            }
            j.a(skuDetails);
            String str = this.f5171d;
            if (str != null) {
                j.c(str);
            }
            Integer num = this.f5172e;
            if (num != null && num.intValue() != -1) {
                if (this.f5172e.intValue() == 2) {
                    j.a(2);
                    if (!this.f5173f.equals("subs")) {
                        WritableMap createMap2 = Arguments.createMap();
                        createMap2.putString("debugMessage", "IMMEDIATE_AND_CHARGE_PRORATED_PRICE for proration mode only works in subscription purchase.");
                        createMap2.putString("code", RNIapModule.PROMISE_BUY_ITEM);
                        createMap2.putString("message", "IMMEDIATE_AND_CHARGE_PRORATED_PRICE for proration mode only works in subscription purchase.");
                        RNIapModule rNIapModule2 = RNIapModule.this;
                        rNIapModule2.sendEvent(rNIapModule2.reactContext, "purchase-error", createMap2);
                        this.f5169b.reject(RNIapModule.PROMISE_BUY_ITEM, "IMMEDIATE_AND_CHARGE_PRORATED_PRICE for proration mode only works in subscription purchase.");
                        return;
                    }
                } else {
                    int i = 3;
                    if (this.f5172e.intValue() != 3) {
                        i = 4;
                        if (this.f5172e.intValue() != 4) {
                            i = 1;
                            if (this.f5172e.intValue() != 1) {
                                j.a(0);
                            }
                        }
                    }
                    j.a(i);
                }
            }
            String str2 = this.f5174g;
            if (str2 != null) {
                j.a(str2);
            }
            String str3 = this.f5175h;
            if (str3 != null) {
                j.b(str3);
            }
            com.dooboolab.RNIap.a.a().a(RNIapModule.this.billingClient.a(this.i, j.a()).b());
        }
    }

    /* loaded from: classes.dex */
    class k implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f5176b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f5177c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Promise f5178d;

        /* loaded from: classes.dex */
        class a implements com.android.billingclient.api.b {
            a() {
            }

            @Override // com.android.billingclient.api.b
            public void a(com.android.billingclient.api.h hVar) {
                if (hVar.b() != 0) {
                    com.dooboolab.RNIap.a.a().a(k.this.f5178d, hVar.b());
                }
                try {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putInt("responseCode", hVar.b());
                    createMap.putString("debugMessage", hVar.a());
                    String[] a2 = com.dooboolab.RNIap.a.a().a(hVar.b());
                    createMap.putString("code", a2[0]);
                    createMap.putString("message", a2[1]);
                    k.this.f5178d.resolve(createMap);
                } catch (ObjectAlreadyConsumedException e2) {
                    Log.e("RNIapModule", e2.getMessage());
                }
            }
        }

        k(String str, String str2, Promise promise) {
            this.f5176b = str;
            this.f5177c = str2;
            this.f5178d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.b c2 = com.android.billingclient.api.a.c();
            c2.b(this.f5176b);
            c2.a(this.f5177c);
            RNIapModule.this.billingClient.a(c2.a(), new a());
        }
    }

    public RNIapModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.TAG = "RNIapModule";
        this.promises = new HashMap<>();
        this.lifecycleEventListener = new c();
        this.reactContext = reactApplicationContext;
        this.skus = new ArrayList();
        reactApplicationContext.addLifecycleEventListener(this.lifecycleEventListener);
    }

    private void ensureConnection(Promise promise, Runnable runnable) {
        com.android.billingclient.api.d dVar = this.billingClient;
        if (dVar != null && dVar.b()) {
            runnable.run();
            return;
        }
        d dVar2 = new d(runnable, promise);
        try {
            d.b a2 = com.android.billingclient.api.d.a(this.reactContext);
            a2.b();
            a2.a(this);
            this.billingClient = a2.a();
            this.billingClient.a(dVar2);
        } catch (Exception e2) {
            promise.reject("E_NOT_PREPARED", e2.getMessage(), e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(ReactContext reactContext, String str, WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
    }

    private void sendUnconsumedPurchases(Promise promise) {
        ensureConnection(promise, new b(promise));
    }

    @ReactMethod
    public void acknowledgePurchase(String str, String str2, Promise promise) {
        ensureConnection(promise, new k(str, str2, promise));
    }

    @ReactMethod
    public void buyItemByType(String str, String str2, String str3, Integer num, String str4, String str5, Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.reject("E_UNKNOWN", "getCurrentActivity returned null");
        } else {
            ensureConnection(promise, new j(promise, str2, str3, num, str, str5, str4, currentActivity));
        }
    }

    @ReactMethod
    public void consumeProduct(String str, String str2, Promise promise) {
        j.b c2 = com.android.billingclient.api.j.c();
        c2.b(str);
        c2.a(str2);
        this.billingClient.a(c2.a(), new a(this, promise));
    }

    @ReactMethod
    public void endConnection(Promise promise) {
        com.android.billingclient.api.d dVar = this.billingClient;
        if (dVar != null) {
            try {
                dVar.a();
            } catch (Exception e2) {
                promise.reject("endConnection", e2.getMessage());
                return;
            }
        }
        try {
            promise.resolve(true);
        } catch (ObjectAlreadyConsumedException e3) {
            Log.e("RNIapModule", e3.getMessage());
        }
    }

    @ReactMethod
    public void getAvailableItemsByType(String str, Promise promise) {
        ensureConnection(promise, new h(str, promise));
    }

    @ReactMethod
    public void getItemsByType(String str, ReadableArray readableArray, Promise promise) {
        ensureConnection(promise, new g(readableArray, str, promise));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNIapModule";
    }

    @ReactMethod
    public void getPurchaseHistoryByType(String str, Promise promise) {
        ensureConnection(promise, new i(str, promise));
    }

    @ReactMethod
    public void initConnection(Promise promise) {
        d.b a2 = com.android.billingclient.api.d.a(this.reactContext);
        a2.b();
        a2.a(this);
        this.billingClient = a2.a();
        this.billingClient.a(new e(this, promise));
    }

    @Override // com.android.billingclient.api.n
    public void onPurchasesUpdated(com.android.billingclient.api.h hVar, List<Purchase> list) {
        if (hVar.b() != 0) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("responseCode", hVar.b());
            createMap.putString("debugMessage", hVar.a());
            String[] a2 = com.dooboolab.RNIap.a.a().a(hVar.b());
            createMap.putString("code", a2[0]);
            createMap.putString("message", a2[1]);
            sendEvent(this.reactContext, "purchase-error", createMap);
            com.dooboolab.RNIap.a.a().a(PROMISE_BUY_ITEM, hVar.b());
        } else if (list == null) {
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("responseCode", hVar.b());
            createMap2.putString("debugMessage", hVar.a());
            createMap2.putString("code", com.dooboolab.RNIap.a.a().a(hVar.b())[0]);
            createMap2.putString("message", "purchases are null.");
            sendEvent(this.reactContext, "purchase-error", createMap2);
            com.dooboolab.RNIap.a.a().a(PROMISE_BUY_ITEM, hVar.b());
        } else {
            WritableNativeMap writableNativeMap = null;
            for (Purchase purchase : list) {
                WritableMap createMap3 = Arguments.createMap();
                createMap3.putString("productId", purchase.h());
                createMap3.putString("transactionId", purchase.b());
                createMap3.putDouble("transactionDate", purchase.e());
                createMap3.putString("transactionReceipt", purchase.c());
                createMap3.putString("purchaseToken", purchase.f());
                createMap3.putString("dataAndroid", purchase.c());
                createMap3.putString("signatureAndroid", purchase.g());
                createMap3.putBoolean("autoRenewingAndroid", purchase.j());
                createMap3.putBoolean("isAcknowledgedAndroid", purchase.i());
                createMap3.putInt("purchaseStateAndroid", purchase.d());
                writableNativeMap = new WritableNativeMap();
                writableNativeMap.merge(createMap3);
                sendEvent(this.reactContext, "purchase-updated", createMap3);
            }
            if (list.size() <= 0 || writableNativeMap == null) {
                return;
            }
            com.dooboolab.RNIap.a.a().a(PROMISE_BUY_ITEM, writableNativeMap);
        }
    }

    @ReactMethod
    public void refreshItems(Promise promise) {
        ensureConnection(promise, new f(promise));
    }

    @ReactMethod
    public void startListening(Promise promise) {
        sendUnconsumedPurchases(promise);
    }
}
