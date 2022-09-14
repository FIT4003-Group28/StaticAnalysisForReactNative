package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;
/* compiled from: PG */
/* renamed from: pa  reason: default package */
/* loaded from: classes.dex */
public final class pa {
    final Object a;

    public pa(Object obj) {
        this.a = obj;
    }

    public static pa a(int i, int i2, int i3, int i4, boolean z) {
        return new pa(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, false, z));
    }
}
