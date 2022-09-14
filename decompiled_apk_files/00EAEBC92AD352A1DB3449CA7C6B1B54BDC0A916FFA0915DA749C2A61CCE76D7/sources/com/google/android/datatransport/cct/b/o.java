package com.google.android.datatransport.cct.b;

import android.util.SparseArray;
import com.google.android.datatransport.cct.b.i;
/* loaded from: classes.dex */
public abstract class o {

    /* loaded from: classes.dex */
    public static abstract class a {
        public abstract a a(b bVar);

        public abstract a a(c cVar);

        public abstract o a();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: classes.dex */
    public static final class b extends Enum<b> {

        /* renamed from: c  reason: collision with root package name */
        public static final b f6652c = new b("UNKNOWN_MOBILE_SUBTYPE", 0, 0);

        /* renamed from: d  reason: collision with root package name */
        public static final b f6653d = new b("GPRS", 1, 1);

        /* renamed from: e  reason: collision with root package name */
        public static final b f6654e = new b("EDGE", 2, 2);

        /* renamed from: f  reason: collision with root package name */
        public static final b f6655f = new b("UMTS", 3, 3);

        /* renamed from: g  reason: collision with root package name */
        public static final b f6656g = new b("CDMA", 4, 4);

        /* renamed from: h  reason: collision with root package name */
        public static final b f6657h = new b("EVDO_0", 5, 5);
        public static final b i = new b("EVDO_A", 6, 6);
        public static final b j = new b("RTT", 7, 7);
        public static final b k = new b("HSDPA", 8, 8);
        public static final b l = new b("HSUPA", 9, 9);
        public static final b m = new b("HSPA", 10, 10);
        public static final b n = new b("IDEN", 11, 11);
        public static final b o = new b("EVDO_B", 12, 12);
        public static final b p = new b("LTE", 13, 13);
        public static final b q = new b("EHRPD", 14, 14);
        public static final b r = new b("HSPAP", 15, 15);
        public static final b s = new b("GSM", 16, 16);
        public static final b t = new b("TD_SCDMA", 17, 17);
        public static final b u = new b("IWLAN", 18, 18);
        public static final b v = new b("LTE_CA", 19, 19);
        public static final b w = new b("COMBINED", 20, 100);
        private static final SparseArray<b> x;

        /* renamed from: b  reason: collision with root package name */
        private final int f6658b;

        static {
            b[] bVarArr = {f6652c, f6653d, f6654e, f6655f, f6656g, f6657h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w};
            x = new SparseArray<>();
            x.put(0, f6652c);
            x.put(1, f6653d);
            x.put(2, f6654e);
            x.put(3, f6655f);
            x.put(4, f6656g);
            x.put(5, f6657h);
            x.put(6, i);
            x.put(7, j);
            x.put(8, k);
            x.put(9, l);
            x.put(10, m);
            x.put(11, n);
            x.put(12, o);
            x.put(13, p);
            x.put(14, q);
            x.put(15, r);
            x.put(16, s);
            x.put(17, t);
            x.put(18, u);
            x.put(19, v);
        }

        private b(String str, int i2, int i3) {
            this.f6658b = i3;
        }

        public static b a(int i2) {
            return x.get(i2);
        }

        public int a() {
            return this.f6658b;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: classes.dex */
    public static final class c extends Enum<c> {

        /* renamed from: c  reason: collision with root package name */
        public static final c f6659c = new c("MOBILE", 0, 0);

        /* renamed from: d  reason: collision with root package name */
        public static final c f6660d = new c("WIFI", 1, 1);

        /* renamed from: e  reason: collision with root package name */
        public static final c f6661e = new c("MOBILE_MMS", 2, 2);

        /* renamed from: f  reason: collision with root package name */
        public static final c f6662f = new c("MOBILE_SUPL", 3, 3);

        /* renamed from: g  reason: collision with root package name */
        public static final c f6663g = new c("MOBILE_DUN", 4, 4);

        /* renamed from: h  reason: collision with root package name */
        public static final c f6664h = new c("MOBILE_HIPRI", 5, 5);
        public static final c i = new c("WIMAX", 6, 6);
        public static final c j = new c("BLUETOOTH", 7, 7);
        public static final c k = new c("DUMMY", 8, 8);
        public static final c l = new c("ETHERNET", 9, 9);
        public static final c m = new c("MOBILE_FOTA", 10, 10);
        public static final c n = new c("MOBILE_IMS", 11, 11);
        public static final c o = new c("MOBILE_CBS", 12, 12);
        public static final c p = new c("WIFI_P2P", 13, 13);
        public static final c q = new c("MOBILE_IA", 14, 14);
        public static final c r = new c("MOBILE_EMERGENCY", 15, 15);
        public static final c s = new c("PROXY", 16, 16);
        public static final c t = new c("VPN", 17, 17);
        public static final c u = new c("NONE", 18, -1);
        private static final SparseArray<c> v;

        /* renamed from: b  reason: collision with root package name */
        private final int f6665b;

        static {
            c[] cVarArr = {f6659c, f6660d, f6661e, f6662f, f6663g, f6664h, i, j, k, l, m, n, o, p, q, r, s, t, u};
            v = new SparseArray<>();
            v.put(0, f6659c);
            v.put(1, f6660d);
            v.put(2, f6661e);
            v.put(3, f6662f);
            v.put(4, f6663g);
            v.put(5, f6664h);
            v.put(6, i);
            v.put(7, j);
            v.put(8, k);
            v.put(9, l);
            v.put(10, m);
            v.put(11, n);
            v.put(12, o);
            v.put(13, p);
            v.put(14, q);
            v.put(15, r);
            v.put(16, s);
            v.put(17, t);
            v.put(-1, u);
        }

        private c(String str, int i2, int i3) {
            this.f6665b = i3;
        }

        public static c a(int i2) {
            return v.get(i2);
        }

        public int a() {
            return this.f6665b;
        }
    }

    public static a c() {
        return new i.b();
    }

    public abstract b a();

    public abstract c b();
}
