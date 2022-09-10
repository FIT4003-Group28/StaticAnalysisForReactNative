package defpackage;

import java.util.Locale;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eaua  reason: default package */
/* loaded from: classes6.dex */
public final class eaua implements eauj, eauf {
    private final int a;

    public eaua(int i) {
        this.a = i;
    }

    @Override // defpackage.eauj
    public final int a() {
        return this.a == 1 ? 4 : 20;
    }

    @Override // defpackage.eauj
    public final void c(StringBuffer stringBuffer, eapt eaptVar, Locale locale) {
    }

    @Override // defpackage.eauf
    public final int d() {
        return this.a == 1 ? 4 : 20;
    }

    @Override // defpackage.eauf
    public final int e(eaui eauiVar, String str, int i) {
        Map<String, eaou> map = eaor.a;
        String substring = str.substring(i);
        String str2 = null;
        for (String str3 : map.keySet()) {
            if (substring.startsWith(str3) && (str2 == null || str3.length() > str2.length())) {
                str2 = str3;
            }
        }
        if (str2 != null) {
            eauiVar.a(map.get(str2));
            return i + str2.length();
        }
        return i ^ (-1);
    }

    @Override // defpackage.eauj
    public final void b(StringBuffer stringBuffer, long j, eaok eaokVar, int i, eaou eaouVar, Locale locale) {
        String n;
        long j2 = j - i;
        if (eaouVar == null) {
            n = "";
        } else if (this.a != 0) {
            n = eaouVar.m(j2, locale);
        } else {
            n = eaouVar.n(j2, locale);
        }
        stringBuffer.append(n);
    }
}
