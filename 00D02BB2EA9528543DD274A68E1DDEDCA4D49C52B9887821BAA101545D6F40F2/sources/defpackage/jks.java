package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: jks  reason: default package */
/* loaded from: classes7.dex */
public final class jks implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof jkq) {
            jkq jkqVar = jkq.a;
            if (((jkq) cqkuVar).ordinal() != 0 || !(view instanceof jkr) || !(obj instanceof Integer)) {
                return false;
            }
            ((jkr) view).setAlignmentLine(((Integer) obj).intValue());
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
