package defpackage;

import android.net.Uri;
import android.view.View;
/* compiled from: PG */
/* renamed from: jcw  reason: default package */
/* loaded from: classes7.dex */
public final class jcw implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof iug) {
            iug iugVar = iug.ADDRESS_AUTOCOMPLETE_CONTROLLER;
            if (((iug) cqkuVar).ordinal() != 41 || !(view instanceof jcu)) {
                return false;
            }
            if (obj != null && !(obj instanceof String)) {
                return false;
            }
            String str = (String) obj;
            ((jcu) view).setImageUri(str == null ? null : Uri.parse(str));
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
