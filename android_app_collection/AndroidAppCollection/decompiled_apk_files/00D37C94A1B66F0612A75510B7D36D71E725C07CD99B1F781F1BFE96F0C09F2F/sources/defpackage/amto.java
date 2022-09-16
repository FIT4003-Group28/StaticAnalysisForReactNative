package defpackage;

import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;
/* compiled from: PG */
/* renamed from: amto  reason: default package */
/* loaded from: classes.dex */
final class amto extends AbstractMap implements Serializable, amsa {
    private final amtu a;
    private transient Set b;

    public amto(amtu amtuVar) {
        this.a = amtuVar;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.a.g = this;
    }

    @Override // defpackage.amsa
    public final amsa a() {
        throw null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.b;
        if (set == null) {
            amtp amtpVar = new amtp(this.a);
            this.b = amtpVar;
            return amtpVar;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        amtu amtuVar = this.a;
        int e = amtuVar.e(obj);
        if (e == -1) {
            return null;
        }
        return amtuVar.a[e];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.a.values();
    }

    @Override // java.util.AbstractMap, java.util.Map, defpackage.amsa
    public final Object put(Object obj, Object obj2) {
        return this.a.l(obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        amtu amtuVar = this.a;
        int G = arey.G(obj);
        int f = amtuVar.f(obj, G);
        if (f == -1) {
            return null;
        }
        Object obj2 = amtuVar.a[f];
        amtuVar.k(f, G);
        return obj2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return this.a.keySet();
    }
}
