package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ctcs  reason: default package */
/* loaded from: classes5.dex */
public final class ctcs implements Runnable {
    final /* synthetic */ ctct a;

    public ctcs(ctct ctctVar) {
        this.a = ctctVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ctct ctctVar = this.a;
        new cswd(ctctVar.z, cswe.a(ctctVar.a).A).execute(new Void[0]);
    }
}
