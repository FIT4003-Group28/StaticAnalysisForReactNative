package defpackage;

import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: jnl  reason: default package */
/* loaded from: classes7.dex */
public final class jnl implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        int OX;
        View view = cqjzVar.c;
        if (cqkuVar instanceof iug) {
            iug iugVar = iug.ADDRESS_AUTOCOMPLETE_CONTROLLER;
            int ordinal = ((iug) cqkuVar).ordinal();
            if (ordinal == 73) {
                if (!(view instanceof jnk)) {
                    return false;
                }
                if (obj != null && !(obj instanceof jng)) {
                    return false;
                }
                ((jnk) view).j = (jng) obj;
                return true;
            } else if (ordinal == 75) {
                if (!(view instanceof jnk)) {
                    return false;
                }
                if (obj != null && !(obj instanceof jnh)) {
                    return false;
                }
                ((jnk) view).k = (jnh) obj;
                return true;
            } else if (ordinal == 107) {
                if (!(view instanceof jnk) || !(obj instanceof Boolean)) {
                    return false;
                }
                ((jnk) view).setViewPagerFocusable((Boolean) obj);
                return true;
            } else {
                switch (ordinal) {
                    case 7:
                        if (!(view instanceof jnk) || !(obj instanceof cqiw)) {
                            return false;
                        }
                        ((jnk) view).setAdapter(new cqlo(cqjzVar.g.g(), (cqiw) obj));
                        return true;
                    case 8:
                        if (!(view instanceof jnk)) {
                            return false;
                        }
                        jnk jnkVar = (jnk) view;
                        bas basVar = jnkVar.d;
                        if (basVar != null && obj != null && (OX = basVar.OX(obj)) != -2 && OX != jnkVar.i()) {
                            jnkVar.setCurrentItem(OX);
                        }
                        return true;
                    case 9:
                        if (!(view instanceof jnk) || !(obj instanceof List)) {
                            return false;
                        }
                        List list = (List) obj;
                        bas basVar2 = ((jnk) view).d;
                        if (basVar2 != null) {
                            ((cqlo) basVar2).A(list);
                        }
                        return true;
                    case 10:
                        if (!(view instanceof jnk) || !(obj instanceof Boolean)) {
                            return false;
                        }
                        ((jnk) view).o((Boolean) obj);
                        return true;
                    default:
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
