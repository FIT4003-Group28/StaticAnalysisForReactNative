package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.view.View;
import com.google.android.apps.gmm.directions.maneuvers.Maneuvers$Maneuver;
/* compiled from: PG */
/* renamed from: atnm  reason: default package */
/* loaded from: classes2.dex */
public final class atnm implements cqkv {
    final cqlg a;

    public atnm(cqlg cqlgVar) {
        this.a = cqlgVar;
    }

    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof atnl) {
            atnl atnlVar = atnl.ALLOW_TWO_LINES;
            switch (((atnl) cqkuVar).ordinal()) {
                case 0:
                    if (!(view instanceof atnz) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((atnz) view).setAllowTwoLines(((Boolean) obj).booleanValue());
                    return true;
                case 1:
                    if (!(view instanceof atnz) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((atnz) view).setIncludeFontPadding((Boolean) obj);
                    return true;
                case 2:
                    if (!(view instanceof atnq) || (obj != null && !(obj instanceof Maneuvers$Maneuver))) {
                        if (!(view instanceof atnv)) {
                            return false;
                        }
                        if (obj != null && !(obj instanceof Maneuvers$Maneuver)) {
                            return false;
                        }
                        ((atnv) view).setManeuver((Maneuvers$Maneuver) obj);
                        return true;
                    }
                    ((atnq) view).setManeuver((Maneuvers$Maneuver) obj);
                    return true;
                case 3:
                    if (view instanceof atnq) {
                        boolean z = obj instanceof cqss;
                        if (z) {
                            ((atnq) view).setColor(this.a.f(view, (cqss) obj));
                            return true;
                        }
                        boolean z2 = obj instanceof Number;
                        if (z2) {
                            ((atnq) view).setColor(((Number) obj).intValue());
                            return true;
                        }
                        if (obj == null) {
                            this.a.w(null);
                        }
                        if (z) {
                            ((atnq) view).setColor(this.a.f(view, (cqss) obj));
                            return true;
                        } else if (z2) {
                            ((atnq) view).setColor(((Number) obj).intValue());
                            return true;
                        } else {
                            if (obj == null) {
                                this.a.w(null);
                            }
                            if (obj == null) {
                                this.a.w(null);
                                obj = null;
                            }
                        }
                    }
                    if (!(view instanceof atnv)) {
                        return false;
                    }
                    if (obj instanceof cqss) {
                        ((atnv) view).setColor(this.a.f(view, (cqss) obj));
                        return true;
                    } else if (obj instanceof Number) {
                        ((atnv) view).setColor(((Number) obj).intValue());
                        return true;
                    } else {
                        if (obj == null) {
                            this.a.w(null);
                        }
                        if (obj == null) {
                            this.a.w((Number) obj);
                        }
                        if (obj != null) {
                            return false;
                        }
                        this.a.w((Number) obj);
                        return false;
                    }
                case 4:
                    if (!(view instanceof atnt)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof atns)) {
                        return false;
                    }
                    ((atnt) view).setIconsFromProvider((atns) obj);
                    return true;
                case 5:
                    if (!(view instanceof atnv) || !(obj instanceof atnw)) {
                        return false;
                    }
                    ((atnv) view).setStyle((atnw) obj);
                    return true;
                case 6:
                    if (!(view instanceof atnz) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((atnz) view).setShowSingleCue(((Boolean) obj).booleanValue());
                    return true;
                case 7:
                    if (!(view instanceof atnz)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof atoa)) {
                        return false;
                    }
                    ((atnz) view).setProperties((atoa) obj);
                    return true;
                case 8:
                    if (!(view instanceof atnz)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof cqtv)) {
                        return false;
                    }
                    ((atnz) view).setFirstRowTextSize((cqtv) obj);
                    return true;
                case 9:
                    if (!(view instanceof atnz)) {
                        return false;
                    }
                    if (obj != null && !(obj instanceof cqtv)) {
                        return false;
                    }
                    ((atnz) view).setSecondRowTextSize((cqtv) obj);
                    return true;
                case 10:
                    if (!(view instanceof atnz)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof cqss)) {
                        ((atnz) view).setSecondaryTextColor(this.a.g(view, (cqss) obj));
                        return true;
                    } else if (obj instanceof Number) {
                        ((atnz) view).setSecondaryTextColor(this.a.o((Number) obj));
                        return true;
                    } else if (!(obj instanceof ColorStateList)) {
                        return false;
                    } else {
                        ((atnz) view).setSecondaryTextColor((ColorStateList) obj);
                        return true;
                    }
                case 11:
                    if (!(view instanceof atnz) || !(obj instanceof atny)) {
                        return false;
                    }
                    ((atnz) view).setStepCueShowingPolicy((atny) obj);
                    return true;
                case 12:
                    if (!(view instanceof atnz) || !(obj instanceof atob)) {
                        return false;
                    }
                    ((atnz) view).setStyle((atob) obj);
                    return true;
                case 13:
                    if (!(view instanceof atnz)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof cqss)) {
                        ((atnz) view).setTextColor(this.a.g(view, (cqss) obj));
                        return true;
                    } else if (obj instanceof Number) {
                        ((atnz) view).setTextColor(this.a.o((Number) obj));
                        return true;
                    } else if (!(obj instanceof ColorStateList)) {
                        return false;
                    } else {
                        ((atnz) view).setTextColor((ColorStateList) obj);
                        return true;
                    }
                case 14:
                    if (!(view instanceof atnz) || !(obj instanceof Typeface)) {
                        return false;
                    }
                    ((atnz) view).setTypeface((Typeface) obj);
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
