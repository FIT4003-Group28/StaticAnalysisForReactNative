package android.support.v4.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v4.app.i;
import android.support.v4.app.n;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import com.baidu.mapapi.UIMsg;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FragmentManager.java */
/* loaded from: classes.dex */
public final class o extends n implements LayoutInflater.Factory2 {
    static final Interpolator F = new DecelerateInterpolator(2.5f);
    static final Interpolator G = new DecelerateInterpolator(1.5f);
    static final Interpolator H = new AccelerateInterpolator(2.5f);
    static final Interpolator I = new AccelerateInterpolator(1.5f);

    /* renamed from: a  reason: collision with root package name */
    static boolean f245a = false;
    static Field q;
    ArrayList<i> C;
    p D;

    /* renamed from: b  reason: collision with root package name */
    ArrayList<g> f246b;

    /* renamed from: c  reason: collision with root package name */
    boolean f247c;
    SparseArray<android.support.v4.app.i> f;
    ArrayList<android.support.v4.app.c> g;
    ArrayList<android.support.v4.app.i> h;
    ArrayList<android.support.v4.app.c> i;
    ArrayList<Integer> j;
    ArrayList<n.b> k;
    m m;
    k n;
    android.support.v4.app.i o;
    android.support.v4.app.i p;
    boolean r;
    boolean s;
    boolean t;
    boolean u;
    String v;
    boolean w;
    ArrayList<android.support.v4.app.c> x;
    ArrayList<Boolean> y;
    ArrayList<android.support.v4.app.i> z;

    /* renamed from: d  reason: collision with root package name */
    int f248d = 0;
    final ArrayList<android.support.v4.app.i> e = new ArrayList<>();
    private final CopyOnWriteArrayList<android.support.v4.i.i<n.a, Boolean>> J = new CopyOnWriteArrayList<>();
    int l = 0;
    Bundle A = null;
    SparseArray<Parcelable> B = null;
    Runnable E = new Runnable() { // from class: android.support.v4.app.o.1
        @Override // java.lang.Runnable
        public void run() {
            o.this.f();
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public static final int[] f272a = {16842755, 16842960, 16842961};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public interface g {
        boolean a(ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2);
    }

    public static int b(int i2, boolean z) {
        if (i2 == 4097) {
            return z ? 1 : 2;
        } else if (i2 == 4099) {
            return z ? 5 : 6;
        } else if (i2 != 8194) {
            return -1;
        } else {
            return z ? 3 : 4;
        }
    }

    public static int d(int i2) {
        if (i2 != 4097) {
            if (i2 == 4099) {
                return UIMsg.k_event.MV_MAP_SHOWONMAP;
            }
            if (i2 == 8194) {
                return UIMsg.k_event.MV_MAP_ZOOMOUT;
            }
            return 0;
        }
        return UIMsg.k_event.V_WM_GETLASTCLRSATETIME;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater.Factory2 x() {
        return this;
    }

    static boolean a(c cVar) {
        if (cVar.f265a instanceof AlphaAnimation) {
            return true;
        }
        if (cVar.f265a instanceof AnimationSet) {
            List<Animation> animations = ((AnimationSet) cVar.f265a).getAnimations();
            for (int i2 = 0; i2 < animations.size(); i2++) {
                if (animations.get(i2) instanceof AlphaAnimation) {
                    return true;
                }
            }
            return false;
        }
        return a(cVar.f266b);
    }

    static boolean a(Animator animator) {
        if (animator == null) {
            return false;
        }
        if (animator instanceof ValueAnimator) {
            for (PropertyValuesHolder propertyValuesHolder : ((ValueAnimator) animator).getValues()) {
                if ("alpha".equals(propertyValuesHolder.getPropertyName())) {
                    return true;
                }
            }
        } else if (animator instanceof AnimatorSet) {
            ArrayList<Animator> childAnimations = ((AnimatorSet) animator).getChildAnimations();
            for (int i2 = 0; i2 < childAnimations.size(); i2++) {
                if (a(childAnimations.get(i2))) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean a(View view, c cVar) {
        return view != null && cVar != null && Build.VERSION.SDK_INT >= 19 && view.getLayerType() == 0 && android.support.v4.j.s.k(view) && a(cVar);
    }

    private void a(RuntimeException runtimeException) {
        Log.e("FragmentManager", runtimeException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new android.support.v4.i.e("FragmentManager"));
        if (this.m != null) {
            try {
                this.m.a("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        } else {
            try {
                a("  ", (FileDescriptor) null, printWriter, new String[0]);
            } catch (Exception e3) {
                Log.e("FragmentManager", "Failed dumping state", e3);
            }
        }
        throw runtimeException;
    }

    @Override // android.support.v4.app.n
    public s a() {
        return new android.support.v4.app.c(this);
    }

    @Override // android.support.v4.app.n
    public boolean b() {
        y();
        return a((String) null, -1, 0);
    }

    @Override // android.support.v4.app.n
    public void a(int i2, int i3) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Bad id: " + i2);
        }
        a((g) new h(null, i2, i3), false);
    }

    private boolean a(String str, int i2, int i3) {
        n peekChildFragmentManager;
        f();
        c(true);
        if (this.p == null || i2 >= 0 || str != null || (peekChildFragmentManager = this.p.peekChildFragmentManager()) == null || !peekChildFragmentManager.b()) {
            boolean a2 = a(this.x, this.y, str, i2, i3);
            if (a2) {
                this.f247c = true;
                try {
                    b(this.x, this.y);
                } finally {
                    A();
                }
            }
            g();
            D();
            return a2;
        }
        return true;
    }

    public void a(Bundle bundle, String str, android.support.v4.app.i iVar) {
        if (iVar.mIndex < 0) {
            a(new IllegalStateException("Fragment " + iVar + " is not currently in the FragmentManager"));
        }
        bundle.putInt(str, iVar.mIndex);
    }

    public android.support.v4.app.i a(Bundle bundle, String str) {
        int i2 = bundle.getInt(str, -1);
        if (i2 == -1) {
            return null;
        }
        android.support.v4.app.i iVar = this.f.get(i2);
        if (iVar == null) {
            a(new IllegalStateException("Fragment no longer exists for key " + str + ": index " + i2));
        }
        return iVar;
    }

    @Override // android.support.v4.app.n
    public List<android.support.v4.app.i> c() {
        List<android.support.v4.app.i> list;
        if (this.e.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.e) {
            list = (List) this.e.clone();
        }
        return list;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        if (this.o != null) {
            android.support.v4.i.d.a(this.o, sb);
        } else {
            android.support.v4.i.d.a(this.m, sb);
        }
        sb.append("}}");
        return sb.toString();
    }

    @Override // android.support.v4.app.n
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        int size3;
        int size4;
        int size5;
        String str2 = str + "    ";
        if (this.f != null && (size5 = this.f.size()) > 0) {
            printWriter.print(str);
            printWriter.print("Active Fragments in ");
            printWriter.print(Integer.toHexString(System.identityHashCode(this)));
            printWriter.println(":");
            for (int i2 = 0; i2 < size5; i2++) {
                android.support.v4.app.i valueAt = this.f.valueAt(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(valueAt);
                if (valueAt != null) {
                    valueAt.dump(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }
        int size6 = this.e.size();
        if (size6 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i3 = 0; i3 < size6; i3++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(this.e.get(i3).toString());
            }
        }
        if (this.h != null && (size4 = this.h.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i4 = 0; i4 < size4; i4++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i4);
                printWriter.print(": ");
                printWriter.println(this.h.get(i4).toString());
            }
        }
        if (this.g != null && (size3 = this.g.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i5 = 0; i5 < size3; i5++) {
                android.support.v4.app.c cVar = this.g.get(i5);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i5);
                printWriter.print(": ");
                printWriter.println(cVar.toString());
                cVar.a(str2, fileDescriptor, printWriter, strArr);
            }
        }
        synchronized (this) {
            if (this.i != null && (size2 = this.i.size()) > 0) {
                printWriter.print(str);
                printWriter.println("Back Stack Indices:");
                for (int i6 = 0; i6 < size2; i6++) {
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i6);
                    printWriter.print(": ");
                    printWriter.println((android.support.v4.app.c) this.i.get(i6));
                }
            }
            if (this.j != null && this.j.size() > 0) {
                printWriter.print(str);
                printWriter.print("mAvailBackStackIndices: ");
                printWriter.println(Arrays.toString(this.j.toArray()));
            }
        }
        if (this.f246b != null && (size = this.f246b.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Pending Actions:");
            for (int i7 = 0; i7 < size; i7++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i7);
                printWriter.print(": ");
                printWriter.println((g) this.f246b.get(i7));
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.m);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.n);
        if (this.o != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.o);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.l);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.s);
        printWriter.print(" mStopped=");
        printWriter.print(this.t);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.u);
        if (this.r) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.r);
        }
        if (this.v != null) {
            printWriter.print(str);
            printWriter.print("  mNoTransactionsBecause=");
            printWriter.println(this.v);
        }
    }

