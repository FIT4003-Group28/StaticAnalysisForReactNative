package defpackage;
/* compiled from: PG */
/* renamed from: gid  reason: default package */
/* loaded from: classes6.dex */
public final class gid {
    public int a;
    @dzsi
    public cqss b;
    public int c;
    @dzsi
    private cqtv d;

    public final gie a() {
        cqtd f;
        int i = this.c;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            f = cqrt.f(this.a);
        } else if (i2 == 2) {
            f = iup.e(this.a);
        } else {
            String a = gia.a(i);
            StringBuilder sb = new StringBuilder(a.length() + 47);
            sb.append("Provided icon image format not yet supported (");
            sb.append(a);
            sb.append(")");
            throw new IllegalStateException(sb.toString());
        }
        cqss cqssVar = this.b;
        if (cqssVar != null) {
            f = cqrt.j(f, cqssVar);
        }
        cqtv cqtvVar = this.d;
        if (cqtvVar != null) {
            f = cqtt.i(f, cqtvVar, cqtvVar);
        }
        return new gie(f);
    }

    public final void b(double d) {
        this.d = cqrp.d(d);
    }
}
