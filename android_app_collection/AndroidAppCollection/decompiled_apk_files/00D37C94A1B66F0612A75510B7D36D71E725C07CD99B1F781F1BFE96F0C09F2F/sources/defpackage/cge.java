package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cge  reason: default package */
/* loaded from: classes2.dex */
public final class cge implements Runnable {
    final /* synthetic */ cgg a;

    public cge(cgg cggVar) {
        this.a = cggVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cgg cggVar = this.a;
        cggVar.c.a(cggVar);
    }
}
