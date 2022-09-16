package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ade  reason: default package */
/* loaded from: classes.dex */
public final class ade implements Runnable {
    final /* synthetic */ adm a;
    private final /* synthetic */ int b;

    public ade(adm admVar) {
        this.a = admVar;
    }

    public ade(adm admVar, int i) {
        this.b = i;
        this.a = admVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            this.a.b.s = false;
        } else if (i == 1) {
            this.a.b.t().b();
        } else {
            this.a.b.t().d();
        }
    }
}
