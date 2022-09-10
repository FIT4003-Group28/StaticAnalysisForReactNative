package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eaty  reason: default package */
/* loaded from: classes6.dex */
public final class eaty implements eauj, eauf {
    private static final Map<Locale, Map<eaop, Object[]>> a = new HashMap();
    private final eaop b;
    private final boolean c;

    public eaty(eaop eaopVar, boolean z) {
        this.b = eaopVar;
        this.c = z;
    }

    @Override // defpackage.eauj
    public final int a() {
        return this.c ? 6 : 20;
    }

    @Override // defpackage.eauj
    public final void b(StringBuffer stringBuffer, long j, eaok eaokVar, int i, eaou eaouVar, Locale locale) {
        String e;
        try {
            eaon c = this.b.c(eaokVar);
            if (this.c) {
                e = c.h(j, locale);
            } else {
                e = c.e(j, locale);
            }
            stringBuffer.append(e);
        } catch (RuntimeException unused) {
            stringBuffer.append((char) 65533);
        }
    }

    @Override // defpackage.eauj
    public final void c(StringBuffer stringBuffer, eapt eaptVar, Locale locale) {
        String str;
        try {
            if (eaptVar.i(this.b)) {
                eaon c = this.b.c(eaptVar.j());
                if (this.c) {
                    str = c.i(eaptVar, locale);
                } else {
                    str = c.f(eaptVar, locale);
                }
            } else {
                str = "�";
            }
            stringBuffer.append(str);
        } catch (RuntimeException unused) {
            stringBuffer.append((char) 65533);
        }
    }

    @Override // defpackage.eauf
    public final int d() {
        return a();
    }

    @Override // defpackage.eauf
    public final int e(eaui eauiVar, String str, int i) {
        int intValue;
        Set set;
        Locale locale = eauiVar.d;
        Map<Locale, Map<eaop, Object[]>> map = a;
        synchronized (map) {
            Map<eaop, Object[]> map2 = map.get(locale);
            if (map2 == null) {
                map2 = new HashMap<>();
                map.put(locale, map2);
            }
            Object[] objArr = map2.get(this.b);
            if (objArr == null) {
                set = new HashSet(32);
                eapm eapmVar = new eapm(0L, eaou.b);
                eaop eaopVar = this.b;
                eaon c = eaopVar.c(eapmVar.b);
                if (!c.c()) {
                    String valueOf = String.valueOf(eaopVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                    sb.append("Field '");
                    sb.append(valueOf);
                    sb.append("' is not supported");
                    throw new IllegalArgumentException(sb.toString());
                }
                eapl eaplVar = new eapl(eapmVar, c);
                int w = eaplVar.b.w();
                int A = eaplVar.b.A();
                if (A - w > 32) {
                    return i ^ (-1);
                }
                int E = eaplVar.b.E(locale);
                while (w <= A) {
                    eapm eapmVar2 = eaplVar.a;
                    eapmVar2.Th(eaplVar.b.p(eapmVar2.a, w));
                    set.add(eaplVar.h(locale));
                    set.add(eaplVar.h(locale).toLowerCase(locale));
                    set.add(eaplVar.h(locale).toUpperCase(locale));
                    set.add(eaplVar.g(locale));
                    set.add(eaplVar.g(locale).toLowerCase(locale));
                    set.add(eaplVar.g(locale).toUpperCase(locale));
                    w++;
                    E = E;
                }
                int i2 = E;
                if (!"en".equals(locale.getLanguage()) || this.b != eaop.c) {
                    intValue = i2;
                } else {
                    set.add("BCE");
                    set.add("bce");
                    set.add("CE");
                    set.add("ce");
                    intValue = 3;
                }
                map2.put(this.b, new Object[]{set, Integer.valueOf(intValue)});
            } else {
                intValue = ((Integer) objArr[1]).intValue();
                set = (Set) objArr[0];
            }
            for (int min = Math.min(str.length(), i + intValue); min > i; min--) {
                String substring = str.substring(i, min);
                if (set.contains(substring)) {
                    eauiVar.d(new eaug(this.b.c(eauiVar.a), substring, locale));
                    return min;
                }
            }
            return i ^ (-1);
        }
    }
}
