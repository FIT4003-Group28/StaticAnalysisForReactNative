package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: bajr  reason: default package */
/* loaded from: classes2.dex */
public abstract class bajr extends bahn {
    public final bahp g;

    /* JADX INFO: Access modifiers changed from: protected */
    public bajr(bahp bahpVar) {
        if (bahpVar != null) {
            this.g = bahpVar;
            return;
        }
        throw new IllegalArgumentException("The type must not be null");
    }

    @Override // defpackage.bahn
    public abstract int a(long j);

    @Override // defpackage.bahn
    public int b(Locale locale) {
        int c = c();
        if (c >= 0) {
            if (c < 10) {
                return 1;
            }
            if (c < 100) {
                return 2;
            }
            if (c < 1000) {
                return 3;
            }
        }
        return Integer.toString(c).length();
    }

    @Override // defpackage.bahn
    public abstract int c();

    @Override // defpackage.bahn
    public long e(long j, int i) {
        return p().b(j, i);
    }

    @Override // defpackage.bahn
    public long f(long j) {
        return j - g(j);
    }

    @Override // defpackage.bahn
    public abstract long g(long j);

    @Override // defpackage.bahn
    public abstract long h(long j, int i);

    @Override // defpackage.bahn
    public long i(long j, String str, Locale locale) {
        return h(j, sz(str, locale));
    }

    @Override // defpackage.bahn
    public String j(int i, Locale locale) {
        return l(i, locale);
    }

    @Override // defpackage.bahn
    public String k(long j, Locale locale) {
        return j(a(j), locale);
    }

    @Override // defpackage.bahn
    public String l(int i, Locale locale) {
        return Integer.toString(i);
    }

    @Override // defpackage.bahn
    public String m(long j, Locale locale) {
        return l(a(j), locale);
    }

    @Override // defpackage.bahn
    public final String n() {
        return this.g.z;
    }

    @Override // defpackage.bahn
    public final bahp o() {
        return this.g;
    }

    @Override // defpackage.bahn
    public abstract bahv p();

    @Override // defpackage.bahn
    public bahv q() {
        return null;
    }

    @Override // defpackage.bahn
    public boolean s(long j) {
        return false;
    }

    protected int sz(String str, Locale locale) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            throw new bahy(this.g, str);
        }
    }

    @Override // defpackage.bahn
    public final boolean t() {
        return true;
    }

    public final String toString() {
        String n = n();
        StringBuilder sb = new StringBuilder(n.length() + 15);
        sb.append("DateTimeField[");
        sb.append(n);
        sb.append(']');
        return sb.toString();
    }

    public int u(long j) {
        return c();
    }
}
