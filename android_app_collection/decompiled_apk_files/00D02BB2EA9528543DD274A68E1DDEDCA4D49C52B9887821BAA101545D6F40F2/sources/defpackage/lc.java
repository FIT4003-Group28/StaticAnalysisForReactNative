package defpackage;

import android.media.browse.MediaBrowser;
/* compiled from: PG */
/* renamed from: lc  reason: default package */
/* loaded from: classes7.dex */
final class lc extends MediaBrowser.ConnectionCallback {
    final /* synthetic */ le a;

    public lc(le leVar) {
        this.a = leVar;
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        ld ldVar = this.a.b;
        if (ldVar != null) {
            ldVar.a();
        }
        this.a.a();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() {
        this.a.c();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() {
        ld ldVar = this.a.b;
        if (ldVar != null) {
            ldVar.b();
        }
        this.a.b();
    }
}
