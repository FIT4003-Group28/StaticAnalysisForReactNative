package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: alhy  reason: default package */
/* loaded from: classes.dex */
public final class alhy {
    private final agd a = new agd();
    private final agd b = new agd();

    public static alhy a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        alhy alhyVar = null;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            try {
                Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId);
                if (loadAnimator instanceof AnimatorSet) {
                    alhyVar = c(((AnimatorSet) loadAnimator).getChildAnimations());
                } else if (loadAnimator != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(loadAnimator);
                    alhyVar = c(arrayList);
                }
            } catch (Exception e) {
                String valueOf = String.valueOf(Integer.toHexString(resourceId));
                Log.w("MotionSpec", valueOf.length() != 0 ? "Can't load animation resource ID #0x".concat(valueOf) : new String("Can't load animation resource ID #0x"), e);
            }
        }
        return alhyVar;
    }

    private static alhy c(List list) {
        alhy alhyVar = new alhy();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) list.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                alhyVar.b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = alhv.b;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = alhv.c;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = alhv.d;
                }
                alhz alhzVar = new alhz(startDelay, duration, interpolator);
                alhzVar.a = objectAnimator.getRepeatCount();
                alhzVar.b = objectAnimator.getRepeatMode();
                alhyVar.a.put(propertyName, alhzVar);
            } else {
                String valueOf = String.valueOf(animator);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                sb.append("Animator must be an ObjectAnimator: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return alhyVar;
    }

    public final alhz b(String str) {
        if (this.a.get(str) == null) {
            throw new IllegalArgumentException();
        }
        return (alhz) this.a.get(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof alhy) {
            return this.a.equals(((alhy) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }
}
