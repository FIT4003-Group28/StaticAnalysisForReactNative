package defpackage;

import android.content.res.Resources;
import j$.util.Objects;
/* compiled from: PG */
/* renamed from: gq  reason: default package */
/* loaded from: classes3.dex */
final class gq {
    final Resources a;
    final Resources.Theme b;

    public gq(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            gq gqVar = (gq) obj;
            if (this.a.equals(gqVar.a) && Objects.equals(this.b, gqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
