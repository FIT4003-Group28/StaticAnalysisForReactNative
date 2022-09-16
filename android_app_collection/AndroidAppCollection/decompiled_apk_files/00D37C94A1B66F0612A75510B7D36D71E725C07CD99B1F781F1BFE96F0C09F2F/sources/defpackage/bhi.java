package defpackage;

import android.media.MediaRouter;
/* compiled from: PG */
/* renamed from: bhi  reason: default package */
/* loaded from: classes2.dex */
final class bhi extends MediaRouter.VolumeCallback {
    protected final bhh a;

    public bhi(bhh bhhVar) {
        this.a = bhhVar;
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.a.k(routeInfo, i);
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.a.l(routeInfo, i);
    }
}
