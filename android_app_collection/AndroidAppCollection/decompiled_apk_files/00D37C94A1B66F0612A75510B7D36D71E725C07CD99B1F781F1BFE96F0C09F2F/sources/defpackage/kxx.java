package defpackage;

import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.libraries.youtube.common.ui.YouTubeTextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.MenuRendererOuterClass;
/* compiled from: PG */
/* renamed from: kxx  reason: default package */
/* loaded from: classes3.dex */
public final class kxx extends ajsl {
    private final Context a;
    private final ajmy b;
    private final aafo c;
    private final ajyc d;
    private final ajxz e;
    private final int f;
    private final FrameLayout g;
    private ajrp h;

    public kxx(Context context, ajmy ajmyVar, aafo aafoVar, ajyc ajycVar, ajxz ajxzVar) {
        this.a = context;
        this.b = ajmyVar;
        this.d = ajycVar;
        this.c = aafoVar;
        this.e = ajxzVar;
        this.g = new FrameLayout(context);
        this.f = zhn.j(context, R.attr.ytCallToAction).orElse(0);
    }

    private final void f(TextView textView, int i, int i2, int i3) {
        Drawable drawable = this.a.getResources().getDrawable(i);
        int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.fact_check_open_in_new_icon_bottom_margin);
        drawable.setBounds(0, 0, i2, i2);
        drawable.mutate().setColorFilter(i3, PorterDuff.Mode.SRC_IN);
        kxw kxwVar = new kxw(drawable, dimensionPixelSize);
        String valueOf = String.valueOf(textView.getText());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2);
        sb.append(valueOf);
        sb.append("  ");
        SpannableString spannableString = new SpannableString(sb.toString());
        int length = spannableString.length();
        spannableString.setSpan(kxwVar, length - 1, length, 33);
        textView.setText(spannableString);
    }

    private final void g(ajrs ajrsVar, aqxp aqxpVar) {
        aunb aunbVar = aqxpVar.b;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        if (aunbVar.qn(MenuRendererOuterClass.menuRenderer)) {
            View findViewById = this.g.findViewById(R.id.contextual_menu_anchor);
            aunb aunbVar2 = aqxpVar.b;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            this.d.e(this.g, findViewById, (atep) aunbVar2.qm(MenuRendererOuterClass.menuRenderer), aqxpVar, ajrsVar.a);
        }
        ImageView imageView = (ImageView) this.g.findViewById(R.id.image);
        ajmy ajmyVar = this.b;
        avhn avhnVar = aqxpVar.c;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        ajmyVar.h(imageView, avhnVar);
        imageView.setColorFilter((ColorFilter) null);
        YouTubeTextView youTubeTextView = (YouTubeTextView) this.g.findViewById(R.id.box_title);
        arag aragVar = aqxpVar.d;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        youTubeTextView.setText(ajgl.b(aragVar));
        YouTubeTextView youTubeTextView2 = (YouTubeTextView) this.g.findViewById(R.id.claim_text);
        arag aragVar2 = aqxpVar.h;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        youTubeTextView2.setText(ajgl.b(aragVar2));
        YouTubeTextView youTubeTextView3 = (YouTubeTextView) this.g.findViewById(R.id.rating_text);
        arag aragVar3 = aqxpVar.j;
        if (aragVar3 == null) {
            aragVar3 = arag.a;
        }
        youTubeTextView3.setText(ajgl.b(aragVar3));
    }

    private final void h(arhr arhrVar, int i) {
        ImageView imageView = (ImageView) this.g.findViewById(R.id.box_title_icon);
        if (imageView != null) {
            imageView.setImageResource(this.e.a(arhrVar));
            if (imageView.getDrawable() == null) {
                return;
            }
            imageView.getDrawable().mutate().setColorFilter(zhn.j(this.a, i).orElse(0), PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.g;
    }

    @Override // defpackage.ajsl
    public final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        aqxp aqxpVar = (aqxp) obj;
        this.g.removeAllViews();
        LayoutInflater from = LayoutInflater.from(this.a);
        int a = aqxo.a(aqxpVar.l);
        if (a == 0 || a != 2) {
            int a2 = aqxo.a(aqxpVar.l);
            if (a2 == 0 || a2 != 4) {
                int a3 = aqxo.a(aqxpVar.l);
                if (a3 == 0 || a3 != 3) {
                    int a4 = aqxo.a(aqxpVar.l);
                    if (a4 == 0) {
                        a4 = 1;
                    }
                    StringBuilder sb = new StringBuilder(79);
                    sb.append("Unexpected FactCheckRendererStyle value '");
                    sb.append(a4 - 1);
                    sb.append("'. Defaulting to EXTENSIVE.");
                    Log.w("FactCheckPresenter", sb.toString());
                }
                this.g.addView(from.inflate(R.layout.fact_check_extensive, (ViewGroup) null));
                g(ajrsVar, aqxpVar);
                YouTubeTextView youTubeTextView = (YouTubeTextView) this.g.findViewById(R.id.article_title);
                arag aragVar = aqxpVar.g;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
                youTubeTextView.setText(ajgl.b(aragVar));
                arhs arhsVar = aqxpVar.i;
                if (arhsVar == null) {
                    arhsVar = arhs.a;
                }
                if ((arhsVar.b & 1) != 0) {
                    ajxz ajxzVar = this.e;
                    arhs arhsVar2 = aqxpVar.i;
                    if (arhsVar2 == null) {
                        arhsVar2 = arhs.a;
                    }
                    arhr b = arhr.b(arhsVar2.c);
                    if (b == null) {
                        b = arhr.UNKNOWN;
                    }
                    f(youTubeTextView, ajxzVar.a(b), this.a.getResources().getDimensionPixelSize(R.dimen.fact_check_open_in_new_icon_size), this.f);
                }
                arhs arhsVar3 = aqxpVar.e;
                if (arhsVar3 == null) {
                    arhsVar3 = arhs.a;
                }
                if ((arhsVar3.b & 1) != 0) {
                    arhs arhsVar4 = aqxpVar.e;
                    if (arhsVar4 == null) {
                        arhsVar4 = arhs.a;
                    }
                    arhr b2 = arhr.b(arhsVar4.c);
                    if (b2 == null) {
                        b2 = arhr.UNKNOWN;
                    }
                    h(b2, R.attr.ytIconActiveOther);
                }
            } else {
                this.g.addView(from.inflate(R.layout.fact_check_v2, (ViewGroup) null));
                g(ajrsVar, aqxpVar);
                YouTubeTextView youTubeTextView2 = (YouTubeTextView) this.g.findViewById(R.id.source_text);
                arag aragVar2 = aqxpVar.k;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
                youTubeTextView2.setText(ajgl.b(aragVar2));
                YouTubeTextView youTubeTextView3 = (YouTubeTextView) this.g.findViewById(R.id.article_title);
                arag aragVar3 = aqxpVar.g;
                if (aragVar3 == null) {
                    aragVar3 = arag.a;
                }
                youTubeTextView3.setText(ajgl.b(aragVar3));
                arhs arhsVar5 = aqxpVar.i;
                if (arhsVar5 == null) {
                    arhsVar5 = arhs.a;
                }
                if ((arhsVar5.b & 1) != 0) {
                    ajxz ajxzVar2 = this.e;
                    arhs arhsVar6 = aqxpVar.i;
                    if (arhsVar6 == null) {
                        arhsVar6 = arhs.a;
                    }
                    arhr b3 = arhr.b(arhsVar6.c);
                    if (b3 == null) {
                        b3 = arhr.UNKNOWN;
                    }
                    f(youTubeTextView3, ajxzVar2.a(b3), this.a.getResources().getDimensionPixelSize(R.dimen.fact_check_open_in_new_icon_size), this.f);
                }
                arhs arhsVar7 = aqxpVar.e;
                if (arhsVar7 == null) {
                    arhsVar7 = arhs.a;
                }
                if ((arhsVar7.b & 1) != 0) {
                    arhs arhsVar8 = aqxpVar.e;
                    if (arhsVar8 == null) {
                        arhsVar8 = arhs.a;
                    }
                    arhr b4 = arhr.b(arhsVar8.c);
                    if (b4 == null) {
                        b4 = arhr.UNKNOWN;
                    }
                    h(b4, R.attr.ytTextPrimary);
                }
                ImageView imageView = (ImageView) this.g.findViewById(R.id.image);
                imageView.setBackgroundResource(R.drawable.rounded_outline_2dp);
                imageView.setClipToOutline(true);
            }
        } else {
            this.g.addView(from.inflate(R.layout.fact_check_compact, (ViewGroup) null));
            g(ajrsVar, aqxpVar);
            TextView textView = (TextView) this.g.findViewById(R.id.box_title);
            ajxz ajxzVar3 = this.e;
            arhs arhsVar9 = aqxpVar.i;
            if (arhsVar9 == null) {
                arhsVar9 = arhs.a;
            }
            arhr b5 = arhr.b(arhsVar9.c);
            if (b5 == null) {
                b5 = arhr.UNKNOWN;
            }
            f(textView, ajxzVar3.a(b5), this.a.getResources().getDimensionPixelSize(R.dimen.fact_check_open_in_new_icon_size), this.f);
        }
        ajrp ajrpVar = new ajrp(this.c, this.g);
        this.h = ajrpVar;
        acti actiVar = ajrsVar.a;
        apzg apzgVar = aqxpVar.f;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        ajrpVar.a(actiVar, apzgVar, ajrsVar.e());
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqxp) obj).m.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.h.c();
    }
}
