package defpackage;

import java.text.AttributedCharacterIterator;
import java.text.AttributedString;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.FieldPosition;
import java.text.Format;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cr  reason: default package */
/* loaded from: classes5.dex */
public final class cr extends Format {
    private static final String[] h = {"number", "date", "time", "spellout", "ordinal", "duration"};
    private static final String[] i = {"", "currency", "percent", "integer"};
    private static final String[] j = {"", "short", "medium", "long", "full"};
    private static final Locale k = new Locale("");
    static final long serialVersionUID = 7136212545847378652L;
    public transient Locale a;
    public transient dj b;
    public transient Map<Integer, Format> c;
    private transient DateFormat d;
    private transient NumberFormat e;
    private transient cq f;
    private transient cq g;

    public cr(String str, Locale locale) {
        Format numberFormat;
        this.a = locale;
        try {
            dj djVar = this.b;
            if (djVar == null) {
                this.b = new dj(str);
            } else {
                djVar.i(str);
            }
            Map<Integer, Format> map = this.c;
            if (map != null) {
                map.clear();
            }
            int a = this.b.a() - 2;
            int i2 = 1;
            while (i2 < a) {
                di b = this.b.b(i2);
                if (b.e == 6 && b.b() == 2) {
                    int i3 = i2 + 2;
                    dj djVar2 = this.b;
                    int i4 = i3 + 1;
                    String c = djVar2.c(djVar2.b(i3));
                    String str2 = "";
                    di b2 = this.b.b(i4);
                    if (b2.e == 11) {
                        str2 = this.b.c(b2);
                        i4++;
                    }
                    int g = g(c, h);
                    if (g == 0) {
                        int g2 = g(str2, i);
                        if (g2 == 0) {
                            numberFormat = NumberFormat.getInstance(this.a);
                        } else if (g2 == 1) {
                            numberFormat = NumberFormat.getCurrencyInstance(this.a);
                        } else if (g2 == 2) {
                            numberFormat = NumberFormat.getPercentInstance(this.a);
                        } else if (g2 == 3) {
                            numberFormat = NumberFormat.getIntegerInstance(this.a);
                        } else {
                            numberFormat = new DecimalFormat(str2, new DecimalFormatSymbols(this.a));
                        }
                    } else if (g == 1) {
                        int g3 = g(str2, j);
                        if (g3 == 0) {
                            numberFormat = DateFormat.getDateInstance(2, this.a);
                        } else if (g3 == 1) {
                            numberFormat = DateFormat.getDateInstance(3, this.a);
                        } else if (g3 == 2) {
                            numberFormat = DateFormat.getDateInstance(2, this.a);
                        } else if (g3 == 3) {
                            numberFormat = DateFormat.getDateInstance(1, this.a);
                        } else if (g3 == 4) {
                            numberFormat = DateFormat.getDateInstance(0, this.a);
                        } else {
                            numberFormat = new SimpleDateFormat(str2, this.a);
                        }
                    } else if (g == 2) {
                        int g4 = g(str2, j);
                        if (g4 == 0) {
                            numberFormat = DateFormat.getTimeInstance(2, this.a);
                        } else if (g4 == 1) {
                            numberFormat = DateFormat.getTimeInstance(3, this.a);
                        } else if (g4 == 2) {
                            numberFormat = DateFormat.getTimeInstance(2, this.a);
                        } else if (g4 == 3) {
                            numberFormat = DateFormat.getTimeInstance(1, this.a);
                        } else if (g4 == 4) {
                            numberFormat = DateFormat.getTimeInstance(0, this.a);
                        } else {
                            numberFormat = new SimpleDateFormat(str2, this.a);
                        }
                    } else {
                        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 22);
                        sb.append("Unknown format type \"");
                        sb.append(c);
                        sb.append("\"");
                        throw new IllegalArgumentException(sb.toString());
                    }
                    if (this.c == null) {
                        this.c = new HashMap();
                    }
                    this.c.put(Integer.valueOf(i2), numberFormat);
                    i2 = i4;
                }
                i2++;
            }
        } catch (RuntimeException e) {
            dj djVar3 = this.b;
            if (djVar3 != null) {
                djVar3.a = null;
                djVar3.d = false;
                djVar3.b.clear();
                ArrayList<Double> arrayList = djVar3.c;
                if (arrayList != null) {
                    arrayList.clear();
                }
            }
            Map<Integer, Format> map2 = this.c;
            if (map2 != null) {
                map2.clear();
            }
            throw e;
        }
    }

    public static final String a(Locale locale, String str, Object... objArr) {
        StringBuilder sb = new StringBuilder(str.length());
        new cr(str, locale).c(0, null, null, null, objArr, new cm(sb), null);
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0298, code lost:
        r30 = r9;
        r29 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0382, code lost:
        if (r9 == 2) goto L172;
     */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x050f A[LOOP:2: B:118:0x0286->B:255:0x050f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x060b  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x04fe A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void c(int r38, defpackage.cp r39, java.lang.Object[] r40, java.util.Map<java.lang.String, java.lang.Object> r41, java.lang.Object[] r42, defpackage.cm r43, java.text.FieldPosition r44) {
        /*
            Method dump skipped, instructions count: 1613
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cr.c(int, cp, java.lang.Object[], java.util.Map, java.lang.Object[], cm, java.text.FieldPosition):void");
    }

    private final void d(int i2, cp cpVar, Object[] objArr, Map<String, Object> map, Object[] objArr2, cm cmVar) {
        if (this.b.e != 2) {
            c(i2, cpVar, objArr, map, objArr2, cmVar, null);
            return;
        }
        throw new UnsupportedOperationException("JDK apostrophe mode not supported");
    }

    private final void e(Object obj, cm cmVar, FieldPosition fieldPosition) {
        if (obj == null || (obj instanceof Map)) {
            f(null, (Map) obj, cmVar, fieldPosition);
        } else {
            f((Object[]) obj, null, cmVar, fieldPosition);
        }
    }

    private static final int g(String str, String[] strArr) {
        byte[] bArr = ck.a;
        if (str.length() != 0 && (ck.a(str.charAt(0)) || ck.a(str.charAt(str.length() - 1)))) {
            int length = str.length();
            int i2 = 0;
            while (i2 < length && ck.a(str.charAt(i2))) {
                i2++;
            }
            if (i2 < length) {
                while (true) {
                    int i3 = length - 1;
                    if (!ck.a(str.charAt(i3))) {
                        break;
                    }
                    length = i3;
                }
            }
            str = str.substring(i2, length);
        }
        String lowerCase = str.toLowerCase(k);
        for (int i4 = 0; i4 < strArr.length; i4++) {
            if (lowerCase.equals(strArr[i4])) {
                return i4;
            }
        }
        return -1;
    }

    private final void h(String str, ParsePosition parsePosition, Object[] objArr, Map<String, Object> map) {
        String str2;
        Comparable c;
        Comparable comparable;
        short s;
        String str3;
        Object obj;
        Map<Integer, Format> map2;
        dj djVar;
        int i2;
        int i3;
        Format format;
        if (str == null) {
            return;
        }
        dj djVar2 = this.b;
        String str4 = djVar2.a;
        int a = djVar2.b(0).a();
        int index = parsePosition.getIndex();
        ParsePosition parsePosition2 = new ParsePosition(0);
        int i4 = 1;
        int i5 = 1;
        while (true) {
            di b = this.b.b(i5);
            int i6 = b.e;
            int i7 = b.a - a;
            if (i7 != 0 && !str4.regionMatches(a, str, index, i7)) {
                parsePosition.setErrorIndex(index);
                return;
            }
            index += i7;
            if (i6 == 2) {
                parsePosition.setIndex(index);
                return;
            }
            if (i6 == 3 || i6 == 4) {
                str2 = str4;
                a = b.a();
            } else {
                int f = this.b.f(i5);
                int b2 = b.b();
                int i8 = i5 + 1;
                di b3 = this.b.b(i8);
                if (objArr != null) {
                    s = b3.c;
                    comparable = Integer.valueOf(s);
                    c = null;
                } else {
                    c = b3.e == 9 ? this.b.c(b3) : Integer.toString(b3.c);
                    comparable = c;
                    s = 0;
                }
                int i9 = i8 + 1;
                Map<Integer, Format> map3 = this.c;
                if (map3 == null || (format = map3.get(Integer.valueOf(i9 - 2))) == null) {
                    if (b2 == i4 || ((map2 = this.c) != null && map2.containsKey(Integer.valueOf(i9 - 2)))) {
                        str2 = str4;
                        str3 = c;
                        StringBuilder sb = new StringBuilder();
                        dj djVar3 = this.b;
                        String str5 = djVar3.a;
                        int a2 = djVar3.b(f).a();
                        int i10 = f + 1;
                        while (true) {
                            di b4 = this.b.b(i10);
                            int i11 = b4.e;
                            sb.append((CharSequence) str5, a2, b4.a);
                            if (i11 == 6 || i11 == 2) {
                                break;
                            }
                            a2 = b4.a();
                            i10++;
                        }
                        String sb2 = sb.toString();
                        int indexOf = sb2.length() != 0 ? str.indexOf(sb2, index) : str.length();
                        if (indexOf >= 0) {
                            String substring = str.substring(index, indexOf);
                            String obj2 = comparable.toString();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(obj2).length() + 2);
                            sb3.append("{");
                            sb3.append(obj2);
                            sb3.append("}");
                            boolean equals = substring.equals(sb3.toString());
                            index = indexOf;
                            i4 = !equals;
                            obj = true == equals ? null : substring;
                        } else {
                            parsePosition.setErrorIndex(index);
                            return;
                        }
                    } else if (b2 == 3) {
                        parsePosition2.setIndex(index);
                        dj djVar4 = this.b;
                        int index2 = parsePosition2.getIndex();
                        double d = Double.NaN;
                        int i12 = index2;
                        while (true) {
                            if (djVar4.h(i9) == 7) {
                                str2 = str4;
                                str3 = c;
                                break;
                            }
                            double e = djVar4.e(djVar4.b(i9));
                            int i13 = i9 + 2;
                            int f2 = djVar4.f(i13);
                            String str6 = djVar4.a;
                            int i14 = 0;
                            str2 = str4;
                            int a3 = djVar4.b(i13).a();
                            while (true) {
                                i13++;
                                str3 = c;
                                di b5 = djVar4.b(i13);
                                djVar = djVar4;
                                if (i13 != f2 && b5.e != 3) {
                                    c = str3;
                                    djVar4 = djVar;
                                }
                                int i15 = b5.a - a3;
                                if (i15 != 0 && !str.regionMatches(index2, str6, a3, i15)) {
                                    i2 = -1;
                                    break;
                                }
                                i14 += i15;
                                if (i13 == f2) {
                                    i2 = i14;
                                    break;
                                }
                                a3 = b5.a();
                                c = str3;
                                djVar4 = djVar;
                            }
                            if (i2 >= 0 && (i3 = i2 + index2) > i12) {
                                if (i3 == str.length()) {
                                    i12 = i3;
                                    d = e;
                                    break;
                                }
                                i12 = i3;
                                d = e;
                            }
                            i9 = f2 + 1;
                            str4 = str2;
                            c = str3;
                            djVar4 = djVar;
                        }
                        if (i12 == index2) {
                            parsePosition2.setErrorIndex(index2);
                        } else {
                            parsePosition2.setIndex(i12);
                        }
                        if (parsePosition2.getIndex() != index) {
                            obj = Double.valueOf(d);
                            index = parsePosition2.getIndex();
                            i4 = 1;
                        } else {
                            parsePosition.setErrorIndex(index);
                            return;
                        }
                    } else if (dg.b(b2) || b2 == 5) {
                        throw new UnsupportedOperationException("Parsing of plural/select/selectordinal argument is not supported.");
                    } else {
                        String a4 = dg.a(b2);
                        StringBuilder sb4 = new StringBuilder(a4.length() + 19);
                        sb4.append("unexpected argType ");
                        sb4.append(a4);
                        throw new IllegalStateException(sb4.toString());
                    }
                } else {
                    parsePosition2.setIndex(index);
                    obj = format.parseObject(str, parsePosition2);
                    if (parsePosition2.getIndex() != index) {
                        index = parsePosition2.getIndex();
                        str2 = str4;
                        str3 = c;
                    } else {
                        parsePosition.setErrorIndex(index);
                        return;
                    }
                }
                if (i4 != 0) {
                    if (objArr != null) {
                        objArr[s] = obj;
                    } else {
                        if (map != null) {
                            map.put(str3, obj);
                        }
                        a = this.b.b(f).a();
                        i5 = f;
                    }
                }
                a = this.b.b(f).a();
                i5 = f;
            }
            i5++;
            str4 = str2;
            i4 = 1;
        }
    }

    public final NumberFormat b() {
        if (this.e == null) {
            this.e = NumberFormat.getInstance(this.a);
        }
        return this.e;
    }

    @Override // java.text.Format
    public final StringBuffer format(Object obj, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        e(obj, new cm(stringBuffer), fieldPosition);
        return stringBuffer;
    }

    @Override // java.text.Format
    public final AttributedCharacterIterator formatToCharacterIterator(Object obj) {
        if (obj == null) {
            throw new NullPointerException("formatToCharacterIterator must be passed non-null object");
        }
        StringBuilder sb = new StringBuilder();
        cm cmVar = new cm(sb);
        cmVar.c = new ArrayList();
        e(obj, cmVar, null);
        AttributedString attributedString = new AttributedString(sb.toString());
        for (cn cnVar : cmVar.c) {
            attributedString.addAttribute(cnVar.a, cnVar.b, cnVar.c, cnVar.d);
        }
        return attributedString.getIterator();
    }

    public final int hashCode() {
        return this.b.a.hashCode();
    }

    private final void f(Object[] objArr, Map<String, Object> map, cm cmVar, FieldPosition fieldPosition) {
        if (objArr == null || !this.b.d) {
            c(0, null, objArr, map, null, cmVar, fieldPosition);
            return;
        }
        throw new IllegalArgumentException("This method is not available in MessageFormat objects that use alphanumeric argument names.");
    }

    @Override // java.text.Format
    public final Object parseObject(String str, ParsePosition parsePosition) {
        if (this.b.d) {
            HashMap hashMap = new HashMap();
            int index = parsePosition.getIndex();
            h(str, parsePosition, null, hashMap);
            if (parsePosition.getIndex() != index) {
                return hashMap;
            }
            return null;
        }
        int i2 = 0;
        short s = -1;
        while (true) {
            if (i2 != 0) {
                i2 = this.b.f(i2);
            }
            while (true) {
                i2++;
                int h2 = this.b.h(i2);
                if (h2 == 6) {
                    break;
                } else if (h2 == 2) {
                    i2 = -1;
                    break;
                }
            }
            if (i2 < 0) {
                break;
            }
            short s2 = this.b.b(i2 + 1).c;
            if (s2 > s) {
                s = s2;
            }
        }
        Object[] objArr = new Object[s + 1];
        int index2 = parsePosition.getIndex();
        h(str, parsePosition, objArr, null);
        if (parsePosition.getIndex() != index2) {
            return objArr;
        }
        return null;
    }
}
