package defpackage;
/* compiled from: PG */
/* renamed from: vss  reason: default package */
/* loaded from: classes4.dex */
public final class vss {
    public final long a;
    public final String b;
    public final byte[] c;
    public final long d;
    public final long e;
    public final boolean f;

    public vss(long j, String str, byte[] bArr, long j2, long j3, boolean z) {
        this.a = j;
        this.b = str;
        this.c = bArr;
        this.d = j2;
        this.e = j3;
        this.f = z;
    }

    public static vss a(vsn vsnVar) {
        boolean z;
        long c = vsnVar.c();
        long j = vsnVar.c;
        long d = vsnVar.d();
        String g = vsnVar.g();
        if (d == 1) {
            d = vsnVar.e();
            z = true;
        } else {
            z = false;
        }
        return new vss(d, g, g.equals("uuid") ? vsnVar.l(16) : null, c, vsnVar.c - j, z);
    }
}
