package defpackage;

import java.lang.reflect.Method;
/* compiled from: PG */
/* renamed from: d  reason: default package */
/* loaded from: classes3.dex */
final class d {
    final int a;
    final Method b;

    public d(int i, Method method) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && this.b.getName().equals(dVar.b.getName());
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.getName().hashCode();
    }
}
