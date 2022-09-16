package defpackage;
/* compiled from: PG */
/* renamed from: hvg  reason: default package */
/* loaded from: classes.dex */
public final class hvg {
    public dwwr a;
    public final btrm b;
    public boolean c;
    public final hvf d = new hvf(this);
    private final akoq e;
    private final boolean f;

    public hvg(akox akoxVar, dwwr dwwrVar, btrm btrmVar) {
        akoq aj = akoxVar.aj();
        dbsk.s(aj);
        this.e = aj;
        this.a = dwwrVar;
        dbsk.s(btrmVar);
        this.b = btrmVar;
        this.f = true;
        this.c = true;
        b();
    }

    public final void a() {
        btrm btrmVar = this.b;
        hvf hvfVar = this.d;
        dceq a = dcet.a();
        a.b(dwwr.class, new hvh(0, dwwr.class, hvfVar));
        a.b(afop.class, new hvh(1, afop.class, hvfVar));
        a.b(alif.class, new hvh(2, alif.class, hvfVar));
        btrmVar.g(hvfVar, a.a());
    }

    public final synchronized void b() {
        long j = 30;
        if (this.c && this.f && this.a.i) {
            j = 60;
        }
        this.e.X(j);
    }
}
