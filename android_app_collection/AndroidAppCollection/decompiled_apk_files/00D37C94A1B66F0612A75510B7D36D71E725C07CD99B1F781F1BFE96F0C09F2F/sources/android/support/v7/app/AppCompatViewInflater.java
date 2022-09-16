package android.support.v7.app;

import android.content.Context;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Constructor;
/* compiled from: PG */
/* loaded from: classes.dex */
public class AppCompatViewInflater {
    public final Object[] c = new Object[2];
    private static final Class[] d = {Context.class, AttributeSet.class};
    public static final int[] a = {16843375};
    public static final String[] b = {"android.widget.", "android.view.", "android.webkit."};
    private static final agd e = new agd();

    public tx a(Context context, AttributeSet attributeSet) {
        return new tx(context, attributeSet);
    }

    public AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    public tz c(Context context, AttributeSet attributeSet) {
        return new tz(context, attributeSet);
    }

    public uj d(Context context, AttributeSet attributeSet) {
        return new uj(context, attributeSet);
    }

    public AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String str3;
        agd agdVar = e;
        Constructor constructor = (Constructor) agdVar.get(str);
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
            agdVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.c);
    }
}
