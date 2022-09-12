package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dynn  reason: default package */
/* loaded from: classes6.dex */
public final class dynn implements Runnable {
    final /* synthetic */ dyjb a;
    final /* synthetic */ dynv b;

    public dynn(dynv dynvVar, dyjb dyjbVar) {
        this.b = dynvVar;
        this.a = dyjbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.d.e(this.a);
    }
}
