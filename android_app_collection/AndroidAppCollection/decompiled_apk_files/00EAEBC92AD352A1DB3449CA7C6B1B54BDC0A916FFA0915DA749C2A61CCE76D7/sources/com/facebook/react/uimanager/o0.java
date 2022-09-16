package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableArray;
import com.facebook.systrace.b;
import java.util.Map;
/* loaded from: classes.dex */
public class o0 {

    /* renamed from: a  reason: collision with root package name */
    protected Object f6026a;

    /* renamed from: b  reason: collision with root package name */
    protected final com.facebook.react.uimanager.events.d f6027b;

    /* renamed from: c  reason: collision with root package name */
    protected final ReactApplicationContext f6028c;

    /* renamed from: d  reason: collision with root package name */
    protected final h0 f6029d;

    /* renamed from: e  reason: collision with root package name */
    private final a1 f6030e;

    /* renamed from: f  reason: collision with root package name */
    private final v0 f6031f;

    /* renamed from: g  reason: collision with root package name */
    private final n f6032g;

    /* renamed from: h  reason: collision with root package name */
    private final int[] f6033h;
    private long i;
    protected b j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a0 f6034b;

        a(a0 a0Var) {
            this.f6034b = a0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            o0.this.f6029d.b(this.f6034b);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(a0 a0Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o0(ReactApplicationContext reactApplicationContext, a1 a1Var, com.facebook.react.uimanager.events.d dVar, int i) {
        this(reactApplicationContext, a1Var, new v0(reactApplicationContext, new m(a1Var), i), dVar);
    }

    protected o0(ReactApplicationContext reactApplicationContext, a1 a1Var, v0 v0Var, com.facebook.react.uimanager.events.d dVar) {
        this.f6026a = new Object();
        this.f6029d = new h0();
        this.f6033h = new int[4];
        this.i = 0L;
        this.f6028c = reactApplicationContext;
        this.f6030e = a1Var;
        this.f6031f = v0Var;
        this.f6032g = new n(this.f6031f, this.f6029d);
        this.f6027b = dVar;
    }

    private void a(int i, int i2, int[] iArr) {
        a0 a2 = this.f6029d.a(i);
        a0 a3 = this.f6029d.a(i2);
        if (a2 == null || a3 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Tag ");
            if (a2 != null) {
                i = i2;
            }
            sb.append(i);
            sb.append(" does not exist");
            throw new g(sb.toString());
        }
        if (a2 != a3) {
            for (a0 parent = a2.getParent(); parent != a3; parent = parent.getParent()) {
                if (parent == null) {
                    throw new g("Tag " + i2 + " is not an ancestor of tag " + i);
                }
            }
        }
        a(a2, a3, iArr);
    }

    private void a(int i, String str) {
        if (this.f6029d.a(i) != null) {
            return;
        }
        throw new g("Unable to execute operation " + str + " on view with tag: " + i + ", since the view does not exists");
    }

    private void a(int i, int[] iArr) {
        a0 a2 = this.f6029d.a(i);
        if (a2 == null) {
            throw new g("No native view for tag " + i + " exists!");
        }
        a0 parent = a2.getParent();
        if (parent != null) {
            a(a2, parent, iArr);
            return;
        }
        throw new g("View with tag " + i + " doesn't have a parent!");
    }

    private void a(a0 a0Var, a0 a0Var2, int[] iArr) {
        int i;
        int i2;
        if (a0Var != a0Var2) {
            i = Math.round(a0Var.u());
            i2 = Math.round(a0Var.p());
            for (a0 parent = a0Var.getParent(); parent != a0Var2; parent = parent.getParent()) {
                c.d.k.a.a.a(parent);
                c(parent);
                i += Math.round(parent.u());
                i2 += Math.round(parent.p());
            }
            c(a0Var2);
        } else {
            i = 0;
            i2 = 0;
        }
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = a0Var.b();
        iArr[3] = a0Var.c();
    }

    private void c(a0 a0Var) {
        ViewManager a2 = this.f6030e.a(a0Var.m());
        c.d.k.a.a.a(a2);
        ViewManager viewManager = a2;
        if (!(viewManager instanceof f)) {
            throw new g("Trying to use view " + a0Var.m() + " as a parent, but its Manager doesn't extends ViewGroupManager");
        }
        f fVar = (f) viewManager;
        if (fVar == null || !fVar.needsCustomLayoutForChildren()) {
            return;
        }
        throw new g("Trying to measure a view using measureLayout/measureLayoutRelativeToParent relative to an ancestor that requires custom layout for it's children (" + a0Var.m() + "). Use measure instead.");
    }

    private void d(a0 a0Var) {
        if (!a0Var.n()) {
            return;
        }
        for (int i = 0; i < a0Var.a(); i++) {
            d(a0Var.a(i));
        }
        a0Var.a(this.f6032g);
    }

    private void e(a0 a0Var) {
        n.d(a0Var);
        this.f6029d.d(a0Var.t());
        for (int a2 = a0Var.a() - 1; a2 >= 0; a2--) {
            e(a0Var.a(a2));
        }
        a0Var.s();
    }

    private void k() {
        if (this.f6031f.e()) {
            a(-1);
        }
    }

    protected a0 a(String str) {
        return this.f6030e.a(str).createShadowNodeInstance(this.f6028c);
    }

    public void a() {
        this.f6031f.a();
    }

    public void a(int i) {
        b.AbstractC0140b a2 = com.facebook.systrace.b.a(0L, "UIImplementation.dispatchViewUpdates");
        a2.a("batchId", i);
        a2.a();
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            j();
            this.f6032g.a();
            this.f6031f.a(i, uptimeMillis, this.i);
        } finally {
            com.facebook.systrace.a.a(0L);
        }
    }

    public void a(int i, float f2, float f3, Callback callback) {
        this.f6031f.a(i, f2, f3, callback);
    }

    public void a(int i, int i2) {
        if (this.f6029d.c(i) || this.f6029d.c(i2)) {
            throw new g("Trying to add or replace a root tag!");
        }
        a0 a2 = this.f6029d.a(i);
        if (a2 == null) {
            throw new g("Trying to replace unknown view tag: " + i);
        }
        a0 parent = a2.getParent();
        if (parent == null) {
            throw new g("Node is not attached to a parent: " + i);
        }
        int a3 = parent.a(a2);
        if (a3 < 0) {
            throw new IllegalStateException("Didn't find child tag in parent");
        }
        WritableArray createArray = Arguments.createArray();
        createArray.pushInt(i2);
        WritableArray createArray2 = Arguments.createArray();
        createArray2.pushInt(a3);
        WritableArray createArray3 = Arguments.createArray();
        createArray3.pushInt(a3);
        a(parent.t(), null, null, createArray, createArray2, createArray3);
    }

    public void a(int i, int i2, int i3) {
        a0 a2 = this.f6029d.a(i);
        if (a2 != null) {
            a2.b(i2);
            a2.a(i3);
            k();
            return;
        }
        c.d.d.e.a.d("ReactNative", "Tried to update size of non-existent tag: " + i);
    }

    @Deprecated
    public void a(int i, int i2, Callback callback) {
        a0 a2 = this.f6029d.a(i);
        a0 a3 = this.f6029d.a(i2);
        if (a2 == null || a3 == null) {
            callback.invoke(false);
        } else {
            callback.invoke(Boolean.valueOf(a2.c(a3)));
        }
    }

    public void a(int i, int i2, Callback callback, Callback callback2) {
        try {
            a(i, i2, this.f6033h);
            callback2.invoke(Float.valueOf(q.a(this.f6033h[0])), Float.valueOf(q.a(this.f6033h[1])), Float.valueOf(q.a(this.f6033h[2])), Float.valueOf(q.a(this.f6033h[3])));
        } catch (g e2) {
            callback.invoke(e2.getMessage());
        }
    }

    @Deprecated
    public void a(int i, int i2, ReadableArray readableArray) {
        a(i, "dispatchViewManagerCommand");
        this.f6031f.a(i, i2, readableArray);
    }

    public void a(int i, Callback callback) {
        this.f6031f.a(i, callback);
    }

    public void a(int i, Callback callback, Callback callback2) {
        try {
            a(i, this.f6033h);
            callback2.invoke(Float.valueOf(q.a(this.f6033h[0])), Float.valueOf(q.a(this.f6033h[1])), Float.valueOf(q.a(this.f6033h[2])), Float.valueOf(q.a(this.f6033h[3])));
        } catch (g e2) {
            callback.invoke(e2.getMessage());
        }
    }

    public void a(int i, ReadableArray readableArray) {
        synchronized (this.f6026a) {
            a0 a2 = this.f6029d.a(i);
            for (int i2 = 0; i2 < readableArray.size(); i2++) {
                a0 a3 = this.f6029d.a(readableArray.getInt(i2));
                if (a3 == null) {
                    throw new g("Trying to add unknown view tag: " + readableArray.getInt(i2));
                }
                a2.a(a3, i2);
            }
            this.f6032g.a(a2, readableArray);
        }
    }

    public void a(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
        a(i, "showPopupMenu");
        this.f6031f.a(i, readableArray, callback, callback2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
        if (r24 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004a, code lost:
        if (r11 != r24.size()) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0054, code lost:
        throw new com.facebook.react.uimanager.g("Size of addChildTags != size of addAtIndices!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r20, com.facebook.react.bridge.ReadableArray r21, com.facebook.react.bridge.ReadableArray r22, com.facebook.react.bridge.ReadableArray r23, com.facebook.react.bridge.ReadableArray r24, com.facebook.react.bridge.ReadableArray r25) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.uimanager.o0.a(int, com.facebook.react.bridge.ReadableArray, com.facebook.react.bridge.ReadableArray, com.facebook.react.bridge.ReadableArray, com.facebook.react.bridge.ReadableArray, com.facebook.react.bridge.ReadableArray):void");
    }

    public void a(int i, c0 c0Var) {
        UiThreadUtil.assertOnUiThread();
        this.f6031f.c().a(i, c0Var);
    }

    public void a(int i, Object obj) {
        a0 a2 = this.f6029d.a(i);
        if (a2 != null) {
            a2.a(obj);
            k();
            return;
        }
        c.d.d.e.a.d("ReactNative", "Attempt to set local data for view with unknown tag: " + i);
    }

    public void a(int i, String str, int i2, ReadableMap readableMap) {
        synchronized (this.f6026a) {
            a0 a2 = a(str);
            a0 a3 = this.f6029d.a(i2);
            c.d.k.a.a.a(a3, "Root node with tag " + i2 + " doesn't exist");
            a2.c(i);
            a2.a(str);
            a2.e(a3.t());
            a2.a(a3.i());
            this.f6029d.a(a2);
            c0 c0Var = null;
            if (readableMap != null) {
                c0Var = new c0(readableMap);
                a2.a(c0Var);
            }
            a(a2, i2, c0Var);
        }
    }

    public void a(int i, String str, ReadableArray readableArray) {
        a(i, "dispatchViewManagerCommand");
        this.f6031f.a(i, str, readableArray);
    }

    public void a(int i, String str, ReadableMap readableMap) {
        if (this.f6030e.a(str) == null) {
            throw new g("Got unknown view type: " + str);
        }
        a0 a2 = this.f6029d.a(i);
        if (a2 == null) {
            throw new g("Trying to update non-existent view with tag " + i);
        } else if (readableMap == null) {
        } else {
            c0 c0Var = new c0(readableMap);
            a2.a(c0Var);
            a(a2, str, c0Var);
        }
    }

    public void a(int i, boolean z) {
        a0 a2 = this.f6029d.a(i);
        if (a2 == null) {
            return;
        }
        while (a2.j() == l.NONE) {
            a2 = a2.getParent();
        }
        this.f6031f.a(a2.t(), i, z);
    }

    public <T extends View> void a(T t, int i, k0 k0Var) {
        synchronized (this.f6026a) {
            a0 b2 = b();
            b2.c(i);
            b2.a(k0Var);
            k0Var.runOnNativeModulesQueueThread(new a(b2));
            this.f6031f.a(i, (View) t);
        }
    }

    public void a(ReadableMap readableMap, Callback callback) {
        this.f6031f.a(readableMap, callback);
    }

    protected void a(a0 a0Var) {
        b.AbstractC0140b a2 = com.facebook.systrace.b.a(0L, "cssRoot.calculateLayout");
        a2.a("rootTag", a0Var.t());
        a2.a();
        long uptimeMillis = SystemClock.uptimeMillis();
        try {
            int intValue = a0Var.getWidthMeasureSpec().intValue();
            int intValue2 = a0Var.getHeightMeasureSpec().intValue();
            float f2 = Float.NaN;
            float size = View.MeasureSpec.getMode(intValue) == 0 ? Float.NaN : View.MeasureSpec.getSize(intValue);
            if (View.MeasureSpec.getMode(intValue2) != 0) {
                f2 = View.MeasureSpec.getSize(intValue2);
            }
            a0Var.a(size, f2);
        } finally {
            com.facebook.systrace.a.a(0L);
            this.i = SystemClock.uptimeMillis() - uptimeMillis;
        }
    }

    protected void a(a0 a0Var, float f2, float f3) {
        if (!a0Var.n()) {
            return;
        }
        Iterable<? extends a0> r = a0Var.r();
        if (r != null) {
            for (a0 a0Var2 : r) {
                a(a0Var2, a0Var.u() + f2, a0Var.p() + f3);
            }
        }
        int t = a0Var.t();
        if (!this.f6029d.c(t) && a0Var.a(f2, f3, this.f6031f, this.f6032g) && a0Var.l()) {
            this.f6027b.a(p.b(t, a0Var.q(), a0Var.h(), a0Var.b(), a0Var.c()));
        }
        a0Var.e();
    }

    public void a(a0 a0Var, int i, int i2) {
        a0Var.a(i, i2);
    }

    protected void a(a0 a0Var, int i, c0 c0Var) {
        if (!a0Var.y()) {
            this.f6032g.a(a0Var, a0Var.i(), c0Var);
        }
    }

    protected void a(a0 a0Var, String str, c0 c0Var) {
        if (!a0Var.y()) {
            this.f6032g.a(a0Var, str, c0Var);
        }
    }

    public void a(com.facebook.react.uimanager.g1.a aVar) {
        this.f6031f.a(aVar);
    }

    public void a(n0 n0Var) {
        this.f6031f.a(n0Var);
    }

    public void a(boolean z) {
        this.f6031f.a(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final ViewManager b(String str) {
        return this.f6030e.b(str);
    }

    protected a0 b() {
        b0 b0Var = new b0();
        if (com.facebook.react.modules.i18nmanager.a.a().b(this.f6028c)) {
            b0Var.a(com.facebook.yoga.h.RTL);
        }
        b0Var.a("Root");
        return b0Var;
    }

    public void b(int i) {
        synchronized (this.f6026a) {
            this.f6029d.e(i);
        }
    }

    public void b(int i, int i2) {
        this.f6031f.a(i, i2);
    }

    public void b(int i, int i2, int i3) {
        a0 a2 = this.f6029d.a(i);
        if (a2 != null) {
            a(a2, i2, i3);
            return;
        }
        c.d.d.e.a.d("ReactNative", "Tried to update non-existent root tag: " + i);
    }

    public void b(int i, Callback callback) {
        this.f6031f.b(i, callback);
    }

    protected final void b(a0 a0Var) {
        e(a0Var);
        a0Var.f();
    }

    public void b(n0 n0Var) {
        this.f6031f.b(n0Var);
    }

    public void c() {
        this.f6031f.b();
    }

    public void c(int i) {
        b(i);
        this.f6031f.a(i);
    }

    public Map<String, Long> d() {
        return this.f6031f.d();
    }

    public void d(int i) {
        a0 a2 = this.f6029d.a(i);
        if (a2 == null) {
            throw new g("Trying to remove subviews of an unknown view tag: " + i);
        }
        WritableArray createArray = Arguments.createArray();
        for (int i2 = 0; i2 < a2.a(); i2++) {
            createArray.pushInt(i2);
        }
        a(i, null, null, null, null, createArray);
    }

    public int e(int i) {
        if (this.f6029d.c(i)) {
            return i;
        }
        a0 f2 = f(i);
        if (f2 != null) {
            return f2.k();
        }
        c.d.d.e.a.d("ReactNative", "Warning : attempted to resolve a non-existent react shadow node. reactTag=" + i);
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public v0 e() {
        return this.f6031f;
    }

    public final a0 f(int i) {
        return this.f6029d.a(i);
    }

    public void f() {
    }

    public void g() {
        this.f6031f.f();
    }

    public void h() {
        this.f6031f.h();
    }

    public void i() {
        this.f6031f.g();
    }

    protected void j() {
        com.facebook.systrace.a.a(0L, "UIImplementation.updateViewHierarchy");
        for (int i = 0; i < this.f6029d.a(); i++) {
            try {
                a0 a2 = this.f6029d.a(this.f6029d.b(i));
                if (a2.getWidthMeasureSpec() != null && a2.getHeightMeasureSpec() != null) {
                    b.AbstractC0140b a3 = com.facebook.systrace.b.a(0L, "UIImplementation.notifyOnBeforeLayoutRecursive");
                    a3.a("rootTag", a2.t());
                    a3.a();
                    d(a2);
                    com.facebook.systrace.a.a(0L);
                    a(a2);
                    b.AbstractC0140b a4 = com.facebook.systrace.b.a(0L, "UIImplementation.applyUpdatesRecursive");
                    a4.a("rootTag", a2.t());
                    a4.a();
                    a(a2, 0.0f, 0.0f);
                    com.facebook.systrace.a.a(0L);
                    if (this.j != null) {
                        this.f6031f.a(a2, this.j);
                    }
                }
            } finally {
                com.facebook.systrace.a.a(0L);
            }
        }
    }
}
