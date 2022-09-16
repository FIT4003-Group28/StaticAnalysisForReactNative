package defpackage;

import android.content.Context;
import android.media.MediaCodecInfo;
import android.os.Handler;
import android.util.Pair;
import android.view.Surface;
import com.google.android.exoplayer2.Format;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: aexv */
/* loaded from: classes.dex */
public final class aexv extends pxq {
    private final aevy A;
    private aevn B;
    private final Pair s;
    private final affj t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private long y;
    private final long z;

    public aexv(Context context, pyk pykVar, aevy aevyVar, Handler handler, aexm aexmVar, affj affjVar, long j, avw avwVar) {
        super(context, avwVar, aexmVar, handler, pykVar, 10);
        this.u = false;
        this.A = aevyVar;
        this.t = affjVar;
        this.x = ((awuj) aevyVar.s.g.c()).q;
        this.z = j;
        this.B = aevn.a;
        this.s = zew.p(context);
    }

    @Override // defpackage.pxq, defpackage.awb, defpackage.pkd
    public final boolean I() {
        if (!super.I()) {
            return false;
        }
        this.B.e();
        return true;
    }

    @Override // defpackage.pxq, defpackage.awb
    public final boolean K(avz avzVar) {
        Surface surface = this.q;
        if (!this.A.s.o().t || surface == null || surface.isValid()) {
            if (this.u) {
                this.u = false;
                this.t.n(surface, afte.ANDROID_EXOPLAYER_V2, true, this.A.b());
            }
            return super.K(avzVar);
        }
        this.u = true;
        this.t.n(surface, afte.ANDROID_EXOPLAYER_V2, false, this.A.b());
        return false;
    }

    @Override // defpackage.pxq
    public final boolean aA(long j, boolean z) {
        if (this.w) {
            int T = T(j);
            if (T == 0) {
                return false;
            }
            pms pmsVar = this.l;
            pmsVar.i++;
            if (z) {
                pmsVar.f += T;
            } else {
                ax(T);
            }
            return false;
        }
        return super.aA(j, z);
    }

    @Override // defpackage.pxq
    public final boolean aB(long j, long j2, boolean z) {
        if (this.w) {
            return true;
        }
        return super.aB(j, j2, z);
    }

    @Override // defpackage.pxq
    public final boolean aC(long j, long j2, boolean z) {
        long j3 = this.z;
        if ((j3 <= 0 || j2 - this.y <= j3) && super.aC(j, j2, z)) {
            return true;
        }
        this.y = j2;
        return false;
    }

    @Override // defpackage.pxq, defpackage.phj
    public final void af() {
        aevy aevyVar = this.A;
        this.v = aevyVar.c.c;
        this.w = aevyVar.a().X();
        super.af();
        this.B.f();
    }

    @Override // defpackage.pxq
    public final pxo at(avz avzVar, Format format, Format[] formatArr) {
        int i;
        if (!this.A.s.Z(aqwv.EXO_PLAYER_HOT_CONFIG_FEATURES_USE_FIXED_CODEC_MAX_VALUES)) {
            return super.at(avzVar, format, formatArr);
        }
        int max = Math.max(((Integer) this.s.first).intValue(), ((Integer) this.s.second).intValue());
        MediaCodecInfo.CodecCapabilities codecCapabilities = avzVar.d;
        if (codecCapabilities != null) {
            int min = Math.min(codecCapabilities.getVideoCapabilities().getSupportedWidths().getUpper().intValue(), max);
            i = Math.min(avzVar.d.getVideoCapabilities().getSupportedHeights().getUpper().intValue(), max);
            max = min;
        } else {
            i = max;
        }
        pxo at = super.at(avzVar, format, formatArr);
        return new pxo(Math.min(Math.max(at.a, 720), max), Math.min(Math.max(at.b, 720), i), 0);
    }

    @Override // defpackage.pxq
    public final void aw(avx avxVar, Surface surface) {
        try {
            super.aw(avxVar, surface);
            this.t.h(afte.ANDROID_EXOPLAYER_V2, surface, null);
        } catch (Exception e) {
            this.t.h(afte.ANDROID_EXOPLAYER_V2, surface, e);
            this.x = true;
            ylx.m(this.A.s.g.b(new adrz(10)), adkd.q);
            throw e;
        }
    }

