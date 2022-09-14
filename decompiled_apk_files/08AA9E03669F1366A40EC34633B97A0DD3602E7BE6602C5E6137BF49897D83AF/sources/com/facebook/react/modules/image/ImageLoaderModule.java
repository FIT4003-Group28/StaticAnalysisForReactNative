package com.facebook.react.modules.image;

import android.net.Uri;
import android.util.SparseArray;
import com.facebook.c.b;
import com.facebook.c.c;
import com.facebook.common.h.a;
import com.facebook.imagepipeline.f.g;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.af;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
import com.facebook.react.bridge.am;
import com.facebook.react.bridge.ar;
import com.facebook.react.bridge.j;
import com.facebook.react.bridge.x;
/* loaded from: classes.dex */
public class ImageLoaderModule extends ReactContextBaseJavaModule implements x {
    private static final String ERROR_GET_SIZE_FAILURE = "E_GET_SIZE_FAILURE";
    private static final String ERROR_INVALID_URI = "E_INVALID_URI";
    private static final String ERROR_PREFETCH_FAILURE = "E_PREFETCH_FAILURE";
    private final Object mCallerContext;
    private final Object mEnqueuedRequestMonitor;
    private final SparseArray<c<Void>> mEnqueuedRequests;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "ImageLoader";
    }

    @Override // com.facebook.react.bridge.x
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.x
    public void onHostResume() {
    }

    public ImageLoaderModule(ah ahVar) {
        super(ahVar);
        this.mEnqueuedRequestMonitor = new Object();
        this.mEnqueuedRequests = new SparseArray<>();
        this.mCallerContext = this;
    }

    public ImageLoaderModule(ah ahVar, Object obj) {
        super(ahVar);
        this.mEnqueuedRequestMonitor = new Object();
        this.mEnqueuedRequests = new SparseArray<>();
        this.mCallerContext = obj;
    }

    @al
    public void getSize(String str, final af afVar) {
        if (str == null || str.isEmpty()) {
            afVar.a(ERROR_INVALID_URI, "Cannot get the size of an image for an empty URI");
            return;
        }
        com.facebook.f.a.a.c.c().b(com.facebook.imagepipeline.n.c.a(Uri.parse(str)).n(), this.mCallerContext).a(new b<a<com.facebook.imagepipeline.i.b>>() { // from class: com.facebook.react.modules.image.ImageLoaderModule.1
            @Override // com.facebook.c.b
            protected void e(c<a<com.facebook.imagepipeline.i.b>> cVar) {
                if (!cVar.b()) {
                    return;
                }
                a<com.facebook.imagepipeline.i.b> d2 = cVar.d();
                try {
                    if (d2 != null) {
                        try {
                            com.facebook.imagepipeline.i.b a2 = d2.a();
                            ar b2 = com.facebook.react.bridge.b.b();
                            b2.putInt("width", a2.f());
                            b2.putInt("height", a2.g());
                            afVar.a(b2);
                        } catch (Exception e) {
                            afVar.a(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, e);
                        }
                        return;
                    }
                    afVar.a(ImageLoaderModule.ERROR_GET_SIZE_FAILURE);
                } finally {
                    a.c(d2);
                }
            }

            @Override // com.facebook.c.b
            protected void f(c<a<com.facebook.imagepipeline.i.b>> cVar) {
                afVar.a(ImageLoaderModule.ERROR_GET_SIZE_FAILURE, cVar.f());
            }
        }, com.facebook.common.b.a.a());
    }

    @al
    public void prefetchImage(String str, final int i, final af afVar) {
        if (str == null || str.isEmpty()) {
            afVar.a(ERROR_INVALID_URI, "Cannot prefetch an image for an empty URI");
            return;
        }
        c<Void> c2 = com.facebook.f.a.a.c.c().c(com.facebook.imagepipeline.n.c.a(Uri.parse(str)).n(), this.mCallerContext);
        b<Void> bVar = new b<Void>() { // from class: com.facebook.react.modules.image.ImageLoaderModule.2
            @Override // com.facebook.c.b
            protected void e(c<Void> cVar) {
                if (!cVar.b()) {
                    return;
                }
                try {
                    ImageLoaderModule.this.removeRequest(i);
                    afVar.a((Object) true);
                } finally {
                    cVar.h();
                }
            }

            @Override // com.facebook.c.b
            protected void f(c<Void> cVar) {
                try {
                    ImageLoaderModule.this.removeRequest(i);
                    afVar.a(ImageLoaderModule.ERROR_PREFETCH_FAILURE, cVar.f());
                } finally {
                    cVar.h();
                }
            }
        };
        registerRequest(i, c2);
        c2.a(bVar, com.facebook.common.b.a.a());
    }

    @al
    public void abortRequest(int i) {
        c<Void> removeRequest = removeRequest(i);
        if (removeRequest != null) {
            removeRequest.h();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.react.modules.image.ImageLoaderModule$3] */
    @al
    public void queryCache(final am amVar, final af afVar) {
        new j<Void, Void>(getReactApplicationContext()) { // from class: com.facebook.react.modules.image.ImageLoaderModule.3
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.facebook.react.bridge.j
            /* renamed from: a */
            public void b(Void... voidArr) {
                ar b2 = com.facebook.react.bridge.b.b();
                g c2 = com.facebook.f.a.a.c.c();
                for (int i = 0; i < amVar.size(); i++) {
                    String string = amVar.getString(i);
                    Uri parse = Uri.parse(string);
                    if (c2.a(parse)) {
                        b2.putString(string, "memory");
                    } else if (c2.b(parse)) {
                        b2.putString(string, "disk");
                    }
                }
                afVar.a(b2);
            }
        }.executeOnExecutor(j.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    private void registerRequest(int i, c<Void> cVar) {
        synchronized (this.mEnqueuedRequestMonitor) {
            this.mEnqueuedRequests.put(i, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c<Void> removeRequest(int i) {
        c<Void> cVar;
        synchronized (this.mEnqueuedRequestMonitor) {
            cVar = this.mEnqueuedRequests.get(i);
            this.mEnqueuedRequests.remove(i);
        }
        return cVar;
    }

    @Override // com.facebook.react.bridge.x
    public void onHostDestroy() {
        synchronized (this.mEnqueuedRequestMonitor) {
            int size = this.mEnqueuedRequests.size();
            for (int i = 0; i < size; i++) {
                c<Void> valueAt = this.mEnqueuedRequests.valueAt(i);
                if (valueAt != null) {
                    valueAt.h();
                }
            }
            this.mEnqueuedRequests.clear();
        }
    }
}
