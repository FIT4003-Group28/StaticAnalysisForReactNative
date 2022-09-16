package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Date;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: abmv  reason: default package */
/* loaded from: classes.dex */
public abstract class abmv implements ajru, ajmx {
    public final acti a;
    public final aafo b;
    protected final View c;
    protected final TextView d;
    protected final Context e;
    private final ajnj f;
    private final ajod g;
    private final int h;
    private final int i;
    private final ImageView j;
    private final TextView k;
    private final TextView l;
    private final TextView m;
    private final ImageView n;
    private final View o;

    public abmv(Context context, ajmr ajmrVar, acth acthVar, aafo aafoVar, ajod ajodVar, zhf zhfVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, zhfVar.a);
        this.e = contextThemeWrapper;
        this.a = acthVar.oi();
        this.b = aafoVar;
        View inflate = View.inflate(contextThemeWrapper, f(), null);
        this.c = inflate;
        this.g = ajodVar;
        ajodVar.d(this);
        ImageView imageView = (ImageView) inflate.findViewById(R.id.avatar);
        this.j = imageView;
        TextView textView = (TextView) inflate.findViewById(R.id.live_chat_paid_sticker_author_name);
        this.d = textView;
        TextView textView2 = (TextView) inflate.findViewById(R.id.live_chat_paid_sticker_price);
        this.k = textView2;
        this.l = (TextView) inflate.findViewById(R.id.timestamp);
        this.m = (TextView) inflate.findViewById(R.id.live_chat_paid_sticker_subtext);
        this.n = (ImageView) inflate.findViewById(R.id.live_chat_paid_sticker_animation);
        this.o = inflate.findViewById(R.id.live_chat_sticker_background);
        int i = -16777216;
        this.h = textView != null ? textView.getCurrentTextColor() : -16777216;
        this.i = textView2 != null ? textView2.getCurrentTextColor() : i;
        ajmrVar.getClass();
        imageView.getClass();
        this.f = new ajnj(ajmrVar, imageView, false);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajmx
    public final void b(ImageView imageView, ajmu ajmuVar, avhn avhnVar) {
    }

    @Override // defpackage.ajmx
    public final void c(ImageView imageView, ajmu ajmuVar, avhn avhnVar) {
    }

    @Override // defpackage.ajmx
    public final void d(ImageView imageView, ajmu ajmuVar, avhn avhnVar) {
    }

    @Override // defpackage.ajmx
    public final void e(ImageView imageView, ajmu ajmuVar, avhn avhnVar) {
        imageView.setBackgroundColor(0);
    }

