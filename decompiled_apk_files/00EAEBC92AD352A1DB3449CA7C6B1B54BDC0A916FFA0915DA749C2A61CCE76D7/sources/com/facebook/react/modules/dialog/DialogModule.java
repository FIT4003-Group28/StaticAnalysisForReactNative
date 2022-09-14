package com.facebook.react.modules.dialog;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.l;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.f;
import java.util.Map;
@com.facebook.react.d0.a.a(name = DialogModule.NAME)
/* loaded from: classes.dex */
public class DialogModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    static final String FRAGMENT_TAG = "com.facebook.catalyst.react.dialog.DialogModule";
    static final String KEY_CANCELABLE = "cancelable";
    static final String KEY_ITEMS = "items";
    static final String KEY_MESSAGE = "message";
    static final String KEY_TITLE = "title";
    public static final String NAME = "DialogManagerAndroid";
    private boolean mIsInForeground;
    static final String ACTION_BUTTON_CLICKED = "buttonClicked";
    static final String ACTION_DISMISSED = "dismissed";
    static final String KEY_BUTTON_POSITIVE = "buttonPositive";
    static final String KEY_BUTTON_NEGATIVE = "buttonNegative";
    static final String KEY_BUTTON_NEUTRAL = "buttonNeutral";
    static final Map<String, Object> CONSTANTS = f.a(ACTION_BUTTON_CLICKED, ACTION_BUTTON_CLICKED, ACTION_DISMISSED, ACTION_DISMISSED, KEY_BUTTON_POSITIVE, -1, KEY_BUTTON_NEGATIVE, -2, KEY_BUTTON_NEUTRAL, -3);

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c f5666b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Bundle f5667c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Callback f5668d;

        a(DialogModule dialogModule, c cVar, Bundle bundle, Callback callback) {
            this.f5666b = cVar;
            this.f5667c = bundle;
            this.f5668d = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5666b.a(this.f5667c, this.f5668d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {

        /* renamed from: b  reason: collision with root package name */
        private final Callback f5669b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f5670c = false;

        public b(Callback callback) {
            this.f5669b = callback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.f5670c || !DialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                return;
            }
            this.f5669b.invoke(DialogModule.ACTION_BUTTON_CLICKED, Integer.valueOf(i));
            this.f5670c = true;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (this.f5670c || !DialogModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                return;
            }
            this.f5669b.invoke(DialogModule.ACTION_DISMISSED);
            this.f5670c = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        private final l f5672a;

        /* renamed from: b  reason: collision with root package name */
        private Object f5673b;

        public c(l lVar) {
            this.f5672a = lVar;
        }

        private void b() {
            AlertFragment alertFragment;
            if (DialogModule.this.mIsInForeground && (alertFragment = (AlertFragment) this.f5672a.b(DialogModule.FRAGMENT_TAG)) != null && alertFragment.N()) {
                alertFragment.m0();
            }
        }

        public void a() {
            UiThreadUtil.assertOnUiThread();
            SoftAssertions.assertCondition(DialogModule.this.mIsInForeground, "showPendingAlert() called in background");
            if (this.f5673b == null) {
                return;
            }
            b();
            ((AlertFragment) this.f5673b).a(this.f5672a, DialogModule.FRAGMENT_TAG);
            this.f5673b = null;
        }

        public void a(Bundle bundle, Callback callback) {
            UiThreadUtil.assertOnUiThread();
            b();
            AlertFragment alertFragment = new AlertFragment(callback != null ? new b(callback) : null, bundle);
            if (!DialogModule.this.mIsInForeground || this.f5672a.x()) {
                this.f5673b = alertFragment;
                return;
            }
            if (bundle.containsKey(DialogModule.KEY_CANCELABLE)) {
                alertFragment.h(bundle.getBoolean(DialogModule.KEY_CANCELABLE));
            }
            alertFragment.a(this.f5672a, DialogModule.FRAGMENT_TAG);
        }
    }

    public DialogModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private c getFragmentManagerHelper() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null || !(currentActivity instanceof androidx.fragment.app.c)) {
            return null;
        }
        return new c(((androidx.fragment.app.c) currentActivity).h());
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return CONSTANTS;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.mIsInForeground = false;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.mIsInForeground = true;
        c fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper != null) {
            fragmentManagerHelper.a();
        } else {
            c.d.d.e.a.c(DialogModule.class, "onHostResume called but no FragmentManager found");
        }
    }

    @ReactMethod
    public void showAlert(ReadableMap readableMap, Callback callback, Callback callback2) {
        c fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper == null) {
            callback.invoke("Tried to show an alert while not attached to an Activity");
            return;
        }
        Bundle bundle = new Bundle();
        if (readableMap.hasKey(KEY_TITLE)) {
            bundle.putString(KEY_TITLE, readableMap.getString(KEY_TITLE));
        }
        if (readableMap.hasKey(KEY_MESSAGE)) {
            bundle.putString(KEY_MESSAGE, readableMap.getString(KEY_MESSAGE));
        }
        if (readableMap.hasKey(KEY_BUTTON_POSITIVE)) {
            bundle.putString("button_positive", readableMap.getString(KEY_BUTTON_POSITIVE));
        }
        if (readableMap.hasKey(KEY_BUTTON_NEGATIVE)) {
            bundle.putString("button_negative", readableMap.getString(KEY_BUTTON_NEGATIVE));
        }
        if (readableMap.hasKey(KEY_BUTTON_NEUTRAL)) {
            bundle.putString("button_neutral", readableMap.getString(KEY_BUTTON_NEUTRAL));
        }
        if (readableMap.hasKey(KEY_ITEMS)) {
            ReadableArray array = readableMap.getArray(KEY_ITEMS);
            CharSequence[] charSequenceArr = new CharSequence[array.size()];
            for (int i = 0; i < array.size(); i++) {
                charSequenceArr[i] = array.getString(i);
            }
            bundle.putCharSequenceArray(KEY_ITEMS, charSequenceArr);
        }
        if (readableMap.hasKey(KEY_CANCELABLE)) {
            bundle.putBoolean(KEY_CANCELABLE, readableMap.getBoolean(KEY_CANCELABLE));
        }
        UiThreadUtil.runOnUiThread(new a(this, fragmentManagerHelper, bundle, callback2));
    }
}
