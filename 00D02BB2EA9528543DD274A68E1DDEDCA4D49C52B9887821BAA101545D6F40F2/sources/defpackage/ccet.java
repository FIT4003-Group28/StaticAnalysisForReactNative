package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ccet  reason: default package */
/* loaded from: classes4.dex */
public final class ccet implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ ccey b;

    public ccet(ccey cceyVar, String str) {
        this.b = cceyVar;
        this.a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bokp bokpVar;
        try {
            try {
                dlfh e = this.b.i.e(this.a);
                if (e == null) {
                    bvoo.h("Failed reading edit for feature: %s (not logged in)", this.a);
                } else {
                    this.b.i.c(null, dcdc.f(this.a));
                    ccey cceyVar = this.b;
                    cceyVar.e.b(new ccev(cceyVar, e), bvrj.UI_THREAD);
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
