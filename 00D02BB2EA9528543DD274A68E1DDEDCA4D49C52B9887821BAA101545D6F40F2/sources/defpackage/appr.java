package defpackage;
/* compiled from: PG */
/* renamed from: appr  reason: default package */
/* loaded from: classes2.dex */
public final class appr extends appv {
    public dbsg<Long> a = dbpy.a;
    public int b;

    @Override // defpackage.appv
    public final appw a() {
        String str = this.b == 0 ? " status" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new apps(this.b, this.a);
    }
}
