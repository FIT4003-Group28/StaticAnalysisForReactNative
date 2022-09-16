package com.swmansion.rnscreens;

import android.graphics.Paint;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
/* loaded from: classes.dex */
public class b extends ViewGroup {
    private static View.OnAttachStateChangeListener i = new a();

    /* renamed from: b  reason: collision with root package name */
    private ScreenFragment f10034b;

    /* renamed from: c  reason: collision with root package name */
    private com.swmansion.rnscreens.d f10035c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f10036d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f10037e;

    /* renamed from: f  reason: collision with root package name */
    private d f10038f;

    /* renamed from: g  reason: collision with root package name */
    private c f10039g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f10040h;

    /* loaded from: classes.dex */
    static class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
            view.removeOnAttachStateChangeListener(b.i);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: com.swmansion.rnscreens.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0201b extends GuardedRunnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ReactContext f10041b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f10042c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f10043d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0201b(ReactContext reactContext, ReactContext reactContext2, int i, int i2) {
            super(reactContext);
            this.f10041b = reactContext2;
            this.f10042c = i;
            this.f10043d = i2;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            ((UIManagerModule) this.f10041b.getNativeModule(UIManagerModule.class)).updateNodeSize(b.this.getId(), this.f10042c, this.f10043d);
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        DEFAULT,
        NONE,
        FADE
    }

    /* loaded from: classes.dex */
    public enum d {
        PUSH,
        MODAL,
        TRANSPARENT_MODAL
    }

    public b(ReactContext reactContext) {
        super(reactContext);
        this.f10038f = d.PUSH;
        this.f10039g = c.DEFAULT;
        this.f10040h = true;
        setLayoutParams(new WindowManager.LayoutParams(2));
    }

    public boolean a() {
        return this.f10036d;
    }

    public boolean b() {
        return this.f10040h;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public com.swmansion.rnscreens.d getContainer() {
        return this.f10035c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ScreenFragment getFragment() {
        return this.f10034b;
    }

    public c getStackAnimation() {
        return this.f10039g;
    }

    public d getStackPresentation() {
        return this.f10038f;
    }

    @Override // android.view.View
    protected void onAnimationEnd() {
        super.onAnimationEnd();
        ScreenFragment screenFragment = this.f10034b;
        if (screenFragment != null) {
            screenFragment.n0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        View focusedChild = getFocusedChild();
        if (focusedChild != null) {
            while (focusedChild instanceof ViewGroup) {
                focusedChild = ((ViewGroup) focusedChild).getFocusedChild();
            }
            if (!(focusedChild instanceof TextView)) {
                return;
            }
            TextView textView = (TextView) focusedChild;
            if (!textView.getShowSoftInputOnFocus()) {
                return;
            }
            textView.addOnAttachStateChangeListener(i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        if (z) {
            ReactContext reactContext = (ReactContext) getContext();
            reactContext.runOnNativeModulesQueueThread(new C0201b(reactContext, reactContext, i4 - i2, i5 - i3));
        }
    }

    public void setActive(boolean z) {
        if (z == this.f10036d) {
            return;
        }
        this.f10036d = z;
        com.swmansion.rnscreens.d dVar = this.f10035c;
        if (dVar == null) {
            return;
        }
        dVar.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setContainer(com.swmansion.rnscreens.d dVar) {
        this.f10035c = dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setFragment(ScreenFragment screenFragment) {
        this.f10034b = screenFragment;
    }

    public void setGestureEnabled(boolean z) {
        this.f10040h = z;
    }

    @Override // android.view.View
    public void setLayerType(int i2, Paint paint) {
    }

    public void setStackAnimation(c cVar) {
        this.f10039g = cVar;
    }

    public void setStackPresentation(d dVar) {
        this.f10038f = dVar;
    }

    public void setTransitioning(boolean z) {
        if (this.f10037e == z) {
            return;
        }
        this.f10037e = z;
        super.setLayerType(z ? 2 : 0, null);
    }
}
