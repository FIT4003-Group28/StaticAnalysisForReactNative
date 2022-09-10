package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: azwq  reason: default package */
/* loaded from: classes3.dex */
public abstract class azwq {
    public abstract dndr a();

    public abstract dcen<azwu> b();

    public abstract azwv c();

    public abstract void d(@dzsi Long l);

    public abstract void e(@dzsi dndr dndrVar);

    public abstract void f(@dzsi List<azvo> list);

    public abstract void g(Set<azwu> set);

    public abstract void h(boolean z);

    public final azwv i() {
        if (a() != null && (a() == dndr.HOME || a() == dndr.WORK)) {
            d(0L);
        }
        return c();
    }

    public final void j(Iterable<azwu> iterable) {
        b().i(iterable);
    }
}
