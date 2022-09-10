package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dmo  reason: default package */
/* loaded from: classes6.dex */
public final class dmo implements dmt {
    public final dcka<dmq, dms> a = dccg.O();
    public final Set<dmr> b = new HashSet();
    private final befw c;

    public dmo(befw befwVar) {
        this.c = befwVar;
    }

    public final void a(dmq dmqVar, dms... dmsVarArr) {
        ((dbys) this.a).N(dmqVar, dcdc.t(dmsVarArr));
    }

    @Override // defpackage.dmt
    public final void b(dmv dmvVar) {
        this.b.add(dmvVar.a());
        dmq a = dmvVar.a().a();
        if (!dmvVar.a().b().a() || a == dmq.ORIENTATION_CUE) {
            c(dmvVar);
            return;
        }
        befw befwVar = this.c;
        dmn dmnVar = new dmn(this, dmvVar);
        befu p = befv.p();
        ily ilyVar = new ily();
        ilyVar.j(dmvVar.a().b().b());
        p.j(bwrs.a(ilyVar.d()));
        befwVar.f(dmnVar, p.m());
    }

    public final void c(dmv dmvVar) {
        if (!this.b.remove(dmvVar.a())) {
            return;
        }
        for (dms dmsVar : ((dbys) this.a).f(dmvVar.a().a())) {
            dmsVar.a(dmvVar);
        }
    }
}
