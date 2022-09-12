package defpackage;

import android.content.Context;
import android.view.View;
/* compiled from: PG */
/* renamed from: cdyy  reason: default package */
/* loaded from: classes4.dex */
public final class cdyy extends zy {
    public boolean F;
    public final View.OnTouchListener G;
    public final dzut<dztc> H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cdyy(Context context, int i, dzut<dztc> dzutVar) {
        super(context, i);
        dzvx.c(context, "context");
        this.H = dzutVar;
        this.G = new cdyx(this);
    }

    @Override // defpackage.zy, defpackage.aag, defpackage.abs
    public final int n(int i, aca acaVar, aci aciVar) {
        int n = super.n(i, acaVar, aciVar);
        boolean z = false;
        if (i < 0 && n == 0) {
            n = 0;
            z = true;
        }
        this.F = z;
        return n;
    }
}
