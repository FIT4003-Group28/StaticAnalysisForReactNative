package com.facebook.react.uimanager;

import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.PopupMenu;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.systrace.b;
import java.util.Arrays;
/* loaded from: classes.dex */
public class m {
    private static final String n = "m";

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<View> f6004a;

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<ViewManager> f6005b;

    /* renamed from: c  reason: collision with root package name */
    private final SparseBooleanArray f6006c;

    /* renamed from: d  reason: collision with root package name */
    private final a1 f6007d;

    /* renamed from: e  reason: collision with root package name */
    private final com.facebook.react.g0.a f6008e;

    /* renamed from: f  reason: collision with root package name */
    private final RootViewManager f6009f;

    /* renamed from: g  reason: collision with root package name */
    private final com.facebook.react.uimanager.h1.e f6010g;

    /* renamed from: h  reason: collision with root package name */
    private final SparseArray<SparseIntArray> f6011h;
    private final int[] i;
    private final RectF j;
    private boolean k;
    private PopupMenu l;
    private int m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements com.facebook.react.uimanager.h1.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroupManager f6012a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ViewGroup f6013b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ View f6014c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ SparseIntArray f6015d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f6016e;

        a(ViewGroupManager viewGroupManager, ViewGroup viewGroup, View view, SparseIntArray sparseIntArray, int i) {
            this.f6012a = viewGroupManager;
            this.f6013b = viewGroup;
            this.f6014c = view;
            this.f6015d = sparseIntArray;
            this.f6016e = i;
        }

