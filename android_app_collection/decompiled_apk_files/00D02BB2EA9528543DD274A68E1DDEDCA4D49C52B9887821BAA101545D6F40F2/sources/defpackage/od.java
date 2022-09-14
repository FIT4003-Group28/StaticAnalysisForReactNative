package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.maps.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: od  reason: default package */
/* loaded from: classes.dex */
public final class od {
    public static final int[] a;
    public static final ny b;
    private static WeakHashMap<View, oi> c;
    private static Field d;
    private static boolean e;
    private static ThreadLocal<Rect> f;

    static {
        new AtomicInteger(1);
        c = null;
        e = false;
        a = new int[]{R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        b = new ny();
    }

    public static int A(View view) {
        return view.getMinimumHeight();
    }

    public static oi B(View view) {
        if (c == null) {
            c = new WeakHashMap<>();
        }
        oi oiVar = c.get(view);
        if (oiVar == null) {
            oi oiVar2 = new oi(view);
            c.put(view, oiVar2);
            return oiVar2;
        }
        return oiVar;
    }

    @Deprecated
    public static void C(View view, float f2) {
        view.setAlpha(f2);
    }

    @Deprecated
    public static void D(View view, float f2) {
        view.setScaleX(f2);
    }

    @Deprecated
    public static void E(View view, float f2) {
        view.setScaleY(f2);
    }

    public static void F(View view, float f2) {
        view.setElevation(f2);
    }

    public static float G(View view) {
        return view.getElevation();
    }

    public static void H(View view, float f2) {
        view.setTranslationZ(f2);
    }

    public static void I(View view, String str) {
        view.setTransitionName(str);
    }

    public static String J(View view) {
        return view.getTransitionName();
    }

    public static int K(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static void L(View view) {
        view.requestApplyInsets();
    }

    public static boolean M(View view) {
        return view.getFitsSystemWindows();
    }

    @Deprecated
    public static void N(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    public static void O(View view, nq nqVar) {
        if (nqVar == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new nt(nqVar));
        }
    }

    public static ow P(View view, ow owVar) {
        WindowInsets p = owVar.p();
        if (p != null) {
            WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(p);
            if (!onApplyWindowInsets.equals(p)) {
                return ow.b(onApplyWindowInsets, view);
            }
        }
        return owVar;
    }

    public static ow Q(View view, ow owVar) {
        WindowInsets p = owVar.p();
        if (p != null) {
            WindowInsets dispatchApplyWindowInsets = view.dispatchApplyWindowInsets(p);
            if (!dispatchApplyWindowInsets.equals(p)) {
                return ow.b(dispatchApplyWindowInsets, view);
            }
        }
        return owVar;
    }

    public static ow R(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return oa.a(view);
        }
        return null;
    }

    public static boolean S(View view) {
        return view.hasOverlappingRendering();
    }

    public static boolean T(View view) {
        return view.isPaddingRelative();
    }

    public static void U(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static ColorStateList V(View view) {
        return view.getBackgroundTintList();
    }

    public static void W(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            boolean z = true;
            if (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) {
                z = false;
            }
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    public static PorterDuff.Mode X(View view) {
        return view.getBackgroundTintMode();
    }

    public static void Y(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            boolean z = true;
            if (view.getBackgroundTintList() == null && view.getBackgroundTintMode() == null) {
                z = false;
            }
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    public static boolean Z(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void a(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    public static void aA(View view, ow owVar, Rect rect) {
        WindowInsets p = owVar.p();
        if (p != null) {
            ow.b(view.computeSystemWindowInsets(p, rect), view);
        } else {
            rect.setEmpty();
        }
    }

    public static void aB(View view, int i, int i2, int[] iArr) {
        view.dispatchNestedPreScroll(i, i2, iArr, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void aC(View view) {
        ne f2 = f(view);
        if (f2 == null) {
            f2 = new ne();
        }
        c(view, f2);
    }

    public static void aE(View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i, 3);
        }
    }

    @Deprecated
    public static void aF(View view) {
        view.setTranslationX(0.0f);
    }

    @Deprecated
    public static void aG(View view) {
        view.setTranslationY(0.0f);
    }

    private static Rect aH() {
        if (f == null) {
            f = new ThreadLocal<>();
        }
        Rect rect = f.get();
        if (rect == null) {
            rect = new Rect();
            f.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    private static View.AccessibilityDelegate aI(View view) {
        if (Build.VERSION.SDK_INT < 29) {
            if (e) {
                return null;
            }
            if (d == null) {
                try {
                    Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                    d = declaredField;
                    declaredField.setAccessible(true);
                } catch (Throwable unused) {
                    e = true;
                    return null;
                }
            }
            Object obj = d.get(view);
            if (!(obj instanceof View.AccessibilityDelegate)) {
                return null;
            }
            return (View.AccessibilityDelegate) obj;
        }
        return view.getAccessibilityDelegate();
    }

    private static void aJ(int i, View view) {
        List<oy> q = q(view);
        for (int i2 = 0; i2 < q.size(); i2++) {
            if (q.get(i2).a() == i) {
                q.remove(i2);
                return;
            }
        }
    }

    private static void aK(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static boolean aa(View view, int i) {
        return view.startNestedScroll(i);
    }

    public static void ab(View view) {
        view.stopNestedScroll();
    }

    public static boolean ac(View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean ad(View view) {
        return view.isInLayout();
    }

    public static boolean ae(View view) {
        return view.isLaidOut();
    }

    public static float af(View view) {
        return view.getZ();
    }

    public static void ag(View view, int i) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        Rect aH = aH();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            aH.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !aH.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            aK(view);
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof View) {
                aK((View) parent2);
            }
        }
        if (!z || !aH.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            return;
        }
        ((View) parent).invalidate(aH);
    }

    public static void ah(View view, int i) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        Rect aH = aH();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            aH.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !aH.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            aK(view);
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof View) {
                aK((View) parent2);
            }
        }
        if (!z || !aH.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            return;
        }
        ((View) parent).invalidate(aH);
    }

    public static void ai(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    public static Rect aj(View view) {
        return view.getClipBounds();
    }

    public static boolean ak(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean al(View view) {
        return view.hasOnClickListeners();
    }

    public static void am(View view, ns nsVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            view.setPointerIcon((PointerIcon) nsVar.a);
        }
    }

    public static Display an(View view) {
        return view.getDisplay();
    }

    public static boolean ao(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.restoreDefaultFocus();
        }
        return view.requestFocus();
    }

    public static int ap() {
        return View.generateViewId();
    }

    public static boolean aq(View view, KeyEvent keyEvent) {
        int indexOfKey;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        oc b2 = oc.b(view);
        WeakReference<KeyEvent> weakReference = b2.c;
        if (weakReference != null && weakReference.get() == keyEvent) {
            return false;
        }
        b2.c = new WeakReference<>(keyEvent);
        SparseArray<WeakReference<View>> a2 = b2.a();
        WeakReference<View> weakReference2 = null;
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
        View view2 = weakReference2.get();
        if (view2 == null || !view2.isAttachedToWindow()) {
            return true;
        }
        oc.d(view2);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean ar(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        oc b2 = oc.b(view);
        if (keyEvent.getAction() == 0) {
            WeakHashMap<View, Boolean> weakHashMap = b2.b;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!oc.a.isEmpty()) {
                synchronized (oc.a) {
                    if (b2.b == null) {
                        b2.b = new WeakHashMap<>();
                    }
                    int size = oc.a.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        View view2 = oc.a.get(size).get();
                        if (view2 == null) {
                            oc.a.remove(size);
                        } else {
                            b2.b.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                b2.b.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View c2 = b2.c(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (c2 != null && !KeyEvent.isModifierKey(keyCode)) {
                b2.a().put(keyCode, new WeakReference<>(c2));
            }
        }
        return c2 != null;
    }

    public static nz<Boolean> as() {
        return new nu(Boolean.class);
    }

    public static CharSequence at(View view) {
        return au().e(view);
    }

    public static nz<CharSequence> au() {
        return new nv(CharSequence.class);
    }

    public static nz<CharSequence> av() {
        return new nw(CharSequence.class);
    }

    public static void aw(View view, boolean z) {
        ax().d(view, Boolean.valueOf(z));
    }

    public static nz<Boolean> ax() {
        return new nx(Boolean.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void ay(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        boolean z = false;
        if (at(view) != null && view.getVisibility() == 0) {
            z = true;
        }
        int i2 = 32;
        if (view.getAccessibilityLiveRegion() != 0 || z) {
            if (true != z) {
                i2 = 2048;
            }
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(i2);
            obtain.setContentChangeTypes(i);
            if (z) {
                obtain.getText().add(at(view));
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
                ViewParent parent = view.getParent();
                while (true) {
                    if (!(parent instanceof View)) {
                        break;
                    } else if (((View) parent).getImportantForAccessibility() != 4) {
                        parent = parent.getParent();
                    } else {
                        view.setImportantForAccessibility(2);
                        break;
                    }
                }
            }
            view.sendAccessibilityEventUnchecked(obtain);
        } else if (i == 32) {
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(32);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(at(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        } else if (view.getParent() == null) {
        } else {
            try {
                view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
            } catch (AbstractMethodError unused) {
                String str = view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent";
            }
        }
    }

    @Deprecated
    public static boolean az(View view) {
        return view.canScrollVertically(-1);
    }

    public static void b(View view, pc pcVar) {
        view.onInitializeAccessibilityNodeInfo(pcVar.a);
    }

    public static void c(View view, ne neVar) {
        if (neVar == null && (aI(view) instanceof nd)) {
            neVar = new ne();
        }
        view.setAccessibilityDelegate(neVar == null ? null : neVar.a);
    }

    public static int d(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    public static void e(View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setImportantForAutofill(i);
        }
    }

    public static ne f(View view) {
        View.AccessibilityDelegate aI = aI(view);
        if (aI == null) {
            return null;
        }
        if (aI instanceof nd) {
            return ((nd) aI).a;
        }
        return new ne(aI);
    }

    public static boolean g(View view) {
        return view.hasTransientState();
    }

    public static void h(View view, boolean z) {
        view.setHasTransientState(z);
    }

    public static void i(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void j(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void k(View view, Runnable runnable, long j) {
        view.postOnAnimationDelayed(runnable, j);
    }

    public static int l(View view) {
        return view.getImportantForAccessibility();
    }

    public static void m(View view, int i) {
        view.setImportantForAccessibility(i);
    }

    public static boolean n(View view, int i, Bundle bundle) {
        return view.performAccessibilityAction(i, bundle);
    }

    public static void o(View view, oy oyVar) {
        aC(view);
        aJ(oyVar.a(), view);
        q(view).add(oyVar);
        ay(view, 0);
    }

    public static void p(View view, int i) {
        aJ(i, view);
        ay(view, 0);
    }

    public static List<oy> q(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static void r(View view, CharSequence charSequence) {
        av().d(view, charSequence);
    }

    public static int s(View view) {
        return view.getLayoutDirection();
    }

    public static void t(View view, int i) {
        view.setLayoutDirection(i);
    }

    public static ViewParent u(View view) {
        return view.getParentForAccessibility();
    }

    public static void v(View view, int i) {
        view.setAccessibilityLiveRegion(i);
    }

    public static int w(View view) {
        return view.getPaddingStart();
    }

    public static int x(View view) {
        return view.getPaddingEnd();
    }

    public static void y(View view, int i, int i2, int i3, int i4) {
        view.setPaddingRelative(i, i2, i3, i4);
    }

    public static int z(View view) {
        return view.getMinimumWidth();
    }

    public static void aD(View view, oy oyVar, pp ppVar) {
        if (ppVar != null) {
            o(view, new oy(null, oyVar.l, null, ppVar, oyVar.m));
        } else {
            p(view, oyVar.a());
        }
    }
}
