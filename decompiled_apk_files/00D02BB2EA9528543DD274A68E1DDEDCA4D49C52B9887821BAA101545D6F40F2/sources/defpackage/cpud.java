package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
/* compiled from: PG */
/* renamed from: cpud  reason: default package */
/* loaded from: classes5.dex */
public final class cpud {
    public int b;
    public int d;
    public boolean h;
    public float i;
    public float j;
    public int l;
    public boolean c = true;
    public boolean a = true;
    public int k = 1;
    public boolean e = false;
    public int f = 128;
    public boolean g = false;

    public cpud(Context context) {
        this.b = Math.round(cpqk.a(context, 2.0f));
        this.d = Math.round(cpqk.a(context, 3.0f));
        cpqk.a(context, 2.0f);
        this.l = 1;
        this.h = true;
        this.i = 0.1f;
        this.j = 0.5f;
    }

    public static cpud a(Context context, AttributeSet attributeSet, int i) {
        cpud cpudVar = new cpud(context);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cpnw.e, i, 0);
        cpudVar.a = obtainStyledAttributes.getBoolean(4, cpudVar.a);
        cpudVar.b = obtainStyledAttributes.getDimensionPixelSize(6, cpudVar.b);
        int i2 = cpudVar.k;
        int i3 = obtainStyledAttributes.getInt(8, -1);
        if (i3 != -1) {
            i2 = i3 != 1 ? i3 != 2 ? 1 : 3 : 2;
        }
        cpudVar.k = i2;
        cpudVar.d = obtainStyledAttributes.getDimensionPixelSize(7, cpudVar.d);
        cpudVar.e = obtainStyledAttributes.getBoolean(3, cpudVar.e);
        cpudVar.f = Math.max(0, Math.min(255, obtainStyledAttributes.getInt(0, cpudVar.f)));
        cpudVar.g = obtainStyledAttributes.getBoolean(9, cpudVar.g);
        int i4 = obtainStyledAttributes.getInt(5, 0);
        if (i4 == 1) {
            boolean z = obtainStyledAttributes.getBoolean(10, true);
            cpudVar.l = 2;
            cpudVar.h = z;
            cpudVar.c = false;
        } else if (i4 != 2) {
            cpudVar.l = 1;
            cpudVar.c = true;
        } else {
            float f = obtainStyledAttributes.getFloat(2, 0.1f);
            float f2 = obtainStyledAttributes.getFloat(1, 0.5f);
            cpudVar.l = 3;
            cpudVar.i = f;
            cpudVar.j = f2;
            cpudVar.c = true;
        }
        obtainStyledAttributes.recycle();
        return cpudVar;
    }
}
