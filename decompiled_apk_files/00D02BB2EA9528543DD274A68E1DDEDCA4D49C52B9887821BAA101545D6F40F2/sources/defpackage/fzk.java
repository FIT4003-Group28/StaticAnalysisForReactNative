package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: fzk  reason: default package */
/* loaded from: classes6.dex */
public final class fzk implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof iug) {
            iug iugVar = iug.ADDRESS_AUTOCOMPLETE_CONTROLLER;
            if (((iug) cqkuVar).ordinal() != 48 || !(view instanceof fzj)) {
                return false;
            }
            if (obj != null && !(obj instanceof fzh)) {
                return false;
            }
            ((fzj) view).setListener((fzh) obj);
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
