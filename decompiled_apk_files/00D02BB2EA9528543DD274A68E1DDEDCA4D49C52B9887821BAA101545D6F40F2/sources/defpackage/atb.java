package defpackage;

import android.media.MediaRouter;
/* compiled from: PG */
/* renamed from: atb  reason: default package */
/* loaded from: classes2.dex */
public final class atb extends aqx {
    private final Object a;

    public atb(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.aqx
    public final void a(int i) {
        ((MediaRouter.RouteInfo) this.a).requestSetVolume(i);
    }

    @Override // defpackage.aqx
    public final void b(int i) {
        ((MediaRouter.RouteInfo) this.a).requestUpdateVolume(i);
    }
}
