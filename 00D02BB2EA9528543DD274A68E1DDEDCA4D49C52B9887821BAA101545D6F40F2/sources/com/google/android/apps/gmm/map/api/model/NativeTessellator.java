package com.google.android.apps.gmm.map.api.model;

import com.google.android.apps.gmm.map.util.jni.NativeHelper;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes.dex */
public class NativeTessellator implements Closeable {
    public static final int[] a;
    public static final float[] b;
    public static final btnh<NativeTessellator> c;
    private long nativeTessellator;

    static {
        NativeHelper.a();
        nativeInitClass();
        a = new int[0];
        b = new float[0];
        c = new akqy();
    }

    public NativeTessellator() {
        dbsk.l(true);
        this.nativeTessellator = nativeInit();
    }

    public static aksc a(dmrb dmrbVar, akqn akqnVar, boolean z) {
        NativeTessellator d;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        akqz akqzVar = new akqz();
        akqzVar.a = akqnVar instanceof akrt;
        akqzVar.d = akqnVar.b(dmrbVar.b);
        List<List<Integer>> list = null;
        akqzVar.h = null;
        if (dmrbVar.d.size() > 0) {
            akqzVar.h = dece.d(dmrbVar.d);
        }
        int i7 = dmrbVar.e;
        if (i7 == 0) {
            i7 = (dmrbVar.a & 1) != 0 ? akqnVar.b(dmrbVar.b) : 0;
            if ((dmrbVar.a & 16) != 0) {
                i7 += akqnVar.b(dmrbVar.j);
            }
            if ((dmrbVar.a & 32) != 0) {
                i7 += akqnVar.b(dmrbVar.l);
            }
        }
        if (akqzVar.a) {
            akqzVar.c = new float[i7 + i7];
            akqnVar.g(dmrbVar.b, akqzVar.d, 0, akqzVar.c);
        } else {
            akqzVar.b = new int[i7 + i7];
            akqnVar.e(dmrbVar.b, akqzVar.d, 0, akqzVar.b);
        }
        akqzVar.e = akqzVar.b;
        akqzVar.f = akqzVar.c;
        int i8 = dmrbVar.a;
        if ((i8 & 4) != 0) {
            akqzVar.g = aksc.a(dmrbVar.g, akqzVar.d);
        } else if ((i8 & 8) != 0) {
            btnh<NativeTessellator> btnhVar = c;
            synchronized (btnhVar) {
                d = btnhVar.d();
            }
            if (akqzVar.a) {
                float[] fArr = akqzVar.c;
                int i9 = akqzVar.d;
                dsrf dsrfVar = dmrbVar.c;
                nativePrepareForLoopsFloat(fArr, i9, d);
                int i10 = 0;
                for (int i11 = dmrbVar.i; i11 < i9; i11 = i) {
                    while (true) {
                        if (i10 >= dsrfVar.size()) {
                            i = 0;
                            break;
                        } else if (dsrfVar.get(i10).intValue() > i11) {
                            i = dsrfVar.get(i10).intValue();
                            break;
                        } else {
                            i10++;
                        }
                    }
                    if (i10 >= dsrfVar.size()) {
                        i = i9;
                    }
                    nativeAddLoop(i11, i, d);
                    if (z) {
                        nativeFinishPolygon(d);
                    }
                }
                nativeFinishPolygon(d);
                nativeFinishLoopsFloat(fArr, d);
            } else {
                if (dmrbVar.i >= 0 && ((akqnVar instanceof akqu) || (akqnVar instanceof akqt))) {
                    list = akrg.a(akqzVar.b, dmrbVar.c);
                }
                if (list != null) {
                    int i12 = 0;
                    for (List<Integer> list2 : list) {
                        i12 += list2.size();
                    }
                    akqzVar.b = new int[i12];
                    akqzVar.d = i12 / 2;
                    int[] iArr = akqzVar.b;
                    int i13 = 0;
                    for (List<Integer> list3 : list) {
                        for (int i14 = 0; i14 < list3.size(); i14++) {
                            iArr[i14 + i13] = list3.get(i14).intValue();
                        }
                        i13 += list3.size();
                    }
                    ArrayList arrayList = new ArrayList(list.size());
                    int i15 = 0;
                    for (List<Integer> list4 : list) {
                        i15 += list4.size() / 2;
                        arrayList.add(Integer.valueOf(i15));
                    }
                    d.b(iArr, 0, iArr.length >> 1, arrayList, z);
                    int i16 = akqzVar.d;
                    int i17 = i16 + i16;
                    akqzVar.e = new int[i17];
                    System.arraycopy(akqzVar.b, 0, akqzVar.e, 0, i17);
                } else {
                    d.b(akqzVar.b, dmrbVar.i, akqzVar.d, dmrbVar.c, z);
                }
            }
            int nativeNumSyntheticVertices = nativeNumSyntheticVertices(d);
            if (nativeNumSyntheticVertices > 0) {
                if (akqzVar.a) {
                    akqzVar.f = new float[akqzVar.b.length + nativeNumSyntheticVertices + nativeNumSyntheticVertices];
                    akqzVar.e = a;
                    float[] fArr2 = akqzVar.c;
                    float[] fArr3 = akqzVar.f;
                    int i18 = akqzVar.d;
                    System.arraycopy(fArr2, 0, fArr3, 0, i18 + i18);
                    float[] fArr4 = akqzVar.f;
                    int i19 = akqzVar.d;
                    nativeAppendSyntheticVerticesFloat(fArr4, i19 + i19, d);
                    akqzVar.d += nativeNumSyntheticVertices;
                } else {
                    akqzVar.e = new int[akqzVar.b.length + nativeNumSyntheticVertices + nativeNumSyntheticVertices];
                    akqzVar.f = b;
                    int[] iArr2 = akqzVar.b;
                    int[] iArr3 = akqzVar.e;
                    int i20 = akqzVar.d;
                    System.arraycopy(iArr2, 0, iArr3, 0, i20 + i20);
                    int[] iArr4 = akqzVar.e;
                    int i21 = akqzVar.d;
                    nativeAppendSyntheticVertices(iArr4, i21 + i21, d);
                    akqzVar.d += nativeNumSyntheticVertices;
                }
            }
            dsrf dsrfVar2 = dmrbVar.f;
            akqzVar.g = new int[dsrfVar2.size() + nativeNumIndices(d)];
            for (int i22 = 0; i22 < dsrfVar2.size(); i22++) {
                akqzVar.g[i22] = dsrfVar2.get(i22).intValue();
            }
            nativeAppendIndices(akqzVar.g, dsrfVar2.size(), d);
            nativeClear(d);
            btnh<NativeTessellator> btnhVar2 = c;
            synchronized (btnhVar2) {
                btnhVar2.h(d);
            }
        } else if ((i8 & 16) == 0 || (i8 & 32) != 0) {
            akqzVar.g = decl.l(dmrbVar.f);
        }
        int i23 = dmrbVar.a;
        int i24 = i23 & 16;
        if (i24 != 0 || (i23 & 32) != 0) {
            dbsk.a((i24 == 0 && (i23 & 32) == 0) ? false : true);
            if ((dmrbVar.a & 16) != 0) {
                i2 = akqnVar.b(dmrbVar.j);
                if (!akqzVar.a) {
                    akqnVar.e(dmrbVar.j, i2, akqzVar.d, (int[]) dbsk.s(akqzVar.e));
                } else {
                    akqnVar.g(dmrbVar.j, i2, akqzVar.d, (float[]) dbsk.s(akqzVar.f));
                }
            } else {
                i2 = 0;
            }
            if ((dmrbVar.a & 32) != 0) {
                i3 = akqnVar.b(dmrbVar.l);
                if (!akqzVar.a) {
                    akqnVar.e(dmrbVar.l, i3, akqzVar.d + i2, (int[]) dbsk.s(akqzVar.e));
                } else {
                    akqnVar.g(dmrbVar.l, i3, akqzVar.d + i2, (float[]) dbsk.s(akqzVar.f));
                }
            } else {
                i3 = 0;
            }
            if (i2 > 2) {
                int size = dmrbVar.k.size() + 1;
                i4 = i2 - (size + size);
            } else {
                i4 = 0;
            }
            if (i3 > 2) {
                int size2 = dmrbVar.m.size() + 1;
                i5 = i3 - (size2 + size2);
            } else {
                i5 = 0;
            }
            int[] iArr5 = akqzVar.g;
            int length = iArr5 == null ? 0 : iArr5.length;
            int[] iArr6 = new int[((i4 + i5) * 3) + length];
            if (iArr5 == null) {
                dsrf dsrfVar3 = dmrbVar.f;
                for (int i25 = 0; i25 < dsrfVar3.size(); i25++) {
                    iArr6[i25] = dsrfVar3.get(i25).intValue();
                }
            } else {
                System.arraycopy(iArr5, 0, iArr6, 0, length);
            }
            dsrf dsrfVar4 = dmrbVar.k;
            dsrf dsrfVar5 = dmrbVar.m;
            int i26 = akqzVar.d;
            float[] fArr5 = aksc.f;
            if (i2 != 0 || i3 != 0) {
                int i27 = 0;
                int i28 = 0;
                while (i27 <= dsrfVar4.size()) {
                    int intValue = i27 < dsrfVar4.size() ? dsrfVar4.get(i27).intValue() : i2;
                    int i29 = i28;
                    while (i29 < intValue - 2) {
                        int i30 = length + 1;
                        iArr6[length] = i26 + i28;
                        int i31 = i30 + 1;
                        int i32 = i26 + i29;
                        iArr6[i30] = i32 + 1;
                        iArr6[i31] = i32 + 2;
                        i29++;
                        length = i31 + 1;
                    }
                    i27++;
                    i28 = intValue;
                }
                int i33 = i26 + i2;
                int i34 = 0;
                int i35 = 0;
                while (i34 <= dsrfVar5.size()) {
                    int intValue2 = i34 < dsrfVar5.size() ? dsrfVar5.get(i34).intValue() : i3;
                    boolean z2 = false;
                    while (i35 < intValue2 - 2) {
                        if (z2) {
                            int i36 = length + 1;
                            int i37 = i33 + i35;
                            iArr6[length] = i37 + 1;
                            i6 = i36 + 1;
                            iArr6[i36] = i37;
                        } else {
                            int i38 = length + 1;
                            int i39 = i33 + i35;
                            iArr6[length] = i39;
                            i6 = i38 + 1;
                            iArr6[i38] = i39 + 1;
                        }
                        iArr6[i6] = i33 + i35 + 2;
                        z2 = !z2;
                        i35++;
                        length = i6 + 1;
                    }
                    i34++;
                    i35 = intValue2;
                }
            }
            akqzVar.g = iArr6;
        }
        int[] iArr7 = (int[]) dbsk.s(akqzVar.e);
        float[] fArr6 = (float[]) dbsk.s(akqzVar.f);
        float[] fArr7 = akqzVar.h;
        int[] iArr8 = akqzVar.g;
        int i40 = akqzVar.d;
        return new aksc(iArr7, fArr6, fArr7, iArr8, i40 + i40);
    }

