package defpackage;

import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eatq  reason: default package */
/* loaded from: classes.dex */
public final class eatq implements eauj, eauf {
    private final char a;

    public eatq(char c) {
        this.a = c;
    }

    @Override // defpackage.eauj
    public final int a() {
        return 1;
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
        return 1;
    }

    @Override // defpackage.eauf
    public final int e(eaui eauiVar, String str, int i) {
        char upperCase;
        char upperCase2;
        if (i >= str.length()) {
            return i ^ (-1);
        }
        char charAt = str.charAt(i);
        char c = this.a;
        return (charAt == c || (upperCase = Character.toUpperCase(charAt)) == (upperCase2 = Character.toUpperCase(c)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) ? i + 1 : i ^ (-1);
    }
}
