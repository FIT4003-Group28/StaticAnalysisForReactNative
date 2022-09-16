package defpackage;
/* compiled from: PG */
/* renamed from: ayaj  reason: default package */
/* loaded from: classes2.dex */
public abstract class ayaj extends ayaa {
    public abstract String b();

    public abstract void c();

    public abstract void d();

    public ayba e() {
        throw null;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final String toString() {
        ampp c = akzj.c(this);
        c.b("policy", b());
        c.e("priority", 5);
        c.g("available", true);
        return c.toString();
    }
}
