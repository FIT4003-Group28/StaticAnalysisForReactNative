package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: eaqy  reason: default package */
/* loaded from: classes6.dex */
final class eaqy extends eass {
    private final String a;

    public eaqy() {
        super(eaop.c);
        this.a = "BE";
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int A() {
        return 1;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int E(Locale locale) {
        return this.a.length();
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long F(long j) {
        return Long.MIN_VALUE;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long G(long j) {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final int d(long j) {
        return 1;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final String g(int i, Locale locale) {
        return this.a;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long p(long j, int i) {
        easy.e(this, i, 1, 1);
        return j;
    }

    @Override // defpackage.eass, defpackage.eaon
    public final long r(long j, String str, Locale locale) {
        if (this.a.equals(str) || "1".equals(str)) {
            return j;
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
        return 1;
    }
}
