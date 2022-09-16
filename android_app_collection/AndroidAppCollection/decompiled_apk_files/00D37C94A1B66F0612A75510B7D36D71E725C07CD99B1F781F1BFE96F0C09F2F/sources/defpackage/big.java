package defpackage;

import android.content.Context;
import android.media.MediaRouter;
import android.view.Display;
/* compiled from: PG */
/* renamed from: big  reason: default package */
/* loaded from: classes2.dex */
class big extends bif implements bhf {
    private bhj r;
    private kz s;

    public big(Context context, bii biiVar) {
        super(context, biiVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bif
    public void m(bid bidVar, bfz bfzVar) {
        super.m(bidVar, bfzVar);
        if (!((MediaRouter.RouteInfo) bidVar.a).isEnabled()) {
            bfzVar.g(false);
        }
        if (D(bidVar)) {
            bfzVar.d(1);
        }
        Display v = kz.v(bidVar.a);
        if (v != null) {
            bfzVar.j(v.getDisplayId());
        }
    }

    @Override // defpackage.bif
    protected final Object q() {
        return new bhk(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bif
    public void z() {
        super.z();
        if (this.r == null) {
            this.r = new bhj();
        }
        throw null;
    }

    protected boolean D(bid bidVar) {
        if (this.s == null) {
            this.s = new kz();
        }
        Object obj = bidVar.a;
        throw null;
    }
}
