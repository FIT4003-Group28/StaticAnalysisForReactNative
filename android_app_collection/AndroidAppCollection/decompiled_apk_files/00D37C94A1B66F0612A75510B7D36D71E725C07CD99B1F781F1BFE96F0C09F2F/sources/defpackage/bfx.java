package defpackage;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.text.TextUtils;
import android.util.Log;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: bfx  reason: default package */
/* loaded from: classes2.dex */
final class bfx extends MediaRouter2.TransferCallback {
    final /* synthetic */ bfy a;

    public bfx(bfy bfyVar) {
        this.a = bfyVar;
    }

    @Override // android.media.MediaRouter2.TransferCallback
    public final void onStop(MediaRouter2.RoutingController routingController) {
        bgj bgjVar = (bgj) this.a.c.remove(routingController);
        if (bgjVar != null) {
            bfq bfqVar = this.a.b;
            if (bgjVar != bfqVar.a.t) {
                return;
            }
            bfqVar.a(2);
            return;
        }
        Log.w("MR2Provider", "onStop: No matching routeController found. routingController=" + routingController);
    }

    @Override // android.media.MediaRouter2.TransferCallback
    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        bhc bhcVar;
        this.a.c.remove(routingController);
        if (routingController2 == this.a.a.getSystemController()) {
            this.a.b.a(3);
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController2.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "Selected routes are empty. This shouldn't happen.");
            return;
        }
        String id = selectedRoutes.get(0).getId();
        this.a.c.put(routingController2, new bfu(routingController2, id));
        bfq bfqVar = this.a.b;
        Iterator it = bfqVar.a.h.iterator();
        while (true) {
            if (!it.hasNext()) {
                bhcVar = null;
                break;
            }
            bhcVar = (bhc) it.next();
            if (bhcVar.c() == bfqVar.a.f && TextUtils.equals(id, bhcVar.b)) {
                break;
            }
        }
        if (bhcVar == null) {
            Log.w("MediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=" + id);
        } else {
            bfqVar.a.k(bhcVar, 3);
        }
        this.a.f(routingController2);
    }

    @Override // android.media.MediaRouter2.TransferCallback
    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        Log.w("MR2Provider", "Transfer failed. requestedRoute=" + mediaRoute2Info);
    }
}