    static c a(Context context, float f2, float f3, float f4, float f5) {
        AnimationSet animationSet = new AnimationSet(false);
        ScaleAnimation scaleAnimation = new ScaleAnimation(f2, f3, f2, f3, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(F);
        scaleAnimation.setDuration(220L);
        animationSet.addAnimation(scaleAnimation);
        AlphaAnimation alphaAnimation = new AlphaAnimation(f4, f5);
        alphaAnimation.setInterpolator(G);
        alphaAnimation.setDuration(220L);
        animationSet.addAnimation(alphaAnimation);
        return new c(animationSet);
    }

    static c a(Context context, float f2, float f3) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f3);
        alphaAnimation.setInterpolator(G);
        alphaAnimation.setDuration(220L);
        return new c(alphaAnimation);
    }

    c a(android.support.v4.app.i iVar, int i2, boolean z, int i3) {
        int b2;
        int nextAnim = iVar.getNextAnim();
        Animation onCreateAnimation = iVar.onCreateAnimation(i2, z, nextAnim);
        if (onCreateAnimation != null) {
            return new c(onCreateAnimation);
        }
        Animator onCreateAnimator = iVar.onCreateAnimator(i2, z, nextAnim);
        if (onCreateAnimator != null) {
            return new c(onCreateAnimator);
        }
        if (nextAnim != 0) {
            boolean equals = "anim".equals(this.m.i().getResources().getResourceTypeName(nextAnim));
            boolean z2 = false;
            if (equals) {
                try {
                    Animation loadAnimation = AnimationUtils.loadAnimation(this.m.i(), nextAnim);
                    if (loadAnimation != null) {
                        return new c(loadAnimation);
                    }
                    z2 = true;
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                }
            }
            if (!z2) {
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(this.m.i(), nextAnim);
                    if (loadAnimator != null) {
                        return new c(loadAnimator);
                    }
                } catch (RuntimeException e3) {
                    if (equals) {
                        throw e3;
                    }
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(this.m.i(), nextAnim);
                    if (loadAnimation2 != null) {
                        return new c(loadAnimation2);
                    }
                }
            }
        }
        if (i2 == 0 || (b2 = b(i2, z)) < 0) {
            return null;
        }
        switch (b2) {
            case 1:
                return a(this.m.i(), 1.125f, 1.0f, (float) BitmapDescriptorFactory.HUE_RED, 1.0f);
            case 2:
                return a(this.m.i(), 1.0f, 0.975f, 1.0f, (float) BitmapDescriptorFactory.HUE_RED);
            case 3:
                return a(this.m.i(), 0.975f, 1.0f, (float) BitmapDescriptorFactory.HUE_RED, 1.0f);
            case 4:
                return a(this.m.i(), 1.0f, 1.075f, 1.0f, (float) BitmapDescriptorFactory.HUE_RED);
            case 5:
                return a(this.m.i(), (float) BitmapDescriptorFactory.HUE_RED, 1.0f);
            case 6:
                return a(this.m.i(), 1.0f, (float) BitmapDescriptorFactory.HUE_RED);
            default:
                if (i3 == 0 && this.m.e()) {
                    i3 = this.m.f();
                }
                return i3 == 0 ? null : null;
        }
    }

    public void a(android.support.v4.app.i iVar) {
        if (iVar.mDeferStart) {
            if (this.f247c) {
                this.w = true;
                return;
            }
            iVar.mDeferStart = false;
            a(iVar, this.l, 0, 0, false);
        }
    }

    private static void b(View view, c cVar) {
        if (view == null || cVar == null || !a(view, cVar)) {
            return;
        }
        if (cVar.f266b != null) {
            cVar.f266b.addListener(new d(view));
            return;
        }
        Animation.AnimationListener a2 = a(cVar.f265a);
        view.setLayerType(2, null);
        cVar.f265a.setAnimationListener(new a(view, a2));
    }

    private static Animation.AnimationListener a(Animation animation) {
        try {
            if (q == null) {
                q = Animation.class.getDeclaredField("mListener");
                q.setAccessible(true);
            }
            return (Animation.AnimationListener) q.get(animation);
        } catch (IllegalAccessException e2) {
            Log.e("FragmentManager", "Cannot access Animation's mListener field", e2);
            return null;
        } catch (NoSuchFieldException e3) {
            Log.e("FragmentManager", "No field with the name mListener is found in Animation class", e3);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(int i2) {
        return this.l >= i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:226:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.support.v4.app.i r16, int r17, int r18, int r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 1198
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.o.a(android.support.v4.app.i, int, int, int, boolean):void");
    }

    private void a(final android.support.v4.app.i iVar, c cVar, int i2) {
        final View view = iVar.mView;
        final ViewGroup viewGroup = iVar.mContainer;
        viewGroup.startViewTransition(view);
        iVar.setStateAfterAnimating(i2);
        if (cVar.f265a != null) {
            e eVar = new e(cVar.f265a, viewGroup, view);
            iVar.setAnimatingAway(iVar.mView);
            eVar.setAnimationListener(new b(a(eVar)) { // from class: android.support.v4.app.o.2
                @Override // android.support.v4.app.o.b, android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    super.onAnimationEnd(animation);
                    viewGroup.post(new Runnable() { // from class: android.support.v4.app.o.2.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (iVar.getAnimatingAway() != null) {
                                iVar.setAnimatingAway(null);
                                o.this.a(iVar, iVar.getStateAfterAnimating(), 0, 0, false);
                            }
                        }
                    });
                }
            });
            b(view, cVar);
            iVar.mView.startAnimation(eVar);
            return;
        }
        Animator animator = cVar.f266b;
        iVar.setAnimator(cVar.f266b);
        animator.addListener(new AnimatorListenerAdapter() { // from class: android.support.v4.app.o.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator2) {
                viewGroup.endViewTransition(view);
                Animator animator3 = iVar.getAnimator();
                iVar.setAnimator(null);
                if (animator3 == null || viewGroup.indexOfChild(view) >= 0) {
                    return;
                }
                o.this.a(iVar, iVar.getStateAfterAnimating(), 0, 0, false);
            }
        });
        animator.setTarget(iVar.mView);
        b(iVar.mView, cVar);
        animator.start();
    }

    void b(android.support.v4.app.i iVar) {
        a(iVar, this.l, 0, 0, false);
    }

    void c(android.support.v4.app.i iVar) {
        if (!iVar.mFromLayout || iVar.mPerformedCreateView) {
            return;
        }
        iVar.mView = iVar.performCreateView(iVar.performGetLayoutInflater(iVar.mSavedFragmentState), null, iVar.mSavedFragmentState);
        if (iVar.mView != null) {
            iVar.mInnerView = iVar.mView;
            iVar.mView.setSaveFromParentEnabled(false);
            if (iVar.mHidden) {
                iVar.mView.setVisibility(8);
            }
            iVar.onViewCreated(iVar.mView, iVar.mSavedFragmentState);
            a(iVar, iVar.mView, iVar.mSavedFragmentState, false);
            return;
        }
        iVar.mInnerView = null;
    }

    void d(final android.support.v4.app.i iVar) {
        if (iVar.mView != null) {
            c a2 = a(iVar, iVar.getNextTransition(), !iVar.mHidden, iVar.getNextTransitionStyle());
            if (a2 != null && a2.f266b != null) {
                a2.f266b.setTarget(iVar.mView);
                if (iVar.mHidden) {
                    if (iVar.isHideReplaced()) {
                        iVar.setHideReplaced(false);
                    } else {
                        final ViewGroup viewGroup = iVar.mContainer;
                        final View view = iVar.mView;
                        viewGroup.startViewTransition(view);
                        a2.f266b.addListener(new AnimatorListenerAdapter() { // from class: android.support.v4.app.o.4
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator) {
                                viewGroup.endViewTransition(view);
                                animator.removeListener(this);
                                if (iVar.mView != null) {
                                    iVar.mView.setVisibility(8);
                                }
                            }
                        });
                    }
                } else {
                    iVar.mView.setVisibility(0);
                }
                b(iVar.mView, a2);
                a2.f266b.start();
            } else {
                if (a2 != null) {
                    b(iVar.mView, a2);
                    iVar.mView.startAnimation(a2.f265a);
                    a2.f265a.start();
                }
                iVar.mView.setVisibility((!iVar.mHidden || iVar.isHideReplaced()) ? 0 : 8);
                if (iVar.isHideReplaced()) {
                    iVar.setHideReplaced(false);
                }
            }
        }
        if (iVar.mAdded && iVar.mHasMenu && iVar.mMenuVisible) {
            this.r = true;
        }
        iVar.mHiddenChanged = false;
        iVar.onHiddenChanged(iVar.mHidden);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(android.support.v4.app.i iVar) {
        if (iVar == null) {
            return;
        }
        int i2 = this.l;
        if (iVar.mRemoving) {
            if (iVar.isInBackStack()) {
                i2 = Math.min(i2, 1);
            } else {
                i2 = Math.min(i2, 0);
            }
        }
        a(iVar, i2, iVar.getNextTransition(), iVar.getNextTransitionStyle(), false);
        if (iVar.mView != null) {
            android.support.v4.app.i p = p(iVar);
            if (p != null) {
                View view = p.mView;
                ViewGroup viewGroup = iVar.mContainer;
                int indexOfChild = viewGroup.indexOfChild(view);
                int indexOfChild2 = viewGroup.indexOfChild(iVar.mView);
                if (indexOfChild2 < indexOfChild) {
                    viewGroup.removeViewAt(indexOfChild2);
                    viewGroup.addView(iVar.mView, indexOfChild);
                }
            }
            if (iVar.mIsNewlyAdded && iVar.mContainer != null) {
                if (iVar.mPostponedAlpha > BitmapDescriptorFactory.HUE_RED) {
                    iVar.mView.setAlpha(iVar.mPostponedAlpha);
                }
                iVar.mPostponedAlpha = BitmapDescriptorFactory.HUE_RED;
                iVar.mIsNewlyAdded = false;
                c a2 = a(iVar, iVar.getNextTransition(), true, iVar.getNextTransitionStyle());
                if (a2 != null) {
                    b(iVar.mView, a2);
                    if (a2.f265a != null) {
                        iVar.mView.startAnimation(a2.f265a);
                    } else {
                        a2.f266b.setTarget(iVar.mView);
                        a2.f266b.start();
                    }
                }
            }
        }
        if (!iVar.mHiddenChanged) {
            return;
        }
        d(iVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i2, boolean z) {
        if (this.m == null && i2 != 0) {
            throw new IllegalStateException("No activity");
        }
        if (!z && i2 == this.l) {
            return;
        }
        this.l = i2;
        if (this.f == null) {
            return;
        }
        int size = this.e.size();
        for (int i3 = 0; i3 < size; i3++) {
            e(this.e.get(i3));
        }
        int size2 = this.f.size();
        for (int i4 = 0; i4 < size2; i4++) {
            android.support.v4.app.i valueAt = this.f.valueAt(i4);
            if (valueAt != null && ((valueAt.mRemoving || valueAt.mDetached) && !valueAt.mIsNewlyAdded)) {
                e(valueAt);
            }
        }
        e();
        if (!this.r || this.m == null || this.l != 5) {
            return;
        }
        this.m.d();
        this.r = false;
    }

    void e() {
        if (this.f == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            android.support.v4.app.i valueAt = this.f.valueAt(i2);
            if (valueAt != null) {
                a(valueAt);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(android.support.v4.app.i iVar) {
        if (iVar.mIndex >= 0) {
            return;
        }
        int i2 = this.f248d;
        this.f248d = i2 + 1;
        iVar.setIndex(i2, this.o);
        if (this.f == null) {
            this.f = new SparseArray<>();
        }
        this.f.put(iVar.mIndex, iVar);
        if (!f245a) {
            return;
        }
        Log.v("FragmentManager", "Allocated fragment index " + iVar);
    }

    void g(android.support.v4.app.i iVar) {
        if (iVar.mIndex < 0) {
            return;
        }
        if (f245a) {
            Log.v("FragmentManager", "Freeing fragment index " + iVar);
        }
        this.f.put(iVar.mIndex, null);
        iVar.initState();
    }

    public void a(android.support.v4.app.i iVar, boolean z) {
        if (f245a) {
            Log.v("FragmentManager", "add: " + iVar);
        }
        f(iVar);
        if (!iVar.mDetached) {
            if (this.e.contains(iVar)) {
                throw new IllegalStateException("Fragment already added: " + iVar);
            }
            synchronized (this.e) {
                this.e.add(iVar);
            }
            iVar.mAdded = true;
            iVar.mRemoving = false;
            if (iVar.mView == null) {
                iVar.mHiddenChanged = false;
            }
            if (iVar.mHasMenu && iVar.mMenuVisible) {
                this.r = true;
            }
            if (!z) {
                return;
            }
            b(iVar);
        }
    }

    public void h(android.support.v4.app.i iVar) {
        if (f245a) {
            Log.v("FragmentManager", "remove: " + iVar + " nesting=" + iVar.mBackStackNesting);
        }
        boolean z = !iVar.isInBackStack();
        if (!iVar.mDetached || z) {
            synchronized (this.e) {
                this.e.remove(iVar);
            }
            if (iVar.mHasMenu && iVar.mMenuVisible) {
                this.r = true;
            }
            iVar.mAdded = false;
            iVar.mRemoving = true;
        }
    }

    public void i(android.support.v4.app.i iVar) {
        if (f245a) {
            Log.v("FragmentManager", "hide: " + iVar);
        }
        if (!iVar.mHidden) {
            iVar.mHidden = true;
            iVar.mHiddenChanged = true ^ iVar.mHiddenChanged;
        }
    }

    public void j(android.support.v4.app.i iVar) {
        if (f245a) {
            Log.v("FragmentManager", "show: " + iVar);
        }
        if (iVar.mHidden) {
            iVar.mHidden = false;
            iVar.mHiddenChanged = !iVar.mHiddenChanged;
        }
    }

    public void k(android.support.v4.app.i iVar) {
        if (f245a) {
            Log.v("FragmentManager", "detach: " + iVar);
        }
        if (!iVar.mDetached) {
            iVar.mDetached = true;
            if (!iVar.mAdded) {
                return;
            }
            if (f245a) {
                Log.v("FragmentManager", "remove from detach: " + iVar);
            }
            synchronized (this.e) {
                this.e.remove(iVar);
            }
            if (iVar.mHasMenu && iVar.mMenuVisible) {
                this.r = true;
            }
            iVar.mAdded = false;
        }
    }

    public void l(android.support.v4.app.i iVar) {
        if (f245a) {
            Log.v("FragmentManager", "attach: " + iVar);
        }
        if (iVar.mDetached) {
            iVar.mDetached = false;
            if (iVar.mAdded) {
                return;
            }
            if (this.e.contains(iVar)) {
                throw new IllegalStateException("Fragment already added: " + iVar);
            }
            if (f245a) {
                Log.v("FragmentManager", "add from attach: " + iVar);
            }
            synchronized (this.e) {
                this.e.add(iVar);
            }
            iVar.mAdded = true;
            if (!iVar.mHasMenu || !iVar.mMenuVisible) {
                return;
            }
            this.r = true;
        }
    }

    public android.support.v4.app.i b(int i2) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            android.support.v4.app.i iVar = this.e.get(size);
            if (iVar != null && iVar.mFragmentId == i2) {
                return iVar;
            }
        }
        if (this.f != null) {
            for (int size2 = this.f.size() - 1; size2 >= 0; size2--) {
                android.support.v4.app.i valueAt = this.f.valueAt(size2);
                if (valueAt != null && valueAt.mFragmentId == i2) {
                    return valueAt;
                }
            }
            return null;
        }
        return null;
    }

    @Override // android.support.v4.app.n
    public android.support.v4.app.i a(String str) {
        if (str != null) {
            for (int size = this.e.size() - 1; size >= 0; size--) {
                android.support.v4.app.i iVar = this.e.get(size);
                if (iVar != null && str.equals(iVar.mTag)) {
                    return iVar;
                }
            }
        }
        if (this.f == null || str == null) {
            return null;
        }
        for (int size2 = this.f.size() - 1; size2 >= 0; size2--) {
            android.support.v4.app.i valueAt = this.f.valueAt(size2);
            if (valueAt != null && str.equals(valueAt.mTag)) {
                return valueAt;
            }
        }
        return null;
    }

    public android.support.v4.app.i b(String str) {
        android.support.v4.app.i findFragmentByWho;
        if (this.f == null || str == null) {
            return null;
        }
        for (int size = this.f.size() - 1; size >= 0; size--) {
            android.support.v4.app.i valueAt = this.f.valueAt(size);
            if (valueAt != null && (findFragmentByWho = valueAt.findFragmentByWho(str)) != null) {
                return findFragmentByWho;
            }
        }
        return null;
    }

    private void y() {
        if (d()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.v == null) {
            return;
        }
        throw new IllegalStateException("Can not perform this action inside of " + this.v);
    }

    @Override // android.support.v4.app.n
    public boolean d() {
        return this.s || this.t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0027, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.support.v4.app.o.g r2, boolean r3) {
        /*
            r1 = this;
            if (r3 != 0) goto L5
            r1.y()
        L5:
            monitor-enter(r1)
            boolean r0 = r1.u     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L24
            android.support.v4.app.m r0 = r1.m     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto Lf
            goto L24
        Lf:
            java.util.ArrayList<android.support.v4.app.o$g> r3 = r1.f246b     // Catch: java.lang.Throwable -> L30
            if (r3 != 0) goto L1a
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L30
            r3.<init>()     // Catch: java.lang.Throwable -> L30
            r1.f246b = r3     // Catch: java.lang.Throwable -> L30
        L1a:
            java.util.ArrayList<android.support.v4.app.o$g> r3 = r1.f246b     // Catch: java.lang.Throwable -> L30
            r3.add(r2)     // Catch: java.lang.Throwable -> L30
            r1.z()     // Catch: java.lang.Throwable -> L30
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            return
        L24:
            if (r3 == 0) goto L28
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            return
        L28:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L30
            java.lang.String r3 = "Activity has been destroyed"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L30
            throw r2     // Catch: java.lang.Throwable -> L30
        L30:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L30
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.app.o.a(android.support.v4.app.o$g, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        synchronized (this) {
            boolean z = false;
            boolean z2 = this.C != null && !this.C.isEmpty();
            if (this.f246b != null && this.f246b.size() == 1) {
                z = true;
            }
            if (z2 || z) {
                this.m.j().removeCallbacks(this.E);
                this.m.j().post(this.E);
            }
        }
    }

    public int a(android.support.v4.app.c cVar) {
        synchronized (this) {
            if (this.j != null && this.j.size() > 0) {
                int intValue = this.j.remove(this.j.size() - 1).intValue();
                if (f245a) {
                    Log.v("FragmentManager", "Adding back stack index " + intValue + " with " + cVar);
                }
                this.i.set(intValue, cVar);
                return intValue;
            }
            if (this.i == null) {
                this.i = new ArrayList<>();
            }
            int size = this.i.size();
            if (f245a) {
                Log.v("FragmentManager", "Setting back stack index " + size + " to " + cVar);
            }
            this.i.add(cVar);
            return size;
        }
    }

    public void a(int i2, android.support.v4.app.c cVar) {
        synchronized (this) {
            if (this.i == null) {
                this.i = new ArrayList<>();
            }
            int size = this.i.size();
            if (i2 < size) {
                if (f245a) {
                    Log.v("FragmentManager", "Setting back stack index " + i2 + " to " + cVar);
                }
                this.i.set(i2, cVar);
            } else {
                while (size < i2) {
                    this.i.add(null);
                    if (this.j == null) {
                        this.j = new ArrayList<>();
                    }
                    if (f245a) {
                        Log.v("FragmentManager", "Adding available back stack index " + size);
                    }
                    this.j.add(Integer.valueOf(size));
                    size++;
                }
                if (f245a) {
                    Log.v("FragmentManager", "Adding back stack index " + i2 + " with " + cVar);
                }
                this.i.add(cVar);
            }
        }
    }

    public void c(int i2) {
        synchronized (this) {
            this.i.set(i2, null);
            if (this.j == null) {
                this.j = new ArrayList<>();
            }
            if (f245a) {
                Log.v("FragmentManager", "Freeing back stack index " + i2);
            }
            this.j.add(Integer.valueOf(i2));
        }
    }

    private void c(boolean z) {
        if (this.f247c) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.m == null) {
            throw new IllegalStateException("Fragment host has been destroyed");
        }
        if (Looper.myLooper() != this.m.j().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z) {
            y();
        }
        if (this.x == null) {
            this.x = new ArrayList<>();
            this.y = new ArrayList<>();
        }
        this.f247c = true;
        try {
            a((ArrayList<android.support.v4.app.c>) null, (ArrayList<Boolean>) null);
        } finally {
            this.f247c = false;
        }
    }

    public void b(g gVar, boolean z) {
        if (!z || (this.m != null && !this.u)) {
            c(z);
            if (gVar.a(this.x, this.y)) {
                this.f247c = true;
                try {
                    b(this.x, this.y);
                } finally {
                    A();
                }
            }
            g();
            D();
        }
    }

    private void A() {
        this.f247c = false;
        this.y.clear();
        this.x.clear();
    }

    public boolean f() {
        c(true);
        boolean z = false;
        while (c(this.x, this.y)) {
            this.f247c = true;
            try {
                b(this.x, this.y);
                A();
                z = true;
            } catch (Throwable th) {
                A();
                throw th;
            }
        }
        g();
        D();
        return z;
    }

    private void a(ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2) {
        int indexOf;
        int indexOf2;
        int size = this.C == null ? 0 : this.C.size();
        int i2 = 0;
        while (i2 < size) {
            i iVar = this.C.get(i2);
            if (arrayList != null && !iVar.f277a && (indexOf2 = arrayList.indexOf(iVar.f278b)) != -1 && arrayList2.get(indexOf2).booleanValue()) {
                iVar.e();
            } else if (iVar.c() || (arrayList != null && iVar.f278b.a(arrayList, 0, arrayList.size()))) {
                this.C.remove(i2);
                i2--;
                size--;
                if (arrayList != null && !iVar.f277a && (indexOf = arrayList.indexOf(iVar.f278b)) != -1 && arrayList2.get(indexOf).booleanValue()) {
                    iVar.e();
                } else {
                    iVar.d();
                }
            }
            i2++;
        }
    }

    private void b(ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2) {
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (arrayList2 == null || arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        a(arrayList, arrayList2);
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).t) {
                if (i3 != i2) {
                    a(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).t) {
                        i3++;
                    }
                }
                a(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 == size) {
            return;
        }
        a(arrayList, arrayList2, i3, size);
    }

    private void a(ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        int i4;
        int i5 = i2;
        boolean z = arrayList.get(i5).t;
        if (this.z == null) {
            this.z = new ArrayList<>();
        } else {
            this.z.clear();
        }
        this.z.addAll(this.e);
        android.support.v4.app.i w = w();
        boolean z2 = false;
        for (int i6 = i5; i6 < i3; i6++) {
            android.support.v4.app.c cVar = arrayList.get(i6);
            if (!arrayList2.get(i6).booleanValue()) {
                w = cVar.a(this.z, w);
            } else {
                w = cVar.b(this.z, w);
            }
            z2 = z2 || cVar.i;
        }
        this.z.clear();
        if (!z) {
            t.a(this, arrayList, arrayList2, i5, i3, false);
        }
        b(arrayList, arrayList2, i2, i3);
        if (z) {
            android.support.v4.i.b<android.support.v4.app.i> bVar = new android.support.v4.i.b<>();
            b(bVar);
            int a2 = a(arrayList, arrayList2, i5, i3, bVar);
            a(bVar);
            i4 = a2;
        } else {
            i4 = i3;
        }
        if (i4 != i5 && z) {
            t.a(this, arrayList, arrayList2, i5, i4, true);
            a(this.l, true);
        }
        while (i5 < i3) {
            android.support.v4.app.c cVar2 = arrayList.get(i5);
            if (arrayList2.get(i5).booleanValue() && cVar2.m >= 0) {
                c(cVar2.m);
                cVar2.m = -1;
            }
            cVar2.b();
            i5++;
        }
        if (z2) {
            h();
        }
    }

    private void a(android.support.v4.i.b<android.support.v4.app.i> bVar) {
        int size = bVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            android.support.v4.app.i b2 = bVar.b(i2);
            if (!b2.mAdded) {
                View view = b2.getView();
                b2.mPostponedAlpha = view.getAlpha();
                view.setAlpha(BitmapDescriptorFactory.HUE_RED);
            }
        }
    }

    private int a(ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3, android.support.v4.i.b<android.support.v4.app.i> bVar) {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            android.support.v4.app.c cVar = arrayList.get(i5);
            boolean booleanValue = arrayList2.get(i5).booleanValue();
            if (cVar.g() && !cVar.a(arrayList, i5 + 1, i3)) {
                if (this.C == null) {
                    this.C = new ArrayList<>();
                }
                i iVar = new i(cVar, booleanValue);
                this.C.add(iVar);
                cVar.a(iVar);
                if (booleanValue) {
                    cVar.f();
                } else {
                    cVar.b(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, cVar);
                }
                b(bVar);
            }
        }
        return i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(android.support.v4.app.c cVar, boolean z, boolean z2, boolean z3) {
        if (z) {
            cVar.b(z3);
        } else {
            cVar.f();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(cVar);
        arrayList2.add(Boolean.valueOf(z));
        if (z2) {
            t.a(this, (ArrayList<android.support.v4.app.c>) arrayList, (ArrayList<Boolean>) arrayList2, 0, 1, true);
        }
        if (z3) {
            a(this.l, true);
        }
        if (this.f != null) {
            int size = this.f.size();
            for (int i2 = 0; i2 < size; i2++) {
                android.support.v4.app.i valueAt = this.f.valueAt(i2);
                if (valueAt != null && valueAt.mView != null && valueAt.mIsNewlyAdded && cVar.b(valueAt.mContainerId)) {
                    if (valueAt.mPostponedAlpha > BitmapDescriptorFactory.HUE_RED) {
                        valueAt.mView.setAlpha(valueAt.mPostponedAlpha);
                    }
                    if (z3) {
                        valueAt.mPostponedAlpha = BitmapDescriptorFactory.HUE_RED;
                    } else {
                        valueAt.mPostponedAlpha = -1.0f;
                        valueAt.mIsNewlyAdded = false;
                    }
                }
            }
        }
    }

    private android.support.v4.app.i p(android.support.v4.app.i iVar) {
        ViewGroup viewGroup = iVar.mContainer;
        View view = iVar.mView;
        if (viewGroup == null || view == null) {
            return null;
        }
        for (int indexOf = this.e.indexOf(iVar) - 1; indexOf >= 0; indexOf--) {
            android.support.v4.app.i iVar2 = this.e.get(indexOf);
            if (iVar2.mContainer == viewGroup && iVar2.mView != null) {
                return iVar2;
            }
        }
        return null;
    }

    private static void b(ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            android.support.v4.app.c cVar = arrayList.get(i2);
            boolean z = true;
            if (arrayList2.get(i2).booleanValue()) {
                cVar.a(-1);
                if (i2 != i3 - 1) {
                    z = false;
                }
                cVar.b(z);
            } else {
                cVar.a(1);
                cVar.f();
            }
            i2++;
        }
    }

    private void b(android.support.v4.i.b<android.support.v4.app.i> bVar) {
        if (this.l < 1) {
            return;
        }
        int min = Math.min(this.l, 4);
        int size = this.e.size();
        for (int i2 = 0; i2 < size; i2++) {
            android.support.v4.app.i iVar = this.e.get(i2);
            if (iVar.mState < min) {
                a(iVar, min, iVar.getNextAnim(), iVar.getNextTransition(), false);
                if (iVar.mView != null && !iVar.mHidden && iVar.mIsNewlyAdded) {
                    bVar.add(iVar);
                }
            }
        }
    }

    private void B() {
        if (this.C != null) {
            while (!this.C.isEmpty()) {
                this.C.remove(0).d();
            }
        }
    }

    private void C() {
        int size = this.f == null ? 0 : this.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            android.support.v4.app.i valueAt = this.f.valueAt(i2);
            if (valueAt != null) {
                if (valueAt.getAnimatingAway() != null) {
                    int stateAfterAnimating = valueAt.getStateAfterAnimating();
                    View animatingAway = valueAt.getAnimatingAway();
                    Animation animation = animatingAway.getAnimation();
                    if (animation != null) {
                        animation.cancel();
                        animatingAway.clearAnimation();
                    }
                    valueAt.setAnimatingAway(null);
                    a(valueAt, stateAfterAnimating, 0, 0, false);
                } else if (valueAt.getAnimator() != null) {
                    valueAt.getAnimator().end();
                }
            }
        }
    }

    private boolean c(ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2) {
        synchronized (this) {
            if (this.f246b != null && this.f246b.size() != 0) {
                int size = this.f246b.size();
                boolean z = false;
                for (int i2 = 0; i2 < size; i2++) {
                    z |= this.f246b.get(i2).a(arrayList, arrayList2);
                }
                this.f246b.clear();
                this.m.j().removeCallbacks(this.E);
                return z;
            }
            return false;
        }
    }

    void g() {
        if (this.w) {
            this.w = false;
            e();
        }
    }

    void h() {
        if (this.k != null) {
            for (int i2 = 0; i2 < this.k.size(); i2++) {
                this.k.get(i2).a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(android.support.v4.app.c cVar) {
        if (this.g == null) {
            this.g = new ArrayList<>();
        }
        this.g.add(cVar);
    }

    boolean a(ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2, String str, int i2, int i3) {
        int size;
        if (this.g == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size2 = this.g.size() - 1;
            if (size2 < 0) {
                return false;
            }
            arrayList.add(this.g.remove(size2));
            arrayList2.add(true);
        } else {
            if (str != null || i2 >= 0) {
                size = this.g.size() - 1;
                while (size >= 0) {
                    android.support.v4.app.c cVar = this.g.get(size);
                    if ((str != null && str.equals(cVar.h())) || (i2 >= 0 && i2 == cVar.m)) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    size--;
                    while (size >= 0) {
                        android.support.v4.app.c cVar2 = this.g.get(size);
                        if ((str == null || !str.equals(cVar2.h())) && (i2 < 0 || i2 != cVar2.m)) {
                            break;
                        }
                        size--;
                    }
                }
            } else {
                size = -1;
            }
            if (size == this.g.size() - 1) {
                return false;
            }
            for (int size3 = this.g.size() - 1; size3 > size; size3--) {
                arrayList.add(this.g.remove(size3));
                arrayList2.add(true);
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p i() {
        a(this.D);
        return this.D;
    }

    private static void a(p pVar) {
        if (pVar == null) {
            return;
        }
        List<android.support.v4.app.i> a2 = pVar.a();
        if (a2 != null) {
            for (android.support.v4.app.i iVar : a2) {
                iVar.mRetaining = true;
            }
        }
        List<p> b2 = pVar.b();
        if (b2 == null) {
            return;
        }
        for (p pVar2 : b2) {
            a(pVar2);
        }
    }

    void j() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        p pVar;
        if (this.f != null) {
            arrayList = null;
            arrayList2 = null;
            arrayList3 = null;
            for (int i2 = 0; i2 < this.f.size(); i2++) {
                android.support.v4.app.i valueAt = this.f.valueAt(i2);
                if (valueAt != null) {
                    if (valueAt.mRetainInstance) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(valueAt);
                        valueAt.mTargetIndex = valueAt.mTarget != null ? valueAt.mTarget.mIndex : -1;
                        if (f245a) {
                            Log.v("FragmentManager", "retainNonConfig: keeping retained " + valueAt);
                        }
                    }
                    if (valueAt.mChildFragmentManager != null) {
                        valueAt.mChildFragmentManager.j();
                        pVar = valueAt.mChildFragmentManager.D;
                    } else {
                        pVar = valueAt.mChildNonConfig;
                    }
                    if (arrayList2 == null && pVar != null) {
                        arrayList2 = new ArrayList(this.f.size());
                        for (int i3 = 0; i3 < i2; i3++) {
                            arrayList2.add(null);
                        }
                    }
                    if (arrayList2 != null) {
                        arrayList2.add(pVar);
                    }
                    if (arrayList3 == null && valueAt.mViewModelStore != null) {
                        arrayList3 = new ArrayList(this.f.size());
                        for (int i4 = 0; i4 < i2; i4++) {
                            arrayList3.add(null);
                        }
                    }
                    if (arrayList3 != null) {
                        arrayList3.add(valueAt.mViewModelStore);
                    }
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
            arrayList3 = null;
        }
        if (arrayList == null && arrayList2 == null && arrayList3 == null) {
            this.D = null;
        } else {
            this.D = new p(arrayList, arrayList2, arrayList3);
        }
    }

    void m(android.support.v4.app.i iVar) {
        if (iVar.mInnerView == null) {
            return;
        }
        if (this.B == null) {
            this.B = new SparseArray<>();
        } else {
            this.B.clear();
        }
        iVar.mInnerView.saveHierarchyState(this.B);
        if (this.B.size() <= 0) {
            return;
        }
        iVar.mSavedViewState = this.B;
        this.B = null;
    }

    Bundle n(android.support.v4.app.i iVar) {
        Bundle bundle;
        if (this.A == null) {
            this.A = new Bundle();
        }
        iVar.performSaveInstanceState(this.A);
        d(iVar, this.A, false);
        if (!this.A.isEmpty()) {
            bundle = this.A;
            this.A = null;
        } else {
            bundle = null;
        }
        if (iVar.mView != null) {
            m(iVar);
        }
        if (iVar.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", iVar.mSavedViewState);
        }
        if (!iVar.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", iVar.mUserVisibleHint);
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Parcelable k() {
        int[] iArr;
        int size;
        B();
        C();
        f();
        this.s = true;
        android.support.v4.app.d[] dVarArr = null;
        this.D = null;
        if (this.f == null || this.f.size() <= 0) {
            return null;
        }
        int size2 = this.f.size();
        r[] rVarArr = new r[size2];
        boolean z = false;
        for (int i2 = 0; i2 < size2; i2++) {
            android.support.v4.app.i valueAt = this.f.valueAt(i2);
            if (valueAt != null) {
                if (valueAt.mIndex < 0) {
                    a(new IllegalStateException("Failure saving state: active " + valueAt + " has cleared index: " + valueAt.mIndex));
                }
                r rVar = new r(valueAt);
                rVarArr[i2] = rVar;
                if (valueAt.mState > 0 && rVar.k == null) {
                    rVar.k = n(valueAt);
                    if (valueAt.mTarget != null) {
                        if (valueAt.mTarget.mIndex < 0) {
                            a(new IllegalStateException("Failure saving state: " + valueAt + " has target not in fragment manager: " + valueAt.mTarget));
                        }
                        if (rVar.k == null) {
                            rVar.k = new Bundle();
                        }
                        a(rVar.k, "android:target_state", valueAt.mTarget);
                        if (valueAt.mTargetRequestCode != 0) {
                            rVar.k.putInt("android:target_req_state", valueAt.mTargetRequestCode);
                        }
                    }
                } else {
                    rVar.k = valueAt.mSavedFragmentState;
                }
                if (f245a) {
                    Log.v("FragmentManager", "Saved state of " + valueAt + ": " + rVar.k);
                }
                z = true;
            }
        }
        if (!z) {
            if (f245a) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
            }
            return null;
        }
        int size3 = this.e.size();
        if (size3 > 0) {
            iArr = new int[size3];
            for (int i3 = 0; i3 < size3; i3++) {
                iArr[i3] = this.e.get(i3).mIndex;
                if (iArr[i3] < 0) {
                    a(new IllegalStateException("Failure saving state: active " + this.e.get(i3) + " has cleared index: " + iArr[i3]));
                }
                if (f245a) {
                    Log.v("FragmentManager", "saveAllState: adding fragment #" + i3 + ": " + this.e.get(i3));
                }
            }
        } else {
            iArr = null;
        }
        if (this.g != null && (size = this.g.size()) > 0) {
            dVarArr = new android.support.v4.app.d[size];
            for (int i4 = 0; i4 < size; i4++) {
                dVarArr[i4] = new android.support.v4.app.d(this.g.get(i4));
                if (f245a) {
                    Log.v("FragmentManager", "saveAllState: adding back stack #" + i4 + ": " + this.g.get(i4));
                }
            }
        }
        q qVar = new q();
        qVar.f283a = rVarArr;
        qVar.f284b = iArr;
        qVar.f285c = dVarArr;
        if (this.p != null) {
            qVar.f286d = this.p.mIndex;
        }
        qVar.e = this.f248d;
        j();
        return qVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Parcelable parcelable, p pVar) {
        List<p> list;
        List<android.arch.lifecycle.p> list2;
        if (parcelable == null) {
            return;
        }
        q qVar = (q) parcelable;
        if (qVar.f283a == null) {
            return;
        }
        if (pVar != null) {
            List<android.support.v4.app.i> a2 = pVar.a();
            list = pVar.b();
            list2 = pVar.c();
            int size = a2 != null ? a2.size() : 0;
            for (int i2 = 0; i2 < size; i2++) {
                android.support.v4.app.i iVar = a2.get(i2);
                if (f245a) {
                    Log.v("FragmentManager", "restoreAllState: re-attaching retained " + iVar);
                }
                int i3 = 0;
                while (i3 < qVar.f283a.length && qVar.f283a[i3].f288b != iVar.mIndex) {
                    i3++;
                }
                if (i3 == qVar.f283a.length) {
                    a(new IllegalStateException("Could not find active fragment with index " + iVar.mIndex));
                }
                r rVar = qVar.f283a[i3];
                rVar.l = iVar;
                iVar.mSavedViewState = null;
                iVar.mBackStackNesting = 0;
                iVar.mInLayout = false;
                iVar.mAdded = false;
                iVar.mTarget = null;
                if (rVar.k != null) {
                    rVar.k.setClassLoader(this.m.i().getClassLoader());
                    iVar.mSavedViewState = rVar.k.getSparseParcelableArray("android:view_state");
                    iVar.mSavedFragmentState = rVar.k;
                }
            }
        } else {
            list = null;
            list2 = null;
        }
        this.f = new SparseArray<>(qVar.f283a.length);
        int i4 = 0;
        while (i4 < qVar.f283a.length) {
            r rVar2 = qVar.f283a[i4];
            if (rVar2 != null) {
                android.support.v4.app.i a3 = rVar2.a(this.m, this.n, this.o, (list == null || i4 >= list.size()) ? null : list.get(i4), (list2 == null || i4 >= list2.size()) ? null : list2.get(i4));
                if (f245a) {
                    Log.v("FragmentManager", "restoreAllState: active #" + i4 + ": " + a3);
                }
                this.f.put(a3.mIndex, a3);
                rVar2.l = null;
            }
            i4++;
        }
        if (pVar != null) {
            List<android.support.v4.app.i> a4 = pVar.a();
            int size2 = a4 != null ? a4.size() : 0;
            for (int i5 = 0; i5 < size2; i5++) {
                android.support.v4.app.i iVar2 = a4.get(i5);
                if (iVar2.mTargetIndex >= 0) {
                    iVar2.mTarget = this.f.get(iVar2.mTargetIndex);
                    if (iVar2.mTarget == null) {
                        Log.w("FragmentManager", "Re-attaching retained fragment " + iVar2 + " target no longer exists: " + iVar2.mTargetIndex);
                    }
                }
            }
        }
        this.e.clear();
        if (qVar.f284b != null) {
            for (int i6 = 0; i6 < qVar.f284b.length; i6++) {
                android.support.v4.app.i iVar3 = this.f.get(qVar.f284b[i6]);
                if (iVar3 == null) {
                    a(new IllegalStateException("No instantiated fragment for index #" + qVar.f284b[i6]));
                }
                iVar3.mAdded = true;
                if (f245a) {
                    Log.v("FragmentManager", "restoreAllState: added #" + i6 + ": " + iVar3);
                }
                if (this.e.contains(iVar3)) {
                    throw new IllegalStateException("Already added!");
                }
                synchronized (this.e) {
                    this.e.add(iVar3);
                }
            }
        }
        if (qVar.f285c != null) {
            this.g = new ArrayList<>(qVar.f285c.length);
            for (int i7 = 0; i7 < qVar.f285c.length; i7++) {
                android.support.v4.app.c a5 = qVar.f285c[i7].a(this);
                if (f245a) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i7 + " (index " + a5.m + "): " + a5);
                    PrintWriter printWriter = new PrintWriter(new android.support.v4.i.e("FragmentManager"));
                    a5.a("  ", printWriter, false);
                    printWriter.close();
                }
                this.g.add(a5);
                if (a5.m >= 0) {
                    a(a5.m, a5);
                }
            }
        } else {
            this.g = null;
        }
        if (qVar.f286d >= 0) {
            this.p = this.f.get(qVar.f286d);
        }
        this.f248d = qVar.e;
    }

    private void D() {
        if (this.f != null) {
            for (int size = this.f.size() - 1; size >= 0; size--) {
                if (this.f.valueAt(size) == null) {
                    this.f.delete(this.f.keyAt(size));
                }
            }
        }
    }

    public void a(m mVar, k kVar, android.support.v4.app.i iVar) {
        if (this.m != null) {
            throw new IllegalStateException("Already attached");
        }
        this.m = mVar;
        this.n = kVar;
        this.o = iVar;
    }

    public void l() {
        this.D = null;
        this.s = false;
        this.t = false;
        int size = this.e.size();
        for (int i2 = 0; i2 < size; i2++) {
            android.support.v4.app.i iVar = this.e.get(i2);
            if (iVar != null) {
                iVar.noteStateNotSaved();
            }
        }
    }

    public void m() {
        this.s = false;
        this.t = false;
        e(1);
    }

    public void n() {
        this.s = false;
        this.t = false;
        e(2);
    }

    public void o() {
        this.s = false;
        this.t = false;
        e(4);
    }

    public void p() {
        this.s = false;
        this.t = false;
        e(5);
    }

    public void q() {
        e(4);
    }

    public void r() {
        this.t = true;
        e(3);
    }

    public void s() {
        e(2);
    }

    public void t() {
        e(1);
    }

    public void u() {
        this.u = true;
        f();
        e(0);
        this.m = null;
        this.n = null;
        this.o = null;
    }

    private void e(int i2) {
        try {
            this.f247c = true;
            a(i2, false);
            this.f247c = false;
            f();
        } catch (Throwable th) {
            this.f247c = false;
            throw th;
        }
    }

    public void a(boolean z) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            android.support.v4.app.i iVar = this.e.get(size);
            if (iVar != null) {
                iVar.performMultiWindowModeChanged(z);
            }
        }
    }

    public void b(boolean z) {
        for (int size = this.e.size() - 1; size >= 0; size--) {
            android.support.v4.app.i iVar = this.e.get(size);
            if (iVar != null) {
                iVar.performPictureInPictureModeChanged(z);
            }
        }
    }

    public void a(Configuration configuration) {
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            android.support.v4.app.i iVar = this.e.get(i2);
            if (iVar != null) {
                iVar.performConfigurationChanged(configuration);
            }
        }
    }

    public void v() {
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            android.support.v4.app.i iVar = this.e.get(i2);
            if (iVar != null) {
                iVar.performLowMemory();
            }
        }
    }

    public boolean a(Menu menu, MenuInflater menuInflater) {
        if (this.l < 1) {
            return false;
        }
        ArrayList<android.support.v4.app.i> arrayList = null;
        boolean z = false;
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            android.support.v4.app.i iVar = this.e.get(i2);
            if (iVar != null && iVar.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(iVar);
                z = true;
            }
        }
        if (this.h != null) {
            for (int i3 = 0; i3 < this.h.size(); i3++) {
                android.support.v4.app.i iVar2 = this.h.get(i3);
                if (arrayList == null || !arrayList.contains(iVar2)) {
                    iVar2.onDestroyOptionsMenu();
                }
            }
        }
        this.h = arrayList;
        return z;
    }

    public boolean a(Menu menu) {
        if (this.l < 1) {
            return false;
        }
        boolean z = false;
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            android.support.v4.app.i iVar = this.e.get(i2);
            if (iVar != null && iVar.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public boolean a(MenuItem menuItem) {
        if (this.l < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            android.support.v4.app.i iVar = this.e.get(i2);
            if (iVar != null && iVar.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public boolean b(MenuItem menuItem) {
        if (this.l < 1) {
            return false;
        }
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            android.support.v4.app.i iVar = this.e.get(i2);
            if (iVar != null && iVar.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void b(Menu menu) {
        if (this.l < 1) {
            return;
        }
        for (int i2 = 0; i2 < this.e.size(); i2++) {
            android.support.v4.app.i iVar = this.e.get(i2);
            if (iVar != null) {
                iVar.performOptionsMenuClosed(menu);
            }
        }
    }

    public void o(android.support.v4.app.i iVar) {
        if (iVar != null && (this.f.get(iVar.mIndex) != iVar || (iVar.mHost != null && iVar.getFragmentManager() != this))) {
            throw new IllegalArgumentException("Fragment " + iVar + " is not an active fragment of FragmentManager " + this);
        }
        this.p = iVar;
    }

    public android.support.v4.app.i w() {
        return this.p;
    }

    void a(android.support.v4.app.i iVar, Context context, boolean z) {
        if (this.o != null) {
            n fragmentManager = this.o.getFragmentManager();
            if (fragmentManager instanceof o) {
                ((o) fragmentManager).a(iVar, context, true);
            }
        }
        Iterator<android.support.v4.i.i<n.a, Boolean>> it = this.J.iterator();
        while (it.hasNext()) {
            android.support.v4.i.i<n.a, Boolean> next = it.next();
            if (!z || next.f470b.booleanValue()) {
                next.f469a.a(this, iVar, context);
            }
        }
    }

    void b(android.support.v4.app.i iVar, Context context, boolean z) {
        if (this.o != null) {
            n fragmentManager = this.o.getFragmentManager();
            if (fragmentManager instanceof o) {
                ((o) fragmentManager).b(iVar, context, true);
            }
        }
        Iterator<android.support.v4.i.i<n.a, Boolean>> it = this.J.iterator();
        while (it.hasNext()) {
            android.support.v4.i.i<n.a, Boolean> next = it.next();
            if (!z || next.f470b.booleanValue()) {
                next.f469a.b(this, iVar, context);
            }
        }
    }

    void a(android.support.v4.app.i iVar, Bundle bundle, boolean z) {
        if (this.o != null) {
            n fragmentManager = this.o.getFragmentManager();
            if (fragmentManager instanceof o) {
                ((o) fragmentManager).a(iVar, bundle, true);
            }
        }
        Iterator<android.support.v4.i.i<n.a, Boolean>> it = this.J.iterator();
        while (it.hasNext()) {
            android.support.v4.i.i<n.a, Boolean> next = it.next();
            if (!z || next.f470b.booleanValue()) {
                next.f469a.a(this, iVar, bundle);
            }
        }
    }

    void b(android.support.v4.app.i iVar, Bundle bundle, boolean z) {
        if (this.o != null) {
            n fragmentManager = this.o.getFragmentManager();
            if (fragmentManager instanceof o) {
                ((o) fragmentManager).b(iVar, bundle, true);
            }
        }
        Iterator<android.support.v4.i.i<n.a, Boolean>> it = this.J.iterator();
        while (it.hasNext()) {
            android.support.v4.i.i<n.a, Boolean> next = it.next();
            if (!z || next.f470b.booleanValue()) {
                next.f469a.b(this, iVar, bundle);
            }
        }
    }

    void c(android.support.v4.app.i iVar, Bundle bundle, boolean z) {
        if (this.o != null) {
            n fragmentManager = this.o.getFragmentManager();
            if (fragmentManager instanceof o) {
                ((o) fragmentManager).c(iVar, bundle, true);
            }
        }
        Iterator<android.support.v4.i.i<n.a, Boolean>> it = this.J.iterator();
        while (it.hasNext()) {
            android.support.v4.i.i<n.a, Boolean> next = it.next();
            if (!z || next.f470b.booleanValue()) {
                next.f469a.c(this, iVar, bundle);
            }
        }
    }

    void a(android.support.v4.app.i iVar, View view, Bundle bundle, boolean z) {
        if (this.o != null) {
            n fragmentManager = this.o.getFragmentManager();
            if (fragmentManager instanceof o) {
                ((o) fragmentManager).a(iVar, view, bundle, true);
            }
        }
        Iterator<android.support.v4.i.i<n.a, Boolean>> it = this.J.iterator();
        while (it.hasNext()) {
            android.support.v4.i.i<n.a, Boolean> next = it.next();
            if (!z || next.f470b.booleanValue()) {
                next.f469a.a(this, iVar, view, bundle);
            }
        }
    }

    void b(android.support.v4.app.i iVar, boolean z) {
        if (this.o != null) {
            n fragmentManager = this.o.getFragmentManager();
            if (fragmentManager instanceof o) {
                ((o) fragmentManager).b(iVar, true);
            }
        }
        Iterator<android.support.v4.i.i<n.a, Boolean>> it = this.J.iterator();
        while (it.hasNext()) {
            android.support.v4.i.i<n.a, Boolean> next = it.next();
            if (!z || next.f470b.booleanValue()) {
                next.f469a.a(this, iVar);
            }
        }
    }

    void c(android.support.v4.app.i iVar, boolean z) {
        if (this.o != null) {
            n fragmentManager = this.o.getFragmentManager();
            if (fragmentManager instanceof o) {
                ((o) fragmentManager).c(iVar, true);
            }
        }
        Iterator<android.support.v4.i.i<n.a, Boolean>> it = this.J.iterator();
        while (it.hasNext()) {
            android.support.v4.i.i<n.a, Boolean> next = it.next();
            if (!z || next.f470b.booleanValue()) {
                next.f469a.b(this, iVar);
            }
        }
    }

    void d(android.support.v4.app.i iVar, boolean z) {
        if (this.o != null) {
            n fragmentManager = this.o.getFragmentManager();
            if (fragmentManager instanceof o) {
                ((o) fragmentManager).d(iVar, true);
            }
        }
        Iterator<android.support.v4.i.i<n.a, Boolean>> it = this.J.iterator();
        while (it.hasNext()) {
            android.support.v4.i.i<n.a, Boolean> next = it.next();
            if (!z || next.f470b.booleanValue()) {
                next.f469a.c(this, iVar);
            }
        }
    }

    void e(android.support.v4.app.i iVar, boolean z) {
        if (this.o != null) {
            n fragmentManager = this.o.getFragmentManager();
            if (fragmentManager instanceof o) {
                ((o) fragmentManager).e(iVar, true);
            }
        }
        Iterator<android.support.v4.i.i<n.a, Boolean>> it = this.J.iterator();
        while (it.hasNext()) {
            android.support.v4.i.i<n.a, Boolean> next = it.next();
            if (!z || next.f470b.booleanValue()) {
                next.f469a.d(this, iVar);
            }
        }
    }

    void d(android.support.v4.app.i iVar, Bundle bundle, boolean z) {
        if (this.o != null) {
            n fragmentManager = this.o.getFragmentManager();
            if (fragmentManager instanceof o) {
                ((o) fragmentManager).d(iVar, bundle, true);
            }
        }
        Iterator<android.support.v4.i.i<n.a, Boolean>> it = this.J.iterator();
        while (it.hasNext()) {
            android.support.v4.i.i<n.a, Boolean> next = it.next();
            if (!z || next.f470b.booleanValue()) {
                next.f469a.d(this, iVar, bundle);
            }
        }
    }

    void f(android.support.v4.app.i iVar, boolean z) {
        if (this.o != null) {
            n fragmentManager = this.o.getFragmentManager();
            if (fragmentManager instanceof o) {
                ((o) fragmentManager).f(iVar, true);
            }
        }
        Iterator<android.support.v4.i.i<n.a, Boolean>> it = this.J.iterator();
        while (it.hasNext()) {
            android.support.v4.i.i<n.a, Boolean> next = it.next();
            if (!z || next.f470b.booleanValue()) {
                next.f469a.e(this, iVar);
            }
        }
    }

    void g(android.support.v4.app.i iVar, boolean z) {
        if (this.o != null) {
            n fragmentManager = this.o.getFragmentManager();
            if (fragmentManager instanceof o) {
                ((o) fragmentManager).g(iVar, true);
            }
        }
        Iterator<android.support.v4.i.i<n.a, Boolean>> it = this.J.iterator();
        while (it.hasNext()) {
            android.support.v4.i.i<n.a, Boolean> next = it.next();
            if (!z || next.f470b.booleanValue()) {
                next.f469a.f(this, iVar);
            }
        }
    }

    void h(android.support.v4.app.i iVar, boolean z) {
        if (this.o != null) {
            n fragmentManager = this.o.getFragmentManager();
            if (fragmentManager instanceof o) {
                ((o) fragmentManager).h(iVar, true);
            }
        }
        Iterator<android.support.v4.i.i<n.a, Boolean>> it = this.J.iterator();
        while (it.hasNext()) {
            android.support.v4.i.i<n.a, Boolean> next = it.next();
            if (!z || next.f470b.booleanValue()) {
                next.f469a.g(this, iVar);
            }
        }
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        android.support.v4.app.i iVar;
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.f272a);
        int i2 = 0;
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        String str2 = attributeValue;
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (!android.support.v4.app.i.isSupportFragmentClass(this.m.i(), str2)) {
            return null;
        }
        if (view != null) {
            i2 = view.getId();
        }
        if (i2 == -1 && resourceId == -1 && string == null) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + str2);
        }
        android.support.v4.app.i b2 = resourceId != -1 ? b(resourceId) : null;
        if (b2 == null && string != null) {
            b2 = a(string);
        }
        if (b2 == null && i2 != -1) {
            b2 = b(i2);
        }
        if (f245a) {
            Log.v("FragmentManager", "onCreateView: id=0x" + Integer.toHexString(resourceId) + " fname=" + str2 + " existing=" + b2);
        }
        if (b2 == null) {
            android.support.v4.app.i a2 = this.n.a(context, str2, null);
            a2.mFromLayout = true;
            a2.mFragmentId = resourceId != 0 ? resourceId : i2;
            a2.mContainerId = i2;
            a2.mTag = string;
            a2.mInLayout = true;
            a2.mFragmentManager = this;
            a2.mHost = this.m;
            a2.onInflate(this.m.i(), attributeSet, a2.mSavedFragmentState);
            a(a2, true);
            iVar = a2;
        } else if (b2.mInLayout) {
            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i2) + " with another fragment for " + str2);
        } else {
            b2.mInLayout = true;
            b2.mHost = this.m;
            if (!b2.mRetaining) {
                b2.onInflate(this.m.i(), attributeSet, b2.mSavedFragmentState);
            }
            iVar = b2;
        }
        if (this.l < 1 && iVar.mFromLayout) {
            a(iVar, 1, 0, 0, false);
        } else {
            b(iVar);
        }
        if (iVar.mView == null) {
            throw new IllegalStateException("Fragment " + str2 + " did not create a view.");
        }
        if (resourceId != 0) {
            iVar.mView.setId(resourceId);
        }
        if (iVar.mView.getTag() == null) {
            iVar.mView.setTag(string);
        }
        return iVar.mView;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    private class h implements g {

        /* renamed from: a  reason: collision with root package name */
        final String f273a;

        /* renamed from: b  reason: collision with root package name */
        final int f274b;

        /* renamed from: c  reason: collision with root package name */
        final int f275c;

        h(String str, int i, int i2) {
            this.f273a = str;
            this.f274b = i;
            this.f275c = i2;
        }

        @Override // android.support.v4.app.o.g
        public boolean a(ArrayList<android.support.v4.app.c> arrayList, ArrayList<Boolean> arrayList2) {
            n peekChildFragmentManager;
            if (o.this.p == null || this.f274b >= 0 || this.f273a != null || (peekChildFragmentManager = o.this.p.peekChildFragmentManager()) == null || !peekChildFragmentManager.b()) {
                return o.this.a(arrayList, arrayList2, this.f273a, this.f274b, this.f275c);
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public static class i implements i.c {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f277a;

        /* renamed from: b  reason: collision with root package name */
        private final android.support.v4.app.c f278b;

        /* renamed from: c  reason: collision with root package name */
        private int f279c;

        i(android.support.v4.app.c cVar, boolean z) {
            this.f277a = z;
            this.f278b = cVar;
        }

        @Override // android.support.v4.app.i.c
        public void a() {
            this.f279c--;
            if (this.f279c != 0) {
                return;
            }
            this.f278b.f210a.z();
        }

        @Override // android.support.v4.app.i.c
        public void b() {
            this.f279c++;
        }

        public boolean c() {
            return this.f279c == 0;
        }

        public void d() {
            boolean z = this.f279c > 0;
            o oVar = this.f278b.f210a;
            int size = oVar.e.size();
            for (int i = 0; i < size; i++) {
                android.support.v4.app.i iVar = oVar.e.get(i);
                iVar.setOnStartEnterTransitionListener(null);
                if (z && iVar.isPostponed()) {
                    iVar.startPostponedEnterTransition();
                }
            }
            this.f278b.f210a.a(this.f278b, this.f277a, !z, true);
        }

        public void e() {
            this.f278b.f210a.a(this.f278b, this.f277a, false, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f265a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f266b;

        private c(Animation animation) {
            this.f265a = animation;
            this.f266b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        private c(Animator animator) {
            this.f265a = null;
            this.f266b = animator;
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    private static class b implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        private final Animation.AnimationListener f264a;

        private b(Animation.AnimationListener animationListener) {
            this.f264a = animationListener;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            if (this.f264a != null) {
                this.f264a.onAnimationStart(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (this.f264a != null) {
                this.f264a.onAnimationEnd(animation);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            if (this.f264a != null) {
                this.f264a.onAnimationRepeat(animation);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public static class a extends b {

        /* renamed from: a  reason: collision with root package name */
        View f262a;

        a(View view, Animation.AnimationListener animationListener) {
            super(animationListener);
            this.f262a = view;
        }

        @Override // android.support.v4.app.o.b, android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            if (android.support.v4.j.s.q(this.f262a) || Build.VERSION.SDK_INT >= 24) {
                this.f262a.post(new Runnable() { // from class: android.support.v4.app.o.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.f262a.setLayerType(0, null);
                    }
                });
            } else {
                this.f262a.setLayerType(0, null);
            }
            super.onAnimationEnd(animation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public static class d extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        View f267a;

        d(View view) {
            this.f267a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f267a.setLayerType(2, null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f267a.setLayerType(0, null);
            animator.removeListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FragmentManager.java */
    /* loaded from: classes.dex */
    public static class e extends AnimationSet implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final ViewGroup f268a;

        /* renamed from: b  reason: collision with root package name */
        private final View f269b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f270c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f271d;

        e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f268a = viewGroup;
            this.f269b = view;
            addAnimation(animation);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            if (this.f270c) {
                return !this.f271d;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f270c = true;
                ac.a(this.f268a, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f) {
            if (this.f270c) {
                return !this.f271d;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f270c = true;
                ac.a(this.f268a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f268a.endViewTransition(this.f269b);
            this.f271d = true;
        }
    }
}
