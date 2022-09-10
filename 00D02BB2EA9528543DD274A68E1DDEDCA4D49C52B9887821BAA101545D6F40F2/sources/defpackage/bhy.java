package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bhy  reason: default package */
/* loaded from: classes3.dex */
public final class bhy<V> implements Runnable {
    final bib<V> a;
    final dehn<? extends V> b;

    public bhy(bib<V> bibVar, dehn<? extends V> dehnVar) {
        this.a = bibVar;
        this.b = dehnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.d != this) {
            return;
        }
        if (!bib.b.e(this.a, this, bib.b(this.b))) {
            return;
        }
        bib.c(this.a);
    }
}
