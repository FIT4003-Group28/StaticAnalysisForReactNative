package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cfld  reason: default package */
/* loaded from: classes4.dex */
public final class cfld implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof cflg) {
            cflg cflgVar = cflg.a;
            if (((cflg) cqkuVar).ordinal() != 0 || !(view instanceof cflh) || !(obj instanceof cflf)) {
                return false;
            }
            ((cflh) view).setOnDragListener((cflf) obj);
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
