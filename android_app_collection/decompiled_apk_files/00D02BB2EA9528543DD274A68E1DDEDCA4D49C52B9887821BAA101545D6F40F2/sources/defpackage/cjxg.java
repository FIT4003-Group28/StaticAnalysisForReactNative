package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cjxg  reason: default package */
/* loaded from: classes.dex */
final class cjxg implements cqtv {
    private final cqtv a;
    private final cqtv b;
    private final int c;

    public cjxg(cqtv cqtvVar, cqtv cqtvVar2, int i) {
        this.a = cqtvVar;
        this.b = cqtvVar2;
        this.c = i;
    }

    private final cqtv c(Context context) {
        return cjxh.a(context, this.c) ? this.b : this.a;
    }

    @Override // defpackage.cqtv
    public final int NR(Context context) {
        return c(context).NR(context);
    }

    @Override // defpackage.cqtv
    public final float a(Context context) {
        return c(context).a(context);
    }

    @Override // defpackage.cqtv
    public final int e(Context context) {
        return c(context).e(context);
    }
}
