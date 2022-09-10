package defpackage;
/* compiled from: PG */
/* renamed from: cwwa  reason: default package */
/* loaded from: classes5.dex */
final class cwwa {
    @dzsi
    public final dzyu a;
    @dzsi
    public final Long b;
    @dzsi
    public final Long c;
    @dzsi
    public final Long d;
    @dzsi
    public final Long e;
    @dzsi
    public final dzyb f;
    @dzsi
    public final String g;
    @dzsi
    public final Boolean h;
    @dzsi
    public final dzze i;

    public cwwa(@dzsi dzyu dzyuVar, @dzsi Long l, @dzsi Long l2, @dzsi Long l3, @dzsi Long l4, @dzsi dzyb dzybVar, @dzsi String str, @dzsi Boolean bool, @dzsi dzze dzzeVar) {
        this.a = dzyuVar;
        this.b = l;
        this.c = l2;
        this.d = l3;
        this.e = l4;
        this.f = dzybVar;
        this.g = str;
        this.h = bool;
        this.i = dzzeVar;
    }

    public final String toString() {
        return String.format("StatsRecord:\n  elapsed: %d\n  current: %d\n  Primes version: %d\n  version name #: %d\n  customName: %s\n", this.b, this.c, this.d, this.e, this.g);
    }
}
