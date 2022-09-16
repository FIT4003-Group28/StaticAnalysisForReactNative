package defpackage;

import android.os.SystemClock;
import java.util.Locale;
import org.webrtc.Logging;
import org.webrtc.VideoCodecStatus;
/* compiled from: PG */
/* renamed from: axhd  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class axhd implements Runnable {
    public final /* synthetic */ axhn a;
    private final /* synthetic */ int b;

    public /* synthetic */ axhd(axhn axhnVar, int i) {
        this.b = i;
        this.a = axhnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        if (i == 0) {
            axhn axhnVar = this.a;
            axhnVar.i();
            if (axhnVar.p == axhnVar.y) {
                axhnVar.l();
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            float f = ((float) (elapsedRealtime - axhnVar.x)) / 1000.0f;
            float f2 = axhnVar.p - axhnVar.y;
            Logging.a("IMCVideoDecoder", String.format(Locale.ENGLISH, "Statistics for last %s ms. Received frames: %s. Decoded: %s. Delivered: %s. Bitrate: %.0f kbps. FPS: %.1f. Decode time: %.1f. Delay: %.1f.", Long.valueOf(elapsedRealtime - axhnVar.x), Integer.valueOf(axhnVar.n), Integer.valueOf(axhnVar.o), Integer.valueOf(axhnVar.p), Float.valueOf(((axhnVar.z * 8) / f) / 1000.0f), Float.valueOf(f2 / f), Float.valueOf(((float) axhnVar.A) / f2), Float.valueOf(((float) axhnVar.B) / f2)));
            axhnVar.l();
        } else if (i == 1) {
            axhn axhnVar2 = this.a;
            axhnVar2.i();
            VideoCodecStatus d = axhnVar2.d(0L);
            if (d == VideoCodecStatus.OK) {
                if (axhnVar2.n > axhnVar2.o) {
                    return;
                }
                axhnVar2.l.a(100L);
                return;
            }
            String valueOf = String.valueOf(d);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
            sb.append("Error in deliverPendingOutputs: ");
            sb.append(valueOf);
            Logging.b("IMCVideoDecoder", sb.toString());
            axhnVar2.r = d;
        } else {
            this.a.m();
        }
    }
}
