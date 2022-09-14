package defpackage;
/* compiled from: PG */
/* renamed from: aznp  reason: default package */
/* loaded from: classes3.dex */
final class aznp {
    public final long a;
    public final azxl b;
    public final String c;
    public final long d;
    public final aznl e;
    public final byte[] f;
    @dzsi
    public final String g;
    @dzsi
    public final Long h;
    @dzsi
    public final Integer i;
    @dzsi
    public final Integer j;
    @dzsi
    public final Long k;
    @dzsi
    public final String l;

    public aznp(azxl azxlVar, String str, long j, long j2, aznl aznlVar, byte[] bArr, @dzsi String str2, @dzsi Long l, @dzsi Integer num, @dzsi Integer num2, @dzsi Long l2, @dzsi String str3) {
        this.b = azxlVar;
        this.c = str;
        this.a = j;
        this.d = j2;
        this.e = aznlVar;
        this.f = bArr;
        this.g = str2;
        this.h = l;
        this.i = num;
        this.j = num2;
        this.k = l2;
        this.l = str3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(double d) {
        return (int) Math.round(d * 1000000.0d);
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.g("RowId", this.a);
        b.b("SyncState", this.e.name());
        b.b("ClientId", this.c);
        b.b("ServerId", this.g);
        b.g("Timestamp", this.d);
        b.b("FeatureFingerprint", this.h);
        b.b("Latitude", this.i);
        b.b("Longitude", this.j);
        b.b("NumericalIndex", this.k);
        b.b("StringIndex", this.l);
        b.f("|ItemProto|", this.f.length);
        return b.toString();
    }
}
