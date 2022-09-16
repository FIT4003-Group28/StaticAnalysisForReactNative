package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: PG */
/* renamed from: ais  reason: default package */
/* loaded from: classes.dex */
public final class ais {
    public static final int[] a = {0, 4, 8};
    private static final SparseIntArray c;
    private static final SparseIntArray d;
    private final HashMap e = new HashMap();
    public final HashMap b = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        c = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        d = sparseIntArray2;
        int[] iArr = aix.a;
        sparseIntArray.append(81, 25);
        sparseIntArray.append(82, 26);
        sparseIntArray.append(84, 29);
        sparseIntArray.append(85, 30);
        sparseIntArray.append(91, 36);
        sparseIntArray.append(90, 35);
        sparseIntArray.append(62, 4);
        sparseIntArray.append(61, 3);
        sparseIntArray.append(57, 1);
        sparseIntArray.append(59, 91);
        sparseIntArray.append(58, 92);
        sparseIntArray.append(100, 6);
        sparseIntArray.append(101, 7);
        sparseIntArray.append(69, 17);
        sparseIntArray.append(70, 18);
        sparseIntArray.append(71, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(86, 32);
        sparseIntArray.append(87, 33);
        sparseIntArray.append(68, 10);
        sparseIntArray.append(67, 9);
        sparseIntArray.append(105, 13);
        sparseIntArray.append(108, 16);
        sparseIntArray.append(106, 14);
        sparseIntArray.append(103, 11);
        sparseIntArray.append(107, 15);
        sparseIntArray.append(104, 12);
        sparseIntArray.append(94, 40);
        sparseIntArray.append(79, 39);
        sparseIntArray.append(78, 41);
        sparseIntArray.append(93, 42);
        sparseIntArray.append(77, 20);
        sparseIntArray.append(92, 37);
        sparseIntArray.append(66, 5);
        sparseIntArray.append(80, 87);
        sparseIntArray.append(89, 87);
        sparseIntArray.append(83, 87);
        sparseIntArray.append(60, 87);
        sparseIntArray.append(56, 87);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(95, 95);
        sparseIntArray.append(72, 96);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(96, 54);
        sparseIntArray.append(73, 55);
        sparseIntArray.append(97, 56);
        sparseIntArray.append(74, 57);
        sparseIntArray.append(98, 58);
        sparseIntArray.append(75, 59);
        sparseIntArray.append(63, 61);
        sparseIntArray.append(65, 62);
        sparseIntArray.append(64, 63);
        sparseIntArray.append(28, 64);
        sparseIntArray.append(120, 65);
        sparseIntArray.append(35, 66);
        sparseIntArray.append(121, 67);
        sparseIntArray.append(112, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(111, 68);
        sparseIntArray.append(99, 69);
        sparseIntArray.append(76, 70);
        sparseIntArray.append(110, 97);
        sparseIntArray.append(32, 71);
        sparseIntArray.append(30, 72);
        sparseIntArray.append(31, 73);
        sparseIntArray.append(33, 74);
        sparseIntArray.append(29, 75);
        sparseIntArray.append(113, 76);
        sparseIntArray.append(88, 77);
        sparseIntArray.append(122, 78);
        sparseIntArray.append(55, 80);
        sparseIntArray.append(54, 81);
        sparseIntArray.append(115, 82);
        sparseIntArray.append(119, 83);
        sparseIntArray.append(118, 84);
        sparseIntArray.append(117, 85);
        sparseIntArray.append(116, 86);
        sparseIntArray2.append(84, 6);
        sparseIntArray2.append(84, 7);
        sparseIntArray2.append(0, 27);
        sparseIntArray2.append(88, 13);
        sparseIntArray2.append(91, 16);
        sparseIntArray2.append(89, 14);
        sparseIntArray2.append(86, 11);
        sparseIntArray2.append(90, 15);
        sparseIntArray2.append(87, 12);
        sparseIntArray2.append(77, 40);
        sparseIntArray2.append(70, 39);
        sparseIntArray2.append(69, 41);
        sparseIntArray2.append(76, 42);
        sparseIntArray2.append(68, 20);
        sparseIntArray2.append(75, 37);
        sparseIntArray2.append(59, 5);
        sparseIntArray2.append(71, 87);
        sparseIntArray2.append(74, 87);
        sparseIntArray2.append(72, 87);
        sparseIntArray2.append(56, 87);
        sparseIntArray2.append(55, 87);
        sparseIntArray2.append(5, 24);
        sparseIntArray2.append(7, 28);
        sparseIntArray2.append(23, 31);
        sparseIntArray2.append(24, 8);
        sparseIntArray2.append(6, 34);
        sparseIntArray2.append(8, 2);
        sparseIntArray2.append(3, 23);
        sparseIntArray2.append(4, 21);
        sparseIntArray2.append(78, 95);
        sparseIntArray2.append(63, 96);
        sparseIntArray2.append(2, 22);
        sparseIntArray2.append(13, 43);
        sparseIntArray2.append(26, 44);
        sparseIntArray2.append(21, 45);
        sparseIntArray2.append(22, 46);
        sparseIntArray2.append(20, 60);
        sparseIntArray2.append(18, 47);
        sparseIntArray2.append(19, 48);
        sparseIntArray2.append(14, 49);
        sparseIntArray2.append(15, 50);
        sparseIntArray2.append(16, 51);
        sparseIntArray2.append(17, 52);
        sparseIntArray2.append(25, 53);
        sparseIntArray2.append(79, 54);
        sparseIntArray2.append(64, 55);
        sparseIntArray2.append(80, 56);
        sparseIntArray2.append(65, 57);
        sparseIntArray2.append(81, 58);
        sparseIntArray2.append(66, 59);
        sparseIntArray2.append(58, 62);
        sparseIntArray2.append(57, 63);
        sparseIntArray2.append(28, 64);
        sparseIntArray2.append(104, 65);
        sparseIntArray2.append(34, 66);
        sparseIntArray2.append(105, 67);
        sparseIntArray2.append(95, 79);
        sparseIntArray2.append(1, 38);
        sparseIntArray2.append(96, 98);
        sparseIntArray2.append(94, 68);
        sparseIntArray2.append(82, 69);
        sparseIntArray2.append(67, 70);
        sparseIntArray2.append(32, 71);
        sparseIntArray2.append(30, 72);
        sparseIntArray2.append(31, 73);
        sparseIntArray2.append(33, 74);
        sparseIntArray2.append(29, 75);
        sparseIntArray2.append(97, 76);
        sparseIntArray2.append(73, 77);
        sparseIntArray2.append(106, 78);
        sparseIntArray2.append(54, 80);
        sparseIntArray2.append(53, 81);
        sparseIntArray2.append(99, 82);
        sparseIntArray2.append(103, 83);
        sparseIntArray2.append(102, 84);
        sparseIntArray2.append(101, 85);
        sparseIntArray2.append(100, 86);
        sparseIntArray2.append(93, 97);
    }

    public static int a(TypedArray typedArray, int i, int i2) {
        int resourceId = typedArray.getResourceId(i, i2);
        return resourceId == -1 ? typedArray.getInt(i, -1) : resourceId;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r9 == (-1)) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(java.lang.Object r8, android.content.res.TypedArray r9, int r10, int r11) {
        /*
            Method dump skipped, instructions count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ais.e(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void f(aii aiiVar, String str) {
        int i;
        if (str != null) {
            int length = str.length();
            int indexOf = str.indexOf(44);
            int i2 = 0;
            if (indexOf <= 0 || indexOf >= length - 1) {
                i = -1;
            } else {
                String substring = str.substring(0, indexOf);
                if (!substring.equalsIgnoreCase("W")) {
                    i2 = substring.equalsIgnoreCase("H") ? 1 : -1;
                }
                int i3 = i2;
                i2 = indexOf + 1;
                i = i3;
            }
            int indexOf2 = str.indexOf(58);
            try {
                if (indexOf2 < 0 || indexOf2 >= length - 1) {
                    String substring2 = str.substring(i2);
                    if (substring2.length() > 0) {
                        Float.parseFloat(substring2);
                    }
                } else {
                    String substring3 = str.substring(i2, indexOf2);
                    String substring4 = str.substring(indexOf2 + 1);
                    if (substring3.length() > 0 && substring4.length() > 0) {
                        float parseFloat = Float.parseFloat(substring3);
                        float parseFloat2 = Float.parseFloat(substring4);
                        if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                            if (i == 1) {
                                Math.abs(parseFloat2 / parseFloat);
                            } else {
                                Math.abs(parseFloat / parseFloat2);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        aiiVar.F = str;
    }

    public static final int[] g(View view, String str) {
        int length;
        int i;
        HashMap hashMap;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = split.length;
            if (i2 >= length) {
                break;
            }
            String trim = split[i2].trim();
            Object obj = null;
            try {
                i = aiw.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0) {
                if (view.isInEditMode() && (view.getParent() instanceof ConstraintLayout)) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view.getParent();
                    if ((trim instanceof String) && (hashMap = constraintLayout.g) != null && hashMap.containsKey(trim)) {
                        obj = constraintLayout.g.get(trim);
                    }
                    if (obj != null && (obj instanceof Integer)) {
                        i = ((Integer) obj).intValue();
                    }
                }
                i = 0;
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    private static final ain h(Context context, AttributeSet attributeSet, boolean z) {
        ain ainVar = new ain();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? aix.c : aix.a);
        if (z) {
            i(ainVar, obtainStyledAttributes);
        } else {
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index != 1 && index != 23 && index != 24) {
                    ainVar.c.b = true;
                    ainVar.d.c = true;
                    ainVar.b.a = true;
                    ainVar.e.b = true;
                }
                SparseIntArray sparseIntArray = c;
                switch (sparseIntArray.get(index)) {
                    case 1:
                        aio aioVar = ainVar.d;
                        aioVar.q = a(obtainStyledAttributes, index, aioVar.q);
                        break;
                    case 2:
                        aio aioVar2 = ainVar.d;
                        aioVar2.f52J = obtainStyledAttributes.getDimensionPixelSize(index, aioVar2.f52J);
                        break;
                    case 3:
                        aio aioVar3 = ainVar.d;
                        aioVar3.p = a(obtainStyledAttributes, index, aioVar3.p);
                        break;
                    case 4:
                        aio aioVar4 = ainVar.d;
                        aioVar4.o = a(obtainStyledAttributes, index, aioVar4.o);
                        break;
                    case 5:
                        ainVar.d.z = obtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        aio aioVar5 = ainVar.d;
                        aioVar5.D = obtainStyledAttributes.getDimensionPixelOffset(index, aioVar5.D);
                        break;
                    case 7:
                        aio aioVar6 = ainVar.d;
                        aioVar6.E = obtainStyledAttributes.getDimensionPixelOffset(index, aioVar6.E);
                        break;
                    case 8:
                        aio aioVar7 = ainVar.d;
                        aioVar7.K = obtainStyledAttributes.getDimensionPixelSize(index, aioVar7.K);
                        break;
                    case 9:
                        aio aioVar8 = ainVar.d;
                        aioVar8.w = a(obtainStyledAttributes, index, aioVar8.w);
                        break;
                    case 10:
                        aio aioVar9 = ainVar.d;
                        aioVar9.v = a(obtainStyledAttributes, index, aioVar9.v);
                        break;
                    case 11:
                        aio aioVar10 = ainVar.d;
                        aioVar10.Q = obtainStyledAttributes.getDimensionPixelSize(index, aioVar10.Q);
                        break;
                    case 12:
                        aio aioVar11 = ainVar.d;
                        aioVar11.R = obtainStyledAttributes.getDimensionPixelSize(index, aioVar11.R);
                        break;
                    case 13:
                        aio aioVar12 = ainVar.d;
                        aioVar12.N = obtainStyledAttributes.getDimensionPixelSize(index, aioVar12.N);
                        break;
                    case 14:
                        aio aioVar13 = ainVar.d;
                        aioVar13.P = obtainStyledAttributes.getDimensionPixelSize(index, aioVar13.P);
                        break;
                    case 15:
                        aio aioVar14 = ainVar.d;
                        aioVar14.S = obtainStyledAttributes.getDimensionPixelSize(index, aioVar14.S);
                        break;
                    case 16:
                        aio aioVar15 = ainVar.d;
                        aioVar15.O = obtainStyledAttributes.getDimensionPixelSize(index, aioVar15.O);
                        break;
                    case 17:
                        aio aioVar16 = ainVar.d;
                        aioVar16.f = obtainStyledAttributes.getDimensionPixelOffset(index, aioVar16.f);
                        break;
                    case 18:
                        aio aioVar17 = ainVar.d;
                        aioVar17.g = obtainStyledAttributes.getDimensionPixelOffset(index, aioVar17.g);
                        break;
                    case 19:
                        aio aioVar18 = ainVar.d;
                        aioVar18.h = obtainStyledAttributes.getFloat(index, aioVar18.h);
                        break;
                    case 20:
                        aio aioVar19 = ainVar.d;
                        aioVar19.x = obtainStyledAttributes.getFloat(index, aioVar19.x);
                        break;
                    case 21:
                        aio aioVar20 = ainVar.d;
                        aioVar20.e = obtainStyledAttributes.getLayoutDimension(index, aioVar20.e);
                        break;
                    case 22:
                        aiq aiqVar = ainVar.b;
                        aiqVar.b = obtainStyledAttributes.getInt(index, aiqVar.b);
                        ainVar.b.b = a[ainVar.b.b];
                        break;
                    case 23:
                        aio aioVar21 = ainVar.d;
                        aioVar21.d = obtainStyledAttributes.getLayoutDimension(index, aioVar21.d);
                        break;
                    case 24:
                        aio aioVar22 = ainVar.d;
                        aioVar22.G = obtainStyledAttributes.getDimensionPixelSize(index, aioVar22.G);
                        break;
                    case 25:
                        aio aioVar23 = ainVar.d;
                        aioVar23.i = a(obtainStyledAttributes, index, aioVar23.i);
                        break;
                    case 26:
                        aio aioVar24 = ainVar.d;
                        aioVar24.j = a(obtainStyledAttributes, index, aioVar24.j);
                        break;
                    case 27:
                        aio aioVar25 = ainVar.d;
                        aioVar25.F = obtainStyledAttributes.getInt(index, aioVar25.F);
                        break;
                    case 28:
                        aio aioVar26 = ainVar.d;
                        aioVar26.H = obtainStyledAttributes.getDimensionPixelSize(index, aioVar26.H);
                        break;
                    case 29:
                        aio aioVar27 = ainVar.d;
                        aioVar27.k = a(obtainStyledAttributes, index, aioVar27.k);
                        break;
                    case 30:
                        aio aioVar28 = ainVar.d;
                        aioVar28.l = a(obtainStyledAttributes, index, aioVar28.l);
                        break;
                    case 31:
                        aio aioVar29 = ainVar.d;
                        aioVar29.L = obtainStyledAttributes.getDimensionPixelSize(index, aioVar29.L);
                        break;
                    case 32:
                        aio aioVar30 = ainVar.d;
                        aioVar30.t = a(obtainStyledAttributes, index, aioVar30.t);
                        break;
                    case 33:
                        aio aioVar31 = ainVar.d;
                        aioVar31.u = a(obtainStyledAttributes, index, aioVar31.u);
                        break;
                    case 34:
                        aio aioVar32 = ainVar.d;
                        aioVar32.I = obtainStyledAttributes.getDimensionPixelSize(index, aioVar32.I);
                        break;
                    case 35:
                        aio aioVar33 = ainVar.d;
                        aioVar33.n = a(obtainStyledAttributes, index, aioVar33.n);
                        break;
                    case 36:
                        aio aioVar34 = ainVar.d;
                        aioVar34.m = a(obtainStyledAttributes, index, aioVar34.m);
                        break;
                    case 37:
                        aio aioVar35 = ainVar.d;
                        aioVar35.y = obtainStyledAttributes.getFloat(index, aioVar35.y);
                        break;
                    case 38:
                        ainVar.a = obtainStyledAttributes.getResourceId(index, ainVar.a);
                        break;
                    case 39:
                        aio aioVar36 = ainVar.d;
                        aioVar36.V = obtainStyledAttributes.getFloat(index, aioVar36.V);
                        break;
                    case 40:
                        aio aioVar37 = ainVar.d;
                        aioVar37.U = obtainStyledAttributes.getFloat(index, aioVar37.U);
                        break;
                    case 41:
                        aio aioVar38 = ainVar.d;
                        aioVar38.W = obtainStyledAttributes.getInt(index, aioVar38.W);
                        break;
                    case 42:
                        aio aioVar39 = ainVar.d;
                        aioVar39.X = obtainStyledAttributes.getInt(index, aioVar39.X);
                        break;
                    case 43:
                        aiq aiqVar2 = ainVar.b;
                        aiqVar2.d = obtainStyledAttributes.getFloat(index, aiqVar2.d);
                        break;
                    case 44:
                        air airVar = ainVar.e;
                        airVar.n = true;
                        airVar.o = obtainStyledAttributes.getDimension(index, airVar.o);
                        break;
                    case 45:
                        air airVar2 = ainVar.e;
                        airVar2.d = obtainStyledAttributes.getFloat(index, airVar2.d);
                        break;
                    case 46:
                        air airVar3 = ainVar.e;
                        airVar3.e = obtainStyledAttributes.getFloat(index, airVar3.e);
                        break;
                    case 47:
                        air airVar4 = ainVar.e;
                        airVar4.f = obtainStyledAttributes.getFloat(index, airVar4.f);
                        break;
                    case 48:
                        air airVar5 = ainVar.e;
                        airVar5.g = obtainStyledAttributes.getFloat(index, airVar5.g);
                        break;
                    case 49:
                        air airVar6 = ainVar.e;
                        airVar6.h = obtainStyledAttributes.getDimension(index, airVar6.h);
                        break;
                    case 50:
                        air airVar7 = ainVar.e;
                        airVar7.i = obtainStyledAttributes.getDimension(index, airVar7.i);
                        break;
                    case 51:
                        air airVar8 = ainVar.e;
                        airVar8.k = obtainStyledAttributes.getDimension(index, airVar8.k);
                        break;
                    case 52:
                        air airVar9 = ainVar.e;
                        airVar9.l = obtainStyledAttributes.getDimension(index, airVar9.l);
                        break;
                    case 53:
                        air airVar10 = ainVar.e;
                        airVar10.m = obtainStyledAttributes.getDimension(index, airVar10.m);
                        break;
                    case 54:
                        aio aioVar40 = ainVar.d;
                        aioVar40.Y = obtainStyledAttributes.getInt(index, aioVar40.Y);
                        break;
                    case 55:
                        aio aioVar41 = ainVar.d;
                        aioVar41.Z = obtainStyledAttributes.getInt(index, aioVar41.Z);
                        break;
                    case 56:
                        aio aioVar42 = ainVar.d;
                        aioVar42.aa = obtainStyledAttributes.getDimensionPixelSize(index, aioVar42.aa);
                        break;
                    case 57:
                        aio aioVar43 = ainVar.d;
                        aioVar43.ab = obtainStyledAttributes.getDimensionPixelSize(index, aioVar43.ab);
                        break;
                    case 58:
                        aio aioVar44 = ainVar.d;
                        aioVar44.ac = obtainStyledAttributes.getDimensionPixelSize(index, aioVar44.ac);
                        break;
                    case 59:
                        aio aioVar45 = ainVar.d;
                        aioVar45.ad = obtainStyledAttributes.getDimensionPixelSize(index, aioVar45.ad);
                        break;
                    case 60:
                        air airVar11 = ainVar.e;
                        airVar11.c = obtainStyledAttributes.getFloat(index, airVar11.c);
                        break;
                    case 61:
                        aio aioVar46 = ainVar.d;
                        aioVar46.A = a(obtainStyledAttributes, index, aioVar46.A);
                        break;
                    case 62:
                        aio aioVar47 = ainVar.d;
                        aioVar47.B = obtainStyledAttributes.getDimensionPixelSize(index, aioVar47.B);
                        break;
                    case 63:
                        aio aioVar48 = ainVar.d;
                        aioVar48.C = obtainStyledAttributes.getFloat(index, aioVar48.C);
                        break;
                    case 64:
                        aip aipVar = ainVar.c;
                        aipVar.c = a(obtainStyledAttributes, index, aipVar.c);
                        break;
                    case 65:
                        if (obtainStyledAttributes.peekValue(index).type == 3) {
                            ainVar.c.e = obtainStyledAttributes.getString(index);
                            break;
                        } else {
                            ainVar.c.e = ahd.a[obtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 66:
                        ainVar.c.g = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 67:
                        aip aipVar2 = ainVar.c;
                        aipVar2.j = obtainStyledAttributes.getFloat(index, aipVar2.j);
                        break;
                    case 68:
                        aiq aiqVar3 = ainVar.b;
                        aiqVar3.e = obtainStyledAttributes.getFloat(index, aiqVar3.e);
                        break;
                    case 69:
                        ainVar.d.ae = obtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case 70:
                        ainVar.d.af = obtainStyledAttributes.getFloat(index, 1.0f);
                        break;
                    case 71:
                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                        break;
                    case 72:
                        aio aioVar49 = ainVar.d;
                        aioVar49.ag = obtainStyledAttributes.getInt(index, aioVar49.ag);
                        break;
                    case 73:
                        aio aioVar50 = ainVar.d;
                        aioVar50.ah = obtainStyledAttributes.getDimensionPixelSize(index, aioVar50.ah);
                        break;
                    case 74:
                        ainVar.d.ak = obtainStyledAttributes.getString(index);
                        break;
                    case 75:
                        aio aioVar51 = ainVar.d;
                        aioVar51.ao = obtainStyledAttributes.getBoolean(index, aioVar51.ao);
                        break;
                    case 76:
                        aip aipVar3 = ainVar.c;
                        aipVar3.f = obtainStyledAttributes.getInt(index, aipVar3.f);
                        break;
                    case 77:
                        ainVar.d.al = obtainStyledAttributes.getString(index);
                        break;
                    case 78:
                        aiq aiqVar4 = ainVar.b;
                        aiqVar4.c = obtainStyledAttributes.getInt(index, aiqVar4.c);
                        break;
                    case 79:
                        aip aipVar4 = ainVar.c;
                        aipVar4.h = obtainStyledAttributes.getFloat(index, aipVar4.h);
                        break;
                    case 80:
                        aio aioVar52 = ainVar.d;
                        aioVar52.am = obtainStyledAttributes.getBoolean(index, aioVar52.am);
                        break;
                    case 81:
                        aio aioVar53 = ainVar.d;
                        aioVar53.an = obtainStyledAttributes.getBoolean(index, aioVar53.an);
                        break;
                    case 82:
                        aip aipVar5 = ainVar.c;
                        aipVar5.d = obtainStyledAttributes.getInteger(index, aipVar5.d);
                        break;
                    case 83:
                        air airVar12 = ainVar.e;
                        airVar12.j = a(obtainStyledAttributes, index, airVar12.j);
                        break;
                    case 84:
                        aip aipVar6 = ainVar.c;
                        aipVar6.l = obtainStyledAttributes.getInteger(index, aipVar6.l);
                        break;
                    case 85:
                        aip aipVar7 = ainVar.c;
                        aipVar7.k = obtainStyledAttributes.getFloat(index, aipVar7.k);
                        break;
                    case 86:
                        TypedValue peekValue = obtainStyledAttributes.peekValue(index);
                        if (peekValue.type == 1) {
                            ainVar.c.o = obtainStyledAttributes.getResourceId(index, -1);
                            aip aipVar8 = ainVar.c;
                            if (aipVar8.o != -1) {
                                aipVar8.n = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (peekValue.type == 3) {
                            ainVar.c.m = obtainStyledAttributes.getString(index);
                            if (ainVar.c.m.indexOf("/") > 0) {
                                ainVar.c.o = obtainStyledAttributes.getResourceId(index, -1);
                                ainVar.c.n = -2;
                                break;
                            } else {
                                ainVar.c.n = -1;
                                break;
                            }
                        } else {
                            aip aipVar9 = ainVar.c;
                            aipVar9.n = obtainStyledAttributes.getInteger(index, aipVar9.o);
                            break;
                        }
                    case 87:
                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 88:
                    case 89:
                    case 90:
                    default:
                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                        break;
                    case 91:
                        aio aioVar54 = ainVar.d;
                        aioVar54.r = a(obtainStyledAttributes, index, aioVar54.r);
                        break;
                    case 92:
                        aio aioVar55 = ainVar.d;
                        aioVar55.s = a(obtainStyledAttributes, index, aioVar55.s);
                        break;
                    case 93:
                        aio aioVar56 = ainVar.d;
                        aioVar56.M = obtainStyledAttributes.getDimensionPixelSize(index, aioVar56.M);
                        break;
                    case 94:
                        aio aioVar57 = ainVar.d;
                        aioVar57.T = obtainStyledAttributes.getDimensionPixelSize(index, aioVar57.T);
                        break;
                    case 95:
                        e(ainVar.d, obtainStyledAttributes, index, 0);
                        break;
                    case 96:
                        e(ainVar.d, obtainStyledAttributes, index, 1);
                        break;
                    case 97:
                        aio aioVar58 = ainVar.d;
                        aioVar58.ap = obtainStyledAttributes.getInt(index, aioVar58.ap);
                        break;
                }
            }
        }
        obtainStyledAttributes.recycle();
        return ainVar;
    }

    private static void i(ain ainVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        aim aimVar = new aim();
        ainVar.g = aimVar;
        ainVar.c.b = false;
        ainVar.d.c = false;
        ainVar.b.a = false;
        ainVar.e.b = false;
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            switch (d.get(index)) {
                case 2:
                    aimVar.b(2, typedArray.getDimensionPixelSize(index, ainVar.d.f52J));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + c.get(index));
                    break;
                case 5:
                    aimVar.c(5, typedArray.getString(index));
                    break;
                case 6:
                    aimVar.b(6, typedArray.getDimensionPixelOffset(index, ainVar.d.D));
                    break;
                case 7:
                    aimVar.b(7, typedArray.getDimensionPixelOffset(index, ainVar.d.E));
                    break;
                case 8:
                    aimVar.b(8, typedArray.getDimensionPixelSize(index, ainVar.d.K));
                    break;
                case 11:
                    aimVar.b(11, typedArray.getDimensionPixelSize(index, ainVar.d.Q));
                    break;
                case 12:
                    aimVar.b(12, typedArray.getDimensionPixelSize(index, ainVar.d.R));
                    break;
                case 13:
                    aimVar.b(13, typedArray.getDimensionPixelSize(index, ainVar.d.N));
                    break;
                case 14:
                    aimVar.b(14, typedArray.getDimensionPixelSize(index, ainVar.d.P));
                    break;
                case 15:
                    aimVar.b(15, typedArray.getDimensionPixelSize(index, ainVar.d.S));
                    break;
                case 16:
                    aimVar.b(16, typedArray.getDimensionPixelSize(index, ainVar.d.O));
                    break;
                case 17:
                    aimVar.b(17, typedArray.getDimensionPixelOffset(index, ainVar.d.f));
                    break;
                case 18:
                    aimVar.b(18, typedArray.getDimensionPixelOffset(index, ainVar.d.g));
                    break;
                case 19:
                    aimVar.a(19, typedArray.getFloat(index, ainVar.d.h));
                    break;
                case 20:
                    aimVar.a(20, typedArray.getFloat(index, ainVar.d.x));
                    break;
                case 21:
                    aimVar.b(21, typedArray.getLayoutDimension(index, ainVar.d.e));
                    break;
                case 22:
                    aimVar.b(22, a[typedArray.getInt(index, ainVar.b.b)]);
                    break;
                case 23:
                    aimVar.b(23, typedArray.getLayoutDimension(index, ainVar.d.d));
                    break;
                case 24:
                    aimVar.b(24, typedArray.getDimensionPixelSize(index, ainVar.d.G));
                    break;
                case 27:
                    aimVar.b(27, typedArray.getInt(index, ainVar.d.F));
                    break;
                case 28:
                    aimVar.b(28, typedArray.getDimensionPixelSize(index, ainVar.d.H));
                    break;
                case 31:
                    aimVar.b(31, typedArray.getDimensionPixelSize(index, ainVar.d.L));
                    break;
                case 34:
                    aimVar.b(34, typedArray.getDimensionPixelSize(index, ainVar.d.I));
                    break;
                case 37:
                    aimVar.a(37, typedArray.getFloat(index, ainVar.d.y));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, ainVar.a);
                    ainVar.a = resourceId;
                    aimVar.b(38, resourceId);
                    break;
                case 39:
                    aimVar.a(39, typedArray.getFloat(index, ainVar.d.V));
                    break;
                case 40:
                    aimVar.a(40, typedArray.getFloat(index, ainVar.d.U));
                    break;
                case 41:
                    aimVar.b(41, typedArray.getInt(index, ainVar.d.W));
                    break;
                case 42:
                    aimVar.b(42, typedArray.getInt(index, ainVar.d.X));
                    break;
                case 43:
                    aimVar.a(43, typedArray.getFloat(index, ainVar.b.d));
                    break;
                case 44:
                    aimVar.d(44, true);
                    aimVar.a(44, typedArray.getDimension(index, ainVar.e.o));
                    break;
                case 45:
                    aimVar.a(45, typedArray.getFloat(index, ainVar.e.d));
                    break;
                case 46:
                    aimVar.a(46, typedArray.getFloat(index, ainVar.e.e));
                    break;
                case 47:
                    aimVar.a(47, typedArray.getFloat(index, ainVar.e.f));
                    break;
                case 48:
                    aimVar.a(48, typedArray.getFloat(index, ainVar.e.g));
                    break;
                case 49:
                    aimVar.a(49, typedArray.getDimension(index, ainVar.e.h));
                    break;
                case 50:
                    aimVar.a(50, typedArray.getDimension(index, ainVar.e.i));
                    break;
                case 51:
                    aimVar.a(51, typedArray.getDimension(index, ainVar.e.k));
                    break;
                case 52:
                    aimVar.a(52, typedArray.getDimension(index, ainVar.e.l));
                    break;
                case 53:
                    aimVar.a(53, typedArray.getDimension(index, ainVar.e.m));
                    break;
                case 54:
                    aimVar.b(54, typedArray.getInt(index, ainVar.d.Y));
                    break;
                case 55:
                    aimVar.b(55, typedArray.getInt(index, ainVar.d.Z));
                    break;
                case 56:
                    aimVar.b(56, typedArray.getDimensionPixelSize(index, ainVar.d.aa));
                    break;
                case 57:
                    aimVar.b(57, typedArray.getDimensionPixelSize(index, ainVar.d.ab));
                    break;
                case 58:
                    aimVar.b(58, typedArray.getDimensionPixelSize(index, ainVar.d.ac));
                    break;
                case 59:
                    aimVar.b(59, typedArray.getDimensionPixelSize(index, ainVar.d.ad));
                    break;
                case 60:
                    aimVar.a(60, typedArray.getFloat(index, ainVar.e.c));
                    break;
                case 62:
                    aimVar.b(62, typedArray.getDimensionPixelSize(index, ainVar.d.B));
                    break;
                case 63:
                    aimVar.a(63, typedArray.getFloat(index, ainVar.d.C));
                    break;
                case 64:
                    aimVar.b(64, a(typedArray, index, ainVar.c.c));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aimVar.c(65, typedArray.getString(index));
                        break;
                    } else {
                        aimVar.c(65, ahd.a[typedArray.getInteger(index, 0)]);
                        break;
                    }
                case 66:
                    aimVar.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    aimVar.a(67, typedArray.getFloat(index, ainVar.c.j));
                    break;
                case 68:
                    aimVar.a(68, typedArray.getFloat(index, ainVar.b.e));
                    break;
                case 69:
                    aimVar.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    aimVar.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    aimVar.b(72, typedArray.getInt(index, ainVar.d.ag));
                    break;
                case 73:
                    aimVar.b(73, typedArray.getDimensionPixelSize(index, ainVar.d.ah));
                    break;
                case 74:
                    aimVar.c(74, typedArray.getString(index));
                    break;
                case 75:
                    aimVar.d(75, typedArray.getBoolean(index, ainVar.d.ao));
                    break;
                case 76:
                    aimVar.b(76, typedArray.getInt(index, ainVar.c.f));
                    break;
                case 77:
                    aimVar.c(77, typedArray.getString(index));
                    break;
                case 78:
                    aimVar.b(78, typedArray.getInt(index, ainVar.b.c));
                    break;
                case 79:
                    aimVar.a(79, typedArray.getFloat(index, ainVar.c.h));
                    break;
                case 80:
                    aimVar.d(80, typedArray.getBoolean(index, ainVar.d.am));
                    break;
                case 81:
                    aimVar.d(81, typedArray.getBoolean(index, ainVar.d.an));
                    break;
                case 82:
                    aimVar.b(82, typedArray.getInteger(index, ainVar.c.d));
                    break;
                case 83:
                    aimVar.b(83, a(typedArray, index, ainVar.e.j));
                    break;
                case 84:
                    aimVar.b(84, typedArray.getInteger(index, ainVar.c.l));
                    break;
                case 85:
                    aimVar.a(85, typedArray.getFloat(index, ainVar.c.k));
                    break;
                case 86:
                    TypedValue peekValue = typedArray.peekValue(index);
                    if (peekValue.type == 1) {
                        ainVar.c.o = typedArray.getResourceId(index, -1);
                        aimVar.b(89, ainVar.c.o);
                        aip aipVar = ainVar.c;
                        if (aipVar.o != -1) {
                            aipVar.n = -2;
                            aimVar.b(88, -2);
                            break;
                        } else {
                            break;
                        }
                    } else if (peekValue.type == 3) {
                        ainVar.c.m = typedArray.getString(index);
                        aimVar.c(90, ainVar.c.m);
                        if (ainVar.c.m.indexOf("/") > 0) {
                            ainVar.c.o = typedArray.getResourceId(index, -1);
                            aimVar.b(89, ainVar.c.o);
                            ainVar.c.n = -2;
                            aimVar.b(88, -2);
                            break;
                        } else {
                            ainVar.c.n = -1;
                            aimVar.b(88, -1);
                            break;
                        }
                    } else {
                        aip aipVar2 = ainVar.c;
                        aipVar2.n = typedArray.getInteger(index, aipVar2.o);
                        aimVar.b(88, ainVar.c.n);
                        break;
                    }
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + c.get(index));
                    break;
                case 93:
                    aimVar.b(93, typedArray.getDimensionPixelSize(index, ainVar.d.M));
                    break;
                case 94:
                    aimVar.b(94, typedArray.getDimensionPixelSize(index, ainVar.d.T));
                    break;
                case 95:
                    e(aimVar, typedArray, index, 0);
                    break;
                case 96:
                    e(aimVar, typedArray, index, 1);
                    break;
                case 97:
                    aimVar.b(97, typedArray.getInt(index, ainVar.d.ap));
                    break;
                case 98:
                    if (typedArray.peekValue(index).type == 3) {
                        typedArray.getString(index);
                        break;
                    } else {
                        ainVar.a = typedArray.getResourceId(index, ainVar.a);
                        break;
                    }
            }
        }
    }

    public final void b(Context context, int i) {
        ais aisVar = this;
        ConstraintLayout constraintLayout = (ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        int childCount = constraintLayout.getChildCount();
        aisVar.b.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            aii aiiVar = (aii) childAt.getLayoutParams();
            int id = childAt.getId();
            if (id != -1) {
                HashMap hashMap = aisVar.b;
                Integer valueOf = Integer.valueOf(id);
                if (!hashMap.containsKey(valueOf)) {
                    aisVar.b.put(valueOf, new ain());
                }
                ain ainVar = (ain) aisVar.b.get(valueOf);
                if (ainVar != null) {
                    HashMap hashMap2 = aisVar.e;
                    HashMap hashMap3 = new HashMap();
                    Class<?> cls = childAt.getClass();
                    for (String str : hashMap2.keySet()) {
                        aif aifVar = (aif) hashMap2.get(str);
                        try {
                        } catch (IllegalAccessException e) {
                            e = e;
                        } catch (NoSuchMethodException e2) {
                            e = e2;
                        } catch (InvocationTargetException e3) {
                            e = e3;
                        }
                        if (str.equals("BackgroundColor")) {
                            hashMap3.put(str, new aif(aifVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                        } else {
                            try {
                                hashMap3.put(str, new aif(aifVar, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                            } catch (IllegalAccessException e4) {
                                e = e4;
                                e.printStackTrace();
                            } catch (NoSuchMethodException e5) {
                                e = e5;
                                e.printStackTrace();
                            } catch (InvocationTargetException e6) {
                                e = e6;
                                e.printStackTrace();
                            }
                        }
                    }
                    ainVar.f = hashMap3;
                    ainVar.a = id;
                    aio aioVar = ainVar.d;
                    aioVar.i = aiiVar.d;
                    aioVar.j = aiiVar.e;
                    aioVar.k = aiiVar.f;
                    aioVar.l = aiiVar.g;
                    aioVar.m = aiiVar.h;
                    aioVar.n = aiiVar.i;
                    aioVar.o = aiiVar.j;
                    aioVar.p = aiiVar.k;
                    aioVar.q = aiiVar.l;
                    aioVar.r = aiiVar.m;
                    aioVar.s = aiiVar.n;
                    aioVar.t = aiiVar.r;
                    aioVar.u = aiiVar.s;
                    aioVar.v = aiiVar.t;
                    aioVar.w = aiiVar.u;
                    aioVar.x = aiiVar.D;
                    aioVar.y = aiiVar.E;
                    aioVar.z = aiiVar.F;
                    aioVar.A = aiiVar.o;
                    aioVar.B = aiiVar.p;
                    aioVar.C = aiiVar.q;
                    aioVar.D = aiiVar.S;
                    aioVar.E = aiiVar.T;
                    aioVar.F = aiiVar.U;
                    aioVar.h = aiiVar.c;
                    aioVar.f = aiiVar.a;
                    aioVar.g = aiiVar.b;
                    aioVar.d = aiiVar.width;
                    ainVar.d.e = aiiVar.height;
                    ainVar.d.G = aiiVar.leftMargin;
                    ainVar.d.H = aiiVar.rightMargin;
                    ainVar.d.I = aiiVar.topMargin;
                    ainVar.d.f52J = aiiVar.bottomMargin;
                    aio aioVar2 = ainVar.d;
                    aioVar2.M = aiiVar.C;
                    aioVar2.U = aiiVar.H;
                    aioVar2.V = aiiVar.G;
                    aioVar2.X = aiiVar.f50J;
                    aioVar2.W = aiiVar.I;
                    aioVar2.am = aiiVar.V;
                    aioVar2.an = aiiVar.W;
                    aioVar2.Y = aiiVar.K;
                    aioVar2.Z = aiiVar.L;
                    aioVar2.aa = aiiVar.O;
                    aioVar2.ab = aiiVar.P;
                    aioVar2.ac = aiiVar.M;
                    aioVar2.ad = aiiVar.N;
                    aioVar2.ae = aiiVar.Q;
                    aioVar2.af = aiiVar.R;
                    aioVar2.al = aiiVar.X;
                    aioVar2.O = aiiVar.w;
                    aioVar2.Q = aiiVar.y;
                    aioVar2.N = aiiVar.v;
                    aioVar2.P = aiiVar.x;
                    aioVar2.S = aiiVar.z;
                    aioVar2.R = aiiVar.A;
                    aioVar2.T = aiiVar.B;
                    aioVar2.ap = aiiVar.Y;
                    aioVar2.K = aiiVar.getMarginEnd();
                    ainVar.d.L = aiiVar.getMarginStart();
                    ainVar.b.b = childAt.getVisibility();
                    ainVar.b.d = childAt.getAlpha();
                    ainVar.e.c = childAt.getRotation();
                    ainVar.e.d = childAt.getRotationX();
                    ainVar.e.e = childAt.getRotationY();
                    ainVar.e.f = childAt.getScaleX();
                    ainVar.e.g = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != 0.0d || pivotY != 0.0d) {
                        air airVar = ainVar.e;
                        airVar.h = pivotX;
                        airVar.i = pivotY;
                    }
                    ainVar.e.k = childAt.getTranslationX();
                    ainVar.e.l = childAt.getTranslationY();
                    ainVar.e.m = childAt.getTranslationZ();
                    air airVar2 = ainVar.e;
                    if (airVar2.n) {
                        airVar2.o = childAt.getElevation();
                    }
                    if (childAt instanceof aie) {
                        aie aieVar = (aie) childAt;
                        aio aioVar3 = ainVar.d;
                        aioVar3.ao = aieVar.b.b;
                        aioVar3.aj = Arrays.copyOf(aieVar.c, aieVar.d);
                        aio aioVar4 = ainVar.d;
                        aioVar4.ag = aieVar.a;
                        aioVar4.ah = aieVar.b.c;
                    }
                }
                i2++;
                aisVar = this;
            } else {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
        }
    }

    public final void c(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    ain h = h(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        h.d.b = true;
                    }
                    this.b.put(Integer.valueOf(h.a), h);
                    continue;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void d(Context context, XmlPullParser xmlPullParser) {
        char c2;
        Object obj;
        char c3;
        try {
            int eventType = xmlPullParser.getEventType();
            ain ainVar = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    int i = 2;
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        int i2 = 7;
                        switch (name.hashCode()) {
                            case -2025855158:
                                if (name.equals("Layout")) {
                                    c2 = 6;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1984451626:
                                if (name.equals("Motion")) {
                                    c2 = 7;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1962203927:
                                if (name.equals("ConstraintOverride")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1269513683:
                                if (name.equals("PropertySet")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -1238332596:
                                if (name.equals("Transform")) {
                                    c2 = 5;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case -71750448:
                                if (name.equals("Guideline")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 366511058:
                                if (name.equals("CustomMethod")) {
                                    c2 = '\t';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1331510167:
                                if (name.equals("Barrier")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1791837707:
                                if (name.equals("CustomAttribute")) {
                                    c2 = '\b';
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 1803088381:
                                if (name.equals("Constraint")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            default:
                                c2 = 65535;
                                break;
                        }
                        switch (c2) {
                            case 0:
                                ainVar = h(context, Xml.asAttributeSet(xmlPullParser), false);
                                break;
                            case 1:
                                ainVar = h(context, Xml.asAttributeSet(xmlPullParser), true);
                                break;
                            case 2:
                                ainVar = h(context, Xml.asAttributeSet(xmlPullParser), false);
                                aio aioVar = ainVar.d;
                                aioVar.b = true;
                                aioVar.c = true;
                                break;
                            case 3:
                                ainVar = h(context, Xml.asAttributeSet(xmlPullParser), false);
                                ainVar.d.ai = 1;
                                break;
                            case 4:
                                if (ainVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aiq aiqVar = ainVar.b;
                                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), aix.g);
                                aiqVar.a = true;
                                int indexCount = obtainStyledAttributes.getIndexCount();
                                for (int i3 = 0; i3 < indexCount; i3++) {
                                    int index = obtainStyledAttributes.getIndex(i3);
                                    if (index == 1) {
                                        aiqVar.d = obtainStyledAttributes.getFloat(1, aiqVar.d);
                                    } else if (index == 0) {
                                        aiqVar.b = obtainStyledAttributes.getInt(0, aiqVar.b);
                                        aiqVar.b = a[aiqVar.b];
                                    } else {
                                        if (index == 4) {
                                            aiqVar.c = obtainStyledAttributes.getInt(4, aiqVar.c);
                                        } else if (index == 3) {
                                            aiqVar.e = obtainStyledAttributes.getFloat(3, aiqVar.e);
                                        }
                                    }
                                }
                                obtainStyledAttributes.recycle();
                                break;
                            case 5:
                                if (ainVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                air airVar = ainVar.e;
                                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), aix.i);
                                airVar.b = true;
                                int indexCount2 = obtainStyledAttributes2.getIndexCount();
                                for (int i4 = 0; i4 < indexCount2; i4++) {
                                    int index2 = obtainStyledAttributes2.getIndex(i4);
                                    switch (air.a.get(index2)) {
                                        case 1:
                                            airVar.c = obtainStyledAttributes2.getFloat(index2, airVar.c);
                                            break;
                                        case 2:
                                            airVar.d = obtainStyledAttributes2.getFloat(index2, airVar.d);
                                            break;
                                        case 3:
                                            airVar.e = obtainStyledAttributes2.getFloat(index2, airVar.e);
                                            break;
                                        case 4:
                                            airVar.f = obtainStyledAttributes2.getFloat(index2, airVar.f);
                                            break;
                                        case 5:
                                            airVar.g = obtainStyledAttributes2.getFloat(index2, airVar.g);
                                            break;
                                        case 6:
                                            airVar.h = obtainStyledAttributes2.getDimension(index2, airVar.h);
                                            break;
                                        case 7:
                                            airVar.i = obtainStyledAttributes2.getDimension(index2, airVar.i);
                                            break;
                                        case 8:
                                            airVar.k = obtainStyledAttributes2.getDimension(index2, airVar.k);
                                            break;
                                        case 9:
                                            airVar.l = obtainStyledAttributes2.getDimension(index2, airVar.l);
                                            break;
                                        case 10:
                                            airVar.m = obtainStyledAttributes2.getDimension(index2, airVar.m);
                                            break;
                                        case 11:
                                            airVar.n = true;
                                            airVar.o = obtainStyledAttributes2.getDimension(index2, airVar.o);
                                            break;
                                        case 12:
                                            airVar.j = a(obtainStyledAttributes2, index2, airVar.j);
                                            break;
                                    }
                                }
                                obtainStyledAttributes2.recycle();
                                break;
                            case 6:
                                if (ainVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aio aioVar2 = ainVar.d;
                                TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), aix.e);
                                aioVar2.c = true;
                                int indexCount3 = obtainStyledAttributes3.getIndexCount();
                                for (int i5 = 0; i5 < indexCount3; i5++) {
                                    int index3 = obtainStyledAttributes3.getIndex(i5);
                                    int i6 = aio.a.get(index3);
                                    if (i6 != 80) {
                                        if (i6 != 81) {
                                            if (i6 == 97) {
                                                aioVar2.ap = obtainStyledAttributes3.getInt(index3, aioVar2.ap);
                                            } else {
                                                switch (i6) {
                                                    case 1:
                                                        aioVar2.q = a(obtainStyledAttributes3, index3, aioVar2.q);
                                                        break;
                                                    case 2:
                                                        aioVar2.f52J = obtainStyledAttributes3.getDimensionPixelSize(index3, aioVar2.f52J);
                                                        break;
                                                    case 3:
                                                        aioVar2.p = a(obtainStyledAttributes3, index3, aioVar2.p);
                                                        break;
                                                    case 4:
                                                        aioVar2.o = a(obtainStyledAttributes3, index3, aioVar2.o);
                                                        break;
                                                    case 5:
                                                        aioVar2.z = obtainStyledAttributes3.getString(index3);
                                                        break;
                                                    case 6:
                                                        aioVar2.D = obtainStyledAttributes3.getDimensionPixelOffset(index3, aioVar2.D);
                                                        break;
                                                    case 7:
                                                        aioVar2.E = obtainStyledAttributes3.getDimensionPixelOffset(index3, aioVar2.E);
                                                        break;
                                                    case 8:
                                                        aioVar2.K = obtainStyledAttributes3.getDimensionPixelSize(index3, aioVar2.K);
                                                        break;
                                                    case 9:
                                                        aioVar2.w = a(obtainStyledAttributes3, index3, aioVar2.w);
                                                        break;
                                                    case 10:
                                                        aioVar2.v = a(obtainStyledAttributes3, index3, aioVar2.v);
                                                        break;
                                                    case 11:
                                                        aioVar2.Q = obtainStyledAttributes3.getDimensionPixelSize(index3, aioVar2.Q);
                                                        break;
                                                    case 12:
                                                        aioVar2.R = obtainStyledAttributes3.getDimensionPixelSize(index3, aioVar2.R);
                                                        break;
                                                    case 13:
                                                        aioVar2.N = obtainStyledAttributes3.getDimensionPixelSize(index3, aioVar2.N);
                                                        break;
                                                    case 14:
                                                        aioVar2.P = obtainStyledAttributes3.getDimensionPixelSize(index3, aioVar2.P);
                                                        break;
                                                    case 15:
                                                        aioVar2.S = obtainStyledAttributes3.getDimensionPixelSize(index3, aioVar2.S);
                                                        break;
                                                    case 16:
                                                        aioVar2.O = obtainStyledAttributes3.getDimensionPixelSize(index3, aioVar2.O);
                                                        break;
                                                    case 17:
                                                        aioVar2.f = obtainStyledAttributes3.getDimensionPixelOffset(index3, aioVar2.f);
                                                        break;
                                                    case 18:
                                                        aioVar2.g = obtainStyledAttributes3.getDimensionPixelOffset(index3, aioVar2.g);
                                                        break;
                                                    case 19:
                                                        aioVar2.h = obtainStyledAttributes3.getFloat(index3, aioVar2.h);
                                                        break;
                                                    case 20:
                                                        aioVar2.x = obtainStyledAttributes3.getFloat(index3, aioVar2.x);
                                                        break;
                                                    case 21:
                                                        aioVar2.e = obtainStyledAttributes3.getLayoutDimension(index3, aioVar2.e);
                                                        break;
                                                    case 22:
                                                        aioVar2.d = obtainStyledAttributes3.getLayoutDimension(index3, aioVar2.d);
                                                        break;
                                                    case 23:
                                                        aioVar2.G = obtainStyledAttributes3.getDimensionPixelSize(index3, aioVar2.G);
                                                        break;
                                                    case 24:
                                                        aioVar2.i = a(obtainStyledAttributes3, index3, aioVar2.i);
                                                        break;
                                                    case 25:
                                                        aioVar2.j = a(obtainStyledAttributes3, index3, aioVar2.j);
                                                        break;
                                                    case 26:
                                                        aioVar2.F = obtainStyledAttributes3.getInt(index3, aioVar2.F);
                                                        break;
                                                    case 27:
                                                        aioVar2.H = obtainStyledAttributes3.getDimensionPixelSize(index3, aioVar2.H);
                                                        break;
                                                    case 28:
                                                        aioVar2.k = a(obtainStyledAttributes3, index3, aioVar2.k);
                                                        break;
                                                    case 29:
                                                        aioVar2.l = a(obtainStyledAttributes3, index3, aioVar2.l);
                                                        break;
                                                    case 30:
                                                        aioVar2.L = obtainStyledAttributes3.getDimensionPixelSize(index3, aioVar2.L);
                                                        break;
                                                    case 31:
                                                        aioVar2.t = a(obtainStyledAttributes3, index3, aioVar2.t);
                                                        break;
                                                    case 32:
                                                        aioVar2.u = a(obtainStyledAttributes3, index3, aioVar2.u);
                                                        break;
                                                    case 33:
                                                        aioVar2.I = obtainStyledAttributes3.getDimensionPixelSize(index3, aioVar2.I);
                                                        break;
                                                    case 34:
                                                        aioVar2.n = a(obtainStyledAttributes3, index3, aioVar2.n);
                                                        break;
                                                    case 35:
                                                        aioVar2.m = a(obtainStyledAttributes3, index3, aioVar2.m);
                                                        break;
                                                    case 36:
                                                        aioVar2.y = obtainStyledAttributes3.getFloat(index3, aioVar2.y);
                                                        break;
                                                    case 37:
                                                        aioVar2.V = obtainStyledAttributes3.getFloat(index3, aioVar2.V);
                                                        break;
                                                    case 38:
                                                        aioVar2.U = obtainStyledAttributes3.getFloat(index3, aioVar2.U);
                                                        break;
                                                    case 39:
                                                        aioVar2.W = obtainStyledAttributes3.getInt(index3, aioVar2.W);
                                                        break;
                                                    case 40:
                                                        aioVar2.X = obtainStyledAttributes3.getInt(index3, aioVar2.X);
                                                        break;
                                                    case 41:
                                                        e(aioVar2, obtainStyledAttributes3, index3, 0);
                                                        break;
                                                    case 42:
                                                        e(aioVar2, obtainStyledAttributes3, index3, 1);
                                                        break;
                                                    default:
                                                        switch (i6) {
                                                            case 54:
                                                                aioVar2.Y = obtainStyledAttributes3.getInt(index3, aioVar2.Y);
                                                                break;
                                                            case 55:
                                                                aioVar2.Z = obtainStyledAttributes3.getInt(index3, aioVar2.Z);
                                                                break;
                                                            case 56:
                                                                aioVar2.aa = obtainStyledAttributes3.getDimensionPixelSize(index3, aioVar2.aa);
                                                                break;
                                                            case 57:
                                                                aioVar2.ab = obtainStyledAttributes3.getDimensionPixelSize(index3, aioVar2.ab);
                                                                break;
                                                            case 58:
                                                                aioVar2.ac = obtainStyledAttributes3.getDimensionPixelSize(index3, aioVar2.ac);
                                                                break;
                                                            case 59:
                                                                aioVar2.ad = obtainStyledAttributes3.getDimensionPixelSize(index3, aioVar2.ad);
                                                                break;
                                                            default:
                                                                switch (i6) {
                                                                    case 61:
                                                                        aioVar2.A = a(obtainStyledAttributes3, index3, aioVar2.A);
                                                                        break;
                                                                    case 62:
                                                                        aioVar2.B = obtainStyledAttributes3.getDimensionPixelSize(index3, aioVar2.B);
                                                                        break;
                                                                    case 63:
                                                                        aioVar2.C = obtainStyledAttributes3.getFloat(index3, aioVar2.C);
                                                                        break;
                                                                    default:
                                                                        switch (i6) {
                                                                            case 69:
                                                                                aioVar2.ae = obtainStyledAttributes3.getFloat(index3, 1.0f);
                                                                                break;
                                                                            case 70:
                                                                                aioVar2.af = obtainStyledAttributes3.getFloat(index3, 1.0f);
                                                                                break;
                                                                            case 71:
                                                                                Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                                                break;
                                                                            case 72:
                                                                                aioVar2.ag = obtainStyledAttributes3.getInt(index3, aioVar2.ag);
                                                                                break;
                                                                            case 73:
                                                                                aioVar2.ah = obtainStyledAttributes3.getDimensionPixelSize(index3, aioVar2.ah);
                                                                                break;
                                                                            case 74:
                                                                                aioVar2.ak = obtainStyledAttributes3.getString(index3);
                                                                                break;
                                                                            case 75:
                                                                                aioVar2.ao = obtainStyledAttributes3.getBoolean(index3, aioVar2.ao);
                                                                                break;
                                                                            case 76:
                                                                                Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index3) + "   " + aio.a.get(index3));
                                                                                break;
                                                                            case 77:
                                                                                aioVar2.al = obtainStyledAttributes3.getString(index3);
                                                                                break;
                                                                            default:
                                                                                switch (i6) {
                                                                                    case 91:
                                                                                        aioVar2.r = a(obtainStyledAttributes3, index3, aioVar2.r);
                                                                                        break;
                                                                                    case 92:
                                                                                        aioVar2.s = a(obtainStyledAttributes3, index3, aioVar2.s);
                                                                                        break;
                                                                                    case 93:
                                                                                        aioVar2.M = obtainStyledAttributes3.getDimensionPixelSize(index3, aioVar2.M);
                                                                                        break;
                                                                                    case 94:
                                                                                        aioVar2.T = obtainStyledAttributes3.getDimensionPixelSize(index3, aioVar2.T);
                                                                                        break;
                                                                                    default:
                                                                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index3) + "   " + aio.a.get(index3));
                                                                                        break;
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                            }
                                        } else {
                                            aioVar2.an = obtainStyledAttributes3.getBoolean(index3, aioVar2.an);
                                        }
                                    } else {
                                        aioVar2.am = obtainStyledAttributes3.getBoolean(index3, aioVar2.am);
                                    }
                                }
                                obtainStyledAttributes3.recycle();
                                break;
                            case 7:
                                if (ainVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aip aipVar = ainVar.c;
                                TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), aix.f);
                                aipVar.b = true;
                                int indexCount4 = obtainStyledAttributes4.getIndexCount();
                                for (int i7 = 0; i7 < indexCount4; i7++) {
                                    int index4 = obtainStyledAttributes4.getIndex(i7);
                                    switch (aip.a.get(index4)) {
                                        case 1:
                                            aipVar.j = obtainStyledAttributes4.getFloat(index4, aipVar.j);
                                            break;
                                        case 2:
                                            aipVar.f = obtainStyledAttributes4.getInt(index4, aipVar.f);
                                            break;
                                        case 3:
                                            if (obtainStyledAttributes4.peekValue(index4).type == 3) {
                                                aipVar.e = obtainStyledAttributes4.getString(index4);
                                                break;
                                            } else {
                                                aipVar.e = ahd.a[obtainStyledAttributes4.getInteger(index4, 0)];
                                                break;
                                            }
                                        case 4:
                                            aipVar.g = obtainStyledAttributes4.getInt(index4, 0);
                                            break;
                                        case 5:
                                            aipVar.c = a(obtainStyledAttributes4, index4, aipVar.c);
                                            break;
                                        case 6:
                                            aipVar.d = obtainStyledAttributes4.getInteger(index4, aipVar.d);
                                            break;
                                        case 7:
                                            aipVar.h = obtainStyledAttributes4.getFloat(index4, aipVar.h);
                                            break;
                                        case 8:
                                            aipVar.l = obtainStyledAttributes4.getInteger(index4, aipVar.l);
                                            break;
                                        case 9:
                                            aipVar.k = obtainStyledAttributes4.getFloat(index4, aipVar.k);
                                            break;
                                        case 10:
                                            TypedValue peekValue = obtainStyledAttributes4.peekValue(index4);
                                            if (peekValue.type == 1) {
                                                int resourceId = obtainStyledAttributes4.getResourceId(index4, -1);
                                                aipVar.o = resourceId;
                                                if (resourceId != -1) {
                                                    aipVar.n = -2;
                                                }
                                            } else if (peekValue.type == 3) {
                                                aipVar.m = obtainStyledAttributes4.getString(index4);
                                                if (aipVar.m.indexOf("/") <= 0) {
                                                    aipVar.n = -1;
                                                    break;
                                                } else {
                                                    aipVar.o = obtainStyledAttributes4.getResourceId(index4, -1);
                                                    aipVar.n = -2;
                                                }
                                            } else {
                                                aipVar.n = obtainStyledAttributes4.getInteger(index4, aipVar.o);
                                                break;
                                            }
                                    }
                                }
                                obtainStyledAttributes4.recycle();
                                break;
                            case '\b':
                            case '\t':
                                if (ainVar == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                HashMap hashMap = ainVar.f;
                                TypedArray obtainStyledAttributes5 = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), aix.d);
                                int indexCount5 = obtainStyledAttributes5.getIndexCount();
                                int i8 = 0;
                                String str = null;
                                Object obj2 = null;
                                int i9 = 0;
                                boolean z = false;
                                while (i8 < indexCount5) {
                                    int index5 = obtainStyledAttributes5.getIndex(i8);
                                    if (index5 == 0) {
                                        String string = obtainStyledAttributes5.getString(0);
                                        str = (string == null || string.length() <= 0) ? string : Character.toUpperCase(string.charAt(0)) + string.substring(1);
                                    } else if (index5 == 10) {
                                        str = obtainStyledAttributes5.getString(10);
                                        z = true;
                                    } else if (index5 == 1) {
                                        obj2 = Boolean.valueOf(obtainStyledAttributes5.getBoolean(1, false));
                                        i9 = 6;
                                    } else if (index5 == 3) {
                                        obj2 = Integer.valueOf(obtainStyledAttributes5.getColor(3, 0));
                                        i9 = 3;
                                    } else if (index5 == i) {
                                        obj2 = Integer.valueOf(obtainStyledAttributes5.getColor(i, 0));
                                        i9 = 4;
                                    } else {
                                        if (index5 == i2) {
                                            obj2 = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes5.getDimension(i2, 0.0f), context.getResources().getDisplayMetrics()));
                                        } else if (index5 == 4) {
                                            obj2 = Float.valueOf(obtainStyledAttributes5.getDimension(4, 0.0f));
                                        } else if (index5 == 5) {
                                            obj2 = Float.valueOf(obtainStyledAttributes5.getFloat(5, Float.NaN));
                                            i9 = 2;
                                        } else if (index5 == 6) {
                                            obj2 = Integer.valueOf(obtainStyledAttributes5.getInteger(6, -1));
                                            i9 = 1;
                                        } else if (index5 == 9) {
                                            obj2 = obtainStyledAttributes5.getString(9);
                                            i9 = 5;
                                        } else if (index5 == 8) {
                                            int resourceId2 = obtainStyledAttributes5.getResourceId(8, -1);
                                            if (resourceId2 == -1) {
                                                resourceId2 = obtainStyledAttributes5.getInt(8, -1);
                                            }
                                            obj2 = Integer.valueOf(resourceId2);
                                            i9 = 8;
                                        }
                                        i9 = 7;
                                    }
                                    i8++;
                                    i2 = 7;
                                    i = 2;
                                }
                                String str2 = str;
                                if (str2 != null && (obj = obj2) != null) {
                                    hashMap.put(str2, new aif(str2, i9, obj, z));
                                }
                                obtainStyledAttributes5.recycle();
                                break;
                        }
                    } else if (eventType == 3) {
                        String lowerCase = xmlPullParser.getName().toLowerCase(Locale.ROOT);
                        switch (lowerCase.hashCode()) {
                            case -2075718416:
                                if (lowerCase.equals("guideline")) {
                                    c3 = 3;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -190376483:
                                if (lowerCase.equals("constraint")) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 426575017:
                                if (lowerCase.equals("constraintoverride")) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 2146106725:
                                if (lowerCase.equals("constraintset")) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            default:
                                c3 = 65535;
                                break;
                        }
                        if (c3 == 0) {
                            return;
                        }
                        if (c3 == 1 || c3 == 2 || c3 == 3) {
                            try {
                                this.b.put(Integer.valueOf(ainVar.a), ainVar);
                                ainVar = null;
                            } catch (IOException e) {
                                e = e;
                                e.printStackTrace();
                                return;
                            } catch (XmlPullParserException e2) {
                                e = e2;
                                e.printStackTrace();
                                return;
                            }
                        }
                    }
                } else {
                    xmlPullParser.getName();
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e3) {
            e = e3;
        } catch (XmlPullParserException e4) {
            e = e4;
        }
    }
}
