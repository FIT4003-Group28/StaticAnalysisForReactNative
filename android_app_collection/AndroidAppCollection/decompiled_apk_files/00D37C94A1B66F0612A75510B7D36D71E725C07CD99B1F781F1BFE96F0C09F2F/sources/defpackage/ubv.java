package defpackage;
/* compiled from: PG */
/* renamed from: ubv  reason: default package */
/* loaded from: classes4.dex */
public final class ubv {
    public Long a;
    private Long b;

    public final ubz a() {
        Long l = this.b;
        if (l == null) {
            throw new IllegalStateException("Missing required properties: startTime");
        }
        return new ubz(this.a, l.longValue());
    }

    public final void b(long j) {
        this.b = Long.valueOf(j);
    }
}
