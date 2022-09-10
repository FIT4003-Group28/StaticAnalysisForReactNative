package defpackage;

import java.io.IOException;
import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eatt  reason: default package */
/* loaded from: classes.dex */
public final class eatt implements eauj, eauf {
    protected final int a;
    protected final int b;
    private final eaop c;

    /* JADX INFO: Access modifiers changed from: protected */
    public eatt(eaop eaopVar, int i, int i2) {
        this.c = eaopVar;
        i2 = i2 > 18 ? 18 : i2;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.eauj
    public final int a() {
        return this.b;
    }

    @Override // defpackage.eauj
    public final void b(StringBuffer stringBuffer, long j, eaok eaokVar, int i, eaou eaouVar, Locale locale) {
        try {
            f(stringBuffer, j, eaokVar);
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.eauj
    public final void c(StringBuffer stringBuffer, eapt eaptVar, Locale locale) {
        try {
            f(stringBuffer, eaptVar.j().h(eaptVar, 0L), eaptVar.j());
        } catch (IOException unused) {
        }
    }

    @Override // defpackage.eauf
    public final int d() {
        return this.b;
    }

    @Override // defpackage.eauf
    public final int e(eaui eauiVar, String str, int i) {
        eaon c = this.c.c(eauiVar.a);
        int min = Math.min(this.b, str.length() - i);
        long d = c.s().d() * 10;
        long j = 0;
        int i2 = 0;
        while (i2 < min) {
            char charAt = str.charAt(i + i2);
            if (charAt < '0' || charAt > '9') {
                break;
            }
            i2++;
            d /= 10;
            j += (charAt - '0') * d;
        }
        long j2 = j / 10;
        if (i2 != 0 && j2 <= 2147483647L) {
            eauiVar.d(new eaug(new eatd(eaop.y, eatb.a, c.s()), (int) j2));
            return i + i2;
        }
        return i ^ (-1);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e5 A[LOOP:1: B:11:0x0027->B:54:0x00e5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0089 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void f(java.lang.StringBuffer r10, long r11, defpackage.eaok r13) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eatt.f(java.lang.StringBuffer, long, eaok):void");
    }
}
