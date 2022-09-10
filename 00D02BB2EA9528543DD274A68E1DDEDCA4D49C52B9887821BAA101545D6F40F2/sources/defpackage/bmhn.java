package defpackage;
/* compiled from: PG */
/* renamed from: bmhn  reason: default package */
/* loaded from: classes3.dex */
public final class bmhn extends befr<bmhq> {
    boolean b;

    public bmhn(bmhq bmhqVar) {
        super(bmhqVar, 2, 2);
    }

    @Override // defpackage.befz
    public final void a(cqiv cqivVar) {
        xiv b = ((bmhq) this.a).b();
        if (b == null) {
            int size = ((bmhq) this.a).a().size();
            for (int i = 0; i < size; i++) {
                if (this.b) {
                    cqivVar.a(new hsd(), hsd.e(irh.c()));
                    this.b = false;
                }
                cqivVar.a(new bmim(), ((bmhq) this.a).a().get(i));
                this.b = true;
            }
            return;
        }
        cqivVar.a(new bmiq(), b);
    }
}
