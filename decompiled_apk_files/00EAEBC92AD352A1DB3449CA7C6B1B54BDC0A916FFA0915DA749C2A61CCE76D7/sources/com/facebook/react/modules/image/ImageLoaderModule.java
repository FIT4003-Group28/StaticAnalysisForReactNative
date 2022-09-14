package com.facebook.react.modules.image;

import android.net.Uri;
import android.os.AsyncTask;
import android.util.SparseArray;
import c.d.j.f.h;
import com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
@com.facebook.react.d0.a.a(name = ImageLoaderModule.NAME)
/* loaded from: classes.dex */
public class ImageLoaderModule extends NativeImageLoaderAndroidSpec implements LifecycleEventListener {
    private static final String ERROR_GET_SIZE_FAILURE = "E_GET_SIZE_FAILURE";
    private static final String ERROR_INVALID_URI = "E_INVALID_URI";
    private static final String ERROR_PREFETCH_FAILURE = "E_PREFETCH_FAILURE";
    public static final String NAME = "ImageLoader";
    private final Object mCallerContext;
    private final Object mEnqueuedRequestMonitor;
    private final SparseArray<c.d.e.c<Void>> mEnqueuedRequests;

    /* loaded from: classes.dex */
    class a extends c.d.e.b<c.d.d.h.a<c.d.j.k.b>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f5679a;

        a(ImageLoaderModule imageLoaderModule, Promise promise) {
            this.f5679a = promise;
        }

