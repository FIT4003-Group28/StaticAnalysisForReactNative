package defpackage;

import android.media.MediaRouter;
/* compiled from: PG */
/* renamed from: bic  reason: default package */
/* loaded from: classes2.dex */
public final class bic extends bgj {
    private final Object a;

    public bic(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.bgj
    public final void b(int i) {
        ((MediaRouter.RouteInfo) this.a).requestSetVolume(i);
    }

    @Override // defpackage.bgj
    public final void c(int i) {
        ((MediaRouter.RouteInfo) this.a).requestUpdateVolume(i);
    }
}
