package defpackage;

import android.util.Log;
import android.view.Display;
/* compiled from: PG */
/* renamed from: pxu  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class pxu {
    public final /* synthetic */ pya a;

    public final void a(Display display) {
        pya pyaVar = this.a;
        if (display != null) {
            double refreshRate = display.getRefreshRate();
            Double.isNaN(refreshRate);
            long j = (long) (1.0E9d / refreshRate);
            pyaVar.i = j;
            pyaVar.j = (j * 80) / 100;
            return;
        }
        Log.w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        pyaVar.i = -9223372036854775807L;
        pyaVar.j = -9223372036854775807L;
    }
}
