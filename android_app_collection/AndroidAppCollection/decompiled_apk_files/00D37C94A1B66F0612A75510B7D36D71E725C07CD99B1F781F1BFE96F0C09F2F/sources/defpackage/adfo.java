package defpackage;

import android.app.Dialog;
import androidx.mediarouter.app.MediaRouteButton;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: adfo  reason: default package */
/* loaded from: classes.dex */
public final class adfo implements aypg {
    public final MediaRouteButton a;
    aypg b;
    Dialog c;

    public adfo(MediaRouteButton mediaRouteButton) {
        this.a = mediaRouteButton;
    }

    @Override // defpackage.aypg
    public final boolean e() {
        aypg aypgVar = this.b;
        return aypgVar == null || aypgVar.e();
    }

    @Override // defpackage.aypg
    public final void qr() {
        aypg aypgVar = this.b;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
            this.b = null;
        }
        Dialog dialog = this.c;
        if (dialog != null) {
            dialog.cancel();
            this.c = null;
        }
    }
}
