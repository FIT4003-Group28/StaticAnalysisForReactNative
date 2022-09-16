package defpackage;

import android.view.ViewGroup;
import com.google.android.apps.youtube.app.ui.pivotbar.PivotBar;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: okn  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class okn implements ayqb {
    public final /* synthetic */ okq a;
    private final /* synthetic */ int b;

    public /* synthetic */ okn(okq okqVar) {
        this.a = okqVar;
    }

    public /* synthetic */ okn(okq okqVar, int i) {
        this.b = i;
        this.a = okqVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int intValue;
        int i = this.b;
        if (i == 0) {
            okq okqVar = this.a;
            int i2 = okqVar.f.l() ? ((zaw) obj).a.a.bottom : 0;
            PivotBar pivotBar = okqVar.q;
            if (pivotBar == null) {
                return;
            }
            zgd.t(pivotBar, zgd.e(i2), ViewGroup.MarginLayoutParams.class);
        } else if (i == 1) {
            okq okqVar2 = this.a;
            if (((fwe) obj).a()) {
                okqVar2.t();
            } else {
                okqVar2.u();
            }
        } else if (i == 2) {
            aawr aawrVar = (aawr) obj;
            this.a.i.a.d(new ews());
        } else if (i == 3) {
            Integer num = (Integer) obj;
            this.a.v(true);
        } else {
            okq okqVar3 = this.a;
            Optional optional = (Optional) obj;
            ((mes) okqVar3.d.get()).b(okqVar3.b.c());
            if (!optional.isPresent()) {
                return;
            }
            if (!((fte) optional.get()).b) {
                okqVar3.t();
            } else {
                okqVar3.u();
                Optional s = okqVar3.s(okqVar3.b.a());
                if (s.isPresent() && (intValue = ((Integer) s.get()).intValue()) >= 0 && intValue < okqVar3.q.j()) {
                    okqVar3.q.m(intValue, okqVar3.u);
                }
            }
            ((fte) optional.get()).a.ifPresent(new okj(okqVar3, 1));
        }
    }
}
