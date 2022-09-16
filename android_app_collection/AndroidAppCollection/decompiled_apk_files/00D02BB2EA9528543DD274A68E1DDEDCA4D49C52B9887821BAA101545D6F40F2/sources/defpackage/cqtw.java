package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
/* compiled from: PG */
@Deprecated
/* renamed from: cqtw  reason: default package */
/* loaded from: classes5.dex */
public final class cqtw extends cqss {
    private static final int[][] a = {new int[]{16842908}, new int[0]};
    private final int b;
    private final Drawable c;
    private final Drawable d;
    private final ColorStateList e;

    public cqtw(int i, int i2) {
        super(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
        this.b = i;
        this.c = new ColorDrawable(i);
        this.d = new ColorDrawable(i2);
        this.e = new ColorStateList(a, new int[]{i2, i});
    }

    @Override // defpackage.cqss, defpackage.cqtd
    public final Drawable a(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[][] iArr = a;
        stateListDrawable.addState(iArr[0], this.d);
        stateListDrawable.addState(iArr[1], this.c);
        return stateListDrawable;
    }

    @Override // defpackage.cqss
    public final int b(Context context) {
        return this.b;
    }

    @Override // defpackage.cqss
    public final ColorStateList c(Context context) {
        return this.e;
    }
}
