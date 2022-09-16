package defpackage;

import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dgtf  reason: default package */
/* loaded from: classes6.dex */
public final class dgtf extends dgtc {
    private final dguv<String, dgtc> a = new dguv<>();

    public final void a(String str, dgtc dgtcVar) {
        this.a.put(str, dgtcVar);
    }

    public final Set<Map.Entry<String, dgtc>> b() {
        return this.a.entrySet();
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof dgtf) && ((dgtf) obj).a.equals(this.a));
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
