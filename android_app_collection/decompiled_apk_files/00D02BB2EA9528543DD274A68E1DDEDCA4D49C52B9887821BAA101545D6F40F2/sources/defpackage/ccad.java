package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ccad  reason: default package */
/* loaded from: classes4.dex */
public final class ccad implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof ccab) {
            ccab ccabVar = ccab.HASHTAG_CLICK_HANDLER;
            switch (((ccab) cqkuVar).ordinal()) {
                case 0:
                    if (!(view instanceof ccam)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof ccaf)) {
                        return false;
                    }
                    ((ccam) view).setHashtagClickHandler((ccaf) obj);
                    return true;
                case 1:
                    if (!(view instanceof ccam) || !(obj instanceof ccae)) {
                        return false;
                    }
                    ((ccam) view).setExpandingOption((ccae) obj);
                    return true;
                case 2:
                    if (!(view instanceof ccam)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof CharSequence)) {
                        return false;
                    }
                    ((ccam) view).setFullText((CharSequence) obj);
                    return true;
                case 3:
                    if (!(view instanceof ccam)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof CharSequence)) {
                        return false;
                    }
                    ((ccam) view).setLabel((CharSequence) obj);
                    return true;
                case 4:
                    if (!(view instanceof ccam)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof CharSequence)) {
                        return false;
                    }
                    ((ccam) view).setCollapsedLabel((CharSequence) obj);
                    return true;
                case 5:
                    if (!(view instanceof ccam)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof CharSequence)) {
                        return false;
                    }
                    ((ccam) view).setExpandedLabel((CharSequence) obj);
                    return true;
                case 6:
                    if (!(view instanceof ccam) || !(obj instanceof ccaq)) {
                        return false;
                    }
                    ((ccam) view).setLabelPresentation((ccaq) obj);
                    return true;
                case 7:
                    if (!(view instanceof ccam) || !(obj instanceof ccag)) {
                        return false;
                    }
                    ((ccam) view).setHashtagSupport((ccag) obj);
                    return true;
                case 8:
                    if (!(view instanceof ccam)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof ccan)) {
                        return false;
                    }
                    ((ccam) view).setHashtagTextViewClickHandler((ccan) obj);
                    return true;
                case 9:
                    if (!(view instanceof ccam) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((ccam) view).setHashtagTextViewClickHandlerEnabled((Boolean) obj);
                    return true;
                case 10:
                    if (!(view instanceof ccam)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof ccar)) {
                        return false;
                    }
                    ((ccam) view).setTextFormatter((ccar) obj);
                    return true;
                default:
                    return false;
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
