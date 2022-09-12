package defpackage;

import java.util.Iterator;
/* compiled from: PG */
/* renamed from: aqwq  reason: default package */
/* loaded from: classes2.dex */
public class aqwq {
    public static final aqxd a = new aqxd();
    public static final bvjk b = new bvjk("merchant_mode_business_messaging_unobfuscated_gmb_listing_ids", bvjk.b);
    public final btvo c;
    public final bvjj d;
    public final Object e = new Object();

    public aqwq(btvo btvoVar, bvjj bvjjVar) {
        this.c = btvoVar;
        this.d = bvjjVar;
    }

    public static bvjk e(String str) {
        String valueOf = String.valueOf(str);
        return new bvjk(valueOf.length() != 0 ? "MERCHANT_MODE_BUSINESS_MESSAGING_DATA_PREFIX".concat(valueOf) : new String("MERCHANT_MODE_BUSINESS_MESSAGING_DATA_PREFIX"), bvjk.b);
    }

    public static bvjk f(String str) {
        String valueOf = String.valueOf(str);
        return new bvjk(valueOf.length() != 0 ? "MERCHANT_MODE_BUSINESS_MESSAGING_DATA_LATEST_SYNC_TIME_MILLIS_PREFIX".concat(valueOf) : new String("MERCHANT_MODE_BUSINESS_MESSAGING_DATA_LATEST_SYNC_TIME_MILLIS_PREFIX"), bvjk.b);
    }

    public static bvjk g(String str) {
        String valueOf = String.valueOf(str);
        return new bvjk(valueOf.length() != 0 ? "merchant_mode_messaging_promo_dismiss_state".concat(valueOf) : new String("merchant_mode_messaging_promo_dismiss_state"), bvjk.b);
    }

    public static bvjk h(String str) {
        String valueOf = String.valueOf(str);
        return new bvjk(valueOf.length() != 0 ? "merchant_mode_messaging_privacy_notification_shown".concat(valueOf) : new String("merchant_mode_messaging_privacy_notification_shown"), bvjk.b);
    }

    public static bvjk i(String str) {
        String valueOf = String.valueOf(str);
        return new bvjk(valueOf.length() != 0 ? "merchant_mode_messaging_privacy_banner_dismissed".concat(valueOf) : new String("merchant_mode_messaging_privacy_banner_dismissed"), bvjk.b);
    }

    public final dbsg<apzn> a(String str, btlu btluVar) {
        synchronized (this.e) {
            aqxf aqxfVar = (aqxf) this.d.N(e(str), btluVar, (dssr) aqxf.c.cu(7), null);
            if (aqxfVar == null) {
                return dbpy.a;
            }
            return dbsg.i(aqwx.a(aqxfVar));
        }
    }

    public final void b(btlu btluVar) {
        boolean z;
        synchronized (this.e) {
            Iterator<String> it = this.d.E(b, btluVar, dcmr.a).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z = false;
                    break;
                }
                dbsg<apzn> a2 = a(it.next(), btluVar);
                if (a2.a() && a2.b().b()) {
                    z = true;
                    break;
                }
            }
            this.d.T(bvjk.ju, btluVar, z);
        }
    }

    public final dsxh c(String str, @dzsi btlu btluVar) {
        dsxh dsxhVar;
        synchronized (this.e) {
            dsxhVar = (dsxh) this.d.N(g(str), btluVar, (dssr) dsxh.c.cu(7), dsxh.c);
        }
        return dsxhVar;
    }

    public final boolean d(btlu btluVar, String str) {
        boolean o;
        synchronized (this.e) {
            o = this.d.o(i(str), btluVar, false);
        }
        return o;
    }
}
