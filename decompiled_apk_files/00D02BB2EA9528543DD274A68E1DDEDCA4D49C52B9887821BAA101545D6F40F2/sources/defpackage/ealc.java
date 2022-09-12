package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ealc  reason: default package */
/* loaded from: classes6.dex */
public final class ealc implements Runnable {
    final /* synthetic */ eamd a;
    final /* synthetic */ eamc b;

    public ealc(eamc eamcVar, eamd eamdVar) {
        this.b = eamcVar;
        this.a = eamdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.a();
        } catch (Throwable th) {
            this.b.e(th);
        }
    }
}
