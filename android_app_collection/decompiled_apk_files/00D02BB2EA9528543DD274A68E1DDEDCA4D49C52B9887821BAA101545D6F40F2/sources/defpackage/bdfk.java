package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bdfk  reason: default package */
/* loaded from: classes3.dex */
public final class bdfk implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof iug) {
            iug iugVar = iug.ADDRESS_AUTOCOMPLETE_CONTROLLER;
            if (((iug) cqkuVar).ordinal() != 12 || !(view instanceof bdfi)) {
                return false;
            }
            if (obj != null && !(obj instanceof jic)) {
                return false;
            }
            bdfi.i.d((jic) obj);
            cqhn cqhnVar = ((bdfi) view).j;
            cqkx.p(bdfi.i);
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
