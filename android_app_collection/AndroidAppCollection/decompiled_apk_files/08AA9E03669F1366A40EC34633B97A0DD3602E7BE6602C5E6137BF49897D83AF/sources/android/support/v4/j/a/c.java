package android.support.v4.j.a;

import android.os.Build;
import android.view.accessibility.AccessibilityRecord;
/* compiled from: AccessibilityRecordCompat.java */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final AccessibilityRecord f491a;

    public static void a(AccessibilityRecord accessibilityRecord, int i) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollX(i);
        }
    }

    public static void b(AccessibilityRecord accessibilityRecord, int i) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    @Deprecated
    public int hashCode() {
        if (this.f491a == null) {
            return 0;
        }
        return this.f491a.hashCode();
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f491a == null) {
            if (cVar.f491a != null) {
                return false;
            }
        } else if (!this.f491a.equals(cVar.f491a)) {
            return false;
        }
        return true;
    }
}
