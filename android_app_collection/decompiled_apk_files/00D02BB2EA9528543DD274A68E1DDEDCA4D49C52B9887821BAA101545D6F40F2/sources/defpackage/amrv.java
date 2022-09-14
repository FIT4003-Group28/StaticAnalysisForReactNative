package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: amrv  reason: default package */
/* loaded from: classes2.dex */
public final class amrv extends amrs {
    private final float c;
    private final float d;
    private final akra e;

    public amrv(Context context, akra akraVar) {
        super(new amsa());
        this.c = jmj.a(context, 41);
        this.d = jmj.a(context, 25) / 2;
        this.e = akraVar;
    }

    @Override // defpackage.amrs
    protected final void b(float f, float f2) {
        amkz amkzVar = this.a;
        float f3 = this.d;
        amkzVar.a(f - f3, f2 - this.c, f + f3, f2);
    }

    @Override // defpackage.amru
    protected final akra d(amrk amrkVar) {
        return this.e;
    }
}
