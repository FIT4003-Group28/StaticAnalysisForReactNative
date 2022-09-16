package defpackage;
/* compiled from: PG */
/* renamed from: bnaa  reason: default package */
/* loaded from: classes3.dex */
public final class bnaa implements Runnable {
    final /* synthetic */ bmzd a;

    public bnaa(bmzd bmzdVar) {
        this.a = bmzdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
