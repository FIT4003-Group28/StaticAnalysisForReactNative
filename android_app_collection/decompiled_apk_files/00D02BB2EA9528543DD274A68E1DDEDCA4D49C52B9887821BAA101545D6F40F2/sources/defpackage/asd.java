package defpackage;

import android.media.MediaRouter;
import defpackage.asc;
/* compiled from: PG */
/* renamed from: asd  reason: default package */
/* loaded from: classes2.dex */
final class asd<T extends asc> extends MediaRouter.VolumeCallback {
    protected final T a;

    public asd(T t) {
        this.a = t;
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
