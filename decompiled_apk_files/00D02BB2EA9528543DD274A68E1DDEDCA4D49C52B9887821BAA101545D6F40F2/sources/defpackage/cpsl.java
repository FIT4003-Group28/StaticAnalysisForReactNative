package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cpsl  reason: default package */
/* loaded from: classes5.dex */
public final class cpsl<D> {
    public final Map<D, Integer> a = cpwj.a();
    public final List<D> b = cpwi.a();

    public final Integer a(D d) {
        return this.a.get(d);
    }

    public final D b() {
        if (this.b.isEmpty()) {
            return null;
        }
        return this.b.get(0);
    }

    public final D c() {
        if (this.b.isEmpty()) {
            return null;
        }
        List<D> list = this.b;
        return list.get(list.size() - 1);
    }

    public final int d() {
        return this.a.size();
    }
}
