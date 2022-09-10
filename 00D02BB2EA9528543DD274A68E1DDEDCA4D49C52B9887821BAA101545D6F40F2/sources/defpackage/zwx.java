package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: zwx  reason: default package */
/* loaded from: classes7.dex */
public final class zwx implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof zwv) {
            zwv zwvVar = zwv.ADDITIONAL_LINE_COUNT;
            int ordinal = ((zwv) cqkuVar).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1 || !(view instanceof zww) || !(obj instanceof cqtv)) {
                    return false;
                }
                ((zww) view).setSoftMinimumLineWidth((cqtv) obj);
                return true;
            } else if (!(view instanceof zww) || !(obj instanceof Integer)) {
                return false;
            } else {
                ((zww) view).setAdditionalLineCount(((Integer) obj).intValue());
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
