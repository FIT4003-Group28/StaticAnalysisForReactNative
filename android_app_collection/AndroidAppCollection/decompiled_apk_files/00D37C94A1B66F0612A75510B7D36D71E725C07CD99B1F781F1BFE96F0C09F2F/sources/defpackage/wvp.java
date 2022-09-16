package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
/* compiled from: PG */
/* renamed from: wvp  reason: default package */
/* loaded from: classes4.dex */
public final class wvp implements wvs, wtz {
    public static final Set a = new afy(Arrays.asList(0, 2));
    public static final Set b = new afy(Arrays.asList(3));
    public final azqb c;
    final xei d = new xei();
    private final azqb e;

    public wvp(azqb azqbVar, azqb azqbVar2) {
        this.e = azqbVar;
        this.c = azqbVar2;
    }

    @Override // defpackage.wtz
    public final wzu b(xdu xduVar, xci xciVar) {
        return new wvo(this, xduVar, xciVar);
    }

    public final void d(xdu xduVar, xci xciVar, String str, Set set) {
        ArrayList arrayList = new ArrayList();
        for (xeh xehVar : this.d.c()) {
            if (TextUtils.equals(str, ((xdt) xehVar.b).a) && set.contains(Integer.valueOf(xehVar.a))) {
                arrayList.add(xehVar);
            }
        }
        if (arrayList.isEmpty()) {
            String valueOf = String.valueOf(set);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 52);
            sb.append("No associated layout for skip click. Exit category: ");
            sb.append(valueOf);
            String sb2 = sb.toString();
            if (xduVar == null || xciVar == null) {
                wwf.a(null, sb2);
                return;
            } else {
                wwf.b(xduVar, xciVar, sb2);
                return;
            }
        }
        ((wvr) this.e.get()).q(arrayList);
    }

    @Override // defpackage.wvs
    public final void qN(int i, xek xekVar, xdu xduVar, xci xciVar) {
        if (this.d.e(xekVar.c())) {
            String valueOf = String.valueOf(xekVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
            sb.append("Tried to register duplicate trigger: ");
            sb.append(valueOf);
            throw new wuq(sb.toString());
        } else if (!(xekVar instanceof xdt)) {
            String valueOf2 = String.valueOf(xekVar.b());
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 84);
            sb2.append("Incorrect TriggerType: Tried to register trigger ");
            sb2.append(valueOf2);
            sb2.append(" in SkipButtonClickedTriggerAdapter");
            throw new wuq(sb2.toString());
        } else {
            this.d.d(xekVar.c(), new xeh(i, xekVar, xduVar, xciVar));
        }
    }

    @Override // defpackage.wvs
    public final void qO(xek xekVar) {
        this.d.b(xekVar.c());
    }
}
