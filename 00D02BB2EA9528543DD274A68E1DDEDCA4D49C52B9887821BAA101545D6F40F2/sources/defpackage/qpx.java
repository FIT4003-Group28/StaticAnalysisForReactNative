package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: qpx  reason: default package */
/* loaded from: classes7.dex */
public final class qpx implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof qpq) {
            qpq qpqVar = qpq.ON_TAB_SELECTED_LISTENER;
            int ordinal = ((qpq) cqkuVar).ordinal();
            if (ordinal == 0) {
                if (!(view instanceof qpv)) {
                    return false;
                }
                if (obj != null && !(obj instanceof acnw)) {
                    return false;
                }
                ((qpv) view).setOnTabSelectedListener((acnw) obj);
                return true;
            } else if (ordinal == 1) {
                if (!(view instanceof qpv) || !(obj instanceof Float)) {
                    return false;
                }
                ((qpv) view).setSelectedPosition(((Float) obj).floatValue());
                return true;
            } else if (ordinal != 2) {
                if (ordinal != 3 || !(view instanceof qpv)) {
                    return false;
                }
                if (obj != null && !(obj instanceof qpr)) {
                    return false;
                }
                ((qpv) view).setTabFilter((qpr) obj);
                return true;
            } else if (!(view instanceof qpv) || !(obj instanceof cqtv)) {
                return false;
            } else {
                ((qpv) view).setSelectorInset((cqtv) obj);
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
