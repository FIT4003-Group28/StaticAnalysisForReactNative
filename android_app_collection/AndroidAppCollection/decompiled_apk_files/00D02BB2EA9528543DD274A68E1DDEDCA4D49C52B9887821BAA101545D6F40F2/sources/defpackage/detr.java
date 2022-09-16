package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: detr  reason: default package */
/* loaded from: classes6.dex */
public final class detr extends detx {
    public String a;
    public int b;
    private Long c;

    @Override // defpackage.detx
    public final void b(long j) {
        this.c = Long.valueOf(j);
    }

    @Override // defpackage.detx
    public final dety a() {
        String str = this.c == null ? " tokenExpirationTimestamp" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new dets(this.a, this.c.longValue(), this.b);
    }
}
