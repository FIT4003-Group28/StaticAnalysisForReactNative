package defpackage;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: doh  reason: default package */
/* loaded from: classes6.dex */
public final class doh {
    public final ViewGroup a;
    public final TextView b;
    public final TextView c;
    public int g = 3;
    @dzsi
    public doa f = doa.DEFAULT;
    @dzsi
    public String d = "";
    @dzsi
    public String e = "";

    public doh(ViewGroup viewGroup) {
        this.a = viewGroup;
        this.b = (TextView) viewGroup.findViewById(R.id.title);
        this.c = (TextView) viewGroup.findViewById(R.id.subtitle);
    }

    public static boolean b(@dzsi String str, @dzsi String str2) {
        return TextUtils.equals(str, str2) || (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2));
    }

    public final void a(boolean z) {
        this.a.clearAnimation();
        this.a.setAlpha(1.0f);
        if (this.g != 1 && !z && (!TextUtils.isEmpty(this.d) || !TextUtils.isEmpty(this.e))) {
            this.a.setVisibility(0);
            if (this.g != 2) {
                return;
            }
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setInterpolator(new DecelerateInterpolator());
            alphaAnimation.setDuration(2500L);
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setInterpolator(new AccelerateInterpolator());
            alphaAnimation2.setStartOffset(2500L);
            alphaAnimation2.setDuration(2500L);
            alphaAnimation2.setAnimationListener(new dog(this));
            AnimationSet animationSet = new AnimationSet(false);
            animationSet.addAnimation(alphaAnimation);
            animationSet.addAnimation(alphaAnimation2);
            this.a.startAnimation(animationSet);
            return;
        }
        this.a.setVisibility(4);
    }
}
