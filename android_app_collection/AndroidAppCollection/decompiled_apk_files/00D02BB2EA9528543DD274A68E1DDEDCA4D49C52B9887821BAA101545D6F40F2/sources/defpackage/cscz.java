package defpackage;
/* compiled from: PG */
/* renamed from: cscz  reason: default package */
/* loaded from: classes5.dex */
final class cscz implements Runnable {
    final /* synthetic */ csdd a;

    public cscz(csdd csddVar) {
        this.a = csddVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aumj aumjVar = (aumj) this.a.a;
        csdi csdiVar = aumjVar.e;
        dbsk.s(csdiVar);
        if (csdiVar.d == null) {
            csdiVar.d = new csde();
            csdiVar.d.ae = new csdh(csdiVar);
            csde csdeVar = csdiVar.d;
            csdeVar.ad = csdiVar.g;
            csdeVar.aJ();
            csdiVar.d.d(2, 16973913);
        }
        csde csdeVar2 = csdiVar.d;
        if (!csdeVar2.S()) {
            csdeVar2.e(aumjVar.b.g(), "notification-hats-survey");
        }
    }
}
