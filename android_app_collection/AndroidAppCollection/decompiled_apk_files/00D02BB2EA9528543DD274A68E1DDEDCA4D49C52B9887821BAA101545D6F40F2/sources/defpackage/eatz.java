package defpackage;

import java.util.Locale;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: eatz  reason: default package */
/* loaded from: classes6.dex */
public final class eatz extends Enum<eatz> implements eauj, eauf {
    public static final eatz a;
    static final Set<String> b;
    static final int c;
    private static final /* synthetic */ eatz[] d;

    static {
        eatz eatzVar = new eatz();
        a = eatzVar;
        int i = 0;
        d = new eatz[]{eatzVar};
        Set<String> set = eaou.c;
        b = set;
        for (String str : set) {
            i = Math.max(i, str.length());
        }
        c = i;
    }

    private eatz() {
    }

    public static eatz[] values() {
        return (eatz[]) d.clone();
    }

    @Override // defpackage.eauj
    public final int a() {
        return c;
    }

    @Override // defpackage.eauj
    public final void b(StringBuffer stringBuffer, long j, eaok eaokVar, int i, eaou eaouVar, Locale locale) {
        stringBuffer.append(eaouVar != null ? eaouVar.d : "");
    }

    @Override // defpackage.eauj
    public final void c(StringBuffer stringBuffer, eapt eaptVar, Locale locale) {
    }

    @Override // defpackage.eauf
    public final int d() {
        return c;
    }

    @Override // defpackage.eauf
    public final int e(eaui eauiVar, String str, int i) {
        String substring = str.substring(i);
        String str2 = null;
        for (String str3 : b) {
            if (substring.startsWith(str3) && (str2 == null || str3.length() > str2.length())) {
                str2 = str3;
            }
        }
        if (str2 != null) {
            eauiVar.a(eaou.j(str2));
            return i + str2.length();
        }
        return i ^ (-1);
    }
}
