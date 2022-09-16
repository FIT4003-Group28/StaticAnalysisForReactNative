package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.player.overlay.ads.AdHighlightLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: kkd  reason: default package */
/* loaded from: classes3.dex */
public final class kkd implements ajru {
    private final AdHighlightLayout a;
    private final axnm b;
    private final ajhl c;
    private final acti d;

    public kkd(Context context, axnm axnmVar, ajhl ajhlVar, acti actiVar, ViewGroup viewGroup) {
        axnmVar.getClass();
        this.b = axnmVar;
        this.c = ajhlVar;
        actiVar.getClass();
        this.d = actiVar;
        this.a = (AdHighlightLayout) LayoutInflater.from(context).inflate(R.layout.fullscreen_engagement_companion_layout, viewGroup, false);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        arbh arbhVar = (arbh) obj;
        this.c.qZ(null);
        this.a.removeAllViews();
        View a = this.c.a();
        ViewGroup viewGroup = (ViewGroup) a.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(a);
        }
        int i = arbhVar.b;
        if ((i & 1) != 0) {
            if ((i & 2) == 0) {
                this.a.a(true);
            } else {
                AdHighlightLayout adHighlightLayout = this.a;
                int i2 = (int) arbhVar.d;
                int i3 = R.style.FullscreenEngagementMetadataHighlightsTwoColumn;
                if (i2 == 1) {
                    i3 = R.style.FullscreenEngagementMetadataHighlightsOneColumn;
                } else if (i2 != 2 && i2 == 3) {
                    i3 = R.style.FullscreenEngagementMetadataHighlightsThreeColumn;
                }
                adHighlightLayout.b(i3);
                this.a.a(false);
            }
            aunb aunbVar = arbhVar.c;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            aqtb aqtbVar = (aqtb) aunbVar.qm(ElementRendererOuterClass.elementRenderer);
            if (aqtbVar == null) {
                return;
            }
            ajrs ajrsVar2 = new ajrs();
            ajrsVar2.g(new HashMap());
            ajrsVar2.a(this.d);
            asjj asjjVar = ajrsVar.c;
            if (asjjVar != null) {
                ajrsVar2.c = asjjVar;
            }
            ajin ajinVar = (ajin) this.b.get();
            this.c.oK(ajrsVar2, ajhh.a(aqtbVar));
            this.a.addView(this.c.a());
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.c.qZ(ajsaVar);
    }
}
