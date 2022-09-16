package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Process;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: aeve  reason: default package */
/* loaded from: classes.dex */
public final class aeve extends otk {
    private final aevn i;
    private final pmm j;
    private long k;
    private long l;
    private boolean m;
    private long n;
    private boolean o;
    private float p;
    private boolean q;
    private ByteBuffer r;
    private int s;
    private int t;
    private final afdh u;

    public aeve(oui ouiVar, otm otmVar, owy owyVar, Handler handler, afdh afdhVar, aevn aevnVar, boolean z) {
        super(ouiVar, otmVar, owyVar, handler, afdhVar);
        this.u = afdhVar;
        this.i = aevnVar;
        if (!z) {
            this.j = null;
            return;
        }
        this.j = new pmm();
        this.l = -1L;
        this.o = true;
        G(1.0f);
        this.m = false;
        this.q = true;
        this.r = null;
        this.s = -1;
        this.t = -1;
    }

    protected final void G(float f) {
        if (this.j == null) {
            return;
        }
        boolean z = false;
        if (f >= 0.25f && f <= 2.0f) {
            z = true;
        }
        afms.c(z, "Playback rate must be in the interval [0.25, 2.0]");
        if (this.p == f) {
            return;
        }
        this.p = f;
        this.j.a(f);
        this.j.l();
    }

    @Override // defpackage.otk, defpackage.otg
    public final long a() {
        if (this.j == null) {
            return super.a();
        }
        if (this.m) {
            this.m = false;
            try {
                g(this.k);
            } catch (osx unused) {
            }
            return a();
        }
        long a = super.a();
        long j = this.l;
        int i = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
        this.l = a;
        if (i != 0) {
            a = (((a - j) * ((int) (this.p * 100.0f))) / 100) + this.k;
        }
        this.k = a;
        return a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouj, defpackage.ouo
    public final long b() {
        long b = super.b();
        this.i.b(b);
        return b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.otk, defpackage.ots, defpackage.ouo
    public final boolean i() {
        if (super.i()) {
            this.i.e();
            return true;
        }
        return false;
    }

    @Override // defpackage.otk, defpackage.ouo, defpackage.osy
    public final void k(int i, Object obj) {
        if (i == 100) {
            G(((Float) obj).floatValue());
        } else {
            super.k(i, obj);
        }
    }

    @Override // defpackage.otk
    protected final void o() {
        this.m = true;
    }

    @Override // defpackage.otk
    protected final void p(int i) {
        afdh afdhVar = this.u;
        afdhVar.d = i;
        afdhVar.a.c(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouj, defpackage.ouo
    public final void pO(int i, long j, boolean z) {
        super.pO(i, j, z);
        G(1.0f);
        if (Process.getThreadPriority(Process.myTid()) != -16) {
            Process.setThreadPriority(-16);
        }
    }

    @Override // defpackage.otk, defpackage.ots, defpackage.ouj, defpackage.ouo
    public final void q() {
        afdh afdhVar = this.u;
        afdhVar.a.b(afdhVar.d);
        super.q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.otk, defpackage.ots, defpackage.ouj
    public final void r(long j) {
        super.r(j);
        this.l = -1L;
        this.o = true;
        pmm pmmVar = this.j;
        if (pmmVar != null && this.t != -1) {
            pmmVar.l();
        }
        this.q = true;
        this.r = null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.otk, defpackage.ots
    public final void t(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        if (this.j != null) {
            this.s = mediaFormat.getInteger("sample-rate");
            int integer = mediaFormat.getInteger("channel-count");
            this.t = integer;
            try {
                this.j.j(new pkw(this.s, integer, 2));
                this.j.l();
            } catch (pkx e) {
                zep.n("SonicAudioProcessor doesn't support ENCODING_PCM_16BIT!?", e);
            }
        }
        super.t(mediaCodec, mediaFormat);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.otk, defpackage.ots, defpackage.ouo
    public final void v() {
        super.v();
        this.i.f();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.otk, defpackage.ots
    public final boolean y(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i, boolean z) {
        ByteBuffer byteBuffer2;
        ByteBuffer byteBuffer3;
        if (j - bufferInfo.presentationTimeUs > 5000000) {
            long j3 = bufferInfo.presentationTimeUs;
            long j4 = bufferInfo.presentationTimeUs;
        }
        pmm pmmVar = this.j;
        if (pmmVar != null) {
            if (z || !this.q) {
                byteBuffer3 = this.r;
            } else {
                if (this.p != 1.0f) {
                    pmmVar.h(byteBuffer);
                    byteBuffer3 = this.j.k();
                    bufferInfo.size = byteBuffer3.limit();
                } else {
                    byteBuffer3 = byteBuffer;
                }
                this.r = byteBuffer3;
                if (this.o) {
                    this.o = false;
                    this.n = bufferInfo.presentationTimeUs;
                } else {
                    long j5 = this.n;
                    int i2 = bufferInfo.size;
                    int i3 = this.t;
                    long j6 = j5 + ((i2 * 1000000) / ((i3 + i3) * this.s));
                    this.n = j6;
                    bufferInfo.presentationTimeUs = (j6 / 1000) * 1000;
                }
            }
            byteBuffer2 = byteBuffer3;
        } else {
            byteBuffer2 = byteBuffer;
        }
        boolean y = super.y(j, j2, mediaCodec, byteBuffer2, bufferInfo, i, z);
        this.q = y;
        return y;
    }
}
