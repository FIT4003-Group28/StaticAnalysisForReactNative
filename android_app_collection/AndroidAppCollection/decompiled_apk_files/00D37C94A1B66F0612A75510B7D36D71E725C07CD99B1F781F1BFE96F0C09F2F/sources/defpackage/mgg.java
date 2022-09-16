package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: mgg  reason: default package */
/* loaded from: classes3.dex */
public final class mgg extends ne {
    public final Set a = Collections.newSetFromMap(new WeakHashMap());
    final /* synthetic */ mgk b;

    public mgg(mgk mgkVar) {
        this.b = mgkVar;
    }

    @Override // defpackage.ne
    public final void i(RecyclerView recyclerView, int i) {
        int i2;
        if (i == 0) {
            if (this.b.u.J() != -1) {
                mgk mgkVar = this.b;
                mgkVar.m = mgkVar.u.J();
            }
            this.b.k();
            mgk mgkVar2 = this.b;
            if (mgkVar2.o != null && mgkVar2.l != null && mgkVar2.q && (i2 = mgkVar2.p) != mgkVar2.m) {
                Object obj = mgkVar2.f.get(i2);
                if (obj instanceof aqlb) {
                    aqlb aqlbVar = (aqlb) obj;
                    if ((aqlbVar.b & 2097152) != 0) {
                        mgkVar2.l.H(65, new acte(aqlbVar.x.I()), null);
                    }
                }
            }
            mgk mgkVar3 = this.b;
            mgkVar3.q = false;
            mgkVar3.h();
            this.b.q();
        } else if (i == 1) {
            mgk mgkVar4 = this.b;
            if (!mgkVar4.q) {
                mgkVar4.q = true;
                mgkVar4.c();
                mgk mgkVar5 = this.b;
                mgkVar5.p = mgkVar5.u.J();
            }
        }
        mgk mgkVar6 = this.b;
        mgkVar6.f.get(mgkVar6.m);
        for (mca mcaVar : this.a) {
            mcaVar.a();
        }
    }
}
