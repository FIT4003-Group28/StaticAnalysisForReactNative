package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: zir  reason: default package */
/* loaded from: classes4.dex */
public final class zir {
    public final boolean a;

    public zir(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zir)) {
            return false;
        }
        return akzj.f(Boolean.valueOf(this.a), Boolean.valueOf(((zir) obj).a));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    public final String toString() {
        ampp c = akzj.c(this);
        c.g("recoverableError", this.a);
        return c.toString();
    }
}
