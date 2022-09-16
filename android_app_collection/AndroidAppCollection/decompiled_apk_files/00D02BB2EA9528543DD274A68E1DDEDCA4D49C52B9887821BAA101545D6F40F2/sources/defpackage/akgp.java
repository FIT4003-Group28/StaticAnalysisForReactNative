package defpackage;
/* compiled from: PG */
/* renamed from: akgp  reason: default package */
/* loaded from: classes2.dex */
public final class akgp implements akgk {
    private static final cqtv a;
    private static final cqtv b;
    private static final akgn<aklg> c;
    private static final akgn<aklg> d;
    private static final akgn<akld> e;

    static {
        cqsv c2 = cqsv.c(cqrp.d(16.0d), cqrp.d(16.0d), cqrp.d(44.0d), cqrp.d(16.0d));
        a = c2;
        cqsv c3 = cqsv.c(cqrp.d(16.0d), cqrp.d(16.0d), cqrp.d(44.0d), cqrp.d(16.0d));
        b = c3;
        c = new akgt(null, akgt.a, cqrp.d(8.0d), c2, c3, 1);
        d = new akgt(null, null, cqrp.d(8.0d), cqrp.d(20.0d), cqrp.d(20.0d), 0);
        e = new akgo();
    }

    @Override // defpackage.akgk
    public final akgn<akld> a() {
        return e;
    }

    @Override // defpackage.akgk
    public final akgn<aklg> b(int i) {
        return i == 3 ? d : c;
    }
}
