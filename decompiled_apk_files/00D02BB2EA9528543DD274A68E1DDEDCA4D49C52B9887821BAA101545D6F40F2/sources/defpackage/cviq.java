package defpackage;
/* compiled from: PG */
/* renamed from: cviq  reason: default package */
/* loaded from: classes5.dex */
final class cviq {
    public Throwable a;
    public int b;

    public final cviw a() {
        String str = this.b == 0 ? " code" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new cvir(this.b, this.a);
    }
}
