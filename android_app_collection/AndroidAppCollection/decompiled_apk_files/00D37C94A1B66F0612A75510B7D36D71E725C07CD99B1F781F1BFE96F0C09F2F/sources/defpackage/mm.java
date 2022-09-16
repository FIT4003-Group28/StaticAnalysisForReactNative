package defpackage;

import android.view.accessibility.AccessibilityRecord;
/* compiled from: PG */
/* renamed from: mm  reason: default package */
/* loaded from: classes3.dex */
public final class mm {
    public final AccessibilityRecord a;

    @Deprecated
    public mm(Object obj) {
        this.a = (AccessibilityRecord) obj;
    }

    @Deprecated
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm)) {
            return false;
        }
        mm mmVar = (mm) obj;
        AccessibilityRecord accessibilityRecord = this.a;
        if (accessibilityRecord == null) {
            if (mmVar.a != null) {
                return false;
            }
        } else if (!accessibilityRecord.equals(mmVar.a)) {
            return false;
        }
        return true;
    }

    @Deprecated
    public final int hashCode() {
        AccessibilityRecord accessibilityRecord = this.a;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }
}
