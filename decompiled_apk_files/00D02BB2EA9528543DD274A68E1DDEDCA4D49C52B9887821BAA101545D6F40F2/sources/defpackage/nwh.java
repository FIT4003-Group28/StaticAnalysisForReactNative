package defpackage;
/* compiled from: PG */
/* renamed from: nwh  reason: default package */
/* loaded from: classes7.dex */
final class nwh implements Runnable {
    final /* synthetic */ nwi a;
    final /* synthetic */ String b;
    final /* synthetic */ cbzc c;

    public nwh(nwi nwiVar, String str, cbzc cbzcVar) {
        this.a = nwiVar;
        this.b = str;
        this.c = cbzcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.l.a().a(this.b, this.c);
    }
}
