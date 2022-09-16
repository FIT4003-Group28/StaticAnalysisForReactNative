package defpackage;

import android.os.SystemClock;
import org.webrtc.Logging;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
/* compiled from: PG */
/* renamed from: axhl  reason: default package */
/* loaded from: classes2.dex */
public final class axhl implements VideoSink {
    public axhj b;
    public VideoFrame c;
    public final /* synthetic */ axhn d;
    private final baom f;
    public final Object a = new Object();
    public int e = 1;

    public axhl(axhn axhnVar, baom baomVar) {
        this.d = axhnVar;
        this.f = baomVar;
    }

    public final void a() {
        synchronized (this.a) {
            if (this.e == 3) {
                this.c.release();
                this.c = null;
            }
            this.e = 1;
        }
    }

    public final boolean b() {
        this.d.i();
        synchronized (this.a) {
            if (this.e == 1 && this.d.h.size() != 0) {
                axhj axhjVar = (axhj) this.d.h.remove();
                this.b = axhjVar;
                this.e = 2;
                final baom baomVar = this.f;
                final int i = axhjVar.a;
                final int i2 = axhjVar.b;
                if (i <= 0) {
                    StringBuilder sb = new StringBuilder(51);
                    sb.append("Texture width must be positive, but was ");
                    sb.append(i);
                    throw new IllegalArgumentException(sb.toString());
                } else if (i2 <= 0) {
                    StringBuilder sb2 = new StringBuilder(52);
                    sb2.append("Texture height must be positive, but was ");
                    sb2.append(i2);
                    throw new IllegalArgumentException(sb2.toString());
                } else {
                    baomVar.b.setDefaultBufferSize(i, i2);
                    baomVar.a.post(new Runnable() { // from class: baoj
                        @Override // java.lang.Runnable
                        public final void run() {
                            baom baomVar2 = baom.this;
                            int i3 = i;
                            int i4 = i2;
                            baomVar2.h = i3;
                            baomVar2.i = i4;
                            baomVar2.b();
                        }
                    });
                    final baom baomVar2 = this.f;
                    final int i3 = this.b.f.c;
                    baomVar2.a.post(new Runnable() { // from class: baoi
                        @Override // java.lang.Runnable
                        public final void run() {
                            baom.this.g = i3;
                        }
                    });
                    return this.d.n(this.b.c, true);
                }
            }
            return false;
        }
    }

    @Override // org.webrtc.VideoSink
    public final void onFrame(VideoFrame videoFrame) {
        synchronized (this.a) {
            axgq axgqVar = axgq.UNKNOWN;
            int i = this.e;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            if (i2 == 0) {
                Logging.d("IMCVideoDecoder", "onFrame() called in READY state.");
            } else if (i2 == 1) {
                VideoFrame.Buffer buffer = videoFrame.getBuffer();
                axhk axhkVar = this.b.f;
                this.c = new VideoFrame(buffer, axhkVar.c, axhkVar.b);
                videoFrame.getBuffer().retain();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.e = 3;
                axhn axhnVar = this.d;
                int i3 = axhnVar.p;
                if (i3 <= axhnVar.q) {
                    int i4 = axhnVar.j;
                    int i5 = axhnVar.k;
                    axhj axhjVar = this.b;
                    long j = axhjVar.d;
                    long j2 = elapsedRealtime - axhjVar.e;
                    StringBuilder sb = new StringBuilder(156);
                    sb.append("Decoder frame rendered # ");
                    sb.append(i3);
                    sb.append(". ");
                    sb.append(i4);
                    sb.append(" x ");
                    sb.append(i5);
                    sb.append(". TS: ");
                    sb.append(j);
                    sb.append(". RenderTime: ");
                    sb.append(j2);
                    sb.append(". TotalTime: ");
                    sb.append(elapsedRealtime - axhjVar.f.a);
                    Logging.a("IMCVideoDecoder", sb.toString());
                }
                this.a.notifyAll();
                axhn axhnVar2 = this.d;
                if (axhnVar2.f) {
                    axhnVar2.e.post(new axhd(axhnVar2, 2));
                }
            } else {
                String str = i != 1 ? i != 2 ? "DONE" : "WAIT_FOR_TEXTURE_FRAME_AVAILABLE" : "READY";
                StringBuilder sb2 = new StringBuilder(str.length() + 37);
                sb2.append("Unexpected onFrame() called in state ");
                sb2.append(str);
                Logging.b("IMCVideoDecoder", sb2.toString());
                throw new IllegalStateException("Already holding a texture.");
            }
        }
    }
}
