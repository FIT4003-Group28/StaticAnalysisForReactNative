package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bwh  reason: default package */
/* loaded from: classes2.dex */
public final class bwh implements Runnable {
    final bwk a;
    final ankt b;

    public bwh(bwk bwkVar, ankt anktVar) {
        this.a = bwkVar;
        this.b = anktVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.d != this) {
            return;
        }
        if (!bwk.b.d(this.a, this, bwk.b(this.b))) {
            return;
        }
        bwk.c(this.a);
    }
}
