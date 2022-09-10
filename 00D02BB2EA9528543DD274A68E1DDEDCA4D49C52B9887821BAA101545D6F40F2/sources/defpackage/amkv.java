package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: amkv  reason: default package */
/* loaded from: classes.dex */
public final class amkv {
    private static final dcdc<alwd> a = dcdc.e();
    private final bnvb b;
    private final float c;
    private final amfi d;
    @dzsi
    private final btmk e;

    public amkv(bnvb bnvbVar, amfi amfiVar, float f, @dzsi btmk btmkVar) {
        this.b = bnvbVar;
        this.d = amfiVar;
        this.c = f;
        this.e = btmkVar;
    }

    @dzsi
    private static amfu g(@dzsi String str, @dzsi alwe alweVar, @dzsi alxo alxoVar, amky amkyVar, amfi amfiVar, String str2, @dzsi amfq amfqVar) {
        List list;
        if (alweVar != null) {
            list = alweVar.c;
            dbsk.s(list);
        } else {
            list = a;
        }
        String[] strArr = new String[list.size()];
        int[] iArr = new int[list.size()];
        int[] iArr2 = new int[list.size()];
        int[] iArr3 = new int[list.size()];
        int[] iArr4 = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            alwd alwdVar = (alwd) list.get(i);
            strArr[i] = alwdVar.a;
            iArr[i] = alwdVar.b;
            iArr2[i] = alwdVar.c;
            iArr3[i] = alwdVar.d;
            iArr4[i] = alwdVar.e;
        }
        int a2 = (alxoVar == null || !alxoVar.b()) ? 0 : alxoVar.q.a();
        return amfiVar.i(strArr, alweVar != null ? alweVar.e : 1, iArr, iArr2, iArr3, iArr4, str, h(alxoVar, amkyVar), a2, (alxoVar == null || !alxoVar.b()) ? 0 : alxoVar.q.g(), str2, amfqVar);
    }

    private static float h(@dzsi alxo alxoVar, amky amkyVar) {
        if (alxoVar == null || !alxoVar.b()) {
            return 0.0f;
        }
        return amkw.c(alxoVar.q.c(), amkyVar, 1.0f);
    }

    @dzsi
    private final bnve i(int i, Bitmap bitmap, float f) {
        amkv amkvVar = this;
        float b = amkvVar.b.b() - 1;
        float c = amkvVar.b.c() - 1;
        int width = bitmap.getWidth();
        float f2 = f;
        int height = bitmap.getHeight();
        int i2 = width;
        Bitmap bitmap2 = bitmap;
        while (true) {
            if (i2 > b || height > c || f2 <= 0.5d) {
                int width2 = bitmap2.getWidth();
                int height2 = bitmap2.getHeight();
                int[] iArr = new int[width2 * height2];
                int i3 = width2 / 2;
                int i4 = height2 / 2;
                int[] iArr2 = new int[i3 * i4];
                bitmap2.getPixels(iArr, 0, width2, 0, 0, width2, height2);
                int i5 = width2 / i3;
                int i6 = height2 / i4;
                for (int i7 = 0; i7 < i4; i7++) {
                    int i8 = 0;
                    while (i8 < i3) {
                        int i9 = i8 * i5;
                        int i10 = i7 * i6;
                        int i11 = 0;
                        int i12 = 0;
                        int i13 = 0;
                        int i14 = 0;
                        for (int i15 = 0; i15 < i6; i15++) {
                            int i16 = 0;
                            while (i16 < i5) {
                                float f3 = b;
                                int i17 = iArr[((i10 + i15) * width2) + i9 + i16];
                                i11 += i17 & 255;
                                i12 += (i17 >> 8) & 255;
                                i13 += (i17 >> 16) & 255;
                                i14 += (i17 >> 24) & 255;
                                i16++;
                                c = c;
                                b = f3;
                            }
                        }
                        int i18 = i5 * i6;
                        iArr2[(i7 * i3) + i8] = ((i14 / i18) << 24) | (i11 / i18) | ((i12 / i18) << 8) | ((i13 / i18) << 16);
                        i8++;
                        c = c;
                        b = b;
                    }
                }
                bitmap2 = Bitmap.createBitmap(iArr2, i3, i4, Bitmap.Config.ARGB_8888);
                i2 /= 2;
                height /= 2;
                f2 += f2;
                amkvVar = this;
            } else {
                return amkvVar.b.j(bitmap2, i, i2, height, f2);
            }
        }
    }

    @dzsi
    public final bnve a(Bitmap bitmap) {
        int hashCode = bitmap.hashCode();
        bnve d = d(hashCode);
        return d != null ? d : i(hashCode, bitmap, 1.0f);
    }

    @dzsi
    final bnve b(String str, @dzsi amfq amfqVar, bnuw bnuwVar, float f) {
        Picture picture;
        amfp<?> amfpVar;
        int hashCode = Arrays.hashCode(new Object[]{str, bnuwVar, Float.valueOf(f)});
        bnve d = d(hashCode);
        if (d != null) {
            return d;
        }
        amfu h = this.d.h(str, String.valueOf(getClass().getName()).concat("#getTextureForIcon()"), amfqVar);
        if (h != null && h.a()) {
            if (h.b() == 3) {
                Bitmap h2 = h.h();
                if (h2 != null) {
                    return i(hashCode, h2, f * this.c);
                }
            } else if (h.b() == 6) {
                if (h.b != 6 || (amfpVar = h.e) == null) {
                    picture = null;
                } else {
                    picture = (Picture) amfpVar.c();
                    if (picture == null) {
                        h.g();
                    }
                }
                if (picture != null) {
                    float f2 = f * this.c;
                    float b = this.b.b();
                    float c = this.b.c();
                    int a2 = (int) ((bnuwVar.d() ? bnuwVar.a() : picture.getWidth()) * f2);
                    int b2 = (int) ((bnuwVar.d() ? bnuwVar.b() : picture.getHeight()) * f2);
                    float f3 = 1.0f;
                    while (true) {
                        if (a2 > b || b2 > c || f3 <= 0.5d) {
                            a2 /= 2;
                            b2 /= 2;
                            f3 += f3;
                        } else {
                            Bitmap createBitmap = Bitmap.createBitmap(a2, b2, Bitmap.Config.ARGB_8888);
                            new Canvas(createBitmap).drawPicture(picture, new Rect(0, 0, a2, b2));
                            return this.b.j(createBitmap, hashCode, a2, b2, f3);
                        }
                    }
                }
            }
        }
        return null;
    }

    @dzsi
    final bnve d(int i) {
        bnve f = this.b.f(i);
        btmk btmkVar = this.e;
        if (btmkVar != null) {
            if (f != null) {
                btmkVar.a();
            } else {
                btmkVar.b();
            }
        }
        return f;
    }

    @dzsi
    public final bnvf f(dmpd dmpdVar, @dzsi alxo alxoVar, amky amkyVar, @dzsi amfq amfqVar) {
        amfu g;
        Bitmap[] bitmapArr;
        bnve b;
        alwe alweVar = alxoVar != null ? alxoVar.s : null;
        String concat = String.valueOf(getClass().getName()).concat("#getTextureGroupForLabelElement()");
        dccx F = dcdc.F();
        if (alweVar != null) {
            if (alweVar.d()) {
                F.g(a(alweVar.f));
                return new bnvf(F.f());
            }
            String str = alweVar.b;
            if (str == null && alweVar.c == null) {
                return null;
            }
            if (str == null || (b = b(str, amfqVar, alweVar.d, 1.0f / alweVar.e)) == null) {
                if (alweVar.c != null && (g = g(dmpdVar.b, alweVar, alxoVar, amkyVar, this.d, concat, amfqVar)) != null && g.a() && (bitmapArr = g.a) != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Bitmap bitmap : bitmapArr) {
                        if (bitmap != null) {
                            int hashCode = Arrays.hashCode(new Object[]{dmpdVar, bitmap, Float.valueOf(h(alxoVar, amkyVar))});
                            bnve d = d(hashCode);
                            if (d == null) {
                                d = i(hashCode, bitmap, this.c / alweVar.e);
                            }
                            arrayList.add(d);
                        } else {
                            arrayList.add(null);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return new bnvf(arrayList);
                    }
                }
            } else {
                return new bnvf(dcdc.f(b));
            }
        }
        return null;
    }

    @dzsi
    public static Bitmap c(@dzsi String str, @dzsi alwe alweVar, @dzsi alxo alxoVar, amky amkyVar, amfi amfiVar, String str2, @dzsi amfq amfqVar) {
        String str3;
        alwe alweVar2;
        Bitmap bitmap;
        if (alxoVar == null || (alweVar2 = alxoVar.s) == null || (bitmap = alweVar2.f) == null) {
            if (alweVar == null || (str3 = alweVar.b) == null) {
                amfu g = g(str, alweVar, alxoVar, amkyVar, amfiVar, str2, amfqVar);
                if (g != null && g.a()) {
                    return g.h();
                }
                return null;
            }
            amfu h = amfiVar.h(str3, str2, amfqVar);
            if (h != null && h.a()) {
                return h.h();
            }
            return null;
        }
        return bitmap;
    }

    @dzsi
    public final bnve e(dmpd dmpdVar, @dzsi alxo alxoVar, amky amkyVar, @dzsi amfq amfqVar) {
        alwe alweVar = alxoVar != null ? alxoVar.s : null;
        if (alweVar == null || !alweVar.d()) {
            String concat = String.valueOf(getClass().getName()).concat("#getTextureForLabelElement()");
            if (alweVar != null) {
                String str = alweVar.b;
                if (str == null && alweVar.c == null) {
                    return null;
                }
                if (str != null) {
                    return b(str, amfqVar, alweVar.d, 1.0f / alweVar.e);
                }
            }
            int hashCode = Arrays.hashCode(new Object[]{dmpdVar, alweVar, Float.valueOf(h(alxoVar, amkyVar))});
            bnve d = d(hashCode);
            if (d != null) {
                return d;
            }
            Bitmap c = c(dmpdVar.b, alweVar, alxoVar, amkyVar, this.d, concat, amfqVar);
            if (c != null && alweVar != null) {
                return i(hashCode, c, this.c / alweVar.e);
            }
            return null;
        }
        return a(alweVar.f);
    }
}
