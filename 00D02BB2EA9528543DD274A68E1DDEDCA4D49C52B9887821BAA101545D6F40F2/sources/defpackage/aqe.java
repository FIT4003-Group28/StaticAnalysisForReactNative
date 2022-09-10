package defpackage;

import android.media.MediaRouter2;
/* compiled from: PG */
/* renamed from: aqe  reason: default package */
/* loaded from: classes2.dex */
final class aqe extends MediaRouter2.ControllerCallback {
    final /* synthetic */ aql a;

    public aqe(aql aqlVar) {
        this.a = aqlVar;
    }

    @Override // android.media.MediaRouter2.ControllerCallback
    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.a.f(routingController);
    }
}
