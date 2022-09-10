package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Picture;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.filament.R;
import com.google.android.material.chip.Chip;
/* compiled from: PG */
/* renamed from: hza  reason: default package */
/* loaded from: classes.dex */
public final class hza implements cqkv {
    final cqlg a;

    public hza(cqlg cqlgVar) {
        this.a = cqlgVar;
    }

    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof hyz) {
            hyz hyzVar = hyz.CHIP_BACKGROUND_COLOR;
            switch (((hyz) cqkuVar).ordinal()) {
                case 0:
                    if (!(view instanceof Chip)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof cqss)) {
                        ((Chip) view).setChipBackgroundColor(this.a.g(view, (cqss) obj));
                        return true;
                    } else if (obj instanceof Number) {
                        ((Chip) view).setChipBackgroundColor(this.a.o((Number) obj));
                        return true;
                    } else if (!(obj instanceof ColorStateList)) {
                        return false;
                    } else {
                        ((Chip) view).setChipBackgroundColor((ColorStateList) obj);
                        return true;
                    }
                case 1:
                    if (!(view instanceof Chip) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((Chip) view).setChipBackgroundColorResource(((Integer) obj).intValue());
                    return true;
                case 2:
                    if (!(view instanceof Chip)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof cqss)) {
                        ((Chip) view).setChipStrokeColor(this.a.g(view, (cqss) obj));
                        return true;
                    } else if (obj instanceof Number) {
                        ((Chip) view).setChipStrokeColor(this.a.o((Number) obj));
                        return true;
                    } else if (!(obj instanceof ColorStateList)) {
                        return false;
                    } else {
                        ((Chip) view).setChipStrokeColor((ColorStateList) obj);
                        return true;
                    }
                case 3:
                    if (!(view instanceof Chip) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((Chip) view).setChipStrokeColorResource(((Integer) obj).intValue());
                    return true;
                case 4:
                    if (!(view instanceof Chip)) {
                        return false;
                    }
                    if (obj instanceof cqtv) {
                        ((Chip) view).setChipStrokeWidth(this.a.h(view, (cqtv) obj));
                        return true;
                    } else if (!(obj instanceof Number)) {
                        return false;
                    } else {
                        ((Chip) view).setChipStrokeWidth(((Number) obj).floatValue());
                        return true;
                    }
                case 5:
                    if (!(view instanceof Chip)) {
                        return false;
                    }
                    if (obj instanceof cqsn) {
                        ((Chip) view).setChipText(this.a.a(view, (cqsn) obj));
                        return true;
                    } else if (obj instanceof Integer) {
                        ((Chip) view).setChipText(this.a.b(view, ((Integer) obj).intValue()));
                        return true;
                    } else if (obj != null && !(obj instanceof CharSequence)) {
                        return false;
                    } else {
                        ((Chip) view).setChipText((CharSequence) obj);
                        return true;
                    }
                case 6:
                    if (!(view instanceof Chip) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((Chip) view).setChipTextResource(((Integer) obj).intValue());
                    return true;
                case 7:
                    if (!(view instanceof Chip) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((Chip) view).setTextAppearanceResource(((Integer) obj).intValue());
                    return true;
                case 8:
                    if (!(view instanceof Chip)) {
                        return false;
                    }
                    if (obj instanceof cqtv) {
                        ((Chip) view).setTextStartPadding(this.a.h(view, (cqtv) obj));
                        return true;
                    } else if (!(obj instanceof Number)) {
                        return false;
                    } else {
                        ((Chip) view).setTextStartPadding(((Number) obj).floatValue());
                        return true;
                    }
                case 9:
                    if (!(view instanceof Chip)) {
                        return false;
                    }
                    if (obj instanceof cqtv) {
                        ((Chip) view).setTextEndPadding(this.a.h(view, (cqtv) obj));
                        return true;
                    } else if (!(obj instanceof Number)) {
                        return false;
                    } else {
                        ((Chip) view).setTextEndPadding(((Number) obj).floatValue());
                        return true;
                    }
                case 10:
                    if (!(view instanceof Chip) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((Chip) view).setChipIconEnabled(((Boolean) obj).booleanValue());
                    return true;
                case 11:
                    if (!(view instanceof Chip)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof Drawable)) {
                        Drawable drawable = (Drawable) obj;
                        cqlg.u(view, drawable);
                        ((Chip) view).setChipIcon(drawable);
                        return true;
                    } else if (obj instanceof cqtd) {
                        ((Chip) view).setChipIcon(this.a.c(view, (cqtd) obj));
                        return true;
                    } else if (obj instanceof Picture) {
                        ((Chip) view).setChipIcon(this.a.d(view, (Picture) obj));
                        return true;
                    } else if (!(obj instanceof Integer)) {
                        return false;
                    } else {
                        ((Chip) view).setChipIcon(this.a.e(view, ((Integer) obj).intValue()));
                        return true;
                    }
                case 12:
                    if (!(view instanceof Chip) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((Chip) view).setChipIconResource(((Integer) obj).intValue());
                    return true;
                case 13:
                    if (!(view instanceof Chip)) {
                        return false;
                    }
                    if (obj instanceof cqtv) {
                        ((Chip) view).setIconStartPadding(this.a.h(view, (cqtv) obj));
                        return true;
                    } else if (!(obj instanceof Number)) {
                        return false;
                    } else {
                        ((Chip) view).setIconStartPadding(((Number) obj).floatValue());
                        return true;
                    }
                case 14:
                    if (!(view instanceof Chip)) {
                        return false;
                    }
                    if (obj instanceof cqtv) {
                        ((Chip) view).setIconEndPadding(this.a.h(view, (cqtv) obj));
                        return true;
                    } else if (!(obj instanceof Number)) {
                        return false;
                    } else {
                        ((Chip) view).setIconEndPadding(((Number) obj).floatValue());
                        return true;
                    }
                case 15:
                    if (!(view instanceof Chip)) {
                        return false;
                    }
                    if (obj instanceof cqtv) {
                        ((Chip) view).setChipIconSize(this.a.h(view, (cqtv) obj));
                        return true;
                    } else if (!(obj instanceof Number)) {
                        return false;
                    } else {
                        ((Chip) view).setChipIconSize(((Number) obj).floatValue());
                        return true;
                    }
                case 16:
                    if (!(view instanceof Chip)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof cqss)) {
                        ((Chip) view).setChipIconTint(this.a.g(view, (cqss) obj));
                        return true;
                    } else if (obj instanceof Number) {
                        ((Chip) view).setChipIconTint(this.a.o((Number) obj));
                        return true;
                    } else if (!(obj instanceof ColorStateList)) {
                        return false;
                    } else {
                        ((Chip) view).setChipIconTint((ColorStateList) obj);
                        return true;
                    }
                case 17:
                    if (!(view instanceof Chip) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((Chip) view).setChipIconTintResource(((Integer) obj).intValue());
                    return true;
                case 18:
                    if (!(view instanceof Chip) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((Chip) view).setCloseIconEnabled(((Boolean) obj).booleanValue());
                    return true;
                case 19:
                    if (!(view instanceof Chip)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof Drawable)) {
                        Drawable drawable2 = (Drawable) obj;
                        cqlg.u(view, drawable2);
                        ((Chip) view).setCloseIcon(drawable2);
                        return true;
                    } else if (obj instanceof cqtd) {
                        ((Chip) view).setCloseIcon(this.a.c(view, (cqtd) obj));
                        return true;
                    } else if (obj instanceof Picture) {
                        ((Chip) view).setCloseIcon(this.a.d(view, (Picture) obj));
                        return true;
                    } else if (!(obj instanceof Integer)) {
                        return false;
                    } else {
                        ((Chip) view).setCloseIcon(this.a.e(view, ((Integer) obj).intValue()));
                        return true;
                    }
                case 20:
                    if (!(view instanceof Chip) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((Chip) view).setCloseIconResource(((Integer) obj).intValue());
                    return true;
                case 21:
                    if (!(view instanceof Chip)) {
                        return false;
                    }
                    if (obj instanceof cqtv) {
                        ((Chip) view).setCloseIconSize(this.a.h(view, (cqtv) obj));
                        return true;
                    } else if (!(obj instanceof Number)) {
                        return false;
                    } else {
                        ((Chip) view).setCloseIconSize(((Number) obj).floatValue());
                        return true;
                    }
                case 22:
                    if (!(view instanceof Chip)) {
                        return false;
                    }
                    if (obj instanceof cqtv) {
                        ((Chip) view).setCloseIconStartPadding(this.a.h(view, (cqtv) obj));
                        return true;
                    } else if (!(obj instanceof Number)) {
                        return false;
                    } else {
                        ((Chip) view).setCloseIconStartPadding(((Number) obj).floatValue());
                        return true;
                    }
                case 23:
                    if (!(view instanceof Chip)) {
                        return false;
                    }
                    if (obj instanceof cqtv) {
                        ((Chip) view).setCloseIconEndPadding(this.a.h(view, (cqtv) obj));
                        return true;
                    } else if (!(obj instanceof Number)) {
                        return false;
                    } else {
                        ((Chip) view).setCloseIconEndPadding(((Number) obj).floatValue());
                        return true;
                    }
                case 24:
                    if (!(view instanceof Chip)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof cqnx)) {
                        ((Chip) view).setOnCloseIconClickListener(cqlg.y(view, (cqnx) obj));
                        return true;
                    } else if (!(obj instanceof View.OnClickListener)) {
                        return false;
                    } else {
                        ((Chip) view).setOnCloseIconClickListener((View.OnClickListener) obj);
                        return true;
                    }
                case 25:
                    if (!(view instanceof Chip)) {
                        return false;
                    }
                    if (obj instanceof cqsn) {
                        ((Chip) view).setCloseIconContentDescription(this.a.a(view, (cqsn) obj));
                        return true;
                    } else if (obj instanceof Integer) {
                        ((Chip) view).setCloseIconContentDescription(this.a.b(view, ((Integer) obj).intValue()));
                        return true;
                    } else if (obj != null && !(obj instanceof CharSequence)) {
                        return false;
                    } else {
                        ((Chip) view).setCloseIconContentDescription((CharSequence) obj);
                        return true;
                    }
                case 26:
                    if (!(view instanceof Chip)) {
                        return false;
                    }
                    if (obj instanceof cqtv) {
                        ((Chip) view).setChipMinHeight(this.a.h(view, (cqtv) obj));
                        return true;
                    } else if (!(obj instanceof Number)) {
                        return false;
                    } else {
                        ((Chip) view).setChipMinHeight(((Number) obj).floatValue());
                        return true;
                    }
                case 27:
                    if (!(view instanceof Chip)) {
                        return false;
                    }
                    if (obj instanceof cqtv) {
                        ((Chip) view).setChipCornerRadius(this.a.h(view, (cqtv) obj));
                        return true;
                    } else if (!(obj instanceof Number)) {
                        return false;
                    } else {
                        ((Chip) view).setChipCornerRadius(((Number) obj).floatValue());
                        return true;
                    }
                case 28:
                    if (!(view instanceof Chip)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof cqss)) {
                        ((Chip) view).setRippleColor(this.a.g(view, (cqss) obj));
                        return true;
                    } else if (obj instanceof Number) {
                        ((Chip) view).setRippleColor(this.a.o((Number) obj));
                        return true;
                    } else if (!(obj instanceof ColorStateList)) {
                        return false;
                    } else {
                        ((Chip) view).setRippleColor((ColorStateList) obj);
                        return true;
                    }
                case 29:
                    if (!(view instanceof Chip) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((Chip) view).setRippleColorResource(((Integer) obj).intValue());
                    return true;
                case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                    if (!(view instanceof Chip)) {
                        return false;
                    }
                    if (obj instanceof cqtv) {
                        ((Chip) view).setChipStartPadding(this.a.h(view, (cqtv) obj));
                        return true;
                    } else if (!(obj instanceof Number)) {
                        return false;
                    } else {
                        ((Chip) view).setChipStartPadding(((Number) obj).floatValue());
                        return true;
                    }
                case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                    if (!(view instanceof Chip)) {
                        return false;
                    }
                    if (obj instanceof cqtv) {
                        ((Chip) view).setChipEndPadding(this.a.h(view, (cqtv) obj));
                        return true;
                    } else if (!(obj instanceof Number)) {
                        return false;
                    } else {
                        ((Chip) view).setChipEndPadding(((Number) obj).floatValue());
                        return true;
                    }
                case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                    if (!(view instanceof Chip)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof Drawable)) {
                        Drawable drawable3 = (Drawable) obj;
                        cqlg.u(view, drawable3);
                        ((Chip) view).setCheckedIcon(drawable3);
                        return true;
                    } else if (obj instanceof cqtd) {
                        ((Chip) view).setCheckedIcon(this.a.c(view, (cqtd) obj));
                        return true;
                    } else if (obj instanceof Picture) {
                        ((Chip) view).setCheckedIcon(this.a.d(view, (Picture) obj));
                        return true;
                    } else if (!(obj instanceof Integer)) {
                        return false;
                    } else {
                        ((Chip) view).setCheckedIcon(this.a.e(view, ((Integer) obj).intValue()));
                        return true;
                    }
                case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                    if (!(view instanceof Chip) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((Chip) view).setCheckedIconResource(((Integer) obj).intValue());
                    return true;
                case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                    if (!(view instanceof Chip) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((Chip) view).setCheckedIconEnabled(((Boolean) obj).booleanValue());
                    return true;
                case 35:
                    if (!(view instanceof Chip) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((Chip) view).setCheckable(((Boolean) obj).booleanValue());
                    return true;
                case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                    if (!(view instanceof Chip) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((Chip) view).setEnsureMinTouchTargetSize(((Boolean) obj).booleanValue());
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
