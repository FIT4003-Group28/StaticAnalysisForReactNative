package com.facebook.react.animated;

import android.util.SparseArray;
import com.facebook.react.bridge.am;
import com.facebook.react.bridge.an;
import com.facebook.react.bridge.ap;
import com.facebook.react.bridge.ar;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.aj;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NativeAnimatedNodesManager.java */
/* loaded from: classes.dex */
public class l implements com.facebook.react.uimanager.events.d {
    private final UIManagerModule.a e;
    private final aj f;

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<b> f3149a = new SparseArray<>();

    /* renamed from: b  reason: collision with root package name */
    private final SparseArray<d> f3150b = new SparseArray<>();

    /* renamed from: c  reason: collision with root package name */
    private final SparseArray<b> f3151c = new SparseArray<>();

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, List<EventAnimationDriver>> f3152d = new HashMap();
    private int g = 0;
    private final List<b> h = new LinkedList();

    public l(UIManagerModule uIManagerModule) {
        this.f = uIManagerModule.getUIImplementation();
        uIManagerModule.getEventDispatcher().a(this);
        this.e = uIManagerModule.getDirectEventNamesResolver();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b a(int i) {
        return this.f3149a.get(i);
    }

    public boolean a() {
        return this.f3150b.size() > 0 || this.f3151c.size() > 0;
    }

    public void a(int i, an anVar) {
        b pVar;
        if (this.f3149a.get(i) != null) {
            throw new com.facebook.react.bridge.n("Animated node with tag " + i + " already exists");
        }
        String string = anVar.getString("type");
        if ("style".equals(string)) {
            pVar = new o(anVar, this);
        } else if ("value".equals(string)) {
            pVar = new q(anVar);
        } else if ("props".equals(string)) {
            pVar = new m(anVar, this, this.f);
        } else if ("interpolation".equals(string)) {
            pVar = new i(anVar);
        } else if ("addition".equals(string)) {
            pVar = new a(anVar, this);
        } else if ("division".equals(string)) {
            pVar = new g(anVar, this);
        } else if ("multiplication".equals(string)) {
            pVar = new k(anVar, this);
        } else if ("modulus".equals(string)) {
            pVar = new j(anVar, this);
        } else if ("diffclamp".equals(string)) {
            pVar = new f(anVar, this);
        } else if ("transform".equals(string)) {
            pVar = new p(anVar, this);
        } else {
            throw new com.facebook.react.bridge.n("Unsupported node type: " + string);
        }
        pVar.f3144d = i;
        this.f3149a.put(i, pVar);
        this.f3151c.put(i, pVar);
    }

    public void b(int i) {
        this.f3149a.remove(i);
        this.f3151c.remove(i);
    }

    public void a(int i, c cVar) {
        b bVar = this.f3149a.get(i);
        if (bVar == null || !(bVar instanceof q)) {
            throw new com.facebook.react.bridge.n("Animated node with tag " + i + " does not exists or is not a 'value' node");
        }
        ((q) bVar).a(cVar);
    }

    public void c(int i) {
        b bVar = this.f3149a.get(i);
        if (bVar == null || !(bVar instanceof q)) {
            throw new com.facebook.react.bridge.n("Animated node with tag " + i + " does not exists or is not a 'value' node");
        }
        ((q) bVar).a((c) null);
    }

    public void a(int i, double d2) {
        b bVar = this.f3149a.get(i);
        if (bVar == null || !(bVar instanceof q)) {
            throw new com.facebook.react.bridge.n("Animated node with tag " + i + " does not exists or is not a 'value' node");
        }
        a(bVar);
        ((q) bVar).e = d2;
        this.f3151c.put(i, bVar);
    }

    public void b(int i, double d2) {
        b bVar = this.f3149a.get(i);
        if (bVar == null || !(bVar instanceof q)) {
            throw new com.facebook.react.bridge.n("Animated node with tag " + i + " does not exists or is not a 'value' node");
        }
        ((q) bVar).f = d2;
        this.f3151c.put(i, bVar);
    }

    public void d(int i) {
        b bVar = this.f3149a.get(i);
        if (bVar == null || !(bVar instanceof q)) {
            throw new com.facebook.react.bridge.n("Animated node with tag " + i + " does not exists or is not a 'value' node");
        }
        ((q) bVar).c();
    }

    public void e(int i) {
        b bVar = this.f3149a.get(i);
        if (bVar == null || !(bVar instanceof q)) {
            throw new com.facebook.react.bridge.n("Animated node with tag " + i + " does not exists or is not a 'value' node");
        }
        ((q) bVar).d();
    }

    public void a(int i, int i2, an anVar, com.facebook.react.bridge.d dVar) {
        d eVar;
        b bVar = this.f3149a.get(i2);
        if (bVar == null) {
            throw new com.facebook.react.bridge.n("Animated node with tag " + i2 + " does not exists");
        } else if (!(bVar instanceof q)) {
            throw new com.facebook.react.bridge.n("Animated node should be of type " + q.class.getName());
        } else {
            String string = anVar.getString("type");
            if ("frames".equals(string)) {
                eVar = new h(anVar);
            } else if ("spring".equals(string)) {
                eVar = new n(anVar);
            } else if ("decay".equals(string)) {
                eVar = new e(anVar);
            } else {
                throw new com.facebook.react.bridge.n("Unsupported animation type: " + string);
            }
            eVar.f3148d = i;
            eVar.f3147c = dVar;
            eVar.f3146b = (q) bVar;
            this.f3150b.put(i, eVar);
        }
    }

    private void a(b bVar) {
        int i = 0;
        while (i < this.f3150b.size()) {
            d valueAt = this.f3150b.valueAt(i);
            if (bVar.equals(valueAt.f3146b)) {
                ar b2 = com.facebook.react.bridge.b.b();
                b2.putBoolean("finished", false);
                valueAt.f3147c.a(b2);
                this.f3150b.removeAt(i);
                i--;
            }
            i++;
        }
    }

    public void f(int i) {
        for (int i2 = 0; i2 < this.f3150b.size(); i2++) {
            d valueAt = this.f3150b.valueAt(i2);
            if (valueAt.f3148d == i) {
                ar b2 = com.facebook.react.bridge.b.b();
                b2.putBoolean("finished", false);
                valueAt.f3147c.a(b2);
                this.f3150b.removeAt(i2);
                return;
            }
        }
    }

    public void a(int i, int i2) {
        b bVar = this.f3149a.get(i);
        if (bVar == null) {
            throw new com.facebook.react.bridge.n("Animated node with tag " + i + " does not exists");
        }
        b bVar2 = this.f3149a.get(i2);
        if (bVar2 == null) {
            throw new com.facebook.react.bridge.n("Animated node with tag " + i2 + " does not exists");
        }
        bVar.a(bVar2);
        this.f3151c.put(i2, bVar2);
    }

    public void b(int i, int i2) {
        b bVar = this.f3149a.get(i);
        if (bVar == null) {
            throw new com.facebook.react.bridge.n("Animated node with tag " + i + " does not exists");
        }
        b bVar2 = this.f3149a.get(i2);
        if (bVar2 == null) {
            throw new com.facebook.react.bridge.n("Animated node with tag " + i2 + " does not exists");
        }
        bVar.b(bVar2);
        this.f3151c.put(i2, bVar2);
    }

    public void c(int i, int i2) {
        b bVar = this.f3149a.get(i);
        if (bVar == null) {
            throw new com.facebook.react.bridge.n("Animated node with tag " + i + " does not exists");
        } else if (!(bVar instanceof m)) {
            throw new com.facebook.react.bridge.n("Animated node connected to view should beof type " + m.class.getName());
        } else {
            ((m) bVar).a(i2);
            this.f3151c.put(i, bVar);
        }
    }

    public void d(int i, int i2) {
        b bVar = this.f3149a.get(i);
        if (bVar == null) {
            throw new com.facebook.react.bridge.n("Animated node with tag " + i + " does not exists");
        } else if (!(bVar instanceof m)) {
            throw new com.facebook.react.bridge.n("Animated node connected to view should beof type " + m.class.getName());
        } else {
            ((m) bVar).b(i2);
        }
    }

    public void e(int i, int i2) {
        b bVar = this.f3149a.get(i);
        if (bVar == null) {
            return;
        }
        if (!(bVar instanceof m)) {
            throw new com.facebook.react.bridge.n("Animated node connected to view should beof type " + m.class.getName());
        }
        ((m) bVar).b();
    }

    public void a(int i, String str, an anVar) {
        int i2 = anVar.getInt("animatedValueTag");
        b bVar = this.f3149a.get(i2);
        if (bVar == null) {
            throw new com.facebook.react.bridge.n("Animated node with tag " + i2 + " does not exists");
        } else if (!(bVar instanceof q)) {
            throw new com.facebook.react.bridge.n("Animated node connected to event should beof type " + q.class.getName());
        } else {
            am e = anVar.e("nativeEventPath");
            ArrayList arrayList = new ArrayList(e.size());
            for (int i3 = 0; i3 < e.size(); i3++) {
                arrayList.add(e.getString(i3));
            }
            EventAnimationDriver eventAnimationDriver = new EventAnimationDriver(arrayList, (q) bVar);
            String str2 = i + str;
            if (this.f3152d.containsKey(str2)) {
                this.f3152d.get(str2).add(eventAnimationDriver);
                return;
            }
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(eventAnimationDriver);
            this.f3152d.put(str2, arrayList2);
        }
    }

    public void a(int i, String str, int i2) {
        String str2 = i + str;
        if (this.f3152d.containsKey(str2)) {
            List<EventAnimationDriver> list = this.f3152d.get(str2);
            if (list.size() == 1) {
                this.f3152d.remove(i + str);
                return;
            }
            ListIterator<EventAnimationDriver> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                if (listIterator.next().mValueNode.f3144d == i2) {
                    listIterator.remove();
                    return;
                }
            }
        }
    }

