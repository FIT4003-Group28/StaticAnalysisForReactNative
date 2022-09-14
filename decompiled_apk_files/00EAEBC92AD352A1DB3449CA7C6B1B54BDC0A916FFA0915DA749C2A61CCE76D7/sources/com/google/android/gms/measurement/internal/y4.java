package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import c.e.a.b.d.g.a1;
import c.e.a.b.d.g.b1;
import java.util.ArrayList;
import java.util.Map;
/* loaded from: classes.dex */
public final class y4 extends o9 implements b {
    private static int j = 65535;
    private static int k = 2;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, Map<String, String>> f7797d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, Map<String, Boolean>> f7798e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, Map<String, Boolean>> f7799f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, c.e.a.b.d.g.b1> f7800g;

    /* renamed from: h  reason: collision with root package name */
    private final Map<String, Map<String, Integer>> f7801h;
    private final Map<String, String> i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y4(r9 r9Var) {
        super(r9Var);
        this.f7797d = new a.e.a();
        this.f7798e = new a.e.a();
        this.f7799f = new a.e.a();
        this.f7800g = new a.e.a();
        this.i = new a.e.a();
        this.f7801h = new a.e.a();
    }

    private final c.e.a.b.d.g.b1 a(String str, byte[] bArr) {
        if (bArr == null) {
            return c.e.a.b.d.g.b1.x();
        }
        try {
            b1.a v = c.e.a.b.d.g.b1.v();
            v9.a(v, bArr);
            c.e.a.b.d.g.b1 b1Var = (c.e.a.b.d.g.b1) ((c.e.a.b.d.g.b5) v.i());
            b4 B = c().B();
            String str2 = null;
            Long valueOf = b1Var.n() ? Long.valueOf(b1Var.o()) : null;
            if (b1Var.p()) {
                str2 = b1Var.q();
            }
            B.a("Parsed config. version, gmp_app_id", valueOf, str2);
            return b1Var;
        } catch (c.e.a.b.d.g.j5 | RuntimeException e2) {
            c().v().a("Unable to merge remote config. appId", z3.a(str), e2);
            return c.e.a.b.d.g.b1.x();
        }
    }

    private static Map<String, String> a(c.e.a.b.d.g.b1 b1Var) {
        a.e.a aVar = new a.e.a();
        if (b1Var != null) {
            for (c.e.a.b.d.g.c1 c1Var : b1Var.r()) {
                aVar.put(c1Var.n(), c1Var.o());
            }
        }
        return aVar;
    }

    private final void a(String str, b1.a aVar) {
        a.e.a aVar2 = new a.e.a();
        a.e.a aVar3 = new a.e.a();
        a.e.a aVar4 = new a.e.a();
        if (aVar != null) {
            for (int i = 0; i < aVar.j(); i++) {
                a1.a j2 = aVar.a(i).j();
                if (TextUtils.isEmpty(j2.j())) {
                    c().v().a("EventConfig contained null event name");
                } else {
                    String b2 = c6.b(j2.j());
                    if (!TextUtils.isEmpty(b2)) {
                        j2.a(b2);
                        aVar.a(i, j2);
                    }
                    aVar2.put(j2.j(), Boolean.valueOf(j2.k()));
                    aVar3.put(j2.j(), Boolean.valueOf(j2.l()));
                    if (j2.m()) {
                        if (j2.n() < k || j2.n() > j) {
                            c().v().a("Invalid sampling rate. Event name, sample rate", j2.j(), Integer.valueOf(j2.n()));
                        } else {
                            aVar4.put(j2.j(), Integer.valueOf(j2.n()));
                        }
                    }
                }
            }
        }
        this.f7798e.put(str, aVar2);
        this.f7799f.put(str, aVar3);
        this.f7801h.put(str, aVar4);
    }

