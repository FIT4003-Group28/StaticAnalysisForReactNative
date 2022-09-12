package defpackage;

import java.lang.Enum;
import java.util.EnumMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: hug  reason: default package */
/* loaded from: classes.dex */
final class hug<T extends Enum<T>> {
    final /* synthetic */ hui a;
    private final Map<T, Long> b;
    @dzsi
    private T c = null;
    private long d = 0;
    private final ckha e;
    private final huh<T> f;

    public hug(hui huiVar, Class<T> cls, ckha ckhaVar, huh<T> huhVar) {
        this.a = huiVar;
        this.b = new EnumMap(cls);
        this.e = ckhaVar;
        this.f = huhVar;
    }

    private final void c() {
        T t = this.c;
        if (t == null) {
            return;
        }
        Long l = this.b.get(t);
        if (l == null) {
            l = 0L;
        }
        this.b.put(this.c, Long.valueOf(l.longValue() + (this.a.a.e() - this.d)));
    }

    public final void a(T t) {
        c();
        T t2 = this.c;
        if (t2 != null) {
            this.b.get(t2);
        }
        this.c = t;
        this.d = this.a.a.e();
    }

    public final void b() {
        c();
        for (Map.Entry<T, Long> entry : this.b.entrySet()) {
            Long value = entry.getValue();
            if (value != null && value.longValue() > 0) {
                ((ckcp) this.a.b.a(this.e)).b(this.f.a(entry.getKey()), value.longValue());
            }
        }
        this.b.clear();
        this.c = null;
        this.d = 0L;
    }
}
