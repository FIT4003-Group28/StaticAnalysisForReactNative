package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cmgu  reason: default package */
/* loaded from: classes5.dex */
public final class cmgu extends cmfy {
    private final cmhd f;

    public cmgu(List<byte[]> list) {
        cmnk cmnkVar = new cmnk(list.get(0));
        this.f = new cmhd(cmnkVar.m(), cmnkVar.m());
    }

    @Override // defpackage.cmfy
    protected final cmga m(byte[] bArr, int i, boolean z) {
        cmhe cmheVar;
        List unmodifiableList;
        cmhe cmheVar2;
        int i2;
        cmhe cmheVar3;
        SparseArray<cmgz> sparseArray;
        int i3;
        SparseArray<cmhb> sparseArray2;
        int[] iArr;
        cmha cmhaVar;
        int i4;
        int i5;
        int i6;
        int i7;
        if (z) {
            cmhc cmhcVar = this.f.f;
            cmhcVar.c.clear();
            cmhcVar.d.clear();
            cmhcVar.e.clear();
            cmhcVar.f.clear();
            cmhcVar.g.clear();
            cmhcVar.h = null;
            cmhcVar.i = null;
        }
        cmhd cmhdVar = this.f;
        cmnj cmnjVar = new cmnj(bArr, i);
        while (cmnjVar.c() >= 48 && cmnjVar.j(8) == 15) {
            cmhc cmhcVar2 = cmhdVar.f;
            int j = cmnjVar.j(8);
            int i8 = 16;
            int j2 = cmnjVar.j(16);
            int j3 = cmnjVar.j(16);
            int e = cmnjVar.e() + j3;
            if (j3 * 8 > cmnjVar.c()) {
                cmnjVar.h(cmnjVar.c());
            } else {
                switch (j) {
                    case 16:
                        if (j2 == cmhcVar2.a) {
                            cmgy cmgyVar = cmhcVar2.i;
                            int i9 = 8;
                            cmnjVar.j(8);
                            int j4 = cmnjVar.j(4);
                            int j5 = cmnjVar.j(2);
                            cmnjVar.h(2);
                            int i10 = j3 - 2;
                            SparseArray sparseArray3 = new SparseArray();
                            while (i10 > 0) {
                                int j6 = cmnjVar.j(i9);
                                cmnjVar.h(i9);
                                i10 -= 6;
                                sparseArray3.put(j6, new cmgz(cmnjVar.j(16), cmnjVar.j(16)));
                                i9 = 8;
                            }
                            cmgy cmgyVar2 = new cmgy(j4, j5, sparseArray3);
                            if (cmgyVar2.b != 0) {
                                cmhcVar2.i = cmgyVar2;
                                cmhcVar2.c.clear();
                                cmhcVar2.d.clear();
                                cmhcVar2.e.clear();
                                break;
                            } else if (cmgyVar != null && cmgyVar.a != cmgyVar2.a) {
                                cmhcVar2.i = cmgyVar2;
                                break;
                            }
                        }
                        break;
                    case 17:
                        cmgy cmgyVar3 = cmhcVar2.i;
                        if (j2 == cmhcVar2.a && cmgyVar3 != null) {
                            int j7 = cmnjVar.j(8);
                            cmnjVar.h(4);
                            boolean i11 = cmnjVar.i();
                            cmnjVar.h(3);
                            int j8 = cmnjVar.j(16);
                            int j9 = cmnjVar.j(16);
                            cmnjVar.j(3);
                            int j10 = cmnjVar.j(3);
                            cmnjVar.h(2);
                            int j11 = cmnjVar.j(8);
                            int j12 = cmnjVar.j(8);
                            int j13 = cmnjVar.j(4);
                            int j14 = cmnjVar.j(2);
                            cmnjVar.h(2);
                            int i12 = j3 - 10;
                            SparseArray sparseArray4 = new SparseArray();
                            while (i12 > 0) {
                                int j15 = cmnjVar.j(i8);
                                int j16 = cmnjVar.j(2);
                                cmnjVar.j(2);
                                int j17 = cmnjVar.j(12);
                                cmnjVar.h(4);
                                int j18 = cmnjVar.j(12);
                                i12 -= 6;
                                if (j16 == 1 || j16 == 2) {
                                    cmnjVar.j(8);
                                    cmnjVar.j(8);
                                    i12 -= 2;
                                }
                                sparseArray4.put(j15, new cmhb(j17, j18));
                                i8 = 16;
                            }
                            cmha cmhaVar2 = new cmha(j7, i11, j8, j9, j10, j11, j12, j13, j14, sparseArray4);
                            if (cmgyVar3.b == 0 && (cmhaVar = cmhcVar2.c.get(cmhaVar2.a)) != null) {
                                SparseArray<cmhb> sparseArray5 = cmhaVar.j;
                                for (int i13 = 0; i13 < sparseArray5.size(); i13++) {
                                    cmhaVar2.j.put(sparseArray5.keyAt(i13), sparseArray5.valueAt(i13));
                                }
                            }
                            cmhcVar2.c.put(cmhaVar2.a, cmhaVar2);
                            break;
                        }
                        break;
                    case 18:
                        if (j2 == cmhcVar2.a) {
                            cmgv a = cmhd.a(cmnjVar, j3);
                            cmhcVar2.d.put(a.a, a);
                            break;
                        } else if (j2 == cmhcVar2.b) {
                            cmgv a2 = cmhd.a(cmnjVar, j3);
                            cmhcVar2.f.put(a2.a, a2);
                            break;
                        }
                        break;
                    case 19:
                        if (j2 == cmhcVar2.a) {
                            cmgx b = cmhd.b(cmnjVar);
                            cmhcVar2.e.put(b.a, b);
                            break;
                        } else if (j2 == cmhcVar2.b) {
                            cmgx b2 = cmhd.b(cmnjVar);
                            cmhcVar2.g.put(b2.a, b2);
                            break;
                        }
                        break;
                    case 20:
                        if (j2 == cmhcVar2.a) {
                            cmnjVar.h(4);
                            boolean i14 = cmnjVar.i();
                            cmnjVar.h(3);
                            int j19 = cmnjVar.j(16);
                            int j20 = cmnjVar.j(16);
                            if (i14) {
                                int j21 = cmnjVar.j(16);
                                i4 = cmnjVar.j(16);
                                i7 = cmnjVar.j(16);
                                i5 = cmnjVar.j(16);
                                i6 = j21;
                            } else {
                                i4 = j19;
                                i5 = j20;
                                i6 = 0;
                                i7 = 0;
                            }
                            cmhcVar2.h = new cmgw(j19, j20, i6, i4, i7, i5);
                            break;
                        }
                        break;
                }
                cmnjVar.l(e - cmnjVar.e());
            }
        }
        cmhc cmhcVar3 = cmhdVar.f;
        cmgy cmgyVar4 = cmhcVar3.i;
        if (cmgyVar4 == null) {
            unmodifiableList = Collections.emptyList();
            cmheVar2 = cmheVar;
        } else {
            cmgw cmgwVar = cmhcVar3.h;
            if (cmgwVar == null) {
                cmgwVar = cmhdVar.d;
            }
            Bitmap bitmap = cmhdVar.g;
            if (bitmap == null || cmgwVar.a + 1 != bitmap.getWidth() || cmgwVar.b + 1 != cmhdVar.g.getHeight()) {
                cmhdVar.g = Bitmap.createBitmap(cmgwVar.a + 1, cmgwVar.b + 1, Bitmap.Config.ARGB_8888);
                cmhdVar.c.setBitmap(cmhdVar.g);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray<cmgz> sparseArray6 = cmgyVar4.c;
            int i15 = 0;
            while (i15 < sparseArray6.size()) {
                cmhdVar.c.save();
                cmgz valueAt = sparseArray6.valueAt(i15);
                cmha cmhaVar3 = cmhdVar.f.c.get(sparseArray6.keyAt(i15));
                int i16 = valueAt.a + cmgwVar.c;
                int i17 = valueAt.b + cmgwVar.e;
                cmhdVar.c.clipRect(i16, i17, Math.min(cmhaVar3.c + i16, cmgwVar.d), Math.min(cmhaVar3.d + i17, cmgwVar.f));
                cmgv cmgvVar = cmhdVar.f.d.get(cmhaVar3.f);
                if (cmgvVar == null && (cmgvVar = cmhdVar.f.f.get(cmhaVar3.f)) == null) {
                    cmgvVar = cmhdVar.e;
                }
                SparseArray<cmhb> sparseArray7 = cmhaVar3.j;
                int i18 = 0;
                while (i18 < sparseArray7.size()) {
                    int keyAt = sparseArray7.keyAt(i18);
                    cmhb valueAt2 = sparseArray7.valueAt(i18);
                    cmgx cmgxVar = cmhdVar.f.e.get(keyAt);
                    if (cmgxVar == null) {
                        cmgxVar = cmhdVar.f.g.get(keyAt);
                    }
                    if (cmgxVar != null) {
                        Paint paint = cmgxVar.b ? null : cmhdVar.a;
                        int i19 = cmhaVar3.e;
                        sparseArray = sparseArray6;
                        int i20 = valueAt2.a + i16;
                        int i21 = valueAt2.b + i17;
                        sparseArray2 = sparseArray7;
                        Canvas canvas = cmhdVar.c;
                        cmheVar3 = cmheVar;
                        if (i19 == 3) {
                            iArr = cmgvVar.d;
                        } else if (i19 == 2) {
                            iArr = cmgvVar.c;
                        } else {
                            iArr = cmgvVar.b;
                        }
                        i3 = i15;
                        int[] iArr2 = iArr;
                        Paint paint2 = paint;
                        cmhd.c(cmgxVar.c, iArr2, i19, i20, i21, paint2, canvas);
                        cmhd.c(cmgxVar.d, iArr2, i19, i20, i21 + 1, paint2, canvas);
                    } else {
                        cmheVar3 = cmheVar;
                        sparseArray = sparseArray6;
                        i3 = i15;
                        sparseArray2 = sparseArray7;
                    }
                    i18++;
                    sparseArray6 = sparseArray;
                    sparseArray7 = sparseArray2;
                    cmheVar = cmheVar3;
                    i15 = i3;
                }
                cmhe cmheVar4 = cmheVar;
                SparseArray<cmgz> sparseArray8 = sparseArray6;
                int i22 = i15;
                if (cmhaVar3.b) {
                    int i23 = cmhaVar3.e;
                    if (i23 == 3) {
                        i2 = cmgvVar.d[cmhaVar3.g];
                    } else if (i23 == 2) {
                        i2 = cmgvVar.c[cmhaVar3.h];
                    } else {
                        i2 = cmgvVar.b[cmhaVar3.i];
                    }
                    cmhdVar.b.setColor(i2);
                    cmhdVar.c.drawRect(i16, i17, cmhaVar3.c + i16, cmhaVar3.d + i17, cmhdVar.b);
                }
                cmfv cmfvVar = new cmfv();
                cmfvVar.b = Bitmap.createBitmap(cmhdVar.g, i16, i17, cmhaVar3.c, cmhaVar3.d);
                cmfvVar.e = i16 / cmgwVar.a;
                cmfvVar.f = 0;
                cmfvVar.b(i17 / cmgwVar.b, 0);
                cmfvVar.d = 0;
                cmfvVar.i = cmhaVar3.c / cmgwVar.a;
                cmfvVar.j = cmhaVar3.d / cmgwVar.b;
                arrayList.add(cmfvVar.a());
                cmhdVar.c.drawColor(0, PorterDuff.Mode.CLEAR);
                cmhdVar.c.restore();
                i15 = i22 + 1;
                sparseArray6 = sparseArray8;
                cmheVar = cmheVar4;
            }
            unmodifiableList = Collections.unmodifiableList(arrayList);
            cmheVar2 = cmheVar;
        }
        return new cmhe(unmodifiableList);
    }
}
