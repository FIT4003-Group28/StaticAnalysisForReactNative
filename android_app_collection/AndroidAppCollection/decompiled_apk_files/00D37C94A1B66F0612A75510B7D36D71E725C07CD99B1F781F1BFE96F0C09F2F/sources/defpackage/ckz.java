package defpackage;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ckz  reason: default package */
/* loaded from: classes2.dex */
public final class ckz implements cjr, cjq {
    public final cjs a;
    public final cjq b;
    public volatile Object c;
    public volatile cjo d;
    private volatile int e;
    private volatile cjn f;
    private volatile cnp g;

    public ckz(cjs cjsVar, cjq cjqVar) {
        this.a = cjsVar;
        this.b = cjqVar;
    }

    @Override // defpackage.cjr
    public final void a() {
        cnp cnpVar = this.g;
        if (cnpVar != null) {
            cnpVar.c.b();
        }
    }

    @Override // defpackage.cjr
    public final boolean b() {
        boolean z;
        boolean z2 = false;
        if (this.c != null) {
            Object obj = this.c;
            this.c = null;
            try {
                cuy.b();
                try {
                    cin a = this.a.c.c.a(obj);
                    Object a2 = a.a();
                    chn a3 = this.a.c.c.g.a(a2.getClass());
                    if (a3 != null) {
                        cjp cjpVar = new cjp(a3, a2, this.a.h);
                        cjo cjoVar = new cjo(this.g.a, this.a.m);
                        clt d = this.a.d();
                        d.b(cjoVar, cjpVar);
                        if (d.a(cjoVar) == null) {
                            try {
                                this.b.e(this.g.a, a.a(), this.g.c, this.g.c.e(), this.g.a);
                                return true;
                            } catch (Throwable th) {
                                th = th;
                                z = true;
                                if (!z) {
                                    this.g.c.c();
                                }
                                throw th;
                            }
                        }
                        this.d = cjoVar;
                        this.f = new cjn(Collections.singletonList(this.g.a), this.a, this);
                        this.g.c.c();
                    } else {
                        throw new cga(a2.getClass());
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z = false;
                }
            } catch (IOException unused) {
            }
        }
        if (this.f == null || !this.f.b()) {
            this.f = null;
            this.g = null;
            while (!z2 && this.e < this.a.f().size()) {
                List f = this.a.f();
                int i = this.e;
                this.e = i + 1;
                this.g = (cnp) f.get(i);
                if (this.g != null && (this.a.o.c(this.g.c.e()) || this.a.h(this.g.c.a()))) {
                    this.g.c.d(this.a.n, new cky(this, this.g));
                    z2 = true;
                }
            }
            return z2;
        }
        return true;
    }

    @Override // defpackage.cjq
    public final void c() {
        throw null;
    }

    @Override // defpackage.cjq
    public final void d(chy chyVar, Exception exc, cil cilVar, int i) {
        this.b.d(chyVar, exc, cilVar, this.g.c.e());
    }

    @Override // defpackage.cjq
    public final void e(chy chyVar, Object obj, cil cilVar, int i, chy chyVar2) {
        this.b.e(chyVar, obj, cilVar, this.g.c.e(), chyVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f(cnp cnpVar) {
        cnp cnpVar2 = this.g;
        return cnpVar2 != null && cnpVar2 == cnpVar;
    }
}
