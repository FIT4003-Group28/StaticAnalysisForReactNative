package defpackage;

import android.graphics.Color;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: amoa  reason: default package */
/* loaded from: classes.dex */
public class amoa {
    private static final int[] a = new int[0];
    protected final Map<List<Long>, Integer> b;
    public final List<alxp> c;
    protected int d;
    public int e;
    public final float f;
    public final amny g;
    private final Set<alxp> h;
    private final float[] i;

    public amoa(float f, int i) {
        this(f, i, false);
    }

    public final int c(alxp alxpVar) {
        Integer num = this.b.get(alxpVar.g());
        if (num == null) {
            int i = this.d;
            this.d = i + 1;
            num = Integer.valueOf(i);
            d(num.intValue(), alxpVar);
        }
        return num.intValue();
    }

    public final void d(int i, alxp alxpVar) {
        this.b.put(alxpVar.g(), Integer.valueOf(i));
        while (i >= this.c.size()) {
            this.c.add(null);
        }
        this.c.set(i, alxpVar);
    }

    public final byte[] e() {
        int i;
        amnw amnwVar;
        alxo alxoVar;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        amoa amoaVar = this;
        if (!amoaVar.c.isEmpty()) {
            int f = f();
            byte[] bArr = new byte[f * 128];
            amnv amnvVar = new amnv(amoaVar, bArr, f - (amoaVar.c.size() * 5));
            amnw amnwVar2 = new amnw(amoaVar);
            int i8 = 0;
            while (i8 < amoaVar.c.size()) {
                alxp alxpVar = amoaVar.c.get(i8);
                alxo c = alxpVar.c(amoaVar.e);
                int c2 = amoaVar.g.c(c);
                int i9 = 0;
                while (true) {
                    int i10 = 255;
                    float f2 = 1.0f;
                    i = 4;
                    if (i9 >= 4) {
                        break;
                    }
                    if (i9 < c2) {
                        int[] iArr = amoaVar.g.b(c, i9).d;
                        if (iArr != null) {
                            int i11 = 0;
                            for (int i12 : iArr) {
                                i11 += i12;
                            }
                            i7 = i11;
                        } else {
                            i7 = 0;
                        }
                        if (i7 != 0) {
                            float f3 = i7;
                            f2 = 1.0f / (f3 + f3);
                        }
                    }
                    int i13 = 0;
                    int i14 = 0;
                    while (i13 < 4) {
                        float f4 = f2 * 255.0f;
                        int min = Math.min(i10, (int) f4);
                        f2 = f4 - min;
                        i14 = (i14 << 8) | min;
                        i13++;
                        i10 = 255;
                    }
                    amnvVar.a(i14);
                    amnvVar.e = 0;
                    amnvVar.d.d();
                    i9++;
                }
                int max = Math.max(0, amoaVar.e);
                int i15 = alxpVar.i(max) + max;
                int i16 = 0;
                while (i16 < i) {
                    int i17 = max + i16;
                    if (i17 >= i15) {
                        i17 = i15 - 1;
                    }
                    alxo c3 = alxpVar.c(Math.max(0, i17));
                    int c4 = amoaVar.g.c(c3);
                    int i18 = 0;
                    while (i18 < i) {
                        if (i18 >= c4) {
                            int i19 = i17 + 1;
                            while (true) {
                                if (i19 >= i) {
                                    i5 = 0;
                                    break;
                                }
                                alxo c5 = alxpVar.c(Math.max(0, i19 >= i15 ? i15 - 1 : i19));
                                if (i18 < amoaVar.g.c(c5)) {
                                    i5 = amoaVar.g.b(c5, i18).a;
                                    break;
                                }
                                i19++;
                                i = 4;
                            }
                        } else {
                            i5 = amoaVar.g.b(c3, i18).a;
                        }
                        if (amoaVar.h.contains(alxpVar)) {
                            Color.colorToHSV(i5, amoaVar.i);
                            float[] fArr = amoaVar.i;
                            i6 = i15;
                            fArr[2] = Math.min(1.0f, fArr[2] * 1.5f);
                            i5 = Color.HSVToColor(amoaVar.i);
                        } else {
                            i6 = i15;
                        }
                        int i20 = (i5 >>> 24) | (i5 << 8);
                        amnvVar.d.a(i20);
                        amnvVar.a(i20);
                        i18++;
                        i15 = i6;
                        i = 4;
                    }
                    int i21 = i15;
                    int[] iArr2 = amnwVar2.b;
                    char c6 = 0;
                    iArr2[0] = 0;
                    char c7 = 1;
                    iArr2[1] = 0;
                    int i22 = 0;
                    int i23 = 4;
                    while (i22 < i23) {
                        int[] iArr3 = amnwVar2.b;
                        iArr3[c6] = iArr3[c6] << 8;
                        iArr3[c7] = iArr3[c7] << 8;
                        int min2 = i22 < c4 ? (int) Math.min(65535.0d, Math.floor((amnwVar2.a.g.b(c3, i22).c / 255.0f) * 65535.0f)) : 0;
                        int[] iArr4 = amnwVar2.b;
                        iArr4[0] = (min2 / 256) | iArr4[0];
                        iArr4[1] = (min2 % 256) | iArr4[1];
                        i22++;
                        c7 = 1;
                        i23 = 4;
                        c6 = 0;
                    }
                    int[] iArr5 = amnwVar2.b;
                    for (int i24 = 0; i24 < 2; i24++) {
                        amnvVar.a(iArr5[i24]);
                    }
                    i16++;
                    i15 = i21;
                    i = 4;
                }
                for (int i25 = 0; i25 < 4; i25++) {
                    amnvVar.a(0);
                }
                alxo c8 = alxpVar.c(max);
                int c9 = amoaVar.g.c(c8);
                int i26 = 0;
                for (int i27 = 4; i26 < i27; i27 = 4) {
                    int[] iArr6 = i26 < c9 ? amoaVar.g.b(c8, i26).d : a;
                    byte[] bArr2 = new byte[32];
                    if (iArr6 == null || iArr6.length == 0) {
                        amnwVar = amnwVar2;
                        alxoVar = c8;
                        i2 = c9;
                        i3 = 32;
                        Arrays.fill(bArr2, 0, 32, (byte) -1);
                    } else {
                        int i28 = 0;
                        for (int i29 : iArr6) {
                            i28 += i29;
                        }
                        float f5 = 8.0f / amnvVar.f.f;
                        int i30 = 0;
                        int i31 = 32;
                        while (i30 < i31) {
                            dbsk.b(true, "Invalid texel index");
                            int length = iArr6.length;
                            if ((length & 1) == 1) {
                                length += length;
                                i4 = i28 + i28;
                            } else {
                                i4 = i28;
                            }
                            float f6 = (i30 * i4) / 32.0f;
                            amnw amnwVar3 = amnwVar2;
                            int i32 = 0;
                            int i33 = 0;
                            boolean z = true;
                            while (i32 < length) {
                                alxo alxoVar2 = c8;
                                int i34 = iArr6[i32 % iArr6.length] + i33;
                                int i35 = c9;
                                float f7 = i34;
                                if (f6 <= f7) {
                                    float f8 = f6 - i33;
                                    float f9 = f7 - f6;
                                    bArr2[i30] = (byte) Math.round(((f8 <= f5 || f9 <= f5) ? ((Math.min(f8, f9) / f5) * (true != z ? -0.5f : 0.5f)) + 0.5f : z ? 1.0f : 0.0f) * 255.0f);
                                    i30++;
                                    i31 = 32;
                                    amnwVar2 = amnwVar3;
                                    c8 = alxoVar2;
                                    c9 = i35;
                                } else {
                                    z = !z;
                                    i32++;
                                    i33 = i34;
                                    c8 = alxoVar2;
                                    c9 = i35;
                                }
                            }
                            throw new IllegalStateException("Couldn't find dash");
                        }
                        amnwVar = amnwVar2;
                        alxoVar = c8;
                        i2 = c9;
                        i3 = 32;
                    }
                    int b = amnvVar.d.b(amnvVar.e);
                    int i36 = 0;
                    while (i36 < i3) {
                        amnvVar.a(((bArr2[i36] & 255) * (b & 255)) / 255);
                        i36++;
                        i3 = 32;
                    }
                    amnvVar.e++;
                    i26++;
                    amoaVar = this;
                    amnwVar2 = amnwVar;
                    c8 = alxoVar;
                    c9 = i2;
                }
                i8++;
                amoaVar = this;
            }
            for (int i37 = 0; i37 < amnvVar.c; i37++) {
                for (int i38 = 0; i38 < 32; i38++) {
                    amnvVar.a(0);
                }
            }
            amnvVar.b = 0;
            return bArr;
        }
        return null;
    }

    public final int f() {
        int i = this.d;
        if (i == 0) {
            i = this.c.size();
        }
        return bvop.f(i * 5, 1);
    }

    public final alxl g(alxo alxoVar, int i) {
        return this.g.b(alxoVar, i);
    }

    public final int h(alxo alxoVar) {
        return this.g.c(alxoVar);
    }

    public amoa(float f, int i, boolean z) {
        this.b = dcjz.d();
        this.c = dchl.a();
        this.d = 0;
        this.h = dcnm.c();
        this.i = new float[3];
        this.f = f;
        this.e = i;
        this.g = z ? new amnu() : new amnx();
    }
}
