package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.google.android.youtube.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: lj  reason: default package */
/* loaded from: classes3.dex */
public final class lj {
    public static final int[] a;
    private static Method b;
    private static Method c;
    private static boolean d;
    private static WeakHashMap e;
    private static Field f;
    private static boolean g;
    private static ThreadLocal h;

    static {
        new AtomicInteger(1);
        e = null;
        g = false;
        a = new int[]{R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        new kq();
    }

    public static void A(View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            lb.b(view);
            return;
        }
        if (!d) {
            aB();
        }
        Method method = b;
        if (method != null) {
            try {
                method.invoke(view, new Object[0]);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        view.onStartTemporaryDetach();
    }

    static void B(View view) {
        jo n = n(view);
        if (n == null) {
            n = new jo();
        }
        M(view, n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void C(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        boolean z = false;
        if (v(view) != null && view.getVisibility() == 0) {
            z = true;
        }
        int i2 = 32;
        if (kw.a(view) != 0 || z) {
            if (true != z) {
                i2 = 2048;
            }
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(i2);
            kw.d(obtain, i);
            if (z) {
                obtain.getText().add(v(view));
                if (kt.a(view) == 0) {
                    kt.j(view, 1);
                }
                ViewParent parent = view.getParent();
                while (true) {
                    if (!(parent instanceof View)) {
                        break;
                    } else if (kt.a((View) parent) != 4) {
                        parent = parent.getParent();
                    } else {
                        kt.j(view, 2);
                        break;
                    }
                }
            }
            view.sendAccessibilityEventUnchecked(obtain);
        } else if (i == 32) {
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            kw.d(obtain2, 32);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(v(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        } else if (view.getParent() == null) {
        } else {
            try {
                kw.b(view.getParent(), view, view, i);
            } catch (AbstractMethodError e2) {
                Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
            }
        }
    }

    public static void D(View view, int i) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        Rect az = az();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            az.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !az.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            aD(view);
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof View) {
                aD((View) parent2);
            }
        }
        if (!z || !az.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            return;
        }
        ((View) parent).invalidate(az);
    }

    public static void E(View view, int i) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        Rect az = az();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            az.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !az.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            aD(view);
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof View) {
                aD((View) parent2);
            }
        }
        if (!z || !az.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            return;
        }
        ((View) parent).invalidate(az);
    }

    public static void F(View view, mh mhVar) {
        view.onInitializeAccessibilityNodeInfo(mhVar.b);
    }

    public static void G(View view) {
        kt.e(view);
    }

    public static void H(View view, Runnable runnable) {
        kt.f(view, runnable);
    }

    public static void I(View view, Runnable runnable, long j) {
        kt.g(view, runnable, j);
    }

    public static void J(View view, int i) {
        aC(i, view);
        C(view, 0);
    }

    public static void K(View view) {
        kx.c(view);
    }

    public static void L(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            le.b(view, context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    public static void M(View view, jo joVar) {
        if (joVar == null && (aA(view) instanceof jn)) {
            joVar = new jo();
        }
        view.setAccessibilityDelegate(joVar == null ? null : joVar.a);
    }

    @Deprecated
    public static void N(View view, float f2) {
        view.setAlpha(f2);
    }

    public static void O(View view, Drawable drawable) {
        kt.h(view, drawable);
    }

    public static void P(View view, ColorStateList colorStateList) {
        kz.i(view, colorStateList);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            boolean z = true;
            if (kz.c(view) == null && kz.d(view) == null) {
                z = false;
            }
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            kt.h(view, background);
        }
    }

    public static void Q(View view, PorterDuff.Mode mode) {
        kz.j(view, mode);
        if (Build.VERSION.SDK_INT == 21) {
            Drawable background = view.getBackground();
            boolean z = true;
            if (kz.c(view) == null && kz.d(view) == null) {
                z = false;
            }
            if (background == null || !z) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            kt.h(view, background);
        }
    }

    public static void R(View view, Rect rect) {
        kv.b(view, rect);
    }

    public static void S(View view, float f2) {
        kz.k(view, f2);
    }

    @Deprecated
    public static void T(View view, boolean z) {
        view.setFitsSystemWindows(z);
    }

    public static void U(View view, boolean z) {
        kt.i(view, z);
    }

    public static void V(View view, int i) {
        kt.j(view, i);
    }

    public static void W(View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            lc.b(view, i);
        }
    }

