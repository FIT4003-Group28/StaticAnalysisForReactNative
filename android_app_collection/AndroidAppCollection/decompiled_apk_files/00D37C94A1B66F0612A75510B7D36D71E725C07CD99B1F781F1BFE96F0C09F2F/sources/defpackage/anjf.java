package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: anjf  reason: default package */
/* loaded from: classes.dex */
public final class anjf extends anil {
    private List c;

    public anjf(amub amubVar, boolean z) {
        super(amubVar, z, true);
        List s;
        if (amubVar.isEmpty()) {
            s = Collections.emptyList();
        } else {
            s = amxp.s(amubVar.size());
        }
        for (int i = 0; i < amubVar.size(); i++) {
            s.add(null);
        }
        this.c = s;
        r();
    }

    @Override // defpackage.anil
    public final void g(int i, Object obj) {
        List list = this.c;
        if (list != null) {
            list.set(i, new anje(obj));
        }
    }

    @Override // defpackage.anil
    public final void q() {
        List<anje> list = this.c;
        if (list != null) {
            ArrayList s = amxp.s(list.size());
            for (anje anjeVar : list) {
                s.add(anjeVar != null ? anjeVar.a : null);
            }
            o(Collections.unmodifiableList(s));
        }
    }

    @Override // defpackage.anil
    public final void s(int i) {
        super.s(i);
        this.c = null;
    }
}
