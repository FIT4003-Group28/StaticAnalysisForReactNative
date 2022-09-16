package defpackage;

import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: baks  reason: default package */
/* loaded from: classes2.dex */
public final class baks implements bale, bala {
    private final String a;

    public baks(String str) {
        this.a = str;
    }

    @Override // defpackage.bala
    public final int a() {
        return this.a.length();
    }

    @Override // defpackage.bale
    public final int b() {
        return this.a.length();
    }

    @Override // defpackage.bala
    public final int c(bald baldVar, String str, int i) {
        String str2 = this.a;
        return str.regionMatches(true, i, str2, 0, str2.length()) ? i + this.a.length() : i ^ (-1);
    }

    @Override // defpackage.bale
    public final void d(StringBuffer stringBuffer, long j, bahl bahlVar, int i, baht bahtVar, Locale locale) {
        stringBuffer.append(this.a);
    }
}
