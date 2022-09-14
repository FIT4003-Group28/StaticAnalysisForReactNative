package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: brgl  reason: default package */
/* loaded from: classes4.dex */
public class brgl implements brgu {
    private static final dcqe f = dcqe.c("brgl");
    public String c;
    private final brgk g;
    private final dehq h;
    private final brdi i;
    private final brda j;
    public boolean b = false;
    public boolean d = false;
    public boolean e = false;
    private final brgs k = new brgj(this);
    public final List<brgt> a = new ArrayList();

    public brgl(String str, brdi brdiVar, brda brdaVar, dehq dehqVar, brgk brgkVar, cqhn cqhnVar) {
        this.c = str;
        this.i = brdiVar;
        this.j = brdaVar;
        this.h = dehqVar;
        this.g = brgkVar;
    }

    public void a(String str) {
        this.c = str;
        brcy a = this.i.a(str);
        if (a == null) {
            bvoo.h("Profile with id \"%s\" not found", str);
        } else {
            deha.q(deha.h(brdl.a(this.j, a).b(), 10L, TimeUnit.SECONDS, this.h), new brgi(this), this.h);
        }
    }

    @Override // defpackage.brgu
    public Boolean b() {
        boolean z = false;
        if (!this.d && !this.e) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.brgu
    @dzsi
    public brgs c() {
        if (this.e) {
            return this.k;
        }
        return null;
    }

    @Override // defpackage.brgu
    public Boolean d() {
        boolean z = false;
        if (this.d && !this.e) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.brgu
    public cqkl e() {
        this.g.a(this.c);
        return cqkl.a;
    }

    @Override // defpackage.brgu
    public cqkl f() {
        if (this.a.size() > 3) {
            this.b = !this.b;
            cqkx.p(this);
        }
        return cqkl.a;
    }

    @Override // defpackage.brgu
    public List<brgt> g() {
        return (this.b || this.a.size() <= 3) ? this.a : this.a.subList(0, 3);
    }

    @Override // defpackage.brgu
    public Boolean h() {
        boolean z = false;
        if (this.a.size() > 3 && k().booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.brgu
    public Boolean i() {
        boolean z = false;
        if (this.b && this.a.size() > 3) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.brgu
    public Boolean j() {
        return Boolean.valueOf(!this.a.isEmpty());
    }

    public Boolean k() {
        return false;
    }

    @Override // defpackage.brgu
    public List<brgt> l() {
        return new ArrayList();
    }
}
