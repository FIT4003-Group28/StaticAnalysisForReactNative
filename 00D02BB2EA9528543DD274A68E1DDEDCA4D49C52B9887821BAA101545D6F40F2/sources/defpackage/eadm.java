package defpackage;

import java.util.Date;
import java.util.regex.Pattern;
/* compiled from: PG */
/* renamed from: eadm  reason: default package */
/* loaded from: classes6.dex */
public final class eadm {
    private static final Pattern c = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern d = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern e = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern f = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public final String a;
    public final String b;
    private final long g;
    private final String h;
    private final String i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;

    private eadm(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.b = str2;
        this.g = j;
        this.h = str3;
        this.i = str4;
        this.j = z;
        this.k = z2;
        this.m = z3;
        this.l = z4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x022c, code lost:
        throw new java.lang.IllegalArgumentException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0233, code lost:
        throw new java.lang.IllegalArgumentException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x023a, code lost:
        throw new java.lang.IllegalArgumentException();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0405 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<defpackage.eadm> a(defpackage.eadz r41, defpackage.eadx r42) {
        /*
            Method dump skipped, instructions count: 1051
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eadm.a(eadz, eadx):java.util.List");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x003a A[LOOP:0: B:2:0x0000->B:29:0x003a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0039 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int b(java.lang.String r4, int r5, int r6, boolean r7) {
        /*
        L0:
            if (r5 >= r6) goto L3d
            char r0 = r4.charAt(r5)
            r1 = 32
            r2 = 9
            r3 = 1
            if (r0 >= r1) goto L11
            if (r0 != r2) goto L34
            r0 = 9
        L11:
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 >= r1) goto L34
            r1 = 48
            if (r0 < r1) goto L1d
            r1 = 57
            if (r0 <= r1) goto L34
        L1d:
            r1 = 97
            if (r0 < r1) goto L25
            r1 = 122(0x7a, float:1.71E-43)
            if (r0 <= r1) goto L34
        L25:
            r1 = 65
            if (r0 < r1) goto L2d
            r1 = 90
            if (r0 <= r1) goto L34
        L2d:
            r1 = 58
            if (r0 != r1) goto L32
            goto L34
        L32:
            r0 = 0
            goto L35
        L34:
            r0 = 1
        L35:
            r1 = r7 ^ 1
            if (r0 != r1) goto L3a
            return r5
        L3a:
            int r5 = r5 + 1
            goto L0
        L3d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eadm.b(java.lang.String, int, int, boolean):int");
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof eadm)) {
            return false;
        }
        eadm eadmVar = (eadm) obj;
        return eadmVar.a.equals(this.a) && eadmVar.b.equals(this.b) && eadmVar.h.equals(this.h) && eadmVar.i.equals(this.i) && eadmVar.g == this.g && eadmVar.j == this.j && eadmVar.k == this.k && eadmVar.l == this.l && eadmVar.m == this.m;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode();
        int hashCode2 = this.b.hashCode();
        int hashCode3 = this.h.hashCode();
        int hashCode4 = this.i.hashCode();
        long j = this.g;
        return ((((((((((((((((hashCode + 527) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + ((int) ((j >>> 32) ^ j))) * 31) + (!this.j ? 1 : 0)) * 31) + (!this.k ? 1 : 0)) * 31) + (!this.l ? 1 : 0)) * 31) + (!this.m ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('=');
        sb.append(this.b);
        if (this.l) {
            if (this.g == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(eafs.a(new Date(this.g)));
            }
        }
        if (!this.m) {
            sb.append("; domain=");
            sb.append(this.h);
        }
        sb.append("; path=");
        sb.append(this.i);
        if (this.j) {
            sb.append("; secure");
        }
        if (this.k) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
