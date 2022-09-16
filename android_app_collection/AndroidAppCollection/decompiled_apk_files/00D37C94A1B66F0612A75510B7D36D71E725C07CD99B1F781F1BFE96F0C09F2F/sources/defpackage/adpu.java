package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adpu  reason: default package */
/* loaded from: classes.dex */
public final class adpu implements Runnable {
    final /* synthetic */ adpy a;

    public adpu(adpy adpyVar) {
        this.a = adpyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        adrm adrmVar = this.a.c;
        if (adrmVar != null) {
            adrmVar.d();
            this.a.e();
        }
    }
}
