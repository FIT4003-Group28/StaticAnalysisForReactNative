package defpackage;

import java.util.TimerTask;
import org.webrtc.Logging;
/* compiled from: PG */
/* renamed from: bapo  reason: default package */
/* loaded from: classes2.dex */
public final class bapo extends TimerTask {
    final /* synthetic */ bapp a;
    private final int b;
    private final int c;

    public bapo(bapp bappVar, int i, int i2) {
        this.a = bappVar;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        int mode = this.a.a.getMode();
        if (mode == 1) {
            int streamVolume = this.a.a.getStreamVolume(2);
            int i = this.b;
            StringBuilder sb = new StringBuilder(56);
            sb.append("STREAM_RING stream volume: ");
            sb.append(streamVolume);
            sb.append(" (max=");
            sb.append(i);
            sb.append(")");
            Logging.a("VolumeLogger", sb.toString());
        } else if (mode != 3) {
        } else {
            int streamVolume2 = this.a.a.getStreamVolume(0);
            int i2 = this.c;
            StringBuilder sb2 = new StringBuilder(55);
            sb2.append("VOICE_CALL stream volume: ");
            sb2.append(streamVolume2);
            sb2.append(" (max=");
            sb2.append(i2);
            sb2.append(")");
            Logging.a("VolumeLogger", sb2.toString());
        }
    }
}
