package defpackage;
/* compiled from: PG */
/* renamed from: bqxw  reason: default package */
/* loaded from: classes4.dex */
final class bqxw implements Runnable {
    final /* synthetic */ amcm a;
    final /* synthetic */ alyh b;

    public bqxw(amcm amcmVar, alyh alyhVar) {
        this.a = amcmVar;
        this.b = alyhVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        amcm amcmVar = this.a;
        if (amcmVar != null) {
            amcmVar.a(this.b, 6, null, null);
        }
    }
}
