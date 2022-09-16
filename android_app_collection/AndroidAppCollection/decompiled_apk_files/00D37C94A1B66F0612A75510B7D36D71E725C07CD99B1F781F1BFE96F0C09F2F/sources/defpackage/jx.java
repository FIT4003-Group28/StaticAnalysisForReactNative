package defpackage;

import android.os.Build;
import android.view.DisplayCutout;
import j$.util.Objects;
/* compiled from: PG */
/* renamed from: jx  reason: default package */
/* loaded from: classes3.dex */
public final class jx {
    public final Object a;

    public jx(Object obj) {
        this.a = obj;
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.a).getSafeInsetBottom();
        }
        return 0;
    }

    public final int b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return ((DisplayCutout) this.a).getSafeInsetRight();
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return Objects.equals(this.a, ((jx) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.a + "}";
    }
}
