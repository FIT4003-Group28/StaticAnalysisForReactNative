package defpackage;

import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cnt  reason: default package */
/* loaded from: classes2.dex */
public final class cnt {
    private final cny a;
    private final vbg b;

    public cnt(jk jkVar) {
        cny cnyVar = new cny(jkVar);
        this.b = new vbg();
        this.a = cnyVar;
    }

    public final synchronized List a(Class cls) {
        return this.a.c(cls);
    }

    public final synchronized List b(Class cls) {
        cns cnsVar = (cns) this.b.a.get(cls);
        List list = cnsVar == null ? null : cnsVar.a;
        if (list == null) {
            List unmodifiableList = Collections.unmodifiableList(this.a.b(cls));
            if (((cns) this.b.a.put(cls, new cns(unmodifiableList))) == null) {
                return unmodifiableList;
            }
            String valueOf = String.valueOf(cls);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
            sb.append("Already cached loaders for model: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
        return list;
    }

    public final synchronized void c(Class cls, Class cls2, cnr cnrVar) {
        this.a.f(cls, cls2, cnrVar);
        this.b.b();
    }

    public final synchronized void d(Class cls, Class cls2, cnr cnrVar) {
        this.a.g(cls, cls2, cnrVar);
        this.b.b();
    }

    public final synchronized void e(Class cls, Class cls2, cnr cnrVar) {
        for (cnr cnrVar2 : this.a.e(cls, cls2, cnrVar)) {
            cnrVar2.d();
        }
        this.b.b();
    }
}
