package defpackage;

import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bakl  reason: default package */
/* loaded from: classes2.dex */
public final class bakl implements bale, bala {
    private final char a;

    public bakl(char c) {
        this.a = c;
    }

    @Override // defpackage.bala
    public final int a() {
        return 1;
    }

    @Override // defpackage.bale
    public final int b() {
        return 1;
    }

    @Override // defpackage.bala
    public final int c(bald baldVar, String str, int i) {
        char upperCase;
        char upperCase2;
        if (i >= str.length()) {
            return i ^ (-1);
        }
        char charAt = str.charAt(i);
        char c = this.a;
        return (charAt == c || (upperCase = Character.toUpperCase(charAt)) == (upperCase2 = Character.toUpperCase(c)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) ? i + 1 : i ^ (-1);
    }

    @Override // defpackage.bale
    public final void d(StringBuffer stringBuffer, long j, bahl bahlVar, int i, baht bahtVar, Locale locale) {
        stringBuffer.append(this.a);
    }
}
