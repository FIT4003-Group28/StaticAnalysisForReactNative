package defpackage;

import java.util.Locale;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: earj  reason: default package */
/* loaded from: classes6.dex */
public final class earj extends eass {
    private final eaqt a;

    public earj(eaqt eaqtVar) {
        super(eaop.c);
        this.a = eaqtVar;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int A() {
        return 1;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int E(Locale locale) {
        return eark.a(locale).j;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long F(long j) {
        if (d(j) == 1) {
            return this.a.aA(0L, 1);
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long G(long j) {
        if (d(j) == 0) {
            return this.a.aA(0L, 1);
        }
        return Long.MAX_VALUE;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int d(long j) {
        return this.a.ac(j) <= 0 ? 0 : 1;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final String g(int i, Locale locale) {
        return eark.a(locale).a[i];
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long p(long j, int i) {
        easy.e(this, i, 0, 1);
        if (d(j) != i) {
            return this.a.aA(j, -this.a.ac(j));
        }
        return j;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long r(long j, String str, Locale locale) {
        Integer num = eark.a(locale).g.get(str);
        if (num != null) {
            return p(j, num.intValue());
        }
        throw new eapb(eaop.c, str);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final eaox s() {
        return eatl.j(eaoz.a);
    }

    @Override // defpackage.eass, defpackage.eaon
    public final eaox t() {
        return null;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int w() {
        return 0;
    }
}
