package com.facebook.react.views.modal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.k;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.f0;
import com.facebook.react.uimanager.h;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.q;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class d extends ViewGroup implements LifecycleEventListener {

    /* renamed from: b  reason: collision with root package name */
    private b f6171b;

    /* renamed from: c  reason: collision with root package name */
    private Dialog f6172c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f6173d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6174e;

    /* renamed from: f  reason: collision with root package name */
    private String f6175f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f6176g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f6177h;
    private DialogInterface.OnShowListener i;
    private c j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements DialogInterface.OnKeyListener {
        a() {
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 1) {
                if (i == 4) {
                    c.d.k.a.a.a(d.this.j, "setOnRequestCloseListener must be called by the manager");
                    d.this.j.a(dialogInterface);
                    return true;
                }
                Activity currentActivity = ((ReactContext) d.this.getContext()).getCurrentActivity();
                if (currentActivity == null) {
                    return false;
                }
                return currentActivity.onKeyUp(i, keyEvent);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b extends com.facebook.react.views.view.f implements f0 {

        /* renamed from: b  reason: collision with root package name */
        private boolean f6179b;

        /* renamed from: c  reason: collision with root package name */
        private int f6180c;

        /* renamed from: d  reason: collision with root package name */
        private int f6181d;

        /* renamed from: e  reason: collision with root package name */
        private j0 f6182e;

        /* renamed from: f  reason: collision with root package name */
        private final h f6183f;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends GuardedRunnable {

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f6184b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ReactContext reactContext, int i) {
                super(reactContext);
                this.f6184b = i;
            }

            @Override // com.facebook.react.bridge.GuardedRunnable
            public void runGuarded() {
                ((UIManagerModule) b.this.b().getNativeModule(UIManagerModule.class)).updateNodeSize(this.f6184b, b.this.f6180c, b.this.f6181d);
            }
        }

        public b(Context context) {
            super(context);
            this.f6179b = false;
            this.f6183f = new h(this);
        }

        private com.facebook.react.uimanager.events.d a() {
            return ((UIManagerModule) b().getNativeModule(UIManagerModule.class)).getEventDispatcher();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public ReactContext b() {
            return (ReactContext) getContext();
        }

        private void c() {
            if (getChildCount() <= 0) {
                this.f6179b = true;
                return;
            }
            this.f6179b = false;
            int id = getChildAt(0).getId();
            j0 j0Var = this.f6182e;
            if (j0Var != null) {
                a(j0Var, this.f6180c, this.f6181d);
                return;
            }
            ReactContext b2 = b();
            b2.runOnNativeModulesQueueThread(new a(b2, id));
        }

        @Override // com.facebook.react.uimanager.f0
        public void a(MotionEvent motionEvent) {
            this.f6183f.b(motionEvent, a());
        }

        public void a(j0 j0Var, int i, int i2) {
            this.f6182e = j0Var;
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            writableNativeMap.putDouble("screenWidth", q.a(i));
            writableNativeMap.putDouble("screenHeight", q.a(i2));
            j0Var.a(writableNativeMap);
        }

        @Override // com.facebook.react.uimanager.f0
        public void a(Throwable th) {
            b().handleException(new RuntimeException(th));
        }

        @Override // com.facebook.react.views.view.f, android.view.ViewGroup
        public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
            super.addView(view, i, layoutParams);
            if (this.f6179b) {
                c();
            }
        }

        @Override // com.facebook.react.views.view.f, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            this.f6183f.a(motionEvent, a());
            return super.onInterceptTouchEvent(motionEvent);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.views.view.f, android.view.View
        public void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            this.f6180c = i;
            this.f6181d = i2;
            c();
        }

        @Override // com.facebook.react.views.view.f, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            this.f6183f.a(motionEvent, a());
            super.onTouchEvent(motionEvent);
            return true;
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public void requestDisallowInterceptTouchEvent(boolean z) {
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(DialogInterface dialogInterface);
    }

    public d(Context context) {
        super(context);
        ((ReactContext) context).addLifecycleEventListener(this);
        this.f6171b = new b(context);
    }

    private void c() {
        Activity activity;
        UiThreadUtil.assertOnUiThread();
        Dialog dialog = this.f6172c;
        if (dialog != null) {
            if (dialog.isShowing() && ((activity = (Activity) com.facebook.react.j0.a.a.a(this.f6172c.getContext(), Activity.class)) == null || !activity.isFinishing())) {
                this.f6172c.dismiss();
            }
            this.f6172c = null;
            ((ViewGroup) this.f6171b.getParent()).removeViewAt(0);
        }
    }

    private void d() {
        c.d.k.a.a.a(this.f6172c, "mDialog must exist when we call updateProperties");
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            if ((currentActivity.getWindow().getAttributes().flags & 1024) != 0) {
                this.f6172c.getWindow().addFlags(1024);
            } else {
                this.f6172c.getWindow().clearFlags(1024);
            }
        }
        if (this.f6173d) {
            this.f6172c.getWindow().clearFlags(2);
            return;
        }
        this.f6172c.getWindow().setDimAmount(0.5f);
        this.f6172c.getWindow().setFlags(2, 2);
    }

    private View getContentView() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(this.f6171b);
        if (this.f6174e) {
            frameLayout.setSystemUiVisibility(1024);
        } else {
            frameLayout.setFitsSystemWindows(true);
        }
        return frameLayout;
    }

    private Activity getCurrentActivity() {
        return ((ReactContext) getContext()).getCurrentActivity();
    }

    public void a() {
        ((ReactContext) getContext()).removeLifecycleEventListener(this);
        c();
    }

    public void a(j0 j0Var, int i, int i2) {
        this.f6171b.a(j0Var, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addChildrenForAccessibility(ArrayList<View> arrayList) {
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        UiThreadUtil.assertOnUiThread();
        this.f6171b.addView(view, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b() {
        UiThreadUtil.assertOnUiThread();
        if (this.f6172c != null) {
            if (!this.f6177h) {
                d();
                return;
            }
            c();
        }
        this.f6177h = false;
        int i = k.Theme_FullScreenDialog;
        if (this.f6175f.equals("fade")) {
            i = k.Theme_FullScreenDialogAnimatedFade;
        } else if (this.f6175f.equals("slide")) {
            i = k.Theme_FullScreenDialogAnimatedSlide;
        }
        Activity currentActivity = getCurrentActivity();
        Context context = currentActivity == null ? getContext() : currentActivity;
        this.f6172c = new Dialog(context, i);
        this.f6172c.getWindow().setFlags(8, 8);
        this.f6172c.setContentView(getContentView());
        d();
        this.f6172c.setOnShowListener(this.i);
        this.f6172c.setOnKeyListener(new a());
        this.f6172c.getWindow().setSoftInputMode(16);
        if (this.f6176g) {
            this.f6172c.getWindow().addFlags(16777216);
        }
        if (currentActivity == null || currentActivity.isFinishing()) {
            return;
        }
        this.f6172c.show();
        if (context instanceof Activity) {
            this.f6172c.getWindow().getDecorView().setSystemUiVisibility(((Activity) context).getWindow().getDecorView().getSystemUiVisibility());
        }
        this.f6172c.getWindow().clearFlags(8);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(23)
    public void dispatchProvideStructure(ViewStructure viewStructure) {
        this.f6171b.dispatchProvideStructure(viewStructure);
    }

    @Override // android.view.ViewGroup
    public View getChildAt(int i) {
        return this.f6171b.getChildAt(i);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        return this.f6171b.getChildCount();
    }

    public Dialog getDialog() {
        return this.f6172c;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        a();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        UiThreadUtil.assertOnUiThread();
        this.f6171b.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        UiThreadUtil.assertOnUiThread();
        this.f6171b.removeView(getChildAt(i));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setAnimationType(String str) {
        this.f6175f = str;
        this.f6177h = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setHardwareAccelerated(boolean z) {
        this.f6176g = z;
        this.f6177h = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setOnRequestCloseListener(c cVar) {
        this.j = cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.i = onShowListener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setStatusBarTranslucent(boolean z) {
        this.f6174e = z;
        this.f6177h = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setTransparent(boolean z) {
        this.f6173d = z;
    }
}
