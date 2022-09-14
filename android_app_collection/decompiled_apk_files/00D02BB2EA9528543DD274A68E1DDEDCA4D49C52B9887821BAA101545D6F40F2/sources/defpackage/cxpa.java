package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxpa  reason: default package */
/* loaded from: classes5.dex */
public final class cxpa implements Runnable {
    final /* synthetic */ cxpn a;

    public cxpa(cxpn cxpnVar) {
        this.a = cxpnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cxpn cxpnVar = this.a;
        cxpnVar.c.scrollTo(0, cxpnVar.d.getHeight());
    }
}
