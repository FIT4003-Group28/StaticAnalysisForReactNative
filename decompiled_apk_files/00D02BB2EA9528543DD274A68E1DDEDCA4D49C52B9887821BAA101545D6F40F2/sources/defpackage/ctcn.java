package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ctcn  reason: default package */
/* loaded from: classes5.dex */
public final class ctcn implements Runnable {
    final /* synthetic */ ctct a;

    public ctcn(ctct ctctVar) {
        this.a = ctctVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.I();
        ctct ctctVar = this.a;
        new cswd(ctctVar.v, cswe.a(ctctVar.a).g).execute(new Void[0]);
    }
}
