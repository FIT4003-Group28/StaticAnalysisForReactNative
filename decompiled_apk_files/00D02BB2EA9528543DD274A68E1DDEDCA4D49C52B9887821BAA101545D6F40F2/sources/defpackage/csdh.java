package defpackage;
/* compiled from: PG */
/* renamed from: csdh  reason: default package */
/* loaded from: classes5.dex */
public final class csdh implements Runnable {
    final /* synthetic */ csdi a;

    public csdh(csdi csdiVar) {
        this.a = csdiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        csdi csdiVar = this.a;
        if (!csdiVar.a.b) {
            csdiVar.g.loadUrl("javascript:try { _402.close(true) } catch(e) {}");
            this.a.a.onSurveyCanceled();
        }
    }
}
