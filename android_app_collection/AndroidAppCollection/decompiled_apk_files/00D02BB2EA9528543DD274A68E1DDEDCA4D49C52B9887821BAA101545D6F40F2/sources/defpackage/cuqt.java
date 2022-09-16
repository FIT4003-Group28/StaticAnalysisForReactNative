package defpackage;

import android.content.Context;
import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: cuqt  reason: default package */
/* loaded from: classes5.dex */
public final class cuqt extends aag {
    final /* synthetic */ cuqs a;

    public cuqt(Context context, cuqs cuqsVar) {
        this.a = cuqsVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aag
    public final void K(aci aciVar, int[] iArr) {
        int c = this.a.c() * Resources.getSystem().getDisplayMetrics().widthPixels;
        iArr[0] = c;
        iArr[1] = c;
    }

    @Override // defpackage.aag, defpackage.abs
    public final abt f() {
        return new abt(-1, -1);
    }
}
