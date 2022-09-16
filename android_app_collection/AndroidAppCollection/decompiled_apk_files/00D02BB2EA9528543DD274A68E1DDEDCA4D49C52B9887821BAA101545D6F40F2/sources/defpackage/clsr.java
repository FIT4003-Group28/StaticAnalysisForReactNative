package defpackage;

import android.content.Context;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.google.android.filament.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: clsr  reason: default package */
/* loaded from: classes5.dex */
public final class clsr extends cmbb implements cmnc {
    public final clrs d;
    public boolean e;
    public clmv f;
    private final Context r;
    private final clrx s;
    private int t;
    private boolean u;
    private Format v;
    private long w;
    private boolean x;

    public clsr(Context context, cmbd cmbdVar, Handler handler, clrt clrtVar, clrx clrxVar) {
        super(1, cmbdVar, 44100.0f);
        this.r = context.getApplicationContext();
        this.s = clrxVar;
        this.d = new clrs(handler, clrtVar);
        ((clsn) clrxVar).G = new clsq(this);
    }

    private final int ap(cmaz cmazVar, Format format) {
        if (!"OMX.google.raw.decoder".equals(cmazVar.a) || cmny.a >= 24 || (cmny.a == 23 && cmny.X(this.r))) {
            return format.m;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c3, code lost:
        if (r10 != false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0223 A[Catch: Exception -> 0x023c, TRY_LEAVE, TryCatch #0 {Exception -> 0x023c, blocks: (B:77:0x01f6, B:79:0x0223), top: B:140:0x01f6 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x028f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void aq() {
        /*
            Method dump skipped, instructions count: 947
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clsr.aq():void");
    }

    @Override // defpackage.cmbb, defpackage.clls
    protected final void A() {
        try {
            super.A();
        } finally {
            this.s.g();
        }
    }

    @Override // defpackage.clol, defpackage.clon
    public final String J() {
        return "MediaCodecAudioRenderer";
    }

    @Override // defpackage.cmbb, defpackage.clol
    public final boolean L() {
        return this.s.e() || super.L();
    }

    @Override // defpackage.cmbb, defpackage.clol
    public final boolean M() {
        if (this.l) {
            clsn clsnVar = (clsn) this.s;
            if (!clsnVar.p()) {
                return true;
            }
            return clsnVar.y && !clsnVar.e();
        }
        return false;
    }

    @Override // defpackage.cmbb
    protected final int O(cmbd cmbdVar, Format format) {
        if (!cmnf.a(format.l)) {
            return 0;
        }
        int i = cmny.a >= 21 ? 32 : 0;
        Class cls = format.E;
        boolean an = an(format);
        if (an && this.s.a(format) && (cls == null || cmbo.a() != null)) {
            return i | 12;
        }
        if (("audio/raw".equals(format.l) && !this.s.a(format)) || !this.s.a(cmny.L(2, format.y, format.z))) {
            return 1;
        }
        List<cmaz> P = P(cmbdVar, format, false);
        if (P.isEmpty()) {
            return 1;
        }
        if (!an) {
            return 2;
        }
        cmaz cmazVar = P.get(0);
        boolean b = cmazVar.b(format);
        int i2 = 8;
        if (b && cmazVar.c(format)) {
            i2 = 16;
        }
        return (true != b ? 3 : 4) | i2 | i;
    }

    @Override // defpackage.cmbb
    protected final List<cmaz> P(cmbd cmbdVar, Format format, boolean z) {
        cmaz a;
        String str = format.l;
        if (str == null) {
            return Collections.emptyList();
        }
        if (!this.s.a(format) || (a = cmbo.a()) == null) {
            List<cmaz> c = cmbo.c(cmbo.b(str, z, false), format);
            if ("audio/eac3-joc".equals(str)) {
                ArrayList arrayList = new ArrayList(c);
                arrayList.addAll(cmbo.b("audio/eac3", z, false));
                c = arrayList;
            }
            return Collections.unmodifiableList(c);
        }
        return Collections.singletonList(a);
    }

    @Override // defpackage.cmbb
    protected final boolean Q(Format format) {
        return this.s.a(format);
    }

    @Override // defpackage.cmbb
    protected final void R(final String str, final long j, final long j2) {
        final clrs clrsVar = this.d;
        Handler handler = clrsVar.a;
        if (handler != null) {
            handler.post(new Runnable(clrsVar, str, j, j2) { // from class: clrj
                private final clrs a;
                private final String b;
                private final long c;
                private final long d;

                {
                    this.a = clrsVar;
                    this.b = str;
                    this.c = j;
                    this.d = j2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    clrs clrsVar2 = this.a;
                    String str2 = this.b;
                    long j3 = this.c;
                    long j4 = this.d;
                    clrt clrtVar = clrsVar2.b;
                    int i = cmny.a;
                    clrtVar.C(str2, j3, j4);
                }
            });
        }
    }

    @Override // defpackage.cmnc
    public final clod RP() {
        return ((clsn) this.s).n();
    }

    @Override // defpackage.cmbb
    protected final void S(final String str) {
        final clrs clrsVar = this.d;
        Handler handler = clrsVar.a;
        if (handler != null) {
            handler.post(new Runnable(clrsVar, str) { // from class: clrn
                private final clrs a;
                private final String b;

                {
                    this.a = clrsVar;
                    this.b = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    clrs clrsVar2 = this.a;
                    String str2 = this.b;
                    clrt clrtVar = clrsVar2.b;
                    int i = cmny.a;
                    clrtVar.G(str2);
                }
            });
        }
    }

    @Override // defpackage.cmbb
    protected final void T(clng clngVar) {
        super.T(clngVar);
        final clrs clrsVar = this.d;
        final Format format = clngVar.a;
        Handler handler = clrsVar.a;
        if (handler != null) {
            handler.post(new Runnable(clrsVar, format) { // from class: clrk
                private final clrs a;
                private final Format b;

                {
                    this.a = clrsVar;
                    this.b = format;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    clrs clrsVar2 = this.a;
                    Format format2 = this.b;
                    clrt clrtVar = clrsVar2.b;
                    int i = cmny.a;
                    clrtVar.D(format2);
                }
            });
        }
    }

    @Override // defpackage.cmbb
    protected final void V(cltg cltgVar) {
        if (!this.x || cltgVar.isDecodeOnly()) {
            return;
        }
        if (Math.abs(cltgVar.d - this.w) > 500000) {
            this.w = cltgVar.d;
        }
        this.x = false;
    }

    @Override // defpackage.cmbb
    protected final void W() {
        this.s.d();
    }

    @Override // defpackage.cmbb
    protected final void X() {
        try {
            clrx clrxVar = this.s;
            if (((clsn) clrxVar).y || !((clsn) clrxVar).p() || !((clsn) clrxVar).j()) {
                return;
            }
            ((clsn) clrxVar).u();
            ((clsn) clrxVar).y = true;
        } catch (clrw e) {
            Format format = ((cmbb) this).h;
            if (format == null) {
                format = ((cmbb) this).g;
            }
            throw F(e, format, e.a);
        }
    }

    @Override // defpackage.cmbb
    protected final void Y(cmaz cmazVar, cmbr cmbrVar, Format format, MediaCrypto mediaCrypto, float f) {
        Format[] C = C();
        int ap = ap(cmazVar, format);
        if (C.length != 1) {
            for (Format format2 : C) {
                if (cmazVar.d(format, format2) != 0) {
                    ap = Math.max(ap, ap(cmazVar, format2));
                }
            }
        }
        this.t = ap;
        this.u = cmny.a < 24 && "OMX.SEC.aac.dec".equals(cmazVar.a) && "samsung".equals(cmny.c) && (cmny.b.startsWith("zeroflte") || cmny.b.startsWith("herolte") || cmny.b.startsWith("heroqlte"));
        String str = cmazVar.c;
        int i = this.t;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", format.y);
        mediaFormat.setInteger("sample-rate", format.z);
        cmbp.a(mediaFormat, format.n);
        cmbp.b(mediaFormat, "max-input-size", i);
        if (cmny.a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && (cmny.a != 23 || (!"ZTE B2017G".equals(cmny.d) && !"AXON 7 mini".equals(cmny.d)))) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (cmny.a <= 28 && "audio/ac4".equals(format.l)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (cmny.a >= 24 && this.s.b(cmny.L(4, format.y, format.z)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        cmbrVar.f(mediaFormat, null, mediaCrypto);
        if (!"audio/raw".equals(cmazVar.b) || "audio/raw".equals(format.l)) {
            format = null;
        }
        this.v = format;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x02b5 A[Catch: clrv -> 0x05ac, clrw -> 0x05b0, TryCatch #1 {clrw -> 0x05b0, blocks: (B:14:0x0038, B:15:0x003a, B:21:0x0047, B:24:0x0052, B:27:0x005e, B:29:0x006e, B:31:0x0074, B:33:0x007a, B:35:0x0080, B:37:0x0086, B:39:0x009b, B:43:0x00d1, B:40:0x00bc, B:42:0x00cb, B:47:0x00dd, B:49:0x00e6, B:50:0x00ee, B:51:0x0109, B:53:0x0119, B:55:0x0125, B:56:0x0132, B:57:0x0159, B:59:0x0169, B:61:0x0175, B:63:0x017d, B:64:0x0185, B:66:0x01b2, B:75:0x01c4, B:77:0x01ce, B:79:0x01da, B:81:0x020d, B:83:0x021b, B:84:0x021e, B:91:0x022f, B:93:0x023e, B:95:0x0261, B:96:0x0267, B:100:0x0283, B:103:0x028b, B:106:0x0296, B:111:0x02a5, B:113:0x02b5, B:115:0x02c9, B:116:0x02d7, B:118:0x02de, B:122:0x02e9, B:125:0x02f4, B:127:0x02fd, B:129:0x0304, B:130:0x030c, B:131:0x030f, B:178:0x044e, B:179:0x0464, B:132:0x0313, B:175:0x0446, B:134:0x0332, B:136:0x0341, B:138:0x034d, B:143:0x0359, B:147:0x0374, B:139:0x034f, B:150:0x038d, B:153:0x039d, B:154:0x03a2, B:155:0x03a3, B:160:0x03b6, B:164:0x03ec, B:166:0x0406, B:161:0x03c9, B:163:0x03ea, B:162:0x03da, B:165:0x03f1, B:167:0x040a, B:169:0x041e, B:173:0x043d, B:172:0x042f, B:180:0x0465, B:182:0x046c, B:184:0x0475, B:185:0x0481, B:187:0x04ad, B:189:0x04ba, B:190:0x04df, B:192:0x04e6, B:194:0x04ef, B:198:0x0515, B:199:0x051a, B:201:0x0523, B:203:0x0547, B:202:0x0534, B:204:0x0551, B:206:0x0562, B:207:0x056e, B:211:0x058b, B:213:0x0598, B:87:0x0221, B:89:0x0225, B:90:0x022e), top: B:230:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02de A[Catch: clrv -> 0x05ac, clrw -> 0x05b0, TryCatch #1 {clrw -> 0x05b0, blocks: (B:14:0x0038, B:15:0x003a, B:21:0x0047, B:24:0x0052, B:27:0x005e, B:29:0x006e, B:31:0x0074, B:33:0x007a, B:35:0x0080, B:37:0x0086, B:39:0x009b, B:43:0x00d1, B:40:0x00bc, B:42:0x00cb, B:47:0x00dd, B:49:0x00e6, B:50:0x00ee, B:51:0x0109, B:53:0x0119, B:55:0x0125, B:56:0x0132, B:57:0x0159, B:59:0x0169, B:61:0x0175, B:63:0x017d, B:64:0x0185, B:66:0x01b2, B:75:0x01c4, B:77:0x01ce, B:79:0x01da, B:81:0x020d, B:83:0x021b, B:84:0x021e, B:91:0x022f, B:93:0x023e, B:95:0x0261, B:96:0x0267, B:100:0x0283, B:103:0x028b, B:106:0x0296, B:111:0x02a5, B:113:0x02b5, B:115:0x02c9, B:116:0x02d7, B:118:0x02de, B:122:0x02e9, B:125:0x02f4, B:127:0x02fd, B:129:0x0304, B:130:0x030c, B:131:0x030f, B:178:0x044e, B:179:0x0464, B:132:0x0313, B:175:0x0446, B:134:0x0332, B:136:0x0341, B:138:0x034d, B:143:0x0359, B:147:0x0374, B:139:0x034f, B:150:0x038d, B:153:0x039d, B:154:0x03a2, B:155:0x03a3, B:160:0x03b6, B:164:0x03ec, B:166:0x0406, B:161:0x03c9, B:163:0x03ea, B:162:0x03da, B:165:0x03f1, B:167:0x040a, B:169:0x041e, B:173:0x043d, B:172:0x042f, B:180:0x0465, B:182:0x046c, B:184:0x0475, B:185:0x0481, B:187:0x04ad, B:189:0x04ba, B:190:0x04df, B:192:0x04e6, B:194:0x04ef, B:198:0x0515, B:199:0x051a, B:201:0x0523, B:203:0x0547, B:202:0x0534, B:204:0x0551, B:206:0x0562, B:207:0x056e, B:211:0x058b, B:213:0x0598, B:87:0x0221, B:89:0x0225, B:90:0x022e), top: B:230:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0562 A[Catch: clrv -> 0x05ac, clrw -> 0x05b0, TryCatch #1 {clrw -> 0x05b0, blocks: (B:14:0x0038, B:15:0x003a, B:21:0x0047, B:24:0x0052, B:27:0x005e, B:29:0x006e, B:31:0x0074, B:33:0x007a, B:35:0x0080, B:37:0x0086, B:39:0x009b, B:43:0x00d1, B:40:0x00bc, B:42:0x00cb, B:47:0x00dd, B:49:0x00e6, B:50:0x00ee, B:51:0x0109, B:53:0x0119, B:55:0x0125, B:56:0x0132, B:57:0x0159, B:59:0x0169, B:61:0x0175, B:63:0x017d, B:64:0x0185, B:66:0x01b2, B:75:0x01c4, B:77:0x01ce, B:79:0x01da, B:81:0x020d, B:83:0x021b, B:84:0x021e, B:91:0x022f, B:93:0x023e, B:95:0x0261, B:96:0x0267, B:100:0x0283, B:103:0x028b, B:106:0x0296, B:111:0x02a5, B:113:0x02b5, B:115:0x02c9, B:116:0x02d7, B:118:0x02de, B:122:0x02e9, B:125:0x02f4, B:127:0x02fd, B:129:0x0304, B:130:0x030c, B:131:0x030f, B:178:0x044e, B:179:0x0464, B:132:0x0313, B:175:0x0446, B:134:0x0332, B:136:0x0341, B:138:0x034d, B:143:0x0359, B:147:0x0374, B:139:0x034f, B:150:0x038d, B:153:0x039d, B:154:0x03a2, B:155:0x03a3, B:160:0x03b6, B:164:0x03ec, B:166:0x0406, B:161:0x03c9, B:163:0x03ea, B:162:0x03da, B:165:0x03f1, B:167:0x040a, B:169:0x041e, B:173:0x043d, B:172:0x042f, B:180:0x0465, B:182:0x046c, B:184:0x0475, B:185:0x0481, B:187:0x04ad, B:189:0x04ba, B:190:0x04df, B:192:0x04e6, B:194:0x04ef, B:198:0x0515, B:199:0x051a, B:201:0x0523, B:203:0x0547, B:202:0x0534, B:204:0x0551, B:206:0x0562, B:207:0x056e, B:211:0x058b, B:213:0x0598, B:87:0x0221, B:89:0x0225, B:90:0x022e), top: B:230:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x056e A[Catch: clrv -> 0x05ac, clrw -> 0x05b0, TryCatch #1 {clrw -> 0x05b0, blocks: (B:14:0x0038, B:15:0x003a, B:21:0x0047, B:24:0x0052, B:27:0x005e, B:29:0x006e, B:31:0x0074, B:33:0x007a, B:35:0x0080, B:37:0x0086, B:39:0x009b, B:43:0x00d1, B:40:0x00bc, B:42:0x00cb, B:47:0x00dd, B:49:0x00e6, B:50:0x00ee, B:51:0x0109, B:53:0x0119, B:55:0x0125, B:56:0x0132, B:57:0x0159, B:59:0x0169, B:61:0x0175, B:63:0x017d, B:64:0x0185, B:66:0x01b2, B:75:0x01c4, B:77:0x01ce, B:79:0x01da, B:81:0x020d, B:83:0x021b, B:84:0x021e, B:91:0x022f, B:93:0x023e, B:95:0x0261, B:96:0x0267, B:100:0x0283, B:103:0x028b, B:106:0x0296, B:111:0x02a5, B:113:0x02b5, B:115:0x02c9, B:116:0x02d7, B:118:0x02de, B:122:0x02e9, B:125:0x02f4, B:127:0x02fd, B:129:0x0304, B:130:0x030c, B:131:0x030f, B:178:0x044e, B:179:0x0464, B:132:0x0313, B:175:0x0446, B:134:0x0332, B:136:0x0341, B:138:0x034d, B:143:0x0359, B:147:0x0374, B:139:0x034f, B:150:0x038d, B:153:0x039d, B:154:0x03a2, B:155:0x03a3, B:160:0x03b6, B:164:0x03ec, B:166:0x0406, B:161:0x03c9, B:163:0x03ea, B:162:0x03da, B:165:0x03f1, B:167:0x040a, B:169:0x041e, B:173:0x043d, B:172:0x042f, B:180:0x0465, B:182:0x046c, B:184:0x0475, B:185:0x0481, B:187:0x04ad, B:189:0x04ba, B:190:0x04df, B:192:0x04e6, B:194:0x04ef, B:198:0x0515, B:199:0x051a, B:201:0x0523, B:203:0x0547, B:202:0x0534, B:204:0x0551, B:206:0x0562, B:207:0x056e, B:211:0x058b, B:213:0x0598, B:87:0x0221, B:89:0x0225, B:90:0x022e), top: B:230:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x00e6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ce A[Catch: clrv -> 0x021f, clrw -> 0x05b0, TryCatch #0 {clrv -> 0x021f, blocks: (B:49:0x00e6, B:51:0x0109, B:53:0x0119, B:55:0x0125, B:56:0x0132, B:57:0x0159, B:59:0x0169, B:61:0x0175, B:63:0x017d, B:64:0x0185, B:66:0x01b2, B:75:0x01c4, B:77:0x01ce, B:79:0x01da, B:81:0x020d, B:83:0x021b, B:84:0x021e), top: B:229:0x00e6 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x023e A[Catch: clrv -> 0x05ac, clrw -> 0x05b0, TryCatch #1 {clrw -> 0x05b0, blocks: (B:14:0x0038, B:15:0x003a, B:21:0x0047, B:24:0x0052, B:27:0x005e, B:29:0x006e, B:31:0x0074, B:33:0x007a, B:35:0x0080, B:37:0x0086, B:39:0x009b, B:43:0x00d1, B:40:0x00bc, B:42:0x00cb, B:47:0x00dd, B:49:0x00e6, B:50:0x00ee, B:51:0x0109, B:53:0x0119, B:55:0x0125, B:56:0x0132, B:57:0x0159, B:59:0x0169, B:61:0x0175, B:63:0x017d, B:64:0x0185, B:66:0x01b2, B:75:0x01c4, B:77:0x01ce, B:79:0x01da, B:81:0x020d, B:83:0x021b, B:84:0x021e, B:91:0x022f, B:93:0x023e, B:95:0x0261, B:96:0x0267, B:100:0x0283, B:103:0x028b, B:106:0x0296, B:111:0x02a5, B:113:0x02b5, B:115:0x02c9, B:116:0x02d7, B:118:0x02de, B:122:0x02e9, B:125:0x02f4, B:127:0x02fd, B:129:0x0304, B:130:0x030c, B:131:0x030f, B:178:0x044e, B:179:0x0464, B:132:0x0313, B:175:0x0446, B:134:0x0332, B:136:0x0341, B:138:0x034d, B:143:0x0359, B:147:0x0374, B:139:0x034f, B:150:0x038d, B:153:0x039d, B:154:0x03a2, B:155:0x03a3, B:160:0x03b6, B:164:0x03ec, B:166:0x0406, B:161:0x03c9, B:163:0x03ea, B:162:0x03da, B:165:0x03f1, B:167:0x040a, B:169:0x041e, B:173:0x043d, B:172:0x042f, B:180:0x0465, B:182:0x046c, B:184:0x0475, B:185:0x0481, B:187:0x04ad, B:189:0x04ba, B:190:0x04df, B:192:0x04e6, B:194:0x04ef, B:198:0x0515, B:199:0x051a, B:201:0x0523, B:203:0x0547, B:202:0x0534, B:204:0x0551, B:206:0x0562, B:207:0x056e, B:211:0x058b, B:213:0x0598, B:87:0x0221, B:89:0x0225, B:90:0x022e), top: B:230:0x0038 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0280  */
    @Override // defpackage.cmbb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean Z(long r24, long r26, defpackage.cmbr r28, java.nio.ByteBuffer r29, int r30, int r31, int r32, long r33, boolean r35, boolean r36, com.google.android.exoplayer2.Format r37) {
        /*
            Method dump skipped, instructions count: 1512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clsr.Z(long, long, cmbr, java.nio.ByteBuffer, int, int, int, long, boolean, boolean, com.google.android.exoplayer2.Format):boolean");
    }

    @Override // defpackage.cmbb
    protected final int aa(cmaz cmazVar, Format format, Format format2) {
        if (ap(cmazVar, format2) > this.t) {
            return 0;
        }
        return cmazVar.d(format, format2);
    }

    @Override // defpackage.cmbb
    protected final float ab(float f, Format[] formatArr) {
        int i = -1;
        for (Format format : formatArr) {
            int i2 = format.z;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    @Override // defpackage.cmnc
    public final long b() {
        if (this.a == 2) {
            aq();
        }
        return this.w;
    }

    @Override // defpackage.cmnc
    public final void c(clod clodVar) {
        clsn clsnVar = (clsn) this.s;
        clsnVar.m(new clod(cmny.D(clodVar.b, 0.1f, 8.0f), cmny.D(clodVar.c, 0.1f, 8.0f)), clsnVar.k());
    }

    @Override // defpackage.clls, defpackage.clol
    public final cmnc d() {
        return this;
    }

    @Override // defpackage.clls, defpackage.cloi
    public final void t(int i, Object obj) {
        if (i == 2) {
            clrx clrxVar = this.s;
            float floatValue = ((Float) obj).floatValue();
            clsn clsnVar = (clsn) clrxVar;
            if (clsnVar.v == floatValue) {
                return;
            }
            clsnVar.v = floatValue;
            clsnVar.l();
        } else if (i == 3) {
            clrc clrcVar = (clrc) obj;
            clsn clsnVar2 = (clsn) this.s;
            if (clsnVar2.m.equals(clrcVar)) {
                return;
            }
            clsnVar2.m = clrcVar;
            if (clsnVar2.C) {
                return;
            }
            clsnVar2.f();
            clsnVar2.A = 0;
        } else if (i != 5) {
            switch (i) {
                case R.styleable.AppCompatTheme_switchStyle /* 101 */:
                    clrx clrxVar2 = this.s;
                    clsn clsnVar3 = (clsn) clrxVar2;
                    clsnVar3.m(clsnVar3.n(), ((Boolean) obj).booleanValue());
                    return;
                case 102:
                    clrx clrxVar3 = this.s;
                    int intValue = ((Integer) obj).intValue();
                    clsn clsnVar4 = (clsn) clrxVar3;
                    if (clsnVar4.A == intValue) {
                        return;
                    }
                    clsnVar4.A = intValue;
                    clsnVar4.f();
                    return;
                case R.styleable.AppCompatTheme_textAppearanceListItem /* 103 */:
                    this.f = (clmv) obj;
                    return;
                default:
                    return;
            }
        } else {
            clsb clsbVar = (clsb) obj;
            clsn clsnVar5 = (clsn) this.s;
            if (clsnVar5.B.equals(clsbVar)) {
                return;
            }
            int i2 = clsbVar.a;
            float f = clsbVar.b;
            if (clsnVar5.l != null) {
                int i3 = clsnVar5.B.a;
            }
            clsnVar5.B = clsbVar;
        }
    }

    @Override // defpackage.cmbb, defpackage.clls
    protected final void u(boolean z, boolean z2) {
        super.u(z, z2);
        final clrs clrsVar = this.d;
        final clte clteVar = this.o;
        Handler handler = clrsVar.a;
        if (handler != null) {
            handler.post(new Runnable(clrsVar, clteVar) { // from class: clri
                private final clrs a;
                private final clte b;

                {
                    this.a = clrsVar;
                    this.b = clteVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    clrs clrsVar2 = this.a;
                    clte clteVar2 = this.b;
                    clrt clrtVar = clrsVar2.b;
                    int i = cmny.a;
                    clrtVar.A(clteVar2);
                }
            });
        }
        int i = D().b;
        boolean z3 = false;
        if (i == 0) {
            clsn clsnVar = (clsn) this.s;
            if (!clsnVar.C) {
                return;
            }
            clsnVar.C = false;
            clsnVar.A = 0;
            clsnVar.f();
            return;
        }
        clrx clrxVar = this.s;
        if (cmny.a >= 21) {
            z3 = true;
        }
        cmmn.c(z3);
        clsn clsnVar2 = (clsn) clrxVar;
        if (clsnVar2.C && clsnVar2.A == i) {
            return;
        }
        clsnVar2.C = true;
        clsnVar2.A = i;
        clsnVar2.f();
    }

    @Override // defpackage.cmbb, defpackage.clls
    protected final void w(long j, boolean z) {
        super.w(j, z);
        this.s.f();
        this.w = j;
        this.x = true;
        this.e = true;
    }

    @Override // defpackage.clls
    protected final void x() {
        this.s.c();
    }

    @Override // defpackage.clls
    protected final void y() {
        aq();
        clsn clsnVar = (clsn) this.s;
        clsnVar.z = false;
        if (clsnVar.p()) {
            clsa clsaVar = clsnVar.f;
            clsaVar.c();
            if (clsaVar.w != -9223372036854775807L) {
                return;
            }
            clrz clrzVar = clsaVar.e;
            cmmn.f(clrzVar);
            clrzVar.b();
            clsnVar.l.pause();
        }
    }

    @Override // defpackage.cmbb, defpackage.clls
    protected final void z() {
        try {
            this.s.f();
            try {
                super.z();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.z();
                throw th;
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009e A[Catch: clru -> 0x01e6, TryCatch #1 {clru -> 0x01e6, blocks: (B:33:0x0092, B:35:0x009e, B:37:0x00c7, B:40:0x00cf, B:42:0x00d4, B:43:0x00d9, B:45:0x00ef, B:46:0x00f1, B:51:0x0100, B:52:0x0105, B:53:0x0106, B:61:0x0152, B:63:0x0161, B:65:0x0166, B:67:0x016b, B:68:0x0195, B:69:0x0196, B:70:0x01c0, B:54:0x0122, B:56:0x0131, B:71:0x01c1, B:72:0x01e5), top: B:79:0x0092, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0122 A[Catch: clru -> 0x01e6, TryCatch #1 {clru -> 0x01e6, blocks: (B:33:0x0092, B:35:0x009e, B:37:0x00c7, B:40:0x00cf, B:42:0x00d4, B:43:0x00d9, B:45:0x00ef, B:46:0x00f1, B:51:0x0100, B:52:0x0105, B:53:0x0106, B:61:0x0152, B:63:0x0161, B:65:0x0166, B:67:0x016b, B:68:0x0195, B:69:0x0196, B:70:0x01c0, B:54:0x0122, B:56:0x0131, B:71:0x01c1, B:72:0x01e5), top: B:79:0x0092, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0196 A[Catch: clru -> 0x01e6, TryCatch #1 {clru -> 0x01e6, blocks: (B:33:0x0092, B:35:0x009e, B:37:0x00c7, B:40:0x00cf, B:42:0x00d4, B:43:0x00d9, B:45:0x00ef, B:46:0x00f1, B:51:0x0100, B:52:0x0105, B:53:0x0106, B:61:0x0152, B:63:0x0161, B:65:0x0166, B:67:0x016b, B:68:0x0195, B:69:0x0196, B:70:0x01c0, B:54:0x0122, B:56:0x0131, B:71:0x01c1, B:72:0x01e5), top: B:79:0x0092, inners: #0 }] */
    @Override // defpackage.cmbb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void U(com.google.android.exoplayer2.Format r20, android.media.MediaFormat r21) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clsr.U(com.google.android.exoplayer2.Format, android.media.MediaFormat):void");
    }
}
