package defpackage;

import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: tmm  reason: default package */
/* loaded from: classes4.dex */
public final class tmm {
    private final tmt a;

    public tmm(tmt tmtVar) {
        this.a = tmtVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$OnAttachStateChangeListener, tms] */
    public static final void b(View view) {
        uwp.f();
        tmb a = tml.a(view);
        a.getClass();
        ?? r0 = a.b;
        tml tmlVar = (tml) r0;
        if (tmlVar.c.c()) {
            tmlVar.a.removeOnAttachStateChangeListener(r0);
            if (lj.aj(tmlVar.a)) {
                tmlVar.onViewDetachedFromWindow(tmlVar.a);
            }
        }
        tmlVar.f = null;
        tmlVar.a.setTag(R.id.ve_tag, null);
        aqxo.y(!((tml) a.b).d);
        a.b = null;
    }

    public final void a(View view, tlx tlxVar) {
        uwp.f();
        tmt tmtVar = this.a;
        boolean z = false;
        aqxo.z(tlxVar.a == null, "Cannot create CVE twice.");
        aopc aopcVar = tlxVar.c;
        aopa aopaVar = tlxVar.d;
        aopcVar.copyOnWrite();
        tmh tmhVar = (tmh) aopcVar.instance;
        angf angfVar = (angf) aopaVar.mo39build();
        tmh tmhVar2 = tmh.a;
        angfVar.getClass();
        tmhVar.d = angfVar;
        tmhVar.b |= 1;
        tlxVar.a = new tmb((aopc) ((tmh) tlxVar.c.mo39build()).mo52toBuilder(), tlxVar.b, tmtVar);
        tmt tmtVar2 = tlxVar.a.a;
        if (!tmtVar2.a.isEmpty()) {
            for (tmr tmrVar : tmtVar2.a) {
                tmrVar.f();
            }
        }
        tmb tmbVar = tlxVar.a;
        tmb a = tml.a(view);
        if (a == null) {
            tml tmlVar = new tml(view, tmbVar);
            tmbVar.b = tmlVar;
            tmlVar.a.setTag(R.id.ve_tag, tmlVar.b);
            if (!tmlVar.c.c()) {
                return;
            }
            tmlVar.a.addOnAttachStateChangeListener(tmlVar);
            if (!lj.aj(tmlVar.a)) {
                return;
            }
            tmlVar.onViewAttachedToWindow(tmlVar.a);
        } else if (!a.b()) {
            aqxo.y(tmbVar.b == null);
            aqxo.y(!a.b());
            if (a.e == tmbVar.e) {
                z = true;
            }
            aqxo.y(z);
            boolean z2 = ((tml) a.b).d;
            if (z2) {
                a.a.b(a);
            }
            a.f.clear();
            a.f.mergeFrom((aopi) ((tmh) tmbVar.f.mo39build()));
            if (!z2) {
                return;
            }
            a.a.a(a);
        } else if (a.c()) {
            tmt.d(new IllegalStateException("CVE is already impressed and cannot be replaced."));
        } else {
            tmt.d(new IllegalStateException("CVE is already attached and cannot be replaced."));
        }
    }
}
