package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: cyyz  reason: default package */
/* loaded from: classes5.dex */
public final class cyyz {
    public static final /* synthetic */ int a = 0;
    private static final Map<cyxh, czae> b;
    private static final dcdc<cyxj> c;
    private static final dcdc<cyxj> d;
    private dcdc<cyxj> e;
    private dcdc<cyxj> f;
    private final czad g;

    static {
        dcdg p = dcdn.p();
        p.f(cyxh.TIMES_CONTACTED, cyyh.a);
        p.f(cyxh.SECONDS_SINCE_LAST_TIME_CONTACTED, cyyq.a);
        p.f(cyxh.IS_SECONDARY_GOOGLE_ACCOUNT, cyyr.a);
        p.f(cyxh.FIELD_TIMES_USED, cyys.a);
        p.f(cyxh.FIELD_SECONDS_SINCE_LAST_TIME_USED, cyyt.a);
        p.f(cyxh.IS_CONTACT_STARRED, cyyu.a);
        p.f(cyxh.HAS_POSTAL_ADDRESS, cyyv.a);
        p.f(cyxh.HAS_NICKNAME, cyyw.a);
        p.f(cyxh.HAS_BIRTHDAY, cyyx.a);
        p.f(cyxh.HAS_CUSTOM_RINGTONE, cyyy.a);
        p.f(cyxh.HAS_AVATAR, cyyi.a);
        p.f(cyxh.IS_SENT_TO_VOICEMAIL, cyyj.a);
        p.f(cyxh.IS_PINNED, cyyk.a);
        p.f(cyxh.PINNED_POSITION, cyyl.a);
        p.f(cyxh.NUM_COMMUNICATION_CHANNELS, cyym.a);
        p.f(cyxh.NUM_RAW_CONTACTS, cyyn.a);
        p.f(cyxh.FIELD_IS_PRIMARY, cyyo.a);
        p.f(cyxh.FIELD_IS_SUPER_PRIMARY, cyyp.a);
        b = p.b();
        cyxi d2 = cyxj.d();
        d2.c(cyxh.TIMES_CONTACTED);
        d2.d(1.5d);
        d2.b(0.25d);
        c = dcdc.f(d2.a());
        cyxi d3 = cyxj.d();
        d3.c(cyxh.FIELD_TIMES_USED);
        d3.d(1.5d);
        d3.b(0.25d);
        d = dcdc.f(d3.a());
    }

    public cyyz(String str, dcdc<cyxj> dcdcVar) {
        long currentTimeMillis = System.currentTimeMillis();
        if (dcdcVar == null || dcdcVar.isEmpty()) {
            this.e = c;
            this.f = d;
        } else {
            dccx F = dcdc.F();
            dccx F2 = dcdc.F();
            int size = dcdcVar.size();
            for (int i = 0; i < size; i++) {
                cyxj cyxjVar = dcdcVar.get(i);
                if (cyxjVar.a().t) {
                    F.g(cyxjVar);
                } else {
                    F2.g(cyxjVar);
                }
            }
            dcdc<cyxj> f = F.f();
            this.e = f;
            if (f.isEmpty()) {
                this.e = c;
            }
            dcdc<cyxj> f2 = F2.f();
            this.f = f2;
            if (f2.isEmpty()) {
                this.f = d;
            }
        }
        this.g = new cyze(currentTimeMillis, str);
    }

    public static double b(@dzsi Boolean bool) {
        if (Boolean.TRUE.equals(bool)) {
            return 1.0d;
        }
        return dcyn.a;
    }

    public static double c(@dzsi Integer num) {
        return num == null ? dcyn.a : num.doubleValue();
    }

    public final double a(cyxg cyxgVar, boolean z) {
        dcdc<cyxj> f;
        if (z) {
            f = this.e;
        } else {
            dccx F = dcdc.F();
            F.i(this.e);
            F.i(this.f);
            f = F.f();
        }
        int size = f.size();
        double d2 = 0.0d;
        for (int i = 0; i < size; i++) {
            cyxj cyxjVar = f.get(i);
            double a2 = b.get(cyxjVar.a()).a(cyxgVar, this.g);
            d2 += a2 == dcyn.a ? 0.0d : cyxjVar.b() * Math.pow(a2, cyxjVar.c());
        }
        return d2;
    }
}