        @Override // com.facebook.react.uimanager.h1.f
        public void a() {
            UiThreadUtil.assertOnUiThread();
            this.f6012a.removeView(this.f6013b, this.f6014c);
            m.this.a(this.f6014c);
            this.f6015d.put(this.f6016e, Math.max(0, this.f6015d.get(this.f6016e, 0) - 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements PopupMenu.OnMenuItemClickListener, PopupMenu.OnDismissListener {

        /* renamed from: a  reason: collision with root package name */
        final Callback f6018a;

        /* renamed from: b  reason: collision with root package name */
        boolean f6019b;

        private b(Callback callback) {
            this.f6019b = false;
            this.f6018a = callback;
        }

        /* synthetic */ b(Callback callback, a aVar) {
            this(callback);
        }

        @Override // android.widget.PopupMenu.OnDismissListener
        public void onDismiss(PopupMenu popupMenu) {
            if (!this.f6019b) {
                this.f6018a.invoke("dismissed");
                this.f6019b = true;
            }
        }

        @Override // android.widget.PopupMenu.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (!this.f6019b) {
                this.f6018a.invoke("itemSelected", Integer.valueOf(menuItem.getOrder()));
                this.f6019b = true;
                return true;
            }
            return false;
        }
    }

    public m(a1 a1Var) {
        this(a1Var, new RootViewManager());
    }

    public m(a1 a1Var, RootViewManager rootViewManager) {
        this.f6008e = new com.facebook.react.g0.a();
        this.f6010g = new com.facebook.react.uimanager.h1.e();
        this.f6011h = new SparseArray<>();
        this.i = new int[100];
        this.j = new RectF();
        this.m = 0;
        this.f6007d = a1Var;
        this.f6004a = new SparseArray<>();
        this.f6005b = new SparseArray<>();
        this.f6006c = new SparseBooleanArray();
        this.f6009f = rootViewManager;
    }

    private int a(int i, SparseIntArray sparseIntArray) {
        int i2 = i;
        for (int i3 = 0; i3 <= i; i3++) {
            i2 += sparseIntArray.get(i3);
        }
        return i2;
    }

    private static String a(ViewGroup viewGroup, ViewGroupManager viewGroupManager, int[] iArr, w0[] w0VarArr, int[] iArr2) {
        StringBuilder sb = new StringBuilder();
        if (viewGroup != null) {
            sb.append("View tag:" + viewGroup.getId() + "\n");
            sb.append("  children(" + viewGroupManager.getChildCount(viewGroup) + "): [\n");
            for (int i = 0; i < viewGroupManager.getChildCount(viewGroup); i += 16) {
                int i2 = 0;
                while (true) {
                    int i3 = i + i2;
                    if (i3 < viewGroupManager.getChildCount(viewGroup) && i2 < 16) {
                        sb.append(viewGroupManager.getChildAt(viewGroup, i3).getId() + ",");
                        i2++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (iArr != null) {
            sb.append("  indicesToRemove(" + iArr.length + "): [\n");
            for (int i4 = 0; i4 < iArr.length; i4 += 16) {
                int i5 = 0;
                while (true) {
                    int i6 = i4 + i5;
                    if (i6 < iArr.length && i5 < 16) {
                        sb.append(iArr[i6] + ",");
                        i5++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (w0VarArr != null) {
            sb.append("  viewsToAdd(" + w0VarArr.length + "): [\n");
            for (int i7 = 0; i7 < w0VarArr.length; i7 += 16) {
                int i8 = 0;
                while (true) {
                    int i9 = i7 + i8;
                    if (i9 < w0VarArr.length && i8 < 16) {
                        sb.append("[" + w0VarArr[i9].f6135b + "," + w0VarArr[i9].f6134a + "],");
                        i8++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ],\n");
        }
        if (iArr2 != null) {
            sb.append("  tagsToDelete(" + iArr2.length + "): [\n");
            for (int i10 = 0; i10 < iArr2.length; i10 += 16) {
                int i11 = 0;
                while (true) {
                    int i12 = i10 + i11;
                    if (i12 < iArr2.length && i11 < 16) {
                        sb.append(iArr2[i12] + ",");
                        i11++;
                    }
                }
                sb.append("\n");
            }
            sb.append(" ]\n");
        }
        return sb.toString();
    }

    private void a(View view, int i, int i2, int i3, int i4) {
        if (!this.k || !this.f6010g.a(view)) {
            view.layout(i, i2, i3 + i, i4 + i2);
        } else {
            this.f6010g.a(view, i, i2, i3, i4);
        }
    }

    private void a(View view, RectF rectF) {
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            matrix.mapRect(rectF);
        }
        while (true) {
            rectF.offset(view.getLeft(), view.getTop());
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
                rectF.offset(-view.getScrollX(), -view.getScrollY());
                Matrix matrix2 = view.getMatrix();
                if (!matrix2.isIdentity()) {
                    matrix2.mapRect(rectF);
                }
            } else {
                return;
            }
        }
    }

    private void a(View view, int[] iArr) {
        this.j.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        a(view, this.j);
        iArr[0] = Math.round(this.j.left);
        iArr[1] = Math.round(this.j.top);
        RectF rectF = this.j;
        iArr[2] = Math.round(rectF.right - rectF.left);
        RectF rectF2 = this.j;
        iArr[3] = Math.round(rectF2.bottom - rectF2.top);
    }

    private boolean a(int[] iArr, int i) {
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    private void d(int i) {
        int[] iArr = this.i;
        int i2 = this.m;
        iArr[i2] = i;
        this.m = (i2 + 1) % 100;
    }

    private SparseIntArray e(int i) {
        SparseIntArray sparseIntArray = this.f6011h.get(i);
        if (sparseIntArray == null) {
            SparseIntArray sparseIntArray2 = new SparseIntArray();
            this.f6011h.put(i, sparseIntArray2);
            return sparseIntArray2;
        }
        return sparseIntArray;
    }

    private k0 f(int i) {
        View view = this.f6004a.get(i);
        if (view != null) {
            return (k0) view.getContext();
        }
        throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i);
    }

    public synchronized int a(int i, float f2, float f3) {
        View view;
        UiThreadUtil.assertOnUiThread();
        view = this.f6004a.get(i);
        if (view == null) {
            throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i);
        }
        return l0.a(f2, f3, (ViewGroup) view);
    }

    public void a() {
        this.f6008e.a();
    }

    public synchronized void a(int i) {
        UiThreadUtil.assertOnUiThread();
        if (!this.f6006c.get(i)) {
            SoftAssertions.assertUnreachable("View with tag " + i + " is not registered as a root view");
        }
        a(this.f6004a.get(i));
        this.f6006c.delete(i);
    }

    public void a(int i, int i2) {
        View view = this.f6004a.get(i);
        if (view != null) {
            view.sendAccessibilityEvent(i2);
            return;
        }
        throw new JSApplicationIllegalArgumentException("Could not find view with tag " + i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0057, code lost:
        if (r1.needsCustomLayoutForChildren() == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void a(int r11, int r12, int r13, int r14, int r15, int r16) {
        /*
            r10 = this;
            r7 = r10
            r0 = r11
            r1 = r12
            monitor-enter(r10)
            com.facebook.react.bridge.UiThreadUtil.assertOnUiThread()     // Catch: java.lang.Throwable -> L89
            java.lang.String r2 = "NativeViewHierarchyManager_updateLayout"
            r8 = 0
            com.facebook.systrace.b$b r2 = com.facebook.systrace.b.a(r8, r2)     // Catch: java.lang.Throwable -> L89
            java.lang.String r3 = "parentTag"
            r2.a(r3, r11)     // Catch: java.lang.Throwable -> L89
            java.lang.String r3 = "tag"
            r2.a(r3, r12)     // Catch: java.lang.Throwable -> L89
            r2.a()     // Catch: java.lang.Throwable -> L89
            android.view.View r2 = r10.b(r12)     // Catch: java.lang.Throwable -> L84
            r1 = 1073741824(0x40000000, float:2.0)
            r5 = r15
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r1)     // Catch: java.lang.Throwable -> L84
            r6 = r16
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r6, r1)     // Catch: java.lang.Throwable -> L84
            r2.measure(r3, r1)     // Catch: java.lang.Throwable -> L84
            android.view.ViewParent r1 = r2.getParent()     // Catch: java.lang.Throwable -> L84
            boolean r3 = r1 instanceof com.facebook.react.uimanager.f0     // Catch: java.lang.Throwable -> L84
            if (r3 == 0) goto L3b
            r1.requestLayout()     // Catch: java.lang.Throwable -> L84
        L3b:
            android.util.SparseBooleanArray r1 = r7.f6006c     // Catch: java.lang.Throwable -> L84
            boolean r1 = r1.get(r11)     // Catch: java.lang.Throwable -> L84
            if (r1 != 0) goto L59
            android.util.SparseArray<com.facebook.react.uimanager.ViewManager> r1 = r7.f6005b     // Catch: java.lang.Throwable -> L84
            java.lang.Object r1 = r1.get(r11)     // Catch: java.lang.Throwable -> L84
            com.facebook.react.uimanager.ViewManager r1 = (com.facebook.react.uimanager.ViewManager) r1     // Catch: java.lang.Throwable -> L84
            boolean r3 = r1 instanceof com.facebook.react.uimanager.f     // Catch: java.lang.Throwable -> L84
            if (r3 == 0) goto L63
            com.facebook.react.uimanager.f r1 = (com.facebook.react.uimanager.f) r1     // Catch: java.lang.Throwable -> L84
            if (r1 == 0) goto L7f
            boolean r0 = r1.needsCustomLayoutForChildren()     // Catch: java.lang.Throwable -> L84
            if (r0 != 0) goto L7f
        L59:
            r1 = r10
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r1.a(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L84
            goto L7f
        L63:
            com.facebook.react.uimanager.g r1 = new com.facebook.react.uimanager.g     // Catch: java.lang.Throwable -> L84
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L84
            r2.<init>()     // Catch: java.lang.Throwable -> L84
            java.lang.String r3 = "Trying to use view with tag "
            r2.append(r3)     // Catch: java.lang.Throwable -> L84
            r2.append(r11)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = " as a parent, but its Manager doesn't implement IViewManagerWithChildren"
            r2.append(r0)     // Catch: java.lang.Throwable -> L84
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L84
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L84
            throw r1     // Catch: java.lang.Throwable -> L84
        L7f:
            com.facebook.systrace.a.a(r8)     // Catch: java.lang.Throwable -> L89
            monitor-exit(r10)
            return
        L84:
            r0 = move-exception
            com.facebook.systrace.a.a(r8)     // Catch: java.lang.Throwable -> L89
            throw r0     // Catch: java.lang.Throwable -> L89
        L89:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.m.a(int, int, int, int, int, int):void");
    }

    @Deprecated
    public synchronized void a(int i, int i2, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        View view = this.f6004a.get(i);
        if (view == null) {
            throw new g("Trying to send command to a non-existing view with tag " + i);
        }
        c(i).receiveCommand((ViewManager) view, i2, readableArray);
    }

    public synchronized void a(int i, int i2, boolean z) {
        if (!z) {
            this.f6008e.a(i2, (ViewParent) null);
            return;
        }
        View view = this.f6004a.get(i);
        if (i2 != i && (view instanceof ViewParent)) {
            this.f6008e.a(i2, (ViewParent) view);
            return;
        }
        if (this.f6006c.get(i)) {
            SoftAssertions.assertUnreachable("Cannot block native responder on " + i + " that is a root view");
        }
        this.f6008e.a(i2, view.getParent());
    }

    public synchronized void a(int i, View view) {
        b(i, view);
    }

    public synchronized void a(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        UiThreadUtil.assertOnUiThread();
        View view = this.f6004a.get(i);
        if (view == null) {
            callback2.invoke("Can't display popup. Could not find view with tag " + i);
            return;
        }
        this.l = new PopupMenu(f(i), view);
        Menu menu = this.l.getMenu();
        for (int i2 = 0; i2 < readableArray.size(); i2++) {
            menu.add(0, 0, i2, readableArray.getString(i2));
        }
        b bVar = new b(callback, null);
        this.l.setOnMenuItemClickListener(bVar);
        this.l.setOnDismissListener(bVar);
        this.l.show();
    }

    public synchronized void a(int i, c0 c0Var) {
        UiThreadUtil.assertOnUiThread();
        try {
            ViewManager c2 = c(i);
            View b2 = b(i);
            if (c0Var != null) {
                c2.updateProperties(b2, c0Var);
            }
        } catch (g e2) {
            String str = n;
            c.d.d.e.a.b(str, "Unable to update properties for view tag " + i, e2);
        }
    }

    public synchronized void a(int i, Object obj) {
        UiThreadUtil.assertOnUiThread();
        c(i).updateExtraData(b(i), obj);
    }

    public synchronized void a(int i, String str, ReadableArray readableArray) {
        UiThreadUtil.assertOnUiThread();
        View view = this.f6004a.get(i);
        if (view == null) {
            throw new g("Trying to send command to a non-existing view with tag " + i);
        }
        c(i).receiveCommand((ViewManager) view, str, readableArray);
    }

    public synchronized void a(int i, int[] iArr) {
        UiThreadUtil.assertOnUiThread();
        View view = this.f6004a.get(i);
        if (view == null) {
            throw new o("No native view for " + i + " currently exists");
        }
        View view2 = (View) g0.a(view);
        if (view2 == null) {
            throw new o("Native view " + i + " is no longer on screen");
        }
        a(view2, iArr);
        int i2 = iArr[0];
        int i3 = iArr[1];
        a(view, iArr);
        iArr[0] = iArr[0] - i2;
        iArr[1] = iArr[1] - i3;
    }

    public synchronized void a(int i, int[] iArr, w0[] w0VarArr, int[] iArr2, int[] iArr3) {
        int[] iArr4 = iArr;
        w0[] w0VarArr2 = w0VarArr;
        synchronized (this) {
            UiThreadUtil.assertOnUiThread();
            SparseIntArray e2 = e(i);
            ViewGroup viewGroup = (ViewGroup) this.f6004a.get(i);
            ViewGroupManager viewGroupManager = (ViewGroupManager) c(i);
            if (viewGroup == null) {
                throw new g("Trying to manageChildren view with tag " + i + " which doesn't exist\n detail: " + a(viewGroup, viewGroupManager, iArr4, w0VarArr2, iArr2));
            }
            int childCount = viewGroupManager.getChildCount(viewGroup);
            if (iArr4 != null) {
                int length = iArr4.length - 1;
                while (length >= 0) {
                    int i2 = iArr4[length];
                    if (i2 < 0) {
                        throw new g("Trying to remove a negative view index:" + i2 + " view tag: " + i + "\n detail: " + a(viewGroup, viewGroupManager, iArr4, w0VarArr2, iArr2));
                    } else if (i2 >= viewGroupManager.getChildCount(viewGroup)) {
                        if (this.f6006c.get(i) && viewGroupManager.getChildCount(viewGroup) == 0) {
                            return;
                        }
                        throw new g("Trying to remove a view index above child count " + i2 + " view tag: " + i + "\n detail: " + a(viewGroup, viewGroupManager, iArr4, w0VarArr2, iArr2));
                    } else if (i2 >= childCount) {
                        throw new g("Trying to remove an out of order view index:" + i2 + " view tag: " + i + "\n detail: " + a(viewGroup, viewGroupManager, iArr4, w0VarArr2, iArr2));
                    } else {
                        int a2 = a(i2, e2);
                        View childAt = viewGroupManager.getChildAt(viewGroup, a2);
                        if (!this.k || !this.f6010g.a(childAt) || !a(iArr2, childAt.getId())) {
                            viewGroupManager.removeViewAt(viewGroup, a2);
                        }
                        length--;
                        childCount = i2;
                    }
                }
            }
            int i3 = 0;
            if (iArr2 != null) {
                int i4 = 0;
                while (i4 < iArr2.length) {
                    int i5 = iArr2[i4];
                    int i6 = iArr3[i4];
                    View view = this.f6004a.get(i5);
                    if (view == null) {
                        throw new g("Trying to destroy unknown view tag: " + i5 + "\n detail: " + a(viewGroup, viewGroupManager, iArr, w0VarArr, iArr2));
                    }
                    if (!this.k || !this.f6010g.a(view)) {
                        a(view);
                    } else {
                        e2.put(i6, e2.get(i6, i3) + 1);
                        this.f6010g.a(view, new a(viewGroupManager, viewGroup, view, e2, i6));
                    }
                    i4++;
                    iArr4 = iArr;
                    w0VarArr2 = w0VarArr;
                    i3 = 0;
                }
            }
            int[] iArr5 = iArr4;
            w0[] w0VarArr3 = w0VarArr2;
            if (w0VarArr3 != null) {
                for (w0 w0Var : w0VarArr3) {
                    View view2 = this.f6004a.get(w0Var.f6134a);
                    if (view2 == null) {
                        throw new g("Trying to add unknown view tag: " + w0Var.f6134a + "\n detail: " + a(viewGroup, viewGroupManager, iArr5, w0VarArr3, iArr2));
                    }
                    viewGroupManager.addView(viewGroup, view2, a(w0Var.f6135b, e2));
                }
            }
        }
    }

    protected synchronized void a(View view) {
        UiThreadUtil.assertOnUiThread();
        if (view == null) {
            return;
        }
        if (com.facebook.react.b0.a.f5411c) {
            d(view.getId());
        }
        if (this.f6005b.get(view.getId()) == null) {
            return;
        }
        if (!this.f6006c.get(view.getId())) {
            c(view.getId()).onDropViewInstance(view);
        }
        ViewManager viewManager = this.f6005b.get(view.getId());
        if ((view instanceof ViewGroup) && (viewManager instanceof ViewGroupManager)) {
            ViewGroup viewGroup = (ViewGroup) view;
            ViewGroupManager viewGroupManager = (ViewGroupManager) viewManager;
            for (int childCount = viewGroupManager.getChildCount(viewGroup) - 1; childCount >= 0; childCount--) {
                View childAt = viewGroupManager.getChildAt(viewGroup, childCount);
                if (childAt == null) {
                    c.d.d.e.a.b(n, "Unable to drop null child view");
                } else if (this.f6004a.get(childAt.getId()) != null) {
                    a(childAt);
                }
            }
            viewGroupManager.removeAllViews(viewGroup);
        }
        this.f6011h.remove(view.getId());
        this.f6004a.remove(view.getId());
        this.f6005b.remove(view.getId());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ReadableMap readableMap, Callback callback) {
        this.f6010g.a(readableMap, callback);
    }

    public synchronized void a(k0 k0Var, int i, String str, c0 c0Var) {
        UiThreadUtil.assertOnUiThread();
        b.AbstractC0140b a2 = com.facebook.systrace.b.a(0L, "NativeViewHierarchyManager_createView");
        a2.a("tag", i);
        a2.a("className", str);
        a2.a();
        ViewManager a3 = this.f6007d.a(str);
        View createView = a3.createView(k0Var, null, null, this.f6008e);
        this.f6004a.put(i, createView);
        this.f6005b.put(i, a3);
        createView.setId(i);
        if (c0Var != null) {
            a3.updateProperties(createView, c0Var);
        }
        com.facebook.systrace.a.a(0L);
    }

    public void a(boolean z) {
        this.k = z;
    }

    public final synchronized View b(int i) {
        View view;
        view = this.f6004a.get(i);
        if (view == null) {
            throw new g("Trying to resolve view with tag " + i + " which doesn't exist");
        }
        return view;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        this.f6010g.a();
    }

    protected final synchronized void b(int i, View view) {
        if (view.getId() != -1) {
            String str = n;
            c.d.d.e.a.b(str, "Trying to add a root view with an explicit id (" + view.getId() + ") already set. React Native uses the id field to track react tags and will overwrite this field. If that is fine, explicitly overwrite the id field to View.NO_ID before calling addRootView.");
        }
        this.f6004a.put(i, view);
        this.f6005b.put(i, this.f6009f);
        this.f6006c.put(i, true);
        view.setId(i);
    }

    public synchronized void b(int i, int[] iArr) {
        UiThreadUtil.assertOnUiThread();
        View view = this.f6004a.get(i);
        if (view == null) {
            throw new o("No native view for " + i + " currently exists");
        }
        view.getLocationOnScreen(iArr);
        Resources resources = view.getContext().getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            iArr[1] = iArr[1] - ((int) resources.getDimension(identifier));
        }
        iArr[2] = view.getWidth();
        iArr[3] = view.getHeight();
    }

    public final synchronized ViewManager c(int i) {
        ViewManager viewManager;
        viewManager = this.f6005b.get(i);
        if (viewManager == null) {
            boolean contains = Arrays.asList(this.i).contains(Integer.valueOf(i));
            throw new g("ViewManager for tag " + i + " could not be found.\n View already dropped? " + contains + ".\nLast index " + this.m + " in last 100 views" + this.i.toString());
        }
        return viewManager;
    }

    public void c() {
        PopupMenu popupMenu = this.l;
        if (popupMenu != null) {
            popupMenu.dismiss();
        }
    }
}
