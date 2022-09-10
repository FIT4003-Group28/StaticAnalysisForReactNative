package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: bcft  reason: default package */
/* loaded from: classes3.dex */
public final class bcft extends aag {
    public bcft(Context context) {
    }

    @Override // defpackage.aag, defpackage.abs
    public final void d(aca acaVar, aci aciVar) {
        int top;
        int bottom;
        int i;
        int i2;
        super.d(acaVar, aciVar);
        if (aJ() == 0) {
            return;
        }
        if ((aK(1) != null && cqkx.d(aK(1), bcfu.a) == null) || (i = this.E) <= (bottom = aK(aJ() - 1).getBottom() - (top = aK(0).getTop())) || (i2 = ((i - bottom) / 2) - top) <= 0) {
            return;
        }
        aP(i2);
    }
}
