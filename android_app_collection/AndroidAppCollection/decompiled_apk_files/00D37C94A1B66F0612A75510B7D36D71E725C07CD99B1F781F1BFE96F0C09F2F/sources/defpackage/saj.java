package defpackage;
/* compiled from: PG */
/* renamed from: saj  reason: default package */
/* loaded from: classes4.dex */
final class saj implements Runnable {
    final /* synthetic */ saq a;

    public saj(saq saqVar) {
        this.a = saqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.h != sap.EXPLORE || !this.a.i.contains(sap.DESCRIBE)) {
            return;
        }
        this.a.e(sap.DESCRIBE);
    }
}
