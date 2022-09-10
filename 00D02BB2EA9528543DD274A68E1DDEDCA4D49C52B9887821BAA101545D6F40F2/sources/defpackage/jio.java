package defpackage;

import android.animation.TimeInterpolator;
import android.view.View;
/* compiled from: PG */
/* renamed from: jio  reason: default package */
/* loaded from: classes7.dex */
public final class jio implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof jil) {
            jil jilVar = jil.SELECTED_CHILD_INDEX;
            int ordinal = ((jil) cqkuVar).ordinal();
            if (ordinal == 0) {
                if (!(view instanceof jin) || !(obj instanceof Integer)) {
                    return false;
                }
                ((jin) view).setSelectedChildIndex(((Integer) obj).intValue());
                return true;
            } else if (ordinal == 1) {
                if (!(view instanceof jin) || !(obj instanceof Integer)) {
                    return false;
                }
                ((jin) view).setTransitionDuration(((Integer) obj).intValue());
                return true;
            } else if (ordinal == 2) {
                if (!(view instanceof jin) || !(obj instanceof TimeInterpolator)) {
                    return false;
                }
                ((jin) view).setTransitionInterpolator((TimeInterpolator) obj);
                return true;
            } else if (ordinal != 3 || !(view instanceof jin) || !(obj instanceof Float)) {
                return false;
            } else {
                ((jin) view).setTransitionFadeRatio(((Float) obj).floatValue());
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
