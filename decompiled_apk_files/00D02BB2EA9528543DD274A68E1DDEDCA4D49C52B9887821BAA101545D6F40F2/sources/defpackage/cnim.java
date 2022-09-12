package defpackage;

import android.graphics.Rect;
import java.util.Objects;
/* compiled from: PG */
/* renamed from: cnim  reason: default package */
/* loaded from: classes5.dex */
public final class cnim {
    public final int a;
    public final Rect b;

    public cnim(int i, Rect rect) {
        this.a = i;
        this.b = rect;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        cnim cnimVar = (cnim) obj;
        if (this.a == cnimVar.a) {
            return Objects.equals(this.b, cnimVar.b);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a * 31;
        Rect rect = this.b;
        return i + (rect != null ? rect.hashCode() : 0);
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
        sb.append("FocusInfo{direction=");
        sb.append(i);
        sb.append(", focusedRect=");
        sb.append(valueOf);
        sb.append('}');
        return sb.toString();
    }
}
