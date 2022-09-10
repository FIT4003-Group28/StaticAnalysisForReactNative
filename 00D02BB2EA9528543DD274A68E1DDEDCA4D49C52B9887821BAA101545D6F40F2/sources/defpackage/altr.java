package defpackage;

import java.util.Collection;
import java.util.Map;
/* compiled from: PG */
/* renamed from: altr  reason: default package */
/* loaded from: classes.dex */
public final class altr<K, V> extends btnc<K, V> {
    private Collection<K> a;
    private final Map<K, V> b;

    public altr(int i, @dzsi btmz btmzVar, @dzsi btmv btmvVar) {
        super(i, btmzVar, btmvVar);
        this.a = dcmr.a;
        this.b = dcjz.d();
    }

    @Override // defpackage.btnc
    @dzsi
    public final synchronized V a(K k) {
        V v = (V) super.a(k);
        if (v != null) {
            return v;
        }
        return this.b.get(k);
    }

    @Override // defpackage.btnc
    protected final synchronized void d(K k, V v) {
        if (this.a.contains(k)) {
            this.b.put(k, v);
        }
    }

    @Override // defpackage.btnc
    public final synchronized void e() {
        f(dcdc.e());
        super.e();
    }

    public final synchronized void f(Collection<K> collection) {
        this.a = collection;
        this.b.keySet().retainAll(this.a);
    }
}
