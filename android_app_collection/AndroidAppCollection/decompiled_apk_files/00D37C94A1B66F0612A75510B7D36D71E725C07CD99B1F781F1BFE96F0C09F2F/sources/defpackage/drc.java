package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: drc  reason: default package */
/* loaded from: classes3.dex */
public final class drc implements Iterable, dqz {
    public final String a;

    public drc(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new IllegalArgumentException("StringValue cannot be null.");
    }

    @Override // defpackage.dqz
    public final dqz d() {
        return new drc(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof drc) {
            return this.a.equals(((drc) obj).a);
        }
        return false;
    }

    @Override // defpackage.dqz
    public final Boolean g() {
        return Boolean.valueOf(!this.a.isEmpty());
    }

    @Override // defpackage.dqz
    public final Double h() {
        if (this.a.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.a);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.dqz
    public final String i() {
        return this.a;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new drb(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.dqz
    public final dqz kr(String str, dpu dpuVar, List list) {
        String str2;
        Object obj;
        String str3;
        String str4;
        char c;
        drc drcVar;
        int i;
        dqz dqrVar;
        double doubleValue;
        Matcher matcher;
        double min;
        double min2;
        drc drcVar2;
        int i2;
        int i3;
        dpu dpuVar2;
        int i4;
        int length;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str)) {
            str2 = "toLocaleUpperCase";
        } else {
            str2 = "toLocaleUpperCase";
            if (!str2.equals(str) && !"trim".equals(str)) {
                throw new IllegalArgumentException(String.format("%s is not a String function", str));
            }
        }
        switch (str.hashCode()) {
            case -1789698943:
                obj = "charAt";
                str3 = "hasOwnProperty";
                if (str.equals(str3)) {
                    str4 = "toString";
                    c = 2;
                    break;
                }
                c = 65535;
                str4 = "toString";
                break;
            case -1776922004:
                obj = "charAt";
                if (str.equals("toString")) {
                    c = 14;
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case -1464939364:
                obj = "charAt";
                if (str.equals("toLocaleLowerCase")) {
                    c = '\f';
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case -1361633751:
                obj = "charAt";
                if (str.equals(obj)) {
                    str3 = "hasOwnProperty";
                    c = 0;
                    str4 = "toString";
                    break;
                }
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case -1354795244:
                if (str.equals("concat")) {
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    c = 1;
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    c = '\r';
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case -906336856:
                if (str.equals("search")) {
                    c = 7;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case -726908483:
                if (str.equals(str2)) {
                    c = 11;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    c = 4;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case -399551817:
                if (str.equals("toUpperCase")) {
                    c = 15;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case 3568674:
                if (str.equals("trim")) {
                    c = 16;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case 103668165:
                if (str.equals("match")) {
                    c = 5;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case 109526418:
                if (str.equals("slice")) {
                    c = '\b';
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case 109648666:
                if (str.equals("split")) {
                    c = '\t';
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case 530542161:
                if (str.equals("substring")) {
                    c = '\n';
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case 1094496948:
                if (str.equals("replace")) {
                    c = 6;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            case 1943291465:
                if (str.equals("indexOf")) {
                    c = 3;
                    obj = "charAt";
                    str3 = "hasOwnProperty";
                    str4 = "toString";
                    break;
                }
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
            default:
                obj = "charAt";
                str3 = "hasOwnProperty";
                c = 65535;
                str4 = "toString";
                break;
        }
        String str5 = "";
        String str6 = "undefined";
        String str7 = obj;
        switch (c) {
            case 0:
                dqt.o(str7, 1, list);
                int e = list.size() > 0 ? (int) dqt.e(dpuVar.b((dqz) list.get(0)).h().doubleValue()) : 0;
                String str8 = this.a;
                if (e < 0 || e >= str8.length()) {
                    return dqz.m;
                }
                return new drc(String.valueOf(str8.charAt(e)));
            case 1:
                drcVar = this;
                if (list.size() != 0) {
                    StringBuilder sb = new StringBuilder(drcVar.a);
                    for (int i5 = 0; i5 < list.size(); i5++) {
                        sb.append(dpuVar.b((dqz) list.get(i5)).i());
                    }
                    return new drc(sb.toString());
                }
                return drcVar;
            case 2:
                dqt.l(str3, 1, list);
                String str9 = this.a;
                dqz b = dpuVar.b((dqz) list.get(0));
                if ("length".equals(b.i())) {
                    return dqp.k;
                }
                double doubleValue2 = b.h().doubleValue();
                return (doubleValue2 != Math.floor(doubleValue2) || (i = (int) doubleValue2) < 0 || i >= str9.length()) ? dqp.l : dqp.k;
            case 3:
                dqt.o("indexOf", 2, list);
                String str10 = this.a;
                if (list.size() > 0) {
                    str6 = dpuVar.b((dqz) list.get(0)).i();
                }
                dqrVar = new dqr(Double.valueOf(str10.indexOf(str6, (int) dqt.e(list.size() < 2 ? 0.0d : dpuVar.b((dqz) list.get(1)).h().doubleValue()))));
                return dqrVar;
            case 4:
                dqt.o("lastIndexOf", 2, list);
                String str11 = this.a;
                if (list.size() > 0) {
                    str6 = dpuVar.b((dqz) list.get(0)).i();
                }
                String str12 = str6;
                return new dqr(Double.valueOf(str11.lastIndexOf(str12, (int) (Double.isNaN(list.size() < 2 ? Double.NaN : dpuVar.b((dqz) list.get(1)).h().doubleValue()) ? Double.POSITIVE_INFINITY : dqt.e(doubleValue)))));
            case 5:
                dqt.o("match", 1, list);
                String str13 = this.a;
                if (list.size() > 0) {
                    str5 = dpuVar.b((dqz) list.get(0)).i();
                }
                Matcher matcher2 = Pattern.compile(str5).matcher(str13);
                return matcher2.find() ? new dqo(new drc(matcher2.group())) : dqz.g;
            case 6:
                drcVar = this;
                dqt.o("replace", 2, list);
                dqz dqzVar = dqz.f;
                if (list.size() > 0) {
                    str6 = dpuVar.b((dqz) list.get(0)).i();
                    if (list.size() > 1) {
                        dqzVar = dpuVar.b((dqz) list.get(1));
                    }
                }
                String str14 = str6;
                String str15 = drcVar.a;
                int indexOf = str15.indexOf(str14);
                if (indexOf >= 0) {
                    if (dqzVar instanceof dqs) {
                        dqzVar = ((dqs) dqzVar).a(dpuVar, Arrays.asList(new drc(str14), new dqr(Double.valueOf(indexOf)), drcVar));
                    }
                    String substring = str15.substring(0, indexOf);
                    String i6 = dqzVar.i();
                    String substring2 = str15.substring(indexOf + str14.length());
                    StringBuilder sb2 = new StringBuilder(String.valueOf(substring).length() + String.valueOf(i6).length() + String.valueOf(substring2).length());
                    sb2.append(substring);
                    sb2.append(i6);
                    sb2.append(substring2);
                    dqrVar = new drc(sb2.toString());
                    return dqrVar;
                }
                return drcVar;
            case 7:
                dqt.o("search", 1, list);
                if (list.size() > 0) {
                    str6 = dpuVar.b((dqz) list.get(0)).i();
                }
                if (Pattern.compile(str6).matcher(this.a).find()) {
                    return new dqr(Double.valueOf(matcher.start()));
                }
                return new dqr(Double.valueOf(-1.0d));
            case '\b':
                dqt.o("slice", 2, list);
                String str16 = this.a;
                double e2 = dqt.e(list.size() > 0 ? dpuVar.b((dqz) list.get(0)).h().doubleValue() : 0.0d);
                if (e2 < 0.0d) {
                    double length2 = str16.length();
                    Double.isNaN(length2);
                    min = Math.max(length2 + e2, 0.0d);
                } else {
                    min = Math.min(e2, str16.length());
                }
                int i7 = (int) min;
                double e3 = dqt.e(list.size() > 1 ? dpuVar.b((dqz) list.get(1)).h().doubleValue() : str16.length());
                if (e3 < 0.0d) {
                    double length3 = str16.length();
                    Double.isNaN(length3);
                    min2 = Math.max(length3 + e3, 0.0d);
                } else {
                    min2 = Math.min(e3, str16.length());
                }
                drcVar2 = new drc(str16.substring(i7, Math.max(0, ((int) min2) - i7) + i7));
                return drcVar2;
            case '\t':
                dqt.o("split", 2, list);
                String str17 = this.a;
                if (str17.length() == 0) {
                    return new dqo(this);
                }
                ArrayList arrayList = new ArrayList();
                if (list.size() == 0) {
                    arrayList.add(this);
                } else {
                    String i8 = dpuVar.b((dqz) list.get(0)).i();
                    long g = list.size() > 1 ? dqt.g(dpuVar.b((dqz) list.get(1)).h().doubleValue()) : 2147483647L;
                    if (g == 0) {
                        return new dqo();
                    }
                    String[] split = str17.split(Pattern.quote(i8), ((int) g) + 1);
                    int length4 = split.length;
                    if (!i8.equals(str5) || length4 <= 0) {
                        i2 = length4;
                        i3 = 0;
                    } else {
                        boolean equals = split[0].equals(str5);
                        i2 = length4 - 1;
                        if (!split[i2].equals(str5)) {
                            i2 = length4;
                        }
                        i3 = equals;
                    }
                    if (length4 > g) {
                        i2--;
                    }
                    for (int i9 = i3; i9 < i2; i9++) {
                        arrayList.add(new drc(split[i9]));
                    }
                }
                return new dqo(arrayList);
            case '\n':
                dqt.o("substring", 2, list);
                String str18 = this.a;
                if (list.size() > 0) {
                    dpuVar2 = dpuVar;
                    i4 = (int) dqt.e(dpuVar2.b((dqz) list.get(0)).h().doubleValue());
                } else {
                    dpuVar2 = dpuVar;
                    i4 = 0;
                }
                if (list.size() > 1) {
                    length = (int) dqt.e(dpuVar2.b((dqz) list.get(1)).h().doubleValue());
                } else {
                    length = str18.length();
                }
                int min3 = Math.min(Math.max(i4, 0), str18.length());
                int min4 = Math.min(Math.max(length, 0), str18.length());
                drcVar2 = new drc(str18.substring(Math.min(min3, min4), Math.max(min3, min4)));
                return drcVar2;
            case 11:
                dqt.l(str2, 0, list);
                return new drc(this.a.toUpperCase());
            case '\f':
                dqt.l("toLocaleLowerCase", 0, list);
                return new drc(this.a.toLowerCase());
            case '\r':
                dqt.l("toLowerCase", 0, list);
                return new drc(this.a.toLowerCase(Locale.ENGLISH));
            case 14:
                drcVar = this;
                dqt.l(str4, 0, list);
                return drcVar;
            case 15:
                dqt.l("toUpperCase", 0, list);
                return new drc(this.a.toUpperCase(Locale.ENGLISH));
            case 16:
                dqt.l("toUpperCase", 0, list);
                return new drc(this.a.trim());
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    @Override // defpackage.dqz
    public final Iterator l() {
        return new drb(this, 1);
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 2);
        sb.append('\"');
        sb.append(str);
        sb.append('\"');
        return sb.toString();
    }
}
