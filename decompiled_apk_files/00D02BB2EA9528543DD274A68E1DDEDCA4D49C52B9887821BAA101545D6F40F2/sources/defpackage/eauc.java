package defpackage;

import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eauc  reason: default package */
/* loaded from: classes6.dex */
public final class eauc implements eauj, eauf {
    private final eaop a;
    private final int b;
    private final boolean c;

    public eauc(eaop eaopVar, int i, boolean z) {
        this.a = eaopVar;
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.eauj
    public final int a() {
        return 2;
    }

    @Override // defpackage.eauj
    public final void b(StringBuffer stringBuffer, long j, eaok eaokVar, int i, eaou eaouVar, Locale locale) {
        int i2;
        try {
            int d = this.a.c(eaokVar).d(j);
            if (d < 0) {
                d = -d;
            }
            i2 = d % 100;
        } catch (RuntimeException unused) {
            i2 = -1;
        }
        if (i2 < 0) {
            stringBuffer.append((char) 65533);
            stringBuffer.append((char) 65533);
            return;
        }
        eauk.a(stringBuffer, i2, 2);
    }

    @Override // defpackage.eauj
    public final void c(StringBuffer stringBuffer, eapt eaptVar, Locale locale) {
        int i = -1;
        if (eaptVar.i(this.a)) {
            try {
                int h = eaptVar.h(this.a);
                if (h < 0) {
                    h = -h;
                }
                i = h % 100;
            } catch (RuntimeException unused) {
            }
        }
        if (i < 0) {
            stringBuffer.append((char) 65533);
            stringBuffer.append((char) 65533);
            return;
        }
        eauk.a(stringBuffer, i, 2);
    }

    @Override // defpackage.eauf
    public final int d() {
        return this.c ? 4 : 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    @Override // defpackage.eauf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int e(defpackage.eaui r12, java.lang.String r13, int r14) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eauc.e(eaui, java.lang.String, int):int");
    }
}
