package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: jhd  reason: default package */
/* loaded from: classes.dex */
public final class jhd implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof iug) {
            iug iugVar = iug.ADDRESS_AUTOCOMPLETE_CONTROLLER;
            if (((iug) cqkuVar).ordinal() != 78 || !(view instanceof jhc)) {
                return false;
            }
            if (obj != null && !(obj instanceof jht)) {
                return false;
            }
            ((jhc) view).setProperties((jht) obj);
            return true;
        }
        return false;
    }

    @Override // defpackage.cqkv
    public final boolean b(cqku cqkuVar, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        return false;
    }
}