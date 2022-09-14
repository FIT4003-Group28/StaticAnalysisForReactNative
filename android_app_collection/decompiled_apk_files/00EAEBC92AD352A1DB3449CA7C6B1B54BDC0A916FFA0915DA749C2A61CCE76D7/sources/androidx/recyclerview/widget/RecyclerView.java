package androidx.recyclerview.widget;

import a.g.m.e0.c;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.recyclerview.widget.a;
import androidx.recyclerview.widget.b;
import androidx.recyclerview.widget.e;
import androidx.recyclerview.widget.l;
import androidx.recyclerview.widget.p;
import androidx.recyclerview.widget.q;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements a.g.m.t, a.g.m.j, a.g.m.k {
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC;
    static final boolean ALLOW_THREAD_GAP_WORK;
    static final boolean DEBUG = false;
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION;
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = {16843830};
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    static final boolean POST_UPDATES_ON_ANIMATION;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static final Interpolator sQuinticInterpolator;
    androidx.recyclerview.widget.l mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    g mAdapter;
    androidx.recyclerview.widget.a mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private j mChildDrawingOrderCallback;
    androidx.recyclerview.widget.b mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private k mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    androidx.recyclerview.widget.e mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private s mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    l mItemAnimator;
    private l.b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<n> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastTouchX;
    private int mLastTouchY;
    o mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final x mObserver;
    private List<q> mOnChildAttachStateListeners;
    private r mOnFlingListener;
    private final ArrayList<s> mOnItemTouchListeners;
    final List<d0> mPendingAccessibilityImportanceChange;
    private y mPendingSavedState;
    boolean mPostedAnimatorRunner;
    e.b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final v mRecycler;
    w mRecyclerListener;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private t mScrollListener;
    private List<t> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private a.g.m.m mScrollingChildHelper;
    final a0 mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final c0 mViewFlinger;
    private final q.b mViewInfoProcessCallback;
    final androidx.recyclerview.widget.q mViewInfoStore;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.mFirstLayoutComplete || recyclerView.isLayoutRequested()) {
                return;
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            if (!recyclerView2.mIsAttached) {
                recyclerView2.requestLayout();
            } else if (recyclerView2.mLayoutSuppressed) {
                recyclerView2.mLayoutWasDefered = true;
            } else {
                recyclerView2.consumePendingUpdateOperations();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class a0 {

        /* renamed from: b  reason: collision with root package name */
        private SparseArray<Object> f1908b;
        int m;
        long n;
        int o;
        int p;
        int q;

        /* renamed from: a  reason: collision with root package name */
        int f1907a = -1;

        /* renamed from: c  reason: collision with root package name */
        int f1909c = 0;

        /* renamed from: d  reason: collision with root package name */
        int f1910d = 0;

        /* renamed from: e  reason: collision with root package name */
        int f1911e = 1;

        /* renamed from: f  reason: collision with root package name */
        int f1912f = 0;

        /* renamed from: g  reason: collision with root package name */
        boolean f1913g = false;

        /* renamed from: h  reason: collision with root package name */
        boolean f1914h = false;
        boolean i = false;
        boolean j = false;
        boolean k = false;
        boolean l = false;

        public int a() {
            return this.f1914h ? this.f1909c - this.f1910d : this.f1912f;
        }

        void a(int i) {
            if ((this.f1911e & i) != 0) {
                return;
            }
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i) + " but it is " + Integer.toBinaryString(this.f1911e));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(g gVar) {
            this.f1911e = 1;
            this.f1912f = gVar.a();
            this.f1914h = false;
            this.i = false;
            this.j = false;
        }

        public int b() {
            return this.f1907a;
        }

        public boolean c() {
            return this.f1907a != -1;
        }

        public boolean d() {
            return this.f1914h;
        }

        public boolean e() {
            return this.l;
        }

        public String toString() {
            return "State{mTargetPosition=" + this.f1907a + ", mData=" + this.f1908b + ", mItemCount=" + this.f1912f + ", mIsMeasuring=" + this.j + ", mPreviousLayoutItemCount=" + this.f1909c + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.f1910d + ", mStructureChanged=" + this.f1913g + ", mInPreLayout=" + this.f1914h + ", mRunSimpleAnimations=" + this.k + ", mRunPredictiveAnimations=" + this.l + '}';
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = RecyclerView.this.mItemAnimator;
            if (lVar != null) {
                lVar.i();
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b0 {
        public abstract View a(v vVar, int i, int i2);
    }

    /* loaded from: classes.dex */
    static class c implements Interpolator {
        c() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f2) {
            float f3 = f2 - 1.0f;
            return (f3 * f3 * f3 * f3 * f3) + 1.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c0 implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private int f1916b;

        /* renamed from: c  reason: collision with root package name */
        private int f1917c;

        /* renamed from: d  reason: collision with root package name */
        OverScroller f1918d;

        /* renamed from: e  reason: collision with root package name */
        Interpolator f1919e = RecyclerView.sQuinticInterpolator;

        /* renamed from: f  reason: collision with root package name */
        private boolean f1920f = false;

        /* renamed from: g  reason: collision with root package name */
        private boolean f1921g = false;

        c0() {
            this.f1918d = new OverScroller(RecyclerView.this.getContext(), RecyclerView.sQuinticInterpolator);
        }

        private float a(float f2) {
            return (float) Math.sin((f2 - 0.5f) * 0.47123894f);
        }

        private int a(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((i3 * i3) + (i4 * i4));
            int sqrt2 = (int) Math.sqrt((i * i) + (i2 * i2));
            RecyclerView recyclerView = RecyclerView.this;
            int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
            int i6 = width / 2;
            float f2 = width;
            float f3 = i6;
            float a2 = f3 + (a(Math.min(1.0f, (sqrt2 * 1.0f) / f2)) * f3);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(a2 / sqrt) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((abs / f2) + 1.0f) * 300.0f);
            }
            return Math.min(i5, (int) RecyclerView.MAX_SCROLL_DURATION);
        }

        private void c() {
            RecyclerView.this.removeCallbacks(this);
            a.g.m.v.a(RecyclerView.this, this);
        }

        void a() {
            if (this.f1920f) {
                this.f1921g = true;
            } else {
                c();
            }
        }

        public void a(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.f1917c = 0;
            this.f1916b = 0;
            Interpolator interpolator = this.f1919e;
            Interpolator interpolator2 = RecyclerView.sQuinticInterpolator;
            if (interpolator != interpolator2) {
                this.f1919e = interpolator2;
                this.f1918d = new OverScroller(RecyclerView.this.getContext(), RecyclerView.sQuinticInterpolator);
            }
            this.f1918d.fling(0, 0, i, i2, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, Integer.MAX_VALUE);
            a();
        }

        public void a(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                i3 = a(i, i2, 0, 0);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.f1919e != interpolator) {
                this.f1919e = interpolator;
                this.f1918d = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.f1917c = 0;
            this.f1916b = 0;
            RecyclerView.this.setScrollState(2);
            this.f1918d.startScroll(0, 0, i, i2, i4);
            if (Build.VERSION.SDK_INT < 23) {
                this.f1918d.computeScrollOffset();
            }
            a();
        }

        public void b() {
            RecyclerView.this.removeCallbacks(this);
            this.f1918d.abortAnimation();
        }

        @Override // java.lang.Runnable
        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                b();
                return;
            }
            this.f1921g = false;
            this.f1920f = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.f1918d;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.f1916b;
                int i4 = currY - this.f1917c;
                this.f1916b = currX;
                this.f1917c = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(i3, i4, iArr, null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i2 = iArr4[0];
                    i = iArr4[1];
                    i3 -= i2;
                    i4 -= i;
                    z zVar = recyclerView4.mLayout.f1951g;
                    if (zVar != null && !zVar.d() && zVar.e()) {
                        int a2 = RecyclerView.this.mState.a();
                        if (a2 == 0) {
                            zVar.h();
                        } else {
                            if (zVar.c() >= a2) {
                                zVar.c(a2 - 1);
                            }
                            zVar.a(i2, i);
                        }
                    }
                } else {
                    i = 0;
                    i2 = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i2, i, i3, i4, null, 1, iArr5);
                int[] iArr6 = RecyclerView.this.mReusableIntPair;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (i2 != 0 || i != 0) {
                    RecyclerView.this.dispatchOnScrolled(i2, i);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                z zVar2 = RecyclerView.this.mLayout.f1951g;
                if ((zVar2 != null && zVar2.d()) || !z) {
                    a();
                    RecyclerView recyclerView6 = RecyclerView.this;
                    androidx.recyclerview.widget.e eVar = recyclerView6.mGapWorker;
                    if (eVar != null) {
                        eVar.a(recyclerView6, i2, i);
                    }
                } else {
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i7, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        RecyclerView.this.mPrefetchRegistry.a();
                    }
                }
            }
            z zVar3 = RecyclerView.this.mLayout.f1951g;
            if (zVar3 != null && zVar3.d()) {
                zVar3.a(0, 0);
            }
            this.f1920f = false;
            if (this.f1921g) {
                c();
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.stopNestedScroll(1);
        }
    }

    /* loaded from: classes.dex */
    class d implements q.b {
        d() {
        }

        @Override // androidx.recyclerview.widget.q.b
        public void a(d0 d0Var) {
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mLayout.a(d0Var.f1924a, recyclerView.mRecycler);
        }

        @Override // androidx.recyclerview.widget.q.b
        public void a(d0 d0Var, l.c cVar, l.c cVar2) {
            RecyclerView.this.animateAppearance(d0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.q.b
        public void b(d0 d0Var, l.c cVar, l.c cVar2) {
            RecyclerView.this.mRecycler.c(d0Var);
            RecyclerView.this.animateDisappearance(d0Var, cVar, cVar2);
        }

        @Override // androidx.recyclerview.widget.q.b
        public void c(d0 d0Var, l.c cVar, l.c cVar2) {
            d0Var.a(false);
            RecyclerView recyclerView = RecyclerView.this;
            boolean z = recyclerView.mDataSetHasChangedAfterLayout;
            l lVar = recyclerView.mItemAnimator;
            if (z) {
                if (!lVar.a(d0Var, d0Var, cVar, cVar2)) {
                    return;
                }
            } else if (!lVar.c(d0Var, cVar, cVar2)) {
                return;
            }
            RecyclerView.this.postAnimationRunner();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d0 {
        private static final List<Object> s = Collections.emptyList();

        /* renamed from: a  reason: collision with root package name */
        public final View f1924a;

        /* renamed from: b  reason: collision with root package name */
        WeakReference<RecyclerView> f1925b;
        int j;
        RecyclerView r;

        /* renamed from: c  reason: collision with root package name */
        int f1926c = -1;

        /* renamed from: d  reason: collision with root package name */
        int f1927d = -1;

        /* renamed from: e  reason: collision with root package name */
        long f1928e = -1;

        /* renamed from: f  reason: collision with root package name */
        int f1929f = -1;

        /* renamed from: g  reason: collision with root package name */
        int f1930g = -1;

        /* renamed from: h  reason: collision with root package name */
        d0 f1931h = null;
        d0 i = null;
        List<Object> k = null;
        List<Object> l = null;
        private int m = 0;
        v n = null;
        boolean o = false;
        private int p = 0;
        int q = -1;

        public d0(View view) {
            if (view != null) {
                this.f1924a = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void B() {
            if (this.k == null) {
                this.k = new ArrayList();
                this.l = Collections.unmodifiableList(this.k);
            }
        }

        boolean A() {
            return (this.j & 32) != 0;
        }

        void a() {
            this.f1927d = -1;
            this.f1930g = -1;
        }

        void a(int i) {
            this.j = i | this.j;
        }

        void a(int i, int i2) {
            this.j = (i & i2) | (this.j & (~i2));
        }

        void a(int i, int i2, boolean z) {
            a(8);
            a(i2, z);
            this.f1926c = i;
        }

        void a(int i, boolean z) {
            if (this.f1927d == -1) {
                this.f1927d = this.f1926c;
            }
            if (this.f1930g == -1) {
                this.f1930g = this.f1926c;
            }
            if (z) {
                this.f1930g += i;
            }
            this.f1926c += i;
            if (this.f1924a.getLayoutParams() != null) {
                ((p) this.f1924a.getLayoutParams()).f1961c = true;
            }
        }

        void a(v vVar, boolean z) {
            this.n = vVar;
            this.o = z;
        }

        void a(RecyclerView recyclerView) {
            int i = this.q;
            if (i == -1) {
                i = a.g.m.v.n(this.f1924a);
            }
            this.p = i;
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        void a(Object obj) {
            if (obj == null) {
                a(1024);
            } else if ((1024 & this.j) != 0) {
            } else {
                B();
                this.k.add(obj);
            }
        }

        public final void a(boolean z) {
            int i;
            int i2 = this.m;
            this.m = z ? i2 - 1 : i2 + 1;
            int i3 = this.m;
            if (i3 < 0) {
                this.m = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
                return;
            }
            if (!z && i3 == 1) {
                i = this.j | 16;
            } else if (!z || this.m != 0) {
                return;
            } else {
                i = this.j & (-17);
            }
            this.j = i;
        }

        void b() {
            List<Object> list = this.k;
            if (list != null) {
                list.clear();
            }
            this.j &= -1025;
        }

        void b(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.p);
            this.p = 0;
        }

        boolean b(int i) {
            return (i & this.j) != 0;
        }

        void c() {
            this.j &= -33;
        }

        void d() {
            this.j &= -257;
        }

        boolean e() {
            return (this.j & 16) == 0 && a.g.m.v.F(this.f1924a);
        }

        public final int f() {
            RecyclerView recyclerView = this.r;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionFor(this);
        }

        public final long g() {
            return this.f1928e;
        }

        public final int h() {
            return this.f1929f;
        }

        public final int i() {
            int i = this.f1930g;
            return i == -1 ? this.f1926c : i;
        }

        public final int j() {
            return this.f1927d;
        }

        List<Object> k() {
            if ((this.j & 1024) == 0) {
                List<Object> list = this.k;
                return (list == null || list.size() == 0) ? s : this.l;
            }
            return s;
        }

        boolean l() {
            return (this.j & 512) != 0 || o();
        }

        boolean m() {
            return (this.f1924a.getParent() == null || this.f1924a.getParent() == this.r) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean n() {
            return (this.j & 1) != 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean o() {
            return (this.j & 4) != 0;
        }

        public final boolean p() {
            return (this.j & 16) == 0 && !a.g.m.v.F(this.f1924a);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean q() {
            return (this.j & 8) != 0;
        }

        boolean r() {
            return this.n != null;
        }

        boolean s() {
            return (this.j & 256) != 0;
        }

        boolean t() {
            return (this.j & 2) != 0;
        }

        public String toString() {
            String simpleName = getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName();
            StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.f1926c + " id=" + this.f1928e + ", oldPos=" + this.f1927d + ", pLpos:" + this.f1930g);
            if (r()) {
                sb.append(" scrap ");
                sb.append(this.o ? "[changeScrap]" : "[attachedScrap]");
            }
            if (o()) {
                sb.append(" invalid");
            }
            if (!n()) {
                sb.append(" unbound");
            }
            if (u()) {
                sb.append(" update");
            }
            if (q()) {
                sb.append(" removed");
            }
            if (y()) {
                sb.append(" ignored");
            }
            if (s()) {
                sb.append(" tmpDetached");
            }
            if (!p()) {
                sb.append(" not recyclable(" + this.m + ")");
            }
            if (l()) {
                sb.append(" undefined adapter position");
            }
            if (this.f1924a.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        boolean u() {
            return (this.j & 2) != 0;
        }

        void v() {
            this.j = 0;
            this.f1926c = -1;
            this.f1927d = -1;
            this.f1928e = -1L;
            this.f1930g = -1;
            this.m = 0;
            this.f1931h = null;
            this.i = null;
            b();
            this.p = 0;
            this.q = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        void w() {
            if (this.f1927d == -1) {
                this.f1927d = this.f1926c;
            }
        }

        boolean x() {
            return (this.j & 16) != 0;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean y() {
            return (this.j & 128) != 0;
        }

        void z() {
            this.n.c(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements b.InterfaceC0054b {
        e() {
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0054b
        public int a() {
            return RecyclerView.this.getChildCount();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0054b
        public View a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0054b
        public void a(View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.a(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0054b
        public void a(View view, int i) {
            RecyclerView.this.addView(view, i);
            RecyclerView.this.dispatchChildAttached(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0054b
        public void a(View view, int i, ViewGroup.LayoutParams layoutParams) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                if (!childViewHolderInt.s() && !childViewHolderInt.y()) {
                    throw new IllegalArgumentException("Called attach on a child which is not detached: " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
                childViewHolderInt.d();
            }
            RecyclerView.this.attachViewToParent(view, i, layoutParams);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0054b
        public d0 b(View view) {
            return RecyclerView.getChildViewHolderInt(view);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0054b
        public void b() {
            int a2 = a();
            for (int i = 0; i < a2; i++) {
                View a3 = a(i);
                RecyclerView.this.dispatchChildDetached(a3);
                a3.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0054b
        public void b(int i) {
            d0 childViewHolderInt;
            View a2 = a(i);
            if (a2 != null && (childViewHolderInt = RecyclerView.getChildViewHolderInt(a2)) != null) {
                if (childViewHolderInt.s() && !childViewHolderInt.y()) {
                    throw new IllegalArgumentException("called detach on an already detached child " + childViewHolderInt + RecyclerView.this.exceptionLabel());
                }
                childViewHolderInt.a(256);
            }
            RecyclerView.this.detachViewFromParent(i);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0054b
        public void c(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0054b
        public void c(View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.b(RecyclerView.this);
            }
        }

        @Override // androidx.recyclerview.widget.b.InterfaceC0054b
        public int d(View view) {
            return RecyclerView.this.indexOfChild(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements a.InterfaceC0053a {
        f() {
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0053a
        public d0 a(int i) {
            d0 findViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i, true);
            if (findViewHolderForPosition != null && !RecyclerView.this.mChildHelper.c(findViewHolderForPosition.f1924a)) {
                return findViewHolderForPosition;
            }
            return null;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0053a
        public void a(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForMove(i, i2);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0053a
        public void a(int i, int i2, Object obj) {
            RecyclerView.this.viewRangeUpdate(i, i2, obj);
            RecyclerView.this.mItemsChanged = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0053a
        public void a(a.b bVar) {
            c(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0053a
        public void b(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForRemove(i, i2, false);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0053a
        public void b(a.b bVar) {
            c(bVar);
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0053a
        public void c(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForInsert(i, i2);
            RecyclerView.this.mItemsAddedOrRemoved = true;
        }

        void c(a.b bVar) {
            int i = bVar.f2031a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.a(recyclerView, bVar.f2032b, bVar.f2034d);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.mLayout.b(recyclerView2, bVar.f2032b, bVar.f2034d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.a(recyclerView3, bVar.f2032b, bVar.f2034d, bVar.f2033c);
            } else if (i != 8) {
            } else {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.mLayout.a(recyclerView4, bVar.f2032b, bVar.f2034d, 1);
            }
        }

        @Override // androidx.recyclerview.widget.a.InterfaceC0053a
        public void d(int i, int i2) {
            RecyclerView.this.offsetPositionRecordsForRemove(i, i2, true);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mItemsAddedOrRemoved = true;
            recyclerView.mState.f1910d += i2;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class g<VH extends d0> {

        /* renamed from: a  reason: collision with root package name */
        private final h f1934a = new h();

        /* renamed from: b  reason: collision with root package name */
        private boolean f1935b = false;

        public abstract int a();

        public long a(int i) {
            return -1L;
        }

        public final VH a(ViewGroup viewGroup, int i) {
            try {
                a.g.j.d.a(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH b2 = b(viewGroup, i);
                if (b2.f1924a.getParent() != null) {
                    throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                }
                b2.f1929f = i;
                return b2;
            } finally {
                a.g.j.d.a();
            }
        }

        public final void a(VH vh, int i) {
            vh.f1926c = i;
            if (c()) {
                vh.f1928e = a(i);
            }
            vh.a(1, 519);
            a.g.j.d.a(RecyclerView.TRACE_BIND_VIEW_TAG);
            a(vh, i, vh.k());
            vh.b();
            ViewGroup.LayoutParams layoutParams = vh.f1924a.getLayoutParams();
            if (layoutParams instanceof p) {
                ((p) layoutParams).f1961c = true;
            }
            a.g.j.d.a();
        }

        public void a(VH vh, int i, List<Object> list) {
            b((g<VH>) vh, i);
        }

        public void a(i iVar) {
            this.f1934a.registerObserver(iVar);
        }

        public void a(RecyclerView recyclerView) {
        }

        public void a(boolean z) {
            if (!b()) {
                this.f1935b = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public boolean a(VH vh) {
            return false;
        }

        public int b(int i) {
            return 0;
        }

        public abstract VH b(ViewGroup viewGroup, int i);

        public void b(VH vh) {
        }

        public abstract void b(VH vh, int i);

        public void b(i iVar) {
            this.f1934a.unregisterObserver(iVar);
        }

        public void b(RecyclerView recyclerView) {
        }

        public final boolean b() {
            return this.f1934a.a();
        }

        public void c(VH vh) {
        }

        public final boolean c() {
            return this.f1935b;
        }

        public final void d() {
            this.f1934a.b();
        }

        public void d(VH vh) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class h extends Observable<i> {
        h() {
        }

        public boolean a() {
            return !((Observable) this).mObservers.isEmpty();
        }

        public void b() {
            for (int size = ((Observable) this).mObservers.size() - 1; size >= 0; size--) {
                ((i) ((Observable) this).mObservers.get(size)).a();
            }
        }
    }

    /* loaded from: classes.dex */
    public static abstract class i {
        public void a() {
        }
    }

    /* loaded from: classes.dex */
    public interface j {
        int a(int i, int i2);
    }

    /* loaded from: classes.dex */
    public static class k {
        protected EdgeEffect a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    /* loaded from: classes.dex */
    public static abstract class l {

        /* renamed from: a  reason: collision with root package name */
        private b f1936a = null;

        /* renamed from: b  reason: collision with root package name */
        private ArrayList<a> f1937b = new ArrayList<>();

        /* renamed from: c  reason: collision with root package name */
        private long f1938c = 120;

        /* renamed from: d  reason: collision with root package name */
        private long f1939d = 120;

        /* renamed from: e  reason: collision with root package name */
        private long f1940e = 250;

        /* renamed from: f  reason: collision with root package name */
        private long f1941f = 250;

        /* loaded from: classes.dex */
        public interface a {
            void a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public interface b {
            void a(d0 d0Var);
        }

        /* loaded from: classes.dex */
        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public int f1942a;

            /* renamed from: b  reason: collision with root package name */
            public int f1943b;

            public c a(d0 d0Var) {
                a(d0Var, 0);
                return this;
            }

            public c a(d0 d0Var, int i) {
                View view = d0Var.f1924a;
                this.f1942a = view.getLeft();
                this.f1943b = view.getTop();
                view.getRight();
                view.getBottom();
                return this;
            }
        }

        static int e(d0 d0Var) {
            int i = d0Var.j & 14;
            if (d0Var.o()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int j = d0Var.j();
            int f2 = d0Var.f();
            return (j == -1 || f2 == -1 || j == f2) ? i : i | 2048;
        }

        public c a(a0 a0Var, d0 d0Var) {
            c h2 = h();
            h2.a(d0Var);
            return h2;
        }

        public c a(a0 a0Var, d0 d0Var, int i, List<Object> list) {
            c h2 = h();
            h2.a(d0Var);
            return h2;
        }

        public final void a() {
            int size = this.f1937b.size();
            for (int i = 0; i < size; i++) {
                this.f1937b.get(i).a();
            }
            this.f1937b.clear();
        }

        void a(b bVar) {
            this.f1936a = bVar;
        }

        public abstract boolean a(d0 d0Var);

        public abstract boolean a(d0 d0Var, d0 d0Var2, c cVar, c cVar2);

        public abstract boolean a(d0 d0Var, c cVar, c cVar2);

        public boolean a(d0 d0Var, List<Object> list) {
            return a(d0Var);
        }

        public abstract void b();

        public final void b(d0 d0Var) {
            d(d0Var);
            b bVar = this.f1936a;
            if (bVar != null) {
                bVar.a(d0Var);
            }
        }

        public abstract boolean b(d0 d0Var, c cVar, c cVar2);

        public long c() {
            return this.f1938c;
        }

        public abstract void c(d0 d0Var);

        public abstract boolean c(d0 d0Var, c cVar, c cVar2);

        public long d() {
            return this.f1941f;
        }

        public void d(d0 d0Var) {
        }

        public long e() {
            return this.f1940e;
        }

        public long f() {
            return this.f1939d;
        }

        public abstract boolean g();

        public c h() {
            return new c();
        }

        public abstract void i();
    }

    /* loaded from: classes.dex */
    private class m implements l.b {
        m() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l.b
        public void a(d0 d0Var) {
            d0Var.a(true);
            if (d0Var.f1931h != null && d0Var.i == null) {
                d0Var.f1931h = null;
            }
            d0Var.i = null;
            if (d0Var.x() || RecyclerView.this.removeAnimatingView(d0Var.f1924a) || !d0Var.s()) {
                return;
            }
            RecyclerView.this.removeDetachedView(d0Var.f1924a, false);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class n {
        @Deprecated
        public void a(Canvas canvas, RecyclerView recyclerView) {
        }

        public void a(Canvas canvas, RecyclerView recyclerView, a0 a0Var) {
            a(canvas, recyclerView);
        }

        @Deprecated
        public void a(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void a(Rect rect, View view, RecyclerView recyclerView, a0 a0Var) {
            a(rect, ((p) view.getLayoutParams()).a(), recyclerView);
        }

        @Deprecated
        public void b(Canvas canvas, RecyclerView recyclerView) {
        }

        public void b(Canvas canvas, RecyclerView recyclerView, a0 a0Var) {
            b(canvas, recyclerView);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class o {

        /* renamed from: a  reason: collision with root package name */
        androidx.recyclerview.widget.b f1945a;

        /* renamed from: b  reason: collision with root package name */
        RecyclerView f1946b;

        /* renamed from: g  reason: collision with root package name */
        z f1951g;
        int m;
        boolean n;
        private int o;
        private int p;
        private int q;
        private int r;

        /* renamed from: c  reason: collision with root package name */
        private final p.b f1947c = new a();

        /* renamed from: d  reason: collision with root package name */
        private final p.b f1948d = new b();

        /* renamed from: e  reason: collision with root package name */
        androidx.recyclerview.widget.p f1949e = new androidx.recyclerview.widget.p(this.f1947c);

        /* renamed from: f  reason: collision with root package name */
        androidx.recyclerview.widget.p f1950f = new androidx.recyclerview.widget.p(this.f1948d);

        /* renamed from: h  reason: collision with root package name */
        boolean f1952h = false;
        boolean i = false;
        boolean j = false;
        private boolean k = true;
        private boolean l = true;

        /* loaded from: classes.dex */
        class a implements p.b {
            a() {
            }

            @Override // androidx.recyclerview.widget.p.b
            public int a() {
                return o.this.r() - o.this.p();
            }

            @Override // androidx.recyclerview.widget.p.b
            public int a(View view) {
                return o.this.f(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).leftMargin;
            }

            @Override // androidx.recyclerview.widget.p.b
            public View a(int i) {
                return o.this.d(i);
            }

            @Override // androidx.recyclerview.widget.p.b
            public int b() {
                return o.this.o();
            }

            @Override // androidx.recyclerview.widget.p.b
            public int b(View view) {
                return o.this.i(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).rightMargin;
            }
        }

        /* loaded from: classes.dex */
        class b implements p.b {
            b() {
            }

            @Override // androidx.recyclerview.widget.p.b
            public int a() {
                return o.this.h() - o.this.n();
            }

            @Override // androidx.recyclerview.widget.p.b
            public int a(View view) {
                return o.this.j(view) - ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).topMargin;
            }

            @Override // androidx.recyclerview.widget.p.b
            public View a(int i) {
                return o.this.d(i);
            }

            @Override // androidx.recyclerview.widget.p.b
            public int b() {
                return o.this.q();
            }

            @Override // androidx.recyclerview.widget.p.b
            public int b(View view) {
                return o.this.e(view) + ((ViewGroup.MarginLayoutParams) ((p) view.getLayoutParams())).bottomMargin;
            }
        }

        /* loaded from: classes.dex */
        public interface c {
            void a(int i, int i2);
        }

        /* loaded from: classes.dex */
        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public int f1955a;

            /* renamed from: b  reason: collision with root package name */
            public int f1956b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f1957c;

            /* renamed from: d  reason: collision with root package name */
            public boolean f1958d;
        }

        public static int a(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            return mode != Integer.MIN_VALUE ? mode != 1073741824 ? Math.max(i2, i3) : size : Math.min(size, Math.max(i2, i3));
        }

        public static int a(int i, int i2, int i3, int i4, boolean z) {
            int i5;
            int i6 = i - i3;
            int i7 = 0;
            int max = Math.max(0, i6);
            if (z) {
                if (i4 < 0) {
                    if (i4 == -1) {
                        if (i2 == Integer.MIN_VALUE || (i2 != 0 && i2 == 1073741824)) {
                            i5 = max;
                        } else {
                            i2 = 0;
                            i5 = 0;
                        }
                        i7 = i2;
                        max = i5;
                    }
                    max = 0;
                }
                max = i4;
                i7 = 1073741824;
            } else {
                if (i4 < 0) {
                    if (i4 == -1) {
                        i7 = i2;
                    } else {
                        if (i4 == -2) {
                            if (i2 == Integer.MIN_VALUE || i2 == 1073741824) {
                                i7 = RecyclerView.UNDEFINED_DURATION;
                            }
                        }
                        max = 0;
                    }
                }
                max = i4;
                i7 = 1073741824;
            }
            return View.MeasureSpec.makeMeasureSpec(max, i7);
        }

        public static d a(Context context, AttributeSet attributeSet, int i, int i2) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.p.c.RecyclerView, i, i2);
            dVar.f1955a = obtainStyledAttributes.getInt(a.p.c.RecyclerView_android_orientation, 1);
            dVar.f1956b = obtainStyledAttributes.getInt(a.p.c.RecyclerView_spanCount, 1);
            dVar.f1957c = obtainStyledAttributes.getBoolean(a.p.c.RecyclerView_reverseLayout, false);
            dVar.f1958d = obtainStyledAttributes.getBoolean(a.p.c.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        private void a(int i, View view) {
            this.f1945a.a(i);
        }

        private void a(View view, int i, boolean z) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z || childViewHolderInt.q()) {
                this.f1946b.mViewInfoStore.a(childViewHolderInt);
            } else {
                this.f1946b.mViewInfoStore.g(childViewHolderInt);
            }
            p pVar = (p) view.getLayoutParams();
            if (childViewHolderInt.A() || childViewHolderInt.r()) {
                if (childViewHolderInt.r()) {
                    childViewHolderInt.z();
                } else {
                    childViewHolderInt.c();
                }
                this.f1945a.a(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.f1946b) {
                int b2 = this.f1945a.b(view);
                if (i == -1) {
                    i = this.f1945a.a();
                }
                if (b2 == -1) {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.f1946b.indexOfChild(view) + this.f1946b.exceptionLabel());
                } else if (b2 != i) {
                    this.f1946b.mLayout.a(b2, i);
                }
            } else {
                this.f1945a.a(view, i, false);
                pVar.f1961c = true;
                z zVar = this.f1951g;
                if (zVar != null && zVar.e()) {
                    this.f1951g.b(view);
                }
            }
            if (pVar.f1962d) {
                childViewHolderInt.f1924a.invalidate();
                pVar.f1962d = false;
            }
        }

        private void a(v vVar, int i, View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.y()) {
                return;
            }
            if (childViewHolderInt.o() && !childViewHolderInt.q() && !this.f1946b.mAdapter.c()) {
                h(i);
                vVar.b(childViewHolderInt);
                return;
            }
            b(i);
            vVar.c(view);
            this.f1946b.mViewInfoStore.d(childViewHolderInt);
        }

        private static boolean b(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 <= 0 || i == i3) {
                if (mode == Integer.MIN_VALUE) {
                    return size >= i;
                } else if (mode == 0) {
                    return true;
                } else {
                    return mode == 1073741824 && size == i;
                }
            }
            return false;
        }

        private int[] c(View view, Rect rect) {
            int[] iArr = new int[2];
            int o = o();
            int q = q();
            int r = r() - p();
            int h2 = h() - n();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i = left - o;
            int min = Math.min(0, i);
            int i2 = top - q;
            int min2 = Math.min(0, i2);
            int i3 = width - r;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height - h2);
            if (k() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        private boolean d(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int o = o();
            int q = q();
            int r = r() - p();
            int h2 = h() - n();
            Rect rect = this.f1946b.mTempRect;
            b(focusedChild, rect);
            return rect.left - i < r && rect.right - i > o && rect.top - i2 < h2 && rect.bottom - i2 > q;
        }

        public void A() {
            this.f1952h = true;
        }

        boolean B() {
            return false;
        }

        void C() {
            z zVar = this.f1951g;
            if (zVar != null) {
                zVar.h();
            }
        }

        public boolean D() {
            return false;
        }

        public int a(int i, v vVar, a0 a0Var) {
            return 0;
        }

        public int a(a0 a0Var) {
            return 0;
        }

        public int a(v vVar, a0 a0Var) {
            RecyclerView recyclerView = this.f1946b;
            if (recyclerView == null || recyclerView.mAdapter == null || !a()) {
                return 1;
            }
            return this.f1946b.mAdapter.a();
        }

        public View a(View view, int i, v vVar, a0 a0Var) {
            return null;
        }

        public p a(Context context, AttributeSet attributeSet) {
            return new p(context, attributeSet);
        }

        public p a(ViewGroup.LayoutParams layoutParams) {
            return layoutParams instanceof p ? new p((p) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new p((ViewGroup.MarginLayoutParams) layoutParams) : new p(layoutParams);
        }

        public void a(int i, int i2) {
            View d2 = d(i);
            if (d2 != null) {
                b(i);
                c(d2, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.f1946b.toString());
        }

        public void a(int i, int i2, a0 a0Var, c cVar) {
        }

        public void a(int i, c cVar) {
        }

        public void a(int i, v vVar) {
            View d2 = d(i);
            h(i);
            vVar.b(d2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(a.g.m.e0.c cVar) {
            RecyclerView recyclerView = this.f1946b;
            a(recyclerView.mRecycler, recyclerView.mState, cVar);
        }

        public void a(Rect rect, int i, int i2) {
            c(a(i, rect.width() + o() + p(), m()), a(i2, rect.height() + q() + n(), l()));
        }

        public void a(Parcelable parcelable) {
        }

        public void a(View view) {
            a(view, -1);
        }

        public void a(View view, int i) {
            a(view, i, true);
        }

        public void a(View view, int i, int i2) {
            p pVar = (p) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.f1946b.getItemDecorInsetsForChild(view);
            int i3 = i + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
            int i4 = i2 + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
            int a2 = a(r(), s(), o() + p() + ((ViewGroup.MarginLayoutParams) pVar).leftMargin + ((ViewGroup.MarginLayoutParams) pVar).rightMargin + i3, ((ViewGroup.MarginLayoutParams) pVar).width, a());
            int a3 = a(h(), i(), q() + n() + ((ViewGroup.MarginLayoutParams) pVar).topMargin + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin + i4, ((ViewGroup.MarginLayoutParams) pVar).height, b());
            if (a(view, a2, a3, pVar)) {
                view.measure(a2, a3);
            }
        }

        public void a(View view, int i, int i2, int i3, int i4) {
            p pVar = (p) view.getLayoutParams();
            Rect rect = pVar.f1960b;
            view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) pVar).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) pVar).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) pVar).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
        }

        public void a(View view, int i, p pVar) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.q()) {
                this.f1946b.mViewInfoStore.a(childViewHolderInt);
            } else {
                this.f1946b.mViewInfoStore.g(childViewHolderInt);
            }
            this.f1945a.a(view, i, pVar, childViewHolderInt.q());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(View view, a.g.m.e0.c cVar) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null || childViewHolderInt.q() || this.f1945a.c(childViewHolderInt.f1924a)) {
                return;
            }
            RecyclerView recyclerView = this.f1946b;
            a(recyclerView.mRecycler, recyclerView.mState, view, cVar);
        }

        public void a(View view, Rect rect) {
            RecyclerView recyclerView = this.f1946b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public void a(View view, v vVar) {
            o(view);
            vVar.b(view);
        }

        public void a(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((p) view.getLayoutParams()).f1960b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.f1946b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
                RectF rectF = this.f1946b.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void a(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f1946b;
            a(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        public void a(g gVar, g gVar2) {
        }

        public void a(v vVar) {
            for (int e2 = e() - 1; e2 >= 0; e2--) {
                a(vVar, e2, d(e2));
            }
        }

        public void a(v vVar, a0 a0Var, int i, int i2) {
            this.f1946b.defaultOnMeasure(i, i2);
        }

        public void a(v vVar, a0 a0Var, a.g.m.e0.c cVar) {
            if (this.f1946b.canScrollVertically(-1) || this.f1946b.canScrollHorizontally(-1)) {
                cVar.a(8192);
                cVar.m(true);
            }
            if (this.f1946b.canScrollVertically(1) || this.f1946b.canScrollHorizontally(1)) {
                cVar.a(4096);
                cVar.m(true);
            }
            cVar.a(c.b.a(b(vVar, a0Var), a(vVar, a0Var), d(vVar, a0Var), c(vVar, a0Var)));
        }

        public void a(v vVar, a0 a0Var, View view, a.g.m.e0.c cVar) {
            cVar.b(c.C0015c.a(b() ? l(view) : 0, 1, a() ? l(view) : 0, 1, false, false));
        }

        public void a(v vVar, a0 a0Var, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.f1946b;
            if (recyclerView == null || accessibilityEvent == null) {
                return;
            }
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.f1946b.canScrollVertically(-1) && !this.f1946b.canScrollHorizontally(-1) && !this.f1946b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            g gVar = this.f1946b.mAdapter;
            if (gVar == null) {
                return;
            }
            accessibilityEvent.setItemCount(gVar.a());
        }

        void a(z zVar) {
            if (this.f1951g == zVar) {
                this.f1951g = null;
            }
        }

        void a(RecyclerView recyclerView) {
            this.i = true;
            b(recyclerView);
        }

        public void a(RecyclerView recyclerView, int i, int i2) {
        }

        public void a(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public void a(RecyclerView recyclerView, int i, int i2, Object obj) {
            c(recyclerView, i, i2);
        }

        public void a(RecyclerView recyclerView, a0 a0Var, int i) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        void a(RecyclerView recyclerView, v vVar) {
            this.i = false;
            b(recyclerView, vVar);
        }

        public void a(String str) {
            RecyclerView recyclerView = this.f1946b;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public boolean a() {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean a(int i, Bundle bundle) {
            RecyclerView recyclerView = this.f1946b;
            return a(recyclerView.mRecycler, recyclerView.mState, i, bundle);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean a(View view, int i, int i2, p pVar) {
            return view.isLayoutRequested() || !this.k || !b(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) pVar).width) || !b(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) pVar).height);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean a(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.f1946b;
            return a(recyclerView.mRecycler, recyclerView.mState, view, i, bundle);
        }

        public boolean a(View view, boolean z, boolean z2) {
            boolean z3 = this.f1949e.a(view, 24579) && this.f1950f.a(view, 24579);
            return z ? z3 : !z3;
        }

        public boolean a(p pVar) {
            return pVar != null;
        }

        public boolean a(v vVar, a0 a0Var, int i, Bundle bundle) {
            int h2;
            int r;
            int i2;
            int i3;
            RecyclerView recyclerView = this.f1946b;
            if (recyclerView == null) {
                return false;
            }
            if (i == 4096) {
                h2 = recyclerView.canScrollVertically(1) ? (h() - q()) - n() : 0;
                if (this.f1946b.canScrollHorizontally(1)) {
                    r = (r() - o()) - p();
                    i2 = h2;
                    i3 = r;
                }
                i2 = h2;
                i3 = 0;
            } else if (i != 8192) {
                i3 = 0;
                i2 = 0;
            } else {
                h2 = recyclerView.canScrollVertically(-1) ? -((h() - q()) - n()) : 0;
                if (this.f1946b.canScrollHorizontally(-1)) {
                    r = -((r() - o()) - p());
                    i2 = h2;
                    i3 = r;
                }
                i2 = h2;
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            this.f1946b.smoothScrollBy(i3, i2, null, RecyclerView.UNDEFINED_DURATION, true);
            return true;
        }

        public boolean a(v vVar, a0 a0Var, View view, int i, Bundle bundle) {
            return false;
        }

        public boolean a(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return a(recyclerView, view, rect, z, false);
        }

        public boolean a(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] c2 = c(view, rect);
            int i = c2[0];
            int i2 = c2[1];
            if ((!z2 || d(recyclerView, i, i2)) && !(i == 0 && i2 == 0)) {
                if (z) {
                    recyclerView.scrollBy(i, i2);
                } else {
                    recyclerView.smoothScrollBy(i, i2);
                }
                return true;
            }
            return false;
        }

        @Deprecated
        public boolean a(RecyclerView recyclerView, View view, View view2) {
            return x() || recyclerView.isComputingLayout();
        }

        public boolean a(RecyclerView recyclerView, a0 a0Var, View view, View view2) {
            return a(recyclerView, view, view2);
        }

        public boolean a(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        public boolean a(Runnable runnable) {
            RecyclerView recyclerView = this.f1946b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public int b(int i, v vVar, a0 a0Var) {
            return 0;
        }

        public int b(a0 a0Var) {
            return 0;
        }

        public int b(v vVar, a0 a0Var) {
            RecyclerView recyclerView = this.f1946b;
            if (recyclerView == null || recyclerView.mAdapter == null || !b()) {
                return 1;
            }
            return this.f1946b.mAdapter.a();
        }

        public void b(int i) {
            a(i, d(i));
        }

        void b(int i, int i2) {
            this.q = View.MeasureSpec.getSize(i);
            this.o = View.MeasureSpec.getMode(i);
            if (this.o == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.q = 0;
            }
            this.r = View.MeasureSpec.getSize(i2);
            this.p = View.MeasureSpec.getMode(i2);
            if (this.p != 0 || RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                return;
            }
            this.r = 0;
        }

        public void b(View view) {
            b(view, -1);
        }

        public void b(View view, int i) {
            a(view, i, false);
        }

        public void b(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public void b(v vVar) {
            for (int e2 = e() - 1; e2 >= 0; e2--) {
                if (!RecyclerView.getChildViewHolderInt(d(e2)).y()) {
                    a(e2, vVar);
                }
            }
        }

        public void b(z zVar) {
            z zVar2 = this.f1951g;
            if (zVar2 != null && zVar != zVar2 && zVar2.e()) {
                this.f1951g.h();
            }
            this.f1951g = zVar;
            this.f1951g.a(this.f1946b, this);
        }

        public void b(RecyclerView recyclerView) {
        }

        public void b(RecyclerView recyclerView, int i, int i2) {
        }

        public void b(RecyclerView recyclerView, v vVar) {
            c(recyclerView);
        }

        public boolean b() {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean b(View view, int i, int i2, p pVar) {
            return !this.k || !b(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) pVar).width) || !b(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) pVar).height);
        }

        public int c(a0 a0Var) {
            return 0;
        }

        public int c(v vVar, a0 a0Var) {
            return 0;
        }

        public View c(int i) {
            int e2 = e();
            for (int i2 = 0; i2 < e2; i2++) {
                View d2 = d(i2);
                d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(d2);
                if (childViewHolderInt != null && childViewHolderInt.i() == i && !childViewHolderInt.y() && (this.f1946b.mState.d() || !childViewHolderInt.q())) {
                    return d2;
                }
            }
            return null;
        }

        public View c(View view) {
            View findContainingItemView;
            RecyclerView recyclerView = this.f1946b;
            if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.f1945a.c(findContainingItemView)) {
                return null;
            }
            return findContainingItemView;
        }

        public abstract p c();

        public void c(int i, int i2) {
            this.f1946b.setMeasuredDimension(i, i2);
        }

        public void c(View view, int i) {
            a(view, i, (p) view.getLayoutParams());
        }

        void c(v vVar) {
            int e2 = vVar.e();
            for (int i = e2 - 1; i >= 0; i--) {
                View c2 = vVar.c(i);
                d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(c2);
                if (!childViewHolderInt.y()) {
                    childViewHolderInt.a(false);
                    if (childViewHolderInt.s()) {
                        this.f1946b.removeDetachedView(c2, false);
                    }
                    l lVar = this.f1946b.mItemAnimator;
                    if (lVar != null) {
                        lVar.c(childViewHolderInt);
                    }
                    childViewHolderInt.a(true);
                    vVar.a(c2);
                }
            }
            vVar.c();
            if (e2 > 0) {
                this.f1946b.invalidate();
            }
        }

        @Deprecated
        public void c(RecyclerView recyclerView) {
        }

        public void c(RecyclerView recyclerView, int i, int i2) {
        }

        public int d() {
            return -1;
        }

        public int d(View view) {
            return ((p) view.getLayoutParams()).f1960b.bottom;
        }

        public int d(a0 a0Var) {
            return 0;
        }

        public View d(int i) {
            androidx.recyclerview.widget.b bVar = this.f1945a;
            if (bVar != null) {
                return bVar.c(i);
            }
            return null;
        }

        public View d(View view, int i) {
            return null;
        }

        void d(int i, int i2) {
            int e2 = e();
            if (e2 == 0) {
                this.f1946b.defaultOnMeasure(i, i2);
                return;
            }
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = RecyclerView.UNDEFINED_DURATION;
            int i6 = RecyclerView.UNDEFINED_DURATION;
            for (int i7 = 0; i7 < e2; i7++) {
                View d2 = d(i7);
                Rect rect = this.f1946b.mTempRect;
                b(d2, rect);
                int i8 = rect.left;
                if (i8 < i3) {
                    i3 = i8;
                }
                int i9 = rect.right;
                if (i9 > i5) {
                    i5 = i9;
                }
                int i10 = rect.top;
                if (i10 < i4) {
                    i4 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i6) {
                    i6 = i11;
                }
            }
            this.f1946b.mTempRect.set(i3, i4, i5, i6);
            a(this.f1946b.mTempRect, i, i2);
        }

        public void d(RecyclerView recyclerView) {
        }

        public boolean d(v vVar, a0 a0Var) {
            return false;
        }

        public int e() {
            androidx.recyclerview.widget.b bVar = this.f1945a;
            if (bVar != null) {
                return bVar.a();
            }
            return 0;
        }

        public int e(View view) {
            return view.getBottom() + d(view);
        }

        public int e(a0 a0Var) {
            return 0;
        }

        public void e(int i) {
            RecyclerView recyclerView = this.f1946b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i);
            }
        }

        public void e(v vVar, a0 a0Var) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        void e(RecyclerView recyclerView) {
            b(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public int f(View view) {
            return view.getLeft() - k(view);
        }

        public int f(a0 a0Var) {
            return 0;
        }

        public void f(int i) {
            RecyclerView recyclerView = this.f1946b;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i);
            }
        }

        void f(RecyclerView recyclerView) {
            int height;
            if (recyclerView == null) {
                this.f1946b = null;
                this.f1945a = null;
                height = 0;
                this.q = 0;
            } else {
                this.f1946b = recyclerView;
                this.f1945a = recyclerView.mChildHelper;
                this.q = recyclerView.getWidth();
                height = recyclerView.getHeight();
            }
            this.r = height;
            this.o = 1073741824;
            this.p = 1073741824;
        }

        public boolean f() {
            RecyclerView recyclerView = this.f1946b;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public int g(View view) {
            Rect rect = ((p) view.getLayoutParams()).f1960b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public View g() {
            View focusedChild;
            RecyclerView recyclerView = this.f1946b;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.f1945a.c(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void g(int i) {
        }

        public void g(a0 a0Var) {
        }

        public int h() {
            return this.r;
        }

        public int h(View view) {
            Rect rect = ((p) view.getLayoutParams()).f1960b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public void h(int i) {
            if (d(i) != null) {
                this.f1945a.e(i);
            }
        }

        public int i() {
            return this.p;
        }

        public int i(View view) {
            return view.getRight() + m(view);
        }

        public void i(int i) {
        }

        public int j() {
            RecyclerView recyclerView = this.f1946b;
            g adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.a();
            }
            return 0;
        }

        public int j(View view) {
            return view.getTop() - n(view);
        }

        public int k() {
            return a.g.m.v.p(this.f1946b);
        }

        public int k(View view) {
            return ((p) view.getLayoutParams()).f1960b.left;
        }

        public int l() {
            return a.g.m.v.q(this.f1946b);
        }

        public int l(View view) {
            return ((p) view.getLayoutParams()).a();
        }

        public int m() {
            return a.g.m.v.r(this.f1946b);
        }

        public int m(View view) {
            return ((p) view.getLayoutParams()).f1960b.right;
        }

        public int n() {
            RecyclerView recyclerView = this.f1946b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int n(View view) {
            return ((p) view.getLayoutParams()).f1960b.top;
        }

        public int o() {
            RecyclerView recyclerView = this.f1946b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void o(View view) {
            this.f1945a.d(view);
        }

        public int p() {
            RecyclerView recyclerView = this.f1946b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int q() {
            RecyclerView recyclerView = this.f1946b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int r() {
            return this.q;
        }

        public int s() {
            return this.o;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public boolean t() {
            int e2 = e();
            for (int i = 0; i < e2; i++) {
                ViewGroup.LayoutParams layoutParams = d(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean u() {
            return this.i;
        }

        public boolean v() {
            return this.j;
        }

        public final boolean w() {
            return this.l;
        }

        public boolean x() {
            z zVar = this.f1951g;
            return zVar != null && zVar.e();
        }

        public Parcelable y() {
            return null;
        }

        public void z() {
            RecyclerView recyclerView = this.f1946b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class p extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        d0 f1959a;

        /* renamed from: b  reason: collision with root package name */
        final Rect f1960b;

        /* renamed from: c  reason: collision with root package name */
        boolean f1961c;

        /* renamed from: d  reason: collision with root package name */
        boolean f1962d;

        public p(int i, int i2) {
            super(i, i2);
            this.f1960b = new Rect();
            this.f1961c = true;
            this.f1962d = false;
        }

        public p(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1960b = new Rect();
            this.f1961c = true;
            this.f1962d = false;
        }

        public p(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1960b = new Rect();
            this.f1961c = true;
            this.f1962d = false;
        }

        public p(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1960b = new Rect();
            this.f1961c = true;
            this.f1962d = false;
        }

        public p(p pVar) {
            super((ViewGroup.LayoutParams) pVar);
            this.f1960b = new Rect();
            this.f1961c = true;
            this.f1962d = false;
        }

        public int a() {
            return this.f1959a.i();
        }

        public boolean b() {
            return this.f1959a.t();
        }

        public boolean c() {
            return this.f1959a.q();
        }

        public boolean d() {
            return this.f1959a.o();
        }
    }

    /* loaded from: classes.dex */
    public interface q {
        void a(View view);

        void b(View view);
    }

    /* loaded from: classes.dex */
    public static abstract class r {
        public abstract boolean a(int i, int i2);
    }

    /* loaded from: classes.dex */
    public interface s {
        void a(boolean z);

        boolean a(RecyclerView recyclerView, MotionEvent motionEvent);

        void b(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    /* loaded from: classes.dex */
    public static abstract class t {
        public void a(RecyclerView recyclerView, int i) {
        }

        public void a(RecyclerView recyclerView, int i, int i2) {
        }
    }

    /* loaded from: classes.dex */
    public static class u {

        /* renamed from: a  reason: collision with root package name */
        SparseArray<a> f1963a = new SparseArray<>();

        /* renamed from: b  reason: collision with root package name */
        private int f1964b = 0;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            final ArrayList<d0> f1965a = new ArrayList<>();

            /* renamed from: b  reason: collision with root package name */
            int f1966b = 5;

            /* renamed from: c  reason: collision with root package name */
            long f1967c = 0;

            /* renamed from: d  reason: collision with root package name */
            long f1968d = 0;

            a() {
            }
        }

        private a b(int i) {
            a aVar = this.f1963a.get(i);
            if (aVar == null) {
                a aVar2 = new a();
                this.f1963a.put(i, aVar2);
                return aVar2;
            }
            return aVar;
        }

        long a(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        public d0 a(int i) {
            a aVar = this.f1963a.get(i);
            if (aVar == null || aVar.f1965a.isEmpty()) {
                return null;
            }
            ArrayList<d0> arrayList = aVar.f1965a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).m()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        void a() {
            this.f1964b++;
        }

        void a(int i, long j) {
            a b2 = b(i);
            b2.f1968d = a(b2.f1968d, j);
        }

        public void a(d0 d0Var) {
            int h2 = d0Var.h();
            ArrayList<d0> arrayList = b(h2).f1965a;
            if (this.f1963a.get(h2).f1966b <= arrayList.size()) {
                return;
            }
            d0Var.v();
            arrayList.add(d0Var);
        }

        void a(g gVar, g gVar2, boolean z) {
            if (gVar != null) {
                c();
            }
            if (!z && this.f1964b == 0) {
                b();
            }
            if (gVar2 != null) {
                a();
            }
        }

        boolean a(int i, long j, long j2) {
            long j3 = b(i).f1968d;
            return j3 == 0 || j + j3 < j2;
        }

        public void b() {
            for (int i = 0; i < this.f1963a.size(); i++) {
                this.f1963a.valueAt(i).f1965a.clear();
            }
        }

        void b(int i, long j) {
            a b2 = b(i);
            b2.f1967c = a(b2.f1967c, j);
        }

        boolean b(int i, long j, long j2) {
            long j3 = b(i).f1967c;
            return j3 == 0 || j + j3 < j2;
        }

        void c() {
            this.f1964b--;
        }
    }

    /* loaded from: classes.dex */
    public final class v {

        /* renamed from: a  reason: collision with root package name */
        final ArrayList<d0> f1969a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        ArrayList<d0> f1970b = null;

        /* renamed from: c  reason: collision with root package name */
        final ArrayList<d0> f1971c = new ArrayList<>();

        /* renamed from: d  reason: collision with root package name */
        private final List<d0> f1972d = Collections.unmodifiableList(this.f1969a);

        /* renamed from: e  reason: collision with root package name */
        private int f1973e = 2;

        /* renamed from: f  reason: collision with root package name */
        int f1974f = 2;

        /* renamed from: g  reason: collision with root package name */
        u f1975g;

        /* renamed from: h  reason: collision with root package name */
        private b0 f1976h;

        public v() {
        }

        private void a(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    a((ViewGroup) childAt, true);
                }
            }
            if (!z) {
                return;
            }
            if (viewGroup.getVisibility() == 4) {
                viewGroup.setVisibility(0);
                viewGroup.setVisibility(4);
                return;
            }
            int visibility = viewGroup.getVisibility();
            viewGroup.setVisibility(4);
            viewGroup.setVisibility(visibility);
        }

        private boolean a(d0 d0Var, int i, int i2, long j) {
            d0Var.r = RecyclerView.this;
            int h2 = d0Var.h();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j == RecyclerView.FOREVER_NS || this.f1975g.a(h2, nanoTime, j)) {
                RecyclerView.this.mAdapter.a((g) d0Var, i);
                this.f1975g.a(d0Var.h(), RecyclerView.this.getNanoTime() - nanoTime);
                e(d0Var);
                if (!RecyclerView.this.mState.d()) {
                    return true;
                }
                d0Var.f1930g = i2;
                return true;
            }
            return false;
        }

        private void e(d0 d0Var) {
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = d0Var.f1924a;
                if (a.g.m.v.n(view) == 0) {
                    a.g.m.v.h(view, 1);
                }
                androidx.recyclerview.widget.l lVar = RecyclerView.this.mAccessibilityDelegate;
                if (lVar == null) {
                    return;
                }
                a.g.m.a b2 = lVar.b();
                if (b2 instanceof l.a) {
                    ((l.a) b2).d(view);
                }
                a.g.m.v.a(view, b2);
            }
        }

        private void f(d0 d0Var) {
            View view = d0Var.f1924a;
            if (view instanceof ViewGroup) {
                a((ViewGroup) view, false);
            }
        }

        public int a(int i) {
            if (i >= 0 && i < RecyclerView.this.mState.a()) {
                return !RecyclerView.this.mState.d() ? i : RecyclerView.this.mAdapterHelper.b(i);
            }
            throw new IndexOutOfBoundsException("invalid position " + i + ". State item count is " + RecyclerView.this.mState.a() + RecyclerView.this.exceptionLabel());
        }

        d0 a(int i, boolean z) {
            View b2;
            int size = this.f1969a.size();
            for (int i2 = 0; i2 < size; i2++) {
                d0 d0Var = this.f1969a.get(i2);
                if (!d0Var.A() && d0Var.i() == i && !d0Var.o() && (RecyclerView.this.mState.f1914h || !d0Var.q())) {
                    d0Var.a(32);
                    return d0Var;
                }
            }
            if (z || (b2 = RecyclerView.this.mChildHelper.b(i)) == null) {
                int size2 = this.f1971c.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    d0 d0Var2 = this.f1971c.get(i3);
                    if (!d0Var2.o() && d0Var2.i() == i && !d0Var2.m()) {
                        if (!z) {
                            this.f1971c.remove(i3);
                        }
                        return d0Var2;
                    }
                }
                return null;
            }
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(b2);
            RecyclerView.this.mChildHelper.f(b2);
            int b3 = RecyclerView.this.mChildHelper.b(b2);
            if (b3 != -1) {
                RecyclerView.this.mChildHelper.a(b3);
                c(b2);
                childViewHolderInt.a(8224);
                return childViewHolderInt;
            }
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + childViewHolderInt + RecyclerView.this.exceptionLabel());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Removed duplicated region for block: B:100:0x020b  */
        /* JADX WARN: Removed duplicated region for block: B:106:0x0220 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0184  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x01a1  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x01c4  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x01d3  */
        /* JADX WARN: Removed duplicated region for block: B:98:0x01fd  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.recyclerview.widget.RecyclerView.d0 a(int r17, boolean r18, long r19) {
            /*
                Method dump skipped, instructions count: 607
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.v.a(int, boolean, long):androidx.recyclerview.widget.RecyclerView$d0");
        }

        d0 a(long j, int i, boolean z) {
            for (int size = this.f1969a.size() - 1; size >= 0; size--) {
                d0 d0Var = this.f1969a.get(size);
                if (d0Var.g() == j && !d0Var.A()) {
                    if (i == d0Var.h()) {
                        d0Var.a(32);
                        if (d0Var.q() && !RecyclerView.this.mState.d()) {
                            d0Var.a(2, 14);
                        }
                        return d0Var;
                    } else if (!z) {
                        this.f1969a.remove(size);
                        RecyclerView.this.removeDetachedView(d0Var.f1924a, false);
                        a(d0Var.f1924a);
                    }
                }
            }
            int size2 = this.f1971c.size();
            while (true) {
                size2--;
                if (size2 >= 0) {
                    d0 d0Var2 = this.f1971c.get(size2);
                    if (d0Var2.g() == j && !d0Var2.m()) {
                        if (i == d0Var2.h()) {
                            if (!z) {
                                this.f1971c.remove(size2);
                            }
                            return d0Var2;
                        } else if (!z) {
                            e(size2);
                            return null;
                        }
                    }
                } else {
                    return null;
                }
            }
        }

        public void a() {
            this.f1969a.clear();
            i();
        }

        void a(int i, int i2) {
            int size = this.f1971c.size();
            for (int i3 = 0; i3 < size; i3++) {
                d0 d0Var = this.f1971c.get(i3);
                if (d0Var != null && d0Var.f1926c >= i) {
                    d0Var.a(i2, true);
                }
            }
        }

        void a(int i, int i2, boolean z) {
            int i3 = i + i2;
            for (int size = this.f1971c.size() - 1; size >= 0; size--) {
                d0 d0Var = this.f1971c.get(size);
                if (d0Var != null) {
                    int i4 = d0Var.f1926c;
                    if (i4 >= i3) {
                        d0Var.a(-i2, z);
                    } else if (i4 >= i) {
                        d0Var.a(8);
                        e(size);
                    }
                }
            }
        }

        void a(View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.n = null;
            childViewHolderInt.o = false;
            childViewHolderInt.c();
            b(childViewHolderInt);
        }

        void a(b0 b0Var) {
            this.f1976h = b0Var;
        }

        void a(d0 d0Var) {
            w wVar = RecyclerView.this.mRecyclerListener;
            if (wVar != null) {
                wVar.a(d0Var);
            }
            g gVar = RecyclerView.this.mAdapter;
            if (gVar != null) {
                gVar.d(d0Var);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mState != null) {
                recyclerView.mViewInfoStore.h(d0Var);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void a(d0 d0Var, boolean z) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(d0Var);
            View view = d0Var.f1924a;
            androidx.recyclerview.widget.l lVar = RecyclerView.this.mAccessibilityDelegate;
            if (lVar != null) {
                a.g.m.a b2 = lVar.b();
                a.g.m.v.a(view, b2 instanceof l.a ? ((l.a) b2).c(view) : null);
            }
            if (z) {
                a(d0Var);
            }
            d0Var.r = null;
            d().a(d0Var);
        }

        void a(g gVar, g gVar2, boolean z) {
            a();
            d().a(gVar, gVar2, z);
        }

        void a(u uVar) {
            u uVar2 = this.f1975g;
            if (uVar2 != null) {
                uVar2.c();
            }
            this.f1975g = uVar;
            if (this.f1975g == null || RecyclerView.this.getAdapter() == null) {
                return;
            }
            this.f1975g.a();
        }

        View b(int i, boolean z) {
            return a(i, z, RecyclerView.FOREVER_NS).f1924a;
        }

        d0 b(int i) {
            int size;
            int b2;
            ArrayList<d0> arrayList = this.f1970b;
            if (arrayList != null && (size = arrayList.size()) != 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    d0 d0Var = this.f1970b.get(i2);
                    if (!d0Var.A() && d0Var.i() == i) {
                        d0Var.a(32);
                        return d0Var;
                    }
                }
                if (RecyclerView.this.mAdapter.c() && (b2 = RecyclerView.this.mAdapterHelper.b(i)) > 0 && b2 < RecyclerView.this.mAdapter.a()) {
                    long a2 = RecyclerView.this.mAdapter.a(b2);
                    for (int i3 = 0; i3 < size; i3++) {
                        d0 d0Var2 = this.f1970b.get(i3);
                        if (!d0Var2.A() && d0Var2.g() == a2) {
                            d0Var2.a(32);
                            return d0Var2;
                        }
                    }
                }
            }
            return null;
        }

        void b() {
            int size = this.f1971c.size();
            for (int i = 0; i < size; i++) {
                this.f1971c.get(i).a();
            }
            int size2 = this.f1969a.size();
            for (int i2 = 0; i2 < size2; i2++) {
                this.f1969a.get(i2).a();
            }
            ArrayList<d0> arrayList = this.f1970b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    this.f1970b.get(i3).a();
                }
            }
        }

        void b(int i, int i2) {
            int i3;
            int i4;
            int i5;
            int i6;
            if (i < i2) {
                i4 = i;
                i3 = i2;
                i5 = -1;
            } else {
                i3 = i;
                i4 = i2;
                i5 = 1;
            }
            int size = this.f1971c.size();
            for (int i7 = 0; i7 < size; i7++) {
                d0 d0Var = this.f1971c.get(i7);
                if (d0Var != null && (i6 = d0Var.f1926c) >= i4 && i6 <= i3) {
                    if (i6 == i) {
                        d0Var.a(i2 - i, false);
                    } else {
                        d0Var.a(i5, false);
                    }
                }
            }
        }

        public void b(View view) {
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.s()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.r()) {
                childViewHolderInt.z();
            } else if (childViewHolderInt.A()) {
                childViewHolderInt.c();
            }
            b(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator == null || childViewHolderInt.p()) {
                return;
            }
            RecyclerView.this.mItemAnimator.c(childViewHolderInt);
        }

        void b(d0 d0Var) {
            boolean z;
            boolean z2 = false;
            if (d0Var.r() || d0Var.f1924a.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(d0Var.r());
                sb.append(" isAttached:");
                if (d0Var.f1924a.getParent() != null) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append(RecyclerView.this.exceptionLabel());
                throw new IllegalArgumentException(sb.toString());
            } else if (d0Var.s()) {
                throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + d0Var + RecyclerView.this.exceptionLabel());
            } else if (d0Var.y()) {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + RecyclerView.this.exceptionLabel());
            } else {
                boolean e2 = d0Var.e();
                g gVar = RecyclerView.this.mAdapter;
                if ((gVar != null && e2 && gVar.a((g) d0Var)) || d0Var.p()) {
                    if (this.f1974f <= 0 || d0Var.b(526)) {
                        z = false;
                    } else {
                        int size = this.f1971c.size();
                        if (size >= this.f1974f && size > 0) {
                            e(0);
                            size--;
                        }
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.a(d0Var.f1926c)) {
                            int i = size - 1;
                            while (i >= 0) {
                                if (!RecyclerView.this.mPrefetchRegistry.a(this.f1971c.get(i).f1926c)) {
                                    break;
                                }
                                i--;
                            }
                            size = i + 1;
                        }
                        this.f1971c.add(size, d0Var);
                        z = true;
                    }
                    if (!z) {
                        a(d0Var, true);
                        z2 = true;
                    }
                } else {
                    z = false;
                }
                RecyclerView.this.mViewInfoStore.h(d0Var);
                if (z || z2 || !e2) {
                    return;
                }
                d0Var.r = null;
            }
        }

        View c(int i) {
            return this.f1969a.get(i).f1924a;
        }

        void c() {
            this.f1969a.clear();
            ArrayList<d0> arrayList = this.f1970b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        void c(int i, int i2) {
            int i3;
            int i4 = i2 + i;
            for (int size = this.f1971c.size() - 1; size >= 0; size--) {
                d0 d0Var = this.f1971c.get(size);
                if (d0Var != null && (i3 = d0Var.f1926c) >= i && i3 < i4) {
                    d0Var.a(2);
                    e(size);
                }
            }
        }

        void c(View view) {
            ArrayList<d0> arrayList;
            d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.b(12) && childViewHolderInt.t() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.f1970b == null) {
                    this.f1970b = new ArrayList<>();
                }
                childViewHolderInt.a(this, true);
                arrayList = this.f1970b;
            } else if (childViewHolderInt.o() && !childViewHolderInt.q() && !RecyclerView.this.mAdapter.c()) {
                throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + RecyclerView.this.exceptionLabel());
            } else {
                childViewHolderInt.a(this, false);
                arrayList = this.f1969a;
            }
            arrayList.add(childViewHolderInt);
        }

        void c(d0 d0Var) {
            (d0Var.o ? this.f1970b : this.f1969a).remove(d0Var);
            d0Var.n = null;
            d0Var.o = false;
            d0Var.c();
        }

        public View d(int i) {
            return b(i, false);
        }

        u d() {
            if (this.f1975g == null) {
                this.f1975g = new u();
            }
            return this.f1975g;
        }

        boolean d(d0 d0Var) {
            if (d0Var.q()) {
                return RecyclerView.this.mState.d();
            }
            int i = d0Var.f1926c;
            if (i >= 0 && i < RecyclerView.this.mAdapter.a()) {
                if (!RecyclerView.this.mState.d() && RecyclerView.this.mAdapter.b(d0Var.f1926c) != d0Var.h()) {
                    return false;
                }
                return !RecyclerView.this.mAdapter.c() || d0Var.g() == RecyclerView.this.mAdapter.a(d0Var.f1926c);
            }
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + d0Var + RecyclerView.this.exceptionLabel());
        }

        int e() {
            return this.f1969a.size();
        }

        void e(int i) {
            a(this.f1971c.get(i), true);
            this.f1971c.remove(i);
        }

        public List<d0> f() {
            return this.f1972d;
        }

        public void f(int i) {
            this.f1973e = i;
            j();
        }

        void g() {
            int size = this.f1971c.size();
            for (int i = 0; i < size; i++) {
                p pVar = (p) this.f1971c.get(i).f1924a.getLayoutParams();
                if (pVar != null) {
                    pVar.f1961c = true;
                }
            }
        }

        void h() {
            int size = this.f1971c.size();
            for (int i = 0; i < size; i++) {
                d0 d0Var = this.f1971c.get(i);
                if (d0Var != null) {
                    d0Var.a(6);
                    d0Var.a((Object) null);
                }
            }
            g gVar = RecyclerView.this.mAdapter;
            if (gVar == null || !gVar.c()) {
                i();
            }
        }

        void i() {
            for (int size = this.f1971c.size() - 1; size >= 0; size--) {
                e(size);
            }
            this.f1971c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                RecyclerView.this.mPrefetchRegistry.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void j() {
            o oVar = RecyclerView.this.mLayout;
            this.f1974f = this.f1973e + (oVar != null ? oVar.m : 0);
            for (int size = this.f1971c.size() - 1; size >= 0 && this.f1971c.size() > this.f1974f; size--) {
                e(size);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface w {
        void a(d0 d0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class x extends i {
        x() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.i
        public void a() {
            RecyclerView.this.assertNotInLayoutOrScroll(null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.f1913g = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (!RecyclerView.this.mAdapterHelper.c()) {
                RecyclerView.this.requestLayout();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class y extends a.i.a.a {
        public static final Parcelable.Creator<y> CREATOR = new a();

        /* renamed from: d  reason: collision with root package name */
        Parcelable f1978d;

        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator<y> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: createFromParcel */
            public y mo77createFromParcel(Parcel parcel) {
                return new y(parcel, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: createFromParcel */
            public y mo78createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new y(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: newArray */
            public y[] mo79newArray(int i) {
                return new y[i];
            }
        }

        y(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1978d = parcel.readParcelable(classLoader == null ? o.class.getClassLoader() : classLoader);
        }

        y(Parcelable parcelable) {
            super(parcelable);
        }

        void a(y yVar) {
            this.f1978d = yVar.f1978d;
        }

        @Override // a.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.f1978d, 0);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class z {

        /* renamed from: b  reason: collision with root package name */
        private RecyclerView f1980b;

        /* renamed from: c  reason: collision with root package name */
        private o f1981c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f1982d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f1983e;

        /* renamed from: f  reason: collision with root package name */
        private View f1984f;

        /* renamed from: h  reason: collision with root package name */
        private boolean f1986h;

        /* renamed from: a  reason: collision with root package name */
        private int f1979a = -1;

        /* renamed from: g  reason: collision with root package name */
        private final a f1985g = new a(0, 0);

        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a  reason: collision with root package name */
            private int f1987a;

            /* renamed from: b  reason: collision with root package name */
            private int f1988b;

            /* renamed from: c  reason: collision with root package name */
            private int f1989c;

            /* renamed from: d  reason: collision with root package name */
            private int f1990d;

            /* renamed from: e  reason: collision with root package name */
            private Interpolator f1991e;

            /* renamed from: f  reason: collision with root package name */
            private boolean f1992f;

            /* renamed from: g  reason: collision with root package name */
            private int f1993g;

            public a(int i, int i2) {
                this(i, i2, RecyclerView.UNDEFINED_DURATION, null);
            }

            public a(int i, int i2, int i3, Interpolator interpolator) {
                this.f1990d = -1;
                this.f1992f = false;
                this.f1993g = 0;
                this.f1987a = i;
                this.f1988b = i2;
                this.f1989c = i3;
                this.f1991e = interpolator;
            }

            private void b() {
                if (this.f1991e == null || this.f1989c >= 1) {
                    if (this.f1989c < 1) {
                        throw new IllegalStateException("Scroll duration must be a positive number");
                    }
                    return;
                }
                throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
            }

            public void a(int i) {
                this.f1990d = i;
            }

            public void a(int i, int i2, int i3, Interpolator interpolator) {
                this.f1987a = i;
                this.f1988b = i2;
                this.f1989c = i3;
                this.f1991e = interpolator;
                this.f1992f = true;
            }

            void a(RecyclerView recyclerView) {
                int i = this.f1990d;
                if (i >= 0) {
                    this.f1990d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i);
                    this.f1992f = false;
                } else if (!this.f1992f) {
                    this.f1993g = 0;
                } else {
                    b();
                    recyclerView.mViewFlinger.a(this.f1987a, this.f1988b, this.f1989c, this.f1991e);
                    this.f1993g++;
                    if (this.f1993g > 10) {
                        Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f1992f = false;
                }
            }

            boolean a() {
                return this.f1990d >= 0;
            }
        }

        /* loaded from: classes.dex */
        public interface b {
            PointF a(int i);
        }

        public int a() {
            return this.f1980b.mLayout.e();
        }

        public int a(View view) {
            return this.f1980b.getChildLayoutPosition(view);
        }

        public PointF a(int i) {
            o b2 = b();
            if (b2 instanceof b) {
                return ((b) b2).a(i);
            }
            Log.w(RecyclerView.TAG, "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + b.class.getCanonicalName());
            return null;
        }

        void a(int i, int i2) {
            PointF a2;
            RecyclerView recyclerView = this.f1980b;
            if (this.f1979a == -1 || recyclerView == null) {
                h();
            }
            if (this.f1982d && this.f1984f == null && this.f1981c != null && (a2 = a(this.f1979a)) != null && (a2.x != 0.0f || a2.y != 0.0f)) {
                recyclerView.scrollStep((int) Math.signum(a2.x), (int) Math.signum(a2.y), null);
            }
            this.f1982d = false;
            View view = this.f1984f;
            if (view != null) {
                if (a(view) == this.f1979a) {
                    a(this.f1984f, recyclerView.mState, this.f1985g);
                    this.f1985g.a(recyclerView);
                    h();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.f1984f = null;
                }
            }
            if (this.f1983e) {
                a(i, i2, recyclerView.mState, this.f1985g);
                boolean a3 = this.f1985g.a();
                this.f1985g.a(recyclerView);
                if (!a3 || !this.f1983e) {
                    return;
                }
                this.f1982d = true;
                recyclerView.mViewFlinger.a();
            }
        }

        protected abstract void a(int i, int i2, a0 a0Var, a aVar);

        /* JADX INFO: Access modifiers changed from: protected */
        public void a(PointF pointF) {
            float f2 = pointF.x;
            float f3 = pointF.y;
            float sqrt = (float) Math.sqrt((f2 * f2) + (f3 * f3));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }

        protected abstract void a(View view, a0 a0Var, a aVar);

        void a(RecyclerView recyclerView, o oVar) {
            recyclerView.mViewFlinger.b();
            if (this.f1986h) {
                Log.w(RecyclerView.TAG, "An instance of " + getClass().getSimpleName() + " was started more than once. Each instance of" + getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
            }
            this.f1980b = recyclerView;
            this.f1981c = oVar;
            int i = this.f1979a;
            if (i != -1) {
                this.f1980b.mState.f1907a = i;
                this.f1983e = true;
                this.f1982d = true;
                this.f1984f = b(c());
                f();
                this.f1980b.mViewFlinger.a();
                this.f1986h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public View b(int i) {
            return this.f1980b.mLayout.c(i);
        }

        public o b() {
            return this.f1981c;
        }

        protected void b(View view) {
            if (a(view) == c()) {
                this.f1984f = view;
            }
        }

        public int c() {
            return this.f1979a;
        }

        public void c(int i) {
            this.f1979a = i;
        }

        public boolean d() {
            return this.f1982d;
        }

        public boolean e() {
            return this.f1983e;
        }

        protected abstract void f();

        protected abstract void g();

        /* JADX INFO: Access modifiers changed from: protected */
        public final void h() {
            if (!this.f1983e) {
                return;
            }
            this.f1983e = false;
            g();
            this.f1980b.mState.f1907a = -1;
            this.f1984f = null;
            this.f1979a = -1;
            this.f1982d = false;
            this.f1981c.a(this);
            this.f1981c = null;
            this.f1980b = null;
        }
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        FORCE_INVALIDATE_DISPLAY_LIST = i2 == 18 || i2 == 19 || i2 == 20;
        ALLOW_SIZE_IN_UNSPECIFIED_SPEC = Build.VERSION.SDK_INT >= 23;
        POST_UPDATES_ON_ANIMATION = Build.VERSION.SDK_INT >= 16;
        ALLOW_THREAD_GAP_WORK = Build.VERSION.SDK_INT >= 21;
        FORCE_ABS_FOCUS_SEARCH_DIRECTION = Build.VERSION.SDK_INT <= 15;
        IGNORE_DETACHED_FOCUSED_CHILD = Build.VERSION.SDK_INT <= 15;
        Class<?> cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new c();
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.p.a.recyclerViewStyle);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.mObserver = new x();
        this.mRecycler = new v();
        this.mViewInfoStore = new androidx.recyclerview.widget.q();
        this.mUpdateChildViewsRunnable = new a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new k();
        this.mItemAnimator = new androidx.recyclerview.widget.c();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        boolean z2 = true;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new c0();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new e.b() : null;
        this.mState = new a0();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new m();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new b();
        this.mViewInfoProcessCallback = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = a.g.m.w.b(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = a.g.m.w.c(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.a(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (a.g.m.v.n(this) == 0) {
            a.g.m.v.h(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new androidx.recyclerview.widget.l(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.p.c.RecyclerView, i2, 0);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, a.p.c.RecyclerView, attributeSet, obtainStyledAttributes, i2, 0);
        }
        String string = obtainStyledAttributes.getString(a.p.c.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(a.p.c.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(a.p.c.RecyclerView_android_clipToPadding, true);
        this.mEnableFastScroller = obtainStyledAttributes.getBoolean(a.p.c.RecyclerView_fastScrollEnabled, false);
        if (this.mEnableFastScroller) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(a.p.c.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes.getDrawable(a.p.c.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes.getDrawable(a.p.c.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes.getDrawable(a.p.c.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i2, 0);
        if (Build.VERSION.SDK_INT >= 21) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, NESTED_SCROLLING_ATTRS, i2, 0);
            if (Build.VERSION.SDK_INT >= 29) {
                saveAttributeDataForStyleable(context, NESTED_SCROLLING_ATTRS, attributeSet, obtainStyledAttributes2, i2, 0);
            }
            z2 = obtainStyledAttributes2.getBoolean(0, true);
            obtainStyledAttributes2.recycle();
        }
        setNestedScrollingEnabled(z2);
    }

    private void addAnimatingView(d0 d0Var) {
        View view = d0Var.f1924a;
        boolean z2 = view.getParent() == this;
        this.mRecycler.c(getChildViewHolder(view));
        if (d0Var.s()) {
            this.mChildHelper.a(view, -1, view.getLayoutParams(), true);
            return;
        }
        androidx.recyclerview.widget.b bVar = this.mChildHelper;
        if (!z2) {
            bVar.a(view, true);
        } else {
            bVar.a(view);
        }
    }

    private void animateChange(d0 d0Var, d0 d0Var2, l.c cVar, l.c cVar2, boolean z2, boolean z3) {
        d0Var.a(false);
        if (z2) {
            addAnimatingView(d0Var);
        }
        if (d0Var != d0Var2) {
            if (z3) {
                addAnimatingView(d0Var2);
            }
            d0Var.f1931h = d0Var2;
            addAnimatingView(d0Var);
            this.mRecycler.c(d0Var);
            d0Var2.a(false);
            d0Var2.i = d0Var;
        }
        if (this.mItemAnimator.a(d0Var, d0Var2, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    static void clearNestedRecyclerViewIfNotNested(d0 d0Var) {
        WeakReference<RecyclerView> weakReference = d0Var.f1925b;
        if (weakReference != null) {
            ViewParent viewParent = weakReference.get();
            while (true) {
                for (View view = (View) viewParent; view != null; view = null) {
                    if (view == d0Var.f1924a) {
                        return;
                    }
                    viewParent = view.getParent();
                    if (viewParent instanceof View) {
                        break;
                    }
                }
                d0Var.f1925b = null;
                return;
            }
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i2, int i3) {
        Constructor constructor;
        if (str != null) {
            String trim = str.trim();
            if (trim.isEmpty()) {
                return;
            }
            String fullClassName = getFullClassName(context, trim);
            try {
                Class<? extends U> asSubclass = Class.forName(fullClassName, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(o.class);
                Object[] objArr = null;
                try {
                    constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                    objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), Integer.valueOf(i3)};
                } catch (NoSuchMethodException e2) {
                    try {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    } catch (NoSuchMethodException e3) {
                        e3.initCause(e2);
                        throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e3);
                    }
                }
                constructor.setAccessible(true);
                setLayoutManager((o) constructor.newInstance(objArr));
            } catch (ClassCastException e4) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e4);
            } catch (ClassNotFoundException e5) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e5);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e6);
            } catch (InstantiationException e7) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e8);
            }
        }
    }

    private boolean didChildRangeChange(int i2, int i3) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i2 && iArr[1] == i3) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i2 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i2 == 0 || !isAccessibilityEnabled()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain();
        obtain.setEventType(2048);
        a.g.m.e0.b.a(obtain, i2);
        sendAccessibilityEventUnchecked(obtain);
    }

    private void dispatchLayoutStep1() {
        boolean z2 = true;
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.j = false;
        startInterceptRequestLayout();
        this.mViewInfoStore.a();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        a0 a0Var = this.mState;
        if (!a0Var.k || !this.mItemsChanged) {
            z2 = false;
        }
        a0Var.i = z2;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        a0 a0Var2 = this.mState;
        a0Var2.f1914h = a0Var2.l;
        a0Var2.f1912f = this.mAdapter.a();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.k) {
            int a2 = this.mChildHelper.a();
            for (int i2 = 0; i2 < a2; i2++) {
                d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.c(i2));
                if (!childViewHolderInt.y() && (!childViewHolderInt.o() || this.mAdapter.c())) {
                    this.mViewInfoStore.c(childViewHolderInt, this.mItemAnimator.a(this.mState, childViewHolderInt, l.e(childViewHolderInt), childViewHolderInt.k()));
                    if (this.mState.i && childViewHolderInt.t() && !childViewHolderInt.q() && !childViewHolderInt.y() && !childViewHolderInt.o()) {
                        this.mViewInfoStore.a(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.l) {
            saveOldPositions();
            a0 a0Var3 = this.mState;
            boolean z3 = a0Var3.f1913g;
            a0Var3.f1913g = false;
            this.mLayout.e(this.mRecycler, a0Var3);
            this.mState.f1913g = z3;
            for (int i3 = 0; i3 < this.mChildHelper.a(); i3++) {
                d0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.c(i3));
                if (!childViewHolderInt2.y() && !this.mViewInfoStore.c(childViewHolderInt2)) {
                    int e2 = l.e(childViewHolderInt2);
                    boolean b2 = childViewHolderInt2.b(8192);
                    if (!b2) {
                        e2 |= 4096;
                    }
                    l.c a3 = this.mItemAnimator.a(this.mState, childViewHolderInt2, e2, childViewHolderInt2.k());
                    if (b2) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, a3);
                    } else {
                        this.mViewInfoStore.a(childViewHolderInt2, a3);
                    }
                }
            }
        }
        clearOldPositions();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f1911e = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.b();
        this.mState.f1912f = this.mAdapter.a();
        a0 a0Var = this.mState;
        a0Var.f1910d = 0;
        a0Var.f1914h = false;
        this.mLayout.e(this.mRecycler, a0Var);
        a0 a0Var2 = this.mState;
        a0Var2.f1913g = false;
        this.mPendingSavedState = null;
        a0Var2.k = a0Var2.k && this.mItemAnimator != null;
        this.mState.f1911e = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        a0 a0Var = this.mState;
        a0Var.f1911e = 1;
        if (a0Var.k) {
            for (int a2 = this.mChildHelper.a() - 1; a2 >= 0; a2--) {
                d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.c(a2));
                if (!childViewHolderInt.y()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    l.c a3 = this.mItemAnimator.a(this.mState, childViewHolderInt);
                    d0 a4 = this.mViewInfoStore.a(changedHolderKey);
                    if (a4 != null && !a4.y()) {
                        boolean b2 = this.mViewInfoStore.b(a4);
                        boolean b3 = this.mViewInfoStore.b(childViewHolderInt);
                        if (!b2 || a4 != childViewHolderInt) {
                            l.c f2 = this.mViewInfoStore.f(a4);
                            this.mViewInfoStore.b(childViewHolderInt, a3);
                            l.c e2 = this.mViewInfoStore.e(childViewHolderInt);
                            if (f2 == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, a4);
                            } else {
                                animateChange(a4, childViewHolderInt, f2, e2, b2, b3);
                            }
                        }
                    }
                    this.mViewInfoStore.b(childViewHolderInt, a3);
                }
            }
            this.mViewInfoStore.a(this.mViewInfoProcessCallback);
        }
        this.mLayout.c(this.mRecycler);
        a0 a0Var2 = this.mState;
        a0Var2.f1909c = a0Var2.f1912f;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        a0Var2.k = false;
        a0Var2.l = false;
        this.mLayout.f1952h = false;
        ArrayList<d0> arrayList = this.mRecycler.f1970b;
        if (arrayList != null) {
            arrayList.clear();
        }
        o oVar = this.mLayout;
        if (oVar.n) {
            oVar.m = 0;
            oVar.n = false;
            this.mRecycler.j();
        }
        this.mLayout.g(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mViewInfoStore.a();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        s sVar = this.mInterceptingOnItemTouchListener;
        if (sVar == null) {
            if (motionEvent.getAction() != 0) {
                return findInterceptingOnItemTouchListener(motionEvent);
            }
            return false;
        }
        sVar.b(this, motionEvent);
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            s sVar = this.mOnItemTouchListeners.get(i2);
            if (sVar.a(this, motionEvent) && action != 3) {
                this.mInterceptingOnItemTouchListener = sVar;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int a2 = this.mChildHelper.a();
        if (a2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = UNDEFINED_DURATION;
        for (int i4 = 0; i4 < a2; i4++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.c(i4));
            if (!childViewHolderInt.y()) {
                int i5 = childViewHolderInt.i();
                if (i5 < i2) {
                    i2 = i5;
                }
                if (i5 > i3) {
                    i3 = i5;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i2));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        d0 findViewHolderForAdapterPosition;
        int i2 = this.mState.m;
        if (i2 == -1) {
            i2 = 0;
        }
        int a2 = this.mState.a();
        for (int i3 = i2; i3 < a2; i3++) {
            d0 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i3);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            } else if (findViewHolderForAdapterPosition2.f1924a.hasFocusable()) {
                return findViewHolderForAdapterPosition2.f1924a;
            }
        }
        int min = Math.min(a2, i2);
        while (true) {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
            if (findViewHolderForAdapterPosition.f1924a.hasFocusable()) {
                return findViewHolderForAdapterPosition.f1924a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((p) view.getLayoutParams()).f1959a;
    }

    static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        p pVar = (p) view.getLayoutParams();
        Rect rect2 = pVar.f1960b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) pVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) pVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) pVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) pVar).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id;
        loop0: while (true) {
            id = view.getId();
            while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
                view = ((ViewGroup) view).getFocusedChild();
                if (view.getId() != -1) {
                    break;
                }
            }
        }
        return id;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    private a.g.m.m getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new a.g.m.m(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j2, d0 d0Var, d0 d0Var2) {
        int a2 = this.mChildHelper.a();
        for (int i2 = 0; i2 < a2; i2++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.c(i2));
            if (childViewHolderInt != d0Var && getChangedHolderKey(childViewHolderInt) == j2) {
                g gVar = this.mAdapter;
                if (gVar == null || !gVar.c()) {
                    throw new IllegalStateException("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + d0Var + exceptionLabel());
                }
                throw new IllegalStateException("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:" + childViewHolderInt + " \n View Holder 2:" + d0Var + exceptionLabel());
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + d0Var2 + " cannot be found but it is necessary for " + d0Var + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int a2 = this.mChildHelper.a();
        for (int i2 = 0; i2 < a2; i2++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.c(i2));
            if (childViewHolderInt != null && !childViewHolderInt.y() && childViewHolderInt.t()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        if (a.g.m.v.o(this) == 0) {
            a.g.m.v.i(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new androidx.recyclerview.widget.b(new e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i2) {
        int i3;
        if (view2 == null || view2 == this || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c2 = 65535;
        int i4 = this.mLayout.k() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i5 = rect.left;
        int i6 = this.mTempRect2.left;
        if ((i5 < i6 || rect.right <= i6) && this.mTempRect.right < this.mTempRect2.right) {
            i3 = 1;
        } else {
            Rect rect2 = this.mTempRect;
            int i7 = rect2.right;
            int i8 = this.mTempRect2.right;
            i3 = ((i7 > i8 || rect2.left >= i8) && this.mTempRect.left > this.mTempRect2.left) ? -1 : 0;
        }
        Rect rect3 = this.mTempRect;
        int i9 = rect3.top;
        int i10 = this.mTempRect2.top;
        if ((i9 < i10 || rect3.bottom <= i10) && this.mTempRect.bottom < this.mTempRect2.bottom) {
            c2 = 1;
        } else {
            Rect rect4 = this.mTempRect;
            int i11 = rect4.bottom;
            int i12 = this.mTempRect2.bottom;
            if ((i11 <= i12 && rect4.top < i12) || this.mTempRect.top <= this.mTempRect2.top) {
                c2 = 0;
            }
        }
        if (i2 == 1) {
            return c2 < 0 || (c2 == 0 && i3 * i4 <= 0);
        } else if (i2 == 2) {
            return c2 > 0 || (c2 == 0 && i3 * i4 >= 0);
        } else if (i2 == 17) {
            return i3 < 0;
        } else if (i2 == 33) {
            return c2 < 0;
        } else if (i2 == 66) {
            return i3 > 0;
        } else if (i2 == 130) {
            return c2 > 0;
        } else {
            throw new IllegalArgumentException("Invalid direction: " + i2 + exceptionLabel());
        }
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.mLastTouchX = x2;
            this.mInitialTouchX = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.mLastTouchY = y2;
            this.mInitialTouchY = y2;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.D();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        if (this.mDataSetHasChangedAfterLayout) {
            this.mAdapterHelper.f();
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.d(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.e();
        } else {
            this.mAdapterHelper.b();
        }
        boolean z2 = false;
        boolean z3 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.k = this.mFirstLayoutComplete && this.mItemAnimator != null && (this.mDataSetHasChangedAfterLayout || z3 || this.mLayout.f1952h) && (!this.mDataSetHasChangedAfterLayout || this.mAdapter.c());
        a0 a0Var = this.mState;
        if (a0Var.k && z3 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z2 = true;
        }
        a0Var.l = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            r1 = 1
            r2 = 0
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 >= 0) goto L21
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r3 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r0 - r9
        L1c:
            androidx.core.widget.d.a(r3, r4, r9)
            r9 = 1
            goto L39
        L21:
            int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r3 <= 0) goto L38
            r6.ensureRightGlow()
            android.widget.EdgeEffect r3 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            goto L1c
        L38:
            r9 = 0
        L39:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 >= 0) goto L53
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r0 = -r10
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r0 = r0 / r3
            int r3 = r6.getWidth()
            float r3 = (float) r3
            float r7 = r7 / r3
            androidx.core.widget.d.a(r9, r0, r7)
            goto L6f
        L53:
            int r3 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r3 <= 0) goto L6e
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r3 = r6.getHeight()
            float r3 = (float) r3
            float r3 = r10 / r3
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r0 = r0 - r7
            androidx.core.widget.d.a(r9, r3, r0)
            goto L6f
        L6e:
            r1 = r9
        L6f:
            if (r1 != 0) goto L79
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L79
            int r7 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r7 == 0) goto L7c
        L79:
            a.g.m.v.M(r6)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    private void recoverFocusFromState() {
        View view;
        if (!this.mPreserveFocusAfterLayout || this.mAdapter == null || !hasFocus() || getDescendantFocusability() == 393216) {
            return;
        }
        if (getDescendantFocusability() == 131072 && isFocused()) {
            return;
        }
        if (!isFocused()) {
            View focusedChild = getFocusedChild();
            if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                if (!this.mChildHelper.c(focusedChild)) {
                    return;
                }
            } else if (this.mChildHelper.a() == 0) {
                requestFocus();
                return;
            }
        }
        View view2 = null;
        d0 findViewHolderForItemId = (this.mState.n == -1 || !this.mAdapter.c()) ? null : findViewHolderForItemId(this.mState.n);
        if (findViewHolderForItemId != null && !this.mChildHelper.c(findViewHolderForItemId.f1924a) && findViewHolderForItemId.f1924a.hasFocusable()) {
            view2 = findViewHolderForItemId.f1924a;
        } else if (this.mChildHelper.a() > 0) {
            view2 = findNextViewToFocus();
        }
        if (view2 == null) {
            return;
        }
        int i2 = this.mState.o;
        if (i2 == -1 || (view = view2.findViewById(i2)) == null || !view.isFocusable()) {
            view = view2;
        }
        view.requestFocus();
    }

    private void releaseGlows() {
        boolean z2;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.mLeftGlow.isFinished();
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.mBottomGlow.isFinished();
        }
        if (z2) {
            a.g.m.v.M(this);
        }
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof p) {
            p pVar = (p) layoutParams;
            if (!pVar.f1961c) {
                Rect rect = pVar.f1960b;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.a(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        a0 a0Var = this.mState;
        a0Var.n = -1L;
        a0Var.m = -1;
        a0Var.o = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        d0 d0Var = null;
        View focusedChild = (!this.mPreserveFocusAfterLayout || !hasFocus() || this.mAdapter == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            d0Var = findContainingViewHolder(focusedChild);
        }
        if (d0Var == null) {
            resetFocusInfo();
            return;
        }
        this.mState.n = this.mAdapter.c() ? d0Var.g() : -1L;
        this.mState.m = this.mDataSetHasChangedAfterLayout ? -1 : d0Var.q() ? d0Var.f1927d : d0Var.f();
        this.mState.o = getDeepestFocusedViewWithId(d0Var.f1924a);
    }

    private void setAdapterInternal(g gVar, boolean z2, boolean z3) {
        g gVar2 = this.mAdapter;
        if (gVar2 != null) {
            gVar2.b(this.mObserver);
            this.mAdapter.b(this);
        }
        if (!z2 || z3) {
            removeAndRecycleViews();
        }
        this.mAdapterHelper.f();
        g gVar3 = this.mAdapter;
        this.mAdapter = gVar;
        if (gVar != null) {
            gVar.a(this.mObserver);
            gVar.a(this);
        }
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.a(gVar3, this.mAdapter);
        }
        this.mRecycler.a(gVar3, this.mAdapter, z2);
        this.mState.f1913g = true;
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.b();
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.C();
        }
    }

    void absorbGlows(int i2, int i3) {
        if (i2 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i2);
            }
        }
        if (i3 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i3);
            }
        } else if (i3 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i3);
            }
        }
        if (i2 == 0 && i3 == 0) {
            return;
        }
        a.g.m.v.M(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        o oVar = this.mLayout;
        if (oVar == null || !oVar.a(this, arrayList, i2, i3)) {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    public void addItemDecoration(n nVar) {
        addItemDecoration(nVar, -1);
    }

    public void addItemDecoration(n nVar, int i2) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i2 < 0) {
            this.mItemDecorations.add(nVar);
        } else {
            this.mItemDecorations.add(i2, nVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(q qVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(qVar);
    }

    public void addOnItemTouchListener(s sVar) {
        this.mOnItemTouchListeners.add(sVar);
    }

    public void addOnScrollListener(t tVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(tVar);
    }

    void animateAppearance(d0 d0Var, l.c cVar, l.c cVar2) {
        d0Var.a(false);
        if (this.mItemAnimator.a(d0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    void animateDisappearance(d0 d0Var, l.c cVar, l.c cVar2) {
        addAnimatingView(d0Var);
        d0Var.a(false);
        if (this.mItemAnimator.b(d0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    void assertInLayoutOrScroll(String str) {
        if (!isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException("Cannot call this method unless RecyclerView is computing a layout or scrolling" + exceptionLabel());
            }
            throw new IllegalStateException(str + exceptionLabel());
        }
    }

    void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling" + exceptionLabel());
        } else if (this.mDispatchScrollCounter <= 0) {
        } else {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException("" + exceptionLabel()));
        }
    }

    boolean canReuseUpdatedViewHolder(d0 d0Var) {
        l lVar = this.mItemAnimator;
        return lVar == null || lVar.a(d0Var, d0Var.k());
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof p) && this.mLayout.a((p) layoutParams);
    }

    void clearOldPositions() {
        int b2 = this.mChildHelper.b();
        for (int i2 = 0; i2 < b2; i2++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i2));
            if (!childViewHolderInt.y()) {
                childViewHolderInt.a();
            }
        }
        this.mRecycler.b();
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<t> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.a()) {
            return this.mLayout.a(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.a()) {
            return this.mLayout.b(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.a()) {
            return this.mLayout.c(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.b()) {
            return this.mLayout.d(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.b()) {
            return this.mLayout.e(this.mState);
        }
        return 0;
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        o oVar = this.mLayout;
        if (oVar != null && oVar.b()) {
            return this.mLayout.f(this.mState);
        }
        return 0;
    }

    void considerReleasingGlowsOnScroll(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.mLeftGlow.onRelease();
            z2 = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.mRightGlow.onRelease();
            z2 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.mTopGlow.onRelease();
            z2 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.mBottomGlow.onRelease();
            z2 |= this.mBottomGlow.isFinished();
        }
        if (z2) {
            a.g.m.v.M(this);
        }
    }

    void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            a.g.j.d.a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            a.g.j.d.a();
        } else if (!this.mAdapterHelper.c()) {
        } else {
            if (this.mAdapterHelper.c(4) && !this.mAdapterHelper.c(11)) {
                a.g.j.d.a(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                this.mAdapterHelper.e();
                if (!this.mLayoutWasDefered) {
                    if (hasUpdatedView()) {
                        dispatchLayout();
                    } else {
                        this.mAdapterHelper.a();
                    }
                }
                stopInterceptRequestLayout(true);
                onExitLayoutOrScroll();
            } else if (!this.mAdapterHelper.c()) {
                return;
            } else {
                a.g.j.d.a(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
            }
            a.g.j.d.a();
        }
    }

    void defaultOnMeasure(int i2, int i3) {
        setMeasuredDimension(o.a(i2, getPaddingLeft() + getPaddingRight(), a.g.m.v.r(this)), o.a(i3, getPaddingTop() + getPaddingBottom(), a.g.m.v.q(this)));
    }

    void dispatchChildAttached(View view) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        g gVar = this.mAdapter;
        if (gVar != null && childViewHolderInt != null) {
            gVar.b((g) childViewHolderInt);
        }
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).a(view);
            }
        }
    }

    void dispatchChildDetached(View view) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        g gVar = this.mAdapter;
        if (gVar != null && childViewHolderInt != null) {
            gVar.c(childViewHolderInt);
        }
        List<q> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).b(view);
            }
        }
    }

    void dispatchLayout() {
        String str;
        if (this.mAdapter == null) {
            str = "No adapter attached; skipping layout";
        } else if (this.mLayout != null) {
            a0 a0Var = this.mState;
            a0Var.j = false;
            if (a0Var.f1911e == 1) {
                dispatchLayoutStep1();
            } else if (!this.mAdapterHelper.d() && this.mLayout.r() == getWidth() && this.mLayout.h() == getHeight()) {
                this.mLayout.e(this);
                dispatchLayoutStep3();
                return;
            }
            this.mLayout.e(this);
            dispatchLayoutStep2();
            dispatchLayoutStep3();
            return;
        } else {
            str = "No layout manager attached; skipping layout";
        }
        Log.e(TAG, str);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().a(f2, f3);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().a(i2, i3, iArr, iArr2);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().a(i2, i3, iArr, iArr2, i4);
    }

    public final void dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().a(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().a(i2, i3, i4, i5, iArr);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        return getScrollingChildHelper().a(i2, i3, i4, i5, iArr, i6);
    }

    void dispatchOnScrollStateChanged(int i2) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.g(i2);
        }
        onScrollStateChanged(i2);
        t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.a(this, i2);
        }
        List<t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).a(this, i2);
            }
        }
    }

    void dispatchOnScrolled(int i2, int i3) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        onScrolled(i2, i3);
        t tVar = this.mScrollListener;
        if (tVar != null) {
            tVar.a(this, i2, i3);
        }
        List<t> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).a(this, i2, i3);
            }
        }
        this.mDispatchScrollCounter--;
    }

    void dispatchPendingImportantForAccessibilityChanges() {
        int i2;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            d0 d0Var = this.mPendingAccessibilityImportanceChange.get(size);
            if (d0Var.f1924a.getParent() == this && !d0Var.y() && (i2 = d0Var.q) != -1) {
                a.g.m.v.h(d0Var.f1924a, i2);
                d0Var.q = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z2;
        boolean z3;
        float f2;
        int i2;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            this.mItemDecorations.get(i3).b(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(-paddingTop, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 == null || edgeEffect7.isFinished()) {
            z3 = z2;
        } else {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                f2 = (-getWidth()) + getPaddingRight();
                i2 = (-getHeight()) + getPaddingBottom();
            } else {
                f2 = -getWidth();
                i2 = -getHeight();
            }
            canvas.translate(f2, i2);
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z4 = true;
            }
            z3 = z4 | z2;
            canvas.restoreToCount(save4);
        }
        if (!z3 && this.mItemAnimator != null && this.mItemDecorations.size() > 0 && this.mItemAnimator.g()) {
            z3 = true;
        }
        if (z3) {
            a.g.m.v.M(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    void ensureBottomGlow() {
        EdgeEffect edgeEffect;
        int measuredWidth;
        int measuredHeight;
        if (this.mBottomGlow != null) {
            return;
        }
        this.mBottomGlow = this.mEdgeEffectFactory.a(this, 3);
        if (this.mClipToPadding) {
            edgeEffect = this.mBottomGlow;
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            edgeEffect = this.mBottomGlow;
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffect.setSize(measuredWidth, measuredHeight);
    }

    void ensureLeftGlow() {
        EdgeEffect edgeEffect;
        int measuredHeight;
        int measuredWidth;
        if (this.mLeftGlow != null) {
            return;
        }
        this.mLeftGlow = this.mEdgeEffectFactory.a(this, 0);
        if (this.mClipToPadding) {
            edgeEffect = this.mLeftGlow;
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            edgeEffect = this.mLeftGlow;
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffect.setSize(measuredHeight, measuredWidth);
    }

    void ensureRightGlow() {
        EdgeEffect edgeEffect;
        int measuredHeight;
        int measuredWidth;
        if (this.mRightGlow != null) {
            return;
        }
        this.mRightGlow = this.mEdgeEffectFactory.a(this, 2);
        if (this.mClipToPadding) {
            edgeEffect = this.mRightGlow;
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        } else {
            edgeEffect = this.mRightGlow;
            measuredHeight = getMeasuredHeight();
            measuredWidth = getMeasuredWidth();
        }
        edgeEffect.setSize(measuredHeight, measuredWidth);
    }

    void ensureTopGlow() {
        EdgeEffect edgeEffect;
        int measuredWidth;
        int measuredHeight;
        if (this.mTopGlow != null) {
            return;
        }
        this.mTopGlow = this.mEdgeEffectFactory.a(this, 1);
        if (this.mClipToPadding) {
            edgeEffect = this.mTopGlow;
            measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        } else {
            edgeEffect = this.mTopGlow;
            measuredWidth = getMeasuredWidth();
            measuredHeight = getMeasuredHeight();
        }
        edgeEffect.setSize(measuredWidth, measuredHeight);
    }

    String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    final void fillRemainingScrollValues(a0 a0Var) {
        if (getScrollState() != 2) {
            a0Var.p = 0;
            a0Var.q = 0;
            return;
        }
        OverScroller overScroller = this.mViewFlinger.f1918d;
        a0Var.p = overScroller.getFinalX() - overScroller.getCurrX();
        a0Var.q = overScroller.getFinalY() - overScroller.getCurrY();
    }

    public View findChildViewUnder(float f2, float f3) {
        for (int a2 = this.mChildHelper.a() - 1; a2 >= 0; a2--) {
            View c2 = this.mChildHelper.c(a2);
            float translationX = c2.getTranslationX();
            float translationY = c2.getTranslationY();
            if (f2 >= c2.getLeft() + translationX && f2 <= c2.getRight() + translationX && f3 >= c2.getTop() + translationY && f3 <= c2.getBottom() + translationY) {
                return c2;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View findContainingItemView(android.view.View r3) {
        /*
            r2 = this;
        L0:
            android.view.ViewParent r0 = r3.getParent()
            if (r0 == 0) goto L10
            if (r0 == r2) goto L10
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L10
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            goto L0
        L10:
            if (r0 != r2) goto L13
            goto L14
        L13:
            r3 = 0
        L14:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findContainingItemView(android.view.View):android.view.View");
    }

    public d0 findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public d0 findViewHolderForAdapterPosition(int i2) {
        d0 d0Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int b2 = this.mChildHelper.b();
        for (int i3 = 0; i3 < b2; i3++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i3));
            if (childViewHolderInt != null && !childViewHolderInt.q() && getAdapterPositionFor(childViewHolderInt) == i2) {
                if (!this.mChildHelper.c(childViewHolderInt.f1924a)) {
                    return childViewHolderInt;
                }
                d0Var = childViewHolderInt;
            }
        }
        return d0Var;
    }

    public d0 findViewHolderForItemId(long j2) {
        g gVar = this.mAdapter;
        d0 d0Var = null;
        if (gVar != null && gVar.c()) {
            int b2 = this.mChildHelper.b();
            for (int i2 = 0; i2 < b2; i2++) {
                d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i2));
                if (childViewHolderInt != null && !childViewHolderInt.q() && childViewHolderInt.g() == j2) {
                    if (!this.mChildHelper.c(childViewHolderInt.f1924a)) {
                        return childViewHolderInt;
                    }
                    d0Var = childViewHolderInt;
                }
            }
        }
        return d0Var;
    }

    public d0 findViewHolderForLayoutPosition(int i2) {
        return findViewHolderForPosition(i2, false);
    }

    @Deprecated
    public d0 findViewHolderForPosition(int i2) {
        return findViewHolderForPosition(i2, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.recyclerview.widget.RecyclerView.d0 findViewHolderForPosition(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.b r0 = r5.mChildHelper
            int r0 = r0.b()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.b r3 = r5.mChildHelper
            android.view.View r3 = r3.d(r2)
            androidx.recyclerview.widget.RecyclerView$d0 r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.q()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.f1926c
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.i()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.b r1 = r5.mChildHelper
            android.view.View r4 = r3.f1924a
            boolean r1 = r1.c(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findViewHolderForPosition(int, boolean):androidx.recyclerview.widget.RecyclerView$d0");
    }

    public boolean fling(int i2, int i3) {
        o oVar = this.mLayout;
        int i4 = 0;
        if (oVar == null) {
            Log.e(TAG, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.mLayoutSuppressed) {
            return false;
        } else {
            boolean a2 = oVar.a();
            boolean b2 = this.mLayout.b();
            if (!a2 || Math.abs(i2) < this.mMinFlingVelocity) {
                i2 = 0;
            }
            if (!b2 || Math.abs(i3) < this.mMinFlingVelocity) {
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            float f2 = i2;
            float f3 = i3;
            if (!dispatchNestedPreFling(f2, f3)) {
                boolean z2 = a2 || b2;
                dispatchNestedFling(f2, f3, z2);
                r rVar = this.mOnFlingListener;
                if (rVar != null && rVar.a(i2, i3)) {
                    return true;
                }
                if (z2) {
                    if (a2) {
                        i4 = 1;
                    }
                    if (b2) {
                        i4 |= 2;
                    }
                    startNestedScroll(i4, 1);
                    int i5 = this.mMaxFlingVelocity;
                    int max = Math.max(-i5, Math.min(i2, i5));
                    int i6 = this.mMaxFlingVelocity;
                    this.mViewFlinger.a(max, Math.max(-i6, Math.min(i3, i6)));
                    return true;
                }
            }
            return false;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i2) {
        View view2;
        boolean z2;
        View d2 = this.mLayout.d(view, i2);
        if (d2 != null) {
            return d2;
        }
        boolean z3 = this.mAdapter != null && this.mLayout != null && !isComputingLayout() && !this.mLayoutSuppressed;
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (!z3 || !(i2 == 2 || i2 == 1)) {
            View findNextFocus = focusFinder.findNextFocus(this, view, i2);
            if (findNextFocus != null || !z3) {
                view2 = findNextFocus;
            } else {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.a(view, i2, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
        } else {
            if (this.mLayout.b()) {
                int i3 = i2 == 2 ? 130 : 33;
                z2 = focusFinder.findNextFocus(this, view, i3) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i2 = i3;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.mLayout.a()) {
                int i4 = (this.mLayout.k() == 1) ^ (i2 == 2) ? 66 : 17;
                z2 = focusFinder.findNextFocus(this, view, i4) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i2 = i4;
                }
            }
            if (z2) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.a(view, i2, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i2);
        }
        if (view2 == null || view2.hasFocusable()) {
            return isPreferredNextFocus(view, view2, i2) ? view2 : super.focusSearch(view, i2);
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i2);
        } else {
            requestChildOnScreen(view2, null);
            return view;
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.c();
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.a(getContext(), attributeSet);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        o oVar = this.mLayout;
        if (oVar != null) {
            return oVar.a(layoutParams);
        }
        throw new IllegalStateException("RecyclerView has no LayoutManager" + exceptionLabel());
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public g getAdapter() {
        return this.mAdapter;
    }

    int getAdapterPositionFor(d0 d0Var) {
        if (d0Var.b(524) || !d0Var.n()) {
            return -1;
        }
        return this.mAdapterHelper.a(d0Var.f1926c);
    }

    @Override // android.view.View
    public int getBaseline() {
        o oVar = this.mLayout;
        return oVar != null ? oVar.d() : super.getBaseline();
    }

    long getChangedHolderKey(d0 d0Var) {
        return this.mAdapter.c() ? d0Var.g() : d0Var.f1926c;
    }

    public int getChildAdapterPosition(View view) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.f();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i2, int i3) {
        j jVar = this.mChildDrawingOrderCallback;
        return jVar == null ? super.getChildDrawingOrder(i2, i3) : jVar.a(i2, i3);
    }

    public long getChildItemId(View view) {
        d0 childViewHolderInt;
        g gVar = this.mAdapter;
        if (gVar == null || !gVar.c() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.g();
    }

    public int getChildLayoutPosition(View view) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.i();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public d0 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public androidx.recyclerview.widget.l getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public k getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public l getItemAnimator() {
        return this.mItemAnimator;
    }

    Rect getItemDecorInsetsForChild(View view) {
        p pVar = (p) view.getLayoutParams();
        if (!pVar.f1961c) {
            return pVar.f1960b;
        }
        if (this.mState.d() && (pVar.b() || pVar.d())) {
            return pVar.f1960b;
        }
        Rect rect = pVar.f1960b;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i2).a(this.mTempRect, view, this, this.mState);
            int i3 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i3 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        pVar.f1961c = false;
        return rect;
    }

    public n getItemDecorationAt(int i2) {
        int itemDecorationCount = getItemDecorationCount();
        if (i2 < 0 || i2 >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i2 + " is an invalid index for size " + itemDecorationCount);
        }
        return this.mItemDecorations.get(i2);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public o getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    public r getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public u getRecycledViewPool() {
        return this.mRecycler.d();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().a();
    }

    public boolean hasNestedScrollingParent(int i2) {
        return getScrollingChildHelper().a(i2);
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.c();
    }

    void initAdapterManager() {
        this.mAdapterHelper = new androidx.recyclerview.widget.a(new f());
    }

    void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new androidx.recyclerview.widget.d(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(a.p.b.fastscroll_default_thickness), resources.getDimensionPixelSize(a.p.b.fastscroll_minimum_range), resources.getDimensionPixelOffset(a.p.b.fastscroll_margin));
            return;
        }
        throw new IllegalArgumentException("Trying to set fast scroller without both required drawables." + exceptionLabel());
    }

    void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.a("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        l lVar = this.mItemAnimator;
        return lVar != null && lVar.g();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View, a.g.m.l
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().b();
    }

    void jumpToPositionForSmoothScroller(int i2) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.i(i2);
        awakenScrollBars();
    }

    void markItemDecorInsetsDirty() {
        int b2 = this.mChildHelper.b();
        for (int i2 = 0; i2 < b2; i2++) {
            ((p) this.mChildHelper.d(i2).getLayoutParams()).f1961c = true;
        }
        this.mRecycler.g();
    }

    void markKnownViewsInvalid() {
        int b2 = this.mChildHelper.b();
        for (int i2 = 0; i2 < b2; i2++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i2));
            if (childViewHolderInt != null && !childViewHolderInt.y()) {
                childViewHolderInt.a(6);
            }
        }
        markItemDecorInsetsDirty();
        this.mRecycler.h();
    }

    public void offsetChildrenHorizontal(int i2) {
        int a2 = this.mChildHelper.a();
        for (int i3 = 0; i3 < a2; i3++) {
            this.mChildHelper.c(i3).offsetLeftAndRight(i2);
        }
    }

    public void offsetChildrenVertical(int i2) {
        int a2 = this.mChildHelper.a();
        for (int i3 = 0; i3 < a2; i3++) {
            this.mChildHelper.c(i3).offsetTopAndBottom(i2);
        }
    }

    void offsetPositionRecordsForInsert(int i2, int i3) {
        int b2 = this.mChildHelper.b();
        for (int i4 = 0; i4 < b2; i4++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i4));
            if (childViewHolderInt != null && !childViewHolderInt.y() && childViewHolderInt.f1926c >= i2) {
                childViewHolderInt.a(i3, false);
                this.mState.f1913g = true;
            }
        }
        this.mRecycler.a(i2, i3);
        requestLayout();
    }

    void offsetPositionRecordsForMove(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int b2 = this.mChildHelper.b();
        if (i2 < i3) {
            i5 = i2;
            i4 = i3;
            i6 = -1;
        } else {
            i4 = i2;
            i5 = i3;
            i6 = 1;
        }
        for (int i8 = 0; i8 < b2; i8++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i8));
            if (childViewHolderInt != null && (i7 = childViewHolderInt.f1926c) >= i5 && i7 <= i4) {
                if (i7 == i2) {
                    childViewHolderInt.a(i3 - i2, false);
                } else {
                    childViewHolderInt.a(i6, false);
                }
                this.mState.f1913g = true;
            }
        }
        this.mRecycler.b(i2, i3);
        requestLayout();
    }

    void offsetPositionRecordsForRemove(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int b2 = this.mChildHelper.b();
        for (int i5 = 0; i5 < b2; i5++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i5));
            if (childViewHolderInt != null && !childViewHolderInt.y()) {
                int i6 = childViewHolderInt.f1926c;
                if (i6 >= i4) {
                    childViewHolderInt.a(-i3, z2);
                } else if (i6 >= i2) {
                    childViewHolderInt.a(i2 - 1, -i3, z2);
                }
                this.mState.f1913g = true;
            }
        }
        this.mRecycler.a(i2, i3, z2);
        requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
        if (r0 >= 30.0f) goto L17;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onAttachedToWindow() {
        /*
            r4 = this;
            super.onAttachedToWindow()
            r0 = 0
            r4.mLayoutOrScrollCounter = r0
            r1 = 1
            r4.mIsAttached = r1
            boolean r2 = r4.mFirstLayoutComplete
            if (r2 == 0) goto L14
            boolean r2 = r4.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = 0
        L15:
            r4.mFirstLayoutComplete = r1
            androidx.recyclerview.widget.RecyclerView$o r1 = r4.mLayout
            if (r1 == 0) goto L1e
            r1.a(r4)
        L1e:
            r4.mPostedAnimatorRunner = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L67
            java.lang.ThreadLocal<androidx.recyclerview.widget.e> r0 = androidx.recyclerview.widget.e.f2093f
            java.lang.Object r0 = r0.get()
            androidx.recyclerview.widget.e r0 = (androidx.recyclerview.widget.e) r0
            r4.mGapWorker = r0
            androidx.recyclerview.widget.e r0 = r4.mGapWorker
            if (r0 != 0) goto L62
            androidx.recyclerview.widget.e r0 = new androidx.recyclerview.widget.e
            r0.<init>()
            r4.mGapWorker = r0
            android.view.Display r0 = a.g.m.v.k(r4)
            r1 = 1114636288(0x42700000, float:60.0)
            boolean r2 = r4.isInEditMode()
            if (r2 != 0) goto L52
            if (r0 == 0) goto L52
            float r0 = r0.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L52
            goto L54
        L52:
            r0 = 1114636288(0x42700000, float:60.0)
        L54:
            androidx.recyclerview.widget.e r1 = r4.mGapWorker
            r2 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r2 = r2 / r0
            long r2 = (long) r2
            r1.f2097d = r2
            java.lang.ThreadLocal<androidx.recyclerview.widget.e> r0 = androidx.recyclerview.widget.e.f2093f
            r0.set(r1)
        L62:
            androidx.recyclerview.widget.e r0 = r4.mGapWorker
            r0.a(r4)
        L67:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        androidx.recyclerview.widget.e eVar;
        super.onDetachedFromWindow();
        l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.b();
        }
        stopScroll();
        this.mIsAttached = false;
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.a(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.b();
        if (!ALLOW_THREAD_GAP_WORK || (eVar = this.mGapWorker) == null) {
            return;
        }
        eVar.b(this);
        this.mGapWorker = null;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mItemDecorations.get(i2).a(canvas, this, this.mState);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void onExitLayoutOrScroll(boolean z2) {
        this.mLayoutOrScrollCounter--;
        if (this.mLayoutOrScrollCounter < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (!z2) {
                return;
            }
            dispatchContentChangedIfNecessary();
            dispatchPendingImportantForAccessibilityChanges();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0066  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.mLayoutSuppressed
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L77
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3c
            androidx.recyclerview.widget.RecyclerView$o r0 = r5.mLayout
            boolean r0 = r0.b()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = 0
        L2d:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.mLayout
            boolean r3 = r3.a()
            if (r3 == 0) goto L61
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L62
        L3c:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L60
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.mLayout
            boolean r3 = r3.b()
            if (r3 == 0) goto L55
            float r0 = -r0
            goto L61
        L55:
            androidx.recyclerview.widget.RecyclerView$o r3 = r5.mLayout
            boolean r3 = r3.a()
            if (r3 == 0) goto L60
            r3 = r0
            r0 = 0
            goto L62
        L60:
            r0 = 0
        L61:
            r3 = 0
        L62:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6a
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L77
        L6a:
            float r2 = r5.mScaledHorizontalScrollFactor
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.mScaledVerticalScrollFactor
            float r0 = r0 * r3
            int r0 = (int) r0
            r5.scrollByInternal(r2, r0, r6)
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        o oVar = this.mLayout;
        if (oVar == null) {
            return false;
        }
        boolean a2 = oVar.a();
        boolean b2 = this.mLayout.b();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x2;
            this.mInitialTouchX = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y2;
            this.mInitialTouchY = y2;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i2 = a2 ? 1 : 0;
            if (b2) {
                i2 |= 2;
            }
            startNestedScroll(i2, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (findPointerIndex < 0) {
                Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i3 = x3 - this.mInitialTouchX;
                int i4 = y3 - this.mInitialTouchY;
                if (!a2 || Math.abs(i3) <= this.mTouchSlop) {
                    z2 = false;
                } else {
                    this.mLastTouchX = x3;
                    z2 = true;
                }
                if (b2 && Math.abs(i4) > this.mTouchSlop) {
                    this.mLastTouchY = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x4;
            this.mInitialTouchX = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y4;
            this.mInitialTouchY = y4;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        return this.mScrollState == 1;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        a.g.j.d.a(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        a.g.j.d.a();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        o oVar = this.mLayout;
        if (oVar == null) {
            defaultOnMeasure(i2, i3);
            return;
        }
        boolean z2 = false;
        if (oVar.v()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.mLayout.a(this.mRecycler, this.mState, i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            if (z2 || this.mAdapter == null) {
                return;
            }
            if (this.mState.f1911e == 1) {
                dispatchLayoutStep1();
            }
            this.mLayout.b(i2, i3);
            this.mState.j = true;
            dispatchLayoutStep2();
            this.mLayout.d(i2, i3);
            if (!this.mLayout.B()) {
                return;
            }
            this.mLayout.b(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            this.mState.j = true;
            dispatchLayoutStep2();
            this.mLayout.d(i2, i3);
        } else if (this.mHasFixedSize) {
            this.mLayout.a(this.mRecycler, this.mState, i2, i3);
        } else {
            if (this.mAdapterUpdateDuringMeasure) {
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                processAdapterUpdatesAndSetAnimationFlags();
                onExitLayoutOrScroll();
                a0 a0Var = this.mState;
                if (a0Var.l) {
                    a0Var.f1914h = true;
                } else {
                    this.mAdapterHelper.b();
                    this.mState.f1914h = false;
                }
                this.mAdapterUpdateDuringMeasure = false;
                stopInterceptRequestLayout(false);
            } else if (this.mState.l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            g gVar = this.mAdapter;
            if (gVar != null) {
                this.mState.f1912f = gVar.a();
            } else {
                this.mState.f1912f = 0;
            }
            startInterceptRequestLayout();
            this.mLayout.a(this.mRecycler, this.mState, i2, i3);
            stopInterceptRequestLayout(false);
            this.mState.f1914h = false;
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof y)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        this.mPendingSavedState = (y) parcelable;
        super.onRestoreInstanceState(this.mPendingSavedState.j());
        o oVar = this.mLayout;
        if (oVar == null || (parcelable2 = this.mPendingSavedState.f1978d) == null) {
            return;
        }
        oVar.a(parcelable2);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        y yVar = new y(super.onSaveInstanceState());
        y yVar2 = this.mPendingSavedState;
        if (yVar2 != null) {
            yVar.a(yVar2);
        } else {
            o oVar = this.mLayout;
            yVar.f1978d = oVar != null ? oVar.y() : null;
        }
        return yVar;
    }

    public void onScrollStateChanged(int i2) {
    }

    public void onScrolled(int i2, int i3) {
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 == i4 && i3 == i5) {
            return;
        }
        invalidateGlows();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f4  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    void postAnimationRunner() {
        if (this.mPostedAnimatorRunner || !this.mIsAttached) {
            return;
        }
        a.g.m.v.a(this, this.mItemAnimatorRunner);
        this.mPostedAnimatorRunner = true;
    }

    void processDataSetCompletelyChanged(boolean z2) {
        this.mDispatchItemsChangedEvent = z2 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    void recordAnimationInfoIfBouncedHiddenView(d0 d0Var, l.c cVar) {
        d0Var.a(0, 8192);
        if (this.mState.i && d0Var.t() && !d0Var.q() && !d0Var.y()) {
            this.mViewInfoStore.a(getChangedHolderKey(d0Var), d0Var);
        }
        this.mViewInfoStore.c(d0Var, cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void removeAndRecycleViews() {
        l lVar = this.mItemAnimator;
        if (lVar != null) {
            lVar.b();
        }
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.b(this.mRecycler);
            this.mLayout.c(this.mRecycler);
        }
        this.mRecycler.a();
    }

    boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        boolean e2 = this.mChildHelper.e(view);
        if (e2) {
            d0 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.c(childViewHolderInt);
            this.mRecycler.b(childViewHolderInt);
        }
        stopInterceptRequestLayout(!e2);
        return e2;
    }

    @Override // android.view.ViewGroup
    protected void removeDetachedView(View view, boolean z2) {
        d0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.s()) {
                childViewHolderInt.d();
            } else if (!childViewHolderInt.y()) {
                throw new IllegalArgumentException("Called removeDetachedView with a view which is not flagged as tmp detached." + childViewHolderInt + exceptionLabel());
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z2);
    }

    public void removeItemDecoration(n nVar) {
        o oVar = this.mLayout;
        if (oVar != null) {
            oVar.a("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(nVar);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i2) {
        int itemDecorationCount = getItemDecorationCount();
        if (i2 >= 0 && i2 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i2));
            return;
        }
        throw new IndexOutOfBoundsException(i2 + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(q qVar) {
        List<q> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(qVar);
    }

    public void removeOnItemTouchListener(s sVar) {
        this.mOnItemTouchListeners.remove(sVar);
        if (this.mInterceptingOnItemTouchListener == sVar) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(t tVar) {
        List<t> list = this.mScrollListeners;
        if (list != null) {
            list.remove(tVar);
        }
    }

    void repositionShadowingViews() {
        d0 d0Var;
        int a2 = this.mChildHelper.a();
        for (int i2 = 0; i2 < a2; i2++) {
            View c2 = this.mChildHelper.c(i2);
            d0 childViewHolder = getChildViewHolder(c2);
            if (childViewHolder != null && (d0Var = childViewHolder.i) != null) {
                View view = d0Var.f1924a;
                int left = c2.getLeft();
                int top = c2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.a(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.mLayout.a(this, view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.mOnItemTouchListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mOnItemTouchListeners.get(i2).a(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    void saveOldPositions() {
        int b2 = this.mChildHelper.b();
        for (int i2 = 0; i2 < b2; i2++) {
            d0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i2));
            if (!childViewHolderInt.y()) {
                childViewHolderInt.w();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i2, int i3) {
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.mLayoutSuppressed) {
        } else {
            boolean a2 = oVar.a();
            boolean b2 = this.mLayout.b();
            if (!a2 && !b2) {
                return;
            }
            if (!a2) {
                i2 = 0;
            }
            if (!b2) {
                i3 = 0;
            }
            scrollByInternal(i2, i3, null);
        }
    }

    boolean scrollByInternal(int i2, int i3, MotionEvent motionEvent) {
        int i4;
        int i5;
        int i6;
        int i7;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i2, i3, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i8 = iArr2[0];
            int i9 = iArr2[1];
            i5 = i9;
            i4 = i8;
            i6 = i2 - i8;
            i7 = i3 - i9;
        } else {
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        int i10 = i4;
        dispatchNestedScroll(i4, i5, i6, i7, this.mScrollOffset, 0, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i11 = i6 - iArr4[0];
        int i12 = i7 - iArr4[1];
        boolean z2 = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i13 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        this.mLastTouchX = i13 - iArr5[0];
        this.mLastTouchY -= iArr5[1];
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !a.g.m.i.a(motionEvent, 8194)) {
                pullGlows(motionEvent.getX(), i11, motionEvent.getY(), i12);
            }
            considerReleasingGlowsOnScroll(i2, i3);
        }
        if (i10 != 0 || i5 != 0) {
            dispatchOnScrolled(i10, i5);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        return (!z2 && i10 == 0 && i5 == 0) ? false : true;
    }

    void scrollStep(int i2, int i3, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        a.g.j.d.a(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int a2 = i2 != 0 ? this.mLayout.a(i2, this.mRecycler, this.mState) : 0;
        int b2 = i3 != 0 ? this.mLayout.b(i3, this.mRecycler, this.mState) : 0;
        a.g.j.d.a();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = a2;
            iArr[1] = b2;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i2) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        oVar.i(i2);
        awakenScrollBars();
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(androidx.recyclerview.widget.l lVar) {
        this.mAccessibilityDelegate = lVar;
        a.g.m.v.a(this, this.mAccessibilityDelegate);
    }

    public void setAdapter(g gVar) {
        setLayoutFrozen(false);
        setAdapterInternal(gVar, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(j jVar) {
        if (jVar == this.mChildDrawingOrderCallback) {
            return;
        }
        this.mChildDrawingOrderCallback = jVar;
        setChildrenDrawingOrderEnabled(this.mChildDrawingOrderCallback != null);
    }

    boolean setChildImportantForAccessibilityInternal(d0 d0Var, int i2) {
        if (!isComputingLayout()) {
            a.g.m.v.h(d0Var.f1924a, i2);
            return true;
        }
        d0Var.q = i2;
        this.mPendingAccessibilityImportanceChange.add(d0Var);
        return false;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z2) {
        if (z2 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z2;
        super.setClipToPadding(z2);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(k kVar) {
        androidx.core.util.g.a(kVar);
        this.mEdgeEffectFactory = kVar;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z2) {
        this.mHasFixedSize = z2;
    }

    public void setItemAnimator(l lVar) {
        l lVar2 = this.mItemAnimator;
        if (lVar2 != null) {
            lVar2.b();
            this.mItemAnimator.a((l.b) null);
        }
        this.mItemAnimator = lVar;
        l lVar3 = this.mItemAnimator;
        if (lVar3 != null) {
            lVar3.a(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i2) {
        this.mRecycler.f(i2);
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(o oVar) {
        if (oVar == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            l lVar = this.mItemAnimator;
            if (lVar != null) {
                lVar.b();
            }
            this.mLayout.b(this.mRecycler);
            this.mLayout.c(this.mRecycler);
            this.mRecycler.a();
            if (this.mIsAttached) {
                this.mLayout.a(this, this.mRecycler);
            }
            this.mLayout.f((RecyclerView) null);
            this.mLayout = null;
        } else {
            this.mRecycler.a();
        }
        this.mChildHelper.c();
        this.mLayout = oVar;
        if (oVar != null) {
            if (oVar.f1946b != null) {
                throw new IllegalArgumentException("LayoutManager " + oVar + " is already attached to a RecyclerView:" + oVar.f1946b.exceptionLabel());
            }
            this.mLayout.f(this);
            if (this.mIsAttached) {
                this.mLayout.a(this);
            }
        }
        this.mRecycler.j();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            if (layoutTransition == null) {
                suppressLayout(false);
                return;
            } else if (layoutTransition.getAnimator(0) == null && layoutTransition.getAnimator(1) == null && layoutTransition.getAnimator(2) == null && layoutTransition.getAnimator(3) == null && layoutTransition.getAnimator(4) == null) {
                suppressLayout(true);
                return;
            }
        }
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View, a.g.m.l
    public void setNestedScrollingEnabled(boolean z2) {
        getScrollingChildHelper().a(z2);
    }

    public void setOnFlingListener(r rVar) {
        this.mOnFlingListener = rVar;
    }

    @Deprecated
    public void setOnScrollListener(t tVar) {
        this.mScrollListener = tVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.mPreserveFocusAfterLayout = z2;
    }

    public void setRecycledViewPool(u uVar) {
        this.mRecycler.a(uVar);
    }

    public void setRecyclerListener(w wVar) {
        this.mRecyclerListener = wVar;
    }

    void setScrollState(int i2) {
        if (i2 == this.mScrollState) {
            return;
        }
        this.mScrollState = i2;
        if (i2 != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i2);
    }

    public void setScrollingTouchSlop(int i2) {
        int scaledTouchSlop;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 == 1) {
                scaledTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                this.mTouchSlop = scaledTouchSlop;
            }
            Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
        }
        scaledTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mTouchSlop = scaledTouchSlop;
    }

    public void setViewCacheExtension(b0 b0Var) {
        this.mRecycler.a(b0Var);
    }

    boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (isComputingLayout()) {
            int a2 = accessibilityEvent != null ? a.g.m.e0.b.a(accessibilityEvent) : 0;
            if (a2 == 0) {
                a2 = 0;
            }
            this.mEatenAccessibilityChangeFlags = a2 | this.mEatenAccessibilityChangeFlags;
            return true;
        }
        return false;
    }

    public void smoothScrollBy(int i2, int i3) {
        smoothScrollBy(i2, i3, null);
    }

    public void smoothScrollBy(int i2, int i3, Interpolator interpolator) {
        smoothScrollBy(i2, i3, interpolator, UNDEFINED_DURATION);
    }

    public void smoothScrollBy(int i2, int i3, Interpolator interpolator, int i4) {
        smoothScrollBy(i2, i3, interpolator, i4, false);
    }

    void smoothScrollBy(int i2, int i3, Interpolator interpolator, int i4, boolean z2) {
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (this.mLayoutSuppressed) {
        } else {
            int i5 = 0;
            if (!oVar.a()) {
                i2 = 0;
            }
            if (!this.mLayout.b()) {
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return;
            }
            if (!(i4 == Integer.MIN_VALUE || i4 > 0)) {
                scrollBy(i2, i3);
                return;
            }
            if (z2) {
                if (i2 != 0) {
                    i5 = 1;
                }
                if (i3 != 0) {
                    i5 |= 2;
                }
                startNestedScroll(i5, 1);
            }
            this.mViewFlinger.a(i2, i3, i4, interpolator);
        }
    }

    public void smoothScrollToPosition(int i2) {
        if (this.mLayoutSuppressed) {
            return;
        }
        o oVar = this.mLayout;
        if (oVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            oVar.a(this, this.mState, i2);
        }
    }

    void startInterceptRequestLayout() {
        this.mInterceptRequestLayoutDepth++;
        if (this.mInterceptRequestLayoutDepth != 1 || this.mLayoutSuppressed) {
            return;
        }
        this.mLayoutWasDefered = false;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().b(i2);
    }

    public boolean startNestedScroll(int i2, int i3) {
        return getScrollingChildHelper().a(i2, i3);
    }

    void stopInterceptRequestLayout(boolean z2) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z2 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z2 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View, a.g.m.l
    public void stopNestedScroll() {
        getScrollingChildHelper().c();
    }

    public void stopNestedScroll(int i2) {
        getScrollingChildHelper().c(i2);
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z2) {
        if (z2 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (z2) {
                long uptimeMillis = SystemClock.uptimeMillis();
                onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
                this.mLayoutSuppressed = true;
                this.mIgnoreMotionEventTillDown = true;
                stopScroll();
                return;
            }
            this.mLayoutSuppressed = false;
            if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                requestLayout();
            }
            this.mLayoutWasDefered = false;
        }
    }

    public void swapAdapter(g gVar, boolean z2) {
        setLayoutFrozen(false);
        setAdapterInternal(gVar, true, z2);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    void viewRangeUpdate(int i2, int i3, Object obj) {
        int i4;
        int b2 = this.mChildHelper.b();
        int i5 = i2 + i3;
        for (int i6 = 0; i6 < b2; i6++) {
            View d2 = this.mChildHelper.d(i6);
            d0 childViewHolderInt = getChildViewHolderInt(d2);
            if (childViewHolderInt != null && !childViewHolderInt.y() && (i4 = childViewHolderInt.f1926c) >= i2 && i4 < i5) {
                childViewHolderInt.a(2);
                childViewHolderInt.a(obj);
                ((p) d2.getLayoutParams()).f1961c = true;
            }
        }
        this.mRecycler.c(i2, i3);
    }
}
