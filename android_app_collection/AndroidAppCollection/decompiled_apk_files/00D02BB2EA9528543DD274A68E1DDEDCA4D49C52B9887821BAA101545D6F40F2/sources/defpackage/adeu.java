package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adeu  reason: default package */
/* loaded from: classes.dex */
public final class adeu extends adae<adey> {
    public static final /* synthetic */ int b = 0;
    private final dxio<adfb> c;
    private final dbty<dcep<awvv<?>>> d;

    public adeu(abfa abfaVar, final acyr acyrVar, dxio<adfb> dxioVar) {
        super(p(dbud.a(new dbty(acyrVar) { // from class: ades
            private final acyr a;

            {
                this.a = acyrVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                acyr acyrVar2 = this.a;
                int i = adeu.b;
                dktp dktpVar = acyrVar2.a().n;
                return dktpVar == null ? dktp.e : dktpVar;
            }
        })));
        this.c = dxioVar;
        this.d = dbud.a(new dbty() { // from class: adet
            @Override // defpackage.dbty
            public final Object a() {
                int i = adeu.b;
                return dcep.C(awvv.a, awvv.z);
            }
        });
    }

    private final void q(awwb awwbVar, boolean z) {
        dvha dvhaVar = (dvha) awwbVar.a(awvv.a).f();
        boolean b2 = awwbVar.c(awvv.a).b();
        this.c.a().f(b2);
        if (z || dvhaVar != null || !b2) {
            this.c.a().c(dvhaVar);
        }
    }

    private final void r(awwb awwbVar) {
        this.c.a().g((dvjb) awwbVar.a(awvv.z).f());
    }

    @Override // defpackage.adae, defpackage.aczy
    public final boolean f() {
        return true;
    }

    @Override // defpackage.adab
    public final void i(awwb awwbVar) {
        q(awwbVar, true);
        r(awwbVar);
    }

    @Override // defpackage.adab
    public final void j(awwb awwbVar) {
        q(awwbVar, false);
        r(awwbVar);
    }

    @Override // defpackage.adae
    protected final List<cqix<adey>> k(List<cqix<?>> list) {
        if (this.c.a().b()) {
            return dcdc.f(cqgr.fT(new adex(), this.c.a()));
        }
        return dcdc.e();
    }

    @Override // defpackage.adae
    protected final Set<awvv<?>> l() {
        return this.d.a();
    }

    @Override // defpackage.adae
    protected final Set<awvv<?>> m() {
        return dcmr.a;
    }
}
