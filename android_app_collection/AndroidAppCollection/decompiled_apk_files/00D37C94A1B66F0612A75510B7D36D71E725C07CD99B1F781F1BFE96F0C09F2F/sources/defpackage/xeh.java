package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: xeh  reason: default package */
/* loaded from: classes4.dex */
public final class xeh implements Comparable {
    public final int a;
    public final xek b;
    public final xdu c;
    public final xci d;
    public final xac e;

    public xeh(int i, xek xekVar, xdu xduVar, xci xciVar) {
        this.a = i;
        this.b = xekVar;
        this.c = xduVar;
        this.d = xciVar;
        this.e = xac.b(new xal[0]);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        xeh xehVar = (xeh) obj;
        int i = this.a;
        int i2 = xehVar.a;
        return i == i2 ? this.b.c().compareTo(xehVar.b.c()) : i - i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xeh)) {
            return false;
        }
        xeh xehVar = (xeh) obj;
        return this.a == xehVar.a && akzj.f(this.b, xehVar.b) && akzj.f(this.c, xehVar.c) && akzj.f(this.d, xehVar.d) && akzj.f(this.e, xehVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b, this.c, this.d, this.e});
    }

    public xeh(xeh xehVar, xac xacVar) {
        this.a = xehVar.a;
        this.b = xehVar.b;
        this.c = xehVar.c;
        this.d = xehVar.d;
        this.e = xacVar;
    }
}
