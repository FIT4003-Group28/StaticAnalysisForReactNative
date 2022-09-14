package defpackage;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;
/* compiled from: PG */
/* renamed from: cmhg  reason: default package */
/* loaded from: classes5.dex */
public final class cmhg extends cmfy {
    private final cmnk f = new cmnk();
    private final cmnk g = new cmnk();
    private final cmhf h = new cmhf();
    private Inflater i;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.cmfy
    protected final cmga m(byte[] bArr, int i, boolean z) {
        ArrayList arrayList;
        cmfw cmfwVar;
        cmnk cmnkVar;
        int i2;
        int i3;
        int o;
        cmhg cmhgVar = this;
        cmhgVar.f.c(bArr, i);
        cmnk cmnkVar2 = cmhgVar.f;
        if (cmnkVar2.d() > 0 && cmnkVar2.k() == 120) {
            if (cmhgVar.i == null) {
                cmhgVar.i = new Inflater();
            }
            if (cmny.W(cmnkVar2, cmhgVar.g, cmhgVar.i)) {
                cmnk cmnkVar3 = cmhgVar.g;
                cmnkVar2.c(cmnkVar3.a, cmnkVar3.c);
            }
        }
        cmhgVar.h.a();
        ArrayList arrayList2 = new ArrayList();
        while (cmhgVar.f.d() >= 3) {
            cmnk cmnkVar4 = cmhgVar.f;
            cmhf cmhfVar = cmhgVar.h;
            int i4 = cmnkVar4.c;
            int l = cmnkVar4.l();
            int m = cmnkVar4.m();
            int i5 = cmnkVar4.b + m;
            if (i5 > i4) {
                cmnkVar4.f(i4);
                arrayList = arrayList2;
                cmfwVar = null;
            } else {
                if (l == 128) {
                    arrayList = arrayList2;
                    if (cmhfVar.d == 0 || cmhfVar.e == 0 || cmhfVar.h == 0 || cmhfVar.i == 0 || (i2 = (cmnkVar = cmhfVar.a).c) == 0 || cmnkVar.b != i2 || !cmhfVar.c) {
                        cmfwVar = null;
                    } else {
                        cmnkVar.f(0);
                        int i6 = cmhfVar.h * cmhfVar.i;
                        int[] iArr = new int[i6];
                        int i7 = 0;
                        while (i7 < i6) {
                            int l2 = cmhfVar.a.l();
                            if (l2 != 0) {
                                i3 = i7 + 1;
                                iArr[i7] = cmhfVar.b[l2];
                            } else {
                                int l3 = cmhfVar.a.l();
                                if (l3 != 0) {
                                    i3 = ((l3 & 64) == 0 ? l3 & 63 : ((l3 & 63) << 8) | cmhfVar.a.l()) + i7;
                                    Arrays.fill(iArr, i7, i3, (l3 & 128) == 0 ? 0 : cmhfVar.b[cmhfVar.a.l()]);
                                }
                            }
                            i7 = i3;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr, cmhfVar.h, cmhfVar.i, Bitmap.Config.ARGB_8888);
                        cmfv cmfvVar = new cmfv();
                        cmfvVar.b = createBitmap;
                        cmfvVar.e = cmhfVar.f / cmhfVar.d;
                        cmfvVar.f = 0;
                        cmfvVar.b(cmhfVar.g / cmhfVar.e, 0);
                        cmfvVar.d = 0;
                        cmfvVar.i = cmhfVar.h / cmhfVar.d;
                        cmfvVar.j = cmhfVar.i / cmhfVar.e;
                        cmfwVar = cmfvVar.a();
                    }
                    cmhfVar.a();
                } else {
                    switch (l) {
                        case 20:
                            if (m % 5 == 2) {
                                cmnkVar4.h(2);
                                Arrays.fill(cmhfVar.b, 0);
                                int i8 = 0;
                                for (int i9 = m / 5; i8 < i9; i9 = i9) {
                                    int l4 = cmnkVar4.l();
                                    int l5 = cmnkVar4.l();
                                    int l6 = cmnkVar4.l();
                                    int l7 = cmnkVar4.l();
                                    int l8 = cmnkVar4.l();
                                    double d = l5;
                                    double d2 = l6 - 128;
                                    double d3 = l7 - 128;
                                    int[] iArr2 = cmhfVar.b;
                                    Double.isNaN(d2);
                                    Double.isNaN(d);
                                    int B = cmny.B((int) (d + (1.402d * d2)), 0, 255) << 16;
                                    Double.isNaN(d3);
                                    Double.isNaN(d);
                                    Double.isNaN(d2);
                                    Double.isNaN(d3);
                                    Double.isNaN(d);
                                    iArr2[l4] = B | (l8 << 24) | (cmny.B((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255) << 8) | cmny.B((int) (d + (d3 * 1.772d)), 0, 255);
                                    i8++;
                                    arrayList2 = arrayList2;
                                }
                                arrayList = arrayList2;
                                cmhfVar.c = true;
                                break;
                            }
                            arrayList = arrayList2;
                            break;
                        case 21:
                            if (m >= 4) {
                                cmnkVar4.h(3);
                                int i10 = m - 4;
                                if ((cmnkVar4.l() & 128) != 0) {
                                    if (i10 >= 7 && (o = cmnkVar4.o()) >= 4) {
                                        cmhfVar.h = cmnkVar4.m();
                                        cmhfVar.i = cmnkVar4.m();
                                        cmhfVar.a.a(o - 4);
                                        i10 -= 7;
                                    }
                                }
                                cmnk cmnkVar5 = cmhfVar.a;
                                int i11 = cmnkVar5.b;
                                int i12 = cmnkVar5.c;
                                if (i11 < i12 && i10 > 0) {
                                    int min = Math.min(i10, i12 - i11);
                                    cmnkVar4.j(cmhfVar.a.a, i11, min);
                                    cmhfVar.a.f(i11 + min);
                                }
                            }
                            arrayList = arrayList2;
                            break;
                        case 22:
                            if (m >= 19) {
                                cmhfVar.d = cmnkVar4.m();
                                cmhfVar.e = cmnkVar4.m();
                                cmnkVar4.h(11);
                                cmhfVar.f = cmnkVar4.m();
                                cmhfVar.g = cmnkVar4.m();
                            }
                            arrayList = arrayList2;
                            break;
                        default:
                            arrayList = arrayList2;
                            break;
                    }
                    cmfwVar = null;
                }
                cmnkVar4.f(i5);
            }
            if (cmfwVar != null) {
                ArrayList arrayList3 = arrayList;
                arrayList3.add(cmfwVar);
                arrayList2 = arrayList3;
                cmhgVar = this;
            } else {
                cmhgVar = this;
                arrayList2 = arrayList;
            }
        }
        return new cmhh(Collections.unmodifiableList(arrayList2));
    }
}
