package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: yhc  reason: default package */
/* loaded from: classes4.dex */
public final class yhc implements ajru {
    public final View a;
    private final Context b;
    private final aafo c;
    private final ajmy d;
    private final YouTubeTextView e;
    private final ImageView f;

    public yhc(Context context, aafo aafoVar, ajmy ajmyVar, ViewGroup viewGroup) {
        this.b = context;
        this.c = aafoVar;
        this.d = ajmyVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.sponsorships_loyalty_badge_layout, viewGroup, false);
        this.a = inflate;
        this.e = (YouTubeTextView) inflate.findViewById(R.id.title);
        this.f = (ImageView) inflate.findViewById(R.id.icon);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    public final void d(int i) {
        zag.o(this.a, true);
        this.a.setBackground(null);
        this.a.setAlpha(1.0f);
        if (i == 1) {
            GradientDrawable gradientDrawable = (GradientDrawable) this.b.getResources().getDrawable(R.drawable.loyalty_badge_border);
            gradientDrawable.setColor(zhn.j(this.b, R.attr.ytGeneralBackgroundA).orElse(0));
            gradientDrawable.setStroke(1, zhn.j(this.b, R.attr.ytGeneralBackgroundC).orElse(0));
            this.a.setBackground(gradientDrawable);
        } else if (i == 2) {
            this.a.setAlpha(0.8f);
        } else if (i != 3) {
        } else {
            zag.o(this.a, false);
        }
    }

    public final void e(auyl auylVar) {
        arag aragVar;
        YouTubeTextView youTubeTextView = this.e;
        if ((auylVar.b & 2) != 0) {
            aragVar = auylVar.d;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(youTubeTextView, aafv.a(aragVar, this.c, false));
        ajmy ajmyVar = this.d;
        ImageView imageView = this.f;
        avhn avhnVar = auylVar.c;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        ajmyVar.h(imageView, avhnVar);
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        e((auyl) obj);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
