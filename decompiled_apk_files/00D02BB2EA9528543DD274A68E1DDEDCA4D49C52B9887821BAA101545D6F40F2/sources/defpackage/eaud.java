package defpackage;

import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eaud  reason: default package */
/* loaded from: classes.dex */
public final class eaud extends eatv {
    public eaud(eaop eaopVar, int i, boolean z) {
        super(eaopVar, i, z);
    }

    @Override // defpackage.eauj
    public final int a() {
        return this.b;
    }

    @Override // defpackage.eauj
    public final void b(StringBuffer stringBuffer, long j, eaok eaokVar, int i, eaou eaouVar, Locale locale) {
        try {
            eauk.b(stringBuffer, this.a.c(eaokVar).d(j));
        } catch (RuntimeException unused) {
            stringBuffer.append((char) 65533);
        }
    }

    @Override // defpackage.eauj
    public final void c(StringBuffer stringBuffer, eapt eaptVar, Locale locale) {
        if (eaptVar.i(this.a)) {
            try {
                eauk.b(stringBuffer, eaptVar.h(this.a));
                return;
            } catch (RuntimeException unused) {
                stringBuffer.append((char) 65533);
                return;
            }
        }
        stringBuffer.append((char) 65533);
    }
}
