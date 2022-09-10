package defpackage;
/* compiled from: PG */
/* renamed from: bzwi  reason: default package */
/* loaded from: classes4.dex */
public final class bzwi {
    private static final dcdn<blpk, ddda> a;
    private static final dcdn<blpk, ddda> b;
    private static final dcdn<blpk, ddda> c;

    static {
        dcdg p = dcdn.p();
        p.f(blpk.PLACE_PAGE, ddda.Ke);
        p.f(blpk.NOTIFICATION_RIDDLER, ddda.Ko);
        p.f(blpk.TODO_LIST, ddda.KB);
        p.f(blpk.NOTIFICATION_RATE_AND_REVIEW, ddda.Kh);
        p.f(blpk.REVIEW_AT_A_PLACE_NOTIFICATION, ddda.Kk);
        p.f(blpk.REVIEW_AT_A_PLACE_NOTIFICATION_INLINE, ddda.fc);
        p.f(blpk.THANKS_PAGE, ddda.fz);
        p.f(blpk.SERVICE_RECOMMENDATION_POST_INTERACTION_NOTIFICATION, ddda.fr);
        p.f(blpk.SERVICE_RECOMMENDATION_POST_INTERACTION_NOTIFICATION_INLINE, ddda.fq);
        p.f(blpk.CONTRIBUTE_TAB_TODO_REVIEW_CARD, ddda.cf);
        p.f(blpk.CONTRIBUTE_TAB_TOP_ACTION, ddda.cg);
        a = p.b();
        dcdg p2 = dcdn.p();
        p2.f(blpk.PLACE_PAGE, ddda.Kd);
        p2.f(blpk.NOTIFICATION_RIDDLER, ddda.Km);
        p2.f(blpk.TODO_LIST, ddda.Kz);
        p2.f(blpk.TODO_LIST_PLACE_REOPEN_TASK, ddda.Ky);
        p2.f(blpk.NOTIFICATION_RATE_AND_REVIEW, ddda.Kf);
        p2.f(blpk.POST_TRIP_UGC, ddda.eS);
        b = p2.b();
        dcdg p3 = dcdn.p();
        p3.f(blpk.PLACE_PAGE, ddda.Kl);
        p3.f(blpk.TODO_LIST, ddda.KA);
        p3.f(blpk.NOTIFICATION_RIDDLER, ddda.Kn);
        p3.f(blpk.NOTIFICATION_RATE_AND_REVIEW, ddda.Kg);
        p3.f(blpk.POST_TRIP_UGC, ddda.eR);
        c = p3.b();
    }

    public static dnqh a(blpk blpkVar) {
        dnqg bZ = dnqh.p.bZ();
        dcdn<blpk, ddda> dcdnVar = b;
        if (dcdnVar.containsKey(blpkVar)) {
            int i = dcdnVar.get(blpkVar).b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar = (dnqh) bZ.b;
            dnqhVar.a |= 64;
            dnqhVar.g = i;
        } else {
            int i2 = ddfs.b.a;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar2 = (dnqh) bZ.b;
            dnqhVar2.a |= 64;
            dnqhVar2.g = i2;
        }
        return bZ.bK();
    }

    public static dnqh b(blpk blpkVar) {
        dnqg bZ = dnqh.p.bZ();
        dcdn<blpk, ddda> dcdnVar = c;
        if (dcdnVar.containsKey(blpkVar)) {
            int i = dcdnVar.get(blpkVar).b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar = (dnqh) bZ.b;
            dnqhVar.a |= 64;
            dnqhVar.g = i;
        } else {
            int i2 = ddfs.b.a;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar2 = (dnqh) bZ.b;
            dnqhVar2.a |= 64;
            dnqhVar2.g = i2;
        }
        return bZ.bK();
    }

    public static dnqh c(blpk blpkVar) {
        dnqg bZ = dnqh.p.bZ();
        dcdn<blpk, ddda> dcdnVar = a;
        if (dcdnVar.containsKey(blpkVar)) {
            int i = dcdnVar.get(blpkVar).b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar = (dnqh) bZ.b;
            dnqhVar.a |= 64;
            dnqhVar.g = i;
        } else {
            int i2 = ddfs.b.a;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar2 = (dnqh) bZ.b;
            dnqhVar2.a |= 64;
            dnqhVar2.g = i2;
        }
        return bZ.bK();
    }
}
