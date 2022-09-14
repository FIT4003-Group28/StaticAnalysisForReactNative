package com.facebook.react.animated;

import android.util.SparseArray;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class l implements com.facebook.react.uimanager.events.e {

    /* renamed from: e  reason: collision with root package name */
    private final UIManagerModule.e f5377e;

    /* renamed from: f  reason: collision with root package name */
    private final UIManagerModule f5378f;

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<b> f5373a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<d> f5374b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    private final SparseArray<b> f5375c = new SparseArray<>();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, List<EventAnimationDriver>> f5376d = new HashMap();

    /* renamed from: g  reason: collision with root package name */
    private int f5379g = 0;

    /* renamed from: h  reason: collision with root package name */
    private final List<b> f5380h = new LinkedList();

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.facebook.react.uimanager.events.c f5381b;

        a(com.facebook.react.uimanager.events.c cVar) {
            this.f5381b = cVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            l.this.b(this.f5381b);
        }
    }

    public l(UIManagerModule uIManagerModule) {
        this.f5378f = uIManagerModule;
        uIManagerModule.getEventDispatcher().a(this);
        this.f5377e = uIManagerModule.getDirectEventNamesResolver();
    }

    private void a(b bVar) {
        int i = 0;
        while (i < this.f5374b.size()) {
            d valueAt = this.f5374b.valueAt(i);
            if (bVar.equals(valueAt.f5362b)) {
                if (valueAt.f5363c != null) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putBoolean("finished", false);
                    valueAt.f5363c.invoke(createMap);
                }
                this.f5374b.removeAt(i);
                i--;
            }
            i++;
        }
    }

    private void a(List<b> list) {
        this.f5379g++;
        int i = this.f5379g;
        if (i == 0) {
            this.f5379g = i + 1;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i2 = 0;
        for (b bVar : list) {
            int i3 = bVar.f5359c;
            int i4 = this.f5379g;
            if (i3 != i4) {
                bVar.f5359c = i4;
                i2++;
                arrayDeque.add(bVar);
            }
        }
        while (!arrayDeque.isEmpty()) {
            b bVar2 = (b) arrayDeque.poll();
            if (bVar2.f5357a != null) {
                int i5 = i2;
                for (int i6 = 0; i6 < bVar2.f5357a.size(); i6++) {
                    b bVar3 = bVar2.f5357a.get(i6);
                    bVar3.f5358b++;
                    int i7 = bVar3.f5359c;
                    int i8 = this.f5379g;
                    if (i7 != i8) {
                        bVar3.f5359c = i8;
                        i5++;
                        arrayDeque.add(bVar3);
                    }
                }
                i2 = i5;
            }
        }
        this.f5379g++;
        int i9 = this.f5379g;
        if (i9 == 0) {
            this.f5379g = i9 + 1;
        }
        int i10 = 0;
        for (b bVar4 : list) {
            if (bVar4.f5358b == 0) {
                int i11 = bVar4.f5359c;
                int i12 = this.f5379g;
                if (i11 != i12) {
                    bVar4.f5359c = i12;
                    i10++;
                    arrayDeque.add(bVar4);
                }
            }
        }
        while (!arrayDeque.isEmpty()) {
            b bVar5 = (b) arrayDeque.poll();
            bVar5.a();
            if (bVar5 instanceof m) {
                try {
                    ((m) bVar5).c();
                } catch (com.facebook.react.uimanager.g e2) {
                    c.d.d.e.a.b("ReactNative", "Native animation workaround, frame lost as result of race condition", e2);
                }
            }
            if (bVar5 instanceof s) {
                ((s) bVar5).f();
            }
            if (bVar5.f5357a != null) {
                int i13 = i10;
                for (int i14 = 0; i14 < bVar5.f5357a.size(); i14++) {
                    b bVar6 = bVar5.f5357a.get(i14);
                    bVar6.f5358b--;
                    int i15 = bVar6.f5359c;
                    int i16 = this.f5379g;
                    if (i15 != i16 && bVar6.f5358b == 0) {
                        bVar6.f5359c = i16;
                        i13++;
                        arrayDeque.add(bVar6);
                    }
                }
                i10 = i13;
            }
        }
        if (i2 == i10) {
            return;
        }
        throw new IllegalStateException("Looks like animated nodes graph has cycles, there are " + i2 + " but toposort visited only " + i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.facebook.react.uimanager.events.c cVar) {
        if (!this.f5376d.isEmpty()) {
            String a2 = this.f5377e.a(cVar.d());
            Map<String, List<EventAnimationDriver>> map = this.f5376d;
            List<EventAnimationDriver> list = map.get(cVar.g() + a2);
            if (list == null) {
                return;
            }
            for (EventAnimationDriver eventAnimationDriver : list) {
                a(eventAnimationDriver.mValueNode);
                cVar.a(eventAnimationDriver);
                this.f5380h.add(eventAnimationDriver.mValueNode);
            }
            a(this.f5380h);
            this.f5380h.clear();
        }
    }

    public void a(int i) {
        this.f5373a.remove(i);
        this.f5375c.remove(i);
    }

    public void a(int i, double d2) {
        b bVar = this.f5373a.get(i);
        if (bVar != null && (bVar instanceof s)) {
            ((s) bVar).f5406g = d2;
            this.f5375c.put(i, bVar);
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node with tag " + i + " does not exists or is not a 'value' node");
    }

    public void a(int i, int i2) {
        b bVar = this.f5373a.get(i);
        if (bVar == null) {
            throw new JSApplicationIllegalArgumentException("Animated node with tag " + i + " does not exists");
        } else if (bVar instanceof m) {
            ((m) bVar).a(i2);
            this.f5375c.put(i, bVar);
        } else {
            throw new JSApplicationIllegalArgumentException("Animated node connected to view should beof type " + m.class.getName());
        }
    }

    public void a(int i, int i2, ReadableMap readableMap, Callback callback) {
        d eVar;
        b bVar = this.f5373a.get(i2);
        if (bVar == null) {
            throw new JSApplicationIllegalArgumentException("Animated node with tag " + i2 + " does not exists");
        } else if (!(bVar instanceof s)) {
            throw new JSApplicationIllegalArgumentException("Animated node should be of type " + s.class.getName());
        } else {
            d dVar = this.f5374b.get(i);
            if (dVar != null) {
                dVar.a(readableMap);
                return;
            }
            String string = readableMap.getString("type");
            if ("frames".equals(string)) {
                eVar = new h(readableMap);
            } else if ("spring".equals(string)) {
                eVar = new n(readableMap);
            } else if (!"decay".equals(string)) {
                throw new JSApplicationIllegalArgumentException("Unsupported animation type: " + string);
            } else {
                eVar = new e(readableMap);
            }
            eVar.f5364d = i;
            eVar.f5363c = callback;
            eVar.f5362b = (s) bVar;
            this.f5374b.put(i, eVar);
        }
    }

    public void a(int i, c cVar) {
        b bVar = this.f5373a.get(i);
        if (bVar != null && (bVar instanceof s)) {
            ((s) bVar).a(cVar);
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node with tag " + i + " does not exists or is not a 'value' node");
    }

    public void a(int i, ReadableMap readableMap) {
        b qVar;
        if (this.f5373a.get(i) != null) {
            throw new JSApplicationIllegalArgumentException("Animated node with tag " + i + " already exists");
        }
        String string = readableMap.getString("type");
        if ("style".equals(string)) {
            qVar = new o(readableMap, this);
        } else if ("value".equals(string)) {
            qVar = new s(readableMap);
        } else if ("props".equals(string)) {
            qVar = new m(readableMap, this, this.f5378f);
        } else if ("interpolation".equals(string)) {
            qVar = new i(readableMap);
        } else if ("addition".equals(string)) {
            qVar = new com.facebook.react.animated.a(readableMap, this);
        } else if ("subtraction".equals(string)) {
            qVar = new p(readableMap, this);
        } else if ("division".equals(string)) {
            qVar = new g(readableMap, this);
        } else if ("multiplication".equals(string)) {
            qVar = new k(readableMap, this);
        } else if ("modulus".equals(string)) {
            qVar = new j(readableMap, this);
        } else if ("diffclamp".equals(string)) {
            qVar = new f(readableMap, this);
        } else if ("transform".equals(string)) {
            qVar = new r(readableMap, this);
        } else if (!"tracking".equals(string)) {
            throw new JSApplicationIllegalArgumentException("Unsupported node type: " + string);
        } else {
            qVar = new q(readableMap, this);
        }
        qVar.f5360d = i;
        this.f5373a.put(i, qVar);
        this.f5375c.put(i, qVar);
    }

    public void a(int i, String str, int i2) {
        String str2 = i + str;
        if (this.f5376d.containsKey(str2)) {
            List<EventAnimationDriver> list = this.f5376d.get(str2);
            if (list.size() == 1) {
                this.f5376d.remove(i + str);
                return;
            }
            ListIterator<EventAnimationDriver> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                if (listIterator.next().mValueNode.f5360d == i2) {
                    listIterator.remove();
                    return;
                }
            }
        }
    }

    public void a(int i, String str, ReadableMap readableMap) {
        int i2 = readableMap.getInt("animatedValueTag");
        b bVar = this.f5373a.get(i2);
        if (bVar == null) {
            throw new JSApplicationIllegalArgumentException("Animated node with tag " + i2 + " does not exists");
        } else if (!(bVar instanceof s)) {
            throw new JSApplicationIllegalArgumentException("Animated node connected to event should beof type " + s.class.getName());
        } else {
            ReadableArray array = readableMap.getArray("nativeEventPath");
            ArrayList arrayList = new ArrayList(array.size());
            for (int i3 = 0; i3 < array.size(); i3++) {
                arrayList.add(array.getString(i3));
            }
            EventAnimationDriver eventAnimationDriver = new EventAnimationDriver(arrayList, (s) bVar);
            String str2 = i + str;
            if (this.f5376d.containsKey(str2)) {
                this.f5376d.get(str2).add(eventAnimationDriver);
                return;
            }
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(eventAnimationDriver);
            this.f5376d.put(str2, arrayList2);
        }
    }

    public void a(long j) {
        UiThreadUtil.assertOnUiThread();
        for (int i = 0; i < this.f5375c.size(); i++) {
            this.f5380h.add(this.f5375c.valueAt(i));
        }
        this.f5375c.clear();
        boolean z = false;
        for (int i2 = 0; i2 < this.f5374b.size(); i2++) {
            d valueAt = this.f5374b.valueAt(i2);
            valueAt.a(j);
            this.f5380h.add(valueAt.f5362b);
            if (valueAt.f5361a) {
                z = true;
            }
        }
        a(this.f5380h);
        this.f5380h.clear();
        if (z) {
            for (int size = this.f5374b.size() - 1; size >= 0; size--) {
                d valueAt2 = this.f5374b.valueAt(size);
                if (valueAt2.f5361a) {
                    if (valueAt2.f5363c != null) {
                        WritableMap createMap = Arguments.createMap();
                        createMap.putBoolean("finished", true);
                        valueAt2.f5363c.invoke(createMap);
                    }
                    this.f5374b.removeAt(size);
                }
            }
        }
    }

    @Override // com.facebook.react.uimanager.events.e
    public void a(com.facebook.react.uimanager.events.c cVar) {
        if (UiThreadUtil.isOnUiThread()) {
            b(cVar);
        } else {
            UiThreadUtil.runOnUiThread(new a(cVar));
        }
    }

    public boolean a() {
        return this.f5374b.size() > 0 || this.f5375c.size() > 0;
    }

    public void b(int i) {
        b bVar = this.f5373a.get(i);
        if (bVar != null && (bVar instanceof s)) {
            ((s) bVar).b();
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node with tag " + i + " does not exists or is not a 'value' node");
    }

    public void b(int i, double d2) {
        b bVar = this.f5373a.get(i);
        if (bVar != null && (bVar instanceof s)) {
            a(bVar);
            ((s) bVar).f5405f = d2;
            this.f5375c.put(i, bVar);
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node with tag " + i + " does not exists or is not a 'value' node");
    }

    public void b(int i, int i2) {
        b bVar = this.f5373a.get(i);
        if (bVar == null) {
            throw new JSApplicationIllegalArgumentException("Animated node with tag " + i + " does not exists");
        }
        b bVar2 = this.f5373a.get(i2);
        if (bVar2 != null) {
            bVar.a(bVar2);
            this.f5375c.put(i2, bVar2);
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node with tag " + i2 + " does not exists");
    }

    public void c(int i) {
        b bVar = this.f5373a.get(i);
        if (bVar != null && (bVar instanceof s)) {
            ((s) bVar).c();
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node with tag " + i + " does not exists or is not a 'value' node");
    }

    public void c(int i, int i2) {
        b bVar = this.f5373a.get(i);
        if (bVar == null) {
            throw new JSApplicationIllegalArgumentException("Animated node with tag " + i + " does not exists");
        } else if (bVar instanceof m) {
            ((m) bVar).b(i2);
        } else {
            throw new JSApplicationIllegalArgumentException("Animated node connected to view should beof type " + m.class.getName());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b d(int i) {
        return this.f5373a.get(i);
    }

    public void d(int i, int i2) {
        b bVar = this.f5373a.get(i);
        if (bVar == null) {
            throw new JSApplicationIllegalArgumentException("Animated node with tag " + i + " does not exists");
        }
        b bVar2 = this.f5373a.get(i2);
        if (bVar2 != null) {
            bVar.d(bVar2);
            this.f5375c.put(i2, bVar2);
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node with tag " + i2 + " does not exists");
    }

    public void e(int i) {
        b bVar = this.f5373a.get(i);
        if (bVar == null) {
            return;
        }
        if (bVar instanceof m) {
            ((m) bVar).b();
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node connected to view should beof type " + m.class.getName());
    }

    public void f(int i) {
        for (int i2 = 0; i2 < this.f5374b.size(); i2++) {
            d valueAt = this.f5374b.valueAt(i2);
            if (valueAt.f5364d == i) {
                if (valueAt.f5363c != null) {
                    WritableMap createMap = Arguments.createMap();
                    createMap.putBoolean("finished", false);
                    valueAt.f5363c.invoke(createMap);
                }
                this.f5374b.removeAt(i2);
                return;
            }
        }
    }

    public void g(int i) {
        b bVar = this.f5373a.get(i);
        if (bVar != null && (bVar instanceof s)) {
            ((s) bVar).a((c) null);
            return;
        }
        throw new JSApplicationIllegalArgumentException("Animated node with tag " + i + " does not exists or is not a 'value' node");
    }
}
