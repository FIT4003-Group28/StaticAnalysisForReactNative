package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.ScrollView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.PerksSectionRendererOuterClass;
/* compiled from: PG */
/* renamed from: xzu  reason: default package */
/* loaded from: classes4.dex */
public final class xzu {
    public final View a;
    public final ScrollView b;
    public final ImageView c;
    public final ImageView d;
    public final ImageView e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    private final ajxz l;
    private final ajmy m;
    private final ImageView n;

    public xzu(Context context, ajxz ajxzVar, ajmy ajmyVar, View view) {
        this.l = ajxzVar;
        this.m = ajmyVar;
        this.a = view.findViewById(R.id.header_container);
        this.n = (ImageView) view.findViewById(R.id.header_background);
        ScrollView scrollView = (ScrollView) view.findViewById(R.id.perks_scroll_view);
        this.b = scrollView;
        this.e = (ImageView) view.findViewById(R.id.membership_icon);
        this.c = (ImageView) view.findViewById(R.id.channel_thumbnail);
        this.d = (ImageView) view.findViewById(R.id.viewer_thumbnail);
        Resources resources = context.getResources();
        this.f = resources.getDimensionPixelSize(R.dimen.membership_offer_header_minimum_size);
        this.g = resources.getDimensionPixelSize(R.dimen.membership_offer_header_maximum_size);
        this.h = resources.getDimensionPixelSize(R.dimen.membership_offer_header_with_perks_avatars_minimum_size);
        this.i = resources.getDimensionPixelSize(R.dimen.membership_offer_header_with_perks_avatars_maximum_size);
        this.j = resources.getDimensionPixelSize(R.dimen.membership_offer_header_with_perks_offer_minimum_size);
        this.k = resources.getDimensionPixelSize(R.dimen.membership_offer_header_with_perks_offer_maximum_size);
        scrollView.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: xzt
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                xzu xzuVar = xzu.this;
                float min = 1.0f - Math.min(1.0f, xzuVar.b.getScrollY() / (xzuVar.g - xzuVar.f));
                xzu.b(xzuVar.a, xzuVar.f, xzuVar.g, min, false);
                xzu.b(xzuVar.d, xzuVar.h, xzuVar.i, min, true);
                xzu.b(xzuVar.c, xzuVar.h, xzuVar.i, min, true);
                xzu.b(xzuVar.e, xzuVar.j, xzuVar.k, min, true);
                float f = min - 0.5f;
                float max = Math.max(0.0f, f + f);
                xzuVar.d.setAlpha(max);
                xzuVar.c.setAlpha(max);
                xzuVar.e.setAlpha(max);
            }
        });
    }

    public static final void b(View view, float f, float f2, float f3, boolean z) {
        zfx h;
        int i = (int) (f + (f3 * (f2 - f)));
        if (z) {
            h = zgd.s(i, i);
        } else {
            h = zgd.h(i);
        }
        zgd.t(view, h, ViewGroup.LayoutParams.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void c(yak yakVar, aunb aunbVar) {
        if (!aunbVar.qn(PerksSectionRendererOuterClass.perksSectionRenderer)) {
            zag.o(yakVar.a, false);
            return;
        }
        yakVar.e((atvm) aunbVar.qm(PerksSectionRendererOuterClass.perksSectionRenderer));
        zag.o(yakVar.a, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(avhn avhnVar, avhn avhnVar2, avhn avhnVar3, arhs arhsVar) {
        arhr arhrVar;
        this.m.h(this.n, avhnVar);
        this.m.h(this.c, avhnVar2);
        this.m.h(this.d, avhnVar3);
        ajxz ajxzVar = this.l;
        if (arhsVar != null) {
            arhrVar = arhr.b(arhsVar.c);
            if (arhrVar == null) {
                arhrVar = arhr.UNKNOWN;
            }
        } else {
            arhrVar = arhr.UNKNOWN;
        }
        int a = ajxzVar.a(arhrVar);
        this.e.setImageResource(a);
        zag.o(this.e, a != 0);
    }
}