    public static void X(View view, kj kjVar) {
        kz.l(view, kjVar);
    }

    public static void Y(View view, int i, int i2, int i3, int i4) {
        ku.f(view, i, i2, i3, i4);
    }

    @Deprecated
    public static void Z(View view, float f2) {
        view.setScaleX(f2);
    }

    public static float a(View view) {
        return kz.a(view);
    }

    private static View.AccessibilityDelegate aA(View view) {
        if (Build.VERSION.SDK_INT < 29) {
            if (g) {
                return null;
            }
            if (f == null) {
                try {
                    Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                    f = declaredField;
                    declaredField.setAccessible(true);
                } catch (Throwable unused) {
                    g = true;
                    return null;
                }
            }
            Object obj = f.get(view);
            if (!(obj instanceof View.AccessibilityDelegate)) {
                return null;
            }
            return (View.AccessibilityDelegate) obj;
        }
        return le.a(view);
    }

    private static void aB() {
        try {
            b = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", new Class[0]);
            c = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", new Class[0]);
        } catch (NoSuchMethodException e2) {
            Log.e("ViewCompat", "Couldn't find method", e2);
        }
        d = true;
    }

    private static void aC(int i, View view) {
        List x = x(view);
        for (int i2 = 0; i2 < x.size(); i2++) {
            if (((mf) x.get(i2)).a() == i) {
                x.remove(i2);
                return;
            }
        }
    }

