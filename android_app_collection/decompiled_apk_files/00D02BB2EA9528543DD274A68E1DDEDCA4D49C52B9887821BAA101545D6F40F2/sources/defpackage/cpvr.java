package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: cpvr  reason: default package */
/* loaded from: classes5.dex */
public final class cpvr<T> {
    public final Map<cpvf<?>, cpve<T, ?>> a = cpwj.a();

    public final <R> cpve<T, R> a(cpvf<R> cpvfVar) {
        return (cpve<T, ?>) this.a.get(cpvfVar);
    }
}
