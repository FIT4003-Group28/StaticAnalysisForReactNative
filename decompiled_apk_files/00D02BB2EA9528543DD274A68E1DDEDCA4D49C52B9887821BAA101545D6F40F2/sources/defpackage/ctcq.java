package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ctcq  reason: default package */
/* loaded from: classes5.dex */
public final class ctcq implements Runnable {
    final /* synthetic */ ctct a;

    public ctcq(ctct ctctVar) {
        this.a = ctctVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ctct ctctVar = this.a;
        new cswd(ctctVar.x, cswe.a(ctctVar.a).H).execute(new Void[0]);
    }
}
