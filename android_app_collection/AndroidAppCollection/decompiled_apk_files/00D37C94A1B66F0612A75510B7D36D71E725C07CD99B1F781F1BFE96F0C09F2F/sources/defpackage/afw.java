package defpackage;

import j$.util.Map;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: afw  reason: default package */
/* loaded from: classes.dex */
public class afw extends agd implements Map, j$.util.Map {
    afq a;
    afs b;
    afu c;

    public afw() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object[] a(Object[] objArr, int i) {
        int i2 = this.j;
        if (objArr.length < i2) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2);
        }
        for (int i3 = 0; i3 < i2; i3++) {
            objArr[i3] = this.i[i3 + i3 + i];
        }
        if (objArr.length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final Set entrySet() {
        afq afqVar = this.a;
        if (afqVar == null) {
            afq afqVar2 = new afq(this);
            this.a = afqVar2;
            return afqVar2;
        }
        return afqVar;
    }

    @Override // j$.util.Map
    public final /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, j$.util.Map
    public final Set keySet() {
        afs afsVar = this.b;
        if (afsVar == null) {
            afs afsVar2 = new afs(this);
            this.b = afsVar2;
            return afsVar2;
        }
        return afsVar;
    }

    @Override // j$.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final void putAll(java.util.Map map) {
        j(this.j + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // j$.util.Map
    public final /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final Collection values() {
        afu afuVar = this.c;
        if (afuVar == null) {
            afu afuVar2 = new afu(this);
            this.c = afuVar2;
            return afuVar2;
        }
        return afuVar;
    }

    public afw(int i) {
        super(i);
    }

    public afw(agd agdVar) {
        k(agdVar);
    }
}
