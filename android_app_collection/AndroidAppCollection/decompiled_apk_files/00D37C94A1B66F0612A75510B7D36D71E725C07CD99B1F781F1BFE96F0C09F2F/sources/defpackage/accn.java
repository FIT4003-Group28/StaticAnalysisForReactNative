package defpackage;

import android.hardware.display.VirtualDisplay;
import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: accn  reason: default package */
/* loaded from: classes.dex */
public final class accn extends VirtualDisplay.Callback {
    final /* synthetic */ accp a;

    public accn(accp accpVar) {
        this.a = accpVar;
    }

    @Override // android.hardware.display.VirtualDisplay.Callback
    public final void onStopped() {
        super.onStopped();
        ylr.b();
        if (this.a.d) {
            Log.e("VirtualDisplaySource", "Virtual display stopped unexpectedly");
            this.a.l(6);
        }
    }
}
