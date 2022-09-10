package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: bnq  reason: default package */
/* loaded from: classes3.dex */
public final class bnq extends bnl {
    private final bkl g;

    public bnq(bjr bjrVar, bno bnoVar) {
        super(bjrVar, bnoVar);
        bkl bklVar = new bkl(bjrVar, this, new bne("__container", bnoVar.a, false));
        this.g = bklVar;
        bklVar.b(Collections.emptyList(), Collections.emptyList());
    }

    @Override // defpackage.bnl, defpackage.bkm
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        this.g.d(rectF, this.a, z);
    }

    @Override // defpackage.bnl
    public final void j(Canvas canvas, Matrix matrix, int i) {
        this.g.c(canvas, matrix, i);
    }

    @Override // defpackage.bnl
    public final void n(bly blyVar, int i, List<bly> list, bly blyVar2) {
        this.g.e(blyVar, i, list, blyVar2);
    }
}
