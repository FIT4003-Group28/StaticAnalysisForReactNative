package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cmkn  reason: default package */
/* loaded from: classes5.dex */
public final class cmkn implements cmjz, cmlo {
    public static final dcde<String, Integer> a;
    public static final dcdc<Long> b;
    public static final dcdc<Long> c;
    public static final dcdc<Long> d;
    public static final dcdc<Long> e;
    public static final dcdc<Long> f;
    private static cmkn h;
    public final cmjx g;
    private final Context i;
    private final dcdn<Integer, Long> j;
    private final cmnq k;
    private int l;
    private long m;
    private long n;
    private int o;
    private long p;
    private long q;
    private long r;
    private long s;

    static {
        dcdd a2 = dcde.a();
        a2.d("AD", 1, 2, 0, 0, 2);
        a2.d("AE", 1, 4, 4, 4, 1);
        a2.d("AF", 4, 4, 3, 4, 2);
        a2.d("AG", 2, 2, 1, 1, 2);
        a2.d("AI", 1, 2, 2, 2, 2);
        a2.d("AL", 1, 1, 0, 1, 2);
        a2.d("AM", 2, 2, 1, 2, 2);
        a2.d("AO", 3, 4, 4, 2, 2);
        a2.d("AR", 2, 4, 2, 2, 2);
        a2.d("AS", 2, 2, 4, 3, 2);
        a2.d("AT", 0, 3, 0, 0, 2);
        a2.d("AU", 0, 2, 0, 1, 1);
        a2.d("AW", 1, 2, 0, 4, 2);
        a2.d("AX", 0, 2, 2, 2, 2);
        a2.d("AZ", 3, 3, 3, 4, 2);
        a2.d("BA", 1, 1, 0, 1, 2);
        a2.d("BB", 0, 2, 0, 0, 2);
        a2.d("BD", 2, 0, 3, 3, 2);
        a2.d("BE", 0, 1, 2, 3, 2);
        a2.d("BF", 4, 4, 4, 2, 2);
        a2.d("BG", 0, 1, 0, 0, 2);
        a2.d("BH", 1, 0, 2, 4, 2);
        a2.d("BI", 4, 4, 4, 4, 2);
        a2.d("BJ", 4, 4, 3, 4, 2);
        a2.d("BL", 1, 2, 2, 2, 2);
        a2.d("BM", 1, 2, 0, 0, 2);
        a2.d("BN", 4, 0, 1, 1, 2);
        a2.d("BO", 2, 3, 3, 2, 2);
        a2.d("BQ", 1, 2, 1, 2, 2);
        a2.d("BR", 2, 4, 2, 1, 2);
        a2.d("BS", 3, 2, 2, 3, 2);
        a2.d("BT", 3, 0, 3, 2, 2);
        a2.d("BW", 3, 4, 2, 2, 2);
        a2.d("BY", 1, 0, 2, 1, 2);
        a2.d("BZ", 2, 2, 2, 1, 2);
        a2.d("CA", 0, 3, 1, 2, 3);
        a2.d("CD", 4, 3, 2, 2, 2);
        a2.d("CF", 4, 2, 2, 2, 2);
        a2.d("CG", 3, 4, 1, 1, 2);
        a2.d("CH", 0, 1, 0, 0, 0);
        a2.d("CI", 3, 3, 3, 3, 2);
        a2.d("CK", 3, 2, 1, 0, 2);
        a2.d("CL", 1, 1, 2, 3, 2);
        a2.d("CM", 3, 4, 3, 2, 2);
        a2.d("CN", 2, 2, 2, 1, 3);
        a2.d("CO", 2, 4, 3, 2, 2);
        a2.d("CR", 2, 3, 4, 4, 2);
        a2.d("CU", 4, 4, 2, 1, 2);
        a2.d("CV", 2, 3, 3, 3, 2);
        a2.d("CW", 1, 2, 0, 0, 2);
        a2.d("CY", 1, 2, 0, 0, 2);
        a2.d("CZ", 0, 1, 0, 0, 2);
        a2.d("DE", 0, 1, 1, 2, 0);
        a2.d("DJ", 4, 1, 4, 4, 2);
        a2.d("DK", 0, 0, 1, 0, 2);
        a2.d("DM", 1, 2, 2, 2, 2);
        a2.d("DO", 3, 4, 4, 4, 2);
        a2.d("DZ", 3, 2, 4, 4, 2);
        a2.d("EC", 2, 4, 3, 2, 2);
        a2.d("EE", 0, 0, 0, 0, 2);
        a2.d("EG", 3, 4, 2, 1, 2);
        a2.d("EH", 2, 2, 2, 2, 2);
        a2.d("ER", 4, 2, 2, 2, 2);
        a2.d("ES", 0, 1, 2, 1, 2);
        a2.d("ET", 4, 4, 4, 1, 2);
        a2.d("FI", 0, 0, 1, 0, 0);
        a2.d("FJ", 3, 0, 3, 3, 2);
        a2.d("FK", 2, 2, 2, 2, 2);
        a2.d("FM", 4, 2, 4, 3, 2);
        a2.d("FO", 0, 2, 0, 0, 2);
        a2.d("FR", 1, 0, 2, 1, 2);
        a2.d("GA", 3, 3, 1, 0, 2);
        a2.d("GB", 0, 0, 1, 2, 2);
        a2.d("GD", 1, 2, 2, 2, 2);
        a2.d("GE", 1, 0, 1, 3, 2);
        a2.d("GF", 2, 2, 2, 4, 2);
        a2.d("GG", 0, 2, 0, 0, 2);
        a2.d("GH", 3, 2, 3, 2, 2);
        a2.d("GI", 0, 2, 0, 0, 2);
        a2.d("GL", 1, 2, 2, 1, 2);
        a2.d("GM", 4, 3, 2, 4, 2);
        a2.d("GN", 4, 3, 4, 2, 2);
        a2.d("GP", 2, 2, 3, 4, 2);
        a2.d("GQ", 4, 2, 3, 4, 2);
        a2.d("GR", 1, 1, 0, 1, 2);
        a2.d("GT", 3, 2, 3, 2, 2);
        a2.d("GU", 1, 2, 4, 4, 2);
        a2.d("GW", 3, 4, 4, 3, 2);
        a2.d("GY", 3, 3, 1, 0, 2);
        a2.d("HK", 0, 2, 3, 4, 2);
        a2.d("HN", 3, 0, 3, 3, 2);
        a2.d("HR", 1, 1, 0, 1, 2);
        a2.d("HT", 4, 3, 4, 4, 2);
        a2.d("HU", 0, 1, 0, 0, 2);
        a2.d("ID", 3, 2, 2, 3, 2);
        a2.d("IE", 0, 0, 1, 1, 2);
        a2.d("IL", 1, 0, 2, 3, 2);
        a2.d("IM", 0, 2, 0, 1, 2);
        a2.d("IN", 2, 1, 3, 3, 2);
        a2.d("IO", 4, 2, 2, 4, 2);
        a2.d("IQ", 3, 2, 4, 3, 2);
        a2.d("IR", 4, 2, 3, 4, 2);
        a2.d("IS", 0, 2, 0, 0, 2);
        a2.d("IT", 0, 0, 1, 1, 2);
        a2.d("JE", 2, 2, 0, 2, 2);
        a2.d("JM", 3, 3, 4, 4, 2);
        a2.d("JO", 1, 2, 1, 1, 2);
        a2.d("JP", 0, 2, 0, 1, 3);
        a2.d("KE", 3, 4, 2, 2, 2);
        a2.d("KG", 1, 0, 2, 2, 2);
        a2.d("KH", 2, 0, 4, 3, 2);
        a2.d("KI", 4, 2, 3, 1, 2);
        a2.d("KM", 4, 2, 2, 3, 2);
        a2.d("KN", 1, 2, 2, 2, 2);
        a2.d("KP", 4, 2, 2, 2, 2);
        a2.d("KR", 0, 2, 1, 1, 1);
        a2.d("KW", 2, 3, 1, 1, 1);
        a2.d("KY", 1, 2, 0, 0, 2);
        a2.d("KZ", 1, 2, 2, 3, 2);
        a2.d("LA", 2, 2, 1, 1, 2);
        a2.d("LB", 3, 2, 0, 0, 2);
        a2.d("LC", 1, 1, 0, 0, 2);
        a2.d("LI", 0, 2, 2, 2, 2);
        a2.d("LK", 2, 0, 2, 3, 2);
        a2.d("LR", 3, 4, 3, 2, 2);
        a2.d("LS", 3, 3, 2, 3, 2);
        a2.d("LT", 0, 0, 0, 0, 2);
        a2.d("LU", 0, 0, 0, 0, 2);
        a2.d("LV", 0, 0, 0, 0, 2);
        a2.d("LY", 4, 2, 4, 3, 2);
        a2.d("MA", 2, 1, 2, 1, 2);
        a2.d("MC", 0, 2, 2, 2, 2);
        a2.d("MD", 1, 2, 0, 0, 2);
        a2.d("ME", 1, 2, 1, 2, 2);
        a2.d("MF", 1, 2, 1, 0, 2);
        a2.d("MG", 3, 4, 3, 3, 2);
        a2.d("MH", 4, 2, 2, 4, 2);
        a2.d("MK", 1, 0, 0, 0, 2);
        a2.d("ML", 4, 4, 1, 1, 2);
        a2.d("MM", 2, 3, 2, 2, 2);
        a2.d("MN", 2, 4, 1, 1, 2);
        a2.d("MO", 0, 2, 4, 4, 2);
        a2.d("MP", 0, 2, 2, 2, 2);
        a2.d("MQ", 2, 2, 2, 3, 2);
        a2.d("MR", 3, 0, 4, 2, 2);
        a2.d("MS", 1, 2, 2, 2, 2);
        a2.d("MT", 0, 2, 0, 1, 2);
        a2.d("MU", 3, 1, 2, 3, 2);
        a2.d("MV", 4, 3, 1, 4, 2);
        a2.d("MW", 4, 1, 1, 0, 2);
        a2.d("MX", 2, 4, 3, 3, 2);
        a2.d("MY", 2, 0, 3, 3, 2);
        a2.d("MZ", 3, 3, 2, 3, 2);
        a2.d("NA", 4, 3, 2, 2, 2);
        a2.d("NC", 2, 0, 4, 4, 2);
        a2.d("NE", 4, 4, 4, 4, 2);
        a2.d("NF", 2, 2, 2, 2, 2);
        a2.d("NG", 3, 3, 2, 2, 2);
        a2.d("NI", 3, 1, 4, 4, 2);
        a2.d("NL", 0, 2, 4, 2, 0);
        a2.d("NO", 0, 1, 1, 0, 2);
        a2.d("NP", 2, 0, 4, 3, 2);
        a2.d("NR", 4, 2, 3, 1, 2);
        a2.d("NU", 4, 2, 2, 2, 2);
        a2.d("NZ", 0, 2, 1, 2, 4);
        a2.d("OM", 2, 2, 0, 2, 2);
        a2.d("PA", 1, 3, 3, 4, 2);
        a2.d("PE", 2, 4, 4, 4, 2);
        a2.d("PF", 2, 2, 1, 1, 2);
        a2.d("PG", 4, 3, 3, 2, 2);
        a2.d("PH", 3, 0, 3, 4, 4);
        a2.d("PK", 3, 2, 3, 3, 2);
        a2.d("PL", 1, 0, 2, 2, 2);
        a2.d("PM", 0, 2, 2, 2, 2);
        a2.d("PR", 1, 2, 2, 3, 4);
        a2.d("PS", 3, 3, 2, 2, 2);
        a2.d("PT", 1, 1, 0, 0, 2);
        a2.d("PW", 1, 2, 3, 0, 2);
        a2.d("PY", 2, 0, 3, 3, 2);
        a2.d("QA", 2, 3, 1, 2, 2);
        a2.d("RE", 1, 0, 2, 1, 2);
        a2.d("RO", 1, 1, 1, 2, 2);
        a2.d("RS", 1, 2, 0, 0, 2);
        a2.d("RU", 0, 1, 0, 1, 2);
        a2.d("RW", 4, 3, 3, 4, 2);
        a2.d("SA", 2, 2, 2, 1, 2);
        a2.d("SB", 4, 2, 4, 2, 2);
        a2.d("SC", 4, 2, 0, 1, 2);
        a2.d("SD", 4, 4, 4, 3, 2);
        a2.d("SE", 0, 0, 0, 0, 2);
        a2.d("SG", 0, 0, 3, 3, 4);
        a2.d("SH", 4, 2, 2, 2, 2);
        a2.d("SI", 0, 1, 0, 0, 2);
        a2.d("SJ", 2, 2, 2, 2, 2);
        a2.d("SK", 0, 1, 0, 0, 2);
        a2.d("SL", 4, 3, 3, 1, 2);
        a2.d("SM", 0, 2, 2, 2, 2);
        a2.d("SN", 4, 4, 4, 3, 2);
        a2.d("SO", 3, 4, 4, 4, 2);
        a2.d("SR", 3, 2, 3, 1, 2);
        a2.d("SS", 4, 1, 4, 2, 2);
        a2.d("ST", 2, 2, 1, 2, 2);
        a2.d("SV", 2, 1, 4, 4, 2);
        a2.d("SX", 2, 2, 1, 0, 2);
        a2.d("SY", 4, 3, 2, 2, 2);
        a2.d("SZ", 3, 4, 3, 4, 2);
        a2.d("TC", 1, 2, 1, 0, 2);
        a2.d("TD", 4, 4, 4, 4, 2);
        a2.d("TG", 3, 2, 1, 0, 2);
        a2.d("TH", 1, 3, 4, 3, 0);
        a2.d("TJ", 4, 4, 4, 4, 2);
        a2.d("TL", 4, 1, 4, 4, 2);
        a2.d("TM", 4, 2, 1, 2, 2);
        a2.d("TN", 2, 1, 1, 1, 2);
        a2.d("TO", 3, 3, 4, 2, 2);
        a2.d("TR", 1, 2, 1, 1, 2);
        a2.d("TT", 1, 3, 1, 3, 2);
        a2.d("TV", 3, 2, 2, 4, 2);
        a2.d("TW", 0, 0, 0, 0, 1);
        a2.d("TZ", 3, 3, 3, 2, 2);
        a2.d("UA", 0, 3, 0, 0, 2);
        a2.d("UG", 3, 2, 2, 3, 2);
        a2.d("US", 0, 1, 3, 3, 3);
        a2.d("UY", 2, 1, 1, 1, 2);
        a2.d("UZ", 2, 0, 3, 2, 2);
        a2.d("VC", 2, 2, 2, 2, 2);
        a2.d("VE", 4, 4, 4, 4, 2);
        a2.d("VG", 2, 2, 1, 2, 2);
        a2.d("VI", 1, 2, 2, 4, 2);
        a2.d("VN", 0, 1, 4, 4, 2);
        a2.d("VU", 4, 1, 3, 1, 2);
        a2.d("WS", 3, 1, 4, 2, 2);
        a2.d("XK", 1, 1, 1, 0, 2);
        a2.d("YE", 4, 4, 4, 4, 2);
        a2.d("YT", 3, 2, 1, 3, 2);
        a2.d("ZA", 2, 3, 2, 2, 2);
        a2.d("ZM", 3, 2, 2, 3, 2);
        a2.d("ZW", 3, 3, 3, 3, 2);
        a = a2.a();
        b = dcdc.j(6100000L, 3800000L, 2100000L, 1300000L, 590000L);
        c = dcdc.j(218000L, 159000L, 145000L, 130000L, 112000L);
        d = dcdc.j(2200000L, 1300000L, 930000L, 730000L, 530000L);
        e = dcdc.j(4800000L, 2700000L, 1800000L, 1200000L, 630000L);
        f = dcdc.j(12000000L, 8800000L, 5900000L, 3500000L, 1800000L);
    }

