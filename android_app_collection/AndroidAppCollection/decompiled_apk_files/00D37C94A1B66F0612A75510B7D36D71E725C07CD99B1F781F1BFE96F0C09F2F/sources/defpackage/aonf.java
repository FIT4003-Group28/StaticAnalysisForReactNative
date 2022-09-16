package defpackage;

import android.view.accessibility.AccessibilityNodeInfo;
/* compiled from: PG */
/* renamed from: aonf  reason: default package */
/* loaded from: classes.dex */
public final class aonf {
    public final Object a;

    public aonf(Object obj) {
        this.a = obj;
    }

    public static aonf a(int i, int i2, int i3) {
        return new aonf(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, false, i3));
    }
}