    public static native void nativeAddLoop(int i, int i2, NativeTessellator nativeTessellator);

    public static native void nativeAppendIndices(int[] iArr, int i, NativeTessellator nativeTessellator);

    public static native void nativeAppendSyntheticVertices(int[] iArr, int i, NativeTessellator nativeTessellator);

    public static native void nativeAppendSyntheticVerticesFloat(float[] fArr, int i, NativeTessellator nativeTessellator);

    public static native void nativeClear(NativeTessellator nativeTessellator);

    private static native void nativeDestroyTessellator(NativeTessellator nativeTessellator);

    private static native void nativeFinishLoops(int[] iArr, NativeTessellator nativeTessellator);

    public static native void nativeFinishLoopsFloat(float[] fArr, NativeTessellator nativeTessellator);

    public static native void nativeFinishPolygon(NativeTessellator nativeTessellator);

    private static native long nativeInit();

    private static native boolean nativeInitClass();

    public static native int nativeNumIndices(NativeTessellator nativeTessellator);

    public static native int nativeNumSyntheticVertices(NativeTessellator nativeTessellator);

    private static native void nativePrepareForLoops(int[] iArr, int i, NativeTessellator nativeTessellator);

    public static native void nativePrepareForLoopsFloat(float[] fArr, int i, NativeTessellator nativeTessellator);

    final void b(int[] iArr, int i, int i2, List<Integer> list, boolean z) {
        int i3;
        nativePrepareForLoops(iArr, i2, this);
        int i4 = 0;
        while (i < i2) {
            while (true) {
                if (i4 >= list.size()) {
                    i3 = 0;
                    break;
                } else if (list.get(i4).intValue() > i) {
                    i3 = list.get(i4).intValue();
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 >= list.size()) {
                i3 = i2;
            }
            nativeAddLoop(i, i3, this);
            if (z) {
                nativeFinishPolygon(this);
            }
            i = i3;
        }
        nativeFinishPolygon(this);
        nativeFinishLoops(iArr, this);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.nativeTessellator != 0) {
            nativeDestroyTessellator(this);
        }
        this.nativeTessellator = 0L;
    }

    protected final void finalize() {
        close();
    }
}
