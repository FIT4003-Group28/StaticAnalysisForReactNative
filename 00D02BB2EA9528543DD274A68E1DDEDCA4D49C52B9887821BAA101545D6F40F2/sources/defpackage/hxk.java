package defpackage;

import android.graphics.Picture;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.gmm.base.mod.components.appbar.ModAppBar;
import java.util.List;
/* compiled from: PG */
/* renamed from: hxk  reason: default package */
/* loaded from: classes6.dex */
public final class hxk implements cqkv {
    final cqlg a;

    public hxk(cqlg cqlgVar) {
        this.a = cqlgVar;
    }

    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        int i = 0;
        if (cqkuVar instanceof hxo) {
            hxo hxoVar = hxo.ACTION_MENU_ITEMS;
            switch (((hxo) cqkuVar).ordinal()) {
                case 0:
                    if ((view instanceof ModAppBar) && (obj == null || (obj instanceof List))) {
                        ((ModAppBar) view).setActionMenuItems((List) obj);
                        return true;
                    }
                    break;
                case 1:
                    if ((view instanceof ModAppBar) && (obj instanceof Boolean)) {
                        ((ModAppBar) view).setCoverStatusBar(((Boolean) obj).booleanValue());
                        return true;
                    }
                    break;
                case 2:
                    if ((view instanceof ModAppBar) && (obj instanceof Boolean)) {
                        ((ModAppBar) view).setExpanded(((Boolean) obj).booleanValue());
                        return true;
                    }
                    break;
                case 3:
                    if ((view instanceof ModAppBar) && (obj == null || (obj instanceof cqtd))) {
                        ((ModAppBar) view).setIconButtonsBackground((cqtd) obj);
                        return true;
                    }
                    break;
                case 4:
                    if (view instanceof ModAppBar) {
                        if (obj instanceof cqss) {
                            ((ModAppBar) view).setIconColor(Integer.valueOf(this.a.f(view, (cqss) obj)));
                            return true;
                        } else if (obj instanceof Number) {
                            ((ModAppBar) view).setIconColor(Integer.valueOf(((Number) obj).intValue()));
                            return true;
                        } else if (obj == null) {
                            this.a.w(null);
                            ((ModAppBar) view).setIconColor(null);
                            return true;
                        }
                    }
                    break;
                case 5:
                    if ((view instanceof ModAppBar) && (obj instanceof Boolean)) {
                        ((ModAppBar) view).setLiftOnScroll(((Boolean) obj).booleanValue());
                        return true;
                    }
                    break;
                case 6:
                    if ((view instanceof ModAppBar) && (obj instanceof Boolean)) {
                        ((ModAppBar) view).q(((Boolean) obj).booleanValue());
                        return true;
                    }
                    break;
                case 7:
                    if ((view instanceof ModAppBar) && (obj instanceof Boolean)) {
                        ((ModAppBar) view).l(((Boolean) obj).booleanValue());
                        return true;
                    }
                    break;
                case 8:
                    if (view instanceof ModAppBar) {
                        if (obj == null || (obj instanceof Drawable)) {
                            Drawable drawable = (Drawable) obj;
                            cqlg.u(view, drawable);
                            ((ModAppBar) view).setNavIcon(drawable);
                            return true;
                        } else if (obj instanceof cqtd) {
                            ((ModAppBar) view).setNavIcon(this.a.c(view, (cqtd) obj));
                            return true;
                        } else if (obj instanceof Picture) {
                            ((ModAppBar) view).setNavIcon(this.a.d(view, (Picture) obj));
                            return true;
                        } else if (obj instanceof Integer) {
                            ((ModAppBar) view).setNavIcon(this.a.e(view, ((Integer) obj).intValue()));
                            return true;
                        }
                    }
                    break;
                case 9:
                    boolean z = view instanceof ModAppBar;
                    if (z && (obj == null || (obj instanceof jia))) {
                        ((ModAppBar) view).setNavButtonClickListener((jia) obj);
                        return true;
                    } else if (z) {
                        if (obj instanceof cqnx) {
                            ((ModAppBar) view).setNavButtonClickListener(cqlg.y(view, (cqnx) obj));
                            return true;
                        } else if (obj instanceof View.OnClickListener) {
                            ((ModAppBar) view).setNavButtonClickListener((View.OnClickListener) obj);
                            return true;
                        }
                    }
                    break;
                case 10:
                    if (view instanceof ModAppBar) {
                        if (obj instanceof cqsn) {
                            ((ModAppBar) view).setNavButtonContentDescription(this.a.a(view, (cqsn) obj));
                            return true;
                        } else if (obj instanceof Integer) {
                            ((ModAppBar) view).setNavButtonContentDescription(this.a.b(view, ((Integer) obj).intValue()));
                            return true;
                        } else if (obj == null || (obj instanceof CharSequence)) {
                            ((ModAppBar) view).setNavButtonContentDescription((CharSequence) obj);
                            return true;
                        }
                    }
                    break;
                case 11:
                    if ((view instanceof ModAppBar) && (obj instanceof Boolean)) {
                        ((ModAppBar) view).setNavButtonVisible(((Boolean) obj).booleanValue());
                        return true;
                    }
                    break;
                case 12:
                    if ((view instanceof ModAppBar) && (obj == null || (obj instanceof cjtd))) {
                        ((ModAppBar) view).setNavButtonUe3Params((cjtd) obj);
                        return true;
                    }
                    break;
                case 13:
                    if (view instanceof ModAppBar) {
                        if (obj == null || (obj instanceof cqnx)) {
                            ((ModAppBar) view).setOverflowButtonClickListener(cqlg.y(view, (cqnx) obj));
                            return true;
                        } else if (obj instanceof View.OnClickListener) {
                            ((ModAppBar) view).setOverflowButtonClickListener((View.OnClickListener) obj);
                            return true;
                        }
                    }
                    break;
                case 14:
                    if ((view instanceof ModAppBar) && (obj == null || (obj instanceof cjtd))) {
                        ((ModAppBar) view).setOverflowButtonUe3Params((cjtd) obj);
                        return true;
                    }
                    break;
                case 15:
                    if ((view instanceof ModAppBar) && (obj instanceof Boolean)) {
                        ((ModAppBar) view).setOverflowButtonVisible(((Boolean) obj).booleanValue());
                        return true;
                    }
                    break;
                case 16:
                    if (view instanceof ModAppBar) {
                        if (obj == null || (obj instanceof Drawable)) {
                            Drawable drawable2 = (Drawable) obj;
                            cqlg.u(view, drawable2);
                            ((ModAppBar) view).setOverflowIcon(drawable2);
                            return true;
                        } else if (obj instanceof cqtd) {
                            ((ModAppBar) view).setOverflowIcon(this.a.c(view, (cqtd) obj));
                            return true;
                        } else if (obj instanceof Picture) {
                            ((ModAppBar) view).setOverflowIcon(this.a.d(view, (Picture) obj));
                            return true;
                        } else if (obj instanceof Integer) {
                            ((ModAppBar) view).setOverflowIcon(this.a.e(view, ((Integer) obj).intValue()));
                            return true;
                        }
                    }
                    break;
                case 17:
                    if (view instanceof ModAppBar) {
                        if (obj instanceof cqss) {
                            ((ModAppBar) view).setOverflowIconColor(this.a.f(view, (cqss) obj));
                            return true;
                        } else if (!(obj instanceof Number)) {
                            if (obj == null) {
                                this.a.w(null);
                                break;
                            }
                        } else {
                            ((ModAppBar) view).setOverflowIconColor(((Number) obj).intValue());
                            return true;
                        }
                    }
                    break;
                case 18:
                    if ((view instanceof ModAppBar) && (obj == null || (obj instanceof List))) {
                        ((ModAppBar) view).setOverflowMenuItems((List) obj);
                        return true;
                    }
                    break;
                case 19:
                    if (view instanceof ModAppBar) {
                        if (obj instanceof cqsn) {
                            ((ModAppBar) view).setSubtitle(this.a.a(view, (cqsn) obj));
                            return true;
                        } else if (obj instanceof Integer) {
                            ((ModAppBar) view).setSubtitle(this.a.b(view, ((Integer) obj).intValue()));
                            return true;
                        } else if (obj == null || (obj instanceof CharSequence)) {
                            ((ModAppBar) view).setSubtitle((CharSequence) obj);
                            return true;
                        }
                    }
                    break;
                case 20:
                    if (view instanceof ModAppBar) {
                        if (obj instanceof cqsn) {
                            ((ModAppBar) view).setTitle(this.a.a(view, (cqsn) obj));
                            return true;
                        } else if (obj instanceof Integer) {
                            ((ModAppBar) view).setTitle(this.a.b(view, ((Integer) obj).intValue()));
                            return true;
                        } else if (obj == null || (obj instanceof CharSequence)) {
                            ((ModAppBar) view).setTitle((CharSequence) obj);
                            return true;
                        }
                    }
                    break;
                case 21:
                    if ((view instanceof ModAppBar) && (obj instanceof Integer)) {
                        int intValue = ((Integer) obj).intValue();
                        if (true == hxc.a.contains(Integer.valueOf(intValue))) {
                            i = intValue;
                        }
                        ((ModAppBar) view).setTitleAlignment(i);
                        return true;
                    }
                    break;
                case 22:
                    if ((view instanceof ModAppBar) && (obj instanceof Float)) {
                        ((ModAppBar) view).setTitleAlpha(((Float) obj).floatValue());
                        return true;
                    }
                    break;
                case 23:
                    if (view instanceof ModAppBar) {
                        if (obj instanceof cqsn) {
                            ((ModAppBar) view).setTitleContentDescription(this.a.a(view, (cqsn) obj));
                            return true;
                        } else if (obj instanceof Integer) {
                            ((ModAppBar) view).setTitleContentDescription(this.a.b(view, ((Integer) obj).intValue()));
                            return true;
                        } else if (obj == null || (obj instanceof CharSequence)) {
                            ((ModAppBar) view).setTitleContentDescription((CharSequence) obj);
                            return true;
                        }
                    }
                    break;
                case 24:
                    if (view instanceof ModAppBar) {
                        if (obj == null || (obj instanceof cqnx)) {
                            ((ModAppBar) view).setTitleClickListener(cqlg.y(view, (cqnx) obj));
                            return true;
                        } else if (obj instanceof View.OnClickListener) {
                            ((ModAppBar) view).setTitleClickListener((View.OnClickListener) obj);
                            return true;
                        }
                    }
                    break;
                case 25:
                    if ((view instanceof ModAppBar) && (obj instanceof Integer)) {
                        int intValue2 = ((Integer) obj).intValue();
                        if (true == hxc.b.contains(Integer.valueOf(intValue2))) {
                            i = intValue2;
                        }
                        ((ModAppBar) view).setTitleDropDownIconMode(i);
                        return true;
                    }
                    break;
                case 26:
                    if ((view instanceof ModAppBar) && (obj == null || (obj instanceof jib))) {
                        ((ModAppBar) view).setToolbarProperties((jib) obj);
                        return true;
                    }
                    break;
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
