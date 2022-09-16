package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
/* compiled from: PG */
/* renamed from: cqsp  reason: default package */
/* loaded from: classes.dex */
final class cqsp extends cqss {
    final /* synthetic */ cqss[] a;
    final /* synthetic */ int[][] b;
    final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cqsp(Object[] objArr, cqss[] cqssVarArr, int[][] iArr, boolean z) {
        super(objArr);
        this.a = cqssVarArr;
        this.b = iArr;
        this.c = z;
    }

    @Override // defpackage.cqsj, defpackage.cqur
    public final boolean NJ() {
        return this.c || this.g;
    }

    @Override // defpackage.cqss, defpackage.cqtd
    public final Drawable a(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        int i = 0;
        while (true) {
            int[][] iArr = this.b;
            if (i < iArr.length) {
                stateListDrawable.addState(iArr[i], new ColorDrawable(this.a[i].b(context)));
                i++;
            } else {
                return stateListDrawable;
            }
        }
    }

    @Override // defpackage.cqss
    public final int b(Context context) {
        return c(context).getDefaultColor();
    }

    @Override // defpackage.cqss
    public final ColorStateList c(Context context) {
        int length = this.a.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = this.a[i].b(context);
        }
        return new ColorStateList(this.b, iArr);
    }
}
