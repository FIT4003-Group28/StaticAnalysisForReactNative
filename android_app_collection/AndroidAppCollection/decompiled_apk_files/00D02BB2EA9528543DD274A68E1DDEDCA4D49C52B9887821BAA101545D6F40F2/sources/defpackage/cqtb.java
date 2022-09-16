package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cqtb  reason: default package */
/* loaded from: classes.dex */
public final class cqtb extends cqrt implements cqtv {
    public cqtb(int i) {
        super(i);
    }

    @Override // defpackage.cqtv
    public final int NR(Context context) {
        return context.getResources().getDimensionPixelOffset(this.a);
    }

    @Override // defpackage.cqtv
    public final float a(Context context) {
        return context.getResources().getDimension(this.a);
    }

    @Override // defpackage.cqtv
    public final int e(Context context) {
        return context.getResources().getDimensionPixelSize(this.a);
    }
}
