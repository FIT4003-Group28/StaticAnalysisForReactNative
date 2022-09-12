package android.support.v7.app;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompatViewInflater {
    public final Object[] c = new Object[2];
    private static final Class<?>[] d = {Context.class, AttributeSet.class};
    public static final int[] a = {16843375};
    public static final String[] b = {"android.widget.", "android.view.", "android.webkit."};
    private static final aim<String, Constructor<? extends View>> e = new aim<>();

    public AppCompatTextView a(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public xd b(Context context, AttributeSet attributeSet) {
        return new xd(context, attributeSet);
    }

    public xe c(Context context, AttributeSet attributeSet) {
        return new xe(context, attributeSet);
    }

    public xq d(Context context, AttributeSet attributeSet) {
        return new xq(context, attributeSet);
    }

    public xb e(Context context, AttributeSet attributeSet) {
        return new xb(context, attributeSet);
    }

    public final void f(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    public final View g(Context context, String str, String str2) {
        String str3;
        aim<String, Constructor<? extends View>> aimVar = e;
        Constructor<? extends View> constructor = aimVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(d);
            aimVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.c);
    }
}
