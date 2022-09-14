package defpackage;
/* compiled from: PG */
/* renamed from: bzdd  reason: default package */
/* loaded from: classes4.dex */
public final class bzdd {
    public static final bzdd a = new bzdd(bzdc.NOT_STOPPED, false, "");
    public static final bzdd b = new bzdd(bzdc.STOP_ONLY, true, "");
    public static final bzdd c = new bzdd(bzdc.ARRIVED, false, "");
    public static final bzdd d = new bzdd(bzdc.NAVIGATION_STARTED, true, "");
    public final bzdc e;
    public final boolean f;
    public final String g;

    public bzdd(bzdc bzdcVar, boolean z, String str) {
        this.e = bzdcVar;
        this.f = z;
        this.g = str;
    }

    public static bzdd a(Throwable th) {
        return new bzdd(bzdc.ERROR, false, dbue.g(th));
    }

    public final String toString() {
        dbsb b2 = dbsc.b(this);
        b2.b("type", this.e);
        b2.h("explicit", this.f);
        b2.b("message", this.g);
        return b2.toString();
    }
}
