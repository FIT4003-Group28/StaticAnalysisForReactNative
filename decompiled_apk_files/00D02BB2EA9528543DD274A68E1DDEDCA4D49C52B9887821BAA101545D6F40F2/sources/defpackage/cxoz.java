package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxoz  reason: default package */
/* loaded from: classes5.dex */
public final class cxoz implements Runnable {
    final /* synthetic */ cxpn a;

    public cxoz(cxpn cxpnVar) {
        this.a = cxpnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cxpn cxpnVar = this.a;
        cxpnVar.c.scrollTo(0, cxpnVar.d.getHeight());
    }
}
