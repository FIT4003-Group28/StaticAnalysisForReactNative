package defpackage;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: bj  reason: default package */
/* loaded from: classes2.dex */
public final class bj implements Serializable {
    public static final bj a;
    static final Pattern b;
    static final Pattern c;
    static final Pattern d;
    static final Pattern e;
    static final Pattern f;
    static final Pattern g;
    private static final ba i;
    private static final bh j;
    private static final long serialVersionUID = 1;
    public final bi h;

    static {
        ax axVar = new ax();
        i = axVar;
        bh bhVar = new bh("other", axVar, null, null);
        j = bhVar;
        bi biVar = new bi();
        biVar.a(bhVar);
        a = new bj(biVar);
        b = Pattern.compile("\\s*\\Q\\E@\\s*");
        c = Pattern.compile("\\s*or\\s*");
        d = Pattern.compile("\\s*and\\s*");
        e = Pattern.compile("\\s*,\\s*");
        Pattern.compile("\\s*\\Q..\\E\\s*");
        f = Pattern.compile("\\s*~\\s*");
        g = Pattern.compile("\\s*;\\s*");
    }

    private bj(bi biVar) {
        this.h = biVar;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (bh bhVar : biVar.b) {
            linkedHashSet.add(bhVar.a);
        }
        Collections.unmodifiableSet(linkedHashSet);
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x046a  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x0202 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.bh a(java.lang.String r40) {
        /*
            Method dump skipped, instructions count: 1302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj.a(java.lang.String):bh");
    }

    public static bj b(String str) {
        String trim = str.trim();
        if (trim.length() == 0) {
            return a;
        }
        bi biVar = new bi();
        if (trim.endsWith(";")) {
            trim = trim.substring(0, trim.length() - 1);
        }
        for (String str2 : g.split(trim)) {
            bh a2 = a(str2.trim());
            boolean z = biVar.a;
            boolean z2 = true;
            if (a2.c == null && a2.d == null) {
                z2 = false;
            }
            biVar.a = z | z2;
            biVar.a(a2);
        }
        Iterator it = biVar.b.iterator();
        bh bhVar = null;
        while (it.hasNext()) {
            bh bhVar2 = (bh) it.next();
            if ("other".equals(bhVar2.a)) {
                it.remove();
                bhVar = bhVar2;
            }
        }
        if (bhVar == null) {
            bhVar = a("other:");
        }
        biVar.b.add(bhVar);
        return new bj(biVar);
    }

    public static void c(StringBuilder sb, double d2, double d3, boolean z) {
        if (z) {
            sb.append(",");
        }
        if (d2 == d3) {
            sb.append(e(d2));
            return;
        }
        String e2 = e(d2);
        String e3 = e(d3);
        StringBuilder sb2 = new StringBuilder(String.valueOf(e2).length() + 2 + String.valueOf(e3).length());
        sb2.append(e2);
        sb2.append("..");
        sb2.append(e3);
        sb.append(sb2.toString());
    }

    public static bj d(Locale locale, int i2) {
        bk bkVar = bk.a;
        bkVar.d();
        String str = (String) (i2 == 1 ? bkVar.b : bkVar.c).get(locale.getLanguage());
        if (str != null && str.trim().length() != 0) {
            bj c2 = bkVar.c(str);
            return c2 == null ? a : c2;
        }
        return a;
    }

    private static String e(double d2) {
        long j2 = (long) d2;
        return d2 == ((double) j2) ? String.valueOf(j2) : String.valueOf(d2);
    }

    private static String f(String[] strArr, int i2, String str) {
        if (i2 < strArr.length) {
            return strArr[i2];
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 26);
        sb.append("missing token at end of '");
        sb.append(str);
        sb.append("'");
        throw new ParseException(sb.toString(), -1);
    }

    private static ParseException g(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(str2).length());
        sb.append("unexpected token '");
        sb.append(str);
        sb.append("' in '");
        sb.append(str2);
        sb.append("'");
        return new ParseException(sb.toString(), -1);
    }

    public final boolean equals(Object obj) {
        bj bjVar;
        return (obj instanceof bj) && (bjVar = (bj) obj) != null && toString().equals(bjVar.toString());
    }

    @Deprecated
    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return this.h.toString();
    }
}
