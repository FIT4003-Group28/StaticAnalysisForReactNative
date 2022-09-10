package defpackage;
/* compiled from: PG */
/* renamed from: lmj  reason: default package */
/* loaded from: classes7.dex */
final class lmj implements Runnable {
    final /* synthetic */ lmk a;

    public lmj(lmk lmkVar) {
        this.a = lmkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lmq lmqVar = this.a.a;
        if (lmqVar == null) {
            return;
        }
        lmqVar.f();
    }
}
