package defpackage;
/* compiled from: PG */
/* renamed from: cvis  reason: default package */
/* loaded from: classes5.dex */
public final class cvis {
    public Long a;
    private Long b;

    public final void b(long j) {
        this.b = Long.valueOf(j);
    }

    public final cvix a() {
        String str = this.b == null ? " startTime" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new cvit(this.a, this.b.longValue());
    }
}
