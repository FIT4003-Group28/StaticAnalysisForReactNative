package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: ptc  reason: default package */
/* loaded from: classes4.dex */
public final class ptc extends psi {
    private final ptl a;

    public ptc(List list) {
        super("DvbDecoder");
        pwu pwuVar = new pwu((byte[]) list.get(0));
        this.a = new ptl(pwuVar.m(), pwuVar.m());
    }

    @Override // defpackage.psi
    protected final psk g(byte[] bArr, int i, boolean z) {
        ptm ptmVar;
        List unmodifiableList;
        ptm ptmVar2;
        int i2;
        ptm ptmVar3;
        SparseArray sparseArray;
        int i3;
        SparseArray sparseArray2;
        int[] iArr;
        pti ptiVar;
        int i4;
        int i5;
        int i6;
        int i7;
        if (z) {
            ptk ptkVar = this.a.f;
            ptkVar.c.clear();
            ptkVar.d.clear();
            ptkVar.e.clear();
            ptkVar.f.clear();
            ptkVar.g.clear();
            ptkVar.h = null;
            ptkVar.i = null;
        }
        ptl ptlVar = this.a;
        pwt pwtVar = new pwt(bArr, i);
        while (pwtVar.a() >= 48 && pwtVar.d(8) == 15) {
            ptk ptkVar2 = ptlVar.f;
            int d = pwtVar.d(8);
            int i8 = 16;
            int d2 = pwtVar.d(16);
            int d3 = pwtVar.d(16);
            int b = pwtVar.b() + d3;
            if (d3 * 8 > pwtVar.a()) {
                Log.w("DvbParser", "Data field length exceeds limit");
                pwtVar.l(pwtVar.a());
            } else {
                switch (d) {
                    case 16:
                        if (d2 == ptkVar2.a) {
                            ptg ptgVar = ptkVar2.i;
                            int i9 = 8;
                            pwtVar.d(8);
                            int d4 = pwtVar.d(4);
                            int d5 = pwtVar.d(2);
                            pwtVar.l(2);
                            int i10 = d3 - 2;
                            SparseArray sparseArray3 = new SparseArray();
                            while (i10 > 0) {
                                int d6 = pwtVar.d(i9);
                                pwtVar.l(i9);
                                i10 -= 6;
                                sparseArray3.put(d6, new pth(pwtVar.d(16), pwtVar.d(16)));
                                i9 = 8;
                            }
                            ptg ptgVar2 = new ptg(d4, d5, sparseArray3);
                            if (ptgVar2.b != 0) {
                                ptkVar2.i = ptgVar2;
                                ptkVar2.c.clear();
                                ptkVar2.d.clear();
                                ptkVar2.e.clear();
                                break;
                            } else if (ptgVar != null && ptgVar.a != ptgVar2.a) {
                                ptkVar2.i = ptgVar2;
                                break;
                            }
                        }
                        break;
                    case 17:
                        ptg ptgVar3 = ptkVar2.i;
                        if (d2 == ptkVar2.a && ptgVar3 != null) {
                            int d7 = pwtVar.d(8);
                            pwtVar.l(4);
                            boolean n = pwtVar.n();
                            pwtVar.l(3);
                            int d8 = pwtVar.d(16);
                            int d9 = pwtVar.d(16);
                            pwtVar.d(3);
                            int d10 = pwtVar.d(3);
                            pwtVar.l(2);
                            int d11 = pwtVar.d(8);
                            int d12 = pwtVar.d(8);
                            int d13 = pwtVar.d(4);
                            int d14 = pwtVar.d(2);
                            pwtVar.l(2);
                            int i11 = d3 - 10;
                            SparseArray sparseArray4 = new SparseArray();
                            while (i11 > 0) {
                                int d15 = pwtVar.d(i8);
                                int d16 = pwtVar.d(2);
                                pwtVar.d(2);
                                int d17 = pwtVar.d(12);
                                pwtVar.l(4);
                                int d18 = pwtVar.d(12);
                                i11 -= 6;
                                if (d16 == 1 || d16 == 2) {
                                    pwtVar.d(8);
                                    pwtVar.d(8);
                                    i11 -= 2;
                                }
                                sparseArray4.put(d15, new ptj(d17, d18));
                                i8 = 16;
                            }
                            pti ptiVar2 = new pti(d7, n, d8, d9, d10, d11, d12, d13, d14, sparseArray4);
                            if (ptgVar3.b == 0 && (ptiVar = (pti) ptkVar2.c.get(ptiVar2.a)) != null) {
                                SparseArray sparseArray5 = ptiVar.j;
                                for (int i12 = 0; i12 < sparseArray5.size(); i12++) {
                                    ptiVar2.j.put(sparseArray5.keyAt(i12), (ptj) sparseArray5.valueAt(i12));
                                }
                            }
                            ptkVar2.c.put(ptiVar2.a, ptiVar2);
                            break;
                        }
                        break;
                    case 18:
                        if (d2 == ptkVar2.a) {
                            ptd a = ptl.a(pwtVar, d3);
                            ptkVar2.d.put(a.a, a);
                            break;
                        } else if (d2 == ptkVar2.b) {
                            ptd a2 = ptl.a(pwtVar, d3);
                            ptkVar2.f.put(a2.a, a2);
                            break;
                        }
                        break;
                    case 19:
                        if (d2 == ptkVar2.a) {
                            ptf b2 = ptl.b(pwtVar);
                            ptkVar2.e.put(b2.a, b2);
                            break;
                        } else if (d2 == ptkVar2.b) {
                            ptf b3 = ptl.b(pwtVar);
                            ptkVar2.g.put(b3.a, b3);
                            break;
                        }
                        break;
                    case 20:
                        if (d2 == ptkVar2.a) {
                            pwtVar.l(4);
                            boolean n2 = pwtVar.n();
                            pwtVar.l(3);
                            int d19 = pwtVar.d(16);
                            int d20 = pwtVar.d(16);
                            if (n2) {
                                int d21 = pwtVar.d(16);
                                i4 = pwtVar.d(16);
                                i7 = pwtVar.d(16);
                                i5 = pwtVar.d(16);
                                i6 = d21;
                            } else {
                                i4 = d19;
                                i5 = d20;
                                i6 = 0;
                                i7 = 0;
                            }
                            ptkVar2.h = new pte(d19, d20, i6, i4, i7, i5);
                            break;
                        }
                        break;
                }
                pwtVar.m(b - pwtVar.b());
            }
        }
        ptk ptkVar3 = ptlVar.f;
        ptg ptgVar4 = ptkVar3.i;
        if (ptgVar4 == null) {
            unmodifiableList = Collections.emptyList();
            ptmVar2 = ptmVar;
        } else {
            pte pteVar = ptkVar3.h;
            if (pteVar == null) {
                pteVar = ptlVar.d;
            }
            Bitmap bitmap = ptlVar.g;
            if (bitmap == null || pteVar.a + 1 != bitmap.getWidth() || pteVar.b + 1 != ptlVar.g.getHeight()) {
                ptlVar.g = Bitmap.createBitmap(pteVar.a + 1, pteVar.b + 1, Bitmap.Config.ARGB_8888);
                ptlVar.c.setBitmap(ptlVar.g);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray6 = ptgVar4.c;
            int i13 = 0;
            while (i13 < sparseArray6.size()) {
                ptlVar.c.save();
                pth pthVar = (pth) sparseArray6.valueAt(i13);
                pti ptiVar3 = (pti) ptlVar.f.c.get(sparseArray6.keyAt(i13));
                int i14 = pthVar.a + pteVar.c;
                int i15 = pthVar.b + pteVar.e;
                ptlVar.c.clipRect(i14, i15, Math.min(ptiVar3.c + i14, pteVar.d), Math.min(ptiVar3.d + i15, pteVar.f));
                ptd ptdVar = (ptd) ptlVar.f.d.get(ptiVar3.f);
                if (ptdVar == null && (ptdVar = (ptd) ptlVar.f.f.get(ptiVar3.f)) == null) {
                    ptdVar = ptlVar.e;
                }
                SparseArray sparseArray7 = ptiVar3.j;
                int i16 = 0;
                while (i16 < sparseArray7.size()) {
                    int keyAt = sparseArray7.keyAt(i16);
                    ptj ptjVar = (ptj) sparseArray7.valueAt(i16);
                    ptf ptfVar = (ptf) ptlVar.f.e.get(keyAt);
                    if (ptfVar == null) {
                        ptfVar = (ptf) ptlVar.f.g.get(keyAt);
                    }
                    if (ptfVar != null) {
                        Paint paint = ptfVar.b ? null : ptlVar.a;
                        int i17 = ptiVar3.e;
                        sparseArray = sparseArray6;
                        int i18 = ptjVar.a + i14;
                        int i19 = ptjVar.b + i15;
                        sparseArray2 = sparseArray7;
                        Canvas canvas = ptlVar.c;
                        ptmVar3 = ptmVar;
                        if (i17 == 3) {
                            iArr = ptdVar.d;
                        } else if (i17 == 2) {
                            iArr = ptdVar.c;
                        } else {
                            iArr = ptdVar.b;
                        }
                        i3 = i13;
                        int[] iArr2 = iArr;
                        Paint paint2 = paint;
                        ptl.c(ptfVar.c, iArr2, i17, i18, i19, paint2, canvas);
                        ptl.c(ptfVar.d, iArr2, i17, i18, i19 + 1, paint2, canvas);
                    } else {
                        ptmVar3 = ptmVar;
                        sparseArray = sparseArray6;
                        i3 = i13;
                        sparseArray2 = sparseArray7;
                    }
                    i16++;
                    sparseArray6 = sparseArray;
                    sparseArray7 = sparseArray2;
                    ptmVar = ptmVar3;
                    i13 = i3;
                }
                ptm ptmVar4 = ptmVar;
                SparseArray sparseArray8 = sparseArray6;
                int i20 = i13;
                if (ptiVar3.b) {
                    int i21 = ptiVar3.e;
                    if (i21 == 3) {
                        i2 = ptdVar.d[ptiVar3.g];
                    } else if (i21 == 2) {
                        i2 = ptdVar.c[ptiVar3.h];
                    } else {
                        i2 = ptdVar.b[ptiVar3.i];
                    }
                    ptlVar.b.setColor(i2);
                    ptlVar.c.drawRect(i14, i15, ptiVar3.c + i14, ptiVar3.d + i15, ptlVar.b);
                }
                psf psfVar = new psf();
                psfVar.b = Bitmap.createBitmap(ptlVar.g, i14, i15, ptiVar3.c, ptiVar3.d);
                psfVar.f = i14 / pteVar.a;
                psfVar.g = 0;
                psfVar.b(i15 / pteVar.b, 0);
                psfVar.e = 0;
                psfVar.h = ptiVar3.c / pteVar.a;
                psfVar.i = ptiVar3.d / pteVar.b;
                arrayList.add(psfVar.a());
                ptlVar.c.drawColor(0, PorterDuff.Mode.CLEAR);
                ptlVar.c.restore();
                i13 = i20 + 1;
                sparseArray6 = sparseArray8;
                ptmVar = ptmVar4;
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
            ptmVar2 = ptmVar;
        }
        return new ptm(unmodifiableList);
    }
}
