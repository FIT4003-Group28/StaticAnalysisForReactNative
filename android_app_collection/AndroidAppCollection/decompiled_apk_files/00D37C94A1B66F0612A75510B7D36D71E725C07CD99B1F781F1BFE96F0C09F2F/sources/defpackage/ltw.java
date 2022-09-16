package defpackage;

import android.content.res.Resources;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ltw  reason: default package */
/* loaded from: classes3.dex */
public final class ltw extends lsv implements lsx {
    public lsw a;
    private View j;

    public ltw(ViewGroup viewGroup, ajzq ajzqVar, ajsg ajsgVar, ajyi ajyiVar, aari aariVar, yni yniVar, yzj yzjVar, acti actiVar) {
        super(viewGroup, ajzqVar, ajsgVar, ajyiVar, aariVar, yniVar, yzjVar, actiVar);
    }

    @Override // defpackage.lsv
    protected final void c(ajsm ajsmVar, aupw aupwVar, boolean z) {
        aupu aupuVar;
        aupu aupuVar2;
        if (z) {
            ajsmVar.n(0, aupwVar);
        } else {
            ajsmVar.add(aupwVar);
        }
        int i = 0;
        while (i < aupwVar.g.size()) {
            aupy aupyVar = (aupy) aupwVar.g.get(i);
            if (aupyVar.b == 105604662) {
                aupuVar = (aupu) aupyVar.c;
            } else {
                aupuVar = aupu.a;
            }
            if (aupuVar.l) {
                if (aupyVar.b == 105604662) {
                    aupuVar2 = (aupu) aupyVar.c;
                } else {
                    aupuVar2 = aupu.a;
                }
                q(aupuVar2, i != 0);
            }
            i++;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.lsv
    public final void d(ajrs ajrsVar, ajqm ajqmVar, int i) {
        super.d(ajrsVar, ajqmVar, i);
        ajrsVar.f("drawer_expansion_state_controller", this.a);
    }

    @Override // defpackage.lsx
    public final void f(float f) {
        Resources resources = this.d.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.section_list_drawer_width_collapsed);
        zgd.t(this.d, zgd.r(dimensionPixelSize + ((int) ((resources.getDimensionPixelSize(R.dimen.section_list_drawer_width_expanded) - dimensionPixelSize) * f))), ViewGroup.LayoutParams.class);
        int i = resources.getConfiguration().orientation;
        if (f == 0.0f || i != 1) {
            this.j.setVisibility(8);
        } else if (f > 0.0f) {
            this.j.setAlpha(f);
            this.j.setVisibility(0);
        }
        zdg.d(f > 0.0f ? this.d : this.b);
    }

    @Override // defpackage.lsv
    protected final void k() {
        this.j = ((ViewStub) this.b.findViewById(R.id.translucent_panel_stub)).inflate();
        Resources resources = this.b.getResources();
        lsw lswVar = new lsw(new yzl(this.b.getContext()), resources.getDimensionPixelSize(R.dimen.section_list_drawer_width_expanded) - resources.getDimensionPixelSize(R.dimen.section_list_drawer_width_collapsed));
        this.a = lswVar;
        lswVar.b(this);
        RecyclerView recyclerView = this.d;
        this.b.getContext();
        recyclerView.ag(new LinearLayoutManager());
        this.d.v(this.a);
        this.j.bringToFront();
        this.d.bringToFront();
        r(this.d.getResources().getConfiguration().orientation);
        this.j.setOnClickListener(new ltv(this));
    }

    @Override // defpackage.lsv
    public final void r(int i) {
        zfx d;
        if (i == 1) {
            d = zgd.l(this.d.getResources().getDimensionPixelSize(R.dimen.section_list_drawer_width_collapsed));
            this.a.e(false);
        } else {
            this.j.setVisibility(8);
            d = zgd.d(17, this.d.getId());
            this.a.f(false);
        }
        zgd.t(this.f, d, RelativeLayout.LayoutParams.class);
    }

    @Override // defpackage.lsv
    public final void s(aopa aopaVar) {
        super.s(aopaVar);
        aupu aupuVar = (aupu) aopaVar.instance;
        if (aupuVar.e == 11 && ((aupv) aupuVar.f).b == 60487319 && this.a.a() > 0.0f && this.d.getResources().getConfiguration().orientation == 1) {
            this.a.e(true);
        }
    }
}
