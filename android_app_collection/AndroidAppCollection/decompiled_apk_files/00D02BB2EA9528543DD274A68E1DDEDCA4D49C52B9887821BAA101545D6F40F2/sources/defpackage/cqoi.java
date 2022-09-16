package defpackage;

import android.content.Context;
import android.support.constraint.ConstraintLayout;
import android.view.View;
/* compiled from: PG */
/* renamed from: cqoi  reason: default package */
/* loaded from: classes5.dex */
public final class cqoi implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof cqog) {
            cqog cqogVar = cqog.a;
            if (((cqog) cqkuVar).ordinal() == 0 && (view instanceof ConstraintLayout) && (obj instanceof cqok)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                Context context = constraintLayout.getContext();
                ds dsVar = new ds();
                dcdc<cqoj> a = ((cqok) obj).a();
                int size = a.size();
                for (int i = 0; i < size; i++) {
                    a.get(i).f(context, dsVar);
                }
                dsVar.d(constraintLayout);
                constraintLayout.setConstraintSet(dsVar);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cqkv
    public final boolean b(cqku cqkuVar, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        return false;
    }
}
