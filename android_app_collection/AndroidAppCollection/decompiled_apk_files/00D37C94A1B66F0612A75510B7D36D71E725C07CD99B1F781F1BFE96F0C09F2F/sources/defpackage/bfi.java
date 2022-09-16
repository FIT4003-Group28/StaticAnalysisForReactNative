package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bfi  reason: default package */
/* loaded from: classes2.dex */
public final class bfi implements Runnable {
    final /* synthetic */ bfj a;

    public bfi(bfj bfjVar) {
        this.a = bfjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bfl bflVar = this.a.a;
        if (bflVar.w != null) {
            bflVar.w = null;
            if (!bflVar.M) {
                return;
            }
            bflVar.o(bflVar.N);
        }
    }
}
