package defpackage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: cxak  reason: default package */
/* loaded from: classes5.dex */
final class cxak {
    private static final dcep<String> a = dcep.E("googleapis.com", "adwords.google.com", "m.google.com", "sandbox.google.com");
    private static final Pattern b = Pattern.compile("(?:[^\\/]*\\/)([^;]*)");
    private static final Pattern c = Pattern.compile("([^\\?]+)(\\?+)");
    private static final Pattern d = Pattern.compile("((?:https?:\\/\\/|)[a-zA-Z0-9-_\\.]+(?::\\d+)?)(.*)?");
    private static final Pattern e = Pattern.compile("([a-zA-Z0-9-_]+)");
    private static final Pattern f = Pattern.compile("\\b([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})(:\\d{1,5})?\\b");
    private final dzsj<cxai> g;

    public cxak(dzsj<cxai> dzsjVar) {
        this.g = dzsjVar;
    }

    static String a(String str) {
        Matcher matcher = d.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    static String b(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = f.matcher(str);
        return matcher.find() ? matcher.replaceFirst("<ip>") : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.String d(java.lang.String r3, defpackage.cxaw r4, boolean r5) {
        /*
            boolean r0 = r3.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            if (r4 == 0) goto L10
            if (r5 != 0) goto L10
            java.lang.String r3 = r4.a()
        L10:
            r4 = 1
            if (r5 == 0) goto L15
        L13:
            r5 = 1
            goto L1e
        L15:
            java.lang.String r5 = a(r3)
            if (r5 == 0) goto L1d
            r3 = r5
            goto L13
        L1d:
            r5 = 0
        L1e:
            java.util.regex.Pattern r0 = defpackage.cxak.c
            java.util.regex.Matcher r0 = r0.matcher(r3)
            boolean r2 = r0.find()
            if (r2 == 0) goto L2f
            java.lang.String r3 = r0.group(r4)
            r5 = 1
        L2f:
            java.lang.String r0 = b(r3)
            if (r0 == 0) goto L3c
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L3c
            r5 = 1
        L3c:
            if (r0 == 0) goto L51
            java.util.regex.Pattern r3 = defpackage.cxak.f
            java.util.regex.Matcher r3 = r3.matcher(r0)
            boolean r2 = r3.find()
            if (r2 == 0) goto L51
            java.lang.String r5 = "<ip>"
            java.lang.String r0 = r3.replaceFirst(r5)
            r5 = 1
        L51:
            if (r0 == 0) goto L67
            if (r5 != 0) goto L67
            java.util.regex.Pattern r3 = defpackage.cxak.e
            java.util.regex.Matcher r3 = r3.matcher(r0)
            boolean r5 = r3.find()
            if (r5 != 0) goto L62
            goto L68
        L62:
            java.lang.String r3 = r3.group(r4)
            return r3
        L67:
            r1 = r0
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxak.d(java.lang.String, cxaw, boolean):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0172, code lost:
        if (r4.equals("http/2+quic/43") != false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eacd c(defpackage.cxaj... r15) {
        /*
            Method dump skipped, instructions count: 1087
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxak.c(cxaj[]):eacd");
    }
}
