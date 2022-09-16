package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: lxx  reason: default package */
/* loaded from: classes7.dex */
public final class lxx implements lys {
    final /* synthetic */ lye a;

    public lxx(lye lyeVar) {
        this.a = lyeVar;
    }

    @Override // defpackage.lys
    public final void a(crhp crhpVar) {
        arym arymVar;
        bvrj.UI_THREAD.c();
        boolean z = false;
        if (crhpVar.d()) {
            this.a.n.b(false);
            arymVar = arym.GUIDED_NAV;
        } else {
            arymVar = crhpVar.f() ? arym.FREE_NAV : null;
        }
        if (!this.a.h && arymVar != null) {
            dbsk.l(crhpVar.b());
            if (!crhpVar.d() ? crhpVar.g().f != dqvj.DRIVE : crhpVar.e().g().a.h != dqvj.DRIVE) {
                this.a.j();
                return;
            }
        }
        lye lyeVar = this.a;
        boolean z2 = lyeVar.h;
        if (!z2) {
            lyeVar.i = arymVar;
            lyeVar.h = true;
        } else if (lyeVar.i != arymVar) {
            lyeVar.i = arymVar;
        }
        arym arymVar2 = lyeVar.i;
        arym arymVar3 = arym.GUIDED_NAV;
        if (arymVar2 == arymVar3) {
            lye lyeVar2 = this.a;
            lyeVar2.q.c.c(lyeVar2.r);
        } else {
            lym lymVar = this.a.q.c;
            lymVar.a.c();
            if (lymVar.c != null) {
                dehu dehuVar = lymVar.d;
                if (dehuVar != null) {
                    dehuVar.cancel(false);
                    lymVar.d = null;
                }
                lymVar.b();
            }
        }
        lyd lydVar = this.a.k;
        if (lydVar != null && lydVar.b() == arymVar) {
            this.a.q.a();
            lyd lydVar2 = this.a.k;
            dbsk.s(lydVar2);
            lydVar2.d();
            this.a.k = null;
            z = true;
        }
        if (arymVar2 == arymVar3 && !z) {
            this.a.p.a(dcdc.e(), lyy.c(new lzc(lzb.ALREADY_RUNNING_WHEN_SERVICE_STARTED)).a());
        }
        if (!z2) {
            this.a.a.b(new lzg());
        }
    }
}
