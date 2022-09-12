package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import com.google.android.material.card.MaterialCardView;
/* compiled from: PG */
/* renamed from: hyg  reason: default package */
/* loaded from: classes.dex */
public final class hyg implements cqkv {
    final cqlg a;

    public hyg(cqlg cqlgVar) {
        this.a = cqlgVar;
    }

    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof hyf) {
            hyf hyfVar = hyf.RIPPLE_COLOR;
            int ordinal = ((hyf) cqkuVar).ordinal();
            if (ordinal == 0) {
                if (!(view instanceof MaterialCardView)) {
                    return false;
                }
                if (obj == null || (obj instanceof cqss)) {
                    ((MaterialCardView) view).setRippleColor(this.a.g(view, (cqss) obj));
                    return true;
                } else if (obj instanceof Number) {
                    ((MaterialCardView) view).setRippleColor(this.a.o((Number) obj));
                    return true;
                } else if (!(obj instanceof ColorStateList)) {
                    return false;
                } else {
                    ((MaterialCardView) view).setRippleColor((ColorStateList) obj);
                    return true;
                }
            } else if (ordinal != 1) {
                if (ordinal != 2 || !(view instanceof MaterialCardView)) {
                    return false;
                }
                if (obj instanceof cqtv) {
                    ((MaterialCardView) view).setStrokeWidth(this.a.j(view, (cqtv) obj));
                    return true;
                } else if (obj instanceof Integer) {
                    ((MaterialCardView) view).setStrokeWidth(((Integer) obj).intValue());
                    return true;
                } else if (obj != null) {
                    return false;
                } else {
                    this.a.x(null);
                    return false;
                }
            } else {
                boolean z = view instanceof MaterialCardView;
                if (z) {
                    if (obj instanceof cqss) {
                        ((MaterialCardView) view).setStrokeColor(this.a.f(view, (cqss) obj));
                        return true;
                    } else if (obj instanceof Number) {
                        ((MaterialCardView) view).setStrokeColor(((Number) obj).intValue());
                        return true;
                    } else if (obj == null) {
                        this.a.w(null);
                    }
                }
                if (!z) {
                    return false;
                }
                if (obj == null || (obj instanceof cqss)) {
                    ((MaterialCardView) view).setStrokeColor(this.a.g(view, (cqss) obj));
                    return true;
                } else if (obj instanceof Number) {
                    ((MaterialCardView) view).setStrokeColor(this.a.o((Number) obj));
                    return true;
                } else if (!(obj instanceof ColorStateList)) {
                    return false;
                } else {
                    ((MaterialCardView) view).setStrokeColor((ColorStateList) obj);
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
