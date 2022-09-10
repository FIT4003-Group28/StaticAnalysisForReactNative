package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Picture;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: PG */
/* renamed from: ibj  reason: default package */
/* loaded from: classes6.dex */
public final class ibj implements cqkv {
    final cqlg a;

    public ibj(cqlg cqlgVar) {
        this.a = cqlgVar;
    }

    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        ColorStateList g;
        ColorStateList o;
        View view = cqjzVar.c;
        if (cqkuVar instanceof ibi) {
            ibi ibiVar = ibi.BOX_STROKE_WIDTH;
            switch (((ibi) cqkuVar).ordinal()) {
                case 0:
                    if (!(view instanceof TextInputLayout) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((TextInputLayout) view).setBoxStrokeWidth(((Integer) obj).intValue());
                    return true;
                case 1:
                    if (!(view instanceof TextInputLayout) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((TextInputLayout) view).setCounterEnabled(((Boolean) obj).booleanValue());
                    return true;
                case 2:
                    if (!(view instanceof TextInputLayout) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((TextInputLayout) view).setCounterMaxLength(((Integer) obj).intValue());
                    return true;
                case 3:
                    if (!(view instanceof TextInputLayout)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof cqss)) {
                        ((TextInputLayout) view).setDefaultHintTextColor(this.a.g(view, (cqss) obj));
                        return true;
                    } else if (obj instanceof Number) {
                        ((TextInputLayout) view).setDefaultHintTextColor(this.a.o((Number) obj));
                        return true;
                    } else if (!(obj instanceof ColorStateList)) {
                        return false;
                    } else {
                        ((TextInputLayout) view).setDefaultHintTextColor((ColorStateList) obj);
                        return true;
                    }
                case 4:
                    if (!(view instanceof TextInputLayout)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof Drawable)) {
                        Drawable drawable = (Drawable) obj;
                        cqlg.u(view, drawable);
                        ((TextInputLayout) view).setEndIconDrawable(drawable);
                        return true;
                    } else if (obj instanceof cqtd) {
                        ((TextInputLayout) view).setEndIconDrawable(this.a.c(view, (cqtd) obj));
                        return true;
                    } else if (obj instanceof Picture) {
                        ((TextInputLayout) view).setEndIconDrawable(this.a.d(view, (Picture) obj));
                        return true;
                    } else if (!(obj instanceof Integer)) {
                        return false;
                    } else {
                        ((TextInputLayout) view).setEndIconDrawable(this.a.e(view, ((Integer) obj).intValue()));
                        return true;
                    }
                case 5:
                    if (!(view instanceof TextInputLayout) || !(obj instanceof Integer)) {
                        return false;
                    }
                    ((TextInputLayout) view).setEndIconMode(((Integer) obj).intValue());
                    return true;
                case 6:
                    if (!(view instanceof TextInputLayout)) {
                        return false;
                    }
                    if (obj instanceof cqsn) {
                        ((TextInputLayout) view).setError(this.a.a(view, (cqsn) obj));
                        return true;
                    } else if (obj instanceof Integer) {
                        ((TextInputLayout) view).setError(this.a.b(view, ((Integer) obj).intValue()));
                        return true;
                    } else if (obj != null && !(obj instanceof CharSequence)) {
                        return false;
                    } else {
                        ((TextInputLayout) view).setError((CharSequence) obj);
                        return true;
                    }
                case 7:
                    if (!(view instanceof TextInputLayout) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((TextInputLayout) view).setErrorEnabled(((Boolean) obj).booleanValue());
                    return true;
                case 8:
                    if (!(view instanceof TextInputLayout)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof Drawable)) {
                        Drawable drawable2 = (Drawable) obj;
                        cqlg.u(view, drawable2);
                        ((TextInputLayout) view).setErrorIconDrawable(drawable2);
                        return true;
                    } else if (obj instanceof cqtd) {
                        ((TextInputLayout) view).setErrorIconDrawable(this.a.c(view, (cqtd) obj));
                        return true;
                    } else if (obj instanceof Picture) {
                        ((TextInputLayout) view).setErrorIconDrawable(this.a.d(view, (Picture) obj));
                        return true;
                    } else if (!(obj instanceof Integer)) {
                        return false;
                    } else {
                        ((TextInputLayout) view).setErrorIconDrawable(this.a.e(view, ((Integer) obj).intValue()));
                        return true;
                    }
                case 9:
                    if (!(view instanceof TextInputLayout)) {
                        return false;
                    }
                    if (obj instanceof cqsn) {
                        ((TextInputLayout) view).setHint(this.a.a(view, (cqsn) obj));
                        return true;
                    } else if (obj instanceof Integer) {
                        ((TextInputLayout) view).setHint(this.a.b(view, ((Integer) obj).intValue()));
                        return true;
                    } else if (obj != null && !(obj instanceof CharSequence)) {
                        return false;
                    } else {
                        ((TextInputLayout) view).setHint((CharSequence) obj);
                        return true;
                    }
                case 10:
                    if (!(view instanceof TextInputLayout) || !(obj instanceof Boolean)) {
                        return false;
                    }
                    ((TextInputLayout) view).setHintAnimationEnabled(((Boolean) obj).booleanValue());
                    return true;
                case 11:
                    if (!(view instanceof TextInputLayout)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof cqss)) {
                        ((TextInputLayout) view).setHintTextColor(this.a.g(view, (cqss) obj));
                        return true;
                    } else if (obj instanceof Number) {
                        ((TextInputLayout) view).setHintTextColor(this.a.o((Number) obj));
                        return true;
                    } else if (!(obj instanceof ColorStateList)) {
                        return false;
                    } else {
                        ((TextInputLayout) view).setHintTextColor((ColorStateList) obj);
                        return true;
                    }
                case 12:
                    if (!(view instanceof TextInputLayout)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof Drawable)) {
                        Drawable drawable3 = (Drawable) obj;
                        cqlg.u(view, drawable3);
                        ((TextInputLayout) view).setStartIconDrawable(drawable3);
                        return true;
                    } else if (obj instanceof cqtd) {
                        ((TextInputLayout) view).setStartIconDrawable(this.a.c(view, (cqtd) obj));
                        return true;
                    } else if (obj instanceof Picture) {
                        ((TextInputLayout) view).setStartIconDrawable(this.a.d(view, (Picture) obj));
                        return true;
                    } else if (!(obj instanceof Integer)) {
                        return false;
                    } else {
                        ((TextInputLayout) view).setStartIconDrawable(this.a.e(view, ((Integer) obj).intValue()));
                        return true;
                    }
                case 13:
                    if (!(view instanceof TextInputLayout)) {
                        return false;
                    }
                    if ((obj != null && !(obj instanceof cqss)) || (g = this.a.g(view, (cqss) obj)) == null) {
                        if (!(obj instanceof Number) || (o = this.a.o((Number) obj)) == null) {
                            if (!(obj instanceof ColorStateList)) {
                                return false;
                            }
                            ((TextInputLayout) view).setBoxStrokeColorStateList((ColorStateList) obj);
                            return true;
                        }
                        ((TextInputLayout) view).setBoxStrokeColorStateList(o);
                        return true;
                    }
                    ((TextInputLayout) view).setBoxStrokeColorStateList(g);
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
