package defpackage;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Property;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: czur  reason: default package */
/* loaded from: classes.dex */
public final class czur {
    private final aim<String, czus> a = new aim<>();
    private final aim<String, PropertyValuesHolder[]> b = new aim<>();

    public static czur f(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return g(context, resourceId);
    }

    public static czur g(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return h(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return h(arrayList);
        } catch (Exception unused) {
            if (String.valueOf(Integer.toHexString(i)).length() == 0) {
                new String("Can't load animation resource ID #0x");
            }
            return null;
        }
    }

    private static czur h(List<Animator> list) {
        czur czurVar = new czur();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Animator animator = list.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                czurVar.d(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = czum.b;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = czum.c;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = czum.d;
                }
                czus czusVar = new czus(startDelay, duration, interpolator);
                czusVar.a = objectAnimator.getRepeatCount();
                czusVar.b = objectAnimator.getRepeatMode();
                czurVar.a.put(propertyName, czusVar);
            } else {
                String valueOf = String.valueOf(animator);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
                sb.append("Animator must be an ObjectAnimator: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return czurVar;
    }

    public final czus a(String str) {
        if (this.a.get(str) == null) {
            throw new IllegalArgumentException();
        }
        return this.a.get(str);
    }

    public final boolean b(String str) {
        return this.b.get(str) != null;
    }

    public final PropertyValuesHolder[] c(String str) {
        if (!b(str)) {
            throw new IllegalArgumentException();
        }
        PropertyValuesHolder[] propertyValuesHolderArr = this.b.get(str);
        PropertyValuesHolder[] propertyValuesHolderArr2 = new PropertyValuesHolder[propertyValuesHolderArr.length];
        for (int i = 0; i < propertyValuesHolderArr.length; i++) {
            propertyValuesHolderArr2[i] = propertyValuesHolderArr[i].clone();
        }
        return propertyValuesHolderArr2;
    }

    public final void d(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.b.put(str, propertyValuesHolderArr);
    }

    public final <T> ObjectAnimator e(String str, T t, Property<T, ?> property) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(t, c(str));
        ofPropertyValuesHolder.setProperty(property);
        a(str).a(ofPropertyValuesHolder);
        return ofPropertyValuesHolder;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof czur) {
            return this.a.equals(((czur) obj).a);
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
