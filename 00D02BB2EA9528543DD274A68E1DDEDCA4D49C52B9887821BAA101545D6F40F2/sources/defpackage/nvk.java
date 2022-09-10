package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: nvk  reason: default package */
/* loaded from: classes7.dex */
public final class nvk {
    final List<nxe> a = dchl.a();
    final Set<dthd> b = dcnm.c();

    public final synchronized void a(dthd dthdVar) {
        this.b.add(dthdVar);
    }

    public final synchronized dthf b() {
        dthe bZ;
        bZ = dthf.b.bZ();
        Set<dthd> set = this.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dthf dthfVar = (dthf) bZ.b;
        dsrf dsrfVar = dthfVar.a;
        if (!dsrfVar.a()) {
            dthfVar.a = dsqw.cg(dsrfVar);
        }
        for (dthd dthdVar : set) {
            dthfVar.a.h(dthdVar.ao);
        }
        return bZ.bK();
    }

    public final synchronized List<nxe> c() {
        return this.a;
    }

    public final synchronized void d() {
        this.a.clear();
        this.b.clear();
    }

    public final synchronized void e(nxe... nxeVarArr) {
        for (int i = 0; i <= 0; i++) {
            nxe nxeVar = nxeVarArr[i];
            this.a.add(nxeVar);
            nxeVar.c(this.b);
        }
    }
}