    protected abstract int f();

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        CharSequence charSequence;
        asrx asrxVar = (asrx) obj;
        arag aragVar = asrxVar.g;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        Spanned b = ajgl.b(aragVar);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(b)) {
            abrh.b(this.e, spannableStringBuilder, b, R.style.live_chat_author_default, true);
        }
        arag aragVar2 = asrxVar.k;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        Spanned b2 = ajgl.b(aragVar2);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        abrh.a(this.e, spannableStringBuilder2, b2, R.style.live_chat_paid_sticker_money_chip);
        if ((asrxVar.b & 4096) != 0) {
            arag aragVar3 = asrxVar.m;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
            charSequence = ajgl.b(aragVar3);
        } else if (asrxVar.e != 0) {
            charSequence = DateFormat.getTimeFormat(this.e).format(new Date(TimeUnit.MICROSECONDS.toMillis(asrxVar.e)));
        } else {
            charSequence = null;
        }
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
        if (!TextUtils.isEmpty(charSequence)) {
            abrh.a(this.e, spannableStringBuilder3, charSequence, R.style.live_chat_message_time);
        }
        Spanned b3 = ajgl.b(new abjz((apzg) ajrsVar.c("live_chat_item_action")).a());
        if (TextUtils.isEmpty(b3)) {
            arag aragVar4 = asrxVar.n;
            if (aragVar4 == null) {
                aragVar4 = arag.a;
            }
            Spanned b4 = ajgl.b(aragVar4);
            if (!TextUtils.isEmpty(b4)) {
                abrh.a(this.e, spannableStringBuilder2, b4, R.style.live_chat_subtext);
            }
            avhn avhnVar = asrxVar.o;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            if (akel.A(avhnVar)) {
                if (asrxVar.p != 0 && asrxVar.q != 0) {
                    DisplayMetrics displayMetrics = this.e.getResources().getDisplayMetrics();
                    zgd.v(this.n, zew.i(displayMetrics, asrxVar.p), zew.i(displayMetrics, asrxVar.q));
                }
                this.n.setVisibility(0);
                ajod ajodVar = this.g;
                ImageView imageView = this.n;
                avhn avhnVar2 = asrxVar.o;
                if (avhnVar2 == null) {
                    avhnVar2 = avhn.a;
                }
                ajodVar.h(imageView, avhnVar2);
                aovs aovsVar = avhnVar.d;
                if (aovsVar == null) {
                    aovsVar = aovs.a;
                }
                if ((aovsVar.b & 1) != 0) {
                    ImageView imageView2 = this.n;
                    aovs aovsVar2 = avhnVar.d;
                    if (aovsVar2 == null) {
                        aovsVar2 = aovs.a;
                    }
                    aovr aovrVar = aovsVar2.c;
                    if (aovrVar == null) {
                        aovrVar = aovr.a;
                    }
                    imageView2.setContentDescription(aovrVar.c);
                }
            }
        } else {
            abrh.c(spannableStringBuilder2, this.e.getResources().getDimensionPixelSize(R.dimen.live_chat_message_spacing) / this.d.getPaint().measureText(" "));
            abrh.a(this.e, spannableStringBuilder2, b3, R.style.live_chat_paid_sticker_deleted);
            this.n.setVisibility(8);
        }
        if (this.k != null && !TextUtils.isEmpty(spannableStringBuilder2)) {
            this.k.setText(spannableStringBuilder2);
            if ((asrxVar.b & 512) != 0) {
                this.k.setTextColor(asrxVar.j);
            }
        }
        ((GradientDrawable) this.o.getBackground()).setColor(asrxVar.i);
        TextView textView = this.d;
        arag aragVar5 = asrxVar.g;
        if (aragVar5 == null) {
            aragVar5 = arag.a;
        }
        textView.setText(ajgl.b(aragVar5));
        if ((asrxVar.b & 64) != 0) {
            this.d.setTextColor(asrxVar.h);
        }
        if ((asrxVar.b & 512) != 0) {
            this.k.setTextColor(asrxVar.j);
        }
        if ((asrxVar.b & 16) != 0) {
            ajnj ajnjVar = this.f;
            avhn avhnVar3 = asrxVar.f;
            if (avhnVar3 == null) {
                avhnVar3 = avhn.a;
            }
            ajnjVar.k(avhnVar3);
        }
        acte acteVar = new acte(actj.PDG_LIVE_CHAT_PAID_STICKER);
        this.a.n(acteVar);
        if ((asrxVar.b & 2) != 0) {
            this.c.setOnClickListener(new abmu(this, asrxVar, acteVar));
        }
    }

    @Override // defpackage.ajru
    public void qZ(ajsa ajsaVar) {
        this.c.setOnClickListener(null);
        this.f.a();
        this.d.setText((CharSequence) null);
        this.d.setTextColor(this.h);
        TextView textView = this.m;
        if (textView != null) {
            textView.setText((CharSequence) null);
        }
        TextView textView2 = this.l;
        if (textView2 != null) {
            textView2.setText((CharSequence) null);
        }
        TextView textView3 = this.k;
        if (textView3 != null) {
            textView3.setText((CharSequence) null);
            this.k.setTextColor(this.i);
        }
        this.g.e(this.n);
        this.n.setBackgroundColor(ake.d(this.e, R.color.yt_grey1));
        this.n.setContentDescription(null);
    }
}
