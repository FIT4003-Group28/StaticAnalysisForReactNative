package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
/* compiled from: PG */
/* renamed from: afgu  reason: default package */
/* loaded from: classes.dex */
public final class afgu {
    private static final int a = pcx.c("ytmp");
    private static final int b = pcx.c("mshp");
    private static final int c = pcx.c("raw ");
    private static final int d = pcx.c("dfl8");
    private static final int e = pcx.c("mesh");
    private static final int f = pcx.c("proj");
    private final List g = new ArrayList();

    static byte[] b(byte[] bArr, int i, int i2, int[] iArr) {
        boolean z;
        Inflater inflater = new Inflater(true);
        inflater.setInput(bArr, i, i2);
        int i3 = 102400;
        byte[] bArr2 = new byte[102400];
        int i4 = 0;
        do {
            try {
                i4 += inflater.inflate(bArr2, i4, i3 - i4);
                z = !inflater.needsInput();
                if (z) {
                    int length = bArr2.length;
                    int i5 = length + length;
                    byte[] bArr3 = new byte[i5];
                    System.arraycopy(bArr2, 0, bArr3, 0, length);
                    i3 = i5;
                    bArr2 = bArr3;
                    continue;
                }
            } catch (DataFormatException unused) {
                return null;
            }
        } while (z);
        iArr[0] = i4;
        return bArr2;
    }

    private static int c(int i) {
        return (-(i & 1)) ^ (i >> 1);
    }

    private static afnn d(pct pctVar, int i, int i2) {
        int i3;
        afnn afnnVar;
        int i4;
        pct pctVar2 = pctVar;
        int i5 = pctVar2.b;
        afnn afnnVar2 = new afnn(i2);
        int i6 = i;
        int i7 = 0;
        loop0: while (i5 < i6) {
            pctVar2.z(i5);
            int c2 = pctVar.c();
            if (c2 != 0) {
                if (pctVar.c() == e) {
                    if (i7 < 2) {
                        int c3 = pctVar.c();
                        if (c3 <= 10000) {
                            float[] fArr = new float[c3];
                            for (int i8 = 0; i8 < c3; i8++) {
                                fArr[i8] = Float.intBitsToFloat(pctVar.c());
                            }
                            int c4 = pctVar.c();
                            if (c4 <= 32000) {
                                double log = Math.log(2.0d);
                                double d2 = c3;
                                Double.isNaN(d2);
                                Double.isNaN(d2);
                                int ceil = (int) Math.ceil(Math.log(d2 + d2) / log);
                                pcs pcsVar = new pcs(pctVar2.a);
                                pcsVar.d(pctVar2.b * 8);
                                float[] fArr2 = new float[c4 * 5];
                                int i9 = 0;
                                int i10 = 0;
                                int i11 = 0;
                                int i12 = 0;
                                int i13 = 0;
                                int i14 = 0;
                                int i15 = 0;
                                while (true) {
                                    int i16 = i9 + 1;
                                    if (i9 < c4) {
                                        int c5 = i10 + c(pcsVar.a(ceil));
                                        int c6 = i11 + c(pcsVar.a(ceil));
                                        int c7 = i12 + c(pcsVar.a(ceil));
                                        int i17 = i5;
                                        int c8 = i13 + c(pcsVar.a(ceil));
                                        int i18 = ceil;
                                        int c9 = i14 + c(pcsVar.a(ceil));
                                        int i19 = c2;
                                        afnn afnnVar3 = afnnVar2;
                                        if (Math.max(Math.max(c5, c6), Math.max(c7, c8)) >= c3 || c9 >= c3) {
                                            break loop0;
                                        }
                                        int i20 = i15 + 1;
                                        fArr2[i15] = fArr[c5];
                                        int i21 = i20 + 1;
                                        fArr2[i20] = fArr[c6];
                                        int i22 = i21 + 1;
                                        fArr2[i21] = fArr[c7];
                                        int i23 = i22 + 1;
                                        fArr2[i22] = fArr[c8];
                                        i15 = i23 + 1;
                                        fArr2[i23] = fArr[c9];
                                        i14 = c9;
                                        c2 = i19;
                                        ceil = i18;
                                        afnnVar2 = afnnVar3;
                                        i13 = c8;
                                        i12 = c7;
                                        i10 = c5;
                                        i5 = i17;
                                        i9 = i16;
                                        i11 = c6;
                                    } else {
                                        i3 = i5;
                                        afnn afnnVar4 = afnnVar2;
                                        i4 = c2;
                                        pcsVar.d(((pcsVar.b * 8) + pcsVar.c + 7) & (-8));
                                        pcsVar.a(32);
                                        pcsVar.a(8);
                                        int a2 = pcsVar.a(8);
                                        int a3 = pcsVar.a(32);
                                        if (a3 <= 128000) {
                                            double d3 = c4;
                                            Double.isNaN(d3);
                                            Double.isNaN(d3);
                                            int ceil2 = (int) Math.ceil(Math.log(d3 + d3) / log);
                                            float[] fArr3 = new float[a3 * 3];
                                            float[] fArr4 = new float[a3 + a3];
                                            int i24 = 0;
                                            int i25 = 0;
                                            while (true) {
                                                int i26 = 4;
                                                if (i24 < a3) {
                                                    i25 += c(pcsVar.a(ceil2));
                                                    if (i25 < c4) {
                                                        int i27 = i24 * 3;
                                                        int i28 = i25 * 5;
                                                        fArr3[i27] = fArr2[i28];
                                                        fArr3[i27 + 1] = fArr2[i28 + 1];
                                                        fArr3[i27 + 2] = fArr2[i28 + 2];
                                                        int i29 = i24 + i24;
                                                        fArr4[i29] = fArr2[i28 + 3];
                                                        fArr4[i29 + 1] = fArr2[i28 + 4];
                                                        i24++;
                                                    } else {
                                                        throw new RuntimeException("Projection mesh decoder error.");
                                                    }
                                                } else {
                                                    if (a2 == 1) {
                                                        i26 = 5;
                                                    } else if (a2 == 2) {
                                                        i26 = 6;
                                                    }
                                                    afnl afnlVar = new afnl();
                                                    afnlVar.a.add(new afnm(fArr3, fArr4, i26));
                                                    afnnVar = afnnVar4;
                                                    if (i7 == 0) {
                                                        afnnVar.b = afnlVar;
                                                    } else {
                                                        afnnVar.c = afnlVar;
                                                    }
                                                    i7++;
                                                }
                                            }
                                        } else {
                                            throw new RuntimeException("Projection mesh decoder error.");
                                        }
                                    }
                                }
                                throw new RuntimeException("Projection mesh decoder error.");
                            }
                            throw new RuntimeException("Projection mesh decoder error.");
                        }
                        throw new RuntimeException("Projection mesh decoder error.");
                    }
                    throw new RuntimeException("Projection mesh decoder error.");
                }
                i3 = i5;
                afnnVar = afnnVar2;
                i4 = c2;
                i6 = i;
                afnnVar2 = afnnVar;
                i5 = i3 + i4;
                pctVar2 = pctVar;
            } else {
                throw new RuntimeException("Projection mesh decoder error.");
            }
        }
        return afnnVar2;
    }

