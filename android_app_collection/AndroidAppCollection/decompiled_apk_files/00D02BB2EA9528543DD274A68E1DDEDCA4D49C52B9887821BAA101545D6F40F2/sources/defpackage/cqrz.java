package defpackage;

import android.content.Context;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqrz  reason: default package */
/* loaded from: classes.dex */
public final class cqrz extends cqsg {
    final /* synthetic */ cqtv[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqrz(Object[] objArr, cqtv[] cqtvVarArr) {
        super(objArr);
        this.a = cqtvVarArr;
    }

    @Override // defpackage.cqtv
    public final float a(Context context) {
        float f = 0.0f;
        int i = 0;
        while (true) {
            cqtv[] cqtvVarArr = this.a;
            if (i < cqtvVarArr.length) {
                f += cqtvVarArr[i].a(context);
                i++;
            } else {
                return f;
            }
        }
    }
}
