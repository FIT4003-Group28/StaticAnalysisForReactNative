package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bakt  reason: default package */
/* loaded from: classes2.dex */
public final class bakt implements bale, bala {
    private static final Map a = new HashMap();
    private final bahp b;
    private final boolean c;

    public bakt(bahp bahpVar, boolean z) {
        this.b = bahpVar;
        this.c = z;
    }

    @Override // defpackage.bala
    public final int a() {
        return b();
    }

    @Override // defpackage.bale
    public final int b() {
        return this.c ? 6 : 20;
    }

    @Override // defpackage.bala
    public final int c(bald baldVar, String str, int i) {
        int intValue;
        Set set;
        Locale locale = baldVar.d;
        Map map = a;
        synchronized (map) {
            Map map2 = (Map) map.get(locale);
            if (map2 == null) {
                map2 = new HashMap();
                map.put(locale, map2);
            }
            Object[] objArr = (Object[]) map2.get(this.b);
            if (objArr == null) {
                set = new HashSet(32);
                baic baicVar = new baic(baht.a);
                bahp bahpVar = this.b;
                bahn a2 = bahpVar.a(baicVar.b);
                if (!a2.t()) {
                    String valueOf = String.valueOf(bahpVar);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
                    sb.append("Field '");
                    sb.append(valueOf);
                    sb.append("' is not supported");
                    throw new IllegalArgumentException(sb.toString());
                }
                baib baibVar = new baib(baicVar, a2);
                int d = baibVar.b.d();
                int c = baibVar.b.c();
                if (c - d > 32) {
                    return i ^ (-1);
                }
                int b = baibVar.b.b(locale);
                while (d <= c) {
                    baic baicVar2 = baibVar.a;
                    long h = baibVar.b.h(baicVar2.a, d);
                    bahl bahlVar = baicVar2.b;
                    baicVar2.a = h;
                    set.add(baibVar.e(locale));
                    set.add(baibVar.e(locale).toLowerCase(locale));
                    set.add(baibVar.e(locale).toUpperCase(locale));
                    set.add(baibVar.f(locale));
                    set.add(baibVar.f(locale).toLowerCase(locale));
                    set.add(baibVar.f(locale).toUpperCase(locale));
                    d++;
                    b = b;
                }
                int i2 = b;
                if (!"en".equals(locale.getLanguage()) || this.b != bahp.c) {
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
                    baldVar.c(new balb(this.b.a(baldVar.a), substring, locale));
                    return min;
                }
            }
            return i ^ (-1);
        }
    }

    @Override // defpackage.bale
    public final void d(StringBuffer stringBuffer, long j, bahl bahlVar, int i, baht bahtVar, Locale locale) {
        String m;
        try {
            bahn a2 = this.b.a(bahlVar);
            if (this.c) {
                m = a2.k(j, locale);
            } else {
                m = a2.m(j, locale);
            }
            stringBuffer.append(m);
        } catch (RuntimeException unused) {
            stringBuffer.append((char) 65533);
        }
    }
}
