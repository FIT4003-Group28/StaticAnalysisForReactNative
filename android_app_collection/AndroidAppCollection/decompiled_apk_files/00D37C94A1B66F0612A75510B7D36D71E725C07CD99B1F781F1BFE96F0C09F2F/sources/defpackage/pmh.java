package defpackage;
/* compiled from: PG */
/* renamed from: pmh  reason: default package */
/* loaded from: classes4.dex */
final class pmh implements pll {
    final /* synthetic */ pmi a;

    public pmh(pmi pmiVar) {
        this.a = pmiVar;
    }

    @Override // defpackage.pll
    public final void a(Exception exc) {
        pns.e("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.a.q.b(exc);
    }

    @Override // defpackage.pll
    public final void b() {
        pij pijVar = this.a.s;
        if (pijVar != null) {
            pijVar.a.a.g(2);
        }
    }

    @Override // defpackage.pll
    public final void c(long j) {
        pij pijVar = this.a.s;
        if (pijVar == null || j < 2000) {
            return;
        }
        pijVar.a.d = true;
    }

    @Override // defpackage.pll
    public final void d(long j) {
        this.a.q.h(j);
    }

    @Override // defpackage.pll
    public final void e() {
        this.a.r = true;
    }

    @Override // defpackage.pll
    public final void f(boolean z) {
        this.a.q.i(z);
    }

    @Override // defpackage.pll
    public final void g(int i, long j, long j2) {
        this.a.q.j(i, j, j2);
    }
}
