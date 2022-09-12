package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: bmq  reason: default package */
/* loaded from: classes3.dex */
public abstract class bmq<V, O> implements bmp<V, O> {
    public final List<bpt<V>> a;

    public bmq(V v) {
        this(Collections.singletonList(new bpt(v)));
    }

    public bmq(List<bpt<V>> list) {
        this.a = list;
    }

    @Override // defpackage.bmp
    public final List<bpt<V>> b() {
        return this.a;
    }

    @Override // defpackage.bmp
    public final boolean c() {
        return this.a.isEmpty() || (this.a.size() == 1 && this.a.get(0).d());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.a.toArray()));
        }
        return sb.toString();
    }
}
