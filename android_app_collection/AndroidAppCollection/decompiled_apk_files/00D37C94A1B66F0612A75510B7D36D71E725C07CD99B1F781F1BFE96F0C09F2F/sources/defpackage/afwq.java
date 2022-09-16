package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afwq  reason: default package */
/* loaded from: classes.dex */
public final class afwq implements Runnable {
    final /* synthetic */ afwo a;
    final /* synthetic */ afwu b;

    public afwq(afwu afwuVar, afwo afwoVar) {
        this.b = afwuVar;
        this.a = afwoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.b(this.a);
        if (!this.b.b.o() || (this.b.c.i() && this.b.b.m())) {
            atfw atfwVar = this.b.d.a().k;
            if (atfwVar == null) {
                atfwVar = atfw.a;
            }
            apep apepVar = atfwVar.w;
            if (apepVar == null) {
                apepVar = apep.a;
            }
            if (!apepVar.b) {
                return;
            }
            this.b.e.c.e("ping_flush_one_off", afwx.a, false, 1, null, afwx.b, false);
            return;
        }
        this.b.a.a();
    }
}
