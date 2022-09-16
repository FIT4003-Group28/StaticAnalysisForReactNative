package defpackage;

import com.youtube.libraries.bandwidth.BandwidthSampleGenerator;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.Iterator;
import org.tensorflow.lite.Tensor;
import org.tensorflow.lite.TensorFlowLite;
/* compiled from: PG */
/* renamed from: aeqh  reason: default package */
/* loaded from: classes.dex */
public final class aeqh implements aepy {
    public final String a;
    public final aeqt b;
    public long h;
    private final aadd m;
    private final afhj n;
    private final acrr o;
    private final ByteBuffer p;
    private float r;
    private int s;
    private bamh t;
    public int i = -1;
    public int j = -1;
    public int k = -1;
    public int l = -1;
    public final ArrayDeque d = new ArrayDeque();
    public final ArrayDeque e = new ArrayDeque();
    public final ArrayDeque f = new ArrayDeque();
    public final ArrayDeque g = new ArrayDeque();
    private final agc q = new agc(3);

    public aeqh(aadd aaddVar, afhj afhjVar, acrr acrrVar, ByteBuffer byteBuffer, String str, aeqt aeqtVar) {
        this.m = aaddVar;
        this.n = afhjVar;
        this.o = acrrVar;
        this.p = byteBuffer;
        this.a = str;
        this.b = aeqtVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(int i, acrr acrrVar) {
        aopa createBuilder = avgf.a.createBuilder();
        createBuilder.copyOnWrite();
        avgf avgfVar = (avgf) createBuilder.instance;
        avgfVar.d = i - 1;
        avgfVar.b |= 2;
        createBuilder.copyOnWrite();
        avgf avgfVar2 = (avgf) createBuilder.instance;
        avgfVar2.c = 1;
        avgfVar2.b = 1 | avgfVar2.b;
        arrf a = arrh.a();
        a.copyOnWrite();
        ((arrh) a.instance).dI((avgf) createBuilder.mo39build());
        acrrVar.c((arrh) a.mo39build());
    }

    private static float[][] e(ArrayDeque arrayDeque, int i) {
        float[][] fArr = (float[][]) Array.newInstance(float.class, 1, i);
        Iterator it = arrayDeque.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            fArr[0][i2] = ((Float) it.next()).floatValue();
            i2++;
        }
        return fArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final BandwidthSampleGenerator a(String str) {
        if (this.q.c(str) == null) {
            BandwidthSampleGenerator create = BandwidthSampleGenerator.create(this.r, this.s, new aeqg(this));
            if (create != null) {
                this.q.d(str, create);
            }
        }
        return (BandwidthSampleGenerator) this.q.c(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f2 A[Catch: IllegalArgumentException -> 0x043d, TryCatch #0 {IllegalArgumentException -> 0x043d, blocks: (B:37:0x00a6, B:41:0x00b6, B:52:0x00db, B:54:0x00ea, B:56:0x00f2, B:57:0x00f5, B:44:0x00c2, B:47:0x00c7, B:58:0x00fa, B:60:0x0101, B:62:0x0109, B:129:0x028d, B:65:0x0113, B:66:0x011a, B:67:0x011b, B:69:0x0122, B:71:0x012d, B:74:0x0140, B:76:0x0144, B:78:0x014d, B:80:0x0157, B:81:0x015e, B:82:0x0167, B:84:0x016b, B:86:0x0174, B:88:0x017e, B:89:0x0185, B:90:0x0192, B:92:0x0196, B:94:0x019f, B:96:0x01a9, B:97:0x01b0, B:98:0x01bd, B:100:0x01c1, B:102:0x01ca, B:104:0x01d4, B:105:0x01db, B:106:0x01e8, B:108:0x01ec, B:110:0x01f5, B:112:0x01ff, B:113:0x0206, B:114:0x0213, B:115:0x0237, B:116:0x0238, B:117:0x0259, B:72:0x0132, B:118:0x025a, B:120:0x0266, B:122:0x026d, B:124:0x0272, B:125:0x0278, B:127:0x0282, B:128:0x0288, B:130:0x0291, B:131:0x02b4, B:132:0x02b5, B:135:0x02c9, B:137:0x02ce, B:139:0x02d2, B:140:0x02d5, B:141:0x02d8, B:142:0x02e0, B:144:0x02e6, B:146:0x02f2, B:148:0x0306, B:151:0x030f, B:152:0x0316, B:153:0x0317, B:155:0x031e, B:157:0x0329, B:160:0x033c, B:162:0x0340, B:163:0x034a, B:165:0x034e, B:166:0x035c, B:168:0x0360, B:169:0x036f, B:171:0x0373, B:172:0x0382, B:174:0x0386, B:175:0x0395, B:176:0x03b9, B:177:0x03ba, B:178:0x03dc, B:158:0x032e, B:179:0x03dd, B:181:0x03e9, B:182:0x03f0, B:183:0x0414, B:184:0x0415, B:191:0x0435, B:192:0x043c), top: B:195:0x00a6 }] */
    @Override // defpackage.aepy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float b() {
        /*
            Method dump skipped, instructions count: 1116
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeqh.b():float");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        atdy atdyVar = this.m.a().i;
        if (atdyVar == null) {
            atdyVar = atdy.a;
        }
        apmv apmvVar = atdyVar.e;
        if (apmvVar == null) {
            apmvVar = apmv.a;
        }
        if ((apmvVar.b & 16) != 0 && this.p.capacity() != 0) {
            try {
                this.n.a();
                TensorFlowLite.a();
                apmw apmwVar = apmvVar.e;
                if (apmwVar == null) {
                    apmwVar = apmw.a;
                }
                this.r = apmwVar.d;
                this.s = apmwVar.e;
                try {
                    bamh bamhVar = new bamh(this.p.order(ByteOrder.nativeOrder()));
                    this.t = bamhVar;
                    acrr acrrVar = this.o;
                    bamhVar.c();
                    if (bamhVar.a.d.length == 1) {
                        bamhVar.c();
                        if (bamhVar.a.b(0).b.length == 1) {
                            int a = bamhVar.a();
                            int i = 0;
                            boolean z = false;
                            while (true) {
                                char c = 65535;
                                if (i < a) {
                                    Tensor b = bamhVar.b(i);
                                    String d = b.d();
                                    switch (d.hashCode()) {
                                        case 94224491:
                                            if (d.equals("bytes")) {
                                                c = 1;
                                                break;
                                            }
                                            break;
                                        case 174449897:
                                            if (d.equals("onesie_seconds")) {
                                                c = 4;
                                                break;
                                            }
                                            break;
                                        case 1500729522:
                                            if (d.equals("samples_since_last_onesie_sample")) {
                                                c = 0;
                                                break;
                                            }
                                            break;
                                        case 1525800736:
                                            if (d.equals("head_seconds")) {
                                                c = 3;
                                                break;
                                            }
                                            break;
                                        case 1970096767:
                                            if (d.equals("seconds")) {
                                                c = 2;
                                                break;
                                            }
                                            break;
                                    }
                                    if (c == 0) {
                                        int i2 = b.c;
                                        int[] iArr = bamg.a;
                                        if (i2 == 0) {
                                            throw null;
                                        }
                                        if (i2 != 4) {
                                            d(7, acrrVar);
                                        } else {
                                            z = true;
                                            i++;
                                        }
                                    } else if (c == 1) {
                                        int i3 = b.c;
                                        int[] iArr2 = bamg.a;
                                        if (i3 == 0) {
                                            throw null;
                                        }
                                        if (i3 == 1) {
                                            this.i = b.c();
                                            i++;
                                        } else {
                                            d(7, acrrVar);
                                        }
                                    } else if (c == 2) {
                                        int i4 = b.c;
                                        int[] iArr3 = bamg.a;
                                        if (i4 == 0) {
                                            throw null;
                                        }
                                        if (i4 == 1) {
                                            this.j = b.c();
                                            i++;
                                        } else {
                                            d(7, acrrVar);
                                        }
                                    } else if (c != 3) {
                                        if (c == 4) {
                                            int i5 = b.c;
                                            int[] iArr4 = bamg.a;
                                            if (i5 == 0) {
                                                throw null;
                                            }
                                            if (i5 == 1) {
                                                this.l = b.c();
                                            } else {
                                                d(7, acrrVar);
                                            }
                                        } else {
                                            d(9, acrrVar);
                                        }
                                        i++;
                                    } else {
                                        int i6 = b.c;
                                        int[] iArr5 = bamg.a;
                                        if (i6 == 0) {
                                            throw null;
                                        }
                                        if (i6 == 1) {
                                            this.k = b.c();
                                            i++;
                                        } else {
                                            d(7, acrrVar);
                                        }
                                    }
                                } else if (z || this.i != -1 || this.j != -1 || this.k != -1 || this.l != -1) {
                                    try {
                                        bamh bamhVar2 = this.t;
                                        bamhVar2.c();
                                        bamhVar2.a.c();
                                        return true;
                                    } catch (IllegalStateException unused) {
                                        d(6, this.o);
                                        return false;
                                    }
                                } else {
                                    d(8, acrrVar);
                                }
                            }
                            return false;
                        }
                    }
                    d(7, acrrVar);
                    return false;
                } catch (IllegalArgumentException unused2) {
                    d(5, this.o);
                    return false;
                }
            } catch (UnsatisfiedLinkError unused3) {
                d(15, this.o);
            }
        }
        return false;
    }

    @Override // defpackage.aepy
    public final void f(float f) {
    }

    @Override // defpackage.aepy
    public final void g() {
        String str = this.a;
        if (str == null) {
            return;
        }
        aeqt aeqtVar = this.b;
        aeqs aeqsVar = null;
        if (aeqtVar.b()) {
            synchronized (aeqtVar) {
                aeqs aeqsVar2 = (aeqs) aeqtVar.b.get();
                if (str.equals(aeqsVar2.g)) {
                    aeqsVar = aeqs.a(aeqsVar2);
                }
            }
        }
        if (aeqsVar == null) {
            return;
        }
        Iterator it = aeqsVar.b.iterator();
        while (it.hasNext()) {
            float floatValue = ((Float) it.next()).floatValue();
            if (this.f.size() >= this.k && !this.f.isEmpty()) {
                this.f.removeFirst();
            }
            this.f.addLast(Float.valueOf(floatValue));
        }
        Iterator it2 = aeqsVar.e.iterator();
        while (it2.hasNext()) {
            float floatValue2 = ((Float) it2.next()).floatValue();
            if (this.g.size() >= this.l && !this.g.isEmpty()) {
                this.g.removeFirst();
            }
            this.g.addLast(Float.valueOf(floatValue2));
        }
        Iterator it3 = aeqsVar.d.iterator();
        while (it3.hasNext()) {
            float floatValue3 = ((Float) it3.next()).floatValue();
            if (this.d.size() >= this.i && !this.d.isEmpty()) {
                this.d.removeFirst();
            }
            this.d.addLast(Float.valueOf(floatValue3));
        }
        Iterator it4 = aeqsVar.c.iterator();
        while (it4.hasNext()) {
            float floatValue4 = ((Float) it4.next()).floatValue();
            if (this.e.size() >= this.j && !this.e.isEmpty()) {
                this.e.removeFirst();
            }
            this.e.addLast(Float.valueOf(floatValue4));
        }
        this.h = aeqsVar.f;
    }

    @Override // defpackage.aepy
    public final void h() {
    }

    @Override // defpackage.aepy
    public final boolean i() {
        return true;
    }

    @Override // defpackage.aepy
    public final int j() {
        return 6;
    }
}
