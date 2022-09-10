package defpackage;

import java.util.Set;
/* compiled from: PG */
/* renamed from: apsv  reason: default package */
/* loaded from: classes2.dex */
public final class apsv {
    public static final bvjk a = new bvjk("merchant_mode_businesses_latest_sync_time_millis", bvjk.b);
    public final btvo b;
    public final bvjj c;

    public apsv(btvo btvoVar, bvjj bvjjVar) {
        this.b = btvoVar;
        this.c = bvjjVar;
    }

    public static final bvjk c(String str) {
        String valueOf = String.valueOf(str);
        return new bvjk(valueOf.length() != 0 ? "MERCHANT_MODE_BUSINESS_LISTING_DATA_PREFIX".concat(valueOf) : new String("MERCHANT_MODE_BUSINESS_LISTING_DATA_PREFIX"), bvjk.b);
    }

    public final Set<String> a(btlu btluVar) {
        return this.c.E(bvjk.jt, btluVar, dcmr.a);
    }

    public final dbsg<apsg> b(String str, btlu btluVar) {
        apsx apsxVar = (apsx) this.c.N(c(str), btluVar, (dssr) apsx.e.cu(7), null);
        if (apsxVar == null) {
            return dbpy.a;
        }
        apsb apsbVar = new apsb();
        String str2 = apsxVar.b;
        if (str2 != null) {
            apsbVar.b = str2;
            String str3 = apsxVar.c;
            if (str3 != null) {
                apsbVar.c = str3;
                String str4 = apsxVar.d;
                if (str4 != null) {
                    apsbVar.d = str4;
                    String str5 = apsxVar.a;
                    if (str5 != null) {
                        apsbVar.a = str5;
                        String str6 = apsbVar.a == null ? " listingId" : "";
                        if (apsbVar.b == null) {
                            str6 = str6.concat(" businessName");
                        }
                        if (apsbVar.c == null) {
                            str6 = String.valueOf(str6).concat(" businessAddress");
                        }
                        if (apsbVar.d == null) {
                            str6 = String.valueOf(str6).concat(" businessProfileImageUrl");
                        }
                        if (str6.isEmpty()) {
                            return dbsg.i(new apsc(apsbVar.a, apsbVar.b, apsbVar.c, apsbVar.d));
                        }
                        String valueOf = String.valueOf(str6);
                        throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
                    }
                    throw new NullPointerException("Null listingId");
                }
                throw new NullPointerException("Null businessProfileImageUrl");
            }
            throw new NullPointerException("Null businessAddress");
        }
        throw new NullPointerException("Null businessName");
    }
}
