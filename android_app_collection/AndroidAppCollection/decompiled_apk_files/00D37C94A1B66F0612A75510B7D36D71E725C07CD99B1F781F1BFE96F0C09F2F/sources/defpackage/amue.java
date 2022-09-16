package defpackage;

import java.util.EnumMap;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amue  reason: default package */
/* loaded from: classes.dex */
public final class amue extends amun {
    private final transient EnumMap b;

    public amue(EnumMap enumMap) {
        this.b = enumMap;
        aqxo.p(!enumMap.isEmpty());
    }

    @Override // defpackage.amun
    public final amzs a() {
        return new amwt(this.b.entrySet().iterator());
    }

    @Override // defpackage.amup, java.util.Map, j$.util.Map
    public final boolean containsKey(Object obj) {
        return this.b.containsKey(obj);
    }

    @Override // defpackage.amup, java.util.Map, j$.util.Map
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof amue) {
            obj = ((amue) obj).b;
        }
        return this.b.equals(obj);
    }

    @Override // defpackage.amup, java.util.Map, j$.util.Map
    public final Object get(Object obj) {
        return this.b.get(obj);
    }

    @Override // defpackage.amup
    public final amzs se() {
        Iterator it = this.b.keySet().iterator();
        it.getClass();
        if (it instanceof amzs) {
            return (amzs) it;
        }
        return new amvy(it);
    }

    @Override // defpackage.amup
    public final void sf() {
    }

    @Override // java.util.Map, j$.util.Map
    public final int size() {
        return this.b.size();
    }

    @Override // defpackage.amup
    Object writeReplace() {
        return new amud(this.b);
    }
}
