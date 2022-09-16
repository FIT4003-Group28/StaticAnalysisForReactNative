package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lxg  reason: default package */
/* loaded from: classes7.dex */
public final class lxg implements Runnable {
    final /* synthetic */ lxh a;

    public lxg(lxh lxhVar) {
        this.a = lxhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.a.a().c.a != asld.FREE_MOVEMENT) {
            return;
        }
        alae m = this.a.b.m();
        lxh lxhVar = this.a;
        kxt.a(m, lxhVar.c, lxhVar.d);
    }
}
