package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.PerksSectionRendererOuterClass;
/* compiled from: PG */
/* renamed from: yah  reason: default package */
/* loaded from: classes4.dex */
public final class yah implements ajru {
    public final LinearLayout a;
    private final ajmy b;
    private final ajgj c;
    private final YouTubeTextView d;
    private final YouTubeTextView e;
    private final YouTubeTextView f;
    private final ImageView g;

    public yah(Context context, ajmy ajmyVar, aafo aafoVar, ViewGroup viewGroup) {
        this.b = ajmyVar;
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.ypc_perk_item_v2_layout, viewGroup, false);
        this.a = linearLayout;
        ajgi a = ajgj.a();
        a.a = context;
        a.c = new ajve(aafoVar);
        this.c = a.a();
        this.e = (YouTubeTextView) linearLayout.findViewById(R.id.perk_public_description);
        this.f = (YouTubeTextView) linearLayout.findViewById(R.id.perk_sponsors_description);
        this.d = (YouTubeTextView) linearLayout.findViewById(R.id.perk_title);
        this.g = (ImageView) linearLayout.findViewById(R.id.sponsors_only_icon);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    public final void d(atvl atvlVar) {
        arag aragVar;
        arag aragVar2;
        YouTubeTextView youTubeTextView = this.d;
        arag aragVar3 = null;
        if ((atvlVar.b & 1) != 0) {
            aragVar = atvlVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        yak.d(youTubeTextView, ajgl.d(aragVar, this.c));
        int i = atvlVar.b & 2;
        if (i == 0) {
            this.e.setVisibility(8);
        } else {
            YouTubeTextView youTubeTextView2 = this.e;
            if (i != 0) {
                aragVar2 = atvlVar.d;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
            } else {
                aragVar2 = null;
            }
            yak.d(youTubeTextView2, ajgl.d(aragVar2, this.c));
        }
        aunb aunbVar = atvlVar.e;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(PerksSectionRendererOuterClass.sponsorsDescriptionRenderer)) {
            aunb aunbVar2 = atvlVar.e;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            atvn atvnVar = (atvn) aunbVar2.qm(PerksSectionRendererOuterClass.sponsorsDescriptionRenderer);
            YouTubeTextView youTubeTextView3 = this.f;
            if ((atvnVar.b & 2) != 0 && (aragVar3 = atvnVar.d) == null) {
                aragVar3 = arag.a;
            }
            yak.d(youTubeTextView3, ajgl.d(aragVar3, this.c));
            if ((atvnVar.b & 1) == 0) {
                return;
            }
            ajmy ajmyVar = this.b;
            ImageView imageView = this.g;
            avhn avhnVar = atvnVar.c;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            ajmyVar.h(imageView, avhnVar);
            return;
        }
        this.g.setVisibility(8);
        this.f.setVisibility(8);
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        d((atvl) obj);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
