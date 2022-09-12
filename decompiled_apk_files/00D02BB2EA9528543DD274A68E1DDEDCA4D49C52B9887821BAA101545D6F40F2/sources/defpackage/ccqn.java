package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: ccqn  reason: default package */
/* loaded from: classes4.dex */
public final class ccqn implements cqkv {
    @Override // defpackage.cqkv
    public final boolean a(cqku cqkuVar, Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (cqkuVar instanceof ccqo) {
            ccqo ccqoVar = ccqo.a;
            if (((ccqo) cqkuVar).ordinal() == 0 && (view instanceof ccqm) && (obj instanceof Boolean)) {
                ccqm ccqmVar = (ccqm) view;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (ccqmVar.b != booleanValue) {
                    ccqmVar.b = booleanValue;
                    if (!booleanValue && ccqmVar.getOrientation() == 1) {
                        ccqmVar.a(false);
                    }
                    ccqmVar.requestLayout();
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cqkv
    public final boolean b(cqku cqkuVar, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        return false;
    }
}
