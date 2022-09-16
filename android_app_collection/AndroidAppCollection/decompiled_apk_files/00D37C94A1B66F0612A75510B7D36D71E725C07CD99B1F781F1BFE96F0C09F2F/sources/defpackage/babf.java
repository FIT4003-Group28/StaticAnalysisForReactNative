package defpackage;
/* compiled from: PG */
/* renamed from: babf  reason: default package */
/* loaded from: classes2.dex */
public final class babf implements babl {
    private final baba a;
    private final baay b;
    private babi c;
    private int d;
    private boolean e;
    private long f;

    public babf(baba babaVar) {
        this.a = babaVar;
        baay baayVar = ((babh) babaVar).a;
        this.b = baayVar;
        babi babiVar = baayVar.a;
        this.c = babiVar;
        this.d = babiVar != null ? babiVar.b : -1;
    }

    @Override // defpackage.babl, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e = true;
    }

    @Override // defpackage.babl
    public final long e(baay baayVar, long j) {
        babi babiVar;
        babi babiVar2;
        if (!this.e) {
            babi babiVar3 = this.c;
            if (babiVar3 == null || (babiVar3 == (babiVar2 = this.b.a) && this.d == babiVar2.b)) {
                if (!this.a.n(this.f + 1)) {
                    return -1L;
                }
                if (this.c == null && (babiVar = this.b.a) != null) {
                    this.c = babiVar;
                    this.d = babiVar.b;
                }
                long min = Math.min(8192L, this.b.b - this.f);
                baay baayVar2 = this.b;
                long j2 = this.f;
                babm.a(baayVar2.b, j2, min);
                if (min != 0) {
                    baayVar.b += min;
                    babi babiVar4 = baayVar2.a;
                    while (true) {
                        long j3 = babiVar4.c - babiVar4.b;
                        if (j2 < j3) {
                            break;
                        }
                        j2 -= j3;
                        babiVar4 = babiVar4.f;
                    }
                    long j4 = min;
                    while (j4 > 0) {
                        babi b = babiVar4.b();
                        int i = (int) (b.b + j2);
                        b.b = i;
                        b.c = Math.min(i + ((int) j4), b.c);
                        babi babiVar5 = baayVar.a;
                        if (babiVar5 == null) {
                            b.g = b;
                            b.f = b;
                            baayVar.a = b;
                        } else {
                            babiVar5.g.d(b);
                        }
                        j4 -= b.c - b.b;
                        babiVar4 = babiVar4.f;
                        j2 = 0;
                    }
                }
                this.f += min;
                return min;
            }
            throw new IllegalStateException("Peek source is invalid because upstream source was used");
        }
        throw new IllegalStateException("closed");
    }
}
