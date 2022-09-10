package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bbas  reason: default package */
/* loaded from: classes3.dex */
public final class bbas implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ bbat b;

    public bbas(bbat bbatVar, Runnable runnable) {
        this.b = bbatVar;
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            bbat bbatVar = this.b;
            bbatVar.d = 0L;
            dcdc<azxk> g = bbatVar.c.g(azxm.e);
            this.b.e = g.size();
            for (azxk azxkVar : g) {
                if (this.b.d < azxkVar.q()) {
                    this.b.d = azxkVar.q();
                }
            }
        } catch (axxc unused) {
            this.b.e = 0;
        }
        this.b.a.b(new bbar(this), bvrj.UI_THREAD);
    }
}
