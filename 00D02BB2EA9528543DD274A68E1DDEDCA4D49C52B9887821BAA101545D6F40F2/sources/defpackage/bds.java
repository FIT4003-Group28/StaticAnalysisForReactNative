package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bds  reason: default package */
/* loaded from: classes3.dex */
public final class bds implements Runnable {
    final /* synthetic */ bgh a;
    final /* synthetic */ bdt b;

    public bds(bdt bdtVar, bgh bghVar) {
        this.b = bdtVar;
        this.a = bghVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bbz e = bbz.e();
        int i = bdt.d;
        String str = this.a.a;
        e.a(new Throwable[0]);
        this.b.a.b(this.a);
    }
}
