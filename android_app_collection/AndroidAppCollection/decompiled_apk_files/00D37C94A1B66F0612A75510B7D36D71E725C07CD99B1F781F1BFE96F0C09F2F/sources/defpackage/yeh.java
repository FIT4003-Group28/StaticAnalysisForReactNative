package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.BulletSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: yeh  reason: default package */
/* loaded from: classes4.dex */
public final class yeh extends ajsl {
    final int a;
    final int b;
    final int c;
    private final ajmy d;
    private final aafo e;
    private final Resources f;
    private final LayoutInflater g;
    private final ajwm h;
    private atlp i;
    private final ViewGroup j;
    private yeg k;
    private yeg l;

    public yeh(Context context, ajmy ajmyVar, aafo aafoVar, ajwm ajwmVar) {
        this.d = ajmyVar;
        this.e = aafoVar;
        this.h = ajwmVar;
        Resources resources = context.getResources();
        this.f = resources;
        this.a = resources.getColor(R.color.yt_black4);
        this.b = zhn.d(context, R.attr.ytTextSecondary);
        this.c = zhn.d(context, R.attr.ytCallToAction);
        this.g = LayoutInflater.from(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.j = frameLayout;
        frameLayout.setLayoutParams(new AbsListView.LayoutParams(-1, -2));
    }

    private final void f(yeg yegVar) {
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        CharSequence charSequence;
        CharSequence[] charSequenceArr;
        apmy apmyVar;
        int length;
        TextView textView = yegVar.b;
        atlp atlpVar = this.i;
        if ((atlpVar.b & 32) != 0) {
            aragVar = atlpVar.e;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        TextView textView2 = yegVar.c;
        atlp atlpVar2 = this.i;
        if ((atlpVar2.b & 64) != 0) {
            aragVar2 = atlpVar2.f;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        zag.m(textView2, ajgl.b(aragVar2));
        TextView textView3 = yegVar.d;
        atlp atlpVar3 = this.i;
        if ((atlpVar3.b & 128) != 0) {
            aragVar3 = atlpVar3.g;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        } else {
            aragVar3 = null;
        }
        zag.m(textView3, aafv.a(aragVar3, this.e, false));
        TextView textView4 = yegVar.e;
        CharSequence[] p = ajgl.p((arag[]) this.i.h.toArray(new arag[0]));
        if (p.length > 0) {
            String property = System.getProperty("line.separator");
            charSequence = null;
            for (CharSequence charSequence2 : p) {
                if (!TextUtils.isEmpty(charSequence2)) {
                    SpannableString spannableString = new SpannableString(charSequence2);
                    spannableString.setSpan(new BulletSpan(20), 0, charSequence2.length(), 0);
                    charSequence = charSequence == null ? spannableString : TextUtils.concat(charSequence, property, spannableString);
                }
            }
        } else {
            charSequence = null;
        }
        zag.m(textView4, charSequence);
        TextView textView5 = yegVar.f;
        String property2 = System.getProperty("line.separator");
        arag[] aragVarArr = (arag[]) this.i.i.toArray(new arag[0]);
        aafo aafoVar = this.e;
        if (aragVarArr == null || (length = aragVarArr.length) == 0) {
            charSequenceArr = aafv.a;
        } else {
            charSequenceArr = new CharSequence[length];
            for (int i = 0; i < aragVarArr.length; i++) {
                charSequenceArr[i] = aafv.a(aragVarArr[i], aafoVar, true);
            }
        }
        zag.m(textView5, ajgl.k(property2, charSequenceArr));
        atlp atlpVar4 = this.i;
        if ((atlpVar4.b & 2) != 0) {
            atlo atloVar = atlpVar4.c;
            if (atloVar == null) {
                atloVar = atlo.a;
            }
            if (atloVar.b == 118483990) {
                apmyVar = (apmy) atloVar.c;
            } else {
                apmyVar = apmy.a;
            }
        } else {
            apmyVar = null;
        }
        ajwn ajwnVar = this.h.a;
        ajwnVar.b();
        ajwnVar.a = yegVar.b;
        ajwnVar.g(this.a);
        ajwnVar.b = yegVar.d;
        ajwnVar.e(this.b);
        ajwnVar.d(this.c);
        ajwnVar.a().a(apmyVar);
        avhn avhnVar = this.i.d;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        if (akel.A(avhnVar)) {
            avhn avhnVar2 = this.i.d;
            if (avhnVar2 == null) {
                avhnVar2 = avhn.a;
            }
            float p2 = akel.p(avhnVar2);
            if (p2 > 0.0f) {
                yegVar.h.a = p2;
            }
            ajmy ajmyVar = this.d;
            ImageView imageView = yegVar.g;
            avhn avhnVar3 = this.i.d;
            if (avhnVar3 == null) {
                avhnVar3 = avhn.a;
            }
            ajmyVar.h(imageView, avhnVar3);
            yegVar.g.setVisibility(0);
        } else {
            this.d.e(yegVar.g);
            yegVar.g.setVisibility(8);
        }
        this.j.removeAllViews();
        this.j.addView(yegVar.a);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.j;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        this.i = (atlp) obj;
        if (this.f.getConfiguration().orientation == 1) {
            if (this.k == null) {
                this.k = new yeg(this.g.inflate(R.layout.music_key_promo_feature_item, this.j, false));
            }
            f(this.k);
            return;
        }
        if (this.l == null) {
            this.l = new yeg(this.g.inflate(R.layout.music_key_promo_feature_item, this.j, false));
        }
        f(this.l);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((atlp) obj).j.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
