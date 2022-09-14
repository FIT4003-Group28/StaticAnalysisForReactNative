package defpackage;

import android.graphics.Picture;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.view.View;
/* compiled from: PG */
/* renamed from: cqra  reason: default package */
/* loaded from: classes5.dex */
public final class cqra implements cqkv {
    final cqlg a;

    public cqra(cqlg cqlgVar) {
        this.a = cqlgVar;
    }

    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        CharSequence b;
        CharSequence a;
        CharSequence b2;
        CharSequence a2;
        View view = cqjzVar.c;
        if (cqkuVar instanceof cqqy) {
            cqqy cqqyVar = cqqy.NAVIGATION_CONTENT_DESCRIPTION;
            switch (((cqqy) cqkuVar).ordinal()) {
                case 0:
                    if (!(view instanceof Toolbar)) {
                        return false;
                    }
                    if (obj instanceof cqsn) {
                        ((Toolbar) view).setNavigationContentDescription(this.a.a(view, (cqsn) obj));
                        return true;
                    } else if (obj instanceof Integer) {
                        ((Toolbar) view).setNavigationContentDescription(this.a.b(view, ((Integer) obj).intValue()));
                        return true;
                    } else if (obj != null && !(obj instanceof CharSequence)) {
                        return false;
                    } else {
                        ((Toolbar) view).setNavigationContentDescription((CharSequence) obj);
                        return true;
                    }
                case 1:
                    if (!(view instanceof Toolbar)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof Drawable)) {
                        Drawable drawable = (Drawable) obj;
                        cqlg.u(view, drawable);
                        ((Toolbar) view).setNavigationIcon(drawable);
                        return true;
                    } else if (obj instanceof cqtd) {
                        ((Toolbar) view).setNavigationIcon(this.a.c(view, (cqtd) obj));
                        return true;
                    } else if (obj instanceof Picture) {
                        ((Toolbar) view).setNavigationIcon(this.a.d(view, (Picture) obj));
                        return true;
                    } else if (!(obj instanceof Integer)) {
                        return false;
                    } else {
                        ((Toolbar) view).setNavigationIcon(this.a.e(view, ((Integer) obj).intValue()));
                        return true;
                    }
                case 2:
                    if (!(view instanceof Toolbar)) {
                        return false;
                    }
                    if (obj == null || (obj instanceof cqnx)) {
                        ((Toolbar) view).setNavigationOnClickListener(cqlg.y(view, (cqnx) obj));
                        return true;
                    } else if (!(obj instanceof View.OnClickListener)) {
                        return false;
                    } else {
                        ((Toolbar) view).setNavigationOnClickListener((View.OnClickListener) obj);
                        return true;
                    }
                case 3:
                    if (!(view instanceof Toolbar)) {
                        return false;
                    }
                    if (!(obj instanceof cqsn) || (a = this.a.a(view, (cqsn) obj)) == null) {
                        if (!(obj instanceof Integer) || (b = this.a.b(view, ((Integer) obj).intValue())) == null) {
                            if (!(obj instanceof CharSequence)) {
                                return false;
                            }
                            ((Toolbar) view).setSubtitle((CharSequence) obj);
                            return true;
                        }
                        ((Toolbar) view).setSubtitle(b);
                        return true;
                    }
                    ((Toolbar) view).setSubtitle(a);
                    return true;
                case 4:
                    if (!(view instanceof Toolbar)) {
                        return false;
                    }
                    if (obj instanceof cqss) {
                        ((Toolbar) view).setSubtitleTextColor(this.a.f(view, (cqss) obj));
                        return true;
                    } else if (obj instanceof Number) {
                        ((Toolbar) view).setSubtitleTextColor(((Number) obj).intValue());
                        return true;
                    } else if (obj != null) {
                        return false;
                    } else {
                        this.a.w(null);
                        return false;
                    }
                case 5:
                    if (!(view instanceof Toolbar)) {
                        return false;
                    }
                    if (!(obj instanceof cqsn) || (a2 = this.a.a(view, (cqsn) obj)) == null) {
                        if (!(obj instanceof Integer) || (b2 = this.a.b(view, ((Integer) obj).intValue())) == null) {
                            if (!(obj instanceof CharSequence)) {
                                return false;
                            }
                            ((Toolbar) view).setTitle((CharSequence) obj);
                            return true;
                        }
                        ((Toolbar) view).setTitle(b2);
                        return true;
                    }
                    ((Toolbar) view).setTitle(a2);
                    return true;
                case 6:
                    if (!(view instanceof Toolbar) || !(obj instanceof Integer)) {
                        return false;
                    }
                    Toolbar toolbar = (Toolbar) view;
                    toolbar.setTitleTextAppearance(toolbar.getContext(), ((Integer) obj).intValue());
                    return true;
                case 7:
                    if (!(view instanceof Toolbar)) {
                        return false;
                    }
                    if (obj instanceof cqss) {
                        ((Toolbar) view).setTitleTextColor(this.a.f(view, (cqss) obj));
                        return true;
                    } else if (obj instanceof Number) {
                        ((Toolbar) view).setTitleTextColor(((Number) obj).intValue());
                        return true;
                    } else if (obj != null) {
                        return false;
                    } else {
                        this.a.w(null);
                        return false;
                    }
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
