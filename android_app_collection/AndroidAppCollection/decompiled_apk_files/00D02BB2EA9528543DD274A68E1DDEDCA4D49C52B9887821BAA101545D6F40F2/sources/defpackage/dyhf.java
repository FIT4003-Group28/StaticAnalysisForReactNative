package defpackage;
/* compiled from: PG */
/* renamed from: dyhf  reason: default package */
/* loaded from: classes6.dex */
public abstract class dyhf extends dygw {
    public abstract boolean b();

    public abstract int c();

    public abstract String d();

    public dyie e() {
        throw null;
    }

    public final boolean equals(Object obj) {
        return this == obj;
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("policy", d());
        b.f("priority", c());
        b.h("available", b());
        return b.toString();
    }
}