    @Deprecated
    public cmkn() {
        int i = dcdn.c;
        cmmq cmmqVar = cmmq.a;
        throw null;
    }

    public static synchronized cmkn a(Context context) {
        cmkn cmknVar;
        synchronized (cmkn.class) {
            if (h == null) {
                Context applicationContext = context == null ? null : context.getApplicationContext();
                dcdc<Integer> h2 = a.h(cmny.U(context));
                if (h2.isEmpty()) {
                    h2 = dcdc.j(2, 2, 2, 2, 2);
                }
                HashMap hashMap = new HashMap(6);
                hashMap.put(0, 1000000L);
                dcdc<Long> dcdcVar = b;
                hashMap.put(2, dcdcVar.get(h2.get(0).intValue()));
                hashMap.put(3, c.get(h2.get(1).intValue()));
                hashMap.put(4, d.get(h2.get(2).intValue()));
                hashMap.put(5, e.get(h2.get(3).intValue()));
                hashMap.put(9, f.get(h2.get(4).intValue()));
                hashMap.put(7, dcdcVar.get(h2.get(0).intValue()));
                h = new cmkn(applicationContext, hashMap);
            }
            cmknVar = h;
        }
        return cmknVar;
    }

    private final void g(int i, final long j, final long j2) {
        if (i == 0) {
            if (j == 0 && j2 == this.s) {
                return;
            }
            i = 0;
        }
        this.s = j2;
        Iterator<cmjw> it = this.g.a.iterator();
        while (it.hasNext()) {
            final cmjw next = it.next();
            if (!next.c) {
                final int i2 = i;
                next.a.post(new Runnable(next, i2, j, j2) { // from class: cmjv
                    private final cmjw a;
                    private final int b;
                    private final long c;
                    private final long d;

                    {
                        this.a = next;
                        this.b = i2;
                        this.c = j;
                        this.d = j2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        clqv clqvVar = (clqv) this.a.b;
                        clqu clquVar = clqvVar.b;
                        clqvVar.O(clquVar.b.isEmpty() ? null : (cmeh) dcft.s(clquVar.b));
                        clqvVar.a.e(new cmmx() { // from class: clqn
                            @Override // defpackage.cmmx
                            public final void a(Object obj) {
                                apqn apqnVar = (apqn) obj;
                            }
                        });
                    }
                });
            }
        }
    }

