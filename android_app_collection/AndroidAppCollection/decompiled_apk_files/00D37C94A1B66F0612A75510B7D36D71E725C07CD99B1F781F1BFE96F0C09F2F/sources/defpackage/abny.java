package defpackage;

import android.app.Activity;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.List;
/* compiled from: PG */
/* renamed from: abny  reason: default package */
/* loaded from: classes.dex */
public class abny extends abmz {
    private static final amup x;
    protected final TextView w;
    private final ajmy y;

    static {
        amum amumVar = new amum();
        amumVar.f(arhr.UNKNOWN, Integer.valueOf((int) R.style.live_chat_author_default));
        amumVar.f(arhr.OWNER, Integer.valueOf((int) R.style.live_chat_author_owner));
        amumVar.f(arhr.MODERATOR, Integer.valueOf((int) R.style.live_chat_author_moderator));
        amumVar.f(arhr.MEMBER, Integer.valueOf((int) R.style.live_chat_author_member));
        amumVar.f(arhr.VERIFIED, Integer.valueOf((int) R.style.live_chat_author_verified));
        x = amumVar.b();
    }

    public abny(Activity activity, ajmy ajmyVar, aafo aafoVar, ajxz ajxzVar, ajvm ajvmVar, abkl abklVar, abjy abjyVar, zhf zhfVar) {
        super(activity, ajxzVar, aafoVar, ajvmVar, abklVar, abjyVar, zhfVar);
        this.y = ajmyVar;
        TextView textView = (TextView) this.g.findViewById(R.id.chat_message);
        textView.getClass();
        this.w = textView;
        textView.setOnClickListener(this.o);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setFilters(new InputFilter[]{new ajvr(textView, this.d.getResources().getDimension(R.dimen.live_chat_unicode_emoji_text_size), (int) this.d.getResources().getDimension(R.dimen.live_chat_unicode_emoji_vertical_shift))});
    }

    @Override // defpackage.abmz
    protected View d() {
        return this.g.findViewById(R.id.highlight_bar);
    }

    @Override // defpackage.abmz
    protected amup e() {
        return x;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.abmz
    public void g(SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, SpannableStringBuilder spannableStringBuilder3, StringBuilder sb) {
        arag aragVar;
        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
        if (spannableStringBuilder3.length() != 0) {
            spannableStringBuilder4.append((CharSequence) spannableStringBuilder3);
            abrh.c(spannableStringBuilder4, this.m);
        }
        spannableStringBuilder4.append((CharSequence) spannableStringBuilder);
        List list = this.l;
        if (list != null && !list.isEmpty()) {
            this.a.b(spannableStringBuilder4, sb, this.l, this.n, this.k, this.w.getId(), this.q);
        }
        abrh.c(spannableStringBuilder4, this.m);
        spannableStringBuilder4.append((CharSequence) spannableStringBuilder2);
        q(spannableStringBuilder4);
        boolean e = zdg.e(this.d);
        if (e) {
            sb.append((CharSequence) spannableStringBuilder2);
        }
        this.w.setText(spannableStringBuilder4);
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
            ajvoVar.g(aragVar3, ajgl.b(aragVar), spannableStringBuilder4, sb, this.k, this.w.getId());
        }
        if (e) {
            this.w.setContentDescription(sb);
        }
    }

    @Override // defpackage.abmz
    public void h(View view) {
        if (this.j != null) {
            HashMap hashMap = new HashMap();
            asrf asrfVar = this.k;
            if (asrfVar != null) {
                hashMap.put("context_menu_header_renderer_key", asrfVar);
            }
            this.f.c(this.j, hashMap);
        }
    }

    @Override // defpackage.abmz
    protected boolean j() {
        return true;
    }

    @Override // defpackage.abmz
    protected final int l() {
        return zhn.j(this.d, R.attr.ytTextDisabled).orElse(0);
    }

    @Override // defpackage.abmz
    protected final int m() {
        return R.layout.live_chat_light_text_item;
    }

    @Override // defpackage.abmz
    protected final ImageView n() {
        return (ImageView) this.g.findViewById(R.id.avatar);
    }

    @Override // defpackage.abmz
    protected final TextView o() {
        return (TextView) this.g.findViewById(R.id.chat_message);
    }

    @Override // defpackage.abmz
    protected final void p(avhn avhnVar) {
        this.y.h(this.h, avhnVar);
    }

    @Override // defpackage.abmz, defpackage.ajru
    public void qZ(ajsa ajsaVar) {
        this.a.e();
        this.v.e();
        this.k = null;
        this.l = null;
        this.r = null;
        this.s = false;
        this.p = false;
        this.t = false;
        this.q = false;
        this.g.setContentDescription(null);
        this.y.e(this.h);
        this.g.setBackgroundColor(0);
    }

    @Override // defpackage.abmz
    protected final boolean r() {
        return true;
    }

    @Override // defpackage.abmz
    public final boolean s() {
        return true;
    }
}
