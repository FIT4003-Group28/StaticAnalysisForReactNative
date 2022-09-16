package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: yeo  reason: default package */
/* loaded from: classes4.dex */
public final class yeo extends ajsl {
    private final Context a;
    private final aafo b;
    private final yef c;
    private final CharSequence d;
    private final ViewGroup e;
    private final TextView f;
    private final Resources g;

    public yeo(Context context, aafo aafoVar, yef yefVar) {
        context.getClass();
        this.a = context;
        aafoVar.getClass();
        this.b = aafoVar;
        this.c = yefVar;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.simple_text_section, (ViewGroup) null);
        this.e = viewGroup;
        this.f = (TextView) viewGroup.findViewById(R.id.title);
        this.d = TextUtils.concat(System.getProperty("line.separator"), System.getProperty("line.separator"));
        this.g = context.getResources();
        yefVar.c(viewGroup);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c.a;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        auwi auwiVar = (auwi) obj;
        br brVar = (br) this.f.getLayoutParams();
        int aX = awwc.aX(auwiVar.d);
        if (aX == 0) {
            aX = 1;
        }
        int i = aX - 1;
        if (i == 1) {
            int dimensionPixelSize = this.g.getDimensionPixelSize(R.dimen.simple_text_section_padding_vulcan);
            lj.Y(this.e, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            brVar.width = 0;
            brVar.I = this.g.getDimensionPixelSize(R.dimen.simple_text_section_max_content_width);
            kz.s(this.f, 2132083734);
            this.f.setTypeface(ajgo.ROBOTO_MEDIUM.c(this.a));
            this.f.setTextColor(zhn.f(this.a, 16842806));
        } else if (i == 2) {
            lj.Y(this.e, this.g.getDimensionPixelSize(R.dimen.simple_text_section_padding_start_default), this.g.getDimensionPixelSize(R.dimen.simple_text_section_subscription_title_top_padding), 0, 0);
            brVar.width = 0;
            brVar.I = this.g.getDimensionPixelSize(R.dimen.subscription_cards_max_width);
            kz.s(this.f, 2132083736);
            this.f.setTextColor(zhn.f(this.a, 16842806));
            this.f.setTypeface(ajgo.YTSANS_MEDIUM.c(this.a));
        } else if (i == 3) {
            lj.Y(this.e, this.g.getDimensionPixelSize(R.dimen.simple_text_section_notice_padding_start), this.g.getDimensionPixelSize(R.dimen.simple_text_section_padding_top_default), this.g.getDimensionPixelSize(R.dimen.simple_text_section_notice_padding_end), this.g.getDimensionPixelSize(R.dimen.simple_text_section_padding_bottom_default));
            brVar.width = -1;
            brVar.I = 0;
            kz.s(this.f, 2132083712);
            this.f.setTextColor(zhn.f(this.a, R.attr.ytTextSecondary));
        } else if (i == 4) {
            lj.Y(this.f, this.g.getDimensionPixelSize(R.dimen.simple_text_card_padding), this.g.getDimensionPixelSize(R.dimen.simple_text_card_padding), this.g.getDimensionPixelSize(R.dimen.simple_text_card_padding), this.g.getDimensionPixelSize(R.dimen.simple_text_card_padding));
            brVar.width = -1;
            brVar.I = 0;
            kz.s(this.f, 2132083726);
            this.f.setTextColor(zhn.f(this.a, R.attr.ytTextSecondary));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(zhn.d(this.a, R.attr.ytGeneralBackgroundA));
            gradientDrawable.setCornerRadius(this.a.getResources().getDimensionPixelSize(R.dimen.simple_text_card_background_radius));
            this.f.setBackground(gradientDrawable);
        } else {
            lj.Y(this.e, this.g.getDimensionPixelSize(R.dimen.simple_text_section_padding_start_default), this.g.getDimensionPixelSize(R.dimen.simple_text_section_padding_top_default), this.g.getDimensionPixelSize(R.dimen.simple_text_section_padding_end_default), this.g.getDimensionPixelSize(R.dimen.simple_text_section_padding_bottom_default));
            brVar.width = -1;
            brVar.I = 0;
            kz.s(this.f, 2132083734);
            this.f.setTypeface(ajgo.ROBOTO_MEDIUM.c(this.a));
            this.f.setTextColor(zhn.f(this.a, 16842806));
        }
        if (auwiVar.b.size() != 0) {
            zag.m(this.f, ajgl.k(this.d, aafv.c((arag[]) auwiVar.b.toArray(new arag[0]), this.b, false)));
        }
        this.c.e(ajrsVar);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((auwi) obj).c.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.f.setBackground(null);
    }
}
