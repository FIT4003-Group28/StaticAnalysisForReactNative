package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: plu  reason: default package */
/* loaded from: classes4.dex */
public final class plu implements pll {
    final /* synthetic */ plv a;

    public plu(plv plvVar) {
        this.a = plvVar;
    }

    @Override // defpackage.pll
    public final void a(Exception exc) {
        pns.e("DecoderAudioRenderer", "Audio sink error", exc);
        this.a.a.b(exc);
    }

    @Override // defpackage.pll
    public final /* synthetic */ void b() {
    }

    @Override // defpackage.pll
    public final /* synthetic */ void c(long j) {
    }

    @Override // defpackage.pll
    public final void d(long j) {
        this.a.a.h(j);
    }

    @Override // defpackage.pll
    public final void e() {
        this.a.c = true;
    }

    @Override // defpackage.pll
    public final void f(boolean z) {
        this.a.a.i(z);
    }

    @Override // defpackage.pll
    public final void g(int i, long j, long j2) {
        this.a.a.j(i, j, j2);
    }
}
