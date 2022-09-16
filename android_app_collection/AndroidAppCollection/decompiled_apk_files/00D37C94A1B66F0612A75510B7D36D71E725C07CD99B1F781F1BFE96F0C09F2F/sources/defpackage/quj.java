package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: quj  reason: default package */
/* loaded from: classes4.dex */
public final class quj implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ qum b;

    public quj(qum qumVar, int i) {
        this.b = qumVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.k(this.a);
    }
}
