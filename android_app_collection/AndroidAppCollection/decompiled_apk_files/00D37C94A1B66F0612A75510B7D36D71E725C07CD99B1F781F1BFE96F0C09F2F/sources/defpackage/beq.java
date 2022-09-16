package defpackage;

import androidx.mediarouter.app.MediaRouteButton;
/* compiled from: PG */
/* renamed from: beq  reason: default package */
/* loaded from: classes2.dex */
public final class beq extends kt {
    final /* synthetic */ MediaRouteButton a;

    public beq(MediaRouteButton mediaRouteButton) {
        this.a = mediaRouteButton;
    }

    @Override // defpackage.kt
    public final void p() {
        this.a.a();
    }

    @Override // defpackage.kt
    public final void q() {
        this.a.a();
    }

    @Override // defpackage.kt
    public final void r() {
        this.a.a();
    }

    @Override // defpackage.kt
    public final void s(bhc bhcVar) {
        this.a.a();
    }

    @Override // defpackage.kt
    public final void t(bhc bhcVar) {
        this.a.a();
    }

    @Override // defpackage.kt
    public final void u(bhc bhcVar) {
        this.a.a();
    }

    @Override // defpackage.kt
    public final void v() {
        this.a.a();
    }

    @Override // defpackage.kt
    public final void x(bhm bhmVar) {
        boolean z = bhmVar != null ? bhmVar.c.getBoolean("androidx.mediarouter.media.MediaRouterParams.FIXED_CAST_ICON") : false;
        MediaRouteButton mediaRouteButton = this.a;
        if (mediaRouteButton.b != z) {
            mediaRouteButton.b = z;
            mediaRouteButton.refreshDrawableState();
        }
    }

    @Override // defpackage.kt
    public final void z() {
        this.a.a();
    }
}
