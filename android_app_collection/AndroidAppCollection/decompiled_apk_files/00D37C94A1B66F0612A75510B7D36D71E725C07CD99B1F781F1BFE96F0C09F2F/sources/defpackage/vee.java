package defpackage;

import java.util.LinkedHashMap;
/* compiled from: PG */
/* renamed from: vee  reason: default package */
/* loaded from: classes4.dex */
final class vee {
    private final LinkedHashMap a = new ved();

    public final synchronized Object a(Object obj) {
        return this.a.get(obj);
    }

    public final synchronized void b(Object obj, Object obj2) {
        this.a.put(obj, obj2);
    }
}
