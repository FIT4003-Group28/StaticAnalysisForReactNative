package defpackage;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.google.android.youtube.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: ablx  reason: default package */
/* loaded from: classes.dex */
public final class ablx extends abny {
    private static final amup x;
    private aboc A;
    private boolean y;
    private abqv z;

    static {
        amum amumVar = new amum();
        amumVar.f(arhr.UNKNOWN, Integer.valueOf((int) R.style.live_chat_author_default));
        amumVar.f(arhr.OWNER, Integer.valueOf((int) R.style.live_chat_author_owner));
        amumVar.f(arhr.MODERATOR, Integer.valueOf((int) R.style.live_chat_banner_author_moderator));
        amumVar.f(arhr.MEMBER, Integer.valueOf((int) R.style.live_chat_banner_author_member));
        amumVar.f(arhr.VERIFIED, Integer.valueOf((int) R.style.live_chat_author_verified));
        x = amumVar.b();
    }

    public ablx(Activity activity, ajmy ajmyVar, aafo aafoVar, ajxz ajxzVar, ajvm ajvmVar, abkl abklVar, abjy abjyVar) {
        super(activity, ajmyVar, aafoVar, ajxzVar, ajvmVar, abklVar, abjyVar, zhf.a(2132084076));
        this.g.setAlpha(0.0f);
    }

    @Override // defpackage.abny, defpackage.abmz
    protected final View d() {
        return null;
    }

    @Override // defpackage.abny, defpackage.abmz
    protected final amup e() {
        return x;
    }

    @Override // defpackage.abmz
    protected final List f(List list) {
        return ajvh.b(list, amup.m(arhr.VERIFIED, Integer.valueOf(zhn.d(this.e, R.attr.ytIconActiveOther)), arhr.MODERATOR, Integer.valueOf(zhn.d(this.e, R.attr.ytIconActiveOther)), arhr.MEMBER, Integer.valueOf(zhn.d(this.e, R.attr.ytIconActiveOther))));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.abny, defpackage.abmz
    public final void g(SpannableStringBuilder spannableStringBuilder, SpannableStringBuilder spannableStringBuilder2, SpannableStringBuilder spannableStringBuilder3, StringBuilder sb) {
        super.g(spannableStringBuilder, spannableStringBuilder2, spannableStringBuilder3, sb);
        if (this.y) {
            this.w.setSingleLine(true);
        } else {
            this.w.setSingleLine(false);
        }
        this.A.a(this.c);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.g, View.ALPHA, 1.0f);
        ofFloat.setDuration(600L);
        ofFloat.start();
    }

    @Override // defpackage.abny, defpackage.abmz
    public final void h(View view) {
        abqv abqvVar = this.z;
        if (abqvVar != null) {
            abqvVar.g();
        } else {
            super.h(view);
        }
    }

    @Override // defpackage.abmz
    public final void i(ajrs ajrsVar, asrf asrfVar) {
        this.y = ajrsVar.j("render_content_collapsed", false);
        this.z = (abqv) ajrsVar.d("on_content_clicked_listener", null);
        this.A = (aboc) ajrsVar.d("accessibility_data_receiver_key", null);
        super.oK(ajrsVar, asrfVar);
    }

    @Override // defpackage.abny, defpackage.abmz
    protected final boolean j() {
        return false;
    }

    @Override // defpackage.abmz
    protected final boolean k() {
        return false;
    }

    @Override // defpackage.abmz, defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        oK(ajrsVar, (asrf) obj);
    }

    @Override // defpackage.abny, defpackage.abmz, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        super.qZ(ajsaVar);
        this.g.setAlpha(1.0f);
    }
}