    @Override // com.facebook.react.uimanager.events.d
    public void a(final com.facebook.react.uimanager.events.b bVar) {
        if (ap.a()) {
            b(bVar);
        } else {
            ap.a(new Runnable() { // from class: com.facebook.react.animated.l.1
                @Override // java.lang.Runnable
                public void run() {
                    l.this.b(bVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.facebook.react.uimanager.events.b bVar) {
        if (!this.f3152d.isEmpty()) {
            String a2 = this.e.a(bVar.a());
            Map<String, List<EventAnimationDriver>> map = this.f3152d;
            List<EventAnimationDriver> list = map.get(bVar.d() + a2);
            if (list == null) {
                return;
            }
            for (EventAnimationDriver eventAnimationDriver : list) {
                a(eventAnimationDriver.mValueNode);
                bVar.a(eventAnimationDriver);
                this.h.add(eventAnimationDriver.mValueNode);
            }
            a(this.h);
            this.h.clear();
        }
    }

    public void a(long j) {
        ap.b();
        for (int i = 0; i < this.f3151c.size(); i++) {
            this.h.add(this.f3151c.valueAt(i));
        }
        this.f3151c.clear();
        boolean z = false;
        for (int i2 = 0; i2 < this.f3150b.size(); i2++) {
            d valueAt = this.f3150b.valueAt(i2);
            valueAt.a(j);
            this.h.add(valueAt.f3146b);
            if (valueAt.f3145a) {
                z = true;
            }
        }
        a(this.h);
        this.h.clear();
        if (z) {
            for (int size = this.f3150b.size() - 1; size >= 0; size--) {
                d valueAt2 = this.f3150b.valueAt(size);
                if (valueAt2.f3145a) {
                    ar b2 = com.facebook.react.bridge.b.b();
                    b2.putBoolean("finished", true);
                    valueAt2.f3147c.a(b2);
                    this.f3150b.removeAt(size);
                }
            }
        }
    }

    private void a(List<b> list) {
        this.g++;
        if (this.g == 0) {
            this.g++;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i = 0;
        for (b bVar : list) {
            if (bVar.f3143c != this.g) {
                bVar.f3143c = this.g;
                i++;
                arrayDeque.add(bVar);
            }
        }
        while (!arrayDeque.isEmpty()) {
            b bVar2 = (b) arrayDeque.poll();
            if (bVar2.f3141a != null) {
                int i2 = i;
                for (int i3 = 0; i3 < bVar2.f3141a.size(); i3++) {
                    b bVar3 = bVar2.f3141a.get(i3);
                    bVar3.f3142b++;
                    if (bVar3.f3143c != this.g) {
                        bVar3.f3143c = this.g;
                        i2++;
                        arrayDeque.add(bVar3);
                    }
                }
                i = i2;
            }
        }
        this.g++;
        if (this.g == 0) {
            this.g++;
        }
        int i4 = 0;
        for (b bVar4 : list) {
            if (bVar4.f3142b == 0 && bVar4.f3143c != this.g) {
                bVar4.f3143c = this.g;
                i4++;
                arrayDeque.add(bVar4);
            }
        }
        while (!arrayDeque.isEmpty()) {
            b bVar5 = (b) arrayDeque.poll();
            bVar5.a();
            if (bVar5 instanceof m) {
                try {
                    ((m) bVar5).c();
                } catch (com.facebook.react.uimanager.e e) {
                    com.facebook.common.e.a.b("ReactNative", "Native animation workaround, frame lost as result of race condition", e);
                }
            }
            if (bVar5 instanceof q) {
                ((q) bVar5).e();
            }
            if (bVar5.f3141a != null) {
                int i5 = i4;
                for (int i6 = 0; i6 < bVar5.f3141a.size(); i6++) {
                    b bVar6 = bVar5.f3141a.get(i6);
                    bVar6.f3142b--;
                    if (bVar6.f3143c != this.g && bVar6.f3142b == 0) {
                        bVar6.f3143c = this.g;
                        i5++;
                        arrayDeque.add(bVar6);
                    }
                }
                i4 = i5;
            }
        }
        if (i != i4) {
            throw new IllegalStateException("Looks like animated nodes graph has cycles, there are " + i + " but toposort visited only " + i4);
        }
    }
}
