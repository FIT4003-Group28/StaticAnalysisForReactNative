package defpackage;

import java.util.Locale;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* compiled from: PG */
/* renamed from: baku  reason: default package */
/* loaded from: classes2.dex */
public final class baku extends Enum implements bale, bala {
    public static final baku a;
    static final Set b;
    static final int c;
    private static final /* synthetic */ baku[] d;

    static {
        baku bakuVar = new baku();
        a = bakuVar;
        int i = 0;
        d = new baku[]{bakuVar};
        Set<String> set = baht.b;
        b = set;
        for (String str : set) {
            i = Math.max(i, str.length());
        }
        c = i;
    }

    private baku() {
    }

    public static baku[] values() {
        return (baku[]) d.clone();
    }

    @Override // defpackage.bala
    public final int a() {
        return c;
    }

    @Override // defpackage.bale
    public final int b() {
        return c;
    }

    @Override // defpackage.bala
    public final int c(bald baldVar, String str, int i) {
        String substring = str.substring(i);
        String str2 = null;
        for (String str3 : b) {
            if (substring.startsWith(str3) && (str2 == null || str3.length() > str2.length())) {
                str2 = str3;
            }
        }
        if (str2 != null) {
            baldVar.f(baht.i(str2));
            return i + str2.length();
        }
        return i ^ (-1);
    }

    @Override // defpackage.bale
    public final void d(StringBuffer stringBuffer, long j, bahl bahlVar, int i, baht bahtVar, Locale locale) {
        stringBuffer.append(bahtVar != null ? bahtVar.c : "");
    }
}
