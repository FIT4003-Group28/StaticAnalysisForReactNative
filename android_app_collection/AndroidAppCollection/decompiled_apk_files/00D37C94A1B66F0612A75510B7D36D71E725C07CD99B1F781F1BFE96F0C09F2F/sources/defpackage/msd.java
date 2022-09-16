package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: msd  reason: default package */
/* loaded from: classes3.dex */
public final class msd extends ajsl implements lsx {
    final ajsm a;
    public lsy b;
    private final ajxz c;
    private final ViewGroup d;
    private final YouTubeTextView e;
    private final ImageView f;
    private final frf g;
    private final ImageView h;
    private final ajsf i;
    private final int j;
    private final int k;
    private final flx l;
    private final ViewGroup m;
    private msc n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, ajsa] */
    public msd(Context context, ajxz ajxzVar, ajyi ajyiVar, fly flyVar, ajsg ajsgVar, ViewGroup viewGroup) {
        this.c = ajxzVar;
        this.d = viewGroup;
        this.e = (YouTubeTextView) viewGroup.findViewById(R.id.title);
        this.h = (ImageView) viewGroup.findViewById(R.id.collapsed_icon);
        this.f = (ImageView) viewGroup.findViewById(R.id.chevron);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.sort_filter_sub_menu_container);
        this.m = viewGroup2;
        ajsf a = ajsgVar.a(ajyiVar.get());
        this.i = a;
        ajsm ajsmVar = new ajsm();
        this.a = ajsmVar;
        a.h(ajsmVar);
        RecyclerView recyclerView = (RecyclerView) viewGroup.findViewById(R.id.drawer_results);
        recyclerView.ag(new LinearLayoutManager());
        recyclerView.ad(a);
        Resources resources = context.getResources();
        frf frfVar = new frf(zhn.j(context, R.attr.ytSeparator).orElse(0), resources.getDimensionPixelSize(R.dimen.channel_list_sub_menu_bottom_separator_height));
        this.g = frfVar;
        viewGroup.setBackground(frfVar);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.section_list_drawer_chevron_padding_expanded);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.section_list_drawer_chevron_padding_collapsed);
        this.k = dimensionPixelSize2;
        this.j = dimensionPixelSize - dimensionPixelSize2;
        flx c = flyVar.c(viewGroup);
        this.l = c;
        viewGroup2.addView(c.c);
    }

    private final void g(float f) {
        if (this.r) {
            this.f.setVisibility(0);
            int i = this.k + ((int) (this.j * f));
            lj.Y(this.f, i, 0, i, 0);
            this.f.setRotation((1.0f - f) * 180.0f);
        } else {
            this.f.setVisibility(8);
        }
        h(this.m, f, this.o);
        h(this.e, f, this.p);
        h(this.h, 1.0f - f, this.q);
    }

    private static final void h(View view, float f, boolean z) {
        view.setAlpha(f);
        boolean z2 = false;
        if (z && f != 0.0f) {
            z2 = true;
        }
        zag.o(view, z2);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        aupx aupxVar;
        aupx aupxVar2;
        auxr auxrVar;
        aupw aupwVar = (aupw) obj;
        aupwVar.getClass();
        lsy lsyVar = (lsy) ajrsVar.c("drawer_expansion_state_controller");
        this.b = lsyVar;
        lsyVar.b(this);
        if (this.n == null) {
            msc mscVar = new msc(ajrsVar);
            this.n = mscVar;
            this.i.rZ(mscVar);
        }
        if (aupwVar.d == 1) {
            aupxVar = (aupx) aupwVar.e;
        } else {
            aupxVar = aupx.a;
        }
        boolean z = false;
        this.o = aupxVar.b == 76818770;
        Spanned b = ajgl.b(aupwVar.d == 2 ? (arag) aupwVar.e : null);
        this.p = !this.o && !TextUtils.isEmpty(b);
        boolean j = ajrsVar.j("is_first_drawer_list", false);
        this.r = j;
        if (!j && (aupwVar.c & 4) != 0) {
            z = true;
        }
        this.q = z;
        if (j) {
            this.f.setOnClickListener(new View.OnClickListener() { // from class: msb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    msd.this.b.c();
                }
            });
            this.g.c(80);
        } else {
            this.g.c(48);
        }
        if (this.o) {
            if (aupwVar.d == 1) {
                aupxVar2 = (aupx) aupwVar.e;
            } else {
                aupxVar2 = aupx.a;
            }
            if (aupxVar2.b == 76818770) {
                auxrVar = (auxr) aupxVar2.c;
            } else {
                auxrVar = auxr.a;
            }
            this.l.oK(ajrsVar, auxrVar);
        }
        if (this.p) {
            this.e.setText(b);
        }
        zag.o(this.h, this.q);
        if (this.q) {
            ajxz ajxzVar = this.c;
            arhs arhsVar = aupwVar.f;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
            arhr b2 = arhr.b(arhsVar.c);
            if (b2 == null) {
                b2 = arhr.UNKNOWN;
            }
            this.h.setImageResource(ajxzVar.a(b2));
            if (this.p) {
                this.h.setContentDescription(b);
            }
        }
        this.a.clear();
        for (aupy aupyVar : aupwVar.g) {
            if (aupyVar.b == 105604662) {
                this.a.add((aupu) aupyVar.c);
            }
        }
        this.a.l();
        g(this.b.a());
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aupw) obj).h.I();
    }

    @Override // defpackage.lsx
    public final void f(float f) {
        g(f);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.f.setOnClickListener(null);
        this.l.qZ(ajsaVar);
        this.b.d(this);
        this.a.clear();
    }
}
