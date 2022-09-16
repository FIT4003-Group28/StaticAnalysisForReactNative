package defpackage;
/* compiled from: PG */
/* renamed from: bmzz  reason: default package */
/* loaded from: classes3.dex */
public final class bmzz implements Runnable {
    final /* synthetic */ bmzd a;
    final /* synthetic */ bnab b;

    public bmzz(bnab bnabVar, bmzd bmzdVar) {
        this.b = bnabVar;
        this.a = bmzdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
        this.b.e.i(cjtd.a(dtyi.cX));
        bnab bnabVar = this.b;
        bnabVar.g.k(new bmzy(bnabVar), null);
    }
}
