package com.swmansion.reanimated;

import android.util.SparseArray;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.core.g;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.a0;
import com.facebook.react.uimanager.o0;
import com.facebook.react.uimanager.u0;
import com.swmansion.reanimated.nodes.EventNode;
import com.swmansion.reanimated.nodes.f;
import com.swmansion.reanimated.nodes.h;
import com.swmansion.reanimated.nodes.i;
import com.swmansion.reanimated.nodes.k;
import com.swmansion.reanimated.nodes.l;
import com.swmansion.reanimated.nodes.m;
import com.swmansion.reanimated.nodes.n;
import com.swmansion.reanimated.nodes.o;
import com.swmansion.reanimated.nodes.p;
import com.swmansion.reanimated.nodes.q;
import com.swmansion.reanimated.nodes.r;
import com.swmansion.reanimated.nodes.s;
import com.swmansion.reanimated.nodes.t;
import com.swmansion.reanimated.nodes.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class b implements com.facebook.react.uimanager.events.e {
    private static final Double t = Double.valueOf(0.0d);

    /* renamed from: c  reason: collision with root package name */
    private final o0 f9964c;

    /* renamed from: d  reason: collision with root package name */
    private final DeviceEventManagerModule.RCTDeviceEventEmitter f9965d;

    /* renamed from: e  reason: collision with root package name */
    private final g f9966e;

    /* renamed from: f  reason: collision with root package name */
    private final com.facebook.react.uimanager.e f9967f;

    /* renamed from: g  reason: collision with root package name */
    private final UIManagerModule.e f9968g;
    private final n i;
    private final ReactContext j;
    private final UIManagerModule k;
    private boolean n;
    public double o;

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<m> f9962a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private final Map<String, EventNode> f9963b = new HashMap();

    /* renamed from: h  reason: collision with root package name */
    private final AtomicBoolean f9969h = new AtomicBoolean();
    private List<d> l = new ArrayList();
    private ConcurrentLinkedQueue<com.facebook.react.uimanager.events.c> m = new ConcurrentLinkedQueue<>();
    public Set<String> q = Collections.emptySet();
    public Set<String> r = Collections.emptySet();
    private Queue<c> s = new LinkedList();
    public final com.swmansion.reanimated.d p = new com.swmansion.reanimated.d();

    /* loaded from: classes.dex */
    class a extends com.facebook.react.uimanager.e {
        a(ReactContext reactContext) {
            super(reactContext);
        }

        @Override // com.facebook.react.uimanager.e
        protected void b(long j) {
            b.this.a(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.swmansion.reanimated.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0199b extends GuardedRunnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Queue f9971b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0199b(ReactContext reactContext, Queue queue) {
            super(reactContext);
            this.f9971b = queue;
        }

        @Override // com.facebook.react.bridge.GuardedRunnable
        public void runGuarded() {
            boolean a2 = u0.a(b.this.f9964c);
            while (!this.f9971b.isEmpty()) {
                c cVar = (c) this.f9971b.remove();
                a0 f2 = b.this.f9964c.f(cVar.f9973a);
                if (f2 != null) {
                    b.this.k.updateView(cVar.f9973a, f2.m(), cVar.f9974b);
                }
            }
            if (a2) {
                b.this.f9964c.a(-1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class c {

        /* renamed from: a  reason: collision with root package name */
        public int f9973a;

        /* renamed from: b  reason: collision with root package name */
        public WritableMap f9974b;

        public c(b bVar, int i, WritableMap writableMap) {
            this.f9973a = i;
            this.f9974b = writableMap;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void b();
    }

    public b(ReactContext reactContext) {
        this.j = reactContext;
        this.k = (UIManagerModule) reactContext.getNativeModule(UIManagerModule.class);
        this.f9964c = this.k.getUIImplementation();
        this.f9968g = this.k.getDirectEventNamesResolver();
        this.k.getEventDispatcher().a(this);
        this.f9965d = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
        this.f9966e = g.a();
        this.f9967f = new a(reactContext);
        this.i = new n(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j) {
        this.o = j / 1000000.0d;
        while (!this.m.isEmpty()) {
            b(this.m.poll());
        }
        if (!this.l.isEmpty()) {
            List<d> list = this.l;
            this.l = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).b();
            }
        }
        if (this.n) {
            m.runUpdates(this.p);
        }
        if (!this.s.isEmpty()) {
            Queue<c> queue = this.s;
            this.s = new LinkedList();
            ReactContext reactContext = this.j;
            reactContext.runOnNativeModulesQueueThread(new C0199b(reactContext, queue));
        }
        this.f9969h.set(false);
        this.n = false;
        if (!this.l.isEmpty() || !this.m.isEmpty()) {
            d();
        }
    }

    private void b(com.facebook.react.uimanager.events.c cVar) {
        if (!this.f9963b.isEmpty()) {
            String a2 = this.f9968g.a(cVar.d());
            int g2 = cVar.g();
            EventNode eventNode = this.f9963b.get(g2 + a2);
            if (eventNode == null) {
                return;
            }
            cVar.a(eventNode);
        }
    }

    private void d() {
        if (!this.f9969h.getAndSet(true)) {
            this.f9966e.a(g.c.NATIVE_ANIMATED_MODULE, this.f9967f);
        }
    }

    private void e() {
        if (this.f9969h.getAndSet(false)) {
            this.f9966e.b(g.c.NATIVE_ANIMATED_MODULE, this.f9967f);
        }
    }

    public <T extends m> T a(int i, Class<T> cls) {
        T t2 = (T) this.f9962a.get(i);
        if (t2 == null) {
            if (cls == m.class || cls == u.class) {
                return this.i;
            }
            throw new IllegalArgumentException("Requested node with id " + i + " of type " + cls + " cannot be found");
        } else if (cls.isInstance(t2)) {
            return t2;
        } else {
            throw new IllegalArgumentException("Node with id " + i + " is of incompatible type " + t2.getClass() + ", requested type was " + cls);
        }
    }

    public void a() {
        if (this.f9969h.get()) {
            e();
            this.f9969h.set(true);
        }
    }

    public void a(int i) {
        this.f9962a.remove(i);
    }

    public void a(int i, int i2) {
        m mVar = this.f9962a.get(i);
        if (mVar == null) {
            throw new JSApplicationIllegalArgumentException("Animated node with ID " + i + " does not exists");
        } else if (mVar instanceof q) {
            ((q) mVar).a(i2);
        } else {
            throw new JSApplicationIllegalArgumentException("Animated node connected to view should beof type " + q.class.getName());
        }
    }

    public void a(int i, Callback callback) {
        callback.invoke(this.f9962a.get(i).value());
    }

    public void a(int i, ReadableMap readableMap) {
        m dVar;
        if (this.f9962a.get(i) != null) {
            throw new JSApplicationIllegalArgumentException("Animated node with ID " + i + " already exists");
        }
        String string = readableMap.getString("type");
        if ("props".equals(string)) {
            dVar = new q(i, readableMap, this, this.f9964c);
        } else if ("style".equals(string)) {
            dVar = new s(i, readableMap, this);
        } else if ("transform".equals(string)) {
            dVar = new t(i, readableMap, this);
        } else if ("value".equals(string)) {
            dVar = new u(i, readableMap, this);
        } else if ("block".equals(string)) {
            dVar = new com.swmansion.reanimated.nodes.c(i, readableMap, this);
        } else if ("cond".equals(string)) {
            dVar = new h(i, readableMap, this);
        } else if ("op".equals(string)) {
            dVar = new o(i, readableMap, this);
        } else if ("set".equals(string)) {
            dVar = new r(i, readableMap, this);
        } else if ("debug".equals(string)) {
            dVar = new i(i, readableMap, this);
        } else if ("clock".equals(string)) {
            dVar = new com.swmansion.reanimated.nodes.e(i, readableMap, this);
        } else if ("clockStart".equals(string)) {
            dVar = new f.a(i, readableMap, this);
        } else if ("clockStop".equals(string)) {
            dVar = new f.b(i, readableMap, this);
        } else if ("clockTest".equals(string)) {
            dVar = new f.c(i, readableMap, this);
        } else if ("call".equals(string)) {
            dVar = new l(i, readableMap, this);
        } else if ("bezier".equals(string)) {
            dVar = new com.swmansion.reanimated.nodes.b(i, readableMap, this);
        } else if ("event".equals(string)) {
            dVar = new EventNode(i, readableMap, this);
        } else if ("always".equals(string)) {
            dVar = new com.swmansion.reanimated.nodes.a(i, readableMap, this);
        } else if ("concat".equals(string)) {
            dVar = new com.swmansion.reanimated.nodes.g(i, readableMap, this);
        } else if ("param".equals(string)) {
            dVar = new p(i, readableMap, this);
        } else if ("func".equals(string)) {
            dVar = new k(i, readableMap, this);
        } else if (!"callfunc".equals(string)) {
            throw new JSApplicationIllegalArgumentException("Unsupported node type: " + string);
        } else {
            dVar = new com.swmansion.reanimated.nodes.d(i, readableMap, this);
        }
        this.f9962a.put(i, dVar);
    }

    public void a(int i, WritableMap writableMap) {
        this.s.add(new c(this, i, writableMap));
    }

    public void a(int i, Double d2) {
        m mVar = this.f9962a.get(i);
        if (mVar != null) {
            ((u) mVar).a(d2);
        }
    }

    public void a(int i, String str, int i2) {
        String str2 = i + str;
        EventNode eventNode = (EventNode) this.f9962a.get(i2);
        if (eventNode != null) {
            if (this.f9963b.containsKey(str2)) {
                throw new JSApplicationIllegalArgumentException("Event handler already set for the given view and event type");
            }
            this.f9963b.put(str2, eventNode);
            return;
        }
        throw new JSApplicationIllegalArgumentException("Event node " + i2 + " does not exists");
    }

    @Override // com.facebook.react.uimanager.events.e
    public void a(com.facebook.react.uimanager.events.c cVar) {
        if (UiThreadUtil.isOnUiThread()) {
            b(cVar);
            return;
        }
        this.m.offer(cVar);
        d();
    }

    public void a(d dVar) {
        this.l.add(dVar);
        d();
    }

    public void a(String str, WritableMap writableMap) {
        this.f9965d.emit(str, writableMap);
    }

    public void a(Set<String> set, Set<String> set2) {
        this.r = set;
        this.q = set2;
    }

    public Object b(int i) {
        m mVar = this.f9962a.get(i);
        return mVar != null ? mVar.value() : t;
    }

    public void b() {
        if (this.f9969h.getAndSet(false)) {
            d();
        }
    }

    public void b(int i, int i2) {
        m mVar = this.f9962a.get(i);
        m mVar2 = this.f9962a.get(i2);
        if (mVar2 != null) {
            mVar.addChild(mVar2);
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node with ID " + i2 + " does not exists");
    }

    public void b(int i, String str, int i2) {
        this.f9963b.remove(i + str);
    }

    public void c() {
        this.n = true;
        d();
    }

    public void c(int i, int i2) {
        m mVar = this.f9962a.get(i);
        if (mVar == null) {
            throw new JSApplicationIllegalArgumentException("Animated node with ID " + i + " does not exists");
        } else if (mVar instanceof q) {
            ((q) mVar).b(i2);
        } else {
            throw new JSApplicationIllegalArgumentException("Animated node connected to view should beof type " + q.class.getName());
        }
    }

    public void d(int i, int i2) {
        m mVar = this.f9962a.get(i);
        m mVar2 = this.f9962a.get(i2);
        if (mVar2 != null) {
            mVar.removeChild(mVar2);
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node with ID " + i2 + " does not exists");
    }
}
