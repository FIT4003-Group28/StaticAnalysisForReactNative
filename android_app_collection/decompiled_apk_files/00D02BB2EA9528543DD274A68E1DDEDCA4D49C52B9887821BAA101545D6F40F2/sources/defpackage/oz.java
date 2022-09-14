package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;
/* compiled from: PG */
/* renamed from: oz  reason: default package */
/* loaded from: classes7.dex */
public final class oz {
    final Object a;

    public oz(Object obj) {
        this.a = obj;
    }

    public static oz a(int i, int i2) {
        return new oz(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false));
    }

    public static oz b(int i, int i2, int i3) {
        return new oz(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
    }
}
