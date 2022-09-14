package com.google.android.gms.measurement.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c4 implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ int f7207b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ String f7208c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ Object f7209d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Object f7210e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ Object f7211f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ z3 f7212g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c4(z3 z3Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.f7212g = z3Var;
        this.f7207b = i;
        this.f7208c = str;
        this.f7209d = obj;
        this.f7210e = obj2;
        this.f7211f = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c2;
        long j;
        char c3;
        long j2;
        z3 z3Var;
        char c4;
        m4 o = this.f7212g.f7802a.o();
        if (!o.r()) {
            this.f7212g.a(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        c2 = this.f7212g.f7826c;
        if (c2 == 0) {
            if (this.f7212g.l().o()) {
                z3Var = this.f7212g;
                z3Var.w();
                c4 = 'C';
            } else {
                z3Var = this.f7212g;
                z3Var.w();
                c4 = 'c';
            }
            z3Var.f7826c = c4;
        }
        j = this.f7212g.f7827d;
        if (j < 0) {
            z3 z3Var2 = this.f7212g;
            z3Var2.f7827d = z3Var2.l().n();
        }
        char charAt = "01VDIWEA?".charAt(this.f7207b);
        c3 = this.f7212g.f7826c;
        j2 = this.f7212g.f7827d;
        String a2 = z3.a(true, this.f7208c, this.f7209d, this.f7210e, this.f7211f);
        StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 24);
        sb.append("2");
        sb.append(charAt);
        sb.append(c3);
        sb.append(j2);
        sb.append(":");
        sb.append(a2);
        String sb2 = sb.toString();
        if (sb2.length() > 1024) {
            sb2 = this.f7208c.substring(0, 1024);
        }
        o.f7485d.a(sb2, 1L);
    }
}
