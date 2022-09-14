package defpackage;

import android.view.View;
import com.google.android.apps.gmm.base.views.fivestar.FiveStarTextView;
import com.google.android.apps.gmm.base.views.fivestar.FiveStarView;
/* compiled from: PG */
/* renamed from: jfc  reason: default package */
/* loaded from: classes.dex */
public final class jfc implements cqkv {
    final jfb a;

    public jfc(jfb jfbVar) {
        this.a = jfbVar;
    }

    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        int i = 0;
        if (cqkuVar instanceof jfa) {
            jfa jfaVar = jfa.FIVE_STAR_TEXT;
            int ordinal = ((jfa) cqkuVar).ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal == 4) {
                                if ((view instanceof FiveStarView) && (obj == null || (obj instanceof jez))) {
                                    this.a.h((jez) obj, (FiveStarView) view);
                                    return true;
                                }
                            } else if (ordinal == 5 && (view instanceof FiveStarView) && (obj instanceof Boolean)) {
                                ((FiveStarView) view).setAllowParentInterceptTouchEvent(((Boolean) obj).booleanValue());
                                return true;
                            }
                        } else if ((view instanceof FiveStarView) && (obj instanceof jfo)) {
                            ((FiveStarView) view).setProperties((jfo) obj);
                            return true;
                        }
                    } else if ((view instanceof FiveStarView) && (obj == null || (obj instanceof String))) {
                        ((FiveStarView) view).setAccessibilityLabel((String) obj);
                        return true;
                    }
                } else if (!(view instanceof FiveStarView) || (obj != null && !(obj instanceof Number))) {
                    if ((view instanceof FiveStarTextView) && (obj == null || (obj instanceof Number))) {
                        Number number = (Number) obj;
                        FiveStarTextView fiveStarTextView = (FiveStarTextView) view;
                        if (number != null) {
                            i = number.intValue();
                        }
                        fiveStarTextView.setStarCount(i);
                        return true;
                    }
                } else {
                    Number number2 = (Number) obj;
                    ((FiveStarView) view).setValue(number2 == null ? 0.0f : number2.floatValue());
                    return true;
                }
            } else if ((view instanceof FiveStarTextView) && (obj == null || (obj instanceof String))) {
                ((FiveStarTextView) view).setPlainText(dbsj.e((String) obj));
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cqkv
    public final boolean b(cqku cqkuVar, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof jfa) {
            jfa jfaVar = jfa.FIVE_STAR_TEXT;
            int ordinal = ((jfa) cqkuVar).ordinal();
            if (ordinal == 4) {
                if (view instanceof FiveStarView) {
                    this.a.h(null, (FiveStarView) view);
                    return true;
                }
            } else if (ordinal == 5 && (view instanceof FiveStarView)) {
                ((FiveStarView) view).setAllowParentInterceptTouchEvent(false);
                return true;
            }
        }
        return false;
    }
}
