package defpackage;

import android.graphics.Picture;
import android.graphics.drawable.Drawable;
import android.view.View;
/* compiled from: PG */
/* renamed from: agws  reason: default package */
/* loaded from: classes2.dex */
public final class agws implements cqkv {
    final cqlg a;

    public agws(cqlg cqlgVar) {
        this.a = cqlgVar;
    }

    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof agwq) {
            agwq agwqVar = agwq.a;
            if (((agwq) cqkuVar).ordinal() != 0 || !(view instanceof agwr)) {
                return false;
            }
            if (obj == null || (obj instanceof Drawable)) {
                Drawable drawable = (Drawable) obj;
                cqlg.u(view, drawable);
                ((agwr) view).setCardViewClippedBackground(drawable);
                return true;
            } else if (obj instanceof cqtd) {
                ((agwr) view).setCardViewClippedBackground(this.a.c(view, (cqtd) obj));
                return true;
            } else if (obj instanceof Picture) {
                ((agwr) view).setCardViewClippedBackground(this.a.d(view, (Picture) obj));
                return true;
            } else if (!(obj instanceof Integer)) {
                return false;
            } else {
                ((agwr) view).setCardViewClippedBackground(this.a.e(view, ((Integer) obj).intValue()));
                return true;
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
