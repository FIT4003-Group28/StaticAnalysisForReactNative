package defpackage;

import android.os.Build;
/* compiled from: PG */
/* renamed from: pu  reason: default package */
/* loaded from: classes.dex */
public interface pu {
    public static final boolean a;

    static {
        a = Build.VERSION.SDK_INT >= 27;
    }

    void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4);

    void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i);
}
