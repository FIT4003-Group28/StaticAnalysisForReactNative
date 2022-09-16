package defpackage;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.Format;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: pmi  reason: default package */
/* loaded from: classes4.dex */
public class pmi extends awb implements pwj {
    private boolean A;
    public final plh q;
    public boolean r;
    public pij s;
    private final Context t;
    private final plo u;
    private int v;
    private boolean w;
    private Format x;
    private long y;
    private boolean z;

    public pmi(Context context, avw avwVar, awd awdVar, Handler handler, pli pliVar, plo ploVar) {
        super(1, avwVar, awdVar, 44100.0f);
        this.t = context.getApplicationContext();
        this.u = ploVar;
        this.q = new plh(handler, pliVar);
        ploVar.o(new pmh(this));
    }

    private final int as(avz avzVar, Format format) {
        if (!"OMX.google.raw.decoder".equals(avzVar.a) || pxi.a >= 24 || (pxi.a == 23 && pxi.S(this.t))) {
            return format.m;
        }
        return -1;
    }

    private final void at() {
        long b = this.u.b(H());
        if (b != Long.MIN_VALUE) {
            if (!this.r) {
                b = Math.max(this.y, b);
            }
            this.y = b;
            this.r = false;
        }
    }

    @Override // defpackage.awb, defpackage.pkd
    public final boolean H() {
        return ((awb) this).f && this.u.u();
    }

    @Override // defpackage.awb, defpackage.pkd
    public boolean I() {
        return this.u.t() || super.I();
    }

    @Override // defpackage.awb
    protected final boolean J(long j, long j2, avx avxVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, Format format) {
        ptx.a(byteBuffer);
        if (this.x != null && (i2 & 2) != 0) {
            ptx.a(avxVar);
            avxVar.q(i);
            return true;
        } else if (z) {
            if (avxVar != null) {
                avxVar.q(i);
            }
            this.l.f += i3;
            this.u.g();
            return true;
        } else {
            try {
                if (!this.u.s(byteBuffer, j3, i3)) {
                    return false;
                }
                if (avxVar != null) {
                    avxVar.q(i);
                }
                this.l.e += i3;
                return true;
            } catch (plk e) {
                throw W(e, e.c, e.b, 5001);
            } catch (pln e2) {
                throw W(e2, format, e2.b, 5002);
            }
        }
    }

    @Override // defpackage.awb
    protected final boolean L(Format format) {
        return this.u.v(format);
    }

    @Override // defpackage.phj, defpackage.pkd
    public pwj P() {
        return this;
    }

