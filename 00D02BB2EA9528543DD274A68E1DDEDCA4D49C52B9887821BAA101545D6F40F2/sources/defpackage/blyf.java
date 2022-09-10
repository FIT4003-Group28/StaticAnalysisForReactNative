package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: blyf  reason: default package */
/* loaded from: classes3.dex */
public final class blyf implements Runnable {
    final /* synthetic */ blyj a;

    public blyf(blyj blyjVar) {
        this.a = blyjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.aq();
        blyj blyjVar = this.a;
        blyjVar.d.b(new blyh(blyjVar), bvrj.UI_THREAD);
    }
}
