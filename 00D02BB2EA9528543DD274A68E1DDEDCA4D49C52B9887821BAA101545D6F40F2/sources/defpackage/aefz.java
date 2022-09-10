package defpackage;

import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: aefz  reason: default package */
/* loaded from: classes.dex */
public final class aefz implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof aefw) {
            aefw aefwVar = aefw.ENABLE_TAP_TO_EXPAND;
            int ordinal = ((aefw) cqkuVar).ordinal();
            if (ordinal == 0) {
                if (!(view instanceof aegc)) {
                    return false;
                }
                if (obj != null && !(obj instanceof Float)) {
                    return false;
                }
                Float f = (Float) obj;
                aegc aegcVar = (aegc) view;
                if (f == null) {
                    aegcVar.setGestureDetector(null);
                } else {
                    aegb.a(aegcVar, f.floatValue(), null, null);
                }
                return true;
            } else if (ordinal == 1) {
                if (!(view instanceof aefv) || !(obj instanceof Integer)) {
                    return false;
                }
                ((aefv) view).setNestedScrollViewId(((Integer) obj).intValue());
                return true;
            } else if (ordinal != 2) {
                if (ordinal != 3 || !(view instanceof aefv)) {
                    return false;
                }
                if (obj != null && !(obj instanceof List)) {
                    return false;
                }
                ((aefv) view).setSnapPoints((List) obj);
                return true;
            } else if (!(view instanceof aefv) || !(obj instanceof Integer)) {
                return false;
            } else {
                ((aefv) view).setMinExposurePixels(((Integer) obj).intValue());
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
