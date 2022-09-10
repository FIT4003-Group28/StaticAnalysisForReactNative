package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cjuu  reason: default package */
/* loaded from: classes.dex */
public final class cjuu {
    public final cjtd a;
    public final long b;
    public final long c;
    public final int d;
    public final cjsh e;

    public cjuu(cjtd cjtdVar, long j, long j2, int i, cjsh cjshVar) {
        this.a = cjtdVar;
        this.b = j;
        this.c = j2;
        this.d = i;
        this.e = cjshVar;
        dbsk.l(i != 0);
    }

    public final dwxc a() {
        return cjth.c(this.a, this.b - this.c, this.d);
    }

    public final boolean equals(@dzsi Object obj) {
        if (!(obj instanceof cjuu)) {
            return false;
        }
        cjuu cjuuVar = (cjuu) obj;
        if (dbsd.a(this.a.d, cjuuVar.a.d) && dbsd.a(this.a.e, cjuuVar.a.e) && dbsd.a(this.a.h, cjuuVar.a.h) && dbsd.a(this.a.g, cjuuVar.a.g) && dbsd.a(this.a.k, cjuuVar.a.k)) {
            cjsh cjshVar = cjuuVar.e;
            if (dbsd.a(this.e.a(), cjshVar.a()) && dbsd.a(this.e.b(), cjshVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        cjtd cjtdVar = this.a;
        return Arrays.hashCode(new Object[]{cjtdVar.d, cjtdVar.e, cjtdVar.g, cjtdVar.h, cjtdVar.k, Integer.valueOf(Arrays.hashCode(new Object[]{this.e.a(), this.e.b()}))});
    }
}
