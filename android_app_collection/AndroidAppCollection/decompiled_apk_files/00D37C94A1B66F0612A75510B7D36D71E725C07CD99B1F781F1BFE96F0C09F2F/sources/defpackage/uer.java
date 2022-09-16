package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: uer  reason: default package */
/* loaded from: classes4.dex */
public final class uer {
    public final Long a;
    public final Long b;
    public final aojh c;
    public Long d = 0L;
    public Long e = 0L;
    public final Long f = 0L;
    public Long g = 0L;
    public final Long h = 0L;

    public uer(Long l, Long l2, aojh aojhVar) {
        this.a = l;
        this.b = l2;
        this.c = aojhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uer)) {
            return false;
        }
        uer uerVar = (uer) obj;
        return akzj.f(this.a, uerVar.a) && akzj.f(this.b, uerVar.b) && akzj.f(this.c, uerVar.c) && akzj.f(this.d, uerVar.d) && akzj.f(this.e, uerVar.e) && akzj.f(this.f, uerVar.f) && akzj.f(this.g, uerVar.g) && akzj.f(this.h, uerVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h});
    }
}
