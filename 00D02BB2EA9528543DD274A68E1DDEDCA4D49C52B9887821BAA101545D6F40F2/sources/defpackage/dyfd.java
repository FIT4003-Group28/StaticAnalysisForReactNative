package defpackage;
/* compiled from: PG */
/* renamed from: dyfd  reason: default package */
/* loaded from: classes6.dex */
public final class dyfd {
    public final dyet a;
    private final dyel b;

    public dyfd(dyel dyelVar, dyet dyetVar) {
        dbsk.t(dyelVar, "transportAttrs");
        this.b = dyelVar;
        dbsk.t(dyetVar, "callOptions");
        this.a = dyetVar;
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("transportAttrs", this.b);
        b.b("callOptions", this.a);
        return b.toString();
    }
}
