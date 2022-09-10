package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cqpf  reason: default package */
/* loaded from: classes.dex */
public final class cqpf extends cqfb {
    @Override // defpackage.cqfb, defpackage.cqkv
    public final boolean a(cqku cqkuVar, @dzsi Object obj, cqjz<?> cqjzVar) {
        View view = cqjzVar.c;
        if (!(cqkuVar instanceof cqpe)) {
            return false;
        }
        cqpe cqpeVar = cqpe.a;
        if (((cqpe) cqkuVar).ordinal() == 0) {
            if (obj != null && !(obj instanceof Integer)) {
                return false;
            }
            czva czvaVar = (czva) view.getLayoutParams();
            if (czvaVar != null) {
                czvaVar.a = obj == null ? 1 : ((Integer) obj).intValue();
            }
            return true;
        }
        throw new RuntimeException();
    }
}
