package defpackage;
/* compiled from: PG */
/* renamed from: aobd  reason: default package */
/* loaded from: classes.dex */
public final class aobd {
    public String a;
    public int b;
    private Long c;

    public final aobe a() {
        Long l = this.c;
        if (l == null) {
            throw new IllegalStateException("Missing required properties: tokenExpirationTimestamp");
        }
        return new aobe(this.a, l.longValue(), this.b);
    }

    public final void b(long j) {
        this.c = Long.valueOf(j);
    }
}
