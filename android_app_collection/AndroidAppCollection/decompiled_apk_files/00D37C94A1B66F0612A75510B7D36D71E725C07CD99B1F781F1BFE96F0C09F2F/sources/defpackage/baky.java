package defpackage;

import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: baky  reason: default package */
/* loaded from: classes2.dex */
public final class baky extends bakq {
    public baky(bahp bahpVar, int i, boolean z) {
        super(bahpVar, i, z);
    }

    @Override // defpackage.bale
    public final int b() {
        return this.b;
    }

    @Override // defpackage.bale
    public final void d(StringBuffer stringBuffer, long j, bahl bahlVar, int i, baht bahtVar, Locale locale) {
        try {
            balf.e(stringBuffer, this.a.a(bahlVar).a(j));
        } catch (RuntimeException unused) {
            stringBuffer.append((char) 65533);
        }
    }
}
