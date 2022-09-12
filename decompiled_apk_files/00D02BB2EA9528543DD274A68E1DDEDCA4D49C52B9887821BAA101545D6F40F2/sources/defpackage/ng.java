package defpackage;

import java.util.Objects;
/* compiled from: PG */
/* renamed from: ng  reason: default package */
/* loaded from: classes7.dex */
public final class ng {
    private final Object a;

    public ng(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return Objects.equals(this.a, ((ng) obj).a);
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
