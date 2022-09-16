package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dyqr  reason: default package */
/* loaded from: classes6.dex */
public final class dyqr implements Runnable {
    final /* synthetic */ dyrz a;

    public dyqr(dyrz dyrzVar) {
        this.a = dyrzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dyrz dyrzVar = this.a;
        if (dyrzVar.B) {
            return;
        }
        dyrzVar.B = true;
        dyrzVar.h();
    }
}
