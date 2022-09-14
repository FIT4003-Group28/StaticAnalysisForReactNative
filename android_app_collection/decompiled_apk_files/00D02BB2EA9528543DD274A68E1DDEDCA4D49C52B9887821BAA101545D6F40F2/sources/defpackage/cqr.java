package defpackage;
/* compiled from: PG */
/* renamed from: cqr  reason: default package */
/* loaded from: classes5.dex */
final class cqr implements Runnable {
    final /* synthetic */ bmzd a;

    public cqr(bmzd bmzdVar) {
        this.a = bmzdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
