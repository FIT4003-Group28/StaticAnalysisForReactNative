package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: ayes  reason: default package */
/* loaded from: classes2.dex */
public final class ayes {
    public String a = "unknown-authority";
    public axyb b = axyb.a;
    public String c;
    public axzi d;

    public final boolean equals(Object obj) {
        if (!(obj instanceof ayes)) {
            return false;
        }
        ayes ayesVar = (ayes) obj;
        return this.a.equals(ayesVar.a) && this.b.equals(ayesVar.b) && akzj.f(this.c, ayesVar.c) && akzj.f(this.d, ayesVar.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }
}
