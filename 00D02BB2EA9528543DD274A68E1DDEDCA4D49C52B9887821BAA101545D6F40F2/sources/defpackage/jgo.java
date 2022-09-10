package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: jgo  reason: default package */
/* loaded from: classes.dex */
public final class jgo implements cqkv {
    final cqlg a;

    public jgo(cqlg cqlgVar) {
        this.a = cqlgVar;
    }

    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof jgm) {
            jgm jgmVar = jgm.CORNER_RADIUS;
            int ordinal = ((jgm) cqkuVar).ordinal();
            if (ordinal == 0) {
                if (!(view instanceof jgn)) {
                    return false;
                }
                if (obj instanceof cqtv) {
                    ((jgn) view).setCornerRadius(this.a.h(view, (cqtv) obj));
                    return true;
                } else if (!(obj instanceof Number)) {
                    return false;
                } else {
                    ((jgn) view).setCornerRadius(((Number) obj).floatValue());
                    return true;
                }
            } else if (ordinal == 1) {
                if (!(view instanceof jgn)) {
                    return false;
                }
                if (obj instanceof cqtv) {
                    ((jgn) view).setTopCornerRadius(this.a.h(view, (cqtv) obj));
                    return true;
                } else if (!(obj instanceof Number)) {
                    return false;
                } else {
                    ((jgn) view).setTopCornerRadius(((Number) obj).floatValue());
                    return true;
                }
            } else if (ordinal == 2) {
                if (!(view instanceof jgn)) {
                    return false;
                }
                if (obj instanceof cqtv) {
                    ((jgn) view).setBottomCornerRadius(this.a.h(view, (cqtv) obj));
                    return true;
                } else if (!(obj instanceof Number)) {
                    return false;
                } else {
                    ((jgn) view).setBottomCornerRadius(((Number) obj).floatValue());
                    return true;
                }
            } else if (ordinal == 3) {
                if (!(view instanceof jgn)) {
                    return false;
                }
                if (obj instanceof cqtv) {
                    ((jgn) view).setStartCornerRadius(this.a.h(view, (cqtv) obj));
                    return true;
                } else if (!(obj instanceof Number)) {
                    return false;
                } else {
                    ((jgn) view).setStartCornerRadius(((Number) obj).floatValue());
                    return true;
                }
            } else if (ordinal != 4 || !(view instanceof jgn)) {
                return false;
            } else {
                if (obj instanceof cqtv) {
                    ((jgn) view).setEndCornerRadius(this.a.h(view, (cqtv) obj));
                    return true;
                } else if (!(obj instanceof Number)) {
                    return false;
                } else {
                    ((jgn) view).setEndCornerRadius(((Number) obj).floatValue());
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
