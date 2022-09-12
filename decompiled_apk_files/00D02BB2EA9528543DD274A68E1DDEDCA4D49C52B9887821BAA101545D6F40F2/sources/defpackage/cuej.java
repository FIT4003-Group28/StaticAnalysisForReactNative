package defpackage;
/* compiled from: PG */
/* renamed from: cuej  reason: default package */
/* loaded from: classes5.dex */
final class cuej extends cuhj {
    private String a;

    @Override // defpackage.cuhj
    public final void b(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null url");
    }

    @Override // defpackage.cuhj
    public final cuhk a() {
        String str = this.a == null ? " url" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new cuek(this.a);
    }
}
