package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: iyo  reason: default package */
/* loaded from: classes7.dex */
public class iyo implements jbo {
    public final List<jbs> a;
    @dzsi
    public final cjqy b;
    public int c;
    private final jco d;
    private boolean e;
    private cjtd f;
    private cqtv g;

    public iyo(List<? extends jbs> list, cjtd cjtdVar, cqhn cqhnVar, @dzsi cjqy cjqyVar, @dzsi iyn iynVar) {
        this.g = cqrp.d(dcyn.a);
        this.a = dchl.c(list);
        this.b = cjqyVar;
        this.f = cjtdVar;
        this.d = new iym(this);
        this.c = 0;
        this.e = false;
    }

    @Override // defpackage.jbo
    public List<jbs> a() {
        return this.a;
    }

    @Override // defpackage.jbo
    public Integer b() {
        return Integer.valueOf(this.c);
    }

    @Override // defpackage.jbo
    public Boolean c() {
        return Boolean.valueOf(this.e);
    }

    public void d(boolean z) {
        this.e = z;
    }

    @Override // defpackage.jbo
    public cqtv e() {
        return this.g;
    }

    @Override // defpackage.jbo
    public jco f() {
        return this.d;
    }

    @Override // defpackage.jbo
    public cjtd g() {
        return this.f;
    }

    public void h(ddho ddhoVar) {
        cjta c = cjtd.c(this.f);
        c.d = ddhoVar;
        this.f = c.a();
    }

    public iyo(List<? extends jbs> list, ddho ddhoVar, cqhn cqhnVar, @dzsi cjqy cjqyVar, @dzsi iyn iynVar) {
        this(list, cjtd.a(ddhoVar), cqhnVar, (cjqy) null, (iyn) null);
    }
}
