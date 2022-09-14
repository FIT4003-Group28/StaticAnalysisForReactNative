package defpackage;

import android.graphics.Rect;
import android.view.View;
/* compiled from: PG */
/* renamed from: iqk  reason: default package */
/* loaded from: classes6.dex */
final class iqk extends akxp {
    public Rect a;
    public int b;
    public int c;
    final /* synthetic */ iql d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqk(iql iqlVar, bnsn bnsnVar) {
        super(bnsnVar);
        this.d = iqlVar;
        this.a = iqlVar.h.b();
        View g = iqlVar.h.g();
        int i = 0;
        this.b = g == null ? 0 : g.getWidth();
        this.c = g != null ? g.getHeight() : i;
    }

    @Override // defpackage.akxp
    public final void a(final int i, final int i2, float f) {
        this.d.i.execute(new Runnable(this, i, i2) { // from class: iqj
            private final iqk a;
            private final int b;
            private final int c;

            {
                this.a = this;
                this.b = i;
                this.c = i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                iqk iqkVar = this.a;
                int i3 = this.b;
                int i4 = this.c;
                iql iqlVar = iqkVar.d;
                akqq akqqVar = iqlVar.e;
                if (akqqVar == null) {
                    return;
                }
                if (iqlVar.a.L() == jjn.EXPANDED) {
                    iqkVar.d.e(jjn.EXPANDED, 0);
                    return;
                }
                iqkVar.a.offset((i3 - iqkVar.b) / 2, (i4 - iqkVar.c) / 2);
                dxio<akzh> dxioVar = iqkVar.d.f;
                if (dxioVar != null && alao.i(dxioVar.a().b(), akqqVar, ((iqi) iqkVar.d.b).a(), iqkVar.a)) {
                    iqkVar.d.f(akqqVar, 0);
                }
                iqkVar.a = iqkVar.d.h.b();
                iqkVar.b = i3;
                iqkVar.c = i4;
            }
        });
    }
}