    private final void i(String str) {
        q();
        g();
        com.google.android.gms.common.internal.s.b(str);
        if (this.f7800g.get(str) == null) {
            byte[] d2 = n().d(str);
            if (d2 != null) {
                b1.a j2 = a(str, d2).j();
                a(str, j2);
                this.f7797d.put(str, a((c.e.a.b.d.g.b1) j2.i()));
                this.f7800g.put(str, (c.e.a.b.d.g.b1) j2.i());
                this.i.put(str, null);
                return;
            }
            this.f7797d.put(str, null);
            this.f7798e.put(str, null);
            this.f7799f.put(str, null);
            this.f7800g.put(str, null);
            this.i.put(str, null);
            this.f7801h.put(str, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final c.e.a.b.d.g.b1 a(String str) {
        q();
        g();
        com.google.android.gms.common.internal.s.b(str);
        i(str);
        return this.f7800g.get(str);
    }

    @Override // com.google.android.gms.measurement.internal.b
    public final String a(String str, String str2) {
        g();
        i(str);
        Map<String, String> map = this.f7797d.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean a(String str, byte[] bArr, String str2) {
        q();
        g();
        com.google.android.gms.common.internal.s.b(str);
        b1.a j2 = a(str, bArr).j();
        if (j2 == null) {
            return false;
        }
        a(str, j2);
        this.f7800g.put(str, (c.e.a.b.d.g.b1) j2.i());
        this.i.put(str, str2);
        this.f7797d.put(str, a((c.e.a.b.d.g.b1) j2.i()));
        n().a(str, new ArrayList(j2.k()));
        try {
            j2.l();
            bArr = ((c.e.a.b.d.g.b1) ((c.e.a.b.d.g.b5) j2.i())).f();
        } catch (RuntimeException e2) {
            c().v().a("Unable to serialize reduced-size config. Storing full config instead. appId", z3.a(str), e2);
        }
        e n = n();
        com.google.android.gms.common.internal.s.b(str);
        n.g();
        n.q();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        try {
            if (n.u().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                n.c().s().a("Failed to update remote config (got 0). appId", z3.a(str));
            }
        } catch (SQLiteException e3) {
            n.c().s().a("Error storing remote config. appId", z3.a(str), e3);
        }
        this.f7800g.put(str, (c.e.a.b.d.g.b1) j2.i());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String b(String str) {
        g();
        return this.i.get(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(String str, String str2) {
        Boolean bool;
        g();
        i(str);
        if (!g(str) || !z9.f(str2)) {
            if (h(str) && z9.e(str2)) {
                return true;
            }
            Map<String, Boolean> map = this.f7798e.get(str);
            if (map != null && (bool = map.get(str2)) != null) {
                return bool.booleanValue();
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c(String str) {
        g();
        this.i.put(str, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c(String str, String str2) {
        Boolean bool;
        g();
        i(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        if (c.e.a.b.d.g.k9.a() && l().a(r.J0) && ("purchase".equals(str2) || "refund".equals(str2))) {
            return true;
        }
        Map<String, Boolean> map = this.f7799f.get(str);
        if (map != null && (bool = map.get(str2)) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int d(String str, String str2) {
        Integer num;
        g();
        i(str);
        Map<String, Integer> map = this.f7801h.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(String str) {
        g();
        this.f7800g.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e(String str) {
        g();
        c.e.a.b.d.g.b1 a2 = a(str);
        if (a2 == null) {
            return false;
        }
        return a2.u();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long f(String str) {
        String a2 = a(str, "measurement.account.time_zone_offset_minutes");
        if (!TextUtils.isEmpty(a2)) {
            try {
                return Long.parseLong(a2);
            } catch (NumberFormatException e2) {
                c().v().a("Unable to parse timezone offset. appId", z3.a(str), e2);
                return 0L;
            }
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean g(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_internal"));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean h(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_public"));
    }

    @Override // com.google.android.gms.measurement.internal.o9
    protected final boolean s() {
        return false;
    }
}
