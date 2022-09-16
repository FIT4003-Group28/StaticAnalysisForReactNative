package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: avm  reason: default package */
/* loaded from: classes2.dex */
public final class avm implements avx {
    public final MediaCodec a;
    public final avr b;
    public final avp c;
    public int d = 0;
    private final boolean e;
    private boolean f;

    public avm(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z, boolean z2) {
        this.a = mediaCodec;
        this.b = new avr(handlerThread);
        this.c = new avp(mediaCodec, handlerThread2, z);
        this.e = z2;
    }

    public static String d(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    private final void r() {
        if (this.e) {
            try {
                this.c.b();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // defpackage.avx
    public final int a() {
        int i;
        avr avrVar = this.b;
        synchronized (avrVar.a) {
            i = -1;
            if (!avrVar.d()) {
                avrVar.b();
                if (!avrVar.d.d()) {
                    i = avrVar.d.a();
                }
            }
        }
        return i;
    }

    @Override // defpackage.avx
    public final int b(MediaCodec.BufferInfo bufferInfo) {
        int i;
        avr avrVar = this.b;
        synchronized (avrVar.a) {
            i = -1;
            if (!avrVar.d()) {
                avrVar.b();
                if (!avrVar.e.d()) {
                    int a = avrVar.e.a();
                    i = -2;
                    if (a >= 0) {
                        ptx.b(avrVar.h);
                        MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) avrVar.f.remove();
                        bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                    } else if (a == -2) {
                        avrVar.h = (MediaFormat) avrVar.g.remove();
                    }
                    i = a;
                }
            }
        }
        return i;
    }

    @Override // defpackage.avx
    public final MediaFormat c() {
        MediaFormat mediaFormat;
        avr avrVar = this.b;
        synchronized (avrVar.a) {
            mediaFormat = avrVar.h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    @Override // defpackage.avx
    public final ByteBuffer e(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // defpackage.avx
    public final ByteBuffer f(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // defpackage.avx
    public final void g() {
        this.c.c();
        this.a.flush();
        final avr avrVar = this.b;
        final MediaCodec mediaCodec = this.a;
        mediaCodec.getClass();
        final Runnable runnable = new Runnable() { // from class: avj
            @Override // java.lang.Runnable
            public final void run() {
                mediaCodec.start();
            }
        };
        synchronized (avrVar.a) {
            avrVar.i++;
            Handler handler = avrVar.c;
            int i = pxi.a;
            handler.post(new Runnable() { // from class: avq
                @Override // java.lang.Runnable
                public final void run() {
                    avr avrVar2 = avr.this;
                    Runnable runnable2 = runnable;
                    synchronized (avrVar2.a) {
                        if (!avrVar2.j) {
                            long j = avrVar2.i - 1;
                            avrVar2.i = j;
                            if (j <= 0) {
                                if (j < 0) {
                                    avrVar2.c(new IllegalStateException());
                                } else {
                                    avrVar2.a();
                                    try {
                                        runnable2.run();
                                    } catch (IllegalStateException e) {
                                        avrVar2.c(e);
                                    } catch (Exception e2) {
                                        avrVar2.c(new IllegalStateException(e2));
                                    }
                                }
                            }
                        }
                    }
                }
            });
        }
    }

    @Override // defpackage.avx
    public final void h() {
        try {
            if (this.d == 1) {
                avp avpVar = this.c;
                if (avpVar.h) {
                    avpVar.c();
                    avpVar.d.quit();
                }
                avpVar.h = false;
                avr avrVar = this.b;
                synchronized (avrVar.a) {
                    avrVar.j = true;
                    avrVar.b.quit();
                    avrVar.a();
                }
            }
            this.d = 2;
        } finally {
            if (!this.f) {
                this.a.release();
                this.f = true;
            }
        }
    }

    @Override // defpackage.avx
    public final void i(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // defpackage.avx
    public final void j(Surface surface) {
        r();
        this.a.setOutputSurface(surface);
    }

    @Override // defpackage.avx
    public final void k(Bundle bundle) {
        r();
        this.a.setParameters(bundle);
    }

    @Override // defpackage.avx
    public final void l(int i) {
        r();
        this.a.setVideoScalingMode(i);
    }

    @Override // defpackage.avx
    public final boolean m() {
        return false;
    }

    @Override // defpackage.avx
    public final void n(pxp pxpVar, Handler handler) {
        r();
        this.a.setOnFrameRenderedListener(new awo(pxpVar, 1), handler);
    }

    @Override // defpackage.avx
    public final void o(int i, int i2, long j, int i3) {
        avp avpVar = this.c;
        avpVar.d();
        avo a = avp.a();
        a.a(i, i2, j, i3);
        Handler handler = avpVar.e;
        int i4 = pxi.a;
        handler.obtainMessage(0, a).sendToTarget();
    }

    @Override // defpackage.avx
    public final void p(int i, pmq pmqVar, long j) {
        avp avpVar = this.c;
        avpVar.d();
        avo a = avp.a();
        a.a(i, 0, j, 0);
        MediaCodec.CryptoInfo cryptoInfo = a.d;
        cryptoInfo.numSubSamples = pmqVar.f;
        cryptoInfo.numBytesOfClearData = avp.g(pmqVar.d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = avp.g(pmqVar.e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) ptx.a(avp.f(pmqVar.b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) ptx.a(avp.f(pmqVar.a, cryptoInfo.iv));
        cryptoInfo.mode = pmqVar.c;
        if (pxi.a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(pmqVar.g, pmqVar.h));
        }
        avpVar.e.obtainMessage(1, a).sendToTarget();
    }

    @Override // defpackage.avx
    public final void q(int i) {
        this.a.releaseOutputBuffer(i, false);
    }
}