    private final long h(int i) {
        Long l = this.j.get(Integer.valueOf(i));
        if (l == null) {
            l = this.j.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    private static boolean i(cmkj cmkjVar, boolean z) {
        return z && !cmkjVar.b(8);
    }

    public final synchronized void b() {
        Context context = this.i;
        int T = context == null ? 0 : cmny.T(context);
        if (this.o == T) {
            return;
        }
        this.o = T;
        if (T != 1 && T != 0 && T != 8) {
            this.r = h(T);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            g(this.l > 0 ? (int) (elapsedRealtime - this.m) : 0, this.n, this.r);
            this.m = elapsedRealtime;
            this.n = 0L;
            this.q = 0L;
            this.p = 0L;
            cmnq cmnqVar = this.k;
            cmnqVar.c.clear();
            cmnqVar.e = -1;
            cmnqVar.f = 0;
            cmnqVar.g = 0;
        }
    }

    @Override // defpackage.cmlo
    public final synchronized void c(cmkj cmkjVar, boolean z, int i) {
        if (!i(cmkjVar, z)) {
            return;
        }
        this.n += i;
    }

    @Override // defpackage.cmlo
    public final synchronized void d(cmkj cmkjVar, boolean z) {
        cmnp cmnpVar;
        ArrayList<cmnp> arrayList;
        float f2;
        if (!i(cmkjVar, z)) {
            return;
        }
        int i = 0;
        cmmn.c(this.l > 0);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i2 = (int) (elapsedRealtime - this.m);
        this.p += i2;
        long j = this.q;
        long j2 = this.n;
        this.q = j + j2;
        if (i2 > 0) {
            float f3 = (((float) j2) * 8000.0f) / i2;
            cmnq cmnqVar = this.k;
            int sqrt = (int) Math.sqrt(j2);
            if (cmnqVar.e != 1) {
                Collections.sort(cmnqVar.c, cmnq.a);
                cmnqVar.e = 1;
            }
            int i3 = cmnqVar.h;
            if (i3 > 0) {
                cmnp[] cmnpVarArr = cmnqVar.d;
                int i4 = i3 - 1;
                cmnqVar.h = i4;
                cmnpVar = cmnpVarArr[i4];
            } else {
                cmnpVar = new cmnp();
            }
            int i5 = cmnqVar.f;
            cmnqVar.f = i5 + 1;
            cmnpVar.a = i5;
            cmnpVar.b = sqrt;
            cmnpVar.c = f3;
            cmnqVar.c.add(cmnpVar);
            cmnqVar.g += sqrt;
            while (true) {
                int i6 = cmnqVar.g;
                if (i6 <= 2000) {
                    break;
                }
                int i7 = i6 - 2000;
                cmnp cmnpVar2 = cmnqVar.c.get(0);
                int i8 = cmnpVar2.b;
                if (i8 <= i7) {
                    cmnqVar.g -= i8;
                    cmnqVar.c.remove(0);
                    int i9 = cmnqVar.h;
                    if (i9 < 5) {
                        cmnp[] cmnpVarArr2 = cmnqVar.d;
                        cmnqVar.h = i9 + 1;
                        cmnpVarArr2[i9] = cmnpVar2;
                    }
                } else {
                    cmnpVar2.b = i8 - i7;
                    cmnqVar.g -= i7;
                }
            }
            if (this.p >= 2000 || this.q >= 524288) {
                cmnq cmnqVar2 = this.k;
                if (cmnqVar2.e != 0) {
                    Collections.sort(cmnqVar2.c, cmnq.b);
                    cmnqVar2.e = 0;
                }
                float f4 = cmnqVar2.g * 0.5f;
                int i10 = 0;
                while (true) {
                    if (i < cmnqVar2.c.size()) {
                        cmnp cmnpVar3 = cmnqVar2.c.get(i);
                        i10 += cmnpVar3.b;
                        if (i10 >= f4) {
                            f2 = cmnpVar3.c;
                            break;
                        }
                        i++;
                    } else if (cmnqVar2.c.isEmpty()) {
                        f2 = Float.NaN;
                    } else {
                        f2 = cmnqVar2.c.get(arrayList.size() - 1).c;
                    }
                }
                this.r = f2;
            }
            g(i2, this.n, this.r);
            this.m = elapsedRealtime;
            this.n = 0L;
        }
        this.l--;
    }

    @Override // defpackage.cmlo
    public final void e() {
    }

    @Override // defpackage.cmlo
    public final synchronized void f(cmkj cmkjVar, boolean z) {
        if (!i(cmkjVar, z)) {
            return;
        }
        if (this.l == 0) {
            this.m = SystemClock.elapsedRealtime();
        }
        this.l++;
    }

    public cmkn(Context context, Map<Integer, Long> map) {
        this.i = context == null ? null : context.getApplicationContext();
        this.j = dcdn.r(map);
        this.g = new cmjx();
        this.k = new cmnq();
        int T = context == null ? 0 : cmny.T(context);
        this.o = T;
        this.r = h(T);
        if (context != null) {
            cmkm.a(context).b(this);
        }
    }
}
