package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: cnu  reason: default package */
/* loaded from: classes2.dex */
final class cnu implements cil, cik {
    private final List a;
    private final jk b;
    private int c;
    private cfv d;
    private cik e;
    private List f;
    private boolean g;

    public cnu(List list, jk jkVar) {
        this.b = jkVar;
        hy.Q(list);
        this.a = list;
        this.c = 0;
    }

    private final void h() {
        if (this.g) {
            return;
        }
        if (this.c < this.a.size() - 1) {
            this.c++;
            d(this.d, this.e);
            return;
        }
        hy.N(this.f);
        this.e.g(new ckq("Fetch failed", new ArrayList(this.f)));
    }

    @Override // defpackage.cil
    public final Class a() {
        return ((cil) this.a.get(0)).a();
    }

    @Override // defpackage.cil
    public final void b() {
        this.g = true;
        for (cil cilVar : this.a) {
            cilVar.b();
        }
    }

    @Override // defpackage.cil
    public final void c() {
        List list = this.f;
        if (list != null) {
            this.b.b(list);
        }
        this.f = null;
        for (cil cilVar : this.a) {
            cilVar.c();
        }
    }

    @Override // defpackage.cil
    public final void d(cfv cfvVar, cik cikVar) {
        this.d = cfvVar;
        this.e = cikVar;
        this.f = (List) this.b.a();
        ((cil) this.a.get(this.c)).d(cfvVar, this);
        if (this.g) {
            b();
        }
    }

    @Override // defpackage.cil
    public final int e() {
        return ((cil) this.a.get(0)).e();
    }

    @Override // defpackage.cik
    public final void f(Object obj) {
        if (obj != null) {
            this.e.f(obj);
        } else {
            h();
        }
    }

    @Override // defpackage.cik
    public final void g(Exception exc) {
        List list = this.f;
        hy.N(list);
        list.add(exc);
        h();
    }
}
