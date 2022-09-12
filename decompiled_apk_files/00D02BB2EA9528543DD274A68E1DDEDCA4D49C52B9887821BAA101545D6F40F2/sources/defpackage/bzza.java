package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bzza  reason: default package */
/* loaded from: classes4.dex */
public final class bzza implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof bzyy) {
            bzyy bzyyVar = bzyy.FULL_TEXT;
            int ordinal = ((bzyy) cqkuVar).ordinal();
            if (ordinal == 0) {
                if (!(view instanceof bzzb)) {
                    return false;
                }
                if (obj != null && !(obj instanceof CharSequence)) {
                    return false;
                }
                ((bzzb) view).setFullText((CharSequence) obj);
                return true;
            } else if (ordinal != 1) {
                if (ordinal != 2 || !(view instanceof bzzb) || !(obj instanceof Integer)) {
                    return false;
                }
                ((bzzb) view).setMaxLines(((Integer) obj).intValue());
                return true;
            } else if (!(view instanceof bzzb)) {
                return false;
            } else {
                if (obj != null && !(obj instanceof CharSequence)) {
                    return false;
                }
                ((bzzb) view).setEndLabel((CharSequence) obj);
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
