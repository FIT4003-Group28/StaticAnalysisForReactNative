package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: wvk  reason: default package */
/* loaded from: classes4.dex */
public final class wvk implements wvs {
    final xei a = new xei();
    private final azqb b;

    public wvk(azqb azqbVar) {
        this.b = azqbVar;
    }

    public final void b(xci xciVar, int i) {
        String str = xciVar.a;
        ArrayList arrayList = new ArrayList();
        for (xeh xehVar : this.a.c()) {
            if (TextUtils.equals(((xdd) xehVar.b).a, str)) {
                int i2 = xehVar.a;
                if (i2 != 1) {
                    if (i2 == 2 && i == 2) {
                        arrayList.add(xehVar);
                    }
                } else if (i == 0) {
                    arrayList.add(xehVar);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            ((wvr) this.b.get()).q(arrayList);
        }
    }

    @Override // defpackage.wvs
    public final void qN(int i, xek xekVar, xdu xduVar, xci xciVar) {
        if (this.a.e(xekVar.c())) {
            String valueOf = String.valueOf(xekVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
            sb.append("Tried to register duplicate trigger: ");
            sb.append(valueOf);
            throw new wuq(sb.toString());
        } else if (!(xekVar instanceof xdd)) {
            String valueOf2 = String.valueOf(xekVar.b());
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 92);
            sb2.append("Incorrect TriggerType: Tried to register trigger ");
            sb2.append(valueOf2);
            sb2.append(" in OnLayoutSelfExitRequestedTriggerAdapter");
            throw new wuq(sb2.toString());
        } else {
            this.a.d(xekVar.c(), new xeh(i, xekVar, xduVar, xciVar));
        }
    }

    @Override // defpackage.wvs
    public final void qO(xek xekVar) {
        this.a.b(xekVar.c());
    }
}
