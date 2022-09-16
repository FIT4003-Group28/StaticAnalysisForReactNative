package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.red.presenter.NavigationDropdownView;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: ktq  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ktq implements View.OnClickListener {
    public final /* synthetic */ NavigationDropdownView a;
    private final /* synthetic */ int b;

    public /* synthetic */ ktq(NavigationDropdownView navigationDropdownView) {
        this.a = navigationDropdownView;
    }

    public /* synthetic */ ktq(NavigationDropdownView navigationDropdownView, int i) {
        this.b = i;
        this.a = navigationDropdownView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        arag aragVar;
        aqgx aqgxVar;
        apzg apzgVar;
        ktn ktnVar;
        akaf akafVar;
        aqgx aqgxVar2;
        aqgx aqgxVar3;
        if (this.b == 0) {
            this.a.d(true);
            return;
        }
        NavigationDropdownView navigationDropdownView = this.a;
        int b = ((wcc) view.getTag()).b();
        navigationDropdownView.b(true);
        kts ktsVar = navigationDropdownView.k;
        aqxo.p(b >= 0 && b < ktsVar.d.size());
        aqrf aqrfVar = (aqrf) ktsVar.d.get(b);
        if (akzj.f(navigationDropdownView.h, aqrfVar)) {
            return;
        }
        aqrf aqrfVar2 = navigationDropdownView.h;
        if (aqrfVar2 != null) {
            aopa mo52toBuilder = aqrfVar2.mo52toBuilder();
            mo52toBuilder.copyOnWrite();
            aqrf aqrfVar3 = (aqrf) mo52toBuilder.instance;
            aqrfVar3.b |= 4;
            aqrfVar3.f = false;
            aqrf aqrfVar4 = (aqrf) mo52toBuilder.mo39build();
        }
        navigationDropdownView.h = aqrfVar;
        aqrf aqrfVar5 = navigationDropdownView.h;
        if (aqrfVar5 == null) {
            return;
        }
        aopa mo52toBuilder2 = aqrfVar5.mo52toBuilder();
        mo52toBuilder2.copyOnWrite();
        aqrf aqrfVar6 = (aqrf) mo52toBuilder2.instance;
        aqrfVar6.b |= 4;
        aqrfVar6.f = true;
        navigationDropdownView.h = (aqrf) mo52toBuilder2.mo39build();
        TextView textView = navigationDropdownView.d;
        aqrf aqrfVar7 = navigationDropdownView.h;
        if ((1 & aqrfVar7.b) != 0) {
            aragVar = aqrfVar7.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        ktt kttVar = navigationDropdownView.g;
        if (kttVar == null) {
            return;
        }
        aqrf aqrfVar8 = navigationDropdownView.h;
        if (aqrfVar8.c == 6) {
            aqgxVar = (aqgx) aqrfVar8.d;
        } else {
            aqgxVar = aqgx.a;
        }
        if (!aqgxVar.qn(aumx.b) || (akafVar = (ktnVar = (ktn) kttVar).d) == null) {
            if (aqrfVar8.c != 5) {
                return;
            }
            final ktn ktnVar2 = (ktn) kttVar;
            ampt amptVar = new ampt() { // from class: ktm
                @Override // defpackage.ampt
                public final boolean a(Object obj) {
                    return TextUtils.equals(jfw.g((PaneDescriptor) obj), jfw.g(ktn.this.b.c()));
                }
            };
            HashMap hashMap = new HashMap();
            hashMap.put("replace_pane_predicate", amptVar);
            aafo aafoVar = ktnVar2.a;
            if (aqrfVar8.c == 5) {
                apzgVar = (apzg) aqrfVar8.d;
            } else {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, hashMap);
        } else if (akafVar instanceof ajwb) {
            ktnVar.c.c(false);
            ajwb ajwbVar = (ajwb) ktnVar.d;
            if (aqrfVar8.c == 6) {
                aqgxVar3 = (aqgx) aqrfVar8.d;
            } else {
                aqgxVar3 = aqgx.a;
            }
            aumx aumxVar = (aumx) aqgxVar3.qm(aumx.b);
            ajwbVar.z();
            ajwbVar.j.b(ajna.g(aumxVar));
            ajwbVar.lr(ajna.g(aumxVar));
            ajwbVar.O();
        } else {
            if (aqrfVar8.c == 6) {
                aqgxVar2 = (aqgx) aqrfVar8.d;
            } else {
                aqgxVar2 = aqgx.a;
            }
            akafVar.lx((aumx) aqgxVar2.qm(aumx.b), null);
        }
    }
}
