package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.ads.player.ui.BrandInteractionView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
/* compiled from: PG */
/* renamed from: xid  reason: default package */
/* loaded from: classes4.dex */
public final class xid extends xhz implements View.OnClickListener {
    public xig a;
    public boolean f;
    public boolean g;
    private final Context h;
    private final aafo i;
    private final acti j;
    private boolean k;
    private xht l;
    private xht m;
    private apos n;
    private apos o;

    public xid(Context context, aafo aafoVar, acti actiVar) {
        super(xhc.b().a());
        this.h = context;
        aafoVar.getClass();
        this.i = aafoVar;
        actiVar.getClass();
        this.j = actiVar;
    }

    public static final boolean g(boolean z, boolean z2) {
        return !z && !z2;
    }

    private final void h(apnr apnrVar) {
        this.j.n(new acte(apnrVar.h));
        if (apnrVar.e.size() != 0) {
            amup k = amup.k("com.google.android.libraries.youtube.innertube.endpoint.tag", apnrVar);
            for (apzg apzgVar : apnrVar.e) {
                this.i.c(apzgVar, k);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ImageButton a() {
        return ((BrandInteractionView) this.c).c;
    }

    @Override // defpackage.xhz
    public final /* bridge */ /* synthetic */ void b(Object obj, boolean z) {
        apos aposVar;
        apos aposVar2;
        xht xhtVar;
        xhc xhcVar = (xhc) obj;
        apnr apnrVar = xhcVar.f;
        if (apnrVar == null) {
            return;
        }
        if (xhcVar.b) {
            if (!this.k) {
                this.k = true;
                BrandInteractionView brandInteractionView = (BrandInteractionView) this.c;
                Context context = this.h;
                boolean z2 = xhcVar.e;
                boolean z3 = xhcVar.c;
                boolean z4 = xhcVar.d;
                LayoutInflater.from(context).inflate(R.layout.brand_interaction, (ViewGroup) brandInteractionView, true);
                brandInteractionView.setOrientation(0);
                brandInteractionView.c = (ImageButton) brandInteractionView.findViewById(R.id.brand_interaction_thumbs_down);
                brandInteractionView.b = (ImageButton) brandInteractionView.findViewById(R.id.brand_interaction_thumbs_up);
                brandInteractionView.d = (LinearLayout) brandInteractionView.findViewById(R.id.brand_interaction_container);
                brandInteractionView.a(z3, z4, z2);
                xht xhtVar2 = new xht(f(), this.i);
                this.l = xhtVar2;
                xhtVar2.a = new xic(this, 1);
                xht xhtVar3 = new xht(a(), this.i);
                this.m = xhtVar3;
                xhtVar3.a = new xic(this);
                h(apnrVar);
            } else if (!((xhc) this.b).b) {
                BrandInteractionView brandInteractionView2 = (BrandInteractionView) this.c;
                Context context2 = this.h;
                brandInteractionView2.a(xhcVar.c, xhcVar.d, xhcVar.e);
                ln lnVar = brandInteractionView2.e;
                if (lnVar != null) {
                    lnVar.a();
                    brandInteractionView2.e = null;
                }
                Resources resources = context2.getResources();
                brandInteractionView2.b.setAlpha(zag.b(resources, R.dimen.low_opacity));
                brandInteractionView2.c.setAlpha(zag.b(resources, R.dimen.low_opacity));
                brandInteractionView2.d.setAlpha(zag.b(resources, R.dimen.full_opacity));
                brandInteractionView2.d.setBackgroundColor(ake.d(context2, R.color.brand_interaction_background_color));
                brandInteractionView2.d.setVisibility(0);
                h(apnrVar);
            }
        }
        if (((xhc) this.b).c && !xhcVar.c) {
            ((BrandInteractionView) this.c).a(false, xhcVar.d, xhcVar.e);
        }
        boolean z5 = ((xhc) this.b).e;
        boolean z6 = xhcVar.e;
        if (z5 != z6) {
            BrandInteractionView brandInteractionView3 = (BrandInteractionView) this.c;
            boolean z7 = xhcVar.c;
            boolean z8 = xhcVar.d;
            ln lnVar2 = brandInteractionView3.e;
            if (lnVar2 != null) {
                lnVar2.a();
                brandInteractionView3.e = null;
            }
            brandInteractionView3.a(z7, z8, z6);
        }
        aunb aunbVar = apnrVar.f;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(ButtonRendererOuterClass.toggleButtonRenderer)) {
            aunb aunbVar2 = apnrVar.f;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            aposVar = (apos) aunbVar2.qm(ButtonRendererOuterClass.toggleButtonRenderer);
        } else {
            aposVar = null;
        }
        aunb aunbVar3 = apnrVar.g;
        if (aunbVar3 == null) {
            aunbVar3 = aunb.a;
        }
        if (aunbVar3.qn(ButtonRendererOuterClass.toggleButtonRenderer)) {
            aunb aunbVar4 = apnrVar.g;
            if (aunbVar4 == null) {
                aunbVar4 = aunb.a;
            }
            aposVar2 = (apos) aunbVar4.qm(ButtonRendererOuterClass.toggleButtonRenderer);
        } else {
            aposVar2 = null;
        }
        if (this.l != null && aposVar != null && !aposVar.equals(this.n)) {
            this.n = aposVar;
            this.l.a(new xef(aposVar));
        }
        if (this.m != null && aposVar2 != null && !aposVar2.equals(this.o)) {
            this.o = aposVar2;
            this.m.a(new xef(aposVar2));
        }
        boolean z9 = xhcVar.a;
        this.f = z9;
        int i = 8;
        if (z && g(z9, this.g)) {
            i = 0;
        }
        ((BrandInteractionView) this.c).setVisibility(i);
        if (this.l == null || (xhtVar = this.m) == null) {
            return;
        }
        int i2 = xhcVar.g;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0) {
            xhtVar.b(false);
            this.l.b(false);
        } else if (i3 == 1) {
            xhtVar.b(false);
            this.l.b(true);
        } else if (i3 != 2) {
        } else {
            xhtVar.b(true);
            this.l.b(false);
        }
    }

    @Override // defpackage.xhz
    public final void d() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ImageButton f() {
        return ((BrandInteractionView) this.c).b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        apnr apnrVar = ((xhc) this.b).f;
        if (apnrVar != null && (apnrVar.b & 65536) != 0) {
            this.j.H(3, new acte(apnrVar.h.I()), null);
        }
        BrandInteractionView brandInteractionView = (BrandInteractionView) this.c;
        Context context = this.h;
        boolean z = ((xhc) this.b).e;
        brandInteractionView.d.setBackgroundColor(ake.d(context, R.color.brand_interaction_selected_background_color));
        view.setAlpha(zag.b(context.getResources(), R.dimen.full_opacity));
        ln q = lj.q(brandInteractionView.d);
        q.c(0.0f);
        q.d(brandInteractionView.a);
        q.g(500L);
        q.f(new xhp(brandInteractionView));
        brandInteractionView.e = q;
    }
}
