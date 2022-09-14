package com.facebook.react.modules.dialog;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.j;
import android.support.v4.app.n;
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
public class DialogModule extends ReactContextBaseJavaModule implements x {
    static final String FRAGMENT_TAG = "com.facebook.catalyst.react.dialog.DialogModule";
    static final String KEY_CANCELABLE = "cancelable";
    static final String KEY_ITEMS = "items";
    static final String KEY_MESSAGE = "message";
    static final String KEY_TITLE = "title";
    static final String NAME = "DialogManagerAndroid";
    private boolean mIsInForeground;
    static final String ACTION_BUTTON_CLICKED = "buttonClicked";
    static final String ACTION_DISMISSED = "dismissed";
    static final String KEY_BUTTON_POSITIVE = "buttonPositive";
    static final String KEY_BUTTON_NEGATIVE = "buttonNegative";
    static final String KEY_BUTTON_NEUTRAL = "buttonNeutral";
    static final Map<String, Object> CONSTANTS = f.a(ACTION_BUTTON_CLICKED, ACTION_BUTTON_CLICKED, ACTION_DISMISSED, ACTION_DISMISSED, KEY_BUTTON_POSITIVE, -1, KEY_BUTTON_NEGATIVE, -2, KEY_BUTTON_NEUTRAL, -3);

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.x
    public void onHostDestroy() {
    }

    public DialogModule(ah ahVar) {
        super(ahVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: b  reason: collision with root package name */
        private final FragmentManager f3561b;

        /* renamed from: c  reason: collision with root package name */
        private final n f3562c;

        /* renamed from: d  reason: collision with root package name */
        private Object f3563d;

        private boolean b() {
            return this.f3562c != null;
        }

        public b(n nVar) {
            this.f3561b = null;
            this.f3562c = nVar;
        }

        public b(FragmentManager fragmentManager) {
            this.f3561b = fragmentManager;
            this.f3562c = null;
        }

        public void a() {
            if (this.f3563d == null) {
                return;
            }
            if (b()) {
                ((com.facebook.react.modules.dialog.b) this.f3563d).show(this.f3562c, DialogModule.FRAGMENT_TAG);
            } else {
                ((com.facebook.react.modules.dialog.a) this.f3563d).show(this.f3561b, DialogModule.FRAGMENT_TAG);
            }
            this.f3563d = null;
        }

        private void c() {
            if (b()) {
                com.facebook.react.modules.dialog.b bVar = (com.facebook.react.modules.dialog.b) this.f3562c.a(DialogModule.FRAGMENT_TAG);
                if (bVar == null) {
                    return;
                }
                bVar.dismiss();
                return;
            }
            com.facebook.react.modules.dialog.a aVar = (com.facebook.react.modules.dialog.a) this.f3561b.findFragmentByTag(DialogModule.FRAGMENT_TAG);
            if (aVar == null) {
                return;
            }
            aVar.dismiss();
        }

        public void a(boolean z, Bundle bundle, d dVar) {
            c();
            a aVar = dVar != null ? new a(dVar) : null;
            if (b()) {
                com.facebook.react.modules.dialog.b bVar = new com.facebook.react.modules.dialog.b(aVar, bundle);
                if (z) {
                    if (bundle.containsKey(DialogModule.KEY_CANCELABLE)) {
                        bVar.setCancelable(bundle.getBoolean(DialogModule.KEY_CANCELABLE));
                    }
                    bVar.show(this.f3562c, DialogModule.FRAGMENT_TAG);
                    return;
                }
                this.f3563d = bVar;
                return;
            }
            com.facebook.react.modules.dialog.a aVar2 = new com.facebook.react.modules.dialog.a(aVar, bundle);
            if (z) {
                if (bundle.containsKey(DialogModule.KEY_CANCELABLE)) {
                    aVar2.setCancelable(bundle.getBoolean(DialogModule.KEY_CANCELABLE));
                }
                aVar2.show(this.f3561b, DialogModule.FRAGMENT_TAG);
                return;
            }
            this.f3563d = aVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {

        /* renamed from: b  reason: collision with root package name */
        private final d f3558b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f3559c = false;

        public a(d dVar) {
            this.f3558b = dVar;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            if (this.f3559c || !DialogModule.this.getReactApplicationContext().b()) {
                return;
            }
            this.f3558b.a(DialogModule.ACTION_BUTTON_CLICKED, Integer.valueOf(i));
            this.f3559c = true;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (this.f3559c || !DialogModule.this.getReactApplicationContext().b()) {
                return;
            }
            this.f3558b.a(DialogModule.ACTION_DISMISSED);
            this.f3559c = true;
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return CONSTANTS;
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
            com.facebook.common.e.a.c(DialogModule.class, "onHostResume called but no FragmentManager found");
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
