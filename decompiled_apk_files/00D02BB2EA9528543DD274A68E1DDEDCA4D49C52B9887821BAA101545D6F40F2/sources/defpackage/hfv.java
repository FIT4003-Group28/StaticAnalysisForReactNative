package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
/* compiled from: PG */
/* renamed from: hfv  reason: default package */
/* loaded from: classes6.dex */
final class hfv extends cqss {
    public hfv(Object[] objArr) {
        super(objArr);
    }

    @Override // defpackage.cqss
    public final int b(Context context) {
        return kc.f(irg.k().b(context), 230);
    }

    @Override // defpackage.cqss
    public final ColorStateList c(Context context) {
        return ColorStateList.valueOf(b(context));
    }
}
