package defpackage;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.text.TextUtils;
import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aqk  reason: default package */
/* loaded from: classes2.dex */
public final class aqk extends MediaRouter2.TransferCallback {
    final /* synthetic */ aql a;

    public aqk(aql aqlVar) {
        this.a = aqlVar;
    }

    @Override // android.media.MediaRouter2.TransferCallback
    public final void onStop(MediaRouter2.RoutingController routingController) {
        aqh remove = this.a.c.remove(routingController);
        if (remove != null) {
            arj arjVar = (arj) this.a.b;
            if (remove != arjVar.a.m) {
                return;
            }
            arjVar.a(2);
            return;
        }
        String str = "onStop: No matching routeController found. routingController=" + routingController;
    }

    @Override // android.media.MediaRouter2.TransferCallback
    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        arq arqVar;
        this.a.c.remove(routingController);
        if (routingController2 == this.a.a.getSystemController()) {
            ((arj) this.a.b).a(3);
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController2.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            return;
        }
        String id = selectedRoutes.get(0).getId();
        this.a.c.put(routingController2, new aqh(routingController2, id));
        arj arjVar = (arj) this.a.b;
        Iterator<arq> it = arjVar.a.e.iterator();
        while (true) {
            if (!it.hasNext()) {
                arqVar = null;
                break;
            }
            arqVar = it.next();
            if (arqVar.h() == arjVar.a.c && TextUtils.equals(id, arqVar.b)) {
                break;
            }
        }
        if (arqVar == null) {
            String str = "onSelectRoute: The target RouteInfo is not found for descriptorId=" + id;
        } else {
            arjVar.a.l(arqVar, 3);
        }
        this.a.f(routingController2);
    }

    @Override // android.media.MediaRouter2.TransferCallback
    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        String str = "Transfer failed. requestedRoute=" + mediaRoute2Info;
    }
}
