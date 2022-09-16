package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;
/* compiled from: PG */
/* renamed from: mg  reason: default package */
/* loaded from: classes3.dex */
public final class mg {
    final Object a;

    public mg(Object obj) {
        this.a = obj;
    }

    public static mg a(int i, int i2, int i3, int i4, boolean z) {
        return new mg(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }
}
