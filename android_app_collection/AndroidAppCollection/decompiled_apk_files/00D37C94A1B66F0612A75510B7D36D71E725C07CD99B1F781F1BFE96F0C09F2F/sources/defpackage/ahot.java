package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ahot  reason: default package */
/* loaded from: classes.dex */
public final class ahot {
    public final float a;
    public final float b;
    private final ahos c;

    public ahot() {
        ahos ahosVar = ahos.DISABLED;
        throw null;
    }

    public ahot(ahos ahosVar, float f, float f2) {
        this.c = ahosVar;
        this.a = f;
        this.b = f2;
    }

    public final boolean a() {
        return this.c == ahos.ENABLED || this.c == ahos.PAUSED;
    }

    public final boolean b() {
        return this.c == ahos.PAUSED;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ahot) {
            ahot ahotVar = (ahot) obj;
            if (this.c == ahotVar.c && this.a == ahotVar.a && this.b == ahotVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, Float.valueOf(this.a), Float.valueOf(this.b)});
    }

    public final String toString() {
        ampp c = akzj.c(this);
        c.b("state", this.c);
        c.d("scale", this.a);
        c.d("offset", this.b);
        return c.toString();
    }
}
