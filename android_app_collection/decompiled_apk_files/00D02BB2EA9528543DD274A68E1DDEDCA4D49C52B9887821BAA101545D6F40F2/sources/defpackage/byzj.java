package defpackage;
/* compiled from: PG */
/* renamed from: byzj  reason: default package */
/* loaded from: classes4.dex */
public final class byzj {
    public final cjsw a = new cjsw(1.0f, 10000.0f, 100, true);
    public int b = 0;
    public int c = 0;
    public int d = 0;

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.b("routeSnappingLatencyMs", this.a);
        b.f("jumpedAcrossSegmentsCount", this.b);
        b.f("unsnappedLocations", this.c);
        b.f("totalProcessedLocations", this.d);
        b.c();
        return b.toString();
    }
}
