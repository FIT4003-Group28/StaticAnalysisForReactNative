package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import com.google.protos.youtube.api.innertube.SponsorshipsRenderers;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: yhn  reason: default package */
/* loaded from: classes4.dex */
public final class yhn implements ajru {
    public final View a;
    private final aafo b;
    private final yhk c;
    private final YouTubeTextView d;
    private final YouTubeTextView e;
    private final akbm f;
    private final YouTubeTextView g;
    private final YouTubeTextView h;
    private final FrameLayout i;
    private final FrameLayout j;
    private final YouTubeTextView k;
    private final YouTubeTextView l;
    private final ygv m;
    private final YouTubeTextView n;
    private final View o;

    public yhn(Context context, aafo aafoVar, akbn akbnVar, yhl yhlVar, ygw ygwVar, ViewGroup viewGroup) {
        this.b = aafoVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.sponsorships_tier_layout, viewGroup, false);
        this.a = inflate;
        this.d = (YouTubeTextView) inflate.findViewById(R.id.title_view);
        this.n = (YouTubeTextView) inflate.findViewById(R.id.above_purchase_button_text_view);
        YouTubeTextView youTubeTextView = (YouTubeTextView) inflate.findViewById(R.id.purchase_button);
        this.e = youTubeTextView;
        this.f = akbnVar.a(youTubeTextView);
        this.g = (YouTubeTextView) inflate.findViewById(R.id.disclaimer_view);
        this.h = (YouTubeTextView) inflate.findViewById(R.id.bottom_disclaimer);
        FrameLayout frameLayout = (FrameLayout) inflate.findViewById(R.id.expandable_message_view);
        this.i = frameLayout;
        ygv b = ygwVar.b(frameLayout);
        this.m = b;
        frameLayout.addView(b.a);
        FrameLayout frameLayout2 = (FrameLayout) inflate.findViewById(R.id.perks_view);
        this.j = frameLayout2;
        yhk b2 = yhlVar.b(frameLayout2);
        this.c = b2;
        frameLayout2.addView(b2.a);
        YouTubeTextView youTubeTextView2 = (YouTubeTextView) inflate.findViewById(R.id.toggle_expand);
        this.k = youTubeTextView2;
        youTubeTextView2.setOnClickListener(new yhm(this, 1));
        YouTubeTextView youTubeTextView3 = (YouTubeTextView) inflate.findViewById(R.id.toggle_collapse);
        this.l = youTubeTextView3;
        youTubeTextView3.setOnClickListener(new yhm(this));
        this.o = inflate.findViewById(R.id.bottom_border);
        Drawable a = akf.a(context, 2131232372);
        yzh.f(a, zhn.f(context, 16842907), PorterDuff.Mode.SRC_ATOP);
        Drawable a2 = akf.a(context, 2131232375);
        yzh.f(a2, zhn.f(context, 16842907), PorterDuff.Mode.SRC_ATOP);
        youTubeTextView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, a, (Drawable) null);
        youTubeTextView3.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, a2, (Drawable) null);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajru
    /* renamed from: d */
    public final void oK(ajrs ajrsVar, auyv auyvVar) {
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        arag aragVar4;
        arag aragVar5;
        acti actiVar = ajrsVar.a;
        YouTubeTextView youTubeTextView = this.n;
        arag aragVar6 = null;
        if ((auyvVar.b & 1024) != 0) {
            aragVar = auyvVar.k;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(youTubeTextView, ajgl.b(aragVar));
        YouTubeTextView youTubeTextView2 = this.d;
        boolean z = true;
        if ((auyvVar.b & 1) != 0) {
            aragVar2 = auyvVar.c;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        zag.m(youTubeTextView2, ajgl.b(aragVar2));
        akbm akbmVar = this.f;
        aunb aunbVar = auyvVar.j;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        akbmVar.b((apoj) ajjh.l(aunbVar, ButtonRendererOuterClass.buttonRenderer), actiVar);
        YouTubeTextView youTubeTextView3 = this.g;
        if ((auyvVar.b & 4) != 0) {
            aragVar3 = auyvVar.d;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        } else {
            aragVar3 = null;
        }
        zag.m(youTubeTextView3, aafv.a(aragVar3, this.b, false));
        YouTubeTextView youTubeTextView4 = this.h;
        if ((auyvVar.b & 8) != 0) {
            aragVar4 = auyvVar.e;
            if (aragVar4 == null) {
                aragVar4 = arag.a;
            }
        } else {
            aragVar4 = null;
        }
        zag.m(youTubeTextView4, aafv.a(aragVar4, this.b, false));
        aunb aunbVar2 = auyvVar.f;
        if (aunbVar2 == null) {
            aunbVar2 = aunb.a;
        }
        auyf auyfVar = (auyf) ajjh.l(aunbVar2, SponsorshipsRenderers.sponsorshipsExpandableMessageRenderer);
        FrameLayout frameLayout = this.i;
        if (auyfVar == null) {
            z = false;
        }
        zag.o(frameLayout, z);
        if (auyfVar != null) {
            this.m.oK(ajrsVar, auyfVar);
        }
        aunb aunbVar3 = auyvVar.g;
        if (aunbVar3 == null) {
            aunbVar3 = aunb.a;
        }
        this.c.oK(ajrsVar, (auys) ajjh.l(aunbVar3, SponsorshipsRenderers.sponsorshipsPerksRenderer));
        if ((auyvVar.b & 64) != 0) {
            aragVar5 = auyvVar.h;
            if (aragVar5 == null) {
                aragVar5 = arag.a;
            }
        } else {
            aragVar5 = null;
        }
        Spanned b = ajgl.b(aragVar5);
        zag.n(this.k, b, 8);
        YouTubeTextView youTubeTextView5 = this.l;
        if ((auyvVar.b & 128) != 0 && (aragVar6 = auyvVar.i) == null) {
            aragVar6 = arag.a;
        }
        zag.n(youTubeTextView5, ajgl.b(aragVar6), 8);
        e(TextUtils.isEmpty(b));
        zag.o(this.o, auyvVar.l);
    }

    public final void e(boolean z) {
        ArrayList arrayList = this.c.b;
        int size = arrayList.size();
        boolean z2 = false;
        int i = 0;
        while (true) {
            boolean z3 = true;
            if (i >= size) {
                break;
            }
            yhi yhiVar = (yhi) arrayList.get(i);
            YouTubeTextView youTubeTextView = yhiVar.c;
            zag.o(youTubeTextView, z && !TextUtils.isEmpty(youTubeTextView.getText()));
            YouTubeTextView youTubeTextView2 = yhiVar.d;
            if (!z || TextUtils.isEmpty(youTubeTextView2.getText())) {
                z3 = false;
            }
            zag.o(youTubeTextView2, z3);
            yhiVar.a.d(z);
            i++;
        }
        YouTubeTextView youTubeTextView3 = this.k;
        zag.o(youTubeTextView3, !z && !TextUtils.isEmpty(youTubeTextView3.getText()));
        YouTubeTextView youTubeTextView4 = this.l;
        if (z && !TextUtils.isEmpty(youTubeTextView4.getText())) {
            z2 = true;
        }
        zag.o(youTubeTextView4, z2);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
