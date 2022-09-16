package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
/* compiled from: PG */
/* renamed from: ygm  reason: default package */
/* loaded from: classes4.dex */
public final class ygm implements ajru {
    private final aafo a;
    private final View b;
    private final YouTubeTextView c;
    private final YouTubeTextView d;
    private final akbm e;
    private final YouTubeTextView f;
    private final akbm g;

    public ygm(Context context, aafo aafoVar, akbn akbnVar, ViewGroup viewGroup) {
        this.a = aafoVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.sponsorships_alert_layout, viewGroup, false);
        this.b = inflate;
        this.c = (YouTubeTextView) inflate.findViewById(R.id.alert_message_view);
        YouTubeTextView youTubeTextView = (YouTubeTextView) inflate.findViewById(R.id.action_button);
        this.d = youTubeTextView;
        this.e = akbnVar.a(youTubeTextView);
        YouTubeTextView youTubeTextView2 = (YouTubeTextView) inflate.findViewById(R.id.secondary_action_button);
        this.f = youTubeTextView2;
        this.g = akbnVar.a(youTubeTextView2);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        arag aragVar;
        apoj apojVar;
        auyc auycVar = (auyc) obj;
        acti actiVar = ajrsVar.a;
        YouTubeTextView youTubeTextView = this.c;
        apoj apojVar2 = null;
        if ((auycVar.b & 1) != 0) {
            aragVar = auycVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(youTubeTextView, aafv.a(aragVar, this.a, false));
        akbm akbmVar = this.e;
        aunb aunbVar = auycVar.d;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
            aunb aunbVar2 = auycVar.d;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            apojVar = (apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer);
        } else {
            apojVar = null;
        }
        akbmVar.b(apojVar, actiVar);
        akbm akbmVar2 = this.g;
        aunb aunbVar3 = auycVar.e;
        if (aunbVar3 == null) {
            aunbVar3 = aunb.a;
        }
        if (aunbVar3.qn(ButtonRendererOuterClass.buttonRenderer)) {
            aunb aunbVar4 = auycVar.e;
            if (aunbVar4 == null) {
                aunbVar4 = aunb.a;
            }
            apojVar2 = (apoj) aunbVar4.qm(ButtonRendererOuterClass.buttonRenderer);
        }
        akbmVar2.b(apojVar2, actiVar);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
