package defpackage;
/* compiled from: PG */
/* renamed from: bnln  reason: default package */
/* loaded from: classes3.dex */
public final class bnln extends itb implements bnli {
    public final dxio<begg> a;
    public final gga b;
    public final bnlh c;
    public final dxio<acwo> d;
    public boolean e = false;
    public boolean f = false;
    public final bnlm g;
    private final btrm h;
    private final efc i;

    public bnln(dxio dxioVar, gga ggaVar, btrm btrmVar, dxio dxioVar2, bnlm bnlmVar, bnll bnllVar, efc efcVar) {
        this.a = dxioVar;
        this.b = ggaVar;
        this.h = btrmVar;
        this.d = dxioVar2;
        this.g = bnlmVar;
        this.c = bnllVar;
        this.i = efcVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x013e, code lost:
        if (java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(r2.b.e() - r2.a) > r2.h.b()) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [akzx, bnlh] */
    @Override // defpackage.itb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Nt() {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnln.Nt():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [akzx, bnlh] */
    @Override // defpackage.itb
    public final void Po() {
        this.h.a(this);
        ?? r0 = this.c;
        bnll bnllVar = (bnll) r0;
        if (bnllVar.g()) {
            bnllVar.c.a().ae(r0);
            cup cupVar = ((cui) bnllVar.e).i;
            if (cupVar != null) {
                cupVar.b();
            }
            bnly bnlyVar = bnllVar.g;
            bvrj.UI_THREAD.c();
            bnlyVar.j();
            if (bnlyVar.p) {
                bnlyVar.h.a().a(bnlyVar);
                bnlyVar.b.a().ae(bnlyVar);
                bnlyVar.b.a().af().removeOnLayoutChangeListener(bnlyVar.l.a());
                bnlyVar.b.a().aj().at().b.h(bnlyVar);
                bnlyVar.k.a().disable();
                bnlyVar.p = false;
            }
        }
        super.Po();
    }

    @Override // defpackage.bnli
    public final void b(boolean z) {
        if (this.e == z) {
            return;
        }
        this.e = z;
        if (z) {
            ((bnll) this.c).e.c();
        } else {
            ((bnll) this.c).e.d();
        }
    }
}
