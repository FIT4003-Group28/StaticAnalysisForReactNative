package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.exoplayer2.Format;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cmbb  reason: default package */
/* loaded from: classes5.dex */
public abstract class cmbb extends clls {
    private static final byte[] d = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    private MediaCrypto A;
    private boolean B;
    private Format C;
    private boolean D;
    private float E;
    private ArrayDeque<cmaz> F;
    private cmba G;
    private int H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private boolean N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private cmax S;
    private long T;
    private int U;
    private int V;
    private ByteBuffer W;
    private boolean X;
    private boolean Y;
    private boolean Z;
    private boolean aa;
    private boolean ab;
    private int ac;
    private int ad;
    private int ae;
    private boolean af;
    private boolean ag;
    private boolean ah;
    private long ai;
    private long aj;
    private boolean ak;
    private boolean al;
    private long am;
    private int an;
    private cltv ao;
    private cltv ap;
    private final cmbd e;
    private final float f;
    public Format g;
    public Format h;
    public float i;
    public MediaFormat j;
    public cmaz k;
    public boolean l;
    public boolean m;
    public cllz n;
    protected clte o;
    public long p;
    public cmbr q;
    private final cltg r;
    private final cltg s;
    private final cmaw t;
    private final cmnu<Format> u;
    private final ArrayList<Long> v;
    private final MediaCodec.BufferInfo w;
    private final long[] x;
    private final long[] y;
    private final long[] z;

    public cmbb(int i, cmbd cmbdVar, float f) {
        super(i);
        cmmn.f(cmbdVar);
        this.e = cmbdVar;
        this.f = f;
        this.r = new cltg(0);
        this.s = new cltg(0);
        this.u = new cmnu<>();
        this.v = new ArrayList<>();
        this.w = new MediaCodec.BufferInfo();
        this.i = 1.0f;
        this.x = new long[10];
        this.y = new long[10];
        this.z = new long[10];
        this.am = -9223372036854775807L;
        this.p = -9223372036854775807L;
        this.t = new cmaw();
        aj();
    }

    private final void aA() {
        try {
            MediaCrypto mediaCrypto = this.A;
            byte[] bArr = aB(this.ap).b;
            mediaCrypto.setMediaDrmSession(null);
            this.ao = this.ap;
            this.ad = 0;
            this.ae = 0;
        } catch (MediaCryptoException e) {
            throw E(e, this.g);
        }
    }

    private final cltw aB(cltv cltvVar) {
        return null;
    }

    private static final boolean aC(Format format) {
        try {
            MediaCrypto mediaCrypto = new MediaCrypto(null, null);
            try {
                return mediaCrypto.requiresSecureDecoderComponent(format.l);
            } finally {
                mediaCrypto.release();
            }
        } catch (MediaCryptoException unused) {
            return true;
        }
    }

