package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adfu  reason: default package */
/* loaded from: classes2.dex */
public final class adfu extends adae {
    public static final /* synthetic */ int b = 0;
    private final adfv c;

    public adfu(final acyr acyrVar, adfv adfvVar) {
        super(p(dbud.a(new dbty(acyrVar) { // from class: adft
            private final acyr a;

            {
                this.a = acyrVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                acyr acyrVar2 = this.a;
                int i = adfu.b;
                dktp dktpVar = acyrVar2.a().J;
                return dktpVar == null ? dktp.e : dktpVar;
            }
        })));
        this.c = adfvVar;
    }

    @Override // defpackage.adab
    public final void i(awwb awwbVar) {
        this.c.a((dviz) awwbVar.a(awvv.K).f());
    }

    @Override // defpackage.adab
    public final void j(awwb awwbVar) {
        if (awwbVar.c(awvv.K).b()) {
            return;
        }
        this.c.a((dviz) awwbVar.a(awvv.K).f());
    }

    @Override // defpackage.adae
    public final List<cqix> k(List<cqix> list) {
        return dcdc.e();
    }

    @Override // defpackage.adae
    public final Set<awvv<?>> l() {
        return dcmr.a;
    }

    @Override // defpackage.adae
    public final Set<awvv<?>> m() {
        return dcmr.a;
    }
}
