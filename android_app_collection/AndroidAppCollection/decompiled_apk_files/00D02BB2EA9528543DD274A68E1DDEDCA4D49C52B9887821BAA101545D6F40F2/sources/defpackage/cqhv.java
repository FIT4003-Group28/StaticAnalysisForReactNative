package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cqhv  reason: default package */
/* loaded from: classes.dex */
public final class cqhv {
    public final Map<cqiw<?>, cqmj<?>> a = new HashMap();

    @dzsi
    public final <T extends cqkp> cqmj<T> a(cqiw<T> cqiwVar) {
        return (cqmj<T>) this.a.get(cqiwVar);
    }

    public final void b() {
        this.a.clear();
    }
}
