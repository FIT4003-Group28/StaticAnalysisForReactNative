package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cskn  reason: default package */
/* loaded from: classes5.dex */
public final class cskn extends cskr {
    final /* synthetic */ csko a;

    public cskn(csko cskoVar) {
        this.a = cskoVar;
    }

    @Override // defpackage.cskr
    public final void a(long j) {
        csko cskoVar = this.a;
        cskoVar.d++;
        if (cskoVar.a(cskoVar.a) || this.a.a.isStarted()) {
            return;
        }
        csko cskoVar2 = this.a;
        if (cskoVar2.c != -1 && cskoVar2.d >= 0) {
            return;
        }
        Runnable runnable = cskoVar2.b;
        if (runnable != null) {
            runnable.run();
        }
        this.a.a.start();
    }
}
