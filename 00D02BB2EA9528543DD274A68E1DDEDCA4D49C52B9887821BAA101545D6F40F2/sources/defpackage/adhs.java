package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adhs  reason: default package */
/* loaded from: classes2.dex */
public final class adhs extends adae<adim> {
    public static final /* synthetic */ int c = 0;
    public final adiq b;
    private final dbty<Boolean> d;

    public adhs(final abfa abfaVar, final acyr acyrVar, adiq adiqVar) {
        super(o(dbud.a(new dbty(acyrVar) { // from class: adhq
            private final acyr a;

            {
                this.a = acyrVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                acyr acyrVar2 = this.a;
                int i = adhs.c;
                dktp dktpVar = acyrVar2.a().E;
                return dktpVar == null ? dktp.e : dktpVar;
            }
        })));
        abfaVar.getClass();
        this.d = dbud.a(new dbty(abfaVar) { // from class: adhr
            private final abfa a;

            {
                this.a = abfaVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return Boolean.valueOf(this.a.w());
            }
        });
        this.b = adiqVar;
    }

    private final void q(awwb awwbVar, boolean z) {
        dbsg dbsgVar;
        if (awwbVar.a(awvv.L).a()) {
            dbsgVar = awwbVar.a(awvv.L);
        } else {
            dbsgVar = dbpy.a;
        }
        if ((z || dbsgVar.a() || !awwbVar.c(awvv.L).b()) && dbsgVar.a()) {
            adiq adiqVar = this.b;
            dqbe dqbeVar = ((dnuy) dbsgVar.b()).c;
            if (dqbeVar == null) {
                dqbeVar = dqbe.k;
            }
            adiqVar.o(dqbeVar);
        }
    }

    @Override // defpackage.adae, defpackage.aczy
    public final boolean e() {
        return true;
    }

    @Override // defpackage.adab
    public final void i(awwb awwbVar) {
        q(awwbVar, true);
    }

    @Override // defpackage.adab
    public final void j(awwb awwbVar) {
        q(awwbVar, false);
    }

    @Override // defpackage.adae
    public final List<cqix<adim>> k(List<cqix<?>> list) {
        if (!this.d.a().booleanValue() || !this.b.a().booleanValue()) {
            return dcdc.e();
        }
        return dcdc.f(cqgr.fT(new adil(), this.b));
    }

    @Override // defpackage.adae
    public final Set<awvv<?>> l() {
        return dcmr.a;
    }

    @Override // defpackage.adae
    public final Set<awvv<?>> m() {
        return dcep.B(awvv.L);
    }
}
