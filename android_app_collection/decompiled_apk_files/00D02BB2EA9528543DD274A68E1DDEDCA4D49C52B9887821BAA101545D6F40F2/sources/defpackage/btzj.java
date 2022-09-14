package defpackage;
/* renamed from: btzj  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class btzj {
    public static dehn a(btzp btzpVar, Object obj) {
        final deig d = deig.d();
        final btzc b = btzpVar.b(obj, new btzn(d), btzk.a);
        d.Pk(new Runnable(d, b) { // from class: btzl
            private final deig a;
            private final btzc b;

            {
                this.a = d;
                this.b = b;
            }

            @Override // java.lang.Runnable
            public final void run() {
                deig deigVar = this.a;
                btzc btzcVar = this.b;
                if (deigVar.isCancelled()) {
                    btzcVar.a();
                }
            }
        }, btzm.a);
        return d;
    }
}
