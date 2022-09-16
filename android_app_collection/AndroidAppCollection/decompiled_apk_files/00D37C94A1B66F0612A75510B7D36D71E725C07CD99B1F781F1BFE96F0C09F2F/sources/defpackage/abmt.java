package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: abmt  reason: default package */
/* loaded from: classes.dex */
public class abmt implements ajru {
    public final aafo a;
    public final acti b;
    protected final Context c;
    protected final View d;
    protected final View e;
    protected final View f;
    protected final ImageView g;
    protected final ImageView h;
    protected final TextView i;
    protected final TextView j;
    protected final TextView k;
    protected final TextView l;
    protected final Map m;
    private final ajvq n;
    private final SpannableStringBuilder o;
    private final StringBuilder p;
    private final ajxz q;
    private final ajnj r;
    private final ajnj s;
    private final abka t;
    private final View u;
    private final LinearLayout v;
    private final TextView w;
    private boolean x;
    private CharSequence y;
    private final ajvo z;

    public abmt(Context context, ajmr ajmrVar, acth acthVar, aafo aafoVar, ajvm ajvmVar, ajxz ajxzVar, abka abkaVar) {
        this.c = context;
        this.b = acthVar.oi();
        this.a = aafoVar;
        this.q = ajxzVar;
        this.t = abkaVar;
        View inflate = LayoutInflater.from(context).inflate(d(), (ViewGroup) null);
        this.d = inflate;
        View findViewById = inflate.findViewById(R.id.top_bar);
        this.e = findViewById;
        View findViewById2 = inflate.findViewById(R.id.bottom_bar);
        this.f = findViewById2;
        ImageView imageView = (ImageView) findViewById.findViewById(R.id.avatar);
        this.g = imageView;
        this.i = (TextView) findViewById.findViewById(R.id.author);
        ImageView imageView2 = (ImageView) findViewById.findViewById(R.id.currency_image);
        this.h = imageView2;
        this.j = (TextView) findViewById.findViewById(R.id.amount);
        this.k = (TextView) findViewById.findViewById(R.id.time);
        TextView textView = (TextView) findViewById2.findViewById(R.id.message);
        this.l = textView;
        this.u = inflate.findViewById(R.id.underline);
        this.v = (LinearLayout) findViewById2.findViewById(R.id.footer_body);
        this.w = (TextView) findViewById2.findViewById(R.id.footer_text);
        this.m = new HashMap();
        Resources resources = context.getResources();
        ViewGroup.MarginLayoutParams g = g();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_paid_message_margin);
        zgd.u(inflate, new abmf(g, 2), zgd.b(zgd.l(dimensionPixelOffset), zgd.k(dimensionPixelOffset)), ViewGroup.MarginLayoutParams.class);
        this.o = new SpannableStringBuilder();
        this.p = new StringBuilder();
        ajvq ajvqVar = new ajvq(inflate);
        this.n = ajvqVar;
        this.z = new ajvo(context, ajvmVar, true, ajvqVar);
        this.r = new ajnj(ajmrVar, imageView);
        this.s = new ajnj(ajmrVar, imageView2);
        textView.setFilters(new InputFilter[]{new ajvr(textView, context.getResources().getDimension(R.dimen.live_chat_unicode_emoji_text_size), (int) context.getResources().getDimension(R.dimen.live_chat_unicode_emoji_vertical_shift))});
    }

    private final SpannableStringBuilder i(arag aragVar) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        abrh.a(this.c, spannableStringBuilder, ajgl.b(aragVar), R.style.live_chat_paid_message_deleted);
        return spannableStringBuilder;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.d;
    }

    protected int d() {
        return R.layout.live_chat_paid_message;
    }

    protected int e() {
        return R.drawable.live_chat_paid_message_full_background;
    }

    protected int f() {
        return R.drawable.live_chat_paid_message_top_background;
    }

    protected ViewGroup.MarginLayoutParams g() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:186:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017d  */
    @Override // defpackage.ajru
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void oK(defpackage.ajrs r16, defpackage.asrw r17) {
        /*
            Method dump skipped, instructions count: 819
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abmt.oK(ajrs, asrw):void");
    }

    @Override // defpackage.ajru
    public void qZ(ajsa ajsaVar) {
        this.z.e();
        this.r.a();
        this.s.a();
        this.x = false;
        LinearLayout linearLayout = this.v;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        this.d.setOnClickListener(null);
    }
}
