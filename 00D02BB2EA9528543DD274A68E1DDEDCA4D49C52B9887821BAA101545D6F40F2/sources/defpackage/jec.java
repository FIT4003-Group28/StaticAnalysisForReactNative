package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: jec  reason: default package */
/* loaded from: classes7.dex */
public final class jec implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof jea) {
            jea jeaVar = jea.CAROUSEL_DOTS_COLOR;
            int ordinal = ((jea) cqkuVar).ordinal();
            if (ordinal == 0) {
                if (!(view instanceof jeb) || !(obj instanceof cqss)) {
                    return false;
                }
                ((jeb) view).setCarouselDotsColor((cqss) obj);
                return true;
            } else if (ordinal != 1) {
                if (ordinal != 2 || !(view instanceof jeb) || !(obj instanceof Integer)) {
                    return false;
                }
                ((jeb) view).setCarouselDotsIndex(((Integer) obj).intValue());
                return true;
            } else if (!(view instanceof jeb) || !(obj instanceof Integer)) {
                return false;
            } else {
                ((jeb) view).setCarouselDotsCount(((Integer) obj).intValue());
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
