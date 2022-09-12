package defpackage;
/* compiled from: PG */
/* renamed from: dygf  reason: default package */
/* loaded from: classes6.dex */
public final class dygf {
    public String a;
    public dygg b;
    public dygs c;
    private Long d;

    public final dygh a() {
        dbsk.t(this.a, "description");
        dbsk.t(this.b, "severity");
        dbsk.t(this.d, "timestampNanos");
        dbsk.m(true, "at least one of channelRef and subchannelRef must be null");
        return new dygh(this.a, this.b, this.d.longValue(), this.c);
    }

    public final void b(long j) {
        this.d = Long.valueOf(j);
    }
}
