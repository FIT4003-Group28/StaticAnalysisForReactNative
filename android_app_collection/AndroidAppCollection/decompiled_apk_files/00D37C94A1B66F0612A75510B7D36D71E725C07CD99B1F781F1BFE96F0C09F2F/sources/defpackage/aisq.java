package defpackage;
/* compiled from: PG */
/* renamed from: aisq  reason: default package */
/* loaded from: classes.dex */
public final class aisq {
    private final bame a;
    private final ailu b;
    private final aisx c;
    private aikd d;
    private final ahex e;

    public aisq(bame bameVar, ahex ahexVar, ailu ailuVar, aisx aisxVar) {
        this.a = bameVar;
        this.e = ahexVar;
        this.b = ailuVar;
        this.c = aisxVar;
    }

    public final void a() {
        aikd aikdVar = this.d;
        if (aikdVar == null) {
            return;
        }
        b(aikdVar);
        ajah ajahVar = this.c.a;
        if (ajahVar == null || aikdVar.i != 4) {
            return;
        }
        ajahVar.F(aikdVar);
    }

    public final void b(aikd aikdVar) {
        this.a.c(aikdVar);
    }

    public final void c() {
        this.d = null;
    }

    public final void d(aikd aikdVar) {
        if (this.e.a() == 2) {
            return;
        }
        this.d = aikdVar;
        this.b.l(aijx.VIDEO_PLAYBACK_ERROR);
        a();
    }
}
