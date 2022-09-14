package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adff  reason: default package */
/* loaded from: classes2.dex */
public final class adff extends adae<adfo> {
    public static final /* synthetic */ int b = 0;
    private final dxio<adfp> c;

    public adff(final acyr acyrVar, final dxio<aeaa> dxioVar, final adfq adfqVar, final abse abseVar) {
        super(p(dbud.a(new dbty(acyrVar) { // from class: adfd
            private final acyr a;

            {
                this.a = acyrVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                acyr acyrVar2 = this.a;
                int i = adff.b;
                dktp dktpVar = acyrVar2.a().n;
                return dktpVar == null ? dktp.e : dktpVar;
            }
        })));
        this.c = btsp.b(new dbty(adfqVar, dxioVar, abseVar) { // from class: adfe
            private final adfq a;
            private final dxio b;
            private final abse c;

            {
                this.a = adfqVar;
                this.b = dxioVar;
                this.c = abseVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                adfq adfqVar2 = this.a;
                dxio dxioVar2 = this.b;
                abse abseVar2 = this.c;
                int i = adff.b;
                cqhn a = adfqVar2.a.a();
                adfq.a(a, 1);
                abjo a2 = adfqVar2.b.a();
                adfq.a(a2, 2);
                acyr a3 = adfqVar2.c.a();
                adfq.a(a3, 3);
                dxio a4 = ((dxjh) adfqVar2.d).a();
                adfq.a(a4, 4);
                acwt a5 = adfqVar2.e.a();
                adfq.a(a5, 5);
                abfc a6 = adfqVar2.f.a();
                adfq.a(a6, 6);
                adfq.a(abseVar2, 8);
                return new adfp(a, a2, a3, a4, a5, a6, dxioVar2, abseVar2);
            }
        });
    }

    @Override // defpackage.adae, defpackage.aczy
    public final boolean e() {
        return true;
    }

    @Override // defpackage.adae, defpackage.aczy
    public final boolean f() {
        return true;
    }

    @Override // defpackage.adab
    public final void i(awwb awwbVar) {
        this.c.a().i = awwbVar;
        adfp a = this.c.a();
        dvho dvhoVar = (dvho) awwbVar.a(awvv.c).f();
        if (a.d.b()) {
            String str = null;
            if (dvhoVar == null || dvhoVar.d.isEmpty()) {
                if (!a.c.isEmpty()) {
                    a.k = a.b.a(a.c, a.e, a.h, a.g, a.f);
                } else {
                    a.k = null;
                }
            } else {
                a.k = a.b.a(dvhoVar.d, a.e, a.h, a.g, a.f);
            }
            if (dvhoVar != null && (dvhoVar.a & 1) != 0) {
                str = dvhoVar.b;
            }
            a.j = str;
            cqhn cqhnVar = a.a;
            cqkx.p(a);
        }
    }

    @Override // defpackage.adab
    public final void j(awwb awwbVar) {
        this.c.a().i = awwbVar;
    }

    @Override // defpackage.adae
    protected final List<cqix<adfo>> k(List<cqix<?>> list) {
        if (this.c.a().c()) {
            return dcdc.f(cqgr.fT(new adfn(), this.c.a()));
        }
        return dcdc.e();
    }

    @Override // defpackage.adae
    protected final Set<awvv<?>> l() {
        return dcmr.a;
    }

    @Override // defpackage.adae
    protected final Set<awvv<?>> m() {
        return dcep.B(awvv.c);
    }
}
