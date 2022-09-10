package defpackage;
/* compiled from: PG */
/* renamed from: bqll  reason: default package */
/* loaded from: classes4.dex */
final class bqll extends bqmj {
    private bqmi a;
    private bqmi b;
    private Long c;

    public bqll() {
    }

    public bqll(bqmk bqmkVar) {
        bqlm bqlmVar = (bqlm) bqmkVar;
        this.a = bqlmVar.a;
        this.b = bqlmVar.b;
        this.c = Long.valueOf(bqlmVar.c);
    }

    @Override // defpackage.bqmj
    public final void b(@dzsi bqmi bqmiVar) {
        this.a = bqmiVar;
    }

    @Override // defpackage.bqmj
    public final void c(@dzsi bqmi bqmiVar) {
        this.b = bqmiVar;
    }

    @Override // defpackage.bqmj
    public final void d(long j) {
        this.c = Long.valueOf(j);
    }

    @Override // defpackage.bqmj
    public final bqmk a() {
        String str = this.c == null ? " timestampOfLatestRequestSentOrToBeSent" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new bqlm(this.a, this.b, this.c.longValue());
    }
}
