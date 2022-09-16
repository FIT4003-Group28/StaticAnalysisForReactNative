package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.youtube.R;
import java.util.EnumMap;
/* compiled from: PG */
/* renamed from: wpn  reason: default package */
/* loaded from: classes4.dex */
public final class wpn {
    public final amup a;

    public wpn(amup amupVar) {
        this.a = amupVar;
    }

    public wpn(Context context) {
        umk[] values;
        int i;
        uml[] values2 = uml.values();
        int length = values2.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = values2[i2].h;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        EnumMap enumMap = new EnumMap(uml.class);
        for (int i3 = 0; i3 < values2.length; i3++) {
            try {
                uml umlVar = values2[i3];
                enumMap.put((EnumMap) umlVar, (uml) Integer.valueOf(obtainStyledAttributes.getColor(i3, context.getResources().getColor(umlVar.i))));
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        obtainStyledAttributes.recycle();
        this.a = amxp.h(enumMap);
        boolean b = b(context);
        amum h = amup.h();
        for (umk umkVar : umk.values()) {
            if (!b) {
                i = umkVar.f;
            } else {
                i = umkVar.e;
            }
            h.f(umkVar, Integer.valueOf(ake.d(context, i)));
        }
        h.b();
    }

    public static boolean b(Context context) {
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(R.attr.isLightTheme, typedValue, true) && typedValue.data != 0;
    }

    public final int a(uml umlVar) {
        Integer num = (Integer) this.a.get(umlVar);
        num.getClass();
        return num.intValue();
    }
}
