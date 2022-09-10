package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.Map;
/* compiled from: PG */
/* renamed from: vgf  reason: default package */
/* loaded from: classes7.dex */
public final class vgf extends aag {
    public int a;
    private final Map<Long, Integer> b;
    @dzsi
    private RecyclerView c;
    private boolean d;
    private final abp e;

    public vgf() {
        super(0, false);
        this.b = new dzls();
        this.d = true;
        this.a = 0;
        this.e = new vge(this);
    }

    private final int bE(int i) {
        Rect rect = new Rect();
        RecyclerView.ad(I(i), rect);
        return rect.centerX();
    }

    public static <T extends cqkp> cqnf<T> k() {
        return cqqx.r(new vgd(new Object[0]));
    }

    private final void q(int i) {
        int bE = bE(i);
        if (ay() == 0) {
            this.a = this.D - bE;
        } else {
            this.a = bE;
        }
        int bE2 = bE(0);
        int i2 = this.D / 2;
        if ((ay() == 0 && this.a + bE2 > i2) || (ay() == 1 && bE2 - this.a < i2)) {
            this.a = 0;
            return;
        }
        RecyclerView recyclerView = this.c;
        dbsk.s(recyclerView);
        final RecyclerView recyclerView2 = this.c;
        recyclerView2.getClass();
        recyclerView.post(new Runnable(recyclerView2) { // from class: vgc
            private final RecyclerView a;

            {
                this.a = recyclerView2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.U();
            }
        });
    }

    @Override // defpackage.abs
    public final void Sg() {
        this.d = true;
        this.a = 0;
    }

    @Override // defpackage.abs
    public final void aX(@dzsi abg abgVar, @dzsi abg abgVar2) {
        int i = 0;
        if (abgVar != null) {
            this.b.put(Long.valueOf(abgVar.k(0)), Integer.valueOf(this.a));
        }
        if (abgVar2 != null) {
            Integer num = ((dzkl) this.b).get(Long.valueOf(abgVar2.k(0)));
            if (num != null) {
                i = num.intValue();
            }
            this.a = i;
            this.d = true;
        }
    }

    @Override // defpackage.aag, defpackage.abs
    public final void am(RecyclerView recyclerView) {
        recyclerView.h(this.e);
        this.c = null;
    }

    @Override // defpackage.abs
    public final void av(RecyclerView recyclerView) {
        this.c = recyclerView;
        recyclerView.g(this.e);
    }

    @Override // defpackage.aag, defpackage.abs
    public final void e(aci aciVar) {
        double abs;
        super.e(aciVar);
        if (!this.d) {
            return;
        }
        this.d = false;
        if (ac() != 0) {
            return;
        }
        if (aJ() >= aN() && af() == ae()) {
            return;
        }
        View I = I(ae());
        Rect rect = new Rect();
        RecyclerView.ad(I, rect);
        if (ay() == 0) {
            double d = this.D - rect.left;
            double width = rect.width();
            Double.isNaN(d);
            Double.isNaN(width);
            abs = d / width;
        } else {
            double d2 = rect.right;
            Double.isNaN(d2);
            double width2 = rect.width();
            Double.isNaN(width2);
            abs = Math.abs((-d2) / width2);
        }
        if (abs >= 0.7d) {
            q(ae());
        } else if (abs > 0.3d) {
        } else {
            q(af());
        }
    }
}
