package defpackage;

import android.graphics.Rect;
import j$.util.Objects;
/* compiled from: PG */
/* renamed from: tjz  reason: default package */
/* loaded from: classes4.dex */
public final class tjz {
    public final double a;
    public final double b;
    public final Rect c;
    public final Rect d;
    public final Rect e;
    public final Rect f;

    public tjz(double d, double d2, Rect rect, Rect rect2, Rect rect3, Rect rect4) {
        this.a = d;
        this.b = d2;
        this.c = rect;
        this.d = rect2;
        this.e = rect3;
        this.f = rect4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof tjz)) {
            return false;
        }
        tjz tjzVar = (tjz) obj;
        return this.a == tjzVar.a && this.b == tjzVar.b && Objects.equals(this.c, tjzVar.c) && Objects.equals(this.d, tjzVar.d) && Objects.equals(this.e, tjzVar.e) && Objects.equals(this.f, tjzVar.f);
    }

    public final int hashCode() {
        return Objects.hash(Double.valueOf(this.a), Double.valueOf(this.b), this.c, this.d, this.e, this.f);
    }
}
