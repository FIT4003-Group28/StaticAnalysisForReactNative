package com.facebook.react.modules.toast;

import android.widget.Toast;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.f;
import java.util.HashMap;
import java.util.Map;
@com.facebook.react.d0.a.a(name = ToastModule.NAME)
/* loaded from: classes.dex */
public class ToastModule extends ReactContextBaseJavaModule {
    private static final String DURATION_LONG_KEY = "LONG";
    private static final String DURATION_SHORT_KEY = "SHORT";
    private static final String GRAVITY_BOTTOM_KEY = "BOTTOM";
    private static final String GRAVITY_CENTER = "CENTER";
    private static final String GRAVITY_TOP_KEY = "TOP";
    public static final String NAME = "ToastAndroid";

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f5786b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f5787c;

        a(String str, int i) {
            this.f5786b = str;
            this.f5787c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            Toast.makeText(ToastModule.this.getReactApplicationContext(), this.f5786b, this.f5787c).show();
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f5789b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f5790c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f5791d;

        b(String str, int i, int i2) {
            this.f5789b = str;
            this.f5790c = i;
            this.f5791d = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Toast makeText = Toast.makeText(ToastModule.this.getReactApplicationContext(), this.f5789b, this.f5790c);
            makeText.setGravity(this.f5791d, 0, 0);
            makeText.show();
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f5793b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f5794c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f5795d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f5796e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f5797f;

        c(String str, int i, int i2, int i3, int i4) {
            this.f5793b = str;
            this.f5794c = i;
            this.f5795d = i2;
            this.f5796e = i3;
            this.f5797f = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            Toast makeText = Toast.makeText(ToastModule.this.getReactApplicationContext(), this.f5793b, this.f5794c);
            makeText.setGravity(this.f5795d, this.f5796e, this.f5797f);
            makeText.show();
        }
    }

    public ToastModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap b2 = f.b();
        b2.put(DURATION_SHORT_KEY, 0);
        b2.put(DURATION_LONG_KEY, 1);
        b2.put(GRAVITY_TOP_KEY, 49);
        b2.put(GRAVITY_BOTTOM_KEY, 81);
        b2.put(GRAVITY_CENTER, 17);
        return b2;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void show(String str, int i) {
        UiThreadUtil.runOnUiThread(new a(str, i));
    }

    @ReactMethod
    public void showWithGravity(String str, int i, int i2) {
        UiThreadUtil.runOnUiThread(new b(str, i, i2));
    }

    @ReactMethod
    public void showWithGravityAndOffset(String str, int i, int i2, int i3, int i4) {
        UiThreadUtil.runOnUiThread(new c(str, i, i2, i3, i4));
    }
}
