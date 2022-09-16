package defpackage;

import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bakx  reason: default package */
/* loaded from: classes2.dex */
public final class bakx implements bale, bala {
    private final bahp a;
    private final int b;
    private final boolean c;

    public bakx(bahp bahpVar, int i, boolean z) {
        this.a = bahpVar;
        this.b = i;
        this.c = z;
    }

    @Override // defpackage.bala
    public final int a() {
        return this.c ? 4 : 2;
    }

    @Override // defpackage.bale
    public final int b() {
        return 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    @Override // defpackage.bala
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(defpackage.bald r12, java.lang.String r13, int r14) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bakx.c(bald, java.lang.String, int):int");
    }

    @Override // defpackage.bale
    public final void d(StringBuffer stringBuffer, long j, bahl bahlVar, int i, baht bahtVar, Locale locale) {
        int i2;
        try {
            int a = this.a.a(bahlVar).a(j);
            if (a < 0) {
                a = -a;
            }
            i2 = a % 100;
        } catch (RuntimeException unused) {
            i2 = -1;
        }
        if (i2 < 0) {
            stringBuffer.append((char) 65533);
            stringBuffer.append((char) 65533);
            return;
        }
        balf.d(stringBuffer, i2, 2);
    }
}
