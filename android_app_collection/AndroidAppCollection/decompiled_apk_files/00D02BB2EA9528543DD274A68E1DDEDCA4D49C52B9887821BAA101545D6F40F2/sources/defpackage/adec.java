package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adec  reason: default package */
/* loaded from: classes2.dex */
public final class adec extends adae<aded> {
    public static final /* synthetic */ int b = 0;
    private final abfa c;
    private final adef d;

    public adec(abfa abfaVar, final acyr acyrVar, adef adefVar) {
        super(o(dbud.a(new dbty(acyrVar) { // from class: adeb
            private final acyr a;

            {
                this.a = acyrVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                acyr acyrVar2 = this.a;
                int i = adec.b;
                dktp dktpVar = acyrVar2.a().D;
                return dktpVar == null ? dktp.e : dktpVar;
            }
        })));
        this.c = abfaVar;
        this.d = adefVar;
    }

    private final void q(awwb awwbVar, boolean z) {
        dbsg<drbh> dbsgVar;
        if (awwbVar.a(awvv.l).a() && ((dpsj) awwbVar.a(awvv.l).b()).c.size() > 0) {
            dbsgVar = dbsg.i(((dpsj) awwbVar.a(awvv.l).b()).c.get(0));
        } else {
            dbsgVar = dbpy.a;
        }
        if (z || dbsgVar.a() || !awwbVar.c(awvv.l).b()) {
            this.d.s(dbsgVar);
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
    public final List<cqix<aded>> k(List<cqix<?>> list) {
        if (!list.isEmpty() || !this.c.o() || !this.d.a().booleanValue()) {
            return dcdc.e();
        }
        return dcdc.f(cqgr.fT(new adea(), this.d));
    }

    @Override // defpackage.adae
    public final Set<awvv<?>> l() {
        return dcep.B(awvv.l);
    }

    @Override // defpackage.adae
    public final Set<awvv<?>> m() {
        return dcmr.a;
    }
}
