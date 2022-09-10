package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.List;
/* compiled from: PG */
/* renamed from: bmxc  reason: default package */
/* loaded from: classes3.dex */
final class bmxc extends ams {
    final /* synthetic */ bmxd f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bmxc(bmxd bmxdVar, View view) {
        super(view);
        this.f = bmxdVar;
    }

    @Override // defpackage.ams
    protected final int u(float f, float f2) {
        return this.f.b(f, f2).c(Integer.MIN_VALUE).intValue();
    }

    @Override // defpackage.ams
    protected final void v(List<Integer> list) {
        int d = this.f.d.d();
        for (int i = 0; i < d; i++) {
            list.add(Integer.valueOf(i));
        }
    }

    @Override // defpackage.ams
    protected final void x(int i, pc pcVar) {
        if (i < 0 || i >= this.f.d.d()) {
            return;
        }
        pcVar.G(this.f.b.b.get(i).f());
        pcVar.f(16);
        pcVar.q(true);
        pcVar.t(true);
        float floatValue = this.f.h.get(i).floatValue();
        float max = Math.max(0.0f, floatValue - this.f.a);
        int width = this.f.getWidth();
        float f = this.f.a;
        pcVar.k(new Rect((int) max, 0, (int) Math.min(width, Math.max(max + f + f, floatValue + f)), this.f.getHeight()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ams
    public final boolean z(int i, int i2) {
        if (i2 != 16) {
            return false;
        }
        bmxd bmxdVar = this.f;
        if (bmxdVar.i == null) {
            return true;
        }
        bmxdVar.f(i);
        return true;
    }
}