    @Override // defpackage.phj, defpackage.pkb
    public void ad(int i, Object obj) {
        if (i == 2) {
            this.u.r(((Float) obj).floatValue());
        } else if (i == 3) {
            this.u.l((aso) obj);
        } else if (i != 6) {
            switch (i) {
                case 9:
                    this.u.q(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    this.u.m(((Integer) obj).intValue());
                    return;
                case 11:
                    this.s = (pij) obj;
                    return;
                default:
                    return;
            }
        } else {
            this.u.n((asp) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.phj
    public void af() {
        this.u.i();
    }

    @Override // defpackage.phj
    protected final void ag() {
        at();
        this.u.h();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.awb
    public float b(float f, Format format, Format[] formatArr) {
        int i = -1;
        for (Format format2 : formatArr) {
            int i2 = format2.z;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    @Override // defpackage.awb
    protected final int c(awd awdVar, Format format) {
        if (!pwl.j(format.l)) {
            return 0;
        }
        int i = pxi.a;
        Class cls = format.E;
        boolean M = M(format);
        if (M && this.u.v(format) && (cls == null || awn.b() != null)) {
            return 44;
        }
        if (("audio/raw".equals(format.l) && !this.u.v(format)) || !this.u.v(pxi.w(2, format.y, format.z))) {
            return 1;
        }
        List j = j(awdVar, format, false);
        if (j.isEmpty()) {
            return 1;
        }
        if (!M) {
            return 2;
        }
        avz avzVar = (avz) j.get(0);
        boolean c = avzVar.c(format);
        int i2 = 8;
        if (c && avzVar.d(format)) {
            i2 = 16;
        }
        return (true != c ? 3 : 4) | i2 | 32;
    }

    @Override // defpackage.pkd, defpackage.pke
    public final String d() {
        return "MediaCodecAudioRenderer";
    }

    @Override // defpackage.awb
    protected final avv f(avz avzVar, Format format, MediaCrypto mediaCrypto, float f) {
        Format[] ar = ar();
        int as = as(avzVar, format);
        if (ar.length != 1) {
            for (Format format2 : ar) {
                if (avzVar.b(format, format2).d != 0) {
                    as = Math.max(as, as(avzVar, format2));
                }
            }
        }
        this.v = as;
        this.w = pxi.a < 24 && "OMX.SEC.aac.dec".equals(avzVar.a) && "samsung".equals(pxi.c) && (pxi.b.startsWith("zeroflte") || pxi.b.startsWith("herolte") || pxi.b.startsWith("heroqlte"));
        String str = avzVar.c;
        int i = this.v;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", format.y);
        mediaFormat.setInteger("sample-rate", format.z);
        pns.d(mediaFormat, format.n);
        pns.c(mediaFormat, "max-input-size", i);
        if (pxi.a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && (pxi.a != 23 || (!"ZTE B2017G".equals(pxi.d) && !"AXON 7 mini".equals(pxi.d)))) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (pxi.a <= 28 && "audio/ac4".equals(format.l)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (pxi.a >= 24 && this.u.a(pxi.w(4, format.y, format.z)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        Format format3 = null;
        if ("audio/raw".equals(avzVar.b) && !"audio/raw".equals(format.l)) {
            format3 = format;
        }
        this.x = format3;
        return new avv(avzVar, mediaFormat, format, null, mediaCrypto);
    }

    @Override // defpackage.awb
    protected final pmw h(avz avzVar, Format format, Format format2) {
        int i;
        int i2;
        pmw b = avzVar.b(format, format2);
        int i3 = b.e;
        if (as(avzVar, format2) > this.v) {
            i3 |= 64;
        }
        String str = avzVar.a;
        if (i3 != 0) {
            i2 = i3;
            i = 0;
        } else {
            i = b.d;
            i2 = 0;
        }
        return new pmw(str, format, format2, i, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.awb
    public final pmw i(pit pitVar) {
        pmw i = super.i(pitVar);
        this.q.g(pitVar.b, i);
        return i;
    }

    @Override // defpackage.awb
    protected final List j(awd awdVar, Format format, boolean z) {
        avz b;
        String str = format.l;
        if (str == null) {
            return Collections.emptyList();
        }
        if (!this.u.v(format) || (b = awn.b()) == null) {
            List d = awn.d(awdVar.a(str, z, false), format);
            if ("audio/eac3-joc".equals(str)) {
                ArrayList arrayList = new ArrayList(d);
                arrayList.addAll(awdVar.a("audio/eac3", z, false));
                d = arrayList;
            }
            return Collections.unmodifiableList(d);
        }
        return Collections.singletonList(b);
    }

    @Override // defpackage.pwj
    public final long jF() {
        if (this.o == 2) {
            at();
        }
        return this.y;
    }

    @Override // defpackage.pwj
    public final pjt jG() {
        return this.u.c();
    }

    @Override // defpackage.pwj
    public final void jH(pjt pjtVar) {
        this.u.p(pjtVar);
    }

    @Override // defpackage.awb
    protected final void m(Exception exc) {
        pns.e("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.q.a(exc);
    }

    @Override // defpackage.awb
    protected final void n(String str, long j, long j2) {
        this.q.c(str, j, j2);
    }

    @Override // defpackage.awb
    protected final void o(String str) {
        this.q.d(str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.awb, defpackage.phj
    public final void p() {
        this.A = true;
        try {
            this.u.f();
            try {
                super.p();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.p();
                throw th;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.awb, defpackage.phj
    public void q(boolean z, boolean z2) {
        super.q(z, z2);
        this.q.f(this.l);
        if (Z().b) {
            this.u.e();
        } else {
            this.u.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.awb, defpackage.phj
    public final void s(long j, boolean z) {
        super.s(j, z);
        this.u.f();
        this.y = j;
        this.z = true;
        this.r = true;
    }

    @Override // defpackage.awb
    protected final void u() {
        this.u.g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.awb
    public void v(pmv pmvVar) {
        if (!this.z || pmvVar.isDecodeOnly()) {
            return;
        }
        if (Math.abs(pmvVar.f - this.y) > 500000) {
            this.y = pmvVar.f;
        }
        this.z = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.awb, defpackage.phj
    public final void w() {
        try {
            super.w();
            if (!this.A) {
                return;
            }
            this.A = false;
            this.u.k();
        } catch (Throwable th) {
            if (this.A) {
                this.A = false;
                this.u.k();
            }
            throw th;
        }
    }

    @Override // defpackage.awb
    protected final void A() {
        try {
            this.u.j();
        } catch (pln e) {
            throw W(e, e.c, e.b, 5002);
        }
    }

    public pmi(Context context, awd awdVar, Handler handler, pli pliVar, plo ploVar) {
        this(context, avw.a, awdVar, handler, pliVar, ploVar);
    }

    @Override // defpackage.awb
    protected final void r(Format format, MediaFormat mediaFormat) {
        int i;
        int i2;
        Format format2 = this.x;
        int[] iArr = null;
        if (format2 != null) {
            format = format2;
        } else if (((awb) this).b != null) {
            if ("audio/raw".equals(format.l)) {
                i = format.A;
            } else if (pxi.a < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                if (mediaFormat.containsKey("v-bits-per-sample")) {
                    i = pxi.g(mediaFormat.getInteger("v-bits-per-sample"));
                } else {
                    i = "audio/raw".equals(format.l) ? format.A : 2;
                }
            } else {
                i = mediaFormat.getInteger("pcm-encoding");
            }
            pis pisVar = new pis();
            pisVar.k = "audio/raw";
            pisVar.z = i;
            pisVar.A = format.B;
            pisVar.B = format.C;
            pisVar.x = mediaFormat.getInteger("channel-count");
            pisVar.y = mediaFormat.getInteger("sample-rate");
            Format a = pisVar.a();
            if (this.w && a.y == 6 && (i2 = format.y) < 6) {
                iArr = new int[i2];
                for (int i3 = 0; i3 < format.y; i3++) {
                    iArr[i3] = i3;
                }
            }
            format = a;
        }
        try {
            this.u.w(format, iArr);
        } catch (plj e) {
            throw V(e, e.a, 5001);
        }
    }
}
