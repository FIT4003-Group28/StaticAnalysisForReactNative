package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SponsorshipsRenderers;
/* compiled from: PG */
/* renamed from: yhi  reason: default package */
/* loaded from: classes4.dex */
public final class yhi implements ajru {
    public final yhd a;
    public final View b;
    public final YouTubeTextView c;
    public final YouTubeTextView d;
    private final Context e;
    private final aafo f;
    private final ajmy g;
    private final YouTubeTextView h;
    private final YouTubeTextView i;
    private final FlexboxLayout j;
    private final YouTubeTextView k;
    private final ViewGroup l;

    public yhi(Context context, aafo aafoVar, ajmy ajmyVar, yhe yheVar, ViewGroup viewGroup) {
        this.e = context;
        this.f = aafoVar;
        this.g = ajmyVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.sponsorships_perk_layout, viewGroup, false);
        this.b = inflate;
        this.a = yheVar.b((ViewGroup) inflate);
        YouTubeTextView youTubeTextView = (YouTubeTextView) inflate.findViewById(R.id.bullet_point_view);
        this.h = youTubeTextView;
        zag.m(youTubeTextView, "•");
        this.i = (YouTubeTextView) inflate.findViewById(R.id.title_view);
        this.c = (YouTubeTextView) inflate.findViewById(R.id.description_view);
        this.d = (YouTubeTextView) inflate.findViewById(R.id.fulfillment_instructions_view);
        this.j = (FlexboxLayout) inflate.findViewById(R.id.images_layout);
        this.k = (YouTubeTextView) inflate.findViewById(R.id.image_description_view);
        this.l = (ViewGroup) inflate.findViewById(R.id.loyalty_badges);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    public final void d(auyr auyrVar) {
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        arag aragVar4;
        zag.o(this.h, 1 == (auyrVar.b & 1));
        YouTubeTextView youTubeTextView = this.i;
        if ((auyrVar.b & 1) != 0) {
            aragVar = auyrVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(youTubeTextView, ajgl.b(aragVar));
        YouTubeTextView youTubeTextView2 = this.c;
        if ((auyrVar.b & 2) != 0) {
            aragVar2 = auyrVar.d;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        zag.m(youTubeTextView2, ajgl.b(aragVar2));
        YouTubeTextView youTubeTextView3 = this.d;
        if ((auyrVar.b & 4) != 0) {
            aragVar3 = auyrVar.e;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        } else {
            aragVar3 = null;
        }
        zag.m(youTubeTextView3, aafv.a(aragVar3, this.f, false));
        if ((auyrVar.b & 16) != 0) {
            aunb aunbVar = auyrVar.h;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            auym auymVar = (auym) ajjh.l(aunbVar, SponsorshipsRenderers.sponsorshipsLoyaltyBadgesRenderer);
            if (auymVar != null) {
                this.a.e(auymVar);
                this.l.addView(this.a.a);
                zag.o(this.j, false);
            }
        }
        this.j.removeAllViews();
        if (auyrVar.f.size() != 0) {
            this.j.addView(this.k);
            YouTubeTextView youTubeTextView4 = this.k;
            if ((auyrVar.b & 8) != 0) {
                aragVar4 = auyrVar.g;
                if (aragVar4 == null) {
                    aragVar4 = arag.a;
                }
            } else {
                aragVar4 = null;
            }
            zag.m(youTubeTextView4, ajgl.b(aragVar4));
            int dimensionPixelSize = this.e.getResources().getDimensionPixelSize(R.dimen.perk_images_padding);
            for (avhn avhnVar : auyrVar.f) {
                ImageView imageView = new ImageView(this.e);
                imageView.setLayoutParams(new LinearLayout.LayoutParams(this.e.getResources().getDimensionPixelSize(R.dimen.perk_images_width), this.e.getResources().getDimensionPixelSize(R.dimen.perk_images_height)));
                imageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
                this.j.addView(imageView);
                this.g.h(imageView, avhnVar);
                if (avhnVar != null && (avhnVar.b & 4) != 0) {
                    aovs aovsVar = avhnVar.d;
                    if (aovsVar == null) {
                        aovsVar = aovs.a;
                    }
                    if ((aovsVar.b & 1) != 0) {
                        aovs aovsVar2 = avhnVar.d;
                        if (aovsVar2 == null) {
                            aovsVar2 = aovs.a;
                        }
                        aovr aovrVar = aovsVar2.c;
                        if (aovrVar == null) {
                            aovrVar = aovr.a;
                        }
                        imageView.setContentDescription(aovrVar.c);
                    }
                }
                imageView.setContentDescription(null);
            }
        }
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        d((auyr) obj);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
