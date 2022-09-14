package com.facebook.react.modules.blob;

import com.facebook.react.bridge.JavaScriptContextHolder;
import com.facebook.react.bridge.ReactContext;
import com.facebook.soloader.SoLoader;
/* loaded from: classes.dex */
class BlobCollector {

    /* loaded from: classes.dex */
    static class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReactContext f5562b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BlobModule f5563c;

        a(ReactContext reactContext, BlobModule blobModule) {
            this.f5562b = reactContext;
            this.f5563c = blobModule;
        }

        @Override // java.lang.Runnable
        public void run() {
            JavaScriptContextHolder javaScriptContextHolder = this.f5562b.getJavaScriptContextHolder();
            if (javaScriptContextHolder.get() != 0) {
                BlobCollector.nativeInstall(this.f5563c, javaScriptContextHolder.get());
            }
        }
    }

    static {
        SoLoader.a("reactnativeblob");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(ReactContext reactContext, BlobModule blobModule) {
        reactContext.runOnJSQueueThread(new a(reactContext, blobModule));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nativeInstall(Object obj, long j);
}
