package defpackage;

import android.content.pm.ResolveInfo;
import java.util.Map;
/* compiled from: PG */
/* renamed from: arqp  reason: default package */
/* loaded from: classes2.dex */
public final class arqp implements arre {
    public final arqu a;
    public final arxr b;
    public final arvm c;
    @dzsi
    public final arvy d;
    private final btrm e;
    private final arxn<arxa> f;

    public arqp(btrm btrmVar, arqu arquVar, arxr arxrVar, arvm arvmVar, @dzsi arvy arvyVar, arxn<arxa> arxnVar) {
        this.e = btrmVar;
        this.a = arquVar;
        this.b = arxrVar;
        this.c = arvmVar;
        this.f = arxnVar;
        this.d = arvyVar;
    }

    @Override // defpackage.arre
    public final void a() {
        if (!this.a.b()) {
            return;
        }
        this.b.a();
        btrm btrmVar = this.e;
        dceq a = dcet.a();
        a.b(arvs.class, new arqq(arvs.class, this));
        btrmVar.g(this, a.a());
        arxn<arxa> arxnVar = this.f;
        dccx F = dcdc.F();
        String l = this.a.l();
        if (this.a.m()) {
            String p = this.a.p();
            dbsk.s(p);
            if (!p.equals(l)) {
                arvy arvyVar = this.d;
                dbsk.s(arvyVar);
                F.g(arvyVar.a(this.b.k()));
            }
        }
        dcpd<Map.Entry<arun, ResolveInfo>> it = this.a.k().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<arun, ResolveInfo> next = it.next();
            if (!next.getValue().serviceInfo.packageName.equals(l)) {
                F.g(this.c.a(next.getKey(), this.b.k(), next.getValue()));
            }
        }
        arxnVar.a(F.f(), new arqo(this));
    }

    @Override // defpackage.arre
    public final void b() {
        if (this.a.b()) {
            this.e.a(this);
        }
        this.b.b();
    }

    @Override // defpackage.arre
    public final aryh c() {
        return this.b;
    }

    @Override // defpackage.arre
    public final void d(arrd arrdVar) {
        this.b.l().j(arrdVar);
    }

    @Override // defpackage.arre
    public final void e() {
        this.b.l().k();
    }
}
