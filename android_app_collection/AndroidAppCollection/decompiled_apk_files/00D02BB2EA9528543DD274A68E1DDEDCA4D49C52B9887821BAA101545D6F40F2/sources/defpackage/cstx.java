package defpackage;
/* compiled from: PG */
/* renamed from: cstx  reason: default package */
/* loaded from: classes5.dex */
final class cstx extends csuq {
    private int a;

    @Override // defpackage.csuq
    public final void b(int i) {
        this.a = i;
    }

    @Override // defpackage.csuq
    public final csur a() {
        String str = this.a == 0 ? " status" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new csty(this.a);
    }
}
