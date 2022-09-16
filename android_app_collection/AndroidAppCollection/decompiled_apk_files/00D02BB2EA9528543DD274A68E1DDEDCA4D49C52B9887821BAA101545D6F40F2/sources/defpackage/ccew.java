package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ccew  reason: default package */
/* loaded from: classes4.dex */
public final class ccew implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ ccey b;

    public ccew(ccey cceyVar, String str) {
        this.b = cceyVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bokp bokpVar;
        try {
            try {
                ily ilyVar = new ily();
                ilyVar.k(this.a);
                ilo d = ilyVar.d();
                dlfh e = this.b.i.e(this.a);
                if (e == null) {
                    bvoo.h("Failed reading edit for feature: %s (not logged in)", this.a);
                } else {
                    this.b.i.c(null, dcdc.f(this.a));
                    ccey cceyVar = this.b;
                    cceyVar.e.b(new ccex(cceyVar, d, e), bvrj.UI_THREAD);
                }
                bokpVar = this.b.i;
            } catch (Exception unused) {
                bvoo.h("Failed reading edit for feature: %s (not logged in)", this.a);
                bokpVar = this.b.i;
            }
            bokpVar.a();
        } catch (Throwable th) {
            this.b.i.a();
            throw th;
        }
    }
}
