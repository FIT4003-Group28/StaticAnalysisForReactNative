package defpackage;

import android.media.MediaRouter;
/* compiled from: PG */
/* renamed from: bhg  reason: default package */
/* loaded from: classes2.dex */
class bhg extends MediaRouter.Callback {
    protected final bhf a;

    public bhg(bhf bhfVar) {
        this.a = bhfVar;
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        this.a.a(routeInfo);
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        this.a.c(routeInfo);
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i) {
        this.a.g();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        this.a.e(routeInfo);
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteSelected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        this.a.h(routeInfo);
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
        this.a.i();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUnselected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        this.a.j();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        this.a.f(routeInfo);
    }
}
