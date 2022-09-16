package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: hmx  reason: default package */
/* loaded from: classes6.dex */
public final class hmx implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof hmv) {
            hmv hmvVar = hmv.a;
            if (((hmv) cqkuVar).ordinal() != 0 || !(view instanceof hmu) || !(obj instanceof Boolean)) {
                return false;
            }
            ((hmu) view).setCompletionsEnabled(((Boolean) obj).booleanValue());
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