    @Override // defpackage.pxq
    public final boolean az(String str) {
        int i;
        afjz afjzVar = this.A.s;
        if (afjzVar.a.a() == null || (i = apfu.b(afjzVar.n().e)) == 0) {
            i = 1;
        }
        int i2 = i - 1;
        if (i2 != 2) {
            if (i2 == 3) {
                return false;
            }
            if (i2 != 4) {
                return super.az(str);
            }
            return this.x || super.az(str);
        }
        return true;
    }

    @Override // defpackage.pxq, defpackage.awb
    public final float b(float f, Format format, Format[] formatArr) {
        if (this.A.s.o().aw) {
            return -1.0f;
        }
        afbi afbiVar = this.A.n;
        if (afbiVar != null) {
            FormatStreamModel[] formatStreamModelArr = afbiVar.c().a;
            float f2 = 30.0f;
            if (formatStreamModelArr.length > 0) {
                float c = formatStreamModelArr[0].c();
                if (c > 0.0f) {
                    f2 = c;
                }
            }
            return f2 * f;
        }
        return super.b(f, format, formatArr);
    }

    @Override // defpackage.pxq, defpackage.awb
    public final pmw h(avz avzVar, Format format, Format format2) {
        Boolean bool;
        if (!this.A.a().aT()) {
            aqxe aqxeVar = this.A.s.b.b.b().C;
            if (aqxeVar == null) {
                aqxeVar = aqxe.a;
            }
            boolean z = false;
            if (aqxeVar.a(45354764L)) {
                aoqp aoqpVar = aqxeVar.b;
                if (!aoqpVar.containsKey(45354764L)) {
                    throw new IllegalArgumentException();
                }
                aqxf aqxfVar = (aqxf) aoqpVar.get(45354764L);
                if (aqxfVar.b == 1) {
                    z = ((Boolean) aqxfVar.c).booleanValue();
                }
                bool = Boolean.valueOf(z);
            } else {
                bool = false;
            }
            if (!bool.booleanValue()) {
                if (!this.A.s.P() || format2.e(format)) {
                    return super.h(avzVar, format, format2);
                }
                return new pmw(avzVar.a, format, format2, 0, 32);
            }
        }
        return new pmw(avzVar.a, format, format2, 0, 4);
    }

    @Override // defpackage.pxq, defpackage.awb
    public final void k(pmv pmvVar) {
        if (this.v) {
            super.k(pmvVar);
            return;
        }
        final affx affxVar = this.A.c;
        ByteBuffer byteBuffer = pmvVar.g;
        final long j = pmvVar.f;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            return;
        }
        int remaining = byteBuffer.remaining();
        final byte[] bArr = new byte[remaining + 1];
        bArr[0] = 0;
        byteBuffer.get(bArr, 1, remaining);
        affxVar.d.post(new Runnable() { // from class: affv
            @Override // java.lang.Runnable
            public final void run() {
                affx affxVar2 = affx.this;
                byte[] bArr2 = bArr;
                long j2 = j;
                affxVar2.b();
                afnh T = affxVar2.e.T();
                if (T != null) {
                    T.r(false, bArr2, j2, affxVar2.e.g() * 1000);
                }
            }
        });
    }

    @Override // defpackage.pxq, defpackage.awb, defpackage.phj
    public final void q(boolean z, boolean z2) {
        super.q(z, z2);
        this.B.c();
    }

    @Override // defpackage.pxq, defpackage.awb, defpackage.phj
    public final void s(long j, boolean z) {
        super.s(j, z);
        this.y = 0L;
    }

    @Override // defpackage.pxq, defpackage.awb
    public final void v(pmv pmvVar) {
        super.v(pmvVar);
        this.B.d();
    }

    @Override // defpackage.pxq, defpackage.phj, defpackage.pkb
    public final void ad(int i, Object obj) {
        if (i != 10001) {
            if (i == 10003) {
                super.N(((awb) this).c);
                return;
            } else {
                super.ad(i, obj);
                return;
            }
        }
        aevn aevnVar = (aevn) obj;
        if (aevnVar == null) {
            aevnVar = aevn.a;
        }
        this.B = aevnVar;
    }
}
