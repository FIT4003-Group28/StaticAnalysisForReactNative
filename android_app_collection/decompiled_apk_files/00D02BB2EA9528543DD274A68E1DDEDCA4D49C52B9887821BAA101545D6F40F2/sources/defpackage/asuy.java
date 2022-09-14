package defpackage;

import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: asuy  reason: default package */
/* loaded from: classes2.dex */
public final class asuy extends ViewGroup.LayoutParams {
    public int a;

    public asuy() {
        super(-1, -2);
        this.a = 0;
    }

    public asuy(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
        if (layoutParams instanceof asuy) {
            this.a = ((asuy) layoutParams).a;
        }
    }
}
