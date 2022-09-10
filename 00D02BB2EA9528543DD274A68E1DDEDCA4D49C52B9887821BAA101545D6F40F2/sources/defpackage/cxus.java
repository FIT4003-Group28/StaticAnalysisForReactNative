package defpackage;
/* compiled from: PG */
/* renamed from: cxus  reason: default package */
/* loaded from: classes5.dex */
final class cxus implements Runnable {
    final /* synthetic */ cxut a;

    public cxus(cxut cxutVar) {
        this.a = cxutVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cxut cxutVar = this.a;
        cxuz cxuzVar = cxutVar.b;
        cxov cxovVar = cxuzVar.n;
        if (cxovVar != null) {
            cxovVar.r(cxutVar.a.z(cxuzVar.a));
        }
    }
}
