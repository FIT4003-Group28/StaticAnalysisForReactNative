package defpackage;
/* compiled from: PG */
/* renamed from: aijj  reason: default package */
/* loaded from: classes.dex */
public abstract class aijj implements aijm {
    public abstract ory a(Object obj);

    public abstract String c(Object obj);

    public abstract String d(Object obj);

    public abstract boolean e(Object obj, Object obj2);

    @Override // defpackage.aijm
    public final ory h(apzg apzgVar) {
        return a(i(apzgVar));
    }

    public final Object i(apzg apzgVar) {
        apzgVar.getClass();
        aqxo.p(apzgVar.qn(b()));
        return apzgVar.qm(b());
    }

    @Override // defpackage.aijm
    public final String j(apzg apzgVar) {
        return c(i(apzgVar));
    }

    @Override // defpackage.aijm
    public final String k(apzg apzgVar) {
        return d(i(apzgVar));
    }

    @Override // defpackage.aijm
    public final boolean l(apzg apzgVar, apzg apzgVar2) {
        return e(i(apzgVar), i(apzgVar2));
    }
}
