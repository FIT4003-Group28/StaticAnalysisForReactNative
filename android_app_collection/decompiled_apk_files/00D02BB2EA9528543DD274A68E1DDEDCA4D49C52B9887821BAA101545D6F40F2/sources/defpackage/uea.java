package defpackage;

import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: uea  reason: default package */
/* loaded from: classes7.dex */
public final class uea implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof udy) {
            udy udyVar = udy.ORDER_OF_PRECEDENCE;
            int ordinal = ((udy) cqkuVar).ordinal();
            if (ordinal == 0) {
                if (!(view instanceof ueb) || !(obj instanceof List)) {
                    return false;
                }
                ((ueb) view).setOrderOfPrecedence((List) obj);
                return true;
            } else if (ordinal == 1) {
                if (!(view instanceof uec) || !(obj instanceof Boolean)) {
                    return false;
                }
                ((uec) view).setNeedPrecedingInterpunct((Boolean) obj);
                return true;
            } else if (ordinal == 2) {
                if (!(view instanceof uec) || !(obj instanceof Boolean)) {
                    return false;
                }
                ((uec) view).setAllowTextDropped((Boolean) obj);
                return true;
            } else if (ordinal != 3) {
                if (ordinal != 4 || !(view instanceof uec) || !(obj instanceof cqrp)) {
                    return false;
                }
                ((uec) view).setMinTextWidth((cqrp) obj);
                return true;
            } else if (!(view instanceof uec) || !(obj instanceof Boolean)) {
                return false;
            } else {
                ((uec) view).setAllowTextTruncation((Boolean) obj);
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
