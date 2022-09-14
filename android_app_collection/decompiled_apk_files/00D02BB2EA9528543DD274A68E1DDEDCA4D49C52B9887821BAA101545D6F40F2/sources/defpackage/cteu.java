package defpackage;
/* compiled from: PG */
/* renamed from: cteu  reason: default package */
/* loaded from: classes5.dex */
public final class cteu extends ctfs {
    public dbsg<ctyy> a = dbpy.a;
    public dbsg<ctzp> b = dbpy.a;
    public dbsg<Long> c = dbpy.a;
    public int d;

    @Override // defpackage.ctfs
    public final ctft a() {
        String str = this.d == 0 ? " status" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new ctev(this.d, this.a, this.b, this.c);
    }
}
