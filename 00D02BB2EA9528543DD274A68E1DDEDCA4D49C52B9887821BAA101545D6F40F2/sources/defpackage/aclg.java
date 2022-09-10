package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: aclg  reason: default package */
/* loaded from: classes.dex */
public final class aclg implements cqkv {
    final aclf a;

    public aclg(aclf aclfVar) {
        this.a = aclfVar;
    }

    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof acle) {
            acle acleVar = acle.a;
            if (((acle) cqkuVar).ordinal() != 0 || !(view instanceof View)) {
                return false;
            }
            if (obj != null && !(obj instanceof acli)) {
                return false;
            }
            aclf aclfVar = this.a;
            view.setTag(R.id.logging_params, (acli) obj);
            aclfVar.a.c(view);
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
