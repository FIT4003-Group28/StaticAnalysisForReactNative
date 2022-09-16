package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.io.IOException;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: vqu  reason: default package */
/* loaded from: classes4.dex */
public final class vqu {
    public vqt a;
    public int b = 1;
    public final vru c;
    private ByteBuffer[] d;
    private ByteBuffer[] e;

    public vqu(vru vruVar, MediaFormat mediaFormat) {
        this.c = vruVar;
        vruVar.i(mediaFormat, null, 1);
    }

    public final void a(long j) {
        boolean z;
        if (this.b != 2) {
            return;
        }
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        while (true) {
            int b = this.c.b(bufferInfo, j);
            if (b == -1) {
                return;
            }
            if (b == -3) {
                this.e = this.c.h();
            } else if (b == -2) {
                vqt vqtVar = this.a;
                MediaFormat outputFormat = this.c.a.getOutputFormat();
                synchronized (((zlp) vqtVar).f) {
                    if (this == ((zlp) vqtVar).b) {
                        if (((zlp) vqtVar).j == null) {
                            ((zlp) vqtVar).j = outputFormat;
                        } else {
                            throw new RuntimeException("Multiple video tracks specified.");
                        }
                    } else if (((zlp) vqtVar).k == null) {
                        ((zlp) vqtVar).k = outputFormat;
                        if (zlp.i(((zlp) vqtVar).v)) {
                            try {
                                ((zlp) vqtVar).d.j(new pkw(((zlp) vqtVar).k.getInteger("sample-rate"), ((zlp) vqtVar).k.getInteger("channel-count"), 2));
                            } catch (pkx unused) {
                                zep.c("SonicAudioProcessor UnhandledAudioFormatException", "The input audio format has to be C.ENCODING_PCM_16BIT.");
                            }
                            ((zlp) vqtVar).d.l();
                        }
                    } else {
                        throw new RuntimeException("Multiple audio tracks specified.");
                    }
                    MediaFormat mediaFormat = ((zlp) vqtVar).j;
                    if (mediaFormat != null && ((zlp) vqtVar).a != 5 && ((zlp) vqtVar).k != null) {
                        ((zlp) vqtVar).h = ((zlp) vqtVar).Q.a(mediaFormat);
                        MediaFormat mediaFormat2 = ((zlp) vqtVar).k;
                        if (mediaFormat2 != null) {
                            ((zlp) vqtVar).i = ((zlp) vqtVar).Q.a(mediaFormat2);
                        }
                        try {
                            ((zlp) vqtVar).Q.a.start();
                            ((zlp) vqtVar).g = true;
                            ((zlp) vqtVar).f.notifyAll();
                        } catch (IOException e) {
                            zep.b("Failed to start media muxer.");
                            throw new IllegalStateException(e);
                        }
                    }
                }
            } else if (b < 0) {
                StringBuilder sb = new StringBuilder(55);
                sb.append("Unexpected result from dequeueOutputBuffer: ");
                sb.append(b);
                vqy.b(sb.toString());
            } else {
                vqt vqtVar2 = this.a;
                ByteBuffer byteBuffer = this.e[b];
                byteBuffer.getClass();
                if ((bufferInfo.flags & 2) == 0 && bufferInfo.size != 0) {
                    synchronized (((zlp) vqtVar2).f) {
                        while (true) {
                            z = ((zlp) vqtVar2).g;
                            if (z || ((zlp) vqtVar2).a >= 5) {
                                break;
                            }
                            try {
                                ((zlp) vqtVar2).f.wait();
                            } catch (InterruptedException unused2) {
                            }
                        }
                        if (z && ((zlp) vqtVar2).Q != null) {
                            int i = this == ((zlp) vqtVar2).b ? ((zlp) vqtVar2).h : ((zlp) vqtVar2).i;
                            aqxo.p(i >= 0);
                            try {
                                ((zlp) vqtVar2).Q.a.writeSampleData(i, byteBuffer, bufferInfo);
                                if (this == ((zlp) vqtVar2).b) {
                                    ((zlp) vqtVar2).f273J++;
                                }
                            } catch (IOException e2) {
                                zep.b("Failed to write sample data.");
                                throw new IllegalStateException(e2);
                            }
                        }
                    }
                }
                this.c.d(b, false);
                if ((bufferInfo.flags & 4) != 0) {
                    this.b = 3;
                    return;
                }
            }
        }
    }

    public final void b(ByteBuffer byteBuffer, int i, long j) {
        int a = this.c.a(-1L);
        if (a < 0) {
            throw new RuntimeException("No input buffer available.");
        }
        ByteBuffer byteBuffer2 = this.d[a];
        byteBuffer2.put(byteBuffer);
        byteBuffer2.rewind();
        this.c.j(a, i, j, 0);
    }

    public final void c() {
        this.c.c();
    }

    public final void d() {
        this.b = 2;
        this.c.e();
        this.d = this.c.g();
        this.e = this.c.h();
    }

    public final void e() {
        this.b = 4;
        this.c.f();
    }
}
