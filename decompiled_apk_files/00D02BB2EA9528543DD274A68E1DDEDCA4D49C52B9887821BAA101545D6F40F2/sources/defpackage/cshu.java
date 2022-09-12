package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: cshu  reason: default package */
/* loaded from: classes5.dex */
public final class cshu<T> {
    public final Set<cshr<T>> a;
    private final cskb b;

    public cshu(Set set, cskb cskbVar) {
        this.a = set;
        this.b = cskbVar;
    }

    public static final void d() {
        int i = cske.a;
    }

    public final boolean a() {
        return !this.a.isEmpty();
    }

    public final void b(T t) {
        if (!this.a.isEmpty()) {
            for (cshr<T> cshrVar : this.a) {
                cshrVar.a(t);
            }
        }
    }

    public final void c(T t) {
        if (!this.a.isEmpty()) {
            for (cshr<T> cshrVar : this.a) {
                cshrVar.b(t);
            }
        }
    }
}
