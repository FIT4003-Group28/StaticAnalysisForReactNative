package defpackage;

import android.app.Activity;
import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adck  reason: default package */
/* loaded from: classes2.dex */
public final class adck extends adae<adda> {
    public static final /* synthetic */ int b = 0;
    private final addc c;

    public adck(addd adddVar, final acyr acyrVar, absg absgVar) {
        super(p(dbud.a(new dbty(acyrVar) { // from class: adcj
            private final acyr a;

            {
                this.a = acyrVar;
            }

            @Override // defpackage.dbty
            public final Object a() {
                acyr acyrVar2 = this.a;
                int i = adck.b;
                dktp dktpVar = acyrVar2.a().k;
                return dktpVar == null ? dktp.e : dktpVar;
            }
        })));
        dxio a = ((dxjh) adddVar.a).a();
        addd.a(a, 1);
        dxio a2 = ((dxjh) adddVar.b).a();
        addd.a(a2, 2);
        acwt a3 = adddVar.c.a();
        addd.a(a3, 3);
        acyr a4 = adddVar.d.a();
        addd.a(a4, 4);
        Activity activity = (Activity) ((dxjd) adddVar.e).a;
        addd.a(activity, 5);
        addd.a(absgVar, 6);
        this.c = new addc(a, a2, a3, a4, activity, absgVar);
    }

    @Override // defpackage.adab
    public final void i(awwb awwbVar) {
        this.c.j(awwbVar);
    }

    @Override // defpackage.adab
    public final void j(awwb awwbVar) {
        this.c.h(awwbVar);
    }

    @Override // defpackage.adae
    public final List<cqix<adda>> k(List<cqix<?>> list) {
        if (this.c.g()) {
            return dcdc.f(cqgr.fT(new adcz(), this.c));
        }
        return dcdc.e();
    }

    @Override // defpackage.adae
    public final Set<awvv<?>> l() {
        return dcep.B(awvv.b);
    }

    @Override // defpackage.adae
    public final Set<awvv<?>> m() {
        return dcep.B(awvv.a);
    }
}
