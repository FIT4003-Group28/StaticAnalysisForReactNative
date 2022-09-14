package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
/* compiled from: PG */
/* renamed from: cqtn  reason: default package */
/* loaded from: classes5.dex */
final class cqtn extends cqtd {
    final /* synthetic */ cqtd[] a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqtn(Object[] objArr, cqtd[] cqtdVarArr) {
        super(objArr);
        this.a = cqtdVarArr;
    }

    @Override // defpackage.cqtd
    public final Drawable a(Context context) {
        Drawable[] drawableArr = new Drawable[this.a.length];
        int i = 0;
        while (true) {
            cqtd[] cqtdVarArr = this.a;
            if (i < cqtdVarArr.length) {
                drawableArr[i] = cqtdVarArr[i].a(context);
                i++;
            } else {
                return new LayerDrawable(drawableArr);
            }
        }
    }
}
