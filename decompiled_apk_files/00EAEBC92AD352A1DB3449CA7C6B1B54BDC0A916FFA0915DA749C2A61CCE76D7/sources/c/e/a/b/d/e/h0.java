package c.e.a.b.d.e;

import java.util.AbstractMap;
import java.util.Map;
/* loaded from: classes.dex */
final class h0 extends w<Map.Entry<K, V>> {

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ e0 f3915d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(e0 e0Var) {
        this.f3915d = e0Var;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        int i2;
        Object[] objArr;
        Object[] objArr2;
        i2 = this.f3915d.f3894f;
        m.a(i, i2);
        objArr = this.f3915d.f3893e;
        int i3 = i * 2;
        e0 e0Var = this.f3915d;
        Object obj = objArr[i3];
        objArr2 = e0Var.f3893e;
        return new AbstractMap.SimpleImmutableEntry(obj, objArr2[i3 + 1]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        int i;
        i = this.f3915d.f3894f;
        return i;
    }
}
