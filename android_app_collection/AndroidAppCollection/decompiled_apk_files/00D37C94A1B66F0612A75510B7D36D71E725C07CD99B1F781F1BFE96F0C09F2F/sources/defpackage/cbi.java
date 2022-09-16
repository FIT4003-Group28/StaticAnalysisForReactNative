package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cbi  reason: default package */
/* loaded from: classes2.dex */
public final class cbi extends cbd {
    private final byd h;

    public cbi(bxn bxnVar, cbg cbgVar) {
        super(bxnVar, cbgVar);
        byd bydVar = new byd(bxnVar, this, new cay("__container", cbgVar.a, false));
        this.h = bydVar;
        bydVar.f(Collections.emptyList(), Collections.emptyList());
    }

    @Override // defpackage.cbd, defpackage.bye
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        super.c(rectF, matrix, z);
        this.h.c(rectF, this.a, z);
    }

    @Override // defpackage.cbd
    public final void i(Canvas canvas, Matrix matrix, int i) {
        this.h.b(canvas, matrix, i);
    }

    @Override // defpackage.cbd
    public final void k(bzu bzuVar, int i, List list, bzu bzuVar2) {
        this.h.e(bzuVar, i, list, bzuVar2);
    }
}
