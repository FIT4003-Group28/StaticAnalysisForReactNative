package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ealp  reason: default package */
/* loaded from: classes6.dex */
public final class ealp implements Runnable {
    final /* synthetic */ eamd a;
    final /* synthetic */ eamc b;

    public ealp(eamc eamcVar, eamd eamdVar) {
        this.b = eamcVar;
        this.a = eamdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.a();
        } catch (Throwable th) {
            this.b.d(new eakn("System error", th));
        }
    }
}
