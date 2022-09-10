package defpackage;

import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eatw  reason: default package */
/* loaded from: classes.dex */
public class eatw extends eatv {
    protected final int d;

    /* JADX INFO: Access modifiers changed from: protected */
    public eatw(eaop eaopVar, int i, boolean z, int i2) {
        super(eaopVar, i, z);
        this.d = i2;
    }

    @Override // defpackage.eauj
    public final int a() {
        return this.b;
    }

    @Override // defpackage.eauj
    public final void b(StringBuffer stringBuffer, long j, eaok eaokVar, int i, eaou eaouVar, Locale locale) {
        try {
            eauk.a(stringBuffer, this.a.c(eaokVar).d(j), this.d);
        } catch (RuntimeException unused) {
            eaue.n(stringBuffer, this.d);
        }
    }

    @Override // defpackage.eauj
    public final void c(StringBuffer stringBuffer, eapt eaptVar, Locale locale) {
        if (eaptVar.i(this.a)) {
            try {
                eauk.a(stringBuffer, eaptVar.h(this.a), this.d);
                return;
            } catch (RuntimeException unused) {
                eaue.n(stringBuffer, this.d);
                return;
            }
        }
        eaue.n(stringBuffer, this.d);
    }
}
