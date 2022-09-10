package defpackage;
/* compiled from: PG */
/* renamed from: acgf  reason: default package */
/* loaded from: classes2.dex */
final class acgf implements Runnable {
    final /* synthetic */ acgh a;

    public acgf(acgh acghVar) {
        this.a = acghVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cqkf<acip> cqkfVar = this.a.ah;
        if (cqkfVar != null) {
            cqkfVar.g();
        }
    }
}
