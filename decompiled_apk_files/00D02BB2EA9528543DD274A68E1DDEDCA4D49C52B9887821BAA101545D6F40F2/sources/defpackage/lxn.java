package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lxn  reason: default package */
/* loaded from: classes7.dex */
public final class lxn implements Runnable {
    final /* synthetic */ lxp a;

    public lxn(lxp lxpVar) {
        this.a = lxpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lxp lxpVar = this.a;
        if (lxpVar.l) {
            lxq.b(lxpVar.e, lxpVar);
            this.a.l = false;
        }
    }
}
