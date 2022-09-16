package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: couv  reason: default package */
/* loaded from: classes.dex */
public final class couv implements cnnu {
    public final int a;
    private final String b = null;

    public couv(couu couuVar) {
        this.a = couuVar.a;
    }

    public static couu a() {
        return new couu();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof couv)) {
            return false;
        }
        couv couvVar = (couv) obj;
        if (this.a == couvVar.a) {
            String str = couvVar.b;
            if (cnvv.a(null, null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), null});
    }
}
