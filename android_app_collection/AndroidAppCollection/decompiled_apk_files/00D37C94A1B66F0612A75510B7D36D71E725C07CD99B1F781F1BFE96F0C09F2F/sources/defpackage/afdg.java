package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: afdg  reason: default package */
/* loaded from: classes.dex */
public final class afdg implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ afdv b;

    public afdg(afdv afdvVar, String str) {
        this.b = afdvVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.j.post(new afdf(this));
    }
}
