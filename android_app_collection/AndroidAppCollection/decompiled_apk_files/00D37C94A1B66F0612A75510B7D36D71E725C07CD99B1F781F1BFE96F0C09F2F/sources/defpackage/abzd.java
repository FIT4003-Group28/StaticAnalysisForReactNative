package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: abzd  reason: default package */
/* loaded from: classes.dex */
public final class abzd {
    public static final abzd a = new abzd(null, 0);
    public static final abzd b = new abzd(null, 2);
    private final int c;
    private final Object d;

    private abzd(Object obj, int i) {
        this.d = obj;
        this.c = i;
    }

    public static abzd a(Object obj) {
        return new abzd(obj, 1);
    }

    public final Object b() {
        boolean z = true;
        if (this.c != 1) {
            z = false;
        }
        aqxo.y(z);
        return this.d;
    }

    public final boolean c() {
        return this.c == 0;
    }

    public final boolean d() {
        return this.c == 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            abzd abzdVar = (abzd) obj;
            if (this.c == abzdVar.c && akzj.f(this.d, abzdVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), this.d});
    }
}
