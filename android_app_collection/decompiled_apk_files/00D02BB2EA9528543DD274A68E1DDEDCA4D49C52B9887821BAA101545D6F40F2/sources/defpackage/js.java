package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: js  reason: default package */
/* loaded from: classes.dex */
final class js {
    final int[] a;
    final float[] b;

    public js(int i, int i2) {
        this.a = new int[]{i, i2};
        this.b = new float[]{0.0f, 1.0f};
    }

    public js(int i, int i2, int i3) {
        this.a = new int[]{i, i2, i3};
        this.b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public js(List<Integer> list, List<Float> list2) {
        int size = list.size();
        this.a = new int[size];
        this.b = new float[size];
        for (int i = 0; i < size; i++) {
            this.a[i] = list.get(i).intValue();
            this.b[i] = list2.get(i).floatValue();
        }
    }
}
