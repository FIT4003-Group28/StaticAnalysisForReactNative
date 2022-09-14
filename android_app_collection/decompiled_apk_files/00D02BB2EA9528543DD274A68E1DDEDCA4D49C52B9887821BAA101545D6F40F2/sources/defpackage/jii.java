package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: jii  reason: default package */
/* loaded from: classes7.dex */
public final class jii implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        cqrj cqrjVar;
        View view = cqjzVar.c;
        if (cqkuVar instanceof jif) {
            jif jifVar = jif.a;
            if (((jif) cqkuVar).ordinal() == 0 && (view instanceof RecyclerView) && (obj == null || (obj instanceof cqiv))) {
                cqiv cqivVar = (cqiv) obj;
                RecyclerView recyclerView = (RecyclerView) view;
                if (cqivVar == null) {
                    jih.b(recyclerView, null);
                    return true;
                }
                abg abgVar = recyclerView.k;
                if (abgVar instanceof cqrj) {
                    cqrjVar = (cqrj) abgVar;
                } else {
                    cqrjVar = new cqrj(cqjzVar.g.g());
                    jih.b(recyclerView, cqrjVar);
                }
                ts b = tx.b(new jig(cqrjVar, cqivVar), false);
                cqrjVar.y();
                for (cqix<?> cqixVar : cqivVar.a) {
                    cqrjVar.b(cqixVar);
                }
                b.a(cqrjVar);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cqkv
    public final boolean b(cqku cqkuVar, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof jif) {
            jif jifVar = jif.a;
            if (((jif) cqkuVar).ordinal() != 0 || !(view instanceof RecyclerView)) {
                return false;
            }
            jih.b((RecyclerView) view, null);
            return true;
        }
        return false;
    }
}
