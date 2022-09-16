package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: acmg  reason: default package */
/* loaded from: classes.dex */
public final class acmg extends abmz {
    private static final amup w;
    private final TextView A;
    private final TextView B;
    private final ajnj x;
    private final afvn y;
    private final TextView z;

    static {
        amum amumVar = new amum();
        amumVar.f(arhr.UNKNOWN, Integer.valueOf((int) R.style.live_chat_overlay_author));
        amumVar.f(arhr.OWNER, Integer.valueOf((int) R.style.live_chat_author_owner));
        amumVar.f(arhr.MODERATOR, Integer.valueOf((int) R.style.live_chat_author_moderator));
        amumVar.f(arhr.MEMBER, Integer.valueOf((int) R.style.live_chat_author_member));
        amumVar.f(arhr.VERIFIED, Integer.valueOf((int) R.style.live_chat_author_verified));
        w = amumVar.b();
    }

    public acmg(Context context, ajmy ajmyVar, ajxz ajxzVar, aafo aafoVar, afvn afvnVar, ajvm ajvmVar, abkl abklVar, abjy abjyVar, zhf zhfVar) {
        super(context, ajxzVar, aafoVar, ajvmVar, abklVar, abjyVar, zhfVar);
        this.y = afvnVar;
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_vertical_margin);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_horizontal_margin);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.topMargin = dimensionPixelOffset;
        marginLayoutParams.bottomMargin = dimensionPixelOffset;
        marginLayoutParams.leftMargin = dimensionPixelOffset2;
        marginLayoutParams.rightMargin = dimensionPixelOffset2;
        this.g.setLayoutParams(marginLayoutParams);
        this.x = new ajnj(ajmyVar.b(), this.h);
        TextView textView = (TextView) this.g.findViewById(R.id.author);
        textView.getClass();
        this.z = textView;
        TextView textView2 = (TextView) this.g.findViewById(R.id.timestamp);
        textView2.getClass();
        this.B = textView2;
        TextView textView3 = (TextView) this.g.findViewById(R.id.comment);
        textView3.getClass();
        this.A = textView3;
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
        textView3.setOnClickListener(this.o);
        textView3.setFilters(new InputFilter[]{new ajvr(textView3, context.getResources().getDimension(R.dimen.live_chat_unicode_emoji_text_size), (int) context.getResources().getDimension(R.dimen.live_chat_unicode_emoji_vertical_shift))});
    }

    private final boolean t(View view) {
        return view.getAlpha() > 0.0f && (!(view.getParent() instanceof View) || t((View) view.getParent()));
    }

    @Override // defpackage.abmz
    protected final amup e() {
        return w;
    }

    @Override // defpackage.abmz
    protected final void g(SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, SpannableStringBuilder spannableStringBuilder3, StringBuilder sb) {
        arag aragVar;
        List list = this.l;
        if (list != null && !list.isEmpty()) {
            this.a.b(spannableStringBuilder, sb, this.l, this.n, this.k, this.z.getId(), false);
        }
        q(spannableStringBuilder2);
        this.z.setText(spannableStringBuilder);
        this.A.setText(spannableStringBuilder2);
        this.B.setText(spannableStringBuilder3);
        boolean e = zdg.e(this.d);
        if (e) {
            sb.append((CharSequence) spannableStringBuilder2);
            this.A.setImportantForAccessibility(2);
        }
        if (!this.p) {
            ajvo ajvoVar = this.v;
            arag aragVar2 = this.k.g;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            arag aragVar3 = aragVar2;
            asrf asrfVar = this.k;
            if ((asrfVar.b & 16) != 0) {
                aragVar = asrfVar.g;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            ajvoVar.g(aragVar3, ajgl.b(aragVar), spannableStringBuilder2, sb, this.k, this.A.getId());
        }
        if (e) {
            this.g.setContentDescription(sb);
        }
    }

    @Override // defpackage.abmz
    public final void h(View view) {
        if (!this.y.t() || this.k == null || this.j == null || !t(view)) {
            return;
        }
        HashMap hashMap = new HashMap();
        asrf asrfVar = this.k;
        if (asrfVar != null) {
            hashMap.put("context_menu_header_renderer_key", asrfVar);
        }
        this.f.c(this.j, hashMap);
    }

    @Override // defpackage.abmz
    protected final int l() {
        return zhn.j(this.e, R.attr.ytTextDisabled).orElse(0);
    }

    @Override // defpackage.abmz
    protected final int m() {
        return R.layout.live_chat_light_overlay_text_item;
    }

    @Override // defpackage.abmz
    protected final ImageView n() {
        return (ImageView) this.g.findViewById(R.id.avatar);
    }

    @Override // defpackage.abmz
    protected final TextView o() {
        return (TextView) this.g.findViewById(R.id.author);
    }

    @Override // defpackage.abmz
    protected final void p(avhn avhnVar) {
        this.x.k(avhnVar);
    }

    @Override // defpackage.abmz, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.x.a();
    }

    @Override // defpackage.abmz
    protected final boolean r() {
        return false;
    }
}
