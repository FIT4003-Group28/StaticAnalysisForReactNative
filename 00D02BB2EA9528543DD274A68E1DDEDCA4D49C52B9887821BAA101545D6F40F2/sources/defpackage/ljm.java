package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ljm  reason: default package */
/* loaded from: classes7.dex */
public final class ljm implements Runnable {
    final /* synthetic */ lju a;

    public ljm(lju ljuVar) {
        this.a = ljuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lwo c = this.a.n.d.c();
        lju ljuVar = this.a;
        if (c == ljuVar.E) {
            return;
        }
        ljuVar.E = c;
        if (c == lwo.IN_HEADER) {
            lju ljuVar2 = this.a;
            ljuVar2.l.g(ljuVar2, true);
            return;
        }
        lju ljuVar3 = this.a;
        ljuVar3.l.h(ljuVar3, true);
    }
}
