package defpackage;

import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: yzr  reason: default package */
/* loaded from: classes4.dex */
public final class yzr {
    public final Rect a;
    public final yzg b;
    public final Rect c;
    public final Rect d;

    public yzr(Rect rect, yzg yzgVar, Rect rect2, Rect rect3) {
        this.a = rect;
        this.b = yzgVar;
        if (rect2 != null) {
            this.c = rect2;
            if (rect3 != null) {
                this.d = rect3;
                return;
            }
            throw new NullPointerException("Null stableInsets");
        }
        throw new NullPointerException("Null mandatorySystemGestureInsets");
    }

    public static yzr a(Rect rect, yzg yzgVar, Rect rect2, Rect rect3) {
        return new yzr(rect, yzgVar, rect2, rect3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof yzr) {
            yzr yzrVar = (yzr) obj;
            if (this.a.equals(yzrVar.a) && this.b.equals(yzrVar.b) && this.c.equals(yzrVar.c) && this.d.equals(yzrVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String valueOf4 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 89 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Insets{systemWindowInsets=");
        sb.append(valueOf);
        sb.append(", displayCutout=");
        sb.append(valueOf2);
        sb.append(", mandatorySystemGestureInsets=");
        sb.append(valueOf3);
        sb.append(", stableInsets=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }

    public yzr() {
    }
}
