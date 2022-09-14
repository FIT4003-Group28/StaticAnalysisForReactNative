package defpackage;

import android.graphics.Picture;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.material.textfield.TextInputLayout;
/* compiled from: PG */
/* renamed from: cqpo  reason: default package */
/* loaded from: classes.dex */
public final class cqpo implements cqkv {
    final cqlg a;

    public cqpo(cqlg cqlgVar) {
        this.a = cqlgVar;
    }

    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        Drawable e;
        Drawable e2;
        Drawable e3;
        View view = cqjzVar.c;
        if (cqkuVar instanceof cqpg) {
            cqpl cqplVar = cqpl.COUNTER_ENABLED;
            cqph cqphVar = cqph.ALIGN_CONTENT;
            cqpg cqpgVar = cqpg.LAYOUT_BEHAVIOR;
            int ordinal = ((cqpg) cqkuVar).ordinal();
            if (ordinal != 0) {
                if (ordinal == 1 && (view instanceof CoordinatorLayout)) {
                    if (obj == null || (obj instanceof Drawable)) {
                        Drawable drawable = (Drawable) obj;
                        cqlg.u(view, drawable);
                        ((CoordinatorLayout) view).setStatusBarBackground(drawable);
                        return true;
                    } else if (obj instanceof cqtd) {
                        ((CoordinatorLayout) view).setStatusBarBackground(this.a.c(view, (cqtd) obj));
                        return true;
                    } else if (obj instanceof Picture) {
                        ((CoordinatorLayout) view).setStatusBarBackground(this.a.d(view, (Picture) obj));
                        return true;
                    } else if (obj instanceof Integer) {
                        ((CoordinatorLayout) view).setStatusBarBackground(this.a.e(view, ((Integer) obj).intValue()));
                        return true;
                    }
                }
            } else if ((view instanceof View) && (obj == null || (obj instanceof aji))) {
                aji ajiVar = (aji) obj;
                ajl ajlVar = (ajl) view.getLayoutParams();
                if (ajlVar != null) {
                    ajlVar.a(ajiVar);
                }
                return true;
            }
        }
        if (cqkuVar instanceof cqph) {
            cqpl cqplVar2 = cqpl.COUNTER_ENABLED;
            cqph cqphVar2 = cqph.ALIGN_CONTENT;
            cqpg cqpgVar2 = cqpg.LAYOUT_BEHAVIOR;
            switch (((cqph) cqkuVar).ordinal()) {
                case 0:
                    if ((view instanceof FlexboxLayout) && (obj instanceof Integer)) {
                        ((FlexboxLayout) view).setAlignContent(((Integer) obj).intValue());
                        return true;
                    }
                    break;
                case 1:
                    if ((view instanceof FlexboxLayout) && (obj instanceof Integer)) {
                        ((FlexboxLayout) view).setAlignItems(((Integer) obj).intValue());
                        return true;
                    }
                    break;
                case 2:
                    if (view instanceof FlexboxLayout) {
                        if (obj == null || (obj instanceof Drawable)) {
                            Drawable drawable2 = (Drawable) obj;
                            cqlg.u(view, drawable2);
                            if (drawable2 != null) {
                                ((FlexboxLayout) view).setDividerDrawable(drawable2);
                                return true;
                            }
                        }
                        if (!(obj instanceof cqtd)) {
                            if (!(obj instanceof Picture)) {
                                if (!(obj instanceof Integer) || (e = this.a.e(view, ((Integer) obj).intValue())) == null) {
                                    if (obj instanceof Drawable) {
                                        ((FlexboxLayout) view).setDividerDrawable((Drawable) obj);
                                        return true;
                                    }
                                } else {
                                    ((FlexboxLayout) view).setDividerDrawable(e);
                                    return true;
                                }
                            } else {
                                ((FlexboxLayout) view).setDividerDrawable(this.a.d(view, (Picture) obj));
                                return true;
                            }
                        } else {
                            ((FlexboxLayout) view).setDividerDrawable(this.a.c(view, (cqtd) obj));
                            return true;
                        }
                    }
                    break;
                case 3:
                    if (view instanceof FlexboxLayout) {
                        if (obj == null || (obj instanceof Drawable)) {
                            Drawable drawable3 = (Drawable) obj;
                            cqlg.u(view, drawable3);
                            if (drawable3 != null) {
                                ((FlexboxLayout) view).setDividerDrawableHorizontal(drawable3);
                                return true;
                            }
                        }
                        if (!(obj instanceof cqtd)) {
                            if (!(obj instanceof Picture)) {
                                if (!(obj instanceof Integer) || (e2 = this.a.e(view, ((Integer) obj).intValue())) == null) {
                                    if (obj instanceof Drawable) {
                                        ((FlexboxLayout) view).setDividerDrawableHorizontal((Drawable) obj);
                                        return true;
                                    }
                                } else {
                                    ((FlexboxLayout) view).setDividerDrawableHorizontal(e2);
                                    return true;
                                }
                            } else {
                                ((FlexboxLayout) view).setDividerDrawableHorizontal(this.a.d(view, (Picture) obj));
                                return true;
                            }
                        } else {
                            ((FlexboxLayout) view).setDividerDrawableHorizontal(this.a.c(view, (cqtd) obj));
                            return true;
                        }
                    }
                    break;
                case 4:
                    if (view instanceof FlexboxLayout) {
                        if (obj == null || (obj instanceof Drawable)) {
                            Drawable drawable4 = (Drawable) obj;
                            cqlg.u(view, drawable4);
                            if (drawable4 != null) {
                                ((FlexboxLayout) view).setDividerDrawableVertical(drawable4);
                                return true;
                            }
                        }
                        if (!(obj instanceof cqtd)) {
                            if (!(obj instanceof Picture)) {
                                if (!(obj instanceof Integer) || (e3 = this.a.e(view, ((Integer) obj).intValue())) == null) {
                                    if (obj instanceof Drawable) {
                                        ((FlexboxLayout) view).setDividerDrawableVertical((Drawable) obj);
                                        return true;
                                    }
                                } else {
                                    ((FlexboxLayout) view).setDividerDrawableVertical(e3);
                                    return true;
                                }
                            } else {
                                ((FlexboxLayout) view).setDividerDrawableVertical(this.a.d(view, (Picture) obj));
                                return true;
                            }
                        } else {
                            ((FlexboxLayout) view).setDividerDrawableVertical(this.a.c(view, (cqtd) obj));
                            return true;
                        }
                    }
                    break;
                case 5:
                    if ((view instanceof FlexboxLayout) && (obj instanceof Integer)) {
                        ((FlexboxLayout) view).setFlexDirection(((Integer) obj).intValue());
                        return true;
                    }
                    break;
                case 6:
                    if ((view instanceof FlexboxLayout) && (obj instanceof Integer)) {
                        ((FlexboxLayout) view).setFlexWrap(((Integer) obj).intValue());
                        return true;
                    }
                    break;
                case 7:
                    if ((view instanceof FlexboxLayout) && (obj instanceof Integer)) {
                        ((FlexboxLayout) view).setJustifyContent(((Integer) obj).intValue());
                        return true;
                    }
                    break;
                case 8:
                    if ((view instanceof FlexboxLayout) && (obj instanceof Integer)) {
                        ((FlexboxLayout) view).setShowDivider(((Integer) obj).intValue());
                        return true;
                    }
                    break;
                case 9:
                    if ((view instanceof FlexboxLayout) && (obj instanceof Integer)) {
                        ((FlexboxLayout) view).setShowDividerHorizontal(((Integer) obj).intValue());
                        return true;
                    }
                    break;
                case 10:
                    if ((view instanceof FlexboxLayout) && (obj instanceof Integer)) {
                        ((FlexboxLayout) view).setShowDividerVertical(((Integer) obj).intValue());
                        return true;
                    }
                    break;
            }
        }
        if (cqkuVar instanceof cqpl) {
            cqpl cqplVar3 = cqpl.COUNTER_ENABLED;
            cqph cqphVar3 = cqph.ALIGN_CONTENT;
            cqpg cqpgVar3 = cqpg.LAYOUT_BEHAVIOR;
            int ordinal2 = ((cqpl) cqkuVar).ordinal();
            if (ordinal2 == 0) {
                if (!(view instanceof TextInputLayout) || !(obj instanceof Boolean)) {
                    return false;
                }
                ((TextInputLayout) view).setCounterEnabled(((Boolean) obj).booleanValue());
                return true;
            } else if (ordinal2 == 1) {
                if (!(view instanceof TextInputLayout) || !(obj instanceof Integer)) {
                    return false;
                }
                ((TextInputLayout) view).setCounterMaxLength(((Integer) obj).intValue());
                return true;
            } else if (ordinal2 == 2) {
                if (!(view instanceof TextInputLayout) || !(obj instanceof Boolean)) {
                    return false;
                }
                ((TextInputLayout) view).setErrorEnabled(((Boolean) obj).booleanValue());
                return true;
            } else if (ordinal2 != 3) {
                if (ordinal2 != 4 || !(view instanceof TextInputLayout)) {
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
            } else if (!(view instanceof TextInputLayout)) {
                return false;
            } else {
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
