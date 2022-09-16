package defpackage;
/* compiled from: PG */
/* renamed from: edr  reason: default package */
/* loaded from: classes.dex */
final class edr implements Runnable {
    final /* synthetic */ edx a;

    public edr(edx edxVar) {
        this.a = edxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!affw.e(this.a.getIntent())) {
            final acys a = this.a.aw.a();
            a.getClass();
            this.a.ad.a().e(new Runnable(a) { // from class: edq
                private final acys a;

                {
                    this.a = a;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.f();
                }
            });
        }
    }
}
