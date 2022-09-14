package com.teslamotors.plugins.alert;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.j;
import android.support.v4.app.n;
import android.util.Log;
import com.facebook.react.b.f;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ah;
import com.facebook.react.bridge.al;
import com.facebook.react.bridge.am;
import com.facebook.react.bridge.an;
import com.facebook.react.bridge.d;
import com.facebook.react.bridge.x;
import java.util.Map;
/* loaded from: classes.dex */
public class AlertPromptModule extends ReactContextBaseJavaModule implements x {
    static final String ACTION_BUTTON_CLICKED = "buttonClicked";
    static final String ACTION_DISMISSED = "dismissed";
    private static final String FRAGMENT_TAG = "com.teslamotors.plugins.alert.AlertPromptModule";
    static final String KEY_ALERT_TYPE = "alertType";
    static final String KEY_BUTTON_NEGATIVE = "buttonNegative";
    static final String KEY_BUTTON_NEUTRAL = "buttonNeutral";
    static final String KEY_BUTTON_POSITIVE = "buttonPositive";
    static final String KEY_CANCELABLE = "cancelable";
    static final String KEY_DEFAULT_VALUE = "defaultValue";
    static final String KEY_ITEMS = "items";
    static final String KEY_MESSAGE = "message";
    static final String KEY_TITLE = "title";
    private static final String NAME = "TMAlertPrompt";
    Map<String, Object> CONSTANTS;
    private boolean mIsInForeground;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.x
    public void onHostDestroy() {
    }

