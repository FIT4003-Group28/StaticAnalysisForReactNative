package defpackage;

import android.content.Context;
import android.content.pm.ResolveInfo;
/* compiled from: PG */
/* renamed from: bwdy  reason: default package */
/* loaded from: classes4.dex */
final class bwdy implements bwfs {
    private static final int b = 3;
    private final bwrs<ilo> a;

    public bwdy(bwrs<ilo> bwrsVar) {
        this.a = bwrsVar;
    }

    @Override // defpackage.bwfs
    public final void a(Context context, cjqy cjqyVar, ResolveInfo resolveInfo) {
        ilo iloVar = (ilo) bwrs.b(this.a);
        if (iloVar != null) {
            cjtk[] cjtkVarArr = new cjtk[1];
            cjtd bY = iloVar.bY();
            cjtkVarArr[0] = new cjtx(3, bY != null ? bY.e : null, bY != null ? bY.d : null, iloVar.n(), cjtx.b(iloVar), iloVar.aj(), resolveInfo.activityInfo.name, resolveInfo.loadLabel(context.getPackageManager()).toString(), false);
            cjqyVar.u(cjtkVarArr);
        }
    }
}
