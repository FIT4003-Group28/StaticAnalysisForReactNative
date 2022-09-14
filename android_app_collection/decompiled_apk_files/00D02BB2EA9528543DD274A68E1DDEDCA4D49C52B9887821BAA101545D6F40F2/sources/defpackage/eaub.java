package defpackage;

import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eaub  reason: default package */
/* loaded from: classes.dex */
public final class eaub implements eauj, eauf {
    private final String a;
    private final String b;
    private final boolean c;
    private final int d;

    public eaub(String str, String str2, boolean z, int i) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = i;
    }

    private static final int f(String str, int i, int i2) {
        int i3 = 0;
        for (int min = Math.min(str.length() - i, i2); min > 0; min--) {
            char charAt = str.charAt(i + i3);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            i3++;
        }
        return i3;
    }

    @Override // defpackage.eauj
    public final int a() {
        int i = true != this.c ? 6 : 7;
        String str = this.a;
        return (str == null || str.length() <= i) ? i : this.a.length();
    }

    @Override // defpackage.eauj
    public final void c(StringBuffer stringBuffer, eapt eaptVar, Locale locale) {
    }

    @Override // defpackage.eauf
    public final int d() {
        return a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ca, code lost:
        if (r6 == false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00fe, code lost:
        if (r6 == false) goto L89;
     */
    @Override // defpackage.eauf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e(defpackage.eaui r13, java.lang.String r14, int r15) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eaub.e(eaui, java.lang.String, int):int");
    }

    @Override // defpackage.eauj
    public final void b(StringBuffer stringBuffer, long j, eaok eaokVar, int i, eaou eaouVar, Locale locale) {
        int i2;
        int i3;
        if (eaouVar == null) {
            return;
        }
        int i4 = 0;
        if (i == 0) {
            String str = this.a;
            if (str != null) {
                stringBuffer.append(str);
                return;
            }
            i = 0;
        }
        if (i >= 0) {
            stringBuffer.append('+');
        } else {
            stringBuffer.append('-');
            i = -i;
        }
        int i5 = i / 3600000;
        eauk.a(stringBuffer, i5, 2);
        int i6 = i - (i5 * 3600000);
        if (i6 != 0) {
            i4 = i6;
        }
        int i7 = i4 / 60000;
        if (this.c) {
            stringBuffer.append(':');
        }
        eauk.a(stringBuffer, i7, 2);
        if (this.d == 2 || (i2 = i4 - (i7 * 60000)) == 0) {
            return;
        }
        int i8 = i2 / 1000;
        if (this.c) {
            stringBuffer.append(':');
        }
        eauk.a(stringBuffer, i8, 2);
        if (this.d == 3 || (i3 = i2 - (i8 * 1000)) == 0) {
            return;
        }
        if (this.c) {
            stringBuffer.append('.');
        }
        eauk.a(stringBuffer, i3, 3);
    }
}
