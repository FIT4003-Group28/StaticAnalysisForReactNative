package defpackage;
/* compiled from: PG */
/* renamed from: cujo  reason: default package */
/* loaded from: classes5.dex */
final class cujo extends cujs {
    private String a;

    @Override // defpackage.cujs
    public final void b(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null filename");
    }

    @Override // defpackage.cujs
    public final cujt a() {
        String str = this.a == null ? " filename" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new cujp(this.a);
    }
}
