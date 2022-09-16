package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: tom  reason: default package */
/* loaded from: classes4.dex */
public final class tom implements tnl {
    private final tnl a = acsh.b;
    private final tnl b;
    private final Map c;

    public tom(tnl tnlVar, Map map) {
        this.b = tnlVar;
        this.c = map;
    }

    private final tnl h(tlp tlpVar) {
        if (tlpVar instanceof tng) {
            tng tngVar = (tng) tlpVar;
            if (!tngVar.a().qn(too.a)) {
                return this.b;
            }
            String str = ((ton) tngVar.a().qm(too.a)).c;
            tnl tnlVar = (tnl) this.c.get(str);
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                "No config for: ".concat(valueOf);
            }
            tnlVar.getClass();
            return tnlVar;
        }
        return this.a;
    }

    @Override // defpackage.tnl
    public final ampq a(tlp tlpVar) {
        return h(tlpVar).a(tlpVar);
    }

    @Override // defpackage.tnl
    public final ampq b(tlp tlpVar) {
        return h(tlpVar).b(tlpVar);
    }

    @Override // defpackage.tnl
    public final ankt c(tlp tlpVar, ankt anktVar) {
        return h(tlpVar).c(tlpVar, anktVar);
    }

    @Override // defpackage.tnl
    public final ankt d(tlp tlpVar, ankt anktVar) {
        return h(tlpVar).d(tlpVar, anktVar);
    }

    @Override // defpackage.tnl
    public final String e(tlp tlpVar) {
        return h(tlpVar).e(tlpVar);
    }

    @Override // defpackage.tnl
    public final ankt f() {
        return tnk.a();
    }

    @Override // defpackage.tnl
    public final void g(tlp tlpVar) {
        h(tlpVar).g(tlpVar);
    }
}
