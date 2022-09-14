package com.google.android.gms.measurement.internal;

import android.content.Context;
import c.e.a.b.d.g.cb;
import c.e.a.b.d.g.xc;
import java.util.List;
/* loaded from: classes.dex */
public final class w3 extends f5 {

    /* renamed from: c  reason: collision with root package name */
    private String f7748c;

    /* renamed from: d  reason: collision with root package name */
    private String f7749d;

    /* renamed from: e  reason: collision with root package name */
    private int f7750e;

    /* renamed from: f  reason: collision with root package name */
    private String f7751f;

    /* renamed from: g  reason: collision with root package name */
    private long f7752g;

    /* renamed from: h  reason: collision with root package name */
    private long f7753h;
    private List<String> i;
    private int j;
    private String k;
    private String l;
    private String m;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w3(d5 d5Var, long j) {
        super(d5Var);
        this.f7753h = j;
    }

    private final String I() {
        b4 x;
        String str;
        if (!xc.a() || !l().a(r.r0)) {
            try {
                Class<?> loadClass = d().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
                if (loadClass == null) {
                    return null;
                }
                try {
                    Object invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, d());
                    if (invoke == null) {
                        return null;
                    }
                    try {
                        return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                    } catch (Exception unused) {
                        x = c().y();
                        str = "Failed to retrieve Firebase Instance Id";
                    }
                } catch (Exception unused2) {
                    x = c().x();
                    str = "Failed to obtain Firebase Analytics instance";
                }
            } catch (ClassNotFoundException unused3) {
                return null;
            }
        } else {
            x = c().B();
            str = "Disabled IID for tests.";
        }
        x.a(str);
        return null;
    }

    @Override // com.google.android.gms.measurement.internal.f5
    protected final boolean A() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String B() {
        x();
        return this.f7748c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String C() {
        x();
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String D() {
        x();
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String E() {
        x();
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int F() {
        x();
        return this.f7750e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int G() {
        x();
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<String> H() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final fa a(String str) {
        boolean z;
        long min;
        Boolean e2;
        g();
        e();
        String B = B();
        String C = C();
        x();
        String str2 = this.f7749d;
        long F = F();
        x();
        String str3 = this.f7751f;
        long n = l().n();
        x();
        g();
        if (this.f7752g == 0) {
            this.f7752g = this.f7802a.u().a(d(), d().getPackageName());
        }
        long j = this.f7752g;
        boolean g2 = this.f7802a.g();
        boolean z2 = !k().v;
        g();
        e();
        String I = !this.f7802a.g() ? null : I();
        d5 d5Var = this.f7802a;
        Long valueOf = Long.valueOf(d5Var.o().j.a());
        int i = (valueOf.longValue() > 0L ? 1 : (valueOf.longValue() == 0L ? 0 : -1));
        long j2 = d5Var.F;
        if (i == 0) {
            min = j2;
            z = g2;
        } else {
            z = g2;
            min = Math.min(j2, valueOf.longValue());
        }
        int G = G();
        boolean booleanValue = l().q().booleanValue();
        qa l = l();
        l.e();
        Boolean e3 = l.e("google_analytics_ssaid_collection_enabled");
        boolean booleanValue2 = Boolean.valueOf(e3 == null || e3.booleanValue()).booleanValue();
        m4 k = k();
        k.g();
        return new fa(B, C, str2, F, str3, n, j, str, z, z2, I, 0L, min, G, booleanValue, booleanValue2, k.s().getBoolean("deferred_analytics_collection", false), D(), l().e("google_analytics_default_allow_ad_personalization_signals") == null ? null : Boolean.valueOf(!e2.booleanValue()), this.f7753h, l().a(r.c0) ? this.i : null, (!cb.a() || !l().a(r.o0)) ? null : E());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(28:1|(1:3)(6:105|106|(1:108)(2:123|(1:125))|109|110|(4:112|(1:114)(1:121)|115|116))|4|(1:104)(1:8)|9|(1:103)(1:13)|14|(1:(1:17)(1:18))|(4:20|21|23|(11:25|26|(1:28)|29|30|(1:91)(1:34)|35|(1:37)(1:90)|38|39|(7:87|(2:89|85)|(3:51|(1:53)(1:56)|54)|57|(3:59|(3:61|(1:63)(3:65|(3:68|(1:70)|66)|71)|64)|(1:73))|74|(1:(2:77|78)(2:80|81))(2:82|83))(9:43|(1:45)(1:86)|46|(2:84|85)|(0)|57|(0)|74|(0)(0))))|102|26|(0)|29|30|(1:32)|91|35|(0)(0)|38|39|(1:41)|87|(0)|(0)|57|(0)|74|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x022e, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x022f, code lost:
        c().s().a("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.z3.a(r0), r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0190 A[Catch: IllegalStateException -> 0x022e, TryCatch #1 {IllegalStateException -> 0x022e, blocks: (B:60:0x018a, B:62:0x0190, B:64:0x019c, B:66:0x01b0, B:70:0x01b9, B:73:0x01c3, B:75:0x01cf, B:79:0x01e6, B:81:0x01ee, B:89:0x0211, B:91:0x0225, B:93:0x022a, B:92:0x0228, B:83:0x01f4, B:84:0x01f8, B:85:0x01fb, B:87:0x0201, B:65:0x01ac), top: B:125:0x018a }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01c3 A[Catch: IllegalStateException -> 0x022e, TRY_ENTER, TryCatch #1 {IllegalStateException -> 0x022e, blocks: (B:60:0x018a, B:62:0x0190, B:64:0x019c, B:66:0x01b0, B:70:0x01b9, B:73:0x01c3, B:75:0x01cf, B:79:0x01e6, B:81:0x01ee, B:89:0x0211, B:91:0x0225, B:93:0x022a, B:92:0x0228, B:83:0x01f4, B:84:0x01f8, B:85:0x01fb, B:87:0x0201, B:65:0x01ac), top: B:125:0x018a }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0201 A[Catch: IllegalStateException -> 0x022e, TryCatch #1 {IllegalStateException -> 0x022e, blocks: (B:60:0x018a, B:62:0x0190, B:64:0x019c, B:66:0x01b0, B:70:0x01b9, B:73:0x01c3, B:75:0x01cf, B:79:0x01e6, B:81:0x01ee, B:89:0x0211, B:91:0x0225, B:93:0x022a, B:92:0x0228, B:83:0x01f4, B:84:0x01f8, B:85:0x01fb, B:87:0x0201, B:65:0x01ac), top: B:125:0x018a }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0211 A[Catch: IllegalStateException -> 0x022e, TryCatch #1 {IllegalStateException -> 0x022e, blocks: (B:60:0x018a, B:62:0x0190, B:64:0x019c, B:66:0x01b0, B:70:0x01b9, B:73:0x01c3, B:75:0x01cf, B:79:0x01e6, B:81:0x01ee, B:89:0x0211, B:91:0x0225, B:93:0x022a, B:92:0x0228, B:83:0x01f4, B:84:0x01f8, B:85:0x01fb, B:87:0x0201, B:65:0x01ac), top: B:125:0x018a }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024f  */
    @Override // com.google.android.gms.measurement.internal.f5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void u() {
        /*
            Method dump skipped, instructions count: 706
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.w3.u():void");
    }
}
