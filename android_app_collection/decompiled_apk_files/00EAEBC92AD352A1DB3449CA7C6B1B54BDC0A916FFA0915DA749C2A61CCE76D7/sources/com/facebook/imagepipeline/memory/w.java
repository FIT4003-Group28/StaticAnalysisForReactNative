package com.facebook.imagepipeline.memory;
/* loaded from: classes.dex */
public class w {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, int i2, int i3) {
        return Math.min(Math.max(0, i3 - i), i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(int i, int i2, int i3, int i4, int i5) {
        boolean z = true;
        c.d.d.d.i.a(i4 >= 0);
        c.d.d.d.i.a(i >= 0);
        c.d.d.d.i.a(i3 >= 0);
        c.d.d.d.i.a(i + i4 <= i5);
        if (i3 + i4 > i2) {
            z = false;
        }
        c.d.d.d.i.a(z);
    }
}