        @Override // c.d.e.b
        protected void e(c.d.e.c<c.d.d.h.a<c.d.j.k.b>> cVar) {
            this.f5679a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, cVar.e());
        }

        @Override // c.d.e.b
        protected void f(c.d.e.c<c.d.d.h.a<c.d.j.k.b>> cVar) {
            if (!cVar.d()) {
                return;
            }
            c.d.d.h.a<c.d.j.k.b> mo140b = cVar.mo140b();
            try {
                if (mo140b == null) {
                    this.f5679a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE);
                    return;
                }
                try {
                    c.d.j.k.b b2 = mo140b.b();
                    WritableMap createMap = Arguments.createMap();
                    createMap.putInt("width", b2.b());
                    createMap.putInt("height", b2.a());
                    this.f5679a.resolve(createMap);
                } catch (Exception e2) {
                    this.f5679a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, e2);
                }
            } finally {
                c.d.d.h.a.b(mo140b);
            }
        }
    }

    /* loaded from: classes.dex */
    class b extends c.d.e.b<c.d.d.h.a<c.d.j.k.b>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f5680a;

        b(ImageLoaderModule imageLoaderModule, Promise promise) {
            this.f5680a = promise;
        }

        @Override // c.d.e.b
        protected void e(c.d.e.c<c.d.d.h.a<c.d.j.k.b>> cVar) {
            this.f5680a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, cVar.e());
        }

        @Override // c.d.e.b
        protected void f(c.d.e.c<c.d.d.h.a<c.d.j.k.b>> cVar) {
            if (!cVar.d()) {
                return;
            }
            c.d.d.h.a<c.d.j.k.b> mo140b = cVar.mo140b();
            try {
                if (mo140b == null) {
                    this.f5680a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE);
                    return;
                }
                try {
                    c.d.j.k.b b2 = mo140b.b();
                    WritableMap createMap = Arguments.createMap();
                    createMap.putInt("width", b2.b());
                    createMap.putInt("height", b2.a());
                    this.f5680a.resolve(createMap);
                } catch (Exception e2) {
                    this.f5680a.reject(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, e2);
                }
            } finally {
                c.d.d.h.a.b(mo140b);
            }
        }
    }

    /* loaded from: classes.dex */
    class c extends c.d.e.b<Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f5681a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Promise f5682b;

        c(int i, Promise promise) {
            this.f5681a = i;
            this.f5682b = promise;
        }

        @Override // c.d.e.b
        protected void e(c.d.e.c<Void> cVar) {
            try {
                ImageLoaderModule.this.removeRequest(this.f5681a);
                this.f5682b.reject(ImageLoaderModule.ERROR_PREFETCH_FAILURE, cVar.e());
            } finally {
                cVar.close();
            }
        }

        @Override // c.d.e.b
        protected void f(c.d.e.c<Void> cVar) {
            if (!cVar.d()) {
                return;
            }
            try {
                ImageLoaderModule.this.removeRequest(this.f5681a);
                this.f5682b.resolve(true);
            } finally {
                cVar.close();
            }
        }
    }

    /* loaded from: classes.dex */
    class d extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReadableArray f5684a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Promise f5685b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(ImageLoaderModule imageLoaderModule, ReactContext reactContext, ReadableArray readableArray, Promise promise) {
            super(reactContext);
            this.f5684a = readableArray;
            this.f5685b = promise;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            String str;
            WritableMap createMap = Arguments.createMap();
            h a2 = c.d.h.a.a.c.a();
            for (int i = 0; i < this.f5684a.size(); i++) {
                String string = this.f5684a.getString(i);
                Uri parse = Uri.parse(string);
                if (a2.a(parse)) {
                    str = "memory";
                } else if (a2.b(parse)) {
                    str = "disk";
                }
                createMap.putString(string, str);
            }
            this.f5685b.resolve(createMap);
        }
    }

    public ImageLoaderModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mEnqueuedRequestMonitor = new Object();
        this.mEnqueuedRequests = new SparseArray<>();
        this.mCallerContext = this;
    }

    public ImageLoaderModule(ReactApplicationContext reactApplicationContext, Object obj) {
        super(reactApplicationContext);
        this.mEnqueuedRequestMonitor = new Object();
        this.mEnqueuedRequests = new SparseArray<>();
        this.mCallerContext = obj;
    }

    private void registerRequest(int i, c.d.e.c<Void> cVar) {
        synchronized (this.mEnqueuedRequestMonitor) {
            this.mEnqueuedRequests.put(i, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c.d.e.c<Void> removeRequest(int i) {
        c.d.e.c<Void> cVar;
        synchronized (this.mEnqueuedRequestMonitor) {
            cVar = this.mEnqueuedRequests.get(i);
            this.mEnqueuedRequests.remove(i);
        }
        return cVar;
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void abortRequest(double d2) {
        c.d.e.c<Void> removeRequest = removeRequest((int) d2);
        if (removeRequest != null) {
            removeRequest.close();
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void getSize(String str, Promise promise) {
        if (str == null || str.isEmpty()) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        c.d.h.a.a.c.a().a(c.d.j.o.d.b(new com.facebook.react.j0.b.a(getReactApplicationContext(), str).c()).a(), this.mCallerContext).a(new a(this, promise), c.d.d.b.a.a());
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void getSizeWithHeaders(String str, ReadableMap readableMap, Promise promise) {
        if (str == null || str.isEmpty()) {
            promise.reject(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        c.d.h.a.a.c.a().a(com.facebook.react.modules.fresco.a.a(c.d.j.o.d.b(new com.facebook.react.j0.b.a(getReactApplicationContext(), str).c()), readableMap), this.mCallerContext).a(new b(this, promise), c.d.d.b.a.a());
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        synchronized (this.mEnqueuedRequestMonitor) {
            int size = this.mEnqueuedRequests.size();
            for (int i = 0; i < size; i++) {
                c.d.e.c<Void> valueAt = this.mEnqueuedRequests.valueAt(i);
                if (valueAt != null) {
                    valueAt.close();
                }
            }
            this.mEnqueuedRequests.clear();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    public void prefetchImage(String str, double d2, Promise promise) {
        int i = (int) d2;
        if (str == null || str.isEmpty()) {
            promise.reject(ERROR_INVALID_URI, "Cannot prefetch an image for an empty URI");
            return;
        }
        c.d.e.c<Void> c2 = c.d.h.a.a.c.a().c(c.d.j.o.d.b(Uri.parse(str)).a(), this.mCallerContext);
        c cVar = new c(i, promise);
        registerRequest(i, c2);
        c2.a(cVar, c.d.d.b.a.a());
    }

    @Override // com.facebook.fbreact.specs.NativeImageLoaderAndroidSpec
    @ReactMethod
    public void queryCache(ReadableArray readableArray, Promise promise) {
        new d(this, getReactApplicationContext(), readableArray, promise).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }
}
