package c.a.a.v.j;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class n<V, O> implements m<V, O> {

    /* renamed from: a  reason: collision with root package name */
    final List<c.a.a.z.a<V>> f2467a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(V v) {
        this(Collections.singletonList(new c.a.a.z.a(v)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(List<c.a.a.z.a<V>> list) {
        this.f2467a = list;
    }

    @Override // c.a.a.v.j.m
    public List<c.a.a.z.a<V>> b() {
        return this.f2467a;
    }

    @Override // c.a.a.v.j.m
    public boolean c() {
        return this.f2467a.isEmpty() || (this.f2467a.size() == 1 && this.f2467a.get(0).g());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.f2467a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.f2467a.toArray()));
        }
        return sb.toString();
    }
}
