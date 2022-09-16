package defpackage;
/* compiled from: PG */
/* renamed from: anq  reason: default package */
/* loaded from: classes.dex */
public final class anq {
    private static final ThreadLocal d = new ThreadLocal();
    public final int a;
    public final aoc b;
    public volatile int c = 0;

    public anq(aoc aocVar, int i) {
        this.b = aocVar;
        this.a = i;
    }

    public final int a(int i) {
        bmq e = e();
        int a = e.a(16);
        if (a != 0) {
            return e.b.getInt(e.b(a) + (i * 4));
        }
        return 0;
    }

    public final int b() {
        bmq e = e();
        int a = e.a(16);
        if (a != 0) {
            return e.c(a);
        }
        return 0;
    }

    public final int c() {
        bmq e = e();
        int a = e.a(4);
        if (a != 0) {
            return e.b.getInt(a + e.a);
        }
        return 0;
    }

    public final short d() {
        bmq e = e();
        int a = e.a(14);
        if (a != 0) {
            return e.b.getShort(a + e.a);
        }
        return (short) 0;
    }

    public final bmq e() {
        ThreadLocal threadLocal = d;
        bmq bmqVar = (bmq) threadLocal.get();
        if (bmqVar == null) {
            bmqVar = new bmq();
            threadLocal.set(bmqVar);
        }
        bmq bmqVar2 = this.b.d;
        int i = this.a;
        int a = bmqVar2.a(6);
        if (a != 0) {
            int b = bmqVar2.b(a) + (i * 4);
            bmqVar.d(b + bmqVar2.b.getInt(b), bmqVar2.b);
        }
        return bmqVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        sb.append(Integer.toHexString(c()));
        sb.append(", codepoints:");
        int b = b();
        for (int i = 0; i < b; i++) {
            sb.append(Integer.toHexString(a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
