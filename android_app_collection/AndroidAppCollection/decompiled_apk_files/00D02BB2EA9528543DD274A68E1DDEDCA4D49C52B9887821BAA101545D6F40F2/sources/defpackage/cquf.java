package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
/* compiled from: PG */
/* renamed from: cquf  reason: default package */
/* loaded from: classes5.dex */
final class cquf extends cqug {
    final /* synthetic */ cqss[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cquf(Object[] objArr, cqss[] cqssVarArr) {
        super(objArr);
        this.a = cqssVarArr;
    }

    @Override // defpackage.cqug
    public final void a(Context context, GradientDrawable gradientDrawable) {
        int[] iArr = new int[this.a.length];
        int i = 0;
        while (true) {
            cqss[] cqssVarArr = this.a;
            if (i < cqssVarArr.length) {
                iArr[i] = cqssVarArr[i].b(context);
                i++;
            } else {
                gradientDrawable.setColors(iArr);
                return;
            }
        }
    }
}
