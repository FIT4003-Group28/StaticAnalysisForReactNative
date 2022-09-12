package defpackage;

import android.view.View;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: jcj  reason: default package */
/* loaded from: classes7.dex */
public final class jcj implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof jch) {
            jch jchVar = jch.COUNT;
            int ordinal = ((jch) cqkuVar).ordinal();
            if (ordinal == 0) {
                if (!(view instanceof jci) || !(obj instanceof Integer)) {
                    return false;
                }
                ((jci) view).setCount(((Integer) obj).intValue());
                return true;
            } else if (ordinal == 1) {
                if (!(view instanceof jci) || !(obj instanceof Boolean)) {
                    return false;
                }
                ((jci) view).setSkipAnimationWhenNotVisible(((Boolean) obj).booleanValue());
                return true;
            } else if (ordinal != 2 || !(view instanceof jci) || !(obj instanceof Locale)) {
                return false;
            } else {
                ((jci) view).setLocale((Locale) obj);
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
