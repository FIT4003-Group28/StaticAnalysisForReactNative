package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cetu  reason: default package */
/* loaded from: classes4.dex */
public class cetu implements cetd {
    private static final dcqe b = dcqe.c("cetu");
    public final cets a;
    private final cetc c;
    private final cets d;
    private final boolean e;
    private final boolean f;

    public cetu(final gga ggaVar, cqhn cqhnVar, final axjh axjhVar, axhs axhsVar, axhq axhqVar, final dhtc dhtcVar, dqam dqamVar, final cexk cexkVar) {
        String num;
        dbsg dbsgVar;
        int i = 0;
        this.e = (dqamVar.a & 4) != 0;
        dqah dqahVar = dqamVar.d;
        this.f = 1 == ((dqahVar == null ? dqah.e : dqahVar).a & 1);
        boolean z = dqamVar.e;
        dnhw dnhwVar = dhtcVar.f;
        dnhwVar = dnhwVar == null ? dnhw.c : dnhwVar;
        dnhv dnhvVar = dnhwVar.a;
        if ((dnhvVar == null ? dnhv.c : dnhvVar).a == 2) {
            dnhv dnhvVar2 = dnhwVar.a;
            dnhvVar2 = dnhvVar2 == null ? dnhv.c : dnhvVar2;
            num = dnhvVar2.a == 2 ? (String) dnhvVar2.b : "";
        } else {
            dnhv dnhvVar3 = dnhwVar.a;
            dnhvVar3 = dnhvVar3 == null ? dnhv.c : dnhvVar3;
            num = Integer.toString(dnhvVar3.a == 1 ? ((Integer) dnhvVar3.b).intValue() : i);
        }
        String str = dnhwVar.b;
        cexkVar.getClass();
        this.c = new cett(num, str, new Runnable(cexkVar) { // from class: cetl
            private final cexk a;

            {
                this.a = cexkVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.y();
            }
        });
        m D = cexkVar.D();
        dqkn dqknVar = dhtcVar.b;
        axfm i2 = axhsVar.i((dqknVar == null ? dqkn.e : dqknVar).d);
        z<axfk> zVar = i2.d;
        dbpy<Object> dbpyVar = dbpy.a;
        Boolean valueOf = Boolean.valueOf(z);
        this.d = new cets(ggaVar, zVar, dbpyVar, valueOf, new Runnable(axjhVar, dhtcVar) { // from class: cetm
            private final axjh a;
            private final dhtc b;

            {
                this.a = axjhVar;
                this.b = dhtcVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                axjh axjhVar2 = this.a;
                dqkn dqknVar2 = this.b.b;
                if (dqknVar2 == null) {
                    dqknVar2 = dqkn.e;
                }
                axjhVar2.k(dqknVar2, axok.FOLLOWING);
            }
        }, cjtd.a(dtxy.L), new dbrn(ggaVar) { // from class: cetn
            private final gga a;

            {
                this.a = ggaVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                Integer num2 = (Integer) obj;
                return dbqa.a(this.a.getResources().getString(R.string.FOLLOWING_LABEL));
            }
        }, R.plurals.PROFILE_FOLLOWEE_COUNT_CONTENT_DESCRIPTION, cqhnVar, this, D);
        if (dqamVar.b == 1) {
            dbsgVar = dbsg.i(axhqVar.a(axhp.a));
        } else {
            dbsgVar = dbpy.a;
        }
        this.a = new cets(ggaVar, i2.e, dbsgVar, valueOf, new Runnable(axjhVar, dhtcVar) { // from class: ceto
            private final axjh a;
            private final dhtc b;

            {
                this.a = axjhVar;
                this.b = dhtcVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                axjh axjhVar2 = this.a;
                dqkn dqknVar2 = this.b.b;
                if (dqknVar2 == null) {
                    dqknVar2 = dqkn.e;
                }
                axjhVar2.k(dqknVar2, axok.FOLLOWERS);
            }
        }, cjtd.a(dtxy.K), new dbrn(ggaVar) { // from class: cetp
            private final gga a;

            {
                this.a = ggaVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return dbqa.a(this.a.getResources().getQuantityString(R.plurals.FOLLOWER_COUNT_LABEL, ((Integer) obj).intValue()));
            }
        }, R.plurals.PROFILE_FOLLOWER_COUNT_CONTENT_DESCRIPTION, cqhnVar, this, D);
    }

    @Override // defpackage.cetd
    @dzsi
    public cetc a() {
        if (!this.a.h() || !this.e) {
            return null;
        }
        return this.a;
    }

    @Override // defpackage.cetd
    @dzsi
    public cetc b() {
        if (this.e && !this.d.h()) {
            if (this.f) {
                bvoo.h("The following count was set to null after being initialized by the following count value in profile response", new Object[0]);
            } else {
                bvoo.h("The following count was not served in the profile response", new Object[0]);
            }
        }
        if (!this.d.h() || !this.e) {
            return null;
        }
        return this.d;
    }

    @Override // defpackage.cetd
    public cetc c() {
        return this.c;
    }
}
