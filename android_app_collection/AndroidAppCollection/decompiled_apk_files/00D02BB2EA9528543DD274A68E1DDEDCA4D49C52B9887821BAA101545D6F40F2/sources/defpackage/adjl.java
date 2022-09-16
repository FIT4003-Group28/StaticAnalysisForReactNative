package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adjl  reason: default package */
/* loaded from: classes.dex */
public final class adjl extends adae<adjq> {
    public static final /* synthetic */ int b = 0;
    private final dxio<adjr> c;
    @dzsi
    private final awvv<dviz> d;
    @dzsi
    private final awvv<dviz> e;

    public adjl(final acyr acyrVar, final adjs adjsVar, @dzsi awvv<dviz> awvvVar, @dzsi awvv<dviz> awvvVar2, final absg absgVar) {
        super(p(dbud.a(new dbty(acyrVar) { // from class: adjj
            private final acyr a;

            {
                this.a = acyrVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                acyr acyrVar2 = this.a;
                int i = adjl.b;
                dktp dktpVar = acyrVar2.a().q;
                return dktpVar == null ? dktp.e : dktpVar;
            }
        })));
        this.d = awvvVar;
        this.e = awvvVar2;
        this.c = btsp.b(new dbty(adjsVar, absgVar) { // from class: adjk
            private final adjs a;
            private final absg b;

            {
                this.a = adjsVar;
                this.b = absgVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                adjs adjsVar2 = this.a;
                absg absgVar2 = this.b;
                int i = adjl.b;
                abpo a = adjsVar2.a.a();
                adjs.a(a, 1);
                acwt a2 = adjsVar2.b.a();
                adjs.a(a2, 2);
                adjs.a(absgVar2, 3);
                return new adjr(a, a2, absgVar2);
            }
        });
    }

    @dzsi
    private static dviz q(awwb awwbVar, @dzsi awvv<dviz> awvvVar) {
        if (awvvVar == null) {
            return null;
        }
        return (dviz) awwbVar.a(awvvVar).f();
    }

    @Override // defpackage.adab
    public final void i(awwb awwbVar) {
        this.c.a().b(q(awwbVar, this.d), q(awwbVar, this.e));
    }

    @Override // defpackage.adab
    public final void j(awwb awwbVar) {
        awvv<dviz> awvvVar;
        awvv<dviz> awvvVar2;
        dviz q = q(awwbVar, this.d);
        dviz q2 = q(awwbVar, this.e);
        if (q != null || (awvvVar2 = this.d) == null || !awwbVar.c(awvvVar2).b()) {
            if (q2 == null && (awvvVar = this.e) != null && awwbVar.c(awvvVar).b()) {
                return;
            }
            this.c.a().b(q, q2);
        }
    }

    @Override // defpackage.adae
    public final List<cqix<adjq>> k(List<cqix<?>> list) {
        if (this.c.a().c()) {
            return dcdc.f(cqgr.fT(new adjp(), this.c.a()));
        }
        return dcdc.e();
    }

    @Override // defpackage.adae
    public final Set<awvv<?>> l() {
        dcen dcenVar = new dcen();
        awvv<dviz> awvvVar = this.d;
        if (awvvVar != null) {
            dcenVar.b(awvvVar);
        }
        awvv<dviz> awvvVar2 = this.e;
        if (awvvVar2 != null) {
            dcenVar.b(awvvVar2);
        }
        return dcenVar.f();
    }

    @Override // defpackage.adae
    public final Set<awvv<?>> m() {
        return dcmr.a;
    }
}
