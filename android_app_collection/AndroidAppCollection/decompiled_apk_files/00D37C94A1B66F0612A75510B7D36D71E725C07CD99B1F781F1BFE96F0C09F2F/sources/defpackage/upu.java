package defpackage;

import android.view.View;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: upu  reason: default package */
/* loaded from: classes4.dex */
public final class upu implements upq {
    public final uky a;
    public final toq b;
    public final upv c;

    public upu(uky ukyVar, toq toqVar) {
        this.a = ukyVar;
        this.b = toqVar;
        this.c = new upv(this, toqVar);
    }

    @Override // defpackage.upq
    public final void a(View view, int i) {
        uwp.f();
        tmm b = this.b.b();
        this.b.c();
        b.a(view, tmn.a(i));
    }

    @Override // defpackage.upq
    public final void b(View view, int i) {
        uwp.f();
        tmm b = this.b.b();
        this.b.c();
        tlx a = tmn.a(i);
        if (tml.a(view) == null) {
            b.a(view, a);
        }
    }

    @Override // defpackage.upq
    public final void c(View view) {
        uwp.f();
        this.b.b();
        tmm.b(view);
    }

    @Override // defpackage.upq
    public final void d(tmc tmcVar, View view) {
        final tme a = this.b.a();
        if (((tmg) view.getTag(R.id.interaction_info_tag)) != null) {
            aqxo.y(!tmcVar.a.qn(null));
            throw null;
        }
        final tmd tmdVar = new tmd((tmf) tmcVar.a.mo39build());
        final tmb a2 = tml.a(view);
        a.a.c(new tlm() { // from class: tnc
            @Override // defpackage.tlm
            public final List a() {
                tme tmeVar = tme.this;
                tmb tmbVar = a2;
                tmd tmdVar2 = tmdVar;
                boolean z = false;
                aqxo.z(tmbVar != null, "View is not instrumented.");
                tmt tmtVar = tmbVar.a;
                if (!tmtVar.a.isEmpty()) {
                    for (tmr tmrVar : tmtVar.a) {
                        tmrVar.c(tmbVar);
                    }
                }
                aqxo.E(tmbVar.c(), "VE is not impressed: %s {attached=%s}", tmbVar, Boolean.valueOf(((tml) tmbVar.b).d));
                if (tmbVar.d() == 1) {
                    z = true;
                }
                aqxo.B(z, "VE is not visible: %s", tmbVar);
                angg a3 = tle.a();
                ArrayList arrayList = new ArrayList();
                tnk.f(tmbVar, arrayList);
                return amuk.r(new tnj(a3, arrayList, tmdVar2, tmeVar.b.c(), false));
            }
        });
    }

    @Override // defpackage.upq
    public final void e(View view) {
        uwp.f();
        upt uptVar = new upt(this, view);
        view.addOnAttachStateChangeListener(uptVar);
        uptVar.a(this.a.a());
        if (lj.aj(view)) {
            uptVar.onViewAttachedToWindow(view);
        }
    }
}
