package defpackage;

import android.view.View;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: adse  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class adse implements zdt {
    public final /* synthetic */ adsg a;
    private final /* synthetic */ int b;

    public /* synthetic */ adse(adsg adsgVar) {
        this.a = adsgVar;
    }

    public /* synthetic */ adse(adsg adsgVar, int i) {
        this.b = i;
        this.a = adsgVar;
    }

    @Override // defpackage.zdt
    public final void a(Object obj) {
        ankt b;
        ankt anktVar;
        ankt anktVar2;
        if (this.b != 0) {
            adsg adsgVar = this.a;
            Boolean bool = (Boolean) obj;
            if (bool != null && bool.booleanValue()) {
                return;
            }
            YouTubeTextView youTubeTextView = new YouTubeTextView(adsgVar.l);
            youTubeTextView.setText(R.string.mdx_smart_remote_cast_icon_tip);
            youTubeTextView.setTextSize(2, adsgVar.l.getResources().getDimension(R.dimen.mdx_smart_remote_tooltip_text_size));
            youTubeTextView.setWidth(adsgVar.l.getResources().getDimensionPixelSize(R.dimen.mdx_smart_remote_tooltip_width));
            youTubeTextView.setTextColor(adsgVar.l.getResources().getColor(R.color.yt_white2));
            final akgc akgcVar = new akgc(youTubeTextView, adsgVar.r, 2, 2);
            akgcVar.e(new View.OnClickListener() { // from class: adsd
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    akgc akgcVar2 = akgc.this;
                    int i = adsg.E;
                    akgcVar2.b(1);
                }
            });
            adsgVar.r.getViewTreeObserver().addOnGlobalLayoutListener(new adsf(adsgVar, akgcVar));
            dp dpVar = adsgVar.a;
            if (adsgVar.m()) {
                anktVar2 = ((vne) adsgVar.i.get()).b(adch.t, anjk.a);
            } else {
                adsgVar.g.edit().putBoolean("MDx.SmartRemote.isDisconnectTipAlreadyShown", true).apply();
                anktVar2 = ankq.a;
            }
            ylx.n(dpVar, anktVar2, aclb.f, ylx.b);
            return;
        }
        adsg adsgVar2 = this.a;
        Boolean bool2 = (Boolean) obj;
        boolean booleanValue = bool2 == null ? false : bool2.booleanValue();
        if (!booleanValue) {
            adsgVar2.f();
            dp dpVar2 = adsgVar2.a;
            if (adsgVar2.m()) {
                anktVar = ((vne) adsgVar2.i.get()).b(adch.s, anjk.a);
            } else {
                adsgVar2.g.edit().putBoolean("MDx.SmartRemote.isPrivacyDialogShown", true).apply();
                anktVar = ankq.a;
            }
            ylx.n(dpVar2, anktVar, aclb.g, ylx.b);
        }
        int i = adsgVar2.D;
        if (i != 4) {
            if (i != 3) {
                return;
            }
            if (!booleanValue) {
                adsgVar2.n(4, false, false);
            } else {
                adsgVar2.h();
            }
        } else if (adsgVar2.y) {
        } else {
            dp dpVar3 = adsgVar2.a;
            if (adsgVar2.m()) {
                b = ylx.b(adsgVar2.a, ((vne) adsgVar2.i.get()).a(), adch.q);
            } else {
                b = ylx.b(adsgVar2.a, anlz.q(Boolean.valueOf(adsgVar2.g.getBoolean("MDx.SmartRemote.isDisconnectTipAlreadyShown", false))), adrz.a);
            }
            ylx.n(dpVar3, b, aclb.d, new adse(adsgVar2, 1));
        }
    }
}
