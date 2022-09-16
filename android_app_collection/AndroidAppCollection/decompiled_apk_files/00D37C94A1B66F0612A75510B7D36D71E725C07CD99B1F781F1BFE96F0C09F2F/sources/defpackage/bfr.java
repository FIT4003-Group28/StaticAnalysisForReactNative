package defpackage;

import android.media.MediaRouter2;
/* compiled from: PG */
/* renamed from: bfr  reason: default package */
/* loaded from: classes2.dex */
final class bfr extends MediaRouter2.ControllerCallback {
    final /* synthetic */ bfy a;

    public bfr(bfy bfyVar) {
        this.a = bfyVar;
    }

    @Override // android.media.MediaRouter2.ControllerCallback
    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.a.f(routingController);
    }
}
