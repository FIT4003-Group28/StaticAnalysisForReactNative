package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;
/* compiled from: PG */
/* renamed from: pb  reason: default package */
/* loaded from: classes7.dex */
public final class pb {
    final Object a;

    public pb(Object obj) {
        this.a = obj;
    }

    public static pb a(float f, float f2, float f3) {
        return new pb(AccessibilityNodeInfo.RangeInfo.obtain(0, f, f2, f3));
    }
}
