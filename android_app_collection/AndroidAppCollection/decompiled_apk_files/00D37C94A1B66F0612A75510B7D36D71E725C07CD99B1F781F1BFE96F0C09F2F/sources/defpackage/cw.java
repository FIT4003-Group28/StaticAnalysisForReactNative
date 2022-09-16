package defpackage;
/* compiled from: PG */
/* renamed from: cw  reason: default package */
/* loaded from: classes3.dex */
final class cw implements Runnable {
    final /* synthetic */ cx a;

    public cw(cx cxVar) {
        this.a = cxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cx cxVar = this.a;
        cxVar.a.endViewTransition(cxVar.b);
        this.a.c.b();
    }
}
