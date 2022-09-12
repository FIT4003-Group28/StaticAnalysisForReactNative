package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: deel  reason: default package */
/* loaded from: classes.dex */
public final class deel<V> implements Runnable {
    final dees<V> a;
    final dehn<? extends V> b;

    public deel(dees<V> deesVar, dehn<? extends V> dehnVar) {
        this.a = deesVar;
        this.b = dehnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dees<V> deesVar = this.a;
        boolean z = dees.j;
        if (deesVar.value != this) {
            return;
        }
        if (!dees.k.e(this.a, this, dees.l(this.b))) {
            return;
        }
        dees.m(this.a);
    }
}
