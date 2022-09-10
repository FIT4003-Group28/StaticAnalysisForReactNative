package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: eatp  reason: default package */
/* loaded from: classes.dex */
public final class eatp {
    public final eauj a;
    public final eauf b;
    public final Locale c;
    public final boolean d;
    public final eaok e;
    public final eaou f;

    public eatp(eauj eaujVar, eauf eaufVar) {
        this.a = eaujVar;
        this.b = eaufVar;
        this.c = null;
        this.d = false;
        this.e = null;
        this.f = null;
    }

    public eatp(eauj eaujVar, eauf eaufVar, Locale locale, boolean z, eaok eaokVar, eaou eaouVar) {
        this.a = eaujVar;
        this.b = eaufVar;
        this.c = locale;
        this.d = z;
        this.e = eaokVar;
        this.f = eaouVar;
    }

    private final void l(StringBuffer stringBuffer, long j, eaok eaokVar) {
        eauj m = m();
        eaok o = o(eaokVar);
        eaou a = o.a();
        int b = a.b(j);
        long j2 = b;
        long j3 = j + j2;
        if ((j ^ j3) < 0 && (j2 ^ j) >= 0) {
            a = eaou.b;
            b = 0;
            j3 = j;
        }
        m.b(stringBuffer, j3, o.b(), b, a, this.c);
    }

    private final eauj m() {
        eauj eaujVar = this.a;
        if (eaujVar != null) {
            return eaujVar;
        }
        throw new UnsupportedOperationException("Printing not supported");
    }

    private final eauf n() {
        eauf eaufVar = this.b;
        if (eaufVar != null) {
            return eaufVar;
        }
        throw new UnsupportedOperationException("Parsing not supported");
    }

    private final eaok o(eaok eaokVar) {
        eaok d = eaor.d(eaokVar);
        eaok eaokVar2 = this.e;
        if (eaokVar2 != null) {
            d = eaokVar2;
        }
        eaou eaouVar = this.f;
        return eaouVar != null ? d.c(eaouVar) : d;
    }

    public final eatp a(Locale locale) {
        Locale locale2 = this.c;
        return (locale == locale2 || (locale != null && locale.equals(locale2))) ? this : new eatp(this.a, this.b, locale, this.d, this.e, this.f);
    }

    public final eatp b(eaok eaokVar) {
        return this.e == eaokVar ? this : new eatp(this.a, this.b, this.c, this.d, eaokVar, this.f);
    }

    public final eatp c() {
        return d(eaou.b);
    }

    public final eatp d(eaou eaouVar) {
        return this.f == eaouVar ? this : new eatp(this.a, this.b, this.c, false, this.e, eaouVar);
    }

    public final void e(StringBuffer stringBuffer, long j) {
        l(stringBuffer, j, null);
    }

    public final String f(eapr eaprVar) {
        StringBuffer stringBuffer = new StringBuffer(m().a());
        l(stringBuffer, eaor.b(eaprVar), eaor.c(eaprVar));
        return stringBuffer.toString();
    }

    public final String g(long j) {
        StringBuffer stringBuffer = new StringBuffer(m().a());
        e(stringBuffer, j);
        return stringBuffer.toString();
    }

    public final String h(eapt eaptVar) {
        StringBuffer stringBuffer = new StringBuffer(m().a());
        eauj m = m();
        if (eaptVar == null) {
            throw new IllegalArgumentException("The partial must not be null");
        }
        m.c(stringBuffer, eaptVar, this.c);
        return stringBuffer.toString();
    }

    public final long i(String str) {
        eauf n = n();
        eaui eauiVar = new eaui(o(this.e), this.c);
        int e = n.e(eauiVar, str, 0);
        if (e < 0) {
            e ^= -1;
        } else if (e >= str.length()) {
            return eauiVar.g(str);
        }
        throw new IllegalArgumentException(eauk.e(str, e));
    }

    public final eapg j(String str) {
        eauf n = n();
        eaok b = o(null).b();
        eaui eauiVar = new eaui(b, this.c);
        int e = n.e(eauiVar, str, 0);
        if (e < 0) {
            e ^= -1;
        } else if (e >= str.length()) {
            long g = eauiVar.g(str);
            Integer num = eauiVar.c;
            if (num != null) {
                b = b.c(eaou.k(num.intValue()));
            } else {
                eaou eaouVar = eauiVar.b;
                if (eaouVar != null) {
                    b = b.c(eaouVar);
                }
            }
            return new eaph(g, b).b();
        }
        throw new IllegalArgumentException(eauk.e(str, e));
    }

    public final eaol k(String str) {
        Integer num;
        eauf n = n();
        eaok o = o(null);
        eaui eauiVar = new eaui(o, this.c);
        int e = n.e(eauiVar, str, 0);
        if (e < 0) {
            e ^= -1;
        } else if (e >= str.length()) {
            long g = eauiVar.g(str);
            if (this.d && (num = eauiVar.c) != null) {
                o = o.c(eaou.k(num.intValue()));
            } else {
                eaou eaouVar = eauiVar.b;
                if (eaouVar != null) {
                    o = o.c(eaouVar);
                }
            }
            eaol eaolVar = new eaol(g, o);
            eaou eaouVar2 = this.f;
            return eaouVar2 != null ? eaolVar.f(eaouVar2) : eaolVar;
        }
        throw new IllegalArgumentException(eauk.e(str, e));
    }
}
