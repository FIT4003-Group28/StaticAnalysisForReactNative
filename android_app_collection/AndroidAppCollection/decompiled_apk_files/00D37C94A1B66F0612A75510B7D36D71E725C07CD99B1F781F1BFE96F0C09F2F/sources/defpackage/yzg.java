package defpackage;

import android.graphics.Rect;
import java.util.List;
/* compiled from: PG */
/* renamed from: yzg  reason: default package */
/* loaded from: classes4.dex */
public final class yzg {
    public final amuk a;
    private final Rect b;

    public yzg(Rect rect, amuk amukVar) {
        this.b = rect;
        if (amukVar != null) {
            this.a = amukVar;
            return;
        }
        throw new NullPointerException("Null boundingRects");
    }

    public static yzg e(Rect rect, List list) {
        return new yzg(rect, amuk.o(list));
    }

    public static yzg f() {
        return e(new Rect(), amuk.q());
    }

    public final int a() {
        return this.b.bottom;
    }

    public final int b() {
        return this.b.left;
    }

    public final int c() {
        return this.b.right;
    }

    public final int d() {
        return this.b.top;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yzg) {
            yzg yzgVar = (yzg) obj;
            if (this.b.equals(yzgVar.b) && amxp.v(this.a, yzgVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48 + String.valueOf(valueOf2).length());
        sb.append("DisplayCutoutCompat{safeInsets=");
        sb.append(valueOf);
        sb.append(", boundingRects=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public yzg() {
    }
}
