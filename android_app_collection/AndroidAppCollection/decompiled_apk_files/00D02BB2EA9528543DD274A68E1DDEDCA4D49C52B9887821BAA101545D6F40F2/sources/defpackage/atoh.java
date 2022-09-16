package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: atoh  reason: default package */
/* loaded from: classes2.dex */
public final class atoh implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof iug) {
            iug iugVar = iug.ADDRESS_AUTOCOMPLETE_CONTROLLER;
            int ordinal = ((iug) cqkuVar).ordinal();
            if (ordinal == 30) {
                if (!(view instanceof atog) || !(obj instanceof Boolean)) {
                    return false;
                }
                ((atog) view).s = ((Boolean) obj).booleanValue();
                return true;
            } else if (ordinal != 31) {
                if (ordinal != 72 || !(view instanceof atog) || !(obj instanceof atof)) {
                    return false;
                }
                ((atog) view).r = (atof) obj;
                return true;
            } else if (!(view instanceof atog) || !(obj instanceof Long)) {
                return false;
            } else {
                ((atog) view).t = ((Long) obj).longValue();
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
