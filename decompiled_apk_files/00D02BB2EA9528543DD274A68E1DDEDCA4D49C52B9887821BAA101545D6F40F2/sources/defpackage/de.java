package defpackage;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: de  reason: default package */
/* loaded from: classes6.dex */
public final class de implements Serializable {
    public static final de b;
    static final Pattern c;
    static final Pattern d;
    static final Pattern e;
    static final Pattern f;
    static final Pattern g;
    static final Pattern h;
    private static final cv i;
    private static final dc j;
    private static final long serialVersionUID = 1;
    public final dd a;

    static {
        cs csVar = new cs();
        i = csVar;
        dc dcVar = new dc("other", csVar, null, null);
        j = dcVar;
        dd ddVar = new dd();
        ddVar.a(dcVar);
        b = new de(ddVar);
        c = Pattern.compile("\\s*\\Q\\E@\\s*");
        d = Pattern.compile("\\s*or\\s*");
        e = Pattern.compile("\\s*and\\s*");
        f = Pattern.compile("\\s*,\\s*");
        Pattern.compile("\\s*\\Q..\\E\\s*");
        g = Pattern.compile("\\s*~\\s*");
        h = Pattern.compile("\\s*;\\s*");
    }

    private de(dd ddVar) {
        this.a = ddVar;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (dc dcVar : ddVar.b) {
            linkedHashSet.add(dcVar.a);
        }
        Collections.unmodifiableSet(linkedHashSet);
    }

    public static de a(String str) {
        String trim = str.trim();
        if (trim.length() == 0) {
            return b;
        }
        dd ddVar = new dd();
        if (trim.endsWith(";")) {
            trim = trim.substring(0, trim.length() - 1);
        }
        for (String str2 : h.split(trim)) {
            dc b2 = b(str2.trim());
            boolean z = true;
            if (b2.c == null && b2.d == null) {
                z = false;
            }
            ddVar.a |= z;
            ddVar.a(b2);
        }
        Iterator<dc> it = ddVar.b.iterator();
        dc dcVar = null;
        while (it.hasNext()) {
            dc next = it.next();
            if ("other".equals(next.a)) {
                it.remove();
                dcVar = next;
            }
        }
        if (dcVar == null) {
            dcVar = b("other:");
        }
        ddVar.b.add(dcVar);
        return new de(ddVar);
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
    public static defpackage.dc b(java.lang.String r40) {
        /*
            Method dump skipped, instructions count: 1302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.de.b(java.lang.String):dc");
    }

    public static void c(StringBuilder sb, double d2, double d3, boolean z) {
        if (z) {
            sb.append(",");
        }
        if (d2 == d3) {
            sb.append(g(d2));
            return;
        }
        String g2 = g(d2);
        String g3 = g(d3);
        StringBuilder sb2 = new StringBuilder(String.valueOf(g2).length() + 2 + String.valueOf(g3).length());
        sb2.append(g2);
        sb2.append("..");
        sb2.append(g3);
        sb.append(sb2.toString());
    }

    public static de d(Locale locale, int i2) {
        df dfVar = df.c;
        dfVar.a();
        String str = (i2 == 1 ? dfVar.a : dfVar.b).get(locale.getLanguage());
        if (str != null && str.trim().length() != 0) {
            de b2 = dfVar.b(str);
            return b2 == null ? b : b2;
        }
        return b;
    }

    private static ParseException e(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(str2).length());
        sb.append("unexpected token '");
        sb.append(str);
        sb.append("' in '");
        sb.append(str2);
        sb.append("'");
        return new ParseException(sb.toString(), -1);
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

    private static String g(double d2) {
        long j2 = (long) d2;
        return d2 == ((double) j2) ? String.valueOf(j2) : String.valueOf(d2);
    }

    public final boolean equals(Object obj) {
        de deVar;
        return (obj instanceof de) && (deVar = (de) obj) != null && toString().equals(deVar.toString());
    }

    @Deprecated
    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
