package defpackage;

import android.content.Context;
import android.graphics.drawable.shapes.OvalShape;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cwby  reason: default package */
/* loaded from: classes5.dex */
public final class cwby<AccountT> extends abg<cwbx> {
    public final Context a;
    public final dcdc<cwbe<AccountT, ? extends cwbn>> e;
    public final cwbm f;
    private final cwcz i;
    private m j;
    private final cvzg m;
    public final ua<Integer> g = new ua<>(Integer.class, new cwbu(this));
    private final cvxj<AccountT> l = new cwbv(this);
    private dcdc<cwbn> k = dcdc.e();
    dcdc<cwbt> h = dcdc.e();

    public cwby(Context context, cvzg cvzgVar, dcdc dcdcVar, cwbm cwbmVar) {
        this.a = context;
        this.i = new cwcz(context);
        this.m = cvzgVar;
        this.e = dcdcVar;
        this.f = cwbmVar;
    }

    public final void a(dcdc<cwbn> dcdcVar) {
        dcdc<cwbn> dcdcVar2 = this.k;
        int size = dcdcVar2.size();
        for (int i = 0; i < size; i++) {
            dcdcVar2.get(i).e.e(this.j);
        }
        this.g.b();
        this.k = dcdcVar;
        for (int i2 = 0; i2 < dcdcVar.size(); i2++) {
            dcdcVar.get(i2).e.b(this.j, new cwbw(this, i2));
        }
    }

    @Override // defpackage.abg
    public final int c() {
        return this.g.b;
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ cwbx d(ViewGroup viewGroup, int i) {
        return new cwbx(this.a);
    }

    @Override // defpackage.abg
    public final /* bridge */ /* synthetic */ void e(cwbx cwbxVar, int i) {
        cwbx cwbxVar2 = cwbxVar;
        cwbt cwbtVar = this.h.get(this.g.a(i).intValue());
        cwbxVar2.s.removeAllViews();
        if (cwbtVar.c == null) {
            cwbtVar.c = (ViewGroup) LayoutInflater.from(cwbtVar.a).inflate(R.layout.og_dynamic_card, (ViewGroup) null);
            cwbtVar.c.setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
            cwbtVar.e = (ViewGroup) cwbtVar.c.findViewById(R.id.og_card_content_root);
            cwbtVar.d = cwbtVar.c.findViewById(R.id.og_loading_card_view);
            cwbtVar.f(cwbtVar.e);
            ((ImageView) cwbtVar.d.findViewById(R.id.og_loading_card_icon_placeholder)).setImageDrawable(cwbtVar.c(new OvalShape()));
            ((ImageView) cwbtVar.d.findViewById(R.id.og_loading_card_title_placeholder)).setImageDrawable(cwbtVar.c(cwbt.b()));
            ((ImageView) cwbtVar.d.findViewById(R.id.og_loading_card_progress_placeholder)).setImageDrawable(cwbtVar.c(cwbt.b()));
            ((ImageView) cwbtVar.d.findViewById(R.id.og_loading_card_progress_desc_placeholder)).setImageDrawable(cwbtVar.c(cwbt.b()));
            cwbtVar.c.addOnAttachStateChangeListener(new cwbs(cwbtVar));
        }
        ViewGroup viewGroup = cwbtVar.c;
        if (viewGroup.getParent() != null) {
            ((ViewGroup) viewGroup.getParent()).removeAllViews();
        }
        cwbxVar2.s.addView(viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.abg
    public final void q(RecyclerView recyclerView) {
        recyclerView.g(this.i);
        this.j = cwio.a(recyclerView);
        this.m.i(this.l);
        this.l.a(this.m.e());
    }

    @Override // defpackage.abg
    public final void r(RecyclerView recyclerView) {
        this.m.k(this.l);
        recyclerView.h(this.i);
        a(dcdc.e());
    }
}
