package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: baje  reason: default package */
/* loaded from: classes2.dex */
final class baje extends bakc {
    private final baiw b;

    public baje(baiw baiwVar, bahv bahvVar) {
        super(bahp.n, bahvVar);
        this.b = baiwVar;
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final int a(long j) {
        return this.b.P(j);
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final int b(Locale locale) {
        return bajg.a(locale).k;
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final int c() {
        return 7;
    }

    @Override // defpackage.bakc, defpackage.bahn
    public final int d() {
        return 1;
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final String j(int i, Locale locale) {
        return bajg.a(locale).c[i];
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final String l(int i, Locale locale) {
        return bajg.a(locale).b[i];
    }

    @Override // defpackage.bahn
    public final bahv r() {
        return this.b.d;
    }

    @Override // defpackage.bajr
    protected final int sz(String str, Locale locale) {
        Integer num = (Integer) bajg.a(locale).h.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new bahy(bahp.n, str);
    }
}
