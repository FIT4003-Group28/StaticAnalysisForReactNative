package defpackage;

import android.app.Activity;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cfkk  reason: default package */
/* loaded from: classes4.dex */
public class cfkk implements cfhi {
    private final Activity a;
    private final cfkj b;
    private final boolean c;
    private boolean d;
    private boolean e;
    private final boolean f;

    public cfkk(cqhn cqhnVar, cfgv cfgvVar, Activity activity, cfkj cfkjVar, dspd dspdVar, boolean z, boolean z2) {
        this.b = cfkjVar;
        this.c = z;
        this.f = z2;
        dbsg<cfgd> e = cfgvVar.e(dspdVar);
        boolean z3 = true;
        boolean z4 = e.a() && !e.b().c;
        this.d = (z4 || !z) ? false : z3;
        this.e = z4;
        this.a = activity;
    }

    @Override // defpackage.cfhi
    public Boolean a() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.cfhi
    public Boolean b() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.cfhi
    public cqkl c() {
        this.b.a();
        return cqkl.a;
    }

    @Override // defpackage.cfhi
    public cqkl d() {
        this.b.b();
        return cqkl.a;
    }

    @Override // defpackage.cfhi
    public cqkl e() {
        this.b.c();
        return cqkl.a;
    }

    @Override // defpackage.cfhi
    public Boolean f() {
        btpf c = btpf.c(this.a);
        boolean z = false;
        if (this.f && c.f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public void g(boolean z) {
        if (z != this.e) {
            this.e = z;
            boolean z2 = false;
            if (this.c && !z) {
                z2 = true;
            }
            this.d = z2;
            cqkx.p(this);
        }
    }
}
