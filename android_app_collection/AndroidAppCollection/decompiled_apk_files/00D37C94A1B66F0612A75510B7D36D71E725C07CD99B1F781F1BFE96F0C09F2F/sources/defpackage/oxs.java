package defpackage;
/* compiled from: PG */
/* renamed from: oxs  reason: default package */
/* loaded from: classes4.dex */
final class oxs implements Runnable {
    final /* synthetic */ oxx a;

    public oxs(oxx oxxVar) {
        this.a = oxxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        oxu oxuVar = this.a.a;
        if (oxuVar.a != null) {
            oxuVar.a = null;
        }
    }
}
