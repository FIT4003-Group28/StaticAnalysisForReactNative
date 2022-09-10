package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ebh  reason: default package */
/* loaded from: classes.dex */
public final class ebh implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof ebf) {
            ebf ebfVar = ebf.PROGRESS_RATIO;
            int ordinal = ((ebf) cqkuVar).ordinal();
            if (ordinal == 0) {
                if (!(view instanceof ebi) || !(obj instanceof Number)) {
                    return false;
                }
                ((ebi) view).setProgressRatio(((Number) obj).floatValue());
                return true;
            } else if (ordinal == 1) {
                if (!(view instanceof ebi) || !(obj instanceof cqtv)) {
                    return false;
                }
                ebi ebiVar = (ebi) view;
                ebiVar.setArcWidth(cqfp.m((cqtv) obj, ebiVar));
                return true;
            } else if (ordinal == 2) {
                if (!(view instanceof ebi) || !(obj instanceof cqss)) {
                    return false;
                }
                ebi ebiVar2 = (ebi) view;
                ebiVar2.setArcColor(cqfp.n((cqss) obj, ebiVar2));
                return true;
            } else if (ordinal != 3) {
                if (ordinal != 4 || !(view instanceof ebi) || !(obj instanceof cqss)) {
                    return false;
                }
                ebi ebiVar3 = (ebi) view;
                ebiVar3.setCenterColor(cqfp.n((cqss) obj, ebiVar3));
                return true;
            } else if (!(view instanceof ebi) || !(obj instanceof cqss)) {
                return false;
            } else {
                ebi ebiVar4 = (ebi) view;
                ebiVar4.setArcBackgroundColor(cqfp.n((cqss) obj, ebiVar4));
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
