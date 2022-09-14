package defpackage;
/* compiled from: PG */
/* renamed from: bmzt  reason: default package */
/* loaded from: classes3.dex */
final class bmzt implements Runnable {
    final /* synthetic */ bmzd a;

    public bmzt(bmzd bmzdVar) {
        this.a = bmzdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
