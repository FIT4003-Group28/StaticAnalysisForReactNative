package defpackage;

import android.app.Application;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: rlt  reason: default package */
/* loaded from: classes7.dex */
public final class rlt extends gen {
    public cqkj a;
    public gfq b;
    public sbt c;
    public sac d;
    private cqkf<sac> e;
    private final View.OnClickListener g = new View.OnClickListener(this) { // from class: rlq
        private final rlt a;

        {
            this.a = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            rlt rltVar = this.a;
            if (rltVar.aD) {
                rltVar.J().g().f();
            }
        }
    };

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(J());
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1);
        frameLayout.setBackgroundResource(R.color.qu_daynight_black_alpha_54);
        frameLayout.setLayoutParams(layoutParams);
        frameLayout.setOnClickListener(this.g);
        this.e = this.a.c(new rqe(), frameLayout);
        return frameLayout;
    }

    @Override // defpackage.gen
    public final Dialog i(Bundle bundle) {
        gdf gdfVar = new gdf(J(), (byte[]) null);
        Window window = gdfVar.getWindow();
        window.setBackgroundDrawableResource(R.color.black_transparent);
        window.setLayout(-1, -1);
        return gdfVar;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        Bundle bundle2 = this.o;
        dngu dnguVar = (dngu) bvrs.f(bundle2, "toWorkTime", (dssr) dngu.e.cu(7));
        dngu dnguVar2 = (dngu) bvrs.f(bundle2, "leaveWorkTime", (dssr) dngu.e.cu(7));
        sbt sbtVar = this.c;
        dpol b = dpol.b(bundle2.getInt("dayOfWeek"));
        Boolean valueOf = Boolean.valueOf(bundle2.getBoolean("applyAllSelectedDays"));
        dbsk.s(dnguVar);
        dbsk.s(dnguVar2);
        Runnable runnable = new Runnable(this) { // from class: rlr
            private final rlt a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                rlt rltVar = this.a;
                rltVar.J().g().h(rltVar.b.h(rltVar.b.f(rlp.class)), 0);
                rltVar.Nw(new rly(rltVar.d.h(), rltVar.d.a().booleanValue(), rltVar.d.g(), rltVar.d.f()));
            }
        };
        Application a = sbtVar.a.a();
        sbt.a(a, 1);
        cqhn a2 = sbtVar.b.a();
        sbt.a(a2, 2);
        sev a3 = sbtVar.c.a();
        sbt.a(a3, 3);
        sbt.a(b, 4);
        sbt.a(valueOf, 5);
        sbt.a(dnguVar, 6);
        sbt.a(dnguVar2, 7);
        sbt.a(runnable, 8);
        this.d = new sbs(a, a2, a3, b, valueOf, dnguVar, dnguVar2, runnable);
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.e.e(this.d);
    }

    @Override // defpackage.gen, defpackage.ges, defpackage.fd
    public final void u() {
        this.e.e(null);
        super.u();
    }
}
