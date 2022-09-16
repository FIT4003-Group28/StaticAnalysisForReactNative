package defpackage;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: xsi  reason: default package */
/* loaded from: classes4.dex */
public abstract class xsi implements ajru {
    public final Context a;
    public final xli b;
    public final ajsg c;
    public final ajyi d;
    public final View e;
    public final View f;
    public final int g;
    public final TextView h;
    public final View i;
    public final RecyclerView j;
    private final ajmy k;
    private final View l;
    private final TextView m;
    private final TextView n;
    private final ViewGroup o;
    private final ImageView p;
    private final TextView q;
    private final ImageView r;
    private final xnm s;

    /* JADX INFO: Access modifiers changed from: protected */
    public xsi(Context context, ajmy ajmyVar, ajyi ajyiVar, ajrh ajrhVar, xli xliVar, ajsg ajsgVar, akge akgeVar, aafo aafoVar, gfz gfzVar, aacz aaczVar, acti actiVar, xyf xyfVar) {
        context.getClass();
        this.a = context;
        ajmyVar.getClass();
        this.k = ajmyVar;
        xliVar.getClass();
        this.b = xliVar;
        this.d = ajyiVar;
        this.c = ajsgVar;
        View inflate = View.inflate(context, R.layout.comments_header, null);
        this.e = inflate;
        this.l = inflate.findViewById(R.id.comment_section_title);
        this.m = (TextView) inflate.findViewById(R.id.title_text);
        this.n = (TextView) inflate.findViewById(R.id.comments_count);
        this.o = (ViewGroup) inflate.findViewById(R.id.simplebox_container);
        this.p = (ImageView) inflate.findViewById(R.id.simplebox_avatar);
        this.q = (TextView) inflate.findViewById(R.id.simplebox);
        this.r = (ImageView) inflate.findViewById(R.id.simplebox_divider);
        View findViewById = inflate.findViewById(R.id.sort_menu_anchor);
        this.f = findViewById;
        this.s = new xnm(context, ajyiVar, ajrhVar, findViewById, new akfb(akgeVar, aafoVar, gfzVar, aaczVar), actiVar, xyfVar, null);
        this.g = context.getResources().getDimensionPixelSize(R.dimen.sort_menu_anchor_padding);
        this.h = (TextView) inflate.findViewById(R.id.red_member_comments_only);
        this.i = inflate.findViewById(R.id.red_member_comments_only_divider);
        inflate.getViewTreeObserver().addOnGlobalLayoutListener(new xsh(this));
        this.j = (RecyclerView) inflate.findViewById(R.id.sub_header_tab);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void d(ajrs ajrsVar, auxr auxrVar) {
        Object c = ajrsVar.c("sectionController");
        xnm xnmVar = this.s;
        final ajxh ajxhVar = c instanceof ajxh ? (ajxh) c : null;
        xnmVar.e = new xnl() { // from class: xnj
            @Override // defpackage.xnl
            public final void a(ajfz ajfzVar) {
                ajxh.this.lr(ajfzVar);
            }
        };
        if (c != null) {
            this.s.f = amup.k("sectionController", c);
        }
        this.s.a(auxrVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e(CharSequence charSequence, CharSequence charSequence2) {
        this.m.setText(charSequence);
        this.n.setText(charSequence2);
        boolean z = false;
        if (TextUtils.isEmpty(charSequence) && TextUtils.isEmpty(charSequence2)) {
            z = true;
        }
        zag.o(this.l, !z);
    }

    public final void g() {
        this.l.setVisibility(8);
        this.p.setVisibility(8);
        this.q.setVisibility(8);
        this.o.setVisibility(8);
        this.r.setVisibility(8);
        this.i.setVisibility(8);
        this.h.setVisibility(8);
        this.s.a(null);
        this.j.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void h(int i) {
        this.q.setVisibility(i);
        this.r.setVisibility(i);
        this.p.setVisibility(i);
        this.o.setVisibility(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void i(avhn avhnVar, int i, CharSequence charSequence, View.OnClickListener onClickListener) {
        String str;
        int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.comment_avatar_size);
        int dimensionPixelSize2 = this.a.getResources().getDimensionPixelSize(R.dimen.comment_layout_margin_left);
        int dimensionPixelSize3 = this.a.getResources().getDimensionPixelSize(R.dimen.simplebox_margin_top);
        int dimensionPixelSize4 = this.a.getResources().getDimensionPixelSize(R.dimen.simplebox_margin_bottom);
        int i2 = i - 1;
        if (i2 == 2) {
            dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.reply_avatar_size);
            dimensionPixelSize2 = this.a.getResources().getDimensionPixelSize(R.dimen.reply_layout_margin_left);
        } else if (i2 == 3) {
            dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.backstage_avatar_size);
            dimensionPixelSize3 = this.a.getResources().getDimensionPixelSize(R.dimen.backstage_simple_box_margin_top);
            dimensionPixelSize4 = this.a.getResources().getDimensionPixelSize(R.dimen.backstage_simple_box_margin_bottom);
        }
        zgd.t(this.p, zgd.b(zgd.s(dimensionPixelSize, dimensionPixelSize), zgd.i(dimensionPixelSize2), zgd.l(dimensionPixelSize2)), ViewGroup.MarginLayoutParams.class);
        zgd.t(this.o, zgd.b(zgd.p(dimensionPixelSize3), zgd.e(dimensionPixelSize4)), ViewGroup.MarginLayoutParams.class);
        Uri s = akel.s(avhnVar, dimensionPixelSize);
        if (s != null) {
            this.p.setVisibility(0);
            this.p.setTag(s);
            ImageView imageView = this.p;
            if ((4 & avhnVar.b) != 0) {
                aovs aovsVar = avhnVar.d;
                if (aovsVar == null) {
                    aovsVar = aovs.a;
                }
                aovr aovrVar = aovsVar.c;
                if (aovrVar == null) {
                    aovrVar = aovr.a;
                }
                str = aovrVar.c;
            } else {
                str = null;
            }
            imageView.setContentDescription(str);
            this.k.g(this.p, s);
        } else {
            this.p.setVisibility(4);
        }
        this.q.setVisibility(0);
        this.r.setVisibility(0);
        this.o.setVisibility(0);
        this.q.setText(charSequence);
        this.q.setOnClickListener(onClickListener);
    }

    @Override // defpackage.ajru
    public void qZ(ajsa ajsaVar) {
        throw null;
    }
}
