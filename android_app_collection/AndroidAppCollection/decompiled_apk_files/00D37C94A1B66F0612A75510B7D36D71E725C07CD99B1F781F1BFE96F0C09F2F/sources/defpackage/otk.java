package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: otk  reason: default package */
/* loaded from: classes4.dex */
public class otk extends ots implements otg {
    public final afdh a;
    private final ouz i;
    private boolean j;
    private MediaFormat k;
    private int l;
    private int m;
    private long n;
    private boolean o;
    private boolean p;
    private long q;

    public otk(oui ouiVar, otm otmVar) {
        this(ouiVar, otmVar, null, null, null);
    }

    public long a() {
        long d = this.i.d(h());
        if (d != Long.MIN_VALUE) {
            if (!this.o) {
                d = Math.max(this.n, d);
            }
            this.n = d;
            this.o = false;
        }
        return this.n;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ots, defpackage.ouo
    public final boolean h() {
        return this.g && !this.i.m();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ots, defpackage.ouo
    public boolean i() {
        return this.i.m() || super.i();
    }

    @Override // defpackage.ouo, defpackage.osy
    public void k(int i, Object obj) {
        if (i == 1) {
            this.i.l(((Float) obj).floatValue());
        } else if (i == 2) {
            this.i.k((PlaybackParams) obj);
        } else if (i != 3) {
        } else {
            int intValue = ((Integer) obj).intValue();
            ouz ouzVar = this.i;
            if (ouzVar.b == intValue) {
                return;
            }
            ouzVar.b = intValue;
            ouzVar.j();
            this.m = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ots
    public final osv l(otm otmVar, String str, boolean z) {
        this.j = false;
        return super.l(otmVar, str, z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public otg m() {
        return this;
    }

    @Override // defpackage.ots
    protected final void n(MediaCodec mediaCodec, boolean z, MediaFormat mediaFormat, MediaCrypto mediaCrypto) {
        mediaFormat.getString("mime");
        mediaCodec.configure(mediaFormat, (Surface) null, mediaCrypto, 0);
        this.k = null;
    }

    protected void o() {
    }

    protected void p(int i) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ots, defpackage.ouj, defpackage.ouo
    public void q() {
        this.m = 0;
        try {
            this.i.j();
        } finally {
            super.q();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ots, defpackage.ouj
    public void r(long j) {
        super.r(j);
        this.i.j();
        this.n = j;
        this.o = true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ots
    public final void s(oue oueVar) {
        super.s(oueVar);
        this.l = "audio/raw".equals(oueVar.a.b) ? oueVar.a.s : 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ots
    public void t(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        MediaFormat mediaFormat2 = this.k;
        String string = mediaFormat2 != null ? mediaFormat2.getString("mime") : "audio/raw";
        if (mediaFormat2 != null) {
            mediaFormat = this.k;
        }
        this.i.e(string, mediaFormat.getInteger("channel-count"), mediaFormat.getInteger("sample-rate"), this.l, 0);
    }

    @Override // defpackage.ots
    protected final void u() {
        this.i.g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ots, defpackage.ouo
    public void v() {
        this.i.i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ouo
    public final void w() {
        this.i.h();
    }

    @Override // defpackage.ots
    protected final boolean x(otm otmVar, com.google.android.exoplayer.MediaFormat mediaFormat) {
        String str = mediaFormat.b;
        return pcu.e(str) && ("audio/x-unknown".equals(str) || otmVar.a(str, false) != null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ots
    public boolean y(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, int i, boolean z) {
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.b.g++;
            this.i.f();
            return true;
        }
        if (!this.i.n()) {
            try {
                int i2 = this.m;
                if (i2 != 0) {
                    this.i.c(i2);
                } else {
                    int b = this.i.b();
                    this.m = b;
                    p(b);
                }
                this.p = false;
                if (this.h == 3) {
                    this.i.i();
                }
            } catch (oux e) {
                Handler handler = this.d;
                if (handler != null && this.a != null) {
                    handler.post(new oth(this, e));
                }
                throw new osx(e);
            }
        } else {
            boolean z2 = this.p;
            boolean m = this.i.m();
            this.p = m;
            if (z2 && !m && this.h == 3) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - this.q;
                long j3 = this.i.d;
                long j4 = -1;
                if (j3 != -1) {
                    j4 = j3 / 1000;
                }
                Handler handler2 = this.d;
                if (handler2 != null && this.a != null) {
                    handler2.post(new otj(this, j4, elapsedRealtime));
                }
            }
        }
        try {
            int a = this.i.a(byteBuffer, bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs);
            this.q = SystemClock.elapsedRealtime();
            if ((a & 1) != 0) {
                o();
                this.o = true;
            }
            if ((a & 2) == 0) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i, false);
            this.b.f++;
            return true;
        } catch (ouy e2) {
            Handler handler3 = this.d;
            if (handler3 != null && this.a != null) {
                handler3.post(new oti(this, e2));
            }
            throw new osx(e2);
        }
    }

    public otk(oui ouiVar, otm otmVar, owy owyVar, Handler handler, afdh afdhVar) {
        super(new oui[]{ouiVar}, otmVar, owyVar, true, handler, (otr) afdhVar);
        this.a = afdhVar;
        this.m = 0;
        this.i = new ouz(null);
    }
}
