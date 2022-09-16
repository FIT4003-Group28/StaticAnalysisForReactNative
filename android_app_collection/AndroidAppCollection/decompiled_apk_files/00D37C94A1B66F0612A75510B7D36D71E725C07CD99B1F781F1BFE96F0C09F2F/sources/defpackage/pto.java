package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
import org.chromium.net.PrivateKeyType;
/* compiled from: PG */
/* renamed from: pto  reason: default package */
/* loaded from: classes4.dex */
public final class pto extends psi {
    private final pwu a;
    private final pwu b;
    private final ptn c;
    private Inflater d;

    public pto() {
        super("PgsDecoder");
        this.a = new pwu();
        this.b = new pwu();
        this.c = new ptn();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.psi
    protected final psk g(byte[] bArr, int i, boolean z) {
        ArrayList arrayList;
        psg psgVar;
        pwu pwuVar;
        int i2;
        int i3;
        int k;
        pto ptoVar = this;
        ptoVar.a.E(bArr, i);
        pwu pwuVar2 = ptoVar.a;
        if (pwuVar2.a() > 0 && pwuVar2.c() == 120) {
            if (ptoVar.d == null) {
                ptoVar.d = new Inflater();
            }
            if (pxi.N(pwuVar2, ptoVar.b, ptoVar.d)) {
                pwu pwuVar3 = ptoVar.b;
                pwuVar2.E(pwuVar3.a, pwuVar3.c);
            }
        }
        ptoVar.c.a();
        ArrayList arrayList2 = new ArrayList();
        while (ptoVar.a.a() >= 3) {
            pwu pwuVar4 = ptoVar.a;
            ptn ptnVar = ptoVar.c;
            int i4 = pwuVar4.c;
            int i5 = pwuVar4.i();
            int m = pwuVar4.m();
            int i6 = pwuVar4.b + m;
            if (i6 > i4) {
                pwuVar4.G(i4);
                arrayList = arrayList2;
                psgVar = null;
            } else {
                if (i5 == 128) {
                    arrayList = arrayList2;
                    if (ptnVar.d == 0 || ptnVar.e == 0 || ptnVar.h == 0 || ptnVar.i == 0 || (i2 = (pwuVar = ptnVar.a).c) == 0 || pwuVar.b != i2 || !ptnVar.c) {
                        psgVar = null;
                    } else {
                        pwuVar.G(0);
                        int i7 = ptnVar.h * ptnVar.i;
                        int[] iArr = new int[i7];
                        int i8 = 0;
                        while (i8 < i7) {
                            int i9 = ptnVar.a.i();
                            if (i9 != 0) {
                                i3 = i8 + 1;
                                iArr[i8] = ptnVar.b[i9];
                            } else {
                                int i10 = ptnVar.a.i();
                                if (i10 != 0) {
                                    i3 = ((i10 & 64) == 0 ? i10 & 63 : ((i10 & 63) << 8) | ptnVar.a.i()) + i8;
                                    Arrays.fill(iArr, i8, i3, (i10 & 128) == 0 ? 0 : ptnVar.b[ptnVar.a.i()]);
                                }
                            }
                            i8 = i3;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr, ptnVar.h, ptnVar.i, Bitmap.Config.ARGB_8888);
                        psf psfVar = new psf();
                        psfVar.b = createBitmap;
                        psfVar.f = ptnVar.f / ptnVar.d;
                        psfVar.g = 0;
                        psfVar.b(ptnVar.g / ptnVar.e, 0);
                        psfVar.e = 0;
                        psfVar.h = ptnVar.h / ptnVar.d;
                        psfVar.i = ptnVar.i / ptnVar.e;
                        psgVar = psfVar.a();
                    }
                    ptnVar.a();
                } else {
                    switch (i5) {
                        case 20:
                            if (m % 5 == 2) {
                                pwuVar4.H(2);
                                Arrays.fill(ptnVar.b, 0);
                                int i11 = 0;
                                for (int i12 = m / 5; i11 < i12; i12 = i12) {
                                    int i13 = pwuVar4.i();
                                    int i14 = pwuVar4.i();
                                    int i15 = pwuVar4.i();
                                    int i16 = pwuVar4.i();
                                    int i17 = pwuVar4.i();
                                    double d = i14;
                                    double d2 = i15 - 128;
                                    double d3 = i16 - 128;
                                    int[] iArr2 = ptnVar.b;
                                    Double.isNaN(d2);
                                    Double.isNaN(d);
                                    int c = pxi.c((int) (d + (1.402d * d2)), 0, PrivateKeyType.INVALID) << 16;
                                    Double.isNaN(d3);
                                    Double.isNaN(d);
                                    Double.isNaN(d2);
                                    Double.isNaN(d3);
                                    Double.isNaN(d);
                                    iArr2[i13] = c | (i17 << 24) | (pxi.c((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, PrivateKeyType.INVALID) << 8) | pxi.c((int) (d + (d3 * 1.772d)), 0, PrivateKeyType.INVALID);
                                    i11++;
                                    arrayList2 = arrayList2;
                                }
                                arrayList = arrayList2;
                                ptnVar.c = true;
                                break;
                            }
                            arrayList = arrayList2;
                            break;
                        case 21:
                            if (m >= 4) {
                                pwuVar4.H(3);
                                int i18 = m - 4;
                                if ((pwuVar4.i() & 128) != 0) {
                                    if (i18 >= 7 && (k = pwuVar4.k()) >= 4) {
                                        ptnVar.h = pwuVar4.m();
                                        ptnVar.i = pwuVar4.m();
                                        ptnVar.a.C(k - 4);
                                        i18 -= 7;
                                    }
                                }
                                pwu pwuVar5 = ptnVar.a;
                                int i19 = pwuVar5.b;
                                int i20 = pwuVar5.c;
                                if (i19 < i20 && i18 > 0) {
                                    int min = Math.min(i18, i20 - i19);
                                    pwuVar4.B(ptnVar.a.a, i19, min);
                                    ptnVar.a.G(i19 + min);
                                }
                            }
                            arrayList = arrayList2;
                            break;
                        case 22:
                            if (m >= 19) {
                                ptnVar.d = pwuVar4.m();
                                ptnVar.e = pwuVar4.m();
                                pwuVar4.H(11);
                                ptnVar.f = pwuVar4.m();
                                ptnVar.g = pwuVar4.m();
                            }
                            arrayList = arrayList2;
                            break;
                        default:
                            arrayList = arrayList2;
                            break;
                    }
                    psgVar = null;
                }
                pwuVar4.G(i6);
            }
            if (psgVar != null) {
                ArrayList arrayList3 = arrayList;
                arrayList3.add(psgVar);
                arrayList2 = arrayList3;
                ptoVar = this;
            } else {
                ptoVar = this;
                arrayList2 = arrayList;
            }
        }
        return new ptm(Collections.unmodifiableList(arrayList2), 2);
    }
}
