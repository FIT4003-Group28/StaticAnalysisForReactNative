package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: anaj  reason: default package */
/* loaded from: classes.dex */
public final class anaj<T> {
    private long b = 0;
    public final Map<T, Long> a = new HashMap();

    public final synchronized long a() {
        long j;
        j = this.b + 1;
        this.b = j;
        return j;
    }
}
