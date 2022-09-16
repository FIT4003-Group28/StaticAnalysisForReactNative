package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: abmg  reason: default package */
/* loaded from: classes.dex */
public class abmg implements ajru {
    protected final Context a;
    public final aafo b;
    public final acti c;
    protected final View d;
    private final ajvi e;
    private final SpannableStringBuilder f;
    private final StringBuilder g;
    private final TextView h;
    private final TextView i;
    private final TextView j;
    private final TextView k;
    private final ImageView l;
    private final View m;
    private final View n;
    private final View o;
    private final Drawable p;
    private final Drawable q;
    private final int r;
    private final int s;
    private final float t;
    private final ajnj u;
    private Spanned v;
    private boolean w;
    private boolean x;
    private final ajvo y;

    public abmg(Context context, acth acthVar, ajmy ajmyVar, ajvm ajvmVar, aafo aafoVar, ajxz ajxzVar) {
        this.a = context;
        this.b = aafoVar;
        this.c = acthVar.oi();
        View inflate = LayoutInflater.from(context).inflate(e(), (ViewGroup) null);
        this.d = inflate;
        this.h = h();
        this.i = (TextView) inflate.findViewById(R.id.header_text);
        this.j = (TextView) inflate.findViewById(R.id.header_subtext);
        TextView i = i();
        this.k = i;
        this.m = inflate.findViewById(R.id.top_bar);
        this.n = inflate.findViewById(R.id.bottom_bar);
        this.o = inflate.findViewById(R.id.top_bar_content);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.avatar);
        this.l = imageView;
        this.q = g();
        this.p = f();
        ajvq ajvqVar = new ajvq(inflate);
        this.e = new ajvi(context, ajxzVar, ajvmVar, true, ajvqVar, false);
        this.y = new ajvo(context, ajvmVar, true, ajvqVar);
        this.u = new ajnj(ajmyVar.b(), imageView);
        this.r = context.getResources().getColor(R.color.live_chat_membership_item_header_background);
        this.s = context.getResources().getColor(R.color.live_chat_membership_item_body_background);
        this.f = new SpannableStringBuilder();
        this.g = new StringBuilder();
        this.t = context.getResources().getDimensionPixelSize(R.dimen.live_chat_message_spacing) / i().getPaint().measureText(" ");
        Resources resources = context.getResources();
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_paid_message_margin);
        zgd.u(inflate, new abmf(marginLayoutParams), zgd.b(zgd.s(-1, -2), zgd.l(dimensionPixelOffset), zgd.k(dimensionPixelOffset)), ViewGroup.MarginLayoutParams.class);
        i.setFilters(new InputFilter[]{new ajvr(i, context.getResources().getDimension(R.dimen.live_chat_unicode_emoji_text_size), (int) context.getResources().getDimension(R.dimen.live_chat_unicode_emoji_vertical_shift))});
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.d;
    }

    protected boolean d() {
        return false;
    }

    protected int e() {
        return R.layout.live_chat_membership_item;
    }

    protected Drawable f() {
        return this.a.getResources().getDrawable(R.drawable.live_chat_paid_message_full_background);
    }

    protected Drawable g() {
        return this.a.getResources().getDrawable(R.drawable.live_chat_paid_message_top_background);
    }

    protected final TextView h() {
        return (TextView) this.d.findViewById(R.id.author);
    }

    protected final TextView i() {
        return (TextView) this.d.findViewById(R.id.message);
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        arag aragVar4;
        final asra asraVar = (asra) obj;
        this.f.clear();
        this.g.setLength(0);
        TextView textView = this.i;
        final acte acteVar = null;
        if ((asraVar.b & 16) != 0) {
            aragVar = asraVar.g;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView, ajgl.b(aragVar));
        TextView textView2 = this.j;
        if ((asraVar.b & 32) != 0) {
            aragVar2 = asraVar.h;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        zag.m(textView2, ajgl.b(aragVar2));
        abjz abjzVar = new abjz(ajrsVar.c("live_chat_item_action"));
        if (asraVar.c == 8 || (asraVar.b & 2048) != 0 || abjzVar.c()) {
            boolean z = true;
            if (abjzVar.c()) {
                this.w = false;
                this.x = true;
                this.v = ajgl.b(abjzVar.a());
            } else if ((asraVar.b & 2048) == 0) {
                this.x = false;
                this.v = aafv.a(asraVar.c == 8 ? (arag) asraVar.d : null, this.b, false);
                if (asraVar.c == 8) {
                    aragVar3 = (arag) asraVar.d;
                } else {
                    aragVar3 = arag.a;
                }
                if (aragVar3 != null && aragVar3.c.size() > 0) {
                    for (arai araiVar : aragVar3.c) {
                        if (araiVar.qn(aqup.b)) {
                            break;
                        }
                    }
                }
                z = false;
                this.w = z;
            } else {
                this.w = false;
                this.x = true;
                arag aragVar5 = asraVar.l;
                if (aragVar5 == null) {
                    aragVar5 = arag.a;
                }
                this.v = ajgl.b(aragVar5);
            }
            if (!TextUtils.isEmpty(this.v) || this.w) {
                if (!TextUtils.isEmpty(this.v)) {
                    this.f.append((CharSequence) this.v);
                    this.g.append((CharSequence) this.v);
                }
                if (this.x) {
                    abrh.d(this.f, this.v.length(), new ForegroundColorSpan(zhn.d(this.a, R.attr.ytOverlayTextSecondary)));
                    abrh.d(this.f, this.v.length(), new StyleSpan(2));
                } else if (this.w) {
                    ajvo ajvoVar = this.y;
                    if (asraVar.c == 8) {
                        aragVar4 = (arag) asraVar.d;
                    } else {
                        aragVar4 = arag.a;
                    }
                    ajvoVar.g(aragVar4, this.v, this.f, this.g, asraVar, this.k.getId());
                }
                this.k.setText(this.f);
            }
            this.m.setBackground(this.q);
            ((GradientDrawable) this.q).setColor(this.r);
            this.n.setVisibility(0);
            ((GradientDrawable) this.n.getBackground()).setColor(this.s);
            this.h.setTextSize(0, this.a.getResources().getDimension(R.dimen.live_chat_loyalty_message_author_name_text_size));
            this.j.setTextSize(0, this.a.getResources().getDimension(R.dimen.live_chat_loyalty_message_tier_name_text_size));
        } else {
            this.m.setBackground(this.p);
            ((GradientDrawable) this.m.getBackground()).setColor(this.s);
            this.n.setVisibility(8);
            this.h.setTextSize(0, this.a.getResources().getDimension(R.dimen.live_chat_membership_message_author_name_text_size));
            this.j.setTextSize(0, this.a.getResources().getDimension(R.dimen.live_chat_membership_message_tier_name_text_size));
        }
        if ((asraVar.b & 512) == 0 || this.x) {
            this.h.setVisibility(8);
        } else {
            arag aragVar6 = asraVar.i;
            if (aragVar6 == null) {
                aragVar6 = arag.a;
            }
            Spanned b = ajgl.b(aragVar6);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(b);
            this.e.b(spannableStringBuilder, new StringBuilder(b), ajvh.a(asraVar.k), this.t, asraVar, h().getId(), false);
            this.h.setText(spannableStringBuilder);
            this.h.setVisibility(0);
        }
        if ((asraVar.b & 1024) == 0 || this.x) {
            this.l.setVisibility(8);
        } else {
            avhn avhnVar = asraVar.j;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            if (avhnVar != null) {
                this.u.k(avhnVar);
            }
            this.l.setVisibility(0);
        }
        Resources resources = this.a.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.live_chat_paid_message_avatar_size);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_paid_message_bottom_bar_horizontal_padding);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.live_chat_avatar_margin);
        if (this.h.getVisibility() != 0) {
            if (!d()) {
                dimensionPixelSize /= 2;
            }
            int i = dimensionPixelSize - dimensionPixelOffset;
            TextView textView3 = this.k;
            textView3.setPaddingRelative(i, 0, textView3.getPaddingEnd(), 0);
            ((ViewGroup.MarginLayoutParams) this.o.getLayoutParams()).setMarginStart(i);
        } else if (d()) {
            TextView textView4 = this.k;
            textView4.setPaddingRelative(dimensionPixelSize + dimensionPixelOffset + dimensionPixelOffset2, 0, textView4.getPaddingEnd(), 0);
        }
        if ((asraVar.b & 65536) != 0) {
            acteVar = new acte(asraVar.n);
        }
        if (acteVar != null) {
            this.c.n(acteVar);
        }
        if ((asraVar.b & 8192) == 0 || this.b == null) {
            return;
        }
        this.d.setOnClickListener(new View.OnClickListener() { // from class: abme
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                abmg abmgVar = abmg.this;
                acte acteVar2 = acteVar;
                asra asraVar2 = asraVar;
                if (acteVar2 != null) {
                    abmgVar.c.H(3, acteVar2, null);
                }
                aafo aafoVar = abmgVar.b;
                apzg apzgVar = asraVar2.m;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar.a(apzgVar);
            }
        });
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.e.e();
        this.h.setText((CharSequence) null);
        this.i.setText((CharSequence) null);
        this.j.setText((CharSequence) null);
        this.k.setText((CharSequence) null);
        this.u.a();
        this.d.setOnClickListener(null);
    }
}
