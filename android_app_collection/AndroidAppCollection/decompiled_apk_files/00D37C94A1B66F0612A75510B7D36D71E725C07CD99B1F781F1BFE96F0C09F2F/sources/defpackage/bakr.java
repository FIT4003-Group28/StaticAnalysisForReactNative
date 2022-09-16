package defpackage;

import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bakr  reason: default package */
/* loaded from: classes2.dex */
public class bakr extends bakq {
    protected final int d;

    /* JADX INFO: Access modifiers changed from: protected */
    public bakr(bahp bahpVar, int i, boolean z, int i2) {
        super(bahpVar, i, z);
        this.d = i2;
    }

    @Override // defpackage.bale
    public final int b() {
        return this.b;
    }

    @Override // defpackage.bale
    public final void d(StringBuffer stringBuffer, long j, bahl bahlVar, int i, baht bahtVar, Locale locale) {
        try {
            balf.d(stringBuffer, this.a.a(bahlVar).a(j), this.d);
        } catch (RuntimeException unused) {
            bakz.c(stringBuffer, this.d);
        }
    }
}