    public AlertPromptModule(ah ahVar) {
        super(ahVar);
        this.CONSTANTS = f.a(ACTION_BUTTON_CLICKED, ACTION_BUTTON_CLICKED, ACTION_DISMISSED, ACTION_DISMISSED, KEY_BUTTON_POSITIVE, -1, KEY_BUTTON_NEGATIVE, -2, KEY_BUTTON_NEUTRAL, -3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: b  reason: collision with root package name */
        private final FragmentManager f5132b;

        /* renamed from: c  reason: collision with root package name */
        private final n f5133c;

        /* renamed from: d  reason: collision with root package name */
        private Object f5134d;

        private boolean b() {
            return this.f5133c != null;
        }

        public b(n nVar) {
            this.f5132b = null;
            this.f5133c = nVar;
        }

        public b(FragmentManager fragmentManager) {
            this.f5132b = fragmentManager;
            this.f5133c = null;
        }

        public void a() {
            if (this.f5134d == null) {
                return;
            }
            if (b()) {
                ((c) this.f5134d).show(this.f5133c, AlertPromptModule.FRAGMENT_TAG);
            } else {
                ((com.teslamotors.plugins.alert.a) this.f5134d).show(this.f5132b, AlertPromptModule.FRAGMENT_TAG);
            }
            this.f5134d = null;
        }

        private void c() {
            if (b()) {
                c cVar = (c) this.f5133c.a(AlertPromptModule.FRAGMENT_TAG);
                if (cVar == null) {
                    return;
                }
                cVar.dismiss();
                return;
            }
            com.teslamotors.plugins.alert.a aVar = (com.teslamotors.plugins.alert.a) this.f5132b.findFragmentByTag(AlertPromptModule.FRAGMENT_TAG);
            if (aVar == null) {
                return;
            }
            aVar.dismiss();
        }

        public void a(boolean z, Bundle bundle, d dVar) {
            c();
            a aVar = dVar != null ? new a(dVar) : null;
            if (b()) {
                c cVar = new c(aVar, bundle);
                if (z) {
                    if (bundle.containsKey(AlertPromptModule.KEY_CANCELABLE)) {
                        cVar.setCancelable(bundle.getBoolean(AlertPromptModule.KEY_CANCELABLE));
                    }
                    cVar.show(this.f5133c, AlertPromptModule.FRAGMENT_TAG);
                    return;
                }
                this.f5134d = cVar;
                return;
            }
            com.teslamotors.plugins.alert.a aVar2 = new com.teslamotors.plugins.alert.a(aVar, bundle);
            if (z) {
                if (bundle.containsKey(AlertPromptModule.KEY_CANCELABLE)) {
                    aVar2.setCancelable(bundle.getBoolean(AlertPromptModule.KEY_CANCELABLE));
                }
                aVar2.show(this.f5132b, AlertPromptModule.FRAGMENT_TAG);
                return;
            }
            this.f5134d = aVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {

        /* renamed from: b  reason: collision with root package name */
        private final d f5129b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f5130c = false;

        public a(d dVar) {
            this.f5129b = dVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            a(dialogInterface, i, "");
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (this.f5130c || !AlertPromptModule.this.getReactApplicationContext().b()) {
                return;
            }
            this.f5129b.a(AlertPromptModule.ACTION_DISMISSED);
            this.f5130c = true;
        }

        public void a(DialogInterface dialogInterface, int i, String str) {
            if (this.f5130c || !AlertPromptModule.this.getReactApplicationContext().b()) {
                return;
            }
            this.f5129b.a(AlertPromptModule.ACTION_BUTTON_CLICKED, Integer.valueOf(i), str);
            this.f5130c = true;
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return this.CONSTANTS;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        getReactApplicationContext().a(this);
    }

    @Override // com.facebook.react.bridge.x
    public void onHostPause() {
        this.mIsInForeground = false;
    }

    @Override // com.facebook.react.bridge.x
    public void onHostResume() {
        this.mIsInForeground = true;
        b fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper != null) {
            fragmentManagerHelper.a();
        } else {
            Log.w(NAME, "onHostResume called but no FragmentManager found");
        }
    }

    @al
    public void showAlert(an anVar, d dVar, d dVar2) {
        b fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper == null) {
            dVar.a("Tried to show an alert while not attached to an Activity");
            return;
        }
        Bundle bundle = new Bundle();
        if (anVar.hasKey("title")) {
            bundle.putString("title", anVar.getString("title"));
        }
        if (anVar.hasKey("message")) {
            bundle.putString("message", anVar.getString("message"));
        }
        if (anVar.hasKey(KEY_BUTTON_POSITIVE)) {
            bundle.putString("button_positive", anVar.getString(KEY_BUTTON_POSITIVE));
        }
        if (anVar.hasKey(KEY_BUTTON_NEGATIVE)) {
            bundle.putString("button_negative", anVar.getString(KEY_BUTTON_NEGATIVE));
        }
        if (anVar.hasKey(KEY_BUTTON_NEUTRAL)) {
            bundle.putString("button_neutral", anVar.getString(KEY_BUTTON_NEUTRAL));
        }
        if (anVar.hasKey(KEY_ITEMS)) {
            am e = anVar.e(KEY_ITEMS);
            CharSequence[] charSequenceArr = new CharSequence[e.size()];
            for (int i = 0; i < e.size(); i++) {
                charSequenceArr[i] = e.getString(i);
            }
            bundle.putCharSequenceArray(KEY_ITEMS, charSequenceArr);
        }
        if (anVar.hasKey(KEY_DEFAULT_VALUE)) {
            bundle.putString("default_value", anVar.getString(KEY_DEFAULT_VALUE));
        }
        if (anVar.hasKey(KEY_ALERT_TYPE)) {
            bundle.putString("alert_type", anVar.getString(KEY_ALERT_TYPE));
        }
        if (anVar.hasKey(KEY_CANCELABLE)) {
            bundle.putBoolean(KEY_CANCELABLE, anVar.getBoolean(KEY_CANCELABLE));
        }
        fragmentManagerHelper.a(this.mIsInForeground, bundle, dVar2);
    }

    private b getFragmentManagerHelper() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return null;
        }
        if (currentActivity instanceof j) {
            return new b(((j) currentActivity).e());
        }
        return new b(currentActivity.getFragmentManager());
    }
}
