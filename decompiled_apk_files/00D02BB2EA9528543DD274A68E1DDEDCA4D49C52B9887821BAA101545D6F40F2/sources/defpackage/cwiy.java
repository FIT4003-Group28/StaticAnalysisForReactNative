package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.EnumMap;
/* compiled from: PG */
/* renamed from: cwiy  reason: default package */
/* loaded from: classes5.dex */
public final class cwiy {
    private final dcdn<cwix, Integer> a;

    public cwiy(Context context) {
        cwix[] values = cwix.values();
        int length = values.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = values[i].h;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        EnumMap enumMap = new EnumMap(cwix.class);
        for (int i2 = 0; i2 < values.length; i2++) {
            try {
                cwix cwixVar = values[i2];
                enumMap.put((EnumMap) cwixVar, (cwix) Integer.valueOf(obtainStyledAttributes.getColor(i2, context.getResources().getColor(cwixVar.i))));
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
        obtainStyledAttributes.recycle();
        this.a = dcjz.c(enumMap);
    }

    public final int a(cwix cwixVar) {
        Integer num = this.a.get(cwixVar);
        dbsk.s(num);
        return num.intValue();
    }
}
