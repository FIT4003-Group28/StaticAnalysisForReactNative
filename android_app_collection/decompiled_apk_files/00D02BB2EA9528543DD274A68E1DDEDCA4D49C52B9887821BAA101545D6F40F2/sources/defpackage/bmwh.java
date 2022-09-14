package defpackage;

import android.graphics.Rect;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bmwh  reason: default package */
/* loaded from: classes3.dex */
public final class bmwh extends bmwz {
    private final dcdc<Rect> a;

    public bmwh(dcdc<Rect> dcdcVar) {
        if (dcdcVar != null) {
            this.a = dcdcVar;
            return;
        }
        throw new NullPointerException("Null rects");
    }

    @Override // defpackage.bmwz
    public final dcdc<Rect> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bmwz)) {
            return false;
        }
        return dchl.m(this.a, ((bmwz) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 21);
        sb.append("BoundaryRects{rects=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
