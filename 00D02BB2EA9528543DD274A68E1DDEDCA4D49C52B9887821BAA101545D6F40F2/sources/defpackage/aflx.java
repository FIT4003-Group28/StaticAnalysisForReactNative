package defpackage;
/* compiled from: PG */
/* renamed from: aflx  reason: default package */
/* loaded from: classes2.dex */
final class aflx implements Runnable {
    final /* synthetic */ ilo a;
    final /* synthetic */ boolean b;
    final /* synthetic */ afma c;

    public aflx(afma afmaVar, ilo iloVar, boolean z) {
        this.c = afmaVar;
        this.a = iloVar;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.c.a(ckls.EXTERNAL_INVOCATION);
        begj begjVar = new begj();
        begjVar.b(this.a);
        this.c.b.a().n(begjVar, this.b, null);
    }
}
