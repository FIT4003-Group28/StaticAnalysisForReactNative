package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: blyg  reason: default package */
/* loaded from: classes3.dex */
public final class blyg implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ int b;
    final /* synthetic */ blyj c;

    public blyg(blyj blyjVar, String str, int i) {
        this.c = blyjVar;
        this.a = str;
        this.b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        blyj blyjVar = this.c;
        blyjVar.i = blyjVar.e.a().f(this.a, this.b, blpq.PLACE_PAGE_PREFETCH);
    }
}
