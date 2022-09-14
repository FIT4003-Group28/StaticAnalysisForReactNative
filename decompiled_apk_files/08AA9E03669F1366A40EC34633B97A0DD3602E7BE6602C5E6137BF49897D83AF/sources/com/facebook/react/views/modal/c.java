package com.facebook.react.views.modal;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import com.facebook.react.bridge.aj;
import com.facebook.react.bridge.l;
import com.facebook.react.bridge.x;
import com.facebook.react.f;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.aa;
import java.util.ArrayList;
/* compiled from: ReactModalHostView.java */
/* loaded from: classes.dex */
public class c extends ViewGroup implements x {

    /* renamed from: a  reason: collision with root package name */
    private a f3989a;

    /* renamed from: b  reason: collision with root package name */
    private Dialog f3990b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f3991c;

    /* renamed from: d  reason: collision with root package name */
    private String f3992d;
    private boolean e;
    private boolean f;
    private DialogInterface.OnShowListener g;
    private b h;

    /* compiled from: ReactModalHostView.java */
    /* loaded from: classes.dex */
    public interface b {
        void a(DialogInterface dialogInterface);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addChildrenForAccessibility(ArrayList<View> arrayList) {
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // com.facebook.react.bridge.x
    public void onHostPause() {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public c(Context context) {
        super(context);
        ((aj) context).a(this);
        this.f3989a = new a(context);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        this.f3989a.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        return this.f3989a.getChildCount();
    }

    @Override // android.view.ViewGroup
    public View getChildAt(int i) {
        return this.f3989a.getChildAt(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        this.f3989a.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i) {
        this.f3989a.removeView(getChildAt(i));
    }

    public void a() {
        ((aj) getContext()).b(this);
        c();
    }

    private void c() {
        if (this.f3990b != null) {
            Activity currentActivity = getCurrentActivity();
            if (this.f3990b.isShowing() && (currentActivity == null || !currentActivity.isFinishing())) {
                this.f3990b.dismiss();
            }
            this.f3990b = null;
            ((ViewGroup) this.f3989a.getParent()).removeViewAt(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setOnRequestCloseListener(b bVar) {
        this.h = bVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.g = onShowListener;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setTransparent(boolean z) {
        this.f3991c = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setAnimationType(String str) {
        this.f3992d = str;
        this.f = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setHardwareAccelerated(boolean z) {
        this.e = z;
        this.f = true;
    }

    @Override // com.facebook.react.bridge.x
    public void onHostResume() {
        b();
    }

    @Override // com.facebook.react.bridge.x
    public void onHostDestroy() {
        a();
    }

    public Dialog getDialog() {
        return this.f3990b;
    }

    private Activity getCurrentActivity() {
        return ((aj) getContext()).i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void b() {
        if (this.f3990b != null) {
            if (this.f) {
                c();
            } else {
                d();
                return;
            }
        }
        this.f = false;
        int i = f.c.Theme_FullScreenDialog;
        if (this.f3992d.equals("fade")) {
            i = f.c.Theme_FullScreenDialogAnimatedFade;
        } else if (this.f3992d.equals("slide")) {
            i = f.c.Theme_FullScreenDialogAnimatedSlide;
        }
        Activity currentActivity = getCurrentActivity();
        this.f3990b = new Dialog(currentActivity == null ? getContext() : currentActivity, i);
        this.f3990b.setContentView(getContentView());
        d();
        this.f3990b.setOnShowListener(this.g);
        this.f3990b.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: com.facebook.react.views.modal.c.1
            @Override // android.content.DialogInterface.OnKeyListener
            public boolean onKey(DialogInterface dialogInterface, int i2, KeyEvent keyEvent) {
                if (keyEvent.getAction() == 1) {
                    if (i2 == 4) {
                        com.facebook.j.a.a.a(c.this.h, "setOnRequestCloseListener must be called by the manager");
                        c.this.h.a(dialogInterface);
                        return true;
                    }
                    Activity i3 = ((aj) c.this.getContext()).i();
                    if (i3 == null) {
                        return false;
                    }
                    return i3.onKeyUp(i2, keyEvent);
                }
                return false;
            }
        });
        this.f3990b.getWindow().setSoftInputMode(16);
        if (this.e) {
            this.f3990b.getWindow().addFlags(16777216);
        }
        if (currentActivity == null || !currentActivity.isFinishing()) {
            this.f3990b.show();
        }
    }

    private View getContentView() {
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(this.f3989a);
        frameLayout.setFitsSystemWindows(true);
        return frameLayout;
    }

    private void d() {
        com.facebook.j.a.a.a(this.f3990b, "mDialog must exist when we call updateProperties");
        if (this.f3991c) {
            this.f3990b.getWindow().clearFlags(2);
            return;
        }
        this.f3990b.getWindow().setDimAmount(0.5f);
        this.f3990b.getWindow().setFlags(2, 2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ReactModalHostView.java */
    /* loaded from: classes.dex */
    public static class a extends com.facebook.react.views.view.f implements aa {

        /* renamed from: a  reason: collision with root package name */
        private final com.facebook.react.uimanager.f f3994a;

        @Override // android.view.ViewGroup, android.view.ViewParent
        public void requestDisallowInterceptTouchEvent(boolean z) {
        }

        public a(Context context) {
            super(context);
            this.f3994a = new com.facebook.react.uimanager.f(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.views.view.f, android.view.View
        public void onSizeChanged(final int i, final int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            if (getChildCount() > 0) {
                final int id = getChildAt(0).getId();
                aj ajVar = (aj) getContext();
                ajVar.b(new l(ajVar) { // from class: com.facebook.react.views.modal.c.a.1
                    @Override // com.facebook.react.bridge.l
                    public void a() {
                        ((UIManagerModule) ((aj) a.this.getContext()).b(UIManagerModule.class)).updateNodeSize(id, i, i2);
                    }
                });
            }
        }

        @Override // com.facebook.react.views.view.f, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            this.f3994a.b(motionEvent, d());
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override // com.facebook.react.views.view.f, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            this.f3994a.b(motionEvent, d());
            super.onTouchEvent(motionEvent);
            return true;
        }

        @Override // com.facebook.react.uimanager.aa
        public void a(MotionEvent motionEvent) {
            this.f3994a.a(motionEvent, d());
        }

        private com.facebook.react.uimanager.events.c d() {
            return ((UIManagerModule) ((aj) getContext()).b(UIManagerModule.class)).getEventDispatcher();
        }
    }
}
