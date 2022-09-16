package com.facebook.react.uimanager;

import android.os.SystemClock;
import android.view.View;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.modules.core.g;
import com.facebook.react.uimanager.o0;
import com.facebook.systrace.b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public class v0 {

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.react.uimanager.m f6058b;

    /* renamed from: e  reason: collision with root package name */
    private final i f6061e;

    /* renamed from: f  reason: collision with root package name */
    private final ReactApplicationContext f6062f;
    private com.facebook.react.uimanager.g1.a j;
    private long n;
    private long o;
    private long p;
    private long q;
    private long r;
    private long s;
    private long t;
    private long u;
    private long v;
    private long w;
    private long x;
    private long y;

    /* renamed from: a  reason: collision with root package name */
    private final int[] f6057a = new int[4];

    /* renamed from: c  reason: collision with root package name */
    private final Object f6059c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final Object f6060d = new Object();

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<t> f6063g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<Runnable> f6064h = new ArrayList<>();
    private ArrayDeque<t> i = new ArrayDeque<>();
    private boolean k = false;
    private boolean l = false;
    private boolean m = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f6065b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ArrayDeque f6066c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ArrayList f6067d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f6068e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f6069f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f6070g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ long f6071h;

        a(int i, ArrayDeque arrayDeque, ArrayList arrayList, long j, long j2, long j3, long j4) {
            this.f6065b = i;
            this.f6066c = arrayDeque;
            this.f6067d = arrayList;
            this.f6068e = j;
            this.f6069f = j2;
            this.f6070g = j3;
            this.f6071h = j4;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.AbstractC0140b a2 = com.facebook.systrace.b.a(0L, "DispatchUI");
            a2.a("BatchId", this.f6065b);
            a2.a();
            try {
                try {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    if (this.f6066c != null) {
                        Iterator it = this.f6066c.iterator();
                        while (it.hasNext()) {
                            ((t) it.next()).execute();
                        }
                    }
                    if (this.f6067d != null) {
                        Iterator it2 = this.f6067d.iterator();
                        while (it2.hasNext()) {
                            ((t) it2.next()).execute();
                        }
                    }
                    if (v0.this.m && v0.this.o == 0) {
                        v0.this.o = this.f6068e;
                        v0.this.p = SystemClock.uptimeMillis();
                        v0.this.q = this.f6069f;
                        v0.this.r = this.f6070g;
                        v0.this.s = uptimeMillis;
                        v0.this.t = v0.this.p;
                        v0.this.w = this.f6071h;
                        com.facebook.systrace.a.a(0L, "delayBeforeDispatchViewUpdates", 0, v0.this.o * 1000000);
                        com.facebook.systrace.a.b(0L, "delayBeforeDispatchViewUpdates", 0, v0.this.r * 1000000);
                        com.facebook.systrace.a.a(0L, "delayBeforeBatchRunStart", 0, v0.this.r * 1000000);
                        com.facebook.systrace.a.b(0L, "delayBeforeBatchRunStart", 0, v0.this.s * 1000000);
                    }
                    v0.this.f6058b.b();
                    if (v0.this.j != null) {
                        v0.this.j.b();
                    }
                } catch (Exception e2) {
                    v0.this.l = true;
                    throw e2;
                }
            } finally {
                com.facebook.systrace.a.a(0L);
            }
        }
    }

    /* loaded from: classes.dex */
    class b extends GuardedRunnable {
        b(ReactContext reactContext) {
            super(reactContext);
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            v0.this.i();
        }
    }

    /* loaded from: classes.dex */
    private final class c extends x {

        /* renamed from: b  reason: collision with root package name */
        private final int f6073b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f6074c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f6075d;

        public c(int i, int i2, boolean z, boolean z2) {
            super(v0.this, i);
            this.f6073b = i2;
            this.f6075d = z;
            this.f6074c = z2;
        }

        @Override // com.facebook.react.uimanager.v0.t
        public void execute() {
            if (!this.f6075d) {
                v0.this.f6058b.a(this.f6132a, this.f6073b, this.f6074c);
            } else {
                v0.this.f6058b.a();
            }
        }
    }

    /* loaded from: classes.dex */
    private class d implements t {

        /* renamed from: a  reason: collision with root package name */
        private final ReadableMap f6077a;

        /* renamed from: b  reason: collision with root package name */
        private final Callback f6078b;

        private d(ReadableMap readableMap, Callback callback) {
            this.f6077a = readableMap;
            this.f6078b = callback;
        }

        /* synthetic */ d(v0 v0Var, ReadableMap readableMap, Callback callback, a aVar) {
            this(readableMap, callback);
        }

        @Override // com.facebook.react.uimanager.v0.t
        public void execute() {
            v0.this.f6058b.a(this.f6077a, this.f6078b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class e extends x {

        /* renamed from: b  reason: collision with root package name */
        private final k0 f6080b;

        /* renamed from: c  reason: collision with root package name */
        private final String f6081c;

        /* renamed from: d  reason: collision with root package name */
        private final c0 f6082d;

        public e(k0 k0Var, int i, String str, c0 c0Var) {
            super(v0.this, i);
            this.f6080b = k0Var;
            this.f6081c = str;
            this.f6082d = c0Var;
            com.facebook.systrace.a.d(0L, "createView", this.f6132a);
        }

        @Override // com.facebook.react.uimanager.v0.t
        public void execute() {
            com.facebook.systrace.a.b(0L, "createView", this.f6132a);
            v0.this.f6058b.a(this.f6080b, this.f6132a, this.f6081c, this.f6082d);
        }
    }

    /* loaded from: classes.dex */
    private final class f implements t {
        private f() {
        }

        /* synthetic */ f(v0 v0Var, a aVar) {
            this();
        }

        @Override // com.facebook.react.uimanager.v0.t
        public void execute() {
            v0.this.f6058b.c();
        }
    }

    @Deprecated
    /* loaded from: classes.dex */
    private final class g extends x {

        /* renamed from: b  reason: collision with root package name */
        private final int f6085b;

        /* renamed from: c  reason: collision with root package name */
        private final ReadableArray f6086c;

        public g(int i, int i2, ReadableArray readableArray) {
            super(v0.this, i);
            this.f6085b = i2;
            this.f6086c = readableArray;
        }

        @Override // com.facebook.react.uimanager.v0.t
        public void execute() {
            v0.this.f6058b.a(this.f6132a, this.f6085b, this.f6086c);
        }
    }

    /* loaded from: classes.dex */
    private final class h extends x {

        /* renamed from: b  reason: collision with root package name */
        private final String f6088b;

        /* renamed from: c  reason: collision with root package name */
        private final ReadableArray f6089c;

        public h(int i, String str, ReadableArray readableArray) {
            super(v0.this, i);
            this.f6088b = str;
            this.f6089c = readableArray;
        }

        @Override // com.facebook.react.uimanager.v0.t
        public void execute() {
            v0.this.f6058b.a(this.f6132a, this.f6088b, this.f6089c);
        }
    }

    /* loaded from: classes.dex */
    private class i extends com.facebook.react.uimanager.e {

        /* renamed from: c  reason: collision with root package name */
        private final int f6091c;

        private i(ReactContext reactContext, int i) {
            super(reactContext);
            this.f6091c = i;
        }

        /* synthetic */ i(v0 v0Var, ReactContext reactContext, int i, a aVar) {
            this(reactContext, i);
        }

        private void c(long j) {
            t tVar;
            while (16 - ((System.nanoTime() - j) / 1000000) >= this.f6091c) {
                synchronized (v0.this.f6060d) {
                    if (v0.this.i.isEmpty()) {
                        return;
                    }
                    tVar = (t) v0.this.i.pollFirst();
                }
                try {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    tVar.execute();
                    v0.this.n += SystemClock.uptimeMillis() - uptimeMillis;
                } catch (Exception e2) {
                    v0.this.l = true;
                    throw e2;
                }
            }
        }

        @Override // com.facebook.react.uimanager.e
        public void b(long j) {
            if (v0.this.l) {
                c.d.d.e.a.d("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
                return;
            }
            com.facebook.systrace.a.a(0L, "dispatchNonBatchedUIOperations");
            try {
                c(j);
                com.facebook.systrace.a.a(0L);
                v0.this.i();
                com.facebook.react.modules.core.g.a().a(g.c.DISPATCH_UI, this);
            } catch (Throwable th) {
                com.facebook.systrace.a.a(0L);
                throw th;
            }
        }
    }

    /* loaded from: classes.dex */
    private final class j implements t {

        /* renamed from: a  reason: collision with root package name */
        private final int f6093a;

        /* renamed from: b  reason: collision with root package name */
        private final float f6094b;

        /* renamed from: c  reason: collision with root package name */
        private final float f6095c;

        /* renamed from: d  reason: collision with root package name */
        private final Callback f6096d;

        private j(int i, float f2, float f3, Callback callback) {
            this.f6093a = i;
            this.f6094b = f2;
            this.f6095c = f3;
            this.f6096d = callback;
        }

        /* synthetic */ j(v0 v0Var, int i, float f2, float f3, Callback callback, a aVar) {
            this(i, f2, f3, callback);
        }

        @Override // com.facebook.react.uimanager.v0.t
        public void execute() {
            try {
                v0.this.f6058b.a(this.f6093a, v0.this.f6057a);
                float f2 = v0.this.f6057a[0];
                float f3 = v0.this.f6057a[1];
                int a2 = v0.this.f6058b.a(this.f6093a, this.f6094b, this.f6095c);
                try {
                    v0.this.f6058b.a(a2, v0.this.f6057a);
                    this.f6096d.invoke(Integer.valueOf(a2), Float.valueOf(com.facebook.react.uimanager.q.a(v0.this.f6057a[0] - f2)), Float.valueOf(com.facebook.react.uimanager.q.a(v0.this.f6057a[1] - f3)), Float.valueOf(com.facebook.react.uimanager.q.a(v0.this.f6057a[2])), Float.valueOf(com.facebook.react.uimanager.q.a(v0.this.f6057a[3])));
                } catch (com.facebook.react.uimanager.g unused) {
                    this.f6096d.invoke(new Object[0]);
                }
            } catch (com.facebook.react.uimanager.g unused2) {
                this.f6096d.invoke(new Object[0]);
            }
        }
    }

    /* loaded from: classes.dex */
    private final class k implements t {

        /* renamed from: a  reason: collision with root package name */
        private final a0 f6098a;

        /* renamed from: b  reason: collision with root package name */
        private final o0.b f6099b;

        private k(v0 v0Var, a0 a0Var, o0.b bVar) {
            this.f6098a = a0Var;
            this.f6099b = bVar;
        }

        /* synthetic */ k(v0 v0Var, a0 a0Var, o0.b bVar, a aVar) {
            this(v0Var, a0Var, bVar);
        }

        @Override // com.facebook.react.uimanager.v0.t
        public void execute() {
            this.f6099b.a(this.f6098a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class l extends x {

        /* renamed from: b  reason: collision with root package name */
        private final int[] f6100b;

        /* renamed from: c  reason: collision with root package name */
        private final w0[] f6101c;

        /* renamed from: d  reason: collision with root package name */
        private final int[] f6102d;

        /* renamed from: e  reason: collision with root package name */
        private final int[] f6103e;

        public l(int i, int[] iArr, w0[] w0VarArr, int[] iArr2, int[] iArr3) {
            super(v0.this, i);
            this.f6100b = iArr;
            this.f6101c = w0VarArr;
            this.f6102d = iArr2;
            this.f6103e = iArr3;
        }

        @Override // com.facebook.react.uimanager.v0.t
        public void execute() {
            v0.this.f6058b.a(this.f6132a, this.f6100b, this.f6101c, this.f6102d, this.f6103e);
        }
    }

    /* loaded from: classes.dex */
    private final class m implements t {

        /* renamed from: a  reason: collision with root package name */
        private final int f6105a;

        /* renamed from: b  reason: collision with root package name */
        private final Callback f6106b;

        private m(int i, Callback callback) {
            this.f6105a = i;
            this.f6106b = callback;
        }

        /* synthetic */ m(v0 v0Var, int i, Callback callback, a aVar) {
            this(i, callback);
        }

        @Override // com.facebook.react.uimanager.v0.t
        public void execute() {
            try {
                v0.this.f6058b.b(this.f6105a, v0.this.f6057a);
                this.f6106b.invoke(Float.valueOf(com.facebook.react.uimanager.q.a(v0.this.f6057a[0])), Float.valueOf(com.facebook.react.uimanager.q.a(v0.this.f6057a[1])), Float.valueOf(com.facebook.react.uimanager.q.a(v0.this.f6057a[2])), Float.valueOf(com.facebook.react.uimanager.q.a(v0.this.f6057a[3])));
            } catch (com.facebook.react.uimanager.o unused) {
                this.f6106b.invoke(new Object[0]);
            }
        }
    }

    /* loaded from: classes.dex */
    private final class n implements t {

        /* renamed from: a  reason: collision with root package name */
        private final int f6108a;

        /* renamed from: b  reason: collision with root package name */
        private final Callback f6109b;

        private n(int i, Callback callback) {
            this.f6108a = i;
            this.f6109b = callback;
        }

        /* synthetic */ n(v0 v0Var, int i, Callback callback, a aVar) {
            this(i, callback);
        }

        @Override // com.facebook.react.uimanager.v0.t
        public void execute() {
            try {
                v0.this.f6058b.a(this.f6108a, v0.this.f6057a);
                float a2 = com.facebook.react.uimanager.q.a(v0.this.f6057a[0]);
                float a3 = com.facebook.react.uimanager.q.a(v0.this.f6057a[1]);
                this.f6109b.invoke(0, 0, Float.valueOf(com.facebook.react.uimanager.q.a(v0.this.f6057a[2])), Float.valueOf(com.facebook.react.uimanager.q.a(v0.this.f6057a[3])), Float.valueOf(a2), Float.valueOf(a3));
            } catch (com.facebook.react.uimanager.o unused) {
                this.f6109b.invoke(new Object[0]);
            }
        }
    }

    /* loaded from: classes.dex */
    private final class o extends x {
        public o(int i) {
            super(v0.this, i);
        }

        @Override // com.facebook.react.uimanager.v0.t
        public void execute() {
            v0.this.f6058b.a(this.f6132a);
        }
    }

    /* loaded from: classes.dex */
    private final class p extends x {

        /* renamed from: b  reason: collision with root package name */
        private final int f6112b;

        private p(int i, int i2) {
            super(v0.this, i);
            this.f6112b = i2;
        }

        /* synthetic */ p(v0 v0Var, int i, int i2, a aVar) {
            this(i, i2);
        }

        @Override // com.facebook.react.uimanager.v0.t
        public void execute() {
            v0.this.f6058b.a(this.f6132a, this.f6112b);
        }
    }

    /* loaded from: classes.dex */
    private class q implements t {

        /* renamed from: a  reason: collision with root package name */
        private final boolean f6114a;

        private q(boolean z) {
            this.f6114a = z;
        }

        /* synthetic */ q(v0 v0Var, boolean z, a aVar) {
            this(z);
        }

        @Override // com.facebook.react.uimanager.v0.t
        public void execute() {
            v0.this.f6058b.a(this.f6114a);
        }
    }

    /* loaded from: classes.dex */
    private final class r extends x {

        /* renamed from: b  reason: collision with root package name */
        private final ReadableArray f6116b;

        /* renamed from: c  reason: collision with root package name */
        private final Callback f6117c;

        /* renamed from: d  reason: collision with root package name */
        private final Callback f6118d;

        public r(int i, ReadableArray readableArray, Callback callback, Callback callback2) {
            super(v0.this, i);
            this.f6116b = readableArray;
            this.f6117c = callback;
            this.f6118d = callback2;
        }

        @Override // com.facebook.react.uimanager.v0.t
        public void execute() {
            v0.this.f6058b.a(this.f6132a, this.f6116b, this.f6118d, this.f6117c);
        }
    }

    /* loaded from: classes.dex */
    private class s implements t {

        /* renamed from: a  reason: collision with root package name */
        private final n0 f6120a;

        public s(n0 n0Var) {
            this.f6120a = n0Var;
        }

        @Override // com.facebook.react.uimanager.v0.t
        public void execute() {
            this.f6120a.a(v0.this.f6058b);
        }
    }

    /* loaded from: classes.dex */
    public interface t {
        void execute();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class u extends x {

        /* renamed from: b  reason: collision with root package name */
        private final int f6122b;

        /* renamed from: c  reason: collision with root package name */
        private final int f6123c;

        /* renamed from: d  reason: collision with root package name */
        private final int f6124d;

        /* renamed from: e  reason: collision with root package name */
        private final int f6125e;

        /* renamed from: f  reason: collision with root package name */
        private final int f6126f;

        public u(int i, int i2, int i3, int i4, int i5, int i6) {
            super(v0.this, i2);
            this.f6122b = i;
            this.f6123c = i3;
            this.f6124d = i4;
            this.f6125e = i5;
            this.f6126f = i6;
            com.facebook.systrace.a.d(0L, "updateLayout", this.f6132a);
        }

        @Override // com.facebook.react.uimanager.v0.t
        public void execute() {
            com.facebook.systrace.a.b(0L, "updateLayout", this.f6132a);
            v0.this.f6058b.a(this.f6122b, this.f6132a, this.f6123c, this.f6124d, this.f6125e, this.f6126f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class v extends x {

        /* renamed from: b  reason: collision with root package name */
        private final c0 f6128b;

        private v(int i, c0 c0Var) {
            super(v0.this, i);
            this.f6128b = c0Var;
        }

        /* synthetic */ v(v0 v0Var, int i, c0 c0Var, a aVar) {
            this(i, c0Var);
        }

        @Override // com.facebook.react.uimanager.v0.t
        public void execute() {
            v0.this.f6058b.a(this.f6132a, this.f6128b);
        }
    }

    /* loaded from: classes.dex */
    private final class w extends x {

        /* renamed from: b  reason: collision with root package name */
        private final Object f6130b;

        public w(int i, Object obj) {
            super(v0.this, i);
            this.f6130b = obj;
        }

        @Override // com.facebook.react.uimanager.v0.t
        public void execute() {
            v0.this.f6058b.a(this.f6132a, this.f6130b);
        }
    }

    /* loaded from: classes.dex */
    private abstract class x implements t {

        /* renamed from: a  reason: collision with root package name */
        public int f6132a;

        public x(v0 v0Var, int i) {
            this.f6132a = i;
        }
    }

    public v0(ReactApplicationContext reactApplicationContext, com.facebook.react.uimanager.m mVar, int i2) {
        this.f6058b = mVar;
        this.f6061e = new i(this, reactApplicationContext, i2 == -1 ? 8 : i2, null);
        this.f6062f = reactApplicationContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.l) {
            c.d.d.e.a.d("ReactNative", "Not flushing pending UI operations because of previously thrown Exception");
            return;
        }
        synchronized (this.f6059c) {
            if (this.f6064h.isEmpty()) {
                return;
            }
            ArrayList<Runnable> arrayList = this.f6064h;
            this.f6064h = new ArrayList<>();
            long uptimeMillis = SystemClock.uptimeMillis();
            Iterator<Runnable> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            if (this.m) {
                this.u = SystemClock.uptimeMillis() - uptimeMillis;
                this.v = this.n;
                this.m = false;
                com.facebook.systrace.a.a(0L, "batchedExecutionTime", 0, 1000000 * uptimeMillis);
                com.facebook.systrace.a.c(0L, "batchedExecutionTime", 0);
            }
            this.n = 0L;
        }
    }

    public void a() {
        this.f6063g.add(new c(0, 0, true, false));
    }

    public void a(int i2) {
        this.f6063g.add(new o(i2));
    }

    public void a(int i2, float f2, float f3, Callback callback) {
        this.f6063g.add(new j(this, i2, f2, f3, callback, null));
    }

    public void a(int i2, int i3) {
        this.f6063g.add(new p(this, i2, i3, null));
    }

    public void a(int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f6063g.add(new u(i2, i3, i4, i5, i6, i7));
    }

    @Deprecated
    public void a(int i2, int i3, ReadableArray readableArray) {
        this.f6063g.add(new g(i2, i3, readableArray));
    }

    public void a(int i2, int i3, boolean z) {
        this.f6063g.add(new c(i2, i3, false, z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public void a(int i2, long j2, long j3) {
        long j4;
        long uptimeMillis;
        long currentThreadTimeMillis;
        ArrayList<t> arrayList;
        ArrayDeque<t> arrayDeque;
        b.AbstractC0140b a2 = com.facebook.systrace.b.a(0L, "UIViewOperationQueue.dispatchViewUpdates");
        a2.a("batchId", i2);
        a2.a();
        try {
            uptimeMillis = SystemClock.uptimeMillis();
            currentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
            j4 = 0;
            ArrayDeque<t> arrayDeque2 = null;
            if (!this.f6063g.isEmpty()) {
                ArrayList<t> arrayList2 = this.f6063g;
                this.f6063g = new ArrayList<>();
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            synchronized (this.f6060d) {
                try {
                    if (!this.i.isEmpty()) {
                        arrayDeque2 = this.i;
                        this.i = new ArrayDeque<>();
                    }
                    arrayDeque = arrayDeque2;
                } catch (Throwable th) {
                    th = th;
                }
            }
            if (this.j != null) {
                this.j.a();
            }
        } catch (Throwable th2) {
            th = th2;
            j4 = 0;
        }
        try {
            a aVar = new a(i2, arrayDeque, arrayList, j2, j3, uptimeMillis, currentThreadTimeMillis);
            j4 = 0;
            b.AbstractC0140b a3 = com.facebook.systrace.b.a(0L, "acquiring mDispatchRunnablesLock");
            a3.a("batchId", i2);
            a3.a();
            synchronized (this.f6059c) {
                com.facebook.systrace.a.a(0L);
                this.f6064h.add(aVar);
            }
            if (!this.k) {
                UiThreadUtil.runOnUiThread(new b(this.f6062f));
            }
            com.facebook.systrace.a.a(0L);
        } catch (Throwable th3) {
            th = th3;
            j4 = 0;
            com.facebook.systrace.a.a(j4);
            throw th;
        }
    }

    public void a(int i2, View view) {
        this.f6058b.a(i2, view);
    }

    public void a(int i2, Callback callback) {
        this.f6063g.add(new n(this, i2, callback, null));
    }

    public void a(int i2, ReadableArray readableArray, Callback callback, Callback callback2) {
        this.f6063g.add(new r(i2, readableArray, callback, callback2));
    }

    public void a(int i2, Object obj) {
        this.f6063g.add(new w(i2, obj));
    }

    public void a(int i2, String str, ReadableArray readableArray) {
        this.f6063g.add(new h(i2, str, readableArray));
    }

    public void a(int i2, String str, c0 c0Var) {
        this.y++;
        this.f6063g.add(new v(this, i2, c0Var, null));
    }

    public void a(int i2, int[] iArr, w0[] w0VarArr, int[] iArr2, int[] iArr3) {
        this.f6063g.add(new l(i2, iArr, w0VarArr, iArr2, iArr3));
    }

    public void a(ReadableMap readableMap, Callback callback) {
        this.f6063g.add(new d(this, readableMap, callback, null));
    }

    public void a(a0 a0Var, o0.b bVar) {
        this.f6063g.add(new k(this, a0Var, bVar, null));
    }

    public void a(com.facebook.react.uimanager.g1.a aVar) {
        this.j = aVar;
    }

    public void a(k0 k0Var, int i2, String str, c0 c0Var) {
        synchronized (this.f6060d) {
            this.x++;
            this.i.addLast(new e(k0Var, i2, str, c0Var));
        }
    }

    public void a(n0 n0Var) {
        this.f6063g.add(new s(n0Var));
    }

    public void a(boolean z) {
        this.f6063g.add(new q(this, z, null));
    }

    public void b() {
        this.f6063g.add(new f(this, null));
    }

    public void b(int i2, Callback callback) {
        this.f6063g.add(new m(this, i2, callback, null));
    }

    public void b(n0 n0Var) {
        this.f6063g.add(0, new s(n0Var));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.facebook.react.uimanager.m c() {
        return this.f6058b;
    }

    public Map<String, Long> d() {
        HashMap hashMap = new HashMap();
        hashMap.put("CommitStartTime", Long.valueOf(this.o));
        hashMap.put("CommitEndTime", Long.valueOf(this.p));
        hashMap.put("LayoutTime", Long.valueOf(this.q));
        hashMap.put("DispatchViewUpdatesTime", Long.valueOf(this.r));
        hashMap.put("RunStartTime", Long.valueOf(this.s));
        hashMap.put("RunEndTime", Long.valueOf(this.t));
        hashMap.put("BatchedExecutionTime", Long.valueOf(this.u));
        hashMap.put("NonBatchedExecutionTime", Long.valueOf(this.v));
        hashMap.put("NativeModulesThreadCpuTime", Long.valueOf(this.w));
        hashMap.put("CreateViewCount", Long.valueOf(this.x));
        hashMap.put("UpdatePropsCount", Long.valueOf(this.y));
        return hashMap;
    }

    public boolean e() {
        return this.f6063g.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f() {
        this.k = false;
        com.facebook.react.modules.core.g.a().b(g.c.DISPATCH_UI, this.f6061e);
        i();
    }

    public void g() {
        this.m = true;
        this.o = 0L;
        this.x = 0L;
        this.y = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h() {
        this.k = true;
        com.facebook.react.modules.core.g.a().a(g.c.DISPATCH_UI, this.f6061e);
    }
}
