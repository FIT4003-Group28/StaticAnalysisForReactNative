package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: gho  reason: default package */
/* loaded from: classes6.dex */
public final class gho implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof ghm) {
            ghm ghmVar = ghm.DISABLE_CHILD_VIEW_SCROLLING;
            int ordinal = ((ghm) cqkuVar).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1 || !(view instanceof ghn) || !(obj instanceof Object)) {
                    return false;
                }
                ghn ghnVar = (ghn) view;
                ghnVar.setTopTouchFilterHeight(cqfp.m(obj, ghnVar));
                return true;
            } else if (!(view instanceof ghn) || !(obj instanceof Object)) {
                return false;
            } else {
                ghn ghnVar2 = (ghn) view;
                if (obj instanceof Boolean) {
                    ghnVar2.setDisableChildViewScrolling(((Boolean) obj).booleanValue());
                }
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
