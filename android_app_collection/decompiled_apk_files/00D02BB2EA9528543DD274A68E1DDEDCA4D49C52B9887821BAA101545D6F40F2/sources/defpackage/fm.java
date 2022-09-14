package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fm  reason: default package */
/* loaded from: classes.dex */
public final class fm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static fk a(Context context, fd fdVar, boolean z) {
        fa faVar = fdVar.S;
        int i = faVar == null ? 0 : faVar.d;
        int au = fdVar.au();
        fdVar.av(0);
        ViewGroup viewGroup = fdVar.O;
        if (viewGroup != null && viewGroup.getTag(R.id.visible_removing_fragment_view_tag) != null) {
            fdVar.O.setTag(R.id.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup2 = fdVar.O;
        if (viewGroup2 == null || viewGroup2.getLayoutTransition() == null) {
            if (au != 0) {
                boolean equals = "anim".equals(context.getResources().getResourceTypeName(au));
                if (equals) {
                    try {
                        Animation loadAnimation = AnimationUtils.loadAnimation(context, au);
                        if (loadAnimation != null) {
                            return new fk(loadAnimation);
                        }
                    } catch (Resources.NotFoundException e) {
                        throw e;
                    } catch (RuntimeException unused) {
                    }
                }
                try {
                    Animator loadAnimator = AnimatorInflater.loadAnimator(context, au);
                    if (loadAnimator != null) {
                        return new fk(loadAnimator);
                    }
                } catch (RuntimeException e2) {
                    if (equals) {
                        throw e2;
                    }
                    Animation loadAnimation2 = AnimationUtils.loadAnimation(context, au);
                    if (loadAnimation2 != null) {
                        return new fk(loadAnimation2);
                    }
                }
            }
            if (i == 0) {
                return null;
            }
            int i2 = i != 4097 ? i != 4099 ? i != 8194 ? -1 : true != z ? R.anim.fragment_close_exit : R.anim.fragment_close_enter : true != z ? R.anim.fragment_fade_exit : R.anim.fragment_fade_enter : true != z ? R.anim.fragment_open_exit : R.anim.fragment_open_enter;
            if (i2 >= 0) {
                return new fk(AnimationUtils.loadAnimation(context, i2));
            }
            return null;
        }
        return null;
    }
}
