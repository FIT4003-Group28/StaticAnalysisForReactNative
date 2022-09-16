package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.youtube.app.extensions.reel.watch.activity.ReelSnackbarController;
import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelRecyclerView;
import com.google.android.apps.youtube.app.extensions.reel.watch.player.ReelPlayerView;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: hzy  reason: default package */
/* loaded from: classes3.dex */
public final class hzy extends ne {
    public final /* synthetic */ iai a;
    private int b = -1;

    public hzy(iai iaiVar) {
        this.a = iaiVar;
    }

    public final void a(int i) {
        iai iaiVar = this.a;
        iaiVar.u = true;
        iaiVar.x = i;
        iaiVar.m(this.b);
        this.b = -1;
        iai iaiVar2 = this.a;
        iaiVar2.y = -1;
        iaiVar2.l(true);
        int scrollY = this.a.B.getScrollY();
        int scrollX = this.a.B.getScrollX();
        int height = this.a.B.getHeight();
        int width = this.a.B.getWidth();
        if (scrollY > 0) {
            this.a.B.setScrollY(scrollY - height);
        } else if (scrollY < 0) {
            this.a.B.setScrollY(scrollY + height);
        } else if (scrollX > 0) {
            this.a.B.setScrollX(scrollX - width);
        } else if (scrollX >= 0) {
        } else {
            this.a.B.setScrollX(scrollX + width);
        }
    }

    @Override // defpackage.ne
    public final void i(RecyclerView recyclerView, int i) {
        iak iakVar;
        for (iae iaeVar : this.a.k) {
            iaeVar.n(i);
        }
        iai iaiVar = this.a;
        iaiVar.t = i;
        if (i != 0) {
            if (i == 1) {
                this.b = iaiVar.x;
                ReelSnackbarController reelSnackbarController = iaiVar.g;
                if (reelSnackbarController == null) {
                    return;
                }
                reelSnackbarController.g();
                return;
            }
            int i2 = iaiVar.y;
            if (i2 == -1) {
                iag iagVar = iaiVar.l;
                View b = iagVar.b(iagVar.b.o);
                if (b != null) {
                    iai iaiVar2 = iagVar.b;
                    i2 = iac.bm(b);
                } else {
                    i2 = -1;
                }
            }
            long D = this.a.m.D(i2);
            iai iaiVar3 = this.a;
            long j = iaiVar3.v;
            Object obj = iaiVar3.d.get();
            if (obj != null && ((aull) obj).B && i2 != -1 && D >= 0 && D != j) {
                this.b = i2;
                this.a.n.a(true);
                if (!this.a.g().isPresent() || !(((iaj) this.a.g().get()).f instanceof ibi)) {
                    a(i2);
                    return;
                }
                idw idwVar = ((ibi) ((iaj) this.a.g().get()).f).v.f;
                idwVar.a(this.a.B.c, Optional.of(new hzx(this, idwVar, i2)));
                return;
            }
            this.b = this.a.x;
            return;
        }
        Optional g = iaiVar.g();
        if (this.a.u && g.isPresent() && ((iaj) g.get()).a() != null && (iakVar = this.a.f) != null) {
            iakVar.g(((iaj) g.get()).a().d, 0L);
        }
        ReelRecyclerView reelRecyclerView = this.a.n;
        if (reelRecyclerView != null) {
            reelRecyclerView.a(false);
        }
        iai iaiVar4 = this.a;
        if (!iaiVar4.u) {
            int I = iaiVar4.o.I();
            if (this.a.m.C() != -1 && I == 0) {
                I = this.a.m.y();
            }
            if (I == -1) {
                return;
            }
            iai iaiVar5 = this.a;
            iaiVar5.x = I;
            iaiVar5.m(this.b);
            this.b = -1;
            this.a.l(false);
            return;
        }
        iaiVar4.u = false;
        ReelPlayerView reelPlayerView = iaiVar4.B;
        if (reelPlayerView != null) {
            reelPlayerView.setScrollX(0);
            this.a.B.setScrollY(0);
        }
        iab iabVar = this.a.s;
        if (iabVar == null || iabVar.c == null) {
            return;
        }
        iaj iajVar = iabVar.b;
        String str = iajVar.a().d;
        artv artvVar = iajVar.e;
        boolean g2 = hqp.g(iajVar.a());
        if (artvVar != null) {
            this.a.s.c.l(str, artvVar, iajVar.a, g2, iajVar.c, iajVar.a());
        }
        this.a.s.c.k();
    }

    @Override // defpackage.ne
    public final void j(RecyclerView recyclerView, int i, int i2) {
        ReelPlayerView reelPlayerView = this.a.B;
        reelPlayerView.setScrollX(reelPlayerView.getScrollX() + i);
        reelPlayerView.setScrollY(reelPlayerView.getScrollY() + i2);
    }
}
