package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.PerksSectionRendererOuterClass;
import java.util.Collections;
import java.util.Map;
/* compiled from: PG */
/* renamed from: yak  reason: default package */
/* loaded from: classes4.dex */
public final class yak implements ajru {
    public final ViewGroup a;
    public final aafo b;
    private final Context c;
    private final ajmy d;
    private final ajxz e;
    private final yai f;
    private final float g;
    private final float h;
    private final float i;
    private final float j;
    private final int k;

    public yak(Context context, ajmy ajmyVar, ajxz ajxzVar, yai yaiVar, aafo aafoVar, View view) {
        this.c = context;
        this.d = ajmyVar;
        this.b = aafoVar;
        this.e = ajxzVar;
        this.f = yaiVar;
        if (view == null) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            this.a = linearLayout;
        } else {
            this.a = (ViewGroup) view;
        }
        this.g = context.getResources().getDimensionPixelOffset(R.dimen.membership_text_perk_title_margin);
        this.h = context.getResources().getDimensionPixelOffset(R.dimen.membership_text_perk_subtitle_margin);
        this.i = context.getResources().getDimensionPixelOffset(R.dimen.membership_text_perk_default_margin);
        this.k = context.getResources().getDimensionPixelOffset(R.dimen.membership_offer_perk_picture_margin);
        this.j = context.getResources().getDimensionPixelOffset(R.dimen.membership_text_perk_top_perk_margin);
    }

    public static void d(YouTubeTextView youTubeTextView, CharSequence charSequence) {
        youTubeTextView.setText(charSequence);
        CharSequence text = youTubeTextView.getText();
        if (!(text instanceof Spanned) || ((ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class)).length == 0) {
            youTubeTextView.b();
        } else {
            youTubeTextView.c();
        }
    }

    private static final void f(ImageView imageView, avhn avhnVar) {
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
                return;
            }
        }
        imageView.setContentDescription(null);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v19, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r6v21, types: [android.widget.LinearLayout] */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r6v5, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r6v7, types: [com.google.android.libraries.youtube.common.ui.YouTubeTextView] */
    public final void e(atvm atvmVar) {
        aunb aunbVar;
        aunb aunbVar2;
        LayoutInflater from = LayoutInflater.from(this.c);
        this.a.removeAllViews();
        boolean z = false;
        for (atvh atvhVar : atvmVar.b) {
            if (atvhVar.b == 4) {
                aunbVar = (aunb) atvhVar.c;
            } else {
                aunbVar = aunb.a;
            }
            ?? r6 = 0;
            arag aragVar = null;
            if (aunbVar.qn(PerksSectionRendererOuterClass.perkItemRenderer)) {
                ViewGroup viewGroup = this.a;
                if (atvhVar.b == 4) {
                    aunbVar2 = (aunb) atvhVar.c;
                } else {
                    aunbVar2 = aunb.a;
                }
                yai yaiVar = this.f;
                aafo aafoVar = this.b;
                Context context = (Context) yaiVar.a.get();
                context.getClass();
                ajmy ajmyVar = (ajmy) yaiVar.b.get();
                ajmyVar.getClass();
                yah yahVar = new yah(context, ajmyVar, aafoVar, viewGroup);
                yahVar.d((atvl) aunbVar2.qm(PerksSectionRendererOuterClass.perkItemRenderer));
                r6 = yahVar.a;
            } else {
                int i = atvhVar.b;
                if (i == 1) {
                    ViewGroup viewGroup2 = this.a;
                    final atvk atvkVar = (atvk) atvhVar.c;
                    ViewGroup viewGroup3 = (ViewGroup) from.inflate(R.layout.ypc_perk_text_layout, viewGroup2, false);
                    YouTubeTextView youTubeTextView = (YouTubeTextView) viewGroup3.findViewById(R.id.text);
                    if ((atvkVar.b & 1) != 0 && (aragVar = atvkVar.c) == null) {
                        aragVar = arag.a;
                    }
                    d(youTubeTextView, aafv.a(aragVar, this.b, false));
                    float f = this.i;
                    int af = akel.af(atvkVar.d);
                    if (af == 0) {
                        af = 1;
                    }
                    int i2 = af - 1;
                    if (i2 == 1) {
                        f = this.g;
                        kz.s(youTubeTextView, 2132083736);
                        youTubeTextView.setTextSize(2, 18.0f);
                        youTubeTextView.setTextColor(zhn.j(this.c, R.attr.ytTextPrimary).orElse(0));
                    } else if (i2 == 2) {
                        f = this.h;
                        kz.s(youTubeTextView, 2132083714);
                        youTubeTextView.setTextSize(2, 16.0f);
                        youTubeTextView.setTextColor(zhn.j(this.c, R.attr.ytTextPrimary).orElse(0));
                    } else if (i2 == 4) {
                        kz.s(youTubeTextView, 2132083717);
                        youTubeTextView.setTextColor(zhn.j(this.c, R.attr.ytTextDisabled).orElse(0));
                    } else {
                        kz.s(youTubeTextView, 2132083712);
                        youTubeTextView.setTextColor(zhn.j(this.c, R.attr.ytTextSecondary).orElse(0));
                    }
                    viewGroup3.findViewById(R.id.separator).setVisibility(true != atvkVar.f ? 8 : 0);
                    if (atvkVar.f) {
                        f = this.g;
                        if (!z) {
                            zgd.t(viewGroup3, zgd.p((int) this.j), ViewGroup.MarginLayoutParams.class);
                        }
                    }
                    if ((atvkVar.b & 4) != 0) {
                        final Map singletonMap = Collections.singletonMap("com.google.android.libraries.youtube.innertube.endpoint.tag", new Object());
                        viewGroup3.setOnClickListener(new View.OnClickListener() { // from class: yaj
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                yak yakVar = yak.this;
                                atvk atvkVar2 = atvkVar;
                                Map map = singletonMap;
                                aafo aafoVar2 = yakVar.b;
                                apzg apzgVar = atvkVar2.e;
                                if (apzgVar == null) {
                                    apzgVar = apzg.a;
                                }
                                aafoVar2.c(apzgVar, map);
                            }
                        });
                    }
                    int i3 = (int) f;
                    youTubeTextView.setPadding(0, i3, 0, i3);
                    r6 = viewGroup3;
                } else if (i == 2) {
                    r6 = (YouTubeTextView) from.inflate(R.layout.ypc_perk_item_layout, this.a, false);
                    arag aragVar2 = ((atvj) atvhVar.c).b;
                    if (aragVar2 == null) {
                        aragVar2 = arag.a;
                    }
                    d(r6, aafv.a(aragVar2, this.b, false));
                } else if (i == 3) {
                    atvi atviVar = (atvi) atvhVar.c;
                    if ((atviVar.b & 1) == 0) {
                        r6 = (ViewGroup) from.inflate(R.layout.ypc_perk_images_extra, this.a, false);
                        for (avhn avhnVar : atviVar.c) {
                            ImageView imageView = new ImageView(this.c);
                            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            imageView.setAdjustViewBounds(true);
                            int dimensionPixelSize = this.c.getResources().getDimensionPixelSize(R.dimen.membership_offer_perk_picture_height);
                            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(dimensionPixelSize, dimensionPixelSize);
                            int i4 = this.k;
                            marginLayoutParams.setMargins(i4, i4, i4, i4);
                            imageView.setLayoutParams(marginLayoutParams);
                            r6.addView(imageView);
                            this.d.h(imageView, avhnVar);
                            f(imageView, avhnVar);
                        }
                    } else {
                        r6 = (ViewGroup) from.inflate(R.layout.ypc_perk_badge_extra, this.a, false);
                        YouTubeTextView youTubeTextView2 = (YouTubeTextView) r6.findViewById(R.id.badge_text);
                        ImageView imageView2 = (ImageView) r6.findViewById(R.id.badge_icon);
                        arag aragVar3 = atviVar.d;
                        if (aragVar3 == null) {
                            aragVar3 = arag.a;
                        }
                        d(youTubeTextView2, ajgl.b(aragVar3));
                        if ((atviVar.b & 2) == 0) {
                            Drawable a = akf.a(this.c, this.e.a(arhr.SPONSORSHIPS));
                            yzh.f(a, ake.f(this.c, R.color.membership_branding_color_green), PorterDuff.Mode.DST_ATOP);
                            imageView2.setImageDrawable(a);
                        } else {
                            ajmy ajmyVar2 = this.d;
                            avhn avhnVar2 = atviVar.e;
                            if (avhnVar2 == null) {
                                avhnVar2 = avhn.a;
                            }
                            ajmyVar2.h(imageView2, avhnVar2);
                        }
                        avhn avhnVar3 = atviVar.e;
                        if (avhnVar3 == null) {
                            avhnVar3 = avhn.a;
                        }
                        f(imageView2, avhnVar3);
                    }
                }
            }
            z = atvhVar.b == 1;
            if (r6 != 0) {
                this.a.addView(r6);
            }
        }
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        e((atvm) obj);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.a.removeAllViews();
    }
}
