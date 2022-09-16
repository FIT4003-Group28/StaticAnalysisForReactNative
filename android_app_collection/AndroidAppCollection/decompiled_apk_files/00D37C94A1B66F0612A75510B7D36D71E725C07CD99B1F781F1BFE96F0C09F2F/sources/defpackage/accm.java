package defpackage;

import android.media.projection.MediaProjection;
import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: accm  reason: default package */
/* loaded from: classes.dex */
public final class accm extends MediaProjection.Callback {
    final /* synthetic */ accp a;

    public accm(accp accpVar) {
        this.a = accpVar;
    }

    @Override // android.media.projection.MediaProjection.Callback
    public final void onStop() {
        super.onStop();
        ylr.b();
        if (this.a.d) {
            Log.e("VirtualDisplaySource", "Media projection stopped unexpectedly");
            this.a.l(6);
        }
    }
}
