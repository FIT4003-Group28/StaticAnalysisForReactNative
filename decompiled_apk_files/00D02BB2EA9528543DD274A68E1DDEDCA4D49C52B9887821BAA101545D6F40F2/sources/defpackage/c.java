package defpackage;

import java.lang.reflect.Method;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: c  reason: default package */
/* loaded from: classes.dex */
public final class c {
    final int a;
    final Method b;

    public c(int i, Method method) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && this.b.getName().equals(cVar.b.getName());
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.getName().hashCode();
    }
}
