package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: jnr  reason: default package */
/* loaded from: classes7.dex */
public final class jnr implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        int OX;
        View view = cqjzVar.c;
        if (cqkuVar instanceof iug) {
            iug iugVar = iug.ADDRESS_AUTOCOMPLETE_CONTROLLER;
            int ordinal = ((iug) cqkuVar).ordinal();
            if (ordinal == 37) {
                if (!(view instanceof jnq)) {
                    return false;
                }
                if (obj != null && !(obj instanceof jco)) {
                    return false;
                }
                ((jnq) view).G((jco) obj);
                return true;
            } else if (ordinal == 38) {
                if (!(view instanceof jnq)) {
                    return false;
                }
                jnq jnqVar = (jnq) view;
                bas basVar = jnqVar.w;
                if (basVar != null && obj != null && (OX = basVar.OX(obj)) != -2 && OX != jnqVar.e()) {
                    jnqVar.setCurrentItem(OX);
                }
                return true;
            } else if (ordinal != 95) {
                if (ordinal != 96 || !(view instanceof jnq) || !(obj instanceof Boolean)) {
                    return false;
                }
                ((jnq) view).p = ((Boolean) obj).booleanValue();
                return true;
            } else if (!(view instanceof jnq) || !(obj instanceof Boolean)) {
                return false;
            } else {
                ((jnq) view).q = ((Boolean) obj).booleanValue();
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cqkv
    public final boolean b(cqku cqkuVar, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof iug) {
            iug iugVar = iug.ADDRESS_AUTOCOMPLETE_CONTROLLER;
            if (((iug) cqkuVar).ordinal() != 37 || !(view instanceof jnq)) {
                return false;
            }
            ((jnq) view).G((jco) null);
            return true;
        }
        return false;
    }
}
