package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bqxi  reason: default package */
/* loaded from: classes4.dex */
public class bqxi extends bquc<Boolean> implements bqtc {
    private static final dcdn<dqwx, Integer> d;
    public final dqwx a;
    @dzsi
    private final String b;
    private Boolean c;
    private final dcdn<dqwx, String> e;

    static {
        dcdg p = dcdn.p();
        p.f(dqwx.BUSINESS, Integer.valueOf((int) R.string.BUSINESS_TRIP_TYPE_SELECTION_TEXT));
        p.f(dqwx.VACATION, Integer.valueOf((int) R.string.VACATION_TRIP_TYPE_SELECTION_TEXT));
        p.f(dqwx.FAMILY, Integer.valueOf((int) R.string.FAMILY_TRIP_TYPE_SELECTION_TEXT));
        p.f(dqwx.FRIENDS, Integer.valueOf((int) R.string.FRIENDS_TRIP_TYPE_SELECTION_TEXT));
        p.f(dqwx.SOLO, Integer.valueOf((int) R.string.SOLO_TRIP_TYPE_SELECTION_TEXT));
        p.f(dqwx.COUPLE, Integer.valueOf((int) R.string.COUPLE_TRIP_TYPE_SELECTION_TEXT));
        d = dcjz.c(p.b());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bqxi(final android.app.Activity r1, defpackage.btvo r2, defpackage.dqwx r3, boolean r4) {
        /*
            r0 = this;
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r0.<init>(r4)
            r0.c = r4
            r0.a = r3
            dcdn<dqwx, java.lang.Integer> r4 = defpackage.bqxi.d
            java.lang.Object r3 = r4.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            dbsg r3 = defpackage.dbsg.j(r3)
            r1.getClass()
            bqxh r4 = new bqxh
            r4.<init>(r1)
            dbsg r1 = r3.h(r4)
            java.lang.Object r1 = r1.f()
            java.lang.String r1 = (java.lang.String) r1
            r0.b = r1
            dcdg r1 = defpackage.dcdn.p()
            dqwx r3 = defpackage.dqwx.BUSINESS
            dkyr r4 = r2.getUgcParameters()
            dkyn r4 = r4.aM()
            java.lang.String r4 = r4.a
            r1.f(r3, r4)
            dqwx r3 = defpackage.dqwx.VACATION
            dkyr r4 = r2.getUgcParameters()
            dkyn r4 = r4.aM()
            java.lang.String r4 = r4.b
            r1.f(r3, r4)
            dqwx r3 = defpackage.dqwx.FAMILY
            dkyr r4 = r2.getUgcParameters()
            dkyn r4 = r4.aM()
            java.lang.String r4 = r4.c
            r1.f(r3, r4)
            dqwx r3 = defpackage.dqwx.FRIENDS
            dkyr r4 = r2.getUgcParameters()
            dkyn r4 = r4.aM()
            java.lang.String r4 = r4.d
            r1.f(r3, r4)
            dqwx r3 = defpackage.dqwx.SOLO
            dkyr r4 = r2.getUgcParameters()
            dkyn r4 = r4.aM()
            java.lang.String r4 = r4.e
            r1.f(r3, r4)
            dqwx r3 = defpackage.dqwx.COUPLE
            dkyr r2 = r2.getUgcParameters()
            dkyn r2 = r2.aM()
            java.lang.String r2 = r2.f
            r1.f(r3, r2)
            dcdn r1 = r1.b()
            dcdn r1 = defpackage.dcjz.c(r1)
            r0.e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bqxi.<init>(android.app.Activity, btvo, dqwx, boolean):void");
    }

    @Override // defpackage.bqtc
    @dzsi
    public String a() {
        return this.b;
    }

    @Override // defpackage.bqtc
    public jic b() {
        return new jic(this.e.get(this.a), ckqc.FULLY_QUALIFIED, 0);
    }

    @Override // defpackage.bqtc
    public Boolean c() {
        return this.c;
    }

    @Override // defpackage.bqtc
    public cqkl d() {
        Boolean valueOf = Boolean.valueOf(!this.c.booleanValue());
        this.c = valueOf;
        o(valueOf);
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.bquc
    protected final dbsg<Boolean> h(docg docgVar) {
        dqwy dqwyVar = docgVar.G;
        if (dqwyVar == null) {
            dqwyVar = dqwy.c;
        }
        return dbsg.i(Boolean.valueOf(dcbg.b(dqwyVar.a).p(new dbsl(this) { // from class: bqxg
            private final bqxi a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                bqxi bqxiVar = this.a;
                dqwv dqwvVar = (dqwv) obj;
                if ((dqwvVar.a & 1) != 0) {
                    dqwx b = dqwx.b(dqwvVar.b);
                    if (b == null) {
                        b = dqwx.UNKNOWN_TRIP_TYPE;
                    }
                    return b.equals(bqxiVar.a);
                }
                return false;
            }
        })));
    }
}
