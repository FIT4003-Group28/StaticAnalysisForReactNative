package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: hzd  reason: default package */
/* loaded from: classes6.dex */
public final class hzd implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        int i = 0;
        if (cqkuVar instanceof hze) {
            hze hzeVar = hze.PRODUCT_NAME;
            int ordinal = ((hze) cqkuVar).ordinal();
            if (ordinal != 0) {
                if (ordinal == 1 && (view instanceof csmp) && (obj instanceof Integer)) {
                    int intValue = ((Integer) obj).intValue();
                    if (true == hzc.a.contains(Integer.valueOf(intValue))) {
                        i = intValue;
                    }
                    ((csmp) view).setSizingMode(i);
                    return true;
                }
            } else if ((view instanceof csmp) && (obj instanceof Integer)) {
                ((csmp) view).setProductName(((Integer) obj).intValue());
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
