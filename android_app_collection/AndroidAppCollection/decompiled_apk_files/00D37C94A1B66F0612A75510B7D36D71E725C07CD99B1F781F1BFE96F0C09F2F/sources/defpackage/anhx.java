package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: anhx  reason: default package */
/* loaded from: classes.dex */
public final class anhx implements Runnable {
    final anie a;
    final ankt b;

    public anhx(anie anieVar, ankt anktVar) {
        this.a = anieVar;
        this.b = anktVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        anie anieVar = this.a;
        boolean z = anie.g;
        if (anieVar.value != this) {
            return;
        }
        if (!anie.h.d(this.a, this, anie.j(this.b))) {
            return;
        }
        anie.l(this.a);
    }
}
