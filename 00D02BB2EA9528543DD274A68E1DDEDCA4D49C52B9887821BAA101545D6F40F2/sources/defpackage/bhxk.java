package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bhxk  reason: default package */
/* loaded from: classes3.dex */
public final class bhxk implements Runnable {
    final /* synthetic */ bhxy a;

    public bhxk(bhxy bhxyVar) {
        this.a = bhxyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bhxy bhxyVar = this.a;
        bhxyVar.m = false;
        cqkx.p(bhxyVar);
    }
}
