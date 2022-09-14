package defpackage;

import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eatx  reason: default package */
/* loaded from: classes.dex */
public final class eatx implements eauj, eauf {
    private final String a;

    public eatx(String str) {
        this.a = str;
    }

    @Override // defpackage.eauj
    public final int a() {
        return this.a.length();
    }

    @Override // defpackage.eauj
    public final void b(StringBuffer stringBuffer, long j, eaok eaokVar, int i, eaou eaouVar, Locale locale) {
        stringBuffer.append(this.a);
    }

    @Override // defpackage.eauj
    public final void c(StringBuffer stringBuffer, eapt eaptVar, Locale locale) {
        stringBuffer.append(this.a);
    }

    @Override // defpackage.eauf
    public final int d() {
        return this.a.length();
    }

    @Override // defpackage.eauf
    public final int e(eaui eauiVar, String str, int i) {
        String str2 = this.a;
        return str.regionMatches(true, i, str2, 0, str2.length()) ? i + this.a.length() : i ^ (-1);
    }
}
