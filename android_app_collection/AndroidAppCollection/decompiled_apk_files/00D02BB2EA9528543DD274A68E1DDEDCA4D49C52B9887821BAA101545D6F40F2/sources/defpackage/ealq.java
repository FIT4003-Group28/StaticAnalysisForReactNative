package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ealq  reason: default package */
/* loaded from: classes6.dex */
public final class ealq implements Runnable {
    final /* synthetic */ eamd a;
    final /* synthetic */ eamc b;

    public ealq(eamc eamcVar, eamd eamdVar) {
        this.b = eamcVar;
        this.a = eamdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.a();
        } catch (Throwable th) {
            this.b.d(new eaki("Exception received from UrlRequest.Callback", th));
        }
    }
}
