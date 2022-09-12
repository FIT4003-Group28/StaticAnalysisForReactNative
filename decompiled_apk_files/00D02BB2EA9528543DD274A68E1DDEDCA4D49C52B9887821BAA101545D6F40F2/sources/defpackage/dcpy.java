package defpackage;
/* compiled from: PG */
/* renamed from: dcpy  reason: default package */
/* loaded from: classes.dex */
public final class dcpy {
    public final Object a;
    private final Object b;

    public dcpy(Object obj, Object obj2) {
        this.b = obj;
        dbsk.s(obj2);
        this.a = obj2;
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("source", this.b);
        b.b("event", this.a);
        return b.toString();
    }
}