    private final afnn e(pct pctVar, int i) {
        afnn afnnVar;
        int h = pctVar.h();
        pctVar.A(3);
        if (h != 0) {
            return null;
        }
        int c2 = pctVar.c();
        int i2 = 0;
        while (true) {
            if (i2 >= this.g.size()) {
                afnnVar = null;
                break;
            } else if (((afnn) this.g.get(i2)).a == c2) {
                afnnVar = (afnn) this.g.get(i2);
                break;
            } else {
                i2++;
            }
        }
        if (afnnVar != null) {
            return afnnVar;
        }
        int c3 = pctVar.c();
        if (c3 == c) {
            afnnVar = d(pctVar, i, c2);
        } else if (c3 == d) {
            int[] iArr = new int[1];
            byte[] bArr = pctVar.a;
            int i3 = pctVar.b;
            byte[] b2 = b(bArr, i3, i - i3, iArr);
            if (b2 == null) {
                return null;
            }
            afnnVar = d(new pct(b2, iArr[0]), iArr[0], c2);
        }
        if (afnnVar == null || afnnVar.b == null) {
            return null;
        }
        this.g.add(afnnVar);
        return afnnVar;
    }

    public final afnn a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        pct pctVar = new pct(bArr);
        try {
            int i = pctVar.b;
            pctVar.z(0);
            pctVar.A(4);
            int c2 = pctVar.c();
            pctVar.z(i);
            if (c2 == f) {
                pctVar.A(8);
                int i2 = pctVar.b;
                while (i2 < pctVar.b()) {
                    pctVar.z(i2);
                    int c3 = pctVar.c();
                    if (c3 == 0) {
                        return null;
                    }
                    int c4 = pctVar.c();
                    if (c4 != a && c4 != b) {
                        i2 += c3;
                    }
                    return e(pctVar, c3 + i2);
                }
                return null;
            }
            return e(pctVar, pctVar.b());
        } catch (RuntimeException unused) {
            return null;
        }
    }
}
