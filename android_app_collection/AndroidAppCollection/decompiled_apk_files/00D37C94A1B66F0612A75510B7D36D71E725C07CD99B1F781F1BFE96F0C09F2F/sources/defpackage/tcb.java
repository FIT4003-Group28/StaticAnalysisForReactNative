package defpackage;

import android.content.Context;
import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: tcb  reason: default package */
/* loaded from: classes4.dex */
public final class tcb implements tdg {
    private final Set b = new HashSet();

    @Override // defpackage.tdg
    public final void a() {
        for (cth cthVar : this.b) {
            cthVar.c();
        }
        this.b.clear();
    }

    @Override // defpackage.tdg
    public final void b(Context context, aodt aodtVar, aodt aodtVar2, aodt aodtVar3, int i, int i2, svb svbVar, teb tebVar) {
        cgd o = tfo.o(context, aodtVar, aodtVar2, aodtVar3, i, i2);
        if (o != null) {
            tca tcaVar = new tca(aodtVar, svbVar, i, i2, tfo.m(aodtVar.Y()), tebVar);
            o.p(tcaVar);
            cth cthVar = tcaVar.c;
            if (cthVar == null) {
                tebVar.b(23, "Unexpected null requester");
            } else {
                this.b.add(cthVar);
            }
        }
    }
}
