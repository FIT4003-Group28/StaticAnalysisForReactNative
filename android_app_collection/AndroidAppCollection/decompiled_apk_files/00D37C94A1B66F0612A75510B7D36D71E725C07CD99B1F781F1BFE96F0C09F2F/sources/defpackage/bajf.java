package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: bajf  reason: default package */
/* loaded from: classes2.dex */
final class bajf extends bajr {
    private final baiw a;

    public bajf(baiw baiwVar) {
        super(bahp.c);
        this.a = baiwVar;
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final int a(long j) {
        return this.a.Z(j) <= 0 ? 0 : 1;
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final int b(Locale locale) {
        return bajg.a(locale).j;
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final int c() {
        return 1;
    }

    @Override // defpackage.bahn
    public final int d() {
        return 0;
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final long g(long j) {
        if (a(j) == 1) {
            return this.a.ah(0L, 1);
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final long h(long j, int i) {
        bajw.e(this, i, 0, 1);
        if (a(j) != i) {
            return this.a.ah(j, -this.a.Z(j));
        }
        return j;
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final long i(long j, String str, Locale locale) {
        Integer num = (Integer) bajg.a(locale).g.get(str);
        if (num != null) {
            return h(j, num.intValue());
        }
        throw new bahy(bahp.c, str);
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final String l(int i, Locale locale) {
        return bajg.a(locale).a[i];
    }

    @Override // defpackage.bajr, defpackage.bahn
    public final bahv p() {
        return bakh.j(bahx.a);
    }

    @Override // defpackage.bahn
    public final bahv r() {
        return null;
    }
}