    private final boolean aD() {
        if (cmny.a < 23) {
            return false;
        }
        float ab = ab(this.i, C());
        float f = this.E;
        if (f == ab) {
            return false;
        }
        if (ab == -1.0f) {
            ax();
            return true;
        } else if (f == -1.0f && ab <= this.f) {
            return false;
        } else {
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", ab);
            this.q.d(bundle);
            this.E = ab;
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean an(Format format) {
        Class cls = format.E;
        return cls == null || cltw.class.equals(cls);
    }

    private final void ap() {
        this.aa = false;
        this.t.clear();
        this.Z = false;
    }

    private final void aq() {
        try {
            this.q.a.flush();
        } finally {
            ai();
        }
    }

    private final boolean ar(boolean z) {
        clng B = B();
        this.s.clear();
        int G = G(B, this.s, z);
        if (G == -5) {
            T(B);
            return true;
        } else if (G != -4 || !this.s.isEndOfStream()) {
            return false;
        } else {
            this.ak = true;
            ay();
            return false;
        }
    }

    private final boolean as() {
        return this.V >= 0;
    }

    private final void at() {
        this.U = -1;
        this.r.b = null;
    }

    private final void au() {
        this.V = -1;
        this.W = null;
    }

    private final boolean av() {
        long j;
        ByteBuffer byteBuffer;
        cmbr cmbrVar = this.q;
        if (cmbrVar == null || this.ad == 2 || this.ak) {
            return false;
        }
        if (this.U < 0) {
            int dequeueInputBuffer = cmbrVar.a.dequeueInputBuffer(0L);
            this.U = dequeueInputBuffer;
            if (dequeueInputBuffer < 0) {
                return false;
            }
            cltg cltgVar = this.r;
            cmbr cmbrVar2 = this.q;
            if (cmny.a >= 21) {
                byteBuffer = cmbrVar2.a.getInputBuffer(dequeueInputBuffer);
            } else {
                byteBuffer = ((ByteBuffer[]) cmny.c(cmbrVar2.b))[dequeueInputBuffer];
            }
            cltgVar.b = byteBuffer;
            this.r.clear();
        }
        if (this.ad == 1) {
            if (!this.R) {
                this.ag = true;
                this.q.g(this.U, 0, 0L, 4);
                at();
            }
            this.ad = 2;
            return false;
        } else if (this.P) {
            this.P = false;
            this.r.b.put(d);
            this.q.g(this.U, 38, 0L, 0);
            at();
            this.af = true;
            return true;
        } else {
            if (this.ac == 1) {
                for (int i = 0; i < this.C.n.size(); i++) {
                    this.r.b.put(this.C.n.get(i));
                }
                this.ac = 2;
            }
            int position = this.r.b.position();
            clng B = B();
            int G = G(B, this.r, false);
            if (j()) {
                this.aj = this.ai;
            }
            if (G == -3) {
                return false;
            }
            if (G == -5) {
                if (this.ac == 2) {
                    this.r.clear();
                    this.ac = 1;
                }
                T(B);
                return true;
            } else if (!this.r.isEndOfStream()) {
                if (this.af || this.r.isKeyFrame()) {
                    boolean c = this.r.c();
                    if (c) {
                        cltc cltcVar = this.r.a;
                        if (position != 0) {
                            if (cltcVar.b == null) {
                                cltcVar.b = new int[1];
                                cltcVar.d.numBytesOfClearData = cltcVar.b;
                            }
                            int[] iArr = cltcVar.b;
                            iArr[0] = iArr[0] + position;
                        }
                    }
                    if (this.I && !c) {
                        ByteBuffer byteBuffer2 = this.r.b;
                        byte[] bArr = cmni.a;
                        int position2 = byteBuffer2.position();
                        int i2 = 0;
                        int i3 = 0;
                        while (true) {
                            int i4 = i2 + 1;
                            if (i4 < position2) {
                                int i5 = byteBuffer2.get(i2) & 255;
                                if (i3 == 3) {
                                    if (i5 == 1) {
                                        if ((byteBuffer2.get(i4) & 31) == 7) {
                                            ByteBuffer duplicate = byteBuffer2.duplicate();
                                            duplicate.position(i2 - 3);
                                            duplicate.limit(position2);
                                            byteBuffer2.position(0);
                                            byteBuffer2.put(duplicate);
                                            break;
                                        }
                                        i5 = 1;
                                    }
                                } else if (i5 == 0) {
                                    i3++;
                                }
                                if (i5 != 0) {
                                    i3 = 0;
                                }
                                i2 = i4;
                            } else {
                                byteBuffer2.clear();
                                break;
                            }
                        }
                        if (this.r.b.position() == 0) {
                            return true;
                        }
                        this.I = false;
                    }
                    cltg cltgVar2 = this.r;
                    long j2 = cltgVar2.d;
                    cmax cmaxVar = this.S;
                    if (cmaxVar != null) {
                        Format format = this.g;
                        if (!cmaxVar.c) {
                            ByteBuffer byteBuffer3 = cltgVar2.b;
                            cmmn.f(byteBuffer3);
                            int i6 = 0;
                            for (int i7 = 0; i7 < 4; i7++) {
                                i6 = (i6 << 8) | (byteBuffer3.get(i7) & 255);
                            }
                            int b = clst.b(i6);
                            if (b == -1) {
                                cmaxVar.c = true;
                                j = cltgVar2.d;
                            } else {
                                long j3 = cmaxVar.a;
                                if (j3 == 0) {
                                    j = cltgVar2.d;
                                    cmaxVar.b = j;
                                    cmaxVar.a = b - 529;
                                } else {
                                    cmaxVar.a = j3 + b;
                                    j2 = cmaxVar.b + ((1000000 * j3) / format.z);
                                }
                            }
                            j2 = j;
                        }
                    }
                    if (this.r.isDecodeOnly()) {
                        this.v.add(Long.valueOf(j2));
                    }
                    if (this.al) {
                        this.u.a(j2, this.g);
                        this.al = false;
                    }
                    if (this.S != null) {
                        this.ai = Math.max(this.ai, this.r.d);
                    } else {
                        this.ai = Math.max(this.ai, j2);
                    }
                    this.r.d();
                    if (this.r.hasSupplementalData()) {
                        al(this.r);
                    }
                    V(this.r);
                    try {
                        if (c) {
                            this.q.a.queueSecureInputBuffer(this.U, 0, this.r.a.d, j2, 0);
                        } else {
                            this.q.g(this.U, this.r.b.limit(), j2, 0);
                        }
                        at();
                        this.af = true;
                        this.ac = 0;
                        this.o.c++;
                        return true;
                    } catch (MediaCodec.CryptoException e) {
                        throw E(e, this.g);
                    }
                } else {
                    this.r.clear();
                    if (this.ac == 2) {
                        this.ac = 1;
                    }
                    return true;
                }
            } else {
                if (this.ac == 2) {
                    this.r.clear();
                    this.ac = 1;
                }
                this.ak = true;
                if (!this.af) {
                    ay();
                    return false;
                }
                try {
                    if (!this.R) {
                        this.ag = true;
                        this.q.g(this.U, 0, 0L, 4);
                        at();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e2) {
                    throw E(e2, this.g);
                }
            }
        }
    }

    private final void aw() {
        if (!this.af) {
            aA();
            return;
        }
        this.ad = 1;
        this.ae = (this.J || this.L) ? 3 : 2;
    }

    private final void ax() {
        if (!this.af) {
            az();
            return;
        }
        this.ad = 1;
        this.ae = 3;
    }

    private final void az() {
        ag();
        ac();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.clls
    public void A() {
        try {
            ap();
            ag();
        } finally {
            this.ap = null;
        }
    }

    @Override // defpackage.clls, defpackage.clol
    public void I(float f) {
        this.i = f;
        if (this.q == null || this.ae == 3 || this.a == 0) {
            return;
        }
        aD();
    }

    /* JADX WARN: Removed duplicated region for block: B:223:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0388  */
    @Override // defpackage.clol
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K(long r22, long r24) {
        /*
            Method dump skipped, instructions count: 939
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmbb.K(long, long):void");
    }

    @Override // defpackage.clol
    public boolean M() {
        return this.l;
    }

    @Override // defpackage.clon
    public final int N(Format format) {
        try {
            return O(this.e, format);
        } catch (cmbj e) {
            throw E(e, format);
        }
    }

    protected abstract int O(cmbd cmbdVar, Format format);

    protected abstract List<cmaz> P(cmbd cmbdVar, Format format, boolean z);

    protected boolean Q(Format format) {
        return false;
    }

    protected void R(String str, long j, long j2) {
        throw null;
    }

    protected void S(String str) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b2, code lost:
        if (r1.r == r5.r) goto L60;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void T(defpackage.clng r8) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmbb.T(clng):void");
    }

    protected void U(Format format, MediaFormat mediaFormat) {
        throw null;
    }

    protected void V(cltg cltgVar) {
        throw null;
    }

    protected void W() {
    }

    protected void X() {
    }

    protected abstract void Y(cmaz cmazVar, cmbr cmbrVar, Format format, MediaCrypto mediaCrypto, float f);

    protected abstract boolean Z(long j, long j2, cmbr cmbrVar, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, Format format);

    protected int aa(cmaz cmazVar, Format format, Format format2) {
        throw null;
    }

    protected float ab(float f, Format[] formatArr) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02ab A[Catch: Exception -> 0x03f5, TryCatch #3 {Exception -> 0x03f5, blocks: (B:65:0x0135, B:69:0x014a, B:85:0x01b4, B:88:0x01c8, B:90:0x01ce, B:92:0x01d8, B:94:0x01e2, B:96:0x01ec, B:115:0x0239, B:117:0x0241, B:119:0x0249, B:123:0x0254, B:125:0x025e, B:127:0x0262, B:129:0x026a, B:131:0x0272, B:133:0x0276, B:135:0x0280, B:137:0x0288, B:142:0x0292, B:144:0x029a, B:148:0x02a5, B:150:0x02ab, B:166:0x02e0, B:168:0x02e6, B:172:0x02f1, B:174:0x02f7, B:176:0x02ff, B:178:0x0309, B:180:0x0313, B:182:0x031d, B:184:0x0327, B:186:0x0331, B:188:0x033b, B:192:0x0348, B:194:0x0350, B:196:0x0354, B:200:0x035f, B:202:0x0367, B:227:0x03b5, B:229:0x03c1, B:230:0x03c8, B:232:0x03cd, B:233:0x03d6, B:206:0x0372, B:208:0x0378, B:210:0x0380, B:212:0x0384, B:214:0x038c, B:216:0x0394, B:218:0x039e, B:220:0x03a8, B:223:0x03ad, B:154:0x02b6, B:156:0x02ba, B:158:0x02c4, B:160:0x02ce, B:162:0x02d6, B:99:0x01f8, B:101:0x01fe, B:103:0x0206, B:105:0x020e, B:107:0x0218, B:109:0x0222, B:111:0x022c, B:242:0x03f1, B:243:0x03f4, B:68:0x0140), top: B:275:0x0135, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02e6 A[Catch: Exception -> 0x03f5, TryCatch #3 {Exception -> 0x03f5, blocks: (B:65:0x0135, B:69:0x014a, B:85:0x01b4, B:88:0x01c8, B:90:0x01ce, B:92:0x01d8, B:94:0x01e2, B:96:0x01ec, B:115:0x0239, B:117:0x0241, B:119:0x0249, B:123:0x0254, B:125:0x025e, B:127:0x0262, B:129:0x026a, B:131:0x0272, B:133:0x0276, B:135:0x0280, B:137:0x0288, B:142:0x0292, B:144:0x029a, B:148:0x02a5, B:150:0x02ab, B:166:0x02e0, B:168:0x02e6, B:172:0x02f1, B:174:0x02f7, B:176:0x02ff, B:178:0x0309, B:180:0x0313, B:182:0x031d, B:184:0x0327, B:186:0x0331, B:188:0x033b, B:192:0x0348, B:194:0x0350, B:196:0x0354, B:200:0x035f, B:202:0x0367, B:227:0x03b5, B:229:0x03c1, B:230:0x03c8, B:232:0x03cd, B:233:0x03d6, B:206:0x0372, B:208:0x0378, B:210:0x0380, B:212:0x0384, B:214:0x038c, B:216:0x0394, B:218:0x039e, B:220:0x03a8, B:223:0x03ad, B:154:0x02b6, B:156:0x02ba, B:158:0x02c4, B:160:0x02ce, B:162:0x02d6, B:99:0x01f8, B:101:0x01fe, B:103:0x0206, B:105:0x020e, B:107:0x0218, B:109:0x0222, B:111:0x022c, B:242:0x03f1, B:243:0x03f4, B:68:0x0140), top: B:275:0x0135, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02f7 A[Catch: Exception -> 0x03f5, TryCatch #3 {Exception -> 0x03f5, blocks: (B:65:0x0135, B:69:0x014a, B:85:0x01b4, B:88:0x01c8, B:90:0x01ce, B:92:0x01d8, B:94:0x01e2, B:96:0x01ec, B:115:0x0239, B:117:0x0241, B:119:0x0249, B:123:0x0254, B:125:0x025e, B:127:0x0262, B:129:0x026a, B:131:0x0272, B:133:0x0276, B:135:0x0280, B:137:0x0288, B:142:0x0292, B:144:0x029a, B:148:0x02a5, B:150:0x02ab, B:166:0x02e0, B:168:0x02e6, B:172:0x02f1, B:174:0x02f7, B:176:0x02ff, B:178:0x0309, B:180:0x0313, B:182:0x031d, B:184:0x0327, B:186:0x0331, B:188:0x033b, B:192:0x0348, B:194:0x0350, B:196:0x0354, B:200:0x035f, B:202:0x0367, B:227:0x03b5, B:229:0x03c1, B:230:0x03c8, B:232:0x03cd, B:233:0x03d6, B:206:0x0372, B:208:0x0378, B:210:0x0380, B:212:0x0384, B:214:0x038c, B:216:0x0394, B:218:0x039e, B:220:0x03a8, B:223:0x03ad, B:154:0x02b6, B:156:0x02ba, B:158:0x02c4, B:160:0x02ce, B:162:0x02d6, B:99:0x01f8, B:101:0x01fe, B:103:0x0206, B:105:0x020e, B:107:0x0218, B:109:0x0222, B:111:0x022c, B:242:0x03f1, B:243:0x03f4, B:68:0x0140), top: B:275:0x0135, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0350 A[Catch: Exception -> 0x03f5, TryCatch #3 {Exception -> 0x03f5, blocks: (B:65:0x0135, B:69:0x014a, B:85:0x01b4, B:88:0x01c8, B:90:0x01ce, B:92:0x01d8, B:94:0x01e2, B:96:0x01ec, B:115:0x0239, B:117:0x0241, B:119:0x0249, B:123:0x0254, B:125:0x025e, B:127:0x0262, B:129:0x026a, B:131:0x0272, B:133:0x0276, B:135:0x0280, B:137:0x0288, B:142:0x0292, B:144:0x029a, B:148:0x02a5, B:150:0x02ab, B:166:0x02e0, B:168:0x02e6, B:172:0x02f1, B:174:0x02f7, B:176:0x02ff, B:178:0x0309, B:180:0x0313, B:182:0x031d, B:184:0x0327, B:186:0x0331, B:188:0x033b, B:192:0x0348, B:194:0x0350, B:196:0x0354, B:200:0x035f, B:202:0x0367, B:227:0x03b5, B:229:0x03c1, B:230:0x03c8, B:232:0x03cd, B:233:0x03d6, B:206:0x0372, B:208:0x0378, B:210:0x0380, B:212:0x0384, B:214:0x038c, B:216:0x0394, B:218:0x039e, B:220:0x03a8, B:223:0x03ad, B:154:0x02b6, B:156:0x02ba, B:158:0x02c4, B:160:0x02ce, B:162:0x02d6, B:99:0x01f8, B:101:0x01fe, B:103:0x0206, B:105:0x020e, B:107:0x0218, B:109:0x0222, B:111:0x022c, B:242:0x03f1, B:243:0x03f4, B:68:0x0140), top: B:275:0x0135, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0367 A[Catch: Exception -> 0x03f5, TryCatch #3 {Exception -> 0x03f5, blocks: (B:65:0x0135, B:69:0x014a, B:85:0x01b4, B:88:0x01c8, B:90:0x01ce, B:92:0x01d8, B:94:0x01e2, B:96:0x01ec, B:115:0x0239, B:117:0x0241, B:119:0x0249, B:123:0x0254, B:125:0x025e, B:127:0x0262, B:129:0x026a, B:131:0x0272, B:133:0x0276, B:135:0x0280, B:137:0x0288, B:142:0x0292, B:144:0x029a, B:148:0x02a5, B:150:0x02ab, B:166:0x02e0, B:168:0x02e6, B:172:0x02f1, B:174:0x02f7, B:176:0x02ff, B:178:0x0309, B:180:0x0313, B:182:0x031d, B:184:0x0327, B:186:0x0331, B:188:0x033b, B:192:0x0348, B:194:0x0350, B:196:0x0354, B:200:0x035f, B:202:0x0367, B:227:0x03b5, B:229:0x03c1, B:230:0x03c8, B:232:0x03cd, B:233:0x03d6, B:206:0x0372, B:208:0x0378, B:210:0x0380, B:212:0x0384, B:214:0x038c, B:216:0x0394, B:218:0x039e, B:220:0x03a8, B:223:0x03ad, B:154:0x02b6, B:156:0x02ba, B:158:0x02c4, B:160:0x02ce, B:162:0x02d6, B:99:0x01f8, B:101:0x01fe, B:103:0x0206, B:105:0x020e, B:107:0x0218, B:109:0x0222, B:111:0x022c, B:242:0x03f1, B:243:0x03f4, B:68:0x0140), top: B:275:0x0135, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0378 A[Catch: Exception -> 0x03f5, TryCatch #3 {Exception -> 0x03f5, blocks: (B:65:0x0135, B:69:0x014a, B:85:0x01b4, B:88:0x01c8, B:90:0x01ce, B:92:0x01d8, B:94:0x01e2, B:96:0x01ec, B:115:0x0239, B:117:0x0241, B:119:0x0249, B:123:0x0254, B:125:0x025e, B:127:0x0262, B:129:0x026a, B:131:0x0272, B:133:0x0276, B:135:0x0280, B:137:0x0288, B:142:0x0292, B:144:0x029a, B:148:0x02a5, B:150:0x02ab, B:166:0x02e0, B:168:0x02e6, B:172:0x02f1, B:174:0x02f7, B:176:0x02ff, B:178:0x0309, B:180:0x0313, B:182:0x031d, B:184:0x0327, B:186:0x0331, B:188:0x033b, B:192:0x0348, B:194:0x0350, B:196:0x0354, B:200:0x035f, B:202:0x0367, B:227:0x03b5, B:229:0x03c1, B:230:0x03c8, B:232:0x03cd, B:233:0x03d6, B:206:0x0372, B:208:0x0378, B:210:0x0380, B:212:0x0384, B:214:0x038c, B:216:0x0394, B:218:0x039e, B:220:0x03a8, B:223:0x03ad, B:154:0x02b6, B:156:0x02ba, B:158:0x02c4, B:160:0x02ce, B:162:0x02d6, B:99:0x01f8, B:101:0x01fe, B:103:0x0206, B:105:0x020e, B:107:0x0218, B:109:0x0222, B:111:0x022c, B:242:0x03f1, B:243:0x03f4, B:68:0x0140), top: B:275:0x0135, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03c1 A[Catch: Exception -> 0x03f5, TryCatch #3 {Exception -> 0x03f5, blocks: (B:65:0x0135, B:69:0x014a, B:85:0x01b4, B:88:0x01c8, B:90:0x01ce, B:92:0x01d8, B:94:0x01e2, B:96:0x01ec, B:115:0x0239, B:117:0x0241, B:119:0x0249, B:123:0x0254, B:125:0x025e, B:127:0x0262, B:129:0x026a, B:131:0x0272, B:133:0x0276, B:135:0x0280, B:137:0x0288, B:142:0x0292, B:144:0x029a, B:148:0x02a5, B:150:0x02ab, B:166:0x02e0, B:168:0x02e6, B:172:0x02f1, B:174:0x02f7, B:176:0x02ff, B:178:0x0309, B:180:0x0313, B:182:0x031d, B:184:0x0327, B:186:0x0331, B:188:0x033b, B:192:0x0348, B:194:0x0350, B:196:0x0354, B:200:0x035f, B:202:0x0367, B:227:0x03b5, B:229:0x03c1, B:230:0x03c8, B:232:0x03cd, B:233:0x03d6, B:206:0x0372, B:208:0x0378, B:210:0x0380, B:212:0x0384, B:214:0x038c, B:216:0x0394, B:218:0x039e, B:220:0x03a8, B:223:0x03ad, B:154:0x02b6, B:156:0x02ba, B:158:0x02c4, B:160:0x02ce, B:162:0x02d6, B:99:0x01f8, B:101:0x01fe, B:103:0x0206, B:105:0x020e, B:107:0x0218, B:109:0x0222, B:111:0x022c, B:242:0x03f1, B:243:0x03f4, B:68:0x0140), top: B:275:0x0135, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03cd A[Catch: Exception -> 0x03f5, TryCatch #3 {Exception -> 0x03f5, blocks: (B:65:0x0135, B:69:0x014a, B:85:0x01b4, B:88:0x01c8, B:90:0x01ce, B:92:0x01d8, B:94:0x01e2, B:96:0x01ec, B:115:0x0239, B:117:0x0241, B:119:0x0249, B:123:0x0254, B:125:0x025e, B:127:0x0262, B:129:0x026a, B:131:0x0272, B:133:0x0276, B:135:0x0280, B:137:0x0288, B:142:0x0292, B:144:0x029a, B:148:0x02a5, B:150:0x02ab, B:166:0x02e0, B:168:0x02e6, B:172:0x02f1, B:174:0x02f7, B:176:0x02ff, B:178:0x0309, B:180:0x0313, B:182:0x031d, B:184:0x0327, B:186:0x0331, B:188:0x033b, B:192:0x0348, B:194:0x0350, B:196:0x0354, B:200:0x035f, B:202:0x0367, B:227:0x03b5, B:229:0x03c1, B:230:0x03c8, B:232:0x03cd, B:233:0x03d6, B:206:0x0372, B:208:0x0378, B:210:0x0380, B:212:0x0384, B:214:0x038c, B:216:0x0394, B:218:0x039e, B:220:0x03a8, B:223:0x03ad, B:154:0x02b6, B:156:0x02ba, B:158:0x02c4, B:160:0x02ce, B:162:0x02d6, B:99:0x01f8, B:101:0x01fe, B:103:0x0206, B:105:0x020e, B:107:0x0218, B:109:0x0222, B:111:0x022c, B:242:0x03f1, B:243:0x03f4, B:68:0x0140), top: B:275:0x0135, outer: #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ac() {
        /*
            Method dump skipped, instructions count: 1209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmbb.ac():void");
    }

    protected boolean ad(cmaz cmazVar) {
        return true;
    }

    protected boolean ae() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void af(long j) {
        Format e = this.u.e(j);
        if (e == null && this.D) {
            e = this.u.d();
        }
        if (e != null) {
            this.h = e;
        } else if (!this.D || this.h == null) {
            return;
        }
        U(this.h, this.j);
        this.D = false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Type inference failed for: r0v0, types: [cltv, android.media.MediaCrypto] */
    public final void ag() {
        try {
            cmbr cmbrVar = this.q;
            if (cmbrVar != null) {
                cmbrVar.c();
                this.o.b++;
                S(this.k.a);
            }
            this.q = null;
            try {
                MediaCrypto mediaCrypto = this.A;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.q = null;
            try {
                MediaCrypto mediaCrypto2 = this.A;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    protected final boolean ah() {
        if (this.q == null) {
            return false;
        }
        if (this.ae != 3 && !this.J && ((!this.K || this.ah) && (!this.L || !this.ag))) {
            aq();
            return false;
        }
        ag();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void ai() {
        at();
        au();
        this.T = -9223372036854775807L;
        this.ag = false;
        this.af = false;
        this.P = false;
        this.Q = false;
        this.X = false;
        this.Y = false;
        this.v.clear();
        this.ai = -9223372036854775807L;
        this.aj = -9223372036854775807L;
        cmax cmaxVar = this.S;
        if (cmaxVar != null) {
            cmaxVar.a = 0L;
            cmaxVar.b = 0L;
            cmaxVar.c = false;
        }
        this.ad = 0;
        this.ae = 0;
        this.ac = this.ab ? 1 : 0;
    }

    protected final void aj() {
        ai();
        this.n = null;
        this.S = null;
        this.F = null;
        this.k = null;
        this.C = null;
        this.j = null;
        this.D = false;
        this.ah = false;
        this.E = -1.0f;
        this.H = 0;
        this.I = false;
        this.J = false;
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = false;
        this.R = false;
        this.ab = false;
        this.ac = 0;
        this.B = false;
    }

    protected cmay ak(Throwable th, cmaz cmazVar) {
        return new cmay(th, cmazVar);
    }

    protected void al(cltg cltgVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void am(long j) {
        while (true) {
            int i = this.an;
            if (i == 0 || j < this.z[0]) {
                return;
            }
            long[] jArr = this.x;
            this.am = jArr[0];
            this.p = this.y[0];
            int i2 = i - 1;
            this.an = i2;
            System.arraycopy(jArr, 1, jArr, 0, i2);
            long[] jArr2 = this.y;
            System.arraycopy(jArr2, 1, jArr2, 0, this.an);
            long[] jArr3 = this.z;
            System.arraycopy(jArr3, 1, jArr3, 0, this.an);
            W();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ao() {
        if (ah()) {
            ac();
        }
    }

    @Override // defpackage.clls, defpackage.clon
    public final int s() {
        return 8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.clls
    public void u(boolean z, boolean z2) {
        this.o = new clte();
    }

    @Override // defpackage.clls
    protected final void v(Format[] formatArr, long j, long j2) {
        boolean z = true;
        if (this.p == -9223372036854775807L) {
            if (this.am != -9223372036854775807L) {
                z = false;
            }
            cmmn.c(z);
            this.am = j;
            this.p = j2;
            return;
        }
        int i = this.an;
        if (i == 10) {
            long j3 = this.y[9];
            StringBuilder sb = new StringBuilder(65);
            sb.append("Too many stream changes, so dropping offset: ");
            sb.append(j3);
            sb.toString();
        } else {
            this.an = i + 1;
        }
        long[] jArr = this.x;
        int i2 = this.an - 1;
        jArr[i2] = j;
        this.y[i2] = j2;
        this.z[i2] = this.ai;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.clls
    public void w(long j, boolean z) {
        this.ak = false;
        this.l = false;
        this.m = false;
        if (this.Z) {
            this.t.f();
        } else {
            ao();
        }
        if (this.u.c() > 0) {
            this.al = true;
        }
        this.u.b();
        int i = this.an;
        if (i != 0) {
            int i2 = i - 1;
            this.p = this.y[i2];
            this.am = this.x[i2];
            this.an = 0;
        }
    }

    @Override // defpackage.clol
    public boolean L() {
        boolean a;
        if (this.g != null) {
            if (j()) {
                a = this.c;
            } else {
                cmfk cmfkVar = this.b;
                cmmn.f(cmfkVar);
                a = cmfkVar.a();
            }
            if (a || as()) {
                return true;
            }
            if (this.T != -9223372036854775807L && SystemClock.elapsedRealtime() < this.T) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.clls
    public void z() {
        this.g = null;
        this.am = -9223372036854775807L;
        this.p = -9223372036854775807L;
        this.an = 0;
        if (this.ap != null || this.ao != null) {
            A();
        } else {
            ah();
        }
    }

    private final void ay() {
        int i = this.ae;
        if (i == 1) {
            aq();
        } else if (i == 2) {
            aq();
            aA();
        } else if (i == 3) {
            az();
        } else {
            this.l = true;
            X();
        }
    }
}
