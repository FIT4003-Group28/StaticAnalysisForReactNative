package a.g.m;

import a.g.m.a;
import a.g.m.e0.c;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class v {

    /* renamed from: a  reason: collision with root package name */
    private static Field f376a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f377b;

    /* renamed from: c  reason: collision with root package name */
    private static Field f378c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f379d;

    /* renamed from: e  reason: collision with root package name */
    private static WeakHashMap<View, String> f380e;

    /* renamed from: f  reason: collision with root package name */
    private static WeakHashMap<View, z> f381f;

    /* renamed from: g  reason: collision with root package name */
    private static Field f382g;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f383h;
    private static ThreadLocal<Rect> i;

    /* loaded from: classes.dex */
    class a implements View.OnApplyWindowInsetsListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f384a;

        a(r rVar) {
            this.f384a = rVar;
        }

        @Override // android.view.View.OnApplyWindowInsetsListener
        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            return this.f384a.a(view, d0.a(windowInsets, view)).i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends g<Boolean> {
        b(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // a.g.m.v.g
        /* renamed from: a */
        public Boolean mo11a(View view) {
            return Boolean.valueOf(view.isScreenReaderFocusable());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // a.g.m.v.g
        public void a(View view, Boolean bool) {
            view.setScreenReaderFocusable(bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // a.g.m.v.g
        /* renamed from: b */
        public boolean a(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends g<CharSequence> {
        c(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // a.g.m.v.g
        /* renamed from: a */
        public CharSequence mo11a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // a.g.m.v.g
        public void a(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // a.g.m.v.g
        public boolean a(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends g<CharSequence> {
        d(int i, Class cls, int i2, int i3) {
            super(i, cls, i2, i3);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // a.g.m.v.g
        /* renamed from: a */
        public CharSequence mo11a(View view) {
            return view.getStateDescription();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // a.g.m.v.g
        public void a(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // a.g.m.v.g
        public boolean a(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e extends g<Boolean> {
        e(int i, Class cls, int i2) {
            super(i, cls, i2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // a.g.m.v.g
        /* renamed from: a */
        public Boolean mo11a(View view) {
            return Boolean.valueOf(view.isAccessibilityHeading());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // a.g.m.v.g
        public void a(View view, Boolean bool) {
            view.setAccessibilityHeading(bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // a.g.m.v.g
        /* renamed from: b */
        public boolean a(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* loaded from: classes.dex */
    static class f implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: b  reason: collision with root package name */
        private WeakHashMap<View, Boolean> f385b = new WeakHashMap<>();

        f() {
        }

        private void a(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void a(View view, boolean z) {
            boolean z2 = view.getVisibility() == 0;
            if (z != z2) {
                v.c(view, z2 ? 16 : 32);
                this.f385b.put(view, Boolean.valueOf(z2));
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry<View, Boolean> entry : this.f385b.entrySet()) {
                    a(entry.getKey(), entry.getValue().booleanValue());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            a(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class g<T> {

        /* renamed from: a  reason: collision with root package name */
        private final int f386a;

        /* renamed from: b  reason: collision with root package name */
        private final Class<T> f387b;

        /* renamed from: c  reason: collision with root package name */
        private final int f388c;

        /* renamed from: d  reason: collision with root package name */
        private final int f389d;

        g(int i, Class<T> cls, int i2) {
            this(i, cls, 0, i2);
        }

        g(int i, Class<T> cls, int i2, int i3) {
            this.f386a = i;
            this.f387b = cls;
            this.f389d = i2;
            this.f388c = i3;
        }

        private boolean a() {
            return Build.VERSION.SDK_INT >= 19;
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.f388c;
        }

        /* renamed from: a */
        abstract T mo11a(View view);

        abstract void a(View view, T t);

        boolean a(Boolean bool, Boolean bool2) {
            return (bool == null ? false : bool.booleanValue()) == (bool2 == null ? false : bool2.booleanValue());
        }

        abstract boolean a(T t, T t2);

        T b(View view) {
            if (b()) {
                return mo11a(view);
            }
            if (!a()) {
                return null;
            }
            T t = (T) view.getTag(this.f386a);
            if (!this.f387b.isInstance(t)) {
                return null;
            }
            return t;
        }

        void b(View view, T t) {
            if (b()) {
                a(view, (View) t);
            } else if (!a() || !a(b(view), t)) {
            } else {
                v.s(view);
                view.setTag(this.f386a, t);
                v.c(view, this.f389d);
            }
        }
    }

    /* loaded from: classes.dex */
    private static class h {
        public static d0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            d0 a2 = d0.a(rootWindowInsets);
            a2.a(a2);
            a2.a(view.getRootView());
            return a2;
        }
    }

    /* loaded from: classes.dex */
    public interface i {
        boolean a(View view, KeyEvent keyEvent);
    }

    /* loaded from: classes.dex */
    static class j {

        /* renamed from: d  reason: collision with root package name */
        private static final ArrayList<WeakReference<View>> f390d = new ArrayList<>();

        /* renamed from: a  reason: collision with root package name */
        private WeakHashMap<View, Boolean> f391a = null;

        /* renamed from: b  reason: collision with root package name */
        private SparseArray<WeakReference<View>> f392b = null;

        /* renamed from: c  reason: collision with root package name */
        private WeakReference<KeyEvent> f393c = null;

        j() {
        }

        static j a(View view) {
            j jVar = (j) view.getTag(a.g.c.tag_unhandled_key_event_manager);
            if (jVar == null) {
                j jVar2 = new j();
                view.setTag(a.g.c.tag_unhandled_key_event_manager, jVar2);
                return jVar2;
            }
            return jVar;
        }

        private SparseArray<WeakReference<View>> a() {
            if (this.f392b == null) {
                this.f392b = new SparseArray<>();
            }
            return this.f392b;
        }

        private View b(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.f391a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View b2 = b(viewGroup.getChildAt(childCount), keyEvent);
                        if (b2 != null) {
                            return b2;
                        }
                    }
                }
                if (c(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private void b() {
            WeakHashMap<View, Boolean> weakHashMap = this.f391a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (f390d.isEmpty()) {
                return;
            }
            synchronized (f390d) {
                if (this.f391a == null) {
                    this.f391a = new WeakHashMap<>();
                }
                for (int size = f390d.size() - 1; size >= 0; size--) {
                    View view = f390d.get(size).get();
                    if (view == null) {
                        f390d.remove(size);
                    } else {
                        this.f391a.put(view, Boolean.TRUE);
                        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                            this.f391a.put((View) parent, Boolean.TRUE);
                        }
                    }
                }
            }
        }

        private boolean c(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(a.g.c.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (((i) arrayList.get(size)).a(view, keyEvent)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }

        boolean a(KeyEvent keyEvent) {
            int indexOfKey;
            WeakReference<KeyEvent> weakReference = this.f393c;
            if (weakReference == null || weakReference.get() != keyEvent) {
                this.f393c = new WeakReference<>(keyEvent);
                WeakReference<View> weakReference2 = null;
                SparseArray<WeakReference<View>> a2 = a();
                if (keyEvent.getAction() == 1 && (indexOfKey = a2.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference2 = a2.valueAt(indexOfKey);
                    a2.removeAt(indexOfKey);
                }
                if (weakReference2 == null) {
                    weakReference2 = a2.get(keyEvent.getKeyCode());
                }
                if (weakReference2 == null) {
                    return false;
                }
                View view = weakReference2.get();
                if (view != null && v.H(view)) {
                    c(view, keyEvent);
                }
                return true;
            }
            return false;
        }

        boolean a(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                b();
            }
            View b2 = b(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (b2 != null && !KeyEvent.isModifierKey(keyCode)) {
                    a().put(keyCode, new WeakReference<>(b2));
                }
            }
            return b2 != null;
        }
    }

    static {
        new AtomicInteger(1);
        f381f = null;
        f383h = false;
        int[] iArr = {a.g.c.accessibility_custom_action_0, a.g.c.accessibility_custom_action_1, a.g.c.accessibility_custom_action_2, a.g.c.accessibility_custom_action_3, a.g.c.accessibility_custom_action_4, a.g.c.accessibility_custom_action_5, a.g.c.accessibility_custom_action_6, a.g.c.accessibility_custom_action_7, a.g.c.accessibility_custom_action_8, a.g.c.accessibility_custom_action_9, a.g.c.accessibility_custom_action_10, a.g.c.accessibility_custom_action_11, a.g.c.accessibility_custom_action_12, a.g.c.accessibility_custom_action_13, a.g.c.accessibility_custom_action_14, a.g.c.accessibility_custom_action_15, a.g.c.accessibility_custom_action_16, a.g.c.accessibility_custom_action_17, a.g.c.accessibility_custom_action_18, a.g.c.accessibility_custom_action_19, a.g.c.accessibility_custom_action_20, a.g.c.accessibility_custom_action_21, a.g.c.accessibility_custom_action_22, a.g.c.accessibility_custom_action_23, a.g.c.accessibility_custom_action_24, a.g.c.accessibility_custom_action_25, a.g.c.accessibility_custom_action_26, a.g.c.accessibility_custom_action_27, a.g.c.accessibility_custom_action_28, a.g.c.accessibility_custom_action_29, a.g.c.accessibility_custom_action_30, a.g.c.accessibility_custom_action_31};
        new f();
    }

    public static int A(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    public static float B(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getZ();
        }
        return 0.0f;
    }

    public static boolean C(View view) {
        return c(view) != null;
    }

    public static boolean D(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    public static boolean E(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasOverlappingRendering();
        }
        return true;
    }

    public static boolean F(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    public static boolean G(View view) {
        Boolean b2 = a().b(view);
        if (b2 == null) {
            return false;
        }
        return b2.booleanValue();
    }

    public static boolean H(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isAttachedToWindow() : view.getWindowToken() != null;
    }

    public static boolean I(View view) {
        return Build.VERSION.SDK_INT >= 19 ? view.isLaidOut() : view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static boolean J(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.isNestedScrollingEnabled();
        }
        if (!(view instanceof l)) {
            return false;
        }
        return ((l) view).isNestedScrollingEnabled();
    }

    public static boolean K(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.isPaddingRelative();
        }
        return false;
    }

    public static boolean L(View view) {
        Boolean b2 = d().b(view);
        if (b2 == null) {
            return false;
        }
        return b2.booleanValue();
    }

    public static void M(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
        } else {
            view.postInvalidate();
        }
    }

    public static void N(View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 20) {
            view.requestApplyInsets();
        } else if (i2 < 16) {
        } else {
            view.requestFitSystemWindows();
        }
    }

    private static void O(View view) {
        if (n(view) == 0) {
            h(view, 1);
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (n((View) parent) == 4) {
                h(view, 2);
                return;
            }
        }
    }

    public static void P(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
        } else if (!(view instanceof l)) {
        } else {
            ((l) view).stopNestedScroll();
        }
    }

    private static void Q(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static d0 a(View view, d0 d0Var) {
        WindowInsets i2;
        if (Build.VERSION.SDK_INT >= 21 && (i2 = d0Var.i()) != null) {
            WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(i2);
            if (!dispatchApplyWindowInsets.equals(i2)) {
                return d0.a(dispatchApplyWindowInsets, view);
            }
        }
        return d0Var;
    }

    private static g<Boolean> a() {
        return new e(a.g.c.tag_accessibility_heading, Boolean.class, 28);
    }

    public static z a(View view) {
        if (f381f == null) {
            f381f = new WeakHashMap<>();
        }
        z zVar = f381f.get(view);
        if (zVar == null) {
            z zVar2 = new z(view);
            f381f.put(view, zVar2);
            return zVar2;
        }
        return zVar;
    }

    private static void a(int i2, View view) {
        List<c.a> g2 = g(view);
        for (int i3 = 0; i3 < g2.size(); i3++) {
            if (g2.get(i3).a() == i2) {
                g2.remove(i3);
                return;
            }
        }
    }

    public static void a(View view, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f2);
        }
    }

    private static void a(View view, int i2) {
        view.offsetLeftAndRight(i2);
        if (view.getVisibility() == 0) {
            Q(view);
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                return;
            }
            Q((View) parent);
        }
    }

    public static void a(View view, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i2, i3);
        }
    }

    public static void a(View view, int i2, int i3, int i4, int i5) {
        if (Build.VERSION.SDK_INT >= 17) {
            view.setPaddingRelative(i2, i3, i4, i5);
        } else {
            view.setPadding(i2, i3, i4, i5);
        }
    }

    public static void a(View view, a.g.m.a aVar) {
        if (aVar == null && (c(view) instanceof a.C0013a)) {
            aVar = new a.g.m.a();
        }
        view.setAccessibilityDelegate(aVar == null ? null : aVar.a());
    }

    private static void a(View view, c.a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            s(view);
            a(aVar.a(), view);
            g(view).add(aVar);
            c(view, 0);
        }
    }

    public static void a(View view, c.a aVar, CharSequence charSequence, a.g.m.e0.f fVar) {
        if (fVar == null && charSequence == null) {
            f(view, aVar.a());
        } else {
            a(view, aVar.a(charSequence, fVar));
        }
    }

    public static void a(View view, a.g.m.e0.c cVar) {
        view.onInitializeAccessibilityNodeInfo(cVar.x());
    }

    public static void a(View view, r rVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            if (rVar == null) {
                view.setOnApplyWindowInsetsListener(null);
            } else {
                view.setOnApplyWindowInsetsListener(new a(rVar));
            }
        }
    }

    public static void a(View view, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT < 21) {
            if (!(view instanceof u)) {
                return;
            }
            ((u) view).setSupportBackgroundTintList(colorStateList);
            return;
        }
        view.setBackgroundTintList(colorStateList);
        if (Build.VERSION.SDK_INT != 21) {
            return;
        }
        Drawable background = view.getBackground();
        boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
        if (background == null || !z) {
            return;
        }
        if (background.isStateful()) {
            background.setState(view.getDrawableState());
        }
        view.setBackground(background);
    }

    public static void a(View view, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT < 21) {
            if (!(view instanceof u)) {
                return;
            }
            ((u) view).setSupportBackgroundTintMode(mode);
            return;
        }
        view.setBackgroundTintMode(mode);
        if (Build.VERSION.SDK_INT != 21) {
            return;
        }
        Drawable background = view.getBackground();
        boolean z = (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) ? false : true;
        if (background == null || !z) {
            return;
        }
        if (background.isStateful()) {
            background.setState(view.getDrawableState());
        }
        view.setBackground(background);
    }

    public static void a(View view, Rect rect) {
        if (Build.VERSION.SDK_INT >= 18) {
            view.setClipBounds(rect);
        }
    }

    public static void a(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
        } else {
            view.setBackgroundDrawable(drawable);
        }
    }

    public static void a(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay());
        }
    }

    public static void a(View view, Runnable runnable, long j2) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, j2);
        } else {
            view.postDelayed(runnable, ValueAnimator.getFrameDelay() + j2);
        }
    }

    public static void a(View view, String str) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(str);
            return;
        }
        if (f380e == null) {
            f380e = new WeakHashMap<>();
        }
        f380e.put(view, str);
    }

    public static void a(View view, boolean z) {
        a().b(view, Boolean.valueOf(z));
    }

    public static boolean a(View view, int i2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.performAccessibilityAction(i2, bundle);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return j.a(view).a(view, keyEvent);
    }

    public static a.g.m.a b(View view) {
        View.AccessibilityDelegate c2 = c(view);
        if (c2 == null) {
            return null;
        }
        return c2 instanceof a.C0013a ? ((a.C0013a) c2).f317a : new a.g.m.a(c2);
    }

    public static d0 b(View view, d0 d0Var) {
        WindowInsets i2;
        if (Build.VERSION.SDK_INT >= 21 && (i2 = d0Var.i()) != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(i2);
            if (!onApplyWindowInsets.equals(i2)) {
                return d0.a(onApplyWindowInsets, view);
            }
        }
        return d0Var;
    }

    private static Rect b() {
        if (i == null) {
            i = new ThreadLocal<>();
        }
        Rect rect = i.get();
        if (rect == null) {
            rect = new Rect();
            i.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static void b(View view, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTranslationZ(f2);
        }
    }

    private static void b(View view, int i2) {
        view.offsetTopAndBottom(i2);
        if (view.getVisibility() == 0) {
            Q(view);
            ViewParent parent = view.getParent();
            if (!(parent instanceof View)) {
                return;
            }
            Q((View) parent);
        }
    }

    public static void b(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setHasTransientState(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return j.a(view).a(keyEvent);
    }

    private static g<CharSequence> c() {
        return new c(a.g.c.tag_accessibility_pane_title, CharSequence.class, 8, 28);
    }

    private static View.AccessibilityDelegate c(View view) {
        return Build.VERSION.SDK_INT >= 29 ? view.getAccessibilityDelegate() : d(view);
    }

    static void c(View view, int i2) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        boolean z = f(view) != null && view.getVisibility() == 0;
        int i3 = 32;
        if (e(view) != 0 || z) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            if (!z) {
                i3 = 2048;
            }
            obtain.setEventType(i3);
            obtain.setContentChangeTypes(i2);
            if (z) {
                obtain.getText().add(f(view));
                O(view);
            }
            view.sendAccessibilityEventUnchecked(obtain);
        } else if (i2 == 32) {
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(i2);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(f(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        } else if (view.getParent() == null) {
        } else {
            try {
                view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
            } catch (AbstractMethodError e2) {
                Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
            }
        }
    }

    public static void c(View view, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setNestedScrollingEnabled(z);
        } else if (!(view instanceof l)) {
        } else {
            ((l) view).setNestedScrollingEnabled(z);
        }
    }

    private static g<Boolean> d() {
        return new b(a.g.c.tag_screen_reader_focusable, Boolean.class, 28);
    }

    private static View.AccessibilityDelegate d(View view) {
        if (f383h) {
            return null;
        }
        if (f382g == null) {
            try {
                f382g = View.class.getDeclaredField("mAccessibilityDelegate");
                f382g.setAccessible(true);
            } catch (Throwable unused) {
                f383h = true;
                return null;
            }
        }
        try {
            Object obj = f382g.get(view);
            if (!(obj instanceof View.AccessibilityDelegate)) {
                return null;
            }
            return (View.AccessibilityDelegate) obj;
        } catch (Throwable unused2) {
            f383h = true;
            return null;
        }
    }

    public static void d(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            view.offsetLeftAndRight(i2);
        } else if (i3 < 21) {
            a(view, i2);
        } else {
            Rect b2 = b();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                b2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !b2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            a(view, i2);
            if (!z || !b2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                return;
            }
            ((View) parent).invalidate(b2);
        }
    }

    public static int e(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    private static g<CharSequence> e() {
        return new d(a.g.c.tag_state_description, CharSequence.class, 64, 30);
    }

    public static void e(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 23) {
            view.offsetTopAndBottom(i2);
        } else if (i3 < 21) {
            b(view, i2);
        } else {
            Rect b2 = b();
            boolean z = false;
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                View view2 = (View) parent;
                b2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
                z = !b2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
            b(view, i2);
            if (!z || !b2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
                return;
            }
            ((View) parent).invalidate(b2);
        }
    }

    public static CharSequence f(View view) {
        return c().b(view);
    }

    public static void f(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 21) {
            a(i2, view);
            c(view, 0);
        }
    }

    private static List<c.a> g(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(a.g.c.tag_accessibility_actions);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(a.g.c.tag_accessibility_actions, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static void g(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 19) {
            view.setAccessibilityLiveRegion(i2);
        }
    }

    public static ColorStateList h(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (!(view instanceof u)) {
            return null;
        }
        return ((u) view).getSupportBackgroundTintList();
    }

    public static void h(View view, int i2) {
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 19) {
            if (i3 < 16) {
                return;
            }
            if (i2 == 4) {
                i2 = 2;
            }
        }
        view.setImportantForAccessibility(i2);
    }

    public static PorterDuff.Mode i(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (!(view instanceof u)) {
            return null;
        }
        return ((u) view).getSupportBackgroundTintMode();
    }

    public static void i(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i2);
        }
    }

    public static Rect j(View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return view.getClipBounds();
        }
        return null;
    }

    public static Display k(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (!H(view)) {
            return null;
        }
        return ((WindowManager) view.getContext().getSystemService("window")).getDefaultDisplay();
    }

    public static float l(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getElevation();
        }
        return 0.0f;
    }

    public static boolean m(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getFitsSystemWindows();
        }
        return false;
    }

    public static int n(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getImportantForAccessibility();
        }
        return 0;
    }

    @SuppressLint({"InlinedApi"})
    public static int o(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    public static int p(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    public static int q(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumHeight();
        }
        if (!f379d) {
            try {
                f378c = View.class.getDeclaredField("mMinHeight");
                f378c.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f379d = true;
        }
        Field field = f378c;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    public static int r(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getMinimumWidth();
        }
        if (!f377b) {
            try {
                f376a = View.class.getDeclaredField("mMinWidth");
                f376a.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            f377b = true;
        }
        Field field = f376a;
        if (field == null) {
            return 0;
        }
        try {
            return ((Integer) field.get(view)).intValue();
        } catch (Exception unused2) {
            return 0;
        }
    }

    static a.g.m.a s(View view) {
        a.g.m.a b2 = b(view);
        if (b2 == null) {
            b2 = new a.g.m.a();
        }
        a(view, b2);
        return b2;
    }

    public static int t(View view) {
        return Build.VERSION.SDK_INT >= 17 ? view.getPaddingEnd() : view.getPaddingRight();
    }

    public static int u(View view) {
        return Build.VERSION.SDK_INT >= 17 ? view.getPaddingStart() : view.getPaddingLeft();
    }

    public static ViewParent v(View view) {
        return Build.VERSION.SDK_INT >= 16 ? view.getParentForAccessibility() : view.getParent();
    }

    public static d0 w(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return h.a(view);
        }
        return null;
    }

    public static final CharSequence x(View view) {
        return e().b(view);
    }

    public static String y(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = f380e;
        if (weakHashMap != null) {
            return weakHashMap.get(view);
        }
        return null;
    }

    public static float z(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTranslationZ();
        }
        return 0.0f;
    }
}
