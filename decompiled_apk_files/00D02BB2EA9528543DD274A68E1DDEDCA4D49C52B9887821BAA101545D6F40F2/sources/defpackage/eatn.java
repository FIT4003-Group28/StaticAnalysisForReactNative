package defpackage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eatn  reason: default package */
/* loaded from: classes6.dex */
public final class eatn implements eauj, eauf {
    private static final ConcurrentHashMap<String, eatp> a = new ConcurrentHashMap<>();
    private final int b;
    private final int c;
    private final int d;

    public eatn(int i, int i2, int i3) {
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    private final eatp f(Locale locale) {
        DateFormat dateInstance;
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String valueOf = String.valueOf(Integer.toString(this.d + (this.b << 4) + (this.c << 8)));
        String valueOf2 = String.valueOf(locale.toString());
        String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
        ConcurrentHashMap<String, eatp> concurrentHashMap = a;
        eatp eatpVar = concurrentHashMap.get(concat);
        if (eatpVar == null) {
            int i = this.d;
            if (i == 0) {
                dateInstance = DateFormat.getDateInstance(this.b, locale);
            } else if (i != 1) {
                dateInstance = DateFormat.getDateTimeInstance(this.b, this.c, locale);
            } else {
                dateInstance = DateFormat.getTimeInstance(this.c, locale);
            }
            if (!(dateInstance instanceof SimpleDateFormat)) {
                String valueOf3 = String.valueOf(locale);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 32);
                sb.append("No datetime pattern for locale: ");
                sb.append(valueOf3);
                throw new IllegalArgumentException(sb.toString());
            }
            eatpVar = eato.b(((SimpleDateFormat) dateInstance).toPattern());
            eatp putIfAbsent = concurrentHashMap.putIfAbsent(concat, eatpVar);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
        }
        return eatpVar;
    }

    @Override // defpackage.eauj
    public final int a() {
        return 40;
    }

    @Override // defpackage.eauj
    public final void b(StringBuffer stringBuffer, long j, eaok eaokVar, int i, eaou eaouVar, Locale locale) {
        f(locale).a.b(stringBuffer, j, eaokVar, i, eaouVar, locale);
    }

    @Override // defpackage.eauj
    public final void c(StringBuffer stringBuffer, eapt eaptVar, Locale locale) {
        f(locale).a.c(stringBuffer, eaptVar, locale);
    }

    @Override // defpackage.eauf
    public final int d() {
        return 40;
    }

    @Override // defpackage.eauf
    public final int e(eaui eauiVar, String str, int i) {
        return f(eauiVar.d).b.e(eauiVar, str, i);
    }
}
