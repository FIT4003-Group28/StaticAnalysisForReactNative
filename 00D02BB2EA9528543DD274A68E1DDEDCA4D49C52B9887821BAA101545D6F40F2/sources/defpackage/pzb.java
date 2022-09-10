package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: pzb  reason: default package */
/* loaded from: classes7.dex */
public class pzb implements qaa {
    public static final dcqe a = dcqe.c("pzb");
    public final gga b;
    public final gft c;
    private final dcdc<qab> d;
    private final String e;

    public pzb(gga ggaVar, gft gftVar, pzh pzhVar, pyv pyvVar, List<pyx> list) {
        this.b = ggaVar;
        this.c = gftVar;
        dccx F = dcdc.F();
        for (pyx pyxVar : list) {
            int i = pyxVar.a;
            if (i == 1) {
                dpgh dpghVar = (dpgh) pyxVar.b;
                btpc a2 = pzhVar.a.a();
                pzh.a(a2, 1);
                dxio a3 = ((dxjh) pzhVar.b).a();
                pzh.a(a3, 2);
                dxio a4 = ((dxjh) pzhVar.c).a();
                pzh.a(a4, 3);
                pzh.a(ggaVar, 4);
                pzh.a(dpghVar, 5);
                F.g(new pzg(a2, a3, a4, ggaVar, dpghVar));
            } else if (i == 2) {
                dqtp dqtpVar = (dqtp) pyxVar.b;
                btpc a5 = pyvVar.a.a();
                pyv.a(a5, 1);
                dxio a6 = ((dxjh) pyvVar.b).a();
                pyv.a(a6, 2);
                dxio a7 = ((dxjh) pyvVar.c).a();
                pyv.a(a7, 3);
                pyv.a(dqtpVar, 4);
                F.g(new pyu(a5, a6, a7, dqtpVar));
            }
        }
        this.d = F.f();
        this.e = ggaVar.getString(R.string.AGENCY_CONTACT_INFO_TITLE);
    }

    @Override // defpackage.qaa
    public jib a() {
        jhz a2 = jhz.a();
        a2.a = this.e;
        a2.f(new View.OnClickListener(this) { // from class: pza
            private final pzb a;

            {
                this.a = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                pzb pzbVar = this.a;
                if (!pzbVar.c.bb()) {
                    return;
                }
                if (!(pzbVar.b.K() instanceof pyz)) {
                    bvoo.h("Unexpected fragment on top of stack, bailing out", new Object[0]);
                } else {
                    pzbVar.b.g().e();
                }
            }
        });
        a2.x = false;
        return a2.b();
    }

    @Override // defpackage.qaa
    public dcdc<qab> b() {
        return this.d;
    }
}
