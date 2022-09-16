package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ikn  reason: default package */
/* loaded from: classes6.dex */
public final class ikn implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof iko) {
            iko ikoVar = iko.ABSOLUTE_MIN;
            switch (((iko) cqkuVar).ordinal()) {
                case 0:
                    if (!(view instanceof iki) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((iki) view).setAbsoluteMin(((Integer) obj).intValue());
                    return true;
                case 1:
                    if (!(view instanceof iki) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((iki) view).setAbsoluteMax(((Integer) obj).intValue());
                    return true;
                case 2:
                    if (!(view instanceof iki) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((iki) view).setSelectedMin(((Integer) obj).intValue());
                    return true;
                case 3:
                    if (!(view instanceof iki) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((iki) view).setSelectedMax(((Integer) obj).intValue());
                    return true;
                case 4:
                default:
                    return false;
                case 5:
                    if (!(view instanceof iki) || !(obj instanceof String)) {
                        return false;
                    }
                    ((iki) view).setRangeContentDescription((String) obj);
                    return true;
                case 6:
                    if (!(view instanceof iki) || !(obj instanceof String)) {
                        return false;
                    }
                    ((iki) view).setMinEndpointContentDescription((String) obj);
                    return true;
                case 7:
                    if (!(view instanceof iki) || !(obj instanceof String)) {
                        return false;
                    }
                    ((iki) view).setMaxEndpointContentDescription((String) obj);
                    return true;
                case 8:
                    if (!(view instanceof iki) || !(obj instanceof String)) {
                        return false;
                    }
                    ((iki) view).setLabelText((String) obj);
                    return true;
                case 9:
                    if (!(view instanceof iki) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((iki) view).setEnableHapticFeedback(((Boolean) obj).booleanValue());
                    return true;
                case 10:
                    if (!(view instanceof iki)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof ikd)) {
                        return false;
                    }
                    ((iki) view).setOnRangeSeekBarChangeListener((ikd) obj);
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
