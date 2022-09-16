package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.player.overlay.fullscreenengagement.layout.MetadataHighlightsColumnLinearLayout;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.SubscribeButtonRendererOuterClass;
/* compiled from: PG */
/* renamed from: kli  reason: default package */
/* loaded from: classes3.dex */
public final class kli implements ajru, fmf {
    public apzg a;
    private final Context b;
    private final acti c;
    private final ajmy d;
    private final View e;
    private final ImageView f;
    private final TextView g;
    private final TextView h;
    private final TextView i;
    private final fmg j;
    private final MetadataHighlightsColumnLinearLayout k;

    public kli(Context context, ViewGroup viewGroup, acti actiVar, ajmy ajmyVar, final aafo aafoVar, fmh fmhVar, fnz fnzVar) {
        this.b = context;
        actiVar.getClass();
        this.c = actiVar;
        this.d = ajmyVar;
        this.a = null;
        View inflate = LayoutInflater.from(context).inflate(R.layout.metadata_highlights_channel_container, viewGroup, false);
        this.e = inflate;
        View findViewById = inflate.findViewById(R.id.channel_container);
        if (findViewById instanceof MetadataHighlightsColumnLinearLayout) {
            this.k = (MetadataHighlightsColumnLinearLayout) findViewById;
        } else {
            this.k = null;
        }
        this.f = (ImageView) inflate.findViewById(R.id.channel_avatar);
        this.g = (TextView) inflate.findViewById(R.id.channel_title);
        this.h = (TextView) inflate.findViewById(R.id.channel_subscribers);
        TextView textView = (TextView) inflate.findViewById(R.id.subscribe_button);
        this.i = textView;
        fmg a = fmhVar.a(textView, fnzVar.a(inflate.findViewById(R.id.subscription_notification_view)));
        this.j = a;
        a.k(3);
        inflate.setOnClickListener(new View.OnClickListener() { // from class: klg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kli kliVar = kli.this;
                aafo aafoVar2 = aafoVar;
                apzg apzgVar = kliVar.a;
                if (apzgVar != null) {
                    aafoVar2.c(apzgVar, null);
                }
            }
        });
    }

    private final void d(boolean z) {
        if (z) {
            this.i.setBackgroundResource(R.drawable.fullscreen_engagement_subscribe_button_background_subscribed);
        } else {
            this.i.setBackgroundResource(R.drawable.fullscreen_engagement_subscribe_button_background);
        }
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.e;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        apzg apzgVar;
        arag aragVar;
        arag aragVar2;
        arbl arblVar = (arbl) obj;
        this.j.c(this);
        boolean z = true;
        if (this.k != null) {
            this.k.b(((Integer) ajrsVar.c("ITEM_COUNT")).intValue() > 1 ? R.style.FullscreenEngagementMetadataHighlightsTwoColumn : R.style.FullscreenEngagementMetadataHighlightsFullWidth);
        }
        arag aragVar3 = null;
        this.c.u(new acte(arblVar.h), null);
        if ((arblVar.b & 8) != 0) {
            apzgVar = arblVar.f;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        this.a = apzgVar;
        TextView textView = this.g;
        if ((arblVar.b & 2) != 0) {
            aragVar = arblVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        TextView textView2 = this.h;
        if ((arblVar.b & 4) != 0) {
            aragVar2 = arblVar.e;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        zag.m(textView2, ajgl.b(aragVar2));
        avhn avhnVar = arblVar.c;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        if (avhnVar.c.size() > 0) {
            ajmy ajmyVar = this.d;
            ImageView imageView = this.f;
            avhn avhnVar2 = arblVar.c;
            if (avhnVar2 == null) {
                avhnVar2 = avhn.a;
            }
            ajmyVar.h(imageView, avhnVar2);
        } else {
            this.d.e(this.f);
            this.f.setImageResource(2131232143);
        }
        ImageView imageView2 = this.f;
        if ((arblVar.b & 8) == 0) {
            z = false;
        }
        imageView2.setEnabled(z);
        this.j.i(null, this.c);
        aunb aunbVar = arblVar.g;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (!aunbVar.qn(SubscribeButtonRendererOuterClass.subscribeButtonRenderer)) {
            return;
        }
        aunb aunbVar2 = arblVar.g;
        if (aunbVar2 == null) {
            aunbVar2 = aunb.a;
        }
        avaq avaqVar = (avaq) aunbVar2.qm(SubscribeButtonRendererOuterClass.subscribeButtonRenderer);
        if (!avaqVar.n) {
            return;
        }
        aopa mo52toBuilder = avaqVar.mo52toBuilder();
        Context context = this.b;
        if ((arblVar.b & 2) != 0 && (aragVar3 = arblVar.d) == null) {
            aragVar3 = arag.a;
        }
        fyv.d(context, mo52toBuilder, ajgl.b(aragVar3));
        avaq avaqVar2 = (avaq) mo52toBuilder.mo39build();
        this.j.i(avaqVar2, this.c);
        d(avaqVar2.l);
    }

    @Override // defpackage.fmf
    public final void oc(boolean z, boolean z2) {
        d(z);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.j.e.remove(this);
        this.j.d();
    }
}
