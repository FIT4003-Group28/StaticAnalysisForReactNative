package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
/* renamed from: abzm  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class abzm implements cqjb {
    static final cqjb a = new abzm();

    private abzm() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        acbc acbcVar = (acbc) cqkpVar;
        Drawable a2 = ibp.b().a(context);
        return new abzv(acbcVar, new Rect(), (int) ise.b.a(context), a2, abzz.b.e(context), abzz.b.i(2.0d).e(context));
    }
}
