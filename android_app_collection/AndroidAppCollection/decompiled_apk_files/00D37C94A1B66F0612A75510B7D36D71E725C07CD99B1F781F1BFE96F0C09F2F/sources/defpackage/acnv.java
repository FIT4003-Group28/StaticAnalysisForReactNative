package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import org.webrtc.NativeAndroidVideoTrackSource;
import org.webrtc.VideoFrame;
import org.webrtc.VideoProcessor$FrameAdaptationParameters;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acnv  reason: default package */
/* loaded from: classes.dex */
public final class acnv implements Runnable {
    final /* synthetic */ acnx a;

    public acnv(acnx acnxVar) {
        this.a = acnxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        acnx acnxVar = this.a;
        acnxVar.a.removeCallbacks(acnxVar.f);
        if (this.a.g) {
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            acnx acnxVar2 = this.a;
            long j2 = acnxVar2.e;
            if (j2 < 0) {
                acnxVar2.e = elapsedRealtimeNanos;
                j2 = elapsedRealtimeNanos;
            }
            if (elapsedRealtimeNanos < j2 - acnxVar2.d) {
                acnx acnxVar3 = this.a;
                acnxVar3.a.postDelayed(acnxVar3.f, acnxVar3.b);
            }
            acqm acqmVar = acnxVar2.h.a;
            absg absgVar = acqmVar.b;
            final int i = absgVar.e;
            if (i != 0) {
                acpg acpgVar = acqmVar.h;
                final int i2 = absgVar.a;
                final int i3 = absgVar.b;
                final acps acpsVar = acpgVar.r;
                if (acpsVar != null) {
                    final acox acoxVar = acpgVar.A;
                    final Handler handler = acpgVar.j;
                    if (acpsVar.d == null || acpsVar.e != i2 || acpsVar.f != i3 || acpsVar.g != i || acpsVar.k != acoxVar || acpsVar.h != handler) {
                        acpsVar.e = i2;
                        acpsVar.f = i3;
                        acpsVar.g = i;
                        acpsVar.k = acoxVar;
                        acpsVar.h = handler;
                        acpsVar.d = new Runnable() { // from class: acpq
                            @Override // java.lang.Runnable
                            public final void run() {
                                acps acpsVar2 = acps.this;
                                int i4 = i2;
                                int i5 = i3;
                                int i6 = i;
                                acox acoxVar2 = acoxVar;
                                Handler handler2 = handler;
                                ylr.b();
                                if (!acpsVar2.j || acpsVar2.i == null) {
                                    return;
                                }
                                long nanos = TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
                                acod acodVar = new acod(i4, i5, i6, null, acpsVar2.c, null);
                                acodVar.c = acoxVar2;
                                acodVar.a = handler2;
                                VideoFrame videoFrame = new VideoFrame(acodVar, 0, nanos);
                                bapg bapgVar = (bapg) acpsVar2.i;
                                VideoProcessor$FrameAdaptationParameters nativeAdaptFrame = NativeAndroidVideoTrackSource.nativeAdaptFrame(bapgVar.a.a.a, videoFrame.getBuffer().getWidth(), videoFrame.getBuffer().getHeight(), videoFrame.getRotation(), videoFrame.getTimestampNs());
                                synchronized (bapgVar.a.b) {
                                }
                                VideoFrame videoFrame2 = nativeAdaptFrame.h ? null : new VideoFrame(videoFrame.getBuffer().cropAndScale(nativeAdaptFrame.a, nativeAdaptFrame.b, nativeAdaptFrame.c, nativeAdaptFrame.d, nativeAdaptFrame.e, nativeAdaptFrame.f), videoFrame.getRotation(), nativeAdaptFrame.g);
                                if (videoFrame2 != null) {
                                    NativeAndroidVideoTrackSource.nativeOnFrameCaptured(bapgVar.a.a.a, videoFrame2.getRotation(), videoFrame2.getTimestampNs(), videoFrame2.getBuffer());
                                    videoFrame2.release();
                                }
                                videoFrame.release();
                            }
                        };
                    }
                    acpsVar.b.post(acpsVar.d);
                }
            }
            do {
                acnx acnxVar4 = this.a;
                j = acnxVar4.e + acnxVar4.c;
                acnxVar4.e = j;
            } while (j <= elapsedRealtimeNanos);
            acnx acnxVar32 = this.a;
            acnxVar32.a.postDelayed(acnxVar32.f, acnxVar32.b);
        }
    }
}
