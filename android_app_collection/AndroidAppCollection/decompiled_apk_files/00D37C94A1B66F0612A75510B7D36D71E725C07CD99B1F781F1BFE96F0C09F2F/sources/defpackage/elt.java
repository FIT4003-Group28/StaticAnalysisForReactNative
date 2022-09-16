package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: elt  reason: default package */
/* loaded from: classes3.dex */
public final class elt extends ajsl implements ajzh {
    public final aafo a;
    public final View b;
    public final RecyclerView c;
    public final azpq d;
    public ampq e;
    public apsv f;
    private final fpa g;
    private final akbm h;
    private final View i;
    private final View j;
    private final View k;
    private final View l;
    private final ajsm m;
    private final ajrc n;
    private final elr o;
    private final LinearLayoutManager p;
    private final Context q;
    private int r;
    private int s;
    private akaf t;
    private frf u;
    private int v;
    private final ne x;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, ajsa] */
    public elt(Context context, aafo aafoVar, fpa fpaVar, ajyi ajyiVar, ggb ggbVar, ajsg ajsgVar) {
        this.q = context;
        fpaVar.getClass();
        this.g = fpaVar;
        this.a = aafoVar;
        this.d = azpq.e();
        View inflate = LayoutInflater.from(context).inflate(R.layout.channel_list_sub_menu, (ViewGroup) null);
        this.b = inflate;
        this.k = inflate.findViewById(R.id.gradient_overlay);
        this.i = inflate.findViewById(R.id.show_channels);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.channels_list);
        this.c = recyclerView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager();
        this.p = linearLayoutManager;
        linearLayoutManager.ab(0);
        recyclerView.ag(linearLayoutManager);
        ajsm ajsmVar = new ajsm();
        this.m = ajsmVar;
        ajsf a = ajsgVar.a(ajyiVar.get());
        a.h(ajsmVar);
        ajrc ajrcVar = new ajrc();
        this.n = ajrcVar;
        a.rZ(ajrcVar);
        elr elrVar = new elr();
        this.o = elrVar;
        a.rZ(elrVar);
        this.e = amon.a;
        a.rZ(new ajrt() { // from class: elo
            @Override // defpackage.ajrt
            public final void a(ajrs ajrsVar, ajqm ajqmVar, final int i) {
                final elt eltVar = elt.this;
                if (!eltVar.k()) {
                    return;
                }
                ajrsVar.f("CHANNEL_LIST_SUB_MENU_AVATAR_ON_CLICK_INTERCEPT_KEY", new ajrm() { // from class: eln
                    @Override // defpackage.ajrm
                    public final boolean h(View view) {
                        elt eltVar2 = elt.this;
                        int i2 = i;
                        if (!eltVar2.k()) {
                            return false;
                        }
                        if (!eltVar2.e.h() || ((Integer) eltVar2.e.c()).intValue() != i2) {
                            eltVar2.h(ampq.j(Integer.valueOf(i2)));
                            return false;
                        }
                        eltVar2.j();
                        return true;
                    }
                });
                ajrsVar.f("CHANNEL_LIST_SUB_MENU_AVATAR_CURRENT_STATE_KEY", elt.f(i, eltVar.e));
                ajrsVar.f("CHANNEL_LIST_SUB_MENU_AVATAR_STATE_CHANGED_OBSERVABLE_KEY", eltVar.d.V(new faz(i, 1)));
            }
        });
        recyclerView.ad(a);
        this.x = new elp(this);
        View findViewById = inflate.findViewById(R.id.channels_button);
        this.j = findViewById;
        gga a2 = ggbVar.a((TextView) findViewById);
        this.h = a2;
        a2.e(R.dimen.text_button_icon_padding);
        a2.f();
        this.l = inflate.findViewById(R.id.channels_navigation_layout);
        this.s = -1;
        this.r = -1;
    }

    public static eli f(int i, ampq ampqVar) {
        if (!ampqVar.h()) {
            return eli.DEFAULT;
        }
        if (((Integer) ampqVar.c()).intValue() == i) {
            return eli.SELECTED;
        }
        return eli.UNDERSTATED;
    }

    private static void m(View view, int i) {
        view.setPaddingRelative(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), i);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajsl
    public final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        int i;
        int i2;
        apst apstVar;
        final apsv apsvVar = (apsv) obj;
        this.f = apsvVar;
        apoj apojVar = null;
        this.t = null;
        this.n.a = ajrsVar.a;
        if (ajrsVar.c("sectionListController") instanceof akaf) {
            akaf akafVar = (akaf) ajrsVar.c("sectionListController");
            this.t = akafVar;
            this.o.a = new akag(akafVar);
        }
        apsu apsuVar = apsvVar.f;
        if (apsuVar == null) {
            apsuVar = apsu.a;
        }
        aopa mo52toBuilder = apsvVar.mo52toBuilder();
        for (int i3 = 0; i3 < apsvVar.e.size(); i3++) {
            if (((apsw) apsvVar.e.get(i3)).b == 48474525) {
                aopa mo52toBuilder2 = ((apsw) apsvVar.e.get(i3)).mo52toBuilder();
                apsw apswVar = (apsw) mo52toBuilder2.instance;
                if (apswVar.b == 48474525) {
                    apstVar = (apst) apswVar.c;
                } else {
                    apstVar = apst.a;
                }
                aopc aopcVar = (aopc) apstVar.mo52toBuilder();
                aopcVar.e(apsr.b, apsuVar);
                mo52toBuilder2.copyOnWrite();
                apsw apswVar2 = (apsw) mo52toBuilder2.instance;
                apst apstVar2 = (apst) aopcVar.mo39build();
                apstVar2.getClass();
                apswVar2.c = apstVar2;
                apswVar2.b = 48474525;
                mo52toBuilder.copyOnWrite();
                apsv apsvVar2 = (apsv) mo52toBuilder.instance;
                apsw apswVar3 = (apsw) mo52toBuilder2.mo39build();
                apswVar3.getClass();
                aopu aopuVar = apsvVar2.e;
                if (!aopuVar.c()) {
                    apsvVar2.e = aopi.mutableCopy(aopuVar);
                }
                apsvVar2.e.set(i3, apswVar3);
            }
        }
        apsv apsvVar3 = (apsv) mo52toBuilder.mo39build();
        this.m.clear();
        Object obj2 = null;
        for (apsw apswVar4 : apsvVar3.e) {
            if (apswVar4.b == 48474525) {
                apst apstVar3 = (apst) apswVar4.c;
                if (obj2 != null && obj2 != apst.class) {
                    this.m.add(new elk());
                }
                this.m.add(apstVar3);
                obj2 = apst.class;
            }
        }
        RecyclerView recyclerView = this.c;
        int g = apwt.g(apsvVar3.j);
        int i4 = -2;
        if (g == 0 || g != 3) {
            recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), recyclerView.getPaddingTop(), 0, recyclerView.getPaddingBottom());
            zgd.v(recyclerView, -1, -2);
            if (recyclerView.d() > 0) {
                recyclerView.ax();
            }
        } else {
            Resources resources = recyclerView.getResources();
            recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), recyclerView.getPaddingTop(), resources.getDimensionPixelOffset(R.dimen.channel_list_sub_menu_horizontal_margin), recyclerView.getPaddingBottom());
            zgd.t(recyclerView, zgd.b(zgd.s(-2, -2), zgd.g(17)), FrameLayout.LayoutParams.class);
            if (recyclerView.d() > 0) {
                recyclerView.ax();
            }
            DisplayMetrics displayMetrics = recyclerView.getContext().getResources().getDisplayMetrics();
            int b = recyclerView.m.b();
            int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.channel_list_sub_menu_min_item_space);
            int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.channel_list_sub_menu_max_item_space);
            int dimensionPixelOffset3 = resources.getDimensionPixelOffset(R.dimen.channel_list_sub_menu_larger_avatar_size);
            int dimensionPixelOffset4 = resources.getDimensionPixelOffset(R.dimen.channel_list_sub_menu_container_larger_width) - dimensionPixelOffset3;
            int min = Math.min(Math.max(((displayMetrics.widthPixels - (b * dimensionPixelOffset3)) / (b + 1)) - dimensionPixelOffset3, dimensionPixelOffset), dimensionPixelOffset2);
            int integer = resources.getInteger(R.integer.channel_list_sub_menu_horizontal_spacing_factor);
            recyclerView.aC(new elu(zew.i(displayMetrics, integer * (zew.n(displayMetrics, min + dimensionPixelOffset4) / integer)) - dimensionPixelOffset4));
        }
        if (k()) {
            this.b.setBackground(null);
            m(this.c, 0);
        } else {
            if (this.u == null) {
                this.v = this.q.getResources().getDimensionPixelSize(R.dimen.channel_list_sub_menu_bottom_separator_height);
                this.u = new frf(zhn.j(this.q, R.attr.ytSeparator).orElse(0), this.v);
            }
            this.b.setBackground(this.u);
            m(this.c, this.v);
        }
        apsu apsuVar2 = apsvVar.f;
        if (apsuVar2 == null) {
            apsuVar2 = apsu.a;
        }
        int h = apwt.h(apsuVar2.b);
        if (h == 0) {
            h = 1;
        }
        if (h == 4) {
            Resources resources2 = this.l.getResources();
            i2 = this.s;
            if (i2 == -1) {
                i2 = resources2.getDimensionPixelOffset(R.dimen.channel_list_sub_menu_container_larger_avatar_top_margin);
                this.s = i2;
            }
            int i5 = this.r;
            if (i5 == -1) {
                int dimensionPixelOffset5 = resources2.getDimensionPixelOffset(R.dimen.channel_list_sub_menu_larger_avatar_size);
                this.r = dimensionPixelOffset5;
                i4 = dimensionPixelOffset5;
            } else {
                i4 = i5;
            }
            i = 48;
        } else {
            i = 16;
            i2 = 0;
        }
        zgd.t(this.l, zgd.b(zgd.p(i2), zgd.h(i4), zgd.j(i)), LinearLayout.LayoutParams.class);
        int i6 = apsvVar.c;
        if (i6 != 3) {
            akbm akbmVar = this.h;
            if (i6 == 6 && (apojVar = ((apok) apsvVar.d).c) == null) {
                apojVar = apoj.a;
            }
            akbmVar.b(apojVar, ajrsVar.a);
            this.g.a(apsvVar, this.j);
            this.c.aG(this.x);
            this.k.setVisibility(8);
            this.i.setVisibility(8);
            return;
        }
        this.i.setVisibility(0);
        this.i.setOnClickListener(new View.OnClickListener() { // from class: elm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                apzg apzgVar;
                elt eltVar = elt.this;
                apsv apsvVar4 = apsvVar;
                aafo aafoVar = eltVar.a;
                if (apsvVar4.c == 3) {
                    apzgVar = (apzg) apsvVar4.d;
                } else {
                    apzgVar = apzg.a;
                }
                aafoVar.c(apzgVar, null);
            }
        });
        this.g.a(apsvVar, this.i);
        this.c.aE(this.x);
        i();
        this.h.b(null, ajrsVar.a);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((apsv) obj).g.I();
    }

    public final void h(ampq ampqVar) {
        this.e = ampqVar;
        this.d.c(elq.b(ampqVar));
        if (ampqVar.h()) {
            int intValue = ((Integer) ampqVar.c()).intValue();
            int computeHorizontalScrollOffset = this.c.computeHorizontalScrollOffset();
            yo i = this.c.i(intValue);
            if (i == null) {
                return;
            }
            int measuredWidth = i.a.getMeasuredWidth();
            this.c.getGlobalVisibleRect(new Rect());
            this.c.aj((lj.e(this.b) == 1 ? (this.c.computeHorizontalScrollRange() - ((intValue - 2) * measuredWidth)) - this.c.computeHorizontalScrollExtent() : (intValue - 2) * measuredWidth) - computeHorizontalScrollOffset, 0);
        }
    }

    public final void i() {
        zag.o(this.k, this.p.K() < this.m.size() + (-1));
    }

    public final boolean j() {
        apsv apsvVar = this.f;
        if (apsvVar == null || (apsvVar.b & 64) == 0 || !this.e.h() || this.t == null) {
            return false;
        }
        h(amon.a);
        HashMap k = amxp.k(1);
        k.put("sectionListController", this.t);
        aafo aafoVar = this.a;
        apzg apzgVar = this.f.i;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aafoVar.c(apzgVar, k);
        return true;
    }

    public final boolean k() {
        int i;
        apsv apsvVar = this.f;
        return (apsvVar == null || (apsvVar.b & 32) == 0 || (i = apwt.i(apsvVar.h)) == 0 || i != 2) ? false : true;
    }

    @Override // defpackage.ajsl
    protected final boolean l() {
        return true;
    }

    @Override // defpackage.ajzh
    public final akam pn() {
        throw null;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
