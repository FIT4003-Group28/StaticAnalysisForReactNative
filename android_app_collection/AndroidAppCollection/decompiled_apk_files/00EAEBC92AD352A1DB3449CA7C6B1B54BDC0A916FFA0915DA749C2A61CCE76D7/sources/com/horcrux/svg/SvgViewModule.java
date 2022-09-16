package com.horcrux.svg;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
/* loaded from: classes.dex */
class SvgViewModule extends ReactContextBaseJavaModule {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f9528b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ReadableMap f9529c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Callback f9530d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f9531e;

        /* renamed from: com.horcrux.svg.SvgViewModule$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0191a implements Runnable {

            /* renamed from: com.horcrux.svg.SvgViewModule$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            class RunnableC0192a implements Runnable {
                RunnableC0192a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    a aVar = a.this;
                    SvgViewModule.toDataURL(aVar.f9528b, aVar.f9529c, aVar.f9530d, aVar.f9531e + 1);
                }
            }

            RunnableC0191a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SvgView svgViewByTag = SvgViewManager.getSvgViewByTag(a.this.f9528b);
                if (svgViewByTag == null) {
                    return;
                }
                svgViewByTag.setToDataUrlTask(new RunnableC0192a());
            }
        }

        /* loaded from: classes.dex */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                SvgViewModule.toDataURL(aVar.f9528b, aVar.f9529c, aVar.f9530d, aVar.f9531e + 1);
            }
        }

        a(int i, ReadableMap readableMap, Callback callback, int i2) {
            this.f9528b = i;
            this.f9529c = readableMap;
            this.f9530d = callback;
            this.f9531e = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            SvgView svgViewByTag = SvgViewManager.getSvgViewByTag(this.f9528b);
            if (svgViewByTag == null) {
                SvgViewManager.runWhenViewIsAvailable(this.f9528b, new RunnableC0191a());
            } else if (svgViewByTag.notRendered()) {
                svgViewByTag.setToDataUrlTask(new b());
            } else {
                ReadableMap readableMap = this.f9529c;
                if (readableMap != null) {
                    this.f9530d.invoke(svgViewByTag.toDataURL(readableMap.getInt("width"), this.f9529c.getInt("height")));
                } else {
                    this.f9530d.invoke(svgViewByTag.toDataURL());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SvgViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void toDataURL(int i, ReadableMap readableMap, Callback callback, int i2) {
        UiThreadUtil.runOnUiThread(new a(i, readableMap, callback, i2));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNSVGSvgViewManager";
    }

    @ReactMethod
    public void toDataURL(int i, ReadableMap readableMap, Callback callback) {
        toDataURL(i, readableMap, callback, 0);
    }
}
