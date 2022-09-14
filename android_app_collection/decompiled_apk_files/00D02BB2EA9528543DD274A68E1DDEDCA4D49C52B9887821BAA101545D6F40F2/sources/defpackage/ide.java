package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ide  reason: default package */
/* loaded from: classes6.dex */
public final class ide implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof iug) {
            iug iugVar = iug.ADDRESS_AUTOCOMPLETE_CONTROLLER;
            if (((iug) cqkuVar).ordinal() != 100 || !(view instanceof idc)) {
                return false;
            }
            if (obj != null && !(obj instanceof jib)) {
                return false;
            }
            idc idcVar = (idc) view;
            jib jibVar = (jib) obj;
            if (jibVar == null) {
                return true;
            }
            idcVar.setProperties(jibVar);
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
