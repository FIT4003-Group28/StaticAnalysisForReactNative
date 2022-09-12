package defpackage;
/* compiled from: PG */
/* renamed from: csnr  reason: default package */
/* loaded from: classes5.dex */
public final class csnr<V> extends csny<V> {
    public dbsg<V> a = dbpy.a;
    public int b;
    private Long c;

    @Override // defpackage.csny
    public final void b(long j) {
        this.c = Long.valueOf(j);
    }

    @Override // defpackage.csny
    public final csoa<V> a() {
        String str = this.b == 0 ? " state" : "";
        if (this.c == null) {
            str = str.concat(" timestamp");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new csns(this.a, this.b, this.c.longValue());
    }
}
