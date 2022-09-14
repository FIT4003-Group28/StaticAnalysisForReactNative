package defpackage;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: boq  reason: default package */
/* loaded from: classes3.dex */
public final class boq {
    private static final bph b = bph.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");
    static final bph a = bph.a("id", "layers", "w", "h", "p", "u");
    private static final bph c = bph.a("list");
    private static final bph d = bph.a("cm", "tm", "dr");

    public static bis a(bpj bpjVar) {
        HashMap hashMap;
        ArrayList arrayList;
        ain<blx> ainVar;
        int i;
        int i2;
        float f;
        float f2;
        int i3;
        float f3;
        HashMap hashMap2;
        ArrayList arrayList2;
        float g = bps.g();
        aik<bno> aikVar = new aik<>();
        ArrayList arrayList3 = new ArrayList();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        ain<blx> ainVar2 = new ain<>();
        bis bisVar = new bis();
        bpjVar.f();
        float f4 = 0.0f;
        int i4 = 0;
        int i5 = 0;
        float f5 = 0.0f;
        float f6 = 0.0f;
        while (bpjVar.h()) {
            float f7 = f4;
            switch (bpjVar.j(b)) {
                case 0:
                    i4 = bpjVar.o();
                    f4 = f7;
                case 1:
                    i5 = bpjVar.o();
                    f4 = f7;
                case 2:
                    hashMap2 = hashMap5;
                    arrayList2 = arrayList4;
                    f5 = (float) bpjVar.n();
                    f4 = f7;
                    arrayList4 = arrayList2;
                    hashMap5 = hashMap2;
                case 3:
                    hashMap2 = hashMap5;
                    arrayList2 = arrayList4;
                    f6 = ((float) bpjVar.n()) - 0.01f;
                    f4 = f7;
                    arrayList4 = arrayList2;
                    hashMap5 = hashMap2;
                case 4:
                    hashMap2 = hashMap5;
                    arrayList2 = arrayList4;
                    f4 = (float) bpjVar.n();
                    arrayList4 = arrayList2;
                    hashMap5 = hashMap2;
                case 5:
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    ainVar = ainVar2;
                    i = i4;
                    i2 = i5;
                    f = f5;
                    f2 = f6;
                    String[] split = bpjVar.l().split("\\.");
                    if (!bps.m(Integer.parseInt(split[0]), Integer.parseInt(split[1]), Integer.parseInt(split[2]))) {
                        bisVar.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    f4 = f7;
                    f5 = f;
                    arrayList4 = arrayList;
                    f6 = f2;
                    hashMap5 = hashMap;
                    ainVar2 = ainVar;
                    i5 = i2;
                    i4 = i;
                case 6:
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    ainVar = ainVar2;
                    i = i4;
                    i2 = i5;
                    f = f5;
                    f2 = f6;
                    bpjVar.d();
                    int i6 = 0;
                    while (bpjVar.h()) {
                        bno b2 = bop.b(bpjVar, bisVar);
                        if (b2.u == 3) {
                            i6++;
                        }
                        arrayList3.add(b2);
                        aikVar.d(b2.d, b2);
                        if (i6 > 4) {
                            StringBuilder sb = new StringBuilder(157);
                            sb.append("You have ");
                            sb.append(i6);
                            sb.append(" images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
                            bpo.a(sb.toString());
                        }
                    }
                    bpjVar.e();
                    f4 = f7;
                    f5 = f;
                    arrayList4 = arrayList;
                    f6 = f2;
                    hashMap5 = hashMap;
                    ainVar2 = ainVar;
                    i5 = i2;
                    i4 = i;
                case 7:
                    f = f5;
                    f2 = f6;
                    bpjVar.d();
                    while (bpjVar.h()) {
                        ArrayList arrayList5 = new ArrayList();
                        aik aikVar2 = new aik();
                        bpjVar.f();
                        HashMap hashMap6 = hashMap5;
                        ArrayList arrayList6 = arrayList4;
                        String str = null;
                        String str2 = null;
                        int i7 = 0;
                        int i8 = 0;
                        while (bpjVar.h()) {
                            ain<blx> ainVar3 = ainVar2;
                            int j = bpjVar.j(a);
                            if (j != 0) {
                                int i9 = i5;
                                if (j != 1) {
                                    if (j == 2) {
                                        i7 = bpjVar.o();
                                    } else if (j == 3) {
                                        i8 = bpjVar.o();
                                    } else if (j != 4) {
                                        if (j == 5) {
                                            bpjVar.l();
                                        } else {
                                            bpjVar.k();
                                            bpjVar.p();
                                        }
                                        i3 = i4;
                                    } else {
                                        str2 = bpjVar.l();
                                    }
                                    ainVar2 = ainVar3;
                                    i5 = i9;
                                } else {
                                    bpjVar.d();
                                    while (bpjVar.h()) {
                                        bno b3 = bop.b(bpjVar, bisVar);
                                        aikVar2.d(b3.d, b3);
                                        arrayList5.add(b3);
                                        i4 = i4;
                                    }
                                    i3 = i4;
                                    bpjVar.e();
                                }
                                ainVar2 = ainVar3;
                                i5 = i9;
                                i4 = i3;
                            } else {
                                str = bpjVar.l();
                                ainVar2 = ainVar3;
                            }
                        }
                        ain<blx> ainVar4 = ainVar2;
                        int i10 = i4;
                        int i11 = i5;
                        bpjVar.g();
                        if (str2 != null) {
                            bjs bjsVar = new bjs(i7, i8, str, str2);
                            hashMap4.put(bjsVar.c, bjsVar);
                        } else {
                            hashMap3.put(str, arrayList5);
                        }
                        arrayList4 = arrayList6;
                        hashMap5 = hashMap6;
                        ainVar2 = ainVar4;
                        i5 = i11;
                        i4 = i10;
                    }
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    ainVar = ainVar2;
                    i = i4;
                    i2 = i5;
                    bpjVar.e();
                    f4 = f7;
                    f5 = f;
                    arrayList4 = arrayList;
                    f6 = f2;
                    hashMap5 = hashMap;
                    ainVar2 = ainVar;
                    i5 = i2;
                    i4 = i;
                case 8:
                    f = f5;
                    f2 = f6;
                    bpjVar.f();
                    while (bpjVar.h()) {
                        if (bpjVar.j(c) == 0) {
                            bpjVar.d();
                            while (bpjVar.h()) {
                                blw a2 = boh.a(bpjVar);
                                hashMap5.put(a2.b, a2);
                            }
                            bpjVar.e();
                        } else {
                            bpjVar.k();
                            bpjVar.p();
                        }
                    }
                    bpjVar.g();
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    ainVar = ainVar2;
                    i = i4;
                    i2 = i5;
                    f4 = f7;
                    f5 = f;
                    arrayList4 = arrayList;
                    f6 = f2;
                    hashMap5 = hashMap;
                    ainVar2 = ainVar;
                    i5 = i2;
                    i4 = i;
                case 9:
                    f = f5;
                    f2 = f6;
                    bpjVar.d();
                    while (bpjVar.h()) {
                        blx a3 = bog.a(bpjVar, bisVar);
                        ainVar2.e(a3.hashCode(), a3);
                    }
                    bpjVar.e();
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    ainVar = ainVar2;
                    i = i4;
                    i2 = i5;
                    f4 = f7;
                    f5 = f;
                    arrayList4 = arrayList;
                    f6 = f2;
                    hashMap5 = hashMap;
                    ainVar2 = ainVar;
                    i5 = i2;
                    i4 = i;
                case 10:
                    bpjVar.d();
                    while (bpjVar.h()) {
                        bpjVar.f();
                        String str3 = null;
                        float f8 = 0.0f;
                        float f9 = 0.0f;
                        while (bpjVar.h()) {
                            int j2 = bpjVar.j(d);
                            if (j2 != 0) {
                                float f10 = f6;
                                if (j2 == 1) {
                                    f3 = f5;
                                    f8 = (float) bpjVar.n();
                                } else if (j2 == 2) {
                                    f3 = f5;
                                    f9 = (float) bpjVar.n();
                                } else {
                                    bpjVar.k();
                                    bpjVar.p();
                                    f6 = f10;
                                }
                                f6 = f10;
                                f5 = f3;
                            } else {
                                str3 = bpjVar.l();
                            }
                        }
                        bpjVar.g();
                        arrayList4.add(new bmb(str3, f8, f9));
                        f5 = f5;
                        f6 = f6;
                    }
                    f = f5;
                    f2 = f6;
                    bpjVar.e();
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    ainVar = ainVar2;
                    i = i4;
                    i2 = i5;
                    f4 = f7;
                    f5 = f;
                    arrayList4 = arrayList;
                    f6 = f2;
                    hashMap5 = hashMap;
                    ainVar2 = ainVar;
                    i5 = i2;
                    i4 = i;
                default:
                    hashMap = hashMap5;
                    arrayList = arrayList4;
                    ainVar = ainVar2;
                    i = i4;
                    i2 = i5;
                    f = f5;
                    f2 = f6;
                    bpjVar.k();
                    bpjVar.p();
                    f4 = f7;
                    f5 = f;
                    arrayList4 = arrayList;
                    f6 = f2;
                    hashMap5 = hashMap;
                    ainVar2 = ainVar;
                    i5 = i2;
                    i4 = i;
            }
        }
        bisVar.i = new Rect(0, 0, (int) (i4 * g), (int) (i5 * g));
        bisVar.j = f5;
        bisVar.k = f6;
        bisVar.l = f4;
        bisVar.h = arrayList3;
        bisVar.g = aikVar;
        bisVar.b = hashMap3;
        bisVar.c = hashMap4;
        bisVar.f = ainVar2;
        bisVar.d = hashMap5;
        bisVar.e = arrayList4;
        return bisVar;
    }
}
