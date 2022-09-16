package com.airbnb.android.react.lottie;

import a.g.m.v;
import android.animation.Animator;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.f;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.k0;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
class LottieAnimationViewManager extends SimpleViewManager<c.a.a.d> {
    private static final int COMMAND_PAUSE = 3;
    private static final int COMMAND_PLAY = 1;
    private static final int COMMAND_RESET = 2;
    private static final int COMMAND_RESUME = 4;
    private static final String REACT_CLASS = "LottieAnimationView";
    private static final String TAG = "LottieAnimationViewManager";
    private static final int VERSION = 1;
    private Map<c.a.a.d, com.airbnb.android.react.lottie.a> propManagersMap = new WeakHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Animator.AnimatorListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c.a.a.d f4960a;

        a(c.a.a.d dVar) {
            this.f4960a = dVar;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            LottieAnimationViewManager.this.sendOnAnimationFinishEvent(this.f4960a, true);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            LottieAnimationViewManager.this.sendOnAnimationFinishEvent(this.f4960a, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReadableArray f4962b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c.a.a.d f4963c;

        /* loaded from: classes.dex */
        class a implements View.OnAttachStateChangeListener {
            a() {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                c.a.a.d dVar = (c.a.a.d) view;
                dVar.setProgress(0.0f);
                dVar.f();
                dVar.removeOnAttachStateChangeListener(this);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                b.this.f4963c.removeOnAttachStateChangeListener(this);
            }
        }

        b(LottieAnimationViewManager lottieAnimationViewManager, ReadableArray readableArray, c.a.a.d dVar) {
            this.f4962b = readableArray;
            this.f4963c = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = this.f4962b.getInt(0);
            int i2 = this.f4962b.getInt(1);
            if (i != -1 && i2 != -1) {
                c.a.a.d dVar = this.f4963c;
                if (i > i2) {
                    dVar.a(i2, i);
                    this.f4963c.h();
                } else {
                    dVar.a(i, i2);
                }
            }
            if (!v.H(this.f4963c)) {
                this.f4963c.addOnAttachStateChangeListener(new a());
                return;
            }
            this.f4963c.setProgress(0.0f);
            this.f4963c.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c.a.a.d f4965b;

        c(LottieAnimationViewManager lottieAnimationViewManager, c.a.a.d dVar) {
            this.f4965b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v.H(this.f4965b)) {
                this.f4965b.a();
                this.f4965b.setProgress(0.0f);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c.a.a.d f4966b;

        d(LottieAnimationViewManager lottieAnimationViewManager, c.a.a.d dVar) {
            this.f4966b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v.H(this.f4966b)) {
                this.f4966b.e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c.a.a.d f4967b;

        e(LottieAnimationViewManager lottieAnimationViewManager, c.a.a.d dVar) {
            this.f4967b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (v.H(this.f4967b)) {
                this.f4967b.g();
            }
        }
    }

    private com.airbnb.android.react.lottie.a getOrCreatePropertyManager(c.a.a.d dVar) {
        com.airbnb.android.react.lottie.a aVar = this.propManagersMap.get(dVar);
        if (aVar == null) {
            com.airbnb.android.react.lottie.a aVar2 = new com.airbnb.android.react.lottie.a(dVar);
            this.propManagersMap.put(dVar, aVar2);
            return aVar2;
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendOnAnimationFinishEvent(c.a.a.d dVar, boolean z) {
        ReactContext reactContext;
        WritableMap createMap = Arguments.createMap();
        createMap.putBoolean("isCancelled", z);
        Context context = dVar.getContext();
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                reactContext = null;
                break;
            } else if (context instanceof ReactContext) {
                reactContext = (ReactContext) context;
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (reactContext != null) {
            ((RCTEventEmitter) reactContext.getJSModule(RCTEventEmitter.class)).receiveEvent(dVar.getId(), "animationFinish", createMap);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public c.a.a.d mo345createViewInstance(k0 k0Var) {
        c.a.a.d dVar = new c.a.a.d(k0Var);
        dVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        dVar.a(new a(dVar));
        return dVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return f.a("play", 1, "reset", 2, "pause", 3, "resume", 4);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomBubblingEventTypeConstants() {
        f.b a2 = f.a();
        a2.a("animationFinish", f.a("phasedRegistrationNames", f.a("bubbled", "onAnimationFinish")));
        return a2.a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        f.b a2 = f.a();
        a2.a("VERSION", 1);
        return a2.a();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(c.a.a.d dVar) {
        super.onAfterUpdateTransaction((LottieAnimationViewManager) dVar);
        getOrCreatePropertyManager(dVar).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(c.a.a.d dVar, int i, ReadableArray readableArray) {
        Handler handler;
        Runnable cVar;
        if (i == 1) {
            new Handler(Looper.getMainLooper()).post(new b(this, readableArray, dVar));
            return;
        }
        if (i == 2) {
            handler = new Handler(Looper.getMainLooper());
            cVar = new c(this, dVar);
        } else if (i == 3) {
            handler = new Handler(Looper.getMainLooper());
            cVar = new d(this, dVar);
        } else if (i != 4) {
            return;
        } else {
            handler = new Handler(Looper.getMainLooper());
            cVar = new e(this, dVar);
        }
        handler.post(cVar);
    }

    @com.facebook.react.uimanager.e1.a(name = "colorFilters")
    public void setColorFilters(c.a.a.d dVar, ReadableArray readableArray) {
        getOrCreatePropertyManager(dVar).a(readableArray);
    }

    @com.facebook.react.uimanager.e1.a(name = "enableMergePathsAndroidForKitKatAndAbove")
    public void setEnableMergePaths(c.a.a.d dVar, boolean z) {
        getOrCreatePropertyManager(dVar).a(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "imageAssetsFolder")
    public void setImageAssetsFolder(c.a.a.d dVar, String str) {
        getOrCreatePropertyManager(dVar).c(str);
    }

    @com.facebook.react.uimanager.e1.a(name = "loop")
    public void setLoop(c.a.a.d dVar, boolean z) {
        getOrCreatePropertyManager(dVar).b(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "progress")
    public void setProgress(c.a.a.d dVar, float f2) {
        getOrCreatePropertyManager(dVar).a(Float.valueOf(f2));
    }

    @com.facebook.react.uimanager.e1.a(name = "resizeMode")
    public void setResizeMode(c.a.a.d dVar, String str) {
        getOrCreatePropertyManager(dVar).a("cover".equals(str) ? ImageView.ScaleType.CENTER_CROP : "contain".equals(str) ? ImageView.ScaleType.CENTER_INSIDE : "center".equals(str) ? ImageView.ScaleType.CENTER : null);
    }

    @com.facebook.react.uimanager.e1.a(name = "sourceJson")
    public void setSourceJson(c.a.a.d dVar, String str) {
        getOrCreatePropertyManager(dVar).a(str);
    }

    @com.facebook.react.uimanager.e1.a(name = "sourceName")
    public void setSourceName(c.a.a.d dVar, String str) {
        if (!str.contains(".")) {
            str = str + ".json";
        }
        getOrCreatePropertyManager(dVar).b(str);
    }

    @com.facebook.react.uimanager.e1.a(name = "speed")
    public void setSpeed(c.a.a.d dVar, double d2) {
        getOrCreatePropertyManager(dVar).a((float) d2);
    }
}
