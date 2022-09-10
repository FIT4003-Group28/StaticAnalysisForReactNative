package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Picture;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.button.MaterialButton;
/* compiled from: PG */
/* renamed from: hyd  reason: default package */
/* loaded from: classes.dex */
public final class hyd implements cqkv {
    final cqlg a;

    public hyd(cqlg cqlgVar) {
        this.a = cqlgVar;
    }

    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof hyc) {
            hyc hycVar = hyc.CORNER_RADIUS;
            switch (((hyc) cqkuVar).ordinal()) {
                case 0:
                    if (!(view instanceof MaterialButton)) {
                        return false;
                    }
                    if (obj instanceof cqtv) {
                        ((MaterialButton) view).setCornerRadius(this.a.j(view, (cqtv) obj));
                        return true;
                    } else if (obj instanceof Integer) {
                        ((MaterialButton) view).setCornerRadius(((Integer) obj).intValue());
                        return true;
                    } else if (obj != null) {
                        return false;
                    } else {
                        this.a.x(null);
                        return false;
                    }
                case 1:
                    if (!(view instanceof MaterialButton)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof Drawable)) {
                        Drawable drawable = (Drawable) obj;
                        cqlg.u(view, drawable);
                        ((MaterialButton) view).setIcon(drawable);
                        return true;
                    } else if (obj instanceof cqtd) {
                        ((MaterialButton) view).setIcon(this.a.c(view, (cqtd) obj));
                        return true;
                    } else if (obj instanceof Picture) {
                        ((MaterialButton) view).setIcon(this.a.d(view, (Picture) obj));
                        return true;
                    } else if (!(obj instanceof Integer)) {
                        return false;
                    } else {
                        ((MaterialButton) view).setIcon(this.a.e(view, ((Integer) obj).intValue()));
                        return true;
                    }
                case 2:
                    if (!(view instanceof MaterialButton)) {
                        return false;
                    }
                    if (obj instanceof cqtv) {
                        ((MaterialButton) view).setIconSize(this.a.j(view, (cqtv) obj));
                        return true;
                    } else if (obj instanceof Integer) {
                        ((MaterialButton) view).setIconSize(((Integer) obj).intValue());
                        return true;
                    } else if (obj != null) {
                        return false;
                    } else {
                        this.a.x(null);
                        return false;
                    }
                case 3:
                    if (!(view instanceof View) || !(obj instanceof Integer)) {
                        return false;
                    }
                    int intValue = ((Integer) obj).intValue();
                    if (!(view instanceof MaterialButton)) {
                        return false;
                    }
                    if (intValue != 1 && intValue != 2 && intValue != 4) {
                        return false;
                    }
                    ((MaterialButton) view).setIconGravity(intValue);
                    return true;
                case 4:
                    if (!(view instanceof MaterialButton)) {
                        return false;
                    }
                    if (obj instanceof cqtv) {
                        ((MaterialButton) view).setIconPadding(this.a.j(view, (cqtv) obj));
                        return true;
                    } else if (obj instanceof Integer) {
                        ((MaterialButton) view).setIconPadding(((Integer) obj).intValue());
                        return true;
                    } else if (obj != null) {
                        return false;
                    } else {
                        this.a.x(null);
                        return false;
                    }
                case 5:
                    if (!(view instanceof MaterialButton)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof cqss)) {
                        ((MaterialButton) view).setIconTint(this.a.g(view, (cqss) obj));
                        return true;
                    } else if (obj instanceof Number) {
                        ((MaterialButton) view).setIconTint(this.a.o((Number) obj));
                        return true;
                    } else if (!(obj instanceof ColorStateList)) {
                        return false;
                    } else {
                        ((MaterialButton) view).setIconTint((ColorStateList) obj);
                        return true;
                    }
                case 6:
                    if (!(view instanceof MaterialButton)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof cqss)) {
                        ((MaterialButton) view).setBackgroundTintList(this.a.g(view, (cqss) obj));
                        return true;
                    } else if (obj instanceof Number) {
                        ((MaterialButton) view).setBackgroundTintList(this.a.o((Number) obj));
                        return true;
                    } else if (!(obj instanceof ColorStateList)) {
                        return false;
                    } else {
                        ((MaterialButton) view).setBackgroundTintList((ColorStateList) obj);
                        return true;
                    }
                case 7:
                default:
                    return false;
                case 8:
                    if (!(view instanceof MaterialButton)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof cqss)) {
                        ((MaterialButton) view).setRippleColor(this.a.g(view, (cqss) obj));
                        return true;
                    } else if (obj instanceof Number) {
                        ((MaterialButton) view).setRippleColor(this.a.o((Number) obj));
                        return true;
                    } else if (!(obj instanceof ColorStateList)) {
                        return false;
                    } else {
                        ((MaterialButton) view).setRippleColor((ColorStateList) obj);
                        return true;
                    }
                case 9:
                    if (!(view instanceof MaterialButton)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof cqss)) {
                        ((MaterialButton) view).setStrokeColor(this.a.g(view, (cqss) obj));
                        return true;
                    } else if (obj instanceof Number) {
                        ((MaterialButton) view).setStrokeColor(this.a.o((Number) obj));
                        return true;
                    } else if (!(obj instanceof ColorStateList)) {
                        return false;
                    } else {
                        ((MaterialButton) view).setStrokeColor((ColorStateList) obj);
                        return true;
                    }
                case 10:
                    if (!(view instanceof MaterialButton)) {
                        return false;
                    }
                    if (obj instanceof cqtv) {
                        ((MaterialButton) view).setStrokeWidth(this.a.j(view, (cqtv) obj));
                        return true;
                    } else if (obj instanceof Integer) {
                        ((MaterialButton) view).setStrokeWidth(((Integer) obj).intValue());
                        return true;
                    } else if (obj != null) {
                        return false;
                    } else {
                        this.a.x(null);
                        return false;
                    }
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
