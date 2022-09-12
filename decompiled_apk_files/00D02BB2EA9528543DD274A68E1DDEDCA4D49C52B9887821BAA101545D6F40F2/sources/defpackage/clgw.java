package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: clgw  reason: default package */
/* loaded from: classes5.dex */
public abstract class clgw {
    static final clgw a;

    public abstract long a();

    public abstract int b();

    public abstract int c();

    public abstract long d();

    public abstract int e();

    static {
        clgr clgrVar = new clgr();
        clgrVar.a = 10485760L;
        clgrVar.b = 200;
        clgrVar.c = 10000;
        clgrVar.d = 604800000L;
        clgrVar.e = 81920;
        String str = clgrVar.a == null ? " maxStorageSizeInBytes" : "";
        if (clgrVar.b == null) {
            str = str.concat(" loadBatchSize");
        }
        if (clgrVar.c == null) {
            str = String.valueOf(str).concat(" criticalSectionEnterTimeoutMs");
        }
        if (clgrVar.d == null) {
            str = String.valueOf(str).concat(" eventCleanUpAge");
        }
        if (clgrVar.e == null) {
            str = String.valueOf(str).concat(" maxBlobByteSizePerRow");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        } else {
            a = new clgs(clgrVar.a.longValue(), clgrVar.b.intValue(), clgrVar.c.intValue(), clgrVar.d.longValue(), clgrVar.e.intValue());
        }
    }
}
