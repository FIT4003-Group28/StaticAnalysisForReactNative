package defpackage;

import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ajqf  reason: default package */
/* loaded from: classes.dex */
public abstract class ajqf implements ajsa {
    public final List a;
    private final Map b;
    private final ajqe c;

    public ajqf() {
        this(amyc.b, amyc.b);
    }

    private final void g(Class cls) {
        aqxo.y(!this.b.containsKey(cls));
        this.b.put(cls, Integer.valueOf(d()));
        this.a.add(cls);
    }

    protected abstract ajru a(int i);

    @Override // defpackage.ajsa
    public final int c(Object obj) {
        Integer num;
        if (obj == null || (num = (Integer) this.b.get(obj.getClass())) == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // defpackage.ajsa
    public final int d() {
        return this.a.size();
    }

    @Override // defpackage.ajsa
    public final ajru e(int i, ViewGroup viewGroup) {
        if (i < 0 || i > d()) {
            return null;
        }
        ajru a = a(i);
        if (a != null) {
            return a;
        }
        ajqe ajqeVar = this.c;
        Class cls = (Class) this.a.get(i);
        if (ajqeVar.a.containsKey(cls)) {
            return (ajru) ((azqb) ajqeVar.a.get(cls)).get();
        }
        ajry a2 = ajqeVar.a(cls);
        if (a2 != null) {
            return a2.b(viewGroup);
        }
        return null;
    }

    @Override // defpackage.ajsa
    public final void f(Class cls, ajry ajryVar) {
        cls.getClass();
        ajryVar.getClass();
        if (this.b.containsKey(cls)) {
            ajry a = this.c.a(cls);
            boolean z = false;
            if (a != null && a.getClass().isInstance(ajryVar)) {
                z = true;
            }
            aqxo.F(z, "Attempted to register a presenter factory with the same model type twice.model=%s  registered=%s  new=%s", cls, a.getClass(), ajryVar.getClass());
            return;
        }
        g(cls);
        this.c.b.put(cls, ajryVar);
    }

    public ajqf(Map map, Map map2) {
        amvn keySet;
        amvn keySet2;
        if (!map.isEmpty() && !map2.isEmpty()) {
            amyc amycVar = (amyc) map;
            amyc amycVar2 = (amyc) map2;
            if (amycVar.d >= amycVar2.d) {
                keySet = ((amup) map2).keySet();
            } else {
                keySet = ((amup) map).keySet();
            }
            if (amycVar.d < amycVar2.d) {
                keySet2 = ((amup) map2).keySet();
            } else {
                keySet2 = ((amup) map).keySet();
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet(keySet);
            linkedHashSet.retainAll(keySet2);
            if (!linkedHashSet.isEmpty()) {
                String valueOf = String.valueOf(linkedHashSet.toString());
                throw new IllegalStateException(valueOf.length() != 0 ? "Duplicate keys are not allowed in the maps provided to BasePresenterViewPool.Repeated entries: ".concat(valueOf) : new String("Duplicate keys are not allowed in the maps provided to BasePresenterViewPool.Repeated entries: "));
            }
        }
        this.c = new ajqe(map, map2);
        int max = Math.max(((amyc) map2).d + ((amyc) map).d, 16);
        this.b = new HashMap(max);
        this.a = new ArrayList(max);
        for (Class cls : ((amup) map2).keySet()) {
            g(cls);
        }
        for (Class cls2 : ((amup) map).keySet()) {
            g(cls2);
        }
    }
}
