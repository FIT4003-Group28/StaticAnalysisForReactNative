package com.facebook.react.devsupport;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.io.File;
@com.facebook.react.d0.a.a(name = JSCHeapCapture.TAG, needsEagerInit = true)
/* loaded from: classes.dex */
public class JSCHeapCapture extends ReactContextBaseJavaModule {
    public static final String TAG = "JSCHeapCapture";
    private a mCaptureInProgress;

    /* loaded from: classes.dex */
    public interface HeapCapture extends JavaScriptModule {
        void captureHeap(String str);
    }

    /* loaded from: classes.dex */
    public interface a {
        void a(b bVar);

        void a(File file);
    }

    /* loaded from: classes.dex */
    public static class b extends Exception {
        /* JADX INFO: Access modifiers changed from: package-private */
        public b(String str) {
            super(str);
        }
    }

    public JSCHeapCapture(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mCaptureInProgress = null;
    }

    @ReactMethod
    public synchronized void captureComplete(String str, String str2) {
        if (this.mCaptureInProgress != null) {
            if (str2 == null) {
                this.mCaptureInProgress.a(new File(str));
            } else {
                this.mCaptureInProgress.a(new b(str2));
            }
            this.mCaptureInProgress = null;
        }
    }

    public synchronized void captureHeap(String str, a aVar) {
        if (this.mCaptureInProgress != null) {
            aVar.a(new b("Heap capture already in progress."));
            return;
        }
        File file = new File(str + "/capture.json");
        file.delete();
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            HeapCapture heapCapture = (HeapCapture) reactApplicationContextIfActiveOrWarn.getJSModule(HeapCapture.class);
            if (heapCapture == null) {
                aVar.a(new b("Heap capture js module not registered."));
            } else {
                this.mCaptureInProgress = aVar;
                heapCapture.captureHeap(file.getPath());
            }
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }
}