    private static void aD(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static void aa(View view, CharSequence charSequence) {
        kr p = p();
        if (p.c()) {
            lf.b(view, charSequence);
        } else if (TextUtils.equals((CharSequence) p.b(view), charSequence)) {
        } else {
            B(view);
            view.setTag(p.a, charSequence);
            C(view, p.b);
        }
    }

    @Deprecated
    public static void ab(View view, float f2) {
        view.setTranslationX(f2);
    }

    public static void ac(View view) {
        kz.m(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean ad(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        li a2 = li.a(view);
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = a2.b;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!li.a.isEmpty()) {
                synchronized (li.a) {
                    if (a2.b == null) {
                        a2.b = new WeakHashMap();
                    }
                    int size = li.a.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        View view2 = (View) ((WeakReference) li.a.get(size)).get();
                        if (view2 == null) {
                            li.a.remove(size);
                        } else {
                            a2.b.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                a2.b.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View c2 = a2.c(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (c2 != null && !KeyEvent.isModifierKey(keyCode)) {
                a2.b().put(keyCode, new WeakReference(c2));
            }
        }
        return c2 != null;
    }

    public static boolean ae(View view, KeyEvent keyEvent) {
        int indexOfKey;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        li a2 = li.a(view);
        WeakReference weakReference = a2.c;
        if (weakReference != null && weakReference.get() == keyEvent) {
            return false;
        }
        a2.c = new WeakReference(keyEvent);
        SparseArray b2 = a2.b();
        WeakReference weakReference2 = null;
        if (keyEvent.getAction() == 1 && (indexOfKey = b2.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference2 = (WeakReference) b2.valueAt(indexOfKey);
            b2.removeAt(indexOfKey);
        }
        if (weakReference2 == null) {
            weakReference2 = (WeakReference) b2.get(keyEvent.getKeyCode());
        }
        if (weakReference2 == null) {
            return false;
        }
        View view2 = (View) weakReference2.get();
        if (view2 == null || !kw.e(view2)) {
            return true;
        }
        li.d(view2);
        return true;
    }

    public static boolean af(View view) {
        return kt.k(view);
    }

    public static boolean ag(View view) {
        return ks.a(view);
    }

    public static boolean ah(View view) {
        return kt.l(view);
    }

    public static boolean ai(View view) {
        return kt.m(view);
    }

    public static boolean aj(View view) {
        return kw.e(view);
    }

    public static boolean ak(View view) {
        return kv.c(view);
    }

    public static boolean al(View view) {
        return kw.f(view);
    }

    public static boolean am(View view) {
        return kw.g(view);
    }

    public static boolean an(View view) {
        return kz.n(view);
    }

    public static boolean ao(View view) {
        return ku.g(view);
    }

    public static boolean ap(View view) {
        Boolean bool = (Boolean) new km(Boolean.class).b(view);
        return bool != null && bool.booleanValue();
    }

    public static boolean aq(View view, int i, Bundle bundle) {
        return kt.n(view, i, bundle);
    }

    public static String[] ar(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return lg.b(view);
        }
        return (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void as(View view, mb mbVar, Rect rect) {
        kz.e(view, mbVar, rect);
    }

    public static void au(View view) {
        kw.c(view, 1);
    }

    public static void av(View view) {
        ku.e(view, 0);
    }

    public static void aw(View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            la.b(view, i, 3);
        }
    }

    @Deprecated
    public static boolean ax(View view) {
        return view.canScrollVertically(-1);
    }

    public static void ay(View view, quw quwVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            lb.c(view, (PointerIcon) quwVar.a);
        }
    }

    private static Rect az() {
        if (h == null) {
            h = new ThreadLocal();
        }
        Rect rect = (Rect) h.get();
        if (rect == null) {
            rect = new Rect();
            h.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static float b(View view) {
        return kz.b(view);
    }

    public static int c(View view) {
        return kt.a(view);
    }

    public static int d(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return lc.a(view);
        }
        return 0;
    }

    public static int e(View view) {
        return ku.a(view);
    }

    public static int f(View view) {
        return kt.b(view);
    }

    public static int g(View view) {
        return kt.c(view);
    }

    public static int h(View view) {
        return ku.b(view);
    }

    public static int i(View view) {
        return ku.c(view);
    }

    @Deprecated
    public static int j(View view) {
        return kt.d(view);
    }

    public static ColorStateList k(View view) {
        return kz.c(view);
    }

    public static PorterDuff.Mode l(View view) {
        return kz.d(view);
    }

    public static Rect m(View view) {
        return kv.a(view);
    }

    public static jo n(View view) {
        View.AccessibilityDelegate aA = aA(view);
        if (aA == null) {
            return null;
        }
        if (aA instanceof jn) {
            return ((jn) aA).a;
        }
        return new jo(aA);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static jw o(View view, jw jwVar) {
        if (Build.VERSION.SDK_INT >= 31) {
            return lg.a(view, jwVar);
        }
        if (((lb) view.getTag(R.id.tag_on_receive_content_listener)) != null) {
            jw d2 = lb.d(view, jwVar);
            if (d2 != null) {
                return view.a(d2);
            }
            return null;
        }
        return view.a(jwVar);
    }

    public static kr p() {
        return new ko(CharSequence.class);
    }

    public static ln q(View view) {
        if (e == null) {
            e = new WeakHashMap();
        }
        ln lnVar = (ln) e.get(view);
        if (lnVar == null) {
            ln lnVar2 = new ln(view);
            e.put(view, lnVar2);
            return lnVar2;
        }
        return lnVar;
    }

    public static mb r(View view, mb mbVar) {
        WindowInsets s = mbVar.s();
        if (s != null) {
            WindowInsets a2 = kx.a(view, s);
            if (!a2.equals(s)) {
                return mb.r(a2, view);
            }
        }
        return mbVar;
    }

    public static mb s(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return la.a(view);
        }
        return kz.f(view);
    }

    public static mb t(View view, mb mbVar) {
        WindowInsets s = mbVar.s();
        if (s != null) {
            WindowInsets b2 = kx.b(view, s);
            if (!b2.equals(s)) {
                return mb.r(b2, view);
            }
        }
        return mbVar;
    }

    public static Display u(View view) {
        return ku.d(view);
    }

    public static CharSequence v(View view) {
        return (CharSequence) new kn(CharSequence.class).b(view);
    }

    public static String w(View view) {
        return kz.g(view);
    }

    public static List x(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static void y(View view, mf mfVar) {
        B(view);
        aC(mfVar.a(), view);
        x(view).add(mfVar);
        C(view, 0);
    }

    public static void z(View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            lb.a(view);
            return;
        }
        if (!d) {
            aB();
        }
        Method method = c;
        if (method != null) {
            try {
                method.invoke(view, new Object[0]);
                return;
            } catch (Exception unused) {
                return;
            }
        }
        view.onFinishTemporaryDetach();
    }

    public static void at(View view, mf mfVar, mu muVar) {
        if (muVar != null) {
            y(view, new mf(null, mfVar.k, null, muVar, mfVar.l));
        } else {
            J(view, mfVar.a());
        }
    }
}
