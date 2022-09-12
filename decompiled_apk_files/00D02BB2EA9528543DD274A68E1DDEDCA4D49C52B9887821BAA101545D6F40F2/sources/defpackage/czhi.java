package defpackage;

import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: czhi  reason: default package */
/* loaded from: classes.dex */
final class czhi implements czhf {
    private final ConcurrentHashMap<Object, Object> a = new ConcurrentHashMap<>();

    @Override // defpackage.czhf
    public final Object a(Object obj) {
        Object obj2 = this.a.get(obj);
        if (obj2 == null) {
            this.a.putIfAbsent(obj, new Object());
            return this.a.get(obj);
        }
        return obj2;
    }
}
