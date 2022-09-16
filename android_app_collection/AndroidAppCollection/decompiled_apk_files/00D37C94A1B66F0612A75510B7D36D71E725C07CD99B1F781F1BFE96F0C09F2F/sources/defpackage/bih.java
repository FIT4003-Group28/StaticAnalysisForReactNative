package defpackage;

import android.content.Context;
import android.media.MediaRouter;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bih  reason: default package */
/* loaded from: classes2.dex */
public class bih extends big {
    public bih(Context context, bii biiVar) {
        super(context, biiVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bif
    public final void B(bie bieVar) {
        super.B(bieVar);
        ((MediaRouter.UserRouteInfo) bieVar.b).setDescription(bieVar.a.e);
    }

    @Override // defpackage.big
    protected final boolean D(bid bidVar) {
        return ((MediaRouter.RouteInfo) bidVar.a).isConnecting();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.big, defpackage.bif
    public void m(bid bidVar, bfz bfzVar) {
        super.m(bidVar, bfzVar);
        CharSequence description = ((MediaRouter.RouteInfo) bidVar.a).getDescription();
        if (description != null) {
            bfzVar.e(description.toString());
        }
    }

    @Override // defpackage.bif
    protected final Object r() {
        return ((MediaRouter) this.a).getDefaultRoute();
    }

    @Override // defpackage.bif
    protected final void y(Object obj) {
        ((MediaRouter) this.a).selectRoute(8388611, (MediaRouter.RouteInfo) obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.big, defpackage.bif
    public final void z() {
        if (this.o) {
            kx.f(this.a, this.b);
        }
        this.o = true;
        Object obj = this.a;
        ((MediaRouter) obj).addCallback(this.m, (MediaRouter.Callback) this.b, (this.n ? 1 : 0) | 2);
    }
}
