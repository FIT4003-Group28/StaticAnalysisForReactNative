package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.style.ClickableSpan;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.text.DateFormat;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: abmz  reason: default package */
/* loaded from: classes.dex */
public abstract class abmz implements ajru {
    private static Locale w;
    private static DateFormat x;
    private final SpannableStringBuilder A;
    private final abkl B;
    private final ajxz C;
    private final abjy D;
    protected final ajvi a;
    protected final ajvq b;
    protected final StringBuilder c;
    protected final Context d;
    protected final Context e;
    protected final aafo f;
    protected final View g;
    protected final ImageView h;
    protected final View i;
    protected apzg j;
    protected asrf k;
    protected List l;
    protected final float m;
    protected final float n;
    protected final View.OnClickListener o;
    protected boolean p;
    protected boolean q;
    public CharSequence r;
    public boolean s;
    public boolean t;
    public boolean u;
    protected final ajvo v;
    private final SpannableStringBuilder y;
    private final SpannableStringBuilder z;

    static {
        amum amumVar = new amum();
        amumVar.f(arhr.UNKNOWN, Integer.valueOf((int) R.style.live_chat_author_default));
        amumVar.f(arhr.OWNER, Integer.valueOf((int) R.style.live_chat_author_owner));
        amumVar.f(arhr.MODERATOR, Integer.valueOf((int) R.style.live_chat_author_moderator));
        amumVar.f(arhr.MEMBER, Integer.valueOf((int) R.style.live_chat_author_member));
        amumVar.f(arhr.VERIFIED, Integer.valueOf((int) R.style.live_chat_author_verified));
        amumVar.b();
    }

    public abmz(Context context, ajxz ajxzVar, aafo aafoVar, ajvm ajvmVar, abkl abklVar, abjy abjyVar, zhf zhfVar) {
        this.d = context;
        this.f = aafoVar;
        this.C = ajxzVar;
        this.B = abklVar;
        this.D = abjyVar;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, zhfVar.a);
        this.e = contextThemeWrapper;
        View inflate = View.inflate(contextThemeWrapper, m(), null);
        this.g = inflate;
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: abmw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                abmz abmzVar = abmz.this;
                if (abmzVar.t) {
                    abmzVar.t = false;
                } else if (abmzVar.u) {
                } else {
                    abmzVar.h(view);
                }
            }
        };
        this.o = onClickListener;
        inflate.setOnClickListener(onClickListener);
        this.h = n();
        this.i = d();
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.live_chat_message_spacing);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.live_chat_badge_spacing);
        float measureText = o().getPaint().measureText(" ");
        this.m = dimensionPixelSize / measureText;
        this.n = dimensionPixelOffset / measureText;
        ajvq ajvqVar = new ajvq(inflate);
        this.b = ajvqVar;
        this.a = new ajvi(context, ajxzVar, ajvmVar, r(), ajvqVar, false);
        this.v = new ajvo(context, ajvmVar, r(), ajvqVar);
        this.y = new SpannableStringBuilder();
        this.z = new SpannableStringBuilder();
        this.A = new SpannableStringBuilder();
        this.c = new StringBuilder();
    }

    private static boolean t(List list, arhr arhrVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((ajvh) it.next()).b == arhrVar) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.g;
    }

    protected View d() {
        return null;
    }

    protected amup e() {
        throw null;
    }

    protected List f(List list) {
        return ajvh.b(list, amup.k(arhr.VERIFIED, Integer.valueOf(zhn.d(this.e, R.attr.ytIconActiveOther))));
    }

    protected abstract void g(SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, SpannableStringBuilder spannableStringBuilder3, StringBuilder sb);

    /* JADX INFO: Access modifiers changed from: protected */
    public void h(View view) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x0308  */
    @Override // defpackage.ajru
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void oK(defpackage.ajrs r27, defpackage.asrf r28) {
        /*
            Method dump skipped, instructions count: 1114
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abmz.oK(ajrs, asrf):void");
    }

    protected boolean j() {
        return false;
    }

    protected boolean k() {
        return true;
    }

    protected abstract int l();

    protected abstract int m();

    protected abstract ImageView n();

    protected abstract TextView o();

    protected abstract void p(avhn avhnVar);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void q(SpannableStringBuilder spannableStringBuilder) {
        ClickableSpan[] clickableSpanArr;
        for (ClickableSpan clickableSpan : (ClickableSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ClickableSpan.class)) {
            spannableStringBuilder.setSpan(new abmy(this, clickableSpan), spannableStringBuilder.getSpanStart(clickableSpan), spannableStringBuilder.getSpanEnd(clickableSpan), spannableStringBuilder.getSpanFlags(clickableSpan));
            spannableStringBuilder.removeSpan(clickableSpan);
        }
    }

    @Override // defpackage.ajru
    public void qZ(ajsa ajsaVar) {
        throw null;
    }

    protected abstract boolean r();

    protected boolean s() {
        return false;
    }
}
