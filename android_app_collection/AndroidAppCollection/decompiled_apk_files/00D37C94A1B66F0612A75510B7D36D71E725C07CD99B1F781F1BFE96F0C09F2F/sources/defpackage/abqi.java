package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: abqi  reason: default package */
/* loaded from: classes.dex */
public final class abqi {
    public final View a;
    public final TextView b;
    public final ClipDrawable c;
    public final GradientDrawable d;
    public final ImageView e;
    public final ProgressBar f;
    public final Context g;
    public apzg h;
    public boolean i;
    public final abqk j;
    private final TextView k;
    private final GradientDrawable l;

    public abqi(final Context context, abqk abqkVar) {
        context.getClass();
        this.g = context;
        this.j = abqkVar;
        View inflate = View.inflate(context, R.layout.live_chat_poll_choice_item, null);
        this.a = inflate;
        this.k = (TextView) inflate.findViewById(R.id.choice_label);
        this.b = (TextView) inflate.findViewById(R.id.vote_percentage);
        this.e = (ImageView) inflate.findViewById(R.id.selected_icon);
        this.f = (ProgressBar) inflate.findViewById(R.id.progress_bar);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.topMargin = context.getResources().getDimensionPixelOffset(R.dimen.live_chat_polls_choice_item_margin_top);
        inflate.setLayoutParams(marginLayoutParams);
        GradientDrawable gradientDrawable = (GradientDrawable) akf.a(context, R.drawable.live_chat_poll_choice_item_background);
        this.d = gradientDrawable;
        gradientDrawable.mutate();
        GradientDrawable gradientDrawable2 = (GradientDrawable) akf.a(context, R.drawable.live_chat_poll_choice_item_background);
        this.l = gradientDrawable2;
        gradientDrawable2.mutate();
        gradientDrawable2.setStroke(0, 0);
        ClipDrawable clipDrawable = new ClipDrawable(gradientDrawable2, 8388611, 1);
        this.c = clipDrawable;
        inflate.setBackground(new LayerDrawable(new Drawable[]{gradientDrawable, (RippleDrawable) akf.a(context, R.drawable.live_chat_poll_choice_item_ripple), clipDrawable}));
        inflate.setOnClickListener(new View.OnClickListener() { // from class: abqh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                abqi abqiVar = abqi.this;
                Context context2 = context;
                apzg apzgVar = abqiVar.h;
                if (apzgVar == null) {
                    return;
                }
                abqiVar.i = true;
                abqq abqqVar = abqiVar.j.a;
                abqqVar.i.removeCallbacks(abqqVar.h);
                abqqVar.i.postDelayed(abqqVar.h, 2000L);
                for (abqi abqiVar2 : abqqVar.g) {
                    abqiVar2.a.setClickable(false);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", abqqVar.c);
                hashMap.put("live_chat_poll_error_listener_key", abqqVar);
                abqqVar.b.c(apzgVar, hashMap);
                abqqVar.r = true;
                abqiVar.e.setVisibility(0);
                abqiVar.d.setStroke(context2.getResources().getDimensionPixelOffset(R.dimen.live_chat_polls_selected_choice_stroke_width), ake.f(context2, R.color.yt_white1));
            }
        });
    }

    public final void a(aufc aufcVar, Boolean bool) {
        if ((aufcVar.b & 1) != 0) {
            TextView textView = this.k;
            arag aragVar = aufcVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            textView.setText(ajgl.b(aragVar));
        }
        if (this.h == null && (aufcVar.b & 128) != 0) {
            apzg apzgVar = aufcVar.i;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            this.h = apzgVar;
        }
        this.i = this.i || aufcVar.d;
        this.f.setVisibility(8);
        this.e.setVisibility(8);
        if (bool.booleanValue()) {
            this.a.setClickable(false);
            if ((aufcVar.b & 16) != 0) {
                ClipDrawable clipDrawable = this.c;
                ObjectAnimator.ofInt(clipDrawable, "level", clipDrawable.getLevel(), (int) (aufcVar.f * 10000.0d)).setDuration(500L).start();
            }
            if ((aufcVar.b & 32) == 0) {
                this.b.setVisibility(8);
            } else {
                TextView textView2 = this.b;
                arag aragVar2 = aufcVar.g;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
                textView2.setText(ajgl.b(aragVar2));
                this.b.setVisibility(0);
            }
            if (this.i) {
                this.d.setStroke(this.g.getResources().getDimensionPixelOffset(R.dimen.live_chat_polls_selected_choice_stroke_width), ake.f(this.g, R.color.yt_white1));
            }
            this.l.setColor(ake.d(this.g, R.color.yt_white1_opacity10));
            int d = ake.d(this.g, R.color.yt_white1);
            this.k.setTextColor(d);
            this.b.setTextColor(d);
        }
    }
}
