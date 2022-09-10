package defpackage;
/* compiled from: PG */
/* renamed from: nwg  reason: default package */
/* loaded from: classes7.dex */
final class nwg implements Runnable {
    final /* synthetic */ nwi a;
    final /* synthetic */ dwim b;
    final /* synthetic */ iqy c;
    final /* synthetic */ nwj d;

    public nwg(nwj nwjVar, nwi nwiVar, dwim dwimVar, iqy iqyVar) {
        this.d = nwjVar;
        this.a = nwiVar;
        this.b = dwimVar;
        this.c = iqyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.d.a.g().J()) {
            return;
        }
        this.a.k.a().m(this.b, this.c);
    }
}
