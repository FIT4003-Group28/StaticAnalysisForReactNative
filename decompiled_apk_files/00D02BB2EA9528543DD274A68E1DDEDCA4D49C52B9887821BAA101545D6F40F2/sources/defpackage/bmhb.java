package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: bmhb  reason: default package */
/* loaded from: classes3.dex */
public final class bmhb implements cqtv, cqtu {
    public final cqtv a;
    public int b;
    private final cqtv c;
    private final cqtv d;
    private int e = 0;
    private float f;

    public bmhb(cqtv cqtvVar, cqtv cqtvVar2, cqtv cqtvVar3) {
        this.c = cqtvVar;
        this.d = cqtvVar2;
        this.a = cqtvVar3;
    }

    @Override // defpackage.cqtv
    public final int NR(Context context) {
        return (int) a(context);
    }

    @Override // defpackage.cqtv
    public final float a(Context context) {
        c(context);
        return this.f;
    }

    public final void c(Context context) {
        int i = context.getResources().getDisplayMetrics().widthPixels;
        if (this.e == i) {
            return;
        }
        this.e = i;
        float a = this.d.a(context);
        float a2 = this.a.a(context) + a;
        int a3 = (int) (a2 / (this.c.a(context) + a));
        this.b = a3;
        int max = Math.max(a3, 1);
        this.b = max;
        float f = max;
        this.f = (a2 - (a * f)) / f;
    }

    @Override // defpackage.cqtv
    public final int e(Context context) {
        float a = a(context);
        int i = (int) (0.5f + a);
        return i == 0 ? a <= 0.0f ? 0 : 1 : i;
    }
}
