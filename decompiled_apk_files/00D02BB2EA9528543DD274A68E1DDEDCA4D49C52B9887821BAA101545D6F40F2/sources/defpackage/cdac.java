package defpackage;

import android.view.View;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: cdac  reason: default package */
/* loaded from: classes4.dex */
public final class cdac implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof cdaa) {
            cdaa cdaaVar = cdaa.COUNT;
            int ordinal = ((cdaa) cqkuVar).ordinal();
            if (ordinal == 0) {
                if (!(view instanceof cdab) || !(obj instanceof Integer)) {
                    return false;
                }
                ((cdab) view).setCount(((Integer) obj).intValue());
                return true;
            } else if (ordinal == 1) {
                if (!(view instanceof cdab) || !(obj instanceof Boolean)) {
                    return false;
                }
                ((cdab) view).setSkipAnimationWhenNotVisible(((Boolean) obj).booleanValue());
                return true;
            } else if (ordinal == 2) {
                if (!(view instanceof cdab) || !(obj instanceof Locale)) {
                    return false;
                }
                ((cdab) view).setLocale((Locale) obj);
                return true;
            } else if (ordinal != 3 || !(view instanceof cdab) || !(obj instanceof Boolean)) {
                return false;
            } else {
                ((cdab) view).setIndeterminate(((Boolean) obj).booleanValue());
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
