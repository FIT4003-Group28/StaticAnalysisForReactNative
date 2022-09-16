package defpackage;

import android.media.MediaRouter;
import android.view.Display;
/* compiled from: PG */
/* renamed from: bhk  reason: default package */
/* loaded from: classes2.dex */
final class bhk extends bhg {
    public bhk(big bigVar) {
        super(bigVar);
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        big bigVar = (big) this.a;
        int n = bigVar.n(routeInfo);
        if (n >= 0) {
            bid bidVar = (bid) bigVar.p.get(n);
            Display v = kz.v(routeInfo);
            int displayId = v != null ? v.getDisplayId() : -1;
            if (displayId == bidVar.c.e()) {
                return;
            }
            bfz bfzVar = new bfz(bidVar.c);
            bfzVar.j(displayId);
            bidVar.c = bfzVar.a();
            bigVar.x();
        }
    }
}
