package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SponsorshipsRenderers;
/* compiled from: PG */
/* renamed from: yhb  reason: default package */
/* loaded from: classes4.dex */
public final class yhb implements ajru {
    public final View a;
    public final ViewGroup b;
    private final aafo c;
    private final Context d;
    private final ajmy e;
    private final YouTubeTextView f;
    private final YouTubeTextView g;
    private final YouTubeTextView h;
    private final ImageView i;
    private final ImageView j;

    public yhb(Context context, aafo aafoVar, ajmy ajmyVar, ViewGroup viewGroup) {
        this.d = context;
        this.c = aafoVar;
        this.e = ajmyVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.sponsorships_list_tile_layout, viewGroup, false);
        this.a = inflate;
        this.f = (YouTubeTextView) inflate.findViewById(R.id.title);
        this.g = (YouTubeTextView) inflate.findViewById(R.id.subtitle);
        this.h = (YouTubeTextView) inflate.findViewById(R.id.detail);
        this.i = (ImageView) inflate.findViewById(R.id.icon);
        this.j = (ImageView) inflate.findViewById(R.id.expand_icon);
        this.b = (ViewGroup) inflate.findViewById(R.id.expanded_content);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajru
    /* renamed from: d */
    public final void oK(ajrs ajrsVar, auyk auykVar) {
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        avhn avhnVar;
        YouTubeTextView youTubeTextView = this.f;
        ColorDrawable colorDrawable = null;
        if ((auykVar.b & 8) != 0) {
            aragVar = auykVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(youTubeTextView, aafv.a(aragVar, this.c, false));
        YouTubeTextView youTubeTextView2 = this.g;
        if ((auykVar.b & 16) != 0) {
            aragVar2 = auykVar.e;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        zag.m(youTubeTextView2, aafv.a(aragVar2, this.c, false));
        YouTubeTextView youTubeTextView3 = this.h;
        if ((auykVar.b & 32) != 0) {
            aragVar3 = auykVar.f;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        } else {
            aragVar3 = null;
        }
        zag.m(youTubeTextView3, aafv.a(aragVar3, this.c, false));
        ajmy ajmyVar = this.e;
        ImageView imageView = this.i;
        if ((auykVar.b & 1) != 0) {
            avhnVar = auykVar.c;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
        } else {
            avhnVar = null;
        }
        ajmyVar.h(imageView, avhnVar);
        boolean z = auykVar.g.size() > 0;
        zag.o(this.j, z);
        this.a.setOnClickListener(z ? new View.OnClickListener() { // from class: yha
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yhb yhbVar = yhb.this;
                yhbVar.e(yhbVar.b.getVisibility() != 0);
            }
        } : null);
        if (auykVar.h) {
            colorDrawable = new ColorDrawable(zhn.d(this.a.getContext(), R.attr.ytGeneralBackgroundB));
        }
        if (z) {
            zag.l(this.a, colorDrawable, 0);
        } else {
            this.a.setBackground(colorDrawable);
        }
        this.b.removeAllViews();
        for (aunb aunbVar : auykVar.g) {
            if (aunbVar.qn(SponsorshipsRenderers.sponsorshipsListTileRenderer)) {
                yhb yhbVar = new yhb(this.d, this.c, this.e, this.b);
                yhbVar.oK(ajrsVar, (auyk) aunbVar.qm(SponsorshipsRenderers.sponsorshipsListTileRenderer));
                this.b.addView(yhbVar.a);
            } else if (aunbVar.qn(SponsorshipsRenderers.sponsorshipsLoyaltyBadgesRenderer)) {
                yhd yhdVar = new yhd(this.d, this.c, this.e, this.b);
                yhdVar.e((auym) aunbVar.qm(SponsorshipsRenderers.sponsorshipsLoyaltyBadgesRenderer));
                yhdVar.d(true);
                ViewGroup viewGroup = yhdVar.a;
                viewGroup.setPadding(zew.i(this.a.getResources().getDisplayMetrics(), 48), 0, 0, 0);
                this.b.addView(viewGroup);
            }
        }
        e(false);
    }

    public final void e(boolean z) {
        zag.o(this.b, z);
        this.j.setImageResource(true != z ? 2131232550 : 2131232559);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
