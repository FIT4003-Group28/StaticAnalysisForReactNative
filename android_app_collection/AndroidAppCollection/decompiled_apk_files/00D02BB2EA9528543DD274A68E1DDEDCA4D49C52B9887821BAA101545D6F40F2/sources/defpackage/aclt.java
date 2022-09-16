package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aclt  reason: default package */
/* loaded from: classes.dex */
public final class aclt implements cqkv {
    final aclv a;

    public aclt(aclv aclvVar) {
        this.a = aclvVar;
    }

    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof cqfe) {
            cqfe cqfeVar = cqfe.ACCESSIBILITY_DELEGATE;
            if (((cqfe) cqkuVar).ordinal() != 135 || !(view instanceof View)) {
                return false;
            }
            this.a.a(obj, view, cqjzVar);
            return true;
        }
        return false;
    }

    @Override // defpackage.cqkv
    public final boolean b(cqku cqkuVar, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof cqfe) {
            cqfe cqfeVar = cqfe.ACCESSIBILITY_DELEGATE;
            if (((cqfe) cqkuVar).ordinal() != 135 || !(view instanceof View)) {
                return false;
            }
            this.a.a(null, view, cqjzVar);
            return true;
        }
        return false;
    }
}
