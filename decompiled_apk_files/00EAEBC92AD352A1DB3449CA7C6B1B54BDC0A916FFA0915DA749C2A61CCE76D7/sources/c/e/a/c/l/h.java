package c.e.a.c.l;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final a.e.g<String, i> f4746a = new a.e.g<>();

    /* renamed from: b  reason: collision with root package name */
    private final a.e.g<String, PropertyValuesHolder[]> f4747b = new a.e.g<>();

    public static h a(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return a(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return a(arrayList);
        } catch (Exception e2) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i), e2);
            return null;
        }
    }

    public static h a(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        return a(context, resourceId);
    }

    private static h a(List<Animator> list) {
        h hVar = new h();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a(hVar, list.get(i));
        }
        return hVar;
    }

    private static void a(h hVar, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            hVar.a(objectAnimator.getPropertyName(), objectAnimator.getValues());
            hVar.a(objectAnimator.getPropertyName(), i.a((ValueAnimator) objectAnimator));
            return;
        }
        throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
    }

    public long a() {
        int size = this.f4746a.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            i d2 = this.f4746a.d(i);
            j = Math.max(j, d2.a() + d2.b());
        }
        return j;
    }

    public i a(String str) {
        if (b(str)) {
            return this.f4746a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public void a(String str, i iVar) {
        this.f4746a.put(str, iVar);
    }

    public void a(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f4747b.put(str, propertyValuesHolderArr);
    }

    public boolean b(String str) {
        return this.f4746a.get(str) != null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            return this.f4746a.equals(((h) obj).f4746a);
        }
        return false;
    }

    public int hashCode() {
        return this.f4746a.hashCode();
    }

    public String toString() {
        return '\n' + h.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f4746a + "}\n";
    }
}
