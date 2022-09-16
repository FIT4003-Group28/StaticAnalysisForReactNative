package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.provider.Settings;
import android.support.v7.widget.AppCompatImageView;
import android.text.SpannableStringBuilder;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: abpi  reason: default package */
/* loaded from: classes.dex */
public class abpi extends abop {
    private final abka A;
    private EditText B;
    private TextView C;
    private ImageView D;
    private ViewGroup E;
    private View F;
    public final View w;
    final ValueAnimator x;
    private final ajmy y;
    private final zhf z;

    public abpi(Context context, ajmy ajmyVar, ajxz ajxzVar, aafo aafoVar, abks abksVar, abkj abkjVar, ajvj ajvjVar, abjx abjxVar, zhf zhfVar, ajsk ajskVar, akge akgeVar, abka abkaVar, abhy abhyVar, View view, boolean z, boolean z2, acti actiVar) {
        super(context, zhfVar, ajxzVar, aafoVar, actiVar, abksVar, abkjVar, ajvjVar, abjxVar, ajskVar, akgeVar, abhyVar, z, z2);
        this.y = ajmyVar;
        this.w = view;
        this.z = zhfVar;
        this.A = abkaVar;
        this.x = ValueAnimator.ofInt(0, 20).setDuration(4000L);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.abop
    public final void A(int i) {
        int orElse;
        TextView v = v();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.a, this.z.a);
        if (v == null) {
            return;
        }
        if (r().getLineCount() > 1) {
            if (i > 0) {
                orElse = zhn.j(contextThemeWrapper, R.attr.liveChatActionPanelChipBackground).orElse(0);
            } else {
                orElse = zhn.j(contextThemeWrapper, R.attr.liveChatActionPanelChipBackgroundOverlimit).orElse(0);
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(Integer.toString(i));
            spannableStringBuilder.setSpan(new abla(contextThemeWrapper, zhn.j(contextThemeWrapper, R.attr.ytStaticBrandWhite).orElse(0), orElse, null), 0, spannableStringBuilder.length(), 33);
            v.setText(spannableStringBuilder.append((CharSequence) " "));
            v.setVisibility(0);
            return;
        }
        v.setVisibility(8);
    }

    @Override // defpackage.abop
    public final void F(avhn avhnVar) {
        this.y.h(s(), avhnVar);
    }

    @Override // defpackage.abop
    public final void G(boolean z) {
        t().setContentDescription(this.a.getResources().getString(z ? R.string.close_emoji_picker_button_cd : R.string.open_emoji_picker_button_cd));
        t().setColorFilter(g(arhr.EMOJI, z));
    }

    @Override // defpackage.abko
    public final void b() {
        ViewGroup q;
        int i = Settings.Global.getInt(this.a.getContentResolver(), "transition_animation_scale", 1);
        if (J() || !this.i || i == 0 || (q = q()) == null) {
            return;
        }
        ImageView imageView = null;
        int i2 = 0;
        for (int i3 = 0; i3 < q.getChildCount(); i3++) {
            View childAt = q.getChildAt(i3);
            if ("product-picker".equals(childAt.getTag(R.id.live_chat_picker_toggle_button_tag))) {
                i2++;
                imageView = childAt;
            }
        }
        if (i2 != 1 || imageView == null || !(imageView instanceof ImageView)) {
            return;
        }
        ImageView imageView2 = imageView;
        if (this.x.isRunning()) {
            this.x.end();
        }
        this.x.removeAllUpdateListeners();
        this.x.removeAllListeners();
        this.x.addUpdateListener(new abph(this, imageView2));
        this.x.addListener(new abpg(imageView2));
        this.x.start();
    }

    @Override // defpackage.abop
    public final int g(arhr arhrVar, boolean z) {
        arhr arhrVar2 = arhr.SUPER_CHAT_FOR_GOOD;
        int i = R.attr.ytIconInactive;
        if (arhrVar != arhrVar2) {
            if (z) {
                i = R.attr.liveChatEmojiPickerActiveIconColor;
            } else if (true == J()) {
                i = R.attr.ytStaticWhite;
            }
        }
        return zhn.j(new ContextThemeWrapper(this.a, this.z.a), i).orElse(0);
    }

    @Override // defpackage.abop
    public final View k(arhs arhsVar) {
        atve atveVar;
        int i;
        ajxz ajxzVar = this.d;
        arhr b = arhr.b(arhsVar.c);
        if (b == null) {
            b = arhr.UNKNOWN;
        }
        int a = ajxzVar.a(b);
        if (J()) {
            i = R.layout.live_chat_overlay_action_button_menu_toggle;
        } else {
            arhd a2 = this.A.a.a();
            if (a2 != null) {
                atveVar = a2.w;
                if (atveVar == null) {
                    atveVar = atve.a;
                }
            } else {
                atveVar = atve.a;
            }
            i = atveVar.c ? R.layout.live_chat_action_button_menu_toggle : R.layout.live_chat_action_button_menu_toggle_legacy;
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) LayoutInflater.from(this.a).inflate(i, q(), false);
        if (a != 0) {
            appCompatImageView.setImageResource(a);
            arhr b2 = arhr.b(arhsVar.c);
            if (b2 == null) {
                b2 = arhr.UNKNOWN;
            }
            appCompatImageView.setColorFilter(g(b2, false));
        }
        return appCompatImageView;
    }

    @Override // defpackage.abop
    public final View l() {
        return this.w.findViewById(R.id.live_chat_action_panel);
    }

    @Override // defpackage.abop
    public final View m() {
        return this.w.findViewById(R.id.live_chat_text_field_bar);
    }

    @Override // defpackage.abop
    public final View n() {
        return this.w;
    }

    @Override // defpackage.abop
    public final View o() {
        if (this.F == null) {
            this.F = this.w.findViewById(R.id.thumbnail_and_emoji_picker_container);
        }
        return this.F;
    }

    @Override // defpackage.abop
    public final ViewGroup p() {
        return (ViewGroup) this.w.findViewById(R.id.live_chat_button_menu);
    }

    @Override // defpackage.abop
    public final ViewGroup q() {
        if (this.E == null) {
            this.E = (ViewGroup) this.w.findViewById(R.id.inline_extra_buttons);
        }
        return this.E;
    }

    @Override // defpackage.abop
    public final EditText r() {
        if (this.B == null) {
            EditText editText = (EditText) this.w.findViewById(R.id.edit_text);
            this.B = editText;
            editText.setFocusable(true);
            this.B.setFocusableInTouchMode(true);
            this.B.setLongClickable(true);
        }
        return this.B;
    }

    @Override // defpackage.abop
    public final ImageView u() {
        if (this.D == null) {
            this.D = (ImageView) this.w.findViewById(R.id.live_chat_send_button);
        }
        return this.D;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.abop
    public final TextView v() {
        return (TextView) this.w.findViewById(R.id.character_counter);
    }

    @Override // defpackage.abop
    public final TextView w() {
        if (this.C == null) {
            this.C = (TextView) this.w.findViewById(R.id.restricted_participation_bar);
        }
        return this.C;
    }

    @Override // defpackage.abop
    public final void x() {
        this.B.getText().clear();
        zag.i(this.B);
    }
}
