package defpackage;
/* compiled from: PG */
/* renamed from: amup  reason: default package */
/* loaded from: classes2.dex */
public final class amup {
    @dzsi
    public amuo a;
    private final dovv b;

    private amup(dovv dovvVar) {
        this.b = dovvVar;
    }

    @dzsi
    public static amup a(@dzsi dovv dovvVar) {
        if (dovvVar == null || (dovvVar.a & 1) == 0) {
            return null;
        }
        return new amup(dovvVar);
    }

    public final dovu b() {
        dovu b = dovu.b(this.b.b);
        return b == null ? dovu.TYPE_TO_ROAD_NAME : b;
    }

    public final String c() {
        return this.b.c;
    }

    public final String d() {
        dovv dovvVar = this.b;
        return (dovvVar.a & 32) != 0 ? dovvVar.d : c();
    }

    @dzsi
    public final String e() {
        dovv dovvVar = this.b;
        if ((dovvVar.a & 128) != 0) {
            return dovvVar.e;
        }
        return null;
    }

    @dzsi
    public final String f() {
        dovv dovvVar = this.b;
        if ((dovvVar.a & 256) != 0) {
            return dovvVar.f;
        }
        return null;
    }

    public final boolean g() {
        return b() == dovu.TYPE_EXIT_NAME || b() == dovu.TYPE_EXIT_NUMBER;
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.c();
        b.b("type", b().name());
        int a = dovs.a(this.b.g);
        b.b("priority", (a == 0 || a == 1) ? "UNKNOWN_STEP_CUE_PRIORITY" : a != 2 ? "SECONDARY" : "PRIMARY");
        b.b("name", c());
        return b.toString();
    }
}
