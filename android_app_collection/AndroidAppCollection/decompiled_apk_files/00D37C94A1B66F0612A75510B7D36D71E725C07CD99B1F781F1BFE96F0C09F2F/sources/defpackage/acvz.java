package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
@Deprecated
/* renamed from: acvz  reason: default package */
/* loaded from: classes.dex */
public final class acvz implements acvp {
    final List a;
    final List b;
    public final dvj c;
    private final afvn d;
    private final yrj e;
    private final yni f;
    private final Map g;

    public acvz(yni yniVar, afvn afvnVar, dvj dvjVar, yrj yrjVar) {
        yniVar.getClass();
        this.f = yniVar;
        this.d = afvnVar;
        dvjVar.getClass();
        this.c = dvjVar;
        this.e = yrjVar;
        this.g = new HashMap();
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    private final acvk m(Class cls) {
        for (acvk acvkVar : this.a) {
            if (acvkVar.getClass().equals(cls)) {
                return acvkVar;
            }
        }
        return null;
    }

    private final acvn n(Class cls, Class cls2, acvl acvlVar, ampt amptVar, boolean z) {
        acvw acvwVar = new acvw(this, acvlVar, cls2, amptVar, z);
        o(cls).a.add(acvwVar);
        return acvwVar;
    }

    private final acvs o(Class cls) {
        acvs acvsVar = (acvs) this.g.get(cls);
        if (acvsVar != null) {
            return acvsVar;
        }
        acvs acvsVar2 = new acvs(this);
        this.f.a(this, cls, acvsVar2);
        this.g.put(cls, acvsVar2);
        return acvsVar2;
    }

    @Override // defpackage.acvp
    public final yrj a() {
        return this.e;
    }

    @Override // defpackage.acvp
    public final acvn b(Class cls, acvl acvlVar) {
        return d(cls, acvlVar, null);
    }

    @Override // defpackage.acvp
    public final acvn c(Class cls, Class cls2, acvl acvlVar, boolean z) {
        return n(cls, cls2, acvlVar, null, z);
    }

    @Override // defpackage.acvp
    public final acvn d(Class cls, acvl acvlVar, ampt amptVar) {
        return n(cls, null, acvlVar, amptVar, false);
    }

    @Override // defpackage.acvp
    public final afvn e() {
        return this.d;
    }

    @Override // defpackage.acvp
    public final /* synthetic */ void f() {
    }

    @Override // defpackage.acvp
    public final void g(Class cls, acvm acvmVar) {
        o(cls).e.add(new acvt(this, acvmVar));
    }

    @Override // defpackage.acvp
    public final void h(Class cls, String str) {
        o(cls).c.add(new acvx(this, str));
    }

    @Override // defpackage.acvp
    public final void i(Class cls, acvo acvoVar) {
        o(cls).d.add(new acvy(this, acvoVar));
    }

    @Override // defpackage.acvp
    public final boolean j(Class cls) {
        return m(cls) != null;
    }

    @Override // defpackage.acvp
    public final void k(Class cls, Class cls2, acvl acvlVar) {
        o(cls).b.add(new acvv(this, acvlVar, cls, cls2));
    }

    public final void l(acvk acvkVar, Class cls, boolean z) {
        acvk m;
        if (cls == null || (m = m(cls)) == null) {
            return;
        }
        acvkVar.d(m);
        if (!z) {
            return;
        }
        m.e();
        this.a.remove(m);
        this.b.remove(m);
    }
}
