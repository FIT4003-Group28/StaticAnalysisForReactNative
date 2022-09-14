package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: jli  reason: default package */
/* loaded from: classes7.dex */
public final class jli implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof iug) {
            iug iugVar = iug.ADDRESS_AUTOCOMPLETE_CONTROLLER;
            if (((iug) cqkuVar).ordinal() != 100 || !(view instanceof jlg)) {
                return false;
            }
            if (obj != null && !(obj instanceof jib)) {
                return false;
            }
            jlg jlgVar = (jlg) view;
            jib jibVar = (jib) obj;
            if (jibVar == null) {
                return true;
            }
            jlgVar.setProperties(jibVar);
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
